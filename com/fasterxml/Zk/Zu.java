package com.fasterxml.Zk;

import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Z_;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zoz.Ziz;
import com.fasterxml.Zoz.Zp;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zqg;
import com.fasterxml.Zw.Zk;
import com.fasterxml.Zz_;

public class Zu {
  private static final Object ZB;
  
  protected final Zy7 Z_;
  
  protected final Zyv Zz;
  
  protected final Zt Zn;
  
  protected Object ZX;
  
  protected final Zz_ ZE;
  
  protected final boolean ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zu(Zy7 paramZy7, Zyv paramZyv) {
    this.Z_ = paramZy7;
    this.Zz = paramZyv;
    Zz_ zz_ = Zz_.ZA(paramZyv.Zk(Zz_.Zt()), paramZy7.ZN(paramZyv.Zl(), Zz_.Zt()));
    try {
      this.ZE = Zz_.ZA(paramZy7.Zm(), zz_);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZZ = (zz_.Zs() == Zqg.NON_DEFAULT);
    this.Zn = this.Z_.ZK();
  }
  
  protected Zt ZD(Zyi paramZyi, Zp paramZp, Zk paramZk, Zyd<?> paramZyd, Za paramZa1, Za paramZa2, Ziz paramZiz, boolean paramBoolean) throws Zy_ {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore #9
    //   5: aload_0
    //   6: aload #7
    //   8: iload #8
    //   10: aload_3
    //   11: invokevirtual Zz : (Lcom/fasterxml/Zoz/Ziv;ZLcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zk;
    //   14: astore #10
    //   16: goto -> 65
    //   19: astore #11
    //   21: aload_2
    //   22: ifnonnull -> 43
    //   25: aload_1
    //   26: aload_3
    //   27: aload #11
    //   29: invokestatic Zr : (Ljava/lang/Throwable;)Ljava/lang/String;
    //   32: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   35: checkcast com/fasterxml/Zk/Zt
    //   38: areturn
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: aload_1
    //   44: aload_0
    //   45: getfield Zz : Lcom/fasterxml/Zor/Zyv;
    //   48: aload_2
    //   49: aload #11
    //   51: invokestatic Zr : (Ljava/lang/Throwable;)Ljava/lang/String;
    //   54: iconst_0
    //   55: anewarray java/lang/Object
    //   58: invokevirtual ZH : (Lcom/fasterxml/Zor/Zyv;Lcom/fasterxml/Zoz/Zp;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   61: checkcast com/fasterxml/Zk/Zt
    //   64: areturn
    //   65: aload #6
    //   67: ifnull -> 173
    //   70: aload #10
    //   72: ifnonnull -> 85
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: aload_3
    //   83: astore #10
    //   85: aload #10
    //   87: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   90: astore #11
    //   92: aload #11
    //   94: ifnonnull -> 157
    //   97: aload_1
    //   98: aload_0
    //   99: getfield Zz : Lcom/fasterxml/Zor/Zyv;
    //   102: aload_2
    //   103: new java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: sipush #-26060
    //   113: sipush #11871
    //   116: invokestatic a : (II)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload #10
    //   124: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   127: sipush #-26064
    //   130: sipush #-23133
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: invokevirtual toString : ()Ljava/lang/String;
    //   142: iconst_0
    //   143: anewarray java/lang/Object
    //   146: invokevirtual ZH : (Lcom/fasterxml/Zor/Zyv;Lcom/fasterxml/Zoz/Zp;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   149: pop
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload #10
    //   159: aload #6
    //   161: invokevirtual ZW : (Ljava/lang/Object;)Lcom/fasterxml/Zor/Zk;
    //   164: astore #10
    //   166: aload #10
    //   168: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   171: astore #11
    //   173: aconst_null
    //   174: astore #11
    //   176: iconst_0
    //   177: istore #12
    //   179: aload #10
    //   181: ifnonnull -> 192
    //   184: aload_3
    //   185: goto -> 194
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: aload #10
    //   194: astore #13
    //   196: aload_2
    //   197: invokevirtual Zj : ()Lcom/fasterxml/Zoz/Ziz;
    //   200: astore #14
    //   202: aload #14
    //   204: ifnonnull -> 237
    //   207: aload_1
    //   208: aload_0
    //   209: getfield Zz : Lcom/fasterxml/Zor/Zyv;
    //   212: aload_2
    //   213: sipush #-26058
    //   216: sipush #-29016
    //   219: invokestatic a : (II)Ljava/lang/String;
    //   222: iconst_0
    //   223: anewarray java/lang/Object
    //   226: invokevirtual ZH : (Lcom/fasterxml/Zor/Zyv;Lcom/fasterxml/Zoz/Zp;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   229: checkcast com/fasterxml/Zk/Zt
    //   232: areturn
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload #14
    //   239: invokevirtual ZN : ()Ljava/lang/Class;
    //   242: astore #15
    //   244: aload_0
    //   245: getfield Z_ : Lcom/fasterxml/Zor/Zy7;
    //   248: aload #13
    //   250: invokevirtual Zf : ()Ljava/lang/Class;
    //   253: aload #15
    //   255: aload_0
    //   256: getfield ZE : Lcom/fasterxml/Zz_;
    //   259: invokevirtual Zg : (Ljava/lang/Class;Ljava/lang/Class;Lcom/fasterxml/Zz_;)Lcom/fasterxml/Zz_;
    //   262: astore #16
    //   264: aload #16
    //   266: aload_2
    //   267: invokevirtual Z_ : ()Lcom/fasterxml/Zz_;
    //   270: invokevirtual ZI : (Lcom/fasterxml/Zz_;)Lcom/fasterxml/Zz_;
    //   273: astore #16
    //   275: aload #16
    //   277: invokevirtual Zs : ()Lcom/fasterxml/Zqg;
    //   280: astore #17
    //   282: aload #17
    //   284: getstatic com/fasterxml/Zqg.USE_DEFAULTS : Lcom/fasterxml/Zqg;
    //   287: if_acmpne -> 295
    //   290: getstatic com/fasterxml/Zqg.ALWAYS : Lcom/fasterxml/Zqg;
    //   293: astore #17
    //   295: getstatic com/fasterxml/Zk/Zm.ZC : [I
    //   298: aload #17
    //   300: invokevirtual ordinal : ()I
    //   303: iaload
    //   304: tableswitch default -> 536, 1 -> 344, 2 -> 488, 3 -> 507, 4 -> 518, 5 -> 533, 6 -> 536
    //   344: aload_0
    //   345: getfield ZZ : Z
    //   348: ifeq -> 437
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   357: athrow
    //   358: aload_0
    //   359: invokevirtual ZD : ()Ljava/lang/Object;
    //   362: dup
    //   363: astore #18
    //   365: ifnull -> 437
    //   368: aload_1
    //   369: getstatic com/fasterxml/Zor/Zy9.CAN_OVERRIDE_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   372: invokevirtual Zm : (Lcom/fasterxml/Zor/Zy9;)Z
    //   375: ifeq -> 407
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   384: athrow
    //   385: aload #7
    //   387: aload_0
    //   388: getfield Z_ : Lcom/fasterxml/Zor/Zy7;
    //   391: getstatic com/fasterxml/Zor/Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   394: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   397: invokevirtual Zh : (Z)V
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   406: athrow
    //   407: aload #7
    //   409: aload #18
    //   411: invokevirtual ZA : (Ljava/lang/Object;)Ljava/lang/Object;
    //   414: astore #11
    //   416: goto -> 447
    //   419: astore #19
    //   421: aload_0
    //   422: aload #19
    //   424: aload_2
    //   425: invokevirtual ZT : ()Ljava/lang/String;
    //   428: aload #18
    //   430: invokevirtual ZS : (Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   433: pop
    //   434: goto -> 447
    //   437: aload #13
    //   439: invokestatic ZQ : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   442: astore #11
    //   444: iconst_1
    //   445: istore #12
    //   447: aload #11
    //   449: ifnonnull -> 460
    //   452: iconst_1
    //   453: istore #12
    //   455: iload #9
    //   457: ifne -> 573
    //   460: aload #11
    //   462: invokevirtual getClass : ()Ljava/lang/Class;
    //   465: invokevirtual isArray : ()Z
    //   468: ifeq -> 573
    //   471: goto -> 478
    //   474: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   477: athrow
    //   478: aload #11
    //   480: invokestatic Zp : (Ljava/lang/Object;)Ljava/lang/Object;
    //   483: astore #11
    //   485: goto -> 573
    //   488: iconst_1
    //   489: istore #12
    //   491: aload #13
    //   493: invokevirtual ZP : ()Z
    //   496: ifeq -> 573
    //   499: getstatic com/fasterxml/Zk/Zt.Zo : Ljava/lang/Object;
    //   502: astore #11
    //   504: goto -> 573
    //   507: iconst_1
    //   508: istore #12
    //   510: getstatic com/fasterxml/Zk/Zt.Zo : Ljava/lang/Object;
    //   513: astore #11
    //   515: goto -> 573
    //   518: aload_1
    //   519: aload_2
    //   520: aload #16
    //   522: invokevirtual ZQ : ()Ljava/lang/Class;
    //   525: invokevirtual ZQ : (Lcom/fasterxml/Zoz/Zp;Ljava/lang/Class;)Ljava/lang/Object;
    //   528: astore #11
    //   530: goto -> 573
    //   533: iconst_1
    //   534: istore #12
    //   536: getstatic com/fasterxml/Zor/Zy0.WRITE_EMPTY_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   539: astore #19
    //   541: aload #13
    //   543: invokevirtual ZH : ()Z
    //   546: ifeq -> 573
    //   549: aload_0
    //   550: getfield Z_ : Lcom/fasterxml/Zor/Zy7;
    //   553: aload #19
    //   555: invokevirtual Zo : (Lcom/fasterxml/Zor/Zy0;)Z
    //   558: ifne -> 573
    //   561: goto -> 568
    //   564: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   567: athrow
    //   568: getstatic com/fasterxml/Zk/Zt.Zo : Ljava/lang/Object;
    //   571: astore #11
    //   573: aload_2
    //   574: invokevirtual ZR : ()[Ljava/lang/Class;
    //   577: astore #18
    //   579: aload #18
    //   581: ifnonnull -> 593
    //   584: aload_0
    //   585: getfield Zz : Lcom/fasterxml/Zor/Zyv;
    //   588: invokevirtual Zd : ()[Ljava/lang/Class;
    //   591: astore #18
    //   593: aload_0
    //   594: aload_2
    //   595: aload #7
    //   597: aload_0
    //   598: getfield Zz : Lcom/fasterxml/Zor/Zyv;
    //   601: invokevirtual Zy : ()Lcom/fasterxml/Zm/Z_;
    //   604: aload_3
    //   605: aload #4
    //   607: aload #5
    //   609: aload #10
    //   611: iload #12
    //   613: aload #11
    //   615: aload #18
    //   617: invokevirtual ZF : (Lcom/fasterxml/Zoz/Zp;Lcom/fasterxml/Zoz/Ziz;Lcom/fasterxml/Zm/Z_;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyd;Lcom/fasterxml/Zp/Za;Lcom/fasterxml/Zor/Zk;ZLjava/lang/Object;[Ljava/lang/Class;)Lcom/fasterxml/Zk/Zt;
    //   620: astore #19
    //   622: aload_0
    //   623: getfield Zn : Lcom/fasterxml/Zor/Zt;
    //   626: aload #7
    //   628: invokevirtual Zl : (Lcom/fasterxml/Zoz/Ziv;)Ljava/lang/Object;
    //   631: astore #20
    //   633: aload #20
    //   635: ifnull -> 658
    //   638: aload #19
    //   640: aload_1
    //   641: aload #7
    //   643: aload #20
    //   645: invokevirtual ZW : (Lcom/fasterxml/Zoz/Ziv;Ljava/lang/Object;)Lcom/fasterxml/Zor/Zyd;
    //   648: invokevirtual ZA : (Lcom/fasterxml/Zor/Zyd;)V
    //   651: goto -> 658
    //   654: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   657: athrow
    //   658: aload_0
    //   659: getfield Zn : Lcom/fasterxml/Zor/Zt;
    //   662: aload #7
    //   664: invokevirtual Za : (Lcom/fasterxml/Zoz/Ziz;)Lcom/fasterxml/Zm/Zee;
    //   667: astore #21
    //   669: aload #21
    //   671: ifnull -> 683
    //   674: aload #19
    //   676: aload #21
    //   678: invokevirtual ZU : (Lcom/fasterxml/Zm/Zee;)Lcom/fasterxml/Zk/Zt;
    //   681: astore #19
    //   683: aload #19
    //   685: areturn
    // Exception table:
    //   from	to	target	type
    //   5	16	19	com/fasterxml/Zor/Zy_
    //   21	39	39	com/fasterxml/Zor/Zy_
    //   65	75	78	com/fasterxml/Zor/Zy_
    //   92	150	153	com/fasterxml/Zor/Zy_
    //   179	188	188	com/fasterxml/Zor/Zy_
    //   202	233	233	com/fasterxml/Zor/Zy_
    //   295	351	354	com/fasterxml/Zor/Zy_
    //   365	378	381	com/fasterxml/Zor/Zy_
    //   368	400	403	com/fasterxml/Zor/Zy_
    //   407	416	419	java/lang/Exception
    //   455	471	474	com/fasterxml/Zor/Zy_
    //   541	561	564	com/fasterxml/Zor/Zy_
    //   633	651	654	com/fasterxml/Zor/Zy_
  }
  
  protected Zt ZF(Zp paramZp, Ziz paramZiz, Z_ paramZ_, Zk paramZk1, Zyd<?> paramZyd, Za paramZa, Zk paramZk2, boolean paramBoolean, Object paramObject, Class<?>[] paramArrayOfClass) throws Zy_ {
    return new Zt(paramZp, paramZiz, paramZ_, paramZk1, paramZyd, paramZa, paramZk2, paramBoolean, paramObject, paramArrayOfClass);
  }
  
  protected Zk Zz(Ziv paramZiv, boolean paramBoolean, Zk paramZk) throws Zy_ {
    Zk zk = this.Zn.ZO((Zf)this.Z_, paramZiv, paramZk);
    if (zk != paramZk) {
      Class<?> clazz1 = zk.Zf();
      Class<?> clazz2 = paramZk.Zf();
      try {
        if (!clazz1.isAssignableFrom(clazz2))
          try {
            if (!clazz2.isAssignableFrom(clazz1))
              throw new IllegalArgumentException(a(-26059, -1613) + paramZiv.ZW() + a(-26057, 1547) + clazz1.getName() + a(-26063, -6508) + clazz2.getName()); 
          } catch (Zy_ zy_) {
            throw a(null);
          }  
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      paramBoolean = true;
      paramZk = zk;
    } 
    Zk zk1 = this.Zn.Zx(paramZiv);
    try {
      if (zk1 != null)
        try {
          if (zk1 != Zk.DEFAULT_TYPING) {
            try {
            
            } catch (Zy_ zy_) {
              throw a(null);
            } 
            paramBoolean = (zk1 == Zk.STATIC);
          } 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (paramBoolean)
        return paramZk.Zq(); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return null;
  }
  
  protected Object ZD() {
    Object object = this.ZX;
    if (object == null) {
      object = this.Zz.ZM(this.Z_.Zd());
      if (object == null)
        object = ZB; 
      this.ZX = object;
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (object == ZB) ? null : this.ZX;
  }
  
  protected Object ZS(Exception paramException, String paramString, Object paramObject) {
    Throwable throwable = paramException;
    int i = Za.ZH();
    while (throwable.getCause() != null) {
      throwable = throwable.getCause();
      if (i != 0)
        break; 
    } 
    Zx.Zo(throwable);
    Zx.Zq(throwable);
    throw new IllegalArgumentException(a(-26052, -20841) + paramString + a(-26062, -20336) + paramObject.getClass().getName() + a(-26061, -7429));
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'qÌ·¾Ìb$ªÚ£Ð±¨-`K!tÑR{©2x6wDï lk7ÒEíz û§®EÊ,ÂõyÅîåFR!i:Zþ£ÈTabÔg×¾\\r:«o|»ñÈB\\n\\b\\t\\fNCNSÓ¬¥Ð}¨Ê+3ã¼Á&7o£@XcnK²ùJú@Ý%MzÐ&\\bÑ#kxQ5ä¡\\rwcY½¢àÅâ µ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #19
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #14
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
    //   68: ldc 'wSÚÉMçÅKA±z>ìñÆ\ô=ÖOcD¿'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #55
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
    //   129: putstatic com/fasterxml/Zk/Zu.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zk/Zu.b : [Ljava/lang/String;
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
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #81
    //   219: goto -> 244
    //   222: bipush #76
    //   224: goto -> 244
    //   227: bipush #124
    //   229: goto -> 244
    //   232: bipush #53
    //   234: goto -> 244
    //   237: bipush #52
    //   239: goto -> 244
    //   242: bipush #61
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
    //   300: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   303: putstatic com/fasterxml/Zk/Zu.ZB : Ljava/lang/Object;
    //   306: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9A34) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */