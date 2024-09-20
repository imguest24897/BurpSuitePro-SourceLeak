package burp;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Zbc2 extends Zbc9 implements Zlgx {
  private static final Border ZR = BorderFactory.createEmptyBorder(5, 10, 0, 10);
  
  private final Zm6x ZV;
  
  private static String ZL;
  
  public Zbc2(Zm6x paramZm6x) {
    this.ZV = paramZm6x;
    addContainerListener(new Zlmj(this));
    setVisible(false);
  }
  
  public Ze6x ZH(Zszl paramZszl) {
    // Byte code:
    //   0: new burp/Zbce
    //   3: dup
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZV : Lburp/Zm6x;
    //   9: invokespecial <init> : (Lburp/Zszl;Lburp/Zm6x;)V
    //   12: astore_3
    //   13: invokestatic ZO : ()Ljava/lang/String;
    //   16: aload_3
    //   17: getstatic burp/Zbc2.ZR : Ljavax/swing/border/Border;
    //   20: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   23: astore_2
    //   24: aload_0
    //   25: aload_3
    //   26: <illegal opcode> run : (Lburp/Zbc2;Lburp/Zbce;)Ljava/lang/Runnable;
    //   31: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   34: aload_3
    //   35: dup
    //   36: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: pop
    //   40: <illegal opcode> Zb : (Lburp/Zbce;)Lburp/Ze6x;
    //   45: invokestatic Zwu : ()[Lburp/Zbqc;
    //   48: ifnonnull -> 56
    //   51: ldc 'UUDtEb'
    //   53: invokestatic ZR : (Ljava/lang/String;)V
    //   56: areturn
  }
  
  private void lambda$addNotification$0(Zbce paramZbce) {
    add(paramZbce);
    ZP(paramZbce);
  }
  
  public static void ZR(String paramString) {
    ZL = paramString;
  }
  
  public static String ZO() {
    return ZL;
  }
  
  static {
    if (ZO() == null)
      ZR("oH26ec"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbc2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */