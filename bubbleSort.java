// Implementação de Bubble Sort.
// O mais simples de todos, potencialmente, o menos efetivo.
// [mvfm]
//
// Criado : 07/01/2026  ||  Última modificação : 07/01/2026

// Passos :
// 1) Seleciona par de itens da lista & compara
// 2) Caso necessário, uma troca de posição é feita.
// 3) Múltiplas passagens pela lista serão necessárias no pior caso.

public class bubbleSort {

    public Integer[] sort(Integer[] lista){
        Integer temp;
        boolean trocaFeita = false;

        if(lista == null){
            System.out.println("Lista nula!"); return null;
        }
        if(lista.length == 1){
            System.out.println("Item único!"); return lista;
        }

        // Limites de cada 'for' foi definido desse jeito pra evitar trocas e movimentos desnecessários.
        // Não vai ajudar muito mesmo assim, mas é bom se prevenir.
        for(int i = 0; i < lista.length -1; i++){
            for(int j = 0; j < lista.length - i - 1; j++){
                // Teste para troca
                if(lista[j] > lista[j + 1]){
                    System.out.println("Troca necessária...");
                    System.out.println("'J' original : " + lista[j]);
                    System.out.println("'J+1' original : " + lista[j+1]);
                    temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                    trocaFeita = true;
                    System.out.println("'J' novo : " + lista[j]);
                    System.out.println("'J+1' novo : " + lista[j+1]);
                }

            }
            if(!trocaFeita){
                System.out.println("Nenhuma Troca foi feita! Parando..."); break;
            }
        }

        return lista;
    }

}
