public class ComparaNumero {
    
    public void maiorMenor(int a, int b){
        if(a == b){
            System.out.println("Os números sao iguais: " + a + " = " + b);
        }else{
           if(a > b){ System.out.println(a + " > " + b);}
           if(b > a){System.out.println(b + " > " + a);}
        }
    }
}
