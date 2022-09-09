package Fecha;

public class Prestamo {
//    Atributos de instacia

    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo,fechaDevolucion;
    private int dias;

//    constructor
//    Requiere que l,fp y s esten ligados
    public Prestamo(Libro l, String s, Fecha fp, int d){
        libro = l;
        socio = s;
        fechaPrestamo = fp;
        dias = d;
    }

//    Consultas
    public void setFechaDev(Fecha fd){
        fechaDevolucion = fd;
    }

//    Consultas
    public Libro getLibro(){
        return libro;
    }

    public Fecha getFechaPrestamo(){
        return fechaPrestamo;
    }

    public Fecha getPlazoDev(){
         return fechaPrestamo.sumaDias(dias);
    }

    public Fecha getFechaDev(){
        return fechaDevolucion;
    }

    public String getSocio(){
        return socio;
    }

//retorna verdadero si el libro no se devolvió y la fecha de hoy es posterior al plazo de devolución.
    public boolean estaAtrasado(Fecha hoy){
        Fecha plazoDev = getPlazoDev();
        //Si fechaDevolucion es nulo, significa que el libro no ha sido devuelto.
        return fechaDevolucion == null & !((plazoDev.esAnterior(hoy)) | (plazoDev.equals(hoy)));
    }


//  calcula la cantidad de días de penalización y devuelve la fecha hasta la que
//  corresponde aplicar la penalización, a partir de la fecha de devolución, si está ligada. La
//  penalización es de 3 días si se atrasó menos de una semana, 5 días si se atrasó menos de tres
//  semanas y 10 días si se atrasó 3 semanas o más. Si el libro tiene categoría A los días de
//  penalización se duplican. Retorna nulo si la fecha de devolución no está ligada o el préstamo no
//  produjo atraso.
    public Fecha penalizacion(){
        Fecha penalizacion = null;
        Fecha plazoDevolucion = getPlazoDev();
        int diasPenalizacion = 0;

        //veo si esta ligada fechaDevolucion y  fechaDevolucion tiene
        // que ser anterior al plazo para no aplicar la penalizacion
        if(fechaDevolucion != null && !(fechaDevolucion.esAnterior(plazoDevolucion) || plazoDevolucion.equals(fechaDevolucion))){
            if(fechaDevolucion.esAnterior(plazoDevolucion.sumaDias(8))){
                //veo si se atraso menos de una semana
                diasPenalizacion = 3;
            } else if(fechaDevolucion.esAnterior(plazoDevolucion.sumaDias(22))){
                //Veo si se atraso menos de 3 semanas
                diasPenalizacion = 5;
            }else{
                //Se atraso mas de 3 semanas
                diasPenalizacion = 10;
            }

            if(libro.obtenerCategoria() == 'A'){
                diasPenalizacion *=2;
            }

            penalizacion = fechaDevolucion.sumaDias(diasPenalizacion);
        }


        return penalizacion;
    }

    //implementar xd
    public boolean equals(){
        return dias == 20;
    }

    public String toString(){
        return (libro.toString()+" Nombre: "+socio+ " "+fechaPrestamo.toString()+" dias: "+dias);
    }

}
