package burp;

import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.sessions.SessionHandlingAction;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.proxy.http.ProxyRequestHandler;
import burp.api.montoya.proxy.http.ProxyRequestReceivedAction;
import burp.api.montoya.proxy.http.ProxyRequestToBeSentAction;
import burp.api.montoya.proxy.http.ProxyResponseHandler;
import burp.api.montoya.proxy.http.ProxyResponseReceivedAction;
import burp.api.montoya.proxy.http.ProxyResponseToBeSentAction;
import burp.api.montoya.scanner.audit.AuditIssueHandler;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.JMenu;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zic;
import net.portswigger.Zk_;
import net.portswigger.Zm2;
import net.portswigger.Zop;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl9 implements Zkc6, Zm3g, Ztov {
  private final Zz0n ZY;
  
  private final Supplier<Boolean> ZB;
  
  private final Zxgc ZO;
  
  private final Ztwv ZK;
  
  private final Zr_4 ZG;
  
  private final Zbnt Z_;
  
  private final Zslu ZV;
  
  private final Ztyg ZT;
  
  private final Zlxz ZL;
  
  private final Zkl6 Zq;
  
  private final Zo1 Zo;
  
  private final List<Zs3q> ZJ;
  
  private final List<Zg_8> Zz;
  
  private final List<Zlzj> ZP;
  
  private final List<Zesk> ZM;
  
  private final List<Zrun> ZU;
  
  private final List<Zkaj> Zk;
  
  private final List<Ztj3> Zp;
  
  private final List<Zeu1> ZF;
  
  private final List<ProxyRequestHandler> Zv;
  
  private final List<ProxyResponseHandler> Zj;
  
  private final Zm12 Zu;
  
  private final List<AuditIssueHandler> Zb;
  
  private final List<Zg0h> Zw;
  
  private final List<Zoh> Zm;
  
  private final List<Zgi0> Zy;
  
  private final Zgq7 ZH;
  
  private final List<Zb2h> ZR;
  
  private final List<JMenu> Zs;
  
  private final Zb3e ZE;
  
  private final Zz1m<Zt1f> ZZ;
  
  private final Map<Zlz3, Zeoq> Zl;
  
  private final Zefe ZN;
  
  private final Zrn7 Zx;
  
  private final Zsfs Zn;
  
  private final Zskh ZW;
  
  private final Ztw3 ZC;
  
  private final Zktu Zr;
  
  private final Zejw ZI;
  
  private final Zmk0 ZA;
  
  private final Zskl Zc;
  
  private final Zzqf Zi;
  
  private final Zz4k Zf;
  
  private final Zz3j ZQ;
  
  private final Zm6x Zg;
  
  private List<Zx_> Za;
  
  private boolean Zd;
  
  private static int ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl9(Zz0n paramZz0n, Zt4u paramZt4u, Supplier<Boolean> paramSupplier, Zerg paramZerg, Zgbj paramZgbj, Zxgc paramZxgc, Zgzy paramZgzy, Zslu paramZslu, Zt8u paramZt8u, Zbnt paramZbnt, Ztg4 paramZtg4, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Ztyg paramZtyg, Zgq7 paramZgq7, Zr1m paramZr1m, Zlxz paramZlxz, Zm37 paramZm37, Ztcy paramZtcy, Zbiv paramZbiv, Zrny paramZrny, Zzg2 paramZzg2, Zsuv paramZsuv, Zkl6 paramZkl6, Zz1m<Zt1f> paramZz1m, Zxlq paramZxlq, Zzls paramZzls, Zgj2 paramZgj2, Zm5z paramZm5z, List<ProxyRequestHandler> paramList, List<ProxyResponseHandler> paramList1, List<HttpHandler> paramList2, List<AuditIssueHandler> paramList3, List<Zg0h> paramList4, List<Zoh> paramList5, List<Zgi0> paramList6, List<Zb2h> paramList7, List<JMenu> paramList8, Zgs1 paramZgs1, Consumer<Zemy> paramConsumer, Zrn7 paramZrn7, Zsfs paramZsfs, Zskh paramZskh, Zktu paramZktu, Zmk0 paramZmk0, Zb4u paramZb4u, Zzqf paramZzqf, Zs0n paramZs0n, Zkh3 paramZkh3, Zrag paramZrag, Zgb6 paramZgb6, MontoyaObjectFactory paramMontoyaObjectFactory, Zz3j paramZz3j, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new burp/Zo1
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield Zo : Lburp/Zo1;
    //   15: invokestatic Ze : ()I
    //   18: aload_0
    //   19: new java/util/ArrayList
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putfield ZJ : Ljava/util/List;
    //   29: istore #56
    //   31: aload_0
    //   32: new java/util/ArrayList
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: putfield Zz : Ljava/util/List;
    //   42: aload_0
    //   43: new java/util/ArrayList
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: putfield ZP : Ljava/util/List;
    //   53: aload_0
    //   54: new java/util/ArrayList
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: putfield ZM : Ljava/util/List;
    //   64: aload_0
    //   65: new java/util/ArrayList
    //   68: dup
    //   69: invokespecial <init> : ()V
    //   72: putfield ZU : Ljava/util/List;
    //   75: aload_0
    //   76: new java/util/ArrayList
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: putfield Zk : Ljava/util/List;
    //   86: aload_0
    //   87: new java/util/ArrayList
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: putfield Zp : Ljava/util/List;
    //   97: aload_0
    //   98: new java/util/concurrent/CopyOnWriteArrayList
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: putfield ZF : Ljava/util/List;
    //   108: aload_0
    //   109: new java/util/ArrayList
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: putfield Za : Ljava/util/List;
    //   119: aload_0
    //   120: iconst_1
    //   121: putfield Zd : Z
    //   124: aload_0
    //   125: aload_1
    //   126: putfield ZY : Lburp/Zz0n;
    //   129: aload_0
    //   130: aload #16
    //   132: putfield ZH : Lburp/Zgq7;
    //   135: aload_0
    //   136: aload #38
    //   138: putfield ZR : Ljava/util/List;
    //   141: aload_0
    //   142: aload_3
    //   143: putfield ZB : Ljava/util/function/Supplier;
    //   146: aload_0
    //   147: aload #6
    //   149: putfield ZO : Lburp/Zxgc;
    //   152: aload_0
    //   153: aload #8
    //   155: putfield ZV : Lburp/Zslu;
    //   158: aload_0
    //   159: aload #10
    //   161: putfield Z_ : Lburp/Zbnt;
    //   164: aload_0
    //   165: aload #12
    //   167: putfield ZK : Lburp/Ztwv;
    //   170: aload_0
    //   171: aload #13
    //   173: putfield ZG : Lburp/Zr_4;
    //   176: aload_0
    //   177: aload #15
    //   179: putfield ZT : Lburp/Ztyg;
    //   182: aload_0
    //   183: aload #18
    //   185: putfield ZL : Lburp/Zlxz;
    //   188: aload_0
    //   189: aload #25
    //   191: putfield Zq : Lburp/Zkl6;
    //   194: aload_0
    //   195: aload #26
    //   197: putfield ZZ : Lburp/Zz1m;
    //   200: aload_0
    //   201: aload #31
    //   203: putfield Zv : Ljava/util/List;
    //   206: aload_0
    //   207: aload #32
    //   209: putfield Zj : Ljava/util/List;
    //   212: aload_0
    //   213: aload #34
    //   215: putfield Zb : Ljava/util/List;
    //   218: aload_0
    //   219: aload #35
    //   221: putfield Zw : Ljava/util/List;
    //   224: aload_0
    //   225: aload #36
    //   227: putfield Zm : Ljava/util/List;
    //   230: aload_0
    //   231: aload #37
    //   233: putfield Zy : Ljava/util/List;
    //   236: aload_0
    //   237: aload #39
    //   239: putfield Zs : Ljava/util/List;
    //   242: aload_0
    //   243: aload #42
    //   245: putfield Zx : Lburp/Zrn7;
    //   248: aload_0
    //   249: aload #43
    //   251: putfield Zn : Lburp/Zsfs;
    //   254: aload_0
    //   255: aload #44
    //   257: putfield ZW : Lburp/Zskh;
    //   260: aload_0
    //   261: aload #45
    //   263: putfield Zr : Lburp/Zktu;
    //   266: aload_0
    //   267: aload #46
    //   269: putfield ZA : Lburp/Zmk0;
    //   272: aload_0
    //   273: aload #48
    //   275: putfield Zi : Lburp/Zzqf;
    //   278: aload_0
    //   279: aload #49
    //   281: putfield Zc : Lburp/Zskl;
    //   284: aload_0
    //   285: aload #54
    //   287: putfield ZQ : Lburp/Zz3j;
    //   290: aload_0
    //   291: aload #55
    //   293: putfield Zg : Lburp/Zm6x;
    //   296: aload_0
    //   297: new burp/Zb3e
    //   300: dup
    //   301: aload_0
    //   302: aload #12
    //   304: aload #44
    //   306: invokespecial <init> : (Lburp/Zl9;Lburp/Ztwv;Lburp/Zskh;)V
    //   309: putfield ZE : Lburp/Zb3e;
    //   312: aload_0
    //   313: new java/util/concurrent/ConcurrentHashMap
    //   316: dup
    //   317: invokespecial <init> : ()V
    //   320: putfield Zl : Ljava/util/Map;
    //   323: aload_0
    //   324: new burp/Zefe
    //   327: dup
    //   328: aload_1
    //   329: invokeinterface ZU : ()Lnet/portswigger/Zsy;
    //   334: aload #45
    //   336: aload #49
    //   338: invokespecial <init> : (Lnet/portswigger/Zsy;Lburp/Zktu;Lburp/Zskl;)V
    //   341: putfield ZN : Lburp/Zefe;
    //   344: aload_0
    //   345: new burp/Ztw3
    //   348: dup
    //   349: aload_1
    //   350: aload #44
    //   352: aload #10
    //   354: aload #11
    //   356: aload #12
    //   358: aload #42
    //   360: invokespecial <init> : (Lburp/Zz0n;Lburp/Zskh;Lburp/Zbnt;Lburp/Ztg4;Lburp/Ztwv;Lburp/Zrn7;)V
    //   363: putfield ZC : Lburp/Ztw3;
    //   366: aload_0
    //   367: new burp/Zzsr
    //   370: dup
    //   371: aload #10
    //   373: invokespecial <init> : (Lburp/Zbnt;)V
    //   376: putfield Zf : Lburp/Zz4k;
    //   379: aload_0
    //   380: new burp/Zm12
    //   383: dup
    //   384: aload #33
    //   386: aload #45
    //   388: aload #49
    //   390: aload_0
    //   391: getfield Zf : Lburp/Zz4k;
    //   394: invokespecial <init> : (Ljava/util/List;Lburp/Zktu;Lburp/Zskl;Lburp/Zz4k;)V
    //   397: putfield Zu : Lburp/Zm12;
    //   400: aload_0
    //   401: new burp/Zejw
    //   404: dup
    //   405: aload_1
    //   406: aload_2
    //   407: aload #5
    //   409: aload #9
    //   411: aload #6
    //   413: aload #7
    //   415: aload #4
    //   417: aload #12
    //   419: aload #13
    //   421: aload #14
    //   423: aload #10
    //   425: aload #8
    //   427: aload #18
    //   429: aload #19
    //   431: aload #20
    //   433: aload #21
    //   435: aload #22
    //   437: aload #23
    //   439: aload #25
    //   441: aload #17
    //   443: aload #24
    //   445: aload #30
    //   447: aload #27
    //   449: aload #28
    //   451: aload #29
    //   453: aload #40
    //   455: aload #44
    //   457: aload_0
    //   458: aload #12
    //   460: <illegal opcode> Zp : (Lburp/Zl9;Lburp/Ztwv;)Lburp/Zzpk;
    //   465: aload #47
    //   467: aload #49
    //   469: aload #50
    //   471: aload #51
    //   473: aload #52
    //   475: aload #53
    //   477: aload #55
    //   479: invokespecial <init> : (Lburp/Zz0n;Lburp/Zt4u;Lburp/Zgbj;Lburp/Zt8u;Lburp/Zxgc;Lburp/Zgzy;Lburp/Zerg;Lburp/Ztwv;Lburp/Zr_4;Lburp/Zr_4;Lburp/Zbnt;Lburp/Zslu;Lburp/Zlxz;Lburp/Zm37;Lburp/Ztcy;Lburp/Zbiv;Lburp/Zrny;Lburp/Zzg2;Lburp/Zkl6;Lburp/Zr1m;Lburp/Zsuv;Lburp/Zm5z;Lburp/Zxlq;Lburp/Zzls;Lburp/Zgj2;Lburp/Zgs1;Lburp/Zskh;Lburp/Zzpk;Lburp/Zb4u;Lburp/Zs0n;Lburp/Zkh3;Lburp/Zrag;Lburp/Zgb6;Lburp/api/montoya/internal/MontoyaObjectFactory;Lburp/Zm6x;)V
    //   482: putfield ZI : Lburp/Zejw;
    //   485: aload #41
    //   487: aload_0
    //   488: getfield ZN : Lburp/Zefe;
    //   491: invokeinterface accept : (Ljava/lang/Object;)V
    //   496: aload #5
    //   498: aload_0
    //   499: <illegal opcode> run : (Lburp/Zl9;)Ljava/lang/Runnable;
    //   504: invokeinterface Zr : (Ljava/lang/Runnable;)V
    //   509: aload_0
    //   510: <illegal opcode> Zr : (Lburp/Zl9;)Lburp/Zk2l;
    //   515: invokestatic Zd : (Lburp/Zk2l;)V
    //   518: invokestatic Zwu : ()[Lburp/Zbqc;
    //   521: ifnonnull -> 532
    //   524: iinc #56, 1
    //   527: iload #56
    //   529: invokestatic ZR : (I)V
    //   532: return
  }
  
  public Zeu1 ZS(String paramString) {
    return this.Zr.ZG(paramString::lambda$getRegisteredBapp$3);
  }
  
  public void Zv() {
    try {
      Zeu1 zeu1 = new Zeu1(Ztqs.DEVELOPER_CLASSPATH, null);
      try {
        Zz(zeu1, false, false);
        if (zeu1.ZP()) {
          Zc(zeu1);
          ZB(zeu1, true);
          this.ZW.Zl(Zkqn.INFORMATION, a(-22812, -14256));
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
    } 
  }
  
  public void Zc(Zeu1 paramZeu1) {
    paramZeu1.Zb(this.Zn.Zp(paramZeu1.ZE()));
    int i = this.Zr.Zl();
    this.Zr.Zi(paramZeu1);
    if (paramZeu1.ZP())
      ZB(paramZeu1, true); 
    this.ZZ.ZD(new Zxr8(Zt1f.Zm, Integer.valueOf(i)));
  }
  
  public void Ze(Zeu1 paramZeu1) {
    int i = this.Zr.Zg(paramZeu1);
    this.Zr.ZD(paramZeu1);
    this.ZZ.ZD(new Zxr8(Zt1f.Zv, Integer.valueOf(i)));
  }
  
  public void ZS(int paramInt) {
    this.Zr.ZM(paramInt, paramInt + 1);
    ZB(null, false);
  }
  
  public void Zz(Zeu1 paramZeu1, boolean paramBoolean1, boolean paramBoolean2) throws Throwable {
    try {
      if (paramZeu1.ZP()) {
        Zuh.Zb(false, Zqf.Zr);
        return;
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zr4t zr4t = new Zr4t(this.ZW, paramZeu1);
    Zkfh zkfh = new Zkfh(this, paramZeu1, this.Z_, this.ZK, this.ZG, this.Zq, this.ZW, zr4t, this.ZA, this.Zi, this.Zc, this.ZQ, this.Zg);
    Zlz3 zlz3 = this.ZC.ZN(paramZeu1, zkfh, zr4t);
    try {
      if (zlz3 == null)
        return; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    paramZeu1.ZS().ZR();
    paramZeu1.ZI(zlz3);
    zlz3 = paramZeu1.ZF();
    try {
      if (paramZeu1.ZR())
        Zm2.Zw(paramZeu1.ZE()); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zgvo zgvo = this.ZI.Zy(zlz3, paramZeu1);
    Zey9 zey9 = this.Zq.ZH();
    IBurpExtenderCallbacks iBurpExtenderCallbacks = Zmj0.ZH(this.Z_, zlz3, this.ZT, this.ZH, this.ZL, this.Zo, zgvo.Za3(), zr4t, this.Zi, zey9);
    Zeoq zeoq = new Zeoq(iBurpExtenderCallbacks);
    this.Zl.put(zlz3, zeoq);
    paramZeu1.ZH();
    zlz3.Zh(zeoq, new Ze_i(zgvo.Za3()), zgvo.ZaH(), new Zxcw(this, paramZeu1, paramBoolean1, paramBoolean2));
  }
  
  public void Ze(Zeu1 paramZeu1, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Ze : ()I
    //   3: istore_3
    //   4: aload_1
    //   5: invokevirtual ZP : ()Z
    //   8: ifne -> 19
    //   11: iconst_0
    //   12: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   15: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   18: return
    //   19: invokestatic isDispatchThread : ()Z
    //   22: ifeq -> 47
    //   25: aload_0
    //   26: getfield ZK : Lburp/Ztwv;
    //   29: aload_0
    //   30: aload_1
    //   31: iload_2
    //   32: <illegal opcode> run : (Lburp/Zl9;Lburp/Zeu1;Z)Ljava/lang/Runnable;
    //   37: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   42: pop
    //   43: iload_3
    //   44: ifeq -> 53
    //   47: aload_0
    //   48: aload_1
    //   49: iload_2
    //   50: invokevirtual ZF : (Lburp/Zeu1;Z)V
    //   53: return
  }
  
  private void ZF(Zeu1 paramZeu1, boolean paramBoolean) {
    Zlz3 zlz3 = paramZeu1.ZF();
    paramZeu1.ZI((Zlz3)null);
    ZB(paramZeu1, paramBoolean);
    zlz3.ZO();
    Zeoq zeoq = this.Zl.remove(zlz3);
    if (zeoq != null)
      zeoq.Zc(); 
    Zop zop = this.Zn.Zp(paramZeu1.ZE());
    this.ZZ.ZD(new Zxr8(Zt1f.Zb, zop.ZZ));
  }
  
  public void ZB(Zeu1 paramZeu1, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Ze : ()I
    //   3: istore_3
    //   4: invokestatic isEventDispatchThread : ()Z
    //   7: ifeq -> 20
    //   10: aload_0
    //   11: aload_1
    //   12: iload_2
    //   13: invokevirtual ZE : (Lburp/Zeu1;Z)V
    //   16: iload_3
    //   17: ifeq -> 31
    //   20: aload_0
    //   21: aload_1
    //   22: iload_2
    //   23: <illegal opcode> run : (Lburp/Zl9;Lburp/Zeu1;Z)Ljava/lang/Runnable;
    //   28: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   31: return
  }
  
  private void ZE(Zeu1 paramZeu1, boolean paramBoolean) {
    int i = ZK();
    try {
      Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
      if (paramZeu1 != null)
        try {
          if (paramZeu1.Zz())
            return; 
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Zk();
      Zr();
      this.Zu.ZR();
      this.ZN.ZJ();
      Zg();
      ZD();
      ZB();
      ZC();
      ZW();
      synchronized (this.ZP) {
        this.ZP.clear();
        this.Zr.Zm(this::lambda$_extensionConfigChanged$6);
      } 
      synchronized (this.ZU) {
        this.ZU.clear();
        this.Zr.Zm(this::lambda$_extensionConfigChanged$7);
      } 
      synchronized (this.Zk) {
        this.Zk.clear();
        this.Zr.Zm(this::lambda$_extensionConfigChanged$8);
      } 
      ArrayList<?> arrayList = new ArrayList();
      this.Zr.Zm(arrayList::lambda$_extensionConfigChanged$9);
      if (!Zepo.Zu(this.Za, arrayList)) {
        for (Zx_ zx_ : Zepo.<Zx_>Zj(this.Za)) {
          this.ZV.Z_(zx_);
          if (i == 0)
            break; 
        } 
        for (Zx_ zx_ : arrayList) {
          this.ZV.ZH(zx_);
          if (i == 0)
            break; 
        } 
        this.Za = (List)arrayList;
      } 
      synchronized (this.ZM) {
        this.ZM.clear();
        this.Zr.Zm(this::lambda$_extensionConfigChanged$10);
      } 
      ArrayList arrayList1 = new ArrayList();
      Objects.requireNonNull(arrayList1);
      this.Zr.Zm(arrayList1::add);
      List<?> list = arrayList1.stream().map(Zeu1::ZF).map(Zlz3::ZK).flatMap(Collection::stream).toList();
      if (!Zepo.Zu(this.ZJ, list))
        synchronized (this.ZJ) {
          for (Zs3q zs3q : this.ZJ) {
            this.ZO.ZG(zs3q.Ze);
            if (i == 0)
              break; 
          } 
          this.ZJ.clear();
          this.ZJ.addAll(list);
          HashMap<Object, Object> hashMap = new HashMap<>();
          for (Zeu1 zeu1 : arrayList1) {
            String str = zeu1.ZN();
            hashMap.compute(str, Zl9::lambda$_extensionConfigChanged$11);
            HashMap<Object, Object> hashMap1 = new HashMap<>();
            for (Zs3q zs3q : zeu1.ZF().ZK()) {
              String str1 = zs3q.ZS;
              hashMap1.compute(str1, Zl9::lambda$_extensionConfigChanged$11);
              this.ZO.ZH(a(-22811, 8491).formatted(new Object[] { str, hashMap.get(str), str1, hashMap1.get(str1) }), str1, zs3q.Ze);
              if (i == 0)
                break; 
            } 
            if (i == 0)
              break; 
          } 
        }  
      synchronized (this.Zz) {
        this.Zz.clear();
        this.Zr.Zm(this::lambda$_extensionConfigChanged$13);
      } 
      try {
        if (paramBoolean)
          this.ZZ.ZD(new Zxr8(Zt1f.ZY, paramZeu1)); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZC() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic Ze : ()I
    //   11: aload_0
    //   12: getfield Zr : Lburp/Zktu;
    //   15: aload_2
    //   16: <illegal opcode> accept : (Ljava/util/List;)Ljava/util/function/Consumer;
    //   21: invokevirtual Zm : (Ljava/util/function/Consumer;)V
    //   24: aload_0
    //   25: getfield ZR : Ljava/util/List;
    //   28: dup
    //   29: astore_3
    //   30: monitorenter
    //   31: istore_1
    //   32: aload_0
    //   33: getfield ZR : Ljava/util/List;
    //   36: aload_2
    //   37: invokestatic Zu : (Ljava/util/List;Ljava/util/List;)Z
    //   40: ifeq -> 46
    //   43: aload_3
    //   44: monitorexit
    //   45: return
    //   46: aload_3
    //   47: monitorexit
    //   48: goto -> 58
    //   51: astore #4
    //   53: aload_3
    //   54: monitorexit
    //   55: aload #4
    //   57: athrow
    //   58: aload_0
    //   59: getfield Zp : Ljava/util/List;
    //   62: invokestatic Zj : (Ljava/util/List;)Ljava/util/List;
    //   65: astore_3
    //   66: new burp/Zz99
    //   69: dup
    //   70: aload_2
    //   71: invokespecial <init> : (Ljava/util/List;)V
    //   74: astore #4
    //   76: aload_3
    //   77: invokeinterface iterator : ()Ljava/util/Iterator;
    //   82: astore #5
    //   84: aload #5
    //   86: invokeinterface hasNext : ()Z
    //   91: ifeq -> 119
    //   94: aload #5
    //   96: invokeinterface next : ()Ljava/lang/Object;
    //   101: checkcast burp/Ztj3
    //   104: astore #6
    //   106: aload #6
    //   108: aload #4
    //   110: invokeinterface Zj : (Lburp/Zz99;)V
    //   115: iload_1
    //   116: ifeq -> 84
    //   119: aload_0
    //   120: getfield ZR : Ljava/util/List;
    //   123: dup
    //   124: astore #5
    //   126: monitorenter
    //   127: aload_0
    //   128: getfield ZR : Ljava/util/List;
    //   131: invokeinterface clear : ()V
    //   136: aload_0
    //   137: getfield ZR : Ljava/util/List;
    //   140: aload_2
    //   141: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   146: pop
    //   147: aload #5
    //   149: monitorexit
    //   150: goto -> 161
    //   153: astore #7
    //   155: aload #5
    //   157: monitorexit
    //   158: aload #7
    //   160: athrow
    //   161: return
    // Exception table:
    //   from	to	target	type
    //   32	45	51	finally
    //   46	48	51	finally
    //   51	55	51	finally
    //   127	150	153	finally
    //   153	158	153	finally
  }
  
  private void ZW() {
    ArrayList<?> arrayList = new ArrayList();
    this.Zr.Zm(arrayList::lambda$refreshMenuBarMenus$15);
    synchronized (this.Zs) {
      if (!Zepo.Zu(this.Zs, arrayList)) {
        Objects.requireNonNull(this.ZO);
        this.Zs.forEach(this.ZO::ZW);
        this.Zs.clear();
        this.Zs.addAll(arrayList);
        Objects.requireNonNull(this.ZO);
        this.Zs.forEach(this.ZO::Zz);
      } 
    } 
  }
  
  private void ZD() {
    ArrayList<?> arrayList = new ArrayList();
    this.Zr.Zm(arrayList::lambda$refreshHttpRequestEditorProviders$16);
    int i = ZK();
    synchronized (this.Zm) {
      if (Zepo.Zu(this.Zm, arrayList))
        return; 
    } 
    List<Ztj3> list = Zepo.Zj(this.Zp);
    Zte0<Zoh> zte0 = new Zte0(arrayList);
    for (Ztj3 ztj3 : list) {
      ztj3.ZM(zte0);
      if (i == 0)
        break; 
    } 
    synchronized (this.Zm) {
      this.Zm.clear();
      this.Zm.addAll(arrayList);
    } 
  }
  
  private void ZB() {
    ArrayList<?> arrayList = new ArrayList();
    this.Zr.Zm(arrayList::lambda$refreshHttpResponseEditorProviders$17);
    int i = ZK();
    synchronized (this.Zy) {
      if (Zepo.Zu(this.Zy, arrayList))
        return; 
    } 
    List<Ztj3> list = Zepo.Zj(this.Zp);
    Zte0<Zgi0> zte0 = new Zte0(arrayList);
    for (Ztj3 ztj3 : list) {
      ztj3.Zl(zte0);
      if (i == 0)
        break; 
    } 
    synchronized (this.Zy) {
      this.Zy.clear();
      this.Zy.addAll(arrayList);
    } 
  }
  
  private void Zg() {
    synchronized (this.Zw) {
      this.Zw.clear();
      this.Zr.Zm(this::lambda$refreshSessionHandlingActions$19);
    } 
  }
  
  private void Zk() {
    synchronized (this.Zb) {
      this.Zb.clear();
      this.Zr.Zm(this::lambda$refreshAuditIssueHandlers$20);
    } 
  }
  
  private void Zr() {
    synchronized (this.Zv) {
      this.Zv.clear();
      this.Zr.Zm(this::lambda$refreshProxyHandlers$21);
    } 
    synchronized (this.Zj) {
      this.Zj.clear();
      this.Zr.Zm(this::lambda$refreshProxyHandlers$22);
    } 
  }
  
  public void ZM(Ztj3 paramZtj3) {
    synchronized (this.Zp) {
      this.Zp.add(paramZtj3);
    } 
    paramZtj3.ZM(new Zte0<>(this.Zm));
    paramZtj3.Zl(new Zte0<>(this.Zy));
    paramZtj3.Zj(new Zz99(this.ZR));
  }
  
  public void Zs(Ztj3 paramZtj3) {
    synchronized (this.Zp) {
      this.Zp.remove(paramZtj3);
    } 
  }
  
  public void Zl() {
    this.Zr.Zm(this::lambda$applicationClosing$23);
  }
  
  public void ZT(Zrdb paramZrdb) {
    int i = Ze();
    if (this.Zb.isEmpty())
      return; 
    Zkf_ zkf_ = new Zkf_(paramZrdb, this.Zq, this.Zc, this.Zg);
    for (AuditIssueHandler auditIssueHandler : Zepo.<AuditIssueHandler>Zj(this.Zb)) {
      auditIssueHandler.handleNewAuditIssue(zkf_);
      if (i != 0)
        break; 
    } 
  }
  
  public int Zc(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    int i = Ze();
    if (this.Zv.isEmpty())
      return paramInt; 
    List<ProxyRequestHandler> list = Zepo.Zj(this.Zv);
    int j = paramInt;
    for (ProxyRequestHandler proxyRequestHandler : list) {
      Zs5r zs5r = new Zs5r(this.Zc.Zu(paramZxj1), new Zkot(paramZxj1.Zk(), paramString, paramInetAddress, null), this.Zc.ZM(paramZxj1));
      ProxyRequestReceivedAction proxyRequestReceivedAction = proxyRequestHandler.handleRequestReceived(zs5r);
      if (proxyRequestReceivedAction != null) {
        HttpRequest httpRequest = proxyRequestReceivedAction.request();
        this.Zf.Zi(paramZxj1, Objects.equals(httpRequest, zs5r) ? null : httpRequest, proxyRequestReceivedAction.annotations());
        if (proxyRequestReceivedAction.action() != null)
          j = Zblx.ZY(proxyRequestReceivedAction.action()); 
      } 
      if (i != 0)
        break; 
    } 
    return j;
  }
  
  public int ZV(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    int i = ZK();
    if (this.Zv.isEmpty())
      return paramInt; 
    List<ProxyRequestHandler> list = Zepo.Zj(this.Zv);
    int j = paramInt;
    for (ProxyRequestHandler proxyRequestHandler : list) {
      Zs5r zs5r = new Zs5r(this.Zc.Zu(paramZxj1), new Zkot(paramZxj1.Zk(), paramString, paramInetAddress, null), this.Zc.ZM(paramZxj1));
      ProxyRequestToBeSentAction proxyRequestToBeSentAction = proxyRequestHandler.handleRequestToBeSent(zs5r);
      if (proxyRequestToBeSentAction != null) {
        HttpRequest httpRequest = proxyRequestToBeSentAction.request();
        this.Zf.Zi(paramZxj1, Objects.equals(httpRequest, zs5r) ? null : httpRequest, proxyRequestToBeSentAction.annotations());
        if (proxyRequestToBeSentAction.action() != null)
          j = Zblx.Zp(proxyRequestToBeSentAction.action()); 
      } 
      if (i == 0)
        break; 
    } 
    return j;
  }
  
  public int ZT(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    int i = Ze();
    if (this.Zj.isEmpty())
      return paramInt; 
    List<ProxyResponseHandler> list = Zepo.Zj(this.Zj);
    int j = paramInt;
    for (ProxyResponseHandler proxyResponseHandler : list) {
      Zkcc zkcc = new Zkcc(this.Zc.Zc(paramZxj1.ZM()), new Zkot(paramZxj1.Zk(), paramString, null, paramInetAddress), this.Zc.Zu(paramZxj1), this.Zc.ZM(paramZxj1));
      ProxyResponseReceivedAction proxyResponseReceivedAction = proxyResponseHandler.handleResponseReceived(zkcc);
      if (proxyResponseReceivedAction != null) {
        HttpResponse httpResponse = proxyResponseReceivedAction.response();
        this.Zf.Zw(paramZxj1, Objects.equals(httpResponse, zkcc) ? null : httpResponse, proxyResponseReceivedAction.annotations());
        if (proxyResponseReceivedAction.action() != null)
          j = Zblx.ZY(proxyResponseReceivedAction.action()); 
      } 
      if (i != 0)
        break; 
    } 
    return j;
  }
  
  public int ZM(Zxj1 paramZxj1, int paramInt, String paramString, InetAddress paramInetAddress) {
    int i = Ze();
    if (this.Zj.isEmpty())
      return paramInt; 
    List<ProxyResponseHandler> list = Zepo.Zj(this.Zj);
    int j = paramInt;
    for (ProxyResponseHandler proxyResponseHandler : list) {
      Zztj zztj = this.Zc.Zu(paramZxj1);
      Zkcc zkcc = new Zkcc(this.Zc.Zc(paramZxj1.ZM()), new Zkot(paramZxj1.Zk(), paramString, null, paramInetAddress), zztj, this.Zc.ZM(paramZxj1));
      ProxyResponseToBeSentAction proxyResponseToBeSentAction = proxyResponseHandler.handleResponseToBeSent(zkcc);
      if (proxyResponseToBeSentAction != null) {
        HttpResponse httpResponse = proxyResponseToBeSentAction.response();
        this.Zf.Zw(paramZxj1, Objects.equals(httpResponse, zkcc) ? null : httpResponse, proxyResponseToBeSentAction.annotations());
        if (proxyResponseToBeSentAction.action() != null)
          j = Zblx.Zp(proxyResponseToBeSentAction.action()); 
      } 
      if (i != 0)
        break; 
    } 
    return j;
  }
  
  public void Zz(Zeew paramZeew, Zxj1 paramZxj1) {
    this.Zu.Zz(paramZeew, paramZxj1);
  }
  
  public void Z_(Zeew paramZeew, Zxj1 paramZxj1) {
    this.Zu.Z_(paramZeew, paramZxj1);
  }
  
  public Zgq<Zrdb> Zm(Zz1i paramZz1i, Ze3n paramZe3n, Zmfj paramZmfj) {
    int i = Ze();
    if (this.ZP.isEmpty())
      return null; 
    Zgq<Zgpi> zgq = new Zgq<>();
    for (Zlzj zlzj : Zepo.<Zlzj>Zj(this.ZP)) {
      zlzj.Zo(paramZe3n, paramZz1i, (Zgq)zgq, paramZmfj);
      if (i != 0)
        break; 
    } 
    return (Zgq)zgq;
  }
  
  public Zgq<Zrdb> Zf(Ze3n paramZe3n, Zz1i paramZz1i, Zmfj paramZmfj, Zxs7 paramZxs7, Ztpx paramZtpx, int paramInt) {
    int i = ZK();
    if (this.ZP.isEmpty())
      return null; 
    Zgq<Zgpi> zgq = new Zgq<>();
    for (Zlzj zlzj : Zepo.<Zlzj>Zj(this.ZP)) {
      zlzj.Za(paramZe3n, paramZz1i, (Zgq)zgq, paramZmfj, paramZxs7, this.Zo, paramZtpx, paramInt);
      if (i == 0)
        break; 
    } 
    return (Zgq)zgq;
  }
  
  public Zlzj Zx(String paramString, int paramInt) {
    Zeu1 zeu1 = this.Zr.ZG(paramString::lambda$getScannerCheckWrapperFor$24);
    return (zeu1 == null || zeu1.ZF() == null) ? null : zeu1.ZF().ZQ(paramInt);
  }
  
  public int ZN() {
    return this.ZP.size();
  }
  
  public List<Zg_8> Za() {
    return this.Zz.isEmpty() ? null : Zepo.Zj(this.Zz);
  }
  
  public List<Zesk> ZS() {
    return this.ZM.isEmpty() ? null : Zepo.Zj(this.ZM);
  }
  
  public List<String> Zy() {
    synchronized (this.Zw) {
      if (this.Zw.isEmpty())
        return null; 
      return (List<String>)this.Zw.stream().map(Zg0h::ZM).collect(Collectors.toList());
    } 
  }
  
  public Zg0h ZU(String paramString) {
    synchronized (this.Zw) {
      if (Zsw8.ZP(paramString))
        return null; 
      return this.Zw.stream().filter(paramString::lambda$getSessionHandlingAction$25).findFirst().orElse(null);
    } 
  }
  
  public List<String> Zc() {
    int i = Ze();
    synchronized (this.ZU) {
      if (this.ZU.isEmpty())
        return null; 
      ArrayList<String> arrayList = new ArrayList(this.ZU.size());
      for (Zrun zrun : this.ZU) {
        arrayList.add(zrun.ZE);
        if (i != 0)
          break; 
      } 
      return arrayList;
    } 
  }
  
  public Zrun Zw(String paramString) {
    int i = Ze();
    synchronized (this.ZU) {
      if (this.ZU.isEmpty())
        return null; 
      for (Zrun zrun : this.ZU) {
        if (paramString.equals(zrun.ZE))
          return zrun; 
        if (i != 0)
          break; 
      } 
    } 
    return null;
  }
  
  public List<String> Zz() {
    int i = ZK();
    synchronized (this.Zk) {
      if (this.Zk.isEmpty())
        return null; 
      ArrayList<String> arrayList = new ArrayList(this.Zk.size());
      for (Zkaj zkaj : this.Zk) {
        arrayList.add(zkaj.Zy);
        if (i == 0)
          break; 
      } 
      return arrayList;
    } 
  }
  
  public Zkaj ZO(String paramString) {
    int i = Ze();
    synchronized (this.Zk) {
      if (this.Zk.isEmpty())
        return null; 
      for (Zkaj zkaj : this.Zk) {
        if (paramString.equals(zkaj.Zy))
          return zkaj; 
        if (i != 0)
          break; 
      } 
    } 
    return null;
  }
  
  void ZQ() {
    this.Zr.Zm(this::lambda$removeAllExtensions$27);
    this.Zr.Zj();
    this.ZZ.ZD(new Zxr8(Zt1f.ZJ, Integer.valueOf(this.Zr.Zl())));
  }
  
  boolean Za(Zeu1 paramZeu1) {
    return (paramZeu1.ZR() && this.Zn.Zm(paramZeu1.ZE()));
  }
  
  public void ZF(Zmf_ paramZmf_) {
    this.Zd = true;
    Zd(paramZmf_);
  }
  
  public void Zd(Zmf_ paramZmf_) {
    if (paramZmf_.Zh(a(-22810, -26977))) {
      List<?> list = paramZmf_.Zs(a(-22809, 32424), new Zgv4());
      this.ZF.addAll(list);
      this.ZE.ZC((List)list, Zi());
    } 
    this.Zd = false;
  }
  
  private boolean Zi() {
    return (this.ZY.Zr().Zu() && this.Zx.ZU() && (!this.Zd || !((Boolean)this.ZB.get()).booleanValue()));
  }
  
  public void Zl(Zg4j paramZg4j) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: <illegal opcode> run : (Lburp/Zl9;Lburp/Zg4j;)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  Zeu1 Zy(Zeu1 paramZeu1) {
    try {
      Ze4f ze4f = this.Zn.Zw(paramZeu1.ZE(), paramZeu1.ZZ, this.Zx.ZX());
      if (ze4f.Zr) {
        Zeu1 zeu1 = new Zeu1(ze4f.Zp, ze4f.Zk, ze4f.ZT, false, ze4f.ZL, paramZeu1.ZE());
        Zmgc.BAPP_AUTOMATICALLY_UPDATED.ZK(this.ZW.Zz(), new Object[] { zeu1.ZN(), ze4f.Zc });
        return zeu1;
      } 
      if (ze4f.Z_)
        Zmgc.BAPP_UPDATE_AVAILABLE.ZK(this.ZW.Zz(), new Object[] { paramZeu1.ZN(), ze4f.Zc }); 
    } catch (Zic zic) {
      Zah.Zl((Throwable)zic, Zk_.COMMON_RUNTIME_FAILURE);
      Zmgc.BAPP_AUTOMATIC_UPDATE_FAILED.ZV(this.ZW.Zz(), new Object[] { paramZeu1.ZN(), zic.getMessage() });
    } 
    return paramZeu1;
  }
  
  public void Zn() {
    this.ZF.clear();
  }
  
  private void ZR() {
    this.Zr.Zm(Zl9::lambda$customiseExtensionUiComponents$30);
  }
  
  public List<Zeu1> ZF() {
    LinkedList<Zeu1> linkedList = new LinkedList();
    Objects.requireNonNull(linkedList);
    this.Zr.ZQ(linkedList::add);
    return linkedList;
  }
  
  private static void lambda$customiseExtensionUiComponents$30(Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    if (zlz3 != null)
      zlz3.ZS(); 
  }
  
  private void lambda$saveBurpConfiguration$29(Zg4j paramZg4j) {
    // Byte code:
    //   0: invokestatic Ze : ()I
    //   3: istore_2
    //   4: aload_1
    //   5: sipush #-22809
    //   8: sipush #32424
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: invokeinterface ZP : (Ljava/lang/String;)Lburp/Zzqw;
    //   19: astore_3
    //   20: aload_0
    //   21: getfield ZF : Ljava/util/List;
    //   24: invokeinterface isEmpty : ()Z
    //   29: ifeq -> 49
    //   32: aload_0
    //   33: getfield Zr : Lburp/Zktu;
    //   36: aload_3
    //   37: <illegal opcode> accept : (Lburp/Zzqw;)Ljava/util/function/Consumer;
    //   42: invokevirtual ZQ : (Ljava/util/function/Consumer;)V
    //   45: iload_2
    //   46: ifeq -> 110
    //   49: aload_0
    //   50: getfield ZF : Ljava/util/List;
    //   53: invokeinterface iterator : ()Ljava/util/Iterator;
    //   58: astore #4
    //   60: aload #4
    //   62: invokeinterface hasNext : ()Z
    //   67: ifeq -> 110
    //   70: aload #4
    //   72: invokeinterface next : ()Ljava/lang/Object;
    //   77: checkcast burp/Ztbi
    //   80: astore #5
    //   82: aload #5
    //   84: invokeinterface ZS : ()Lburp/Ztqs;
    //   89: getstatic burp/Ztqs.DEVELOPER_CLASSPATH : Lburp/Ztqs;
    //   92: if_acmpeq -> 106
    //   95: aload_3
    //   96: aload #5
    //   98: invokeinterface Zk : ()Lburp/Zlwx;
    //   103: invokevirtual Zx : (Lburp/Zlwx;)V
    //   106: iload_2
    //   107: ifeq -> 60
    //   110: return
  }
  
  private static void lambda$saveBurpConfiguration$28(Zzqw paramZzqw, Zeu1 paramZeu1) {
    if (paramZeu1.ZS() != Ztqs.DEVELOPER_CLASSPATH)
      paramZzqw.Zx(paramZeu1.Zk()); 
  }
  
  private void lambda$removeAllExtensions$27(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZK : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zl9;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: goto -> 28
    //   20: astore_2
    //   21: aload_2
    //   22: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   25: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   28: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/lang/Exception
  }
  
  private void lambda$removeAllExtensions$26(Zeu1 paramZeu1) {
    Ze(paramZeu1, false);
    paramZeu1.ZU().close();
    paramZeu1.ZJ().close();
  }
  
  private static boolean lambda$getSessionHandlingAction$25(String paramString, Zg0h paramZg0h) {
    return paramString.equals(paramZg0h.ZM());
  }
  
  private static boolean lambda$getScannerCheckWrapperFor$24(String paramString, Zeu1 paramZeu1) {
    return (paramZeu1.Zi() != null) ? paramZeu1.Zi().equals(paramString) : ((paramString == null));
  }
  
  private void lambda$applicationClosing$23(Zeu1 paramZeu1) {
    Ze(paramZeu1, false);
  }
  
  private void lambda$refreshProxyHandlers$22(Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    this.Zj.addAll(zlz3.ZJ());
  }
  
  private void lambda$refreshProxyHandlers$21(Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    this.Zv.addAll(zlz3.Z_());
  }
  
  private void lambda$refreshAuditIssueHandlers$20(Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    this.Zb.addAll(zlz3.Zp());
  }
  
  private void lambda$refreshSessionHandlingActions$19(Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZF : ()Lburp/Zlz3;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual ZH : ()Ljava/util/List;
    //   9: astore_3
    //   10: aload_3
    //   11: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   16: aload_0
    //   17: aload_1
    //   18: <illegal opcode> apply : (Lburp/Zl9;Lburp/Zeu1;)Ljava/util/function/Function;
    //   23: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   28: invokeinterface toList : ()Ljava/util/List;
    //   33: astore #4
    //   35: aload_0
    //   36: getfield Zw : Ljava/util/List;
    //   39: aload #4
    //   41: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   46: pop
    //   47: return
  }
  
  private Zg0h lambda$refreshSessionHandlingActions$18(Zeu1 paramZeu1, SessionHandlingAction paramSessionHandlingAction) {
    return new Zg0h(paramZeu1, paramSessionHandlingAction, this.Z_, this.ZW, this.Zc);
  }
  
  private static void lambda$refreshHttpResponseEditorProviders$17(List<Zgi0> paramList, Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    paramList.addAll(zlz3.ZD());
  }
  
  private static void lambda$refreshHttpRequestEditorProviders$16(List<Zoh> paramList, Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    paramList.addAll(zlz3.ZB());
  }
  
  private static void lambda$refreshMenuBarMenus$15(List<JMenu> paramList, Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    paramList.addAll(zlz3.ZT());
  }
  
  private static void lambda$refreshWebSocketMessageEditorProviders$14(List<Zb2h> paramList, Zeu1 paramZeu1) {
    Zlz3 zlz3 = paramZeu1.ZF();
    paramList.addAll(zlz3.Zd());
  }
  
  private void lambda$_extensionConfigChanged$13(Zeu1 paramZeu1) {
    this.Zz.addAll(paramZeu1.ZF().ZX());
  }
  
  private static Integer lambda$_extensionConfigChanged$11(String paramString, Integer paramInteger) {
    return Integer.valueOf((paramInteger == null) ? 0 : (paramInteger.intValue() + 1));
  }
  
  private void lambda$_extensionConfigChanged$10(Zeu1 paramZeu1) {
    this.ZM.addAll(paramZeu1.ZF().Zu());
  }
  
  private static void lambda$_extensionConfigChanged$9(List<Zx_> paramList, Zeu1 paramZeu1) {
    paramList.addAll(paramZeu1.ZF().ZL());
  }
  
  private void lambda$_extensionConfigChanged$8(Zeu1 paramZeu1) {
    this.Zk.addAll(paramZeu1.ZF().Zf());
  }
  
  private void lambda$_extensionConfigChanged$7(Zeu1 paramZeu1) {
    this.ZU.addAll(paramZeu1.ZF().Zq());
  }
  
  private void lambda$_extensionConfigChanged$6(Zeu1 paramZeu1) {
    this.ZP.addAll(paramZeu1.ZF().Zg());
  }
  
  private void lambda$extensionConfigChanged$5(Zeu1 paramZeu1, boolean paramBoolean) {
    ZE(paramZeu1, paramBoolean);
  }
  
  private void lambda$unloadExtension$4(Zeu1 paramZeu1, boolean paramBoolean) {
    ZF(paramZeu1, paramBoolean);
  }
  
  private static boolean lambda$getRegisteredBapp$3(String paramString, Zeu1 paramZeu1) {
    return (paramZeu1.ZR() && paramZeu1.ZE().equals(paramString));
  }
  
  private void lambda$new$2() {
    Zm2.Zi(Zv8r.EXTENSION_SUITE_TABS, this.ZJ.size());
  }
  
  private void lambda$new$1(Ztwv paramZtwv, Zeu1 paramZeu1) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: aload_2
    //   3: <illegal opcode> run : (Lburp/Zl9;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   8: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   13: pop
    //   14: return
  }
  
  private void lambda$new$0(Zeu1 paramZeu1) {
    Ze(paramZeu1, true);
  }
  
  public static void ZR(int paramInt) {
    ZD = paramInt;
  }
  
  public static int Ze() {
    return ZD;
  }
  
  public static int ZK() {
    int i = Ze();
    return (i == 0) ? 95 : 0;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: iconst_0
    //   8: istore_3
    //   9: invokestatic ZR : (I)V
    //   12: ldc 'sR¸ ®àþbHW7°h¿mR=9ÜU¬ï dQvMð[¯ÒÀiÏwwG.Þ¶ê-kwkÑ'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #32
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #7
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc 'úVH)mÏ½gI¿@æ»ÿ½AyÐnê\\nS@Fá~BDÝ+'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #25
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #34
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 145
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
    //   132: putstatic burp/Zl9.a : [Ljava/lang/String;
    //   135: iconst_4
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zl9.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #103
    //   218: goto -> 248
    //   221: bipush #98
    //   223: goto -> 248
    //   226: bipush #39
    //   228: goto -> 248
    //   231: bipush #101
    //   233: goto -> 248
    //   236: bipush #32
    //   238: goto -> 248
    //   241: bipush #36
    //   243: goto -> 248
    //   246: bipush #25
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA6E6) & 0xFFFF;
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
      byte b1 = 40;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */