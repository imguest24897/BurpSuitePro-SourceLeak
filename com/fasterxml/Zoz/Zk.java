package com.fasterxml.Zoz;

import com.fasterxml.Zh.Zi;
import com.fasterxml.Zm.Ze7;
import com.fasterxml.Zor.Zt;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

final class Zk extends Zl {
  private final Zis Zj;
  
  private final boolean ZO;
  
  private Zik Zm;
  
  private static final String a;
  
  Zk(Zt paramZt, Zis paramZis, boolean paramBoolean) {
    super(paramZt);
    this.Zj = paramZis;
    this.ZO = paramBoolean;
  }
  
  public static Zid ZD(Zt paramZt, Zi paramZi, Zis paramZis, com.fasterxml.Zor.Zk paramZk, Class<?> paramClass, boolean paramBoolean) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = paramBoolean | ((paramClass != null) ? 1 : 0);
    return (new Zk(paramZt, paramZis, i)).Zi(paramZi, paramZk, paramClass);
  }
  
  Zid Zi(Zi paramZi, com.fasterxml.Zor.Zk paramZk, Class<?> paramClass) {
    List<Zik> list = Zb(paramZk, paramClass);
    List<Ziq> list1 = Zu(paramZi, paramZk, paramClass);
    int i = Ziv.ZM();
    try {
      if (this.ZO) {
        try {
          if (this.Zm != null)
            try {
              if (this.ZV.ZV(this.Zm))
                this.Zm = null; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        int j = list.size();
        while (--j >= 0) {
          if (this.ZV.ZV(list.get(j))) {
            list.remove(j);
            if (i == 0)
              break; 
          } 
        } 
        j = list1.size();
        while (--j >= 0) {
          if (this.ZV.ZV(list1.get(j))) {
            list1.remove(j);
            if (i == 0)
              break; 
          } 
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return new Zid(this.Zm, list, list1);
  }
  
  private List<Zik> Zb(com.fasterxml.Zor.Zk paramZk, Class<?> paramClass) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
    //   7: aconst_null
    //   8: astore #5
    //   10: aload_1
    //   11: invokevirtual ZF : ()Z
    //   14: ifne -> 135
    //   17: aload_1
    //   18: invokevirtual Zf : ()Ljava/lang/Class;
    //   21: invokestatic Zd : (Ljava/lang/Class;)[Lcom/fasterxml/Zm/Ze7;
    //   24: astore #6
    //   26: aload #6
    //   28: astore #7
    //   30: aload #7
    //   32: arraylength
    //   33: istore #8
    //   35: iconst_0
    //   36: istore #9
    //   38: iload #9
    //   40: iload #8
    //   42: if_icmpge -> 135
    //   45: aload #7
    //   47: iload #9
    //   49: aaload
    //   50: astore #10
    //   52: aload #10
    //   54: invokevirtual ZM : ()Ljava/lang/reflect/Constructor;
    //   57: invokestatic Zt : (Ljava/lang/reflect/Constructor;)Z
    //   60: ifne -> 74
    //   63: iload_3
    //   64: ifeq -> 128
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   73: athrow
    //   74: aload #10
    //   76: invokevirtual Zk : ()I
    //   79: ifne -> 97
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   88: athrow
    //   89: aload #10
    //   91: astore #4
    //   93: iload_3
    //   94: ifeq -> 128
    //   97: aload #5
    //   99: ifnonnull -> 118
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   108: athrow
    //   109: new java/util/ArrayList
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: astore #5
    //   118: aload #5
    //   120: aload #10
    //   122: invokeinterface add : (Ljava/lang/Object;)Z
    //   127: pop
    //   128: iinc #9, 1
    //   131: iload_3
    //   132: ifeq -> 38
    //   135: aload #5
    //   137: ifnonnull -> 164
    //   140: invokestatic emptyList : ()Ljava/util/List;
    //   143: astore #6
    //   145: aload #4
    //   147: ifnonnull -> 157
    //   150: aload #6
    //   152: areturn
    //   153: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   156: athrow
    //   157: iconst_0
    //   158: istore #7
    //   160: iload_3
    //   161: ifeq -> 210
    //   164: aload #5
    //   166: invokeinterface size : ()I
    //   171: istore #7
    //   173: new java/util/ArrayList
    //   176: dup
    //   177: iload #7
    //   179: invokespecial <init> : (I)V
    //   182: astore #6
    //   184: iconst_0
    //   185: istore #8
    //   187: iload #8
    //   189: iload #7
    //   191: if_icmpge -> 210
    //   194: aload #6
    //   196: aconst_null
    //   197: invokeinterface add : (Ljava/lang/Object;)Z
    //   202: pop
    //   203: iinc #8, 1
    //   206: iload_3
    //   207: ifeq -> 187
    //   210: aload_2
    //   211: ifnull -> 448
    //   214: aconst_null
    //   215: astore #8
    //   217: aload_2
    //   218: invokestatic Zd : (Ljava/lang/Class;)[Lcom/fasterxml/Zm/Ze7;
    //   221: astore #9
    //   223: aload #9
    //   225: arraylength
    //   226: istore #10
    //   228: iconst_0
    //   229: istore #11
    //   231: iload #11
    //   233: iload #10
    //   235: if_icmpge -> 448
    //   238: aload #9
    //   240: iload #11
    //   242: aaload
    //   243: astore #12
    //   245: aload #12
    //   247: invokevirtual Zk : ()I
    //   250: ifne -> 283
    //   253: aload #4
    //   255: ifnull -> 441
    //   258: goto -> 265
    //   261: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   264: athrow
    //   265: aload_0
    //   266: aload_0
    //   267: aload #4
    //   269: aload #12
    //   271: invokevirtual ZT : (Lcom/fasterxml/Zm/Ze7;Lcom/fasterxml/Zm/Ze7;)Lcom/fasterxml/Zoz/Zik;
    //   274: putfield Zm : Lcom/fasterxml/Zoz/Zik;
    //   277: aconst_null
    //   278: astore #4
    //   280: goto -> 441
    //   283: aload #5
    //   285: ifnull -> 441
    //   288: aload #8
    //   290: ifnonnull -> 351
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   299: athrow
    //   300: iload #7
    //   302: anewarray com/fasterxml/Zoz/Zib
    //   305: astore #8
    //   307: iconst_0
    //   308: istore #13
    //   310: iload #13
    //   312: iload #7
    //   314: if_icmpge -> 351
    //   317: aload #8
    //   319: iload #13
    //   321: new com/fasterxml/Zoz/Zib
    //   324: dup
    //   325: aload #5
    //   327: iload #13
    //   329: invokeinterface get : (I)Ljava/lang/Object;
    //   334: checkcast com/fasterxml/Zm/Ze7
    //   337: invokevirtual ZM : ()Ljava/lang/reflect/Constructor;
    //   340: invokespecial <init> : (Ljava/lang/reflect/Constructor;)V
    //   343: aastore
    //   344: iinc #13, 1
    //   347: iload_3
    //   348: ifeq -> 310
    //   351: new com/fasterxml/Zoz/Zib
    //   354: dup
    //   355: aload #12
    //   357: invokevirtual ZM : ()Ljava/lang/reflect/Constructor;
    //   360: invokespecial <init> : (Ljava/lang/reflect/Constructor;)V
    //   363: astore #13
    //   365: iconst_0
    //   366: istore #14
    //   368: iload #14
    //   370: iload #7
    //   372: if_icmpge -> 441
    //   375: aload #13
    //   377: aload #8
    //   379: iload #14
    //   381: aaload
    //   382: invokevirtual equals : (Ljava/lang/Object;)Z
    //   385: ifeq -> 427
    //   388: aload #6
    //   390: iload #14
    //   392: aload_0
    //   393: aload #5
    //   395: iload #14
    //   397: invokeinterface get : (I)Ljava/lang/Object;
    //   402: checkcast com/fasterxml/Zm/Ze7
    //   405: aload #12
    //   407: invokevirtual Zg : (Lcom/fasterxml/Zm/Ze7;Lcom/fasterxml/Zm/Ze7;)Lcom/fasterxml/Zoz/Zik;
    //   410: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   415: pop
    //   416: iload_3
    //   417: ifeq -> 441
    //   420: goto -> 427
    //   423: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   426: athrow
    //   427: iinc #14, 1
    //   430: iload_3
    //   431: ifeq -> 368
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   440: athrow
    //   441: iinc #11, 1
    //   444: iload_3
    //   445: ifeq -> 231
    //   448: aload #4
    //   450: ifnull -> 471
    //   453: aload_0
    //   454: aload_0
    //   455: aload #4
    //   457: aconst_null
    //   458: invokevirtual ZT : (Lcom/fasterxml/Zm/Ze7;Lcom/fasterxml/Zm/Ze7;)Lcom/fasterxml/Zoz/Zik;
    //   461: putfield Zm : Lcom/fasterxml/Zoz/Zik;
    //   464: goto -> 471
    //   467: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   470: athrow
    //   471: iconst_0
    //   472: istore #8
    //   474: iload #8
    //   476: iload #7
    //   478: if_icmpge -> 541
    //   481: aload #6
    //   483: iload #8
    //   485: invokeinterface get : (I)Ljava/lang/Object;
    //   490: checkcast com/fasterxml/Zoz/Zik
    //   493: astore #9
    //   495: aload #9
    //   497: ifnonnull -> 534
    //   500: aload #6
    //   502: iload #8
    //   504: aload_0
    //   505: aload #5
    //   507: iload #8
    //   509: invokeinterface get : (I)Ljava/lang/Object;
    //   514: checkcast com/fasterxml/Zm/Ze7
    //   517: aconst_null
    //   518: invokevirtual Zg : (Lcom/fasterxml/Zm/Ze7;Lcom/fasterxml/Zm/Ze7;)Lcom/fasterxml/Zoz/Zik;
    //   521: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   526: pop
    //   527: goto -> 534
    //   530: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   533: athrow
    //   534: iinc #8, 1
    //   537: iload_3
    //   538: ifeq -> 474
    //   541: aload #6
    //   543: areturn
    // Exception table:
    //   from	to	target	type
    //   52	67	70	java/lang/IllegalStateException
    //   63	82	85	java/lang/IllegalStateException
    //   93	102	105	java/lang/IllegalStateException
    //   145	153	153	java/lang/IllegalStateException
    //   245	258	261	java/lang/IllegalStateException
    //   283	293	296	java/lang/IllegalStateException
    //   375	420	423	java/lang/IllegalStateException
    //   388	434	437	java/lang/IllegalStateException
    //   448	464	467	java/lang/IllegalStateException
    //   495	527	530	java/lang/IllegalStateException
  }
  
  private List<Ziq> Zu(Zi paramZi, com.fasterxml.Zor.Zk paramZk, Class<?> paramClass) {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: aconst_null
    //   4: astore #5
    //   6: aload_2
    //   7: invokevirtual Zf : ()Ljava/lang/Class;
    //   10: invokestatic ZB : (Ljava/lang/Class;)[Ljava/lang/reflect/Method;
    //   13: astore #6
    //   15: aload #6
    //   17: arraylength
    //   18: istore #7
    //   20: istore #4
    //   22: iconst_0
    //   23: istore #8
    //   25: iload #8
    //   27: iload #7
    //   29: if_icmpge -> 98
    //   32: aload #6
    //   34: iload #8
    //   36: aaload
    //   37: astore #9
    //   39: aload #9
    //   41: invokestatic ZA : (Ljava/lang/reflect/Method;)Z
    //   44: ifne -> 59
    //   47: iload #4
    //   49: ifne -> 90
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   58: athrow
    //   59: aload #5
    //   61: ifnonnull -> 80
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   70: athrow
    //   71: new java/util/ArrayList
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: astore #5
    //   80: aload #5
    //   82: aload #9
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: iinc #8, 1
    //   93: iload #4
    //   95: ifne -> 25
    //   98: aload #5
    //   100: ifnonnull -> 111
    //   103: invokestatic emptyList : ()Ljava/util/List;
    //   106: areturn
    //   107: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   110: athrow
    //   111: aload_0
    //   112: getfield Zj : Lcom/fasterxml/Zoz/Zis;
    //   115: astore #6
    //   117: aload #5
    //   119: invokeinterface size : ()I
    //   124: istore #7
    //   126: new java/util/ArrayList
    //   129: dup
    //   130: iload #7
    //   132: invokespecial <init> : (I)V
    //   135: astore #8
    //   137: iconst_0
    //   138: istore #9
    //   140: iload #9
    //   142: iload #7
    //   144: if_icmpge -> 164
    //   147: aload #8
    //   149: aconst_null
    //   150: invokeinterface add : (Ljava/lang/Object;)Z
    //   155: pop
    //   156: iinc #9, 1
    //   159: iload #4
    //   161: ifne -> 140
    //   164: aload_3
    //   165: ifnull -> 379
    //   168: aconst_null
    //   169: astore #9
    //   171: aload_3
    //   172: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   175: astore #10
    //   177: aload #10
    //   179: arraylength
    //   180: istore #11
    //   182: iconst_0
    //   183: istore #12
    //   185: iload #12
    //   187: iload #11
    //   189: if_icmpge -> 379
    //   192: aload #10
    //   194: iload #12
    //   196: aaload
    //   197: astore #13
    //   199: aload #13
    //   201: invokestatic ZA : (Ljava/lang/reflect/Method;)Z
    //   204: ifne -> 219
    //   207: iload #4
    //   209: ifne -> 371
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   218: athrow
    //   219: aload #9
    //   221: ifnonnull -> 280
    //   224: goto -> 231
    //   227: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   230: athrow
    //   231: iload #7
    //   233: anewarray com/fasterxml/Zoz/Zib
    //   236: astore #9
    //   238: iconst_0
    //   239: istore #14
    //   241: iload #14
    //   243: iload #7
    //   245: if_icmpge -> 280
    //   248: aload #9
    //   250: iload #14
    //   252: new com/fasterxml/Zoz/Zib
    //   255: dup
    //   256: aload #5
    //   258: iload #14
    //   260: invokeinterface get : (I)Ljava/lang/Object;
    //   265: checkcast java/lang/reflect/Method
    //   268: invokespecial <init> : (Ljava/lang/reflect/Method;)V
    //   271: aastore
    //   272: iinc #14, 1
    //   275: iload #4
    //   277: ifne -> 241
    //   280: new com/fasterxml/Zoz/Zib
    //   283: dup
    //   284: aload #13
    //   286: invokespecial <init> : (Ljava/lang/reflect/Method;)V
    //   289: astore #14
    //   291: iconst_0
    //   292: istore #15
    //   294: iload #15
    //   296: iload #7
    //   298: if_icmpge -> 371
    //   301: aload #14
    //   303: aload #9
    //   305: iload #15
    //   307: aaload
    //   308: invokevirtual equals : (Ljava/lang/Object;)Z
    //   311: ifeq -> 356
    //   314: aload #8
    //   316: iload #15
    //   318: aload_0
    //   319: aload #5
    //   321: iload #15
    //   323: invokeinterface get : (I)Ljava/lang/Object;
    //   328: checkcast java/lang/reflect/Method
    //   331: aload #6
    //   333: aload #13
    //   335: invokevirtual ZF : (Ljava/lang/reflect/Method;Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Method;)Lcom/fasterxml/Zoz/Ziq;
    //   338: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   343: pop
    //   344: iload #4
    //   346: ifne -> 371
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   355: athrow
    //   356: iinc #15, 1
    //   359: iload #4
    //   361: ifne -> 294
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   370: athrow
    //   371: iinc #12, 1
    //   374: iload #4
    //   376: ifne -> 185
    //   379: iconst_0
    //   380: istore #9
    //   382: iload #9
    //   384: iload #7
    //   386: if_icmpge -> 460
    //   389: aload #8
    //   391: iload #9
    //   393: invokeinterface get : (I)Ljava/lang/Object;
    //   398: checkcast com/fasterxml/Zoz/Ziq
    //   401: astore #10
    //   403: aload #10
    //   405: ifnonnull -> 452
    //   408: aload #5
    //   410: iload #9
    //   412: invokeinterface get : (I)Ljava/lang/Object;
    //   417: checkcast java/lang/reflect/Method
    //   420: astore #11
    //   422: aload #11
    //   424: aload_2
    //   425: aload_1
    //   426: aload #6
    //   428: invokestatic Zv : (Ljava/lang/reflect/Method;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zh/Zi;Lcom/fasterxml/Zoz/Zis;)Lcom/fasterxml/Zoz/Zis;
    //   431: astore #12
    //   433: aload #8
    //   435: iload #9
    //   437: aload_0
    //   438: aload #11
    //   440: aload #12
    //   442: aconst_null
    //   443: invokevirtual ZF : (Ljava/lang/reflect/Method;Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Method;)Lcom/fasterxml/Zoz/Ziq;
    //   446: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   451: pop
    //   452: iinc #9, 1
    //   455: iload #4
    //   457: ifne -> 382
    //   460: aload #8
    //   462: areturn
    // Exception table:
    //   from	to	target	type
    //   39	52	55	java/lang/IllegalStateException
    //   47	64	67	java/lang/IllegalStateException
    //   98	107	107	java/lang/IllegalStateException
    //   199	212	215	java/lang/IllegalStateException
    //   207	224	227	java/lang/IllegalStateException
    //   301	349	352	java/lang/IllegalStateException
    //   314	364	367	java/lang/IllegalStateException
  }
  
  private static boolean ZA(Method paramMethod) {
    try {
      if (!Modifier.isStatic(paramMethod.getModifiers()))
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !paramMethod.isSynthetic();
  }
  
  protected Zik ZT(Ze7 paramZe71, Ze7 paramZe72) {
    return new Zik(this.Zj, paramZe71.ZM(), ZJ(paramZe71, paramZe72), Zb);
  }
  
  protected Zik Zg(Ze7 paramZe71, Ze7 paramZe72) {
    // Byte code:
    //   0: invokestatic Zv : ()I
    //   3: aload_1
    //   4: invokevirtual Zk : ()I
    //   7: istore #4
    //   9: istore_3
    //   10: aload_0
    //   11: getfield ZV : Lcom/fasterxml/Zor/Zt;
    //   14: ifnonnull -> 45
    //   17: new com/fasterxml/Zoz/Zik
    //   20: dup
    //   21: aload_0
    //   22: getfield Zj : Lcom/fasterxml/Zoz/Zis;
    //   25: aload_1
    //   26: invokevirtual ZM : ()Ljava/lang/reflect/Constructor;
    //   29: invokestatic Zs : ()Lcom/fasterxml/Zoz/Zih;
    //   32: iload #4
    //   34: invokestatic Zm : (I)[Lcom/fasterxml/Zoz/Zih;
    //   37: invokespecial <init> : (Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Constructor;Lcom/fasterxml/Zoz/Zih;[Lcom/fasterxml/Zoz/Zih;)V
    //   40: areturn
    //   41: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   44: athrow
    //   45: iload #4
    //   47: ifne -> 79
    //   50: new com/fasterxml/Zoz/Zik
    //   53: dup
    //   54: aload_0
    //   55: getfield Zj : Lcom/fasterxml/Zoz/Zis;
    //   58: aload_1
    //   59: invokevirtual ZM : ()Ljava/lang/reflect/Constructor;
    //   62: aload_0
    //   63: aload_1
    //   64: aload_2
    //   65: invokespecial ZJ : (Lcom/fasterxml/Zm/Ze7;Lcom/fasterxml/Zm/Ze7;)Lcom/fasterxml/Zoz/Zih;
    //   68: getstatic com/fasterxml/Zoz/Zk.Zb : [Lcom/fasterxml/Zoz/Zih;
    //   71: invokespecial <init> : (Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Constructor;Lcom/fasterxml/Zoz/Zih;[Lcom/fasterxml/Zoz/Zih;)V
    //   74: areturn
    //   75: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   78: athrow
    //   79: aload_1
    //   80: invokevirtual ZD : ()[[Ljava/lang/annotation/Annotation;
    //   83: astore #6
    //   85: iload #4
    //   87: aload #6
    //   89: arraylength
    //   90: if_icmpeq -> 296
    //   93: aconst_null
    //   94: astore #5
    //   96: aload_1
    //   97: invokevirtual ZX : ()Ljava/lang/Class;
    //   100: astore #7
    //   102: aload #7
    //   104: invokestatic Zb : (Ljava/lang/Class;)Z
    //   107: ifeq -> 168
    //   110: iload #4
    //   112: aload #6
    //   114: arraylength
    //   115: iconst_2
    //   116: iadd
    //   117: if_icmpne -> 168
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   126: athrow
    //   127: aload #6
    //   129: astore #8
    //   131: aload #8
    //   133: arraylength
    //   134: iconst_2
    //   135: iadd
    //   136: anewarray [Ljava/lang/annotation/Annotation;
    //   139: astore #6
    //   141: aload #8
    //   143: iconst_0
    //   144: aload #6
    //   146: iconst_2
    //   147: aload #8
    //   149: arraylength
    //   150: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   153: aload_0
    //   154: aload #6
    //   156: aconst_null
    //   157: checkcast [[Ljava/lang/annotation/Annotation;
    //   160: invokespecial ZX : ([[Ljava/lang/annotation/Annotation;[[Ljava/lang/annotation/Annotation;)[Lcom/fasterxml/Zoz/Zih;
    //   163: astore #5
    //   165: goto -> 238
    //   168: aload #7
    //   170: invokevirtual isMemberClass : ()Z
    //   173: ifeq -> 238
    //   176: iload #4
    //   178: aload #6
    //   180: arraylength
    //   181: iconst_1
    //   182: iadd
    //   183: if_icmpne -> 238
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   192: athrow
    //   193: aload #6
    //   195: astore #8
    //   197: aload #8
    //   199: arraylength
    //   200: iconst_1
    //   201: iadd
    //   202: anewarray [Ljava/lang/annotation/Annotation;
    //   205: astore #6
    //   207: aload #8
    //   209: iconst_0
    //   210: aload #6
    //   212: iconst_1
    //   213: aload #8
    //   215: arraylength
    //   216: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   219: aload #6
    //   221: iconst_0
    //   222: getstatic com/fasterxml/Zoz/Zk.ZE : [Ljava/lang/annotation/Annotation;
    //   225: aastore
    //   226: aload_0
    //   227: aload #6
    //   229: aconst_null
    //   230: checkcast [[Ljava/lang/annotation/Annotation;
    //   233: invokespecial ZX : ([[Ljava/lang/annotation/Annotation;[[Ljava/lang/annotation/Annotation;)[Lcom/fasterxml/Zoz/Zih;
    //   236: astore #5
    //   238: aload #5
    //   240: ifnonnull -> 292
    //   243: new java/lang/IllegalStateException
    //   246: dup
    //   247: getstatic com/fasterxml/Zoz/Zk.a : Ljava/lang/String;
    //   250: iconst_3
    //   251: anewarray java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: aload_1
    //   257: invokevirtual ZX : ()Ljava/lang/Class;
    //   260: invokevirtual getName : ()Ljava/lang/String;
    //   263: aastore
    //   264: dup
    //   265: iconst_1
    //   266: iload #4
    //   268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   271: aastore
    //   272: dup
    //   273: iconst_2
    //   274: aload #6
    //   276: arraylength
    //   277: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   280: aastore
    //   281: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    //   288: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   291: athrow
    //   292: iload_3
    //   293: ifeq -> 330
    //   296: aload_0
    //   297: aload #6
    //   299: aload_2
    //   300: ifnonnull -> 321
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   309: athrow
    //   310: aconst_null
    //   311: checkcast [[Ljava/lang/annotation/Annotation;
    //   314: goto -> 325
    //   317: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   320: athrow
    //   321: aload_2
    //   322: invokevirtual ZD : ()[[Ljava/lang/annotation/Annotation;
    //   325: invokespecial ZX : ([[Ljava/lang/annotation/Annotation;[[Ljava/lang/annotation/Annotation;)[Lcom/fasterxml/Zoz/Zih;
    //   328: astore #5
    //   330: new com/fasterxml/Zoz/Zik
    //   333: dup
    //   334: aload_0
    //   335: getfield Zj : Lcom/fasterxml/Zoz/Zis;
    //   338: aload_1
    //   339: invokevirtual ZM : ()Ljava/lang/reflect/Constructor;
    //   342: aload_0
    //   343: aload_1
    //   344: aload_2
    //   345: invokespecial ZJ : (Lcom/fasterxml/Zm/Ze7;Lcom/fasterxml/Zm/Ze7;)Lcom/fasterxml/Zoz/Zih;
    //   348: aload #5
    //   350: invokespecial <init> : (Lcom/fasterxml/Zoz/Zis;Ljava/lang/reflect/Constructor;Lcom/fasterxml/Zoz/Zih;[Lcom/fasterxml/Zoz/Zih;)V
    //   353: areturn
    // Exception table:
    //   from	to	target	type
    //   10	41	41	java/lang/IllegalStateException
    //   45	75	75	java/lang/IllegalStateException
    //   102	120	123	java/lang/IllegalStateException
    //   168	186	189	java/lang/IllegalStateException
    //   238	288	288	java/lang/IllegalStateException
    //   292	303	306	java/lang/IllegalStateException
    //   296	317	317	java/lang/IllegalStateException
  }
  
  protected Ziq ZF(Method paramMethod1, Zis paramZis, Method paramMethod2) {
    int i = paramMethod1.getParameterCount();
    try {
      if (this.ZV == null)
        return new Ziq(paramZis, paramMethod1, Zs(), Zm(i)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (i == 0)
        return new Ziq(paramZis, paramMethod1, ZF(paramMethod1, paramMethod2), Zb); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return new Ziq(paramZis, paramMethod1, ZF(paramMethod1, paramMethod2), ZX(paramMethod1.getParameterAnnotations(), (paramMethod2 == null) ? (Annotation[][])null : paramMethod2.getParameterAnnotations()));
  }
  
  private Zih[] ZX(Annotation[][] paramArrayOfAnnotation1, Annotation[][] paramArrayOfAnnotation2) {
    int i = Ziv.ZM();
    if (this.ZO) {
      int j = paramArrayOfAnnotation1.length;
      Zih[] arrayOfZih = new Zih[j];
      byte b = 0;
      while (b < j) {
        Zie zie = Zc(Zie.Z_(), paramArrayOfAnnotation1[b]);
        if (paramArrayOfAnnotation2 != null)
          zie = Zc(zie, paramArrayOfAnnotation2[b]); 
        arrayOfZih[b] = zie.Zk();
        b++;
        if (i == 0)
          break; 
      } 
      return arrayOfZih;
    } 
    return Zb;
  }
  
  private Zih ZJ(Ze7 paramZe71, Ze7 paramZe72) {
    if (this.ZO) {
      Zie zie = Z_(paramZe71.ZN());
      if (paramZe72 != null)
        zie = Zc(zie, paramZe72.ZN()); 
      return zie.Zk();
    } 
    return Zs();
  }
  
  private final Zih ZF(AnnotatedElement paramAnnotatedElement1, AnnotatedElement paramAnnotatedElement2) {
    Zie zie = Z_(paramAnnotatedElement1.getDeclaredAnnotations());
    if (paramAnnotatedElement2 != null)
      zie = Zc(zie, paramAnnotatedElement2.getDeclaredAnnotations()); 
    return zie.Zk();
  }
  
  private static boolean Zt(Constructor<?> paramConstructor) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return !paramConstructor.isSynthetic();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc '}wf>LtXUfq>MgU`l"QaF `w#P5Rq#iQ5\p#!KfYw`$5#s-PtYwf>Q.Pg#?GaGUlelC{Zwb8KzZ'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zoz/Zk.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #88
    //   87: goto -> 112
    //   90: bipush #46
    //   92: goto -> 112
    //   95: bipush #46
    //   97: goto -> 112
    //   100: bipush #97
    //   102: goto -> 112
    //   105: bipush #15
    //   107: goto -> 112
    //   110: bipush #56
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zoz\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */