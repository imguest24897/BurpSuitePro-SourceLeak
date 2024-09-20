package burp;

public class Zt1w extends Zt3y {
  public static final Zlnb<Zl0l> Zt;
  
  public static final Zlnb<Zrb0> ZF;
  
  public static final Zlnb<Zz9s> ZK;
  
  private static final Zt1w Zw;
  
  private static Zbqc[] ZU;
  
  private Zt1w() {
    super((Zlnb<?>[])new Zlnb[] { Zt, ZF, ZK });
  }
  
  public static Zt1w Zs() {
    return Zw;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: aconst_null
    //   9: ldc '9[]I57[7II(2Q9[]I57[7\]"=P~JL9[]I57[7LI/=YvJL'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: invokestatic Zf : ([Lburp/Zbqc;)V
    //   21: bipush #17
    //   23: istore_2
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #101
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
    //   71: goto -> 219
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
    //   90: if_icmpgt -> 192
    //   93: dup2
    //   94: swap
    //   95: iload #6
    //   97: dup2_x1
    //   98: caload
    //   99: swap
    //   100: iload #6
    //   102: bipush #7
    //   104: irem
    //   105: tableswitch default -> 174, 0 -> 144, 1 -> 149, 2 -> 154, 3 -> 159, 4 -> 164, 5 -> 169
    //   144: bipush #59
    //   146: goto -> 176
    //   149: bipush #14
    //   151: goto -> 176
    //   154: bipush #80
    //   156: goto -> 176
    //   159: bipush #127
    //   161: goto -> 176
    //   164: bipush #74
    //   166: goto -> 176
    //   169: bipush #77
    //   171: goto -> 176
    //   174: bipush #36
    //   176: ixor
    //   177: ixor
    //   178: i2c
    //   179: castore
    //   180: iinc #6, 1
    //   183: dup
    //   184: ifne -> 192
    //   187: dup2
    //   188: dup_x1
    //   189: goto -> 97
    //   192: dup2_x1
    //   193: pop2
    //   194: dup_x2
    //   195: iload #6
    //   197: if_icmpgt -> 93
    //   200: pop
    //   201: new java/lang/String
    //   204: dup_x1
    //   205: swap
    //   206: invokespecial <init> : ([C)V
    //   209: invokevirtual intern : ()Ljava/lang/String;
    //   212: swap
    //   213: pop
    //   214: swap
    //   215: pop
    //   216: goto -> 43
    //   219: aload_0
    //   220: iconst_0
    //   221: aaload
    //   222: ldc burp/Zl0l
    //   224: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   227: putstatic burp/Zt1w.Zt : Lburp/Zlnb;
    //   230: aload_0
    //   231: iconst_1
    //   232: aaload
    //   233: ldc burp/Zrb0
    //   235: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   238: putstatic burp/Zt1w.ZF : Lburp/Zlnb;
    //   241: aload_0
    //   242: iconst_2
    //   243: aaload
    //   244: ldc burp/Zz9s
    //   246: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   249: putstatic burp/Zt1w.ZK : Lburp/Zlnb;
    //   252: new burp/Zt1w
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: putstatic burp/Zt1w.Zw : Lburp/Zt1w;
    //   262: return
  }
  
  public static void Zf(Zbqc[] paramArrayOfZbqc) {
    ZU = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZX() {
    return ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */