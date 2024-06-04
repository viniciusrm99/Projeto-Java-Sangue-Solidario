/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLER.Helper;

import DAO.ConexaoDAO;
import VIEW.RemoverDoadorTelaView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vinir
 */
public class RemoverHelper {

    private final RemoverDoadorTelaView view;

    public RemoverHelper(RemoverDoadorTelaView view) {
        this.view = view;
    }
    public int excluirID(RemoverDoadorTelaView view) throws SQLException {
        String id = view.getTxtID().getText();
        String sql = "DELETE FROM tb_doadores WHERE id = ?";

        try (Connection conn = ConexaoDAO.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            return ps.executeUpdate(); // Retorna o número de linhas afetadas
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir doador, pois o ID não existe ou há um agendamento para esse doador.");
            throw error; // Re-throw the exception to be handled by the caller
        }
    }
}
