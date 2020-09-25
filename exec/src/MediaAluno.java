public class MediaAluno {
    int[] notas;
    int index = 0;

    public MediaAluno(){
        notas = new int[100];
        for(int i = 0; i < 100; i++){
            notas[i] = -1;
        }    
    }
    public void addNota(int a){
        if(a >= 0 && a <= 100){
           while(notas[index] != -1 && index < 100){
                index += 1;
           }
           notas[index] = a;       
        }else{
            System.out.println("Somente numeros entre 0 e 100");
        }
    }

    public void media(){
        double soma = 0;
        int nts = 0;

        for(int i = 0; i < notas.length; i++){
            if(notas[i] != -1){
                nts += 1;
                soma = soma + notas[i];
            }
        }

        System.out.println("Media " + (soma/nts));
    }
}
