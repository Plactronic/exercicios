public class ImparesMultiplicacao {
    
    public void impares0a30(){
        int comeco = 0;
        while(comeco < 30){
            if(comeco % 2 == 1){
                System.out.println(comeco);
            }
            comeco += 1;
        }
    }

    public void paresMult0a30(){
        int comeco = 1;
        double total = 1;
        while(comeco <= 30){
            if(comeco % 2 == 0){
                total = total * comeco;
                System.out.println(total);
            }
            comeco += 1;
        }
    }

}
