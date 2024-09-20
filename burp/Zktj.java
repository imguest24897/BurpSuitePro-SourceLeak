package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

class Zktj implements LayoutManager {
  final Zbc9 Zl;
  
  private Zktj(Zbc9 paramZbc9) {}
  
  public void addLayoutComponent(String paramString, Component paramComponent) {}
  
  public void removeLayoutComponent(Component paramComponent) {}
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      return ZJ(this.Zl.ZY().getPreferredSize());
    } 
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      return ZJ(this.Zl.ZY().getMinimumSize());
    } 
  }
  
  public void layoutContainer(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = insets.top;
      int j = paramContainer.getHeight() - insets.bottom;
      int k = insets.left;
      int m = paramContainer.getWidth() - insets.right;
      this.Zl.ZY().setBounds(k, i, m - k, j - i);
    } 
  }
  
  private Dimension ZJ(Dimension paramDimension) {
    Insets insets = this.Zl.getInsets();
    int i = insets.left + paramDimension.width + insets.right;
    int j = insets.top + paramDimension.height + insets.bottom;
    return new Dimension(i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zktj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */