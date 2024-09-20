package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zb.Zmm;
import com.fasterxml.Zb.Zq;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zp.Zt;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

@Zl
final class Zf7 extends Zl<Object> {
  private static final long serialVersionUID = 1L;
  
  protected static final Object[] Zh = new Object[0];
  
  public static final Zf7 ZV = new Zf7();
  
  protected final boolean Zg;
  
  public Zf7() {
    this(false);
  }
  
  protected Zf7(boolean paramBoolean) {
    super(Object.class);
    this.Zg = paramBoolean;
  }
  
  public static Zf7 ZF(boolean paramBoolean) {
    return paramBoolean ? new Zf7(true) : ZV;
  }
  
  public Zd Zb() {
    return Zd.Untyped;
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return this.Zg ? Boolean.FALSE : null;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 1:
          return ZR(paramZg, paramZyg, Zu.Zn(paramZyg.ZA(Zq.DUPLICATE_PROPERTIES)));
        case 2:
          return Zu.ZW();
        case 5:
          return Zj(paramZg, paramZyg);
        case 3:
          return ZR(paramZg, paramZyg, Zu.ZM());
        case 6:
          return paramZg.ZR();
        case 7:
          try {
            if (paramZyg.ZM(Z_))
              return Ze(paramZg, paramZyg); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.Zb();
        case 8:
          return Zr(paramZg, paramZyg);
        case 9:
          return Boolean.TRUE;
        case 10:
          return Boolean.FALSE;
        case 11:
          return null;
        case 12:
          return paramZg.ZO();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZyg.ZE(Zq(paramZyg), paramZg);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    try {
      switch (paramZg.Zy()) {
        case 1:
        case 3:
        case 5:
          return paramZt.Zy(paramZg, paramZyg);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZT(paramZg, paramZyg, paramZg.Zy());
  }
  
  public Object ZI(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    Zbqc[] arrayOfZbqc = Zl.Zn();
    try {
      if (this.Zg)
        return deserialize(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Zl zl;
      switch (paramZg.Zy()) {
        case 2:
        case 4:
          return paramObject;
        case 1:
          zl = paramZg.ZV();
          try {
            if (zl == Zl.END_OBJECT)
              return paramObject; 
          } catch (IOException iOException) {
            throw a(null);
          } 
        case 5:
          if (paramObject instanceof Map) {
            Map map = (Map)paramObject;
            String str = paramZg.ZS();
            while (true) {
              while (true) {
                paramZg.ZV();
                Object object = map.get(str);
                break;
              } 
              if ((str = paramZg.ZU()) == null)
                return paramObject; 
            } 
          } 
          break;
        case 3:
          zl = paramZg.ZV();
          try {
            if (zl == Zl.END_ARRAY)
              return paramObject; 
          } catch (IOException iOException) {
            throw a(null);
          } 
          if (paramObject instanceof Collection) {
            Collection<Object> collection = (Collection)paramObject;
            try {
              while (true) {
                collection.add(deserialize(paramZg, paramZyg));
                if (paramZg.ZV() == Zl.END_ARRAY)
                  return paramObject; 
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } 
          break;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return deserialize(paramZg, paramZyg);
  }
  
  private Object Zj(Zg paramZg, Zyg paramZyg) throws IOException {
    Zu zu = Zu.Zn(paramZyg.ZA(Zq.DUPLICATE_PROPERTIES));
    Zbqc[] arrayOfZbqc = Zl.Zn();
    String str = paramZg.ZS();
    while (str != null) {
      Object object;
      Zl zl = paramZg.ZV();
      if (zl == null)
        zl = Zl.NOT_AVAILABLE; 
      switch (zl.Zs()) {
        case 1:
          object = ZR(paramZg, paramZyg, zu.ZD());
          try {
            if (arrayOfZbqc != null)
              return zu.ZP(); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          break;
        case 2:
          return zu.ZP();
        case 3:
          object = ZR(paramZg, paramZyg, zu.Zd());
        default:
          object = ZT(paramZg, paramZyg, zl.Zs());
          break;
      } 
      zu.ZV(str, object);
      str = paramZg.ZU();
      continue;
      if (arrayOfZbqc != null)
        break; 
    } 
    return zu.ZP();
  }
  
  private Object ZR(Zg paramZg, Zyg paramZyg, Zu paramZu) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: aload_2
    //   4: getstatic com/fasterxml/Zs/Zf7.Z_ : I
    //   7: invokevirtual ZM : (I)Z
    //   10: istore #5
    //   12: astore #4
    //   14: aload_2
    //   15: getstatic com/fasterxml/Zor/Zyp.USE_JAVA_ARRAY_FOR_JSON_ARRAY : Lcom/fasterxml/Zor/Zyp;
    //   18: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   21: istore #6
    //   23: aload_3
    //   24: astore #7
    //   26: aload #7
    //   28: invokevirtual Zl : ()Z
    //   31: ifeq -> 318
    //   34: aload_1
    //   35: invokevirtual ZU : ()Ljava/lang/String;
    //   38: astore #8
    //   40: aload #8
    //   42: ifnull -> 290
    //   45: aload_1
    //   46: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   49: astore #10
    //   51: aload #10
    //   53: ifnonnull -> 61
    //   56: getstatic com/fasterxml/Zb/Zl.NOT_AVAILABLE : Lcom/fasterxml/Zb/Zl;
    //   59: astore #10
    //   61: aload #10
    //   63: invokevirtual Zs : ()I
    //   66: tableswitch default -> 255, 1 -> 128, 2 -> 255, 3 -> 142, 4 -> 255, 5 -> 255, 6 -> 156, 7 -> 167, 8 -> 203, 9 -> 216, 10 -> 226, 11 -> 236, 12 -> 244
    //   128: aload #7
    //   130: aload #8
    //   132: invokevirtual Za : (Ljava/lang/String;)Lcom/fasterxml/Zs/Zu;
    //   135: astore #7
    //   137: aload #4
    //   139: ifnull -> 279
    //   142: aload #7
    //   144: aload #8
    //   146: invokevirtual ZY : (Ljava/lang/String;)Lcom/fasterxml/Zs/Zu;
    //   149: astore #7
    //   151: aload #4
    //   153: ifnull -> 26
    //   156: aload_1
    //   157: invokevirtual ZR : ()Ljava/lang/String;
    //   160: astore #9
    //   162: aload #4
    //   164: ifnull -> 270
    //   167: iload #5
    //   169: ifeq -> 192
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   178: athrow
    //   179: aload_0
    //   180: aload_1
    //   181: aload_2
    //   182: invokevirtual Ze : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   185: goto -> 196
    //   188: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   191: athrow
    //   192: aload_1
    //   193: invokevirtual Zb : ()Ljava/lang/Number;
    //   196: astore #9
    //   198: aload #4
    //   200: ifnull -> 270
    //   203: aload_0
    //   204: aload_1
    //   205: aload_2
    //   206: invokevirtual Zr : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   209: astore #9
    //   211: aload #4
    //   213: ifnull -> 270
    //   216: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   219: astore #9
    //   221: aload #4
    //   223: ifnull -> 270
    //   226: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   229: astore #9
    //   231: aload #4
    //   233: ifnull -> 270
    //   236: aconst_null
    //   237: astore #9
    //   239: aload #4
    //   241: ifnull -> 270
    //   244: aload_1
    //   245: invokevirtual ZO : ()Ljava/lang/Object;
    //   248: astore #9
    //   250: aload #4
    //   252: ifnull -> 270
    //   255: aload_2
    //   256: aload_0
    //   257: aload_2
    //   258: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zk;
    //   261: aload_1
    //   262: invokevirtual ZE : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   265: areturn
    //   266: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   269: athrow
    //   270: aload #7
    //   272: aload #8
    //   274: aload #9
    //   276: invokevirtual ZV : (Ljava/lang/String;Ljava/lang/Object;)V
    //   279: aload_1
    //   280: invokevirtual ZU : ()Ljava/lang/String;
    //   283: astore #8
    //   285: aload #4
    //   287: ifnull -> 40
    //   290: aload #7
    //   292: aload_3
    //   293: if_acmpne -> 306
    //   296: aload #7
    //   298: invokevirtual ZP : ()Ljava/lang/Object;
    //   301: areturn
    //   302: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   305: athrow
    //   306: aload #7
    //   308: invokevirtual Zb : ()Lcom/fasterxml/Zs/Zu;
    //   311: astore #7
    //   313: aload #4
    //   315: ifnull -> 26
    //   318: aload_1
    //   319: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   322: astore #8
    //   324: aload #8
    //   326: ifnonnull -> 334
    //   329: getstatic com/fasterxml/Zb/Zl.NOT_AVAILABLE : Lcom/fasterxml/Zb/Zl;
    //   332: astore #8
    //   334: aload #8
    //   336: invokevirtual Zs : ()I
    //   339: tableswitch default -> 555, 1 -> 400, 2 -> 555, 3 -> 412, 4 -> 424, 5 -> 555, 6 -> 456, 7 -> 467, 8 -> 503, 9 -> 516, 10 -> 526, 11 -> 536, 12 -> 544
    //   400: aload #7
    //   402: invokevirtual ZD : ()Lcom/fasterxml/Zs/Zu;
    //   405: astore #7
    //   407: aload #4
    //   409: ifnull -> 26
    //   412: aload #7
    //   414: invokevirtual Zd : ()Lcom/fasterxml/Zs/Zu;
    //   417: astore #7
    //   419: aload #4
    //   421: ifnull -> 26
    //   424: aload #7
    //   426: aload_3
    //   427: if_acmpne -> 442
    //   430: aload #7
    //   432: iload #6
    //   434: invokevirtual Zw : (Z)Ljava/lang/Object;
    //   437: areturn
    //   438: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   441: athrow
    //   442: aload #7
    //   444: iload #6
    //   446: invokevirtual Zy : (Z)Lcom/fasterxml/Zs/Zu;
    //   449: astore #7
    //   451: aload #4
    //   453: ifnull -> 26
    //   456: aload_1
    //   457: invokevirtual ZR : ()Ljava/lang/String;
    //   460: astore #9
    //   462: aload #4
    //   464: ifnull -> 570
    //   467: iload #5
    //   469: ifeq -> 492
    //   472: goto -> 479
    //   475: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   478: athrow
    //   479: aload_0
    //   480: aload_1
    //   481: aload_2
    //   482: invokevirtual Ze : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   485: goto -> 496
    //   488: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   491: athrow
    //   492: aload_1
    //   493: invokevirtual Zb : ()Ljava/lang/Number;
    //   496: astore #9
    //   498: aload #4
    //   500: ifnull -> 570
    //   503: aload_0
    //   504: aload_1
    //   505: aload_2
    //   506: invokevirtual Zr : (Lcom/fasterxml/Zb/Zg;Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   509: astore #9
    //   511: aload #4
    //   513: ifnull -> 570
    //   516: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   519: astore #9
    //   521: aload #4
    //   523: ifnull -> 570
    //   526: getstatic java/lang/Boolean.FALSE : Ljava/lang/Boolean;
    //   529: astore #9
    //   531: aload #4
    //   533: ifnull -> 570
    //   536: aconst_null
    //   537: astore #9
    //   539: aload #4
    //   541: ifnull -> 570
    //   544: aload_1
    //   545: invokevirtual ZO : ()Ljava/lang/Object;
    //   548: astore #9
    //   550: aload #4
    //   552: ifnull -> 570
    //   555: aload_2
    //   556: aload_0
    //   557: aload_2
    //   558: invokevirtual Zq : (Lcom/fasterxml/Zor/Zyg;)Lcom/fasterxml/Zor/Zk;
    //   561: aload_1
    //   562: invokevirtual ZE : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   565: areturn
    //   566: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   569: athrow
    //   570: aload #7
    //   572: aload #9
    //   574: invokevirtual Zh : (Ljava/lang/Object;)V
    //   577: goto -> 318
    // Exception table:
    //   from	to	target	type
    //   162	172	175	java/io/IOException
    //   167	188	188	java/io/IOException
    //   250	266	266	java/io/IOException
    //   290	302	302	java/io/IOException
    //   424	438	438	java/io/IOException
    //   462	472	475	java/io/IOException
    //   467	488	488	java/io/IOException
    //   550	566	566	java/io/IOException
  }
  
  private Object ZT(Zg paramZg, Zyg paramZyg, int paramInt) throws IOException {
    try {
      switch (paramInt) {
        case 6:
          return paramZg.ZR();
        case 7:
          try {
            if (paramZyg.Zg(Zyp.USE_BIG_INTEGER_FOR_INTS))
              return paramZg.ZX(); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramZg.Zb();
        case 8:
          return Zr(paramZg, paramZyg);
        case 9:
          return Boolean.TRUE;
        case 10:
          return Boolean.FALSE;
        case 12:
          return paramZg.ZO();
        case 11:
          return null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZyg.ZE(Zq(paramZyg), paramZg);
  }
  
  protected Object Zr(Zg paramZg, Zyg paramZyg) throws IOException {
    Zmm zmm = paramZg.Z_();
    try {
      if (zmm == Zmm.BIG_DECIMAL)
        return paramZg.ZT(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (!paramZg.Zr())
        try {
          if (paramZyg.Zg(Zyp.USE_BIG_DECIMAL_FOR_FLOATS))
            return paramZg.ZT(); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zmm == Zmm.FLOAT32)
        return Float.valueOf(paramZg.Zg()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Double.valueOf(paramZg.ZH());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zf7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */