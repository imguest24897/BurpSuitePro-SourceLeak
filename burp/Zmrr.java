package burp;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

class Zmrr extends MouseInputAdapter {
  private Point ZS;
  
  final Zehv Zz;
  
  private Zmrr(Zehv paramZehv) {}
  
  public void mouseDragged(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getPoint : ()Ljava/awt/Point;
    //   4: astore_3
    //   5: aload_3
    //   6: aload_0
    //   7: getfield Zz : Lburp/Zehv;
    //   10: invokestatic convertPointToScreen : (Ljava/awt/Point;Ljava/awt/Component;)V
    //   13: aload_3
    //   14: getfield x : I
    //   17: aload_0
    //   18: getfield ZS : Ljava/awt/Point;
    //   21: getfield x : I
    //   24: isub
    //   25: istore #4
    //   27: invokestatic ZM : ()[I
    //   30: aload_3
    //   31: getfield y : I
    //   34: aload_0
    //   35: getfield ZS : Ljava/awt/Point;
    //   38: getfield y : I
    //   41: isub
    //   42: istore #5
    //   44: astore_2
    //   45: aload_0
    //   46: getfield Zz : Lburp/Zehv;
    //   49: invokestatic getWindowAncestor : (Ljava/awt/Component;)Ljava/awt/Window;
    //   52: astore #6
    //   54: aload #6
    //   56: ifnull -> 193
    //   59: aload_0
    //   60: getfield Zz : Lburp/Zehv;
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
    //   194: getfield ZS : Ljava/awt/Point;
    //   197: aload_3
    //   198: invokevirtual setLocation : (Ljava/awt/Point;)V
    //   201: return
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    this.ZS = paramMouseEvent.getPoint();
    SwingUtilities.convertPointToScreen(this.ZS, this.Zz);
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    this.ZS = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmrr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */