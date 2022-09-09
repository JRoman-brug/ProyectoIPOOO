package Vehiculo;

public class Vehiculo {

//    Atributos de instacia
    private Hora ingreso,egreso;
    private int numero;
    private String patente;

//    Constructor
    public Vehiculo(Hora i, int n, String p){
        ingreso = i;
        numero = n;
        patente = p;
        egreso = null;
    }

    public void egresaVehiculo(Hora c){
        egreso = c;
    }

    public void copy(Vehiculo c){
        ingreso.copy(c.getIngreso());
        egreso.copy(c.getEgreso());
        numero = c.getNumero();
        patente = c.getPatente();
    }

//    Consultas
    public Hora getIngreso(){
        return ingreso;
    }
    public Hora getEgreso(){
        return egreso;
    }
    public int getNumero(){
        return numero;
    }
    public String getPatente(){
        return patente;
    }
    public int getCobrar(Tarifa t){
        int cobro = 0, tiempo = ingreso.diferenciaMinutos(egreso);

        if(egreso != null){
            if(tiempo<=15) cobro =tiempo*t.getT15();
            else if(tiempo<=30) cobro =tiempo*t.getT30();
            else if(tiempo<=60) cobro =tiempo*t.getT60();
            else cobro =tiempo*t.getTFija();
        }
        return cobro;
    }



}
