package burp;

import javax.swing.event.CaretEvent;
import javax.swing.text.BadLocationException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkc0 {
  private final Zgb6 ZD;
  
  private final Zb0h Zk;
  
  private final Ztwv Zt;
  
  private static final String a;
  
  public Zkc0(Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv) {
    this.ZD = paramZgb6;
    this.Zk = paramZb0h;
    this.Zt = paramZtwv;
  }
  
  public Zl59 ZH(Zztr paramZztr, Zr5s paramZr5s, Runnable paramRunnable) {
    // Byte code:
    //   0: new burp/Zbqq
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #4
    //   9: new burp/Ze9f
    //   12: dup
    //   13: aload #4
    //   15: getstatic burp/Zkc0.a : Ljava/lang/String;
    //   18: invokespecial <init> : (Lburp/Zbqi;Ljava/lang/String;)V
    //   21: astore #5
    //   23: new burp/Zmgn
    //   26: dup
    //   27: aload #5
    //   29: aload_2
    //   30: invokespecial <init> : (Lburp/Ze9f;Lburp/Zg4o;)V
    //   33: astore #6
    //   35: aload #6
    //   37: aload_1
    //   38: invokeinterface ZJ : ()Z
    //   43: invokevirtual setEditable : (Z)V
    //   46: aload #6
    //   48: aload_1
    //   49: invokeinterface ZQ : ()Z
    //   54: invokevirtual ZM : (Z)V
    //   57: aload #6
    //   59: aload_1
    //   60: invokeinterface ZT : ()I
    //   65: invokevirtual setTabSize : (I)V
    //   68: aload #6
    //   70: aload_2
    //   71: aload #6
    //   73: <illegal opcode> caretUpdate : (Lburp/Zr5s;Lburp/Zmgn;)Ljavax/swing/event/CaretListener;
    //   78: invokevirtual addCaretListener : (Ljavax/swing/event/CaretListener;)V
    //   81: new burp/Zm0p
    //   84: dup
    //   85: aload_0
    //   86: getfield ZD : Lburp/Zgb6;
    //   89: aload_0
    //   90: getfield Zk : Lburp/Zb0h;
    //   93: aload_0
    //   94: getfield Zt : Lburp/Ztwv;
    //   97: aload #6
    //   99: invokespecial <init> : (Lburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;Ljava/awt/Component;)V
    //   102: astore #7
    //   104: new burp/Zvo6
    //   107: dup
    //   108: aload #6
    //   110: invokespecial <init> : (Lburp/Zmgn;)V
    //   113: astore #8
    //   115: new burp/Zgeo
    //   118: dup
    //   119: aload_0
    //   120: aload #8
    //   122: aload_0
    //   123: getfield Zk : Lburp/Zb0h;
    //   126: aload #7
    //   128: aload_3
    //   129: invokespecial <init> : (Lburp/Zkc0;Lburp/Zvo6;Lburp/Zb0h;Lburp/Zrfb;Ljava/lang/Runnable;)V
    //   132: astore #9
    //   134: new burp/Zl59
    //   137: dup
    //   138: aload #8
    //   140: aload_0
    //   141: getfield ZD : Lburp/Zgb6;
    //   144: aload #9
    //   146: new burp/Zltd
    //   149: dup
    //   150: invokespecial <init> : ()V
    //   153: aload_1
    //   154: invokeinterface ZJ : ()Z
    //   159: invokespecial <init> : (Lburp/Zvo6;Lburp/Zgb6;Lburp/Zzyl;Lburp/Zejf;Z)V
    //   162: areturn
  }
  
  private static int Zs(Zmgn paramZmgn) {
    int i = paramZmgn.getCaretPosition();
    try {
      int j = paramZmgn.getLineStartOffset(paramZmgn.ZM());
      return i - j;
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return 0;
    } 
  }
  
  private static void lambda$create$0(Zr5s paramZr5s, Zmgn paramZmgn, CaretEvent paramCaretEvent) {
    paramZr5s.Ze(paramZmgn.ZM(), Zs(paramZmgn));
  }
  
  static {
    // Byte code:
    //   0: bipush #59
    //   2: ldc '1>nc'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkc0.a : Ljava/lang/String;
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
    //   80: bipush #95
    //   82: goto -> 112
    //   85: bipush #75
    //   87: goto -> 112
    //   90: bipush #106
    //   92: goto -> 112
    //   95: bipush #16
    //   97: goto -> 112
    //   100: bipush #12
    //   102: goto -> 112
    //   105: bipush #118
    //   107: goto -> 112
    //   110: bipush #104
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkc0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */