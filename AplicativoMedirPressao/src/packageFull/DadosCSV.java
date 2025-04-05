package packageFull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class DadosCSV {

    private static String nomeArquivo = "./dados/Dados.csv";

    public static boolean AdicionarDados(dadosMedicao d) {

        try {
            boolean arquivoExiste = new File(nomeArquivo).exists();

            FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1, true);

            if (!arquivoExiste) {
                escritor.write("Data;Hora;Pressão Sistólica;Pressão Diastólica;Está sob estresse?\n");
            }

            escritor.write(d.getData() + ";" + d.getHora() + ";" + d.getPressaoSistolica() + ";" + d.getPressaoDiastolica() + ";" + d.getEstresse() + "\n");

            escritor.flush();

            escritor.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    //METODO PARA LISTAR
    public static ArrayList<dadosMedicao> ListarMedicao() {
        ArrayList<dadosMedicao> lista = new ArrayList<>();

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));

            String linha;
            boolean primeiraLinha = true;

            while ((linha = leitor.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] partes = linha.split(";");
                String data = partes[0];
                String hora = partes[1];
                int pressaoSistolica = Integer.parseInt(partes[2]);
                int pressaoDiastolica = Integer.parseInt(partes[3]);
                String estresse = partes[4];

                dadosMedicao d = new dadosMedicao(data, hora, pressaoSistolica, pressaoDiastolica, estresse);

                lista.add(d);
            }

            leitor.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

}
