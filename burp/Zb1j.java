package burp;

import java.awt.Window;

public class Zb1j implements Ze8b {
  private final Zerg ZM;
  
  private final Zgb6 ZI;
  
  public Zb1j(Zerg paramZerg, Zgb6 paramZgb6) {
    this.ZM = paramZerg;
    this.ZI = paramZgb6;
  }
  
  public void ZV(Window paramWindow, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZM : Lburp/Zerg;
    //   4: invokevirtual Zl : ()Lburp/Zkrw;
    //   7: invokevirtual Zy : ()Lburp/Zbw_;
    //   10: astore #4
    //   12: invokestatic ZC : ()[I
    //   15: aload #4
    //   17: invokeinterface ZFM : ()Lburp/Zekl;
    //   22: astore #5
    //   24: astore_3
    //   25: iload_2
    //   26: ifgt -> 39
    //   29: aload #5
    //   31: invokeinterface ZlI : ()Z
    //   36: ifeq -> 40
    //   39: return
    //   40: aload_0
    //   41: getfield ZI : Lburp/Zgb6;
    //   44: invokeinterface ZES : ()I
    //   49: istore #6
    //   51: iload #6
    //   53: lookupswitch default -> 122, 0 -> 80, 1 -> 99
    //   80: aload #5
    //   82: iconst_1
    //   83: invokeinterface ZfI : (Z)V
    //   88: aload #4
    //   90: invokeinterface Zt2 : ()V
    //   95: aload_3
    //   96: ifnull -> 122
    //   99: invokestatic ZG : ()Z
    //   102: ifne -> 122
    //   105: aload_0
    //   106: aload_1
    //   107: aload #4
    //   109: aload #5
    //   111: <illegal opcode> run : (Lburp/Zb1j;Ljava/awt/Window;Lburp/Zbw_;Lburp/Zekl;)Ljava/lang/Runnable;
    //   116: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   119: goto -> 122
    //   122: return
  }
  
  private void lambda$scopeRuleAdded$0(Window paramWindow, Zbw_ paramZbw_, Zekl paramZekl) {
    Zr7g zr7g = new Zr7g(paramWindow, paramZbw_, paramZekl, this.ZI);
    zr7g.setVisible(true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb1j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */