package net.portswigger;

import burp.Zbqc;

public class Znb implements Zd0 {
  public static final Zto<String, String> Zp;
  
  public static final Zto<String, String> ZD;
  
  public static final Zto<String, String> ZG;
  
  public static final Zto<String, String> ZC;
  
  public Zb4<Zu0, Zu0> Zt(Zu0 paramZu0) {
    int i = Ztj.Zn();
    if (i == 0)
      Zbqc.Zr(new Zbqc[1]); 
    return Zb4.Zn(Zu0.Zj(paramZu0.ZD, Zvw.Zf(paramZu0.ZK, new String[] { (String)Zp.Zq, (String)Zp.Zo, (String)ZD.Zq, (String)ZD.Zo, (String)ZG.Zq, (String)ZG.Zo, (String)ZC.Zq, (String)ZC.Zo }), paramZu0.Zr));
  }
  
  public Zb4<Zu0, Zat> Z_(Zat paramZat) {
    paramZat.ZT((Zto<String, String>[])new Zto[] { Zp, ZD, ZG, ZC });
    return Zb4.Zn(paramZat);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: iconst_0
    //   7: istore #4
    //   9: ldc '#Kn[E,5z%ULA,vAxu\^'(#PRf)a|dVE 4`#NsT\,vAxu\^'(Ï?kn`@]=v}zb:>bn&:8|aqA:)m(&FT%=)3!\\.v}zb:>bn&:/wddB;8./rP]/|5(gGP$>#{sVn(kdg\\ni8afoPR=v}zb:>bn&F:a!'mZR(7fgrAzh=;:W&5z%rGRi|}mmSr{cme\Pd(|k!B,7h/:^+1kkuB;8./oZ_,|5(b]X%?#{sVn(kdg+7aj;afuP_=v]mb@C /w%QZ] 8wKFX'
    //   11: dup
    //   12: astore_3
    //   13: invokevirtual length : ()I
    //   16: istore #5
    //   18: bipush #22
    //   20: istore_2
    //   21: iconst_m1
    //   22: istore_1
    //   23: bipush #50
    //   25: iinc #1, 1
    //   28: aload_3
    //   29: iload_1
    //   30: dup
    //   31: iload_2
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 130
    //   40: aload_0
    //   41: swap
    //   42: iload #4
    //   44: iinc #4, 1
    //   47: swap
    //   48: aastore
    //   49: iload_1
    //   50: iload_2
    //   51: iadd
    //   52: dup
    //   53: istore_1
    //   54: iload #5
    //   56: if_icmpge -> 68
    //   59: aload_3
    //   60: iload_1
    //   61: invokevirtual charAt : (I)C
    //   64: istore_2
    //   65: goto -> 23
    //   68: ldc 'I +S\\rIT&)P*&'
    //   70: dup
    //   71: astore_3
    //   72: invokevirtual length : ()I
    //   75: istore #5
    //   77: bipush #7
    //   79: istore_2
    //   80: iconst_m1
    //   81: istore_1
    //   82: bipush #78
    //   84: iinc #1, 1
    //   87: aload_3
    //   88: iload_1
    //   89: dup
    //   90: iload_2
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 130
    //   99: aload_0
    //   100: swap
    //   101: iload #4
    //   103: iinc #4, 1
    //   106: swap
    //   107: aastore
    //   108: iload_1
    //   109: iload_2
    //   110: iadd
    //   111: dup
    //   112: istore_1
    //   113: iload #5
    //   115: if_icmpge -> 127
    //   118: aload_3
    //   119: iload_1
    //   120: invokevirtual charAt : (I)C
    //   123: istore_2
    //   124: goto -> 82
    //   127: goto -> 288
    //   130: dup_x2
    //   131: pop
    //   132: invokevirtual toCharArray : ()[C
    //   135: dup_x1
    //   136: arraylength
    //   137: dup_x2
    //   138: pop
    //   139: iconst_0
    //   140: istore #6
    //   142: dup2_x1
    //   143: pop2
    //   144: dup_x2
    //   145: iconst_1
    //   146: if_icmpgt -> 247
    //   149: dup2
    //   150: swap
    //   151: iload #6
    //   153: dup2_x1
    //   154: caload
    //   155: swap
    //   156: iload #6
    //   158: bipush #7
    //   160: irem
    //   161: tableswitch default -> 229, 0 -> 200, 1 -> 205, 2 -> 210, 3 -> 215, 4 -> 220, 5 -> 225
    //   200: bipush #105
    //   202: goto -> 231
    //   205: bipush #60
    //   207: goto -> 231
    //   210: bipush #58
    //   212: goto -> 231
    //   215: bipush #51
    //   217: goto -> 231
    //   220: bipush #7
    //   222: goto -> 231
    //   225: iconst_3
    //   226: goto -> 231
    //   229: bipush #123
    //   231: ixor
    //   232: ixor
    //   233: i2c
    //   234: castore
    //   235: iinc #6, 1
    //   238: dup
    //   239: ifne -> 247
    //   242: dup2
    //   243: dup_x1
    //   244: goto -> 153
    //   247: dup2_x1
    //   248: pop2
    //   249: dup_x2
    //   250: iload #6
    //   252: if_icmpgt -> 149
    //   255: pop
    //   256: new java/lang/String
    //   259: dup_x1
    //   260: swap
    //   261: invokespecial <init> : ([C)V
    //   264: invokevirtual intern : ()Ljava/lang/String;
    //   267: swap
    //   268: pop
    //   269: swap
    //   270: tableswitch default -> 40, 0 -> 99
    //   288: aload_0
    //   289: iconst_2
    //   290: aaload
    //   291: aload_0
    //   292: iconst_5
    //   293: aaload
    //   294: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   297: putstatic net/portswigger/Znb.Zp : Lnet/portswigger/Zto;
    //   300: aload_0
    //   301: iconst_4
    //   302: aaload
    //   303: aload_0
    //   304: iconst_3
    //   305: aaload
    //   306: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   309: putstatic net/portswigger/Znb.ZD : Lnet/portswigger/Zto;
    //   312: aload_0
    //   313: iconst_1
    //   314: aaload
    //   315: aload_0
    //   316: bipush #7
    //   318: aaload
    //   319: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   322: putstatic net/portswigger/Znb.ZG : Lnet/portswigger/Zto;
    //   325: aload_0
    //   326: iconst_0
    //   327: aaload
    //   328: aload_0
    //   329: bipush #6
    //   331: aaload
    //   332: invokestatic ZM : (Ljava/lang/Object;Ljava/lang/Object;)Lnet/portswigger/Zto;
    //   335: putstatic net/portswigger/Znb.ZC : Lnet/portswigger/Zto;
    //   338: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Znb.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */