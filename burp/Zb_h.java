package burp;

import java.util.Map;
import net.portswigger.Zkb;

public class Zb_h {
  private final Map<String, String> Ze;
  
  private static String ZA;
  
  private static final String b;
  
  public void ZS(String paramString, long paramLong) {
    Z_(paramString, Long.toString(paramLong));
  }
  
  public void ZQ(String paramString, Zstu paramZstu) {
    Z_(paramString, paramZstu.Zis());
  }
  
  public void Zj(String paramString, byte[] paramArrayOfbyte) {
    Z_(paramString, Zkb.ZG(paramArrayOfbyte));
  }
  
  public void Z_(String paramString1, String paramString2) {
    String str = ZG();
    this.Ze.put(paramString1, (paramString2 == null) ? b : paramString2);
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public String toString() {
    return "";
  }
  
  private static void lambda$toString$0(Zrmw paramZrmw, Zgkc paramZgkc) {
    paramZgkc.Zu2().Zf(paramZrmw);
  }
  
  public static void Ze(String paramString) {
    ZA = paramString;
  }
  
  public static String ZG() {
    return ZA;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'Afdh6b'
    //   8: invokestatic Ze : (Ljava/lang/String;)V
    //   11: bipush #23
    //   13: ldc '`#8dn\\n[b'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zb_h.b : Ljava/lang/String;
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
    //   92: bipush #75
    //   94: goto -> 124
    //   97: bipush #8
    //   99: goto -> 124
    //   102: bipush #65
    //   104: goto -> 124
    //   107: bipush #6
    //   109: goto -> 124
    //   112: bipush #21
    //   114: goto -> 124
    //   117: bipush #113
    //   119: goto -> 124
    //   122: bipush #114
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */