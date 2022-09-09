package VideoJuego;

public class Criatura {

//    Atributos de clase
    private static final int maxEnergia = 100;
    private static final int minEnergia = 0;
    private static final int consumoEnergia= 10;

//    Atributos de clase
    private int energia;
    private int caminatas;
    private boolean dormido;
    private Refugio refugio;

//    Constructor
    public Criatura(Refugio r){
        refugio = r;
        energia = maxEnergia;
        dormido = false;
        caminatas = 3;
    }

//    comandos
    public boolean comer(){
        boolean ejecutar = false;
        if(dormido && estaVivo()){
            if(refugio.obtenerAlimentos()>0){
                refugio.consumirAlimento();
                energia++;
                ejecutar = true;
            }
        }

        return ejecutar;
    }
    public boolean beber(){
        boolean ejecutar = false;

        if(dormido && estaVivo()) {
            if (refugio.obtenerBebidas() > 0) {
                refugio.consumirBebida();
                energia++;
                ejecutar = true;
            }
        }

        return ejecutar;
    }
    public boolean dormir(){
        boolean ejecutar = false;
        if(!dormido && (refugio.disponibilidad()>0 && estaVivo())){
            dormido = true;
            refugio.ocuparCama();
            ejecutar = true;
        }

        return ejecutar;

    }
    public boolean despertar(){
        boolean ejecutar = false;

        if(dormido && estaVivo()){
            dormido = false;
            refugio.desocuparCama();
            caminatas = 3;

            ejecutar = true;
        }
        return ejecutar;
    }

    public boolean caminar(){
        boolean ejecutar = false;

        if(dormido && estaVivo()){
            if(caminatas > 0){
                energia -= consumoEnergia;
                caminatas--;
                ejecutar = true;

            }
            else{
                if(refugio.disponibilidad()>0){
                    dormir();
                }
                else{
                    energia = minEnergia;
                }
            }
        }
        return ejecutar;

    }



//    consultas

    public int obtenerEnergia(){
        return energia;
    }
    public int obtenerCaminatas(){
        return caminatas;
    }
    public int obtenerHumor(){
        int humor;
        if(refugio.esHabitable()){
            if(energia>70) humor = 3;
            else if((energia>41)&&(energia<70)) humor = 2;
            else humor = 1;
        }
        else humor = 1;

        return humor;
    }

    public Refugio obtenerRefugio(){
        return refugio;
    }

    public boolean estDormido(){
        return dormido;
    }

    public boolean estaVivo(){
        return (energia == minEnergia);
    }

    public Criatura mayorEnergia(Criatura c){
        Criatura mayor = null;

        if(c != null && (c.obtenerEnergia() >energia)){
            mayor = c;
        }
        else mayor = this;

        return mayor;
    }


}
