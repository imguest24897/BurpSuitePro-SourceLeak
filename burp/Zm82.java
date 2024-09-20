package burp;

import java.awt.Window;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm82 {
  private static final Random Zc = new Random();
  
  private final List<Ztvb> Zx;
  
  private final Zr_4 Zm;
  
  private final Ztwv Za;
  
  private final Zkl6 Zp;
  
  private final Zey9 Zf;
  
  private Ztnu ZQ;
  
  private final LinkedList<Runnable> Zv;
  
  private Zzv5 ZM;
  
  private byte ZK;
  
  private Ztdi Zj;
  
  private Zlit ZJ;
  
  private Ztdi ZU;
  
  private byte ZA;
  
  private int Zu;
  
  private final Zxz1 ZV;
  
  private final Map<String, Zrc5> ZH;
  
  private final Ztav ZX;
  
  private final Zt2t ZI;
  
  private final Zskh Zo;
  
  private final Zbnt Zn;
  
  private final List<String> Ze;
  
  private final List<String> Zz;
  
  private final Set<Zlit> ZN;
  
  private final Set<Zlit> Zh;
  
  private static Zbqc[] Zi;
  
  public Zm82(Window paramWindow, Zrgd paramZrgd, Ztdi paramZtdi, Zgvn paramZgvn, Zskh paramZskh, Zz_r paramZz_r, Zgb6 paramZgb6, Zkl6 paramZkl6, Zlit paramZlit, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zgx0 paramZgx0, Zlaa paramZlaa, Zlcb paramZlcb, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zb : ()[Lburp/Zbqc;
    //   7: aload_0
    //   8: new java/util/ArrayList
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: putfield Zx : Ljava/util/List;
    //   18: astore #17
    //   20: aload_0
    //   21: new java/util/LinkedList
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: putfield Zv : Ljava/util/LinkedList;
    //   31: aload_0
    //   32: iconst_0
    //   33: putfield ZA : B
    //   36: aload_0
    //   37: new java/util/HashMap
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: putfield ZH : Ljava/util/Map;
    //   47: aload_0
    //   48: new java/util/ArrayList
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: putfield Ze : Ljava/util/List;
    //   58: aload_0
    //   59: new java/util/ArrayList
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: putfield Zz : Ljava/util/List;
    //   69: aload_0
    //   70: new java/util/HashSet
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: putfield ZN : Ljava/util/Set;
    //   80: aload_0
    //   81: new java/util/HashSet
    //   84: dup
    //   85: invokespecial <init> : ()V
    //   88: putfield Zh : Ljava/util/Set;
    //   91: aload_0
    //   92: aload_3
    //   93: putfield ZU : Lburp/Ztdi;
    //   96: aload_0
    //   97: aload #5
    //   99: putfield Zo : Lburp/Zskh;
    //   102: aload_0
    //   103: aload #10
    //   105: putfield Za : Lburp/Ztwv;
    //   108: aload_0
    //   109: aload #11
    //   111: putfield Zm : Lburp/Zr_4;
    //   114: aload_0
    //   115: aload #8
    //   117: putfield Zp : Lburp/Zkl6;
    //   120: aload_0
    //   121: aload #8
    //   123: invokeinterface ZB : ()Lburp/Zbnt;
    //   128: putfield Zn : Lburp/Zbnt;
    //   131: aload_0
    //   132: aload #8
    //   134: invokeinterface ZH : ()Lburp/Zey9;
    //   139: putfield Zf : Lburp/Zey9;
    //   142: aload #9
    //   144: invokeinterface Zd4 : ()[B
    //   149: invokestatic ZG : ([B)Ljava/lang/String;
    //   152: astore #18
    //   154: aload #18
    //   156: iconst_0
    //   157: aload #18
    //   159: bipush #47
    //   161: invokevirtual lastIndexOf : (I)I
    //   164: iconst_1
    //   165: iadd
    //   166: invokevirtual substring : (II)Ljava/lang/String;
    //   169: astore #18
    //   171: new burp/Zax
    //   174: dup
    //   175: aload #9
    //   177: invokeinterface Zdz : ()Lburp/Zmzk;
    //   182: aload #18
    //   184: invokestatic Zy : (Ljava/lang/String;)[B
    //   187: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   190: astore #9
    //   192: aload_0
    //   193: new burp/Ztnu
    //   196: dup
    //   197: aload_0
    //   198: getfield Zx : Ljava/util/List;
    //   201: invokespecial <init> : (Ljava/util/List;)V
    //   204: putfield ZQ : Lburp/Ztnu;
    //   207: aload #12
    //   209: new burp/Zrkx
    //   212: dup
    //   213: invokespecial <init> : ()V
    //   216: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   221: checkcast burp/Zskz
    //   224: astore #19
    //   226: aload_0
    //   227: new burp/Zlnu
    //   230: dup
    //   231: aload_2
    //   232: aload #7
    //   234: aload #8
    //   236: aload #19
    //   238: aload #10
    //   240: aload #11
    //   242: new burp/Zk5c
    //   245: dup
    //   246: aload #4
    //   248: <illegal opcode> get : (Lburp/Zgvn;)Ljava/util/function/Supplier;
    //   253: aload #6
    //   255: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zz_r;)V
    //   258: new burp/Zkml
    //   261: dup
    //   262: aload #8
    //   264: aload #16
    //   266: invokespecial <init> : (Lburp/Zkl6;Lburp/Zm6x;)V
    //   269: aload #16
    //   271: invokespecial <init> : (Lburp/Zrgd;Lburp/Zgb6;Lburp/Zkl6;Lburp/Zskz;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zk5c;Lburp/Zkml;Lburp/Zm6x;)V
    //   274: putfield Zj : Lburp/Ztdi;
    //   277: aload_0
    //   278: aload #13
    //   280: aload_1
    //   281: aload #9
    //   283: aload_0
    //   284: aload_0
    //   285: getfield Zj : Lburp/Ztdi;
    //   288: aload #19
    //   290: invokeinterface Zy : (Ljava/awt/Window;Lburp/Zlit;Lburp/Zm82;Lburp/Ztdi;Lburp/Zskz;)Lburp/Zzv5;
    //   295: putfield ZM : Lburp/Zzv5;
    //   298: aload_0
    //   299: aload_0
    //   300: getfield ZM : Lburp/Zzv5;
    //   303: invokeinterface Zq : ()B
    //   308: putfield ZK : B
    //   311: aload_0
    //   312: new burp/Ztav
    //   315: dup
    //   316: aload_0
    //   317: invokespecial <init> : (Lburp/Zm82;)V
    //   320: putfield ZX : Lburp/Ztav;
    //   323: aload #10
    //   325: aload_0
    //   326: aload_3
    //   327: <illegal opcode> run : (Lburp/Zm82;Lburp/Ztdi;)Ljava/lang/Runnable;
    //   332: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   337: pop
    //   338: new burp/Zgi1
    //   341: dup
    //   342: aload #14
    //   344: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   347: aload #5
    //   349: aload #15
    //   351: getstatic burp/Zeew.TARGET : Lburp/Zeew;
    //   354: invokeinterface ZW : (Lburp/Zeew;)Lburp/Zgg0;
    //   359: invokevirtual Zk : (Lburp/Zeew;Lburp/Zskh;Lburp/Zgg0;)Lburp/Zl11;
    //   362: aload #5
    //   364: aload #7
    //   366: invokespecial <init> : (Lburp/Zl11;Lburp/Zskh;Lburp/Zgb6;)V
    //   369: astore #20
    //   371: aload_0
    //   372: new burp/Zxz1
    //   375: dup
    //   376: aload #5
    //   378: aload_0
    //   379: getfield ZM : Lburp/Zzv5;
    //   382: aload #20
    //   384: invokespecial <init> : (Lburp/Zskh;Lburp/Zzv5;Lburp/Zgi1;)V
    //   387: putfield ZV : Lburp/Zxz1;
    //   390: aload_0
    //   391: new burp/Zt2t
    //   394: dup
    //   395: aload_0
    //   396: aload #5
    //   398: aload_0
    //   399: getfield Zj : Lburp/Ztdi;
    //   402: aload #6
    //   404: aload #7
    //   406: aload_0
    //   407: getfield ZM : Lburp/Zzv5;
    //   410: aload_0
    //   411: getfield ZV : Lburp/Zxz1;
    //   414: aload_0
    //   415: getfield Zn : Lburp/Zbnt;
    //   418: aload #10
    //   420: aload #11
    //   422: aload_0
    //   423: getfield Zf : Lburp/Zey9;
    //   426: invokespecial <init> : (Lburp/Zm82;Lburp/Zskh;Lburp/Ztdi;Lburp/Zz_r;Lburp/Zgb6;Lburp/Zzv5;Lburp/Zxz1;Lburp/Zbnt;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zey9;)V
    //   429: putfield ZI : Lburp/Zt2t;
    //   432: invokestatic Zwu : ()[Lburp/Zbqc;
    //   435: ifnonnull -> 445
    //   438: iconst_5
    //   439: anewarray burp/Zbqc
    //   442: invokestatic ZD : ([Lburp/Zbqc;)V
    //   445: return
  }
  
  boolean ZS(boolean paramBoolean) {
    Zlit zlit;
    Zbqc[] arrayOfZbqc = Zb();
    switch (this.ZA) {
      case 0:
        zlit = this.ZM.Zv();
        if (zlit == null) {
          Zmgc.INVALID_START_URL.ZK(this.Zo, new Object[0]);
          return false;
        } 
        Zy(zlit);
        Zp();
        if (arrayOfZbqc == null);
        return true;
      case 2:
        Zuh.Zv(paramBoolean, Zqf.Zr, this.ZA);
        this.ZA = 1;
        this.ZM.ZB(this.ZA);
        synchronized (this.Zx) {
          this.Zx.notifyAll();
        } 
        Zp();
        if (arrayOfZbqc == null);
        return true;
      case 1:
        Zuh.Zv(!paramBoolean, Zqf.Zr, this.ZA);
        this.ZA = 2;
        this.ZM.ZB(this.ZA);
        if (arrayOfZbqc == null);
        return true;
      case 3:
        Zuh.Zv(!paramBoolean, Zqf.Zr, this.ZA);
        if (arrayOfZbqc == null)
          break; 
        return true;
    } 
    Zuh.Zv(false, Zqf.Zk, this.ZA);
    return true;
  }
  
  private void Zp() {
    Objects.requireNonNull(this.ZI);
    this.Za.Zx(this.ZI::ZK);
  }
  
  private void Zy(Zlit paramZlit) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield ZJ : Lburp/Zlit;
    //   5: aload_0
    //   6: iconst_1
    //   7: putfield ZA : B
    //   10: aload_0
    //   11: getfield ZM : Lburp/Zzv5;
    //   14: aload_0
    //   15: getfield ZA : B
    //   18: invokeinterface ZB : (B)V
    //   23: aload_0
    //   24: getfield Za : Lburp/Ztwv;
    //   27: aload_0
    //   28: aload_1
    //   29: <illegal opcode> run : (Lburp/Zm82;Lburp/Zlit;)Ljava/lang/Runnable;
    //   34: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   39: pop
    //   40: return
  }
  
  private void ZL(Zez3 paramZez3) {
    try {
      Zl96 zl96 = new Zl96(this);
      boolean bool = paramZez3.ZN(zl96);
      try {
        if (bool && paramZez3.ZkP() > 0) {
          Zl9z zl9z = new Zl9z(this);
          paramZez3.ZK(zl9z);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zc(Zez3 paramZez3, int paramInt) {
    try {
      Zl9x zl9x = new Zl9x(this);
      boolean bool = paramZez3.ZN(zl9x);
      try {
        if (--paramInt >= 0)
          try {
            if (bool && paramZez3.ZkP() > 0) {
              int i = paramInt;
              Zl9w zl9w = new Zl9w(this, i);
              paramZez3.ZK(zl9w);
            } 
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zs(Ztvb paramZtvb) {
    Zbqc[] arrayOfZbqc = Zb();
    synchronized (this.Zx) {
      int i = this.Zx.size();
      byte b = paramZtvb.Zr();
      byte b1 = 0;
      while (b1 < i) {
        Ztvb ztvb = this.Zx.get(b1);
        if (b < ztvb.Zr())
          break; 
        b1++;
        if (arrayOfZbqc == null)
          break; 
      } 
      this.Zx.add(b1, paramZtvb);
      this.ZQ.fireTableRowsInserted(b1, b1);
      this.ZM.Zb(i + 1);
      this.Zx.notifyAll();
    } 
    Zd();
  }
  
  synchronized void Zd() {
    Zbqc[] arrayOfZbqc = Zb();
    while (this.Zu < this.ZM.ZO()) {
      this.Za.Zx(new Zrza(this));
      this.Zu++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  boolean ZU() {
    try {
      if (this.ZA == 3)
        return false; 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    try {
      Zd();
      if (this.Zu > this.ZM.ZO()) {
        this.Zu--;
        return false;
      } 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    ZT();
    Ztvb ztvb = null;
    synchronized (this.Zx) {
      if (this.ZA == 1)
        ztvb = ZO(); 
      if (ztvb == null) {
        try {
          this.Zx.wait();
        } catch (InterruptedException interruptedException) {
          Zah.Zl(interruptedException, Zk_.IGNORED);
        } 
        return true;
      } 
    } 
    ztvb.Zz(this, this.ZM);
    synchronized (this.Zx) {
      int i = this.Zx.indexOf(ztvb);
      try {
        if (i >= 0)
          try {
            if (ztvb.Zm()) {
              this.Zx.remove(ztvb);
              this.ZQ.fireTableRowsDeleted(i, i);
              this.ZM.Zb(this.Zx.size());
            } 
          } catch (InterruptedException interruptedException) {
            throw a(null);
          }  
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  private void Zr(Runnable paramRunnable) {
    synchronized (this.Zv) {
      this.Zv.addLast(paramRunnable);
      synchronized (this.Zx) {
        this.Zx.notifyAll();
      } 
    } 
  }
  
  private void ZT() {
    while (true) {
      Runnable runnable;
      synchronized (this.Zv) {
        if (this.Zv.isEmpty())
          return; 
        runnable = this.Zv.removeFirst();
      } 
      if (runnable != null)
        runnable.run(); 
    } 
  }
  
  void Zm(Ztvb paramZtvb) {
    synchronized (this.Zx) {
      int i = this.Zx.indexOf(paramZtvb);
      if (i >= 0)
        this.ZQ.fireTableRowsUpdated(i, i); 
    } 
  }
  
  private Ztvb ZO() {
    Zbqc[] arrayOfZbqc = Zb();
    for (Ztvb ztvb : this.Zx) {
      if (!ztvb.ZR())
        return ztvb; 
      if (arrayOfZbqc == null)
        break; 
    } 
    return null;
  }
  
  byte Zf() {
    return this.ZA;
  }
  
  Ztnu ZF() {
    return this.ZQ;
  }
  
  void Zi() {
    if (this.ZA == 2)
      synchronized (this.Zx) {
        try {
          this.Zx.wait();
        } catch (InterruptedException interruptedException) {
          Zah.Zl(interruptedException, Zk_.IGNORED);
        } 
      }  
  }
  
  Zmzk Zt() {
    return this.ZJ.Zdz();
  }
  
  Zg3d Zg(Zmzk paramZmzk, byte[] paramArrayOfbyte) throws Zxxv, UnknownHostException {
    Zg3d zg3d = this.ZV.ZV(this.Zf.ZY(paramZmzk, paramArrayOfbyte));
    try {
      if (zg3d.Ze() != null)
        try {
          if (zg3d.Ze().Za().Zpu() != 0)
            return zg3d; 
          throw new Zxxv();
        } catch (Zxxv zxxv) {
          throw a(null);
        }  
    } catch (Zxxv zxxv) {
      throw a(null);
    } 
    throw new Zxxv();
  }
  
  Zskh Zk() {
    return this.Zo;
  }
  
  Zstu Zb(Zlit paramZlit) {
    return this.Zp.Zs().ZO().Zf(paramZlit).Zr();
  }
  
  Zrc5 ZC(String paramString) {
    Zrc5 zrc5;
    synchronized (this.ZH) {
      zrc5 = this.ZH.get(paramString);
      if (zrc5 == null) {
        zrc5 = new Zrc5(this.ZV, this.Zn, this.Zp);
        this.ZH.put(paramString, zrc5);
      } 
    } 
    return zrc5;
  }
  
  byte ZD(Zlit paramZlit, Zs68 paramZs68, Zstu paramZstu) {
    byte[] arrayOfByte = Zmg3.ZU(paramZlit).ZdH();
    String str = paramZlit.Zd_();
    return ZC(Zkb.ZG(arrayOfByte)).ZI((byte)0, arrayOfByte, Zdo.ZQ, (str == null) ? null : Zkb.Zy(str), paramZlit, paramZs68, paramZstu);
  }
  
  boolean Zz() {
    switch (this.ZK) {
      case 0:
      case 2:
        return false;
      case 1:
        return true;
    } 
    Zuh.Zv(false, Zqf.Zk, this.ZK);
    return false;
  }
  
  void Zr(byte paramByte) {
    this.ZK = paramByte;
  }
  
  void Zv(Zlit paramZlit, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zz1p paramZz1p, Zs68 paramZs68, short paramShort) {
    Zez3 zez3 = ZW(this.Zj, paramZlit, paramArrayOfbyte1, paramArrayOfbyte2, paramZz1p, paramZs68, paramShort);
    if (this.ZM.ZU()) {
      Zmxt zmxt = this.ZU.Zf(paramZlit);
      Zs73 zs73 = null;
      if (zmxt != null)
        zs73 = zmxt.Zq7(); 
      if (zmxt == null || zs73.ZTU() != 2)
        ZW(this.ZU, paramZlit, paramArrayOfbyte1, paramArrayOfbyte2, paramZz1p, paramZs68, paramShort); 
    } 
    Zb(zez3);
  }
  
  private Zez3 ZW(Ztdi paramZtdi, Zlit paramZlit, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zz1p paramZz1p, Zs68 paramZs68, short paramShort) {
    Zez3 zez3 = paramZtdi.Zq(paramZlit, paramShort);
    (new Zsir()).Zp(this.Zm.ZZ(paramArrayOfbyte1), paramZz1p.Zb).ZV(this.Zm.ZZ(paramArrayOfbyte2), paramArrayOfbyte2.length, paramZs68.Zb, paramZs68.ZH.Zj, Zsir.ZO(paramZs68), System.currentTimeMillis()).ZZ((byte)2, (byte)1).Zd(zez3);
    paramZtdi.ZR(zez3);
    return zez3;
  }
  
  private void Zb(Zez3 paramZez3) {
    if (!this.ZM.ZA())
      return; 
    Zs73 zs73 = (new Ztgc(paramZez3)).ZE();
    this.ZI.Zq().ZP(new Zzig(paramZez3.Zod(), paramZez3.Zos(), paramZez3.ZoO(), zs73.ZTF(), true));
  }
  
  boolean ZL(Zlit paramZlit) {
    return (this.Zj.Zf(paramZlit) != null);
  }
  
  boolean Zx(Zlit paramZlit) {
    byte[] arrayOfByte = new byte[(paramZlit.ZdH()).length - 1];
    System.arraycopy(paramZlit.ZdH(), 0, arrayOfByte, 0, arrayOfByte.length);
    paramZlit = new Zax(paramZlit.Zdz(), arrayOfByte);
    return (this.Zj.ZU(paramZlit) != null);
  }
  
  private synchronized void Zt(String paramString) {
    if (Zz())
      paramString = paramString.toLowerCase(); 
    if (paramString.equals("/"))
      return; 
    if (this.Ze.contains(paramString))
      return; 
    this.Ze.add(paramString);
    this.Ze.sort(Ze8r.ZP);
  }
  
  private synchronized void Zg(String paramString) {
    if (Zz())
      paramString = paramString.toLowerCase(); 
    if (this.Zz.contains(paramString))
      return; 
    if (this.ZM.Zd().contains(paramString))
      return; 
    if (this.ZM.Zh().contains(paramString))
      return; 
    this.Zz.add(paramString);
    this.Zz.sort(Ze8r.ZP);
  }
  
  void ZN() {
    this.ZA = 3;
    this.ZM.ZB(this.ZA);
    this.Za.Zx(this::lambda$exitSession$3);
    this.ZH.clear();
    this.Ze.clear();
    this.Zz.clear();
    this.ZN.clear();
    this.Zh.clear();
  }
  
  private synchronized void ZV(Zlit paramZlit) {
    Zbqc[] arrayOfZbqc = Zb();
    try {
      if (this.ZK != 0)
        return; 
    } catch (UnknownHostException unknownHostException) {
      throw a(null);
    } 
    try {
      Zax zax = new Zax(paramZlit.Zdz(), Zkb.Zy(Zsw8.Zz(Zkb.ZG(paramZlit.ZdH()))));
      byte[] arrayOfByte = Zb(zax).ZiD();
      Zg3d zg3d = Zg(paramZlit.Zdz(), arrayOfByte);
      Zyf zyf = Zyf.Zy(arrayOfByte);
      try {
      
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
      Zstu zstu = (zg3d.Ze() == null) ? Zyf.ZQm() : zg3d.Ze().Za();
      Zz1p zz1p = Zghc.ZY(paramZlit.Zdz(), zyf, (byte)1, this.Zn);
      Zs68 zs68 = Zbwc.ZS(zz1p, zstu, Zt0k.HTML_ANALYSIS, this.Zn);
      byte b = ZD(zz1p.Zo, zs68, zstu);
      try {
        if (b == 1) {
          try {
            this.ZK = 1;
            if (arrayOfZbqc == null)
              try {
                if (b == 2)
                  this.ZK = 2; 
              } catch (UnknownHostException unknownHostException) {
                throw a(null);
              }  
          } catch (UnknownHostException unknownHostException) {
            throw a(null);
          } 
          return;
        } 
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
      try {
        if (b == 2)
          this.ZK = 2; 
      } catch (UnknownHostException unknownHostException) {
        throw a(null);
      } 
    } catch (UnknownHostException|Zxxv unknownHostException) {
      Zah.Zl(unknownHostException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private int Zf(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = arrayOfByte.length;
    Zbqc[] arrayOfZbqc = Zb();
    byte b2 = 0;
    while (b2 < i) {
      byte b = arrayOfByte[b2];
      if (Character.isLetter((char)b))
        b1++; 
      b2++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return b1;
  }
  
  private void Zh(byte paramByte, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, short paramShort) {
    Zbqc[] arrayOfZbqc = Zb();
    int i = 0;
    while (i < paramArrayOfbyte3.length) {
      while (i < paramArrayOfbyte3.length && (paramArrayOfbyte3[i] < 48 || paramArrayOfbyte3[i] > 57)) {
        i++;
        if (arrayOfZbqc == null)
          break; 
      } 
      if (i >= paramArrayOfbyte3.length)
        break; 
      int j = i + 1;
      while (j < paramArrayOfbyte3.length && paramArrayOfbyte3[j] >= 48 && paramArrayOfbyte3[j] <= 57) {
        j++;
        if (arrayOfZbqc == null)
          break; 
      } 
      if (j - i > 8)
        i = j - 8; 
      Zs(new Zlf5((byte)6, paramByte, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3, paramArrayOfbyte4, paramArrayOfbyte5, i, j, paramShort, this.Zn));
      i = j + 1;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void ZG(Zmxt paramZmxt, short paramShort) {
    // Byte code:
    //   0: invokestatic Zb : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: invokeinterface Zkb : ()Ljava/lang/String;
    //   10: astore #4
    //   12: ldc '/'
    //   14: aload #4
    //   16: invokevirtual equals : (Ljava/lang/Object;)Z
    //   19: ifeq -> 142
    //   22: aload_0
    //   23: getfield ZM : Lburp/Zzv5;
    //   26: invokeinterface ZS : ()Z
    //   31: ifeq -> 261
    //   34: aload_1
    //   35: invokeinterface ZkJ : ()Lburp/Zez3;
    //   40: invokestatic Zq : (Lburp/Zez3;)Z
    //   43: ifne -> 47
    //   46: return
    //   47: aload_1
    //   48: invokeinterface ZlL : ()Lburp/Zlit;
    //   53: invokestatic ZU : (Lburp/Zlit;)Lburp/Zlit;
    //   56: astore #5
    //   58: aload_0
    //   59: getfield ZM : Lburp/Zzv5;
    //   62: aload #5
    //   64: iload_2
    //   65: invokeinterface ZQ : (Lburp/Zlit;S)Z
    //   70: ifne -> 74
    //   73: return
    //   74: aload_0
    //   75: iconst_1
    //   76: aload #5
    //   78: invokeinterface ZdH : ()[B
    //   83: aload_0
    //   84: getfield ZM : Lburp/Zzv5;
    //   87: invokeinterface Zb : ()[B
    //   92: aload_1
    //   93: invokeinterface ZkJ : ()Lburp/Zez3;
    //   98: invokeinterface Zkb : ()Ljava/lang/String;
    //   103: invokestatic Zy : (Ljava/lang/String;)[B
    //   106: aconst_null
    //   107: aload_1
    //   108: invokeinterface ZkJ : ()Lburp/Zez3;
    //   113: invokeinterface Zkb : ()Ljava/lang/String;
    //   118: invokestatic Zy : (Ljava/lang/String;)[B
    //   121: aload_1
    //   122: invokeinterface Zq7 : ()Lburp/Zs73;
    //   127: invokeinterface ZTF : ()S
    //   132: iconst_1
    //   133: iadd
    //   134: i2s
    //   135: invokevirtual Zh : (B[B[B[B[B[BS)V
    //   138: aload_3
    //   139: ifnonnull -> 261
    //   142: aload_0
    //   143: getfield ZM : Lburp/Zzv5;
    //   146: invokeinterface ZL : ()Z
    //   151: ifeq -> 261
    //   154: aconst_null
    //   155: astore #6
    //   157: aload #4
    //   159: bipush #46
    //   161: invokevirtual indexOf : (I)I
    //   164: istore #7
    //   166: iload #7
    //   168: iconst_m1
    //   169: if_icmpne -> 183
    //   172: aload #4
    //   174: invokestatic Zy : (Ljava/lang/String;)[B
    //   177: astore #5
    //   179: aload_3
    //   180: ifnonnull -> 210
    //   183: aload #4
    //   185: iconst_0
    //   186: iload #7
    //   188: invokevirtual substring : (II)Ljava/lang/String;
    //   191: invokestatic Zy : (Ljava/lang/String;)[B
    //   194: astore #5
    //   196: aload #4
    //   198: iload #7
    //   200: iconst_1
    //   201: iadd
    //   202: invokevirtual substring : (I)Ljava/lang/String;
    //   205: invokestatic Zy : (Ljava/lang/String;)[B
    //   208: astore #6
    //   210: aload_0
    //   211: iconst_0
    //   212: aload_1
    //   213: invokeinterface ZlL : ()Lburp/Zlit;
    //   218: invokestatic ZU : (Lburp/Zlit;)Lburp/Zlit;
    //   221: invokeinterface ZdH : ()[B
    //   226: aload_0
    //   227: getfield ZM : Lburp/Zzv5;
    //   230: invokeinterface Zb : ()[B
    //   235: aload #5
    //   237: aload #6
    //   239: aload #4
    //   241: invokestatic Zy : (Ljava/lang/String;)[B
    //   244: aload_1
    //   245: invokeinterface Zq7 : ()Lburp/Zs73;
    //   250: invokeinterface ZTF : ()S
    //   255: iconst_1
    //   256: iadd
    //   257: i2s
    //   258: invokevirtual Zh : (B[B[B[B[B[BS)V
    //   261: return
  }
  
  private void ZF(Zmxt paramZmxt) {
    // Byte code:
    //   0: invokestatic Zb : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zkb : ()Ljava/lang/String;
    //   10: astore_3
    //   11: ldc '/'
    //   13: aload_3
    //   14: invokevirtual equals : (Ljava/lang/Object;)Z
    //   17: ifeq -> 21
    //   20: return
    //   21: aconst_null
    //   22: astore #5
    //   24: aload_3
    //   25: bipush #46
    //   27: invokevirtual lastIndexOf : (I)I
    //   30: istore #6
    //   32: iload #6
    //   34: iconst_m1
    //   35: if_icmpne -> 48
    //   38: aload_3
    //   39: invokestatic Zy : (Ljava/lang/String;)[B
    //   42: astore #4
    //   44: aload_2
    //   45: ifnonnull -> 87
    //   48: aload_3
    //   49: bipush #46
    //   51: iload #6
    //   53: iconst_1
    //   54: isub
    //   55: invokevirtual lastIndexOf : (II)I
    //   58: iflt -> 62
    //   61: return
    //   62: aload_3
    //   63: iconst_0
    //   64: iload #6
    //   66: invokevirtual substring : (II)Ljava/lang/String;
    //   69: invokestatic Zy : (Ljava/lang/String;)[B
    //   72: astore #4
    //   74: aload_3
    //   75: iload #6
    //   77: iconst_1
    //   78: iadd
    //   79: invokevirtual substring : (I)Ljava/lang/String;
    //   82: invokestatic Zy : (Ljava/lang/String;)[B
    //   85: astore #5
    //   87: aload_0
    //   88: new burp/Zlfy
    //   91: dup
    //   92: bipush #6
    //   94: iconst_0
    //   95: aload_1
    //   96: invokeinterface ZlL : ()Lburp/Zlit;
    //   101: invokestatic ZU : (Lburp/Zlit;)Lburp/Zlit;
    //   104: invokeinterface ZdH : ()[B
    //   109: aload_0
    //   110: getfield ZM : Lburp/Zzv5;
    //   113: invokeinterface Zb : ()[B
    //   118: aload #4
    //   120: aload #5
    //   122: aload_3
    //   123: invokestatic Zy : (Ljava/lang/String;)[B
    //   126: new burp/Zxk_
    //   129: dup
    //   130: aload_0
    //   131: getfield ZM : Lburp/Zzv5;
    //   134: invokeinterface ZG : ()Ljava/util/List;
    //   139: invokespecial <init> : (Ljava/util/List;)V
    //   142: aload_1
    //   143: invokeinterface Zq7 : ()Lburp/Zs73;
    //   148: invokeinterface ZTF : ()S
    //   153: iconst_1
    //   154: iadd
    //   155: i2s
    //   156: aload_0
    //   157: getfield Zn : Lburp/Zbnt;
    //   160: invokespecial <init> : (BB[B[B[B[B[BLburp/Zlf8;SLburp/Zbnt;)V
    //   163: invokevirtual Zs : (Lburp/Ztvb;)V
    //   166: return
  }
  
  private void ZG(byte[] paramArrayOfbyte, short paramShort) {
    if (this.ZM.ZL() && this.ZM.ZY() && this.ZM.Zt()) {
      Zljo zljo = new Zljo((byte)0, (byte)0, new Zxk_(this.Ze), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.ZY() && this.ZM.ZI()) {
      Zljo zljo = new Zljo((byte)1, (byte)0, new Zxk_(this.Ze), this.ZM.Zh(), paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.ZW() && this.ZM.Zt()) {
      Zljo zljo = new Zljo((byte)2, (byte)0, new Zxkn(this.ZM.ZX()), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.ZW() && this.ZM.ZI()) {
      Zljo zljo = new Zljo((byte)3, (byte)0, new Zxkn(this.ZM.ZX()), this.ZM.Zh(), paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.Z_() && this.ZM.Zt()) {
      Zljo zljo = new Zljo((byte)4, (byte)0, new Zxkw((byte)0), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.Z_() && this.ZM.ZI()) {
      Zljo zljo = new Zljo((byte)5, (byte)0, new Zxkw((byte)0), this.ZM.Zh(), paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.ZY() && this.ZM.Zz()) {
      Zljo zljo = new Zljo((byte)7, (byte)0, new Zxk_(this.Ze), this.Zz, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.Za() && this.ZM.Zt()) {
      Zljo zljo = new Zljo((byte)8, (byte)0, new Zxkw((byte)1), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.Za() && this.ZM.ZI()) {
      Zljo zljo = new Zljo((byte)9, (byte)0, new Zxkw((byte)1), this.ZM.Zh(), paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.ZW() && this.ZM.Zz()) {
      Zljo zljo = new Zljo((byte)10, (byte)0, new Zxkn(this.ZM.ZX()), this.Zz, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.Z_() && this.ZM.Zz()) {
      Zljo zljo = new Zljo((byte)11, (byte)0, new Zxkw((byte)0), this.Zz, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZL() && this.ZM.Za() && this.ZM.Zz()) {
      Zljo zljo = new Zljo((byte)12, (byte)0, new Zxkw((byte)1), this.Zz, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZS() && this.ZM.ZY()) {
      Zljo zljo = new Zljo((byte)1, (byte)1, new Zxk_(this.Ze), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZS() && this.ZM.ZV()) {
      Zljo zljo = new Zljo((byte)3, (byte)1, new Zxkn(this.ZM.Zj()), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZS() && this.ZM.ZZ()) {
      Zljo zljo = new Zljo((byte)5, (byte)1, new Zxkw((byte)2), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
    if (this.ZM.ZS() && this.ZM.ZN()) {
      Zljo zljo = new Zljo((byte)9, (byte)1, new Zxkw((byte)3), null, paramArrayOfbyte, this.ZM.Zb(), paramShort, this.Zn);
      Zs(zljo);
    } 
  }
  
  private void lambda$exitSession$3() {
    synchronized (this.Zx) {
      this.Zx.notifyAll();
    } 
    this.ZX.ZO();
    this.Zj.Zf();
  }
  
  private void lambda$start$2(Zlit paramZlit) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zj : Lburp/Ztdi;
    //   4: aload_1
    //   5: iconst_0
    //   6: invokeinterface Zq : (Lburp/Zlit;S)Lburp/Zez3;
    //   11: astore_3
    //   12: aload_0
    //   13: getfield Zj : Lburp/Ztdi;
    //   16: aload_3
    //   17: invokeinterface ZR : (Lburp/Zez3;)V
    //   22: invokestatic Zb : ()[Lburp/Zbqc;
    //   25: aload_0
    //   26: getfield ZI : Lburp/Zt2t;
    //   29: aload_3
    //   30: invokevirtual Zh : (Lburp/Zez3;)V
    //   33: astore_2
    //   34: aload_0
    //   35: getfield ZM : Lburp/Zzv5;
    //   38: invokeinterface Zi : ()Z
    //   43: ifeq -> 81
    //   46: aload_0
    //   47: getfield ZU : Lburp/Ztdi;
    //   50: aload_1
    //   51: invokeinterface Zdz : ()Lburp/Zmzk;
    //   56: invokeinterface Zz : (Lburp/Zmzk;)Lburp/Zzhb;
    //   61: astore #4
    //   63: aload #4
    //   65: ifnull -> 81
    //   68: aload_0
    //   69: aload #4
    //   71: invokevirtual ZL : (Lburp/Zez3;)V
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: getfield ZM : Lburp/Zzv5;
    //   85: invokeinterface Zi : ()Z
    //   90: ifeq -> 247
    //   93: aload_1
    //   94: invokeinterface ZdH : ()[B
    //   99: arraylength
    //   100: iconst_1
    //   101: if_icmpne -> 152
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload_1
    //   112: invokeinterface ZdH : ()[B
    //   117: iconst_0
    //   118: baload
    //   119: bipush #47
    //   121: if_icmpne -> 152
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: aload_0
    //   132: getfield ZU : Lburp/Ztdi;
    //   135: aload_1
    //   136: invokeinterface Zdz : ()Lburp/Zmzk;
    //   141: invokeinterface Zz : (Lburp/Zmzk;)Lburp/Zzhb;
    //   146: astore #4
    //   148: aload_2
    //   149: ifnonnull -> 207
    //   152: aload_1
    //   153: invokeinterface ZdH : ()[B
    //   158: arraylength
    //   159: iconst_1
    //   160: isub
    //   161: newarray byte
    //   163: astore #5
    //   165: aload_1
    //   166: invokeinterface ZdH : ()[B
    //   171: iconst_0
    //   172: aload #5
    //   174: iconst_0
    //   175: aload #5
    //   177: arraylength
    //   178: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   181: aload_0
    //   182: getfield ZU : Lburp/Ztdi;
    //   185: new burp/Zax
    //   188: dup
    //   189: aload_1
    //   190: invokeinterface Zdz : ()Lburp/Zmzk;
    //   195: aload #5
    //   197: invokespecial <init> : (Lburp/Zmzk;[B)V
    //   200: invokeinterface ZU : (Lburp/Zlit;)Lburp/Zrtx;
    //   205: astore #4
    //   207: aload #4
    //   209: ifnull -> 247
    //   212: aload_0
    //   213: aload #4
    //   215: aload_0
    //   216: getfield ZM : Lburp/Zzv5;
    //   219: invokeinterface Zy : ()Z
    //   224: ifeq -> 243
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: ldc 2147483647
    //   236: goto -> 244
    //   239: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   242: athrow
    //   243: iconst_1
    //   244: invokevirtual Zc : (Lburp/Zez3;I)V
    //   247: aload_0
    //   248: getfield ZN : Ljava/util/Set;
    //   251: aload_1
    //   252: invokeinterface add : (Ljava/lang/Object;)Z
    //   257: pop
    //   258: aload_0
    //   259: aload_1
    //   260: invokeinterface ZdH : ()[B
    //   265: iconst_0
    //   266: invokevirtual ZG : ([BS)V
    //   269: goto -> 282
    //   272: astore #4
    //   274: aload #4
    //   276: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   279: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   282: return
    // Exception table:
    //   from	to	target	type
    //   63	74	77	java/lang/Exception
    //   81	104	107	java/lang/Exception
    //   93	124	127	java/lang/Exception
    //   207	227	230	java/lang/Exception
    //   212	239	239	java/lang/Exception
    //   247	269	272	java/lang/Exception
  }
  
  private void lambda$new$1(Ztdi paramZtdi) {
    (new Zzh_(this)).Zp(this.Zj.Zk());
    this.ZX.ZB(paramZtdi.Zk());
  }
  
  private static Zgvn lambda$new$0(Zgvn paramZgvn) {
    return paramZgvn;
  }
  
  public static void ZD(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zb() {
    return Zi;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    if (Zb() == null)
      ZD(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm82.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */