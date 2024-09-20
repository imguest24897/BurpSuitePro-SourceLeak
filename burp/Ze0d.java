package burp;

import net.portswigger.Zlh;

public class Ze0d extends Exception {
  private static String[] ZK;
  
  private static final String a;
  
  public Ze0d(Zlh paramZlh) {
    super(Zrgs.DETAILED_JSON_PARSE_ERROR.ZN(new Object[] { String.format(a, new Object[] { paramZlh.Zz, paramZlh.getMessage() }) }), (Throwable)paramZlh);
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public Ze0d(Zrgs paramZrgs) {
    super(paramZrgs.ZN(new Object[0]));
  }
  
  public static void Ze(String[] paramArrayOfString) {
    ZK = paramArrayOfString;
  }
  
  public static String[] ZU() {
    return ZK;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZU : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic Ze : ([Ljava/lang/String;)V
    //   13: bipush #117
    //   15: ldc '6HB(9N '
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Ze0d.a : Ljava/lang/String;
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
    //   92: bipush #102
    //   94: goto -> 124
    //   97: bipush #78
    //   99: goto -> 124
    //   102: bipush #23
    //   104: goto -> 124
    //   107: bipush #112
    //   109: goto -> 124
    //   112: bipush #108
    //   114: goto -> 124
    //   117: bipush #30
    //   119: goto -> 124
    //   122: bipush #38
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0d.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */