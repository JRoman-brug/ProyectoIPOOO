 

import IPOO.ES;


public class testerFilaSensores {
    public static void main(String arg[]){
        FilaSensores fs1 = new FilaSensores(5);
        FilaSensores fs2 = new FilaSensores(5);
        FilaSensores fs3 = new FilaSensores(6);


        double aux=0, aux2=0;
        Sensor s1;

        System.out.println("Ingresar los datos de fs1");
        for(int i=1;i<=fs1.cantFila();i++){
            aux = ES.leerDouble();
            aux2 = ES.leerDouble();

            s1 = new Sensor(aux,aux2);

//            if(i==1 | i==3) s1 = null;
            fs1.establecerSensor(i,s1);
        }

//        System.out.println("Ingresar los datos de fs2");
//        for(int i=1;i<=fs1.cantFila();i++){
//            aux = ES.leerDouble();
//            aux2 = ES.leerDouble();
//
//            s1 = new Sensor(aux,aux2);
//            fs2.establecerSensor(i,s1);
//
//        }

//        if(fs1.equals(fs2))System.out.println("Son iguales");
//        else System.out.println("NO son iguales");


//        System.out.println("EL primer arreglo");
//        fs1.printArray();
//        fs1.intercambiar(4,5);
//        System.out.println("EL primer arreglo intercambio la fila 4 y la 5");
//        fs1.printArray();
//
//        fs1.intercambiar(3,2);
//        System.out.println("EL primer arreglo  intercambio la fila 3 y la 2");
//        fs1.printArray();
//
//        fs1.intercambiar(1,5);
//        System.out.println("EL primer arreglo intercambio la fila 1 y la 5");
//        fs1.printArray();

        System.out.println("EL primer arreglo");
        fs1.printArray();

//        System.out.println("EL segundo arreglo");
//        fs2.printArray();
//
//        System.out.println("Copiar el arreglo fs2");
//        fs1.copy(fs2);
//
//        System.out.println("EL primer arreglo");
//        fs1.printArray();
//
//        System.out.println("EL segundo arreglo");
//        fs2.printArray();

//        if(fs1.equals(fs2))System.out.println("Son iguales");
//        else System.out.println("NO son iguales");


//        System.out.println("La cantidad de sensores ligados son: "+fs1.cantSensores());

//        System.out.println("La cantidad de sensores en riesgo son: "+fs1.cantidadRiesgo());

//        System.out.println("Hay a lo sumo 2 sensores en riesgo? : "+fs1.hayNRiesgo(2));
//        System.out.println("Hay a lo sumo 5 sensores en riesgo? : "+fs1.hayNRiesgo(5));
//        System.out.println("Hay a lo sumo 3 sensores en riesgo? : "+fs1.hayNRiesgo(3));



    }
}
