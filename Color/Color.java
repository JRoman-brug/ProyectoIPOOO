package Color;

public class Color {

    private int rojo, verde, azul;


    public Color(){
        rojo = 255;
        verde = 255;
        azul = 255;
    }
    public Color(int r,int v,int a){
        if((r<=255)&&(v<=255)&&(a<=255)){
            rojo = r;
            verde = v;
            azul = a;
        }
        else{
            rojo = 255;
            verde = 255;
            azul = 255;
        }
    }

// Comandos

    public void variar(int val){
        variarRojo(val);
        variarVerde(val);
        variarAzul(val);
    }

    public void variarRojo(int val){
        if((rojo+val<=255)&&(rojo+val>=0)){
            rojo+=val;
        }
    }
    public void variarVerde(int val){
        if((verde+val<=255)&&(verde+val>=0)){
            verde+=val;
        }
    }
    public void variarAzul(int val){
        if((azul+val<=255)&&(azul+val>=0)){
            azul+=val;
        }
    }

    public void establecerRojo(int val){
        rojo = val;
    }
    public void establecerVerde(int val){
        verde = val;
    }
    public void establecerAzul(int val){
        azul = val;
    }

    public void copy(Color s){
        if(s != null){
            s.establecerRojo(rojo);
            s.establecerVerde(verde);
            s.establecerAzul(azul);
        }
    }

//    consultas

    public int obtenerRojo(){
        return rojo;
    }
    public int obtenerVerde(){
        return verde;
    }
    public int obtenerAzul(){
        return azul;
    }

    public boolean esRojo(){
        return (rojo == 255)&&(verde == 0)&&(azul == 0);
    }

//    consultar si puedo aplicar la prop de transitividad
    public boolean esGris(){
        return (rojo == azul)&&(rojo == verde)&&(verde == azul);
    }

    public boolean esNegro(){
        return (rojo == 255)&&(verde == 255)&&(azul == 255);
    }

    public Color complemento(){
        return new Color((255-rojo),(255-verde),(255-azul));
    }

    public boolean equals(Color c){
        return (rojo == c.obtenerRojo())&&(verde == c.obtenerVerde())&&(azul == c.obtenerAzul());
    }

    public Color clone(){
        return new Color(rojo,verde,azul);
    }

}
