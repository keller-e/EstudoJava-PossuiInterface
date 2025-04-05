package cadastrofilme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class FilmeCSV {

    //Caminho do arquivo
    private static String nomeArquivo = "./dados/Filmes.csv";
    //CSV = Comma Separated Values (Valores separados por vírgula)

    //Adicionar um filme ao arquivo .csv
    public static boolean AdicionarFilme(Filme f) {
        try {
            //Verificar se o arquivo já existe
            boolean arquivoExiste = new File(nomeArquivo).exists();

            //Abrir o escritor para adicionar dados ao arquivo
            FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1, true);

            if (!arquivoExiste) {
                escritor.write("Nome;Ano de Lançamento;Duração;Gênero;Diretor;País de Lançamento\n");
            }

            //Escrever os dados do filme no formato apropriado
            escritor.write(f.getNome() + ";" + f.getAnoLancamento() + ";"
                    + f.getDuracao() + ";" + f.getGenero() + ";" + f.getDiretor() + ";" + f.getPaisLancamento() + "\n");

            //Jogar os dados do escritor no arquivo!
            escritor.flush();

            //Fecha o escritor
            escritor.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Método para listar os filmes do arquivo CSV
    public static ArrayList<Filme> ListarFilmes() {
        ArrayList<Filme> lista = new ArrayList<>();
        try {
            //Abrir o leitor para ler o arquivo
            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            boolean primeiraLinha = true;

            while ((linha = leitor.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                //Dividir a linha em partes usando o ";"
                String[] partes = linha.split(";");

                String nome = partes[0];
                int ano = Integer.parseInt(partes[1]);
                int duracao = Integer.parseInt(partes[2]);
                String genero = partes[3];
                String diretor = partes[4];
                String pais = partes[5];

                //Cria o objeto Filme
                Filme f = new Filme(nome, ano, duracao, genero, diretor, pais);

                //Adicionar na lista
                lista.add(f);

                //Imprimindo informações
                System.out.println("Nome: " + f.getNome());
                System.out.println("Gênero: " + f.getGenero());
                System.out.println("Diretor: " + f.getDiretor());
                System.out.println("País de Lançamento: " + f.getPaisLancamento());
                System.out.println("Ano de Lançamento: " + f.getAnoLancamento());
                System.out.println("Duração: " + f.getDuracao());
                System.out.println("");
            }

            leitor.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
