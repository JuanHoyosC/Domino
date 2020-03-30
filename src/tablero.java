import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class tablero {

    // Dibuja en el tablero todo lo que no sea una ficha
    public void pintarTablero(JPanel tablero, String user) {
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
}
