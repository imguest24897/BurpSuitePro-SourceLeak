package burp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Zvm extends MouseAdapter {
  final Zkj9 ZP;
  
  final Ze0u ZS;
  
  final Zsm8 ZZ;
  
  Zvm(Zsm8 paramZsm8, Zkj9 paramZkj9, Ze0u paramZe0u) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZP : Lburp/Zkj9;
    //   8: invokevirtual isVisible : ()Z
    //   11: ifeq -> 26
    //   14: aload_0
    //   15: getfield ZP : Lburp/Zkj9;
    //   18: iconst_0
    //   19: invokevirtual setVisible : (Z)V
    //   22: iload_2
    //   23: ifeq -> 116
    //   26: aload_0
    //   27: getfield ZP : Lburp/Zkj9;
    //   30: invokevirtual removeAll : ()V
    //   33: aload_0
    //   34: getfield ZZ : Lburp/Zsm8;
    //   37: getfield ZO : Ljava/lang/Iterable;
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore_3
    //   46: aload_3
    //   47: invokeinterface hasNext : ()Z
    //   52: ifeq -> 80
    //   55: aload_3
    //   56: invokeinterface next : ()Ljava/lang/Object;
    //   61: checkcast javax/swing/JMenuItem
    //   64: astore #4
    //   66: aload_0
    //   67: getfield ZP : Lburp/Zkj9;
    //   70: aload #4
    //   72: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   75: pop
    //   76: iload_2
    //   77: ifeq -> 46
    //   80: aload_0
    //   81: getfield ZP : Lburp/Zkj9;
    //   84: aload_0
    //   85: getfield ZS : Lburp/Ze0u;
    //   88: aload_0
    //   89: getfield ZS : Lburp/Ze0u;
    //   92: invokevirtual getWidth : ()I
    //   95: aload_0
    //   96: getfield ZP : Lburp/Zkj9;
    //   99: invokevirtual getPreferredSize : ()Ljava/awt/Dimension;
    //   102: getfield width : I
    //   105: isub
    //   106: aload_0
    //   107: getfield ZS : Lburp/Ze0u;
    //   110: invokevirtual getHeight : ()I
    //   113: invokevirtual show : (Ljava/awt/Component;II)V
    //   116: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */