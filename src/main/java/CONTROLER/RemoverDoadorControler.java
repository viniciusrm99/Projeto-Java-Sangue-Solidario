package CONTROLER;

import CONTROLER.Helper.RemoverHelper;
import VIEW.RemoverDoadorTelaView;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RemoverDoadorControler {

    private final RemoverDoadorTelaView view;
    private final RemoverHelper helper;

    public RemoverDoadorControler(RemoverDoadorTelaView view) {
        this.view = view;
        this.helper = new RemoverHelper(view);
    }
    public void removerDoador() throws SQLException {
        int rowsAffected = helper.excluirID(view);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Doador removido com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum doador encontrado com o ID fornecido.");
        }
    }
}
