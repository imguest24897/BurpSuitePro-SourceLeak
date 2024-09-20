package burp;

import java.util.List;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbsw {
  private final Zt2r ZH;
  
  private final Ztdn ZT;
  
  private final Zgb6 Zq;
  
  private final Ztdi Zp;
  
  private final Zbnt Zs;
  
  private final Zz_r ZF;
  
  private final Zr_4 Zk;
  
  private static final String a;
  
  public Zbsw(Zt2r paramZt2r, Ztdn paramZtdn, Zgb6 paramZgb6, Ztdi paramZtdi, Zbnt paramZbnt, Zz_r paramZz_r, Zr_4 paramZr_4) {
    this.ZH = paramZt2r;
    this.ZT = paramZtdn;
    this.Zq = paramZgb6;
    this.Zp = paramZtdi;
    this.Zs = paramZbnt;
    this.ZF = paramZz_r;
    this.Zk = paramZr_4;
  }
  
  public void Zm(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, short paramShort, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore #6
    //   5: aload_1
    //   6: aload_2
    //   7: iconst_1
    //   8: aload_0
    //   9: getfield Zs : Lburp/Zbnt;
    //   12: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   15: astore #7
    //   17: aload #7
    //   19: aload_3
    //   20: getstatic burp/Zt0k.HTML_ANALYSIS : Lburp/Zt0k;
    //   23: aload_0
    //   24: getfield Zs : Lburp/Zbnt;
    //   27: invokestatic ZS : (Lburp/Zz1p;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   30: astore #8
    //   32: getstatic burp/Zbsw.a : Ljava/lang/String;
    //   35: aload #7
    //   37: getfield Zb : Ljava/lang/String;
    //   40: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   43: ifeq -> 75
    //   46: aload_0
    //   47: getfield Zp : Lburp/Ztdi;
    //   50: aload #7
    //   52: getfield Zo : Lburp/Zlit;
    //   55: aload_2
    //   56: aload #7
    //   58: invokevirtual ZO : ()I
    //   61: iload #4
    //   63: invokeinterface ZP : (Lburp/Zlit;Lburp/Zstu;IS)Lburp/Zez3;
    //   68: astore #9
    //   70: iload #6
    //   72: ifne -> 93
    //   75: aload_0
    //   76: getfield Zp : Lburp/Ztdi;
    //   79: aload #7
    //   81: getfield Zo : Lburp/Zlit;
    //   84: iload #4
    //   86: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   91: astore #9
    //   93: new burp/Ztgc
    //   96: dup
    //   97: aload #9
    //   99: invokespecial <init> : (Lburp/Zez3;)V
    //   102: invokevirtual ZE : ()Lburp/Zs73;
    //   105: astore #10
    //   107: new burp/Zb4h
    //   110: dup
    //   111: aload #9
    //   113: invokespecial <init> : (Lburp/Zez3;)V
    //   116: invokevirtual ZU : ()Lburp/Zrf_;
    //   119: astore #11
    //   121: aload #10
    //   123: invokeinterface ZTU : ()B
    //   128: tableswitch default -> 321, 0 -> 164, 1 -> 164, 2 -> 218, 3 -> 191, 4 -> 164
    //   164: aload_0
    //   165: aload #9
    //   167: aload_2
    //   168: aload_3
    //   169: aload #7
    //   171: aload #8
    //   173: aload #10
    //   175: iconst_2
    //   176: invokevirtual Zz : (Lburp/Zez3;Lburp/Zstu;Lburp/Zstu;Lburp/Zz1p;Lburp/Zs68;Lburp/Zs73;B)V
    //   179: iload #6
    //   181: ifne -> 343
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   190: athrow
    //   191: aload_0
    //   192: aload #9
    //   194: aload_2
    //   195: aload_3
    //   196: aload #7
    //   198: aload #8
    //   200: aload #10
    //   202: iconst_3
    //   203: invokevirtual Zz : (Lburp/Zez3;Lburp/Zstu;Lburp/Zstu;Lburp/Zz1p;Lburp/Zs68;Lburp/Zs73;B)V
    //   206: iload #6
    //   208: ifne -> 343
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   217: athrow
    //   218: aload #11
    //   220: invokeinterface Z_V : ()S
    //   225: sipush #200
    //   228: if_icmplt -> 258
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   237: athrow
    //   238: aload #11
    //   240: invokeinterface Z_V : ()S
    //   245: sipush #300
    //   248: if_icmplt -> 343
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   257: athrow
    //   258: aload #8
    //   260: getfield Zb : S
    //   263: sipush #200
    //   266: if_icmplt -> 343
    //   269: goto -> 276
    //   272: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   275: athrow
    //   276: aload #8
    //   278: getfield Zb : S
    //   281: sipush #300
    //   284: if_icmpge -> 343
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   293: athrow
    //   294: aload_0
    //   295: aload #9
    //   297: aload_2
    //   298: aload_3
    //   299: aload #7
    //   301: aload #8
    //   303: aload #10
    //   305: iconst_2
    //   306: invokevirtual Zz : (Lburp/Zez3;Lburp/Zstu;Lburp/Zstu;Lburp/Zz1p;Lburp/Zs68;Lburp/Zs73;B)V
    //   309: iload #6
    //   311: ifne -> 343
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   320: athrow
    //   321: iconst_0
    //   322: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   325: aload #10
    //   327: invokeinterface ZTU : ()B
    //   332: i2l
    //   333: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   336: goto -> 343
    //   339: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   342: athrow
    //   343: iload #4
    //   345: aload #10
    //   347: invokeinterface ZTF : ()S
    //   352: if_icmpge -> 371
    //   355: aload #10
    //   357: iload #4
    //   359: invokeinterface ZC : (S)V
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   370: athrow
    //   371: aload_0
    //   372: getfield Zp : Lburp/Ztdi;
    //   375: aload #9
    //   377: invokeinterface ZR : (Lburp/Zez3;)V
    //   382: iload #5
    //   384: ifeq -> 405
    //   387: aload_0
    //   388: aload_3
    //   389: aload #7
    //   391: aload #8
    //   393: aload #9
    //   395: invokevirtual Zp : (Lburp/Zstu;Lburp/Zz1p;Lburp/Zs68;Lburp/Zez3;)V
    //   398: goto -> 405
    //   401: invokestatic a : (Ljava/lang/OutOfMemoryError;)Ljava/lang/OutOfMemoryError;
    //   404: athrow
    //   405: invokestatic Zc : ()V
    //   408: goto -> 431
    //   411: astore #7
    //   413: aload #7
    //   415: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   418: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   421: aload_0
    //   422: getfield ZH : Lburp/Zt2r;
    //   425: invokevirtual Zp : ()Lburp/Zskh;
    //   428: invokestatic ZR : (Lburp/Zskh;)V
    //   431: return
    // Exception table:
    //   from	to	target	type
    //   5	408	411	java/lang/OutOfMemoryError
    //   121	184	187	java/lang/OutOfMemoryError
    //   164	211	214	java/lang/OutOfMemoryError
    //   191	231	234	java/lang/OutOfMemoryError
    //   218	251	254	java/lang/OutOfMemoryError
    //   238	269	272	java/lang/OutOfMemoryError
    //   258	287	290	java/lang/OutOfMemoryError
    //   276	314	317	java/lang/OutOfMemoryError
    //   294	336	339	java/lang/OutOfMemoryError
    //   343	364	367	java/lang/OutOfMemoryError
    //   371	398	401	java/lang/OutOfMemoryError
  }
  
  private void Zz(Zez3 paramZez3, Zstu paramZstu1, Zstu paramZstu2, Zz1p paramZz1p, Zs68 paramZs68, Zs73 paramZs73, byte paramByte) {
    (new Zsir()).Zp(paramZstu1.Zp(this.Zk), paramZz1p.Zb).ZV(paramZstu2.Zp(this.Zk), paramZs68.Zs, paramZs68.Zb, ZO(paramZez3, paramZs68), Zsir.ZO(paramZs68), System.currentTimeMillis()).ZG(paramByte, Zq(paramZez3, paramZz1p, paramZs68, paramZstu2, paramZs73.ZTI()), paramZs73.ZTF(), paramZs73.ZTR()).Zd(paramZez3);
    this.ZF.Zg(Zeew.TARGET, paramZez3);
  }
  
  private short ZO(Zez3 paramZez3, Zs68 paramZs68) {
    int i = Zrc1.ZL();
    null = (new Zb4h(paramZez3)).ZU().Z_F();
    if (null == 0) {
      null = paramZs68.ZH.Zj;
      if (i != 0) {
        switch (paramZs68.ZH.Zj) {
          case 0:
          case 1:
          case 2:
          case 512:
            if (i != 0)
              break; 
            return null;
        } 
        return paramZs68.ZH.Zj;
      } 
      return null;
    } 
    switch (paramZs68.ZH.Zj) {
      case 0:
      case 1:
      case 2:
      case 512:
        if (i != 0)
          break; 
        return null;
    } 
    return paramZs68.ZH.Zj;
  }
  
  private byte Zq(Zez3 paramZez3, Zz1p paramZz1p, Zs68 paramZs68, Zstu paramZstu, byte paramByte) {
    int i = Zrc1.Zz();
    boolean bool = this.ZT.Zp();
    if (!bool)
      Zm2.ZC(Zrrh.SPIDER_OPTIONS_CRAWLER_CUSTOM_NOT_FOUND_DISABLED); 
    if (paramByte != 1 && bool && this.ZT.ZP() && this.ZT.Zp(paramZez3.ZlL().Zdz())) {
      paramByte = this.ZH.Zc(paramZz1p.Zo, paramZs68, paramZstu);
      if (i == 0) {
        if (paramZs68.Zb == 404)
          paramByte = 2; 
        return paramByte;
      } 
      return paramByte;
    } 
    if (paramZs68.Zb == 404)
      paramByte = 2; 
    return paramByte;
  }
  
  private void Zp(Zstu paramZstu, Zz1p paramZz1p, Zs68 paramZs68, Zez3 paramZez3) {
    int i = Zrc1.ZL();
    if (!Zs(paramZs68.ZH.Zj))
      return; 
    List<Zsq8> list = Zm46.ZF(paramZz1p, paramZs68, paramZstu, null, this.Zp, this.Zs, this.Zq.ZU0());
    for (Zsq8 zsq8 : list) {
      if (!this.ZH.Zi() && !this.ZT.ZQ(zsq8.ZZ, (short)0))
        continue; 
      Zs73 zs731 = (new Ztgc(paramZez3)).ZE();
      Zez3 zez3 = this.Zp.Zq(zsq8.ZZ, (short)(zs731.ZTF() + 1));
      boolean bool = false;
      Zs73 zs732 = (new Ztgc(zez3)).ZE();
      Zrf_ zrf_ = (new Zb4h(zez3)).ZU();
      if (zs731.ZTF() + 1 < zs732.ZTF()) {
        zs732.ZC((short)(zs731.ZTF() + 1));
        bool = true;
      } 
      switch (zs732.ZTU()) {
        case 4:
          zs732.ZU((byte)0);
        case 0:
        
        case 1:
        case 2:
        case 3:
        
        default:
          Zuh.Zv(false, Zqf.Zk, zs732.ZTU());
          break;
      } 
      if (bool)
        this.Zp.ZR(zez3); 
      continue;
      if (i != 0)
        break; 
    } 
  }
  
  private static boolean Zs(short paramShort) {
    return (Zk8m.Zu(paramShort) || paramShort == 1026);
  }
  
  private static OutOfMemoryError a(OutOfMemoryError paramOutOfMemoryError) {
    return paramOutOfMemoryError;
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc 'j'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbsw.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: iconst_1
    //   81: goto -> 110
    //   84: bipush #122
    //   86: goto -> 110
    //   89: bipush #23
    //   91: goto -> 110
    //   94: bipush #27
    //   96: goto -> 110
    //   99: iconst_4
    //   100: goto -> 110
    //   103: bipush #66
    //   105: goto -> 110
    //   108: bipush #63
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbsw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */