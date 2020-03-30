import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Ficha {

    tablero table = new tablero();
    JPanel tablero;
    // Crea las fichas en forma de string
    ArrayList<String> jugadorFichas;
    ArrayList<String> maquinaFichas;
    ArrayList<String> maquina2Fichas;
    ArrayList<String> fichasSobrante;
    ArrayList<String> fichas;

    // Contiene las posiciones de las fichas y los objetos de las fichas
    ArrayList<Integer> posJugadorFichasX;
    ArrayList<Integer> posFichaSobrantesY;
    ArrayList<JLabel> jugadorFichasObj;
    ArrayList<JLabel> maquinaFichasObj;
    ArrayList<JLabel> maquina2FichasObj;
    ArrayList<JLabel> fichasSobrantesObj;

    // Crear las fichas en forma de Strig y las guarda en un arrayList
    public void generarFichas() {
        fichas = new ArrayList<String>();
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                fichas.add(i + "-" + j);
            }
        }
    }

    public void distribuirFichas(boolean sw) {
        // Limpia el arrayList de los elementos que aun pueden contener
        jugadorFichas = new ArrayList<String>();
        maquinaFichas = new ArrayList<String>();
        maquina2Fichas = new ArrayList<String>();
        fichasSobrante = new ArrayList<String>();
        jugadorFichasObj  = new ArrayList<JLabel>();
        maquinaFichasObj = new ArrayList<JLabel>();
        maquina2FichasObj = new ArrayList<JLabel>();
        fichasSobrantesObj  = new ArrayList<JLabel>();
        posJugadorFichasX = new ArrayList<Integer>();
        posFichaSobrantesY = new ArrayList<Integer>();
        

        // Si hay una seguda maquina tambien se le reparten fichas 
        if (sw) {

            repartirFichas(jugadorFichas);
            repartirFichas(maquinaFichas);
            repartirFichas(maquina2Fichas);
            // Si no hay una segunda maquia se le agregara solo a la maquina uno y al jugador
        } else {
            repartirFichas(jugadorFichas);
            repartirFichas(maquinaFichas);
        }

        // Aqui le agrego las fichas faltantes al arbitro
        fichasSobrante = fichas;
    }

    //Funcion encargada de repartis las fichas en forma aleatoria
    public void repartirFichas(ArrayList array) {
        while (array.size() != 7 && fichas.size() != 0) {
            // Aqui se agregaran las fichas de forma aleatorias al jugador
            int rnd = (int) (Math.random() * fichas.size());
            array.add(fichas.get(rnd));
            fichas.remove(rnd);
        }
    }

    public void mostrarFichas(boolean sw, String user) {
        // Limpia el tablero de partidas anteriores
        tablero.removeAll();
        tablero.repaint();
        // Vuelve a pintar otros objetos (Diferente a las fichas)
        table.pintarTablero(tablero, user);
        // Si hay una segunda maquina, se pintara las fichas
        if (sw) {
            dibujarFichasJugador();
            dibujarFichasMaquina();
            dibujarFichasMaquina2();
            dibujarFichasSobrante();
            // Si no hay una segunda maquina, no se pintara las fichas
        } else {
            dibujarFichasJugador();
            dibujarFichasMaquina();
            dibujarFichasSobrante();
        }
    }

    //subrutina que dibuja las fichas del jugador en el tablero
    public void dibujarFichasJugador() {
        int inicio = 10;
        // Ciclo que se encarga de añadir todas las fichas del jugador al tablero
        for (int i = 0; i < jugadorFichas.size(); i++) {
            // Obtiene el JLabel que retorna la funcion (Se le envia la ruta de la image, el tamaño) y le asigna la posicion en el tablero
            jugadorFichasObj.add(crearLabel("src/img/img-domino/" + jugadorFichas.get(i) + ".png", 35, 68, jugadorFichas.get(i)));
            jugadorFichasObj.get(i).setLocation(inicio + i * 50, 550);
            posJugadorFichasX.add(inicio + i * 50);
        }
    }

     //subrutina que dibuja las fichas de la maquina 0 en el tablero
    public void dibujarFichasMaquina() {
        int inicio = 10;
        int contador = 0;
        int y = 10;
        // Ciclo que se encarga de añadir todas las fichas de la maquina al tablero
        for (int i = 0; i < maquinaFichas.size(); i++) {
            if ((inicio + i * 50) >= 510) {
                contador = 0;
                y = 90;
            }
            // Obtiene el JLabel que retorna la funcion (Se le envia la ruta de la image, el tamaño) y le asigna la posicion en el tablero
            maquinaFichasObj.add(crearLabel("src/img/img-domino/volteada.png", 35, 68, maquinaFichas.get(i)));
            maquinaFichasObj.get(i).setLocation(inicio + contador * 50, y);
            contador++;
        }
    }

    public void dibujarFichasMaquina2() {
        int inicio = 580;
        int contador = 0;
        int y = 10;
        // Ciclo que se encarga de añadir todas las fichas de la maquina2 al tablero
        for (int i = 0; i < maquina2Fichas.size(); i++) {
            if ((inicio + i * 50) >= 1100) {
                contador = 0;
                y = 90;
            }
            // Obtiene el JLabel que retorna la funcion (Se le envia la ruta de la image, el tamaño) y le asigna la posicion en el tablero
            maquina2FichasObj.add(crearLabel("src/img/img-domino/volteada.png", 35, 68, maquina2Fichas.get(i)));
            maquina2FichasObj.get(i).setLocation(inicio + contador * 50, y);
            contador++;
        }
    }

    public void dibujarFichasSobrante() {
        int inicio = 10;
        // Ciclo que se encarga de añadir todas las fichas que sobran al tablero
        for (int i = 0; i < fichasSobrante.size(); i++) {
            // Obtiene el JLabel que retorna la funcion (Se le envia la ruta de la image, el tamaño) y le asigna la posicion en el tablero
            fichasSobrantesObj.add(crearLabel("src/img/img-domino/volteada-90.png", 68, 35, fichasSobrante.get(i)));
            fichasSobrantesObj.get(i).setLocation(1140, inicio + i * 40);
            posFichaSobrantesY.add(inicio + i * 40);
        }
    }

    // Añade las imagenes de las fichas a los Label ademas añade el JLabel al JPanel
    public JLabel crearLabel(String img, int w, int h, String name) {
        // Crea el label
        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon(img);
        // Le agrega el icono al label
        label.setIcon(icon);
        // Le da el tamaño al label
        label.setSize(w, h);
        // Le da el nombre
        label.setName(name);
        //Cursor
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // Añade el label al tablero
        tablero.add(label);
        // Retorna el label enviado al tablero
        JLabel labelActual = (JLabel) tablero.getComponent(tablero.getComponentCount() - 1);
        return labelActual;
    }

    // Le envia tablero a tablero
    public void tablero(JPanel tablero) {
        this.tablero = tablero;
    }

    //Enviar los Objetos que contienen las fichas
    public ArrayList<String> getFichasJugador() {
        return jugadorFichas;
    }

    public ArrayList<String> getFichasMaquina() {
        return maquinaFichas;
    }

    public ArrayList<String> getFichasMaquina2() {
        return maquina2Fichas;
    }

    public ArrayList<String> getFichasSobrantes() {
        return fichasSobrante;
    }

    public ArrayList<JLabel> getFichasJugadorObj() {
        return jugadorFichasObj;
    }

    public ArrayList<JLabel> getFichasMaquinaObj() {
        return maquinaFichasObj;
    }

    public ArrayList<JLabel> getFichasMaquina2Obj() {
        return maquina2FichasObj;
    }

    public ArrayList<JLabel> getFichasSobrantesObj() {
        return fichasSobrantesObj;
    }

    public ArrayList<Integer> getFichasJugadorPosX() {
        return posJugadorFichasX;
    }

    public ArrayList<Integer> getFichasSobrantesPosY() {
        return posFichaSobrantesY;
    }

}
