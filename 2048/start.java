 import javax.swing.JFrame;
/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start
{
    public static void main(String[] args){
        Game game = new Game();
        
        JFrame window = new JFrame("2048");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windoe.setResizable(false);
        window.add(game);
        window.pack();
        window.setLocationRelavtiveTo(null);
        win.setVisable(true);
        
        game.start();
    }
}
