// Implementação de Heap-Sort
// Primeira vez nesse exercício lidando com "árvores".
// Não literalmente, mas eh
// [mvfm]
//
// Criado : 11/01/2026  ||  Última modificação : 11/01/2026

public class HeapSort implements Sort{

    public Integer[] sort(Integer[] lista){
        if(lista == null || lista.length <= 1){
            return lista;
        }
        int tamanho = lista.length;

        // Começa do último nó não-folha até a raiz, heapificando
        for(int i = (tamanho / 2) - 1; i >= 0; i--){
            heapify(lista, tamanho, i);
        }

        return lista;
    }

    // Função para tratar array como uma árvore binária.
    // Funciona recursivamente 'heapificando' dada sub-árvore.
    public void heapify(Integer[] lista, int tamanhoArvore, int indRaiz ){

        // Determina índice raíz como 'maior', seguindo princípios do max heap.
        // Assim como determina seus filhos, seguindo as mesmas regras.
        int maior = indRaiz;
        int filhoEsquerda = 2 * indRaiz  + 1;
        int filhoDireita = 2 * indRaiz + 2;

        // Comparação para encontrar maior elemento da sub-árvore.
        if(filhoEsquerda < tamanhoArvore && lista[filhoEsquerda] > lista[maior]){
            maior = filhoEsquerda;
        }
        if(filhoDireita < tamanhoArvore && lista[filhoDireita] > lista[maior]){
            maior = filhoDireita;
        }

        // Caso o maior não continue sendo a raiz, troca e continua heapificando
        if(maior != indRaiz){
            int temp = lista[indRaiz];
            lista[indRaiz] = lista[maior];
            lista[maior] = temp;

            // Chamada recursiva para a sub-árvore afetada
            heapify(lista, tamanhoArvore, maior);
        }
    }

    public static void main(String[] args) {
        HeapSort heap = new HeapSort();
        Integer[] lista = {10, 20, 30, 40, 50};
        heap.sort(lista);
    }

}
