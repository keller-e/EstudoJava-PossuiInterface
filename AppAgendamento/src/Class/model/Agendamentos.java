package Class.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Agendamentos {

    public static ArrayList<Consulta> consulta = new ArrayList<Consulta>();

    public void adicionarConsulta(Consulta c) {
        consulta.add(c);
    }

    public static ArrayList<Consulta> listar() {
        return consulta;
    }

    public static boolean excluir(int id) {

        if (id < 0) {
            JOptionPane.showMessageDialog(null, "Necessário selecionar um agendamento para realizar sua exclusão");
        } else {
            consulta.remove(id);
            JOptionPane.showMessageDialog(null, "Agendamento excluido com sucesso!");
        }
        return true;
    }
}
