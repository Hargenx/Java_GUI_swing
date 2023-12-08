package GUI_fun;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CadastroItensGUI extends JFrame {

    private JTextField campoNome;
    private JTextField campoQuantidade;
    private JButton botaoAdicionar;
    private JTextArea areaLista;
    private ArrayList<String> listaItens;

    public CadastroItensGUI() {
        listaItens = new ArrayList<>();
        criarGUI();
    }

    private void criarGUI() {
        setTitle("Cadastro de Itens");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(6, 2));

        campoNome = new JTextField(8);
        campoQuantidade = new JTextField(8);
        botaoAdicionar = new JButton("Adicionar");
        areaLista = new JTextArea(10, 20);
        areaLista.setEditable(false);

        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarItem();
            }
        });

        // Adicionar componentes ao painel
        painel.add(new JLabel("Nome do Item:"));
        painel.add(campoNome);
        painel.add(new JLabel("Quantidade:"));
        painel.add(campoQuantidade);
        painel.add(botaoAdicionar);
        painel.add(new JScrollPane(areaLista));

        // Adicionar painel à janela
        add(painel);

        setVisible(true);
    }

    private void adicionarItem() {
        String nome = campoNome.getText();
        String quantidade = campoQuantidade.getText();

        if (!nome.isEmpty() && !quantidade.isEmpty()) {
            String item = nome + " - Quantidade: " + quantidade;
            listaItens.add(item);
            exibirListaItens();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }
    }

    private void exibirListaItens() {
        areaLista.setText("");
        for (String item : listaItens) {
            areaLista.append(item + "\n");
        }
    }

    private void limparCampos() {
        campoNome.setText("");
        campoQuantidade.setText("");
        campoNome.requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroItensGUI();
            }
        });
    }
}