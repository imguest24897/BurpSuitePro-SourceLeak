package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.extension.ExtensionUnloadingHandler;
import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.http.sessions.SessionHandlingAction;
import burp.api.montoya.intruder.PayloadGeneratorProvider;
import burp.api.montoya.intruder.PayloadProcessor;
import burp.api.montoya.proxy.http.ProxyRequestHandler;
import burp.api.montoya.proxy.http.ProxyResponseHandler;
import burp.api.montoya.proxy.websocket.ProxyWebSocketCreationHandler;
import burp.api.montoya.scanner.ScanCheck;
import burp.api.montoya.scanner.audit.AuditIssueHandler;
import burp.api.montoya.scanner.audit.insertionpoint.AuditInsertionPointProvider;
import burp.api.montoya.scope.ScopeChangeHandler;
import burp.api.montoya.ui.contextmenu.ContextMenuItemsProvider;
import burp.api.montoya.ui.editor.extension.HttpRequestEditorProvider;
import burp.api.montoya.ui.editor.extension.HttpResponseEditorProvider;
import burp.api.montoya.ui.editor.extension.WebSocketMessageEditorProvider;
import burp.api.montoya.ui.menu.Menu;
import burp.api.montoya.websocket.WebSocketCreatedHandler;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JMenu;

public class Zkfh implements Zxr1 {
  private final Zeu1 ZX;
  
  private final Zskh Zy;
  
  private final Zbnt Zj;
  
  private final Ztwv ZE;
  
  private final Zr_4 ZA;
  
  private final Zkl6 ZJ;
  
  private final Ztx8 Z_;
  
  private final Zs8_<Component> Zi;
  
  private final Zs8_<ExtensionUnloadingHandler> ZT;
  
  private final Zs80<Zs3q, Component> Zb;
  
  private final Zs80<Zg_8, AuditInsertionPointProvider> ZN;
  
  private final Zs80<Zlzj, ScanCheck> ZF;
  
  private final Zs80<Zesk, ContextMenuItemsProvider> ZS;
  
  private final Zs8_<PayloadGeneratorProvider> Zt;
  
  private final Zs8_<PayloadProcessor> Zq;
  
  private final Zs80<Zx_, ScopeChangeHandler> ZC;
  
  private final Zs8_<ProxyRequestHandler> Zp;
  
  private final Zs8_<ProxyResponseHandler> ZY;
  
  private final Zs8_<ProxyWebSocketCreationHandler> Zz;
  
  private final Zs8_<HttpHandler> ZD;
  
  private final Zs8_<WebSocketCreatedHandler> ZG;
  
  private final Zs8_<AuditIssueHandler> ZI;
  
  private final Zs8_<SessionHandlingAction> ZU;
  
  private final Zs8_<HttpRequestEditorProvider> ZL;
  
  private final Zs8_<HttpResponseEditorProvider> Zv;
  
  private final Zs8_<WebSocketMessageEditorProvider> ZZ;
  
  private final Zs8_<JMenu> ZW;
  
  private final Zmk0 Zs;
  
  private final Runnable Zg;
  
  private final Zskl Zu;
  
  private final Zzqf Zo;
  
  private final Zz3j Zl;
  
  private final Zm6x ZP;
  
  private static int[] ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkfh(Zl9 paramZl9, Zeu1 paramZeu1, Zbnt paramZbnt, Ztwv paramZtwv, Zr_4 paramZr_4, Zkl6 paramZkl6, Zskh paramZskh, Ztx8 paramZtx8, Zmk0 paramZmk0, Zzqf paramZzqf, Zskl paramZskl, Zz3j paramZz3j, Zm6x paramZm6x) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #6
    //   7: putfield ZJ : Lburp/Zkl6;
    //   10: invokestatic ZH : ()[I
    //   13: aload_0
    //   14: aload_2
    //   15: putfield ZX : Lburp/Zeu1;
    //   18: aload_0
    //   19: aload_3
    //   20: putfield Zj : Lburp/Zbnt;
    //   23: aload_0
    //   24: aload #4
    //   26: putfield ZE : Lburp/Ztwv;
    //   29: aload_0
    //   30: aload #5
    //   32: putfield ZA : Lburp/Zr_4;
    //   35: astore #14
    //   37: aload_0
    //   38: aload #7
    //   40: putfield Zy : Lburp/Zskh;
    //   43: aload_0
    //   44: aload #8
    //   46: putfield Z_ : Lburp/Ztx8;
    //   49: aload_0
    //   50: aload #9
    //   52: putfield Zs : Lburp/Zmk0;
    //   55: aload_0
    //   56: aload #10
    //   58: putfield Zo : Lburp/Zzqf;
    //   61: aload_0
    //   62: aload #11
    //   64: putfield Zu : Lburp/Zskl;
    //   67: aload_0
    //   68: aload #12
    //   70: putfield Zl : Lburp/Zz3j;
    //   73: aload_0
    //   74: aload #13
    //   76: putfield ZP : Lburp/Zm6x;
    //   79: aload_0
    //   80: aload_1
    //   81: aload_2
    //   82: <illegal opcode> run : (Lburp/Zl9;Lburp/Zeu1;)Ljava/lang/Runnable;
    //   87: putfield Zg : Ljava/lang/Runnable;
    //   90: aload_0
    //   91: new burp/Zs8_
    //   94: dup
    //   95: invokespecial <init> : ()V
    //   98: putfield Zi : Lburp/Zs8_;
    //   101: aload_0
    //   102: new burp/Zs8_
    //   105: dup
    //   106: sipush #-28431
    //   109: sipush #6285
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: aload_0
    //   116: getfield Zg : Ljava/lang/Runnable;
    //   119: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   122: putfield ZT : Lburp/Zs8_;
    //   125: aload_0
    //   126: new burp/Zs80
    //   129: dup
    //   130: sipush #-28425
    //   133: sipush #-32650
    //   136: invokestatic a : (II)Ljava/lang/String;
    //   139: aload_0
    //   140: getfield Zg : Ljava/lang/Runnable;
    //   143: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   148: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   151: putfield Zb : Lburp/Zs80;
    //   154: aload_0
    //   155: new burp/Zs80
    //   158: dup
    //   159: sipush #-28442
    //   162: sipush #-20680
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: aload_0
    //   169: getfield Zg : Ljava/lang/Runnable;
    //   172: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   177: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   180: putfield ZN : Lburp/Zs80;
    //   183: aload_0
    //   184: new burp/Zs80
    //   187: dup
    //   188: sipush #-28441
    //   191: sipush #-16180
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: aload_0
    //   198: getfield Zg : Ljava/lang/Runnable;
    //   201: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   206: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   209: putfield ZF : Lburp/Zs80;
    //   212: aload_0
    //   213: new burp/Zs80
    //   216: dup
    //   217: sipush #-28418
    //   220: sipush #-23293
    //   223: invokestatic a : (II)Ljava/lang/String;
    //   226: aload_0
    //   227: getfield Zg : Ljava/lang/Runnable;
    //   230: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   235: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   238: putfield ZS : Lburp/Zs80;
    //   241: aload_0
    //   242: new burp/Zs8_
    //   245: dup
    //   246: sipush #-28426
    //   249: sipush #-23307
    //   252: invokestatic a : (II)Ljava/lang/String;
    //   255: aload_0
    //   256: getfield Zg : Ljava/lang/Runnable;
    //   259: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   262: putfield Zt : Lburp/Zs8_;
    //   265: aload_0
    //   266: new burp/Zs8_
    //   269: dup
    //   270: sipush #-28427
    //   273: sipush #26499
    //   276: invokestatic a : (II)Ljava/lang/String;
    //   279: aload_0
    //   280: getfield Zg : Ljava/lang/Runnable;
    //   283: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   286: putfield Zq : Lburp/Zs8_;
    //   289: aload_0
    //   290: new burp/Zs80
    //   293: dup
    //   294: sipush #-28428
    //   297: sipush #23143
    //   300: invokestatic a : (II)Ljava/lang/String;
    //   303: aload_0
    //   304: getfield Zg : Ljava/lang/Runnable;
    //   307: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   312: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;Ljava/util/function/Function;)V
    //   315: putfield ZC : Lburp/Zs80;
    //   318: aload_0
    //   319: new burp/Zs8_
    //   322: dup
    //   323: sipush #-28423
    //   326: sipush #1755
    //   329: invokestatic a : (II)Ljava/lang/String;
    //   332: aload_0
    //   333: getfield Zg : Ljava/lang/Runnable;
    //   336: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   339: putfield Zp : Lburp/Zs8_;
    //   342: aload_0
    //   343: new burp/Zs8_
    //   346: dup
    //   347: sipush #-28421
    //   350: sipush #-9366
    //   353: invokestatic a : (II)Ljava/lang/String;
    //   356: aload_0
    //   357: getfield Zg : Ljava/lang/Runnable;
    //   360: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   363: putfield ZY : Lburp/Zs8_;
    //   366: aload_0
    //   367: new burp/Zs8_
    //   370: dup
    //   371: sipush #-28420
    //   374: sipush #7279
    //   377: invokestatic a : (II)Ljava/lang/String;
    //   380: aload_0
    //   381: getfield Zg : Ljava/lang/Runnable;
    //   384: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   387: putfield Zz : Lburp/Zs8_;
    //   390: aload_0
    //   391: new burp/Zs8_
    //   394: dup
    //   395: sipush #-28419
    //   398: sipush #29625
    //   401: invokestatic a : (II)Ljava/lang/String;
    //   404: aload_0
    //   405: getfield Zg : Ljava/lang/Runnable;
    //   408: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   411: putfield ZD : Lburp/Zs8_;
    //   414: aload_0
    //   415: new burp/Zs8_
    //   418: dup
    //   419: sipush #-28432
    //   422: sipush #-4274
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aload_0
    //   429: getfield Zg : Ljava/lang/Runnable;
    //   432: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   435: putfield ZG : Lburp/Zs8_;
    //   438: aload_0
    //   439: new burp/Zs8_
    //   442: dup
    //   443: sipush #-28417
    //   446: sipush #17723
    //   449: invokestatic a : (II)Ljava/lang/String;
    //   452: aload_0
    //   453: getfield Zg : Ljava/lang/Runnable;
    //   456: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   459: putfield ZI : Lburp/Zs8_;
    //   462: aload_0
    //   463: new burp/Zs8_
    //   466: dup
    //   467: sipush #-28429
    //   470: sipush #-32595
    //   473: invokestatic a : (II)Ljava/lang/String;
    //   476: aload_0
    //   477: getfield Zg : Ljava/lang/Runnable;
    //   480: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   483: putfield ZU : Lburp/Zs8_;
    //   486: aload_0
    //   487: new burp/Zs8_
    //   490: dup
    //   491: sipush #-28424
    //   494: sipush #-14579
    //   497: invokestatic a : (II)Ljava/lang/String;
    //   500: aload_0
    //   501: getfield Zg : Ljava/lang/Runnable;
    //   504: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   507: putfield ZL : Lburp/Zs8_;
    //   510: aload_0
    //   511: new burp/Zs8_
    //   514: dup
    //   515: sipush #-28444
    //   518: sipush #25241
    //   521: invokestatic a : (II)Ljava/lang/String;
    //   524: aload_0
    //   525: getfield Zg : Ljava/lang/Runnable;
    //   528: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   531: putfield Zv : Lburp/Zs8_;
    //   534: aload_0
    //   535: new burp/Zs8_
    //   538: dup
    //   539: sipush #-28422
    //   542: sipush #-8622
    //   545: invokestatic a : (II)Ljava/lang/String;
    //   548: aload_0
    //   549: getfield Zg : Ljava/lang/Runnable;
    //   552: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   555: putfield ZZ : Lburp/Zs8_;
    //   558: aload_0
    //   559: new burp/Zs8_
    //   562: dup
    //   563: sipush #-28430
    //   566: sipush #-16082
    //   569: invokestatic a : (II)Ljava/lang/String;
    //   572: aload_0
    //   573: getfield Zg : Ljava/lang/Runnable;
    //   576: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   579: putfield ZW : Lburp/Zs8_;
    //   582: aload #14
    //   584: ifnonnull -> 594
    //   587: iconst_4
    //   588: anewarray burp/Zbqc
    //   591: invokestatic Zr : ([Lburp/Zbqc;)V
    //   594: return
  }
  
  public List<Zg_8> ZM() {
    return this.ZN.Zq();
  }
  
  public Registration Zo(AuditInsertionPointProvider paramAuditInsertionPointProvider) {
    Zg_8 zg_8 = new Zg_8(this.ZX, paramAuditInsertionPointProvider, this.Zy, this.ZE, this.ZJ, this.Zo);
    return this.ZN.ZR(zg_8);
  }
  
  public List<AuditIssueHandler> Zq() {
    return this.ZI.Zq();
  }
  
  public Registration ZV(AuditIssueHandler paramAuditIssueHandler) {
    return this.ZI.ZR(paramAuditIssueHandler);
  }
  
  public List<Zesk> ZU() {
    return this.ZS.Zq();
  }
  
  public Registration ZO(ContextMenuItemsProvider paramContextMenuItemsProvider) {
    return this.ZS.ZR(new Zesk(this.ZX, paramContextMenuItemsProvider, this.Zo, this.Zu));
  }
  
  public List<Component> ZF() {
    return this.Zi.Zq();
  }
  
  public Registration Zb(Component paramComponent) {
    return this.Zi.ZR(paramComponent);
  }
  
  public void ZZ() {
    this.Zi.Z_();
  }
  
  public void ZG() {
    this.Zi.Z_();
    this.ZT.Z_();
    this.ZD.Z_();
    this.ZG.Z_();
    this.Zp.Z_();
    this.ZY.Z_();
    this.Zz.Z_();
    this.ZI.Z_();
    this.ZC.Z_();
    this.ZL.Z_();
    this.Zv.Z_();
    this.ZS.Z_();
    this.Zb.Z_();
    this.ZN.Z_();
    this.ZF.Z_();
    this.Zt.Z_();
    this.Zq.Z_();
    this.ZU.Z_();
  }
  
  public void ZD(String paramString) {
    if (!this.ZX.ZR()) {
      this.ZX.ZI(paramString);
      this.Zg.run();
    } 
  }
  
  public List<String[]> ZL() {
    ArrayList<String[]> arrayList = new ArrayList();
    Objects.requireNonNull(arrayList);
    this.ZT.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZD.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZG.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.Zp.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZY.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.Zz.Zm().ifPresent(arrayList::add);
    int[] arrayOfInt = ZH();
    Objects.requireNonNull(arrayList);
    this.ZI.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZC.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZL.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.Zv.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZZ.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZS.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.Zb.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZN.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZF.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.Zt.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.Zq.Zm().ifPresent(arrayList::add);
    Objects.requireNonNull(arrayList);
    this.ZU.Zm().ifPresent(arrayList::add);
    if (Zbqc.Zwu() == null)
      Zz(new int[4]); 
    return (List<String[]>)arrayList;
  }
  
  public List<ExtensionUnloadingHandler> Ze() {
    return this.ZT.Zq();
  }
  
  public Registration Zh(ExtensionUnloadingHandler paramExtensionUnloadingHandler) {
    return this.ZT.ZR(paramExtensionUnloadingHandler);
  }
  
  public List<HttpHandler> ZJ() {
    return this.ZD.Zq();
  }
  
  public Registration Zm(HttpHandler paramHttpHandler) {
    return this.ZD.ZR(paramHttpHandler);
  }
  
  public List<WebSocketCreatedHandler> Zx() {
    return this.ZG.Zq();
  }
  
  public Registration ZJ(WebSocketCreatedHandler paramWebSocketCreatedHandler) {
    return this.ZG.ZR(paramWebSocketCreatedHandler);
  }
  
  public Registration ZN(HttpRequestEditorProvider paramHttpRequestEditorProvider) {
    return this.ZL.ZR(paramHttpRequestEditorProvider);
  }
  
  public Registration Zz(HttpResponseEditorProvider paramHttpResponseEditorProvider) {
    return this.Zv.ZR(paramHttpResponseEditorProvider);
  }
  
  public List<HttpRequestEditorProvider> ZX() {
    return this.ZL.Zq();
  }
  
  public List<HttpResponseEditorProvider> Zh() {
    return this.Zv.Zq();
  }
  
  public List<WebSocketMessageEditorProvider> ZR() {
    return this.ZZ.Zq();
  }
  
  public Registration Zd(WebSocketMessageEditorProvider paramWebSocketMessageEditorProvider) {
    return this.ZZ.ZR(paramWebSocketMessageEditorProvider);
  }
  
  public List<PayloadGeneratorProvider> ZS() {
    return this.Zt.Zq();
  }
  
  public List<Zrun> Zc() {
    return ZS().stream().map(this::lambda$getIntruderPayloadGeneratorProviderWrappers$2).map(this::lambda$getIntruderPayloadGeneratorProviderWrappers$3).toList();
  }
  
  public Registration Zz(PayloadGeneratorProvider paramPayloadGeneratorProvider) {
    return this.Zt.ZR(paramPayloadGeneratorProvider);
  }
  
  public List<PayloadProcessor> ZK() {
    return this.Zq.Zq();
  }
  
  public List<Zkaj> ZY() {
    return ZK().stream().filter(Objects::nonNull).map(this::lambda$getIntruderPayloadProcessorWrappers$4).map(this::lambda$getIntruderPayloadProcessorWrappers$5).toList();
  }
  
  public Registration ZX(PayloadProcessor paramPayloadProcessor) {
    return this.Zq.ZR(paramPayloadProcessor);
  }
  
  public List<ProxyRequestHandler> Zi() {
    return this.Zp.Zq();
  }
  
  public Registration Zo(ProxyRequestHandler paramProxyRequestHandler) {
    return this.Zp.ZR(paramProxyRequestHandler);
  }
  
  public List<ProxyResponseHandler> ZN() {
    return this.ZY.Zq();
  }
  
  public Registration ZG(ProxyResponseHandler paramProxyResponseHandler) {
    return this.ZY.ZR(paramProxyResponseHandler);
  }
  
  public List<ProxyWebSocketCreationHandler> Zw() {
    return this.Zz.Zq();
  }
  
  public Registration ZV(ProxyWebSocketCreationHandler paramProxyWebSocketCreationHandler) {
    return this.Zz.ZR(paramProxyWebSocketCreationHandler);
  }
  
  public List<Zlzj> ZV() {
    return this.ZF.Zq();
  }
  
  public Registration ZE(ScanCheck paramScanCheck) {
    Zlzj zlzj = new Zlzj(this.ZX, paramScanCheck, this.Zj, this.Zy, this.ZE, this.ZA, this.ZF.ZM(), this.ZJ, this.Zs, this.Z_, this.Zo, this.Zl, this.ZP);
    return this.ZF.ZR(zlzj);
  }
  
  public List<Zx_> Zg() {
    return this.ZC.Zq();
  }
  
  public Registration Zw(ScopeChangeHandler paramScopeChangeHandler) {
    return this.ZC.ZR(new Zx_(this.ZX, paramScopeChangeHandler, this.Zy, this.ZE));
  }
  
  public List<SessionHandlingAction> Zv() {
    return this.ZU.Zq();
  }
  
  public Registration ZA(SessionHandlingAction paramSessionHandlingAction) {
    return this.ZU.ZR(paramSessionHandlingAction);
  }
  
  public List<Zs3q> ZE() {
    return this.Zb.Zq();
  }
  
  public Registration Zz(String paramString, Component paramComponent) {
    return this.Zb.ZR(new Zs3q(paramString, paramComponent));
  }
  
  public Registration Zy(JMenu paramJMenu) {
    return this.ZW.ZR(paramJMenu);
  }
  
  public Registration ZQ(Menu paramMenu) {
    Zsdy zsdy = new Zsdy(paramMenu);
    return this.ZW.ZR(zsdy);
  }
  
  public List<JMenu> Zl() {
    return this.ZW.Zq();
  }
  
  private Zkaj lambda$getIntruderPayloadProcessorWrappers$5(Zeem paramZeem) {
    return new Zkaj(this.ZX, paramZeem, this.Zy);
  }
  
  private Zeem lambda$getIntruderPayloadProcessorWrappers$4(PayloadProcessor paramPayloadProcessor) {
    return new Zeem(paramPayloadProcessor, this.Zu);
  }
  
  private Zrun lambda$getIntruderPayloadGeneratorProviderWrappers$3(Zsut paramZsut) {
    return new Zrun(this.ZX, paramZsut, this.Zy, this.Zo);
  }
  
  private Zsut lambda$getIntruderPayloadGeneratorProviderWrappers$2(PayloadGeneratorProvider paramPayloadGeneratorProvider) {
    return new Zsut(paramPayloadGeneratorProvider, this.Zo);
  }
  
  private static Component lambda$new$1(Zs3q paramZs3q) {
    return paramZs3q.Ze;
  }
  
  private static void lambda$new$0(Zl9 paramZl9, Zeu1 paramZeu1) {
    paramZl9.ZB(paramZeu1, true);
  }
  
  public static void Zz(int[] paramArrayOfint) {
    ZV = paramArrayOfint;
  }
  
  public static int[] ZH() {
    return ZV;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: newarray int
    //   12: ldc '3¤Ï©\\fÅHãkÄÌ×c¼¬Nÿê\\n³xM3äa:¥ªÏ\\ng*{²¥Ò§Ùªè¾J'iw(Ï+L|ngkòºc¢ÈÑè`ûB>%ÐÎ£ñRÉM§¼­ÅäFrÚóèßþS_©ìÌjÏC#5æ;P üN7÷àÃiåð:s1UÔ41rbfNoêè§ðöUîÕ±`ò¬L(:¤X¨!ÁÝÑê"ü¬µtÚØr¶©juìRßÐM3Fan¥ ÏÁàfú »Ëía´\aùMÖ»!p8Qø\ßÔVºJÂ+|ß9$9iÓÀð.ï\\rçÔTøózÜ=úNM#ô3üc>Ù&ôÁsÑªA¢ï,²£AâLm±}÷ùÎdëAé;µÏ7µ@r\\fÐëCÌ³jU9ø,Ë\\rGdõú¦Ê<Ø¬:Rµ@+b&Å)Ã\\f\\tê ¢GÔ.¡w~½åVH!À%ýÜ³ýdK[ýu(à¬ÿõÒdÆ a)r\8K'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic Zz : ([I)V
    //   24: bipush #36
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #85
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '\Y[4à(Å&íàË©Î¹\\bZèæ,É·­´,W±ÏíÒ´^ø'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #14
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #36
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zkfh.a : [Ljava/lang/String;
    //   138: bipush #19
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zkfh.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #48
    //   222: goto -> 252
    //   225: bipush #81
    //   227: goto -> 252
    //   230: bipush #68
    //   232: goto -> 252
    //   235: bipush #57
    //   237: goto -> 252
    //   240: bipush #13
    //   242: goto -> 252
    //   245: bipush #112
    //   247: goto -> 252
    //   250: bipush #41
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF90F6) & 0xFFFF;
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
      char c = 'Ù';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkfh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */