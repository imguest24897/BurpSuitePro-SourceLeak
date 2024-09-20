package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zm.Zl;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.util.Map;

public class Zoq {
  private final Zk Zz;
  
  private final Zi[] ZX;
  
  private final Map<String, Object> ZU;
  
  private final String[] Zw;
  
  private final Zl[] Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zoq(Zk paramZk, Zi[] paramArrayOfZi, Map<String, Object> paramMap, String[] paramArrayOfString, Zl[] paramArrayOfZl) {
    this.Zz = paramZk;
    this.ZX = paramArrayOfZi;
    this.ZU = paramMap;
    this.Zw = paramArrayOfString;
    this.Zi = paramArrayOfZl;
  }
  
  protected Zoq(Zoq paramZoq) {
    this.Zz = paramZoq.Zz;
    this.ZX = paramZoq.ZX;
    this.ZU = paramZoq.ZU;
    int i = this.ZX.length;
    this.Zw = new String[i];
    this.Zi = new Zl[i];
  }
  
  public static Zl ZB(Zk paramZk) {
    return new Zl(paramZk);
  }
  
  public Zoq Zn() {
    return new Zoq(this);
  }
  
  public boolean ZQ(Zg paramZg, Zyg paramZyg, String paramString, Object paramObject) throws IOException {
    Object object = this.ZU.get(paramString);
    String[] arrayOfString = Z_.ZI();
    try {
      if (object == null)
        return false; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = paramZg.ZR();
    if (object instanceof java.util.List) {
      boolean bool = false;
      for (Integer integer : object) {
        if (ZF(paramZg, paramZyg, paramString, paramObject, str, integer.intValue()))
          bool = true; 
        if (arrayOfString != null)
          break; 
      } 
      return bool;
    } 
    return ZF(paramZg, paramZyg, paramString, paramObject, str, ((Integer)object).intValue());
  }
  
  private final boolean ZF(Zg paramZg, Zyg paramZyg, String paramString1, Object paramObject, String paramString2, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   7: iload #6
    //   9: aaload
    //   10: astore #8
    //   12: astore #7
    //   14: aload #8
    //   16: aload_3
    //   17: invokevirtual ZR : (Ljava/lang/String;)Z
    //   20: ifne -> 29
    //   23: iconst_0
    //   24: ireturn
    //   25: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   28: athrow
    //   29: aload #4
    //   31: ifnull -> 59
    //   34: aload_0
    //   35: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   38: iload #6
    //   40: aaload
    //   41: ifnull -> 59
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: iconst_1
    //   52: goto -> 60
    //   55: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   58: athrow
    //   59: iconst_0
    //   60: istore #9
    //   62: iload #9
    //   64: ifeq -> 99
    //   67: aload_0
    //   68: aload_1
    //   69: aload_2
    //   70: aload #4
    //   72: iload #6
    //   74: aload #5
    //   76: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;ILjava/lang/String;)V
    //   79: aload_0
    //   80: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   83: iload #6
    //   85: aconst_null
    //   86: aastore
    //   87: aload #7
    //   89: ifnull -> 115
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   98: athrow
    //   99: aload_0
    //   100: getfield Zw : [Ljava/lang/String;
    //   103: iload #6
    //   105: aload #5
    //   107: aastore
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   114: athrow
    //   115: iconst_1
    //   116: ireturn
    // Exception table:
    //   from	to	target	type
    //   14	25	25	java/io/IOException
    //   29	44	47	java/io/IOException
    //   34	55	55	java/io/IOException
    //   62	92	95	java/io/IOException
    //   67	108	111	java/io/IOException
  }
  
  public boolean Zf(Zg paramZg, Zyg paramZyg, String paramString, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZU : Ljava/util/Map;
    //   7: aload_3
    //   8: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   13: astore #6
    //   15: astore #5
    //   17: aload #6
    //   19: ifnonnull -> 28
    //   22: iconst_0
    //   23: ireturn
    //   24: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   27: athrow
    //   28: aload #6
    //   30: instanceof java/util/List
    //   33: ifeq -> 200
    //   36: aload #6
    //   38: checkcast java/util/List
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #7
    //   48: aload #7
    //   50: invokeinterface next : ()Ljava/lang/Object;
    //   55: checkcast java/lang/Integer
    //   58: astore #8
    //   60: aload_0
    //   61: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   64: aload #8
    //   66: invokevirtual intValue : ()I
    //   69: aaload
    //   70: astore #9
    //   72: aload #9
    //   74: aload_3
    //   75: invokevirtual ZR : (Ljava/lang/String;)Z
    //   78: ifeq -> 144
    //   81: aload_1
    //   82: invokevirtual ZR : ()Ljava/lang/String;
    //   85: astore #10
    //   87: aload_1
    //   88: invokevirtual Zc : ()Lcom/fasterxml/Zb/Zg;
    //   91: pop
    //   92: aload_0
    //   93: getfield Zw : [Ljava/lang/String;
    //   96: aload #8
    //   98: invokevirtual intValue : ()I
    //   101: aload #10
    //   103: aastore
    //   104: aload #7
    //   106: invokeinterface hasNext : ()Z
    //   111: ifeq -> 139
    //   114: aload_0
    //   115: getfield Zw : [Ljava/lang/String;
    //   118: aload #7
    //   120: invokeinterface next : ()Ljava/lang/Object;
    //   125: checkcast java/lang/Integer
    //   128: invokevirtual intValue : ()I
    //   131: aload #10
    //   133: aastore
    //   134: aload #5
    //   136: ifnull -> 104
    //   139: aload #5
    //   141: ifnull -> 198
    //   144: aload_2
    //   145: aload_1
    //   146: invokevirtual ZM : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zm/Zl;
    //   149: astore #10
    //   151: aload_0
    //   152: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   155: aload #8
    //   157: invokevirtual intValue : ()I
    //   160: aload #10
    //   162: aastore
    //   163: aload #7
    //   165: invokeinterface hasNext : ()Z
    //   170: ifeq -> 198
    //   173: aload_0
    //   174: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   177: aload #7
    //   179: invokeinterface next : ()Ljava/lang/Object;
    //   184: checkcast java/lang/Integer
    //   187: invokevirtual intValue : ()I
    //   190: aload #10
    //   192: aastore
    //   193: aload #5
    //   195: ifnull -> 163
    //   198: iconst_1
    //   199: ireturn
    //   200: aload #6
    //   202: checkcast java/lang/Integer
    //   205: invokevirtual intValue : ()I
    //   208: istore #7
    //   210: aload_0
    //   211: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   214: iload #7
    //   216: aaload
    //   217: astore #8
    //   219: aload #8
    //   221: aload_3
    //   222: invokevirtual ZR : (Ljava/lang/String;)Z
    //   225: ifeq -> 289
    //   228: aload_0
    //   229: getfield Zw : [Ljava/lang/String;
    //   232: iload #7
    //   234: aload_1
    //   235: invokevirtual Zd : ()Ljava/lang/String;
    //   238: aastore
    //   239: aload_1
    //   240: invokevirtual Zc : ()Lcom/fasterxml/Zb/Zg;
    //   243: pop
    //   244: aload #4
    //   246: ifnull -> 281
    //   249: goto -> 256
    //   252: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   255: athrow
    //   256: aload_0
    //   257: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   260: iload #7
    //   262: aaload
    //   263: ifnull -> 281
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   272: athrow
    //   273: iconst_1
    //   274: goto -> 282
    //   277: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   280: athrow
    //   281: iconst_0
    //   282: istore #9
    //   284: aload #5
    //   286: ifnull -> 338
    //   289: aload_2
    //   290: aload_1
    //   291: invokevirtual ZM : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zm/Zl;
    //   294: astore #10
    //   296: aload_0
    //   297: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   300: iload #7
    //   302: aload #10
    //   304: aastore
    //   305: aload #4
    //   307: ifnull -> 335
    //   310: aload_0
    //   311: getfield Zw : [Ljava/lang/String;
    //   314: iload #7
    //   316: aaload
    //   317: ifnull -> 335
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   326: athrow
    //   327: iconst_1
    //   328: goto -> 336
    //   331: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   334: athrow
    //   335: iconst_0
    //   336: istore #9
    //   338: iload #9
    //   340: ifeq -> 380
    //   343: aload_0
    //   344: getfield Zw : [Ljava/lang/String;
    //   347: iload #7
    //   349: aaload
    //   350: astore #10
    //   352: aload_0
    //   353: getfield Zw : [Ljava/lang/String;
    //   356: iload #7
    //   358: aconst_null
    //   359: aastore
    //   360: aload_0
    //   361: aload_1
    //   362: aload_2
    //   363: aload #4
    //   365: iload #7
    //   367: aload #10
    //   369: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;ILjava/lang/String;)V
    //   372: aload_0
    //   373: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   376: iload #7
    //   378: aconst_null
    //   379: aastore
    //   380: iconst_1
    //   381: ireturn
    // Exception table:
    //   from	to	target	type
    //   17	24	24	java/io/IOException
    //   219	249	252	java/io/IOException
    //   228	266	269	java/io/IOException
    //   256	277	277	java/io/IOException
    //   296	320	323	java/io/IOException
    //   310	331	331	java/io/IOException
  }
  
  public Object Zb(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: iconst_0
    //   4: istore #5
    //   6: astore #4
    //   8: aload_0
    //   9: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   12: arraylength
    //   13: istore #6
    //   15: iload #5
    //   17: iload #6
    //   19: if_icmpge -> 392
    //   22: aload_0
    //   23: getfield Zw : [Ljava/lang/String;
    //   26: iload #5
    //   28: aaload
    //   29: astore #7
    //   31: aload_0
    //   32: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   35: iload #5
    //   37: aaload
    //   38: astore #8
    //   40: aload #7
    //   42: ifnonnull -> 272
    //   45: aload_0
    //   46: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   49: iload #5
    //   51: aaload
    //   52: astore #9
    //   54: aload #9
    //   56: ifnonnull -> 71
    //   59: aload #4
    //   61: ifnull -> 384
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   70: athrow
    //   71: aload #9
    //   73: invokevirtual ZK : ()Lcom/fasterxml/Zb/Zl;
    //   76: astore #10
    //   78: aload #10
    //   80: invokevirtual Zl : ()Z
    //   83: ifeq -> 145
    //   86: aload #9
    //   88: aload_1
    //   89: invokevirtual Zv : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zb/Zg;
    //   92: astore #11
    //   94: aload #11
    //   96: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   99: pop
    //   100: aload #8
    //   102: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   105: astore #12
    //   107: aload #11
    //   109: aload_2
    //   110: aload #12
    //   112: invokevirtual Zp : ()Lcom/fasterxml/Zor/Zk;
    //   115: invokestatic Zg : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;)Ljava/lang/Object;
    //   118: astore #13
    //   120: aload #13
    //   122: ifnull -> 145
    //   125: aload #12
    //   127: aload_3
    //   128: aload #13
    //   130: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   133: aload #4
    //   135: ifnull -> 384
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   144: athrow
    //   145: aload #8
    //   147: invokevirtual Zw : ()Z
    //   150: ifne -> 210
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   159: athrow
    //   160: aload_2
    //   161: aload_0
    //   162: getfield Zz : Lcom/fasterxml/Zor/Zk;
    //   165: aload #8
    //   167: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   170: invokevirtual ZT : ()Ljava/lang/String;
    //   173: sipush #7429
    //   176: sipush #-9087
    //   179: invokestatic a : (II)Ljava/lang/String;
    //   182: iconst_1
    //   183: anewarray java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload #8
    //   190: invokevirtual ZP : ()Ljava/lang/String;
    //   193: aastore
    //   194: invokevirtual Zo : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   197: pop
    //   198: aload #4
    //   200: ifnull -> 267
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   209: athrow
    //   210: aload #8
    //   212: invokevirtual ZA : ()Ljava/lang/String;
    //   215: astore #7
    //   217: aload #7
    //   219: ifnonnull -> 267
    //   222: aload_2
    //   223: aload_0
    //   224: getfield Zz : Lcom/fasterxml/Zor/Zk;
    //   227: aload #8
    //   229: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   232: invokevirtual ZT : ()Ljava/lang/String;
    //   235: sipush #7428
    //   238: sipush #-6976
    //   241: invokestatic a : (II)Ljava/lang/String;
    //   244: iconst_1
    //   245: anewarray java/lang/Object
    //   248: dup
    //   249: iconst_0
    //   250: aload #8
    //   252: invokevirtual ZP : ()Ljava/lang/String;
    //   255: aastore
    //   256: invokevirtual Zo : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   259: pop
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   266: athrow
    //   267: aload #4
    //   269: ifnull -> 373
    //   272: aload_0
    //   273: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   276: iload #5
    //   278: aaload
    //   279: ifnonnull -> 373
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   288: athrow
    //   289: aload #8
    //   291: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   294: astore #9
    //   296: aload #9
    //   298: invokevirtual ZW : ()Z
    //   301: ifne -> 321
    //   304: aload_2
    //   305: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY : Lcom/fasterxml/Zor/Zyp;
    //   308: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   311: ifeq -> 371
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   320: athrow
    //   321: aload_2
    //   322: aload_3
    //   323: invokevirtual getClass : ()Ljava/lang/Class;
    //   326: aload #9
    //   328: invokevirtual ZT : ()Ljava/lang/String;
    //   331: sipush #7426
    //   334: sipush #23910
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: iconst_2
    //   341: anewarray java/lang/Object
    //   344: dup
    //   345: iconst_0
    //   346: aload #9
    //   348: invokevirtual ZT : ()Ljava/lang/String;
    //   351: aastore
    //   352: dup
    //   353: iconst_1
    //   354: aload #8
    //   356: invokevirtual ZP : ()Ljava/lang/String;
    //   359: aastore
    //   360: invokevirtual ZX : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   363: pop
    //   364: goto -> 371
    //   367: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   370: athrow
    //   371: aload_3
    //   372: areturn
    //   373: aload_0
    //   374: aload_1
    //   375: aload_2
    //   376: aload_3
    //   377: iload #5
    //   379: aload #7
    //   381: invokevirtual Zp : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Ljava/lang/Object;ILjava/lang/String;)V
    //   384: iinc #5, 1
    //   387: aload #4
    //   389: ifnull -> 15
    //   392: aload_3
    //   393: areturn
    // Exception table:
    //   from	to	target	type
    //   54	64	67	java/io/IOException
    //   120	138	141	java/io/IOException
    //   125	153	156	java/io/IOException
    //   145	203	206	java/io/IOException
    //   217	260	263	java/io/IOException
    //   267	282	285	java/io/IOException
    //   296	314	317	java/io/IOException
    //   304	364	367	java/io/IOException
  }
  
  public Object ZP(Zg paramZg, Zyg paramZyg, Zok paramZok, Zc paramZc) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_0
    //   4: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   7: arraylength
    //   8: istore #6
    //   10: iload #6
    //   12: anewarray java/lang/Object
    //   15: astore #7
    //   17: astore #5
    //   19: iconst_0
    //   20: istore #8
    //   22: iload #8
    //   24: iload #6
    //   26: if_icmpge -> 427
    //   29: aload_0
    //   30: getfield Zw : [Ljava/lang/String;
    //   33: iload #8
    //   35: aaload
    //   36: astore #9
    //   38: aload_0
    //   39: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   42: iload #8
    //   44: aaload
    //   45: astore #10
    //   47: aload #9
    //   49: ifnonnull -> 168
    //   52: aload_0
    //   53: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   56: iload #8
    //   58: aaload
    //   59: astore #11
    //   61: aload #11
    //   63: ifnull -> 419
    //   66: aload #11
    //   68: invokevirtual ZK : ()Lcom/fasterxml/Zb/Zl;
    //   71: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   74: if_acmpne -> 96
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   83: athrow
    //   84: aload #5
    //   86: ifnull -> 419
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   95: athrow
    //   96: aload #10
    //   98: invokevirtual Zw : ()Z
    //   101: ifne -> 161
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   110: athrow
    //   111: aload_2
    //   112: aload_0
    //   113: getfield Zz : Lcom/fasterxml/Zor/Zk;
    //   116: aload #10
    //   118: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   121: invokevirtual ZT : ()Ljava/lang/String;
    //   124: sipush #7431
    //   127: sipush #-25925
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: iconst_1
    //   134: anewarray java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload #10
    //   141: invokevirtual ZP : ()Ljava/lang/String;
    //   144: aastore
    //   145: invokevirtual Zo : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   148: pop
    //   149: aload #5
    //   151: ifnull -> 168
    //   154: goto -> 161
    //   157: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   160: athrow
    //   161: aload #10
    //   163: invokevirtual ZA : ()Ljava/lang/String;
    //   166: astore #9
    //   168: aload_0
    //   169: getfield Zi : [Lcom/fasterxml/Zm/Zl;
    //   172: iload #8
    //   174: aaload
    //   175: ifnull -> 205
    //   178: aload #7
    //   180: iload #8
    //   182: aload_0
    //   183: aload_1
    //   184: aload_2
    //   185: iload #8
    //   187: aload #9
    //   189: invokevirtual Zz : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;ILjava/lang/String;)Ljava/lang/Object;
    //   192: aastore
    //   193: aload #5
    //   195: ifnull -> 292
    //   198: goto -> 205
    //   201: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   204: athrow
    //   205: aload_2
    //   206: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY : Lcom/fasterxml/Zor/Zyp;
    //   209: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   212: ifeq -> 277
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   221: athrow
    //   222: aload #10
    //   224: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   227: astore #11
    //   229: aload_2
    //   230: aload_0
    //   231: getfield Zz : Lcom/fasterxml/Zor/Zk;
    //   234: aload #11
    //   236: invokevirtual ZT : ()Ljava/lang/String;
    //   239: sipush #7430
    //   242: sipush #15626
    //   245: invokestatic a : (II)Ljava/lang/String;
    //   248: iconst_2
    //   249: anewarray java/lang/Object
    //   252: dup
    //   253: iconst_0
    //   254: aload #11
    //   256: invokevirtual ZT : ()Ljava/lang/String;
    //   259: aastore
    //   260: dup
    //   261: iconst_1
    //   262: aload_0
    //   263: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   266: iload #8
    //   268: aaload
    //   269: invokevirtual ZP : ()Ljava/lang/String;
    //   272: aastore
    //   273: invokevirtual Zo : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   276: pop
    //   277: aload #7
    //   279: iload #8
    //   281: aload_0
    //   282: aload_1
    //   283: aload_2
    //   284: iload #8
    //   286: aload #9
    //   288: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;ILjava/lang/String;)Ljava/lang/Object;
    //   291: aastore
    //   292: aload #10
    //   294: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   297: astore #11
    //   299: aload #11
    //   301: invokevirtual Zt : ()I
    //   304: iflt -> 419
    //   307: aload_3
    //   308: aload #11
    //   310: aload #7
    //   312: iload #8
    //   314: aaload
    //   315: invokevirtual Zr : (Lcom/fasterxml/Zo/Zv;Ljava/lang/Object;)Z
    //   318: pop
    //   319: aload #10
    //   321: invokevirtual Zv : ()Lcom/fasterxml/Zo/Zv;
    //   324: astore #12
    //   326: aload #12
    //   328: ifnull -> 419
    //   331: aload #12
    //   333: invokevirtual Zt : ()I
    //   336: iflt -> 419
    //   339: goto -> 346
    //   342: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   345: athrow
    //   346: aload #12
    //   348: invokevirtual Zp : ()Lcom/fasterxml/Zor/Zk;
    //   351: ldc java/lang/String
    //   353: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   356: ifeq -> 375
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   365: athrow
    //   366: aload #9
    //   368: astore #13
    //   370: aload #5
    //   372: ifnull -> 410
    //   375: aload_2
    //   376: aload_1
    //   377: invokevirtual Zb : (Lcom/fasterxml/Zb/Zg;)Lcom/fasterxml/Zm/Zl;
    //   380: astore #14
    //   382: aload #14
    //   384: aload #9
    //   386: invokevirtual ZD : (Ljava/lang/String;)V
    //   389: aload #12
    //   391: invokevirtual ZD : ()Lcom/fasterxml/Zor/Zyo;
    //   394: aload #14
    //   396: invokevirtual ZD : ()Lcom/fasterxml/Zb/Zg;
    //   399: aload_2
    //   400: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   403: astore #13
    //   405: aload #14
    //   407: invokevirtual close : ()V
    //   410: aload_3
    //   411: aload #12
    //   413: aload #13
    //   415: invokevirtual Zr : (Lcom/fasterxml/Zo/Zv;Ljava/lang/Object;)Z
    //   418: pop
    //   419: iinc #8, 1
    //   422: aload #5
    //   424: ifnull -> 22
    //   427: aload #4
    //   429: aload_2
    //   430: aload_3
    //   431: invokevirtual ZP : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Ze/Zok;)Ljava/lang/Object;
    //   434: astore #8
    //   436: iconst_0
    //   437: istore #9
    //   439: iload #9
    //   441: iload #6
    //   443: if_icmpge -> 493
    //   446: aload_0
    //   447: getfield ZX : [Lcom/fasterxml/Ze/Zi;
    //   450: iload #9
    //   452: aaload
    //   453: invokevirtual Zg : ()Lcom/fasterxml/Zo/Zv;
    //   456: astore #10
    //   458: aload #10
    //   460: invokevirtual Zt : ()I
    //   463: ifge -> 485
    //   466: aload #10
    //   468: aload #8
    //   470: aload #7
    //   472: iload #9
    //   474: aaload
    //   475: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   478: goto -> 485
    //   481: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   484: athrow
    //   485: iinc #9, 1
    //   488: aload #5
    //   490: ifnull -> 439
    //   493: aload #8
    //   495: areturn
    // Exception table:
    //   from	to	target	type
    //   61	77	80	java/io/IOException
    //   66	89	92	java/io/IOException
    //   84	104	107	java/io/IOException
    //   96	154	157	java/io/IOException
    //   168	198	201	java/io/IOException
    //   178	215	218	java/io/IOException
    //   326	339	342	java/io/IOException
    //   331	359	362	java/io/IOException
    //   458	478	481	java/io/IOException
  }
  
  protected final Object Zz(Zg paramZg, Zyg paramZyg, int paramInt, String paramString) throws IOException {
    Zg zg1 = this.Zi[paramInt].Zv(paramZg);
    Zl zl = zg1.ZV();
    try {
      if (zl == Zl.VALUE_NULL)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zl zl1 = paramZyg.Zb(paramZg);
    zl1.Zd();
    zl1.ZD(paramString);
    zl1.ZE(zg1);
    zl1.ZI();
    Zg zg2 = zl1.Zv(paramZg);
    zg2.ZV();
    return this.ZX[paramInt].Zg().Zt(zg2, paramZyg);
  }
  
  protected final Object Zc(Zg paramZg, Zyg paramZyg, int paramInt, String paramString) throws IOException {
    Zl zl = paramZyg.Zb(paramZg);
    zl.Zd();
    zl.ZD(paramString);
    zl.ZI();
    Zg zg = zl.Zv(paramZg);
    zg.ZV();
    return this.ZX[paramInt].Zg().Zt(zg, paramZyg);
  }
  
  protected final void Zp(Zg paramZg, Zyg paramZyg, Object paramObject, int paramInt, String paramString) throws IOException {
    try {
      if (paramString == null)
        paramZyg.Z_(this.Zz, a(7427, -17024), new Object[0]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zg zg1 = this.Zi[paramInt].Zv(paramZg);
    Zl zl = zg1.ZV();
    try {
      if (zl == Zl.VALUE_NULL) {
        this.ZX[paramInt].Zg().Zj(paramObject, null);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zl zl1 = paramZyg.Zb(paramZg);
    zl1.Zd();
    zl1.ZD(paramString);
    zl1.ZE(zg1);
    zl1.ZI();
    Zg zg2 = zl1.Zv(paramZg);
    zg2.ZV();
    this.ZX[paramInt].Zg().ZP(zg2, paramZyg, paramObject);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ò`÷3@×=DàëXI§yÃxzc'÷®~\\fy.¸Èl±XÄiÎtÝ±Z&0J¯vK\Q®H`ÑF¨uF3_.Î¦²ª:ÓçÐS¯åíÛ ¨L(-»÷ä§Ûý¢UÆ hAMÙá¦·pP¾óJQ\\roKxýÅ¤Jç=í¢ÈÃå­Ãõôbú@ÄÓýwàªJ8ûwG¤{«ÑÄ&Ä¦-\\fï0àÝóTáÝPé:¢kfØC\fCK=}ï¾«°#!'ó_È0Wz\\rVwTmüB'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #47
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #104
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
    //   68: ldc 'bQK l4,+·ôXª1ëß»ÿÃ%¹Àë7ÒX¸(®ÊÉ{9àÊ´ð{B°-ßç*rn¤\\b±íc*ÔovGã\\tÍ:®ËbzFxI¤>>!æèßpÅðóº]«:¢Ë5J\\tþ&,'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #47
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
    //   129: putstatic com/fasterxml/Ze/Zoq.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Ze/Zoq.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #64
    //   219: goto -> 244
    //   222: bipush #124
    //   224: goto -> 244
    //   227: bipush #101
    //   229: goto -> 244
    //   232: bipush #32
    //   234: goto -> 244
    //   237: bipush #11
    //   239: goto -> 244
    //   242: bipush #119
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
    int i = (paramInt1 ^ 0x1D06) & 0xFFFF;
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
      char c = '¶';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zoq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */