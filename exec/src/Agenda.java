public class Agenda {
    Contato[] contatos;

    public Agenda(){
        contatos = new Contato[1000];
        for(int i = 0; i < contatos.length; i++){
            contatos[i] = null;
        }
    }

    public void addContato(Contato c){
        if(c != null){
            for(int i = 0; i < contatos.length; i++){
                if(contatos[i] == null){
                    contatos[i] = c;
                    break;
                }
            }
        }
    }

    public Contato searchContato(Contato c){
        for(int i = 0; i < contatos.length; i++){
            if(contatos[i].getNome().equals(c.getNome())){
                return contatos[i];
            }
        }
        return null;
    }

    public void delContato(Contato c){
        if(c != null){
            for(int i = 0; i < contatos.length; i++){
                if(contatos[i].getNome().equals(c.getNome())){
                    contatos[i] = null;
                }
            }
        }
    }
}
