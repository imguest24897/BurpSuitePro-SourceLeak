package burp;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zm2z extends Zm99 {
  private final Zkgu ZG = new Zkgu(this);
  
  private int ZE;
  
  private int ZQ;
  
  private Zr_f ZK;
  
  public Zm2z() {
    Dimension dimension = new Dimension(5 * Zbz3.ZK(Zxpj.PANEL_STAR_EMPTY).getIconWidth(), Zbz3.ZK(Zxpj.PANEL_STAR_EMPTY).getIconHeight());
    setPreferredSize(dimension);
    setMinimumSize(dimension);
    setMaximumSize(dimension);
  }
  
  public void Z_(Zr_f paramZr_f) {
    this.ZK = paramZr_f;
  }
  
  public void Zh(Zzog paramZzog) {
    this.ZE = paramZzog.Zk();
    this.ZQ = paramZzog.Zk();
  }
  
  public void ZB(boolean paramBoolean) {
    boolean bool = Zm99.ZQ();
    if (paramBoolean) {
      addMouseListener(this.ZG);
      addMouseMotionListener(this.ZG);
      if (bool) {
        removeMouseListener(this.ZG);
        removeMouseMotionListener(this.ZG);
        return;
      } 
      return;
    } 
    removeMouseListener(this.ZG);
    removeMouseMotionListener(this.ZG);
  }
  
  public void paintComponent(Graphics paramGraphics) {
    super.paintComponent(paramGraphics);
    Zb(paramGraphics, this.ZQ, Zbz3.ZK(Zxpj.PANEL_STAR_EMPTY), Zbz3.ZK(Zxpj.PANEL_STAR_FULL));
  }
  
  public static void Zb(Graphics paramGraphics, int paramInt, ImageIcon paramImageIcon1, ImageIcon paramImageIcon2) {
    boolean bool = Zm99.ZQ();
    try {
      int i = paramImageIcon1.getIconWidth();
      int j = 0;
      while (j < 5) {
        paramGraphics.drawImage(paramImageIcon1.getImage(), j * i, 0, null);
        j++;
        if (bool)
          break; 
      } 
      j = paramInt / 100;
      int k = 0;
      while (k < j) {
        paramGraphics.drawImage(paramImageIcon2.getImage(), k * i, 0, null);
        k++;
        if (bool)
          break; 
      } 
      k = paramInt % 100;
      if (k > 0) {
        int m = i * k / 100;
        if (m > 0) {
          BufferedImage bufferedImage = new BufferedImage(m, paramImageIcon1.getIconHeight(), 2);
          bufferedImage.getGraphics().drawImage(paramImageIcon2.getImage(), 0, 0, null);
          paramGraphics.drawImage(bufferedImage, j * i, 0, null);
        } 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public void setText(String paramString) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */