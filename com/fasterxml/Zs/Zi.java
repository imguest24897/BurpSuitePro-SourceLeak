package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zk;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zg.Zfc;
import com.fasterxml.Zg.Zh;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zg.Zv;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zd;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zm.Zj;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.math.BigDecimal;

abstract class Zi<T extends Zb> extends Zl<T> implements Zi {
  protected final Boolean ZY;
  
  protected final boolean Zt;
  
  protected final boolean ZX;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zi(Class<T> paramClass, Boolean paramBoolean) {
    super(paramClass);
    this.ZY = paramBoolean;
    this.Zt = true;
    this.ZX = true;
  }
  
  protected Zi(Zi<?> paramZi, boolean paramBoolean1, boolean paramBoolean2) {
    super(paramZi);
    this.ZY = paramZi.ZY;
    this.Zt = paramBoolean1;
    this.ZX = paramBoolean2;
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.Zy(paramZg, paramZyg);
  }
  
  public Zd Zb() {
    return Zd.Untyped;
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return this.ZY;
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zyc zyc = paramZyg.Za();
    Boolean bool1 = zyc.ZT(Zh.class);
    Boolean bool2 = zyc.ZT(Zr.class);
    Boolean bool3 = zyc.ZT(Zb.class);
    boolean bool4 = Za(bool1, bool3);
    boolean bool5 = Za(bool2, bool3);
    try {
      if (bool4 == this.Zt)
        try {
          return (bool5 == this.ZX) ? this : ZZ(bool4, bool5);
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return ZZ(bool4, bool5);
  }
  
  private static boolean Za(Boolean paramBoolean1, Boolean paramBoolean2) {
    try {
      if (paramBoolean1 != null)
        return paramBoolean1.booleanValue(); 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    try {
      if (paramBoolean2 != null)
        return paramBoolean2.booleanValue(); 
    } catch (ArithmeticException arithmeticException) {
      throw a(null);
    } 
    return true;
  }
  
  protected abstract Zyo<?> ZZ(boolean paramBoolean1, boolean paramBoolean2);
  
  protected void ZS(Zg paramZg, Zyg paramZyg, Zfc paramZfc, String paramString, Zr paramZr, Zb paramZb1, Zb paramZb2) throws IOException {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    try {
      if (paramZyg.Zg(Zyp.FAIL_ON_READING_DUP_TREE_KEY))
        paramZyg.ZF(Zb.class, c(30008, 5650), new Object[] { paramString }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZyg.ZA(Zq.DUPLICATE_PROPERTIES)) {
        try {
          if (paramZb1.ZJ()) {
            ((Zh)paramZb1).ZV(paramZb2);
            paramZr.Zm(paramString, paramZb1);
            if (arrayOfZbqc != null) {
              Zh zh1 = paramZfc.Z_();
              zh1.ZV(paramZb1);
              zh1.ZV(paramZb2);
              paramZr.Zm(paramString, (Zb)zh1);
              return;
            } 
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zh zh = paramZfc.Z_();
    zh.ZV(paramZb1);
    zh.ZV(paramZb2);
    paramZr.Zm(paramString, (Zb)zh);
  }
  
  protected final Zr Za(Zg paramZg, Zyg paramZyg, Zfc paramZfc, Zb paramZb) throws IOException {
    Zr zr = paramZfc.Ze();
    Zbqc[] arrayOfZbqc = Zl.Zn();
    String str = paramZg.ZS();
    while (str != null) {
      Zv<?> zv;
      Zb zb1;
      Zl zl = paramZg.ZV();
      if (zl == null)
        zl = Zl.NOT_AVAILABLE; 
      switch (zl.Zs()) {
        case 1:
          zv = Zl(paramZg, paramZyg, paramZfc, paramZb, (Zv<?>)paramZfc.Ze());
        case 3:
          zv = Zl(paramZg, paramZyg, paramZfc, paramZb, (Zv<?>)paramZfc.Z_());
        default:
          zb1 = ZJ(paramZg, paramZyg);
          break;
      } 
      Zb zb2 = zr.Zm(str, zb1);
      try {
        if (zb2 != null)
          ZS(paramZg, paramZyg, paramZfc, str, zr, zb2, zb1); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      str = paramZg.ZU();
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zr;
  }
  
  protected final Zb ZS(Zg paramZg, Zyg paramZyg, Zr paramZr, Zb paramZb) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore #5
    //   5: aload_1
    //   6: invokevirtual Zp : ()Z
    //   9: ifeq -> 23
    //   12: aload_1
    //   13: invokevirtual ZU : ()Ljava/lang/String;
    //   16: astore #6
    //   18: aload #5
    //   20: ifnull -> 60
    //   23: aload_1
    //   24: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   27: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   30: ifne -> 54
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   39: athrow
    //   40: aload_0
    //   41: aload_1
    //   42: aload_2
    //   43: invokevirtual deserialize : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   46: checkcast com/fasterxml/Zor/Zb
    //   49: areturn
    //   50: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   53: athrow
    //   54: aload_1
    //   55: invokevirtual ZS : ()Ljava/lang/String;
    //   58: astore #6
    //   60: aload_2
    //   61: invokevirtual Zz : ()Lcom/fasterxml/Zg/Zfc;
    //   64: astore #7
    //   66: aload #6
    //   68: ifnull -> 498
    //   71: aload_1
    //   72: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   75: astore #8
    //   77: aload_3
    //   78: aload #6
    //   80: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   83: astore #9
    //   85: aload #9
    //   87: ifnull -> 249
    //   90: aload #9
    //   92: instanceof com/fasterxml/Zg/Zr
    //   95: ifeq -> 177
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload #8
    //   107: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   110: if_acmpne -> 249
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   119: athrow
    //   120: aload_0
    //   121: getfield ZX : Z
    //   124: ifeq -> 249
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: aload_1
    //   136: aload_2
    //   137: aload #9
    //   139: checkcast com/fasterxml/Zg/Zr
    //   142: aload #4
    //   144: invokevirtual ZS : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zg/Zr;Lcom/fasterxml/Zs/Zb;)Lcom/fasterxml/Zor/Zb;
    //   147: astore #10
    //   149: aload #10
    //   151: aload #9
    //   153: if_acmpeq -> 487
    //   156: aload_3
    //   157: aload #6
    //   159: aload #10
    //   161: invokevirtual Zo : (Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)Lcom/fasterxml/Zor/Zb;
    //   164: pop
    //   165: aload #5
    //   167: ifnull -> 487
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: aload #9
    //   179: instanceof com/fasterxml/Zg/Zh
    //   182: ifeq -> 249
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: aload #8
    //   194: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   197: if_acmpne -> 249
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: aload_0
    //   208: getfield Zt : Z
    //   211: ifeq -> 249
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   220: athrow
    //   221: aload_0
    //   222: aload_1
    //   223: aload_2
    //   224: aload #7
    //   226: aload #4
    //   228: aload #9
    //   230: checkcast com/fasterxml/Zg/Zh
    //   233: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zg/Zfc;Lcom/fasterxml/Zs/Zb;Lcom/fasterxml/Zg/Zv;)Lcom/fasterxml/Zg/Zv;
    //   236: pop
    //   237: aload #5
    //   239: ifnull -> 487
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   248: athrow
    //   249: aload #8
    //   251: ifnonnull -> 266
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   260: athrow
    //   261: getstatic com/fasterxml/Zb/Zl.NOT_AVAILABLE : Lcom/fasterxml/Zb/Zl;
    //   264: astore #8
    //   266: aload #8
    //   268: invokevirtual Zs : ()I
    //   271: tableswitch default -> 470, 1 -> 328, 2 -> 470, 3 -> 350, 4 -> 470, 5 -> 470, 6 -> 372, 7 -> 388, 8 -> 470, 9 -> 403, 10 -> 416, 11 -> 429
    //   328: aload_0
    //   329: aload_1
    //   330: aload_2
    //   331: aload #7
    //   333: aload #4
    //   335: aload #7
    //   337: invokevirtual Ze : ()Lcom/fasterxml/Zg/Zr;
    //   340: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zg/Zfc;Lcom/fasterxml/Zs/Zb;Lcom/fasterxml/Zg/Zv;)Lcom/fasterxml/Zg/Zv;
    //   343: astore #10
    //   345: aload #5
    //   347: ifnull -> 478
    //   350: aload_0
    //   351: aload_1
    //   352: aload_2
    //   353: aload #7
    //   355: aload #4
    //   357: aload #7
    //   359: invokevirtual Z_ : ()Lcom/fasterxml/Zg/Zh;
    //   362: invokevirtual Zl : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zg/Zfc;Lcom/fasterxml/Zs/Zb;Lcom/fasterxml/Zg/Zv;)Lcom/fasterxml/Zg/Zv;
    //   365: astore #10
    //   367: aload #5
    //   369: ifnull -> 478
    //   372: aload #7
    //   374: aload_1
    //   375: invokevirtual ZR : ()Ljava/lang/String;
    //   378: invokevirtual ZP : (Ljava/lang/String;)Lcom/fasterxml/Zg/Zb;
    //   381: astore #10
    //   383: aload #5
    //   385: ifnull -> 478
    //   388: aload_0
    //   389: aload_1
    //   390: aload_2
    //   391: aload #7
    //   393: invokevirtual Zx : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zg/Zfc;)Lcom/fasterxml/Zor/Zb;
    //   396: astore #10
    //   398: aload #5
    //   400: ifnull -> 478
    //   403: aload #7
    //   405: iconst_1
    //   406: invokevirtual Z_ : (Z)Lcom/fasterxml/Zg/Zw;
    //   409: astore #10
    //   411: aload #5
    //   413: ifnull -> 478
    //   416: aload #7
    //   418: iconst_0
    //   419: invokevirtual Z_ : (Z)Lcom/fasterxml/Zg/Zw;
    //   422: astore #10
    //   424: aload #5
    //   426: ifnull -> 478
    //   429: aload_2
    //   430: getstatic com/fasterxml/Zj/Zd.READ_NULL_PROPERTIES : Lcom/fasterxml/Zj/Zd;
    //   433: invokevirtual Zj : (Lcom/fasterxml/Zj/Zz;)Z
    //   436: ifne -> 458
    //   439: goto -> 446
    //   442: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   445: athrow
    //   446: aload #5
    //   448: ifnull -> 487
    //   451: goto -> 458
    //   454: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   457: athrow
    //   458: aload #7
    //   460: invokevirtual ZW : ()Lcom/fasterxml/Zg/Zs;
    //   463: astore #10
    //   465: aload #5
    //   467: ifnull -> 478
    //   470: aload_0
    //   471: aload_1
    //   472: aload_2
    //   473: invokevirtual Zc : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zb;
    //   476: astore #10
    //   478: aload_3
    //   479: aload #6
    //   481: aload #10
    //   483: invokevirtual Zo : (Ljava/lang/String;Lcom/fasterxml/Zor/Zb;)Lcom/fasterxml/Zor/Zb;
    //   486: pop
    //   487: aload_1
    //   488: invokevirtual ZU : ()Ljava/lang/String;
    //   491: astore #6
    //   493: aload #5
    //   495: ifnull -> 66
    //   498: aload_3
    //   499: areturn
    // Exception table:
    //   from	to	target	type
    //   18	33	36	java/io/IOException
    //   23	50	50	java/io/IOException
    //   85	98	101	java/io/IOException
    //   90	113	116	java/io/IOException
    //   105	127	130	java/io/IOException
    //   149	170	173	java/io/IOException
    //   156	185	188	java/io/IOException
    //   177	200	203	java/io/IOException
    //   192	214	217	java/io/IOException
    //   207	242	245	java/io/IOException
    //   221	254	257	java/io/IOException
    //   424	439	442	java/io/IOException
    //   429	451	454	java/io/IOException
  }
  
  protected final Zv<?> Zl(Zg paramZg, Zyg paramZyg, Zfc paramZfc, Zb paramZb, Zv<?> paramZv) throws IOException {
    Zv<?> zv = paramZv;
    Zbqc[] arrayOfZbqc = Zl.Zn();
    int i = paramZyg.Zi() & Z_;
    while (true) {
      while (true)
        break; 
      if (zv == null)
        return paramZv; 
    } 
  }
  
  protected final Zb ZJ(Zg paramZg, Zyg paramZyg) throws IOException {
    Zfc zfc = paramZyg.Zz();
    try {
      switch (paramZg.Zy()) {
        case 2:
          return (Zb)zfc.Ze();
        case 6:
          return (Zb)zfc.ZP(paramZg.ZR());
        case 7:
          return Zx(paramZg, paramZyg, zfc);
        case 8:
          return ZY(paramZg, paramZyg, zfc);
        case 9:
          return (Zb)zfc.Z_(true);
        case 10:
          return (Zb)zfc.Z_(false);
        case 11:
          return (Zb)zfc.ZW();
        case 12:
          return Zv(paramZg, paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zb)paramZyg.ZB(ZX(), paramZg);
  }
  
  protected final Zb Zc(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 2:
          return (Zb)paramZyg.Zz().Ze();
        case 8:
          return ZY(paramZg, paramZyg, paramZyg.Zz());
        case 12:
          return Zv(paramZg, paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zb)paramZyg.ZB(ZX(), paramZg);
  }
  
  protected final Zb Zn(Zg paramZg, int paramInt, Zfc paramZfc) throws IOException {
    try {
      if (paramInt != 0) {
        try {
          if (Zyp.USE_BIG_INTEGER_FOR_INTS.Zq(paramInt))
            return (Zb)paramZfc.Zp(paramZg.ZX()); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return (Zb)paramZfc.Zp(paramZg.ZE());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zk zk = paramZg.ZL();
    try {
      if (zk == Zk.INT)
        return (Zb)paramZfc.Zm(paramZg.Ze()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zk == Zk.LONG)
        return (Zb)paramZfc.Zp(paramZg.ZE()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zb)paramZfc.Zp(paramZg.ZX());
  }
  
  protected final Zb Zx(Zg paramZg, Zyg paramZyg, Zfc paramZfc) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: invokevirtual Zi : ()I
    //   7: istore #6
    //   9: astore #4
    //   11: iload #6
    //   13: getstatic com/fasterxml/Zs/Zi.Z_ : I
    //   16: iand
    //   17: ifeq -> 87
    //   20: getstatic com/fasterxml/Zor/Zyp.USE_BIG_INTEGER_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   23: iload #6
    //   25: invokevirtual Zq : (I)Z
    //   28: ifeq -> 48
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: getstatic com/fasterxml/Zb/Zk.BIG_INTEGER : Lcom/fasterxml/Zb/Zk;
    //   41: astore #5
    //   43: aload #4
    //   45: ifnull -> 93
    //   48: getstatic com/fasterxml/Zor/Zyp.USE_LONG_FOR_INTS : Lcom/fasterxml/Zor/Zyp;
    //   51: iload #6
    //   53: invokevirtual Zq : (I)Z
    //   56: ifeq -> 76
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   65: athrow
    //   66: getstatic com/fasterxml/Zb/Zk.LONG : Lcom/fasterxml/Zb/Zk;
    //   69: astore #5
    //   71: aload #4
    //   73: ifnull -> 93
    //   76: aload_1
    //   77: invokevirtual ZL : ()Lcom/fasterxml/Zb/Zk;
    //   80: astore #5
    //   82: aload #4
    //   84: ifnull -> 93
    //   87: aload_1
    //   88: invokevirtual ZL : ()Lcom/fasterxml/Zb/Zk;
    //   91: astore #5
    //   93: aload #5
    //   95: getstatic com/fasterxml/Zb/Zk.INT : Lcom/fasterxml/Zb/Zk;
    //   98: if_acmpne -> 114
    //   101: aload_3
    //   102: aload_1
    //   103: invokevirtual Ze : ()I
    //   106: invokevirtual Zm : (I)Lcom/fasterxml/Zg/Zn;
    //   109: areturn
    //   110: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   113: athrow
    //   114: aload #5
    //   116: getstatic com/fasterxml/Zb/Zk.LONG : Lcom/fasterxml/Zb/Zk;
    //   119: if_acmpne -> 135
    //   122: aload_3
    //   123: aload_1
    //   124: invokevirtual ZE : ()J
    //   127: invokevirtual Zp : (J)Lcom/fasterxml/Zg/Zn;
    //   130: areturn
    //   131: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   134: athrow
    //   135: aload_3
    //   136: aload_1
    //   137: invokevirtual ZX : ()Ljava/math/BigInteger;
    //   140: invokevirtual Zp : (Ljava/math/BigInteger;)Lcom/fasterxml/Zg/Zg;
    //   143: areturn
    // Exception table:
    //   from	to	target	type
    //   11	31	34	java/io/IOException
    //   43	59	62	java/io/IOException
    //   93	110	110	java/io/IOException
    //   114	131	131	java/io/IOException
  }
  
  protected final Zb ZY(Zg paramZg, Zyg paramZyg, Zfc paramZfc) throws IOException {
    Zmm zmm = paramZg.Z_();
    try {
      if (zmm == Zmm.BIG_DECIMAL)
        return Zj(paramZyg, paramZfc, paramZg.ZT()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZyg.Zg(Zyp.USE_BIG_DECIMAL_FOR_FLOATS)) {
        try {
          if (paramZg.Zr()) {
            try {
              if (paramZyg.Zj((Zz)Zd.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION))
                return (Zb)paramZyg.ZA(ZX(), Double.valueOf(paramZg.ZH()), c(30009, -23290), new Object[0]); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return (Zb)paramZfc.ZO(paramZg.ZH());
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zj(paramZyg, paramZfc, paramZg.ZT());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zmm == Zmm.FLOAT32)
        return (Zb)paramZfc.ZL(paramZg.Zg()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zb)paramZfc.ZO(paramZg.ZH());
  }
  
  protected final Zb Zj(Zyg paramZyg, Zfc paramZfc, BigDecimal paramBigDecimal) {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_1
    //   4: invokevirtual Zw : ()Lcom/fasterxml/Zj/Zp;
    //   7: astore #6
    //   9: astore #4
    //   11: aload #6
    //   13: getstatic com/fasterxml/Zj/Zd.STRIP_TRAILING_BIGDECIMAL_ZEROES : Lcom/fasterxml/Zj/Zd;
    //   16: invokevirtual ZV : (Lcom/fasterxml/Zj/Zz;)Z
    //   19: ifeq -> 37
    //   22: aload #6
    //   24: getstatic com/fasterxml/Zj/Zd.STRIP_TRAILING_BIGDECIMAL_ZEROES : Lcom/fasterxml/Zj/Zd;
    //   27: invokevirtual Zc : (Lcom/fasterxml/Zj/Zz;)Z
    //   30: istore #5
    //   32: aload #4
    //   34: ifnull -> 43
    //   37: aload_2
    //   38: invokevirtual ZF : ()Z
    //   41: istore #5
    //   43: iload #5
    //   45: ifeq -> 58
    //   48: aload_3
    //   49: invokevirtual stripTrailingZeros : ()Ljava/math/BigDecimal;
    //   52: astore_3
    //   53: goto -> 58
    //   56: astore #7
    //   58: aload_2
    //   59: aload_3
    //   60: invokevirtual ZO : (Ljava/math/BigDecimal;)Lcom/fasterxml/Zg/Zg;
    //   63: areturn
    // Exception table:
    //   from	to	target	type
    //   48	53	56	java/lang/ArithmeticException
  }
  
  protected final Zb Zv(Zg paramZg, Zyg paramZyg) throws IOException {
    Zfc zfc = paramZyg.Zz();
    Object object = paramZg.ZO();
    try {
      if (object == null)
        return (Zb)zfc.ZW(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Class<?> clazz = object.getClass();
    try {
      if (clazz == byte[].class)
        return (Zb)zfc.ZG((byte[])object); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof Zj)
        return (Zb)zfc.Za((Zj)object); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (object instanceof Zb)
        return (Zb)object; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return (Zb)zfc.Zs(object);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'E,*Þ!*\\fd¤h×3FC?¤yú DòÆqÀ-ã«-GCÕEw\\b9ß÷3Lc×[±äNxPb=xÿ¢øqYö÷ìÙgpì;OÔÅùaFõn<t2\\bíQõú9qÒïÂéÏ/æB*" {lÐ)µæðÅy\\bi¸V2ÔÛÝzÆcærÑúÁnl'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #117
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #54
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zs/Zi.e : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zs/Zi.f : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #7
    //   154: goto -> 184
    //   157: bipush #91
    //   159: goto -> 184
    //   162: bipush #46
    //   164: goto -> 184
    //   167: bipush #119
    //   169: goto -> 184
    //   172: bipush #70
    //   174: goto -> 184
    //   177: bipush #109
    //   179: goto -> 184
    //   182: bipush #53
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7538) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 110;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */