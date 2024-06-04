/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLER;

import CONTROLER.Helper.LoginHelper;
import MODEL.Usuario;
import VIEW.LoginTelaView;
import VIEW.PaginaInicialTelaView;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vinir
 */
public class LoginControler {

    private final LoginTelaView view;
    private final LoginHelper helper;


    public LoginControler(LoginTelaView view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    
    }

    public void entrarNoSistema() throws SQLException {
        Usuario usuario = helper.obterModelo();
        PaginaInicialTelaView objpaginainicaltela = new PaginaInicialTelaView();
        ResultSet resultadoVerificação = helper.autenticaUsuario(usuario);

        if (resultadoVerificação.next()) {
            objpaginainicaltela.setVisible(true);
            view.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos!  \n\nCaso você deseje recuperar seu acesso entre em contato via e-mail.\n\nsanguesolidario@gmail.com");
        }

        }
    }

