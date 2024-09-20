package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zzc;

public class Zsoi implements Zre8 {
  private static final String a;
  
  public static boolean ZZ(String paramString) {
    try {
      return Zl(paramString);
    } catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
      Zah.ZU(stringIndexOutOfBoundsException, paramString, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  private static boolean Zl(String paramString) {
    // Byte code:
    //   0: invokestatic ZM : ()Ljava/lang/String;
    //   3: astore_1
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: aload_0
    //   8: invokevirtual length : ()I
    //   11: if_icmpge -> 281
    //   14: aload_0
    //   15: bipush #38
    //   17: iload_3
    //   18: invokevirtual indexOf : (II)I
    //   21: dup
    //   22: istore_2
    //   23: iconst_m1
    //   24: if_icmpeq -> 281
    //   27: aload_0
    //   28: bipush #59
    //   30: iload_2
    //   31: iconst_1
    //   32: iadd
    //   33: invokevirtual indexOf : (II)I
    //   36: istore #4
    //   38: iload #4
    //   40: iconst_m1
    //   41: if_icmpne -> 50
    //   44: iconst_0
    //   45: ireturn
    //   46: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   49: athrow
    //   50: aload_0
    //   51: iload_2
    //   52: iconst_1
    //   53: iadd
    //   54: iload #4
    //   56: invokevirtual substring : (II)Ljava/lang/String;
    //   59: astore #5
    //   61: aload #5
    //   63: invokevirtual length : ()I
    //   66: iconst_3
    //   67: if_icmpge -> 78
    //   70: iload_2
    //   71: iconst_1
    //   72: iadd
    //   73: istore_3
    //   74: aload_1
    //   75: ifnonnull -> 6
    //   78: aload #5
    //   80: iconst_0
    //   81: invokevirtual charAt : (I)C
    //   84: bipush #35
    //   86: if_icmpne -> 247
    //   89: aload #5
    //   91: invokevirtual length : ()I
    //   94: iconst_4
    //   95: if_icmpeq -> 113
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   104: athrow
    //   105: iload_2
    //   106: iconst_1
    //   107: iadd
    //   108: istore_3
    //   109: aload_1
    //   110: ifnonnull -> 6
    //   113: aload #5
    //   115: iconst_1
    //   116: invokevirtual charAt : (I)C
    //   119: bipush #120
    //   121: if_icmpne -> 176
    //   124: aload #5
    //   126: iconst_2
    //   127: invokevirtual charAt : (I)C
    //   130: invokestatic Zv : (C)Z
    //   133: ifeq -> 168
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   142: athrow
    //   143: aload #5
    //   145: iconst_3
    //   146: invokevirtual charAt : (I)C
    //   149: invokestatic Zv : (C)Z
    //   152: ifeq -> 168
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   161: athrow
    //   162: iconst_1
    //   163: ireturn
    //   164: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   167: athrow
    //   168: iload_2
    //   169: iconst_1
    //   170: iadd
    //   171: istore_3
    //   172: aload_1
    //   173: ifnonnull -> 277
    //   176: aload #5
    //   178: iconst_1
    //   179: invokevirtual charAt : (I)C
    //   182: invokestatic isDigit : (C)Z
    //   185: ifeq -> 239
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   194: athrow
    //   195: aload #5
    //   197: iconst_2
    //   198: invokevirtual charAt : (I)C
    //   201: invokestatic isDigit : (C)Z
    //   204: ifeq -> 239
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   213: athrow
    //   214: aload #5
    //   216: iconst_3
    //   217: invokevirtual charAt : (I)C
    //   220: invokestatic isDigit : (C)Z
    //   223: ifeq -> 239
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   232: athrow
    //   233: iconst_1
    //   234: ireturn
    //   235: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   238: athrow
    //   239: iload_2
    //   240: iconst_1
    //   241: iadd
    //   242: istore_3
    //   243: aload_1
    //   244: ifnonnull -> 277
    //   247: getstatic net/portswigger/Zrzt.Z_ : Ljava/util/Map;
    //   250: aload #5
    //   252: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   257: ifeq -> 273
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   266: athrow
    //   267: iconst_1
    //   268: ireturn
    //   269: invokestatic a : (Ljava/lang/StringIndexOutOfBoundsException;)Ljava/lang/StringIndexOutOfBoundsException;
    //   272: athrow
    //   273: iload_2
    //   274: iconst_1
    //   275: iadd
    //   276: istore_3
    //   277: aload_1
    //   278: ifnonnull -> 6
    //   281: iconst_0
    //   282: ireturn
    // Exception table:
    //   from	to	target	type
    //   38	46	46	java/lang/StringIndexOutOfBoundsException
    //   78	98	101	java/lang/StringIndexOutOfBoundsException
    //   113	136	139	java/lang/StringIndexOutOfBoundsException
    //   124	155	158	java/lang/StringIndexOutOfBoundsException
    //   143	164	164	java/lang/StringIndexOutOfBoundsException
    //   172	188	191	java/lang/StringIndexOutOfBoundsException
    //   176	207	210	java/lang/StringIndexOutOfBoundsException
    //   195	226	229	java/lang/StringIndexOutOfBoundsException
    //   214	235	235	java/lang/StringIndexOutOfBoundsException
    //   243	260	263	java/lang/StringIndexOutOfBoundsException
    //   247	269	269	java/lang/StringIndexOutOfBoundsException
  }
  
  public String Zq() {
    return a;
  }
  
  public String ZM(String paramString) {
    return Zzc.ZB(paramString);
  }
  
  public String ZI(String paramString) {
    return Zzc.ZV(paramString);
  }
  
  private static StringIndexOutOfBoundsException a(StringIndexOutOfBoundsException paramStringIndexOutOfBoundsException) {
    return paramStringIndexOutOfBoundsException;
  }
  
  static {
    // Byte code:
    //   0: bipush #96
    //   2: ldc '[Pm\\b)>5~o'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsoi.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #42
    //   82: goto -> 112
    //   85: bipush #49
    //   87: goto -> 112
    //   90: bipush #49
    //   92: goto -> 112
    //   95: bipush #119
    //   97: goto -> 112
    //   100: bipush #16
    //   102: goto -> 112
    //   105: bipush #104
    //   107: goto -> 112
    //   110: bipush #6
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsoi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */