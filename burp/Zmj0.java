package burp;

import burp.api.montoya.MontoyaApi;
import burp.api.montoya.burpsuite.ShutdownOptions;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Range;
import burp.api.montoya.core.Registration;
import burp.api.montoya.core.Version;
import burp.api.montoya.extension.ExtensionUnloadingHandler;
import burp.api.montoya.http.HttpMode;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.http.sessions.CookieJar;
import burp.api.montoya.intruder.HttpRequestTemplate;
import burp.api.montoya.persistence.Preferences;
import burp.api.montoya.scanner.BuiltInAuditConfiguration;
import burp.api.montoya.scanner.ReportFormat;
import burp.api.montoya.scanner.audit.Audit;
import burp.api.montoya.scope.ScopeChange;
import burp.api.montoya.sitemap.SiteMapFilter;
import burp.api.montoya.ui.UserInterface;
import burp.api.montoya.ui.editor.RawEditor;
import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zto;

public class Zmj0 implements IBurpExtenderCallbacks {
  private final Ztx8 ZQ;
  
  private final Zbnt Zr;
  
  private final Zlz3 Zb;
  
  private final IExtensionHelpers ZO;
  
  private final Ztyg ZA;
  
  private final Zlxz ZG;
  
  private final Zgq7 ZB;
  
  private final MontoyaApi Zm;
  
  private final Zzqf ZZ;
  
  private final Map<IScopeChangeListener, Registration> Zz;
  
  private final Map<IExtensionStateListener, Registration> Zs;
  
  private final Map<IProxyListener, Registration> ZL;
  
  private final Map<IProxyListener, Registration> ZK;
  
  private final Map<IHttpListener, Registration> ZP;
  
  private final Map<IScannerListener, Registration> Zo;
  
  private final Map<ISessionHandlingAction, Registration> Zt;
  
  private final Map<IIntruderPayloadProcessor, Registration> ZW;
  
  private final Map<IIntruderPayloadGeneratorFactory, Registration> ZD;
  
  private final Map<IScannerInsertionPointProvider, Registration> ZS;
  
  private final Map<IScannerCheck, Registration> Za;
  
  private final Map<ITab, Registration> Zg;
  
  private final Map<IContextMenuFactory, Registration> Zn;
  
  private final Map<IMessageEditorTabFactory, Zto<Registration, Registration>> Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static IBurpExtenderCallbacks ZH(Zbnt paramZbnt, Zlz3 paramZlz3, Ztyg paramZtyg, Zgq7 paramZgq7, Zlxz paramZlxz, Zo1 paramZo1, MontoyaApi paramMontoyaApi, Ztx8 paramZtx8, Zzqf paramZzqf, Zey9 paramZey9) {
    Zmj0 zmj0 = new Zmj0(paramZbnt, paramZlz3, paramZtyg, paramZgq7, paramZlxz, paramMontoyaApi, paramZtx8, paramZzqf);
    return new Zss5(new Zstj(zmj0), paramZo1, paramZbnt, paramZtx8, paramZey9);
  }
  
  private Zmj0(Zbnt paramZbnt, Zlz3 paramZlz3, Ztyg paramZtyg, Zgq7 paramZgq7, Zlxz paramZlxz, MontoyaApi paramMontoyaApi, Ztx8 paramZtx8, Zzqf paramZzqf) {
    this.Zm = paramMontoyaApi;
    this.ZZ = paramZzqf;
    this.Zr = paramZbnt;
    this.Zb = paramZlz3;
    this.ZA = paramZtyg;
    this.ZB = paramZgq7;
    this.ZG = paramZlxz;
    this.ZQ = paramZtx8;
    this.Zz = new LinkedHashMap<>();
    this.Zs = new LinkedHashMap<>();
    this.ZL = new LinkedHashMap<>();
    this.ZK = new LinkedHashMap<>();
    this.ZP = new LinkedHashMap<>();
    this.Zo = new LinkedHashMap<>();
    this.Zt = new LinkedHashMap<>();
    this.ZW = new LinkedHashMap<>();
    this.ZD = new LinkedHashMap<>();
    this.ZS = new LinkedHashMap<>();
    this.Za = new LinkedHashMap<>();
    this.Zg = new LinkedHashMap<>();
    this.Zn = new LinkedHashMap<>();
    this.Zj = new LinkedHashMap<>();
    this.ZO = Zrnh.Zy(paramZbnt, paramMontoyaApi, paramZtx8, paramZzqf);
  }
  
  public void issueAlert(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void sendToRepeater(String paramString1, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: aload #4
    //   8: iload_2
    //   9: iload_3
    //   10: aload #5
    //   12: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;[BIZLjava/lang/String;)Lburp/Zl6v;
    //   17: invokeinterface ZO : (Lburp/Zl6v;)V
    //   22: return
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return makeHttpRequest(paramString, paramInt, paramBoolean, paramArrayOfbyte, false);
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2) {
    try {
      try {
        if (paramString == null)
          throw new NullPointerException(a(15538, -11663)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(15536, 21407)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequest httpRequest = this.ZZ.Zq(paramString, paramInt, paramBoolean1, paramArrayOfbyte);
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpMode httpMode = paramBoolean2 ? HttpMode.HTTP_1 : HttpMode.AUTO;
      HttpRequestResponse httpRequestResponse = this.Zm.http().sendRequest(httpRequest, httpMode);
      HttpResponse httpResponse = httpRequestResponse.response();
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return (httpResponse == null) ? null : httpResponse.toByteArray().getBytes();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte) {
    return makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, false, null);
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, paramBoolean, null);
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean, String paramString) {
    Objects.requireNonNull(paramIHttpService, a(15511, 1427));
    try {
      HttpMode httpMode = paramBoolean ? HttpMode.HTTP_2_IGNORE_ALPN : HttpMode.HTTP_2;
      HttpRequest httpRequest = this.ZZ.ZT(paramIHttpService, paramList, paramArrayOfbyte);
      HttpRequestResponse httpRequestResponse = this.Zm.http().sendRequest(httpRequest, httpMode, paramString);
      HttpResponse httpResponse = httpRequestResponse.response();
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      return (httpResponse == null) ? null : httpResponse.toByteArray().getBytes();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      throw this.ZQ.Zf(exception);
    } 
  }
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    sendToIntruder(paramString, paramInt, paramBoolean, paramArrayOfbyte, null);
  }
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: aload #4
    //   8: iload_2
    //   9: iload_3
    //   10: aload #5
    //   12: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;[BIZLjava/util/List;)Lburp/Zl6v;
    //   17: invokeinterface ZO : (Lburp/Zl6v;)V
    //   22: return
  }
  
  public void sendToSpider(URL paramURL) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/net/URL;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return doActiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte, null);
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    try {
      try {
        if (paramString == null)
          throw new IllegalArgumentException(a(15550, -12771)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (paramArrayOfbyte == null)
          throw new IllegalArgumentException(a(15505, -24347)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequest httpRequest = this.ZZ.Zq(paramString, paramInt, paramBoolean, paramArrayOfbyte);
      try {
        Objects.requireNonNull(this.ZZ);
      } catch (Throwable throwable) {
        throw a(null);
      } 
      List<T> list = (paramList == null) ? null : paramList.stream().map(this.ZZ::ZK).toList();
      Audit audit = this.Zm.scanner().startAudit(this.ZZ.ZC(BuiltInAuditConfiguration.LEGACY_ACTIVE_AUDIT_CHECKS));
      audit.addRequest(httpRequest, list);
      return new Zkak(audit);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void doPassiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: aload #4
    //   8: aload #5
    //   10: iload_2
    //   11: iload_3
    //   12: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;[B[BIZ)Lburp/Zl6v;
    //   17: invokeinterface ZO : (Lburp/Zl6v;)V
    //   22: return
  }
  
  public boolean isInScope(URL paramURL) {
    try {
      return this.Zm.scope().isInScope(paramURL.toString());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void includeInScope(URL paramURL) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/net/URL;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void excludeFromScope(URL paramURL) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/net/URL;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IHttpRequestResponse[] getProxyHistory() {
    try {
      return (IHttpRequestResponse[])this.Zm.proxy().history().stream().map(Zd6::new).map(this::lambda$getProxyHistory$7).toArray(Zmj0::lambda$getProxyHistory$8);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public IHttpRequestResponse[] getSiteMap(String paramString) {
    try {
      List list = this.Zm.siteMap().requestResponses(this.ZZ.ZL(paramString));
      return (IHttpRequestResponse[])list.stream().map(Zswb::new).map(this::lambda$getSiteMap$9).toArray(Zmj0::lambda$getProxyHistory$8);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void addToSiteMap(IHttpRequestResponse paramIHttpRequestResponse) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 25
    //   4: new java/lang/IllegalArgumentException
    //   7: dup
    //   8: sipush #15526
    //   11: sipush #-20037
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: invokespecial <init> : (Ljava/lang/String;)V
    //   20: athrow
    //   21: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   24: athrow
    //   25: aload_0
    //   26: getfield ZQ : Lburp/Ztx8;
    //   29: aload_0
    //   30: aload_1
    //   31: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IHttpRequestResponse;)Lburp/Zl6v;
    //   36: invokeinterface ZO : (Lburp/Zl6v;)V
    //   41: return
    // Exception table:
    //   from	to	target	type
    //   0	21	21	java/lang/NullPointerException
  }
  
  public void restoreState(File paramFile) {
    throw new UnsupportedOperationException();
  }
  
  public void saveState(File paramFile) {
    throw new UnsupportedOperationException(a(15523, -2246));
  }
  
  public String[][] getParameters(byte[] paramArrayOfbyte) {
    throw new UnsupportedOperationException();
  }
  
  public String[] getHeaders(byte[] paramArrayOfbyte) {
    throw new UnsupportedOperationException();
  }
  
  public IScanIssue[] getScanIssues(String paramString) {
    try {
      SiteMapFilter siteMapFilter = this.ZZ.ZL(paramString);
      List list = this.Zm.siteMap().issues(siteMapFilter);
      return (IScanIssue[])list.stream().map(Zzei::new).toArray(Zmj0::lambda$getScanIssues$12);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void generateScanReport(String paramString, IScanIssue[] paramArrayOfIScanIssue, File paramFile) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_2
    //   6: aload_1
    //   7: aload_3
    //   8: <illegal opcode> Zk : (Lburp/Zmj0;[Lburp/IScanIssue;Ljava/lang/String;Ljava/io/File;)Lburp/Zl6v;
    //   13: invokeinterface ZO : (Lburp/Zl6v;)V
    //   18: return
  }
  
  public void registerMenuItem(String paramString, IMenuItemHandler paramIMenuItemHandler) {
    throw new UnsupportedOperationException();
  }
  
  public Map<String, String> saveConfig() {
    throw new UnsupportedOperationException(a(15528, 23433));
  }
  
  public void loadConfig(Map<String, String> paramMap) {
    throw new UnsupportedOperationException(a(15539, -29551));
  }
  
  public String saveConfigAsJson(String... paramVarArgs) {
    try {
      return this.Zm.burpSuite().exportProjectOptionsAsJson(paramVarArgs);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void loadConfigFromJson(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void setProxyInterceptionEnabled(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: iload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Z)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public String[] getBurpVersion() {
    try {
      Version version = this.Zm.burpSuite().version();
      return new String[] { version.name(), version.major(), version.minor() };
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public String getExtensionFilename() {
    try {
      return this.Zm.extension().filename();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public boolean isExtensionBapp() {
    try {
      return this.Zm.extension().isBapp();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void exitSuite(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: iload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Z)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IExtensionStateListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IExtensionStateListener> getExtensionStateListeners() {
    try {
      return List.copyOf(this.Zs.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IExtensionStateListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerScannerListener(IScannerListener paramIScannerListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScannerListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IScannerListener> getScannerListeners() {
    try {
      return List.copyOf(this.Zo.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeScannerListener(IScannerListener paramIScannerListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScannerListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerProxyListener(IProxyListener paramIProxyListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IProxyListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IProxyListener> getProxyListeners() {
    try {
      return List.copyOf(this.ZL.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeProxyListener(IProxyListener paramIProxyListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IProxyListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerHttpListener(IHttpListener paramIHttpListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IHttpListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IHttpListener> getHttpListeners() {
    try {
      return List.copyOf(this.ZP.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeHttpListener(IHttpListener paramIHttpListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IHttpListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IMessageEditorTabFactory;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IMessageEditorTabFactory> getMessageEditorTabFactories() {
    try {
      return List.copyOf(this.Zj.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IMessageEditorTabFactory;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IContextMenuFactory;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IContextMenuFactory> getContextMenuFactories() {
    try {
      return List.copyOf(this.Zn.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IContextMenuFactory;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void setExtensionName(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public OutputStream getStdout() {
    try {
      return this.Zm.logging().output();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public OutputStream getStderr() {
    try {
      return this.Zm.logging().error();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void printOutput(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void printError(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void addSuiteTab(ITab paramITab) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/ITab;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void removeSuiteTab(ITab paramITab) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/ITab;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IMessageEditor createMessageEditor(IMessageEditorController paramIMessageEditorController, boolean paramBoolean) {
    try {
      return Zbnv.ZX(this.Zr, paramIMessageEditorController, paramBoolean, this.ZA, this.ZB, this.ZQ);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public ITextEditor createTextEditor() {
    try {
      RawEditor rawEditor = this.Zm.userInterface().createRawEditor(new burp.api.montoya.ui.editor.EditorOptions[0]);
      return new Zsep(new Ztrq(rawEditor, this.ZZ));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public ITempFile saveToTempFile(byte[] paramArrayOfbyte) {
    try {
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(15549, -19125)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return new Zxac(this.ZZ.Zb(paramArrayOfbyte));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse paramIHttpRequestResponse) {
    try {
      try {
        if (paramIHttpRequestResponse == null)
          throw new NullPointerException(a(15540, -4382)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return new Zs91(this.ZZ.ZE(paramIHttpRequestResponse));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public String getToolName(int paramInt) {
    try {
      try {
        switch (paramInt) {
          case 1:
          
          case 2:
          
          case 4:
          
          case 8:
          case 16:
          
          case 32:
          
          case 64:
          
          case 128:
          
          case 1024:
          
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      return null;
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void customizeUiComponent(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/awt/Component;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScannerInsertionPointProvider;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IScannerInsertionPointProvider> getScannerInsertionPointProviders() {
    try {
      return List.copyOf(this.ZS.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScannerInsertionPointProvider;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void addScanIssue(IScanIssue paramIScanIssue) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScanIssue;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse paramIHttpRequestResponse, List<int[]> paramList1, List<int[]> paramList2) {
    try {
      try {
        if (paramIHttpRequestResponse == null)
          throw new NullPointerException(a(15541, 8487)); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      HttpRequestResponse httpRequestResponse = this.ZZ.ZU(paramIHttpRequestResponse);
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      List<Range> list1 = (paramList1 == null) ? null : (List)paramList1.stream().filter(Objects::nonNull).map(this::lambda$applyMarkers$39).collect(Collectors.toList());
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      List<Range> list2 = (paramList2 == null) ? null : (List)paramList2.stream().filter(Objects::nonNull).map(this::lambda$applyMarkers$39).collect(Collectors.toList());
      return new Zr0n(httpRequestResponse, this.ZZ, list1, list2);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void registerScannerCheck(IScannerCheck paramIScannerCheck) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScannerCheck;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IScannerCheck> getScannerChecks() {
    try {
      return List.copyOf(this.Za.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeScannerCheck(IScannerCheck paramIScannerCheck) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScannerCheck;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/ISessionHandlingAction;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<ISessionHandlingAction> getSessionHandlingActions() {
    try {
      return List.copyOf(this.Zt.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/ISessionHandlingAction;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IIntruderPayloadGeneratorFactory;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories() {
    try {
      return List.copyOf(this.ZD.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IIntruderPayloadGeneratorFactory;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void registerIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IIntruderPayloadProcessor;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IIntruderPayloadProcessor> getIntruderPayloadProcessors() {
    try {
      return List.copyOf(this.ZW.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public IBurpCollaboratorClientContext createBurpCollaboratorClientContext() {
    try {
      return Ze2r.ZG(this.ZG.ZU(), this.ZG.ZV());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IIntruderPayloadProcessor;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public IExtensionHelpers getHelpers() {
    return this.ZO;
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return makeHttpRequest(paramIHttpService, paramArrayOfbyte, false);
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte, boolean paramBoolean) {
    try {
      if (paramIHttpService == null)
        throw new NullPointerException(a(15547, 12835)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte == null)
        throw new NullPointerException(a(15520, 12663)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      HttpMode httpMode = paramBoolean ? HttpMode.HTTP_1 : HttpMode.AUTO;
      HttpRequest httpRequest = this.ZZ.Zj(paramIHttpService, paramArrayOfbyte);
      HttpRequestResponse httpRequestResponse = this.Zm.http().sendRequest(httpRequest, httpMode);
      return new Zr0w(httpRequestResponse, this.Zr, this.ZZ);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      throw this.ZQ.Zf(exception);
    } 
  }
  
  public void saveExtensionSetting(String paramString1, String paramString2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_2
    //   6: aload_1
    //   7: <illegal opcode> Zk : (Lburp/Zmj0;Ljava/lang/String;Ljava/lang/String;)Lburp/Zl6v;
    //   12: invokeinterface ZO : (Lburp/Zl6v;)V
    //   17: return
  }
  
  public String loadExtensionSetting(String paramString) {
    try {
      return this.Zm.persistence().preferences().getString(paramString);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void registerScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScopeChangeListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<IScopeChangeListener> getScopeChangeListeners() {
    try {
      return List.copyOf(this.Zz.keySet());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void removeScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/IScopeChangeListener;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public List<ICookie> getCookieJarContents() {
    try {
      CookieJar cookieJar = this.Zm.http().cookieJar();
      List list = cookieJar.cookies();
      return (List<ICookie>)list.stream().map(Zki7::Zn).collect(Collectors.toList());
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void updateCookieJar(ICookie paramICookie) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;Lburp/ICookie;)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  public void unloadExtension() {
    this.ZQ.ZO(this::lambda$unloadExtension$54);
  }
  
  public String[] getCommandLineArguments() {
    try {
      List list = this.Zm.burpSuite().commandLineArguments();
      return (String[])list.toArray((Object[])new String[0]);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.ZQ.Zf(throwable);
    } 
  }
  
  public void sendToComparer(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZQ : Lburp/Ztx8;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> Zk : (Lburp/Zmj0;[B)Lburp/Zl6v;
    //   11: invokeinterface ZO : (Lburp/Zl6v;)V
    //   16: return
  }
  
  private void lambda$sendToComparer$55(byte[] paramArrayOfbyte) throws Throwable {
    try {
      if (paramArrayOfbyte == null)
        throw new NullPointerException(a(15506, 32326)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.Zm.comparer().sendToComparer(new ByteArray[] { this.ZZ.ZI(paramArrayOfbyte) });
  }
  
  private void lambda$unloadExtension$54() throws Throwable {
    this.Zm.extension().unload();
  }
  
  private void lambda$updateCookieJar$53(ICookie paramICookie) throws Throwable {
    try {
      if (paramICookie.getDomain() == null)
        throw new NullPointerException(a(15543, 16370)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    CookieJar cookieJar = this.Zm.http().cookieJar();
    ZonedDateTime zonedDateTime = Ztc3.Za(paramICookie.getExpiration());
    cookieJar.setCookie(paramICookie.getName(), paramICookie.getValue(), paramICookie.getPath(), paramICookie.getDomain(), zonedDateTime);
  }
  
  private void lambda$removeScopeChangeListener$52(IScopeChangeListener paramIScopeChangeListener) throws Throwable {
    try {
      if (paramIScopeChangeListener == null)
        throw new IllegalArgumentException(a(15542, -6259)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zz.remove(paramIScopeChangeListener);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerScopeChangeListener$51(IScopeChangeListener paramIScopeChangeListener) throws Throwable {
    try {
      if (paramIScopeChangeListener == null)
        throw new IllegalArgumentException(a(15531, -24897)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zm.scope().registerScopeChangeHandler(paramIScopeChangeListener::lambda$registerScopeChangeListener$50);
    this.Zz.put(paramIScopeChangeListener, registration);
  }
  
  private static void lambda$registerScopeChangeListener$50(IScopeChangeListener paramIScopeChangeListener, ScopeChange paramScopeChange) {
    paramIScopeChangeListener.scopeChanged();
  }
  
  private void lambda$saveExtensionSetting$49(String paramString1, String paramString2) throws Throwable {
    String[] arrayOfString = Zmu0.ZB();
    Preferences preferences = this.Zm.persistence().preferences();
    try {
      if (paramString1 == null) {
        try {
          preferences.deleteString(paramString2);
          if (arrayOfString != null) {
            preferences.setString(paramString2, paramString1);
            return;
          } 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        return;
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    preferences.setString(paramString2, paramString1);
  }
  
  private void lambda$removeIntruderPayloadProcessor$48(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) throws Throwable {
    try {
      if (paramIIntruderPayloadProcessor == null)
        throw new NullPointerException(a(15530, -23574)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.ZW.remove(paramIIntruderPayloadProcessor);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerIntruderPayloadProcessor$47(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) throws Throwable {
    try {
      if (paramIIntruderPayloadProcessor == null)
        throw new NullPointerException(a(15522, -18320)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zb.Zv(new Zgdg(this.Zb.ZC, paramIIntruderPayloadProcessor, this.ZZ));
    this.ZW.put(paramIIntruderPayloadProcessor, registration);
  }
  
  private void lambda$removeIntruderPayloadGeneratorFactory$46(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) throws Throwable {
    try {
      if (paramIIntruderPayloadGeneratorFactory == null)
        throw new NullPointerException(a(15525, 8623)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.ZD.remove(paramIIntruderPayloadGeneratorFactory);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerIntruderPayloadGeneratorFactory$45(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) throws Throwable {
    try {
      if (paramIIntruderPayloadGeneratorFactory == null)
        throw new NullPointerException(a(15534, 22345)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zrt7 zrt7 = new Zrt7(this.Zb.ZC, paramIIntruderPayloadGeneratorFactory, this.ZZ);
    Registration registration = this.Zb.ZA(zrt7);
    this.ZD.put(paramIIntruderPayloadGeneratorFactory, registration);
  }
  
  private void lambda$removeSessionHandlingAction$44(ISessionHandlingAction paramISessionHandlingAction) throws Throwable {
    try {
      if (paramISessionHandlingAction == null)
        throw new IllegalArgumentException(a(15508, -22809)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zt.remove(paramISessionHandlingAction);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerSessionHandlingAction$43(ISessionHandlingAction paramISessionHandlingAction) throws Throwable {
    try {
      if (paramISessionHandlingAction == null)
        throw new IllegalArgumentException(a(15548, -16920)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zgdd zgdd = new Zgdd(paramISessionHandlingAction, this.Zr, this.ZQ, this.ZZ);
    Registration registration = this.Zb.ZW(zgdd);
    this.Zt.put(paramISessionHandlingAction, registration);
  }
  
  private void lambda$removeScannerCheck$42(IScannerCheck paramIScannerCheck) throws Throwable {
    try {
      if (paramIScannerCheck == null)
        throw new NullPointerException(a(15532, -23975)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Za.remove(paramIScannerCheck);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerScannerCheck$41(IScannerCheck paramIScannerCheck) throws Throwable {
    try {
      if (paramIScannerCheck == null)
        throw new NullPointerException(a(15509, -3859)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zbqe zbqe = new Zbqe(paramIScannerCheck, this.ZZ);
    Registration registration = this.Zb.Zg(zbqe);
    this.Za.put(paramIScannerCheck, registration);
  }
  
  private Range lambda$applyMarkers$39(int[] paramArrayOfint) {
    return this.ZZ.Z_(paramArrayOfint[0], paramArrayOfint[1]);
  }
  
  private void lambda$addScanIssue$38(IScanIssue paramIScanIssue) throws Throwable {
    try {
      if (paramIScanIssue == null)
        throw new IllegalArgumentException(a(15521, 680)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.Zm.siteMap().add(new Zlel(paramIScanIssue, this.ZZ));
  }
  
  private void lambda$removeScannerInsertionPointProvider$37(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) throws Throwable {
    try {
      if (paramIScannerInsertionPointProvider == null)
        throw new NullPointerException(a(15533, 19314)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.ZS.remove(paramIScannerInsertionPointProvider);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerScannerInsertionPointProvider$36(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) throws Throwable {
    try {
      if (paramIScannerInsertionPointProvider == null)
        throw new NullPointerException(a(15504, -29160)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zlpp zlpp = new Zlpp(paramIScannerInsertionPointProvider, this.ZZ);
    Registration registration = this.Zm.scanner().registerInsertionPointProvider(zlpp);
    this.ZS.put(paramIScannerInsertionPointProvider, registration);
  }
  
  private void lambda$customizeUiComponent$35(Component paramComponent) throws Throwable {
    this.Zm.userInterface().applyThemeToComponent(paramComponent);
  }
  
  private void lambda$removeSuiteTab$34(ITab paramITab) throws Throwable {
    try {
      if (paramITab == null)
        throw new NullPointerException(a(15510, -13087)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Component component = paramITab.getUiComponent();
    try {
      if (component == null)
        throw new NullPointerException(a(15551, -14984)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zg.remove(paramITab);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$addSuiteTab$33(ITab paramITab) throws Throwable {
    Registration registration = this.Zm.userInterface().registerSuiteTab(paramITab.getTabCaption(), paramITab.getUiComponent());
    this.Zg.put(paramITab, registration);
  }
  
  private void lambda$printError$32(String paramString) throws Throwable {
    this.Zm.logging().logToError(paramString);
  }
  
  private void lambda$printOutput$31(String paramString) throws Throwable {
    this.Zm.logging().logToOutput(paramString);
  }
  
  private void lambda$setExtensionName$30(String paramString) throws Throwable {
    this.Zm.extension().setName(paramString);
  }
  
  private void lambda$removeContextMenuFactory$29(IContextMenuFactory paramIContextMenuFactory) throws Throwable {
    try {
      if (paramIContextMenuFactory == null)
        throw new NullPointerException(a(15534, 22345)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zn.remove(paramIContextMenuFactory);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerContextMenuFactory$28(IContextMenuFactory paramIContextMenuFactory) throws Throwable {
    try {
      if (paramIContextMenuFactory == null)
        throw new NullPointerException(a(15534, 22345)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zm.userInterface().registerContextMenuItemsProvider(new Zsft(paramIContextMenuFactory, this.Zr, this.ZZ));
    this.Zn.put(paramIContextMenuFactory, registration);
  }
  
  private void lambda$removeMessageEditorTabFactory$27(IMessageEditorTabFactory paramIMessageEditorTabFactory) throws Throwable {
    try {
      if (paramIMessageEditorTabFactory == null)
        throw new NullPointerException(a(15534, 22345)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zto zto = this.Zj.remove(paramIMessageEditorTabFactory);
    try {
      if (zto != null) {
        ((Registration)zto.Zq).deregister();
        ((Registration)zto.Zo).deregister();
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerMessageEditorTabFactory$26(IMessageEditorTabFactory paramIMessageEditorTabFactory) throws Throwable {
    try {
      if (paramIMessageEditorTabFactory == null)
        throw new NullPointerException(a(15534, 22345)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zmao zmao = new Zmao(paramIMessageEditorTabFactory, this.ZZ);
    UserInterface userInterface = this.Zm.userInterface();
    Registration registration1 = userInterface.registerHttpRequestEditorProvider(zmao);
    Registration registration2 = userInterface.registerHttpResponseEditorProvider(zmao);
    this.Zj.put(paramIMessageEditorTabFactory, Zto.ZM(registration1, registration2));
  }
  
  private void lambda$removeHttpListener$25(IHttpListener paramIHttpListener) throws Throwable {
    try {
      if (paramIHttpListener == null)
        throw new IllegalArgumentException(a(15542, -6259)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.ZP.remove(paramIHttpListener);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerHttpListener$24(IHttpListener paramIHttpListener) throws Throwable {
    try {
      if (paramIHttpListener == null)
        throw new IllegalArgumentException(a(15524, 10388)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zmih zmih = new Zmih(paramIHttpListener, this.ZZ);
    Registration registration = this.Zm.http().registerHttpHandler(zmih);
    this.ZP.put(paramIHttpListener, registration);
  }
  
  private void lambda$removeProxyListener$23(IProxyListener paramIProxyListener) throws Throwable {
    try {
      if (paramIProxyListener == null)
        throw new IllegalArgumentException(a(15542, -6259)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration1 = this.ZL.remove(paramIProxyListener);
    try {
      if (registration1 != null)
        registration1.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration2 = this.ZK.remove(paramIProxyListener);
    try {
      if (registration2 != null)
        registration2.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerProxyListener$22(IProxyListener paramIProxyListener) throws Throwable {
    try {
      if (paramIProxyListener == null)
        throw new IllegalArgumentException(a(15542, -6259)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zeq0 zeq0 = new Zeq0(paramIProxyListener, this.ZQ, this.ZZ);
    Registration registration1 = this.Zm.proxy().registerRequestHandler(zeq0);
    Registration registration2 = this.Zm.proxy().registerResponseHandler(zeq0);
    this.ZL.put(paramIProxyListener, registration1);
    this.ZK.put(paramIProxyListener, registration2);
  }
  
  private void lambda$removeScannerListener$21(IScannerListener paramIScannerListener) throws Throwable {
    try {
      if (paramIScannerListener == null)
        throw new IllegalArgumentException(a(15542, -6259)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zo.remove(paramIScannerListener);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerScannerListener$20(IScannerListener paramIScannerListener) throws Throwable {
    try {
      if (paramIScannerListener == null)
        throw new IllegalArgumentException(a(15527, -4105)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Zgbe zgbe = new Zgbe(paramIScannerListener);
    Registration registration = this.Zm.scanner().registerAuditIssueHandler(zgbe);
    this.Zo.put(paramIScannerListener, registration);
  }
  
  private void lambda$removeExtensionStateListener$19(IExtensionStateListener paramIExtensionStateListener) throws Throwable {
    try {
      if (paramIExtensionStateListener == null)
        throw new NullPointerException(a(15542, -6259)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Registration registration = this.Zs.remove(paramIExtensionStateListener);
    try {
      if (registration != null)
        registration.deregister(); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
  }
  
  private void lambda$registerExtensionStateListener$18(IExtensionStateListener paramIExtensionStateListener) throws Throwable {
    try {
      if (paramIExtensionStateListener == null)
        throw new NullPointerException(a(15546, 21240)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Objects.requireNonNull(paramIExtensionStateListener);
    ExtensionUnloadingHandler extensionUnloadingHandler = paramIExtensionStateListener::extensionUnloaded;
    Registration registration = this.Zm.extension().registerUnloadingHandler(extensionUnloadingHandler);
    this.Zs.put(paramIExtensionStateListener, registration);
  }
  
  private void lambda$exitSuite$17(boolean paramBoolean) throws Throwable {
    String[] arrayOfString = Zmu0.ZB();
    try {
      if (paramBoolean) {
        try {
          this.Zm.burpSuite().shutdown(new ShutdownOptions[] { ShutdownOptions.PROMPT_USER });
          if (arrayOfString != null) {
            this.Zm.burpSuite().shutdown(new ShutdownOptions[0]);
            return;
          } 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        return;
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.Zm.burpSuite().shutdown(new ShutdownOptions[0]);
  }
  
  private void lambda$setProxyInterceptionEnabled$16(boolean paramBoolean) throws Throwable {
    String[] arrayOfString = Zmu0.ZB();
    try {
      if (paramBoolean) {
        try {
          this.Zm.proxy().enableIntercept();
          if (arrayOfString != null) {
            this.Zm.proxy().disableIntercept();
            return;
          } 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        return;
      } 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.Zm.proxy().disableIntercept();
  }
  
  private void lambda$loadConfigFromJson$15(String paramString) throws Throwable {
    this.Zm.burpSuite().importProjectOptionsFromJson(paramString);
  }
  
  private void lambda$generateScanReport$14(IScanIssue[] paramArrayOfIScanIssue, String paramString, File paramFile) throws Throwable {
    List list = (List)Arrays.<IScanIssue>stream(paramArrayOfIScanIssue).map(this::lambda$generateScanReport$13).collect(Collectors.toList());
    ReportFormat reportFormat = Zt6v.ZC(paramString);
    this.Zm.scanner().generateReport(list, reportFormat, paramFile.toPath());
  }
  
  private Zlel lambda$generateScanReport$13(IScanIssue paramIScanIssue) {
    return new Zlel(paramIScanIssue, this.ZZ);
  }
  
  private static IScanIssue[] lambda$getScanIssues$12(int paramInt) {
    return new IScanIssue[paramInt];
  }
  
  private void lambda$addToSiteMap$11(IHttpRequestResponse paramIHttpRequestResponse) throws Throwable {
    HttpRequestResponse httpRequestResponse = this.ZZ.ZU(paramIHttpRequestResponse);
    this.Zm.siteMap().add(httpRequestResponse);
  }
  
  private Zrlb lambda$getSiteMap$9(Zswb paramZswb) {
    return new Zrlb(paramZswb, this.ZQ);
  }
  
  private static IHttpRequestResponse[] lambda$getProxyHistory$8(int paramInt) {
    return new IHttpRequestResponse[paramInt];
  }
  
  private Zrlb lambda$getProxyHistory$7(Zd6 paramZd6) {
    return new Zrlb(paramZd6, this.ZQ);
  }
  
  private void lambda$excludeFromScope$6(URL paramURL) throws Throwable {
    this.Zm.scope().excludeFromScope(paramURL.toString());
  }
  
  private void lambda$includeInScope$5(URL paramURL) throws Throwable {
    this.Zm.scope().includeInScope(paramURL.toString());
  }
  
  private void lambda$doPassiveScan$4(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, boolean paramBoolean) throws Throwable {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(15529, 31579)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte1 == null)
        throw new IllegalArgumentException(a(15537, 26612)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte2 == null)
        throw new IllegalArgumentException(a(15535, 19464)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    Audit audit = this.Zm.scanner().startAudit(this.ZZ.ZC(BuiltInAuditConfiguration.LEGACY_PASSIVE_AUDIT_CHECKS));
    audit.addRequestResponse(this.ZZ.ZP(paramString, paramInt, paramBoolean, paramArrayOfbyte1, paramArrayOfbyte2));
  }
  
  private void lambda$sendToSpider$3(URL paramURL) throws Throwable {
    try {
      if (paramURL == null)
        throw new NullPointerException(a(15545, 478)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    this.Zm.scanner().startCrawl(this.ZZ.ZI(new String[] { paramURL.toExternalForm() }));
  }
  
  private void lambda$sendToIntruder$2(String paramString, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean, List<int[]> paramList) throws Throwable {
    try {
      if (paramString == null)
        throw new NullPointerException(a(15544, -23896)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte == null)
        throw new NullPointerException(a(15536, 21407)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    HttpService httpService = this.ZZ.Zh(paramString, paramInt, paramBoolean);
    HttpRequestTemplate httpRequestTemplate = this.ZZ.Zp(paramArrayOfbyte, paramList);
    this.Zm.intruder().sendToIntruder(httpService, httpRequestTemplate);
  }
  
  private void lambda$sendToRepeater$1(String paramString1, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean, String paramString2) throws Throwable {
    try {
      if (paramString1 == null)
        throw new NullPointerException(a(15538, -11663)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      if (paramArrayOfbyte == null)
        throw new NullPointerException(a(15536, 21407)); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    HttpRequest httpRequest = this.ZZ.Zq(paramString1, paramInt, paramBoolean, paramArrayOfbyte);
    this.Zm.repeater().sendToRepeater(httpRequest, paramString2);
  }
  
  private void lambda$issueAlert$0(String paramString) throws Throwable {
    this.Zm.logging().raiseInfoEvent(paramString);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #39
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'õÇÚvKÅÒ84K,ê0P5'wâ74TÏÂF"ÀÕ]ö¤GíÇQ Qì7æÌxù8^¸qÁk9+2½ Z1¶ ?[ T/\\t#¸TcbëåXýWÞ¢Û^¾j£óÁ¢ôÚ³5ßº,6:q57Ü{±Â&E@æÏí·>í¦QÔ3àû6Òh,}5w§<ªaÙùjø 24ÜÎA,£°©ÒÒ¿)Ú\\nÚ óÝîÎ.#,\\rF\\rùÝßÇµÞéjbÒ©1`Á%u¬&¿Y­ÒyÉ>Ü¬Î'Òs$r¬éeÐQðSS8RbAÛV< ?ÓèèêC6ÐE!zz©ÃºIº@88Rq¿æWÆ»EÉ!C«îtÿóåÙØØ/TZûBê«c}.ê¯6.·lÓÌ&øËU1ó/M<XQ¼y_c ´ÃùgùàU è+<òs_ivªnÓæýcÎ+®Y©¤Ö¡}°áÑ\\rtFG uSàKIÜÏüKÎô¨¿çCI®ß\\níýÿÐÜÓG>/L§È¨xª-÷¼\\nºìùÒ\\nýÅñ¡ÐüL­Z@å×Å@n¿ý£ü!GóÚé4xOCBÑ£±­¡gj\\nÁöúÇ)5å^BjÛ&ýÈ÷¦m\\n½ãLÎ¦|ïÊ´\\td1\\tHòtfI°è?Iü_çFÚb{Ä½@`dÆrM-÷÷­Ñ6ügC¨ý¥è¼$o<²fÒaýw£=«§ûï (äw4yGrO*ÖÄä#Ç¾Ì}´ÞÆä£'Y2¨]}=ôUâEöÖê\\tH`)uhüáÊRF4©px©p,K)}NHñaaþr9Â®S½ò^qHè¨ÁQLÂñäÀ§Ù\\rÛÀ(éÇóf ­öøytu°n`ÚU\\b q4¦T\\f]Ã÷¦_@éÏLIîÃÿ=MèÌUÀIÜ@¾Q7¥µ¾Æ÷P,ÒRÍ"DûÍóõ \\rÎZê>³ËñÐ[?\\n'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #35
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #124
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
    //   68: ldc 'å>SKµ{îØ\\n¿ZeG@razÃ~5ÿã&°ÀRE¹Dã«M'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #24
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #33
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
    //   129: putstatic burp/Zmj0.a : [Ljava/lang/String;
    //   132: bipush #39
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmj0.b : [Ljava/lang/String;
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
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #66
    //   224: goto -> 244
    //   227: bipush #16
    //   229: goto -> 244
    //   232: bipush #28
    //   234: goto -> 244
    //   237: bipush #115
    //   239: goto -> 244
    //   242: bipush #96
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
    int i = (paramInt1 ^ 0x3CB4) & 0xFFFF;
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
      char c = '±';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmj0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */