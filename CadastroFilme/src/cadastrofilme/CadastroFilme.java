package cadastrofilme;
public class CadastroFilme {
    public static void main(String[] args) {
        TelaCadastroFilme tcf = new TelaCadastroFilme();
        
        tcf.setVisible(true);
        
        FilmeCSV fcsv = new FilmeCSV();
        
        fcsv.ListarFilmes();
    } 
}
