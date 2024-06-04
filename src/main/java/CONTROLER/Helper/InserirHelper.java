/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLER.Helper;
import DAO.ConexaoDAO;
import MODEL.Doador;
import VIEW.CadastrarTelaView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class InserirHelper {

    private final CadastrarTelaView view;


    public InserirHelper(CadastrarTelaView view) {
        this.view = view;
    }

    public Doador obterModelo() {
        Doador doador = new Doador("", "", "", "", "", "", "");
        String nome = view.getTxtNomeCompleto().getText();
        String dataNascimento = view.getTxtNascimento().getText();
        String tipoSanguineo = view.getTxtSangue().getText();
        String estadoCivil = view.getTxtEstadoCivil().getText();
        String genero = view.getTxtGenero().getText();
        String telefone = view.getTxtTelefone().getText();
        String email = view.getTxtEmail().getText();
        String acesso = "basic";
        doador.setGenero(genero);
        doador.setEstadoCivil(estadoCivil);
        doador.setTipoSangue(tipoSanguineo);
        doador.setDataNascimento(dataNascimento);
        doador.setNome(nome);
        doador.setTelefone(telefone);
        doador.setEmail(email);

        return doador;


    
    }

    public void inserir(Doador doador) throws Exception {
        String sql = "INSERT INTO tb_doadores(nome, data_nascimento, genero, estado_civil, tipo_sanguineo, telefone, email) "
                + "VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = ConexaoDAO.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, doador.getNome());
            ps.setString(2, doador.getDataNascimento());
            ps.setString(3, doador.getGenero());
            ps.setString(4, doador.getEstadoCivil());
            ps.setString(5, doador.getTipoSangue());
            ps.setString(6, doador.getTelefone());
            ps.setString(7, doador.getEmail());
            ps.execute();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
}
