package burp;

import java.time.Duration;

public class Zggx {
  private final Zl11 Zd;
  
  private final Zskh ZX;
  
  private final Zbnt ZY;
  
  private final Zgb6 Zo;
  
  private final Zkq4 ZO;
  
  private final Zz3j Zz;
  
  public Zggx(Zl11 paramZl11, Zskh paramZskh, Zbnt paramZbnt, Zgb6 paramZgb6, Zkq4 paramZkq4, Zz3j paramZz3j) {
    this.Zd = paramZl11;
    this.ZX = paramZskh;
    this.ZY = paramZbnt;
    this.Zo = paramZgb6;
    this.ZO = paramZkq4;
    this.Zz = paramZz3j;
  }
  
  Zsxd ZL(Ztpx paramZtpx, Zlgm paramZlgm, Zefx paramZefx, boolean paramBoolean1, Duration paramDuration1, Duration paramDuration2, byte[] paramArrayOfbyte, Ze45 paramZe45, boolean paramBoolean2, Zlig paramZlig, String paramString, boolean paramBoolean3) {
    // Byte code:
    //   0: invokestatic Zy : ()Ljava/lang/String;
    //   3: astore #13
    //   5: aload #6
    //   7: ifnull -> 33
    //   10: aload #6
    //   12: invokevirtual isZero : ()Z
    //   15: ifne -> 33
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: iconst_1
    //   26: goto -> 34
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: iconst_0
    //   34: istore #14
    //   36: aload #5
    //   38: ifnull -> 50
    //   41: aload #5
    //   43: goto -> 66
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_0
    //   51: getfield ZO : Lburp/Zkq4;
    //   54: invokeinterface ZT1 : ()Ljava/util/Optional;
    //   59: aconst_null
    //   60: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast java/time/Duration
    //   66: astore #5
    //   68: aload #6
    //   70: ifnull -> 82
    //   73: aload #6
    //   75: goto -> 98
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_0
    //   83: getfield ZO : Lburp/Zkq4;
    //   86: invokeinterface ZTa : ()Ljava/util/Optional;
    //   91: aconst_null
    //   92: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   95: checkcast java/time/Duration
    //   98: astore #6
    //   100: iload #14
    //   102: ifeq -> 115
    //   105: getstatic burp/Zskh.Zo : Lburp/Zskh;
    //   108: goto -> 119
    //   111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   114: athrow
    //   115: aload_0
    //   116: getfield ZX : Lburp/Zskh;
    //   119: astore #15
    //   121: new burp/Zlbn
    //   124: dup
    //   125: aload #15
    //   127: invokeinterface Zz : ()Lburp/Zskh;
    //   132: aload_3
    //   133: invokeinterface ZF : ()Lburp/Zlit;
    //   138: aload #10
    //   140: invokespecial <init> : (Lburp/Zskh;Lburp/Zlit;Lburp/Zlig;)V
    //   143: astore #16
    //   145: aload_0
    //   146: getfield Zo : Lburp/Zgb6;
    //   149: invokestatic ZG : (Lburp/Zgb6;)Lburp/Zs38;
    //   152: astore #17
    //   154: aload #17
    //   156: aload #5
    //   158: invokevirtual Zq : (Ljava/time/Duration;)Lburp/Zs38;
    //   161: aload #6
    //   163: invokevirtual ZI : (Ljava/time/Duration;)Lburp/Zs38;
    //   166: aload #8
    //   168: invokevirtual ZV : (Lburp/Ze45;)Lburp/Zs38;
    //   171: iload #4
    //   173: invokevirtual Ze : (Z)Lburp/Zs38;
    //   176: aload_2
    //   177: invokevirtual Zp : (Lburp/Zlgm;)Lburp/Zs38;
    //   180: invokevirtual Zq : ()Lburp/Zs38;
    //   183: invokevirtual ZX : ()Lburp/Zs38;
    //   186: aload #7
    //   188: invokevirtual Zh : ([B)Lburp/Zs38;
    //   191: aload #11
    //   193: invokevirtual ZR : (Ljava/lang/String;)Lburp/Zs38;
    //   196: aload #11
    //   198: invokevirtual Zo : (Ljava/lang/String;)Lburp/Zs38;
    //   201: iload #12
    //   203: invokevirtual Za : (Z)Lburp/Zs38;
    //   206: astore #18
    //   208: aload #11
    //   210: ifnull -> 227
    //   213: aload #18
    //   215: iconst_1
    //   216: invokevirtual Zi : (Z)Lburp/Zs38;
    //   219: pop
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: iload #9
    //   229: ifeq -> 246
    //   232: aload #18
    //   234: iconst_0
    //   235: invokevirtual Zi : (Z)Lburp/Zs38;
    //   238: pop
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   245: athrow
    //   246: iload #4
    //   248: ifeq -> 278
    //   251: new burp/Zxf1
    //   254: dup
    //   255: aload_0
    //   256: getfield ZY : Lburp/Zbnt;
    //   259: aload_0
    //   260: getfield Zo : Lburp/Zgb6;
    //   263: invokeinterface ZU0 : ()Lburp/Zes1;
    //   268: invokespecial <init> : (Lburp/Zbnt;Lburp/Zes1;)V
    //   271: goto -> 285
    //   274: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   277: athrow
    //   278: new burp/Zxf4
    //   281: dup
    //   282: invokespecial <init> : ()V
    //   285: astore #19
    //   287: aload_1
    //   288: aload_0
    //   289: getfield Zz : Lburp/Zz3j;
    //   292: aload_0
    //   293: aload_3
    //   294: aload #18
    //   296: aload #19
    //   298: aload #16
    //   300: <illegal opcode> get : (Lburp/Zggx;Lburp/Zefx;Lburp/Zs38;Lburp/Zsil;Lburp/Zzen;)Ljava/util/function/Supplier;
    //   305: aload_3
    //   306: invokevirtual Z_ : (Ljava/util/function/Supplier;Lburp/Zefx;)Lburp/Ztaw;
    //   309: invokeinterface ZJ : (Lburp/Ztaw;)Lburp/Zsxd;
    //   314: astore #20
    //   316: aload #20
    //   318: invokeinterface ZG : ()Lburp/Zg3d;
    //   323: astore #21
    //   325: getstatic burp/Zm8x.Zw : [I
    //   328: aload #21
    //   330: invokeinterface Zb : ()Lburp/Zvom;
    //   335: invokevirtual ordinal : ()I
    //   338: iaload
    //   339: tableswitch default -> 458, 1 -> 372, 2 -> 375, 3 -> 410, 4 -> 425, 5 -> 443
    //   372: aload #20
    //   374: areturn
    //   375: iload #14
    //   377: ifeq -> 402
    //   380: aload #20
    //   382: aload #13
    //   384: ifnonnull -> 401
    //   387: goto -> 394
    //   390: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   393: athrow
    //   394: iconst_2
    //   395: anewarray burp/Zbqc
    //   398: invokestatic Zr : ([Lburp/Zbqc;)V
    //   401: areturn
    //   402: new burp/Zsc5
    //   405: dup
    //   406: invokespecial <init> : ()V
    //   409: athrow
    //   410: new burp/Zsdo
    //   413: dup
    //   414: new burp/Zs2o
    //   417: dup
    //   418: invokespecial <init> : ()V
    //   421: invokespecial <init> : (Lburp/Zs2o;)V
    //   424: athrow
    //   425: new burp/Zsd8
    //   428: dup
    //   429: aload #21
    //   431: invokeinterface Zx : ()Ljava/lang/Exception;
    //   436: invokevirtual getMessage : ()Ljava/lang/String;
    //   439: invokespecial <init> : (Ljava/lang/String;)V
    //   442: athrow
    //   443: new burp/Zscr
    //   446: dup
    //   447: aload #21
    //   449: invokeinterface Zx : ()Ljava/lang/Exception;
    //   454: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   457: athrow
    //   458: new burp/Zsct
    //   461: dup
    //   462: aload #21
    //   464: invokeinterface Zx : ()Ljava/lang/Exception;
    //   469: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   472: athrow
    //   473: astore #20
    //   475: aload #20
    //   477: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   480: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   483: new burp/Zktz
    //   486: dup
    //   487: invokespecial <init> : ()V
    //   490: athrow
    // Exception table:
    //   from	to	target	type
    //   5	18	21	burp/Zgum
    //   10	29	29	burp/Zgum
    //   36	46	46	burp/Zgum
    //   68	78	78	burp/Zgum
    //   100	111	111	burp/Zgum
    //   208	220	223	burp/Zgum
    //   227	239	242	burp/Zgum
    //   246	274	274	burp/Zgum
    //   287	374	473	burp/Zgum
    //   375	382	473	burp/Zgum
    //   375	387	390	burp/Zsc5
    //   402	473	473	burp/Zgum
  }
  
  private Zsxd lambda$issueRequest$0(Zefx paramZefx, Zs38 paramZs38, Zsil paramZsil, Zzen paramZzen) {
    return this.Zd.ZE(paramZefx, paramZs38.Zy(), paramZsil, paramZzen);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zggx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */