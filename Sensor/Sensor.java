 

public class Sensor {
    private static final double max = 0.1;

    public double p1,p2;

    public Sensor(double p1,double p2){
        this.p1 = p1;
        this.p2 = p2;
    }

//    comandos
    public void establecerP1(double p){
        p1 = p;
    }
    public void establecerP2(double p){
        p2 = p;
    }

    public void copy(Sensor s){
        if(s != null){
            p1 = s.obtenerP1();
            p2 = s.obtenerP2();
        }
    }

//    consultas
    public double obtenerP1(){
        return p1;
    }

    public double obtenerP2(){
        return p2;
    }

    public boolean riesgo(){
        return p2>p1;
    }

    public boolean emergencia(){
        return p1<max;
    }


    public String toString(){
        return ("p1: "+p1+" p2: "+p2);
    }
    public boolean equals(Sensor s){
        boolean retorno;
        if(s != null) retorno = (s.obtenerP1()==p1)&&(s.obtenerP2()==p2);
        else retorno = false;

        return retorno;
    }

    public Sensor clone(){
        return new Sensor(p1,p2);
    }




}
