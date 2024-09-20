package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.core.Registration;
import burp.api.montoya.extension.ExtensionUnloadingHandler;
import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.http.sessions.SessionHandlingAction;
import burp.api.montoya.internal.MontoyaObjectFactory;
import burp.api.montoya.internal.ObjectFactoryLocator;
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
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import javax.swing.JMenu;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zlz3 {
  public final Zeu1 ZC;
  
  protected final Zz0n Zf;
  
  protected final Zskh ZF;
  
  protected final Zbnt Zx;
  
  protected final Zee5 Zs;
  
  protected final Ztwv ZB;
  
  protected final Zrn7 Zu;
  
  private final Ztg4 ZG;
  
  private final Zxr1 Zd;
  
  private final zzzzZl2yCustomizer ZT;
  
  public Zlz3(Zz0n paramZz0n, Zeu1 paramZeu1, Zee5 paramZee5, Zskh paramZskh, Zbnt paramZbnt, Ztg4 paramZtg4, Ztwv paramZtwv, Zrn7 paramZrn7, Zxr1 paramZxr1, Ztx8 paramZtx8) {
    this.Zf = paramZz0n;
    this.ZC = paramZeu1;
    this.Zs = paramZee5;
    this.Zx = paramZbnt;
    this.ZG = paramZtg4;
    this.ZB = paramZtwv;
    this.Zu = paramZrn7;
    this.Zd = paramZxr1;
    this.ZF = paramZskh;
    this.ZT = new zzzzZl2yCustomizer(paramZtx8);
  }
  
  public static void ZZ(ClassLoader paramClassLoader, MontoyaObjectFactory paramMontoyaObjectFactory) {
    try {
      Class<?> clazz = Class.forName(ObjectFactoryLocator.class.getName(), false, paramClassLoader);
      Field[] arrayOfField = ObjectFactoryLocator.class.getFields();
      try {
      
      } catch (ClassNotFoundException classNotFoundException) {
        throw a(null);
      } 
      Zuh.Zb((arrayOfField.length == 1), Zqf.Zr);
      Field field = clazz.getDeclaredField(arrayOfField[0].getName());
      field.set(null, paramMontoyaObjectFactory);
    } catch (ClassNotFoundException|NoSuchFieldException|IllegalAccessException classNotFoundException) {
      Zah.Zl(classNotFoundException, Zk_.UNEXPECTED);
    } 
  }
  
  public void Zh(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi, MontoyaObjectFactory paramMontoyaObjectFactory, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZB : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_3
    //   6: aload_1
    //   7: aload_2
    //   8: aload #4
    //   10: <illegal opcode> run : (Lburp/Zlz3;Lburp/api/montoya/internal/MontoyaObjectFactory;Lburp/IBurpExtenderCallbacks;Lburp/api/montoya/MontoyaApi;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   15: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   20: pop
    //   21: return
  }
  
  protected abstract void Zk(MontoyaObjectFactory paramMontoyaObjectFactory);
  
  protected abstract void ZH(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi);
  
  public void ZG(List<String[]> paramList) {
    paramList.addAll(this.Zd.ZL());
  }
  
  public Registration ZF(ExtensionUnloadingHandler paramExtensionUnloadingHandler) {
    return this.Zd.Zh(paramExtensionUnloadingHandler);
  }
  
  public void ZO() {
    this.Zd.ZZ();
    Iterator<ExtensionUnloadingHandler> iterator = this.Zd.Ze().iterator();
    String str = Zeu1.ZT();
    while (iterator.hasNext()) {
      ExtensionUnloadingHandler extensionUnloadingHandler = iterator.next();
      try {
        extensionUnloadingHandler.extensionUnloaded();
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.EXTENSION_GENERATED);
        this.ZC.ZN(throwable, this.ZF);
      } 
      if (str != null)
        break; 
    } 
    this.Zd.ZG();
    ZM();
    ZZ();
  }
  
  protected abstract void ZM();
  
  public Registration Zr(ProxyRequestHandler paramProxyRequestHandler) {
    return this.Zd.Zo(paramProxyRequestHandler);
  }
  
  public Registration Zz(ProxyResponseHandler paramProxyResponseHandler) {
    return this.Zd.ZG(paramProxyResponseHandler);
  }
  
  public Registration ZA(ProxyWebSocketCreationHandler paramProxyWebSocketCreationHandler) {
    return this.Zd.ZV(paramProxyWebSocketCreationHandler);
  }
  
  public Registration ZJ(ScopeChangeHandler paramScopeChangeHandler) {
    return this.Zd.Zw(paramScopeChangeHandler);
  }
  
  public Registration Zg(ScanCheck paramScanCheck) {
    return this.Zd.ZE(paramScanCheck);
  }
  
  public Registration ZA(PayloadGeneratorProvider paramPayloadGeneratorProvider) {
    return this.Zd.Zz(paramPayloadGeneratorProvider);
  }
  
  public Registration Zv(PayloadProcessor paramPayloadProcessor) {
    return this.Zd.ZX(paramPayloadProcessor);
  }
  
  public Registration Zq(AuditInsertionPointProvider paramAuditInsertionPointProvider) {
    return this.Zd.Zo(paramAuditInsertionPointProvider);
  }
  
  public Registration ZK(ContextMenuItemsProvider paramContextMenuItemsProvider) {
    return this.Zd.ZO(paramContextMenuItemsProvider);
  }
  
  public Registration Zg(String paramString, Component paramComponent) {
    return this.Zd.Zz(paramString, paramComponent);
  }
  
  public List<ProxyRequestHandler> Z_() {
    return this.Zd.Zi();
  }
  
  public List<ProxyResponseHandler> ZJ() {
    return this.Zd.ZN();
  }
  
  public List<ProxyWebSocketCreationHandler> Ze() {
    return this.Zd.Zw();
  }
  
  public List<Zx_> ZL() {
    return this.Zd.Zg();
  }
  
  public List<Zlzj> Zg() {
    return this.Zd.ZV();
  }
  
  public List<Zrun> Zq() {
    return this.Zd.Zc();
  }
  
  public List<Zkaj> Zf() {
    return this.Zd.ZY();
  }
  
  public List<Zg_8> ZX() {
    return this.Zd.ZM();
  }
  
  public List<Zesk> Zu() {
    return this.Zd.ZU();
  }
  
  public List<Zs3q> ZK() {
    return this.Zd.ZE();
  }
  
  public Zlzj ZQ(int paramInt) {
    List<Zlzj> list = this.Zd.ZV();
    return (paramInt < 0 || paramInt >= list.size()) ? null : list.get(paramInt);
  }
  
  public void ZF(Component paramComponent) {
    this.Zd.Zb(paramComponent);
    this.ZT.ZR(paramComponent);
  }
  
  public void ZS() {
    this.ZT.ZG(this.Zd.ZF());
  }
  
  public List<HttpHandler> Zw() {
    return this.Zd.ZJ();
  }
  
  public Registration Zi(HttpHandler paramHttpHandler) {
    return this.Zd.Zm(paramHttpHandler);
  }
  
  public Registration Za(AuditIssueHandler paramAuditIssueHandler) {
    return this.Zd.ZV(paramAuditIssueHandler);
  }
  
  public List<AuditIssueHandler> Zp() {
    return this.Zd.Zq();
  }
  
  public Registration ZW(SessionHandlingAction paramSessionHandlingAction) {
    return this.Zd.ZA(paramSessionHandlingAction);
  }
  
  public List<SessionHandlingAction> ZH() {
    return this.Zd.Zv();
  }
  
  public Registration Ze(WebSocketMessageEditorProvider paramWebSocketMessageEditorProvider) {
    return this.Zd.Zd(paramWebSocketMessageEditorProvider);
  }
  
  public Registration ZG(HttpRequestEditorProvider paramHttpRequestEditorProvider) {
    return this.Zd.ZN(paramHttpRequestEditorProvider);
  }
  
  public List<WebSocketCreatedHandler> ZN() {
    return this.Zd.Zx();
  }
  
  public Registration ZR(WebSocketCreatedHandler paramWebSocketCreatedHandler) {
    return this.Zd.ZJ(paramWebSocketCreatedHandler);
  }
  
  public Registration Zn(HttpResponseEditorProvider paramHttpResponseEditorProvider) {
    return this.Zd.Zz(paramHttpResponseEditorProvider);
  }
  
  public List<Zoh> ZB() {
    return this.Zd.ZX().stream().map(this::lambda$getHttpRequestEditorProviders$1).toList();
  }
  
  public List<Zgi0> ZD() {
    return this.Zd.Zh().stream().map(this::lambda$getHttpResponseEditorProviders$2).toList();
  }
  
  public List<Zb2h> Zd() {
    return this.Zd.ZR().stream().map(this::lambda$getWebSocketMessageEditorProviders$3).toList();
  }
  
  public Registration Zj(JMenu paramJMenu) {
    return this.Zd.Zy(paramJMenu);
  }
  
  public Registration Zm(Menu paramMenu) {
    return this.Zd.ZQ(paramMenu);
  }
  
  public List<JMenu> ZT() {
    return this.Zd.Zl();
  }
  
  public abstract void ZZ();
  
  public void ZN(String paramString) {
    this.Zd.ZD(paramString);
  }
  
  private Zb2h lambda$getWebSocketMessageEditorProviders$3(WebSocketMessageEditorProvider paramWebSocketMessageEditorProvider) {
    return new Zb2h(paramWebSocketMessageEditorProvider, this.ZC);
  }
  
  private Zgi0 lambda$getHttpResponseEditorProviders$2(HttpResponseEditorProvider paramHttpResponseEditorProvider) {
    return new Zgi0(paramHttpResponseEditorProvider, this.ZC);
  }
  
  private Zoh lambda$getHttpRequestEditorProviders$1(HttpRequestEditorProvider paramHttpRequestEditorProvider) {
    return new Zoh(paramHttpRequestEditorProvider, this.ZC);
  }
  
  private void lambda$initialiseOnNewThread$0(MontoyaObjectFactory paramMontoyaObjectFactory, IBurpExtenderCallbacks paramIBurpExtenderCallbacks, MontoyaApi paramMontoyaApi, Runnable paramRunnable) {
    Zk(paramMontoyaObjectFactory);
    ZH(paramIBurpExtenderCallbacks, paramMontoyaApi);
    Zbsv.Ze();
    paramRunnable.run();
  }
  
  private static ClassNotFoundException a(ClassNotFoundException paramClassNotFoundException) {
    return paramClassNotFoundException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlz3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */