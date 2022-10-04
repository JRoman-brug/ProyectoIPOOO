package Sensor;

public class TableroSensores {
//    Atributos de instacia
    private Sensor[][] grilla;

//    Constructor
    public TableroSensores(int cantFil,int cantCol){
        grilla = new Sensor[cantFil][cantCol];
    }

//    Comandos
    public void establecerSensor(int f, int c, Sensor s){
        grilla[f][c] = s;
    }

    public void intercambiar(int f1, int f2){
//        requiere 0<= f1 y f2< cantFilas()
        Sensor aux;
        for(int i=0;i<cantColumnas();i++){
            aux = grilla[f1][i];
            grilla[f1][i] = grilla[f2][i];
            grilla[f2][i]=aux;
        }
    }

    public void copy(TableroSensores t){
        if(t!=null && (t.cantFilas() == grilla.length) && (t.cantColumnas() == grilla[0].length)){
            for(int i=0;i<cantFilas();i++){
                for(int j=0;j<cantColumnas();j++){
                    t.establecerSensor(i,j,grilla[i][j]);
                }
            }
        }
    }
//    Consultas
    public Sensor obtenerSensor(int f,int c){
        return grilla[f][c];
    }

    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }

    public int cantidadFilasRiesgo(){
        int cantFilasRiesgo =0;
        boolean riesgo = false;

        for(int i=0;i<cantFilas();i++) {
            for (int j = 0; j < cantColumnas() && !riesgo; j++) {
                if(grilla[i][j].riesgo()){
                    riesgo = true;
                    cantFilasRiesgo++;
                }
            }
        }
        return cantFilasRiesgo;
    }

    public boolean todosEnEmergencia(){
        boolean emergenciaTodos = true;

        for(int i=0;i<cantFilas() && emergenciaTodos;i++) {
            for (int j = 0; j < cantColumnas() && emergenciaTodos; j++) {
                if(!grilla[i][j].riesgo()) emergenciaTodos = false;
            }
        }

        return emergenciaTodos;
    }

    public boolean  hayNRiesgoCol(int c ,int n){
        boolean resultado = false;
        int contRiesgo=0;

        for(int i =0; i<cantFilas() && !resultado;i++){
            if(grilla[i][c].riesgo()) contRiesgo++;

            if(contRiesgo >= n) resultado = true;
        }

        return resultado;
    }

}
