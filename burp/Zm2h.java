package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zm2h extends Zm2i {
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: iload_3
    //   4: iload #4
    //   6: iload #5
    //   8: iload #6
    //   10: invokespecial getTableCellRendererComponent : (Ljavax/swing/JTable;Ljava/lang/Object;ZZII)Ljava/awt/Component;
    //   13: pop
    //   14: invokestatic Z_ : ()Z
    //   17: aload_0
    //   18: new javax/swing/border/EmptyBorder
    //   21: dup
    //   22: iconst_2
    //   23: iconst_3
    //   24: iconst_2
    //   25: iconst_3
    //   26: invokespecial <init> : (IIII)V
    //   29: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   32: istore #7
    //   34: iload_3
    //   35: ifeq -> 63
    //   38: aload_0
    //   39: getstatic burp/Zlkk.SELECTION_BACKGROUND : Lburp/Zlkk;
    //   42: invokevirtual ZS : ()Ljava/awt/Color;
    //   45: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   48: aload_0
    //   49: getstatic burp/Zlkk.SELECTION_FOREGROUND : Lburp/Zlkk;
    //   52: invokevirtual ZS : ()Ljava/awt/Color;
    //   55: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   58: iload #7
    //   60: ifeq -> 101
    //   63: iload #5
    //   65: iconst_2
    //   66: irem
    //   67: iconst_1
    //   68: if_icmpne -> 77
    //   71: getstatic burp/Zlkk.HEX_TABLE_ALTERNATE_ROW_BACKGROUND : Lburp/Zlkk;
    //   74: goto -> 80
    //   77: getstatic burp/Zlkk.TEXT_EDITOR_BACKGROUND : Lburp/Zlkk;
    //   80: astore #8
    //   82: aload_0
    //   83: aload #8
    //   85: invokevirtual ZS : ()Ljava/awt/Color;
    //   88: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   91: aload_0
    //   92: getstatic burp/Zlkk.FOREGROUND : Lburp/Zlkk;
    //   95: invokevirtual ZS : ()Ljava/awt/Color;
    //   98: invokevirtual setForeground : (Ljava/awt/Color;)V
    //   101: aload_0
    //   102: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm2h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */