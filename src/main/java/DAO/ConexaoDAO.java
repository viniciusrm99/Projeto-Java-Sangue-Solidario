package DAO;

// Serve para realizar a conexão do JAVA
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// com o MySQL Server
public class ConexaoDAO {

    private static String host
            = "localhost";
    private static String porta = "3306";
    private static String db
            // = "sistema_academico"; //
            = "sangue_solidario"; //tulio
    private static String usuario
            = "root"; //usuario Alunos
    private static String senha
            = //"1234"; //senha alunos
            ""; //túlio

    public static Connection obtemConexao() {
        try {
            Connection c
                    = DriverManager.getConnection(
                            "jdbc:mysql://" + host + ":" + porta
                            + "/" + db
                            + "?useTimezone=true&serverTimezone=UTC",
                            usuario, senha
                    );
            return c;
        } catch (SQLException e) {
            return null;
        }
    }
}
