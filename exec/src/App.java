import javax.print.attribute.standard.Media;

public class App {
    public static void main(String[] args) throws Exception {
       MaiorNumero mn = new MaiorNumero();
    //    System.out.println(mn.maior(5, 8));

       NumeroDecrescente nd = new NumeroDecrescente();
    //    nd.decrescente(10);

    ImparesMultiplicacao im = new ImparesMultiplicacao();
    // im.impares0a30();
    // im.paresMult0a30();

    TrocaNumero tn = new TrocaNumero();
    // tn.inverso(5, 8);

    ComparaNumero cn = new ComparaNumero();
    // cn.maiorMenor(12, 12);

    MediaAluno ma = new MediaAluno();
    ma.addNota(1);
    ma.addNota(2);
    ma.addNota(3);
    ma.addNota(4);
    ma.media();
    }
}
