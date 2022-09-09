package Jugador;

public class Equipo{
    //Atributos de instacia
    private String nombre;
    private Jugador capitan;
    private int pG, pE,pP, gFavor,gContra;
    
    //Constructor
    public Equipo(String nom,Jugador cap){
        nombre = nom;
        capitan = cap;
    }
    
    //Comandos
    
    public void incrementarPE(boolean jugoElCap){
        pE++;
        
        if(jugoElCap){
             capitan.aumentarUnPartido();   
        }
    }
    
    public void incrementarPG(boolean jugoElCap){
        pG++;
        
        if(jugoElCap){
             capitan.aumentarUnPartido();   
        }
    }
    
    public void incrementarPP(boolean jugoElCap){
        pP++;
        
        if(jugoElCap){
             capitan.aumentarUnPartido();   
        }
    }
    
    
    public void aumentarGFavor(int total, int delCap){
        gFavor+=total;
        if(delCap>0) capitan.aumentarGoles(delCap);
    }
    
    public void aumentarGContra(int total){
        gContra+=total;
    }
    
    //Consultas
    
    public String getNombre(){
        return nombre;
    }
    public Jugador getCapitan(){
        return capitan;
    }
    public int getPG(){
        return pG;
    }
    public int getPE(){
        return pE;
    }
    public int getPP(){
        return pP;
    }
    
    public int getGFavor(){
        return gFavor;
    }
    public int getGContra(){
        return gContra;
    }
    
    public int getPartidos(){
        return pE+pG+pP;
    }
    
    //Partido ganado 3 puntos, partido empatado 1 punto
    public int getPuntos(){
        return (pG*3)+(pE);
    }
    
    
    public Equipo mejorPuntaje(Equipo e){
        Equipo masPuntaje = this;
        
        if(getPuntos()<e.getPuntos()) masPuntaje = e;
        else if(gFavor<e.getGFavor()) masPuntaje = e;
        else if(gContra>e.getGContra()) masPuntaje = e;
        
        return masPuntaje;
    }
    
    public Jugador capitanConMasGoles(Equipo e){
        return capitan.jugConMasGoles(e.getCapitan());
    }
    
    public boolean equales(Equipo e){
        return (pE == e.getPE())&&
                (pG == e.getPG())&&
                (pP == e.getPP())&&
                (nombre == e.getNombre())&&
                (gFavor == e.getGFavor())&&
                (gContra == e.getGContra())&&
                (capitan.equals(e.getCapitan()));
    }
    
    public String toString(){
        return ("partidos perdidos: "+pP+"partidos empatados: "+pE+"partidos ganados: "+pG+" nombre: "+nombre+" goles a favor"+gFavor+" goles en contra "+gContra+" "+capitan.toString());
    }
    
    
   
    
    
    
    
    
    
}