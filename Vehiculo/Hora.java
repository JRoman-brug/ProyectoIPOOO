package Vehiculo;

public class Hora {

//    Atributos de instacia
    private int hora, min;

//    Constructor
    public Hora(int h, int m){
        hora = h;
        min = m;
    }

//    Comandos
    public void setHora(int c){
        hora = c;
    }
    public void setMin(int c){
        min = c;
    }

    public void copy(Hora h){
        hora = h.getHora();
        min = h.getMin();
    }

//    Consultas
    public int getHora(){
        return hora;
    }
    public int getMin(){
        return min;
    }

    public boolean equals(Hora c){
        return (hora == c.getHora() && min == c.getMin());
    }

//    la diferencia tiene que ser en minutos
    public int diferenciaMinutos(Hora c){
//      Hora de ingreso nHora1 y hora de egreso nHora2
        int diffHora = 20, nHora1,nHora2;

        nHora1 = (hora*60)+min;
        nHora2 = (c.getHora()*60)+c.getMin();

        diffHora = nHora2 - nHora1;

        return diffHora;
    }


    public boolean anterior(Hora c){
        boolean anterior;

        if(hora == c.getHora()) anterior = min < c.getMin();
        else if(hora < c.getHora()) anterior = true;
        else anterior = false;

        return anterior;
    }
}
