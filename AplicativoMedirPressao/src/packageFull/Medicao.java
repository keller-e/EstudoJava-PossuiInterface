package packageFull;

import java.util.ArrayList;

public class Medicao {

    public static ArrayList<dadosMedicao> dados = new ArrayList<dadosMedicao>();

    public void adicionarMedicao(dadosMedicao d) {
        dados.add(d);
    }

    public static ArrayList<dadosMedicao> listar() {
        return dados;
    }

}
