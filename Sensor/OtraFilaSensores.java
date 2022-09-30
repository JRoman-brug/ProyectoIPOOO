package Sensor;

public class OtraFilaSensores {
//    Atributos de instacia
private Sensor fs[];

    //    constructor
    public OtraFilaSensores(int cant){
        fs = new Sensor[cant];
    }

//    comandos

    //    Funciona
    public void establecerSensor(int p, Sensor s){
//        Mapeo
        if(posicionValida(p)) fs[p-1] = s;
    }

    //    Funciona
    public void intercambiar(int p1,int p2){
//        mapeo
        Sensor aux;
        if(posicionValida(p1)&&posicionValida(p2)){
            aux = fs[p1-1];
            fs[p1-1] = fs[p2-1];
            fs[p2-1] = aux;
        }
    }

    //    funciona
    public void copy(FilaSensores a){
//      Copy en profundidad
//          Requiere el parámetro a esté ligado
//          las dos filas tengan el mismo tamaño
//          ambas filas cada referencia esté ligada a un sensor.


        for(int i=0; i<fs.length;i++){
            fs[i].copy(a.obtenerSensor(i+1));
        }
    }

//    consultas

    public Sensor obtenerSensor(int p){
        Sensor sensor = null;
        if(posicionValida(p)) sensor = fs[p-1];

        return sensor;
    }
    public boolean posicionValida(int p){
        return (0<p)&&(p<=fs.length);
    }

    public int cantFila(){
        return fs.length;
    }

    //    Funciona
    public int cantSensores(){
        int cant = 0;
        for(int i=0; i<fs.length;i++){
            if(fs[i]!=null)cant++;
        }

        return cant;
    }

    //    funciona
    public int cantidadRiesgo(){
//    riesgo si p2>p1
        int cantRiesgo = 0;

        for(int i=0;i<fs.length;i++){
            if(fs[i]!=null && fs[i].riesgo()) cantRiesgo++;
        }

        return cantRiesgo;
    }

    //    funciona
    public boolean hayNRiesgo(int n){
        return cantidadRiesgo()>=n;
    }

    public boolean dosConsecutirovsEmergencia(){
        boolean encontre=false;

        for(int i=1;(i<fs.length)&&!encontre;i++){
            if((fs[i-1]!=null)&&(fs[i]!=null)&& (fs[i-1].riesgo()) && (fs[i].riesgo())) encontre = true;
        }

        return encontre;
    }

    //    Funciona
    public boolean equals(FilaSensores a){
//        requiere a ligado
        boolean igualdad = true;

        if(fs.length == a.cantFila()){
            for (int i = 0; (i < fs.length) && igualdad; i++) {
                if (fs[i] != null && (!(fs[i] == a.obtenerSensor(i + 1)))) igualdad = false;
            }
        }
        return igualdad;
    }

    public FilaSensores clone(){
        FilaSensores nuevaFilaSensores = new FilaSensores(fs.length);

        for(int i=0;i<nuevaFilaSensores.cantFila();i++){
            if(fs[i]!=null)nuevaFilaSensores.establecerSensor(i+1,fs[i].clone());
            else nuevaFilaSensores.establecerSensor(i+1,null);
        }

        return nuevaFilaSensores;
    }
    public FilaSensores filaCompleta(){
        FilaSensores nuevaFilaSensores = new FilaSensores(fs.length);

        for(int i=0;i<nuevaFilaSensores.cantFila();i++){
            if(fs[i] != null) nuevaFilaSensores.establecerSensor(i+1,fs[i]);
            else nuevaFilaSensores.establecerSensor(i+1,fs[i]);
        }

        return nuevaFilaSensores;
    }
}
