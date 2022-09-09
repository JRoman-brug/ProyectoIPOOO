package Vehiculo;

public class TesterVehiculo {
    public static void main(String a[]){
        //    5 horas 1 vehiculo 1 tarifa
        Hora ingreso = new Hora(7,30);
        Hora egresoMenos15 = new Hora (7,45);
        Hora egresoMenos30 = new Hora (7,60);
        Hora egresoMenos60 = new Hora (8,30);
        Hora egresoFija = new Hora (8,31);

        Vehiculo autito = new Vehiculo(ingreso, 29, "ick 690 kck");
        Tarifa tarifa = new Tarifa(200,250,300,500);
        //200 tarifa 15
        //250 tarifa 30
        //300 tarifa 60
        //500 tarifa fija

        autito.egresaVehiculo(egresoMenos15);
        System.out.println("Resulado esperado 3000 pesos");
        System.out.println("Tiene que pagar: "+autito.getCobrar(tarifa)+" pesos \n");


        autito.egresaVehiculo(egresoMenos30);
        System.out.println("Resulado esperado 7500 pesos");
        System.out.println("Tiene que pagar: "+autito.getCobrar(tarifa)+" pesos \n");

        autito.egresaVehiculo(egresoMenos60);
        System.out.println("Resulado esperado 1800 pesos");
        System.out.println("Tiene que pagar: "+autito.getCobrar(tarifa)+" pesos \n");

        autito.egresaVehiculo(egresoFija);
        System.out.println("Resulado esperaasdasdasdsdo 30500 pesos");
        System.out.println("Tiene que pagar: "+autito.getCobrar(tarifa)+" pesos \n");
    }
}
