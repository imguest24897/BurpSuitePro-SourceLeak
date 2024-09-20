package burp;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import net.portswigger.Zm2;

class Zbvs extends Zbqc {
  private static final Ze9n ZS;
  
  private final Zbcp Zq;
  
  private static final String a;
  
  Zbvs(Ztk2 paramZtk2, Zbcp paramZbcp, Zl_l paramZl_l) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/BorderLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: aload_0
    //   12: aload_2
    //   13: putfield Zq : Lburp/Zbcp;
    //   16: aload_2
    //   17: aload_2
    //   18: aload_1
    //   19: <illegal opcode> accept : (Lburp/Zbcp;Lburp/Ztk2;)Ljava/util/function/Consumer;
    //   24: invokevirtual ZJ : (Ljava/util/function/Consumer;)V
    //   27: aload_2
    //   28: aload_3
    //   29: invokevirtual Zc : (Lburp/Zsyw;)V
    //   32: new burp/Zbup
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: astore #4
    //   41: aload #4
    //   43: bipush #31
    //   45: invokevirtual setHorizontalScrollBarPolicy : (I)V
    //   48: aload #4
    //   50: invokestatic createEmptyBorder : ()Ljavax/swing/border/Border;
    //   53: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   56: aload #4
    //   58: aload_2
    //   59: invokevirtual setViewportView : (Ljava/awt/Component;)V
    //   62: aload #4
    //   64: getstatic burp/Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND : Lburp/Zlkk;
    //   67: invokevirtual Zh : (Lburp/Zlkk;)V
    //   70: aload_0
    //   71: aload #4
    //   73: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   76: pop
    //   77: aload_0
    //   78: getstatic burp/Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND : Lburp/Zlkk;
    //   81: invokevirtual Zl : (Lburp/Zlkk;)V
    //   84: return
  }
  
  public void Zb() {
    Zm2.ZC(Zrrh.EXPLAINER_COLLAPSE_ALL);
    this.Zq.ZQ(true);
  }
  
  public void Zx() {
    Zm2.ZC(Zrrh.EXPLAINER_EXPAND_ALL);
    this.Zq.ZQ(false);
  }
  
  public void Zb(Zxtf paramZxtf) {
    this.Zq.ZK(paramZxtf);
  }
  
  public boolean ZQ() {
    Zxj2 zxj2 = this.Zq.Zz();
    return (zxj2 == null || zxj2.ZA() == 0);
  }
  
  private static void lambda$new$1(Zbcp paramZbcp, Ztk2 paramZtk2, MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokevirtual getComponent : ()Ljava/awt/Component;
    //   5: invokevirtual Zk : (Ljava/awt/Component;)I
    //   8: istore_3
    //   9: iload_3
    //   10: iconst_m1
    //   11: if_icmpeq -> 75
    //   14: new burp/Zkj9
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #4
    //   23: new burp/Zepe
    //   26: dup
    //   27: getstatic burp/Zbvs.a : Ljava/lang/String;
    //   30: getstatic burp/Zbvs.ZS : Lburp/Ze9n;
    //   33: invokespecial <init> : (Ljava/lang/String;Ljavax/swing/Icon;)V
    //   36: astore #5
    //   38: aload #5
    //   40: aload_1
    //   41: iload_3
    //   42: <illegal opcode> actionPerformed : (Lburp/Ztk2;I)Ljava/awt/event/ActionListener;
    //   47: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   50: aload #4
    //   52: aload #5
    //   54: invokevirtual add : (Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
    //   57: pop
    //   58: aload #4
    //   60: aload_2
    //   61: invokevirtual getComponent : ()Ljava/awt/Component;
    //   64: aload_2
    //   65: invokevirtual getX : ()I
    //   68: aload_2
    //   69: invokevirtual getY : ()I
    //   72: invokevirtual show : (Ljava/awt/Component;II)V
    //   75: return
  }
  
  private static void lambda$new$0(Ztk2 paramZtk2, int paramInt, ActionEvent paramActionEvent) {
    paramZtk2.ZV(paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'kt2Y'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbvs.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #11
    //   82: goto -> 112
    //   85: bipush #64
    //   87: goto -> 112
    //   90: bipush #86
    //   92: goto -> 112
    //   95: bipush #25
    //   97: goto -> 112
    //   100: bipush #99
    //   102: goto -> 112
    //   105: bipush #51
    //   107: goto -> 112
    //   110: bipush #114
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: getstatic burp/Zeuf.DELETE : Lburp/Zeuf;
    //   157: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   160: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   163: invokevirtual Z_ : ()Lburp/Ze9n;
    //   166: putstatic burp/Zbvs.ZS : Lburp/Ze9n;
    //   169: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */