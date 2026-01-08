// Implementação de Selection Sort.
// [mvfm]
//
// Criado : 07/01/2026  ||  Última modificação : 07/01/2026

// Passos :
// 1) Encontrar o menor elemento de determinada lista não ordenada e movê-lo de posição para o primeiro elemento da lista ordenada.
// 2) Desconsiderar o primeiro elemento dessa 'nova' lista e continuar com o processo.

public class selectionSort {
    public Integer[] sort(Integer[] lista){

        // Lidando com erros diretamente.
        if(lista == null) {
            System.out.println("Lista nula!");
            return null;
        }
        if(lista.length == 1){
            System.out.println("Nada à ordenar!");
            return lista;
        }

        // For corrigido pra não ter que fazer última iteração.
        for(int i = 0; i < lista.length - 1; i++){
            // Assume primeiro elemento como sendo menor da lista.
            int indMin = i;
            // Procura o verdadeiro valor mínimo.
            for(int j = i + 1; j < lista.length; j++){
                if(lista[j] < lista[indMin]){
                    System.out.println("Novo valor mínimo encontrado! Atualizando índice...");
                    System.out.println("Índice antigo : " + indMin);
                    System.out.println("Índice novo : " + j);
                    indMin = j;
                }
            }

            // Faz a troca de fato, caso necessário.
            if(indMin != i){
                Integer temp = lista[i];
                lista[i] = lista[indMin];
                lista[indMin] = temp;
                System.out.println("Troca realizada!");
            }

        }

        return lista;
    }
}
