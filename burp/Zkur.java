package burp;

import java.util.Set;
import net.portswigger.Zsy;

class Zkur extends Zkud {
  private static final Set<String> Zd;
  
  Zkur(Zsy paramZsy) {
    super(paramZsy);
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return Zd.contains(paramString);
  }
  
  protected String ZX(Zmlc paramZmlc) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZC : ()Ljava/util/Optional;
    //   4: bipush #21
    //   6: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast java/lang/Integer
    //   15: invokevirtual intValue : ()I
    //   18: istore_3
    //   19: invokestatic Zd : ()[Lburp/Zbqc;
    //   22: aload_1
    //   23: invokevirtual Zx : ()Ljava/util/Optional;
    //   26: bipush #59
    //   28: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   31: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   34: checkcast java/lang/Integer
    //   37: invokevirtual intValue : ()I
    //   40: istore #4
    //   42: astore_2
    //   43: iload_3
    //   44: iload #4
    //   46: if_icmple -> 108
    //   49: iload_3
    //   50: bipush #21
    //   52: if_icmpne -> 75
    //   55: iload #4
    //   57: bipush #38
    //   59: isub
    //   60: istore_3
    //   61: iload_3
    //   62: ifge -> 69
    //   65: iconst_1
    //   66: goto -> 70
    //   69: iload_3
    //   70: istore_3
    //   71: aload_2
    //   72: ifnonnull -> 108
    //   75: iload #4
    //   77: bipush #59
    //   79: if_icmpne -> 101
    //   82: iload_3
    //   83: bipush #38
    //   85: iadd
    //   86: istore #4
    //   88: iload #4
    //   90: bipush #99
    //   92: invokestatic min : (II)I
    //   95: istore #4
    //   97: aload_2
    //   98: ifnonnull -> 108
    //   101: bipush #59
    //   103: istore_3
    //   104: bipush #59
    //   106: istore #4
    //   108: aload_0
    //   109: iload_3
    //   110: iload #4
    //   112: invokevirtual ZT : (II)Ljava/lang/String;
    //   115: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc '\\t.' ,1'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: iconst_3
    //   18: istore_2
    //   19: iconst_m1
    //   20: istore_1
    //   21: bipush #101
    //   23: iinc #1, 1
    //   26: aload_3
    //   27: iload_1
    //   28: dup
    //   29: iload_2
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 128
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
    //   66: ldc ';:=G<7\\b-*'
    //   68: dup
    //   69: astore_3
    //   70: invokevirtual length : ()I
    //   73: istore #5
    //   75: bipush #9
    //   77: istore_2
    //   78: iconst_m1
    //   79: istore_1
    //   80: bipush #87
    //   82: iinc #1, 1
    //   85: aload_3
    //   86: iload_1
    //   87: dup
    //   88: iload_2
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 128
    //   97: aload_0
    //   98: swap
    //   99: iload #4
    //   101: iinc #4, 1
    //   104: swap
    //   105: aastore
    //   106: iload_1
    //   107: iload_2
    //   108: iadd
    //   109: dup
    //   110: istore_1
    //   111: iload #5
    //   113: if_icmpge -> 125
    //   116: aload_3
    //   117: iload_1
    //   118: invokevirtual charAt : (I)C
    //   121: istore_2
    //   122: goto -> 80
    //   125: goto -> 284
    //   128: dup_x2
    //   129: pop
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup_x1
    //   134: arraylength
    //   135: dup_x2
    //   136: pop
    //   137: iconst_0
    //   138: istore #6
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iconst_1
    //   144: if_icmpgt -> 244
    //   147: dup2
    //   148: swap
    //   149: iload #6
    //   151: dup2_x1
    //   152: caload
    //   153: swap
    //   154: iload #6
    //   156: bipush #7
    //   158: irem
    //   159: tableswitch default -> 226, 0 -> 196, 1 -> 201, 2 -> 206, 3 -> 211, 4 -> 216, 5 -> 221
    //   196: bipush #13
    //   198: goto -> 228
    //   201: bipush #44
    //   203: goto -> 228
    //   206: bipush #39
    //   208: goto -> 228
    //   211: bipush #27
    //   213: goto -> 228
    //   216: bipush #51
    //   218: goto -> 228
    //   221: bipush #24
    //   223: goto -> 228
    //   226: bipush #121
    //   228: ixor
    //   229: ixor
    //   230: i2c
    //   231: castore
    //   232: iinc #6, 1
    //   235: dup
    //   236: ifne -> 244
    //   239: dup2
    //   240: dup_x1
    //   241: goto -> 151
    //   244: dup2_x1
    //   245: pop2
    //   246: dup_x2
    //   247: iload #6
    //   249: if_icmpgt -> 147
    //   252: pop
    //   253: new java/lang/String
    //   256: dup_x1
    //   257: swap
    //   258: invokespecial <init> : ([C)V
    //   261: invokevirtual intern : ()Ljava/lang/String;
    //   264: swap
    //   265: pop
    //   266: swap
    //   267: tableswitch default -> 38, 0 -> 97
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
    //   297: iconst_2
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
    //   309: iconst_3
    //   310: aaload
    //   311: aastore
    //   312: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   315: putstatic burp/Zkur.Zd : Ljava/util/Set;
    //   318: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkur.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */