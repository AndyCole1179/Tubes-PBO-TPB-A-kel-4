
package restorant;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author 62813
 */
public class PanelImage3 extends JPanel{
    Image gambar;
    public PanelImage3(){
    gambar = new ImageIcon(getClass().getResource("/gambar/PanelLogout.png")).getImage();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(gambar,0,0,getWidth(),getHeight(),null);
        gd.dispose();
    }
}
