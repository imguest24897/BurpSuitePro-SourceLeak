package burp;

import java.util.Collection;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zgw3 implements Runnable {
  private final Zrzv Za;
  
  final Zbt9 ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zgw3(Zbt9 paramZbt9, Zrzv paramZrzv) {
    this.Za = paramZrzv;
  }
  
  private boolean ZY(Zez3 paramZez3, Ztdi paramZtdi, float paramFloat1, float paramFloat2, String paramString) {
    try {
      this.ZR.Zn.ZX(paramZez3);
      if (!this.ZR.ZS.Zq(paramFloat1, paramString))
        return false; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      int i = paramZez3.ZkP();
      if (i == 0)
        return true; 
      float f = paramFloat2 / i;
      Zl9i zl9i = new Zl9i(this, paramZtdi, paramFloat1, f, paramString);
      if (paramZez3.ZK(zl9i))
        return false; 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return true;
  }
  
  private boolean Za(Ztdi paramZtdi, String paramString) {
    Collection<Zzhb> collection = paramZtdi.ZE();
    float f1 = 0.0F;
    float f2 = 100.0F / collection.size();
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    for (Zzhb zzhb : collection) {
      if (!ZY(zzhb, paramZtdi, f1, f2, paramString))
        return false; 
      f1 += f2;
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  private boolean ZS(Zez3 paramZez3, Ztdi paramZtdi, Zl6 paramZl6, float paramFloat1, float paramFloat2, String paramString) {
    try {
      Zl91 zl91 = new Zl91(this, paramZl6, paramZtdi);
      if (paramZez3.ZN(zl91))
        return true; 
      if (!this.ZR.ZS.Zq(paramFloat1, paramString))
        return false; 
      int i = paramZez3.ZkP();
      if (i == 0)
        return true; 
      float f = paramFloat2 / i;
      Zl9u zl9u = new Zl9u(this, paramZtdi, paramZl6, paramFloat1, f, paramString);
      if (paramZez3.ZK(zl9u))
        return false; 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return true;
  }
  
  private void ZF(Zez3 paramZez3, Ztdi paramZtdi, Zl6 paramZl6, Zs73 paramZs73, Zrf_ paramZrf_, Zrss paramZrss) {
    if (paramZez3.Zos() != null && paramZez3.ZoO() != null && (!paramZl6.ZE || this.ZR.ZE.ZG(paramZez3.ZlL()))) {
      Zez3 zez3 = null;
      if (paramZez3.Zos() != null) {
        Zstu zstu = paramZez3.Zos();
        int i = Zgyj.Zg(zstu);
        if (i > 0 && i < zstu.Zpu())
          zez3 = paramZtdi.ZP(paramZez3.ZlL(), zstu, i, (short)0); 
      } 
      if (zez3 == null)
        zez3 = paramZtdi.Zq(paramZez3.ZlL(), (short)0); 
      Zs73 zs73 = (new Ztgc(zez3)).ZE();
      paramZs73.ZX(zs73);
      Zrf_ zrf_ = (new Zb4h(zez3)).ZU();
      paramZrf_.ZS(zrf_);
      Zrss zrss = (new Zl1f(zez3)).ZK();
      paramZrss.ZR(zrss);
      paramZtdi.ZR(zez3);
    } 
  }
  
  private boolean Z_(Zrau paramZrau, Zl6[] paramArrayOfZl6, int paramInt, String paramString) throws Exception {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: getfield ZT : [Lburp/Ztdi;
    //   9: astore #6
    //   11: getstatic burp/Zzce.Zu : [I
    //   14: aload_2
    //   15: iload_3
    //   16: aaload
    //   17: getfield ZI : Lburp/Zxl3;
    //   20: invokevirtual ordinal : ()I
    //   23: iaload
    //   24: tableswitch default -> 528, 1 -> 52, 2 -> 52, 3 -> 334
    //   52: getstatic burp/Zzce.ZS : [I
    //   55: aload_2
    //   56: iload_3
    //   57: aaload
    //   58: getfield ZN : Lburp/Zxyi;
    //   61: invokevirtual ordinal : ()I
    //   64: iaload
    //   65: lookupswitch default -> 229, 1 -> 96, 2 -> 172
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_2
    //   97: iload_3
    //   98: aaload
    //   99: getfield Zz : Lburp/Ztdi;
    //   102: invokeinterface ZE : ()Ljava/util/Collection;
    //   107: astore #8
    //   109: aload #8
    //   111: invokeinterface size : ()I
    //   116: anewarray burp/Zez3
    //   119: astore #7
    //   121: aload #8
    //   123: aload #7
    //   125: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   130: pop
    //   131: aload #7
    //   133: arraylength
    //   134: ifne -> 167
    //   137: new java/lang/Exception
    //   140: dup
    //   141: iload_3
    //   142: iconst_1
    //   143: iadd
    //   144: sipush #-2387
    //   147: sipush #-17078
    //   150: invokestatic a : (II)Ljava/lang/String;
    //   153: swap
    //   154: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   159: invokespecial <init> : (Ljava/lang/String;)V
    //   162: athrow
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: aload #5
    //   169: ifnull -> 248
    //   172: aload_2
    //   173: iload_3
    //   174: aaload
    //   175: getfield ZA : Lburp/Zmrj;
    //   178: invokevirtual Zt : ()Lburp/Ze3h;
    //   181: invokevirtual Zi : ()[Lburp/Zez3;
    //   184: astore #7
    //   186: aload #7
    //   188: invokestatic Za : ([Lburp/Zez3;)[Lburp/Zez3;
    //   191: astore #7
    //   193: aload #7
    //   195: arraylength
    //   196: ifne -> 248
    //   199: new java/lang/Exception
    //   202: dup
    //   203: iload_3
    //   204: iconst_1
    //   205: iadd
    //   206: sipush #-2388
    //   209: sipush #-4668
    //   212: invokestatic a : (II)Ljava/lang/String;
    //   215: swap
    //   216: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   221: invokespecial <init> : (Ljava/lang/String;)V
    //   224: athrow
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: iconst_0
    //   230: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   233: aload_2
    //   234: iload_3
    //   235: aaload
    //   236: getfield ZN : Lburp/Zxyi;
    //   239: invokevirtual ordinal : ()I
    //   242: i2l
    //   243: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   246: iconst_0
    //   247: ireturn
    //   248: fconst_0
    //   249: fstore #8
    //   251: ldc 100.0
    //   253: aload #7
    //   255: arraylength
    //   256: i2f
    //   257: fdiv
    //   258: fstore #9
    //   260: aload #7
    //   262: astore #10
    //   264: aload #10
    //   266: arraylength
    //   267: istore #11
    //   269: iconst_0
    //   270: istore #12
    //   272: iload #12
    //   274: iload #11
    //   276: if_icmpge -> 329
    //   279: aload #10
    //   281: iload #12
    //   283: aaload
    //   284: astore #13
    //   286: aload_0
    //   287: aload #13
    //   289: aload #6
    //   291: iload_3
    //   292: aaload
    //   293: aload_2
    //   294: iload_3
    //   295: aaload
    //   296: fload #8
    //   298: fload #9
    //   300: aload #4
    //   302: invokevirtual ZS : (Lburp/Zez3;Lburp/Ztdi;Lburp/Zl6;FFLjava/lang/String;)Z
    //   305: ifne -> 314
    //   308: iconst_0
    //   309: ireturn
    //   310: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   313: athrow
    //   314: fload #8
    //   316: fload #9
    //   318: fadd
    //   319: fstore #8
    //   321: iinc #12, 1
    //   324: aload #5
    //   326: ifnull -> 272
    //   329: aload #5
    //   331: ifnull -> 528
    //   334: aload_0
    //   335: getfield ZR : Lburp/Zbt9;
    //   338: invokevirtual removeAll : ()V
    //   341: aload_0
    //   342: getfield ZR : Lburp/Zbt9;
    //   345: aload_0
    //   346: getfield ZR : Lburp/Zbt9;
    //   349: getfield Za : Lburp/Zbqc;
    //   352: sipush #-2385
    //   355: sipush #-7916
    //   358: invokestatic a : (II)Ljava/lang/String;
    //   361: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   364: aload_0
    //   365: getfield ZR : Lburp/Zbt9;
    //   368: aload_1
    //   369: getfield ZA : [Lburp/Zmrz;
    //   372: iload_3
    //   373: aaload
    //   374: invokevirtual ZC : ()Ljava/awt/Component;
    //   377: sipush #-2389
    //   380: sipush #27770
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   389: new burp/Zz_m
    //   392: dup
    //   393: aload #6
    //   395: iconst_0
    //   396: aaload
    //   397: invokeinterface ZE : ()Ljava/util/Collection;
    //   402: aload #6
    //   404: iload_3
    //   405: aaload
    //   406: aload_2
    //   407: iload_3
    //   408: aaload
    //   409: aload_0
    //   410: getfield ZR : Lburp/Zbt9;
    //   413: getfield ZS : Lburp/Zlc8;
    //   416: aload #4
    //   418: aload_0
    //   419: getfield ZR : Lburp/Zbt9;
    //   422: getfield ZF : Lburp/Zbnt;
    //   425: aload_0
    //   426: getfield ZR : Lburp/Zbt9;
    //   429: getfield Zj : Lburp/Ztwv;
    //   432: aload_0
    //   433: getfield ZR : Lburp/Zbt9;
    //   436: getfield ZK : Lburp/Zr_4;
    //   439: aload_0
    //   440: getfield Za : Lburp/Zrzv;
    //   443: aload_0
    //   444: getfield ZR : Lburp/Zbt9;
    //   447: getfield Zf : Lburp/Zey9;
    //   450: invokespecial <init> : (Ljava/util/Collection;Lburp/Ztdi;Lburp/Zl6;Lburp/Zlc8;Ljava/lang/String;Lburp/Zbnt;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zrzv;Lburp/Zey9;)V
    //   453: astore #7
    //   455: aload #7
    //   457: dup
    //   458: astore #8
    //   460: monitorenter
    //   461: aload #7
    //   463: invokevirtual run : ()V
    //   466: aload #7
    //   468: invokevirtual wait : ()V
    //   471: goto -> 484
    //   474: astore #9
    //   476: aload #9
    //   478: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   481: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   484: aload #8
    //   486: monitorexit
    //   487: goto -> 498
    //   490: astore #14
    //   492: aload #8
    //   494: monitorexit
    //   495: aload #14
    //   497: athrow
    //   498: aload_0
    //   499: getfield ZR : Lburp/Zbt9;
    //   502: invokevirtual removeAll : ()V
    //   505: aload_0
    //   506: getfield ZR : Lburp/Zbt9;
    //   509: aload_0
    //   510: getfield ZR : Lburp/Zbt9;
    //   513: getfield Za : Lburp/Zbqc;
    //   516: sipush #-2390
    //   519: sipush #-7794
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   528: iconst_1
    //   529: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	92	92	java/lang/InterruptedException
    //   121	163	163	java/lang/InterruptedException
    //   193	225	225	java/lang/InterruptedException
    //   286	310	310	java/lang/InterruptedException
    //   461	471	474	java/lang/InterruptedException
    //   461	487	490	finally
    //   490	495	490	finally
  }
  
  private boolean ZY(Ztdi paramZtdi1, Ztdi paramZtdi2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Zbt9;
    //   4: getfield Zv : Lburp/Zzlr;
    //   7: invokevirtual Zz : ()Lburp/Zmr;
    //   10: astore #4
    //   12: aload_1
    //   13: invokeinterface ZE : ()Ljava/util/Collection;
    //   18: invokeinterface iterator : ()Ljava/util/Iterator;
    //   23: astore #5
    //   25: invokestatic Zp : ()[Lburp/Zbqc;
    //   28: new burp/Zlqs
    //   31: dup
    //   32: aload #4
    //   34: aload_0
    //   35: getfield ZR : Lburp/Zbt9;
    //   38: getfield ZF : Lburp/Zbnt;
    //   41: invokespecial <init> : (Lburp/Zmr;Lburp/Zbnt;)V
    //   44: astore #6
    //   46: astore_3
    //   47: aload #5
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 87
    //   57: aload #6
    //   59: aload #5
    //   61: invokeinterface next : ()Ljava/lang/Object;
    //   66: checkcast burp/Zez3
    //   69: aload_0
    //   70: getfield ZR : Lburp/Zbt9;
    //   73: getfield ZS : Lburp/Zlc8;
    //   76: fconst_0
    //   77: fconst_0
    //   78: aconst_null
    //   79: invokestatic Zx : (Ljava/util/List;Lburp/Zez3;Lburp/Zlc8;FFLjava/lang/String;)Z
    //   82: ifne -> 47
    //   85: iconst_0
    //   86: ireturn
    //   87: aload_2
    //   88: invokeinterface ZE : ()Ljava/util/Collection;
    //   93: invokeinterface iterator : ()Ljava/util/Iterator;
    //   98: astore #7
    //   100: new burp/Zlqs
    //   103: dup
    //   104: aload #4
    //   106: aload_0
    //   107: getfield ZR : Lburp/Zbt9;
    //   110: getfield ZF : Lburp/Zbnt;
    //   113: invokespecial <init> : (Lburp/Zmr;Lburp/Zbnt;)V
    //   116: astore #8
    //   118: aload #7
    //   120: invokeinterface hasNext : ()Z
    //   125: ifeq -> 158
    //   128: aload #8
    //   130: aload #7
    //   132: invokeinterface next : ()Ljava/lang/Object;
    //   137: checkcast burp/Zez3
    //   140: aload_0
    //   141: getfield ZR : Lburp/Zbt9;
    //   144: getfield ZS : Lburp/Zlc8;
    //   147: fconst_0
    //   148: fconst_0
    //   149: aconst_null
    //   150: invokestatic Zx : (Ljava/util/List;Lburp/Zez3;Lburp/Zlc8;FFLjava/lang/String;)Z
    //   153: ifne -> 118
    //   156: iconst_0
    //   157: ireturn
    //   158: new burp/Zesb
    //   161: dup
    //   162: aload_0
    //   163: getfield ZR : Lburp/Zbt9;
    //   166: iconst_1
    //   167: aload #6
    //   169: invokevirtual size : ()I
    //   172: iadd
    //   173: aload #8
    //   175: invokevirtual size : ()I
    //   178: iadd
    //   179: invokespecial <init> : (Lburp/Zbt9;I)V
    //   182: astore #9
    //   184: aload #6
    //   186: invokevirtual iterator : ()Ljava/util/Iterator;
    //   189: astore #10
    //   191: aload #10
    //   193: invokeinterface hasNext : ()Z
    //   198: ifeq -> 621
    //   201: aload #10
    //   203: invokeinterface next : ()Ljava/lang/Object;
    //   208: checkcast burp/Zez3
    //   211: astore #11
    //   213: aload #9
    //   215: dup
    //   216: getfield Ze : I
    //   219: iconst_1
    //   220: iadd
    //   221: putfield Ze : I
    //   224: aload #9
    //   226: fconst_0
    //   227: aconst_null
    //   228: invokevirtual Zq : (FLjava/lang/String;)Z
    //   231: ifne -> 236
    //   234: iconst_0
    //   235: ireturn
    //   236: aload #11
    //   238: astore #12
    //   240: aload #12
    //   242: invokeinterface Zos : ()Lburp/Zstu;
    //   247: ifnull -> 191
    //   250: aload #12
    //   252: invokeinterface ZoO : ()Lburp/Zstu;
    //   257: ifnonnull -> 263
    //   260: goto -> 191
    //   263: aload #8
    //   265: aload #12
    //   267: invokevirtual Za : (Lburp/Zez3;)Lburp/Zez3;
    //   270: astore #13
    //   272: aload #13
    //   274: ifnonnull -> 302
    //   277: aload_0
    //   278: getfield ZR : Lburp/Zbt9;
    //   281: getfield Zn : Lburp/Zl2z;
    //   284: aload #12
    //   286: iconst_1
    //   287: invokevirtual ZS : (Lburp/Zez3;B)V
    //   290: aload_1
    //   291: aload #12
    //   293: invokeinterface ZR : (Lburp/Zez3;)V
    //   298: aload_3
    //   299: ifnull -> 617
    //   302: aload_0
    //   303: getfield ZR : Lburp/Zbt9;
    //   306: getfield Zn : Lburp/Zl2z;
    //   309: aload #12
    //   311: invokevirtual ZU : (Lburp/Zez3;)Lburp/Zb4b;
    //   314: astore #14
    //   316: aload_0
    //   317: getfield ZR : Lburp/Zbt9;
    //   320: getfield Zn : Lburp/Zl2z;
    //   323: aload #13
    //   325: invokevirtual ZU : (Lburp/Zez3;)Lburp/Zb4b;
    //   328: astore #15
    //   330: aload #15
    //   332: getfield ZT : Lburp/Zez3;
    //   335: ifnull -> 341
    //   338: goto -> 191
    //   341: aload #14
    //   343: aload #13
    //   345: putfield ZT : Lburp/Zez3;
    //   348: aload #15
    //   350: aload #12
    //   352: putfield ZT : Lburp/Zez3;
    //   355: aload #12
    //   357: invokeinterface Zos : ()Lburp/Zstu;
    //   362: astore #16
    //   364: aload #13
    //   366: invokeinterface Zos : ()Lburp/Zstu;
    //   371: astore #17
    //   373: aload #14
    //   375: new burp/Zrtg
    //   378: dup
    //   379: aload #16
    //   381: iconst_0
    //   382: aload #16
    //   384: invokeinterface Zpu : ()I
    //   389: aload #17
    //   391: iconst_0
    //   392: aload #17
    //   394: invokeinterface Zpu : ()I
    //   399: aload #9
    //   401: invokespecial <init> : (Lburp/Zstu;IILburp/Zstu;IILburp/Zlc8;)V
    //   404: invokevirtual ZT : ()Ljava/util/List;
    //   407: invokevirtual Zt : (Ljava/util/List;)V
    //   410: aload #15
    //   412: aload #14
    //   414: invokevirtual Zq : ()Ljava/util/List;
    //   417: invokevirtual Zt : (Ljava/util/List;)V
    //   420: aload #12
    //   422: invokeinterface ZoO : ()Lburp/Zstu;
    //   427: astore #18
    //   429: aload #13
    //   431: invokeinterface ZoO : ()Lburp/Zstu;
    //   436: astore #19
    //   438: new burp/Zrtg
    //   441: dup
    //   442: aload #18
    //   444: iconst_0
    //   445: aload #18
    //   447: invokeinterface Zpu : ()I
    //   452: aload #19
    //   454: iconst_0
    //   455: aload #19
    //   457: invokeinterface Zpu : ()I
    //   462: aload #9
    //   464: invokespecial <init> : (Lburp/Zstu;IILburp/Zstu;IILburp/Zlc8;)V
    //   467: astore #20
    //   469: new burp/Zb4h
    //   472: dup
    //   473: aload #12
    //   475: invokespecial <init> : (Lburp/Zez3;)V
    //   478: invokevirtual ZU : ()Lburp/Zrf_;
    //   481: astore #21
    //   483: new burp/Zb4h
    //   486: dup
    //   487: aload #13
    //   489: invokespecial <init> : (Lburp/Zez3;)V
    //   492: invokevirtual ZU : ()Lburp/Zrf_;
    //   495: astore #22
    //   497: aload #20
    //   499: aload_0
    //   500: aload #18
    //   502: aload #4
    //   504: aload #21
    //   506: invokeinterface Z_F : ()S
    //   511: invokevirtual ZV : (Lburp/Zstu;Lburp/Zmr;S)Ljava/util/List;
    //   514: aload_0
    //   515: aload #19
    //   517: aload #4
    //   519: aload #22
    //   521: invokeinterface Z_F : ()S
    //   526: invokevirtual ZV : (Lburp/Zstu;Lburp/Zmr;S)Ljava/util/List;
    //   529: invokevirtual Zz : (Ljava/util/List;Ljava/util/List;)V
    //   532: aload #20
    //   534: aload #4
    //   536: getfield ZD : Z
    //   539: invokevirtual Zm : (Z)V
    //   542: aload #14
    //   544: aload #20
    //   546: invokevirtual ZT : ()Ljava/util/List;
    //   549: invokevirtual Zj : (Ljava/util/List;)V
    //   552: aload #15
    //   554: aload #14
    //   556: invokevirtual Zz : ()Ljava/util/List;
    //   559: invokevirtual Zj : (Ljava/util/List;)V
    //   562: aload #14
    //   564: invokevirtual Zz : ()Ljava/util/List;
    //   567: invokeinterface isEmpty : ()Z
    //   572: ifne -> 617
    //   575: aload_0
    //   576: getfield ZR : Lburp/Zbt9;
    //   579: getfield Zn : Lburp/Zl2z;
    //   582: aload #12
    //   584: iconst_3
    //   585: invokevirtual ZS : (Lburp/Zez3;B)V
    //   588: aload_1
    //   589: aload #12
    //   591: invokeinterface ZR : (Lburp/Zez3;)V
    //   596: aload_0
    //   597: getfield ZR : Lburp/Zbt9;
    //   600: getfield Zn : Lburp/Zl2z;
    //   603: aload #13
    //   605: iconst_3
    //   606: invokevirtual ZS : (Lburp/Zez3;B)V
    //   609: aload_2
    //   610: aload #13
    //   612: invokeinterface ZR : (Lburp/Zez3;)V
    //   617: aload_3
    //   618: ifnull -> 191
    //   621: aload #8
    //   623: invokevirtual iterator : ()Ljava/util/Iterator;
    //   626: astore #10
    //   628: aload #10
    //   630: invokeinterface hasNext : ()Z
    //   635: ifeq -> 760
    //   638: aload #10
    //   640: invokeinterface next : ()Ljava/lang/Object;
    //   645: checkcast burp/Zez3
    //   648: astore #11
    //   650: aload #9
    //   652: dup
    //   653: getfield Ze : I
    //   656: iconst_1
    //   657: iadd
    //   658: putfield Ze : I
    //   661: aload #9
    //   663: fconst_0
    //   664: aconst_null
    //   665: invokevirtual Zq : (FLjava/lang/String;)Z
    //   668: ifne -> 673
    //   671: iconst_0
    //   672: ireturn
    //   673: aload #11
    //   675: astore #12
    //   677: aload #12
    //   679: invokeinterface Zos : ()Lburp/Zstu;
    //   684: ifnull -> 628
    //   687: aload #12
    //   689: invokeinterface ZoO : ()Lburp/Zstu;
    //   694: ifnonnull -> 700
    //   697: goto -> 628
    //   700: aload_0
    //   701: getfield ZR : Lburp/Zbt9;
    //   704: getfield Zn : Lburp/Zl2z;
    //   707: aload #12
    //   709: invokevirtual ZU : (Lburp/Zez3;)Lburp/Zb4b;
    //   712: getfield ZT : Lburp/Zez3;
    //   715: ifnull -> 721
    //   718: goto -> 628
    //   721: aload #6
    //   723: aload #12
    //   725: invokevirtual Za : (Lburp/Zez3;)Lburp/Zez3;
    //   728: astore #13
    //   730: aload #13
    //   732: ifnonnull -> 756
    //   735: aload_0
    //   736: getfield ZR : Lburp/Zbt9;
    //   739: getfield Zn : Lburp/Zl2z;
    //   742: aload #12
    //   744: iconst_2
    //   745: invokevirtual ZS : (Lburp/Zez3;B)V
    //   748: aload_2
    //   749: aload #12
    //   751: invokeinterface ZR : (Lburp/Zez3;)V
    //   756: aload_3
    //   757: ifnull -> 628
    //   760: iconst_1
    //   761: ireturn
  }
  
  private boolean Zx(List<String> paramList, String paramString) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    for (String str : paramList) {
      if (paramString.length() > str.length() && paramString.substring(0, str.length()).equalsIgnoreCase(str) && paramString.charAt(str.length()) == ':')
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zn(List<String> paramList, String paramString) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    for (String str : paramList) {
      if (str.equalsIgnoreCase(paramString))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  private int[] ZZ(Zmwr paramZmwr) {
    Zbqc[] arrayOfZbqc = Zzlr.Zp();
    for (Zs5n zs5n : paramZmwr.ZhB().ZlP().ZJo()) {
      if (a(-2396, -1857).equalsIgnoreCase(zs5n.ZQd()))
        return new int[] { zs5n.ZQs(), zs5n.ZQc() }; 
      if (arrayOfZbqc != null)
        break; 
    } 
    Zuh.Zb(false, Zqf.ZH);
    return new int[] { paramZmwr.ZhB().ZlK(), paramZmwr.ZhB().Zli() };
  }
  
  private List<int[]> ZV(Zstu paramZstu, Zmr paramZmr, short paramShort) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #5
    //   14: aload_1
    //   15: invokestatic Zi : (Lburp/Zstu;)I
    //   18: istore #6
    //   20: aload_2
    //   21: getfield ZQ : Z
    //   24: ifeq -> 41
    //   27: aload_2
    //   28: getfield ZF : Z
    //   31: ifeq -> 314
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: new java/util/ArrayList
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: astore #7
    //   50: aload_1
    //   51: iconst_0
    //   52: iload #6
    //   54: aload #7
    //   56: invokestatic ZZ : (Lburp/Zstu;IILjava/util/List;)Ljava/util/List;
    //   59: astore #8
    //   61: aload_2
    //   62: getfield ZQ : Z
    //   65: ifne -> 145
    //   68: aload_2
    //   69: getfield Zn : Z
    //   72: ifne -> 145
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload #8
    //   84: invokeinterface size : ()I
    //   89: iconst_1
    //   90: if_icmple -> 314
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: aload #5
    //   102: iconst_2
    //   103: newarray int
    //   105: dup
    //   106: iconst_0
    //   107: aload #7
    //   109: iconst_1
    //   110: invokeinterface get : (I)Ljava/lang/Object;
    //   115: checkcast java/lang/Integer
    //   118: invokevirtual intValue : ()I
    //   121: iastore
    //   122: dup
    //   123: iconst_1
    //   124: iload #6
    //   126: iastore
    //   127: invokeinterface add : (Ljava/lang/Object;)Z
    //   132: pop
    //   133: aload #4
    //   135: ifnull -> 314
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: iconst_1
    //   146: istore #9
    //   148: iload #9
    //   150: aload #8
    //   152: invokeinterface size : ()I
    //   157: if_icmpge -> 314
    //   160: aload #8
    //   162: iload #9
    //   164: invokeinterface get : (I)Ljava/lang/Object;
    //   169: checkcast java/lang/String
    //   172: astore #10
    //   174: aload_2
    //   175: getfield ZQ : Z
    //   178: ifeq -> 198
    //   181: aload_0
    //   182: aload_2
    //   183: getfield Zc : Ljava/util/List;
    //   186: aload #10
    //   188: invokevirtual Zx : (Ljava/util/List;Ljava/lang/String;)Z
    //   191: goto -> 220
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: aload_0
    //   199: aload_2
    //   200: getfield ZE : Ljava/util/List;
    //   203: aload #10
    //   205: invokevirtual Zx : (Ljava/util/List;Ljava/lang/String;)Z
    //   208: ifne -> 219
    //   211: iconst_1
    //   212: goto -> 220
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: iconst_0
    //   220: istore #11
    //   222: iload #11
    //   224: ifeq -> 306
    //   227: aload #5
    //   229: iconst_2
    //   230: newarray int
    //   232: dup
    //   233: iconst_0
    //   234: aload #7
    //   236: iload #9
    //   238: invokeinterface get : (I)Ljava/lang/Object;
    //   243: checkcast java/lang/Integer
    //   246: invokevirtual intValue : ()I
    //   249: iastore
    //   250: dup
    //   251: iconst_1
    //   252: iload #9
    //   254: iconst_1
    //   255: iadd
    //   256: aload #7
    //   258: invokeinterface size : ()I
    //   263: if_icmplt -> 282
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: iload #6
    //   275: goto -> 299
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload #7
    //   284: iload #9
    //   286: iconst_1
    //   287: iadd
    //   288: invokeinterface get : (I)Ljava/lang/Object;
    //   293: checkcast java/lang/Integer
    //   296: invokevirtual intValue : ()I
    //   299: iastore
    //   300: invokeinterface add : (Ljava/lang/Object;)Z
    //   305: pop
    //   306: iinc #9, 1
    //   309: aload #4
    //   311: ifnull -> 148
    //   314: aload_2
    //   315: getfield Zv : Z
    //   318: ifeq -> 374
    //   321: iload_3
    //   322: invokestatic Zu : (S)Z
    //   325: ifne -> 374
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: aload #5
    //   337: iconst_2
    //   338: newarray int
    //   340: dup
    //   341: iconst_0
    //   342: iload #6
    //   344: iconst_2
    //   345: iadd
    //   346: iastore
    //   347: dup
    //   348: iconst_1
    //   349: aload_1
    //   350: invokeinterface Zpu : ()I
    //   355: iastore
    //   356: invokeinterface add : (Ljava/lang/Object;)Z
    //   361: pop
    //   362: aload #4
    //   364: ifnull -> 621
    //   367: goto -> 374
    //   370: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   373: athrow
    //   374: aload_2
    //   375: getfield Zu : Z
    //   378: ifeq -> 402
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   387: athrow
    //   388: aload_2
    //   389: getfield Zl : Z
    //   392: ifeq -> 621
    //   395: goto -> 402
    //   398: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   401: athrow
    //   402: iload_3
    //   403: sipush #256
    //   406: if_icmpne -> 621
    //   409: goto -> 416
    //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   415: athrow
    //   416: aload_1
    //   417: iload #6
    //   419: aload_1
    //   420: invokeinterface Zpu : ()I
    //   425: iconst_0
    //   426: invokestatic ZJ : (Lburp/Zstu;IIB)Ljava/util/List;
    //   429: astore #7
    //   431: aconst_null
    //   432: aload #7
    //   434: aload_0
    //   435: getfield ZR : Lburp/Zbt9;
    //   438: getfield ZF : Lburp/Zbnt;
    //   441: invokestatic ZN : (Lburp/Zlit;Ljava/util/List;Lburp/Zbnt;)Ljava/util/List;
    //   444: astore #8
    //   446: aload #8
    //   448: invokeinterface iterator : ()Ljava/util/Iterator;
    //   453: astore #9
    //   455: aload #9
    //   457: invokeinterface hasNext : ()Z
    //   462: ifeq -> 621
    //   465: aload #9
    //   467: invokeinterface next : ()Ljava/lang/Object;
    //   472: checkcast burp/Zx8_
    //   475: astore #10
    //   477: aload #10
    //   479: invokeinterface ZZp : ()Lburp/Zefg;
    //   484: invokeinterface iterator : ()Ljava/util/Iterator;
    //   489: astore #11
    //   491: aload #11
    //   493: invokeinterface hasNext : ()Z
    //   498: ifeq -> 616
    //   501: aload #11
    //   503: invokeinterface next : ()Ljava/lang/Object;
    //   508: checkcast burp/Zmwr
    //   511: astore #12
    //   513: aload_2
    //   514: getfield Zu : Z
    //   517: ifeq -> 542
    //   520: aload_0
    //   521: aload_2
    //   522: getfield ZL : Ljava/util/List;
    //   525: aload #12
    //   527: invokeinterface Zh4 : ()Ljava/lang/String;
    //   532: invokevirtual Zn : (Ljava/util/List;Ljava/lang/String;)Z
    //   535: goto -> 583
    //   538: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   541: athrow
    //   542: aload_2
    //   543: getfield ZH : Z
    //   546: ifeq -> 574
    //   549: aload_0
    //   550: aload_2
    //   551: getfield Ze : Ljava/util/List;
    //   554: aload #12
    //   556: invokeinterface Zh4 : ()Ljava/lang/String;
    //   561: invokevirtual Zn : (Ljava/util/List;Ljava/lang/String;)Z
    //   564: ifne -> 582
    //   567: goto -> 574
    //   570: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   573: athrow
    //   574: iconst_1
    //   575: goto -> 583
    //   578: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   581: athrow
    //   582: iconst_0
    //   583: istore #13
    //   585: iload #13
    //   587: ifeq -> 611
    //   590: aload #5
    //   592: aload_0
    //   593: aload #12
    //   595: invokevirtual ZZ : (Lburp/Zmwr;)[I
    //   598: invokeinterface add : (Ljava/lang/Object;)Z
    //   603: pop
    //   604: goto -> 611
    //   607: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   610: athrow
    //   611: aload #4
    //   613: ifnull -> 491
    //   616: aload #4
    //   618: ifnull -> 455
    //   621: aload #5
    //   623: areturn
    //   624: astore #5
    //   626: aload #5
    //   628: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   631: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   634: aconst_null
    //   635: areturn
    // Exception table:
    //   from	to	target	type
    //   5	623	624	java/lang/Exception
    //   20	34	37	java/lang/Exception
    //   61	75	78	java/lang/Exception
    //   68	93	96	java/lang/Exception
    //   82	138	141	java/lang/Exception
    //   174	194	194	java/lang/Exception
    //   198	215	215	java/lang/Exception
    //   222	266	269	java/lang/Exception
    //   227	278	278	java/lang/Exception
    //   314	328	331	java/lang/Exception
    //   321	367	370	java/lang/Exception
    //   335	381	384	java/lang/Exception
    //   374	395	398	java/lang/Exception
    //   388	409	412	java/lang/Exception
    //   513	538	538	java/lang/Exception
    //   542	567	570	java/lang/Exception
    //   549	578	578	java/lang/Exception
    //   585	604	607	java/lang/Exception
  }
  
  public void run() {
    try {
      Zrau zrau = this.ZR.Zv.ZD();
      try {
        if (this.ZR.Zz) {
          if (!Za(zrau.ZT[0], a(-2386, 7927)))
            return; 
          if (!Za(zrau.ZT[1], a(-2392, -983)))
            return; 
        } else {
          if (!Z_(zrau, this.ZR.Zv.Zc(), 0, a(-2395, 32694)))
            return; 
          if (!Z_(zrau, this.ZR.Zv.Zc(), 1, a(-2391, -31748)))
            return; 
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      if (!ZY(zrau.ZT[0], zrau.ZT[1]))
        return; 
      this.ZR.Zv.ZV(this.ZR);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      this.ZR.ZS.Zq(-100.0F, exception.getMessage());
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ã£ãýKSCN·Âæ`rÐÃ¡À4\\f$û]¼Ô ùßÄºiµ8äPºO\5ïúÊA'éÊ¡¾/ôom|Ç$²Ûµ{Õ:]=-I[\\rî*?D?8SÞÄÉ©':Ôíy½Lân&K*þ]%ÃzYn.'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #7
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '\\nóJëã¿zü_ü!°ò#'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #94
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zgw3.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zgw3.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #87
    //   214: goto -> 244
    //   217: bipush #59
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #28
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #58
    //   239: goto -> 244
    //   242: bipush #85
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF6AD) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '½';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgw3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */