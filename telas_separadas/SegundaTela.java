package telas_separadas;
import javax.swing.*;

public class SegundaTela extends JFrame {

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
