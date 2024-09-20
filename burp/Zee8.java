package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager2;

public class Zee8 implements LayoutManager2 {
  private Component Zx;
  
  public void addLayoutComponent(Component paramComponent, Object paramObject) {
    synchronized (paramComponent.getTreeLock()) {
      this.Zx = paramComponent;
    } 
  }
  
  @Deprecated
  public void addLayoutComponent(String paramString, Component paramComponent) {
    addLayoutComponent(paramComponent, (Object)null);
  }
  
  public void removeLayoutComponent(Component paramComponent) {
    synchronized (paramComponent.getTreeLock()) {
      if (paramComponent == this.Zx)
        this.Zx = null; 
    } 
  }
  
  public Dimension minimumLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Dimension dimension = new Dimension(0, 0);
      if (this.Zx != null) {
        Dimension dimension1 = this.Zx.getMinimumSize();
        dimension.width += dimension1.width;
        dimension.height = Math.max(dimension1.height, dimension.height);
      } 
      Insets insets = paramContainer.getInsets();
      dimension.width += insets.left + insets.right;
      dimension.height += insets.top + insets.bottom;
      return dimension;
    } 
  }
  
  public Dimension preferredLayoutSize(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Dimension dimension = new Dimension(0, 0);
      if (this.Zx != null) {
        Dimension dimension1 = this.Zx.getPreferredSize();
        dimension.width += dimension1.width;
        dimension.height = Math.max(dimension1.height, dimension.height);
      } 
      Insets insets = paramContainer.getInsets();
      dimension.width += insets.left + insets.right;
      dimension.height += insets.top + insets.bottom;
      return dimension;
    } 
  }
  
  public Dimension maximumLayoutSize(Container paramContainer) {
    return new Dimension(2147483647, 2147483647);
  }
  
  public float getLayoutAlignmentX(Container paramContainer) {
    return 0.5F;
  }
  
  public float getLayoutAlignmentY(Container paramContainer) {
    return 0.5F;
  }
  
  public void invalidateLayout(Container paramContainer) {}
  
  public void layoutContainer(Container paramContainer) {
    synchronized (paramContainer.getTreeLock()) {
      Insets insets = paramContainer.getInsets();
      int i = insets.top;
      int j = (paramContainer.getSize()).height - insets.bottom;
      int k = insets.left;
      int m = (paramContainer.getSize()).width - insets.right;
      if (this.Zx != null)
        this.Zx.setBounds(k, i, m - k, j - i); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zee8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */