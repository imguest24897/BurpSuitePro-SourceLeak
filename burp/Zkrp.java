package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zkrp {
  private final Zz1v Zu;
  
  private static String[] ZA;
  
  private static final String a;
  
  public Zkrp(Zz1v paramZz1v) {
    this.Zu = paramZz1v;
  }
  
  public Zmie Zg(String paramString) {
    Zt30 zt30 = new Zt30(paramString);
    Ze74<Zt30, Object> ze74 = new Ze74<>(Zbff.ZQ, zt30, Zmav::Zg, Zmav::ZR);
    String[] arrayOfString = Zu();
    try {
      if (arrayOfString == null)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Zmie)Zp(ze74);
  }
  
  private <T, U> U Zp(Ze74<T, U> paramZe74) {
    try {
      Zgmm<U> zgmm = this.Zu.Zp(paramZe74);
      return zgmm.ZM();
    } catch (Zgri zgri) {
      Zah.Zl(zgri, Zk_.COMMON_RUNTIME_FAILURE);
      throw new RuntimeException(a, zgri);
    } 
  }
  
  public static void ZX(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zu() {
    return ZA;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zu : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_4
    //   7: anewarray java/lang/String
    //   10: invokestatic ZX : ([Ljava/lang/String;)V
    //   13: bipush #105
    //   15: ldc 'Q2 cX5{.<iIa\\fz'rxE5$]'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zkrp.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #125
    //   94: goto -> 124
    //   97: bipush #41
    //   99: goto -> 124
    //   102: bipush #59
    //   104: goto -> 124
    //   107: bipush #101
    //   109: goto -> 124
    //   112: bipush #67
    //   114: goto -> 124
    //   117: bipush #124
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
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
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
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkrp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */