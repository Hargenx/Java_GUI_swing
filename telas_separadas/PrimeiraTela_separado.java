package telas_separadas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela_separado extends JFrame {

    public PrimeiraTela_separado() {
        setTitle("Primeira Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JButton botaoAbrirSegundaTela = new JButton("Abrir Segunda Tela");
        botaoAbrirSegundaTela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirSegundaTela();
            }
        });

        JPanel painel = new JPanel();
        painel.add(botaoAbrirSegundaTela);
        add(painel);

        setVisible(true);
    }

    private void abrirSegundaTela() {
        SegundaTela segundaTela = new SegundaTela();
        segundaTela.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PrimeiraTela_separado();
            }
        });
    }
}