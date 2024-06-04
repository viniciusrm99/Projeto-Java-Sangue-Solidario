package CONTROLER;

import CONTROLER.Helper.InserirHelper;
import MODEL.Doador;
import VIEW.CadastrarTelaView;
import javax.swing.JOptionPane;

public class CadastrarControler {

    private final CadastrarTelaView view;
    private final InserirHelper helper;

    public CadastrarControler(CadastrarTelaView view) {
        this.view = view;
        this.helper = new InserirHelper(view);
    }

    public void cadastrarDoador() {
        try {
            Doador doador = helper.obterModelo();
            helper.inserir(doador);
            JOptionPane.showMessageDialog(null, "Doador inserido!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível inserir.");
        }
    }
}
