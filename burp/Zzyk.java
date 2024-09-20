package burp;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.VolatileImage;
import javax.swing.JComponent;

class Zzyk extends JComponent {
  final VolatileImage Zy;
  
  final boolean ZP;
  
  Zzyk(VolatileImage paramVolatileImage, boolean paramBoolean) {}
  
  public void paint(Graphics paramGraphics) {
    if (Zri5.Z_ || this.Zy.contentsLost())
      return; 
    if (this.ZP)
      ((Graphics2D)paramGraphics).setComposite(AlphaComposite.getInstance(3, Zri5.ZD)); 
    paramGraphics.drawImage(this.Zy, 0, 0, null);
  }
  
  public void removeNotify() {
    super.removeNotify();
    this.Zy.flush();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzyk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */