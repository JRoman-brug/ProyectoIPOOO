package Surtidor;

public class Surtidor {
    private final int maximaCarga = 2000;

    private int cantGasoil,cantSuper,cantPremium;

    public Surtidor(){
        cantGasoil = 0;
        cantSuper = 0;
        cantPremium = 0;
    }

    public void llenarDepositoGasoil(){
        if(cantGasoil <maximaCarga){
            cantGasoil = maximaCarga;
        }
    }

    public void llenarDepositoSuper(){
        if(cantSuper < maximaCarga){
            cantSuper = maximaCarga;
        }
    }

    public void llenarDepositoPremium(){
        if(cantPremium < maximaCarga){
            cantPremium =  maximaCarga;
        }
    }


//
    public void extraerGasoil(int litros){
        if(litros>0){
            if(cantGasoil>=litros){
                cantGasoil-=litros;
            }
            else{
                cantGasoil = 0;
            }
        }
    }
//
    public void extraerSuper(int litros){
        if(litros>0){
            if(cantSuper>=litros){
                cantSuper-=litros;
            }
            else{
                cantSuper = 0;
            }
        }
    }
//
    public void extraerPremium(int litros){
        if(litros>0){
            if(cantPremium>=litros){
                cantPremium-=litros;
            }
            else{
                cantPremium = 0;
            }
        }
    }

//    consultas

    public int obtenerMaximaCarga(){
        return maximaCarga;
    }

    public int obtenerLitrosGasoil(){
        return cantGasoil;
    }

    public int obtenerLitrosSuper(){
        return cantSuper;
    }

    public int obtenerLitrosPremium(){
        return cantPremium;
    }


    public boolean depositosLlenos(){
        if(cantGasoil == maximaCarga && cantSuper == maximaCarga && cantPremium == maximaCarga){
            return true;
        }
        else{
            return false;
        }
    }

}


