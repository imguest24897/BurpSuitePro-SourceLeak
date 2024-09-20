package com.fasterxml.Zh;

import com.fasterxml.Zm.Zet;
import com.fasterxml.Zm.Zu;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zk;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Zi implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zk[] ZG;
  
  protected static final Zi Ze;
  
  protected static final Zr ZY;
  
  private static final Class<?> Zs;
  
  private static final Class<?> ZR;
  
  private static final Class<?> Zg;
  
  private static final Class<?> Zk;
  
  private static final Class<?> Zv;
  
  private static final Class<?> Zb;
  
  private static final Class<?> Zy;
  
  private static final Class<?> ZX;
  
  private static final Class<?> ZL;
  
  protected static final Zy Zh;
  
  protected static final Zy ZQ;
  
  protected static final Zy Zn;
  
  protected static final Zy ZE;
  
  protected static final Zy Zz;
  
  protected static final Zy ZM;
  
  protected static final Zy ZB;
  
  protected static final Zy ZT;
  
  protected static final Zy ZJ;
  
  protected final Zet<Object, Zk> Z_;
  
  protected final Zx[] Zw;
  
  protected final Zj Zx;
  
  protected final ClassLoader Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zi() {
    this((Zet<Object, Zk>)new Zu(16, 200));
  }
  
  protected Zi(Zet<Object, Zk> paramZet) {
    this.Z_ = Objects.<Zet<Object, Zk>>requireNonNull(paramZet);
    this.Zx = new Zj(this);
    this.Zw = null;
    this.Zq = null;
  }
  
  public static Zi ZF() {
    return Ze;
  }
  
  public ClassLoader ZE() {
    return this.Zq;
  }
  
  public static Zk Zs() {
    return ZF().ZW();
  }
  
  public Class<?> Zr(String paramString) throws ClassNotFoundException {
    if (paramString.indexOf('.') < 0) {
      Class<?> clazz = Zk(paramString);
      try {
        if (clazz != null)
          return clazz; 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
    Throwable throwable = null;
    ClassLoader classLoader = ZE();
    if (classLoader == null)
      classLoader = Thread.currentThread().getContextClassLoader(); 
    if (classLoader != null)
      try {
        return Zb(paramString, true, classLoader);
      } catch (Exception exception) {
        throwable = Zx.Zs(exception);
      }  
    try {
      return Zs(paramString);
    } catch (Exception exception) {
      if (throwable == null)
        throwable = Zx.Zs(exception); 
      Zx.Zq(throwable);
      throw new ClassNotFoundException(throwable.getMessage(), throwable);
    } 
  }
  
  protected Class<?> Zb(String paramString, boolean paramBoolean, ClassLoader paramClassLoader) throws ClassNotFoundException {
    return Class.forName(paramString, true, paramClassLoader);
  }
  
  protected Class<?> Zs(String paramString) throws ClassNotFoundException {
    return Class.forName(paramString);
  }
  
  protected Class<?> Zk(String paramString) {
    try {
      if (a(-608, 328).equals(paramString))
        return int.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-581, -10150).equals(paramString))
        return long.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-588, 17064).equals(paramString))
        return float.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-605, -28274).equals(paramString))
        return double.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-586, 18776).equals(paramString))
        return boolean.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-599, 11521).equals(paramString))
        return byte.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-590, -25192).equals(paramString))
        return char.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-593, -4203).equals(paramString))
        return short.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (a(-597, 29640).equals(paramString))
        return void.class; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zk ZU(Zk paramZk, Class<?> paramClass) throws IllegalArgumentException {
    return Zx(paramZk, paramClass, false);
  }
  
  public Zk Zx(Zk paramZk, Class<?> paramClass, boolean paramBoolean) throws IllegalArgumentException {
    // Byte code:
    //   0: invokestatic Zs : ()[I
    //   3: aload_1
    //   4: invokevirtual Zf : ()Ljava/lang/Class;
    //   7: astore #5
    //   9: astore #4
    //   11: aload #5
    //   13: aload_2
    //   14: if_acmpne -> 23
    //   17: aload_1
    //   18: areturn
    //   19: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   22: athrow
    //   23: aload #5
    //   25: ldc java/lang/Object
    //   27: if_acmpne -> 46
    //   30: aload_0
    //   31: aconst_null
    //   32: aload_2
    //   33: getstatic com/fasterxml/Zh/Zi.ZY : Lcom/fasterxml/Zh/Zr;
    //   36: invokevirtual ZQ : (Lcom/fasterxml/Zh/Zb;Ljava/lang/Class;Lcom/fasterxml/Zh/Zr;)Lcom/fasterxml/Zor/Zk;
    //   39: astore #6
    //   41: aload #4
    //   43: ifnull -> 384
    //   46: aload #5
    //   48: aload_2
    //   49: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
    //   52: ifne -> 104
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: new java/lang/IllegalArgumentException
    //   65: dup
    //   66: sipush #-592
    //   69: sipush #-27401
    //   72: invokestatic a : (II)Ljava/lang/String;
    //   75: iconst_2
    //   76: anewarray java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: aload_2
    //   82: invokestatic Za : (Ljava/lang/Class;)Ljava/lang/String;
    //   85: aastore
    //   86: dup
    //   87: iconst_1
    //   88: aload_1
    //   89: invokestatic ZN : (Lcom/fasterxml/Zor/Zk;)Ljava/lang/String;
    //   92: aastore
    //   93: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: athrow
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_1
    //   105: invokevirtual ZH : ()Z
    //   108: ifeq -> 309
    //   111: aload_1
    //   112: invokevirtual Zh : ()Z
    //   115: ifeq -> 202
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_2
    //   126: ldc java/util/HashMap
    //   128: if_acmpeq -> 177
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_2
    //   139: ldc java/util/LinkedHashMap
    //   141: if_acmpeq -> 177
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_2
    //   152: ldc java/util/EnumMap
    //   154: if_acmpeq -> 177
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_2
    //   165: ldc java/util/TreeMap
    //   167: if_acmpne -> 309
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: aload_0
    //   178: aconst_null
    //   179: aload_2
    //   180: aload_2
    //   181: aload_1
    //   182: invokevirtual Zu : ()Lcom/fasterxml/Zor/Zk;
    //   185: aload_1
    //   186: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   189: invokestatic ZC : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zh/Zr;
    //   192: invokevirtual ZQ : (Lcom/fasterxml/Zh/Zb;Ljava/lang/Class;Lcom/fasterxml/Zh/Zr;)Lcom/fasterxml/Zor/Zk;
    //   195: astore #6
    //   197: aload #4
    //   199: ifnull -> 384
    //   202: aload_1
    //   203: invokevirtual Za : ()Z
    //   206: ifeq -> 309
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   215: athrow
    //   216: aload_2
    //   217: ldc java/util/ArrayList
    //   219: if_acmpeq -> 268
    //   222: goto -> 229
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload_2
    //   230: ldc java/util/LinkedList
    //   232: if_acmpeq -> 268
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   241: athrow
    //   242: aload_2
    //   243: ldc java/util/HashSet
    //   245: if_acmpeq -> 268
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: aload_2
    //   256: ldc java/util/TreeSet
    //   258: if_acmpne -> 289
    //   261: goto -> 268
    //   264: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   267: athrow
    //   268: aload_0
    //   269: aconst_null
    //   270: aload_2
    //   271: aload_2
    //   272: aload_1
    //   273: invokevirtual ZB : ()Lcom/fasterxml/Zor/Zk;
    //   276: invokestatic ZY : (Ljava/lang/Class;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zh/Zr;
    //   279: invokevirtual ZQ : (Lcom/fasterxml/Zh/Zb;Ljava/lang/Class;Lcom/fasterxml/Zh/Zr;)Lcom/fasterxml/Zor/Zk;
    //   282: astore #6
    //   284: aload #4
    //   286: ifnull -> 384
    //   289: aload #5
    //   291: ldc java/util/EnumSet
    //   293: if_acmpne -> 309
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: aload_1
    //   304: areturn
    //   305: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   308: athrow
    //   309: aload_1
    //   310: invokevirtual ZR : ()Lcom/fasterxml/Zh/Zr;
    //   313: invokevirtual ZS : ()Z
    //   316: ifeq -> 335
    //   319: aload_0
    //   320: aconst_null
    //   321: aload_2
    //   322: getstatic com/fasterxml/Zh/Zi.ZY : Lcom/fasterxml/Zh/Zr;
    //   325: invokevirtual ZQ : (Lcom/fasterxml/Zh/Zb;Ljava/lang/Class;Lcom/fasterxml/Zh/Zr;)Lcom/fasterxml/Zor/Zk;
    //   328: astore #6
    //   330: aload #4
    //   332: ifnull -> 384
    //   335: aload_2
    //   336: invokevirtual getTypeParameters : ()[Ljava/lang/reflect/TypeVariable;
    //   339: arraylength
    //   340: istore #7
    //   342: iload #7
    //   344: ifne -> 363
    //   347: aload_0
    //   348: aconst_null
    //   349: aload_2
    //   350: getstatic com/fasterxml/Zh/Zi.ZY : Lcom/fasterxml/Zh/Zr;
    //   353: invokevirtual ZQ : (Lcom/fasterxml/Zh/Zb;Ljava/lang/Class;Lcom/fasterxml/Zh/Zr;)Lcom/fasterxml/Zor/Zk;
    //   356: astore #6
    //   358: aload #4
    //   360: ifnull -> 384
    //   363: aload_0
    //   364: aload_1
    //   365: iload #7
    //   367: aload_2
    //   368: iload_3
    //   369: invokespecial Zq : (Lcom/fasterxml/Zor/Zk;ILjava/lang/Class;Z)Lcom/fasterxml/Zh/Zr;
    //   372: astore #8
    //   374: aload_0
    //   375: aconst_null
    //   376: aload_2
    //   377: aload #8
    //   379: invokevirtual ZQ : (Lcom/fasterxml/Zh/Zb;Ljava/lang/Class;Lcom/fasterxml/Zh/Zr;)Lcom/fasterxml/Zor/Zk;
    //   382: astore #6
    //   384: aload #6
    //   386: aload_1
    //   387: invokevirtual ZH : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zk;
    //   390: astore #6
    //   392: aload #6
    //   394: areturn
    // Exception table:
    //   from	to	target	type
    //   11	19	19	java/lang/IllegalArgumentException
    //   41	55	58	java/lang/IllegalArgumentException
    //   46	100	100	java/lang/IllegalArgumentException
    //   104	118	121	java/lang/IllegalArgumentException
    //   111	131	134	java/lang/IllegalArgumentException
    //   125	144	147	java/lang/IllegalArgumentException
    //   138	157	160	java/lang/IllegalArgumentException
    //   151	170	173	java/lang/IllegalArgumentException
    //   197	209	212	java/lang/IllegalArgumentException
    //   202	222	225	java/lang/IllegalArgumentException
    //   216	235	238	java/lang/IllegalArgumentException
    //   229	248	251	java/lang/IllegalArgumentException
    //   242	261	264	java/lang/IllegalArgumentException
    //   284	296	299	java/lang/IllegalArgumentException
    //   289	305	305	java/lang/IllegalArgumentException
  }
  
  private Zr Zq(Zk paramZk, int paramInt, Class<?> paramClass, boolean paramBoolean) {
    Zw[] arrayOfZw = new Zw[paramInt];
    byte b1 = 0;
    int[] arrayOfInt = Zd.Zs();
    while (b1 < paramInt) {
      arrayOfZw[b1] = new Zw(b1);
      b1++;
      if (arrayOfInt != null)
        break; 
    } 
    Zr zr = Zr.Z_(paramClass, (Zk[])arrayOfZw);
    Zk zk1 = ZQ(null, paramClass, zr);
    Zk zk2 = zk1.Zl(paramZk.Zf());
    try {
      if (zk2 == null)
        throw new IllegalArgumentException(String.format(a(-607, -20507), new Object[] { paramZk.Zf().getName(), paramClass.getName() })); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = Zb(paramZk, zk2);
    try {
      if (str != null)
        try {
          if (!paramBoolean)
            throw new IllegalArgumentException(a(-596, -15677) + paramZk.Zy() + a(-601, 414) + paramClass.getName() + a(-583, 13189) + str); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zk[] arrayOfZk = new Zk[paramInt];
    byte b2 = 0;
    while (b2 < paramInt) {
      Zk zk = arrayOfZw[b2].ZL();
      if (zk == null)
        zk = Zs(); 
      arrayOfZk[b2] = zk;
      b2++;
      if (arrayOfInt != null)
        break; 
    } 
    return Zr.Z_(paramClass, arrayOfZk);
  }
  
  private String Zb(Zk paramZk1, Zk paramZk2) throws IllegalArgumentException {
    // Byte code:
    //   0: invokestatic Zs : ()[I
    //   3: aload_1
    //   4: invokevirtual ZR : ()Lcom/fasterxml/Zh/Zr;
    //   7: invokevirtual Zz : ()Ljava/util/List;
    //   10: astore #4
    //   12: astore_3
    //   13: aload_2
    //   14: invokevirtual ZR : ()Lcom/fasterxml/Zh/Zr;
    //   17: invokevirtual Zz : ()Ljava/util/List;
    //   20: astore #5
    //   22: aload #5
    //   24: invokeinterface size : ()I
    //   29: istore #6
    //   31: iconst_0
    //   32: istore #7
    //   34: aload #4
    //   36: invokeinterface size : ()I
    //   41: istore #8
    //   43: iload #7
    //   45: iload #8
    //   47: if_icmpge -> 296
    //   50: aload #4
    //   52: iload #7
    //   54: invokeinterface get : (I)Ljava/lang/Object;
    //   59: checkcast com/fasterxml/Zor/Zk
    //   62: astore #9
    //   64: iload #7
    //   66: iload #6
    //   68: if_icmpge -> 90
    //   71: aload #5
    //   73: iload #7
    //   75: invokeinterface get : (I)Ljava/lang/Object;
    //   80: checkcast com/fasterxml/Zor/Zk
    //   83: goto -> 93
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: invokestatic Zs : ()Lcom/fasterxml/Zor/Zk;
    //   93: astore #10
    //   95: aload_0
    //   96: aload #9
    //   98: aload #10
    //   100: invokespecial ZA : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zk;)Z
    //   103: ifne -> 289
    //   106: aload #9
    //   108: ldc java/lang/Object
    //   110: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   113: ifeq -> 134
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload_3
    //   124: ifnull -> 289
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: iload #7
    //   136: ifne -> 188
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: aload_1
    //   147: invokevirtual Zh : ()Z
    //   150: ifeq -> 188
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: aload #10
    //   162: ldc java/lang/Object
    //   164: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   167: ifeq -> 188
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: aload_3
    //   178: ifnull -> 289
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload #9
    //   190: invokevirtual ZU : ()Z
    //   193: ifeq -> 234
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload #9
    //   205: aload #10
    //   207: invokevirtual Zf : ()Ljava/lang/Class;
    //   210: invokevirtual Zq : (Ljava/lang/Class;)Z
    //   213: ifeq -> 234
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload_3
    //   224: ifnull -> 289
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: sipush #-577
    //   237: sipush #15463
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: iconst_4
    //   244: anewarray java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: iload #7
    //   251: iconst_1
    //   252: iadd
    //   253: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   256: aastore
    //   257: dup
    //   258: iconst_1
    //   259: iload #8
    //   261: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   264: aastore
    //   265: dup
    //   266: iconst_2
    //   267: aload #9
    //   269: invokevirtual Zy : ()Ljava/lang/String;
    //   272: aastore
    //   273: dup
    //   274: iconst_3
    //   275: aload #10
    //   277: invokevirtual Zy : ()Ljava/lang/String;
    //   280: aastore
    //   281: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   284: areturn
    //   285: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   288: athrow
    //   289: iinc #7, 1
    //   292: aload_3
    //   293: ifnull -> 43
    //   296: aconst_null
    //   297: areturn
    // Exception table:
    //   from	to	target	type
    //   64	86	86	java/lang/IllegalArgumentException
    //   95	116	119	java/lang/IllegalArgumentException
    //   106	127	130	java/lang/IllegalArgumentException
    //   123	139	142	java/lang/IllegalArgumentException
    //   134	153	156	java/lang/IllegalArgumentException
    //   146	170	173	java/lang/IllegalArgumentException
    //   160	181	184	java/lang/IllegalArgumentException
    //   177	196	199	java/lang/IllegalArgumentException
    //   188	216	219	java/lang/IllegalArgumentException
    //   203	227	230	java/lang/IllegalArgumentException
    //   223	285	285	java/lang/IllegalArgumentException
  }
  
  private boolean ZA(Zk paramZk1, Zk paramZk2) {
    int[] arrayOfInt = Zd.Zs();
    try {
      if (paramZk2 instanceof Zw) {
        ((Zw)paramZk2).Ze(paramZk1);
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramZk1.Zf() != paramZk2.Zf())
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    List<Zk> list1 = paramZk1.ZR().Zz();
    List<Zk> list2 = paramZk2.ZR().Zz();
    byte b = 0;
    int i = list1.size();
    while (b < i) {
      Zk zk1 = list1.get(b);
      Zk zk2 = list2.get(b);
      try {
        if (!ZA(zk1, zk2))
          return false; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return true;
  }
  
  public Zk ZG(Zk paramZk, Class<?> paramClass) {
    Class<?> clazz = paramZk.Zf();
    try {
      if (clazz == paramClass)
        return paramZk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zk zk = paramZk.Zl(paramClass);
    try {
      if (zk == null) {
        try {
          if (!paramClass.isAssignableFrom(clazz))
            throw new IllegalArgumentException(String.format(a(-579, 2968), new Object[] { paramClass.getName(), paramZk })); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        throw new IllegalArgumentException(String.format(a(-600, -13338), new Object[] { paramClass.getName(), paramZk }));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zk;
  }
  
  public Zk Ze(String paramString) throws IllegalArgumentException {
    return this.Zx.Zc(paramString);
  }
  
  public Zk[] Zs(Zk paramZk, Class<?> paramClass) {
    Zk zk = paramZk.Zl(paramClass);
    try {
      if (zk == null)
        return ZG; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zk.ZR().Zt();
  }
  
  public Zk ZY(Type paramType) {
    return Zs(null, paramType, ZY);
  }
  
  public Zk Zb(Type paramType, Zr paramZr) {
    return Zs(null, paramType, paramZr);
  }
  
  public Zs ZH(Class<? extends Collection> paramClass, Class<?> paramClass1) {
    return Zi(paramClass, ZQ(null, paramClass1, ZY));
  }
  
  public Zs Zi(Class<? extends Collection> paramClass, Zk paramZk) {
    Zr zr = Zr.Zl(paramClass, paramZk);
    Zs zs = (Zs)ZQ(null, paramClass, zr);
    try {
      if (zr.ZS() && paramZk != null) {
        Zk zk1 = zs.Zl(Collection.class);
        Zk zk2 = zk1.ZB();
        try {
          if (!zk2.equals(paramZk))
            throw new IllegalArgumentException(String.format(a(-584, -19527), new Object[] { Zx.Za(paramClass), paramZk, zk2 })); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zs;
  }
  
  public Zf Zv(Class<? extends Map> paramClass, Class<?> paramClass1, Class<?> paramClass2) {
    int[] arrayOfInt = Zd.Zs();
    if (paramClass == Properties.class) {
      Zk zk4 = Zz;
      Zk zk3 = zk4;
      if (arrayOfInt != null) {
        zk3 = ZQ(null, paramClass1, ZY);
        zk4 = ZQ(null, paramClass2, ZY);
        return Zh(paramClass, zk3, zk4);
      } 
      return Zh(paramClass, zk3, zk4);
    } 
    Zk zk1 = ZQ(null, paramClass1, ZY);
    Zk zk2 = ZQ(null, paramClass2, ZY);
    return Zh(paramClass, zk1, zk2);
  }
  
  public Zf Zh(Class<? extends Map> paramClass, Zk paramZk1, Zk paramZk2) {
    Zr zr = Zr.Zb(paramClass, new Zk[] { paramZk1, paramZk2 });
    Zf zf = (Zf)ZQ(null, paramClass, zr);
    if (zr.ZS()) {
      Zk zk1 = zf.Zl(Map.class);
      Zk zk2 = zk1.Zu();
      try {
        if (!zk2.equals(paramZk1))
          throw new IllegalArgumentException(String.format(a(-603, 26883), new Object[] { Zx.Za(paramClass), paramZk1, zk2 })); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Zk zk3 = zk1.ZB();
      try {
        if (!zk3.equals(paramZk2))
          throw new IllegalArgumentException(String.format(a(-594, -12626), new Object[] { Zx.Za(paramClass), paramZk2, zk3 })); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return zf;
  }
  
  @Deprecated
  public Zk Zt(Class<?> paramClass) {
    return Zm(paramClass, ZY, null, null);
  }
  
  public Zk Ze(Class<?> paramClass, Zr paramZr) {
    Zk zk = ZQ(null, paramClass, paramZr);
    return Zw(paramClass, zk);
  }
  
  private Zk ZK(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    Zk zk1;
    Zk zk2;
    if (paramClass == Properties.class) {
      zk1 = zk2 = Zz;
    } else {
      List<Zk> list = paramZr.Zz();
      int i = list.size();
      switch (i) {
        case 0:
          zk1 = zk2 = ZW();
          return Zf.Ze(paramClass, paramZr, paramZk, paramArrayOfZk, zk1, zk2);
        case 2:
          zk1 = list.get(0);
          zk2 = list.get(1);
          return Zf.Ze(paramClass, paramZr, paramZk, paramArrayOfZk, zk1, zk2);
      } 
      try {
        (new Object[4])[0] = Zx.Za(paramClass);
        (new Object[4])[1] = Integer.valueOf(i);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      throw new IllegalArgumentException(String.format(a(-585, 8408), new Object[] { null, null, (i == 1) ? "" : "s", paramZr }));
    } 
    return Zf.Ze(paramClass, paramZr, paramZk, paramArrayOfZk, zk1, zk2);
  }
  
  private Zk Zy(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    Zk zk;
    List<Zk> list = paramZr.Zz();
    if (list.isEmpty()) {
      zk = ZW();
    } else if (list.size() == 1) {
      zk = list.get(0);
    } else {
      throw new IllegalArgumentException(a(-602, -6787) + paramClass.getName() + a(-591, 22580));
    } 
    return Zs.Zh(paramClass, paramZr, paramZk, paramArrayOfZk, zk);
  }
  
  private Zk Zh(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    Zk zk;
    List<Zk> list = paramZr.Zz();
    if (list.isEmpty()) {
      zk = ZW();
    } else if (list.size() == 1) {
      zk = list.get(0);
    } else {
      throw new IllegalArgumentException(a(-595, -31243) + paramClass.getName() + a(-591, 22580));
    } 
    return Zn.Zr(paramClass, paramZr, paramZk, paramArrayOfZk, zk);
  }
  
  private Zk Zb(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    Zk zk;
    List<Zk> list = paramZr.Zz();
    if (list.isEmpty()) {
      zk = ZW();
    } else if (list.size() == 1) {
      zk = list.get(0);
    } else {
      throw new IllegalArgumentException(a(-606, -19177) + paramClass.getName() + a(-598, -771));
    } 
    return ZM(paramClass, paramZr, paramZk, paramArrayOfZk, zk);
  }
  
  private Zk ZM(Class<?> paramClass, Zr paramZr, Zk paramZk1, Zk[] paramArrayOfZk, Zk paramZk2) {
    return Zq.Zt(paramClass, paramZr, paramZk1, paramArrayOfZk, paramZk2);
  }
  
  protected Zk Zm(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    if (paramZr.ZS()) {
      Zk zk = ZV(paramClass);
      try {
        if (zk != null)
          return zk; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return ZP(paramClass, paramZr, paramZk, paramArrayOfZk);
  }
  
  protected Zk ZP(Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    return new Zy(paramClass, paramZr, paramZk, paramArrayOfZk);
  }
  
  protected Zk ZW() {
    return ZM;
  }
  
  protected Zk ZV(Class<?> paramClass) {
    try {
      if (paramClass.isPrimitive()) {
        try {
          if (paramClass == Zb)
            return Zh; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == ZX)
            return Zn; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == ZL)
            return ZE; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == Zy)
            return ZQ; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramClass == Zs)
            return Zz; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == ZR)
            return ZM; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (paramClass == Zv)
            return ZJ; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  protected Zk Zs(Zb paramZb, Type paramType, Zr paramZr) {
    Zk zk;
    if (paramType instanceof Class) {
      zk = ZQ(paramZb, (Class)paramType, ZY);
    } else if (paramType instanceof ParameterizedType) {
      zk = ZR(paramZb, (ParameterizedType)paramType, paramZr);
    } else {
      try {
        if (paramType instanceof Zk)
          return (Zk)paramType; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (paramType instanceof GenericArrayType) {
        zk = ZC(paramZb, (GenericArrayType)paramType, paramZr);
      } else if (paramType instanceof TypeVariable) {
        zk = Zh(paramZb, (TypeVariable)paramType, paramZr);
      } else if (paramType instanceof WildcardType) {
        zk = Zd(paramZb, (WildcardType)paramType, paramZr);
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        throw new IllegalArgumentException(a(-582, -20528) + ((paramType == null) ? a(-587, 18786) : paramType.toString()));
      } 
    } 
    return Zw(paramType, zk);
  }
  
  protected Zk Zw(Type paramType, Zk paramZk) {
    try {
      if (this.Zw == null)
        return paramZk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zk zk = paramZk;
    Zr zr = zk.ZR();
    if (zr == null)
      zr = ZY; 
    for (Zx zx : this.Zw) {
      Zk zk1 = zx.Zk(zk, paramType, zr, this);
      try {
        if (zk1 == null)
          throw new IllegalStateException(String.format(a(-580, 20589), new Object[] { zx, zx.getClass().getName(), zk })); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      zk = zk1;
    } 
    return zk;
  }
  
  protected Zk ZQ(Zb paramZb, Class<?> paramClass, Zr paramZr) {
    Object object;
    Zk zk = ZV(paramClass);
    try {
      if (zk != null)
        return zk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramZr == null || paramZr.ZS()) {
        object = paramClass;
      } else {
        object = paramZr.Zv(paramClass);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    zk = (object == null) ? null : (Zk)this.Z_.ZM(object);
    try {
      if (zk != null)
        return zk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (paramZb == null) {
      paramZb = new Zb(paramClass);
    } else {
      Zb zb = paramZb.ZL(paramClass);
      if (zb != null) {
        Zu zu = new Zu(paramClass, ZY);
        zb.ZS(zu);
        return zu;
      } 
      paramZb = paramZb.Zw(paramClass);
    } 
    if (paramClass.isArray()) {
      zk = Zg.ZI(Zs(paramZb, paramClass.getComponentType(), paramZr), paramZr);
    } else {
      Zk zk1;
      Zk[] arrayOfZk;
      if (paramClass.isInterface()) {
        zk1 = null;
        arrayOfZk = Zm(paramZb, paramClass, paramZr);
      } else {
        zk1 = ZC(paramZb, paramClass, paramZr);
        arrayOfZk = Zm(paramZb, paramClass, paramZr);
      } 
      if (paramClass == Properties.class) {
        zk = Zf.Ze(paramClass, paramZr, zk1, arrayOfZk, Zz, Zz);
      } else if (zk1 != null) {
        zk = zk1.Zv(paramClass, paramZr, zk1, arrayOfZk);
      } 
      if (zk == null) {
        zk = Zz(paramZb, paramClass, paramZr, zk1, arrayOfZk);
        if (zk == null) {
          zk = ZC(paramZb, paramClass, paramZr, zk1, arrayOfZk);
          if (zk == null)
            zk = ZP(paramClass, paramZr, zk1, arrayOfZk); 
        } 
      } 
    } 
    try {
      paramZb.Zf(zk);
      if (object != null)
        try {
          if (!zk.Zg())
            this.Z_.ZC(object, zk); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return zk;
  }
  
  protected Zk ZC(Zb paramZb, Class<?> paramClass, Zr paramZr) {
    Type type = Zx.ZH(paramClass);
    try {
      if (type == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zs(paramZb, type, paramZr);
  }
  
  protected Zk[] Zm(Zb paramZb, Class<?> paramClass, Zr paramZr) {
    Type[] arrayOfType = Zx.ZG(paramClass);
    try {
      if (arrayOfType != null)
        try {
          if (arrayOfType.length != 0) {
            int i = arrayOfType.length;
            Zk[] arrayOfZk = new Zk[i];
            for (byte b = 0; b < i; b++) {
              Type type = arrayOfType[b];
              arrayOfZk[b] = Zs(paramZb, type, paramZr);
            } 
            return arrayOfZk;
          } 
          return ZG;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return ZG;
  }
  
  protected Zk Zz(Zb paramZb, Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    if (paramZr == null)
      paramZr = ZY; 
    try {
      if (paramClass == Map.class)
        return ZK(paramClass, paramZr, paramZk, paramArrayOfZk); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == Collection.class)
        return Zy(paramClass, paramZr, paramZk, paramArrayOfZk); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass == AtomicReference.class)
        return Zh(paramClass, paramZr, paramZk, paramArrayOfZk); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramClass != Iterator.class)
        try {
          if (paramClass != Stream.class) {
            try {
              if (BaseStream.class.isAssignableFrom(paramClass)) {
                try {
                  if (DoubleStream.class.isAssignableFrom(paramClass))
                    return ZM(paramClass, paramZr, paramZk, paramArrayOfZk, ZQ); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (IntStream.class.isAssignableFrom(paramClass))
                    return ZM(paramClass, paramZr, paramZk, paramArrayOfZk, Zn); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (LongStream.class.isAssignableFrom(paramClass))
                    return ZM(paramClass, paramZr, paramZk, paramArrayOfZk, ZE); 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return null;
          } 
          return Zb(paramClass, paramZr, paramZk, paramArrayOfZk);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Zb(paramClass, paramZr, paramZk, paramArrayOfZk);
  }
  
  protected Zk ZC(Zb paramZb, Class<?> paramClass, Zr paramZr, Zk paramZk, Zk[] paramArrayOfZk) {
    int i = paramArrayOfZk.length;
    for (byte b = 0; b < i; b++) {
      Zk zk = paramArrayOfZk[b].Zv(paramClass, paramZr, paramZk, paramArrayOfZk);
      try {
        if (zk != null)
          return zk; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  protected Zk ZR(Zb paramZb, ParameterizedType paramParameterizedType, Zr paramZr) {
    Zr zr;
    Class<?> clazz = (Class)paramParameterizedType.getRawType();
    try {
      if (clazz == Zk)
        return ZT; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (clazz == Zg)
        return ZB; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Type[] arrayOfType = paramParameterizedType.getActualTypeArguments();
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = (arrayOfType == null) ? 0 : arrayOfType.length;
    if (!b) {
      zr = ZY;
    } else {
      Zk[] arrayOfZk = new Zk[b];
      byte b1 = 0;
      try {
        while (b1 < b) {
          arrayOfZk[b1] = Zs(paramZb, arrayOfType[b1], paramZr);
          b1++;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      zr = Zr.Z_(clazz, arrayOfZk);
    } 
    return ZQ(paramZb, clazz, zr);
  }
  
  protected Zk ZC(Zb paramZb, GenericArrayType paramGenericArrayType, Zr paramZr) {
    Zk zk = Zs(paramZb, paramGenericArrayType.getGenericComponentType(), paramZr);
    return Zg.ZI(zk, paramZr);
  }
  
  protected Zk Zh(Zb paramZb, TypeVariable<?> paramTypeVariable, Zr paramZr) {
    Type[] arrayOfType;
    String str = paramTypeVariable.getName();
    try {
      if (paramZr == null)
        throw new IllegalArgumentException(a(-589, -4675) + str + a(-578, 14330)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zk zk = paramZr.ZZ(str);
    try {
      if (zk != null)
        return zk; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramZr.ZW(str))
        return ZM; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramZr = paramZr.Zn(str);
    synchronized (paramTypeVariable) {
      arrayOfType = paramTypeVariable.getBounds();
    } 
    return Zs(paramZb, arrayOfType[0], paramZr);
  }
  
  protected Zk Zd(Zb paramZb, WildcardType paramWildcardType, Zr paramZr) {
    return Zs(paramZb, paramWildcardType.getUpperBounds()[0], paramZr);
  }
  
  static {
    // Byte code:
    //   0: bipush #31
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '/³{g ýVÐÚgj³òwÅEÛÔN ½bYHsôûË \\r=sÍgM6¥0Ö¾u%ôãÁV</GÀ|\\fz7óGñ'V­ÉtÐ®FKLtÖ £k\\r{O+P¢Õq®¡Eû&#/Â{:£àÿ~3<ÜGÛÑîTþærí©Î#×[TjÅ:Z%´ëUJý\\\f.!.f ÊÒB\×ýh6/ôSªm¥þ1Ý©â4"<^&Áë·£f}4©µ+Î®Æ4âìNmsùÊnzB¼Ç4ñÇUyE½M1[[ß¯ÎÖ# ½0ÖêÃTþú'N%P&¦ý¨b­J(Òïi8Cw\\bhC¬y'JÝ{²é\\nÝ\\b^2õÜxt¬"úý/³~ÀJô=o³_\\nFÜ]ÌRÆ«lc¼F-Ãù÷l{à¨kwg1ÐÁ\L1YBW8Ó©E§TöÇø]xùÄAX1[³~( (üÛvÈC×6ÙÛâoîÙjèMqO¼ C¸ÖI½ù\\n¶þÓ.q¤û\\tÔ&`\\bD´?#|~¸lÄ"Æß´ê¥Rî¦©%!Xo×ù:åwbùø)õ'gærEf®:ÅKvÙ%ÍÇo×,ÚÔ¾Zòß@\\bå{×WèHß¶¢(è?È³ãÞERXYûåÆÜ@Z§ÒwZÌÐPæ§GnA÷g×>Îè¦QAEU«qõîIgÜZ'5ÝDt¸õàÝöàüáîcSÛ6Åel«¨á Tã¬Qß$ÏW¨,Mº;«±÷Qh _ ñÄÛ(£Ðð\\n½|dË?Ñ#¤Gì~ÇÞBî;`HY'L¶Búl`bÙÈXÑ2y ÓsLplÿ?¿ÅM]@HÈ!×\\nå&«QI¦Â 8ð}axU9»è\\tªw$´îDßãN:·ÏÞËÒÿCTåÚ2fe[s,êìÑÌôßüç¶Sw¹¬ùg'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #100
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'L¹ÇcÕÁòCÔ]+ÇòHoî¶óNtóí#á²Avó­~F¹«×ð«½èªáê*®æì®j­:;ÝL1þ2ÁAZXTìÇãÄ¡92ÿ·ðÌCý1)@ºf3¼'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #24
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #108
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic com/fasterxml/Zh/Zi.a : [Ljava/lang/String;
    //   131: bipush #31
    //   133: anewarray java/lang/String
    //   136: putstatic com/fasterxml/Zh/Zi.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #118
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #84
    //   224: goto -> 244
    //   227: bipush #19
    //   229: goto -> 244
    //   232: bipush #15
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #51
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: iconst_0
    //   301: anewarray com/fasterxml/Zor/Zk
    //   304: putstatic com/fasterxml/Zh/Zi.ZG : [Lcom/fasterxml/Zor/Zk;
    //   307: new com/fasterxml/Zh/Zi
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: putstatic com/fasterxml/Zh/Zi.Ze : Lcom/fasterxml/Zh/Zi;
    //   317: invokestatic ZN : ()Lcom/fasterxml/Zh/Zr;
    //   320: putstatic com/fasterxml/Zh/Zi.ZY : Lcom/fasterxml/Zh/Zr;
    //   323: ldc java/lang/String
    //   325: putstatic com/fasterxml/Zh/Zi.Zs : Ljava/lang/Class;
    //   328: ldc java/lang/Object
    //   330: putstatic com/fasterxml/Zh/Zi.ZR : Ljava/lang/Class;
    //   333: ldc java/lang/Comparable
    //   335: putstatic com/fasterxml/Zh/Zi.Zg : Ljava/lang/Class;
    //   338: ldc java/lang/Enum
    //   340: putstatic com/fasterxml/Zh/Zi.Zk : Ljava/lang/Class;
    //   343: ldc com/fasterxml/Zor/Zb
    //   345: putstatic com/fasterxml/Zh/Zi.Zv : Ljava/lang/Class;
    //   348: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   351: putstatic com/fasterxml/Zh/Zi.Zb : Ljava/lang/Class;
    //   354: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
    //   357: putstatic com/fasterxml/Zh/Zi.Zy : Ljava/lang/Class;
    //   360: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   363: putstatic com/fasterxml/Zh/Zi.ZX : Ljava/lang/Class;
    //   366: getstatic java/lang/Long.TYPE : Ljava/lang/Class;
    //   369: putstatic com/fasterxml/Zh/Zi.ZL : Ljava/lang/Class;
    //   372: new com/fasterxml/Zh/Zy
    //   375: dup
    //   376: getstatic com/fasterxml/Zh/Zi.Zb : Ljava/lang/Class;
    //   379: invokespecial <init> : (Ljava/lang/Class;)V
    //   382: putstatic com/fasterxml/Zh/Zi.Zh : Lcom/fasterxml/Zh/Zy;
    //   385: new com/fasterxml/Zh/Zy
    //   388: dup
    //   389: getstatic com/fasterxml/Zh/Zi.Zy : Ljava/lang/Class;
    //   392: invokespecial <init> : (Ljava/lang/Class;)V
    //   395: putstatic com/fasterxml/Zh/Zi.ZQ : Lcom/fasterxml/Zh/Zy;
    //   398: new com/fasterxml/Zh/Zy
    //   401: dup
    //   402: getstatic com/fasterxml/Zh/Zi.ZX : Ljava/lang/Class;
    //   405: invokespecial <init> : (Ljava/lang/Class;)V
    //   408: putstatic com/fasterxml/Zh/Zi.Zn : Lcom/fasterxml/Zh/Zy;
    //   411: new com/fasterxml/Zh/Zy
    //   414: dup
    //   415: getstatic com/fasterxml/Zh/Zi.ZL : Ljava/lang/Class;
    //   418: invokespecial <init> : (Ljava/lang/Class;)V
    //   421: putstatic com/fasterxml/Zh/Zi.ZE : Lcom/fasterxml/Zh/Zy;
    //   424: new com/fasterxml/Zh/Zy
    //   427: dup
    //   428: getstatic com/fasterxml/Zh/Zi.Zs : Ljava/lang/Class;
    //   431: invokespecial <init> : (Ljava/lang/Class;)V
    //   434: putstatic com/fasterxml/Zh/Zi.Zz : Lcom/fasterxml/Zh/Zy;
    //   437: new com/fasterxml/Zh/Zy
    //   440: dup
    //   441: getstatic com/fasterxml/Zh/Zi.ZR : Ljava/lang/Class;
    //   444: invokespecial <init> : (Ljava/lang/Class;)V
    //   447: putstatic com/fasterxml/Zh/Zi.ZM : Lcom/fasterxml/Zh/Zy;
    //   450: new com/fasterxml/Zh/Zy
    //   453: dup
    //   454: getstatic com/fasterxml/Zh/Zi.Zg : Ljava/lang/Class;
    //   457: invokespecial <init> : (Ljava/lang/Class;)V
    //   460: putstatic com/fasterxml/Zh/Zi.ZB : Lcom/fasterxml/Zh/Zy;
    //   463: new com/fasterxml/Zh/Zy
    //   466: dup
    //   467: getstatic com/fasterxml/Zh/Zi.Zk : Ljava/lang/Class;
    //   470: invokespecial <init> : (Ljava/lang/Class;)V
    //   473: putstatic com/fasterxml/Zh/Zi.ZT : Lcom/fasterxml/Zh/Zy;
    //   476: new com/fasterxml/Zh/Zy
    //   479: dup
    //   480: getstatic com/fasterxml/Zh/Zi.Zv : Ljava/lang/Class;
    //   483: invokespecial <init> : (Ljava/lang/Class;)V
    //   486: putstatic com/fasterxml/Zh/Zi.ZJ : Lcom/fasterxml/Zh/Zy;
    //   489: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFDBB) & 0xFFFF;
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
      char c = 'Õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zh\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */