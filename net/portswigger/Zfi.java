package net.portswigger;

import burp.Zbqc;

public class Zfi implements Zd0 {
  public static final Zto<String, String> Zz;
  
  public static final Zto<String, String> ZO;
  
  public static final Zto<String, String> Zs;
  
  public Zb4<Zu0, Zu0> Zt(Zu0 paramZu0) {
    int i = Ztj.ZT();
    if (Zbqc.Zwu() == null)
      Ztj.ZW(++i); 
    return Zb4.Zn(Zu0.Zj(paramZu0.ZD, Zvw.Zf(paramZu0.ZK, new String[] { (String)Zz.Zq, (String)Zz.Zo, (String)ZO.Zq, (String)ZO.Zo, (String)Zs.Zq, (String)Zs.Zo }), paramZu0.Zr));
  }
  
  public Zb4<Zu0, Zat> Z_(Zat paramZat) {
    paramZat.ZT((Zto<String, String>[])new Zto[] { Zz, ZO, Zs });
    return Zb4.Zn(paramZat);
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'qo_&/gz\\r\!T"aLp6N( Z\\t2U5)|'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #8
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #40
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
    //   67: ldc '\\rAaho#3\-dm%8 j#>)\r). (@tSwk;<_idz('
    //   69: dup
    //   70: astore_3
    //   71: invokevirtual length : ()I
    //   74: istore #5
    //   76: bipush #6
    //   78: istore_2
    //   79: iconst_m1
    //   80: istore_1
    //   81: bipush #106
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
    //   145: if_icmpgt -> 248
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
    //   200: bipush #55
    //   202: goto -> 232
    //   205: bipush #89
    //   207: goto -> 232
    //   210: bipush #106
    //   212: goto -> 232
    //   215: bipush #20
    //   217: goto -> 232
    //   220: bipush #111
    //   222: goto -> 232
    //   225: bipush #100
    //   227: goto -> 232
    //   230: bipush #39
    //   232: ixor
    //   233: ixor
    //   234: i2c
    //   235: castore
    //   236: iinc #6, 1
    //   239: dup
    //   240: ifne -> 248
    //   243: dup2
    //   244: dup_x1
    //   245: goto -> 152
    //   248: dup2_x1
    //   249: pop2
    //   250: dup_x2
    //   251: iload #6
    //   253: if_icmpgt -> 148
    //   256: pop
    //   257: new java/lang/String
    //   260: dup_x1
    //   261: swap
    //   262: invokespecial <init> : ([C)V
    //   265: invokevirtual intern : ()Ljava/lang/String;
    //   268: swap
    //   269: pop
    //   270: swap
    //   271: tableswitch default -> 39, 0 -> 98
    //   288: aload_0
    //   289: iconst_1
    //   290: aaload
    //   291: aload_0
    //   292: iconst_4
    //   293: aaload
    //   294: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   297: putstatic net/portswigger/Zfi.Zz : Lnet/portswigger/Zto;
    //   300: aload_0
    //   301: iconst_3
    //   302: aaload
    //   303: aload_0
    //   304: iconst_0
    //   305: aaload
    //   306: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   309: putstatic net/portswigger/Zfi.ZO : Lnet/portswigger/Zto;
    //   312: aload_0
    //   313: iconst_2
    //   314: aaload
    //   315: ldc '0'
    //   317: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   320: putstatic net/portswigger/Zfi.Zs : Lnet/portswigger/Zto;
    //   323: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zfi.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */