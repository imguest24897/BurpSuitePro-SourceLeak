package burp;

import java.awt.event.ActionEvent;

public class Zzjo extends Zz85 {
  private final int ZT;
  
  public Zzjo(String paramString, int paramInt) {
    super(paramString);
    this.ZT = paramInt;
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    // Byte code:
    //   0: invokestatic Zm : ()I
    //   3: istore_3
    //   4: aload_2
    //   5: invokevirtual getParent : ()Ljava/awt/Container;
    //   8: astore #4
    //   10: aload #4
    //   12: instanceof javax/swing/JViewport
    //   15: ifeq -> 123
    //   18: aload #4
    //   20: checkcast javax/swing/JViewport
    //   23: astore #5
    //   25: aload #5
    //   27: invokevirtual getViewPosition : ()Ljava/awt/Point;
    //   30: astore #6
    //   32: aload #6
    //   34: dup
    //   35: getfield y : I
    //   38: i2f
    //   39: aload_0
    //   40: getfield ZT : I
    //   43: i2f
    //   44: aload_2
    //   45: invokevirtual ZS : ()F
    //   48: fmul
    //   49: fadd
    //   50: f2i
    //   51: putfield y : I
    //   54: aload #6
    //   56: getfield y : I
    //   59: ifge -> 72
    //   62: aload #6
    //   64: iconst_0
    //   65: putfield y : I
    //   68: iload_3
    //   69: ifeq -> 116
    //   72: aload #5
    //   74: invokevirtual getViewRect : ()Ljava/awt/Rectangle;
    //   77: astore #7
    //   79: aload #6
    //   81: getfield y : I
    //   84: aload #7
    //   86: getfield height : I
    //   89: iadd
    //   90: istore #8
    //   92: iload #8
    //   94: aload_2
    //   95: invokevirtual getHeight : ()I
    //   98: if_icmplt -> 116
    //   101: aload #6
    //   103: aload_2
    //   104: invokevirtual getHeight : ()I
    //   107: aload #7
    //   109: getfield height : I
    //   112: isub
    //   113: putfield y : I
    //   116: aload #5
    //   118: aload #6
    //   120: invokevirtual setViewPosition : (Ljava/awt/Point;)V
    //   123: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzjo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */