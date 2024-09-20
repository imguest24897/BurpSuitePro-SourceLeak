package burp;

import java.awt.event.ActionEvent;
import javax.swing.text.Document;

public class Zzj8 extends Zz85 {
  private static final String c;
  
  public Zzj8() {
    super(c);
  }
  
  public void Zp(ActionEvent paramActionEvent, Zmgw paramZmgw) {
    Document document = paramZmgw.getDocument();
    paramZmgw.setCaretPosition(0);
    paramZmgw.moveCaretPosition(document.getLength());
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc '}hh8Vcoah'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zzj8.c : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #15
    //   82: goto -> 111
    //   85: bipush #12
    //   87: goto -> 111
    //   90: iconst_5
    //   91: goto -> 111
    //   94: bipush #92
    //   96: goto -> 111
    //   99: bipush #122
    //   101: goto -> 111
    //   104: bipush #35
    //   106: goto -> 111
    //   109: bipush #79
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 7
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzj8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */