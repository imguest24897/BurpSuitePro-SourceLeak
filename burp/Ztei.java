package burp;

import net.portswigger.Zm2;

public class Ztei {
  private static String[] ZW;
  
  private static final String a;
  
  public static void Zj(Zzvh paramZzvh, Zeew paramZeew) {
    if (paramZzvh == null || paramZeew == null)
      return; 
    ZD(paramZzvh.Zt(), paramZeew.toolName);
  }
  
  private static void ZD(String paramString1, String paramString2) {
    String str = String.format(a, new Object[] { paramString1, paramString2 });
    Zm2.ZB(Zec3.SEND_REQUEST_RESPONSE_TO_TOOL, str);
  }
  
  public static void ZF(String[] paramArrayOfString) {
    ZW = paramArrayOfString;
  }
  
  public static String[] Z_() {
    return ZW;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Z_ : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_4
    //   7: anewarray java/lang/String
    //   10: invokestatic ZF : ([Ljava/lang/String;)V
    //   13: bipush #97
    //   15: ldc '>,Obtz<D6+m\\b:Q\\n,uzM/S\\n/&:i\\f[b#l'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Ztei.a : Ljava/lang/String;
    //   24: goto -> 165
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
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 111, 5 -> 116
    //   92: bipush #12
    //   94: goto -> 123
    //   97: bipush #40
    //   99: goto -> 123
    //   102: bipush #64
    //   104: goto -> 123
    //   107: iconst_4
    //   108: goto -> 123
    //   111: bipush #35
    //   113: goto -> 123
    //   116: bipush #103
    //   118: goto -> 123
    //   121: bipush #126
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
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
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztei.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */