package burp;

import java.awt.Insets;
import java.awt.Point;
import java.util.function.BiConsumer;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Zeov implements ChangeListener {
  private final JViewport Za;
  
  private final Zmgn ZN;
  
  private final BiConsumer<Integer, Integer> Zb;
  
  private int ZL = -1;
  
  private int ZY = 0;
  
  Zeov(JViewport paramJViewport, Zmgn paramZmgn, BiConsumer<Integer, Integer> paramBiConsumer) {
    this.Za = paramJViewport;
    this.ZN = paramZmgn;
    this.Zb = paramBiConsumer;
  }
  
  public void stateChanged(ChangeEvent paramChangeEvent) {
    // Byte code:
    //   0: invokestatic ZW : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZN : Lburp/Zmgn;
    //   8: invokevirtual ZS : ()F
    //   11: fstore_3
    //   12: fload_3
    //   13: fconst_0
    //   14: fcmpl
    //   15: ifne -> 67
    //   18: aload_0
    //   19: getfield ZN : Lburp/Zmgn;
    //   22: invokevirtual Zi : ()Lburp/Zzkh;
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 44
    //   32: aload #4
    //   34: invokeinterface Zh : ()F
    //   39: fstore_3
    //   40: aload_2
    //   41: ifnonnull -> 67
    //   44: aload_0
    //   45: getfield Zb : Ljava/util/function/BiConsumer;
    //   48: iconst_m1
    //   49: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   52: iconst_m1
    //   53: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   56: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   61: aload_0
    //   62: iconst_m1
    //   63: putfield ZL : I
    //   66: return
    //   67: aload_0
    //   68: getfield ZN : Lburp/Zmgn;
    //   71: invokevirtual getWidth : ()I
    //   74: istore #4
    //   76: aload_0
    //   77: getfield Za : Ljavax/swing/JViewport;
    //   80: invokevirtual getHeight : ()I
    //   83: i2f
    //   84: fload_3
    //   85: fdiv
    //   86: f2i
    //   87: istore #5
    //   89: aload_0
    //   90: getfield ZN : Lburp/Zmgn;
    //   93: invokevirtual getMargin : ()Ljava/awt/Insets;
    //   96: astore #6
    //   98: iload #4
    //   100: aload #6
    //   102: getfield left : I
    //   105: isub
    //   106: aload #6
    //   108: getfield right : I
    //   111: isub
    //   112: i2f
    //   113: aload_0
    //   114: getfield ZN : Lburp/Zmgn;
    //   117: invokevirtual Zi : ()Lburp/Zzkh;
    //   120: bipush #65
    //   122: invokeinterface Zm : (C)F
    //   127: fdiv
    //   128: fconst_1
    //   129: invokestatic max : (FF)F
    //   132: f2i
    //   133: istore #7
    //   135: sipush #20000
    //   138: iload #7
    //   140: imul
    //   141: iload #5
    //   143: iconst_2
    //   144: imul
    //   145: iload #7
    //   147: imul
    //   148: invokestatic max : (II)I
    //   151: istore #8
    //   153: aload_0
    //   154: getfield ZN : Lburp/Zmgn;
    //   157: invokevirtual getDocument : ()Ljavax/swing/text/Document;
    //   160: invokeinterface getLength : ()I
    //   165: iload #8
    //   167: if_icmpge -> 193
    //   170: aload_0
    //   171: getfield Zb : Ljava/util/function/BiConsumer;
    //   174: iconst_m1
    //   175: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   178: iconst_m1
    //   179: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   182: invokeinterface accept : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   187: aload_0
    //   188: iconst_m1
    //   189: putfield ZL : I
    //   192: return
    //   193: iload #5
    //   195: iconst_4
    //   196: imul
    //   197: sipush #10000
    //   200: invokestatic max : (II)I
    //   203: istore #9
    //   205: aload_0
    //   206: getfield ZN : Lburp/Zmgn;
    //   209: invokevirtual getVisibleRect : ()Ljava/awt/Rectangle;
    //   212: invokevirtual getLocation : ()Ljava/awt/Point;
    //   215: astore #10
    //   217: fload_3
    //   218: iload #9
    //   220: iload #5
    //   222: isub
    //   223: i2f
    //   224: fmul
    //   225: f2i
    //   226: istore #11
    //   228: aload #10
    //   230: getfield y : I
    //   233: iload #11
    //   235: idiv
    //   236: iload #11
    //   238: imul
    //   239: istore #12
    //   241: iload #12
    //   243: aload_0
    //   244: getfield ZL : I
    //   247: if_icmpne -> 260
    //   250: iload #4
    //   252: aload_0
    //   253: getfield ZY : I
    //   256: if_icmpne -> 260
    //   259: return
    //   260: aload_0
    //   261: iload #12
    //   263: putfield ZL : I
    //   266: aload_0
    //   267: iload #4
    //   269: putfield ZY : I
    //   272: aload_0
    //   273: iload #9
    //   275: invokevirtual ZA : (I)V
    //   278: return
  }
  
  private void ZA(int paramInt) {
    int i = this.ZN.viewToModel2D(new Point(this.ZN.getX(), this.ZL));
    i = Math.max(i, 0);
    Insets insets = this.ZN.getMargin();
    float f = Math.max((this.ZN.getWidth() - insets.right - insets.left) / this.ZN.Zi().Zm('A'), 1.0F);
    int j = (int)f * paramInt;
    int k = Math.min(i + j, this.ZN.getDocument().getLength());
    this.Zb.accept(Integer.valueOf(i), Integer.valueOf(k));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeov.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */