package CONTROLER.Helper;
import DAO.ConexaoDAO;
import MODEL.Usuario;
import VIEW.LoginTelaView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginHelper {

    private final LoginTelaView view;

    public LoginHelper(LoginTelaView view) {
        this.view = view;
    }
    public Usuario obterModelo() {
        String login = view.getTxtLogin().getText();
        String senha = new String(view.getPswSenha().getPassword());
        Usuario modelo = new Usuario(login, senha, "");
        return modelo;
    }
    public void setarModelo(Usuario modelo) {
        String login = modelo.getLogin();
        String senha = modelo.getSenha();
        view.getTxtLogin().setText(login);
        view.getPswSenha().setText(senha);
    }
    public void limparModelo(Usuario modelo) {
        String login = modelo.getLogin();
        String senha = modelo.getSenha();
        view.getTxtLogin().setText("");
        view.getPswSenha().setText("");
    }

    public ResultSet autenticaUsuario(Usuario modelo) throws SQLException {
        Connection conn;
        conn = new ConexaoDAO().obtemConexao();

        try {
            String Sql = "Select * from usuario_admin where login = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(Sql);

            pstm.setString(1, modelo.getLogin());
            pstm.setString(2, modelo.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Houve algum problema técnico." + error);
            return null;
        }
    }
}
