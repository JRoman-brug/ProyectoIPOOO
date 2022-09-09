package VideoJuego;

public class Refugio {

    public static final int capacidadAlacena = 20, cantidadCamas=10;

    private int alimentos, bebidas,camas;

    public Refugio(int a, int b ,int c){
        if(a+b>capacidadAlacena){
            alimentos = 10;
            bebidas = 10;
        }
        else{
            alimentos = a;
            bebidas = b;
        }

        if(c>cantidadCamas){
            camas = cantidadCamas;
        }
        else{
            camas = c;
        }
    }

//    Comandos

    public void consumirAlimento(){
        alimentos--;
    }

    public void consumirBebida(){
        bebidas--;
    }

    public boolean reponerAlimentos(int n){
        boolean retorno;
        if(n>0 && ((alimentos+bebidas+n)<capacidadAlacena)){
            alimentos+=n;
            retorno = true;
        }
        else{
            retorno = false;
        }

        return retorno;
    }

    public boolean reponerBebidas(int n){
        boolean retorno;
        if(n>0 && ((alimentos+bebidas+n)<capacidadAlacena)){
            bebidas+=n;
            retorno = true;
        }
        else{
            retorno = false;
        }

        return retorno;
    }

    public boolean desocuparCama(){
        boolean retorno;

        if(camas>0){
            camas--;
            retorno = true;
        }
        else retorno = false;

        return retorno;
    }

    public boolean ocuparCama(){
        boolean retorno;
        if(camas<cantidadCamas){
            camas++;
            retorno = true;
        }
        else retorno = false;

        return retorno;
    }


    public boolean esHabitable(){
        return (alimentos>0)&&(bebidas>0)&&(camas>0);
    }
    public int disponibilidad(){
        return cantidadCamas-camas;
    }

    public int diasSupervivencia(){
        int menor;
        if (alimentos<bebidas)menor = alimentos;
        else menor = bebidas;

        return menor;
    }

    public boolean mayorAlimentos(Refugio r){
        return (r != null)&&(alimentos > r.obtenerAlimentos());
    }


//    Metodos getters
    public int obtenerAlimentos(){
        return alimentos;
    }
    public int obtenerBebidas(){
        return bebidas;
    }
    public int obtenerCamas(){
        return camas;
    }

    public String toString(){
        return ("Alimentos: "+alimentos+"- Bebidas:"+bebidas+"- Camas:"+camas);
    }

    public boolean equals(Refugio r){
        return (r != null)&&(r.obtenerBebidas()==bebidas)&&(r.obtenerAlimentos()==alimentos)&&(r.obtenerCamas()==camas);
    }

    public Refugio clone(){
        return new Refugio(alimentos,bebidas,camas);
    }

}
