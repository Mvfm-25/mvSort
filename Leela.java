// Classe principal para testar cada um dos sorts implementados.
// [mvfm]
//
 // Criado : 07/01/2026  || Última modificação : 09/01/2026

import java.util.Arrays;

public class Leela {

    public static void main(String[] args) {
        // Chamando sort.
        Sort sorter = new BubbleSort();

        Integer[] lista = {7, 4, 3, 2, 1, 6, 8, 5, 9, 10};
        System.out.println();

        // Agora fica mais modular!
        testaSort(new SelectionSort(), lista, "Selection Sort");
        testaSort(new BubbleSort(), lista, "Bubble Sort");
    }

    // Função para facilitação de testes de cada uma das implementações.
    public static void testaSort(Sort alg, Integer[] lista, String nomeAlg){
        // Justamente pra não ter que criar uma nova lista para cada teste.
        Integer[] copia = Arrays.copyOf(lista, lista.length);

        // Medindo tempo, só por curiosidade!
        // Procurar implementar cronometragem de 'complexidade' depois.
        long inicio = System.nanoTime();
        Integer[] listaOrdenada = alg.sort(copia);
        long fim = System.nanoTime();

        // Prints informativos.
        System.out.println(nomeAlg + " :" + Arrays.toString(listaOrdenada));
        System.out.println("Tempo : " + (fim - inicio) / 1_000_000.0 + " ms");
        System.out.println();
    }

}
