package burp;

import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;

class Zz71 implements Ze8a {
  private static final Runnable ZN;
  
  private final Zxdz ZW;
  
  private final JComponent Zl;
  
  private final Zla4 ZY;
  
  private final Zrf0 Zt;
  
  private final Zglk ZG;
  
  private final int ZS;
  
  private final Zzo2 Zd;
  
  private final Zbg8 Zb;
  
  private final HierarchyListener Zu;
  
  private Runnable Zm;
  
  private static final String a;
  
  Zz71(Zzg paramZzg) {
    this.ZW = paramZzg.ZN;
    this.Zl = paramZzg.ZT;
    this.ZY = paramZzg.ZV;
    this.Zt = paramZzg.Z_;
    boolean bool = Zbg8.ZN();
    this.ZG = paramZzg.Zm;
    this.ZS = paramZzg.Ze;
    this.Zd = paramZzg.Zv;
    this.Zb = paramZzg.ZK;
    this.Zm = ZN;
    paramZzg.ZK.ZS(this::ZM);
    this.Zu = this::lambda$new$1;
    paramZzg.ZT.addHierarchyListener(this.Zu);
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void ZM() {
    this.Zd.Zz(this.ZW);
    this.Zl.removeHierarchyListener(this.Zu);
    Zg();
  }
  
  public void Zg() {
    this.Zm.run();
    this.Zm = ZN;
  }
  
  public void Zn() {
    // Byte code:
    //   0: getstatic burp/Zz71.a : Ljava/lang/String;
    //   3: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   6: ifnull -> 10
    //   9: return
    //   10: aload_0
    //   11: getfield Zl : Ljavax/swing/JComponent;
    //   14: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   17: checkcast burp/Zl04
    //   20: astore_1
    //   21: aload_1
    //   22: ifnonnull -> 26
    //   25: return
    //   26: aload_1
    //   27: invokevirtual getRootPane : ()Ljavax/swing/JRootPane;
    //   30: astore_2
    //   31: aload_2
    //   32: invokevirtual getLayeredPane : ()Ljavax/swing/JLayeredPane;
    //   35: astore_3
    //   36: aload_0
    //   37: getfield Zb : Lburp/Zbg8;
    //   40: invokestatic updateComponentTreeUI : (Ljava/awt/Component;)V
    //   43: new burp/Zbci
    //   46: dup
    //   47: aload_0
    //   48: getfield Zb : Lburp/Zbg8;
    //   51: aload_0
    //   52: getfield Zl : Ljavax/swing/JComponent;
    //   55: aload_0
    //   56: getfield ZY : Lburp/Zla4;
    //   59: aload_0
    //   60: getfield Zt : Lburp/Zrf0;
    //   63: aload_0
    //   64: getfield ZG : Lburp/Zglk;
    //   67: aload_0
    //   68: getfield ZS : I
    //   71: invokespecial <init> : (Ljava/awt/Component;Ljava/awt/Component;Lburp/Zla4;Lburp/Zrf0;Lburp/Zglk;I)V
    //   74: astore #4
    //   76: aload_3
    //   77: aload #4
    //   79: getstatic javax/swing/JLayeredPane.POPUP_LAYER : Ljava/lang/Integer;
    //   82: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   85: aload_0
    //   86: aload_3
    //   87: aload #4
    //   89: <illegal opcode> run : (Ljavax/swing/JLayeredPane;Lburp/Zbci;)Ljava/lang/Runnable;
    //   94: putfield Zm : Ljava/lang/Runnable;
    //   97: return
  }
  
  private static void lambda$showSkidmark$3(JLayeredPane paramJLayeredPane, Zbci paramZbci) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Ljavax/swing/JLayeredPane;Lburp/Zbci;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private static void lambda$showSkidmark$2(JLayeredPane paramJLayeredPane, Zbci paramZbci) {
    paramJLayeredPane.remove(paramZbci);
    paramZbci.Zb();
    paramJLayeredPane.repaint();
  }
  
  private void lambda$new$1(HierarchyEvent paramHierarchyEvent) {
    boolean bool = Zbg8.Zp();
    if ((paramHierarchyEvent.getChangeFlags() & 0x4L) != 0L) {
      if (paramHierarchyEvent.getComponent().isShowing()) {
        Zn();
        if (!bool) {
          Zg();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    Zg();
  }
  
  private static void lambda$static$0() {}
  
  static {
    // Byte code:
    //   0: bipush #117
    //   2: ldc '5Eh9L$Ds\\fp'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zz71.a : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #69
    //   87: goto -> 112
    //   90: bipush #111
    //   92: goto -> 112
    //   95: bipush #23
    //   97: goto -> 112
    //   100: bipush #98
    //   102: goto -> 112
    //   105: bipush #77
    //   107: goto -> 112
    //   110: bipush #8
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
    //   154: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   159: putstatic burp/Zz71.ZN : Ljava/lang/Runnable;
    //   162: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz71.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */