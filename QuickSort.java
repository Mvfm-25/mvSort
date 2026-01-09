// Implementação de Quick-Sort.
// Acho que o meu favorito para aprender.
// [mvfm]
//
// Criado : 09/01/2026  ||  Última modificação : 09/01/2026

public class QuickSort implements Sort{

    // Pegando elemento do meio por enquanto, talvez não a melhor heurística.
    // Procurar implementar depois 'Media-Of-Three' pq parece legal.
    public Integer[] sort(Integer[] lista){

        if(lista == null){
            System.out.println("Lista nula!");
            return null;
        }
        if(lista.length <= 1){
            System.out.println("Nada à ordenar!");
            return lista;
        }

        // Chamada pra simplificar o uso dos testes na Leela.java.
        lista = quickSort(lista, 0, lista.length-1);
        return lista;
    }

    public Integer[] quickSort(Integer[] lista, int inicio, int fim){
        // Validar pra ver ser pode continuar a partição.
        if(inicio < fim){
            // Vê quem vai ser o pivô.
            int pivot = divide(lista, inicio, fim);
            System.out.println("Pivot decidido: " + pivot);

            // Divide em duas outras 'sublistas'.
            // Digo, não literalmente, mas essencialmente.
            quickSort(lista, inicio, pivot -1);
            quickSort(lista, pivot + 1, fim);
        }

        return lista;
    }

    // Responsável pela essencial do quicksort, manda os menores do pivo pra trás, os maiores pra frente.
    public int divide(Integer[] lista, int inicio, int fim){

        // Acho que não precisaria do teste de 'se par ou ímpar' que eu estava imaginando antes pois o java já arredonda pro menor.
        // Corrigir depois caso gere problemas.
        int meio = (inicio + fim) / 2;
        int vPivot = lista[meio];

        // Move o pivot para o final da lista.
        // Isso ajuda no particionamento para evitar ter que 'pular' o pivot na comparação,
        troca(lista, meio, fim);

        // Pra onde os valores estão sendo movidos, última posição usada.
        int i = inicio;

        // Percorre lista até penúltimo, pivot na última posição.
        for(int j = inicio; j < fim; j++){
            if(lista[j] <= vPivot){
                System.out.println("Valor atual menor que o pivot! lista[j] = " + lista[j] + " vPivot : " + vPivot);
                troca(lista, i, j);
                i++;
            }
        }

        // Volta pivot pra posição correta.
        troca(lista, i, fim);

        // Retorna posição final do pivot
        System.out.println("Nova posição pivot : " + i);
        return i;
    }

    // Bem direto, move elementos pra posição correta.
    // Separado em sua própria função para melhor uso depois.
    public void troca(Integer[] lista, int i, int j){
        if(i != j){
            Integer temp = lista[i];
            lista[i] = lista[j];
            lista[j] = temp;
            System.out.println("Troca feita!");
        }
    }

}
