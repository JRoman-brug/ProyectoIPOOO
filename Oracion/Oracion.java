 

public class Oracion {
//    Atributos de instacia ajdasdgajhgdajhdgakj
    char s[];

//    constructor
    public Oracion(String str){
        s = new char[str.length()];
        for(int i=0; i<s.length;i++){
            s[i] = str.charAt(i);
        }
    }

//    Comandos
    public void reducirBlancos(){
        int i = 1,cantBlanco = 1;
        boolean cantBlancoFinal = false;

        while((i<s.length)&&(!cantBlancoFinal)){
//            Si hay 2 espacios en blanco
            if((s[i-1]==' ')&&(s[i]==' ')){
                cantBlanco++;
//                Reescribo el arreglo
                for(int j=i;j<s.length;j++){
                    s[j-1] = s[j];
                }
            }else i++;
//            Veo la cantidad de espaciaos blanco al final del arreglo
            if(cantBlanco==(s.length-i)) cantBlancoFinal=true;
        }
    }

    public void establecerLetra(int pos,char l){
        s[pos] = l;
    }

//    consultas
    public char obtenerLetra(int pos){
        return s[pos];
    }
    public boolean esLetra(int pos){
        boolean esLetra = false;
        if(pos<s.length) esLetra = s[pos] != ' ';

        return esLetra;
    }

    public boolean esPrimeraPalabra(int pos){
        boolean esPrimeraPalabra = false;
        if(pos<s.length) esPrimeraPalabra = s[pos] != ' ';

        return esPrimeraPalabra;
    }

    public int longitud(){
        return s.length;
    }
    public void print(){
        for(int i = 0; i<s.length;i++){
            System.out.print(s[i]);
        }
        System.out.println();
    }


}
