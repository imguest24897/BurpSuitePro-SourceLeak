package burp;

import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zss5 implements IBurpExtenderCallbacks {
  private final IBurpExtenderCallbacks Zf;
  
  private final Zo1 ZG;
  
  private final Zbnt ZN;
  
  private final Ztx8 Zm;
  
  private final Zey9 ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zss5(IBurpExtenderCallbacks paramIBurpExtenderCallbacks, Zo1 paramZo1, Zbnt paramZbnt, Ztx8 paramZtx8, Zey9 paramZey9) {
    this.Zf = paramIBurpExtenderCallbacks;
    this.ZG = paramZo1;
    this.ZN = paramZbnt;
    this.Zm = paramZtx8;
    this.ZO = paramZey9;
  }
  
  public void setExtensionName(String paramString) {
    this.Zf.setExtensionName(paramString);
  }
  
  public IExtensionHelpers getHelpers() {
    return this.Zf.getHelpers();
  }
  
  public OutputStream getStdout() {
    return this.Zf.getStdout();
  }
  
  public OutputStream getStderr() {
    return this.Zf.getStderr();
  }
  
  public void printOutput(String paramString) {
    this.Zf.printOutput(paramString);
  }
  
  public void printError(String paramString) {
    this.Zf.printError(paramString);
  }
  
  public void registerExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {
    this.Zf.registerExtensionStateListener(paramIExtensionStateListener);
  }
  
  public List<IExtensionStateListener> getExtensionStateListeners() {
    return this.Zf.getExtensionStateListeners();
  }
  
  public void removeExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {
    this.Zf.removeExtensionStateListener(paramIExtensionStateListener);
  }
  
  public void registerHttpListener(IHttpListener paramIHttpListener) {
    this.Zf.registerHttpListener(paramIHttpListener);
  }
  
  public List<IHttpListener> getHttpListeners() {
    return this.Zf.getHttpListeners();
  }
  
  public void removeHttpListener(IHttpListener paramIHttpListener) {
    this.Zf.removeHttpListener(paramIHttpListener);
  }
  
  public void registerProxyListener(IProxyListener paramIProxyListener) {
    this.Zf.registerProxyListener(paramIProxyListener);
  }
  
  public List<IProxyListener> getProxyListeners() {
    return this.Zf.getProxyListeners();
  }
  
  public void removeProxyListener(IProxyListener paramIProxyListener) {
    this.Zf.removeProxyListener(paramIProxyListener);
  }
  
  public void registerScannerListener(IScannerListener paramIScannerListener) {
    this.Zf.registerScannerListener(paramIScannerListener);
  }
  
  public List<IScannerListener> getScannerListeners() {
    return this.Zf.getScannerListeners();
  }
  
  public void removeScannerListener(IScannerListener paramIScannerListener) {
    this.Zf.removeScannerListener(paramIScannerListener);
  }
  
  public void registerScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {
    this.Zf.registerScopeChangeListener(paramIScopeChangeListener);
  }
  
  public List<IScopeChangeListener> getScopeChangeListeners() {
    return this.Zf.getScopeChangeListeners();
  }
  
  public void removeScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {
    this.Zf.removeScopeChangeListener(paramIScopeChangeListener);
  }
  
  public void registerContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {
    this.Zf.registerContextMenuFactory(paramIContextMenuFactory);
  }
  
  public List<IContextMenuFactory> getContextMenuFactories() {
    return this.Zf.getContextMenuFactories();
  }
  
  public void removeContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {
    this.Zf.removeContextMenuFactory(paramIContextMenuFactory);
  }
  
  public void registerMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {
    this.Zf.registerMessageEditorTabFactory(paramIMessageEditorTabFactory);
  }
  
  public List<IMessageEditorTabFactory> getMessageEditorTabFactories() {
    return this.Zf.getMessageEditorTabFactories();
  }
  
  public void removeMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {
    this.Zf.removeMessageEditorTabFactory(paramIMessageEditorTabFactory);
  }
  
  public void registerScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {
    this.Zf.registerScannerInsertionPointProvider(paramIScannerInsertionPointProvider);
  }
  
  public List<IScannerInsertionPointProvider> getScannerInsertionPointProviders() {
    return this.Zf.getScannerInsertionPointProviders();
  }
  
  public void removeScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {
    this.Zf.removeScannerInsertionPointProvider(paramIScannerInsertionPointProvider);
  }
  
  public void registerScannerCheck(IScannerCheck paramIScannerCheck) {
    this.Zf.registerScannerCheck(paramIScannerCheck);
  }
  
  public List<IScannerCheck> getScannerChecks() {
    return this.Zf.getScannerChecks();
  }
  
  public void removeScannerCheck(IScannerCheck paramIScannerCheck) {
    this.Zf.removeScannerCheck(paramIScannerCheck);
  }
  
  public void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {
    this.Zf.registerIntruderPayloadGeneratorFactory(paramIIntruderPayloadGeneratorFactory);
  }
  
  public List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories() {
    return this.Zf.getIntruderPayloadGeneratorFactories();
  }
  
  public void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {
    this.Zf.removeIntruderPayloadGeneratorFactory(paramIIntruderPayloadGeneratorFactory);
  }
  
  public void registerIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {
    this.Zf.registerIntruderPayloadProcessor(paramIIntruderPayloadProcessor);
  }
  
  public List<IIntruderPayloadProcessor> getIntruderPayloadProcessors() {
    return this.Zf.getIntruderPayloadProcessors();
  }
  
  public void removeIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {
    this.Zf.removeIntruderPayloadProcessor(paramIIntruderPayloadProcessor);
  }
  
  public void registerSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {
    this.Zf.registerSessionHandlingAction(paramISessionHandlingAction);
  }
  
  public List<ISessionHandlingAction> getSessionHandlingActions() {
    return this.Zf.getSessionHandlingActions();
  }
  
  public void removeSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {
    this.Zf.removeSessionHandlingAction(paramISessionHandlingAction);
  }
  
  public void unloadExtension() {
    this.Zf.unloadExtension();
  }
  
  public void addSuiteTab(ITab paramITab) {
    this.Zf.addSuiteTab(paramITab);
  }
  
  public void removeSuiteTab(ITab paramITab) {
    this.Zf.removeSuiteTab(paramITab);
  }
  
  public void customizeUiComponent(Component paramComponent) {
    this.Zf.customizeUiComponent(paramComponent);
  }
  
  public IMessageEditor createMessageEditor(IMessageEditorController paramIMessageEditorController, boolean paramBoolean) {
    return this.Zf.createMessageEditor(paramIMessageEditorController, paramBoolean);
  }
  
  public String[] getCommandLineArguments() {
    return this.Zf.getCommandLineArguments();
  }
  
  public void saveExtensionSetting(String paramString1, String paramString2) {
    this.Zf.saveExtensionSetting(paramString1, paramString2);
  }
  
  public String loadExtensionSetting(String paramString) {
    return this.Zf.loadExtensionSetting(paramString);
  }
  
  public ITextEditor createTextEditor() {
    return this.Zf.createTextEditor();
  }
  
  public void sendToRepeater(String paramString1, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, String paramString2) {
    this.Zf.sendToRepeater(paramString1, paramInt, paramBoolean, paramArrayOfbyte, paramString2);
  }
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    this.Zf.sendToIntruder(paramString, paramInt, paramBoolean, paramArrayOfbyte);
  }
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    this.Zf.sendToIntruder(paramString, paramInt, paramBoolean, paramArrayOfbyte, paramList);
  }
  
  public void sendToComparer(byte[] paramArrayOfbyte) {
    this.Zf.sendToComparer(paramArrayOfbyte);
  }
  
  public void sendToSpider(URL paramURL) {
    this.Zf.sendToSpider(paramURL);
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return this.Zf.doActiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte);
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    return this.Zf.doActiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte, paramList);
  }
  
  public void doPassiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this.Zf.doPassiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return makeHttpRequest(paramIHttpService, paramArrayOfbyte, false);
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte, boolean paramBoolean) {
    Zleg zleg = this.ZG.Zg();
    if (zleg != null)
      try {
        try {
          if (SwingUtilities.isEventDispatchThread())
            throw new RuntimeException(a(21263, 11671)); 
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        try {
          if (paramIHttpService == null)
            throw new NullPointerException(a(21248, 8801)); 
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        try {
          if (paramArrayOfbyte == null)
            throw new NullPointerException(a(21257, 22235)); 
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        try {
        
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        Ze45 ze45 = paramBoolean ? Ze45.SUPPRESS_HTTP2 : Ze45.ATTEMPT_HTTP2;
        Zefx zefx = this.ZO.ZY(Zb28.Zs(paramIHttpService, this.ZN), paramArrayOfbyte);
        Zsxd zsxd = zleg.ZM(zefx, ze45);
        return Zkvw.Za(Zxpu.ZQ(zsxd), this.ZN);
      } catch (Zs2o zs2o) {
        Zah.Zl(zs2o, Zk_.IGNORED);
        throw this.Zm.Zf(new RuntimeException(a(21262, 19162)));
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        throw this.Zm.Zf(throwable);
      }  
    return this.Zf.makeHttpRequest(paramIHttpService, paramArrayOfbyte, paramBoolean);
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return makeHttpRequest(paramString, paramInt, paramBoolean, paramArrayOfbyte, false);
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2) {
    Zleg zleg = this.ZG.Zg();
    if (zleg != null)
      try {
        try {
          if (SwingUtilities.isEventDispatchThread())
            throw new RuntimeException(a(21263, 11671)); 
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        try {
          if (paramString == null)
            throw new NullPointerException(a(21256, 9193)); 
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        try {
          if (paramArrayOfbyte == null)
            throw new NullPointerException(a(21260, 13910)); 
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        try {
        
        } catch (Zs2o zs2o) {
          throw a(null);
        } 
        Ze45 ze45 = paramBoolean2 ? Ze45.SUPPRESS_HTTP2 : Ze45.ATTEMPT_HTTP2;
        Zefx zefx = this.ZO.ZY(this.ZN.ZY(paramString, paramInt, paramBoolean1), paramArrayOfbyte);
        Zsxd zsxd = zleg.ZM(zefx, ze45);
        if (zsxd.ZG().Zb() == Zvom.RESPONSE_RECEIVED)
          return zsxd.ZG().Ze().Za().ZiD(); 
        throw (Zsc2)zleg.Za().orElseGet(Zsc5::new);
      } catch (Zs2o zs2o) {
        Zah.Zl(zs2o, Zk_.IGNORED);
        throw this.Zm.Zf(new RuntimeException(a(21262, 19162)));
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
        throw this.Zm.Zf(throwable);
      }  
    return this.Zf.makeHttpRequest(paramString, paramInt, paramBoolean1, paramArrayOfbyte, paramBoolean2);
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, false, null);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (arrayOfByte == null) ? this.Zf.makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte) : arrayOfByte;
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean) {
    byte[] arrayOfByte = makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, paramBoolean, null);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (arrayOfByte == null) ? this.Zf.makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, paramBoolean) : arrayOfByte;
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean, String paramString) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Ze45 ze45 = paramBoolean ? Ze45.FORCE_HTTP2_NON_POOLED : Ze45.ONLY_HTTP2;
    byte[] arrayOfByte = Zy(paramIHttpService, paramList, paramArrayOfbyte, ze45, paramString);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (arrayOfByte == null) ? this.Zf.makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, paramBoolean, paramString) : arrayOfByte;
  }
  
  private byte[] Zy(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, Ze45 paramZe45, String paramString) {
    Zleg zleg = this.ZG.Zg();
    try {
      if (zleg == null)
        return null; 
    } catch (Zs2o zs2o) {
      throw a(null);
    } 
    try {
      try {
        if (SwingUtilities.isEventDispatchThread())
          throw new RuntimeException(a(21259, 30937)); 
      } catch (Zs2o zs2o) {
        throw a(null);
      } 
      try {
        if (paramIHttpService == null)
          throw new NullPointerException(a(21258, -8114)); 
      } catch (Zs2o zs2o) {
        throw a(null);
      } 
      try {
        if (paramList == null)
          throw new NullPointerException(a(21251, 32133)); 
      } catch (Zs2o zs2o) {
        throw a(null);
      } 
      try {
        if (paramArrayOfbyte == null)
          throw new NullPointerException(a(21249, -18609)); 
      } catch (Zs2o zs2o) {
        throw a(null);
      } 
      List<Ztnz> list = (List)paramList.stream().map(Zss5::lambda$makeHttp2Request$0).collect(Collectors.toList());
      Zefx zefx = this.ZO.ZR(Zb28.Zs(paramIHttpService, this.ZN), list, paramArrayOfbyte);
      Zsxd zsxd = zleg.Zx(zefx, paramZe45, paramString);
      if (zsxd.ZG().Zb() == Zvom.RESPONSE_RECEIVED)
        return zsxd.ZG().Ze().Za().ZiD(); 
      throw (Zsc2)zleg.Za().orElseGet(Zsc5::new);
    } catch (Zs2o zs2o) {
      Zah.Zl(zs2o, Zk_.IGNORED);
      throw this.Zm.Zf(new RuntimeException(a(21261, 875)));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw this.Zm.Zf(throwable);
    } 
  }
  
  public boolean isInScope(URL paramURL) {
    return this.Zf.isInScope(paramURL);
  }
  
  public void includeInScope(URL paramURL) {
    this.Zf.includeInScope(paramURL);
  }
  
  public void excludeFromScope(URL paramURL) {
    this.Zf.excludeFromScope(paramURL);
  }
  
  public void issueAlert(String paramString) {
    this.Zf.issueAlert(paramString);
  }
  
  public IHttpRequestResponse[] getProxyHistory() {
    return this.Zf.getProxyHistory();
  }
  
  public IHttpRequestResponse[] getSiteMap(String paramString) {
    return this.Zf.getSiteMap(paramString);
  }
  
  public IScanIssue[] getScanIssues(String paramString) {
    return this.Zf.getScanIssues(paramString);
  }
  
  public void generateScanReport(String paramString, IScanIssue[] paramArrayOfIScanIssue, File paramFile) {
    this.Zf.generateScanReport(paramString, paramArrayOfIScanIssue, paramFile);
  }
  
  public List<ICookie> getCookieJarContents() {
    return this.Zf.getCookieJarContents();
  }
  
  public void updateCookieJar(ICookie paramICookie) {
    this.Zf.updateCookieJar(paramICookie);
  }
  
  public void addToSiteMap(IHttpRequestResponse paramIHttpRequestResponse) {
    this.Zf.addToSiteMap(paramIHttpRequestResponse);
  }
  
  public void restoreState(File paramFile) {
    this.Zf.restoreState(paramFile);
  }
  
  public void saveState(File paramFile) {
    this.Zf.saveState(paramFile);
  }
  
  public Map<String, String> saveConfig() {
    return this.Zf.saveConfig();
  }
  
  public void loadConfig(Map<String, String> paramMap) {
    this.Zf.loadConfig(paramMap);
  }
  
  public String saveConfigAsJson(String... paramVarArgs) {
    return this.Zf.saveConfigAsJson(paramVarArgs);
  }
  
  public void loadConfigFromJson(String paramString) {
    this.Zf.loadConfigFromJson(paramString);
  }
  
  public void setProxyInterceptionEnabled(boolean paramBoolean) {
    this.Zf.setProxyInterceptionEnabled(paramBoolean);
  }
  
  public String[] getBurpVersion() {
    return this.Zf.getBurpVersion();
  }
  
  public String getExtensionFilename() {
    return this.Zf.getExtensionFilename();
  }
  
  public boolean isExtensionBapp() {
    return this.Zf.isExtensionBapp();
  }
  
  public void exitSuite(boolean paramBoolean) {
    this.Zf.exitSuite(paramBoolean);
  }
  
  public ITempFile saveToTempFile(byte[] paramArrayOfbyte) {
    return this.Zf.saveToTempFile(paramArrayOfbyte);
  }
  
  public IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse paramIHttpRequestResponse) {
    return this.Zf.saveBuffersToTempFiles(paramIHttpRequestResponse);
  }
  
  public IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse paramIHttpRequestResponse, List<int[]> paramList1, List<int[]> paramList2) {
    return this.Zf.applyMarkers(paramIHttpRequestResponse, paramList1, paramList2);
  }
  
  public String getToolName(int paramInt) {
    return this.Zf.getToolName(paramInt);
  }
  
  public void addScanIssue(IScanIssue paramIScanIssue) {
    this.Zf.addScanIssue(paramIScanIssue);
  }
  
  public IBurpCollaboratorClientContext createBurpCollaboratorClientContext() {
    return this.Zf.createBurpCollaboratorClientContext();
  }
  
  public String[][] getParameters(byte[] paramArrayOfbyte) {
    return this.Zf.getParameters(paramArrayOfbyte);
  }
  
  public String[] getHeaders(byte[] paramArrayOfbyte) {
    return this.Zf.getHeaders(paramArrayOfbyte);
  }
  
  public void registerMenuItem(String paramString, IMenuItemHandler paramIMenuItemHandler) {
    this.Zf.registerMenuItem(paramString, paramIMenuItemHandler);
  }
  
  private static Ztnz lambda$makeHttp2Request$0(IHttpHeader paramIHttpHeader) {
    return new Ztnz(paramIHttpHeader.getName(), paramIHttpHeader.getValue());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '^:äâðFrzZ,æ$:ºR[<qåü¢;á*zø½!îK\yòÕSDc;sv9¨Ä\\tÇ\\bçè¢¿ñ´ô³/VÜÀ®ÝîDC?ã¶KroO´{óxµ3îÛrº»¸ËÅô~û#È±{0Hxi4ä0rîñÿ#"«ÖÄý¶ Æ¯¯1ÁÍ.ÚÔ\\nd!¢«ëËû.Ç]Ý³2"å¨Âéô©j!.d×²ïZKûXÍõ°\\r\\t°JáAùj`dvlÇÎI»kÆM¶¿gòb#C,=r9ù¬n¢iR,õ+¤ÏCÏþiØ¹ññ5Ut'3Ó´sÇÃõ¯èþglÉ7d=!õ&þ2QU{ÛéÛ+WZÑ¸=ì'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #22
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #110
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
    //   68: ldc 'ÔòØË+L|´¾\\tàÂhËô(r2Â¶V7æº«¥sÝ Ñè(#\\b[¢¿Náµ±\\r÷'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #27
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #123
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
    //   129: putstatic burp/Zss5.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zss5.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #10
    //   214: goto -> 243
    //   217: bipush #115
    //   219: goto -> 243
    //   222: iconst_2
    //   223: goto -> 243
    //   226: bipush #37
    //   228: goto -> 243
    //   231: bipush #122
    //   233: goto -> 243
    //   236: bipush #67
    //   238: goto -> 243
    //   241: bipush #47
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5309) & 0xFFFF;
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
      char c = 'ü';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zss5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */