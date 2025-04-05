package packageFull;

public class dadosMedicao {

    private String data, hora;
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private String estresse;

    public dadosMedicao() {
    }

    public dadosMedicao(String data, String hora, int pressaoSistolica, int pressaoDiastolica, String estresse) {
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.estresse = estresse;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(int pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public int getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public void setPressaoDiastolica(int pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }

    public String getEstresse() {
        return estresse;
    }

    public void setEstresse(String estresse) {
        this.estresse = estresse;
    }

}
