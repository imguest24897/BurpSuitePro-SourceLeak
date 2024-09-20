package burp;

import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zrzg;
import net.portswigger.Zuh;

public class Zvoh {
  private final Zxei Zb;
  
  private final Zt90 ZO;
  
  private final Zrzg Zn;
  
  private Zbiw Zy;
  
  private Zbry ZP;
  
  private Zbr5 Zo;
  
  private static String Zv;
  
  private static final String b;
  
  public Zvoh(Zxei paramZxei, Zt90 paramZt90, Zrzg paramZrzg) {
    this.ZO = paramZt90;
    this.Zn = paramZrzg;
    Zm2.ZC(Zrrh.SUITE_HELP_MENU_CLEAN_BURP_FROM_COMPUTER_CLICKED);
    this.Zb = paramZxei;
    this.ZP = new Zbry(this);
    this.Zy = new Zl0a(paramZxei.ZF(), b, 100, 25, this.ZP);
    this.ZP.Zp(this.Zy);
  }
  
  Zl04 ZP() {
    return this.Zy.Zu();
  }
  
  Zxei Zl() {
    return this.Zb;
  }
  
  Zsic Zz(Zsic paramZsic) {
    if (paramZsic == this.Zo)
      return this.ZP; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic ZG(Zsic paramZsic) {
    if (paramZsic == this.ZP) {
      if (this.Zo == null)
        this.Zo = new Zbr5(this, this.ZP); 
      return this.Zo;
    } 
    if (paramZsic == this.Zo)
      return new Zbto(this, this.Zb, this.ZO, this.Zn, this.ZP); 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  public static void ZT(String paramString) {
    Zv = paramString;
  }
  
  public static String ZE() {
    return Zv;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZE : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'wM0avc'
    //   8: invokestatic ZT : (Ljava/lang/String;)V
    //   11: bipush #75
    //   13: ldc ' [Q?fE7TK_<VQR'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zvoh.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #40
    //   94: goto -> 124
    //   97: bipush #124
    //   99: goto -> 124
    //   102: bipush #44
    //   104: goto -> 124
    //   107: bipush #123
    //   109: goto -> 124
    //   112: bipush #26
    //   114: goto -> 124
    //   117: bipush #109
    //   119: goto -> 124
    //   122: bipush #111
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zvoh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */