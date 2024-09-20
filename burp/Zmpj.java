package burp;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

class Zmpj {
  private final Zbqc Zh = new Zbqc();
  
  private final Zbup Zs;
  
  Zmpj() {
    this.Zh.setBackground(Zlb0.ZQ);
    this.Zs = new Zbup();
    this.Zs.setViewportView(this.Zh);
  }
  
  void Zl(byte[] paramArrayOfbyte, int paramInt) throws Zeqa {
    Image image = Toolkit.getDefaultToolkit().createImage(paramArrayOfbyte, paramInt, paramArrayOfbyte.length - paramInt);
    ImageIcon imageIcon = new ImageIcon(image);
    Zm99 zm99 = new Zm99(imageIcon);
    try {
      this.Zh.removeAll();
      this.Zh.add(zm99);
      if (imageIcon.getImageLoadStatus() != 8)
        throw new Zeqa(); 
    } catch (Zeqa zeqa) {
      throw a(null);
    } 
    try {
      if (imageIcon.getIconHeight() >= 3)
        try {
          if (imageIcon.getIconWidth() >= 3)
            return; 
          throw new Zeqa();
        } catch (Zeqa zeqa) {
          throw a(null);
        }  
    } catch (Zeqa zeqa) {
      throw a(null);
    } 
    throw new Zeqa();
  }
  
  public JComponent ZE() {
    return this.Zs;
  }
  
  private static Zeqa a(Zeqa paramZeqa) {
    return paramZeqa;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmpj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */