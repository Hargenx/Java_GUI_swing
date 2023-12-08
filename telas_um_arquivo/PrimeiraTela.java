package telas_um_arquivo;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeiraTela extends JFrame {

    public PrimeiraTela() {
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
                new PrimeiraTela();
            }
        });
    }
}

class SegundaTela extends JFrame {

    public SegundaTela() {
        setTitle("Segunda Tela");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Esta é a segunda tela");
        JPanel painel = new JPanel();
        painel.add(label);
        add(painel);
    }
}
