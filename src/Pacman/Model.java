package Pacman;



import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Model extends JPanel implements ActionListener {

    private Dimension d;
    private final Font smallFont= new Font("Arial", Font.BOLD,14);
    private boolean inGame= false;
    private boolean dying= false;

    private final int BLOCK_SIZE= 24;
    private final int N_BLOCKS =15;
    private final int SCREEN_SIZE= N_BLOCKS * BLOCK_SIZE;
    private final int MAX_GHOST=12;
    private final int PACMAN_SPEED= 6;

    private int N_GHOSTS= 6;
    private int lives, socre;
    private int [] dx, dy;
    private int[] ghost_x, ghost_y, ghost_dx, ghost_dy, ghostSpeed;

    private Image heart, ghost;
    private Image up,down,left,right;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
