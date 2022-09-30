package Sensor;

public class GrillaReales {
//    Atributos de inscia
    private float grilla[][];

//    contructor
    public GrillaReales(int f,int c){
        grilla = new float[f][c];
    }

//    Comandos
    public void establecerReal(int f,int c, float r){
        grilla[f][c] = r;
    }

    public void reemplazar(float r1,float r2){
        for(int i=0;i<grilla.length;i++){
            for(int j=0;j<grilla[0].length;j++){
                if(grilla[i][j]==r1) grilla[i][j]=r2;
            }
        }
    }
    public void reemplazar(float r1,float r2, int f){
        boolean ultimo = false;

        for(int i=grilla[f].length-1;i>=0 && !ultimo;i--){
            if(grilla[f][i]==r1){
                grilla[f][i] = r2;
                ultimo = true;
            }
        }
    }
    public boolean intercambiarFilas(int f1,int f2){
        boolean intercambio = false;
        if(0<=f1&&0<=f2 && f1<cantFilas() && f2<cantFilas()){
            float aux = 0;
            for (int i = 0; i < grilla[0].length; i++) {
                aux = grilla[f1][i];
                grilla[f1][i] = grilla[f2][i];
                grilla[f2][i] = aux;
            }
            intercambio = true;
        }
        return intercambio;
    }
//    Consultas
    public float obtenreReal(int f,int c){
        return grilla[f][c];
    }

    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }

    public float total(){
        float total=0;
        for(int i=0;i<grilla.length;i++) {
            for (int j = 0; j < grilla[0].length; j++) {
                total+=grilla[i][j];
            }
        }

        return total;
    }

    public float totalColumna(int c){
        float totalc=0;

        for(int i=0;i<grilla.length;i++){
            totalc+=grilla[i][c];
        }

        return totalc;
    }

    public boolean estaNum(float r){
        boolean encontre = false;

        for(int i=0;i<grilla.length && !encontre;i++) {
            for (int j = 0; j < grilla[0].length && !encontre; j++) {
                if(grilla[i][j] == r) encontre = true;
            }
        }

        return encontre;
    }

    public int cantidadMayores(float r){
        int cantMayores = 0;

        for(int i=0;i<grilla.length;i++) {
            for (int j = 0; j < grilla[0].length; j++) {
                if(grilla[i][j] > r) cantMayores++;
            }
        }

        return cantMayores;
    }

    public boolean esFilaCreciente(int f){
        boolean creciente = true;
        for(int i=1;i<grilla[f].length && creciente;i++){
            if(!(grilla[f][i-1]<=grilla[f][i])) creciente = false;
        }

        return creciente;
    }
    public boolean hayNMayoresConsecutivos(int n, float r){
        boolean aux = false;
        int elemConsecutivos = 0;

        for(int i=0;i<grilla.length && !aux;i++) {
            for (int j = 0; j < grilla[0].length && !aux; j++) {
                if(grilla[i][j]>r) elemConsecutivos++;
                else elemConsecutivos=0;

                if(elemConsecutivos==n) aux = true;
            }
        }

        return aux;
    }
}
