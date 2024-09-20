package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zq;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zm.Zef;
import com.fasterxml.Zm.Zh;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zye;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;

@Zl
public class Zul extends Zuy<Object> implements Zi {
  private static final long serialVersionUID = 1L;
  
  protected Object[] ZO;
  
  private final Enum<?> Zm;
  
  protected final Zh Zh;
  
  protected volatile Zh Zi;
  
  protected final Boolean ZR;
  
  private Boolean Zo;
  
  private Boolean Za;
  
  protected final boolean ZU;
  
  protected final Zh ZY;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public Zul(Zef paramZef1, boolean paramBoolean, Zef paramZef2, Zef paramZef3) {
    super(paramZef1.Z_());
    this.Zh = paramZef1.ZI();
    this.ZO = (Object[])paramZef1.Zd();
    this.Zm = paramZef1.ZD();
    this.ZR = Boolean.valueOf(paramBoolean);
    this.ZU = paramZef1.ZB();
    try {
      this.ZY = (paramZef2 == null) ? null : paramZef2.ZI();
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zi = (paramZef3 == null) ? null : paramZef3.ZI();
  }
  
  protected Zul(Zul paramZul, Boolean paramBoolean1, Boolean paramBoolean2, Boolean paramBoolean3) {
    super(paramZul);
    this.Zh = paramZul.Zh;
    this.ZO = paramZul.ZO;
    this.Zm = paramZul.Zm;
    this.ZR = paramBoolean1;
    this.ZU = paramZul.ZU;
    this.Zo = paramBoolean2;
    this.Za = paramBoolean3;
    this.ZY = paramZul.ZY;
    this.Zi = paramZul.Zi;
  }
  
  public static Zyo<?> ZK(Zyc paramZyc, Class<?> paramClass, Ziq paramZiq, Zzp paramZzp, Zv[] paramArrayOfZv) {
    try {
      if (paramZyc.Zd())
        Zx.ZR(paramZiq.ZP(), paramZyc.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zuo(paramClass, paramZiq, paramZiq.ZV(0), paramZzp, paramArrayOfZv);
  }
  
  public static Zyo<?> ZV(Zyc paramZyc, Class<?> paramClass, Ziq paramZiq) {
    try {
      if (paramZyc.Zd())
        Zx.ZR(paramZiq.ZP(), paramZyc.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zuo(paramClass, paramZiq);
  }
  
  public Zul ZW(Boolean paramBoolean1, Boolean paramBoolean2, Boolean paramBoolean3) {
    try {
      if (Objects.equals(this.ZR, paramBoolean1))
        try {
          if (Objects.equals(this.Zo, paramBoolean2))
            try {
              if (Objects.equals(this.Za, paramBoolean3))
                return this; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            }  
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return new Zul(this, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Boolean bool1 = Optional.<Boolean>ofNullable(ZP(paramZyg, paramZo, ZX(), Zye.ACCEPT_CASE_INSENSITIVE_PROPERTIES)).orElse(this.ZR);
    Boolean bool2 = Optional.<Boolean>ofNullable(ZP(paramZyg, paramZo, ZX(), Zye.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)).orElse(this.Zo);
    Boolean bool3 = Optional.<Boolean>ofNullable(ZP(paramZyg, paramZo, ZX(), Zye.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).orElse(this.Za);
    return ZW(bool1, bool2, bool3);
  }
  
  public boolean Zs() {
    return true;
  }
  
  public Zd Zb() {
    return Zd.Enum;
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return this.Zm;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_STRING))
        return ZS(paramZg, paramZyg, paramZg.ZR()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.ZL(Zl.VALUE_NUMBER_INT)) {
        try {
          if (this.ZU)
            return ZS(paramZg, paramZyg, paramZg.ZR()); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return Zz(paramZg, paramZyg, paramZg.Ze());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.Zp())
        return ZS(paramZg, paramZyg, paramZyg.Zc(paramZg, this, this.ZC)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZT(paramZg, paramZyg);
  }
  
  protected Object ZS(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    Zh zh = Zv(paramZyg);
    Object object = zh.ZJ(paramString);
    if (object == null) {
      String str = paramString.trim();
      if (str != paramString) {
        try {
          if ((object = zh.ZJ(str)) == null)
            return Zu(paramZg, paramZyg, zh, str); 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        return Zu(paramZg, paramZyg, zh, str);
      } 
    } 
    return object;
  }
  
  private Zh Zv(Zyg paramZyg) {
    try {
      if (this.ZY != null)
        return this.ZY; 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return paramZyg.Zg(Zyp.READ_ENUMS_USING_TO_STRING) ? ZD(paramZyg) : this.Zh;
  }
  
  protected Object Zz(Zg paramZg, Zyg paramZyg, int paramInt) throws IOException {
    Zx zx = paramZyg.ZT(Zb(), ZX(), Zq.Integer);
    try {
      if (zx == Zx.Fail) {
        try {
          if (paramZyg.Zg(Zyp.FAIL_ON_NUMBERS_FOR_ENUMS))
            return paramZyg.ZA(ZS(), Integer.valueOf(paramInt), c(13765, 8620), new Object[0]); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        ZY(paramZyg, zx, ZX(), Integer.valueOf(paramInt), c(13767, 15216) + paramInt + ")");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      switch (Zt.ZT[zx.ordinal()]) {
        case 1:
          return null;
        case 2:
          return Zy(paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.ZO.length)
            return this.ZO[paramInt]; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (ZC(paramZyg))
        return this.Zm; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!ZR(paramZyg))
        return paramZyg.ZA(ZS(), Integer.valueOf(paramInt), c(13761, -26688), new Object[] { Integer.valueOf(this.ZO.length - 1) }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  private final Object Zu(Zg paramZg, Zyg paramZyg, Zh paramZh, String paramString) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload #4
    //   5: invokevirtual trim : ()Ljava/lang/String;
    //   8: astore #6
    //   10: astore #5
    //   12: aload #6
    //   14: invokevirtual isEmpty : ()Z
    //   17: ifeq -> 180
    //   20: aload_0
    //   21: aload_2
    //   22: invokevirtual ZC : (Lcom/fasterxml/Zor/Zyg;)Z
    //   25: ifeq -> 44
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_0
    //   36: getfield Zm : Ljava/lang/Enum;
    //   39: areturn
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: aload_0
    //   45: aload_2
    //   46: invokevirtual ZR : (Lcom/fasterxml/Zor/Zyg;)Z
    //   49: ifeq -> 58
    //   52: aconst_null
    //   53: areturn
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload #4
    //   60: invokevirtual isEmpty : ()Z
    //   63: ifeq -> 102
    //   66: aload_0
    //   67: aload_2
    //   68: invokevirtual ZK : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zj/Zx;
    //   71: astore #7
    //   73: aload_0
    //   74: aload_2
    //   75: aload #7
    //   77: aload_0
    //   78: invokevirtual ZX : ()Ljava/lang/Class;
    //   81: aload #4
    //   83: sipush #13760
    //   86: sipush #-310
    //   89: invokestatic c : (II)Ljava/lang/String;
    //   92: invokevirtual ZY : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/Zj/Zx;
    //   95: astore #7
    //   97: aload #5
    //   99: ifnull -> 133
    //   102: aload_0
    //   103: aload_2
    //   104: invokevirtual ZS : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zj/Zx;
    //   107: astore #7
    //   109: aload_0
    //   110: aload_2
    //   111: aload #7
    //   113: aload_0
    //   114: invokevirtual ZX : ()Ljava/lang/Class;
    //   117: aload #4
    //   119: sipush #13763
    //   122: sipush #-2976
    //   125: invokestatic c : (II)Ljava/lang/String;
    //   128: invokevirtual ZY : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zj/Zx;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Lcom/fasterxml/Zj/Zx;
    //   131: astore #7
    //   133: getstatic com/fasterxml/Zs/Zt.ZT : [I
    //   136: aload #7
    //   138: invokevirtual ordinal : ()I
    //   141: iaload
    //   142: tableswitch default -> 178, 1 -> 178, 2 -> 168, 3 -> 168
    //   168: aload_0
    //   169: aload_2
    //   170: invokevirtual Zy : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   173: areturn
    //   174: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   177: athrow
    //   178: aconst_null
    //   179: areturn
    //   180: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   183: aload_0
    //   184: getfield ZR : Ljava/lang/Boolean;
    //   187: invokevirtual equals : (Ljava/lang/Object;)Z
    //   190: ifeq -> 213
    //   193: aload_3
    //   194: aload #6
    //   196: invokevirtual Zn : (Ljava/lang/String;)Ljava/lang/Object;
    //   199: astore #7
    //   201: aload #7
    //   203: ifnull -> 213
    //   206: aload #7
    //   208: areturn
    //   209: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   212: athrow
    //   213: aload_2
    //   214: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NUMBERS_FOR_ENUMS : Lcom/fasterxml/Zor/Zyp;
    //   217: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   220: ifne -> 379
    //   223: aload_0
    //   224: getfield ZU : Z
    //   227: ifne -> 379
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: aload #6
    //   239: iconst_0
    //   240: invokevirtual charAt : (I)C
    //   243: istore #7
    //   245: iload #7
    //   247: bipush #48
    //   249: if_icmplt -> 379
    //   252: iload #7
    //   254: bipush #57
    //   256: if_icmpgt -> 379
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: iload #7
    //   268: bipush #48
    //   270: if_icmpne -> 303
    //   273: goto -> 280
    //   276: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   279: athrow
    //   280: aload #6
    //   282: invokevirtual length : ()I
    //   285: iconst_1
    //   286: if_icmple -> 303
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   295: athrow
    //   296: goto -> 379
    //   299: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   302: athrow
    //   303: aload #6
    //   305: invokestatic parseInt : (Ljava/lang/String;)I
    //   308: istore #8
    //   310: aload_2
    //   311: getstatic com/fasterxml/Zor/Zy9.ALLOW_COERCION_OF_SCALARS : Lcom/fasterxml/Zor/Zy9;
    //   314: invokevirtual Zm : (Lcom/fasterxml/Zor/Zy9;)Z
    //   317: ifne -> 344
    //   320: aload_2
    //   321: aload_0
    //   322: invokevirtual ZS : ()Ljava/lang/Class;
    //   325: aload #6
    //   327: sipush #13766
    //   330: sipush #-9411
    //   333: invokestatic c : (II)Ljava/lang/String;
    //   336: iconst_0
    //   337: anewarray java/lang/Object
    //   340: invokevirtual ZN : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   343: areturn
    //   344: iload #8
    //   346: iflt -> 374
    //   349: iload #8
    //   351: aload_0
    //   352: getfield ZO : [Ljava/lang/Object;
    //   355: arraylength
    //   356: if_icmpge -> 374
    //   359: goto -> 366
    //   362: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   365: athrow
    //   366: aload_0
    //   367: getfield ZO : [Ljava/lang/Object;
    //   370: iload #8
    //   372: aaload
    //   373: areturn
    //   374: goto -> 379
    //   377: astore #8
    //   379: aload_0
    //   380: aload_2
    //   381: invokevirtual ZC : (Lcom/fasterxml/Zor/Zyg;)Z
    //   384: ifeq -> 396
    //   387: aload_0
    //   388: getfield Zm : Ljava/lang/Enum;
    //   391: areturn
    //   392: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   395: athrow
    //   396: aload_0
    //   397: aload_2
    //   398: invokevirtual ZR : (Lcom/fasterxml/Zor/Zyg;)Z
    //   401: ifeq -> 410
    //   404: aconst_null
    //   405: areturn
    //   406: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   409: athrow
    //   410: aload_2
    //   411: aload_0
    //   412: invokevirtual ZS : ()Ljava/lang/Class;
    //   415: aload #6
    //   417: sipush #13764
    //   420: sipush #-6014
    //   423: invokestatic c : (II)Ljava/lang/String;
    //   426: iconst_1
    //   427: anewarray java/lang/Object
    //   430: dup
    //   431: iconst_0
    //   432: aload_3
    //   433: invokevirtual ZR : ()Ljava/util/List;
    //   436: aastore
    //   437: invokevirtual ZN : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   440: areturn
    // Exception table:
    //   from	to	target	type
    //   12	28	31	java/lang/NumberFormatException
    //   20	40	40	java/lang/NumberFormatException
    //   44	54	54	java/lang/NumberFormatException
    //   133	174	174	java/lang/NumberFormatException
    //   201	209	209	java/lang/NumberFormatException
    //   213	230	233	java/lang/NumberFormatException
    //   245	259	262	java/lang/NumberFormatException
    //   252	273	276	java/lang/NumberFormatException
    //   266	289	292	java/lang/NumberFormatException
    //   280	299	299	java/lang/NumberFormatException
    //   303	343	377	java/lang/NumberFormatException
    //   344	359	362	java/lang/NumberFormatException
    //   344	373	377	java/lang/NumberFormatException
    //   379	392	392	java/lang/NumberFormatException
    //   396	406	406	java/lang/NumberFormatException
  }
  
  protected Object ZT(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.START_ARRAY))
        return ZF(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZyg.ZB(ZS(), paramZg);
  }
  
  protected Class<?> ZS() {
    return ZX();
  }
  
  @Deprecated
  protected Zh ZD(Zyg paramZyg) {
    Zh zh = this.Zi;
    if (zh == null)
      synchronized (this) {
        zh = this.Zi;
        if (zh == null) {
          zh = Zef.Zp(paramZyg.Za(), ZS()).ZI();
          this.Zi = zh;
        } 
      }  
    return zh;
  }
  
  protected boolean ZR(Zyg paramZyg) {
    try {
      if (!Boolean.TRUE.equals(this.Za)) {
        try {
          if (paramZyg.Zg(Zyp.READ_UNKNOWN_ENUM_VALUES_AS_NULL));
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  protected boolean ZC(Zyg paramZyg) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Ljava/lang/Enum;
    //   4: ifnull -> 52
    //   7: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   10: aload_0
    //   11: getfield Zo : Ljava/lang/Boolean;
    //   14: invokevirtual equals : (Ljava/lang/Object;)Z
    //   17: ifne -> 44
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_1
    //   28: getstatic com/fasterxml/Zor/Zyp.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE : Lcom/fasterxml/Zor/Zyp;
    //   31: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   34: ifeq -> 52
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: iconst_0
    //   53: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	20	23	java/lang/NumberFormatException
    //   7	37	40	java/lang/NumberFormatException
    //   27	48	48	java/lang/NumberFormatException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'àdð­ôîðæ=á{üÚt2qÖ/§\\tA\\rP¤¾«æ\\rY°Õ¬Äzèë2¿úØÖæOÉ$Wúwf3QkùÌQ$[8Ä+ßJÖT\\f1x¹ÿâµ:trb`%z½¾È=A¦=ë¹öêÆ²÷Êg¦î°Én½à^>ôQkä1#:o;¬mÿëóªè¹Ùÿp{\\fÌ\ í1í¹%õ\\f«ZÑcö<9n?ú¦8ÊÀªªÌ_u/5¦^UV¢,>E.Þðôì¯°ÝÏA­z5)Vì37õ¬Ó1|¢ ~Ï.<HDlçÀ_õ§Jé1Â©è[P2wÌ"rhü}Æbbã²-ÐæËÐrýb[D$¹ÐgUK_á.ß»NH#¢Z|ÒhÙ3L*IQJá'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #140
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #29
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'nhå*"lís¿¯M{'^VÏ=wßQ(a¿¢yþÛo)âdr¤V¾/Çà1'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #17
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #124
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic com/fasterxml/Zs/Zul.e : [Ljava/lang/String;
    //   133: bipush #7
    //   135: anewarray java/lang/String
    //   138: putstatic com/fasterxml/Zs/Zul.f : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #82
    //   214: goto -> 244
    //   217: bipush #32
    //   219: goto -> 244
    //   222: bipush #40
    //   224: goto -> 244
    //   227: bipush #100
    //   229: goto -> 244
    //   232: bipush #111
    //   234: goto -> 244
    //   237: bipush #114
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
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x35C5) & 0xFFFF;
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
      char c = 'Ü';
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zul.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */