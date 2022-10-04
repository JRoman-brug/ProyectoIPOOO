 

import IPOO.ES;

public class TesterGrilla {
    public static void main(String ars[]){
        GrillaReales g1 = new GrillaReales(3,3);
        GrillaReales g2;

        float aux;
        for(int i=0;i<3;i++) {
            for (int j = 0; j <3; j++) {
                aux = ES.leerFloat();

                g1.establecerReal(i,j,aux);
            }
        }
        g1.arrayPrint();

        g2 = g1.traspuesta();

//        g2.arrayPrint();
        System.out.println("\nEl resultado esperado 45");
        System.out.println("El total de la grilla es: "+g1.total());

        System.out.println("\nEl resultado esperado 12");
        System.out.println("El total de la columna 0 es: "+g1.totalColumna(0));

        System.out.println("\nEl resultado esperado 15");
        System.out.println("El total de la columna 1 es: "+g1.totalColumna(1));

        System.out.println("\nEl resultado esperado 18");
        System.out.println("El total de la columna 2 es: "+g1.totalColumna(2));


        System.out.println("\nEl resultado esperado true");
        System.out.println("Esta el num 6: "+g1.estaNum(6));

        System.out.println("\nEl resultado esperado false");
        System.out.println("Esta el num 777: "+g1.estaNum(777));

        System.out.println("\nEl resultado esperado 9");
        System.out.println("La cantidad de numero mayores a 0 son: "+g1.cantidadMayores(0));

        System.out.println("\nEl resultado esperado 4");
        System.out.println("La cantidad de numero mayores a 5 son: "+g1.cantidadMayores(5));

        System.out.println("\nEl resultado esperado 0");
        System.out.println("La cantidad de numero mayores a 9 son: "+g1.cantidadMayores(9));

        g2.establecerReal(0,1,-1);

        System.out.println("\nEl resultado esperado True");
        System.out.println("La es creciente la fila: "+g1.esFilaCreciente(0));

        System.out.println("\nEl resultado esperado False");
        System.out.println("La es creciente la fila: "+g2.esFilaCreciente(0));

        g1.arrayPrint();
        g2.arrayPrint();

        System.out.println("\nEl resultado esperado false");
        System.out.println("Hay exactamente 2 numeros consecutivos mayores a 0: "+g1.hayNMayoresConsecutivos(2,0));

        System.out.println("\nEl resultado esperado false");
        System.out.println("Hay exactamente 4 numeros consecutivos mayores a 0: "+g1.hayNMayoresConsecutivos(4,0));

        System.out.println("\nEl resultado esperado true");
        System.out.println("Hay exactamente 3 numeros consecutivos mayores a 0: "+g1.hayNMayoresConsecutivos(3,0));

        System.out.println("\nEl resultado esperado true");
        System.out.println("Hay exactamente 3 numeros consecutivos mayores a 4: "+g1.hayNMayoresConsecutivos(3,4));

        System.out.println("\nEl resultado esperado true");
        System.out.println("Hay exactamente 2 numeros consecutivos mayores a 4: "+g1.hayNMayoresConsecutivos(2,4));


        System.out.println("\nEl resultado esperado false");
        System.out.println("g2 es la matriz traspuesta de g1: "+g1.esTraspuesta(g2));

        g1.arrayPrint();
        g2.arrayPrint();

        g2 = g1.traspuesta();

        System.out.println("\nEl resultado esperado true");
        System.out.println("g2 es la matriz traspuesta de g1: "+g1.esTraspuesta(g2));

        g2.arrayPrint();


    }
}
