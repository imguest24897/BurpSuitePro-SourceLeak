package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

class Zgs3 implements LayoutManager {
  private final Component Zz;
  
  private final Component Za;
  
  private final int Zq;
  
  private final int Zd;
  
  Zgs3(Component paramComponent, int paramInt) {
    this(paramComponent, null, paramInt, -1);
  }
  
  Zgs3(Component paramComponent, int paramInt1, int paramInt2) {
    this(paramComponent, null, paramInt1, paramInt2);
  }
  
  Zgs3(Component paramComponent1, Component paramComponent2, int paramInt) {
    this(paramComponent1, paramComponent2, paramInt, -1);
  }
  
  Zgs3(Component paramComponent1, Component paramComponent2, int paramInt1, int paramInt2) {
    this.Zz = paramComponent1;
    this.Za = paramComponent2;
    this.Zq = paramInt1;
    this.Zd = paramInt2;
  }
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    boolean bool = Zltn.ZR();
    synchronized (paramContainer.getTreeLock()) {
      Dimension dimension1 = Zq();
      Dimension dimension2 = this.Zz.getPreferredSize();
      int i = Math.min(dimension2.width, dimension1.width);
      int j = Math.min(dimension2.height, dimension1.height);
      if (Zbqc.Zwu() == null)
        Zltn.Zv(!bool); 
      return new Dimension(i, j);
    } 
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      return new Dimension(0, 0);
    } 
  }
  
  public void layoutContainer(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      ZY(paramContainer);
      ZZ(paramContainer);
    } 
  }
  
  private Dimension Zq() {
    int i = (this.Zq <= 0) ? Integer.MAX_VALUE : (int)(Zrt.ZH() * this.Zq);
    int j = (this.Zd <= 0) ? Integer.MAX_VALUE : (int)(Zrt.Zx() * this.Zd);
    return new Dimension(i, j);
  }
  
  private void ZY(Container paramContainer) {
    if (this.Za == null)
      return; 
    Dimension dimension1 = paramContainer.getSize();
    Dimension dimension2 = this.Za.getPreferredSize();
    int i = Math.max(0, dimension1.width - dimension2.width - 10);
    this.Za.setBounds(i, 10, dimension2.width, dimension2.height);
  }
  
  private void ZZ(Container paramContainer) {
    Insets insets = paramContainer.getInsets();
    int i = insets.top;
    int j = paramContainer.getHeight() - insets.bottom;
    int k = insets.left;
    int m = paramContainer.getWidth() - insets.right;
    int n = j - i;
    int i1 = m - k;
    Dimension dimension = preferredLayoutSize(paramContainer);
    int i2 = (this.Zd <= 0) ? (this.Zz.getPreferredSize()).height : dimension.height;
    int i3 = (this.Zq <= 0) ? (this.Zz.getPreferredSize()).width : dimension.width;
    boolean bool1 = (i1 > i3) ? ((i1 - i3) / 2) : false;
    boolean bool2 = (n > i2) ? ((n - i2) / 2) : false;
    if (i1 > 0)
      i3 = Math.min(i1, i3); 
    if (i1 > 0)
      i2 = Math.min(n, i2); 
    this.Zz.setBounds(bool1, bool2, i3, i2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgs3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */