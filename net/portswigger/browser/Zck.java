package net.portswigger.browser;

import burp.Zlnb;
import burp.Zt3y;
import burp.Zxr8;

public class Zck extends Zt3y {
  public static final Zlnb<Zez> ZD;
  
  public static final Zlnb<Zcf> Zf;
  
  public static final Zlnb<Zcz> Zj;
  
  public static final Zlnb<Void> Zk;
  
  public static final Zxr8<Void> ZF;
  
  private static final Zck Zt;
  
  private static String Zb;
  
  private Zck() {
    super(new Zlnb[] { ZD, Zf, Zj, Zk });
  }
  
  public static Zck Zu() {
    return Zt;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: aconst_null
    //   6: iconst_0
    //   7: istore #4
    //   9: invokestatic Ze : (Ljava/lang/String;)V
    //   12: ldc '+LYTgb>Y_Ra~W;+LYTgb-HF\tsV'
    //   14: dup
    //   15: astore_3
    //   16: invokevirtual length : ()I
    //   19: istore #5
    //   21: bipush #15
    //   23: istore_2
    //   24: iconst_m1
    //   25: istore_1
    //   26: bipush #36
    //   28: iinc #1, 1
    //   31: aload_3
    //   32: iload_1
    //   33: dup
    //   34: iload_2
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 133
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
    //   71: ldc 'x-:xC2xp$1h$!\\\t)0'
    //   73: dup
    //   74: astore_3
    //   75: invokevirtual length : ()I
    //   78: istore #5
    //   80: bipush #20
    //   82: istore_2
    //   83: iconst_m1
    //   84: istore_1
    //   85: bipush #103
    //   87: iinc #1, 1
    //   90: aload_3
    //   91: iload_1
    //   92: dup
    //   93: iload_2
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 133
    //   102: aload_0
    //   103: swap
    //   104: iload #4
    //   106: iinc #4, 1
    //   109: swap
    //   110: aastore
    //   111: iload_1
    //   112: iload_2
    //   113: iadd
    //   114: dup
    //   115: istore_1
    //   116: iload #5
    //   118: if_icmpge -> 130
    //   121: aload_3
    //   122: iload_1
    //   123: invokevirtual charAt : (I)C
    //   126: istore_2
    //   127: goto -> 85
    //   130: goto -> 292
    //   133: dup_x2
    //   134: pop
    //   135: invokevirtual toCharArray : ()[C
    //   138: dup_x1
    //   139: arraylength
    //   140: dup_x2
    //   141: pop
    //   142: iconst_0
    //   143: istore #6
    //   145: dup2_x1
    //   146: pop2
    //   147: dup_x2
    //   148: iconst_1
    //   149: if_icmpgt -> 252
    //   152: dup2
    //   153: swap
    //   154: iload #6
    //   156: dup2_x1
    //   157: caload
    //   158: swap
    //   159: iload #6
    //   161: bipush #7
    //   163: irem
    //   164: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #123
    //   206: goto -> 236
    //   209: bipush #9
    //   211: goto -> 236
    //   214: bipush #15
    //   216: goto -> 236
    //   219: bipush #23
    //   221: goto -> 236
    //   224: bipush #38
    //   226: goto -> 236
    //   229: bipush #50
    //   231: goto -> 236
    //   234: bipush #22
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 156
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 152
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 43, 0 -> 102
    //   292: aload_0
    //   293: iconst_0
    //   294: aaload
    //   295: ldc net/portswigger/browser/Zez
    //   297: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   300: putstatic net/portswigger/browser/Zck.ZD : Lburp/Zlnb;
    //   303: aload_0
    //   304: iconst_1
    //   305: aaload
    //   306: ldc net/portswigger/browser/Zcf
    //   308: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   311: putstatic net/portswigger/browser/Zck.Zf : Lburp/Zlnb;
    //   314: aload_0
    //   315: iconst_3
    //   316: aaload
    //   317: ldc net/portswigger/browser/Zcz
    //   319: invokestatic Zo : (Ljava/lang/String;Ljava/lang/Class;)Lburp/Zlnb;
    //   322: putstatic net/portswigger/browser/Zck.Zj : Lburp/Zlnb;
    //   325: aload_0
    //   326: iconst_2
    //   327: aaload
    //   328: invokestatic ZW : (Ljava/lang/String;)Lburp/Zlnb;
    //   331: putstatic net/portswigger/browser/Zck.Zk : Lburp/Zlnb;
    //   334: new burp/Zxr8
    //   337: dup
    //   338: getstatic net/portswigger/browser/Zck.Zk : Lburp/Zlnb;
    //   341: invokespecial <init> : (Lburp/Zlnb;)V
    //   344: putstatic net/portswigger/browser/Zck.ZF : Lburp/Zxr8;
    //   347: new net/portswigger/browser/Zck
    //   350: dup
    //   351: invokespecial <init> : ()V
    //   354: putstatic net/portswigger/browser/Zck.Zt : Lnet/portswigger/browser/Zck;
    //   357: return
  }
  
  public static void Ze(String paramString) {
    Zb = paramString;
  }
  
  public static String ZL() {
    return Zb;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zck.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */