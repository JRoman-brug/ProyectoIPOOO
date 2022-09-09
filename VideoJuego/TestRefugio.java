package VideoJuego;
import IPOO.*;

public class TestRefugio {
    public static void main(String args[]){

        /*El tester permite ingresar valores por encima de la capacidad del refugio porque el constructor
 controla que si a+b es mayor a la capacidad de la alacena,
asigna la mitad de esta capacidad a alimentos y la mitad a bebidas, sino asigna el valor de a
al atributo alimentos, y el valor de b al atributo bebidas.
 Si el parámetro c es mayor a la cantidad de camas,
asigna esta constante al atributo camas, sino le asigna c. */

        Refugio r1,r2,r3,r4;int a, b, c;
        r1 = new Refugio(1,4,5);
        r2 = new Refugio(15,15,4);
        r3 = new Refugio(15,4,28);

        System.out.println("Ingrese la cantidad de alimentos y bebidas considerando que la capacidad de la alacena es 20");a = ES.leerEntero();
        b = ES.leerEntero();
        System.out.println("Ingrese el número de camas, a lo sumo 10:");
        c = ES.leerEntero();
        r4 = new Refugio(a,b,c);

        System.out.println("Al iniciarse la verificación ");
        System.out.println("Primer refugio creado con 1,4,5: "+ r1.toString());
        System.out.println("Segundo refugio creado con 15,15,4 pero deberia quedar 10,10,4: "+ r2.toString());
        System.out.println("Tercer refugio creado con 15,4,28 pero deberia quedar 15,4,10: "+ r3.toString());
        System.out.println("Cuarto refugio creado con "+a+" ,"+b+","+c+" "+r4.toString());

        if (r1.obtenerAlimentos()>0){
            r1.consumirAlimento();
            System.out.println("Después de consumir un alimento en el primer refugio "+r1.toString());  }
        else
            System.out.println("No es posible consumir un alimento del primer refugio");
        if (r1.obtenerAlimentos()>0){
            r1.consumirAlimento();
            System.out.println("Después de consumir otro alimento en el primer refugio "+r1.toString());  }
        else
            System.out.println("No es posible consumir otro alimento del primer refugio");

        System.out.println(" VALOR ESPERADO: El segundo refugio no tiene más alimentos que el tercero ");
        if (r2.mayorAlimentos(r3))
            System.out.println("El segundo refugio tiene más alimentos que el tercero");
        else
            System.out.println("El segundo refugio no tiene más alimentos que el tercero");

        if (r3.obtenerAlimentos()>0) {
            r3.consumirAlimento();
            System.out.println("Después de consumir un alimento en el tercer refugio "+r3.toString());  }
        else
            System.out.println("No es posible consumir un alimento en el tercer refugio");

        System.out.println(" VALOR ESPERADO: El segundo refugio no tiene más alimentos que el tercero ");
        if (r2.mayorAlimentos(r3))
            System.out.println("El segundo refugio tiene más alimentos que el tercero");
        else
            System.out.println("El segundo refugio no tiene más alimentos que el tercero");

        System.out.println(" VALOR ESPERADO: El tercer refugio tiene más alimentos que el segundo ");
        if (r3.mayorAlimentos(r2))
            System.out.println("El tercer refugio tiene más alimentos que el segundo");
        else
            System.out.println("El tercer refugio no  tiene más alimentos que el segundo");

        System.out.println("Al terminar la verificación ");
        System.out.println("Primer refugio debería tener 0,4,5 y tiene "+ r1.toString());
        System.out.println("Segundo refugio debería tener 10,10,4 y tiene "+ r2.toString());
        System.out.println("Tercer refugio debería tener 14,4,10 y tiene "+ r3.toString());
        System.out.println("Cuarto refugio creado con "+a+","+b+","+c+" y tiene "+r4.toString());


    }

}
