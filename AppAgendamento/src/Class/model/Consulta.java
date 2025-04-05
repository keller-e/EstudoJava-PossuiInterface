package Class.model;

public class Consulta {

    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private String jaPaciente;
    private String consultaRealizada;

    public Consulta(String nome, String cpf, String telefone, String data, String jaPaciente, String consultaRealizada) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data = data;
        this.jaPaciente = jaPaciente;
        this.consultaRealizada = consultaRealizada;
    }

    public Consulta() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getJaPaciente() {
        return jaPaciente;
    }

    public void setJaPaciente(String jaPaciente) {
        this.jaPaciente = jaPaciente;
    }

    public String getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(String consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }
}
