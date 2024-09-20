package burp;

import java.awt.event.ActionEvent;

public class Zevs implements Zerf {
  private final Zbc9 ZC;
  
  private final Zgoo Zu;
  
  private final Zb55 Zq;
  
  private final Zmg2 ZX;
  
  private final Zmg2 Zs;
  
  private final Zerf ZM;
  
  public Zevs(Zbc9 paramZbc9, Zgoo paramZgoo, Zb55 paramZb55, Zmg2 paramZmg21, Zmg2 paramZmg22, Zerf paramZerf) {
    this.ZC = paramZbc9;
    this.Zu = paramZgoo;
    this.Zq = paramZb55;
    this.ZX = paramZmg21;
    this.Zs = paramZmg22;
    this.ZM = paramZerf;
  }
  
  public void ZQ() {
    this.ZC.add(this.Zu);
    this.ZC.add(this.Zq);
    this.ZX.addActionListener(this::lambda$initialise$0);
    this.Zs.addActionListener(this::lambda$initialise$1);
    Zx();
  }
  
  private void Zx() {
    // Byte code:
    //   0: invokestatic ZH : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: getstatic burp/Zevs.ZG : Lburp/Zrx_;
    //   7: invokevirtual ordinal : ()I
    //   10: lookupswitch default -> 56, 0 -> 36, 1 -> 48
    //   36: aload_0
    //   37: getfield ZX : Lburp/Zmg2;
    //   40: iconst_1
    //   41: invokevirtual setSelected : (Z)V
    //   44: aload_1
    //   45: ifnull -> 56
    //   48: aload_0
    //   49: getfield Zs : Lburp/Zmg2;
    //   52: iconst_1
    //   53: invokevirtual setSelected : (Z)V
    //   56: return
  }
  
  public void Zc(Zrx_ paramZrx_) {
    // Byte code:
    //   0: invokestatic ZH : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual ordinal : ()I
    //   8: lookupswitch default -> 62, 0 -> 36, 1 -> 51
    //   36: aload_0
    //   37: getfield ZC : Lburp/Zbc9;
    //   40: aload_0
    //   41: getfield Zu : Lburp/Zgoo;
    //   44: invokevirtual ZP : (Ljava/awt/Component;)V
    //   47: aload_2
    //   48: ifnull -> 62
    //   51: aload_0
    //   52: getfield ZC : Lburp/Zbc9;
    //   55: aload_0
    //   56: getfield Zq : Lburp/Zb55;
    //   59: invokevirtual ZP : (Ljava/awt/Component;)V
    //   62: aload_0
    //   63: getfield ZM : Lburp/Zerf;
    //   66: aload_1
    //   67: invokeinterface Zc : (Lburp/Zrx_;)V
    //   72: return
  }
  
  private void lambda$initialise$1(ActionEvent paramActionEvent) {
    Zc(Zrx_.CUSTOM);
  }
  
  private void lambda$initialise$0(ActionEvent paramActionEvent) {
    Zc(Zrx_.PRESET);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zevs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */