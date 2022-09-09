package Jugador;

public class Jugador {

    private String nombre;

    private int nroCamiseta,posicion,golesConvertidos,partidosJugados;

    public Jugador(String nom){
        nombre = nom;

        nroCamiseta = 0;
        posicion = 0;
        golesConvertidos = 0;
        partidosJugados = 0;
    }

//    comandos
    public void establecerNroCamiseta(int n){
        nroCamiseta = n;
    }
    public void establecerPosicion(int n){
        posicion = n;
    }
    public void establecerGolesConvertidos(int n){
        golesConvertidos = n;
    }
    public void establecerPartidosJugados(int n){
        partidosJugados = n;
    }

    public void aumentarGoles(int n){
        golesConvertidos+=n;
    }

    public void aumentarUnPartido(){
        partidosJugados++;
    }


//    consultas

    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNroCamiseta(){
        return nroCamiseta;
    }
    public int obtenerPosicion(){
        return posicion;
    }
    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }
    public int obtenerPartidosJugados(){
        return partidosJugados;
    }

    public int promedioGolesXPart(){
        return golesConvertidos / partidosJugados;
    }

    public boolean masGoles(Jugador j){
        return golesConvertidos > j.obtenerGolesConvertidos();
    }
    public Jugador jugConMasGoles(Jugador j){
        Jugador jugMasGoles = this;

        if(j.obtenerGolesConvertidos()>golesConvertidos){
            jugMasGoles = j;
        }

        return jugMasGoles;
    }

    public String toString(){
        return ("nombre: "+nombre+" nroCamiseta: "+nroCamiseta+" posicion: "+ posicion+ "golesConvertidos: "+golesConvertidos+" partidosJugados: "+partidosJugados);
    }

    public Jugador clone(){
        Jugador j1 =  new Jugador(nombre);

        j1.establecerNroCamiseta(nroCamiseta);
        j1.establecerPosicion(posicion);
        j1.establecerGolesConvertidos(golesConvertidos);
        j1.establecerPartidosJugados(partidosJugados);

        return j1;
    }

    public boolean equals(Jugador j){
        return (nombre == j.obtenerNombre())&&
                (nroCamiseta == j.obtenerNroCamiseta())&&
                (posicion == j.obtenerPosicion())&&
                (golesConvertidos == j.obtenerGolesConvertidos())&&
                (partidosJugados == j.obtenerPartidosJugados());

    }



}
