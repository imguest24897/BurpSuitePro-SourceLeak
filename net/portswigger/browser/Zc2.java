package net.portswigger.browser;

import burp.Zbqc;
import burp.Zlnb;
import burp.Zt3y;

public class Zc2 extends Zt3y {
  public static final Zlnb<Zct> ZR;
  
  public static final Zlnb<Zeg> Zc;
  
  private static final Zc2 Zh;
  
  private static Zbqc[] ZO;
  
  private Zc2() {
    super(new Zlnb[] { ZR, Zc });
  }
  
  public static Zc2 Zd() {
    return Zh;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: aconst_null
    //   9: ldc '@8YNp1JR(_s-H^>Yp1MV)NO@8YNp1JR(_s6GZ(CNq'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #25
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: invokestatic ZY : ([Lburp/Zbqc;)V
    //   26: bipush #103
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
    //   144: bipush #84
    //   146: goto -> 176
    //   149: bipush #60
    //   151: goto -> 176
    //   154: bipush #76
    //   156: goto -> 176
    //   159: bipush #76
    //   161: goto -> 176
    //   164: bipush #114
    //   166: goto -> 176
    //   169: bipush #56
    //   171: goto -> 176
    //   174: bipush #78
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
    //   222: ldc net/portswigger/browser/Zct
    //   224: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   227: putstatic net/portswigger/browser/Zc2.ZR : Lburp/Zlnb;
    //   230: aload_0
    //   231: iconst_1
    //   232: aaload
    //   233: ldc net/portswigger/browser/Zeg
    //   235: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   238: putstatic net/portswigger/browser/Zc2.Zc : Lburp/Zlnb;
    //   241: new net/portswigger/browser/Zc2
    //   244: dup
    //   245: invokespecial <init> : ()V
    //   248: putstatic net/portswigger/browser/Zc2.Zh : Lnet/portswigger/browser/Zc2;
    //   251: return
  }
  
  public static void ZY(Zbqc[] paramArrayOfZbqc) {
    ZO = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZT() {
    return ZO;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zc2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */