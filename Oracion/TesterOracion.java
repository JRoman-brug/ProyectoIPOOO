 


public class TesterOracion {
    public static void main(String args[]){

        Oracion oracion1 = new Oracion("Hola   como andas       ? ");
        oracion1.print();

        oracion1.reducirBlancos();

        oracion1.print();
    }
}
