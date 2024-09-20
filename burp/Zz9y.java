package burp;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zrzt;
import net.portswigger.Zuh;

public class Zz9y implements Zsw, Runnable, Zmt {
  final Zlil Zn;
  
  private final Zxzh ZO;
  
  private final Zlr9 Zw;
  
  private final Zrxw ZL;
  
  private final Zbnt Zb;
  
  private final Zey9 ZM;
  
  private final Zr_4 ZT;
  
  private final Zrgd ZW;
  
  private Zz9e ZS;
  
  private Zear ZQ;
  
  private Zkg1 Zm;
  
  private final List<Zkg1> ZB = new ArrayList<>();
  
  private volatile boolean Zk;
  
  private Zsxd ZY;
  
  boolean ZH;
  
  boolean Ze;
  
  boolean ZU;
  
  public Zz9y(Zlil paramZlil, Zxzh paramZxzh, Zlr9 paramZlr9, Zrxw paramZrxw, Zbnt paramZbnt, Zey9 paramZey9, Zr_4 paramZr_4, Zrgd paramZrgd) {
    this.Zn = paramZlil;
    this.ZO = paramZxzh;
    this.Zw = paramZlr9;
    this.ZL = paramZrxw;
    this.Zb = paramZbnt;
    this.ZM = paramZey9;
    this.ZT = paramZr_4;
    this.ZW = paramZrgd;
  }
  
  public void Zj(Zear paramZear) {
    this.ZQ = paramZear;
  }
  
  public List<Zkg1> ZQ() {
    return this.ZB;
  }
  
  public Zsxd Zc() {
    return this.ZY;
  }
  
  void ZC() {
    this.Zk = true;
  }
  
  public void run() {
    String[] arrayOfString = Zlil.Za();
    try {
      this.ZS = this.Zw.Zm(this);
      byte b = 0;
      while (b < this.Zn.Ze()) {
        if (this.Zk)
          return; 
        try {
          if (b > 0)
            this.ZQ = null; 
        } catch (Exception exception) {
          throw a(null);
        } 
        Ztpb ztpb = this.Zn.ZX(b);
        this.Zm = new Zkg1(ztpb, Zgsq.HIDDEN);
        this.ZB.add(this.Zm);
        Zmzk zmzk = ztpb.ZP().Zdz();
        try {
          this.Zm.Zx = ztpb.Zp();
          Zw();
          if (ztpb.Zt())
            try {
              if (ztpb.ZP() != null)
                ZI(zmzk, ztpb.ZP().Zd4()); 
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
        for (Zmfi zmfi : ztpb.Zs()) {
          Zz1p zz1p1 = Zghc.ZY(zmzk, this.Zm.Zx, (byte)3, this.Zb);
          String str = Zo(zmfi, zz1p1);
          Zz(zmfi, zz1p1, str);
          if (arrayOfString == null)
            break; 
        } 
        Zz1p zz1p = Zghc.ZY(zmzk, this.Zm.Zx, (byte)1, this.Zb);
        this.Zm.ZC = zz1p.Zo;
        Zv();
        Zt(zmzk);
        ZV();
        b++;
        if (arrayOfString == null)
          break; 
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    this.ZH = true;
    Zj();
  }
  
  private String Zo(Zmfi paramZmfi, Zz1p paramZz1p) {
    null = null;
    switch (ZK(paramZmfi)) {
      case 0:
        return ZU(paramZmfi, paramZz1p);
      case 1:
        return paramZmfi.ZlX();
    } 
    Zuh.Zv(false, Zqf.Zk, ZK(paramZmfi));
    return (String)SYNTHETIC_LOCAL_VARIABLE_3;
  }
  
  private byte ZK(Zmfi paramZmfi) {
    byte b = paramZmfi.ZlJ();
    if (this.ZQ != null && this.ZQ.ZR(paramZmfi.Zla().Zns()))
      b = 0; 
    return b;
  }
  
  private String ZU(Zmfi paramZmfi, Zz1p paramZz1p) {
    String str = null;
    Zkg1 zkg1 = null;
    if (this.ZQ != null) {
      zkg1 = new Zkg1(null, Zgsq.HIDDEN);
      zkg1.Zx = this.ZQ.ZI();
      zkg1.ZC = this.ZQ.Zq();
      zkg1.Za = this.ZQ.Zi();
      zkg1.ZP = this.ZQ.Zb();
    } else if (paramZmfi.ZlN() >= 0 && paramZmfi.ZlN() < this.ZB.size()) {
      zkg1 = this.ZB.get(paramZmfi.ZlN());
    } 
    if (zkg1 != null && zkg1.Za != null)
      str = Zks.ZN(zkg1.Zx.ZiD(), zkg1.ZC, zkg1.Za.ZiD(), zkg1.ZP, paramZz1p.Zb, paramZz1p.Zo, (zkg1.ZL == null) ? null : zkg1.ZL.Zh(), paramZmfi.Zla().Zns(), paramZmfi.Zla().ZbQ(), false, this.Zb, this.ZT); 
    if (str == null)
      this.ZU = true; 
    return str;
  }
  
  private void Zz(Zmfi paramZmfi, Zz1p paramZz1p, String paramString) {
    boolean bool = false;
    if (paramString != null) {
      if ((((paramZmfi.ZlJ() == 0) ? 1 : 0) & paramZmfi.Zla().ZbQ().Za()) != 0)
        paramString = Zrzt.Zk(paramString); 
      byte[] arrayOfByte1 = this.Zm.Zx.ZiD();
      byte[] arrayOfByte2 = Zljl.Zn(arrayOfByte1, paramZz1p, paramZmfi.Zla().Zns(), paramString, true, false, paramZmfi.Zla().ZbQ(), null);
      if (arrayOfByte1 != arrayOfByte2) {
        this.Zm.Zx = Zyf.Zy(arrayOfByte2);
        bool = true;
      } 
    } 
    if (ZK(paramZmfi) == 0 && bool)
      Z_(paramZmfi, paramString); 
  }
  
  private void Zt(Zmzk paramZmzk) throws UnknownHostException {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Lburp/Zkg1;
    //   4: getfield Zx : Lburp/Zstu;
    //   7: invokeinterface ZiD : ()[B
    //   12: astore_3
    //   13: invokestatic Za : ()[Ljava/lang/String;
    //   16: aload_0
    //   17: aload_0
    //   18: getfield ZS : Lburp/Zz9e;
    //   21: aload_0
    //   22: getfield ZM : Lburp/Zey9;
    //   25: aload_1
    //   26: aload_3
    //   27: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   30: invokeinterface Zx : (Lburp/Zefx;)Lburp/Zsxd;
    //   35: putfield ZY : Lburp/Zsxd;
    //   38: astore_2
    //   39: aload_0
    //   40: getfield ZY : Lburp/Zsxd;
    //   43: invokeinterface ZG : ()Lburp/Zg3d;
    //   48: invokeinterface Ze : ()Lburp/Zb6q;
    //   53: astore #4
    //   55: aload_0
    //   56: getfield Zm : Lburp/Zkg1;
    //   59: aload #4
    //   61: ifnonnull -> 72
    //   64: aconst_null
    //   65: goto -> 79
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload #4
    //   74: invokeinterface Za : ()Lburp/Zstu;
    //   79: putfield Za : Lburp/Zstu;
    //   82: aload_0
    //   83: getfield ZY : Lburp/Zsxd;
    //   86: invokeinterface ZG : ()Lburp/Zg3d;
    //   91: invokeinterface Zx : ()Ljava/lang/Exception;
    //   96: instanceof java/net/UnknownHostException
    //   99: ifeq -> 124
    //   102: aload_0
    //   103: getfield ZY : Lburp/Zsxd;
    //   106: invokeinterface ZG : ()Lburp/Zg3d;
    //   111: invokeinterface Zx : ()Ljava/lang/Exception;
    //   116: checkcast java/net/UnknownHostException
    //   119: athrow
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload_0
    //   125: getfield ZY : Lburp/Zsxd;
    //   128: invokeinterface ZG : ()Lburp/Zg3d;
    //   133: invokeinterface Zb : ()Lburp/Zvom;
    //   138: getstatic burp/Zvom.STREAMING_RESPONSE : Lburp/Zvom;
    //   141: if_acmpne -> 165
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield ZY : Lburp/Zsxd;
    //   149: aload_0
    //   150: iconst_1
    //   151: putfield Ze : Z
    //   154: aload_2
    //   155: ifnonnull -> 258
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   164: athrow
    //   165: aload_0
    //   166: getfield Zm : Lburp/Zkg1;
    //   169: getfield Za : Lburp/Zstu;
    //   172: ifnull -> 204
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: aload_0
    //   183: getfield Zm : Lburp/Zkg1;
    //   186: getfield Za : Lburp/Zstu;
    //   189: invokeinterface Zpu : ()I
    //   194: ifne -> 220
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: aload_0
    //   205: iconst_1
    //   206: putfield Ze : Z
    //   209: aload_2
    //   210: ifnonnull -> 258
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: aload_0
    //   221: getfield Zm : Lburp/Zkg1;
    //   224: aload_0
    //   225: getfield Zm : Lburp/Zkg1;
    //   228: getfield ZC : Lburp/Zlit;
    //   231: aload_0
    //   232: getfield Zm : Lburp/Zkg1;
    //   235: getfield Za : Lburp/Zstu;
    //   238: getstatic burp/Zt0k.HTML_ANALYSIS : Lburp/Zt0k;
    //   241: aload_0
    //   242: getfield Zb : Lburp/Zbnt;
    //   245: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   248: putfield ZP : Lburp/Zs68;
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   257: athrow
    //   258: return
    // Exception table:
    //   from	to	target	type
    //   55	68	68	java/net/UnknownHostException
    //   79	120	120	java/net/UnknownHostException
    //   124	158	161	java/net/UnknownHostException
    //   144	175	178	java/net/UnknownHostException
    //   165	197	200	java/net/UnknownHostException
    //   182	213	216	java/net/UnknownHostException
    //   204	251	254	java/net/UnknownHostException
  }
  
  private void ZI(Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZO : Lburp/Zxzh;
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual ZT : (Lburp/Zmzk;[B)Ljava/util/List;
    //   9: astore #4
    //   11: invokestatic Za : ()[Ljava/lang/String;
    //   14: new java/util/ArrayList
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #5
    //   23: astore_3
    //   24: aload #4
    //   26: invokeinterface isEmpty : ()Z
    //   31: ifne -> 230
    //   34: aload #4
    //   36: invokeinterface iterator : ()Ljava/util/Iterator;
    //   41: astore #6
    //   43: aload #6
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 224
    //   53: aload #6
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Ztbr
    //   63: astore #7
    //   65: aload_1
    //   66: aload_0
    //   67: getfield Zm : Lburp/Zkg1;
    //   70: getfield Zx : Lburp/Zstu;
    //   73: iconst_3
    //   74: aload_0
    //   75: getfield Zb : Lburp/Zbnt;
    //   78: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   81: astore #8
    //   83: aload_0
    //   84: getfield Zm : Lburp/Zkg1;
    //   87: getfield Zx : Lburp/Zstu;
    //   90: invokeinterface ZiD : ()[B
    //   95: astore #9
    //   97: aload #7
    //   99: invokeinterface ZqU : ()Ljava/util/Date;
    //   104: ifnull -> 155
    //   107: aload #7
    //   109: invokeinterface ZqU : ()Ljava/util/Date;
    //   114: invokevirtual getTime : ()J
    //   117: aload_0
    //   118: getfield ZW : Lburp/Zrgd;
    //   121: invokevirtual ZX : ()J
    //   124: getstatic burp/Zs1b.ZF : J
    //   127: lsub
    //   128: lcmp
    //   129: ifge -> 155
    //   132: aload #9
    //   134: aload #8
    //   136: aload #7
    //   138: invokeinterface Zqy : ()Ljava/lang/String;
    //   143: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   146: invokestatic ZQ : ([BLburp/Zz1p;Ljava/lang/String;Lburp/Zrdu;)[B
    //   149: astore #10
    //   151: aload_3
    //   152: ifnonnull -> 184
    //   155: aload #9
    //   157: aload #8
    //   159: aload #7
    //   161: invokeinterface Zqy : ()Ljava/lang/String;
    //   166: aload #7
    //   168: invokeinterface Zq0 : ()Ljava/lang/String;
    //   173: iconst_1
    //   174: iconst_1
    //   175: getstatic burp/Zrdu.COOKIE : Lburp/Zrdu;
    //   178: aconst_null
    //   179: invokestatic Zn : ([BLburp/Zz1p;Ljava/lang/String;Ljava/lang/String;ZZLburp/Zrdu;[I)[B
    //   182: astore #10
    //   184: aload #9
    //   186: aload #10
    //   188: if_acmpeq -> 220
    //   191: aload_0
    //   192: getfield Zm : Lburp/Zkg1;
    //   195: aload #10
    //   197: invokestatic Zy : ([B)Lburp/Zyf;
    //   200: putfield Zx : Lburp/Zstu;
    //   203: aload_0
    //   204: getfield ZL : Lburp/Zrxw;
    //   207: ifnull -> 220
    //   210: aload #5
    //   212: aload #7
    //   214: invokeinterface add : (Ljava/lang/Object;)Z
    //   219: pop
    //   220: aload_3
    //   221: ifnonnull -> 43
    //   224: aload_0
    //   225: aload #5
    //   227: invokevirtual Zd : (Ljava/util/List;)V
    //   230: return
  }
  
  private void Zw() {
    if (this.ZL != null)
      this.ZL.Ze(this, this.Zm); 
  }
  
  private void Zd(List<Ztbr> paramList) {
    if (this.ZL != null)
      this.ZL.Zs(this, this.Zm, paramList); 
  }
  
  private void Z_(Zmfi paramZmfi, String paramString) {
    if (this.ZL != null)
      this.ZL.Zj(this, this.Zm, paramZmfi, paramString); 
  }
  
  private void Zv() {
    if (this.ZL != null)
      this.ZL.ZJ(this, this.Zm); 
  }
  
  private void ZV() {
    if (this.ZL != null)
      this.ZL.ZA(this, this.Zm); 
  }
  
  private void Zj() {
    if (this.ZL != null)
      this.ZL.Z_(this); 
  }
  
  public void ZO(Zeew paramZeew, Zefx paramZefx) {}
  
  public void Zv(Zeew paramZeew, Zmzk paramZmzk, List<String> paramList) {
    if (!this.Zm.ZL.Zn())
      return; 
    List<Ztbr> list = Zth6.Z_(paramZmzk, paramList, null);
    if (list != null && !list.isEmpty()) {
      this.ZO.ZG(list, paramZmzk, false);
      if (this.ZL != null)
        this.ZL.ZG(this, this.Zm, list); 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */