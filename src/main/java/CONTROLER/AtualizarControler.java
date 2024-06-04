package CONTROLER;

import CONTROLER.Helper.AtualizarHelper;
import VIEW.AtualizarDoadorTelaView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AtualizarControler {

    private final AtualizarDoadorTelaView view;
    private final AtualizarHelper helper;

    public AtualizarControler(AtualizarDoadorTelaView view) {
        this.view = view;
        this.helper = new AtualizarHelper(view);

    }
    public void atualizarControler() throws SQLException {
        int rowsAffected = helper.Atualizar(view);

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Doador atualizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Doador não encontrado. Verifique o ID informado.!");
        }
    }
}
