package burp;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;

public abstract class Ze9x extends ImageIcon {
  abstract ImageIcon ZL();
  
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
    return ZL().getDescription();
  }
  
  public void setDescription(String paramString) {
    ZL().setDescription(paramString);
  }
  
  public int getIconWidth() {
    return ZL().getIconWidth();
  }
  
  public int getIconHeight() {
    return ZL().getIconHeight();
  }
  
  public void setImageObserver(ImageObserver paramImageObserver) {
    ZL().setImageObserver(paramImageObserver);
  }
  
  public ImageObserver getImageObserver() {
    return ZL().getImageObserver();
  }
  
  public String toString() {
    return ZL().toString();
  }
  
  public AccessibleContext getAccessibleContext() {
    return ZL().getAccessibleContext();
  }
  
  public Image getImage() {
    return ZL().getImage();
  }
  
  public synchronized void paintIcon(Component paramComponent, Graphics paramGraphics, int paramInt1, int paramInt2) {
    ZL().paintIcon(paramComponent, paramGraphics, paramInt1, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze9x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */