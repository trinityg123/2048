import javax.swing.JPanel;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends JPanel implements KeyListener, Runnable
{
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 630;
    public static final Font  main = new Font("Bebas Neue Regular", Font.Plain, 28);
    private Thread game;
    private boolean running;
    private Bufered image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    
    private long startTime;
    private long elapsed;
    private boolean set;
    
    public Game(){
        setFocusable(true);
        setPrefferedSize(new Dimension(WIDTH, HEIGHT));
        assKeyListener(this);
    }
    
    private void update(){
        
    }
    
    private void render(){
        Graphics2D g = (Graphics2D).image.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,WIDTH,HEIGHT);
        // render board
        g.dispose();
        
        Graphics2D g2d = (Graphics2D) getGraphics();
        g2d.drawImage(image, 0, 0, null);
        g2d.dispose();
    }
    
    public void run(){
        int fps = 0, update = 0;
        long fepsTimer = System.currentTimeMillis();
        double nsPerUpdate = 1000000000.0/60;
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    
    public void keyReleased(KeyEvent e){
        
    }
    
    public void keyTypes(KeyEvent e){
        
    }
}
