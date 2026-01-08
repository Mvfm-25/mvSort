// Classe principal para testar cada um dos sorts implementados.
// [mvfm]
//
 // Criado : 07/01/2026  || Última modificação : 07/01/2026

import java.util.Arrays;

public class leela {

    public static void main(String[] args) {
        // Chamando sorts
        selectionSort selection = new selectionSort();

        Integer[] lista1 = {7, 4, 3, 2, 1, 6, 8, 5, 9, 10};
        System.out.println("Lista original : " + Arrays.toString(lista1));

        System.out.println("Selection sort : " + Arrays.toString(selection.sort(lista1)));
    }

}
