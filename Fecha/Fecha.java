package Fecha;

public class Fecha {
    private int dia,mes,anio;

    Fecha(int d, int m,int a){
        dia = d;
        mes = m;
        anio = a;
    }

//    Comandos
    public void establecerDia(int d){
        dia = d;
    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio = a;
    }

//    consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }

    public boolean esBisiesto(){
        boolean retorno;
        if((((anio % 4)==0)&&(anio % 100)!=0)){
            retorno = true;
        }
        else retorno = false;


        return retorno;
    }


    public int difFechas(Fecha f){
        return f.obtenerAnio() - anio;
    }

    public boolean esAnterior(Fecha f){
        boolean retorno;

        if(anio <= f.obtenerAnio()) {
            if (mes < f.obtenerMes() & mes != f.obtenerMes()) {
                retorno = true;
            } else {
                if(mes == f.obtenerMes()) retorno = dia < f.obtenerDia();
                else retorno = false;
            }
        }
        else retorno = false;

        return retorno;
    }


    public boolean equals(Fecha f){
        return (anio == f.obtenerAnio())&&(mes == f.obtenerMes())&&(dia == f.obtenerDia());
    }

    public String toString(){
        return (dia+"/"+mes+"/"+anio+" ");
    }

//
    public Fecha diaSiguiente(){
        Fecha siguienteFecha = null;

        int sigAnio = anio, sigMes = mes, sigDia = dia;

//        mes de 31 dias
        if((mes==1)|| (mes==3)||(mes==5)|| (mes==7)||(mes==8)|| (mes==10)){
            if(dia==31){
                sigMes++;
                sigDia = 1;
            }
            else sigDia++;

        }
//        mes de 30 dias

        if((mes==4)|| (mes==6)||(mes==9)|| (mes==11)){
            if(dia == 30){
                sigMes++;
                sigDia = 1;
            }
            else sigDia ++;
        }

        //mes de febrero

        if(mes==2){
            if (esBisiesto()) {
                if (dia == 29) {
                    sigMes++;
                    sigDia = 1;

                } else sigDia++;


            } else {
                if (dia == 28) {
                    sigMes++;
                    sigDia = 1;
                }
                else sigDia++;

            }
        }
// mes de diciembre
       if(mes == 12){
           if(dia == 31){
               sigAnio++;
               sigMes = 1;
               sigDia = 1;
           }
           else sigDia++;
       }

        siguienteFecha = new Fecha(sigDia,sigMes,sigAnio);

        return siguienteFecha;

    }
    /*    sumo los dias a una fecha, uso el metodo de diaSiguiente */
    public Fecha sumaDias(int d){
        Fecha sumaFecha = this;

        for(int i = 1;i<=d;i++){
            sumaFecha  = sumaFecha.diaSiguiente();
        }

        return sumaFecha;
    }
}


