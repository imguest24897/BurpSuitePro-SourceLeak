package burp;

import java.awt.event.MouseAdapter;

public class Zm2l extends Zm99 {
  private Zlkk Zm = Zlkk.RADIO_BAR_INACTIVE_BACKGROUND;
  
  private Zlkk ZC = Zlkk.RADIO_BAR_INACTIVE_HOVER_BACKGROUND;
  
  private Zlkk ZR = Zlkk.RADIO_BAR_ACTIVE_BACKGROUND;
  
  private Zlkk Zc = Zlkk.RADIO_BAR_ACTIVE_HOVER_BACKGROUND;
  
  private Zlkk ZA = Zlkk.RADIO_BAR_DISABLED_BACKGROUND;
  
  private Ze9n ZM;
  
  private String Zj;
  
  private String Zr;
  
  private Runnable Zw;
  
  private Runnable ZP;
  
  private MouseAdapter Zg;
  
  private boolean ZU;
  
  private boolean Zu;
  
  public void Ze(Ze9n paramZe9n, String paramString1, String paramString2, Runnable paramRunnable1, Runnable paramRunnable2) {
    this.ZM = paramZe9n;
    this.Zj = paramString1;
    this.Zr = paramString2;
    this.Zw = paramRunnable1;
    this.ZP = paramRunnable2;
    setIcon(paramZe9n);
    setFocusable(false);
    setOpaque(true);
    setIconTextGap(0);
    setHorizontalAlignment(0);
    if (this.Zg == null) {
      this.Zg = new Zs07(this);
      addMouseListener(this.Zg);
    } 
    ZL();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    ZL();
  }
  
  public boolean Z_() {
    return this.ZU;
  }
  
  public void ZJ(boolean paramBoolean) {
    this.ZU = paramBoolean;
    ZL();
    if (isEnabled())
      this.Zw.run(); 
  }
  
  public void ZW() {
    if (isEnabled()) {
      this.ZP.run();
      ZJ(!this.ZU);
    } 
  }
  
  public void Zy(Zlkk paramZlkk) {
    this.Zm = paramZlkk;
  }
  
  public void Zl(Zlkk paramZlkk) {
    this.ZC = paramZlkk;
  }
  
  private void ZL() {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: invokevirtual isEnabled : ()Z
    //   8: ifeq -> 74
    //   11: aload_0
    //   12: getfield ZU : Z
    //   15: ifeq -> 37
    //   18: aload_0
    //   19: aload_0
    //   20: getfield Zj : Ljava/lang/String;
    //   23: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield ZM : Lburp/Ze9n;
    //   30: invokevirtual Zk : ()V
    //   33: iload_1
    //   34: ifne -> 86
    //   37: aload_0
    //   38: aload_0
    //   39: getfield Zr : Ljava/lang/String;
    //   42: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   45: aload_0
    //   46: getfield Zu : Z
    //   49: ifeq -> 63
    //   52: aload_0
    //   53: getfield ZM : Lburp/Ze9n;
    //   56: invokevirtual Zx : ()V
    //   59: iload_1
    //   60: ifne -> 86
    //   63: aload_0
    //   64: getfield ZM : Lburp/Ze9n;
    //   67: invokevirtual Zm : ()V
    //   70: iload_1
    //   71: ifne -> 86
    //   74: aload_0
    //   75: aconst_null
    //   76: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   79: aload_0
    //   80: getfield ZM : Lburp/Ze9n;
    //   83: invokevirtual ZH : ()V
    //   86: aload_0
    //   87: aload_0
    //   88: invokevirtual Ze : ()Lburp/Zlkk;
    //   91: invokevirtual ZO : (Lburp/Zlkk;)V
    //   94: aload_0
    //   95: invokevirtual repaint : ()V
    //   98: return
  }
  
  private Zlkk Ze() {
    return isEnabled() ? (this.ZU ? (this.Zu ? this.Zc : this.ZR) : (this.Zu ? this.ZC : this.Zm)) : this.ZA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */