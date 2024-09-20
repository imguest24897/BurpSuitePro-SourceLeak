package burp;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;

class Zr88 extends Zr8o {
  private final Zr6e Zt;
  
  private final Zm24 ZM;
  
  private final FlatSVGIcon ZF;
  
  private final Ze9n ZK;
  
  private final Ze9n Zx;
  
  private boolean ZQ;
  
  public Zr88(Zr6e paramZr6e, Zxer paramZxer, Zzc2 paramZzc2, Ztca paramZtca, Zrsj paramZrsj, boolean paramBoolean) {
    super(new Zlj8(paramZr6e.ZyV()), (String)null, paramZxer, paramZzc2, paramZtca, paramZrsj, paramBoolean, true);
    this.Zt = paramZr6e;
    this.ZM = new Zm24(this);
    this.ZF = ZK();
    this.ZK = Ze3m.ZC(Zeuf.CHEVRON_RIGHT, Zlkk.FOREGROUND).ZU(Zmcx.SMALL_LINE_SIZE).Z_();
    this.Zx = Ze3m.ZC(Zeuf.CHEVRON_LEFT, Zlkk.FOREGROUND).ZU(Zmcx.SMALL_LINE_SIZE).Z_();
    add(this.ZM);
  }
  
  private FlatSVGIcon ZK() {
    FlatSVGIcon flatSVGIcon = new FlatSVGIcon(Zeuf.FOLDER.ZX());
    Dimension dimension = Zmcx.SMALL_LINE_SIZE.ZV(Zmcx.Ze((ImageIcon)flatSVGIcon));
    return flatSVGIcon.derive(dimension.width, dimension.height);
  }
  
  public void ZA(MouseEvent paramMouseEvent, int paramInt) {
    this.Zz.ZA(paramMouseEvent, paramInt);
  }
  
  public Zr6e ZR() {
    return this.Zt;
  }
  
  public boolean Zp() {
    return true;
  }
  
  public boolean ZZ() {
    return this.ZQ;
  }
  
  public void ZX(boolean paramBoolean) {
    this.ZQ = paramBoolean;
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    Dimension dimension1 = this.Zc.getPreferredSize();
    Dimension dimension2 = this.ZM.getPreferredSize();
    int i = this.ZF.getIconWidth();
    int j = this.ZF.getIconHeight();
    int k = this.ZK.getIconWidth();
    int m = this.ZK.getIconHeight();
    return new Dimension(i + dimension1.width + dimension2.width + k + 26, ((Integer)Collections.<Integer>max(List.of(Integer.valueOf(j), Integer.valueOf(dimension1.height), Integer.valueOf(dimension2.height), Integer.valueOf(m)))).intValue() + 1);
  }
  
  public void layoutContainer(Container paramContainer) {
    Dimension dimension1 = this.Zc.getPreferredSize();
    Dimension dimension2 = this.ZM.getPreferredSize();
    int i = this.ZF.getIconWidth();
    int j = this.ZF.getIconHeight();
    int k = this.ZK.getIconHeight();
    int m = ((Integer)Collections.<Integer>max(List.of(Integer.valueOf(j), Integer.valueOf(dimension1.height), Integer.valueOf(dimension2.height), Integer.valueOf(k)))).intValue();
    int n = (m - dimension1.height) / 2;
    int i1 = (m - dimension2.height) / 2;
    this.Zc.setLocation(i + 8, n + 2);
    this.Zc.setSize(dimension1.width + 2, dimension1.height);
    this.ZM.setLocation(i + dimension1.width + 18, i1 + 2);
    this.ZM.setSize(dimension2);
  }
  
  protected void paintComponent(Graphics paramGraphics) {
    Zbf6 zbf6 = this.Zt.Zyd();
    Zc(this.ZQ ? zbf6.hoverColour : zbf6.colour);
    super.paintComponent(paramGraphics);
    Dimension dimension1 = this.Zc.getSize();
    Dimension dimension2 = this.ZM.getSize();
    int i = this.ZF.getIconWidth();
    int j = this.ZF.getIconHeight();
    int k = this.ZK.getIconHeight();
    int m = ((Integer)Collections.<Integer>max(List.of(Integer.valueOf(j), Integer.valueOf(dimension1.height), Integer.valueOf(dimension2.height), Integer.valueOf(k)))).intValue();
    int n = (getInsets()).top;
    int i1 = n + (m - j) / 2;
    int i2 = n + (m - k) / 2;
    this.ZF.setColorFilter(Zm4u.Zn(zbf6.selectorColour));
    paramGraphics.drawImage(this.ZF.getImage(), 0, i1 + 2, null);
    Image image = this.Zt.Zy7() ? this.Zx.getImage() : this.ZK.getImage();
    paramGraphics.drawImage(image, i + dimension1.width + dimension2.width + 26, i2 + 2, null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr88.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */