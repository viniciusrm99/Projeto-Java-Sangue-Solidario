package CONTROLER.Helper;

import DAO.ConexaoDAO;
import VIEW.AtualizarDoadorTelaView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AtualizarHelper {

    private final AtualizarDoadorTelaView view;

    public AtualizarHelper(AtualizarDoadorTelaView view) {
        this.view = view;
    }

    public int Atualizar(AtualizarDoadorTelaView view) throws SQLException {
        try {
        String telefone = view.getTxtTelefone().getText();
        String email = view.getTxtEmail().getText();
        String id = view.getTxtID().getText();
            String sql = "UPDATE tb_doadores SET telefone = ?, email = ? WHERE id = ?";
            Connection conn = ConexaoDAO.obtemConexao();
            PreparedStatement ps = (conn.prepareStatement(sql));
                ps.setString(1, telefone);
                ps.setString(2, email);
            ps.setString(3, id);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AtualizarHelper.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: " + ex.getMessage());
            return 0;
        }
    }
}
