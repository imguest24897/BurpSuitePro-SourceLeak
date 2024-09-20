package burp;

import java.util.Set;
import net.portswigger.Zsy;

class Zki_ extends Zkud {
  private static final Set<String> Za;
  
  Zki_(Zsy paramZsy) {
    super(paramZsy);
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return Za.contains(paramString);
  }
  
  protected String ZX(Zmlc paramZmlc) {
    return this.ZS.Zi().ZH().ZK(10);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'tm@OCnpbFQ\\btm@OCnp'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #11
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #31
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 129
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: ldc 'CZwxt#YGUqff)Y\\nCZwxt#YGUk'
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #14
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #40
    //   83: iinc #1, 1
    //   86: aload_3
    //   87: iload_1
    //   88: dup
    //   89: iload_2
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 129
    //   98: aload_0
    //   99: swap
    //   100: iload #4
    //   102: iinc #4, 1
    //   105: swap
    //   106: aastore
    //   107: iload_1
    //   108: iload_2
    //   109: iadd
    //   110: dup
    //   111: istore_1
    //   112: iload #5
    //   114: if_icmpge -> 126
    //   117: aload_3
    //   118: iload_1
    //   119: invokevirtual charAt : (I)C
    //   122: istore_2
    //   123: goto -> 81
    //   126: goto -> 288
    //   129: dup_x2
    //   130: pop
    //   131: invokevirtual toCharArray : ()[C
    //   134: dup_x1
    //   135: arraylength
    //   136: dup_x2
    //   137: pop
    //   138: iconst_0
    //   139: istore #6
    //   141: dup2_x1
    //   142: pop2
    //   143: dup_x2
    //   144: iconst_1
    //   145: if_icmpgt -> 247
    //   148: dup2
    //   149: swap
    //   150: iload #6
    //   152: dup2_x1
    //   153: caload
    //   154: swap
    //   155: iload #6
    //   157: bipush #7
    //   159: irem
    //   160: tableswitch default -> 230, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #27
    //   202: goto -> 231
    //   205: bipush #19
    //   207: goto -> 231
    //   210: bipush #44
    //   212: goto -> 231
    //   215: bipush #35
    //   217: goto -> 231
    //   220: bipush #44
    //   222: goto -> 231
    //   225: bipush #100
    //   227: goto -> 231
    //   230: iconst_3
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 152
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 148
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 39, 0 -> 98
    //   288: iconst_4
    //   289: anewarray java/lang/String
    //   292: dup
    //   293: iconst_0
    //   294: aload_0
    //   295: iconst_1
    //   296: aaload
    //   297: aastore
    //   298: dup
    //   299: iconst_1
    //   300: aload_0
    //   301: iconst_2
    //   302: aaload
    //   303: aastore
    //   304: dup
    //   305: iconst_2
    //   306: aload_0
    //   307: iconst_0
    //   308: aaload
    //   309: aastore
    //   310: dup
    //   311: iconst_3
    //   312: aload_0
    //   313: iconst_3
    //   314: aaload
    //   315: aastore
    //   316: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   319: putstatic burp/Zki_.Za : Ljava/util/Set;
    //   322: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zki_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */