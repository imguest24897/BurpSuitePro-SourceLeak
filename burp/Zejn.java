package burp;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class Zejn {
  public static final AlphaComposite Zk = AlphaComposite.getInstance(3, 0.3F);
  
  public static BufferedImage Zw(Image paramImage) {
    BufferedImage bufferedImage = new BufferedImage(paramImage.getWidth(null), paramImage.getHeight(null), 2);
    Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics().create();
    try {
      graphics2D.setComposite(Zk);
      graphics2D.drawImage(paramImage, 0, 0, (ImageObserver)null);
      return bufferedImage;
    } finally {
      graphics2D.dispose();
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zejn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */