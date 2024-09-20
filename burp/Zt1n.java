package burp;

public class Zt1n extends Zt3y {
  public static final Zlnb<Zgg8> ZR;
  
  public static final Zlnb<Void> ZY;
  
  private static final Zt1n Zp;
  
  private static String[] ZJ;
  
  private Zt1n() {
    super((Zlnb<?>[])new Zlnb[] { ZR, ZY });
  }
  
  public static Zt1n ZN() {
    return Zp;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'Mi-4@Vk,%IC\\rMi-4VWe-(_T'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: aconst_null
    //   18: bipush #13
    //   20: istore_2
    //   21: invokestatic ZJ : ([Ljava/lang/String;)V
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #95
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 74
    //   43: aload_0
    //   44: swap
    //   45: iload #4
    //   47: iinc #4, 1
    //   50: swap
    //   51: aastore
    //   52: iload_1
    //   53: iload_2
    //   54: iadd
    //   55: dup
    //   56: istore_1
    //   57: iload #5
    //   59: if_icmpge -> 71
    //   62: aload_3
    //   63: iload_1
    //   64: invokevirtual charAt : (I)C
    //   67: istore_2
    //   68: goto -> 26
    //   71: goto -> 218
    //   74: dup_x2
    //   75: pop
    //   76: invokevirtual toCharArray : ()[C
    //   79: dup_x1
    //   80: arraylength
    //   81: dup_x2
    //   82: pop
    //   83: iconst_0
    //   84: istore #6
    //   86: dup2_x1
    //   87: pop2
    //   88: dup_x2
    //   89: iconst_1
    //   90: if_icmpgt -> 191
    //   93: dup2
    //   94: swap
    //   95: iload #6
    //   97: dup2_x1
    //   98: caload
    //   99: swap
    //   100: iload #6
    //   102: bipush #7
    //   104: irem
    //   105: tableswitch default -> 173, 0 -> 144, 1 -> 149, 2 -> 154, 3 -> 158, 4 -> 163, 5 -> 168
    //   144: bipush #102
    //   146: goto -> 175
    //   149: bipush #83
    //   151: goto -> 175
    //   154: iconst_1
    //   155: goto -> 175
    //   158: bipush #31
    //   160: goto -> 175
    //   163: bipush #101
    //   165: goto -> 175
    //   168: bipush #111
    //   170: goto -> 175
    //   173: bipush #41
    //   175: ixor
    //   176: ixor
    //   177: i2c
    //   178: castore
    //   179: iinc #6, 1
    //   182: dup
    //   183: ifne -> 191
    //   186: dup2
    //   187: dup_x1
    //   188: goto -> 97
    //   191: dup2_x1
    //   192: pop2
    //   193: dup_x2
    //   194: iload #6
    //   196: if_icmpgt -> 93
    //   199: pop
    //   200: new java/lang/String
    //   203: dup_x1
    //   204: swap
    //   205: invokespecial <init> : ([C)V
    //   208: invokevirtual intern : ()Ljava/lang/String;
    //   211: swap
    //   212: pop
    //   213: swap
    //   214: pop
    //   215: goto -> 43
    //   218: aload_0
    //   219: iconst_0
    //   220: aaload
    //   221: ldc burp/Zgg8
    //   223: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   226: putstatic burp/Zt1n.ZR : Lburp/Zlnb;
    //   229: aload_0
    //   230: iconst_1
    //   231: aaload
    //   232: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   235: putstatic burp/Zt1n.ZY : Lburp/Zlnb;
    //   238: new burp/Zt1n
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: putstatic burp/Zt1n.Zp : Lburp/Zt1n;
    //   248: return
  }
  
  public static void ZJ(String[] paramArrayOfString) {
    ZJ = paramArrayOfString;
  }
  
  public static String[] ZO() {
    return ZJ;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */