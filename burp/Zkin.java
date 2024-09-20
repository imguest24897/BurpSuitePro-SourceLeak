package burp;

import java.util.Objects;
import java.util.Set;
import net.portswigger.Zsy;

class Zkin extends Zkud {
  private static final Set<String> Zj;
  
  Zkin(Zsy paramZsy) {
    super(paramZsy);
  }
  
  public boolean ZZ(Ze7n paramZe7n) {
    return (paramZe7n.ZY() == Zmtz.NUMBER || super.ZZ(paramZe7n));
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    Objects.requireNonNull(paramString);
    return (paramZxaq == Zxaq.NUMBER || (ZT(paramZxaq) && Zj.stream().anyMatch(paramString::contains)));
  }
  
  protected String ZX(Zmlc paramZmlc) {
    int i = ((Integer)paramZmlc.ZC().orElse(Integer.valueOf(0))).intValue();
    return ZT(i, ((Integer)paramZmlc.Zx().orElse(Integer.valueOf(Math.max(999999, i)))).intValue());
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'yc\\nc\\n$'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_3
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #69
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 127
    //   38: aload_0
    //   39: swap
    //   40: iload #4
    //   42: iinc #4, 1
    //   45: swap
    //   46: aastore
    //   47: iload_1
    //   48: iload_2
    //   49: iadd
    //   50: dup
    //   51: istore_1
    //   52: iload #5
    //   54: if_icmpge -> 66
    //   57: aload_3
    //   58: iload_1
    //   59: invokevirtual charAt : (I)C
    //   62: istore_2
    //   63: goto -> 21
    //   66: ldc '!-+&MpL'
    //   68: dup
    //   69: astore_3
    //   70: invokevirtual length : ()I
    //   73: istore #5
    //   75: iconst_2
    //   76: istore_2
    //   77: iconst_m1
    //   78: istore_1
    //   79: bipush #26
    //   81: iinc #1, 1
    //   84: aload_3
    //   85: iload_1
    //   86: dup
    //   87: iload_2
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 127
    //   96: aload_0
    //   97: swap
    //   98: iload #4
    //   100: iinc #4, 1
    //   103: swap
    //   104: aastore
    //   105: iload_1
    //   106: iload_2
    //   107: iadd
    //   108: dup
    //   109: istore_1
    //   110: iload #5
    //   112: if_icmpge -> 124
    //   115: aload_3
    //   116: iload_1
    //   117: invokevirtual charAt : (I)C
    //   120: istore_2
    //   121: goto -> 79
    //   124: goto -> 284
    //   127: dup_x2
    //   128: pop
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup_x1
    //   133: arraylength
    //   134: dup_x2
    //   135: pop
    //   136: iconst_0
    //   137: istore #6
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iconst_1
    //   143: if_icmpgt -> 243
    //   146: dup2
    //   147: swap
    //   148: iload #6
    //   150: dup2_x1
    //   151: caload
    //   152: swap
    //   153: iload #6
    //   155: bipush #7
    //   157: irem
    //   158: tableswitch default -> 225, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 215, 5 -> 220
    //   196: bipush #82
    //   198: goto -> 227
    //   201: bipush #83
    //   203: goto -> 227
    //   206: bipush #34
    //   208: goto -> 227
    //   211: iconst_4
    //   212: goto -> 227
    //   215: bipush #34
    //   217: goto -> 227
    //   220: bipush #59
    //   222: goto -> 227
    //   225: bipush #108
    //   227: ixor
    //   228: ixor
    //   229: i2c
    //   230: castore
    //   231: iinc #6, 1
    //   234: dup
    //   235: ifne -> 243
    //   238: dup2
    //   239: dup_x1
    //   240: goto -> 150
    //   243: dup2_x1
    //   244: pop2
    //   245: dup_x2
    //   246: iload #6
    //   248: if_icmpgt -> 146
    //   251: pop
    //   252: new java/lang/String
    //   255: dup_x1
    //   256: swap
    //   257: invokespecial <init> : ([C)V
    //   260: invokevirtual intern : ()Ljava/lang/String;
    //   263: swap
    //   264: pop
    //   265: swap
    //   266: tableswitch default -> 38, 0 -> 96
    //   284: iconst_4
    //   285: anewarray java/lang/String
    //   288: dup
    //   289: iconst_0
    //   290: aload_0
    //   291: iconst_0
    //   292: aaload
    //   293: aastore
    //   294: dup
    //   295: iconst_1
    //   296: aload_0
    //   297: iconst_3
    //   298: aaload
    //   299: aastore
    //   300: dup
    //   301: iconst_2
    //   302: aload_0
    //   303: iconst_1
    //   304: aaload
    //   305: aastore
    //   306: dup
    //   307: iconst_3
    //   308: aload_0
    //   309: iconst_2
    //   310: aaload
    //   311: aastore
    //   312: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   315: putstatic burp/Zkin.Zj : Ljava/util/Set;
    //   318: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */