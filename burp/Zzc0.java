package burp;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Rectangle;
import java.util.function.Consumer;

class Zzc0 extends BorderLayout {
  private final Consumer<Rectangle> Zd;
  
  private volatile boolean ZG;
  
  Zzc0(Consumer<Rectangle> paramConsumer) {
    this.Zd = paramConsumer;
  }
  
  public void layoutContainer(Container paramContainer) {
    if (!this.ZG) {
      Rectangle rectangle = paramContainer.getBounds();
      if (rectangle.height > 0 && rectangle.width > 0) {
        this.ZG = true;
        this.Zd.accept(rectangle);
      } 
    } 
    super.layoutContainer(paramContainer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzc0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */