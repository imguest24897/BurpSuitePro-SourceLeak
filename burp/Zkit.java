package burp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkit implements Zr_4 {
  public static final Zx1 ZM;
  
  public static final Zx1 Zl;
  
  private final Zzqa ZT;
  
  private final Zlrc Zy;
  
  private final Zsmu Zp;
  
  private final Zg3 ZR;
  
  private final Zl14<Long, Object> Zb = new Zl14<>();
  
  private boolean ZB;
  
  private Zx1 ZV;
  
  private final boolean ZD;
  
  private final Set<Long> ZU = ConcurrentHashMap.newKeySet();
  
  private static Zbqc[] ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zkit Za(File paramFile, long paramLong, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc, Zk9w paramZk9w) throws Zev3 {
    Zzqa zzqa = Zzqa.ZM(Zrnb.ZC, paramFile, paramLong, paramInt1, paramInt2, paramInt3, paramZlrc, paramZk9w);
    Zkit zkit = new Zkit(zzqa, paramZlrc, false);
    Zm4j zm4j = zkit.<Zm4j>ZH(new Zzgd());
    zzqa.Z_(40L, zkit.ZY(zm4j));
    zkit.Zp.Zz();
    return zkit;
  }
  
  public static Zkit Zo(File paramFile, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc, Zk9w paramZk9w) throws Zev3 {
    Zzqa zzqa = Zzqa.Zg(Zrnb.ZC, paramFile, paramInt1, paramInt2, paramInt3, paramZlrc, paramZk9w);
    return new Zkit(zzqa, paramZlrc, false);
  }
  
  public static Zkit Zl(File paramFile, int paramInt1, int paramInt2, int paramInt3) throws Zev3 {
    Zzqa zzqa = Zzqa.ZJ(paramFile, paramInt1, paramInt2, paramInt3);
    return new Zkit(zzqa, Zlrc.Za, true);
  }
  
  private Zkit(Zzqa paramZzqa, Zlrc paramZlrc, boolean paramBoolean) {
    try {
      Zuh.Zb((paramZlrc != null), Zqf.Zv);
      this.ZT = paramZzqa;
      this.Zy = paramZlrc;
      this.ZD = paramBoolean;
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      this.Zp = Zszd.ZL ? new Zm3d() : Zsmu.ZP;
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      this.ZR = Zszd.ZC ? new Zkqg(this) : Zg3.ZO;
      if (!paramBoolean) {
        try {
          this.ZB = Zo();
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
        this.ZV = this.ZB ? Zl : ZM;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private boolean Zo() {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (this.ZT.Zr() < 1);
  }
  
  void Zd(Zx1 paramZx1) {
    this.ZV = paramZx1;
  }
  
  public File Zy() {
    return this.ZT.Zy();
  }
  
  public String Zd() {
    return this.ZT.Ze();
  }
  
  public short ZZ() {
    return this.ZT.Zs();
  }
  
  public int ZH() {
    return this.ZT.Zn();
  }
  
  public Zrlr ZP() {
    return new Zrlr(this.ZT.ZJ());
  }
  
  public void close() {
    this.ZT.close();
  }
  
  public <T extends Zgpi> T Z_(Zgpi<T> paramZgpi, Supplier<Zsqx<T>> paramSupplier) {
    Consumer<Zxsr> consumer = Zkit::lambda$createNewObject$0;
    if (paramZgpi instanceof Zni) {
      Zni zni = (Zni)paramZgpi;
      Zxsr zxsr = zni.Zp8();
      try {
        if (zxsr != null)
          try {
            if (zxsr.ZPz() == this)
              return (T)zxsr; 
          } catch (Zkfw zkfw) {
            throw a(null);
          }  
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      Objects.requireNonNull(zni);
      consumer = zni::ZS;
    } 
    return Zk(consumer, (Zeu4)paramZgpi.ZF(), paramSupplier);
  }
  
  public <T extends Zgpi> T ZH(Zsqx<T> paramZsqx) {
    return Zk(Zkit::lambda$createNewObject$1, paramZsqx.Zf(), paramZsqx::lambda$createNewObject$2);
  }
  
  private <T extends Zgpi> T Zk(Consumer<Zxsr> paramConsumer, Zeu4<T> paramZeu4, Supplier<Zsqx<T>> paramSupplier) {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZD : Z
    //   9: ifeq -> 31
    //   12: iconst_0
    //   13: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   16: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   19: new burp/Zkfw
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: athrow
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: aload_2
    //   32: invokeinterface Zs : ()Z
    //   37: ifeq -> 59
    //   40: iconst_0
    //   41: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   44: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   47: new java/lang/UnsupportedOperationException
    //   50: dup
    //   51: invokespecial <init> : ()V
    //   54: athrow
    //   55: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   58: athrow
    //   59: aload_2
    //   60: invokeinterface Zc : ()[Lburp/Zm31;
    //   65: astore #5
    //   67: aload #5
    //   69: ifnull -> 80
    //   72: iconst_1
    //   73: goto -> 81
    //   76: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   79: athrow
    //   80: iconst_0
    //   81: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   84: aload_2
    //   85: invokeinterface getClass : ()Ljava/lang/Class;
    //   90: invokevirtual getName : ()Ljava/lang/String;
    //   93: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   96: getstatic burp/Zszd.ZX : Z
    //   99: ifeq -> 180
    //   102: aload #5
    //   104: arraylength
    //   105: iconst_1
    //   106: if_icmplt -> 139
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   115: athrow
    //   116: aload #5
    //   118: arraylength
    //   119: bipush #79
    //   121: if_icmpgt -> 139
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: iconst_1
    //   132: goto -> 140
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: iconst_0
    //   140: sipush #16172
    //   143: sipush #19717
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: iconst_2
    //   150: anewarray java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload_2
    //   156: invokeinterface getClass : ()Ljava/lang/Class;
    //   161: invokevirtual getName : ()Ljava/lang/String;
    //   164: aastore
    //   165: dup
    //   166: iconst_1
    //   167: aload #5
    //   169: arraylength
    //   170: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   173: aastore
    //   174: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   177: invokestatic Zi : (ZLjava/lang/String;)V
    //   180: aload_0
    //   181: aload #5
    //   183: invokevirtual Zg : ([Lburp/Zm31;)I
    //   186: istore #6
    //   188: iload #6
    //   190: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   193: astore #7
    //   195: aload #7
    //   197: aload_0
    //   198: getfield ZV : Lburp/Zx1;
    //   201: getfield Zd : I
    //   204: invokevirtual position : (I)Ljava/nio/ByteBuffer;
    //   207: pop
    //   208: aload #7
    //   210: aload_2
    //   211: invokeinterface Z_ : ()B
    //   216: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   219: pop
    //   220: aload #7
    //   222: aload_2
    //   223: invokeinterface ZD : ()B
    //   228: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   231: pop
    //   232: aload #7
    //   234: aload #5
    //   236: arraylength
    //   237: i2b
    //   238: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   241: pop
    //   242: iload #6
    //   244: istore #8
    //   246: aload #5
    //   248: astore #9
    //   250: aload #9
    //   252: arraylength
    //   253: istore #10
    //   255: iconst_0
    //   256: istore #11
    //   258: iload #11
    //   260: iload #10
    //   262: if_icmpge -> 314
    //   265: aload #9
    //   267: iload #11
    //   269: aaload
    //   270: astore #12
    //   272: aload #7
    //   274: aload #12
    //   276: invokeinterface ZH : ()B
    //   281: invokevirtual put : (B)Ljava/nio/ByteBuffer;
    //   284: pop
    //   285: aload #7
    //   287: iload #8
    //   289: i2s
    //   290: invokevirtual putShort : (S)Ljava/nio/ByteBuffer;
    //   293: pop
    //   294: iload #8
    //   296: aload #12
    //   298: invokeinterface ZB : ()I
    //   303: iadd
    //   304: istore #8
    //   306: iinc #11, 1
    //   309: aload #4
    //   311: ifnull -> 258
    //   314: aload_0
    //   315: getfield ZB : Z
    //   318: ifeq -> 342
    //   321: aload #7
    //   323: iconst_0
    //   324: iload #8
    //   326: invokevirtual putInt : (II)Ljava/nio/ByteBuffer;
    //   329: pop
    //   330: aload #4
    //   332: ifnull -> 376
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   341: athrow
    //   342: iload #8
    //   344: aload_0
    //   345: getfield ZV : Lburp/Zx1;
    //   348: getfield ZQ : I
    //   351: bipush #8
    //   353: iadd
    //   354: if_icmpge -> 376
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   363: athrow
    //   364: aload_0
    //   365: getfield ZV : Lburp/Zx1;
    //   368: getfield ZQ : I
    //   371: bipush #8
    //   373: iadd
    //   374: istore #8
    //   376: aload_0
    //   377: getfield ZT : Lburp/Zzqa;
    //   380: iload #8
    //   382: invokevirtual Zk : (I)J
    //   385: lstore #9
    //   387: goto -> 421
    //   390: astore #11
    //   392: aload #11
    //   394: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   397: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   400: aload_0
    //   401: getfield Zy : Lburp/Zlrc;
    //   404: aload #11
    //   406: invokeinterface ZT : (Lburp/Zl4t;)V
    //   411: new burp/Zkfw
    //   414: dup
    //   415: aload #11
    //   417: invokespecial <init> : (Ljava/lang/Exception;)V
    //   420: athrow
    //   421: aload #7
    //   423: iconst_0
    //   424: invokevirtual position : (I)Ljava/nio/ByteBuffer;
    //   427: pop
    //   428: aload_0
    //   429: getfield ZT : Lburp/Zzqa;
    //   432: lload #9
    //   434: iload #6
    //   436: invokevirtual ZW : (JI)Lburp/Zso4;
    //   439: astore #11
    //   441: aload #11
    //   443: aload #7
    //   445: invokevirtual ZH : (Ljava/nio/ByteBuffer;)V
    //   448: getstatic burp/Zszd.ZC : Z
    //   451: ifeq -> 466
    //   454: aload #5
    //   456: invokestatic ZH : ([Lburp/Zm31;)V
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   465: athrow
    //   466: aload_2
    //   467: invokeinterface ZI : ()Lburp/Zllo;
    //   472: aload_0
    //   473: lload #9
    //   475: invokeinterface ZV : (Lburp/Zkit;J)Lburp/Zgpi;
    //   480: astore #12
    //   482: aload_1
    //   483: aload #12
    //   485: checkcast burp/Zxsr
    //   488: invokeinterface accept : (Ljava/lang/Object;)V
    //   493: aload_3
    //   494: invokeinterface get : ()Ljava/lang/Object;
    //   499: checkcast burp/Zsqx
    //   502: aload_0
    //   503: aload #12
    //   505: invokeinterface ZC : (Lburp/Zkit;Lburp/Zgpi;)V
    //   510: aload #12
    //   512: instanceof burp/Zekp
    //   515: ifeq -> 538
    //   518: aload #12
    //   520: checkcast burp/Zekp
    //   523: getstatic burp/Zszd.ZR : S
    //   526: invokeinterface Zp : (S)V
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   537: athrow
    //   538: getstatic burp/Zszd.Zk : Z
    //   541: ifeq -> 591
    //   544: getstatic burp/Zrp6.DEBUG : Lburp/Zrp6;
    //   547: sipush #16170
    //   550: sipush #31849
    //   553: invokestatic a : (II)Ljava/lang/String;
    //   556: iconst_2
    //   557: anewarray java/lang/Object
    //   560: dup
    //   561: iconst_0
    //   562: iload #8
    //   564: invokestatic toString : (I)Ljava/lang/String;
    //   567: aastore
    //   568: dup
    //   569: iconst_1
    //   570: aload #12
    //   572: invokeinterface getClass : ()Ljava/lang/Class;
    //   577: invokevirtual getName : ()Ljava/lang/String;
    //   580: aastore
    //   581: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   590: athrow
    //   591: getstatic burp/Zszd.ZL : Z
    //   594: ifeq -> 617
    //   597: aload_0
    //   598: getfield Zp : Lburp/Zsmu;
    //   601: aload #12
    //   603: iload #8
    //   605: invokeinterface Zp : (Lburp/Zgpi;I)V
    //   610: goto -> 617
    //   613: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   616: athrow
    //   617: aload #12
    //   619: areturn
    // Exception table:
    //   from	to	target	type
    //   5	27	27	burp/Zl4t
    //   31	55	55	burp/Zl4t
    //   67	76	76	burp/Zl4t
    //   81	109	112	burp/Zl4t
    //   102	124	127	burp/Zl4t
    //   116	135	135	burp/Zl4t
    //   314	335	338	burp/Zl4t
    //   321	357	360	burp/Zl4t
    //   376	387	390	burp/Zl4t
    //   441	459	462	burp/Zl4t
    //   482	531	534	burp/Zl4t
    //   538	584	587	burp/Zl4t
    //   591	610	613	burp/Zl4t
  }
  
  private int Zg(Zm31[] paramArrayOfZm31) {
    int i = paramArrayOfZm31.length * 3;
    return this.ZV.Ze + i;
  }
  
  private static void ZH(Zm31[] paramArrayOfZm31) {
    HashSet<Byte> hashSet = new HashSet();
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    Zm31[] arrayOfZm31 = paramArrayOfZm31;
    int i = arrayOfZm31.length;
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm31[b];
      byte b1 = zm31.ZH();
      boolean bool = hashSet.add(Byte.valueOf(b1));
      Zuh.ZT(bool, Zqf.Zr, a(16162, 23984) + a(16162, 23984));
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public <T extends Ze34<T>> T Zv(Zllg<T> paramZllg, int paramInt) {
    long l;
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zl4t zl4t) {
      throw a(null);
    } 
    int i = paramZllg.Zr(paramInt);
    if (i == 0)
      i = 1; 
    int j = 8 + i;
    try {
      l = this.ZT.Zk(j);
    } catch (Zl4t zl4t) {
      Zah.Zl(zl4t, Zk_.COMMON_RUNTIME_FAILURE);
      this.Zy.ZT(zl4t);
      throw new Zkfw(zl4t);
    } 
    this.ZT.ZG(l + 0L, j);
    this.ZT.ZG(l + 4L, paramInt);
    Zso4 zso4 = this.ZT.ZW(l + 8L, i);
    Ze34 ze34 = (Ze34)paramZllg.Zb().Zg(this, l, paramInt, zso4);
    try {
      if (Zszd.Zk)
        Zlfh.ZB(Zrp6.DEBUG, a(16165, -24696), new Object[] { Integer.toString(j), ze34.getClass().getName() }); 
    } catch (Zl4t zl4t) {
      throw a(null);
    } 
    try {
      if (Zszd.ZL)
        this.Zp.Zp(ze34, j); 
    } catch (Zl4t zl4t) {
      throw a(null);
    } 
    return (T)ze34;
  }
  
  public Zstu ZZ(byte[] paramArrayOfbyte) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return ((Zstu)Zv(Zstu.Zc, paramArrayOfbyte.length)).Zt(paramArrayOfbyte);
  }
  
  public Zmrq Zc(int paramInt) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return ZH(new Zr3b(paramInt));
  }
  
  public Zstu ZI(InputStream paramInputStream, int paramInt) throws IOException {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ((Zstu)Zv(Zstu.Zc, paramInt)).ZU(paramInputStream, paramInt);
  }
  
  public Zsdr Zz(String paramString) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return ZH(new Zkk0(paramString));
  }
  
  public Zzvg Zr(String paramString) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return ZH(new Zxrw(paramString));
  }
  
  public void ZP(Zgpi paramZgpi) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.ZT.Z_(64L, ZY(paramZgpi));
  }
  
  public <T extends Zgpi> T Zj(Zeu4<T> paramZeu4) {
    long l = this.ZT.ZT(64L);
    try {
      if (l == 0L)
        return null; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return Zo(l, paramZeu4);
  }
  
  public boolean ZV(Zxsr paramZxsr) {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (paramZxsr.Za == this);
  }
  
  public boolean ZQ(Zgpi paramZgpi, int paramInt) {
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      return (Zu(paramInt, Zz(ZY(paramZgpi))) != 0L);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      return false;
    } 
  }
  
  public boolean ZB() {
    try {
      if (!this.ZD)
        try {
          if (this.ZT.Za());
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean Zi() {
    return true;
  }
  
  public Zkit Zl() {
    return this;
  }
  
  public long Za() {
    try {
      if (this.ZD)
        return 0L; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.ZO();
  }
  
  private long Zu(Zgpi<?> paramZgpi, Zm31 paramZm31, boolean paramBoolean) {
    return Ze(paramZgpi, paramZm31, paramBoolean, true);
  }
  
  private long Ze(Zgpi<?> paramZgpi, Zm31 paramZm31, boolean paramBoolean1, boolean paramBoolean2) {
    long l = ZY(paramZgpi);
    try {
      if (Zszd.ZC)
        try {
          if (paramBoolean2)
            ZZ(paramZm31, paramZgpi); 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      long l1 = Zz(l);
      long l2 = ZE(paramZm31, l1);
      if (l2 != 0L)
        return l2; 
      try {
        if (paramBoolean1 && !this.ZD) {
          Zkys zkys = new Zkys(this, paramZgpi);
          Zgpi zgpi = zkys.Za();
          Zi(l, zgpi);
          return ZE(paramZm31, ZY(zgpi));
        } 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      return 0L;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.RETHROWN);
      Zuh.Zb(false, Zqf.ZH, a(16173, -2039) + a(16173, -2039), paramZgpi.ZF().getClass().getName());
      this.Zy.ZK(this);
      throw new Zkfn(this.ZT.Zw());
    } 
  }
  
  private long ZE(Zm31 paramZm31, long paramLong) {
    return Zu(paramZm31.ZH(), paramLong);
  }
  
  private long Zu(int paramInt, long paramLong) {
    byte b = this.ZT.Zk(paramLong + this.ZV.ZS);
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    long l = paramLong + this.ZV.Ze;
    byte b1 = 0;
    while (b1 < b) {
      byte b2 = this.ZT.Zk(l);
      if (b2 == paramInt) {
        short s = this.ZT.ZB(l + 1L);
        return paramLong + s;
      } 
      l += 3L;
      b1++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return 0L;
  }
  
  private long Zz(long paramLong) {
    byte b = this.ZT.Zk(paramLong + this.ZV.ZI);
    try {
      if ((b & 0x1) == 1)
        return this.ZT.ZT(paramLong + this.ZV.ZQ); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return paramLong;
  }
  
  private void Zi(long paramLong, Zgpi paramZgpi) {
    byte b1 = this.ZT.Zk(paramLong + this.ZV.ZI);
    byte b2 = (byte)(b1 | 0x1);
    this.ZT.ZO(paramLong + this.ZV.ZI, b2);
    this.ZT.Z_(paramLong + this.ZV.ZQ, ZY(paramZgpi));
  }
  
  private void ZZ(Zm31 paramZm31, Zgpi paramZgpi) {
    Zm31[] arrayOfZm311 = paramZgpi.ZF().Zc();
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zuh.Zb((arrayOfZm311 != null), Zqf.Zr);
    Zm31[] arrayOfZm312 = arrayOfZm311;
    int i = arrayOfZm312.length;
    byte b = 0;
    while (b < i) {
      Zm31 zm31 = arrayOfZm312[b];
      try {
        if (zm31.equals(paramZm31))
          return; 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    Zuh.Zb(false, Zqf.Zk);
  }
  
  public long ZY(Zgpi paramZgpi) {
    try {
      if (paramZgpi == null)
        return 0L; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    if (paramZgpi instanceof Zect)
      paramZgpi = ((Zect<Zgpi>)paramZgpi).Zc(); 
    if (paramZgpi instanceof Zg35)
      paramZgpi = Zo(paramZgpi); 
    try {
      if (!(paramZgpi instanceof Zxsr)) {
        Zuh.Zv(false, Zqf.Zk, 1L);
        throw new IllegalArgumentException(paramZgpi.getClass().getCanonicalName());
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zxsr zxsr = (Zxsr)paramZgpi;
    try {
      if (this != zxsr.ZPz()) {
        Zuh.Zv(false, Zqf.Zk, 2L);
        throw new IllegalArgumentException();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return zxsr.ZXU();
  }
  
  public void ZH(Zgpi<?> paramZgpi, Zek9 paramZek9, boolean paramBoolean) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZek9, true);
    try {
      this.ZT.Zf(l, paramBoolean);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZek9); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public boolean Zi(Zgpi<?> paramZgpi, Zek9 paramZek9) {
    long l = Zu(paramZgpi, paramZek9, false);
    try {
      if (l == 0L)
        return paramZek9.ZP(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.Zv(l);
  }
  
  public void Zc(Zgpi<?> paramZgpi, Zek2 paramZek2, byte paramByte) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZek2, true);
    try {
      this.ZT.ZO(l, paramByte);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZek2); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public byte ZL(Zgpi<?> paramZgpi, Zek2 paramZek2) {
    long l = Zu(paramZgpi, paramZek2, false);
    try {
      if (l == 0L)
        return paramZek2.ZY(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.Zk(l);
  }
  
  public void Zi(Zgpi<?> paramZgpi, Zekq paramZekq, char paramChar) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZekq, true);
    try {
      this.ZT.ZY(l, paramChar);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZekq); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public char Zi(Zgpi<?> paramZgpi, Zekq paramZekq) {
    long l = Zu(paramZgpi, paramZekq, false);
    try {
      if (l == 0L)
        return paramZekq.Zy(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.ZF(l);
  }
  
  public void ZE(Zgpi<?> paramZgpi, Zekg paramZekg, short paramShort) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZekg, true);
    try {
      this.ZT.Zx(l, paramShort);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZekg); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public short ZQ(Zgpi<?> paramZgpi, Zekg paramZekg) {
    long l = Zu(paramZgpi, paramZekg, false);
    try {
      if (l == 0L)
        return paramZekg.Zc(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.ZB(l);
  }
  
  public void ZM(Zgpi<?> paramZgpi, Zekv paramZekv, int paramInt) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZekv, true);
    try {
      this.ZT.ZG(l, paramInt);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZekv); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public int Zx(Zgpi<?> paramZgpi, Zekv paramZekv) {
    long l = Zu(paramZgpi, paramZekv, false);
    try {
      if (l == 0L)
        return paramZekv.ZF(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.ZO(l);
  }
  
  public void ZV(Zgpi<?> paramZgpi, Zekm paramZekm, long paramLong) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZekm, true);
    try {
      this.ZT.Z_(l, paramLong);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZekm); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public long ZL(Zgpi<?> paramZgpi, Zekm paramZekm) {
    long l = Zu(paramZgpi, paramZekm, false);
    try {
      if (l == 0L)
        return paramZekm.ZL(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.ZT(l);
  }
  
  public void Zj(Zgpi<?> paramZgpi, Zek7 paramZek7, float paramFloat) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZek7, true);
    try {
      this.ZT.Za(l, paramFloat);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZek7); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public float ZU(Zgpi<?> paramZgpi, Zek7 paramZek7) {
    long l = Zu(paramZgpi, paramZek7, false);
    try {
      if (l == 0L)
        return paramZek7.Z_(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.Zr(l);
  }
  
  public void Zn(Zgpi<?> paramZgpi, Zekh paramZekh, double paramDouble) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZekh, true);
    try {
      this.ZT.Zs(l, paramDouble);
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZekh); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public double ZL(Zgpi<?> paramZgpi, Zekh paramZekh) {
    long l = Zu(paramZgpi, paramZekh, false);
    try {
      if (l == 0L)
        return paramZekh.Zb(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZT.Zi(l);
  }
  
  public void Zi(Zgpi<?> paramZgpi, Zekc paramZekc, String paramString) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zsdr zsdr = null;
    if (paramString != null)
      zsdr = Zz(paramString); 
    if (Zszd.ZL) {
      Zsdr zsdr1 = ZJ(paramZgpi, paramZekc);
      try {
        if (zsdr1 != null)
          this.Zp.Zb(zsdr1, zsdr); 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
    } 
    Zq(paramZgpi, paramZekc, zsdr);
  }
  
  public String Zf(Zgpi<?> paramZgpi, Zekc paramZekc) {
    Zsdr zsdr = ZJ(paramZgpi, paramZekc);
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (zsdr == null) ? null : zsdr.toString();
  }
  
  public void Zn(Zgpi<?> paramZgpi, Zeka paramZeka, String paramString) {
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramString == null) {
        if (Zszd.ZL) {
          Zzvg zzvg1 = ZJ(paramZgpi, paramZeka);
          try {
            if (zzvg1 != null)
              this.Zp.Zb(zzvg1, null); 
          } catch (Zkfw zkfw) {
            throw a(null);
          } 
        } 
        Zq(paramZgpi, paramZeka, (Zgpi)null);
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zzvg zzvg = ZJ(paramZgpi, paramZeka);
    try {
      if (zzvg == null) {
        try {
          Zq(paramZgpi, paramZeka, Zr(paramString));
          if (arrayOfZbqc != null) {
            zzvg.Zf(paramString);
            return;
          } 
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    zzvg.Zf(paramString);
  }
  
  public String ZJ(Zgpi<?> paramZgpi, Zeka paramZeka) {
    Zzvg zzvg = ZJ(paramZgpi, paramZeka);
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (zzvg == null) ? null : zzvg.toString();
  }
  
  public String Zz(Zgpi<?> paramZgpi, Zekd paramZekd) {
    Zl5u zl5u = ZJ(paramZgpi, paramZekd);
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (zl5u == null) ? null : zl5u.toString();
  }
  
  public void ZR(Zgpi<?> paramZgpi, Zekd paramZekd, String paramString) {
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zl5u zl5u = ZJ(paramZgpi, paramZekd);
    try {
      if (zl5u == null) {
        try {
          Zq(paramZgpi, paramZekd, Z_(paramString));
          if (arrayOfZbqc != null) {
            zl5u.ZOG(paramString);
            return;
          } 
        } catch (Zkfw zkfw) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    zl5u.ZOG(paramString);
  }
  
  public Zl5u Z_(String paramString) {
    Zl5u zl5u = ZH(new Zs9l(ZR().ZBk()));
    zl5u.ZOG(paramString);
    return zl5u;
  }
  
  Zm4j ZR() {
    long l = this.ZT.ZT(40L);
    if (l == 0L) {
      Zm4j zm4j = ZH(new Zzgd());
      this.ZT.Z_(40L, ZY(zm4j));
      return zm4j;
    } 
    return Zo(l, Zm4j.Zr);
  }
  
  public <T extends Zgpi> void Zq(Zgpi<?> paramZgpi, Zekb<T> paramZekb, T paramT) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l = Zu(paramZgpi, paramZekb, true);
    if (Zszd.ZL) {
      Zgpi zgpi = (Zgpi)ZJ(paramZgpi, (Zekb)paramZekb);
      if (zgpi != null) {
        Zgpi zgpi1;
        T t = paramT;
        if (paramT instanceof Zni)
          zgpi1 = (Zgpi)((Zni)paramT).Zp8(); 
        this.Zp.Zb(zgpi, zgpi1);
      } 
    } 
    try {
      this.ZT.Z_(l, ZY((Zgpi)paramT));
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZekb); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public <T extends Zgpi<?>> T ZJ(Zgpi<?> paramZgpi, Zekb<T> paramZekb) {
    return Zg(paramZgpi, paramZekb, true);
  }
  
  public <T extends Zgpi<?>> T Zg(Zgpi<?> paramZgpi, Zekb<T> paramZekb, boolean paramBoolean) {
    long l1 = Ze(paramZgpi, paramZekb, false, paramBoolean);
    try {
      if (l1 == 0L)
        return null; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l2 = this.ZT.ZT(l1);
    try {
      if (l2 == 0L)
        return null; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (T)Zo(l2, paramZekb.ZE());
  }
  
  public <T extends Ze34<T>> void ZQ(Zgpi<?> paramZgpi, Zeki<T> paramZeki, Ze34<T> paramZe34) {
    try {
      if (this.ZD) {
        Zuh.Zb(false, Zqf.Zr);
        throw new Zkfw();
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    if (Zszd.ZL) {
      Zgpi zgpi = (Zgpi)ZA(paramZgpi, (Zeki)paramZeki);
      try {
        if (zgpi != null)
          this.Zp.Zb(zgpi, paramZe34); 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
    } 
    long l = Zu(paramZgpi, paramZeki, true);
    try {
      this.ZT.Z_(l, ZY(paramZe34));
      if (Zszd.ZC)
        this.ZR.ZQ(paramZgpi, paramZeki); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public <T extends Ze34<T>> T ZA(Zgpi<?> paramZgpi, Zeki<T> paramZeki) {
    long l1 = Zu(paramZgpi, paramZeki, false);
    try {
      if (l1 == 0L)
        return null; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l2 = this.ZT.ZT(l1);
    return Zg(paramZeki.ZQ(), l2);
  }
  
  public <T extends Ze34<T>> T Zg(Zllg<T> paramZllg, long paramLong) {
    try {
      if (paramLong == 0L)
        return null; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      int i = this.ZT.ZO(paramLong + 0L);
      int j = this.ZT.ZO(paramLong + 4L);
      int k = paramZllg.Zr(j);
      try {
      
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      byte b = (k == 0) ? 1 : k;
      try {
        if (i != b + 8) {
          a(16183, -16032);
          Zuh.Zb(false, Zqf.Zr, a(16183, -16032) + a(16183, -16032) + i + a(16168, -22227), paramZllg.getClass().getName());
          this.Zy.ZK(this);
          throw new Zkfn(this.ZT.Zw());
        } 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      Zso4 zso4 = this.ZT.ZW(paramLong + 8L, k);
      return paramZllg.Zb().Zg(this, paramLong, j, zso4);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.RETHROWN);
      Zuh.Zb(false, Zqf.ZH, a(16167, -912) + a(16167, -912), paramZllg.getClass().getName());
      this.Zy.ZK(this);
      throw new Zkfn(this.ZT.Zw());
    } 
  }
  
  public <T extends Zgpi> T Zo(long paramLong, Zeu4<T> paramZeu4) {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: aload_3
    //   6: ifnull -> 17
    //   9: iconst_1
    //   10: goto -> 18
    //   13: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   16: athrow
    //   17: iconst_0
    //   18: getstatic net/portswigger/Zqf.Zv : Lnet/portswigger/Zqf;
    //   21: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   24: aload_3
    //   25: instanceof burp/Zllg
    //   28: ifeq -> 48
    //   31: aload_3
    //   32: astore #5
    //   34: aload_0
    //   35: lload_1
    //   36: aload #5
    //   38: invokevirtual Zn : (JLburp/Zeu4;)Lburp/Zgpi;
    //   41: astore #6
    //   43: aload #4
    //   45: ifnull -> 135
    //   48: aload_0
    //   49: lload_1
    //   50: invokevirtual Zz : (J)J
    //   53: lstore #7
    //   55: aload_0
    //   56: aload_3
    //   57: lload #7
    //   59: invokevirtual ZT : (Lburp/Zeu4;J)V
    //   62: aload_0
    //   63: lload #7
    //   65: aload_3
    //   66: invokevirtual ZG : (JLburp/Zeu4;)Lburp/Zeu4;
    //   69: astore #5
    //   71: aload_0
    //   72: lload_1
    //   73: aload #5
    //   75: invokevirtual Zn : (JLburp/Zeu4;)Lburp/Zgpi;
    //   78: astore #9
    //   80: aload #5
    //   82: aload_0
    //   83: aload #9
    //   85: invokeinterface Zr : (Lburp/Zkit;Lburp/Zgpi;)Ljava/util/Optional;
    //   90: astore #10
    //   92: aload #10
    //   94: invokevirtual isPresent : ()Z
    //   97: ifeq -> 122
    //   100: aload #10
    //   102: invokevirtual get : ()Ljava/lang/Object;
    //   105: checkcast burp/Zgpi
    //   108: astore #6
    //   110: aload_0
    //   111: lload_1
    //   112: aload #6
    //   114: invokevirtual Zi : (JLburp/Zgpi;)V
    //   117: aload #4
    //   119: ifnull -> 135
    //   122: aload_0
    //   123: lload_1
    //   124: lload #7
    //   126: aload #5
    //   128: invokevirtual Zx : (JJLburp/Zeu4;)V
    //   131: aload #9
    //   133: astore #6
    //   135: aload #6
    //   137: instanceof burp/Zekp
    //   140: ifeq -> 163
    //   143: aload #6
    //   145: checkcast burp/Zekp
    //   148: getstatic burp/Zszd.ZR : S
    //   151: invokeinterface Zi : (S)V
    //   156: goto -> 163
    //   159: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   162: athrow
    //   163: aload #6
    //   165: areturn
    //   166: astore #5
    //   168: aload #5
    //   170: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   173: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   176: iconst_0
    //   177: getstatic net/portswigger/Zqf.ZH : Lnet/portswigger/Zqf;
    //   180: aload #5
    //   182: invokevirtual getMessage : ()Ljava/lang/String;
    //   185: sipush #16174
    //   188: sipush #-29023
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: swap
    //   195: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   200: aload_3
    //   201: invokeinterface getClass : ()Ljava/lang/Class;
    //   206: invokevirtual getName : ()Ljava/lang/String;
    //   209: invokestatic Zb : (ZLnet/portswigger/Zqf;Ljava/lang/String;Ljava/lang/String;)V
    //   212: aload_0
    //   213: getfield Zy : Lburp/Zlrc;
    //   216: aload_0
    //   217: invokeinterface ZK : (Lburp/Zkit;)V
    //   222: new burp/Zkfn
    //   225: dup
    //   226: aload_0
    //   227: getfield ZT : Lburp/Zzqa;
    //   230: invokevirtual Zw : ()Ljava/nio/file/FileStore;
    //   233: invokespecial <init> : (Ljava/nio/file/FileStore;)V
    //   236: athrow
    // Exception table:
    //   from	to	target	type
    //   5	13	13	java/lang/IndexOutOfBoundsException
    //   24	165	166	java/lang/IndexOutOfBoundsException
    //   135	156	159	java/lang/IndexOutOfBoundsException
  }
  
  private <T extends Zgpi> void ZT(Zeu4<T> paramZeu4, long paramLong) {
    byte b = this.ZT.Zk(paramLong + this.ZV.ZS);
    try {
      if (b < 1 || b > 79) {
        String str1 = ZU(paramLong);
        String str2 = paramZeu4.getClass().getName();
        Zuh.ZY(false, Zqf.Zr, b, a(16169, -9532) + a(16169, -9532) + str2);
        this.Zy.ZK(this);
        throw new Zkfn(this.ZT.Zw());
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private String ZU(long paramLong) {
    Zbqc[] arrayOfZbqc = Zxsr.ZXP();
    try {
      if (!Zszd.ZX)
        return ""; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    long l1 = Math.max(0L, paramLong - 50L);
    long l2 = Math.min(this.ZT.ZO(), paramLong + 50L);
    int i = (int)(l2 - l1);
    StringBuilder stringBuilder = new StringBuilder("[");
    byte b = 0;
    while (b < i) {
      try {
        stringBuilder.append(String.format(a(16160, -13349), new Object[] { Byte.valueOf(this.ZT.Zk(b + l1)) }));
        if (b < i - 1)
          stringBuilder.append(a(16161, -23083)); 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    stringBuilder.append(']');
    String str = String.valueOf(stringBuilder);
    long l3 = l2;
    long l4 = l1;
    long l5 = paramLong;
    return a(16164, -20406) + a(16164, -20406) + l5 + a(16166, -11655) + l4 + a(16163, -22783) + l3 + a(16175, -11420);
  }
  
  private <T extends Zgpi> T Zn(long paramLong, Zeu4<? extends T> paramZeu4) {
    Zllo<? extends T> zllo = paramZeu4.ZI();
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zuh.ZT((zllo != null), Zqf.Zr, paramZeu4.getClass().getName());
    return zllo.ZV(this, paramLong);
  }
  
  public void Zs(Zm1x paramZm1x, Zr5g paramZr5g) {
    (new Zeey(this, this.ZT, this.ZD)).Zu(paramZm1x, paramZr5g);
  }
  
  private <T extends Zgpi> Zeu4<? extends T> ZG(long paramLong, Zeu4<T> paramZeu4) {
    // Byte code:
    //   0: invokestatic ZXP : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: getfield ZT : Lburp/Zzqa;
    //   7: lload_1
    //   8: aload_0
    //   9: getfield ZV : Lburp/Zx1;
    //   12: getfield Zd : I
    //   15: i2l
    //   16: ladd
    //   17: invokevirtual Zk : (J)B
    //   20: istore #6
    //   22: astore #4
    //   24: iload #6
    //   26: aload_3
    //   27: invokeinterface Z_ : ()B
    //   32: if_icmpne -> 43
    //   35: aload_3
    //   36: astore #5
    //   38: aload #4
    //   40: ifnull -> 53
    //   43: aload_3
    //   44: iload #6
    //   46: invokeinterface Z_ : (B)Lburp/Zeu4;
    //   51: astore #5
    //   53: aload #5
    //   55: ifnonnull -> 108
    //   58: iconst_0
    //   59: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   62: sipush #16171
    //   65: sipush #16887
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/Object
    //   75: dup
    //   76: iconst_0
    //   77: aload_3
    //   78: invokeinterface getClass : ()Ljava/lang/Class;
    //   83: invokevirtual getName : ()Ljava/lang/String;
    //   86: aastore
    //   87: dup
    //   88: iconst_1
    //   89: iload #6
    //   91: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   94: aastore
    //   95: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   98: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload #5
    //   110: areturn
    // Exception table:
    //   from	to	target	type
    //   53	101	104	burp/Zkfw
  }
  
  private <T extends Zgpi> void Zx(long paramLong1, long paramLong2, Zeu4<T> paramZeu4) {
    try {
      if (this.ZD)
        return; 
    } catch (Zkfn zkfn) {
      throw a(null);
    } 
    byte b1 = this.ZT.Zk(paramLong2 + this.ZV.ZY);
    byte b2 = paramZeu4.ZD();
    try {
      if (b1 == b2)
        return; 
    } catch (Zkfn zkfn) {
      throw a(null);
    } 
    try {
      if (b1 > b2)
        throw new Zkfw(); 
    } catch (Zkfn zkfn) {
      throw a(null);
    } 
    try {
      if (this.ZU.contains(Long.valueOf(paramLong2)))
        return; 
    } catch (Zkfn zkfn) {
      throw a(null);
    } 
    try {
      this.ZU.add(Long.valueOf(paramLong2));
      T t = (T)ZH((Zsqx)new Zbjy<>((Zeu4)paramZeu4));
      try {
        paramZeu4.ZG(this, paramLong1, b1, t);
      } catch (Zkfn zkfn) {
        Zah.Zl(zkfn, Zk_.COMMON_RUNTIME_FAILURE);
      } 
      Zi(paramLong1, (Zgpi)t);
    } finally {
      this.ZU.remove(Long.valueOf(paramLong2));
    } 
  }
  
  Object Zj(Zxsr paramZxsr) {
    synchronized (this.Zb) {
      Object object = this.Zb.Zo(Long.valueOf(paramZxsr.ZXU()));
      if (object == null) {
        object = new Object();
        this.Zb.ZS(Long.valueOf(paramZxsr.ZXU()), object);
      } 
      return object;
    } 
  }
  
  public void Zt(Zgpi paramZgpi) {
    this.Zp.ZX(paramZgpi);
  }
  
  private static Zsqx lambda$createNewObject$2(Zsqx paramZsqx) {
    return paramZsqx;
  }
  
  private static void lambda$createNewObject$1(Zxsr paramZxsr) {}
  
  private static void lambda$createNewObject$0(Zxsr paramZxsr) {}
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '_ë0° \\bàK]>o·ËúÝg¯âÓ+IÒù#º]N'hó¼¸6P­K}í\\nt&|TÓî²ý.¶s²ÜFBL¸Ã>ep÷¦ð\\t[,äò´1hÝ#­ x50ý®4e¾`L*N=¶zî&mµ¸©Ô_k2JôiEàO¡¢)ùýc{IÉ¥7.£Oõ\Ñ.r5ý®FÅt¿Ï4¶)³ËÊ¢òÐpQbÓ6f#êhù5+¨CÝç§mÝ:ÏÑ;¼Ó-9ö`{'#\\f£ÍaéÅ\\rk<ËGX6¤2NH\|LVGBháÕq­âW+|ðìL'{ìU­¹)Aìb»£2+ÊB/Ë¨Öë!Qqþ¿Ý»û­ÕÉâ;Á,¶dûü'ïÂñüÎ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #43
    //   21: istore_1
    //   22: invokestatic ZL : ([Lburp/Zbqc;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #33
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'gÛ IFó®~ÕÙÇþ­å%z7%GoF^´ YÕÐ¿ª'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_5
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #84
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zkit.a : [Ljava/lang/String;
    //   135: bipush #17
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zkit.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #29
    //   218: goto -> 248
    //   221: bipush #53
    //   223: goto -> 248
    //   226: bipush #10
    //   228: goto -> 248
    //   231: bipush #46
    //   233: goto -> 248
    //   236: bipush #120
    //   238: goto -> 248
    //   241: bipush #73
    //   243: goto -> 248
    //   246: bipush #17
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: new burp/Zx1
    //   307: dup
    //   308: iconst_0
    //   309: iconst_1
    //   310: iconst_1
    //   311: iconst_2
    //   312: iconst_3
    //   313: iconst_4
    //   314: invokespecial <init> : (IIIIII)V
    //   317: putstatic burp/Zkit.ZM : Lburp/Zx1;
    //   320: new burp/Zx1
    //   323: dup
    //   324: bipush #7
    //   326: bipush #19
    //   328: bipush #8
    //   330: bipush #20
    //   332: bipush #21
    //   334: bipush #22
    //   336: invokespecial <init> : (IIIIII)V
    //   339: putstatic burp/Zkit.Zl : Lburp/Zx1;
    //   342: return
  }
  
  public static void ZL(Zbqc[] paramArrayOfZbqc) {
    ZP = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZX() {
    return ZP;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3F27) & 0xFFFF;
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
      char c = 'Ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkit.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */