package Fecha;

public class testFecha {

    public static void main(String arg[]){
        Fecha f1,f2;

        f1 = new Fecha (1,1,2014);
        f2 = f1.sumaDias(365*2+1);

        System.out.println(f1.toString()+"---"+f2.toString()+"--"+f1.toString());



//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (1,2,2016);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (25,2,2016);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (28,2,2016);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (29,2,2016);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (29,4,2016);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (1,3,2018);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (25,3,2018);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (31,3,2018);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
//
//        f1 = new Fecha (31,12,2018);
//        f2 = f1.diaSiguiente();
//        System.out.println(f1+" día siguiente "+f2.toString());
    }
}
