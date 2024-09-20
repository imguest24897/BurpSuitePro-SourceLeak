package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlnu implements Ztdi {
  private static final Ztuv Zu = Zlnu::lambda$static$0;
  
  private final Zrgd Zg;
  
  private final Zgb6 Zk;
  
  private final Zr1j Zr;
  
  private final Zkh7 ZB;
  
  private final Zbnt Zj;
  
  private final Ztwv ZI;
  
  private final Zr_4 Zv;
  
  private final Zey9 Zt;
  
  private final Zm6x Zc;
  
  private final Zmtb Zx;
  
  private final Object ZF;
  
  private final Ztos<Zt10> ZR;
  
  private final Zllq Zw = new Zllq(this);
  
  private final Zk5c Zi;
  
  private final Zkml Zl;
  
  private Zmt5<Zmkn> ZS;
  
  public Zlnu(Zrgd paramZrgd, Zgb6 paramZgb6, Zkl6 paramZkl6, Zskz paramZskz, Ztwv paramZtwv, Zr_4 paramZr_4, Zk5c paramZk5c, Zkml paramZkml, Zm6x paramZm6x) {
    this.Zg = paramZrgd;
    this.Zk = paramZgb6;
    this.ZB = paramZkl6.Zd();
    this.ZI = paramZtwv;
    this.Zv = paramZr_4;
    this.Zi = paramZk5c;
    int[] arrayOfInt = Zl9l.ZF();
    try {
      this.Zl = paramZkml;
      this.Zr = paramZkl6.Zq();
      this.Zj = paramZkl6.ZB();
      this.Zt = paramZkl6.ZH();
      this.Zc = paramZm6x;
      this.ZF = paramZskz.Zz6();
      this.Zx = new Zmtb(paramZskz);
      this.ZR = new Ztos<>(Zt10.ZH());
      this.ZS = paramZm6x.ZO(Zmkn.class, Zehw.ASYNC, this::lambda$new$1);
      if (Zbqc.Zwu() == null)
        Zl9l.ZA(new int[1]); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  public Zez3 Zq(Zlit paramZlit, short paramShort) {
    return Zb(paramZlit, null, 0, paramShort, Zu);
  }
  
  public Zez3 Zs(Zlit paramZlit, short paramShort, Ztuv paramZtuv) {
    return Zb(paramZlit, null, 0, paramShort, paramZtuv);
  }
  
  public Zez3 ZP(Zlit paramZlit, Zstu paramZstu, int paramInt, short paramShort) {
    return Zb(paramZlit, paramZstu, paramInt, paramShort, Zu);
  }
  
  public Zez3 Zb(Zlit paramZlit, Zstu paramZstu, int paramInt, short paramShort, Ztuv paramZtuv) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((paramZlit != null), Zqf.Zv);
      if (paramZstu == null)
        try {
          if (!paramZlit.Zds())
            return ZL(paramZlit, paramShort, paramZtuv); 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return ZA(paramZlit, paramZstu, paramInt, paramShort, paramZtuv);
  }
  
  Zmxt ZR(Zlit paramZlit, short paramShort) {
    return ZL(paramZlit, paramShort, Zu);
  }
  
  private Zmxt ZL(Zlit paramZlit, short paramShort, Ztuv paramZtuv) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZI : Lburp/Ztwv;
    //   9: invokeinterface Zu : ()Z
    //   14: ifne -> 25
    //   17: iconst_1
    //   18: goto -> 26
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: iconst_0
    //   26: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   29: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   32: aload_0
    //   33: getfield ZF : Ljava/lang/Object;
    //   36: dup
    //   37: astore #5
    //   39: monitorenter
    //   40: aload_0
    //   41: getfield Zx : Lburp/Zmtb;
    //   44: aload_1
    //   45: invokevirtual ZY : (Lburp/Zlit;)Lburp/Zmxt;
    //   48: astore #6
    //   50: aload #6
    //   52: ifnonnull -> 216
    //   55: aload_1
    //   56: invokeinterface ZdH : ()[B
    //   61: astore #7
    //   63: aload #7
    //   65: bipush #47
    //   67: iconst_0
    //   68: aload #7
    //   70: arraylength
    //   71: invokestatic ZD : ([BBII)I
    //   74: istore #8
    //   76: aload #7
    //   78: arraylength
    //   79: iload #8
    //   81: isub
    //   82: iconst_1
    //   83: if_icmple -> 96
    //   86: iinc #8, 1
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_0
    //   97: aload_1
    //   98: iload_2
    //   99: invokevirtual Zf : (Lburp/Zlit;S)Lburp/Zez3;
    //   102: astore #9
    //   104: aload_0
    //   105: getfield Zx : Lburp/Zmtb;
    //   108: aload_1
    //   109: invokevirtual ZY : (Lburp/Zlit;)Lburp/Zmxt;
    //   112: astore #10
    //   114: aload #10
    //   116: ifnonnull -> 204
    //   119: aload_0
    //   120: getfield Zv : Lburp/Zr_4;
    //   123: aload_1
    //   124: invokeinterface Zo : (Lburp/Zg35;)Lburp/Zg35;
    //   129: checkcast burp/Zlit
    //   132: astore_1
    //   133: aload_0
    //   134: getfield Zv : Lburp/Zr_4;
    //   137: new burp/Zrr9
    //   140: dup
    //   141: aload_1
    //   142: aload #9
    //   144: aload #7
    //   146: iload #8
    //   148: aload #7
    //   150: arraylength
    //   151: invokestatic Zz : ([BII)[B
    //   154: invokestatic ZG : ([B)Ljava/lang/String;
    //   157: iload_2
    //   158: invokespecial <init> : (Lburp/Zlit;Lburp/Zez3;Ljava/lang/String;S)V
    //   161: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   166: checkcast burp/Zmxt
    //   169: astore #6
    //   171: aload #9
    //   173: ifnull -> 189
    //   176: aload_0
    //   177: aload #6
    //   179: invokevirtual ZX : (Lburp/Zez3;)V
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: aload_0
    //   190: getfield Zx : Lburp/Zmtb;
    //   193: aload_1
    //   194: aload #6
    //   196: invokevirtual ZV : (Lburp/Zlit;Lburp/Zmxt;)V
    //   199: aload #4
    //   201: ifnull -> 208
    //   204: aload #10
    //   206: astore #6
    //   208: aload_3
    //   209: aload #6
    //   211: invokeinterface Zk : (Lburp/Zez3;)V
    //   216: aload #6
    //   218: aload #5
    //   220: monitorexit
    //   221: areturn
    //   222: astore #11
    //   224: aload #5
    //   226: monitorexit
    //   227: aload #11
    //   229: athrow
    // Exception table:
    //   from	to	target	type
    //   5	21	21	java/lang/IndexOutOfBoundsException
    //   40	221	222	finally
    //   76	89	92	java/lang/IndexOutOfBoundsException
    //   171	182	185	java/lang/IndexOutOfBoundsException
    //   222	227	222	finally
  }
  
  private Zg6u ZA(Zlit paramZlit, Zstu paramZstu, int paramInt, short paramShort, Ztuv paramZtuv) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore #6
    //   5: aload_0
    //   6: getfield ZI : Lburp/Ztwv;
    //   9: invokeinterface Zu : ()Z
    //   14: ifne -> 25
    //   17: iconst_1
    //   18: goto -> 26
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: iconst_0
    //   26: getstatic net/portswigger/Zqf.ZF : Lnet/portswigger/Zqf;
    //   29: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   32: aload_0
    //   33: getfield ZF : Ljava/lang/Object;
    //   36: dup
    //   37: astore #7
    //   39: monitorenter
    //   40: aload_2
    //   41: ifnonnull -> 48
    //   44: aconst_null
    //   45: goto -> 54
    //   48: aload_2
    //   49: invokeinterface ZiD : ()[B
    //   54: astore #8
    //   56: new burp/Zax
    //   59: dup
    //   60: aload_1
    //   61: invokeinterface Zdz : ()Lburp/Zmzk;
    //   66: aload_1
    //   67: invokeinterface Zd4 : ()[B
    //   72: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   75: astore #9
    //   77: aload_0
    //   78: aload #9
    //   80: iload #4
    //   82: invokevirtual ZR : (Lburp/Zlit;S)Lburp/Zmxt;
    //   85: astore #10
    //   87: aload #8
    //   89: ifnull -> 100
    //   92: iconst_1
    //   93: goto -> 101
    //   96: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   99: athrow
    //   100: iconst_0
    //   101: istore #11
    //   103: iload #11
    //   105: ifne -> 118
    //   108: aload_1
    //   109: invokeinterface ZdC : ()[B
    //   114: astore #8
    //   116: iconst_0
    //   117: istore_3
    //   118: aload #8
    //   120: iload_3
    //   121: aload #8
    //   123: arraylength
    //   124: iload_3
    //   125: isub
    //   126: iconst_1
    //   127: iload #11
    //   129: ifeq -> 140
    //   132: iconst_1
    //   133: goto -> 141
    //   136: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   139: athrow
    //   140: iconst_0
    //   141: invokestatic Zr : ([BIIZI)I
    //   144: istore #12
    //   146: aload #10
    //   148: invokeinterface Zkw : ()Z
    //   153: ifeq -> 176
    //   156: aload_0
    //   157: aload #10
    //   159: iload #4
    //   161: invokevirtual ZI : (Lburp/Zmxt;S)V
    //   164: aload #6
    //   166: ifnull -> 240
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   175: athrow
    //   176: new burp/Zl9m
    //   179: dup
    //   180: iload #12
    //   182: invokespecial <init> : (I)V
    //   185: astore #13
    //   187: aload #10
    //   189: aload #13
    //   191: invokeinterface ZK : (Lburp/Zl9l;)Z
    //   196: pop
    //   197: aload #13
    //   199: getfield ZV : Lburp/Zg6u;
    //   202: ifnull -> 214
    //   205: aload #13
    //   207: getfield ZV : Lburp/Zg6u;
    //   210: aload #7
    //   212: monitorexit
    //   213: areturn
    //   214: goto -> 240
    //   217: astore #13
    //   219: aload #13
    //   221: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   224: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   227: goto -> 240
    //   230: astore #13
    //   232: aload #13
    //   234: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   237: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   240: iload_3
    //   241: aload #8
    //   243: arraylength
    //   244: if_icmplt -> 256
    //   247: ldc ''
    //   249: astore #13
    //   251: aload #6
    //   253: ifnull -> 271
    //   256: aload #8
    //   258: iload_3
    //   259: bipush #100
    //   261: bipush #90
    //   263: invokestatic ZA : ([BIII)[B
    //   266: invokestatic ZG : ([B)Ljava/lang/String;
    //   269: astore #13
    //   271: aload_0
    //   272: getfield Zv : Lburp/Zr_4;
    //   275: new burp/Zsyz
    //   278: dup
    //   279: aload_0
    //   280: getfield Zv : Lburp/Zr_4;
    //   283: aload_1
    //   284: invokeinterface Zo : (Lburp/Zg35;)Lburp/Zg35;
    //   289: checkcast burp/Zlit
    //   292: aload #10
    //   294: aload #13
    //   296: iload #12
    //   298: iload #4
    //   300: invokespecial <init> : (Lburp/Zlit;Lburp/Zez3;Ljava/lang/String;IS)V
    //   303: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   308: checkcast burp/Zg6u
    //   311: astore #14
    //   313: aload_0
    //   314: aload #14
    //   316: invokevirtual ZX : (Lburp/Zez3;)V
    //   319: aload #5
    //   321: aload #14
    //   323: invokeinterface Zk : (Lburp/Zez3;)V
    //   328: aload #14
    //   330: aload #7
    //   332: monitorexit
    //   333: areturn
    //   334: astore #15
    //   336: aload #7
    //   338: monitorexit
    //   339: aload #15
    //   341: athrow
    // Exception table:
    //   from	to	target	type
    //   5	21	21	java/lang/IndexOutOfBoundsException
    //   40	213	334	finally
    //   87	96	96	java/lang/IndexOutOfBoundsException
    //   118	136	136	java/lang/IndexOutOfBoundsException
    //   146	169	172	java/lang/IndexOutOfBoundsException
    //   176	210	217	java/lang/IndexOutOfBoundsException
    //   176	210	230	java/lang/Exception
    //   214	333	334	finally
    //   334	339	334	finally
  }
  
  public boolean ZA() {
    synchronized (this.ZF) {
      return this.Zx.Za();
    } 
  }
  
  public Ze1 Zm(int paramInt, List<Zrdb> paramList) {
    return ZZ(paramInt, paramList, true, true);
  }
  
  public Ze1 ZZ(int paramInt, List<Zrdb> paramList, boolean paramBoolean1, boolean paramBoolean2) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      Zx01 zx01 = new Zx01(this, this.Zj, this.Zt, paramBoolean1);
      Zzg3 zzg3 = this.Zi.Zq(zx01);
      return zzg3.Z_(paramInt, paramList, paramBoolean2);
    } 
  }
  
  public void Zq(Collection<Zrdb> paramCollection) {
    int[] arrayOfInt = Zl9l.ZF();
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      ArrayList<Zk7x> arrayList = new ArrayList();
      for (Zrdb zrdb : paramCollection) {
        Zmxt zmxt = Zf(new Zax(zrdb.ZaB(), zrdb.Zax()));
        try {
          if (zmxt == null)
            continue; 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        } 
        arrayList.add(new Zk7x(zmxt, zrdb));
        if (arrayOfInt != null)
          break; 
      } 
      try {
        if (!arrayList.isEmpty())
          Za(arrayList); 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
    } 
  }
  
  public void ZP(Collection<Zrdb> paramCollection) {
    int[] arrayOfInt = Zl9l.ZF();
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      for (Zrdb zrdb : paramCollection) {
        Zmxt zmxt = Zf(new Zax(zrdb.ZaB(), zrdb.Zax()));
        try {
          if (zmxt == null)
            continue; 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        } 
        try {
          if (zmxt.Zqz().ZRn().remove(zrdb))
            Zf(zmxt, zrdb); 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        } 
        if (arrayOfInt != null)
          break; 
      } 
    } 
  }
  
  public List<Zrdb> Zs(Predicate<Zez3> paramPredicate) {
    ArrayList<Zrdb> arrayList = new ArrayList();
    Zsn zsn = new Zsn(arrayList);
    int[] arrayOfInt = Zl9l.ZF();
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      ArrayList<Zzhb> arrayList1 = new ArrayList<>(ZE());
      for (Zez3 zez3 : arrayList1) {
        zsn.ZZ(paramPredicate, zez3);
        if (arrayOfInt != null)
          break; 
      } 
    } 
    arrayList.sort(new Zxp_(this));
    return arrayList;
  }
  
  void ZO(Zmxt paramZmxt, List<Zrdb> paramList, boolean paramBoolean) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      if (paramZmxt.Zq7().ZTU() == 4)
        paramZmxt.Zq7().ZU((byte)0); 
      this.ZR.ZD(Zt10.Ze(paramZmxt, paramList, paramBoolean));
    } 
  }
  
  private void Za(Collection<Zk7x> paramCollection) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      this.ZR.ZD(Zt10.ZT(paramCollection));
    } 
  }
  
  void Zj(Zmxt paramZmxt, List<Zrdb> paramList) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      paramList.forEach(Zrdb::ZaL);
      this.ZR.ZD(Zt10.ZH(paramZmxt, paramList));
    } 
  }
  
  private void Zf(Zmxt paramZmxt, Zrdb paramZrdb) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      paramZrdb.ZaL();
      this.ZR.ZD(Zt10.ZQ(paramZmxt, paramZrdb));
    } 
  }
  
  private Zez3 Zf(Zlit paramZlit, short paramShort) {
    byte[] arrayOfByte = paramZlit.ZdH();
    int i = Zli.ZD(arrayOfByte, (byte)47, 0, arrayOfByte.length);
    if (i > 0) {
      byte[] arrayOfByte1 = Zmw.Zz(arrayOfByte, 0, i);
      Zax zax = new Zax(paramZlit.Zdz(), arrayOfByte1);
      return ZY(zax, paramShort);
    } 
    return ZS(paramZlit.Zdz(), paramShort);
  }
  
  Zrtx ZY(Zlit paramZlit, short paramShort) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      Zrtx zrtx = this.Zx.ZZ(paramZlit);
      if (zrtx == null) {
        byte[] arrayOfByte = paramZlit.ZdH();
        int i = Zli.ZD(arrayOfByte, (byte)47, 0, arrayOfByte.length);
        Zez3 zez3 = Zf(paramZlit, paramShort);
        paramZlit = this.Zv.<Zlit>Zo(paramZlit);
        zrtx = this.Zv.<Zrtx>ZH(new Zrfe(paramZlit, zez3, Zkb.ZG(Zmw.Zz(arrayOfByte, i + 1, arrayOfByte.length))));
        try {
          if (zez3 != null)
            ZX(zrtx); 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        } 
        this.Zx.ZH(paramZlit, zrtx);
        this.ZR.ZD(Zt10.Zz(zrtx, paramShort));
      } 
      return zrtx;
    } 
  }
  
  Zzhb ZS(Zmzk paramZmzk, short paramShort) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      Zzhb zzhb = this.Zx.Zy(paramZmzk);
      if (zzhb == null) {
        paramZmzk = this.Zv.<Zmzk>Zo(paramZmzk);
        zzhb = this.Zv.<Zzhb>ZH(new Zzev(this.Zg, paramZmzk, this.Zk, this.Zr, this.ZB, this.ZI));
        this.Zx.Zy(paramZmzk, zzhb);
        this.ZR.ZD(Zt10.Zz(zzhb, paramShort));
      } 
      return zzhb;
    } 
  }
  
  private void ZX(Zez3 paramZez3) {
    Zez3 zez3 = paramZez3.ZkJ();
    try {
      zez3.Zp(paramZez3, this);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  public Zzhb Zz(Zmzk paramZmzk) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      return this.Zx.Zy(paramZmzk);
    } 
  }
  
  public Zrtx ZU(Zlit paramZlit) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      return this.Zx.ZZ(paramZlit);
    } 
  }
  
  public Zmxt Zf(Zlit paramZlit) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      return this.Zx.ZY(paramZlit);
    } 
  }
  
  public Zmxt Zc(Zlit paramZlit) {
    synchronized (this.ZF) {
      return this.Zx.ZY(paramZlit);
    } 
  }
  
  public boolean ZP(Zez3 paramZez3) {
    try {
    
    } catch (Exception exception) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      Zez3 zez3 = paramZez3.ZkJ();
      if (zez3 != null)
        try {
          zez3.Zu(paramZez3, this);
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        }  
      boolean bool = this.Zx.Zi(paramZez3);
      try {
        if (bool)
          this.ZR.ZD(Zt10.ZH(paramZez3)); 
      } catch (Exception exception) {
        throw a(null);
      } 
      return bool;
    } 
  }
  
  public void ZI(Zefg<Zez3> paramZefg, Zez3 paramZez3) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((paramZefg != null), Zqf.Zv);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((paramZez3 != null), Zqf.Zv);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      paramZefg.add(paramZez3);
    } 
  }
  
  public void Zb(Zefg<Zez3> paramZefg, Zez3 paramZez3) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((paramZefg != null), Zqf.Zv);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((paramZez3 != null), Zqf.Zv);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      paramZefg.remove(paramZez3);
    } 
  }
  
  public void ZR(Zez3 paramZez3) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      this.ZR.ZD(Zt10.ZW(paramZez3));
    } 
  }
  
  public void Zh(Zez3 paramZez3, Zgd paramZgd) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      paramZgd.Zr(paramZez3);
    } 
  }
  
  public boolean Zj(Zez3 paramZez3, Zgd paramZgd) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      return paramZgd.ZO(paramZez3);
    } 
  }
  
  public void Zi(Zskz paramZskz, Ztg8 paramZtg8, Zlc8 paramZlc8, float paramFloat1, float paramFloat2) {
    this.ZR.ZD(Zt10.Zw());
    try {
      (new Zr3c(paramZskz, this, paramZtg8, this.Zv.Zl())).ZS(paramZlc8, paramFloat1, paramFloat2);
    } finally {
      this.ZR.ZD(Zt10.Zv());
    } 
  }
  
  public void ZQ(Zez3 paramZez3, Zs99 paramZs99) {
    synchronized (this.ZF) {
      paramZez3.ZN(new Zl9v(this, paramZs99));
    } 
  }
  
  public Zlli<Zt10> Zk() {
    return this.ZR;
  }
  
  public void Zf() {
    try {
      if (this.ZS != null) {
        this.Zc.Ze((Zmt5<?>[])new Zmt5[] { this.ZS });
        this.ZS = null;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void ZP(Zzhb paramZzhb, Zs99 paramZs99) {
    try {
      if (this.Zx.Zy(Zg(paramZzhb)) != null)
        return; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zzhb zzhb = paramZs99.Z_(paramZzhb);
    try {
      if (zzhb != null) {
        this.Zx.Zy(zzhb.Zod(), zzhb);
        this.ZR.ZD(Zt10.Zr(zzhb));
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void Zr(Zrtx paramZrtx, Zs99 paramZs99) {
    Zax zax = new Zax(Zg(paramZrtx), paramZrtx.ZlL().ZdH());
    try {
      if (this.Zx.ZZ(zax) != null)
        return; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zez3 zez3 = Zf(zax, (short)0);
    Zrtx zrtx = paramZs99.Zw(paramZrtx, zez3);
    try {
      if (zrtx != null) {
        this.Zx.ZH(zrtx.ZlL(), zrtx);
        this.ZR.ZD(Zt10.Zr(zrtx));
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void Zb(Zmxt paramZmxt, Zs99 paramZs99) {
    Zax zax = new Zax(Zg(paramZmxt), paramZmxt.ZlL().ZdH());
    try {
      if (this.Zx.ZY(zax) != null)
        return; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zez3 zez3 = Zf(zax, (short)0);
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb((zez3 != null), Zqf.Zr);
    Zmxt zmxt = paramZs99.ZE(paramZmxt, zez3);
    try {
      if (zmxt != null) {
        this.Zx.ZV(zmxt.ZlL(), zmxt);
        ZR(zmxt);
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private void Zc(Zg6u paramZg6u, Zs99 paramZs99) {
    Zax zax = new Zax(Zg(paramZg6u.ZkJ()), paramZg6u.ZkJ().ZlL().ZdH());
    Zmxt zmxt = this.Zx.ZY(zax);
    try {
      if (zmxt == null) {
        Zuh.Zb(false, Zqf.Zr);
        return;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zl9m zl9m = new Zl9m(paramZg6u.ZxU());
    try {
      zmxt.ZK(zl9m);
      if (zl9m.ZV != null)
        return; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zg6u zg6u = paramZs99.Zf(paramZg6u, zmxt);
    try {
      if (zg6u != null)
        ZR(zg6u); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
  }
  
  private Zmzk Zg(Zez3 paramZez3) {
    try {
      Zmzk zmzk = paramZez3.Zod();
      return this.Zj.ZY(zmzk.ZJ1(), zmzk.ZJO(), zmzk.ZJZ());
    } catch (Zxgy|Zxg5 zxgy) {
      Zah.Zl(zxgy, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private void ZI(Zmxt paramZmxt, short paramShort) {
    this.ZR.ZD(Zt10.Zw(paramZmxt, paramShort));
  }
  
  public Collection<Zzhb> ZE() {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      return this.Zx.Z_();
    } 
  }
  
  public void Zf(Zbx0 paramZbx0, Zez3[] paramArrayOfZez3) {
    // Byte code:
    //   0: invokestatic ZF : ()[I
    //   3: astore_3
    //   4: new burp/Zq2
    //   7: dup
    //   8: aload_1
    //   9: invokespecial <init> : (Lburp/Zbx0;)V
    //   12: astore #4
    //   14: aload_2
    //   15: ifnonnull -> 66
    //   18: aload_0
    //   19: invokevirtual ZE : ()Ljava/util/Collection;
    //   22: invokeinterface iterator : ()Ljava/util/Iterator;
    //   27: astore #5
    //   29: aload #5
    //   31: invokeinterface hasNext : ()Z
    //   36: ifeq -> 62
    //   39: aload #5
    //   41: invokeinterface next : ()Ljava/lang/Object;
    //   46: checkcast burp/Zez3
    //   49: astore #6
    //   51: aload #4
    //   53: aload #6
    //   55: invokevirtual Zx : (Lburp/Zez3;)V
    //   58: aload_3
    //   59: ifnull -> 29
    //   62: aload_3
    //   63: ifnull -> 105
    //   66: aload_2
    //   67: astore #5
    //   69: aload #5
    //   71: arraylength
    //   72: istore #6
    //   74: iconst_0
    //   75: istore #7
    //   77: iload #7
    //   79: iload #6
    //   81: if_icmpge -> 105
    //   84: aload #5
    //   86: iload #7
    //   88: aaload
    //   89: astore #8
    //   91: aload #4
    //   93: aload #8
    //   95: invokevirtual Zx : (Lburp/Zez3;)V
    //   98: iinc #7, 1
    //   101: aload_3
    //   102: ifnull -> 77
    //   105: return
  }
  
  public List<Zmfj> Zu(Predicate<Zez3> paramPredicate) {
    ArrayList<Zmfj> arrayList = new ArrayList(100);
    Zt8n zt8n = this.Zl.Zr(arrayList);
    int[] arrayOfInt = Zl9l.ZF();
    synchronized (this.ZF) {
      for (Zez3 zez3 : ZE()) {
        zt8n.ZY(paramPredicate, zez3);
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return arrayList;
  }
  
  public boolean ZZ(Zl9l paramZl9l) {
    int[] arrayOfInt = Zl9l.ZF();
    for (Zez3 zez3 : ZE()) {
      try {
        if (zez3 != null)
          try {
            if (zez3.ZN(paramZl9l))
              return true; 
          } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw a(null);
          }  
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      if (arrayOfInt != null)
        break; 
    } 
    return false;
  }
  
  public boolean Za(Zez3 paramZez3) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Zuh.Zb(!this.ZI.Zu(), Zqf.ZF);
    synchronized (this.ZF) {
      this.Zw.ZW = false;
      paramZez3.Zk(this.Zw);
      return this.Zw.ZW;
    } 
  }
  
  private void lambda$new$1(Zmkn paramZmkn) {
    paramZmkn.Zfv().forEach(this::ZR);
  }
  
  private static void lambda$static$0(Zez3 paramZez3) {}
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlnu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */