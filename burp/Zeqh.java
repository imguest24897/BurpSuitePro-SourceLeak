package burp;

import burp.api.montoya.logger.LoggerCaptureHttpRequestResponse;
import burp.api.montoya.utilities.Utilities;
import java.util.List;

public class Zeqh implements Zex3<LoggerCaptureHttpRequestResponse, Boolean> {
  private final Utilities ZM;
  
  private static int[] ZI;
  
  private static final String a;
  
  public Zeqh(Zetm paramZetm) {
    this.ZM = paramZetm.Zt();
  }
  
  public List<Zxfr<?>> Za() {
    return List.of(new Zxfr(Utilities.class, this::lambda$constructorArguments$0));
  }
  
  public Class<LoggerCaptureHttpRequestResponse> ZF() {
    return LoggerCaptureHttpRequestResponse.class;
  }
  
  public String ZM() {
    return a;
  }
  
  private Utilities lambda$constructorArguments$0() {
    return this.ZM;
  }
  
  public static void ZW(int[] paramArrayOfint) {
    ZI = paramArrayOfint;
  }
  
  public static int[] Zo() {
    return ZI;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zo : ()[I
    //   3: ifnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic ZW : ([I)V
    //   12: bipush #48
    //   14: ldc '>D{\\tU'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zeqh.a : Ljava/lang/String;
    //   23: goto -> 166
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
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #75
    //   94: goto -> 124
    //   97: bipush #111
    //   99: goto -> 124
    //   102: bipush #67
    //   104: goto -> 124
    //   107: bipush #23
    //   109: goto -> 124
    //   112: bipush #35
    //   114: goto -> 124
    //   117: bipush #92
    //   119: goto -> 124
    //   122: bipush #22
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
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
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeqh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */