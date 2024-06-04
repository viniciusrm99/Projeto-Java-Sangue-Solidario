package CONTROLER;

import CONTROLER.Helper.AgendarHelper;
import VIEW.AgendarDoacaoTelaView;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class AgendarControler {

    private final AgendarDoacaoTelaView view;
    private final AgendarHelper helper;

    public AgendarControler(AgendarDoacaoTelaView view) {

        this.view = view;
        this.helper = new AgendarHelper(view);
    }
    public void atualizarTabela() throws SQLException {
        helper.buscarinfTabela();
    }

    public void atualizarAgendamento() throws Exception {
        int alteracoes = helper.inserirAgendamento();
        if (alteracoes > 0) {
            JOptionPane.showMessageDialog(null, "Agendamento realizado!");
            helper.enviarEnviarEmail();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o agendamento \nVerifique o ID informado!");
        }
    }

}
