package Vehiculo;

public class Tarifa {
    //    Atributos de instacia
    private int t15,t30,t60,tFija;
//Constructor
    public Tarifa(int t1,int t2,int t3,int t4){
        t15 = t1;
        t30 = t2;
        t60 = t3;
        tFija = t4;
    }

//  Consultas
    public int getT15(){
        return t15;
    }
    public int getT30(){
        return t30;
    }
    public int getT60(){
        return t60;
    }
    public int getTFija(){
        return tFija;
    }
}
