package burp;

import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.internal.ObjectFactoryLocator;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.portswigger.Zae;
import net.portswigger.Zah;
import net.portswigger.Zf2;
import net.portswigger.Zk_;
import net.portswigger.Zkp;
import net.portswigger.Zl0;
import net.portswigger.Zm2;
import net.portswigger.Zml;
import net.portswigger.Zoy;
import net.portswigger.Zqf;
import net.portswigger.Zqw;
import net.portswigger.Zrzg;
import net.portswigger.Ztg;
import net.portswigger.Ztj;
import net.portswigger.Zuh;
import net.portswigger.browser.Zds;
import net.portswigger.browser.Zja;
import net.portswigger.browser.Zji;

public class Zxpn {
  private final Zm6x Zu7;
  
  private final Zz0n ZDM;
  
  private final Zxei Zua;
  
  private final Zlf2 ZD1;
  
  private final Zz7x ZDx;
  
  private final Zeri ZDV;
  
  private final Zem0 ZuE;
  
  private final Zrqx ZK;
  
  private final Zrud Zu8;
  
  private final Zexp Zut;
  
  private final AtomicReference<Zkrj> Zu1;
  
  private final AtomicReference<Zkr6> Zuy;
  
  private final Ztoi ZF;
  
  private final AtomicReference<Zbiv> ZDT = new AtomicReference<>();
  
  private final AtomicReference<Zgx0> Z_ = new AtomicReference<>();
  
  private final AtomicReference<Ztyg> ZuM = new AtomicReference<>();
  
  private final Zxa Zv;
  
  private final Zl0j ZU;
  
  private Zs6i ZD6;
  
  private Zl77 Zu_;
  
  private Zl0 ZuF;
  
  private Zzxi Zu2;
  
  private Zra1 ZDz;
  
  private Zz_s Zu;
  
  private Ztd ZDf;
  
  private Zg1j ZuB;
  
  private Ztwv Zy;
  
  private Zz_r ZD7;
  
  private Zl04 ZN;
  
  private Zmkx Zu9;
  
  private String ZDe;
  
  private Zg21 ZDs;
  
  private Zr_4 Zuq;
  
  private Zr_4 Zw;
  
  private Ztg4 ZuA;
  
  private Zgbj ZC;
  
  private Zk8l Zg;
  
  private List<String> Zuh;
  
  private boolean Zu4;
  
  private boolean ZDt;
  
  private Zb31 ZuG;
  
  private Zt8u ZD8;
  
  private Zbq8 ZuN;
  
  private Zezx Zuf;
  
  private Zlal Za;
  
  private Zml Zus;
  
  private Zzir ZI;
  
  private Ze_6 ZuS;
  
  private Zbnt ZuJ;
  
  private Zxwj Zue;
  
  private Zerg Zs;
  
  private Zgxi ZDi;
  
  private WindowListener Zuu;
  
  private Zr99 ZuX;
  
  private Zxg9 ZuO;
  
  private Zlyd ZL;
  
  private Zrgk Zb;
  
  private Ztrg ZDa;
  
  private Zbqx ZD;
  
  private Zmv8 ZuK;
  
  private Zmv8 ZDc;
  
  private Ztsr ZDP;
  
  private Zbl2 ZT;
  
  private Zxl_ Zj;
  
  private Zsxk Zp;
  
  private Zkl6 ZuY;
  
  private Zt4u ZuH;
  
  private Zz4b Zug;
  
  private Zxx6 Zuc;
  
  private Zzkr Zuk;
  
  private Zrag Zur;
  
  private Zr8j ZH;
  
  private Zlor ZuW;
  
  private Zl34 ZDo;
  
  private Zl34 ZDE;
  
  private Zg0s ZDu;
  
  private Zs2g Zuw;
  
  private Zz1h Zub;
  
  private Zk5c ZDO;
  
  private Zlnu Zuo;
  
  private Zkf3 ZO;
  
  private Zlx6 ZG;
  
  private Ztdq ZDF;
  
  private Ztyg ZDL;
  
  private Zgq7 ZQ;
  
  private Zlg9 ZS;
  
  private Zm6v Zr;
  
  private Zr1m Zo;
  
  private Zxgc ZR;
  
  private Zslu ZM;
  
  private Ze8b ZDC;
  
  private Zlxz Zc;
  
  private Zmtq Zup;
  
  private Zgyg ZuV;
  
  private Zzg2 ZJ;
  
  private Zbqp ZuL;
  
  private Zb5 ZD0;
  
  private Zb_8 ZDU;
  
  private Zr49 ZV;
  
  private Ztcy ZDy;
  
  private Zrfd Ze;
  
  private Zbiv Zq;
  
  private Zm37 ZuQ;
  
  private Znn ZDq;
  
  private Zrxq ZP;
  
  private Zm0l ZD5;
  
  private Zzzt Zk;
  
  private Zbp5 ZA;
  
  private Zx46 Zul;
  
  private Zzw2 ZuD;
  
  private Zb_l Zum;
  
  private Ze_7 ZuU;
  
  private Zlaa ZDb;
  
  private Zbnt ZZ;
  
  private Zkn Zl;
  
  private Zew2 ZDB;
  
  private Zllh Zi;
  
  private Zk20 ZuP;
  
  private Zkve ZDv;
  
  private Zegl ZuT;
  
  private Zvo_ Zuv;
  
  private Zxea ZDh;
  
  private Ztks ZuC;
  
  private Zmvn Zu0;
  
  private Zbo9 Zu3;
  
  private Zbsd Zz;
  
  private Zsi7 Zu6;
  
  private Ze_8 ZDR;
  
  private Zkee Zm;
  
  private Zb86 Zud;
  
  private Zsuv ZW;
  
  private Zgy2 ZDD;
  
  private Zl4w Zuj;
  
  private Zic Zd;
  
  private Zen4 Zn;
  
  private Zey9 Zuz;
  
  private Zz3j Zux;
  
  private Zs0n Zx;
  
  private MontoyaObjectFactory ZE;
  
  private Zr34 ZuZ;
  
  private Zztb Zh;
  
  private Zbjl ZY;
  
  private Zgf2 ZuR;
  
  private Zrid Zui;
  
  private Zxy1 ZuI;
  
  private Zlgj ZX;
  
  private Zzov Zf;
  
  private Zz1v Zu5;
  
  private Ztha ZDW;
  
  private Zebm ZB;
  
  private Zmhp ZD2;
  
  private Zm9o Zun;
  
  private Zmr3 ZD4;
  
  private Zz37 Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxpn(Zz0n paramZz0n, Zxei paramZxei, Zlf2 paramZlf2, Zz7x paramZz7x, Zeri paramZeri, Zem0 paramZem0, Zrqx paramZrqx, Zrud paramZrud, Zexp paramZexp, Zl0j paramZl0j) {
    this.ZDM = paramZz0n;
    this.Zua = paramZxei;
    this.ZD1 = paramZlf2;
    this.ZDx = paramZz7x;
    this.ZDV = paramZeri;
    this.ZuE = paramZem0;
    this.ZK = paramZrqx;
    this.Zu8 = paramZrud;
    this.Zut = paramZexp;
    this.ZU = paramZl0j;
    this.Zu7 = new Zm6x();
    this.Zu1 = new AtomicReference<>();
    this.Zuy = new AtomicReference<>();
    this.ZF = new Ztoi();
    this.Zv = new Zxa(new HashMap<>());
  }
  
  public Zbqx Zs() {
    return this.ZD;
  }
  
  public Zt4u ZI(Zzp2 paramZzp2, Zrej paramZrej, Zkh paramZkh, Zt90 paramZt90, Zs4c paramZs4c, Zldl paramZldl, Zgdu paramZgdu, Zmx0 paramZmx0, Zr18 paramZr18, Zxts paramZxts, Zz8a paramZz8a, List<Runnable> paramList, Zkf1 paramZkf1, Zmfo paramZmfo, Zbpe paramZbpe) throws Zev3, Zxcc, Ze0d {
    Ze(paramZrej);
    long l = System.currentTimeMillis();
    try {
      ZX(paramZrej);
      ZX();
      Zn(paramZkh);
      if (!ZE(paramZrej, paramZkh))
        return null; 
      ZN();
      Zq();
      Zo();
      ZI(paramList);
      ZZ();
      Zi(paramZrej);
      Zr(paramZbpe);
      Zb(paramZrej, paramZkh);
      Zb(paramZrej);
      Zc(paramZgdu);
      Zu();
      ZY();
      ZT();
      Zs(paramZs4c);
      ZI();
      ZF();
      ZS();
      ZE();
      Zf(paramZmfo);
      Zb(paramZrej, paramZzp2);
      ZI(paramZrej);
      Zi();
      ZL();
      ZG();
      ZD();
      ZF(paramZbpe);
      Zb();
      ZU(paramZs4c);
      ZV();
      Zh();
      Zm();
      ZR();
      ZK();
      Zp();
      Z_();
      ZB();
      Z_(paramZs4c, paramZldl, paramZgdu, paramZkf1);
      Zr();
      Ze();
      Zr(paramZs4c, paramZxts, paramZz8a);
      Zt();
      ZR(paramZs4c, paramZxts, paramZz8a);
      Zo(paramZs4c, paramZz8a);
      ZM();
      Zz();
      Zl();
      ZA();
      Zc();
      ZC();
      Zn();
      ZR(paramZrej, paramZs4c, paramZgdu);
      Zv();
      Zd();
      Zw(paramZt90);
      ZO();
      Zg();
      ZU();
      ZV(paramZrej, paramZz8a);
      Zq(paramZldl, paramZmx0, paramZr18, paramZz8a);
      ZT(paramZrej);
      Zf();
      ZW();
      Zm2.Zi(Zv8r.SUITE_PROJECTS_PROJECT_STARTUP_TIMER, (System.currentTimeMillis() - l) / 1000L);
      Ze7j.Zl(this.ZuH.ZA(), this.ZDf, this.Zu2.ZM(), this.Zu8.ZN());
      this.Zu7.Zj(new Zm7l());
      return this.ZuH;
    } catch (Zkfw zkfw) {
      try {
        Zah.Zl(zkfw, Zk_.UNEXPECTED);
        Zm2.Zo(Zze0.SUITE_PROJECTS_PROJECT_FILE_INVALID);
        paramZzp2.ZI();
        if (!this.ZDs.Zx())
          paramZkh.Zo(this.Zuq.Zl(), this.Zg, this.ZC, this.ZuA, this.ZDe); 
      } catch (Zkfw zkfw1) {
        throw a(null);
      } 
      return null;
    } catch (Zev1 zev1) {
      Zah.Zl(zev1, Zk_.USER_ERROR);
      paramZkh.Zd(this.Zg, this.ZuA, this.ZDe);
      return null;
    } catch (Zev3 zev3) {
      Zah.Zl(zev3, Zk_.COMMON_RUNTIME_FAILURE);
      Zm2.Zo(Zze0.SUITE_PROJECTS_PROJECT_FILE_INVALID);
      ZQ();
      this.Zua.Zj(this.ZuA);
      throw zev3;
    } catch (Zxcc zxcc) {
      Zah.ZA(zxcc, "", Zk_.UNEXPECTED, true);
      paramZzp2.ZI();
      ZQ();
      this.Zua.Zj(this.ZuA);
      throw zxcc;
    } catch (Ze0d ze0d) {
      Zah.Zl(ze0d, Zk_.USER_ERROR);
      Zm2.Zo(Zze0.SUITE_PROJECTS_CONFIG_FILE_INVALID);
      paramZzp2.ZI();
      ZQ();
      this.Zua.Zj(this.ZuA);
      throw ze0d;
    } catch (Throwable throwable) {
      try {
        Zah.ZA(throwable, "", Zk_.UNEXPECTED, true);
        paramZzp2.ZI();
        if (this.Zuq == null)
          try {
            if (this.Zu4) {
              paramZkh.Zd(this.Zg, this.ZuA, this.ZDe);
              return null;
            } 
          } catch (Zkfw zkfw) {
            throw a(null);
          }  
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      try {
        if (this.Zuq != null)
          try {
            if (this.Zuq.Zi())
              try {
                if (!this.ZDs.Zx())
                  try {
                    if (this.ZDs.ZK(this.Zuq.Zl()))
                      return null; 
                  } catch (Zkfw zkfw) {
                    throw a(null);
                  }  
              } catch (Zkfw zkfw) {
                throw a(null);
              }  
          } catch (Zkfw zkfw) {
            throw a(null);
          }  
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      ZQ();
      this.Zua.Zj(this.ZuA);
      String str = throwable.getMessage();
      try {
        if (str == null || str.isEmpty())
          str = throwable.getClass().getName(); 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      throw new Zxcc(Zrgs.FAILED_TO_CREATE_BURP_PROJECT, str, throwable);
    } 
  }
  
  private void ZN() {
    Objects.requireNonNull(this.ZuB);
    Objects.requireNonNull(this.Zu7);
    this.ZD6 = new Zs6i(this.Zu7, new Zsl0(this.ZuB));
  }
  
  private void Zo() {
    Path path = this.Zua.Zc().toPath().resolve(this.ZDM.ZU().Z_(8));
    this.Zui = new Zrid(new Zs88(new Zkrm(), path, this.Zu7), this.Zy.Ze());
    this.Zu9.ZZ(this::lambda$buildJavaToolingService$0);
  }
  
  private void Zf() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZDM : Lburp/Zz0n;
    //   4: invokeinterface Zr : ()Lburp/Zzxi;
    //   9: invokevirtual ZM : ()Lburp/Zra1;
    //   12: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   15: if_acmpne -> 139
    //   18: aload_0
    //   19: getfield ZuB : Lburp/Zg1j;
    //   22: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: pop
    //   26: aload_0
    //   27: getfield Zuq : Lburp/Zr_4;
    //   30: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   33: pop
    //   34: aload_0
    //   35: getfield Zs : Lburp/Zerg;
    //   38: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   41: pop
    //   42: aload_0
    //   43: getfield Zur : Lburp/Zrag;
    //   46: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   49: pop
    //   50: aload_0
    //   51: getfield ZH : Lburp/Zr8j;
    //   54: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   57: pop
    //   58: aload_0
    //   59: getfield ZH : Lburp/Zr8j;
    //   62: invokevirtual Zy : ()Lburp/Ztks;
    //   65: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   68: pop
    //   69: aload_0
    //   70: getfield Zy : Lburp/Ztwv;
    //   73: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   76: pop
    //   77: aload_0
    //   78: <illegal opcode> get : (Lburp/Zxpn;)Ljava/util/function/Supplier;
    //   83: astore_1
    //   84: new burp/Zx4s
    //   87: dup
    //   88: aload_0
    //   89: aload_1
    //   90: <illegal opcode> ZV : (Lburp/Zxpn;Ljava/util/function/Supplier;)Lburp/Zlnd;
    //   95: invokespecial <init> : (Lburp/Zlnd;)V
    //   98: astore_2
    //   99: new burp/Zzng
    //   102: dup
    //   103: aload_0
    //   104: getfield Zy : Lburp/Ztwv;
    //   107: aload_1
    //   108: invokespecial <init> : (Lburp/Ztwv;Ljava/util/function/Supplier;)V
    //   111: astore_3
    //   112: aload_3
    //   113: aload_0
    //   114: getfield Zur : Lburp/Zrag;
    //   117: invokevirtual Zi : ()Lburp/Zlli;
    //   120: invokevirtual ZP : (Lburp/Zlli;)V
    //   123: aload_0
    //   124: getfield Zu9 : Lburp/Zmkx;
    //   127: aload_3
    //   128: invokevirtual ZZ : (Lburp/Ztu3;)V
    //   131: aload_0
    //   132: getfield Zu9 : Lburp/Zmkx;
    //   135: aload_2
    //   136: invokevirtual ZZ : (Lburp/Ztu3;)V
    //   139: return
  }
  
  private void ZW() {
    Objects.requireNonNull(this.ZR);
    this.ZR.ZKT();
  }
  
  private void ZX(Zrej paramZrej) {
    try {
      this.ZuF = this.ZDM.ZM();
      this.Zu2 = this.ZDM.Zr();
      this.ZDz = this.Zu2.ZM();
      this.Zy = new Zt55(a(-10563, 13991));
      this.Zul = new Zx46(this.Zy);
      this.Zu = new Zz_s(this.Zul, new Zmur(this.Zul));
      this.ZDf = new Ztd(this.Zu);
      this.ZuB = this.Zua.ZZ();
      this.ZDe = this.ZuB.ZO();
      this.ZD7 = new Zgy5();
      this.ZuA = Ztg4.ZI(this.Zua, this.ZuF, this.ZDf);
      this.ZG = new Zlx6();
      this.ZDq = new Znn();
      this.Zs = new Zerg(this.ZDz, paramZrej.ZP, this.ZDf);
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.ZN = Zb12.ZG() ? null : ZJ();
    this.Zu9 = new Zmkx();
  }
  
  private Zl04 ZJ() {
    Zl04 zl04 = new Zl04();
    zl04.setName(a(-10564, 21954));
    return zl04;
  }
  
  private void ZX() {
    int i = Zeew.ZL();
    for (String str : this.Zu2.ZQ()) {
      Zmgc.UNRECOGNISED_CLI_ARG.ZV(this.ZDf.ZA(), new Object[] { str });
      if (i != 0)
        break; 
    } 
  }
  
  private void Zn(Zkh paramZkh) throws Zev3 {
    this.ZDs = new Zg21(paramZkh, this.ZuA, this.ZDe, this.ZN);
    this.ZuG = new Zb31(this.ZuA, this.ZuF, this.ZDf, this.ZDs, this.ZN);
    this.Zw = this.ZuG.ZC();
    Zedc zedc = new Zedc(this.ZDM.ZP(), this.ZDM.ZR(), this.Zy, this.Zu7);
    this.Zg = new Zk8l(this.ZDs, zedc);
    this.ZDs.ZH(this.Zg);
  }
  
  private boolean ZE(Zrej paramZrej, Zkh paramZkh) throws Zev3 {
    try {
      this.Zuq = Zh(this.ZuG, paramZrej);
      if (!ZG(this.Zuq, paramZkh, this.ZDf)) {
        ZQ();
        return false;
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    return true;
  }
  
  private void Zq() {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.Zu_ = (((Zzxi)Objects.<Zzxi>requireNonNull(this.Zu2)).ZM() == Zra1.EXECUTION_MODE_DESKTOP) ? new Zmhk() : Zl77.Zg;
  }
  
  private void ZI(List<Runnable> paramList) {
    this.ZuN = new Zbq8(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zxei>requireNonNull(this.Zua), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Ztg4>requireNonNull(this.ZuA), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zz_r>requireNonNull(this.ZD7), Objects.<Zz7x>requireNonNull(this.ZDx), Objects.<Zeri>requireNonNull(this.ZDV), Objects.<Zlcb>requireNonNull(this.Zu_), paramList, this.Zu7);
    this.ZD8 = this.ZuN;
    this.ZC = this.ZuN;
    this.ZDs.ZO(this.ZC);
    this.Zuu = new Zts9(this.ZuN);
  }
  
  private void ZZ() {
    this.Zuf = new Zezx(this.ZN);
    this.Za = new Zlal(this.ZDf, this.ZD8, this.Zuf);
    this.ZDx.ZZ(this.Za);
  }
  
  private void Zi(Zrej paramZrej) {
    try {
      if (paramZrej.ZG != null)
        this.ZC.Zy(paramZrej.ZG); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void Zb(Zrej paramZrej, Zkh paramZkh) {
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.ZDe);
    Objects.requireNonNull(this.ZF);
    this.ZI = Zj(paramZkh, this.Zuq, paramZrej, this.ZDe);
    List<?> list = List.of(new Zmhg(), new Zk8h(this.Zuq));
    Zr54 zr54 = new Zr54(paramZrej, (List)list);
    zr54.Zd(this.ZI);
    this.Zug = this.ZI.Zv9();
    this.ZuS = this.ZI.ZvB();
    this.ZuJ = new Zbnt(this.ZI.ZvE(), this.Zuq);
    this.Zue = new Zrel(this.ZI.Zv9());
    this.Zuk = Zmst.Zu(this.Zug, this.Zuq, this.ZF, this.ZDM.ZP(), this.ZDM.ZU(), this.ZDf);
    this.Zup = new Zmtq(this.ZI.ZvC());
  }
  
  private void Zb(Zrej paramZrej) {
    try {
      if (!paramZrej.Zf) {
        String str = paramZrej.Zc;
        if (str == null) {
          Zuh.Zb(false, Zqf.Zv);
          str = "";
        } 
        this.ZI.ZSM(str);
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zc(Zgdu paramZgdu) {
    Objects.requireNonNull(this.ZD1);
    Objects.requireNonNull(this.Zw);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.ZuF);
    Objects.requireNonNull(this.Zs);
    Objects.requireNonNull(this.ZDM);
    this.ZuX = new Zr99(this.ZuS.ZmM(), this.ZD1);
    this.ZuO = new Zxg9(this.Zw);
    this.ZL = new Zlyd(this.ZuS.ZmM(), this.ZuO, this.Zuq);
    this.Zb = new Zrgk(this.ZuJ, this.Zw);
    this.ZDa = new Ztrg(this.ZuS.ZmM(), this.Zb, this.ZuJ, this.Zuq);
    this.ZD = new Zbqx(this.ZuS.ZmM(), this.ZL, this.ZuX, new Zr5v(), this.Zs, this.ZuF, this.ZDM.ZR(), this.ZDz);
    this.ZD.Zd(this.ZL);
    this.ZD.Zd(this.ZuX);
    this.ZD.Zd(this.ZDa);
    this.ZU.ZD(this.ZD);
    this.ZuK = new Zmv8(new Zm3g[] { this.ZD });
    this.ZDc = new Zmv8(new Zm3g[] { this.ZD, this.Zs, paramZgdu, this.Zuk });
    Zlhg zlhg = new Zlhg(this.ZD);
    this.ZuX.ZR(zlhg);
  }
  
  private void Zu() {
    Objects.requireNonNull(this.ZuK);
    this.ZDx.ZY(this.ZuK);
  }
  
  private void ZY() {
    Objects.requireNonNull(this.ZD);
    this.Zm = new Zkee(this.ZD);
  }
  
  private void ZT() {
    Objects.requireNonNull(this.ZD);
    this.Zud = new Zb86(this.ZD);
  }
  
  private void Zs(Zs4c paramZs4c) {
    Zeef zeef = new Zeef(paramZs4c, this.ZD.Zfk());
    this.ZD.Zd(zeef);
    this.ZDP = Ztsr.ZP(zeef);
  }
  
  private void ZI() {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZDz : Lburp/Zra1;
    //   8: getstatic burp/Zra1.EXECUTION_MODE_DESKTOP : Lburp/Zra1;
    //   11: if_acmpne -> 60
    //   14: aload_0
    //   15: getfield Zs : Lburp/Zerg;
    //   18: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: pop
    //   22: aload_0
    //   23: getfield ZD : Lburp/Zbqx;
    //   26: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: pop
    //   30: aload_0
    //   31: new burp/Zb1j
    //   34: dup
    //   35: aload_0
    //   36: getfield Zs : Lburp/Zerg;
    //   39: aload_0
    //   40: getfield ZD : Lburp/Zbqx;
    //   43: invokespecial <init> : (Lburp/Zerg;Lburp/Zgb6;)V
    //   46: putfield ZDC : Lburp/Ze8b;
    //   49: iload_1
    //   50: ifne -> 74
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   59: athrow
    //   60: aload_0
    //   61: getstatic burp/Ze8b.Zb : Lburp/Ze8b;
    //   64: putfield ZDC : Lburp/Ze8b;
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   73: athrow
    //   74: aload_0
    //   75: new burp/Zgyg
    //   78: dup
    //   79: invokespecial <init> : ()V
    //   82: putfield ZuV : Lburp/Zgyg;
    //   85: aload_0
    //   86: getfield ZuK : Lburp/Zmv8;
    //   89: aload_0
    //   90: getfield ZuV : Lburp/Zgyg;
    //   93: invokevirtual Zi : (Lburp/Zm3g;)V
    //   96: return
    // Exception table:
    //   from	to	target	type
    //   4	53	56	burp/Zkfw
    //   14	67	70	burp/Zkfw
  }
  
  private void ZF() {
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.ZuF);
    Objects.requireNonNull(this.Zw);
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.ZDf);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.ZuS);
    this.ZT = new Zbl2(this.Zuq, this.ZuF);
    Zbl2 zbl2 = new Zbl2(this.Zw, this.ZuF);
    this.Zj = new Zxl_(this.ZDf, this.Zw, zbl2);
    this.Zp = new Zsxk(this.ZuS.ZmM(), this.Zj, this.ZDf, this.Zuq, this.ZT);
    this.ZD.Zd(this.Zp);
  }
  
  private void ZS() {
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.ZDf);
    Objects.requireNonNull(this.ZDa);
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.Zp);
    Objects.requireNonNull(this.ZDM);
    Zr0i zr0i = new Zr0i();
    Zkh7 zkh7 = new Zkh7(this.ZD, this.Zuq);
    Zxdt zxdt = new Zxdt(this.Zy, this.ZDM.ZP());
    this.Zu9.ZZ(zxdt);
    this.Zuz = new Zey9(this.ZuJ);
    this.Zux = new Zz3j(this.Zuz);
    this.ZuY = new Zgex(this.ZD, this.Zuq, this.ZDf, zr0i, zkh7, this.ZDa, this.ZuJ, this.Zp, new Ztqf(this.ZD, this.ZDM.ZP(), zr0i, zkh7), zxdt, this.Zuz);
    this.ZuD = new Zzw2(this.ZDM, this.ZuY, this.ZD, this.Zy);
    this.Zum = new Zb_l(this.ZDM, this.ZuY, this.ZD);
  }
  
  private void ZE() {
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.ZI);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.Zuz);
    this.Zk = new Zzzt(this.ZI.Zvx(), this.ZDM.ZU(), this.Zuq, this.Zuz);
    this.ZA = new Zbp5(this.Zk, this.Zuq);
  }
  
  private void Zf(Zmfo paramZmfo) {
    try {
      if (this.ZK == null)
        return; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Objects.requireNonNull(this.ZuY);
    Objects.requireNonNull(this.ZuD);
    Objects.requireNonNull(this.ZD);
    Zm1u zm1u = new Zm1u(this.ZuY, this.ZuD);
    Objects.requireNonNull(this.ZD);
    this.Zus = this.ZK.ZX(this.ZD, zm1u, this.ZD::Zqj, Zlib.ZS(this.Zuq));
    paramZmfo.ZN(this.ZD, this.Zus).Zy();
    Zoy zoy = new Zoy(this.Zus);
    Zm2.Zn(new Zg26((Zf2)zoy, this.ZD));
    Ztg ztg = new Ztg(this.Zus);
    Zkp.ZO(new Zmox((Zqw)ztg, this.ZD));
    this.Zu9.ZZ(this::lambda$reconfigureTelemetryReporter$5);
  }
  
  private void Zb(Zrej paramZrej, Zzp2 paramZzp2) {
    this.ZuH = new Zt4u(Objects.<Zrej>requireNonNull(paramZrej), Objects.<Zxei>requireNonNull(this.Zua), Objects.<Zzir>requireNonNull(this.ZI), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zt8u>requireNonNull(this.ZD8), Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Ztu3>requireNonNull(this.Zu9), Objects.<Zk8l>requireNonNull(this.Zg), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zkl6>requireNonNull(this.ZuY));
    paramZzp2.ZR(this.ZuH);
    this.Zuc = new Zxx6(Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zgb6>requireNonNull(this.ZD), new Zr_0(), Z_(this.ZN), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zbnt>requireNonNull(this.ZuJ), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Ztg4>requireNonNull(this.ZuA), Objects.<Zzzt>requireNonNull(this.Zk), Objects.<Zey9>requireNonNull(this.Zuz));
  }
  
  private void ZI(Zrej paramZrej) {
    Objects.requireNonNull(this.Zug);
    Objects.requireNonNull(this.ZDf);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.Zuk);
    Objects.requireNonNull(this.ZDz);
    Zgu7 zgu7 = new Zgu7(this.Zug);
    Zto2 zto2 = new Zto2(zgu7);
    Zb3k zb3k = new Zb3k();
    Zr_h zr_h = new Zr_h(new Zrtb(zb3k, this.ZDf));
    try {
      this.Zu9.ZZ(zr_h);
      this.ZDh = new Zxea(zgu7);
      if (paramZrej.ZI)
        zgu7.ZZ(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zs4 zs4 = new Zs4(this.Zug, zgu7, zb3k, zr_h, this.Zuk, new Zm44(this.Zy), this.ZDz, zto2, this.ZDM.ZP());
    this.Zur = new Zrag(this.Zug, zr_h, zs4, zto2, this.Zuk, this.ZDh);
    Objects.requireNonNull(this.Zur);
    this.Zu9.ZZ(this.Zur::Zv);
  }
  
  private void Zi() {
    Objects.requireNonNull(this.Zuc);
    Objects.requireNonNull(this.Zur);
    this.ZH = new Zr8j(this.Zuc, this.Zur);
  }
  
  private void ZL() {
    Objects.requireNonNull(this.ZuS);
    Objects.requireNonNull(this.Zw);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.ZuY);
    Zt3h zt3h = this.ZuS.ZmZ();
    this.ZDo = zt3h.Zkq();
    this.ZDE = zt3h.ZkV();
    this.ZuW = new Zlor(this.ZDo, this.ZDE, this.Zw, this.Zuq, this.ZuY.Zq());
  }
  
  private void ZG() {
    Objects.requireNonNull(this.Zug);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.Zs);
    Objects.requireNonNull(this.ZD7);
    this.ZDu = new Zg0s(Zd(this.Zug));
    this.Zuw = new Zs2g(this.Zuq, this.ZDM.ZP(), this.ZDu);
    this.Zub = Zgxz.Zw(this.Zuq);
    Objects.requireNonNull(this.Zs);
    this.ZDO = new Zk5c(this.Zs::ZM, this.ZD7, this.Zub);
    this.ZDO.ZJ(this.Zuw);
  }
  
  private void ZD() {
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.ZuY);
    Objects.requireNonNull(this.ZI);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.Zw);
    Objects.requireNonNull(this.ZDO);
    Objects.requireNonNull(this.Zs);
    Zskz zskz = this.ZI.Zvm();
    this.Zuo = new Zlnu(this.ZDM.ZP(), this.ZD, this.ZuY, zskz, this.Zy, this.Zuq, this.ZDO, new Zkml(this.ZuY, this.Zu7), this.Zu7);
    this.Zuw.Zl(this.Zuo.Zk());
    this.ZO = new Zzz2(this.Zuo, zskz.ZwH(), true, this.Zuq);
  }
  
  private void ZF(Zbpe paramZbpe) {
    try {
      this.Zu3 = new Zb7(this.ZD);
      if (!this.Zua.Zu()) {
        Objects.requireNonNull(this.ZDM);
        this.ZuC = Ztks.Zs();
        this.Zz = Zbsd.ZX();
        this.Zu0 = Zmvn.ZO();
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    Zds zds = Zy();
    Ze_f.Z_().ZR(zds);
    this.ZuC = Ztks.ZW(this.Zu6, paramZbpe.Zl(), this.Zy, this.ZuY, this.ZDf);
    this.Zu9.ZZ(this.ZuC);
    this.Zu0 = ZP();
    Ztg4 ztg4 = Ztg4.ZI(this.Zua, this.ZuF, this.ZDf);
    Path path = ((Ztg4)Objects.<Ztg4>requireNonNull(ztg4)).ZH().toPath();
    this.Zz = new Zbsd(new Zk2t(this.ZD, this.Zu3, new Zgj8(path)), this.ZDM.ZR(), this.ZD);
  }
  
  private void Zr(Zbpe paramZbpe) {
    try {
      Objects.requireNonNull(this.ZDf);
      Objects.requireNonNull(this.ZDz);
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.Zu6 = !this.Zua.Zu() ? new Zgjm() : new Zt9w(Ze_f.Z_(), this::lambda$buildBrowserManager$6, paramZbpe::lambda$buildBrowserManager$7, this.ZDz);
    this.Zu9.ZZ(this.Zu6);
  }
  
  private void ZU(Zs4c paramZs4c) {
    Objects.requireNonNull(this.ZuH);
    Objects.requireNonNull(this.Za);
    Objects.requireNonNull(this.ZuF);
    Objects.requireNonNull(this.ZDc);
    this.Zr = new Zm6v(this.ZuH, paramZs4c, this.Za, this.ZuF);
    this.Zo = this.Zr.ZL(this.ZDc);
  }
  
  private void Zh() {
    Objects.requireNonNull(this.Zs);
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.ZDf);
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.ZuY);
    Objects.requireNonNull(this.ZD6);
    Objects.requireNonNull(this.ZuM);
    this.ZDF = new Ztdq(this.Zs, this.ZD, this.ZDf, this.ZuJ, this.Zy, this.ZuY, this.ZQ, this.ZuM::get, this.ZD6, this.Zu7);
  }
  
  private void ZR() {
    Objects.requireNonNull(this.ZuH);
    Objects.requireNonNull(this.ZuY);
    Objects.requireNonNull(this.Zuq);
    Objects.requireNonNull(this.Zw);
    this.Zx = new Zs0n(this.ZuH.Ze(), this.ZuY.ZB(), this.Zw, this.Zuz, this::lambda$buildMontoyaObjectFactories$8);
    this.ZE = new Zs3w(this.ZuY.ZB(), this.ZuY.ZH(), this.ZuY.Zs(), this.Zuq, this.Zw, this::lambda$buildMontoyaObjectFactories$8);
    ObjectFactoryLocator.FACTORY = this.ZE;
  }
  
  private void ZK() {
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.ZuH);
    Objects.requireNonNull(this.Zs);
    Objects.requireNonNull(this.ZC);
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.ZDf);
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.ZDF);
    Objects.requireNonNull(this.ZDR);
    this.ZDL = new Ztyg(this.ZDM, this.ZuH, this.Zs, this.ZC, this.ZD, this.ZDf, this.Zy, this.ZDF, this.ZDR, this.Zud, this.Zx, this.Zuq, this.Zu7);
    this.ZuM.set(this.ZDL);
  }
  
  private void ZV() {
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.ZD8);
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.Zuz);
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.Zm);
    Objects.requireNonNull(this.Zud);
    this.ZQ = new Zgq7(this.ZD, this.ZD8, this.ZuJ, this.Zuz, this.ZDM.ZD(), this.Zm, this.Zud, this::lambda$buildRequestResponseViewerBuilderFactory$10);
  }
  
  private void Zp() {
    this.ZS = new Zxrb(Objects.<Zgb6>requireNonNull(this.ZD), Z_(this.ZN), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zr_4>requireNonNull(this.Zuq));
  }
  
  private void Zm() {
    this.ZDR = new Ze_8(Objects.<Zsi7>requireNonNull(this.Zu6), Objects.<Ztwv>requireNonNull(this.Zy));
  }
  
  private void ZC() {
    Zzxd zzxd = new Zzxd(this.ZDb.Zk(Zeew.TARGET, Zskh.Zo, this.Zu_.ZW(Zeew.TARGET)), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zey9>requireNonNull(this.Zuz));
    Zxrn zxrn = new Zxrn(Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Ztdi>requireNonNull(this.Zuo), zzxd, Objects.<Zgb6>requireNonNull(this.ZD));
    Zxkq zxkq = new Zxkq(this.ZuY, zxrn);
    this.ZDR.Zf(zxkq);
  }
  
  private void Zb() {
    Objects.requireNonNull(this.ZDM);
    Objects.requireNonNull(this.ZuY);
    Objects.requireNonNull(this.ZD);
    Objects.requireNonNull(this.Zy);
    Objects.requireNonNull(this.Zw);
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.ZDf);
    this.ZuU = new Ze_7(this.ZDM, this.ZuY, this.ZD, this.Zy);
    this.Zc = new Zlxz(this.Zw, this.ZuU, this.ZuY.Zs(), this.ZuJ, this.ZDM.ZP(), this.ZD, this.ZDf, this.Zuz);
  }
  
  private void Z_(Zs4c paramZs4c, Zldl paramZldl, Zgdu paramZgdu, Zkf1 paramZkf1) {
    Objects.requireNonNull(this.ZuJ);
    Objects.requireNonNull(this.Zuq);
    Ztwc ztwc = new Ztwc(this.Zy, this.ZD);
    this.Zu9.ZZ(ztwc);
    this.ZuI = ztwc;
    Ze5p ze5p = new Ze5p(this.ZuJ, this.Zuq);
    this.ZDD = new Zgy2(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zgzy>requireNonNull(this.ZH), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zg1j>requireNonNull(this.ZuB), Objects.<Zkl6>requireNonNull(this.ZuY), ZV(this.ZuU), Objects.<Zlf2>requireNonNull(this.ZD1), Objects.<Zr99>requireNonNull(this.ZuX), Objects.<Zxg9>requireNonNull(this.ZuO), Objects.<Zlyd>requireNonNull(this.ZL), Objects.<Zbl2>requireNonNull(this.ZT), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zrgk>requireNonNull(this.Zb), Objects.<Ztrg>requireNonNull(this.ZDa), Objects.<Ze5p>requireNonNull(ze5p), Objects.<Zxl_>requireNonNull(this.Zj), Objects.<Zsxk>requireNonNull(this.Zp), Objects.<Zlg9>requireNonNull(this.ZS), Objects.<Zr1m>requireNonNull(this.Zo), Objects.<Zm6v>requireNonNull(this.Zr), Objects.<Zkc6>requireNonNull(this.ZG), Objects.<Zs4c>requireNonNull(paramZs4c), Objects.<Zezx>requireNonNull(this.Zuf), Objects.<Zxx6>requireNonNull(this.Zuc), Objects.<Zgdu>requireNonNull(paramZgdu), ZV(paramZldl), Objects.<Zrud>requireNonNull(this.Zu8), Objects.<Zkf1>requireNonNull(paramZkf1), Objects.<Zlcb>requireNonNull(this.Zu_), Objects.<Zkee>requireNonNull(this.Zm), Objects.<Zb86>requireNonNull(this.Zud), Z_(this.Zu3), Objects.<Zexp>requireNonNull(this.Zut), Objects.<Zxy1>requireNonNull(this.ZuI));
    Objects.requireNonNull(this.Zur);
    this.ZDi = new Zgxi(this.Zs, this.Zur);
    Zshb zshb = this.ZuN.ZD(a(-10567, -14454));
    Zr3u zr3u = new Zr3u(this::lambda$buildSuiteUi$11, new Zg1w());
    AtomicReference<Zsti> atomicReference = new AtomicReference();
    AtomicReference<Zztb> atomicReference1 = new AtomicReference();
    Objects.requireNonNull(zr3u);
    Zkhx zkhx = new Zkhx(new Zrnv(zshb, zr3u::ZD), new Zs_9(this.ZDi), atomicReference::lambda$buildSuiteUi$12, this::lambda$buildRequestResponseViewerBuilderFactory$10);
    Objects.requireNonNull(this.Z_);
    this.ZX = new Zlgj(this.Z_::get, Z_(this.ZN));
    Zsti zsti = new Zsti(zkhx, Objects.<Zzyl>requireNonNull(this.ZDi), Objects.<Zlgj>requireNonNull(this.ZX), this::lambda$buildRequestResponseViewerBuilderFactory$10, atomicReference1::lambda$buildSuiteUi$15);
    try {
      atomicReference.set(zsti);
      Objects.requireNonNull(this.ZuW);
      this.ZM = new Zlpy(this.ZuW, this::lambda$buildSuiteUi$16);
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.ZR = Zb12.ZG() ? new Zb16() : new Zg3i(Objects.<Zerg>requireNonNull(this.Zs), Objects.<WindowListener>requireNonNull(this.Zuu), Objects.<Ztsr>requireNonNull(this.ZDP), Objects.<Zl04>requireNonNull(this.ZN), Objects.<Zrud>requireNonNull(this.Zu8), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zz_s>requireNonNull(this.Zu), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Ztg4>requireNonNull(this.ZuA), Objects.<Zl0>requireNonNull(this.ZuF), Objects.<Ztwv>requireNonNull(this.Zy), this::lambda$buildRequestResponseViewerBuilderFactory$10, zsti, Objects.<Zs6i>requireNonNull(this.ZD6), Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ), Objects.<Zrny>requireNonNull(this.Zuo), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zg0s>requireNonNull(this.ZDu), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zz28>requireNonNull(this.ZM), Objects.<Zs2g>requireNonNull(this.Zuw), this.Zu7, Objects.<Zxei>requireNonNull(this.Zua), Objects.<Zebm>requireNonNull(this.ZB), Objects.<Zmhp>requireNonNull(this.ZD2));
    Zmp3 zmp3 = Zmp3.Zs();
    Zm7s zm7s = new Zm7s(this.ZR, zsti, zmp3);
    this.Zh = new Zztb(zm7s);
    atomicReference1.set(this.Zh);
  }
  
  private void Zr() {
    Zslc zslc = new Zslc(Objects.<Zxei>requireNonNull(this.Zua), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zk8l>requireNonNull(this.Zg), Objects.<Zl0>requireNonNull(this.ZuF));
    this.ZuH.ZG(Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Zr1m>requireNonNull(this.Zo), Objects.<Zslc>requireNonNull(zslc));
    this.ZuN.Zj(Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zgzy>requireNonNull(this.ZH), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ));
  }
  
  private void Ze() {
    this.ZDb = new Zlaa(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zgzy>requireNonNull(this.ZH), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zz28>requireNonNull(this.ZM), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zkc6>requireNonNull(this.ZG), Objects.<Zlg9>requireNonNull(this.ZS), Objects.<Zxy1>requireNonNull(this.ZuI));
  }
  
  private void Zr(Zs4c paramZs4c, Zxts paramZxts, Zz8a paramZz8a) {
    Objects.requireNonNull(this.ZuF);
    this.ZuL = new Zbqp(paramZxts, this.ZuF, paramZz8a);
    this.Zuv = new Zvo_(Objects.<Zbqp>requireNonNull(this.ZuL), Objects.<Zlaa>requireNonNull(this.ZDb), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Ztks>requireNonNull(this.ZuC), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zlcb>requireNonNull(this.Zu_), Objects.<Zz3j>requireNonNull(this.Zux));
    this.Zf = new Zzov(Objects.<Zlaa>requireNonNull(this.ZDb), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zlcb>requireNonNull(this.Zu_), Objects.<Zz28>requireNonNull(this.ZM), Objects.<Zkl6>requireNonNull(this.ZuY));
    this.ZV = new Zr49(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zz28>requireNonNull(this.ZM), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ), Objects.<Zmjm>requireNonNull(this.ZuH), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zkl6>requireNonNull(this.ZuY));
    this.ZD0 = new Zb5(Objects.<Zs4c>requireNonNull(paramZs4c), Objects.<Zbqp>requireNonNull(this.ZuL), Objects.<Zr49>requireNonNull(this.ZV), Objects.<Zxts>requireNonNull(paramZxts), Objects.<Zezx>requireNonNull(this.Zuf), Objects.<Zt8u>requireNonNull(this.ZD8), Objects.<Zbnt>requireNonNull(this.ZuJ), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zvo_>requireNonNull(this.Zuv), Objects.<Zm9o>requireNonNull(this.Zun));
    this.ZDU = new Zb_8(Objects.<Zs4c>requireNonNull(paramZs4c), Objects.<Zbqp>requireNonNull(this.ZuL), Objects.<Zr49>requireNonNull(this.ZV), Objects.<Zxts>requireNonNull(paramZxts), Objects.<Zezx>requireNonNull(this.Zuf), Objects.<Zt8u>requireNonNull(this.ZD8), Objects.<Zbnt>requireNonNull(this.ZuJ), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zvo_>requireNonNull(this.Zuv), Objects.<Zm9o>requireNonNull(this.Zun));
  }
  
  private void Zt() {
    this.ZZ = new Zbnt(Objects.<Zr_4>requireNonNull(this.Zw));
    Objects.requireNonNull(this.ZDT);
    this.ZuT = new Zegl(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Supplier<Zbiv>>requireNonNull(this.ZDT::get), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ), Objects.<Zmjm>requireNonNull(this.ZuH), Objects.<Zbnt>requireNonNull(this.ZZ), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zey9>requireNonNull(this.Zuz), Objects.<Zrid>requireNonNull(this.Zui), Objects.<Zs0n>requireNonNull(this.Zx), Objects.<MontoyaObjectFactory>requireNonNull(this.ZE), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zs6i>requireNonNull(this.ZD6), this.Zu7);
  }
  
  private void ZR(Zs4c paramZs4c, Zxts paramZxts, Zz8a paramZz8a) {
    this.ZJ = new Zzg2(Objects.<Zz1h>requireNonNull(this.Zub));
    this.Zu_.ZE(new Ztul(Objects.<Zgb6>requireNonNull(this.ZD), this.ZDM.ZP(), this.ZuY.Zq(), this.ZuY.Zd()));
    Zze7 zze7 = new Zze7();
    Zmsm zmsm = new Zmsm();
    this.Zl = new Zkn(zmsm, zze7, this.ZuJ, this.Zuz);
    AtomicReference<Zrfd> atomicReference = new AtomicReference();
    Zj(this.ZDT, atomicReference);
    Zruu zruu = new Zruu(this.ZDM.ZP(), this.Zy, this.ZD, this.ZH, this.ZuY, this.Zuq, this.ZuC, this.ZDb, this.Zu_, this.Zux);
    this.ZY = Zbjl.Zr(this.ZDM, this.Zup, this.ZuU, this.ZuY, this.ZDf, this.ZD, this.Zy, this.Zur.Zi());
    this.Zu9.ZZ(this.ZY);
    Zsus zsus = new Zsus(this.ZuY, this.Zuq);
    Ztmc ztmc = new Ztmc(this.ZDM.ZP(), this.ZDM.ZU(), this.ZDM.Zc(), this.ZD, this.Zs, this.ZuY, this.Zuq, this.ZJ, this.Zub, this.Zy, this.ZuC, this.ZY, this.ZDb, this.Zu_, this.Zux, zsus, this.Zu7, this.ZD4);
    Zg41 zg41 = new Zg41(this.ZDM, this.Zy, this.Zuq, this.ZY);
    Zl7y zl7y = new Zl7y(this.ZuJ, this.Zuz, zsus);
    this.ZDy = new Ztcy();
    this.ZuQ = new Zm37(this.ZDy, this.Zug, zsus);
    Function<Zs98, Zrc1> function = this::lambda$buildTaskLauncher$18;
    Zet6 zet6 = new Zet6(this.ZM, this.Zw, this.Zuq, this.ZuY.Zq());
    Zz5p zz5p = new Zz5p(zruu, ztmc, zl7y, zmsm, zze7, zet6, this.ZM, function, this.ZDy, zsus, this.ZuY);
    Zr3n zr3n = new Zr3n(zruu, ztmc, zl7y, zg41, zsus, zmsm, zze7, function, this.ZDy, this.ZuY, zet6, this.ZM, this.Zs);
    Objects.requireNonNull(this.Zu1);
    Objects.requireNonNull(this.Zu1);
    Objects.requireNonNull(this.ZDT);
    Objects.requireNonNull(this.Z_);
    Zgse zgse = new Zgse(this.ZDM, this.Zy, this.ZH, this.ZR, this.ZuS.ZmZ(), this.ZD, this.ZDL, this.ZQ, this.Zu1::get, this.Zuo, new Zs0g(this.ZuH, this.Zu1::get, this.ZuJ, this.Zy, this.Zuz), this.ZDu, this.Zuw, this.Zu, this.ZDT::get, this.Zs, this.ZuY, this.ZuT, this.Zr, this.Z_::get, this.Zu7);
    this.Ze = new Zrfd(this.ZI, zz5p, this.Zur, this.Zuk, this.Zue, this.Zuq, this.Zw, zg41, zsus, this.ZDu, paramZs4c, zr3n, zgse, this.ZDB, this.ZDh, this.ZDf, this.ZuY, this.ZDM.ZU(), this.Zuo, Zk(), Objects.<Zmvn>requireNonNull(this.Zu0), this.ZO, this.Zs, this.ZDq);
    atomicReference.set(this.Ze);
    Zgx8 zgx8 = new Zgx8(this.ZD8);
    this.Zq = new Zbiv(this.Zs, paramZs4c, this.ZuL, paramZxts, this.ZV, paramZz8a, this.Zur, this.Zuk, this.ZuY, this.Ze, this.ZDo, this.ZDE, this.Zy, this.Zw, this.Zuq, this.Zuv, this.Zf, this.ZDU, this.ZuF, zgx8, this.ZDM.ZU(), this.ZDf, this.Zun);
    this.ZDT.set(this.Zq);
    this.ZDL.Zq(this.Zq);
  }
  
  public void Zo(Zs4c paramZs4c, Zz8a paramZz8a) {
    Objects.requireNonNull(this.ZDT);
    this.ZuR = new Zk9k(this.ZDM, this.ZD, this.Zs, this.ZuY, this.Zy, this.ZuC, this.ZY, this.ZDb, this.Zu_, this.ZDL, this.ZQ, paramZs4c, paramZz8a, this.ZM, this.ZuJ, this.Zw, this.ZDz, this.Zr, this.ZDT::get, this.Zux, this.Zui, this.Zx, this.ZE, this.Zu7, this.ZD4);
  }
  
  private Zt6o Zk() {
    return this::lambda$mapManagerFactory$19;
  }
  
  private Zmvn ZP() {
    return this::lambda$browserCacheFactory$20;
  }
  
  private void Zj(AtomicReference<Zbiv> paramAtomicReference, AtomicReference<Zrfd> paramAtomicReference1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZDf : Lburp/Ztd;
    //   4: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   7: invokevirtual ZQ : (Lburp/Zeew;)Lburp/Zskh;
    //   10: astore_3
    //   11: aconst_null
    //   12: astore #4
    //   14: new burp/Zm6w
    //   17: dup
    //   18: aload_0
    //   19: getfield Zw : Lburp/Zr_4;
    //   22: aconst_null
    //   23: aload_0
    //   24: getfield ZuJ : Lburp/Zbnt;
    //   27: aload_0
    //   28: getfield Zuz : Lburp/Zey9;
    //   31: invokespecial <init> : (Lburp/Zr_4;Lburp/Ztg4;Lburp/Zbnt;Lburp/Zey9;)V
    //   34: iconst_1
    //   35: invokevirtual ZH : (Z)Lburp/Zm6w;
    //   38: invokevirtual ZT : ()Lburp/Zm6w;
    //   41: invokevirtual Zo : ()Lburp/Zlu6;
    //   44: astore #4
    //   46: goto -> 59
    //   49: astore #5
    //   51: aload #5
    //   53: getstatic net/portswigger/Zk_.IMPOSSIBLE : Lnet/portswigger/Zk_;
    //   56: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   59: aload_0
    //   60: getfield Zuq : Lburp/Zr_4;
    //   63: invokeinterface Zi : ()Z
    //   68: ifeq -> 102
    //   71: aload_0
    //   72: getfield Zw : Lburp/Zr_4;
    //   75: aload_0
    //   76: getfield Zuq : Lburp/Zr_4;
    //   79: invokeinterface Zl : ()Lburp/Zkit;
    //   84: aload #4
    //   86: getstatic burp/Zl2m.ZO : Lburp/Zl2m;
    //   89: getstatic burp/Zsa2.Zo : Lburp/Zkqo;
    //   92: invokestatic Zi : (Lburp/Zr_4;Lburp/Zkit;Lburp/Ze24;Lburp/Zl2m;Lburp/Zkqo;)Lburp/Ztg8;
    //   95: goto -> 105
    //   98: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   101: athrow
    //   102: getstatic burp/Ztg8.ZJ : Lburp/Ztg8;
    //   105: astore #5
    //   107: aload_0
    //   108: new burp/Zk20
    //   111: dup
    //   112: aload_0
    //   113: <illegal opcode> get : (Lburp/Zxpn;)Ljava/util/function/Supplier;
    //   118: aload_0
    //   119: getfield ZDM : Lburp/Zz0n;
    //   122: aload_0
    //   123: getfield ZuH : Lburp/Zt4u;
    //   126: aload_1
    //   127: dup
    //   128: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   137: aload_0
    //   138: getfield ZD : Lburp/Zbqx;
    //   141: aload_0
    //   142: getfield ZuY : Lburp/Zkl6;
    //   145: invokeinterface ZB : ()Lburp/Zbnt;
    //   150: aload_0
    //   151: getfield Zy : Lburp/Ztwv;
    //   154: aload_0
    //   155: getfield Zuq : Lburp/Zr_4;
    //   158: aload_0
    //   159: getfield Zw : Lburp/Zr_4;
    //   162: aload #5
    //   164: aload_0
    //   165: getfield Zuk : Lburp/Zzkr;
    //   168: aload_2
    //   169: dup
    //   170: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   173: pop
    //   174: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   179: aload_0
    //   180: getfield ZF : Lburp/Ztoi;
    //   183: aload_0
    //   184: aload_3
    //   185: <illegal opcode> get : (Lburp/Zxpn;Lburp/Zskh;)Ljava/util/function/Supplier;
    //   190: aload_0
    //   191: getfield Zu7 : Lburp/Zm6x;
    //   194: invokespecial <init> : (Ljava/util/function/Supplier;Lburp/Zz0n;Lburp/Zt4u;Ljava/util/function/Supplier;Lburp/Zgb6;Lburp/Zbnt;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zr_4;Lburp/Ztg8;Lburp/Zzkr;Ljava/util/function/Supplier;Lburp/Zlli;Ljava/util/function/Supplier;Lburp/Zm6x;)V
    //   197: putfield ZuP : Lburp/Zk20;
    //   200: new burp/Zesj
    //   203: dup
    //   204: aload_0
    //   205: getfield ZuH : Lburp/Zt4u;
    //   208: invokespecial <init> : (Lburp/Zmjm;)V
    //   211: astore #6
    //   213: new burp/Zzcv
    //   216: dup
    //   217: aload_0
    //   218: getfield ZuH : Lburp/Zt4u;
    //   221: aload_0
    //   222: getfield Zs : Lburp/Zerg;
    //   225: aload_1
    //   226: dup
    //   227: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   230: pop
    //   231: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   236: aload_0
    //   237: getfield ZuY : Lburp/Zkl6;
    //   240: aload_0
    //   241: getfield Zur : Lburp/Zrag;
    //   244: aload_0
    //   245: getfield ZD8 : Lburp/Zt8u;
    //   248: aload_0
    //   249: getfield ZDL : Lburp/Ztyg;
    //   252: aload_0
    //   253: getfield Zu7 : Lburp/Zm6x;
    //   256: invokespecial <init> : (Lburp/Zt4u;Lburp/Zerg;Ljava/util/function/Supplier;Lburp/Zkl6;Lburp/Zgao;Lburp/Zb_j;Lburp/Ztyg;Lburp/Zm6x;)V
    //   259: astore #7
    //   261: aload_0
    //   262: new burp/Zt2h
    //   265: dup
    //   266: invokespecial <init> : ()V
    //   269: putfield ZDv : Lburp/Zkve;
    //   272: aload_0
    //   273: new burp/Zllh
    //   276: dup
    //   277: aload_0
    //   278: getfield ZuH : Lburp/Zt4u;
    //   281: invokevirtual ZN : ()Lburp/Zzir;
    //   284: invokeinterface Zv9 : ()Lburp/Zz4b;
    //   289: invokespecial <init> : (Lburp/Zz4b;)V
    //   292: putfield Zi : Lburp/Zllh;
    //   295: aload_0
    //   296: new burp/Zew2
    //   299: dup
    //   300: aload_0
    //   301: getfield ZDM : Lburp/Zz0n;
    //   304: aload_0
    //   305: getfield ZuH : Lburp/Zt4u;
    //   308: aload_0
    //   309: getfield Zs : Lburp/Zerg;
    //   312: aload_0
    //   313: getfield ZC : Lburp/Zgbj;
    //   316: aload_0
    //   317: getfield ZD : Lburp/Zbqx;
    //   320: aload_0
    //   321: getfield ZR : Lburp/Zxgc;
    //   324: aload_0
    //   325: getfield ZDf : Lburp/Ztd;
    //   328: aload_0
    //   329: getfield ZuY : Lburp/Zkl6;
    //   332: aload_0
    //   333: getfield Zuy : Ljava/util/concurrent/atomic/AtomicReference;
    //   336: dup
    //   337: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   340: pop
    //   341: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   346: aload_0
    //   347: getfield ZR : Lburp/Zxgc;
    //   350: invokeinterface ZK1 : ()Lburp/Zl04;
    //   355: aload_0
    //   356: getfield Zy : Lburp/Ztwv;
    //   359: aload_0
    //   360: getfield Zuq : Lburp/Zr_4;
    //   363: aload_0
    //   364: getfield Zw : Lburp/Zr_4;
    //   367: aload_1
    //   368: dup
    //   369: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   372: pop
    //   373: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   378: aload_0
    //   379: getfield ZDL : Lburp/Ztyg;
    //   382: aload_0
    //   383: getfield ZQ : Lburp/Zgq7;
    //   386: aload_0
    //   387: getfield Zl : Lburp/Zkn;
    //   390: aload_0
    //   391: aload_3
    //   392: <illegal opcode> get : (Lburp/Zxpn;Lburp/Zskh;)Ljava/util/function/Supplier;
    //   397: aload_0
    //   398: getfield ZuP : Lburp/Zk20;
    //   401: aload #6
    //   403: aload_0
    //   404: getfield ZuF : Lnet/portswigger/Zl0;
    //   407: aload #7
    //   409: aload_0
    //   410: getfield Zue : Lburp/Zxwj;
    //   413: aload_3
    //   414: aload_0
    //   415: getfield ZDv : Lburp/Zkve;
    //   418: aload #5
    //   420: aload_0
    //   421: getfield Zu1 : Ljava/util/concurrent/atomic/AtomicReference;
    //   424: dup
    //   425: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   428: pop
    //   429: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Supplier;
    //   434: aload_0
    //   435: <illegal opcode> get : (Lburp/Zxpn;)Ljava/util/function/Supplier;
    //   440: aload_0
    //   441: getfield ZDi : Lburp/Zgxi;
    //   444: invokestatic ZG : ()Z
    //   447: aload_0
    //   448: getfield ZDh : Lburp/Zxea;
    //   451: new burp/Zmsg
    //   454: dup
    //   455: invokespecial <init> : ()V
    //   458: aload_0
    //   459: getfield Zv : Lburp/Zxa;
    //   462: aload_0
    //   463: getfield Zux : Lburp/Zz3j;
    //   466: aload_0
    //   467: getfield ZD8 : Lburp/Zt8u;
    //   470: aload_0
    //   471: getfield Zi : Lburp/Zllh;
    //   474: sipush #500
    //   477: new burp/Zkr
    //   480: dup
    //   481: invokespecial <init> : ()V
    //   484: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zerg;Lburp/Zgbj;Lburp/Zgb6;Lburp/Zxgc;Lburp/Zskh;Lburp/Zkl6;Ljava/util/function/Supplier;Lburp/Zl04;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zr_4;Ljava/util/function/Supplier;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zkn;Ljava/util/function/Supplier;Lburp/Zsw5;Lburp/Zmo9;Lnet/portswigger/Zl0;Lburp/Zlpb;Lburp/Zxwj;Lburp/Zskh;Lburp/Zrgm;Lburp/Ztg8;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Lburp/Zgxi;ZLburp/Zxea;Lburp/Zzc3;Lburp/Zxa;Lburp/Zz3j;Lburp/Zb_j;Lburp/Zllh;ILburp/Zmw4;)V
    //   487: putfield ZDB : Lburp/Zew2;
    //   490: return
    // Exception table:
    //   from	to	target	type
    //   14	46	49	burp/Zev3
    //   59	98	98	burp/Zev3
  }
  
  private void ZM() {
    Zz1z zz1z = new Zz1z(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Zbnt>requireNonNull(this.ZuJ), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Ztdq>requireNonNull(this.ZDF), Objects.<Ze8b>requireNonNull(this.ZDC), Objects.<Zbiv>requireNonNull(this.Zq), this.Zu7);
    this.ZP = new Zrxq(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zz_r>requireNonNull(this.ZD7), Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zgzy>requireNonNull(this.ZH), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zbnt>requireNonNull(this.ZuJ), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ), Objects.<Zz1z>requireNonNull(zz1z), Objects.<Ztdq>requireNonNull(this.ZDF), Objects.<Ze8b>requireNonNull(this.ZDC), Objects.<Zbiv>requireNonNull(this.Zq), Objects.<Zrag>requireNonNull(this.Zur), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zlaa>requireNonNull(this.ZDb), Objects.<Zlcb>requireNonNull(this.Zu_), Objects.<Zm6v>requireNonNull(this.Zr), Objects.<Zs6i>requireNonNull(this.ZD6), this.Zu7);
    this.Z_.set(this.ZP);
  }
  
  private void Zz() {
    this.ZW = new Zsuv(Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zz4b>requireNonNull(this.Zug), Objects.<Zbiv>requireNonNull(this.Zq));
  }
  
  private void Zl() {
    try {
      this.ZuZ = new Zr34();
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.Zd = Zb12.ZG() ? Zic.ZV : new Zl6t(Objects.<Zgy2>requireNonNull(this.ZDD), Objects.<Zr34>requireNonNull(this.ZuZ));
  }
  
  private void Z_() {
    Zsg6 zsg6 = new Zsg6(this.ZDM, this.ZuY, this.ZD);
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    String str = (System.getProperty(a(-10561, -14455)) != null) ? System.getProperty(a(-10566, -5787)) : Zzja.ZR;
    Zlwg zlwg = new Zlwg(this.Zua, this.ZuJ, this.ZuY, zsg6, str);
    Zbn7 zbn7 = zlwg.Zt();
    this.ZB = new Zebm();
    this.Zu5 = new Zz1v(zbn7, this.ZB);
    this.ZD2 = new Zmhp(new Zgqy(this.ZB, zbn7));
  }
  
  private void ZB() {
    this.ZDW = new Ztha(this.Zu5);
    Zji zji = new Zji();
    Zmo4 zmo4 = new Zmo4(this.Zu5);
    Zer_ zer_ = new Zer_();
    Ztos<Zt3y> ztos = new Ztos<>(Zt1w.Zs());
    Zja zja = new Zja();
    this.Zun = new Zm9o(zmo4, zji, zer_, (Ztos)ztos, zja);
    this.ZD4 = new Zmr3(this.Zu5);
    this.Zt = new Zz37(this.Zu5, this.ZDW);
  }
  
  private void ZA() {
    Zkc0 zkc0 = new Zkc0(this.ZD, this.ZDM.ZD(), this.Zy);
    Zr6a zr6a = new Zr6a(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zz_r>requireNonNull(this.ZD7), Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zgzy>requireNonNull(this.ZH), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zlor>requireNonNull(this.ZuW), Objects.<Zt8u>requireNonNull(this.ZD8), Objects.<Zml>requireNonNull(this.Zus), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Ztg4>requireNonNull(this.ZuA), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Ztyg>requireNonNull(this.ZDL), Objects.<Zgq7>requireNonNull(this.ZQ), Objects.<Ztdq>requireNonNull(this.ZDF), Objects.<Zs2g>requireNonNull(this.Zuw), Objects.<Zrz>requireNonNull(this.ZuV), Objects.<Zm6v>requireNonNull(this.Zr), Objects.<Zr1m>requireNonNull(this.Zo), Objects.<Zlx6>requireNonNull(this.ZG), Objects.<Ze8b>requireNonNull(this.ZDC), Objects.<Zlnu>requireNonNull(this.Zuo), Objects.<Zrxq>requireNonNull(this.ZP), ZV(this.ZuU), ZV(this.Zc), Objects.<Zrag>requireNonNull(this.Zur), Objects.<Zg0s>requireNonNull(this.ZDu), Objects.<Zbiv>requireNonNull(this.Zq), Objects.<Zxwj>requireNonNull(this.Zue), Objects.<Zkn>requireNonNull(this.Zl), Objects.<Zzg2>requireNonNull(this.ZJ), Objects.<Zm37>requireNonNull(this.ZuQ), Objects.<Ztcy>requireNonNull(this.ZDy), Objects.<Zzkr>requireNonNull(this.Zuk), Objects.<Zzzt>requireNonNull(this.Zk), Objects.<Zbp5>requireNonNull(this.ZA), Objects.<Zzw2>requireNonNull(this.ZuD), Objects.<Zlaa>requireNonNull(this.ZDb), Objects.<Zbsd>requireNonNull(this.Zz), Objects.<Zl77>requireNonNull(this.Zu_), Objects.<Zegl>requireNonNull(this.ZuT), Objects.<Zbnt>requireNonNull(this.ZZ), Objects.<Zew2>requireNonNull(this.ZDB), Objects.<Zsw5>requireNonNull(this.ZuP), Objects.<Zkve>requireNonNull(this.ZDv), Objects.<Zsuv>requireNonNull(this.ZW), Objects.<Ztoi>requireNonNull(this.ZF), Objects.<Zs0n>requireNonNull(this.Zx), Objects.<Zr34>requireNonNull(this.ZuZ), this::lambda$buildRequestResponseViewerBuilderFactory$10, Objects.<Zkc0>requireNonNull(zkc0), Objects.<Zxa>requireNonNull(this.Zv), Objects.<Zkf3>requireNonNull(this.ZO), Objects.<Zgf2>requireNonNull(this.ZuR), Objects.<Zrid>requireNonNull(this.Zui), Objects.<MontoyaObjectFactory>requireNonNull(this.ZE), Objects.<Zz3j>requireNonNull(this.Zux), Objects.<Zs6i>requireNonNull(this.ZD6), Objects.<Zllh>requireNonNull(this.Zi), this.Zu7, Objects.<Zz37>requireNonNull(this.Zt));
    this.Zs.Zj(zr6a);
    this.Zu1.set(this.Zs.Zk());
    this.Zuy.set((Zkr6)this.Zs.ZI(Zeew.INTRUDER));
  }
  
  private void Zc() {
    try {
      this.ZD.ZK_();
      this.ZH.ZI(Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zr_4>requireNonNull(this.Zw), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zm39>requireNonNull(this.ZuS.ZmM()), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zra1>requireNonNull(this.ZDz), Objects.<Ztks>requireNonNull(this.ZuC));
      this.ZD.ZT(this.ZR);
      this.ZDi.Za(Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zbiv>requireNonNull(this.Zq), Objects.<Zlgj>requireNonNull(this.ZX));
      if (Zrvs.Z_(this.ZD8))
        this.ZC.Zy(this::Za); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void Za() {
    (new Zrvs(this.ZN, this.ZD8)).setVisible(true);
  }
  
  private void Zn() {
    this.Zs.ZT();
    this.Zs.ZI();
    this.ZuK.Zi(this.Zs);
  }
  
  private void ZR(Zrej paramZrej, Zs4c paramZs4c, Zgdu paramZgdu) throws Ze0d, Zxcc {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Zu : ()V
    //   4: invokestatic ZL : ()I
    //   7: aload_0
    //   8: getfield ZD : Lburp/Zbqx;
    //   11: aload_3
    //   12: invokevirtual Zd : (Lburp/Zm3g;)V
    //   15: istore #4
    //   17: aload_0
    //   18: getfield ZDx : Lburp/Zz7x;
    //   21: invokevirtual Zg : ()Z
    //   24: ifeq -> 50
    //   27: aload_0
    //   28: getfield Zs : Lburp/Zerg;
    //   31: aload_0
    //   32: getfield ZD8 : Lburp/Zt8u;
    //   35: invokevirtual ZU : (Lburp/Zb_j;)V
    //   38: iload #4
    //   40: ifeq -> 64
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   49: athrow
    //   50: aload_0
    //   51: getfield Zs : Lburp/Zerg;
    //   54: invokevirtual ZG : ()V
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   63: athrow
    //   64: aload_1
    //   65: getfield Ze : Z
    //   68: ifeq -> 112
    //   71: aload_0
    //   72: getfield ZD8 : Lburp/Zt8u;
    //   75: sipush #-10570
    //   78: sipush #28278
    //   81: invokestatic a : (II)Ljava/lang/String;
    //   84: invokeinterface Zn : (Ljava/lang/String;)Ljava/lang/String;
    //   89: astore #5
    //   91: aload_0
    //   92: getfield ZD : Lburp/Zbqx;
    //   95: sipush #-10565
    //   98: sipush #-31347
    //   101: invokestatic a : (II)Ljava/lang/String;
    //   104: aload #5
    //   106: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   109: invokevirtual ZHg : (Z)V
    //   112: new burp/Zlaq
    //   115: dup
    //   116: aload_0
    //   117: getfield ZDc : Lburp/Zmv8;
    //   120: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   123: checkcast burp/Zm3g
    //   126: aload_0
    //   127: getfield Za : Lburp/Zlal;
    //   130: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   133: checkcast burp/Zlal
    //   136: invokespecial <init> : (Lburp/Zm3g;Lburp/Zlal;)V
    //   139: astore #5
    //   141: aload_0
    //   142: aload #5
    //   144: aload_1
    //   145: aload_2
    //   146: aload_0
    //   147: getfield ZDf : Lburp/Ztd;
    //   150: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   153: checkcast burp/Zskh
    //   156: invokevirtual ZW : (Lburp/Zlaq;Lburp/Zrej;Lburp/Zs4c;Lburp/Zskh;)V
    //   159: aload_0
    //   160: invokevirtual Zy : ()Lnet/portswigger/browser/Zds;
    //   163: astore #6
    //   165: invokestatic Z_ : ()Lnet/portswigger/browser/service/Zg;
    //   168: aload #6
    //   170: invokeinterface ZR : (Lnet/portswigger/browser/Zds;)V
    //   175: return
    // Exception table:
    //   from	to	target	type
    //   17	43	46	burp/Ze0d
    //   27	57	60	burp/Ze0d
  }
  
  private void Zv() {
    this.Zn = new Zen4(Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zr1m>requireNonNull(this.Zo));
  }
  
  private void Zd() {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.Zuj = Zb12.ZG() ? null : new Zl4w(Objects.<Window>requireNonNull(this.ZN), Objects.<Zic>requireNonNull(this.Zd), Objects.<Zen4>requireNonNull(this.Zn));
    this.Zuc.Zz(Objects.<Zz28>requireNonNull(this.ZM), this.Zd);
    this.ZR.Zr(this.Zd);
    this.ZDi.Zi(this.Zuj);
  }
  
  private void Zw(Zt90 paramZt90) {
    Zmc1 zmc1 = new Zmc1(Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zlgj>requireNonNull(this.ZX), Z_(this.Zuj), Objects.<Zen4>requireNonNull(this.Zn));
    Zr0o zr0o = new Zr0o(Objects.<Zerg>requireNonNull(this.Zs), Objects.<Zgbj>requireNonNull(this.ZC), Objects.<Zskh>requireNonNull(this.ZDf), Objects.<Zz28>requireNonNull(this.ZM), Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zz0n>requireNonNull(this.ZDM), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zt4u>requireNonNull(this.ZuH), Objects.<Ztwv>requireNonNull(this.Zy), Objects.<Zr_4>requireNonNull(this.Zuq), Objects.<Zbnt>requireNonNull(this.ZuJ), Objects.<Zey9>requireNonNull(this.Zuz), Objects.<Ztg4>requireNonNull(this.ZuA), Objects.<Zzzt>requireNonNull(this.Zk), Objects.<Zen4>requireNonNull(this.Zn));
    Zztm zztm = new Zztm(Objects.<Zxei>requireNonNull(this.Zua), Objects.<Zzxi>requireNonNull(this.Zu2), Objects.<Zt90>requireNonNull(paramZt90), Objects.<Zrzg>requireNonNull(this.ZDM.ZR()), Objects.<Zt8u>requireNonNull(this.ZD8), Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zkl6>requireNonNull(this.ZuY), Objects.<Zb_l>requireNonNull(this.Zum), Objects.<Zrud>requireNonNull(this.Zu8), new Zmgs[] { new Zs2h(this.Zuq), new Zecf(this.Zs), new Zbji(this.Zs), Objects.<Zmgs>requireNonNull(this.Zur), Objects.<Zmgs>requireNonNull(this.ZH.Zy()), new Zr_9() });
    this.ZDV.Zo(this.ZR);
    this.ZR.Zu(zmc1.Zr(), zr0o.ZT(), this.Zh, zztm, this.ZDf, this.ZDb);
  }
  
  private void ZO() {
    Zbm8 zbm8 = this.ZuL.Zi(this.Zuj, this.ZD0);
    this.ZuZ.Zt(zbm8);
  }
  
  private void Zg() {
    try {
      this.Zd.ZM(Objects.<Zxgc>requireNonNull(this.ZR), Objects.<Zslu>requireNonNull(this.ZM), Objects.<Zlaa>requireNonNull(this.ZDb));
      if (this.Zuj != null) {
        Objects.requireNonNull(this.Zuj);
        Zbsv.Zb(this.Zuj::Zh);
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void ZU() {
    this.ZuN.ZH(Objects.<Zgx0>requireNonNull(this.ZP), Objects.<Zl_d>requireNonNull(this.ZDs), Objects.<Zlaa>requireNonNull(this.ZDb));
  }
  
  private void ZV(Zrej paramZrej, Zz8a paramZz8a) {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      this.ZD5 = (this.Zs.Zk() != null) ? this.Zs.Zk() : Zm0l.Zt;
      if (paramZrej.Zf)
        this.Ze.Za(this.ZD5); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramZrej.Zf) {
        try {
          if (this.ZDt) {
            this.Ze.ZR(paramZz8a, this.ZD5, Objects.<Zr_4>requireNonNull(this.Zw));
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
    this.Ze.ZR(paramZz8a, this.ZD5, Objects.<Zr_4>requireNonNull(this.Zw));
  }
  
  private void Zq(Zldl paramZldl, Zmx0 paramZmx0, Zr18 paramZr18, Zz8a paramZz8a) {
    if (paramZldl != null) {
      this.Zu9.ZZ(paramZldl);
      paramZr18.ZH(Objects.<Zgbj>requireNonNull(this.ZC));
      Zlbo zlbo = new Zlbo(Objects.<Ztj>requireNonNull(this.ZuE.<Ztj>Zr(Ztj.class)), Objects.<Zzb4>requireNonNull(Zrf1.Za), Objects.<Zg0s>requireNonNull(this.ZDu), Objects.<Zra1>requireNonNull(this.Zu2.ZM()), Objects.<Zx46>requireNonNull(this.Zul), Objects.<Zbnt>requireNonNull(this.ZZ), Objects.<Zmx0>requireNonNull(paramZmx0));
      try {
        this.ZuE.<Zskh>Za(Zskh.class, this.ZDf).<Zlbo>Za(Zlbo.class, zlbo).<Zrfd>Za(Zrfd.class, this.Ze).<Zm0l>Za(Zm0l.class, this.ZD5).<Zkl6>Za(Zkl6.class, this.ZuY).<Zr_4>Za(Zr_4.class, this.Zw).<Zzkr>Za(Zzkr.class, this.Zuk).<Zz6q>Za(Zz6q.class, new Zz6q(paramZz8a)).<Ztks>Za(Ztks.class, this.ZuC).<Ztwv>Za(Ztwv.class, this.Zy).<Zgb6>Za(Zgb6.class, this.ZD).<Zlaa>Za(Zlaa.class, this.ZDb).<Zl77>Za(Zl77.class, this.Zu_).<Ztdi>Za(Ztdi.class, this.Zuo).<Zrag>Za(Zrag.class, Objects.<Zrag>requireNonNull(this.Zur)).<Zsi7>Za(Zsi7.class, Objects.<Zsi7>requireNonNull(this.Zu6)).<Zx46>Za(Zx46.class, Objects.<Zx46>requireNonNull(this.Zul)).Za(Zzov.class, Objects.<Zzov>requireNonNull(this.Zf));
        if (this.Zuq.Zi())
          this.ZuE.Za(Zkit.class, this.Zuq.Zl()); 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      paramZldl.ZE();
    } 
  }
  
  private void ZQ() {
    ZU(this.Zuq);
    ZU(this.Zw);
  }
  
  private boolean ZG(Zr_4 paramZr_4, Zkh paramZkh, Zskh paramZskh) {
    if (paramZr_4.Zi()) {
      Zkit zkit = paramZr_4.Zl();
      try {
        if (zkit.ZB()) {
          ZF(paramZkh, paramZskh, zkit);
          return false;
        } 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      try {
        if (zkit.ZZ() > 201) {
          try {
            Zm2.ZC(Zrrh.PROJECT_FILE_OPENED_IN_EARLIER_VERSION_OF_BURP_THAN_IT_WAS_CREATED);
          } catch (Zkfw zkfw) {
            throw a(null);
          } 
          boolean bool = (zkit.ZH() > 201) ? true : false;
          try {
            if (bool)
              Zm2.ZC(Zrrh.PROJECT_FILE_OPENED_IN_EARLIER_VERSION_OF_BURP_THAN_IT_IS_COMPATIBLE); 
          } catch (Zkfw zkfw) {
            throw a(null);
          } 
          try {
            if (!paramZkh.ZN(bool))
              return false; 
          } catch (Zkfw zkfw) {
            throw a(null);
          } 
          try {
            this.ZDs.Zw();
            Zah.Zq();
          } catch (Zkfw zkfw) {
            throw a(null);
          } 
          Zmgc zmgc = bool ? Zmgc.USING_NEWER_INCOMPATIBLE_PROJECT : Zmgc.USING_NEWER_PROJECT;
          zmgc.ZV(paramZskh.Zz(), new Object[0]);
          return true;
        } 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
      try {
        if (Zh(zkit)) {
          ZF(paramZkh, paramZskh, zkit);
          return false;
        } 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  private void ZF(Zkh paramZkh, Zskh paramZskh, Zkit paramZkit) {
    Zmgc.CORRUPT_DATA_IDENTIFIED.ZD(paramZskh.Zz(), new Object[0]);
    paramZkh.Zo(paramZkit, this.Zg, this.ZC, this.ZuA, this.ZDe);
  }
  
  private boolean Zh(Zkit paramZkit) {
    return (new Zgif()).Zq(paramZkit);
  }
  
  private void Ze(Zrej paramZrej) {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: getfield ZM : Z
    //   8: ifeq -> 28
    //   11: getstatic burp/Zrrh.SUITE_PROJECTS_CREATE_TEMPORARY : Lburp/Zrrh;
    //   14: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   17: iload_2
    //   18: ifne -> 72
    //   21: goto -> 28
    //   24: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   27: athrow
    //   28: aload_1
    //   29: getfield Zf : Z
    //   32: ifeq -> 59
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   41: athrow
    //   42: getstatic burp/Zrrh.SUITE_PROJECTS_OPEN_EXISTING_PROJECT_ON_DISK : Lburp/Zrrh;
    //   45: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   48: iload_2
    //   49: ifne -> 72
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   58: athrow
    //   59: getstatic burp/Zrrh.SUITE_PROJECTS_CREATE_PROJECT_ON_DISK : Lburp/Zrrh;
    //   62: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   71: athrow
    //   72: aload_1
    //   73: getfield Zo : Z
    //   76: ifeq -> 96
    //   79: getstatic burp/Zrrh.SUITE_PROJECTS_OPEN_PROJECT_WITH_DEFAULT_OPTIONS : Lburp/Zrrh;
    //   82: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   85: iload_2
    //   86: ifne -> 210
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: aload_1
    //   97: getfield ZM : Z
    //   100: ifne -> 160
    //   103: goto -> 110
    //   106: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   109: athrow
    //   110: aload_1
    //   111: getfield Zf : Z
    //   114: ifeq -> 160
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   123: athrow
    //   124: aload_1
    //   125: getfield Zj : Ljava/util/List;
    //   128: invokeinterface isEmpty : ()Z
    //   133: ifeq -> 160
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   142: athrow
    //   143: getstatic burp/Zrrh.SUITE_PROJECTS_OPEN_PROJECT_WITH_OPTIONS_SAVED_WITH_PROJECT : Lburp/Zrrh;
    //   146: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   149: iload_2
    //   150: ifne -> 210
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   159: athrow
    //   160: aload_1
    //   161: getfield Zj : Ljava/util/List;
    //   164: invokeinterface isEmpty : ()Z
    //   169: ifne -> 196
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   178: athrow
    //   179: getstatic burp/Zrrh.SUITE_PROJECTS_OPEN_PROJECT_WITH_OPTIONS_FROM_CONFIG_FILE : Lburp/Zrrh;
    //   182: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   185: iload_2
    //   186: ifne -> 210
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   195: athrow
    //   196: iconst_0
    //   197: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   200: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   209: athrow
    //   210: return
    // Exception table:
    //   from	to	target	type
    //   4	21	24	burp/Zkfw
    //   11	35	38	burp/Zkfw
    //   28	52	55	burp/Zkfw
    //   42	65	68	burp/Zkfw
    //   72	89	92	burp/Zkfw
    //   79	103	106	burp/Zkfw
    //   96	117	120	burp/Zkfw
    //   110	136	139	burp/Zkfw
    //   124	153	156	burp/Zkfw
    //   143	172	175	burp/Zkfw
    //   160	189	192	burp/Zkfw
    //   179	203	206	burp/Zkfw
  }
  
  private void ZU(Zr_4 paramZr_4) {
    if (paramZr_4 != null)
      try {
        paramZr_4.close();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      }  
  }
  
  private Zr_4 Zh(Zb31 paramZb31, Zrej paramZrej) throws Zev3 {
    try {
      if (paramZrej.ZM)
        return paramZb31.ZC(); 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    try {
      if (paramZrej.Zf) {
        this.Zu4 = true;
        return paramZb31.ZX(paramZrej.ZJ.getAbsolutePath());
      } 
    } catch (Zev3 zev3) {
      throw a(null);
    } 
    return paramZb31.Zz(paramZrej.ZJ.getAbsolutePath());
  }
  
  public static Zefg<Zb2e> Zd(Zz4b paramZz4b) {
    try {
      return paramZz4b.ZVQ();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private void ZW(Zlaq paramZlaq, Zrej paramZrej, Zs4c paramZs4c, Zskh paramZskh) throws Ze0d, Zxcc {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore #5
    //   5: aload_2
    //   6: getfield Zo : Z
    //   9: ifeq -> 30
    //   12: aload_0
    //   13: aload_3
    //   14: aload_1
    //   15: invokevirtual ZJ : (Lburp/Zs4c;Lburp/Zlaq;)V
    //   18: iload #5
    //   20: ifne -> 45
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   29: athrow
    //   30: aload_0
    //   31: aload_3
    //   32: aload_1
    //   33: aload #4
    //   35: invokevirtual ZB : (Lburp/Zs4c;Lburp/Zlaq;Lburp/Zskh;)V
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   44: athrow
    //   45: new burp/Zz0e
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #6
    //   54: aload_2
    //   55: getfield Zj : Ljava/util/List;
    //   58: invokeinterface iterator : ()Ljava/util/Iterator;
    //   63: astore #7
    //   65: aload #7
    //   67: invokeinterface hasNext : ()Z
    //   72: ifeq -> 100
    //   75: aload #7
    //   77: invokeinterface next : ()Ljava/lang/Object;
    //   82: checkcast java/io/File
    //   85: astore #8
    //   87: aload_0
    //   88: aload #8
    //   90: aload #6
    //   92: invokevirtual Zk : (Ljava/io/File;Lburp/Zz0e;)V
    //   95: iload #5
    //   97: ifne -> 65
    //   100: aload #6
    //   102: invokevirtual ZO : ()Lburp/Zzkm;
    //   105: astore #7
    //   107: aload_2
    //   108: invokevirtual Za : ()Z
    //   111: ifeq -> 163
    //   114: aload #7
    //   116: iconst_3
    //   117: anewarray java/lang/String
    //   120: dup
    //   121: iconst_0
    //   122: sipush #-10568
    //   125: sipush #-14993
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: aastore
    //   132: dup
    //   133: iconst_1
    //   134: sipush #-10572
    //   137: sipush #-18422
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: aastore
    //   144: dup
    //   145: iconst_2
    //   146: sipush #-10571
    //   149: sipush #27156
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: aastore
    //   156: invokeinterface ZE : ([Ljava/lang/String;)Lburp/Zmf_;
    //   161: astore #7
    //   163: aload_1
    //   164: aload #7
    //   166: getstatic burp/Zqw.Zj : [Ljava/lang/String;
    //   169: invokevirtual ZC : (Lburp/Zmf_;[Ljava/lang/String;)V
    //   172: return
    // Exception table:
    //   from	to	target	type
    //   5	23	26	burp/Ze0d
    //   12	38	41	burp/Ze0d
  }
  
  private void ZJ(Zs4c paramZs4c, Zlaq paramZlaq) {
    paramZlaq.ZC(paramZs4c.ZD(new String[0]), Zqw.Zj);
  }
  
  private void ZB(Zs4c paramZs4c, Zlaq paramZlaq, Zskh paramZskh) {
    try {
      if (this.Zuh != null)
        try {
          if (!this.Zuh.isEmpty()) {
            paramZlaq.ZC(paramZs4c.ZD(new String[0]), this.Zuh.<String>toArray(new String[0]));
            Zmgc.PROJECT_CONFIG_CORRUPTION_REPAIR.ZK(paramZskh.Zz(), new Object[0]);
          } 
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void Zk(File paramFile, Zz0e paramZz0e) throws Ze0d, Zxcc {
    try {
      paramZz0e.ZC(Zs6n.Zr(paramFile, this.ZDM.ZM(), Zae.Z_));
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.USER_ERROR);
      throw new Zxcc(Zrgs.COULD_NOT_LOAD_CONFIGURATION_FILE, paramFile.getAbsolutePath());
    } 
  }
  
  private Zzir Zj(Zkh paramZkh, Zr_4 paramZr_4, Zrej paramZrej, String paramString) {
    Zzir zzir = paramZr_4.<Zzir>Zj(Zzir.Zg);
    try {
      if (paramZr_4.Zi())
        try {
          if (paramZr_4.Zl().ZZ() < Zrnb.Zk)
            this.ZDt = true; 
        } catch (Throwable throwable) {
          throw a(null);
        }  
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      try {
        Zk(zzir);
      } catch (Throwable throwable) {
        throw a(null);
      } 
      boolean bool = !paramString.equals(zzir.ZvN()) ? true : false;
      try {
        ZK(paramZkh, zzir, bool, paramZrej.Zf);
        Zw(paramZkh, paramZrej, bool);
        if (bool)
          zzir.ZSI(paramString); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    return zzir;
  }
  
  private void Zw(Zkh paramZkh, Zrej paramZrej, boolean paramBoolean) {
    try {
      if (this.ZDz == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT) {
        paramZrej.ZH(true);
        return;
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (Zb12.ZG())
        return; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    try {
      if (paramZrej.Zf)
        try {
          if (!paramZrej.Za())
            try {
              if (paramBoolean)
                try {
                  if (paramZkh.ZP())
                    paramZrej.ZH(true); 
                } catch (Zkfw zkfw) {
                  throw a(null);
                }  
            } catch (Zkfw zkfw) {
              throw a(null);
            }  
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void ZK(Zkh paramZkh, Zzir paramZzir, boolean paramBoolean1, boolean paramBoolean2) {
    try {
      if (!Zb12.ZG())
        try {
          if (paramBoolean2)
            try {
              if (paramBoolean1)
                try {
                  if (!paramZkh.ZM())
                    ZH(paramZzir); 
                } catch (Zkfw zkfw) {
                  throw a(null);
                }  
            } catch (Zkfw zkfw) {
              throw a(null);
            }  
        } catch (Zkfw zkfw) {
          throw a(null);
        }  
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void Zk(Zzir paramZzir) {
    try {
      if (this.Zuq.Zi())
        this.Zuh = (new Zguq(this.Zuq.Zl(), paramZzir)).ZT(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void ZH(Zzir paramZzir) {
    try {
      Zziy zziy = paramZzir.ZvC();
      (new Zmtq(zziy)).Zs();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZT(Zrej paramZrej) {
    if (!paramZrej.ZM) {
      Zsyo zsyo = new Zsyo(Objects.<Zb_j>requireNonNull(this.ZD8));
      try {
        zsyo.ZB(this.ZI.Zvn(), paramZrej.ZJ.getAbsolutePath());
        if (!paramZrej.Zf && !this.ZD.Zfr()) {
          Objects.requireNonNull(this.ZuF);
          List<String> list = (List)zsyo.ZY(this.ZuF).stream().map(Zxpn::lambda$updateRecentFilesListsInPrefStore$26).collect(Collectors.toList());
          Zbn zbn = new Zbn(list, Objects.<Zgb6>requireNonNull(this.ZD), Objects.<Zb_j>requireNonNull(this.ZD8));
          zbn.ZF(this.ZI.Zvn());
        } 
      } catch (Zkfw zkfw) {
        throw a(null);
      } 
    } 
    try {
      if (!paramZrej.Zj.isEmpty()) {
        Objects.requireNonNull(this.ZD8);
        (new Zs6p(this.ZD8)).Zu(paramZrej.Zj);
      } 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private Zds Zy() {
    try {
      if (this.ZD.ZKh())
        return Zds.INFO; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return Zds.OFF;
  }
  
  public void ZN(int paramInt) {
    try {
      if (this.Zus != null)
        this.Zus.Za(paramInt); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private static <T> T ZV(T paramT) {
    return Objects.requireNonNull(paramT);
  }
  
  private static <T> T Z_(T paramT) {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return !Zb12.ZG() ? Objects.<T>requireNonNull(paramT) : paramT;
  }
  
  private static String lambda$updateRecentFilesListsInPrefStore$26(Zr4b paramZr4b) {
    return paramZr4b.Zh;
  }
  
  private Zrqq lambda$buildAttackControllerFactory$24() {
    return ((Zkrj)this.Zu1.get()).ZFw();
  }
  
  private Zr06 lambda$buildAttackControllerFactory$23(Zskh paramZskh) {
    return new Zr06(this.ZDb.Zk(Zeew.INTRUDER, paramZskh, this.Zu_.ZW(Zeew.INTRUDER)), paramZskh, this.ZD);
  }
  
  private Zl11 lambda$buildAttackControllerFactory$22(Zskh paramZskh) {
    return this.ZDb.Zk(Zeew.INTRUDER, paramZskh, this.Zu_.ZW(Zeew.INTRUDER));
  }
  
  private Zkr6 lambda$buildAttackControllerFactory$21() {
    return (Zkr6)this.Zs.ZI(Zeew.INTRUDER);
  }
  
  private Zzs1 lambda$browserCacheFactory$20(Ztdi paramZtdi, Ztuv paramZtuv) {
    return Zmp7.ZG(this.ZDM.ZP(), this.ZuJ, this.Zuq, paramZtdi, paramZtuv);
  }
  
  private Ztdi lambda$mapManagerFactory$19(Zskz paramZskz) {
    return new Zlnu(this.ZDM.ZP(), this.ZD, this.ZuY, paramZskz, this.Zy, this.Zuq, this.ZDO, new Zkml(this.ZuY, this.Zu7), this.Zu7);
  }
  
  private Zrc1 lambda$buildTaskLauncher$18(Zs98 paramZs98) {
    return new Zrc1(this.Zuo, this.ZD, this.ZuJ, this.ZD7, paramZs98, this.Zuq);
  }
  
  private Zrek lambda$buildSuiteUi$16() {
    return this.ZR;
  }
  
  private static void lambda$buildSuiteUi$15(AtomicReference<Zztb> paramAtomicReference) {
    ((Zztb)paramAtomicReference.get()).Zi();
  }
  
  private static Zl5t lambda$buildSuiteUi$12(AtomicReference<Zsti> paramAtomicReference, Component paramComponent) {
    return ((Zsti)paramAtomicReference.get()).Zt(paramComponent).orElse(null);
  }
  
  private Zl04 lambda$buildSuiteUi$11() {
    return this.ZN;
  }
  
  private Zl4w lambda$buildRequestResponseViewerBuilderFactory$10() {
    return this.Zuj;
  }
  
  private Zslu lambda$buildMontoyaObjectFactories$8() {
    return this.ZM;
  }
  
  private static Integer lambda$buildBrowserManager$7(Zbpe paramZbpe) {
    return Integer.valueOf(paramZbpe.Zl().ZR());
  }
  
  private Zzy9 lambda$buildBrowserManager$6() {
    return this.ZD;
  }
  
  private void lambda$reconfigureTelemetryReporter$5() {
    try {
      if (this.ZD.Zqj())
        this.Zus.Za(2000); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private static void lambda$reconfigureTelemetryReporter$4(ScheduledFuture paramScheduledFuture) {
    paramScheduledFuture.cancel(false);
  }
  
  private void lambda$reconfigureTelemetryReporter$3() {
    Zm2.Zo(Zze0.DASTARDLY_HEARTBEAT);
    this.Zus.Za(2000);
  }
  
  private void lambda$createMemoryAndRequestMonitors$2(Supplier<String> paramSupplier) {
    System.out.println(a(-10562, 22515));
    System.out.println(paramSupplier.get());
  }
  
  private String lambda$createMemoryAndRequestMonitors$1() {
    return Zxyl.ZP(this.ZuB, this.ZDM.Zo(), null, new Zmgs[] { new Zs2h(this.Zuq), new Zecf(this.Zs), new Zbji(this.Zs), this.Zur, this.ZH.Zy(), new Zr_9() });
  }
  
  private void lambda$buildJavaToolingService$0() {
    this.Zui.close();
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '|Ã{Ûk:\\b¿©CÜùÁÐî5Êuý¹bwu§üSçííöÒNyÂ«Ö"ò5¨¹¯îïSÚû©¿|£qÉûbÂÅñ\\fW.6bê\^?k\\të{ì5·Nºk&Ë'°jhÆÏ1Ô s+'·Þa?×ùËx.àÏ§Mìü$H´Ì9qkôQÚÐ#ëY¥?A\\t×G6ø³+ZsÛv^/'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #30
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
    //   68: ldc '­èÕpóÁÖÔØ_ô¼É×þ2ÜâçÂü¡<c!'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #112
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
    //   129: putstatic burp/Zxpn.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zxpn.b : [Ljava/lang/String;
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
    //   212: bipush #48
    //   214: goto -> 244
    //   217: bipush #28
    //   219: goto -> 244
    //   222: bipush #91
    //   224: goto -> 244
    //   227: bipush #82
    //   229: goto -> 244
    //   232: bipush #123
    //   234: goto -> 244
    //   237: bipush #59
    //   239: goto -> 244
    //   242: bipush #67
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
    int i = (paramInt1 ^ 0xFFFFD6BC) & 0xFFFF;
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
      byte b1 = 34;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxpn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */