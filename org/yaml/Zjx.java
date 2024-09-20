package org.yaml;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zjx {
  protected final Zjy Zm;
  
  private final Z_r ZF;
  
  private final Map<String, Zi> Zl;
  
  private final Set<Zi> ZZ;
  
  private int Zk = 0;
  
  private final Ztw Zd;
  
  private final Zj8 ZQ;
  
  private final Zj8 ZL;
  
  private int Zn = 0;
  
  private final int ZW;
  
  private static String Zh;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zjx(Zjy paramZjy, Z_r paramZ_r, Ztw paramZtw) {
    if (paramZjy == null)
      throw new NullPointerException(a(13408, 2831)); 
    try {
      if (paramZ_r == null)
        throw new NullPointerException(a(13419, 31253)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramZtw == null)
        throw new NullPointerException(a(13409, -6815)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zm = paramZjy;
    this.ZF = paramZ_r;
    this.Zl = new HashMap<>();
    this.ZZ = new HashSet<>();
    this.Zd = paramZtw;
    this.ZQ = new Zj8(paramZjy, new Zto[] { Zto.BLANK_LINE, Zto.BLOCK });
    this.ZL = new Zj8(paramZjy, new Zto[] { Zto.IN_LINE });
    this.ZW = paramZtw.ZP();
  }
  
  public Zi Zl() {
    this.ZQ.Zh();
    if (this.Zm.Zk(Zj7.StreamEnd)) {
      List<Zl2> list = this.ZQ.Zm();
      Zt1 zt1 = ((Zl2)list.get(0)).ZZ();
      List<?> list1 = Collections.emptyList();
      Zf zf = new Zf(Zj9.ZD, false, (List)list1, zt1, null, Zp.BLOCK);
      zf.ZC(list);
      return zf;
    } 
    this.Zm.ZM();
    Zi zi = Zn(null);
    try {
      this.ZQ.Zh();
      if (!this.ZQ.ZR())
        zi.ZV(this.ZQ.Zm()); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zm.ZM();
    this.Zl.clear();
    this.ZZ.clear();
    return zi;
  }
  
  public Zi ZI() {
    this.Zm.ZM();
    Zi zi = null;
    if (!this.Zm.Zk(Zj7.StreamEnd))
      zi = Zl(); 
    if (!this.Zm.Zk(Zj7.StreamEnd)) {
      Zlv zlv = this.Zm.ZM();
      try {
      
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      Zt1 zt1 = (zi != null) ? zi.ZP() : null;
      throw new Zl6(a(13413, -1715), zt1, a(13414, -15350), zlv.ZO());
    } 
    this.Zm.ZM();
    return zi;
  }
  
  private Zi Zn(Zi paramZi) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZQ : Lorg/yaml/Zj8;
    //   7: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   10: pop
    //   11: astore_2
    //   12: aload_1
    //   13: ifnull -> 34
    //   16: aload_0
    //   17: getfield ZZ : Ljava/util/Set;
    //   20: aload_1
    //   21: invokeinterface add : (Ljava/lang/Object;)Z
    //   26: pop
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   33: athrow
    //   34: aload_0
    //   35: getfield Zm : Lorg/yaml/Zjy;
    //   38: getstatic org/yaml/Zj7.Alias : Lorg/yaml/Zj7;
    //   41: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   46: ifeq -> 275
    //   49: aload_0
    //   50: getfield Zm : Lorg/yaml/Zjy;
    //   53: invokeinterface ZM : ()Lorg/yaml/Zlv;
    //   58: checkcast org/yaml/Zl_
    //   61: astore #4
    //   63: aload #4
    //   65: invokevirtual ZF : ()Ljava/lang/String;
    //   68: astore #5
    //   70: aload_0
    //   71: getfield Zl : Ljava/util/Map;
    //   74: aload #5
    //   76: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   81: ifne -> 130
    //   84: new org/yaml/Zl6
    //   87: dup
    //   88: aconst_null
    //   89: aconst_null
    //   90: new java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial <init> : ()V
    //   97: sipush #13418
    //   100: sipush #-19759
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload #5
    //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual toString : ()Ljava/lang/String;
    //   117: aload #4
    //   119: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   122: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   125: athrow
    //   126: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   129: athrow
    //   130: aload_0
    //   131: getfield Zl : Ljava/util/Map;
    //   134: aload #5
    //   136: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   141: checkcast org/yaml/Zi
    //   144: astore_3
    //   145: aload_3
    //   146: instanceof org/yaml/Zu
    //   149: ifne -> 227
    //   152: aload_0
    //   153: dup
    //   154: getfield Zk : I
    //   157: iconst_1
    //   158: iadd
    //   159: putfield Zk : I
    //   162: aload_0
    //   163: getfield Zk : I
    //   166: aload_0
    //   167: getfield Zd : Lorg/yaml/Ztw;
    //   170: invokevirtual Zc : ()I
    //   173: if_icmple -> 227
    //   176: goto -> 183
    //   179: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   182: athrow
    //   183: new org/yaml/Zj3
    //   186: dup
    //   187: new java/lang/StringBuilder
    //   190: dup
    //   191: invokespecial <init> : ()V
    //   194: sipush #13416
    //   197: sipush #-2344
    //   200: invokestatic a : (II)Ljava/lang/String;
    //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: aload_0
    //   207: getfield Zd : Lorg/yaml/Ztw;
    //   210: invokevirtual Zc : ()I
    //   213: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   216: invokevirtual toString : ()Ljava/lang/String;
    //   219: invokespecial <init> : (Ljava/lang/String;)V
    //   222: athrow
    //   223: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   226: athrow
    //   227: aload_0
    //   228: getfield ZZ : Ljava/util/Set;
    //   231: aload_3
    //   232: invokeinterface remove : (Ljava/lang/Object;)Z
    //   237: ifeq -> 252
    //   240: aload_3
    //   241: iconst_1
    //   242: invokevirtual Zz : (Z)V
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   251: athrow
    //   252: aload_0
    //   253: getfield ZQ : Lorg/yaml/Zj8;
    //   256: invokevirtual Zm : ()Ljava/util/List;
    //   259: pop
    //   260: aload_0
    //   261: getfield ZL : Lorg/yaml/Zj8;
    //   264: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   267: invokevirtual Zm : ()Ljava/util/List;
    //   270: pop
    //   271: aload_2
    //   272: ifnonnull -> 377
    //   275: aload_0
    //   276: getfield Zm : Lorg/yaml/Zjy;
    //   279: invokeinterface ZV : ()Lorg/yaml/Zlv;
    //   284: checkcast org/yaml/Zlg
    //   287: astore #4
    //   289: aload #4
    //   291: invokevirtual ZF : ()Ljava/lang/String;
    //   294: astore #5
    //   296: aload_0
    //   297: invokespecial ZM : ()V
    //   300: aload_0
    //   301: getfield Zm : Lorg/yaml/Zjy;
    //   304: getstatic org/yaml/Zj7.Scalar : Lorg/yaml/Zj7;
    //   307: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   312: ifeq -> 333
    //   315: aload_0
    //   316: aload #5
    //   318: aload_0
    //   319: getfield ZQ : Lorg/yaml/Zj8;
    //   322: invokevirtual Zm : ()Ljava/util/List;
    //   325: invokevirtual ZO : (Ljava/lang/String;Ljava/util/List;)Lorg/yaml/Zi;
    //   328: astore_3
    //   329: aload_2
    //   330: ifnonnull -> 373
    //   333: aload_0
    //   334: getfield Zm : Lorg/yaml/Zjy;
    //   337: getstatic org/yaml/Zj7.SequenceStart : Lorg/yaml/Zj7;
    //   340: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   345: ifeq -> 366
    //   348: goto -> 355
    //   351: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   354: athrow
    //   355: aload_0
    //   356: aload #5
    //   358: invokevirtual Zl : (Ljava/lang/String;)Lorg/yaml/Zi;
    //   361: astore_3
    //   362: aload_2
    //   363: ifnonnull -> 373
    //   366: aload_0
    //   367: aload #5
    //   369: invokevirtual Ze : (Ljava/lang/String;)Lorg/yaml/Zi;
    //   372: astore_3
    //   373: aload_0
    //   374: invokespecial ZQ : ()V
    //   377: aload_0
    //   378: getfield ZZ : Ljava/util/Set;
    //   381: aload_1
    //   382: invokeinterface remove : (Ljava/lang/Object;)Z
    //   387: pop
    //   388: aload_3
    //   389: areturn
    // Exception table:
    //   from	to	target	type
    //   12	27	30	java/lang/NullPointerException
    //   70	126	126	java/lang/NullPointerException
    //   145	176	179	java/lang/NullPointerException
    //   152	223	223	java/lang/NullPointerException
    //   227	245	248	java/lang/NullPointerException
    //   329	348	351	java/lang/NullPointerException
  }
  
  protected Zi ZO(String paramString, List<Zl2> paramList) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zm : Lorg/yaml/Zjy;
    //   7: invokeinterface ZM : ()Lorg/yaml/Zlv;
    //   12: checkcast org/yaml/Zl4
    //   15: astore #4
    //   17: astore_3
    //   18: aload #4
    //   20: invokevirtual Zc : ()Ljava/lang/String;
    //   23: astore #5
    //   25: iconst_0
    //   26: istore #6
    //   28: aload #5
    //   30: ifnull -> 50
    //   33: aload #5
    //   35: ldc '!'
    //   37: invokevirtual equals : (Ljava/lang/Object;)Z
    //   40: ifeq -> 82
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   49: athrow
    //   50: aload_0
    //   51: getfield ZF : Lorg/yaml/Z_r;
    //   54: getstatic org/yaml/Zjz.scalar : Lorg/yaml/Zjz;
    //   57: aload #4
    //   59: invokevirtual Zw : ()Ljava/lang/String;
    //   62: aload #4
    //   64: invokevirtual Zn : ()Lorg/yaml/Zgr;
    //   67: invokevirtual ZW : ()Z
    //   70: invokevirtual ZW : (Lorg/yaml/Zjz;Ljava/lang/String;Z)Lorg/yaml/Zj9;
    //   73: astore #7
    //   75: iconst_1
    //   76: istore #6
    //   78: aload_3
    //   79: ifnonnull -> 171
    //   82: new org/yaml/Zj9
    //   85: dup
    //   86: aload #5
    //   88: invokespecial <init> : (Ljava/lang/String;)V
    //   91: astore #7
    //   93: aload #7
    //   95: invokevirtual Zu : ()Z
    //   98: ifeq -> 171
    //   101: aload_0
    //   102: getfield Zd : Lorg/yaml/Ztw;
    //   105: invokevirtual ZL : ()Lorg/yaml/Z_u;
    //   108: aload #7
    //   110: invokeinterface Zi : (Lorg/yaml/Zj9;)Z
    //   115: ifne -> 171
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   124: athrow
    //   125: new org/yaml/Zl6
    //   128: dup
    //   129: aconst_null
    //   130: aconst_null
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: sipush #13415
    //   141: sipush #463
    //   144: invokestatic a : (II)Ljava/lang/String;
    //   147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: aload #5
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: aload #4
    //   160: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   163: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   166: athrow
    //   167: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   170: athrow
    //   171: new org/yaml/Zu
    //   174: dup
    //   175: aload #7
    //   177: iload #6
    //   179: aload #4
    //   181: invokevirtual Zw : ()Ljava/lang/String;
    //   184: aload #4
    //   186: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   189: aload #4
    //   191: invokevirtual ZB : ()Lorg/yaml/Zt1;
    //   194: aload #4
    //   196: invokevirtual ZD : ()Lorg/yaml/Zjm;
    //   199: invokespecial <init> : (Lorg/yaml/Zj9;ZLjava/lang/String;Lorg/yaml/Zt1;Lorg/yaml/Zt1;Lorg/yaml/Zjm;)V
    //   202: astore #8
    //   204: aload_1
    //   205: ifnull -> 234
    //   208: aload #8
    //   210: aload_1
    //   211: invokevirtual ZD : (Ljava/lang/String;)V
    //   214: aload_0
    //   215: getfield Zl : Ljava/util/Map;
    //   218: aload_1
    //   219: aload #8
    //   221: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   226: pop
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   233: athrow
    //   234: aload #8
    //   236: aload_2
    //   237: invokevirtual ZC : (Ljava/util/List;)V
    //   240: aload #8
    //   242: aload_0
    //   243: getfield ZL : Lorg/yaml/Zj8;
    //   246: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   249: invokevirtual Zm : ()Ljava/util/List;
    //   252: invokevirtual Zm : (Ljava/util/List;)V
    //   255: aload #8
    //   257: areturn
    // Exception table:
    //   from	to	target	type
    //   28	43	46	java/lang/NullPointerException
    //   93	118	121	java/lang/NullPointerException
    //   101	167	167	java/lang/NullPointerException
    //   204	227	230	java/lang/NullPointerException
  }
  
  protected Zi Zl(String paramString) {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: aload_0
    //   4: getfield Zm : Lorg/yaml/Zjy;
    //   7: invokeinterface ZM : ()Lorg/yaml/Zlv;
    //   12: checkcast org/yaml/Zla
    //   15: astore_3
    //   16: aload_3
    //   17: invokevirtual ZA : ()Ljava/lang/String;
    //   20: astore #4
    //   22: astore_2
    //   23: iconst_0
    //   24: istore #6
    //   26: aload #4
    //   28: ifnull -> 48
    //   31: aload #4
    //   33: ldc '!'
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 72
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   47: athrow
    //   48: aload_0
    //   49: getfield ZF : Lorg/yaml/Z_r;
    //   52: getstatic org/yaml/Zjz.sequence : Lorg/yaml/Zjz;
    //   55: aconst_null
    //   56: aload_3
    //   57: invokevirtual Zp : ()Z
    //   60: invokevirtual ZW : (Lorg/yaml/Zjz;Ljava/lang/String;Z)Lorg/yaml/Zj9;
    //   63: astore #5
    //   65: iconst_1
    //   66: istore #6
    //   68: aload_2
    //   69: ifnonnull -> 160
    //   72: new org/yaml/Zj9
    //   75: dup
    //   76: aload #4
    //   78: invokespecial <init> : (Ljava/lang/String;)V
    //   81: astore #5
    //   83: aload #5
    //   85: invokevirtual Zu : ()Z
    //   88: ifeq -> 160
    //   91: aload_0
    //   92: getfield Zd : Lorg/yaml/Ztw;
    //   95: invokevirtual ZL : ()Lorg/yaml/Z_u;
    //   98: aload #5
    //   100: invokeinterface Zi : (Lorg/yaml/Zj9;)Z
    //   105: ifne -> 160
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   114: athrow
    //   115: new org/yaml/Zl6
    //   118: dup
    //   119: aconst_null
    //   120: aconst_null
    //   121: new java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: sipush #13410
    //   131: sipush #17611
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: aload #4
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual toString : ()Ljava/lang/String;
    //   148: aload_3
    //   149: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   152: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   155: athrow
    //   156: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   159: athrow
    //   160: new java/util/ArrayList
    //   163: dup
    //   164: invokespecial <init> : ()V
    //   167: astore #7
    //   169: new org/yaml/Zo
    //   172: dup
    //   173: aload #5
    //   175: iload #6
    //   177: aload #7
    //   179: aload_3
    //   180: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   183: aconst_null
    //   184: aload_3
    //   185: invokevirtual ZJ : ()Lorg/yaml/Zp;
    //   188: invokespecial <init> : (Lorg/yaml/Zj9;ZLjava/util/List;Lorg/yaml/Zt1;Lorg/yaml/Zt1;Lorg/yaml/Zp;)V
    //   191: astore #8
    //   193: aload_3
    //   194: invokevirtual ZE : ()Z
    //   197: ifeq -> 219
    //   200: aload #8
    //   202: aload_0
    //   203: getfield ZQ : Lorg/yaml/Zj8;
    //   206: invokevirtual Zm : ()Ljava/util/List;
    //   209: invokevirtual ZC : (Ljava/util/List;)V
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   218: athrow
    //   219: aload_1
    //   220: ifnull -> 249
    //   223: aload #8
    //   225: aload_1
    //   226: invokevirtual ZD : (Ljava/lang/String;)V
    //   229: aload_0
    //   230: getfield Zl : Ljava/util/Map;
    //   233: aload_1
    //   234: aload #8
    //   236: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   241: pop
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   248: athrow
    //   249: aload_0
    //   250: getfield Zm : Lorg/yaml/Zjy;
    //   253: getstatic org/yaml/Zj7.SequenceEnd : Lorg/yaml/Zj7;
    //   256: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   261: ifne -> 321
    //   264: aload_0
    //   265: getfield ZQ : Lorg/yaml/Zj8;
    //   268: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   271: pop
    //   272: aload_0
    //   273: getfield Zm : Lorg/yaml/Zjy;
    //   276: getstatic org/yaml/Zj7.SequenceEnd : Lorg/yaml/Zj7;
    //   279: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   284: ifeq -> 298
    //   287: aload_2
    //   288: ifnonnull -> 321
    //   291: goto -> 298
    //   294: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   297: athrow
    //   298: aload #7
    //   300: aload_0
    //   301: aload #8
    //   303: invokespecial Zn : (Lorg/yaml/Zi;)Lorg/yaml/Zi;
    //   306: invokevirtual add : (Ljava/lang/Object;)Z
    //   309: pop
    //   310: aload_2
    //   311: ifnonnull -> 249
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   320: athrow
    //   321: aload_3
    //   322: invokevirtual ZE : ()Z
    //   325: ifeq -> 350
    //   328: aload #8
    //   330: aload_0
    //   331: getfield ZL : Lorg/yaml/Zj8;
    //   334: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   337: invokevirtual Zm : ()Ljava/util/List;
    //   340: invokevirtual Zm : (Ljava/util/List;)V
    //   343: goto -> 350
    //   346: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   349: athrow
    //   350: aload_0
    //   351: getfield Zm : Lorg/yaml/Zjy;
    //   354: invokeinterface ZM : ()Lorg/yaml/Zlv;
    //   359: astore #9
    //   361: aload #8
    //   363: aload #9
    //   365: invokevirtual ZB : ()Lorg/yaml/Zt1;
    //   368: invokevirtual Zd : (Lorg/yaml/Zt1;)V
    //   371: aload_0
    //   372: getfield ZL : Lorg/yaml/Zj8;
    //   375: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   378: pop
    //   379: aload_0
    //   380: getfield ZL : Lorg/yaml/Zj8;
    //   383: invokevirtual ZR : ()Z
    //   386: ifne -> 408
    //   389: aload #8
    //   391: aload_0
    //   392: getfield ZL : Lorg/yaml/Zj8;
    //   395: invokevirtual Zm : ()Ljava/util/List;
    //   398: invokevirtual Zm : (Ljava/util/List;)V
    //   401: goto -> 408
    //   404: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   407: athrow
    //   408: aload #8
    //   410: invokestatic Zwu : ()[Lburp/Zbqc;
    //   413: ifnonnull -> 428
    //   416: ldc 'g78Y4'
    //   418: invokestatic Zr : (Ljava/lang/String;)V
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   427: athrow
    //   428: areturn
    // Exception table:
    //   from	to	target	type
    //   26	41	44	java/lang/NullPointerException
    //   83	108	111	java/lang/NullPointerException
    //   91	156	156	java/lang/NullPointerException
    //   193	212	215	java/lang/NullPointerException
    //   219	242	245	java/lang/NullPointerException
    //   264	291	294	java/lang/NullPointerException
    //   287	314	317	java/lang/NullPointerException
    //   321	343	346	java/lang/NullPointerException
    //   361	401	404	java/lang/NullPointerException
    //   408	421	424	java/lang/NullPointerException
  }
  
  protected Zi Ze(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Lorg/yaml/Zjy;
    //   4: invokeinterface ZM : ()Lorg/yaml/Zlv;
    //   9: checkcast org/yaml/Zl3
    //   12: astore_3
    //   13: invokestatic Zr : ()Ljava/lang/String;
    //   16: aload_3
    //   17: invokevirtual ZA : ()Ljava/lang/String;
    //   20: astore #4
    //   22: astore_2
    //   23: iconst_0
    //   24: istore #6
    //   26: aload #4
    //   28: ifnull -> 48
    //   31: aload #4
    //   33: ldc '!'
    //   35: invokevirtual equals : (Ljava/lang/Object;)Z
    //   38: ifeq -> 86
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   47: athrow
    //   48: aload_0
    //   49: getfield ZF : Lorg/yaml/Z_r;
    //   52: getstatic org/yaml/Zjz.mapping : Lorg/yaml/Zjz;
    //   55: aconst_null
    //   56: aload_3
    //   57: invokevirtual Zp : ()Z
    //   60: invokevirtual ZW : (Lorg/yaml/Zjz;Ljava/lang/String;Z)Lorg/yaml/Zj9;
    //   63: astore #5
    //   65: iconst_1
    //   66: istore #6
    //   68: aload_2
    //   69: ifnonnull -> 174
    //   72: iconst_4
    //   73: anewarray burp/Zbqc
    //   76: invokestatic Zr : ([Lburp/Zbqc;)V
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   85: athrow
    //   86: new org/yaml/Zj9
    //   89: dup
    //   90: aload #4
    //   92: invokespecial <init> : (Ljava/lang/String;)V
    //   95: astore #5
    //   97: aload #5
    //   99: invokevirtual Zu : ()Z
    //   102: ifeq -> 174
    //   105: aload_0
    //   106: getfield Zd : Lorg/yaml/Ztw;
    //   109: invokevirtual ZL : ()Lorg/yaml/Z_u;
    //   112: aload #5
    //   114: invokeinterface Zi : (Lorg/yaml/Zj9;)Z
    //   119: ifne -> 174
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   128: athrow
    //   129: new org/yaml/Zl6
    //   132: dup
    //   133: aconst_null
    //   134: aconst_null
    //   135: new java/lang/StringBuilder
    //   138: dup
    //   139: invokespecial <init> : ()V
    //   142: sipush #13415
    //   145: sipush #463
    //   148: invokestatic a : (II)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload #4
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: invokevirtual toString : ()Ljava/lang/String;
    //   162: aload_3
    //   163: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   166: invokespecial <init> : (Ljava/lang/String;Lorg/yaml/Zt1;Ljava/lang/String;Lorg/yaml/Zt1;)V
    //   169: athrow
    //   170: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   173: athrow
    //   174: new java/util/ArrayList
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: astore #7
    //   183: new org/yaml/Zf
    //   186: dup
    //   187: aload #5
    //   189: iload #6
    //   191: aload #7
    //   193: aload_3
    //   194: invokevirtual ZO : ()Lorg/yaml/Zt1;
    //   197: aconst_null
    //   198: aload_3
    //   199: invokevirtual ZJ : ()Lorg/yaml/Zp;
    //   202: invokespecial <init> : (Lorg/yaml/Zj9;ZLjava/util/List;Lorg/yaml/Zt1;Lorg/yaml/Zt1;Lorg/yaml/Zp;)V
    //   205: astore #8
    //   207: aload_3
    //   208: invokevirtual ZE : ()Z
    //   211: ifeq -> 233
    //   214: aload #8
    //   216: aload_0
    //   217: getfield ZQ : Lorg/yaml/Zj8;
    //   220: invokevirtual Zm : ()Ljava/util/List;
    //   223: invokevirtual ZC : (Ljava/util/List;)V
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   232: athrow
    //   233: aload_1
    //   234: ifnull -> 263
    //   237: aload #8
    //   239: aload_1
    //   240: invokevirtual ZD : (Ljava/lang/String;)V
    //   243: aload_0
    //   244: getfield Zl : Ljava/util/Map;
    //   247: aload_1
    //   248: aload #8
    //   250: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   255: pop
    //   256: goto -> 263
    //   259: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   262: athrow
    //   263: aload_0
    //   264: getfield Zm : Lorg/yaml/Zjy;
    //   267: getstatic org/yaml/Zj7.MappingEnd : Lorg/yaml/Zj7;
    //   270: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   275: ifne -> 331
    //   278: aload_0
    //   279: getfield ZQ : Lorg/yaml/Zj8;
    //   282: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   285: pop
    //   286: aload_0
    //   287: getfield Zm : Lorg/yaml/Zjy;
    //   290: getstatic org/yaml/Zj7.MappingEnd : Lorg/yaml/Zj7;
    //   293: invokeinterface Zk : (Lorg/yaml/Zj7;)Z
    //   298: ifeq -> 312
    //   301: aload_2
    //   302: ifnonnull -> 331
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   311: athrow
    //   312: aload_0
    //   313: aload #7
    //   315: aload #8
    //   317: invokevirtual ZF : (Ljava/util/List;Lorg/yaml/Zf;)V
    //   320: aload_2
    //   321: ifnonnull -> 263
    //   324: goto -> 331
    //   327: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   330: athrow
    //   331: aload_3
    //   332: invokevirtual ZE : ()Z
    //   335: ifeq -> 360
    //   338: aload #8
    //   340: aload_0
    //   341: getfield ZL : Lorg/yaml/Zj8;
    //   344: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   347: invokevirtual Zm : ()Ljava/util/List;
    //   350: invokevirtual Zm : (Ljava/util/List;)V
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   359: athrow
    //   360: aload_0
    //   361: getfield Zm : Lorg/yaml/Zjy;
    //   364: invokeinterface ZM : ()Lorg/yaml/Zlv;
    //   369: astore #9
    //   371: aload #8
    //   373: aload #9
    //   375: invokevirtual ZB : ()Lorg/yaml/Zt1;
    //   378: invokevirtual Zd : (Lorg/yaml/Zt1;)V
    //   381: aload_0
    //   382: getfield ZL : Lorg/yaml/Zj8;
    //   385: invokevirtual Zh : ()Lorg/yaml/Zj8;
    //   388: pop
    //   389: aload_0
    //   390: getfield ZL : Lorg/yaml/Zj8;
    //   393: invokevirtual ZR : ()Z
    //   396: ifne -> 418
    //   399: aload #8
    //   401: aload_0
    //   402: getfield ZL : Lorg/yaml/Zj8;
    //   405: invokevirtual Zm : ()Ljava/util/List;
    //   408: invokevirtual Zm : (Ljava/util/List;)V
    //   411: goto -> 418
    //   414: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   417: athrow
    //   418: aload #8
    //   420: areturn
    // Exception table:
    //   from	to	target	type
    //   26	41	44	java/lang/NullPointerException
    //   68	79	82	java/lang/NullPointerException
    //   97	122	125	java/lang/NullPointerException
    //   105	170	170	java/lang/NullPointerException
    //   207	226	229	java/lang/NullPointerException
    //   233	256	259	java/lang/NullPointerException
    //   278	305	308	java/lang/NullPointerException
    //   301	324	327	java/lang/NullPointerException
    //   331	353	356	java/lang/NullPointerException
    //   371	411	414	java/lang/NullPointerException
  }
  
  protected void ZF(List<Z_z> paramList, Zf paramZf) {
    Zi zi1 = Zs(paramZf);
    try {
      if (zi1.ZO().equals(Zj9.ZF))
        paramZf.ZP(true); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    Zi zi2 = Zf(paramZf);
    paramList.add(new Z_z(zi1, zi2));
  }
  
  protected Zi Zs(Zf paramZf) {
    return Zn(paramZf);
  }
  
  protected Zi Zf(Zf paramZf) {
    return Zn(paramZf);
  }
  
  private void ZM() {
    try {
      if (this.Zn > this.ZW)
        throw new Zj3(a(13411, -16152) + this.ZW); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zn++;
  }
  
  private void ZQ() {
    String str = Zr();
    try {
      if (this.Zn > 0)
        try {
          this.Zn--;
          if (str != null)
            return; 
          throw new Zj3(a(13412, -4981));
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    throw new Zj3(a(13412, -4981));
  }
  
  public static void Zr(String paramString) {
    Zh = paramString;
  }
  
  public static String Zr() {
    return Zh;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÒhGsÁì\dË|ã9÷¥\\t¾4jH2#|©ÓøS?f  sOÖï21,4ÉÅDíÐeÚ 1,Ó&[Jmé@S:/>K8l£*GØjC6{N¥Áæ(°ûþMÐýåº7ÛÔq©þÜ-ÃgÒÜG¶ä#¤·%úôY@H;Ì©|(QVÓËçò~©Å\\n[è¥bv³E_ Ðt3®j fCPIÏÞÌ,`9²`?eyÖ\\nO+¸Ù(j)ÿ@£ä7 \\fSbYþ¨»©å¢ÀïÀ÷Év cÜèî¬$÷öEÝ³¨®006Rü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: ldc 'lHrMNb'
    //   20: bipush #27
    //   22: istore_1
    //   23: invokestatic Zr : (Ljava/lang/String;)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #66
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc ' ô;E¾!0x:ó'¥«Õã&>Óo¨£¶A>äQó%Ê´[Fé¿à:q(vä¸°røròòù_)oÌ_äÅÍÜ{mû¼£Ü¡àR-`¬ß¶-Î^§'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #25
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #118
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic org/yaml/Zjx.a : [Ljava/lang/String;
    //   137: bipush #11
    //   139: anewarray java/lang/String
    //   142: putstatic org/yaml/Zjx.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #119
    //   218: goto -> 248
    //   221: bipush #95
    //   223: goto -> 248
    //   226: bipush #57
    //   228: goto -> 248
    //   231: bipush #124
    //   233: goto -> 248
    //   236: bipush #85
    //   238: goto -> 248
    //   241: bipush #100
    //   243: goto -> 248
    //   246: bipush #79
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3462) & 0xFFFF;
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
      char c = '¼';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zjx.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */