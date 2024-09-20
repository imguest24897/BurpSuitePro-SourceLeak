package burp;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.util.Optional;

public abstract class Zb5h extends Zbqc {
  private final Component ZI;
  
  private final Runnable ZM;
  
  private static String[] ZH;
  
  protected Zb5h(Component paramComponent, Runnable paramRunnable) {
    this.ZI = paramComponent;
    this.ZM = paramRunnable;
  }
  
  abstract Optional<String> ZI();
  
  abstract void Ze();
  
  abstract Zgi ZN();
  
  abstract boolean ZM();
  
  public Component add(Component paramComponent) {
    Component component = super.add(paramComponent);
    ZH(paramComponent);
    return component;
  }
  
  private void ZH(Component paramComponent) {
    String[] arrayOfString = ZX();
    if (paramComponent instanceof Zg85) {
      Zg85 zg85 = (Zg85)paramComponent;
      zg85.addKeyListener(new Zs_5(this));
      if (arrayOfString == null) {
        if (paramComponent instanceof Zedd) {
          Zedd zedd = (Zedd)paramComponent;
          zedd.addItemListener(this::lambda$addListeners$0);
        } 
        return;
      } 
      return;
    } 
    if (paramComponent instanceof Zedd) {
      Zedd zedd = (Zedd)paramComponent;
      zedd.addItemListener(this::lambda$addListeners$0);
    } 
  }
  
  public void add(Component paramComponent, Object paramObject) {
    super.add(paramComponent, paramObject);
    ZH(paramComponent);
  }
  
  private void lambda$addListeners$0(ItemEvent paramItemEvent) {
    this.ZM.run();
  }
  
  public static void Zv(String[] paramArrayOfString) {
    ZH = paramArrayOfString;
  }
  
  public static String[] ZX() {
    return ZH;
  }
  
  static {
    if (ZX() == null)
      Zv(new String[1]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */