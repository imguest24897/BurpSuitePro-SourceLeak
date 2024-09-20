package burp;

import java.io.File;
import java.nio.file.Path;
import java.security.Security;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import net.portswigger.Zah;
import net.portswigger.Zf2;
import net.portswigger.Zk_;
import net.portswigger.Zkp;
import net.portswigger.Zl0;
import net.portswigger.Zm2;
import net.portswigger.Zml;
import net.portswigger.Zoy;
import net.portswigger.Zqw;
import net.portswigger.Zs6;
import net.portswigger.Ztg;
import net.portswigger.browser.Zi;

public class Zzw4 implements Zxei, Zzp2 {
  private final long ZD = System.currentTimeMillis();
  
  private final Zz0n Zb;
  
  private final Zgb6 ZI;
  
  private final Zexp ZL;
  
  private final Zkl6 Zs;
  
  private final Zg1j ZE;
  
  private final Zml Ze;
  
  private final Zrb9 ZT;
  
  private final Zt26 ZC;
  
  private final File Z_;
  
  private final Zxpn ZU;
  
  private final Ztwv ZQ;
  
  private final Zs4c Zn;
  
  private final Zzxi ZZ;
  
  private final Zl0 ZV;
  
  private final Ztg4 ZN;
  
  private final Zvo2 ZJ;
  
  private final Zz7x Zx;
  
  private final Zem0 Zr = new Zem0();
  
  private final Zgdu Zc = new Zgdu();
  
  private final Zr18 ZK = new Zr18(250L);
  
  private final Zxts Zf;
  
  private final Zz8a Zh;
  
  private final Zrud ZY;
  
  private final Zr_4 Zp;
  
  private final Zb_l Zq;
  
  private final Zlhg Zm;
  
  private final List<Runnable> ZA = new LinkedList<>();
  
  private final Ztbc Zy;
  
  private final Zbpe Zl;
  
  private Zt4u Zt;
  
  private Zkvo Zd;
  
  private Zkvo ZG;
  
  private Zt90 Zu;
  
  private Zldl ZB;
  
  private Zrk1 ZS;
  
  private Object ZO = null;
  
  private Zmx0 ZH;
  
  private Zkf1 Zk;
  
  private Zmfo ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzw4(Zz0n paramZz0n, Zexp paramZexp) throws Zxcc, Ze0d {
    this.Zb = paramZz0n;
    this.ZL = paramZexp;
    this.ZV = paramZz0n.ZM();
    String[] arrayOfString = Ztom.ZG();
    this.ZZ = paramZz0n.Zr();
    this.ZQ = paramZz0n.Zj();
    this.ZC = new Zt26(this.ZQ);
    this.ZE = new Zg1j(paramZexp);
    this.Zp = new Zruo();
    this.Zl = new Zbpe();
    Zezx zezx = new Zezx(null);
    Zlal zlal = new Zlal(Zskh.Zo, paramZexp, zezx);
    this.Zn = Zs4c.ZC(paramZz0n.Zr().ZM(), zlal);
    this.ZY = new Zrud(paramZexp, this.Zn, this.ZZ.ZB());
    this.Zx = new Zz7w(this.ZV, paramZz0n.ZR(), this.Zn.ZD(new String[] { a(-14415, -3989) }), zlal, this.ZZ.ZA(), ZN());
    Zmp3 zmp3 = Zmp3.Zs();
    Zst3 zst3 = new Zst3(this.ZV, paramZz0n.ZR(), zmp3.Zd(new String[0]));
    try {
      Zz9k.ZT(this.Zx.ZU(), this.Zx.ZT());
      this.Zn.Zs();
      this.Zx.Zt(this.Zn);
      if (this.ZZ.ZM() == Zra1.EXECUTION_MODE_DESKTOP)
        try {
          if (!this.ZZ.ZW())
            Zxaz.Zh(paramZexp); 
        } catch (Zxcc zxcc) {
          throw a(null);
        }  
    } catch (Zxcc zxcc) {
      throw a(null);
    } 
    ZB();
    Ztyx ztyx = new Ztyx(a(-14411, -3575), paramZexp);
    Zk6 zk6 = new Zk6(this);
    zk6.ZF(ztyx.Zb());
    ztyx.ZS(Collections.emptyList());
    this.Z_ = ZH(Zt());
    zk6.ZU();
    this.ZT = new Zrb9(paramZz0n.ZP(), this.ZQ);
    this.ZN = Ztg4.ZI(this, this.ZV, Zskh.Zo);
    Zbnt zbnt = new Zbnt(new Zyu<>(Zmzk.Zj), this.Zp);
    Zrgk zrgk = new Zrgk(zbnt, this.Zp);
    Zlf2 zlf2 = new Zlf2();
    this.ZI = new Zbqx(new Zcf(), new Zbzo(), zlf2, new Zr5v(), null, this.ZV, paramZz0n.ZR(), this.ZZ.ZM());
    this.ZI.Zd(zlf2);
    this.ZI.Zd(zrgk);
    this.ZI.Zd(this.Zc);
    this.Zm = new Zlhg(this.ZI);
    zlf2.ZR(this.Zm);
    Zr0i zr0i = new Zr0i();
    Zkh7 zkh7 = new Zkh7(this.ZI, this.Zp);
    Zey9 zey9 = new Zey9(zbnt);
    this.Zs = new Zgez(this.ZI, this.Zp, zrgk, zbnt, new Ztqf(this.ZI, paramZz0n.ZP(), zr0i, zkh7), zr0i, zkh7, zey9);
    this.Zx.ZY(this.ZI);
    Zl0j zl0j = new Zl0j(this.ZI);
    Zeeh.Ze();
    this.Zq = new Zb_l(paramZz0n, this.Zs, this.ZI);
    this.ZJ = new Zvo2(this, zbnt, this.Zs, this.Zq, this.ZY, zl0j);
    Zzw2 zzw2 = new Zzw2(paramZz0n, this.Zs, this.ZI, this.ZQ);
    Zm1u zm1u = new Zm1u(this.Zs, zzw2);
    Supplier<String> supplier = this::lambda$new$0;
    Zrqx zrqx = new Zrqx(this.ZE, paramZz0n.Zr().ZM(), this.ZY, supplier);
    this.Ze = zrqx.ZW(this.ZI, zm1u, new Zro(this));
    this.Zy = new Ztbc(zbnt, this.Zs, zzw2, this.ZE.ZO());
    Zoy zoy = new Zoy(this.Ze);
    Zm2.Zn(new Zg26((Zf2)zoy, this.ZI));
    Ztg ztg = new Ztg(this.Ze);
    Zkp.ZO(new Zmox((Zqw)ztg, this.ZI));
    this.Zf = new Zxts(paramZz0n.ZR().ZB(), this.ZV);
    this.Zh = new Zz8a(paramZz0n.ZR().ZB(), this.Zf, this.ZV);
    if (ZW() != Zra1.EXECUTION_MODE_ENTERPRISE_SERVER)
      Zj(); 
    try {
      this.ZU = new Zxpn(paramZz0n, this, zlf2, this.Zx, zst3, this.Zr, zrqx, this.ZY, paramZexp, zl0j);
      if (arrayOfString != null)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (Zxcc zxcc) {
      throw a(null);
    } 
  }
  
  public Zra1 ZW() {
    return this.ZZ.ZM();
  }
  
  public boolean Zu() {
    return Zbpe.Zb(ZW(), this.Zb.Zo(), this.Zb.ZN());
  }
  
  private boolean ZN() {
    return (this.ZZ.ZM() == Zra1.EXECUTION_MODE_DESKTOP && !this.ZZ.ZU() && this.ZZ.ZA().isEmpty());
  }
  
  private String Zt() {
    return this.Zx.Zs();
  }
  
  private void ZB() {
    if (!a(-14409, 26045).equals(this.Zx.Zr())) {
      Security.setProperty(a(-14401, 8755), "");
      Security.setProperty(a(-14416, 24681), "");
    } 
    if (a(-14410, 5733).equals(this.Zx.Zx()))
      System.setProperty(a(-14412, -11754), a(-14413, 7783)); 
  }
  
  private void Zj() {
    boolean bool = this.Zl.Zo(this, this.Zs, this.ZQ, this.Zb.ZP(), this.Zb.ZR());
    if (!bool)
      return; 
    Path path = ((Ztg4)Objects.<Ztg4>requireNonNull(this.ZN)).ZH().toPath();
    Zz1q.Za(new Zb8o(Zi.ZC((Zs6)this.Zb.Zc()), this.Zb.ZP(), this.Zs, this.Zl.Zl(), new Zgj8(path)));
  }
  
  public void Zy() throws Ztkd, Zev3, Zxcc, Ze0d {
    Zsux zsux = new Zsux();
    Zra1 zra1 = this.ZZ.ZM();
    Zed8 zed8 = new Zed8(zsux, this.Zq, this.Zs.ZB(), this.Zs.ZH(), this.Zs.ZM(), this.ZI, this.Zp);
    this.Zu = new Zxjo(this, zsux, zed8, zra1);
    this.ZR = new Zmfo(this.Zu, this.Zx, this.ZY, Zu());
    String[] arrayOfString = Ztom.ZG();
    this.ZR.ZN(this.ZI, this.Ze).Zy();
    this.ZH = new Zmx0(this.Zc.ZA());
    this.Zr.Za(Zz8a.class, this.Zh);
    this.ZB = new Zldl(this.Zb.Zc(), this.Zc, zra1, this.Zr, this.ZE, this.Zu, zsux, this.ZK, this.ZH, this.ZQ);
    this.ZB.ZT();
    Zz9q zz9q = new Zz9q(this.ZL, this.Zb.ZP());
    Zsau zsau = Zsau.ZZ(zra1, false, false, this::lambda$start$1, zz9q, this.Zb.ZP());
    Zmnh zmnh = Zmnh.ZP(this.Zb, this, false, this.ZY, zz9q, this::lambda$start$2);
    this.ZA.add(zmnh.Zy());
    Zl6j zl6j = new Zl6j(this.Zu);
    try {
    
    } catch (Ztkd ztkd) {
      throw a(null);
    } 
    Ztl_ ztl_ = Zb12.ZG() ? Ztl_.ZC : new Zshu(this.ZQ, new Zrow(this::ZF), this.Zy, new Zsui());
    Objects.requireNonNull(ztl_);
    this.ZA.add(ztl_::Zc);
    Objects.requireNonNull(this.Zb);
    Zx5y zx5y = new Zx5y(this.Zb::ZZ, this.ZJ, zmnh, ztl_, zl6j);
    this.Zk = new Zkf1(this.ZQ, zsau, zx5y);
    boolean bool = Zf(zmnh, zx5y);
    try {
      if (!Zb12.ZG()) {
        Z_();
        Zgje.Zn(this);
      } 
    } catch (Ztkd ztkd) {
      throw a(null);
    } 
    try {
      if (zra1 == Zra1.EXECUTION_MODE_DESKTOP)
        this.Zm.ZLc(); 
    } catch (Ztkd ztkd) {
      throw a(null);
    } 
    try {
      ZG(bool);
      if (Zbqc.Zwu() == null)
        Ztom.Zn(new String[4]); 
    } catch (Ztkd ztkd) {
      throw a(null);
    } 
  }
  
  public void ZX(Zmg9 paramZmg9) {
    Zm2.Zi(Zv8r.SUITE_PROCESS_EXECUTION_TIMER, (System.currentTimeMillis() - this.ZD) / 1000L);
    if (this.Ze != null)
      this.Ze.Za(2000); 
    this.ZU.ZN(2000);
    if (System.getProperty(a(-14404, -27935)) == null) {
      if (this.ZH != null)
        this.ZH.ZH(a(-14403, 30581) + a(-14403, 30581)); 
      System.exit(paramZmg9.processExitCode);
    } 
  }
  
  private void ZG(boolean paramBoolean) throws Zev3, Zxcc, Ze0d {
    // Byte code:
    //   0: new burp/Zgvv
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_3
    //   9: iload_1
    //   10: invokevirtual Zi : (Z)Lburp/Zgvv;
    //   13: pop
    //   14: invokestatic ZG : ()[Ljava/lang/String;
    //   17: aload_0
    //   18: getfield Zb : Lburp/Zz0n;
    //   21: invokeinterface Zr : ()Lburp/Zzxi;
    //   26: invokevirtual ZL : ()Ljava/util/List;
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #4
    //   36: astore_2
    //   37: aload #4
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 74
    //   47: aload #4
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: checkcast java/lang/String
    //   57: astore #5
    //   59: aload_3
    //   60: aload_0
    //   61: aload #5
    //   63: invokevirtual Zh : (Ljava/lang/String;)Ljava/io/File;
    //   66: invokevirtual Zl : (Ljava/io/File;)Lburp/Zgvv;
    //   69: pop
    //   70: aload_2
    //   71: ifnull -> 37
    //   74: aload_0
    //   75: getfield ZC : Lburp/Zt26;
    //   78: dup
    //   79: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   82: pop
    //   83: <illegal opcode> run : (Lburp/Zt26;)Ljava/lang/Runnable;
    //   88: astore #4
    //   90: aload_3
    //   91: aload #4
    //   93: invokevirtual ZF : (Ljava/lang/Runnable;)Lburp/Zgvv;
    //   96: pop
    //   97: aload_3
    //   98: invokestatic ZG : ()Z
    //   101: ifne -> 134
    //   104: aload_0
    //   105: getfield Zb : Lburp/Zz0n;
    //   108: invokeinterface Zr : ()Lburp/Zzxi;
    //   113: invokevirtual ZG : ()Z
    //   116: ifne -> 134
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: iconst_1
    //   127: goto -> 135
    //   130: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: iconst_0
    //   135: invokevirtual ZV : (Z)Lburp/Zgvv;
    //   138: pop
    //   139: aload_0
    //   140: getfield Zb : Lburp/Zz0n;
    //   143: invokeinterface Zr : ()Lburp/Zzxi;
    //   148: invokevirtual ZJ : ()Z
    //   151: ifeq -> 437
    //   154: aload_0
    //   155: getfield Zb : Lburp/Zz0n;
    //   158: invokeinterface Zr : ()Lburp/Zzxi;
    //   163: invokevirtual Zw : ()Ljava/lang/String;
    //   166: astore #5
    //   168: aload_0
    //   169: getfield ZV : Lnet/portswigger/Zl0;
    //   172: aload #5
    //   174: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   179: astore #6
    //   181: aload_0
    //   182: getfield ZV : Lnet/portswigger/Zl0;
    //   185: aload #5
    //   187: invokestatic ZX : (Ljava/lang/String;)Ljava/lang/String;
    //   190: invokeinterface Zg : (Ljava/lang/String;)Ljava/io/File;
    //   195: astore #7
    //   197: iconst_0
    //   198: istore #8
    //   200: aload #6
    //   202: invokevirtual exists : ()Z
    //   205: ifeq -> 222
    //   208: iconst_1
    //   209: istore #8
    //   211: aload_3
    //   212: aload #6
    //   214: invokevirtual ZL : (Ljava/io/File;)Lburp/Zgvv;
    //   217: pop
    //   218: aload_2
    //   219: ifnull -> 269
    //   222: aload #7
    //   224: invokevirtual exists : ()Z
    //   227: ifeq -> 255
    //   230: goto -> 237
    //   233: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: iconst_1
    //   238: istore #8
    //   240: aload_3
    //   241: aload #7
    //   243: invokevirtual ZL : (Ljava/io/File;)Lburp/Zgvv;
    //   246: pop
    //   247: aload #7
    //   249: astore #6
    //   251: aload_2
    //   252: ifnull -> 269
    //   255: aload_3
    //   256: aload #6
    //   258: invokevirtual Zk : (Ljava/io/File;)Lburp/Zgvv;
    //   261: pop
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: aload_3
    //   270: aload #6
    //   272: invokevirtual getName : ()Ljava/lang/String;
    //   275: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zgvv;
    //   278: pop
    //   279: aload_3
    //   280: iload #8
    //   282: ifeq -> 307
    //   285: aload_0
    //   286: getfield Zb : Lburp/Zz0n;
    //   289: invokeinterface Zr : ()Lburp/Zzxi;
    //   294: invokevirtual ZU : ()Z
    //   297: ifeq -> 315
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   306: athrow
    //   307: iconst_1
    //   308: goto -> 316
    //   311: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   314: athrow
    //   315: iconst_0
    //   316: invokevirtual Zc : (Z)Lburp/Zgvv;
    //   319: pop
    //   320: new burp/Zm8s
    //   323: dup
    //   324: aload_0
    //   325: aload_0
    //   326: getfield Zd : Lburp/Zkvo;
    //   329: aload_0
    //   330: getfield ZV : Lnet/portswigger/Zl0;
    //   333: aload_0
    //   334: getfield Zb : Lburp/Zz0n;
    //   337: invokeinterface Zr : ()Lburp/Zzxi;
    //   342: invokevirtual ZZ : ()Z
    //   345: invokespecial <init> : (Lburp/Zxei;Lburp/Zkvo;Lnet/portswigger/Zl0;Z)V
    //   348: astore #9
    //   350: aload_0
    //   351: getfield ZU : Lburp/Zxpn;
    //   354: aload_0
    //   355: aload_3
    //   356: invokevirtual ZZ : ()Lburp/Zrej;
    //   359: aload #9
    //   361: aload_0
    //   362: getfield Zu : Lburp/Zt90;
    //   365: aload_0
    //   366: getfield Zn : Lburp/Zs4c;
    //   369: aload_0
    //   370: getfield ZB : Lburp/Zldl;
    //   373: aload_0
    //   374: getfield Zc : Lburp/Zgdu;
    //   377: aload_0
    //   378: getfield ZH : Lburp/Zmx0;
    //   381: aload_0
    //   382: getfield ZK : Lburp/Zr18;
    //   385: aload_0
    //   386: getfield Zf : Lburp/Zxts;
    //   389: aload_0
    //   390: getfield Zh : Lburp/Zz8a;
    //   393: aload_0
    //   394: getfield ZA : Ljava/util/List;
    //   397: aload_0
    //   398: getfield Zk : Lburp/Zkf1;
    //   401: aload_0
    //   402: getfield ZR : Lburp/Zmfo;
    //   405: aload_0
    //   406: getfield Zl : Lburp/Zbpe;
    //   409: invokevirtual ZI : (Lburp/Zzp2;Lburp/Zrej;Lburp/Zkh;Lburp/Zt90;Lburp/Zs4c;Lburp/Zldl;Lburp/Zgdu;Lburp/Zmx0;Lburp/Zr18;Lburp/Zxts;Lburp/Zz8a;Ljava/util/List;Lburp/Zkf1;Lburp/Zmfo;Lburp/Zbpe;)Lburp/Zt4u;
    //   412: astore #10
    //   414: aload #10
    //   416: ifnonnull -> 433
    //   419: aload_0
    //   420: getstatic burp/Zmg9.PROJECT_CREATION_FAILED : Lburp/Zmg9;
    //   423: invokevirtual ZH : (Lburp/Zmg9;)V
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   432: athrow
    //   433: aload_2
    //   434: ifnull -> 565
    //   437: invokestatic ZG : ()Z
    //   440: ifeq -> 550
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   449: athrow
    //   450: aload_3
    //   451: iconst_1
    //   452: invokevirtual ZP : (Z)Lburp/Zgvv;
    //   455: sipush #-14414
    //   458: sipush #-11894
    //   461: invokestatic a : (II)Ljava/lang/String;
    //   464: invokevirtual Zg : (Ljava/lang/String;)Lburp/Zgvv;
    //   467: iconst_1
    //   468: invokevirtual Zc : (Z)Lburp/Zgvv;
    //   471: invokevirtual ZZ : ()Lburp/Zrej;
    //   474: astore #5
    //   476: new burp/Zxa0
    //   479: dup
    //   480: invokespecial <init> : ()V
    //   483: astore #6
    //   485: aload_0
    //   486: getfield ZU : Lburp/Zxpn;
    //   489: aload_0
    //   490: aload #5
    //   492: aload #6
    //   494: aload_0
    //   495: getfield Zu : Lburp/Zt90;
    //   498: aload_0
    //   499: getfield Zn : Lburp/Zs4c;
    //   502: aload_0
    //   503: getfield ZB : Lburp/Zldl;
    //   506: aload_0
    //   507: getfield Zc : Lburp/Zgdu;
    //   510: aload_0
    //   511: getfield ZH : Lburp/Zmx0;
    //   514: aload_0
    //   515: getfield ZK : Lburp/Zr18;
    //   518: aload_0
    //   519: getfield Zf : Lburp/Zxts;
    //   522: aload_0
    //   523: getfield Zh : Lburp/Zz8a;
    //   526: aload_0
    //   527: getfield ZA : Ljava/util/List;
    //   530: aload_0
    //   531: getfield Zk : Lburp/Zkf1;
    //   534: aload_0
    //   535: getfield ZR : Lburp/Zmfo;
    //   538: aload_0
    //   539: getfield Zl : Lburp/Zbpe;
    //   542: invokevirtual ZI : (Lburp/Zzp2;Lburp/Zrej;Lburp/Zkh;Lburp/Zt90;Lburp/Zs4c;Lburp/Zldl;Lburp/Zgdu;Lburp/Zmx0;Lburp/Zr18;Lburp/Zxts;Lburp/Zz8a;Ljava/util/List;Lburp/Zkf1;Lburp/Zmfo;Lburp/Zbpe;)Lburp/Zt4u;
    //   545: pop
    //   546: aload_2
    //   547: ifnull -> 565
    //   550: aload_0
    //   551: aload_3
    //   552: invokevirtual ZZ : ()Lburp/Zrej;
    //   555: invokevirtual ZR : (Lburp/Zrej;)V
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   564: athrow
    //   565: return
    // Exception table:
    //   from	to	target	type
    //   90	119	122	burp/Zev3
    //   104	130	130	burp/Zev3
    //   211	230	233	burp/Zev3
    //   251	262	265	burp/Zev3
    //   269	300	303	burp/Zev3
    //   285	311	311	burp/Zev3
    //   414	426	429	burp/Zev3
    //   433	443	446	burp/Zev3
    //   485	558	561	burp/Zev3
  }
  
  private File Zh(String paramString) throws Zxcc {
    File file = this.ZV.Zg(paramString);
    try {
      if (file.isFile())
        try {
          if (file.canRead())
            return file; 
          throw new Zxcc(Zrgs.COULD_NOT_LOAD_CONFIGURATION_FILE, file.getAbsolutePath());
        } catch (Zxcc zxcc) {
          throw a(null);
        }  
    } catch (Zxcc zxcc) {
      throw a(null);
    } 
    throw new Zxcc(Zrgs.COULD_NOT_LOAD_CONFIGURATION_FILE, file.getAbsolutePath());
  }
  
  private void ZR(Zrej paramZrej) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zzw4;Lburp/Zrej;)Ljava/lang/Runnable;
    //   7: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  public Zz0n Zi() {
    return this.Zb;
  }
  
  public Zg1j ZZ() {
    return this.ZE;
  }
  
  public Zb_j Zn() {
    return this.ZL;
  }
  
  public Zkl6 ZM() {
    return this.Zs;
  }
  
  public void Zg(long paramLong1, long paramLong2, Runnable paramRunnable) {
    this.ZT.Zp(paramLong1, paramLong2, paramRunnable);
  }
  
  public void ZY(Runnable paramRunnable) {
    this.ZC.Zk(paramRunnable);
  }
  
  public Zl04 ZF() {
    return (this.Zt != null) ? this.Zt.ZA() : ((this.ZS != null) ? this.ZS.Zd() : null);
  }
  
  public Zgb6 ZG() {
    return this.ZI;
  }
  
  public void Zw() {
    if (this.Zt != null)
      this.Zt.Zn(); 
  }
  
  public void ZH(Zmg9 paramZmg9) {
    String[] arrayOfString = Ztom.ZG();
    if (this.Zt != null) {
      this.Zt.ZT(false);
      if (arrayOfString != null) {
        Zj(this.ZN);
        ZX(paramZmg9);
        return;
      } 
      return;
    } 
    Zj(this.ZN);
    ZX(paramZmg9);
  }
  
  public void ZK(Zt4u paramZt4u) {
    paramZt4u.Zn();
    Zj(this.ZN);
    ZX(Zmg9.PROJECT_WAS_CLOSED);
  }
  
  public File Zc() {
    return this.Z_;
  }
  
  public void Zj(Ztg4 paramZtg4) {
    if (paramZtg4 != null)
      try {
        paramZtg4.ZW(this.ZL);
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      }  
  }
  
  private boolean Zf(Zmnh paramZmnh, Zx5y paramZx5y) throws Ztkd {
    boolean bool = false;
    Zg33 zg33 = (new Zk58()).Zs(this, this.ZZ, this.Zu, paramZx5y, this.ZQ);
    this.Zd = zg33.ZQ;
    bool = zg33.ZD;
    bool |= ZA();
    Za(paramZmnh);
    ZO();
    return bool;
  }
  
  private static void Z_() {}
  
  private void Za(Zmnh paramZmnh) {
    this.Zk.ZS();
    this.ZT.Zz(paramZmnh.Zq(), paramZmnh.Zb(), this::lambda$checkForUpdates$4);
  }
  
  private void ZO() {
    if (Zra1.EXECUTION_MODE_ENTERPRISE_AGENT != ZW())
      this.ZT.Zp(900000L, 900000L, new Zts3(this, this.ZQ)); 
  }
  
  private boolean ZA() throws Ztkd {
    Zl6o zl6o = Zbfp.Zp(this, this.ZZ, this.Zu);
    try {
      if (!zl6o.Zd)
        throw new Ztkd(); 
    } catch (Ztkd ztkd) {
      throw a(null);
    } 
    return zl6o.ZP;
  }
  
  private File ZH(String paramString) {
    File file = ZC(paramString);
    return (file != null) ? file : this.ZV.Zg(System.getProperty(a(-14402, -12866)));
  }
  
  private File ZC(String paramString) {
    File file = null;
    try {
      try {
        if (paramString != null && !paramString.isEmpty()) {
          file = this.ZV.Zg(paramString);
          try {
            if (!file.exists())
              file.mkdir(); 
          } catch (Exception exception) {
            throw a(null);
          } 
          try {
            if (!file.isDirectory() || !file.canWrite())
              file = null; 
          } catch (Exception exception) {
            throw a(null);
          } 
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      file = null;
    } 
    return file;
  }
  
  public Zkvo Ze() {
    return this.Zd;
  }
  
  public void Zo(Zkvo paramZkvo) {
    this.Zd = paramZkvo;
    if (this.Zt != null)
      this.Zt.ZI(); 
  }
  
  public Zkvo ZH() {
    return this.ZG;
  }
  
  public void ZF(Zkvo paramZkvo) {
    this.ZG = paramZkvo;
  }
  
  public void Zi(Object paramObject) {
    this.ZO = paramObject;
  }
  
  public void ZR(Zt4u paramZt4u) {
    this.Zt = paramZt4u;
  }
  
  public void ZI() {
    this.Zt = null;
  }
  
  private void lambda$checkForUpdates$4() {
    this.Zk.ZS();
  }
  
  private void lambda$showStartProjectWizard$3(Zrej paramZrej) {
    this.ZS = new Zrk1(this.Zb, this, this, this.Zu, this.ZU, paramZrej, this.ZL, this.Zn, this.ZI, this.ZB, this.Zc, this.ZH, this.ZK, this.Zf, this.Zh, this.ZA, this.Zk, this.ZR, this.ZY, this.Zl);
    this.ZC.ZK();
  }
  
  private void lambda$start$2() {
    this.Zt.ZT(false);
  }
  
  private Boolean lambda$start$1() {
    return Boolean.valueOf((Ze() == null && ZH() != null));
  }
  
  private String lambda$new$0() {
    return (this.Zd == null) ? null : this.Zd.Zr();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ç. z?~ÀÍüð ü<¦ÈQÜÖfþ9(­ÉSw³ÝÒ¡>)N5×)+fT²þ|á÷±q-Ì¦¨1ýâ¨aÜõ\\fÑf,ø¿D¬²^kº0°<þÜ±2¿1I¡pÑ ¼b°Ø×èT}n2ÀbiÜÊJ×þ½RÇ1âbêU\\bIÖÉ3ùHÉ%"nnÅ½'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #18
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
    //   67: ldc 'ÑÎÜÐF30p¥°qö.É\\fôb\eGß¿'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #22
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #34
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
    //   128: putstatic burp/Zzw4.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zzw4.b : [Ljava/lang/String;
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
    //   212: bipush #63
    //   214: goto -> 244
    //   217: bipush #9
    //   219: goto -> 244
    //   222: bipush #31
    //   224: goto -> 244
    //   227: bipush #42
    //   229: goto -> 244
    //   232: bipush #31
    //   234: goto -> 244
    //   237: bipush #29
    //   239: goto -> 244
    //   242: bipush #44
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC7B7) & 0xFFFF;
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
      byte b1 = 26;
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
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzw4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */