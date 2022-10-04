package Oracion;


public class TesterOracion {
    public static void main(String args[]){

        Oracion oracion1 = new Oracion("que          onda           pibe maquina  fiera ");
        oracion1.print();

        oracion1.reducirBlancos();

        oracion1.print();
    }
}
