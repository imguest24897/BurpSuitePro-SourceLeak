package burp;

import java.util.Collection;

public class Zt1_ extends Zt3y {
  public static final Zlnb<Zrxu> ZB;
  
  public static final Zlnb<Zgp5> Zz;
  
  public static final Zlnb<Zgp5> ZW;
  
  private static final Zt1_ ZL;
  
  private Zt1_() {
    super((Zlnb<?>[])new Zlnb[] { ZB, Zz, ZW });
  }
  
  public static Zt1_ Ze() {
    return ZL;
  }
  
  public static Zxr8<Zrxu> Zv() {
    return Ze(null);
  }
  
  public static Zxr8<Zrxu> Ze(Zrdb paramZrdb) {
    return new Zxr8<>(ZB, new Zrxu(paramZrdb));
  }
  
  public static Zxr8<Zgp5> ZX(Collection<Zrdb> paramCollection) {
    return new Zxr8<>(Zz, new Zgp5(paramCollection));
  }
  
  public static Zxr8<Zgp5> ZP(Collection<Zrdb> paramCollection) {
    return new Zxr8<>(ZW, new Zgp5(paramCollection));
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'ny{QEa rzlETw\\rlsUEa rzlETw\\fhlsURp rzlET'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #13
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #11
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
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
    //   67: goto -> 214
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 187
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 169, 0 -> 140, 1 -> 145, 2 -> 149, 3 -> 154, 4 -> 159, 5 -> 164
    //   140: bipush #16
    //   142: goto -> 171
    //   145: iconst_2
    //   146: goto -> 171
    //   149: bipush #20
    //   151: goto -> 171
    //   154: bipush #59
    //   156: goto -> 171
    //   159: bipush #58
    //   161: goto -> 171
    //   164: bipush #15
    //   166: goto -> 171
    //   169: bipush #38
    //   171: ixor
    //   172: ixor
    //   173: i2c
    //   174: castore
    //   175: iinc #6, 1
    //   178: dup
    //   179: ifne -> 187
    //   182: dup2
    //   183: dup_x1
    //   184: goto -> 93
    //   187: dup2_x1
    //   188: pop2
    //   189: dup_x2
    //   190: iload #6
    //   192: if_icmpgt -> 89
    //   195: pop
    //   196: new java/lang/String
    //   199: dup_x1
    //   200: swap
    //   201: invokespecial <init> : ([C)V
    //   204: invokevirtual intern : ()Ljava/lang/String;
    //   207: swap
    //   208: pop
    //   209: swap
    //   210: pop
    //   211: goto -> 39
    //   214: aload_0
    //   215: iconst_2
    //   216: aaload
    //   217: ldc burp/Zrxu
    //   219: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   222: putstatic burp/Zt1_.ZB : Lburp/Zlnb;
    //   225: aload_0
    //   226: iconst_0
    //   227: aaload
    //   228: ldc burp/Zgp5
    //   230: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   233: putstatic burp/Zt1_.Zz : Lburp/Zlnb;
    //   236: aload_0
    //   237: iconst_1
    //   238: aaload
    //   239: ldc burp/Zgp5
    //   241: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   244: putstatic burp/Zt1_.ZW : Lburp/Zlnb;
    //   247: new burp/Zt1_
    //   250: dup
    //   251: invokespecial <init> : ()V
    //   254: putstatic burp/Zt1_.ZL : Lburp/Zt1_;
    //   257: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt1_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */