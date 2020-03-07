import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class tablero {

    // Dibuja en el tablero todo lo que no sea una ficha
    public void pintarTablero(JPanel tablero, String user) {
        // Dibuja los label en el tablero
        tablero.add(labelTablero("Fichas maquina 0", 200, 150, 150, 25));
        tablero.add(labelTablero("Fichas maquina 1", 750, 150, 150, 25));
        tablero.add(labelTablero("Fichas del jugador " + user, 480, 520, 220, 25));
        // Sibuja los separadores
        tablero.add(SeparatorTablero(0, 180, 1120, 10, false));
        tablero.add(SeparatorTablero(0, 500, 1120, 10, false));
        tablero.add(SeparatorTablero(560, 0, 12, 180, true));
        tablero.add(SeparatorTablero(1120, 0, 10, 620, true));
    }

    // Dibuja los separadores
    public JSeparator SeparatorTablero(int x, int y, int w, int h, boolean sw) {
        JSeparator s = new JSeparator();
        s.setBounds(x, y, w, h);
        if (sw) {
            s.setOrientation(SwingConstants.VERTICAL);
        }
        return s;
    }

    // Dibuja los texto que dicen a quien les pertenece las fichas
    public JLabel labelTablero(String texto, int posx, int posy, int w, int h) {
        // Retorna label, el texto que contendra, color y fuente
        JLabel label = new JLabel();
        label.setText(texto);
        label.setBounds(posx, posy, w, h);
        label.setForeground(new Color(53, 73, 94));
        label.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        return label;
    }
}
