package Fecha;

public class TestPrestamo {
    public static void main(String args[]){
        Libro l1 = new Libro("Las aventuras de pepito","Carlitos","El juajo",'A');
        Libro l2 = new Libro("Las aventuras de pepito","Carlitos","El juajo",'B');

//        Fecha de prestamos
        Fecha fechaPrestamo = new Fecha(12,7,2020);
//      Fechas en que devolvio el libro
        //Fecha que devolvio en tiempo
        Fecha f1 = fechaPrestamo.sumaDias(6);

        //Tardo menos de una semana en devolver el libro
        Fecha f2 = fechaPrestamo.sumaDias(8);

        //Tardo menos de 3 semana en devolver el libro
        Fecha f3 = fechaPrestamo.sumaDias(7+14);

        //Tardo mes de 3 semana en devolver el libro
        Fecha f4 = fechaPrestamo.sumaDias(7+27);

        Fecha penalizacion;

//      Prestamos con el libro de categoria A
//      Que devolvio a tiempo
        Prestamo p1 = new Prestamo(l2,"Roman",fechaPrestamo,7);
        p1.setFechaDev(f1);
//      Tardo menos de una semana
        Prestamo p2 = new Prestamo(l2,"Roman",fechaPrestamo,7);
        p2.setFechaDev(f2);
//      Tardo menos de 3 semanas
        Prestamo p3 = new Prestamo(l2,"Roman",fechaPrestamo,7);
        p3.setFechaDev(f3);
//      Tardo mas de 3 semanas
        Prestamo p4 = new Prestamo(l2,"Roman",fechaPrestamo,7);
        p4.setFechaDev(f4);

        System.out.println("----------------PARA LIBRO CATEGORIA B---------------");
//        P1
        System.out.println("Para P1");
        System.out.println("El dia que tiene que entrar el libro es: "+p1.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+p1.getFechaDev());
//        Calculo la penalizacion
        penalizacion = p1.penalizacion();

        System.out.println("Resultado esperado: Se entrego en en plazo acordado");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString());
        else System.out.println("Se entrego en el plazo acordado \n");

//      p2
        System.out.println("Para p2");
        System.out.println("El dia que tiene que entrar el libro es: "+p2.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+p2.getFechaDev());
//        Calculo la penalizacion
        penalizacion = p2.penalizacion();

        System.out.println("Resultado esperado: La penalizacion es hasta 23/07/2020");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString()+"\n");
        else System.out.println("Se entrego en el plazo acordado \n");

//        p3
        System.out.println("Para p3");
        System.out.println("El dia que tiene que entrar el libro es: "+p3.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+p3.getFechaDev());
//        Calculo la penalizacion
        penalizacion = p3.penalizacion();
        System.out.println(p3.getPlazoDev().sumaDias(21).toString()+"\n");
        System.out.println("Resultado esperado: La penalizacion es hasta 07/08/2020");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString()+"\n");
        else System.out.println("Se entrego en el plazo acordado \n");

//        p4
        System.out.println("Para p4");
        System.out.println("El dia que tiene que entrar el libro es: "+p4.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+p4.getFechaDev());
//        Calculo la penalizacion
        penalizacion = p4.penalizacion();

        System.out.println("Resultado esperado: La penalizacion es hasta 25/08/2020");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString()+"\n");
        else System.out.println("Se entrego en el plazo acordado \n");




//      Prestamos con el libro de categoria A
//      Que devolvio a tiempo
        Prestamo pA1 = new Prestamo(l1,"Roman",fechaPrestamo,7);
        pA1.setFechaDev(f1);
//      Tardo menos de una semana
        Prestamo pA2 = new Prestamo(l1,"Roman",fechaPrestamo,7);
        pA2.setFechaDev(f2);
//      Tardo menos de 3 semanas
        Prestamo pA3 = new Prestamo(l1,"Roman",fechaPrestamo,7);
        pA3.setFechaDev(f3);
//      Tardo mas de 3 semanas
        Prestamo pA4 = new Prestamo(l1,"Roman",fechaPrestamo,7);
        pA4.setFechaDev(f4);

        System.out.println("----------------PARA LIBRO CATEGORIA A---------------");
//        P1
        System.out.println("Para PA1");
        System.out.println("El dia que tiene que entrar el libro es: "+pA1.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+pA1.getFechaDev());
//        Calculo la penalizacion
        penalizacion = pA1.penalizacion();

        System.out.println("Resultado esperado: Se entrego en en plazo acordado");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString());
        else System.out.println("Se entrego en el plazo acordado \n");

//      p2
        System.out.println("Para pA2");
        System.out.println("El dia que tiene que entrar el libro es: "+pA2.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+pA2.getFechaDev());
//        Calculo la penalizacion
        penalizacion = pA2.penalizacion();

        System.out.println("Resultado esperado: La penalizacion es hasta 26/07/2020");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString()+"\n");
        else System.out.println("Se entrego en el plazo acordado \n");

//        p3
        System.out.println("Para pA3");
        System.out.println("El dia que tiene que entrar el libro es: "+pA3.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+pA3.getFechaDev());
//        Calculo la penalizacion
        penalizacion = pA3.penalizacion();
        System.out.println(pA3.getPlazoDev().sumaDias(21).toString()+"\n");
        System.out.println("Resultado esperado: La penalizacion es hasta 12/08/2020");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString()+"\n");
        else System.out.println("Se entrego en el plazo acordado \n");

//        p4
        System.out.println("Para pA4");
        System.out.println("El dia que tiene que entrar el libro es: "+pA4.getPlazoDev());
        System.out.println("El dia que entrego el libro es: "+pA4.getFechaDev());
//        Calculo la penalizacion
        penalizacion = pA4.penalizacion();

        System.out.println("Resultado esperado: La penalizacion es hasta 4/09/2020");
        if(penalizacion != null) System.out.println("La penalizacion es hasta "+penalizacion.toString()+"\n");
        else System.out.println("Se entrego en el plazo acordado \n");

////        deMierda 27/07/2020
////        p3 09/08/2020
//        Fecha deMIERDA = new Fecha(2,9,2020);
//        if(deMIERDA.esAnterior(p3.getPlazoDev().sumaDias(24)))System.out.println("SI");
//        else System.out.println("NO");
//
//        System.out.println(p3.getPlazoDev().sumaDias(21).toString()+"--"+deMIERDA.toString());
    }
}
