package cadastrofilme;
public class Filme {
    
    private String nome;
    private int anoLancamento;
    private int duracao;
    private String genero;
    private String diretor;
    private String paisLancamento;

    public Filme() {
    }

    public Filme(String nome, int anoLancamento, int duracao, String genero, String diretor, String paisLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.genero = genero;
        this.diretor = diretor;
        this.paisLancamento = paisLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPaisLancamento() {
        return paisLancamento;
    }

    public void setPaisLancamento(String paisLancamento) {
        this.paisLancamento = paisLancamento;
    }
    
    
    
}
