package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;

class Zg2l extends ImageIcon {
  private final ImageIcon ZV;
  
  private final Zmcx Za;
  
  private ImageIcon Zh;
  
  private int ZN;
  
  Zg2l(ImageIcon paramImageIcon, Zmcx paramZmcx) {
    this.ZV = paramImageIcon;
    this.Za = paramZmcx;
    this.ZN = Zrt.ZC();
  }
  
  private ImageIcon Zj() {
    try {
      if (this.Zh != null) {
        try {
          if (this.ZN != Zrt.ZC()) {
            this.ZN = Zrt.ZC();
            this.Zh = this.Za.Zf(this.ZV);
            return this.Zh;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return this.Zh;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.ZN = Zrt.ZC();
    this.Zh = this.Za.Zf(this.ZV);
    return this.Zh;
  }
  
  protected void loadImage(Image paramImage) {
    throw new UnsupportedOperationException();
  }
  
  public int getImageLoadStatus() {
    return 8;
  }
  
  public void setImage(Image paramImage) {
    throw new UnsupportedOperationException();
  }
  
  public String getDescription() {
    return Zj().getDescription();
  }
  
  public void setDescription(String paramString) {
    Zj().setDescription(paramString);
  }
  
  public int getIconWidth() {
    return Zj().getIconWidth();
  }
  
  public int getIconHeight() {
    return Zj().getIconHeight();
  }
  
  public void setImageObserver(ImageObserver paramImageObserver) {
    Zj().setImageObserver(paramImageObserver);
  }
  
  public ImageObserver getImageObserver() {
    return Zj().getImageObserver();
  }
  
  public String toString() {
    return Zj().toString();
  }
  
  public AccessibleContext getAccessibleContext() {
    return Zj().getAccessibleContext();
  }
  
  public Image getImage() {
    return Zj().getImage();
  }
  
  public synchronized void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2) {
    Zj().paintIcon(paramComponent, paramGraphics, paramInt1, paramInt2);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg2l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */