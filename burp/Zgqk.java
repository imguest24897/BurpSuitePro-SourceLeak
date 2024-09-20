package burp;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class Zgqk extends MouseInputAdapter {
  private Point Zn;
  
  final Zro1 Zm;
  
  private Zgqk(Zro1 paramZro1) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getPoint : ()Ljava/awt/Point;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_0
    //   7: getfield Zm : Lburp/Zro1;
    //   10: invokestatic convertPointToScreen : (Ljava/awt/Point;Ljava/awt/Component;)V
    //   13: aload_3
    //   14: getfield x : I
    //   17: aload_0
    //   18: getfield Zn : Ljava/awt/Point;
    //   21: getfield x : I
    //   24: isub
    //   25: istore #4
    //   27: aload_3
    //   28: getfield y : I
    //   31: aload_0
    //   32: getfield Zn : Ljava/awt/Point;
    //   35: getfield y : I
    //   38: isub
    //   39: istore #5
    //   41: invokestatic Zt : ()[Lburp/Zbqc;
    //   44: aload_0
    //   45: getfield Zm : Lburp/Zro1;
    //   48: invokestatic getWindowAncestor : (Ljava/awt/Component;)Ljava/awt/Window;
    //   51: astore #6
    //   53: astore_2
    //   54: aload #6
    //   56: ifnull -> 193
    //   59: aload_0
    //   60: getfield Zm : Lburp/Zro1;
    //   63: invokevirtual getComponentOrientation : ()Ljava/awt/ComponentOrientation;
    //   66: invokevirtual isLeftToRight : ()Z
    //   69: ifeq -> 137
    //   72: aload #6
    //   74: invokevirtual getWidth : ()I
    //   77: istore #7
    //   79: aload_3
    //   80: getfield x : I
    //   83: aload #6
    //   85: invokevirtual getX : ()I
    //   88: if_icmplt -> 98
    //   91: iload #7
    //   93: iload #4
    //   95: iadd
    //   96: istore #7
    //   98: aload #6
    //   100: invokevirtual getHeight : ()I
    //   103: istore #8
    //   105: aload_3
    //   106: getfield y : I
    //   109: aload #6
    //   111: invokevirtual getY : ()I
    //   114: if_icmplt -> 124
    //   117: iload #8
    //   119: iload #5
    //   121: iadd
    //   122: istore #8
    //   124: aload #6
    //   126: iload #7
    //   128: iload #8
    //   130: invokevirtual setSize : (II)V
    //   133: aload_2
    //   134: ifnonnull -> 183
    //   137: iconst_1
    //   138: aload #6
    //   140: invokevirtual getWidth : ()I
    //   143: iload #4
    //   145: isub
    //   146: invokestatic max : (II)I
    //   149: istore #7
    //   151: iconst_1
    //   152: aload #6
    //   154: invokevirtual getHeight : ()I
    //   157: iload #5
    //   159: iadd
    //   160: invokestatic max : (II)I
    //   163: istore #8
    //   165: aload #6
    //   167: aload_3
    //   168: getfield x : I
    //   171: aload #6
    //   173: invokevirtual getY : ()I
    //   176: iload #7
    //   178: iload #8
    //   180: invokevirtual setBounds : (IIII)V
    //   183: aload #6
    //   185: invokevirtual invalidate : ()V
    //   188: aload #6
    //   190: invokevirtual validate : ()V
    //   193: aload_0
    //   194: getfield Zn : Ljava/awt/Point;
    //   197: aload_3
    //   198: invokevirtual setLocation : (Ljava/awt/Point;)V
    //   201: invokestatic Zwu : ()[Lburp/Zbqc;
    //   204: ifnonnull -> 214
    //   207: iconst_5
    //   208: anewarray burp/Zbqc
    //   211: invokestatic ZE : ([Lburp/Zbqc;)V
    //   214: return
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.Zn = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(this.Zn, this.Zm);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.Zn = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgqk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */