package Color;

public class Borde {

//    Atributos de instancia

    private int grosor;
    private Color color;

//    Contructor
    public Borde(int g, Color c){
        grosor = g;
        color = c;
    }

//    comandos
    public void setGrosor(int g){
        grosor = g;
    }
    public void setColor(Color c){
        color = c;
    }

//    consultas

    public int obtenerGrosor(){
        return grosor;
    }
    public Color obtenerColor(){
        return color;
    }

    public boolean equals(Borde b){
        return (color.equals(b.obtenerColor()))&&(grosor == b.obtenerGrosor());
    }

    public Borde clone(){
        return new Borde(grosor, color.clone());
    }

    public String toString(){
        return ("grosor: "+grosor+ "rojo: "+color.obtenerRojo()+" verde: "+color.obtenerVerde()+" azul: "+color.obtenerAzul());
    }

}
