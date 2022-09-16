package SecuenciaDeEnteros;

public class SecuenciaDeEnteros {
//    Atributos de instacia
    private int sec[];
//    Constructor
    public SecuenciaDeEnteros(int cant){
        sec = new int [cant];
    }

    public void establecerEntero(int p,int n){
        sec[p] = n;
    }
    public void reemplazar(int n1, int n2){
        for(int i=0; i<cantElementos();i++){
            if(sec[i] == n1) sec[i] = n2;
        }
    }
    public void reemplazar(int n){
        int i = 0;
        boolean primer = false,ultima = false;

        while((i<cantElementos()) && !primer){
            if(sec[i] == n) {
                primer = true;
                sec[i]=0;
            }
            else i++;
        }

        i = cantElementos()-1;

        while((i>=0) && !ultima){
            if(sec[i] == n) {
                ultima = true;
                sec[i]=0;
            }
            else i--;
        }
    }
    public boolean intercambiar(int p1 ,int p2){
        boolean intercambio = false;

        if((p1>=0)&&(p2<cantElementos())){
            int aux;
            aux = sec[p1];
            sec[p1] = sec[p2];
            sec[p2] = aux;

            intercambio = true;
        }

        return intercambio;
    }

    public boolean copy(SecuenciaDeEnteros a){
        boolean copia = false;
        if(a != null && (a.cantElementos() == cantElementos())){
            for(int i = 0; i<cantElementos(); i++){
                sec[i] = a.obtenerEntero(i);
            }
            copia = true;
        }


        return copia;
    }

//  consultas

    public int obtenerEntero(int p){
        return sec[p];
    }
    public int cantElementos(){
        return sec.length;
    }
    public int total(){
        int suma = 0;

        for(int i=0;i<cantElementos();i++){
            suma+=sec[i];
        }

        return suma;
    }

    public boolean estaNum(int n){
        boolean encontre = false;
        int i = 0;

        while(!encontre && (i<cantElementos())){
            if(sec[i] == n) encontre = true;
            else i++;
        }

        return encontre;
    }

    public int cantidadMayores(int n){
        int cantMayores = 0;
        for(int i = 0; i<cantElementos();i++){
            if(sec[i]>n) cantMayores++;
        }

        return cantMayores;
    }

    public boolean mitadMayores(int n){
        int cantMayores = 0;
        boolean mitadMayores = false;
        cantMayores = cantidadMayores(n);

        if(cantMayores>=(cantElementos()/2)) mitadMayores = true;

        return mitadMayores;
    }

    public boolean mitadMayores2(int n){
        int cantMayores = 0,i=0;
        boolean mitadMayores = false;

        while((!mitadMayores) && (i <cantElementos())){
            if(sec[i]>n) cantMayores++;

            if(cantMayores >= (cantElementos()/2)) mitadMayores = true;

            i++;
        }


        return mitadMayores;
    }

    public void imprimirSec(){
        for(int i = 0;i<cantElementos();i++){
            System.out.println("en la posicion: "+i+" se encuentra: ["+sec[i]+"]");
        }
        System.out.println("\n\n");
    }
}
