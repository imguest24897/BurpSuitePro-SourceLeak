package burp;

import java.net.UnknownHostException;
import java.util.List;

public class Zb4u {
  private final Zl11 Zz;
  
  private final Zzen ZP;
  
  private final Zrah ZK;
  
  private static String ZT;
  
  private static final String b;
  
  public Zb4u(Zl11 paramZl11, Zgb6 paramZgb6, Zskh paramZskh) {
    this.Zz = paramZl11;
    this.ZP = new Zlbx(paramZskh);
    this.ZK = new Zrah(paramZgb6);
  }
  
  public Zsxd ZT(Zefx paramZefx, Ze45 paramZe45, String paramString, boolean paramBoolean, Zsil paramZsil) throws UnknownHostException, Zs2o {
    String str = ZY();
    Zsxd zsxd = Zm(paramZefx, paramZe45, paramString, paramBoolean, paramZsil);
    try {
      if (zsxd.ZG().Zx() instanceof UnknownHostException)
        throw (UnknownHostException)zsxd.ZG().Zx(); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      if (zsxd.ZG().Zb() == Zvom.STREAMING_RESPONSE)
        throw new Zs2o(); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      if (str == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    return zsxd;
  }
  
  public Zsxd ZB(Zefx paramZefx, Ze45 paramZe45, String paramString) {
    return Zm(paramZefx, paramZe45, paramString, false, Zxfj.ZI);
  }
  
  public List<Zsxd> ZF(List<Zefx> paramList, Ze45 paramZe45) {
    return this.Zz.Zf(Zlx4.Zw(paramList), this.ZK.ZL(paramZe45, null, false), Zxfj.ZI, this.ZP).ZG();
  }
  
  private Zsxd Zm(Zefx paramZefx, Ze45 paramZe45, String paramString, boolean paramBoolean, Zsil paramZsil) {
    return this.Zz.ZE(paramZefx, this.ZK.ZL(paramZe45, paramString, paramBoolean), paramZsil, this.ZP);
  }
  
  private static String Zl(String paramString) {
    return b + b;
  }
  
  public static void Zi(String paramString) {
    ZT = paramString;
  }
  
  public static String ZY() {
    return ZT;
  }
  
  private static UnknownHostException a(UnknownHostException paramUnknownHostException) {
    return paramUnknownHostException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZY : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'xHXwTb'
    //   8: invokestatic Zi : (Ljava/lang/String;)V
    //   11: bipush #99
    //   13: ldc '"UgJ`N\\n5)'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zb4u.b : Ljava/lang/String;
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
    //   92: bipush #36
    //   94: goto -> 124
    //   97: bipush #78
    //   99: goto -> 124
    //   102: bipush #112
    //   104: goto -> 124
    //   107: bipush #76
    //   109: goto -> 124
    //   112: bipush #109
    //   114: goto -> 124
    //   117: bipush #73
    //   119: goto -> 124
    //   122: bipush #12
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb4u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */