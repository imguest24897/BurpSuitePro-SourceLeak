package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;

public class Zm9t extends Zm99 {
  private Zlkk Zn = Zlkk.PANEL_BACKGROUND;
  
  private Zlkk ZP = Zlkk.PANEL_BACKGROUND;
  
  private Ze9n Zk;
  
  private MouseAdapter ZM;
  
  private boolean ZV;
  
  private boolean ZG;
  
  private static String ZF;
  
  public void ZB(Ze9n paramZe9n, String paramString) {
    Zv(paramZe9n, paramString, Zm9t::lambda$configure$0);
  }
  
  public void Zv(Ze9n paramZe9n, String paramString, Runnable paramRunnable) {
    ZE(paramZe9n, paramString, paramRunnable::lambda$configure$1);
  }
  
  public void ZE(Ze9n paramZe9n, String paramString, Consumer<MouseEvent> paramConsumer) {
    ZO((String)null, paramZe9n, paramString, paramConsumer);
  }
  
  public void ZO(String paramString1, Ze9n paramZe9n, String paramString2, Consumer<MouseEvent> paramConsumer) {
    this.Zk = paramZe9n;
    setText(paramString1);
    setIcon(paramZe9n);
    setFocusable(false);
    setOpaque(true);
    setToolTipText(paramString2);
    ZO(this.Zn);
    if (this.ZM != null)
      removeMouseListener(this.ZM); 
    this.ZM = new Zt6i(this, paramConsumer);
    addMouseListener(this.ZM);
    this.ZG = true;
  }
  
  public void ZO(Zlkk paramZlkk) {
    super.ZO(paramZlkk);
    this.Zn = paramZlkk;
  }
  
  public void ZD(Zlkk paramZlkk) {
    this.ZP = paramZlkk;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    boolean bool = Zm99.ZQ();
    super.ZO((paramBoolean && this.ZV) ? this.ZP : this.Zn);
    if (paramBoolean) {
      Zd();
      if (bool) {
        this.Zk.ZH();
        return;
      } 
      return;
    } 
    this.Zk.ZH();
  }
  
  private void ZG() {
    if (isEnabled())
      super.ZO(this.ZV ? this.ZP : this.Zn); 
  }
  
  private void Zd() {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual isEnabled : ()Z
    //   8: ifeq -> 40
    //   11: aload_0
    //   12: getfield ZV : Z
    //   15: ifeq -> 29
    //   18: aload_0
    //   19: getfield Zk : Lburp/Ze9n;
    //   22: invokevirtual Zx : ()V
    //   25: iload_1
    //   26: ifeq -> 36
    //   29: aload_0
    //   30: getfield Zk : Lburp/Ze9n;
    //   33: invokevirtual Zm : ()V
    //   36: aload_0
    //   37: invokevirtual repaint : ()V
    //   40: return
  }
  
  public void ZI() {
    this.ZV = false;
    ZG();
    Zd();
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZG) {
      ZG();
      Zd();
    } 
  }
  
  private static void lambda$configure$1(Runnable paramRunnable, MouseEvent paramMouseEvent) {
    paramRunnable.run();
  }
  
  private static void lambda$configure$0() {}
  
  public static void Zs(String paramString) {
    ZF = paramString;
  }
  
  public static String Zu() {
    return ZF;
  }
  
  static {
    if (Zu() != null)
      Zs("d2BqM"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */