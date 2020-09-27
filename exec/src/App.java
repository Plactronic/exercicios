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
    // ma.addNota(1);
    // ma.addNota(2);
    // ma.addNota(3);
    // ma.addNota(4);
    // ma.media();

    Contato c = new Contato("plac", "p@mail.com");
    Contato c1 = new Contato("plac1", "p1@mail.com");
    Contato c2 = new Contato("plac2", "p2@mail.com");

    Agenda ag = new Agenda();
    ag.addContato(c);
    ag.addContato(c1);
    ag.addContato(c2);

    Contato search = ag.searchContato(c);
        if(search != null){
            System.out.println("Contato: " + search.getNome());
        }
    
    ag.delContato(c1);

    search = ag.searchContato(c1);
    if(search != null){
        System.out.println("Contato: " + search.getNome());
    }

    }
}
