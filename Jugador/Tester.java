package Jugador;

public class Tester {
    public static void main(String arg[]){
        Jugador j1 = new Jugador("Carlos");
        Jugador j2 = new Jugador ("el pepe");

        j2.establecerGolesConvertidos(15);

        System.out.println(j1.toString());

        j1.aumentarGoles(4);

        System.out.println(j1.toString());

        j1.aumentarUnPartido();

        System.out.println(j1.toString());

        j1.aumentarGoles(6);

        System.out.println(j1.toString());

        j1.aumentarUnPartido();

        System.out.println(j1.toString());

        System.out.println("Promedio por partido: "+j1.promedioGolesXPart());


        if(j1.masGoles(j2)){
            System.out.println("el jugador es "+j1.obtenerNombre());
        }else{
            System.out.println("el jugador es "+j2.obtenerNombre());
        }

        j1.establecerGolesConvertidos(122);
        System.out.println("el jugador con mas goles es"+(j1.jugConMasGoles(j2)).obtenerNombre());

        j2 = j1.clone();

        if(j1==j2){
            System.out.println("son la misma referencia");
        }
        else System.out.println("son objetos diferentes");

    }
}
