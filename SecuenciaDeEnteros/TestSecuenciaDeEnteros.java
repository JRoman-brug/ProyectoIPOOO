 
import IPOO.*;
public class TestSecuenciaDeEnteros {
    public static void main(String args[]){
        SecuenciaDeEnteros sec1 = new SecuenciaDeEnteros(12);
        SecuenciaDeEnteros sec4 = new SecuenciaDeEnteros(12);
        SecuenciaDeEnteros sec5 = null;
        int elementos;

        int sec2[] = {2,3,4,5,2,3,4,2,643,1,53,2};
        int sec3[] = {66,66,666,66,6,66,6,666,66,66,666,7};

        for(int i = 0;i< sec1.cantElementos();i++){
            sec1.establecerEntero(i, sec2[i]);
        }
        for(int i=0; i<sec4.cantElementos();i++){
            sec4.establecerEntero(i, sec3[i]);
        }

        sec1.imprimirSec();

        sec1.reemplazar(2,777);

        sec1.imprimirSec();

        sec1.reemplazar(777);
        sec1.imprimirSec();

        sec1.intercambiar(0,4);
        sec1.imprimirSec();

        char resp;
        resp = ES.leerChar();

        if(resp == 's' || resp == 'S'){
            sec1.copy(sec4);
            sec1.imprimirSec();
        }
        else{
            sec1.copy(sec5);
            sec1.imprimirSec();
        }
//        laksjdhalkdjhadlkjahdalkjdhalkdjh
//        lkajdalkjdhadkljhadlkjashd
    }


}
