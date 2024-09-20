package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zrr8 extends Zrgr {
  private static final String b;
  
  Zrr8(Zgpe paramZgpe) throws Ztrx {
    super(paramZgpe, true);
  }
  
  public boolean ZV(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    Zuh.Zb(false, Zqf.ZC);
    return false;
  }
  
  public boolean ZQ(Zml3 paramZml3, Zrgd paramZrgd, Zgb6 paramZgb6, Zz28 paramZz28, Zr1j paramZr1j, Zkh7 paramZkh7) {
    boolean bool = false;
    String str = Zgyj.ZZ((paramZml3.ZP()).ZP, b, false);
    if (str != null)
      try {
        String str1 = str.substring(13).trim();
        this.ZN.reset(str1);
        bool = this.ZN.find();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    return (bool == ((ZC() == 0)));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #107
    //   2: ldc 'i4`}o'/d}U'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrr8.b : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #97
    //   82: goto -> 111
    //   85: bipush #48
    //   87: goto -> 111
    //   90: bipush #14
    //   92: goto -> 111
    //   95: bipush #127
    //   97: goto -> 111
    //   100: bipush #115
    //   102: goto -> 111
    //   105: iconst_4
    //   106: goto -> 111
    //   109: bipush #112
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
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
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrr8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */