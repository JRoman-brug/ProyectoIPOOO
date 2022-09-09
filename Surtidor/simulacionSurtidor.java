package Surtidor;
import IPOO.ES;


public class simulacionSurtidor {
    public static void main(String a[]){

        int cantInteracion,opcion,litros;

        //nuevo surtidor
        Surtidor surtidor1 = new Surtidor();

        System.out.print("Ingresar la cantidad de interaciones: ");
        cantInteracion = ES.leerEntero();



        for(int i=0; i<cantInteracion; i++){

            System.out.println("Gasoil: "+surtidor1.obtenerLitrosGasoil());
            System.out.println("Super: "+surtidor1.obtenerLitrosSuper());
            System.out.println("Premium: "+surtidor1.obtenerLitrosPremium());

            System.out.print("\n Elegi la opcion: ");
            opcion = ES.leerEntero();

            switch(opcion){
                case 1:
                    System.out.print("Ingrese los litros de gasoil a cargar: ");
                    litros = ES.leerEntero();
                    surtidor1.extraerGasoil(litros);
                    break;
                case 2:
                    System.out.print("Ingrese los litros de super a cargar: ");
                    litros = ES.leerEntero();
                    surtidor1.extraerSuper(litros);
                    break;
                case 3:
                    System.out.print("Ingrese los litros de premium a cargar: ");
                    litros = ES.leerEntero();
                    surtidor1.extraerPremium(litros);
                    break;
                case 4:
                    surtidor1.llenarDepositoGasoil();
                    break;
                case 5:
                    surtidor1.llenarDepositoSuper();
                    break;
                case 6:
                    surtidor1.llenarDepositoPremium();
                    break;
            }
        }
            System.out.println("Gasoil: "+surtidor1.obtenerLitrosGasoil());
            System.out.println("Super: "+surtidor1.obtenerLitrosSuper());
            System.out.println("Premium: "+surtidor1.obtenerLitrosPremium());


    }
}
