package burp;

import java.awt.Component;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm0p implements Zrfb {
  private final Zgb6 ZP;
  
  private final Zb0h Zn;
  
  private final Ztwv ZC;
  
  private final Component ZA;
  
  private static int[] Zj;
  
  private static final String a;
  
  public Zm0p(Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Component paramComponent) {
    this.ZP = paramZgb6;
    this.Zn = paramZb0h;
    int[] arrayOfInt = Zg();
    this.ZC = paramZtwv;
    this.ZA = paramComponent;
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void ZX(String paramString) {
    if (this.ZA == null) {
      Zuh.Zb(false, Zqf.Zr);
      return;
    } 
    Zrhr zrhr = new Zrhr(Zt2m.ZF(this.ZA), true, a, paramString, 75, 8, this.ZP, this.Zn, this.ZC);
    zrhr.setVisible(true);
  }
  
  public static void ZE(int[] paramArrayOfint) {
    Zj = paramArrayOfint;
  }
  
  public static int[] Zg() {
    return Zj;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zg : ()[I
    //   3: ifnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic ZE : ([I)V
    //   12: bipush #114
    //   14: ldc '2"?Ai)qA\\fi'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zm0p.a : Ljava/lang/String;
    //   23: goto -> 165
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 139
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 121, 0 -> 92, 1 -> 96, 2 -> 101, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: iconst_3
    //   93: goto -> 123
    //   96: bipush #63
    //   98: goto -> 123
    //   101: bipush #35
    //   103: goto -> 123
    //   106: bipush #24
    //   108: goto -> 123
    //   111: bipush #86
    //   113: goto -> 123
    //   116: bipush #6
    //   118: goto -> 123
    //   121: bipush #111
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 47
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 44
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 20
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm0p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */