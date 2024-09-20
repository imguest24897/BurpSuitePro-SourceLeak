package burp;

import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Zeoq implements IBurpExtenderCallbacks {
  private final AtomicReference<IBurpExtenderCallbacks> Zz;
  
  private final Zrmv Zy;
  
  private final Zmjn ZM;
  
  private final Zmjn Zl;
  
  public Zeoq(IBurpExtenderCallbacks paramIBurpExtenderCallbacks) {
    this.Zz = new AtomicReference<>(paramIBurpExtenderCallbacks);
    this.Zy = new Zrmv(paramIBurpExtenderCallbacks.getHelpers());
    this.ZM = new Zmjn(paramIBurpExtenderCallbacks.getStdout());
    this.Zl = new Zmjn(paramIBurpExtenderCallbacks.getStderr());
  }
  
  public void Zc() {
    this.Zz.set(new Zb8r());
    this.Zy.ZB();
    this.ZM.Zu();
    this.Zl.Zu();
  }
  
  public void setExtensionName(String paramString) {
    ((IBurpExtenderCallbacks)this.Zz.get()).setExtensionName(paramString);
  }
  
  public IExtensionHelpers getHelpers() {
    return this.Zy;
  }
  
  public OutputStream getStdout() {
    return this.ZM;
  }
  
  public OutputStream getStderr() {
    return this.Zl;
  }
  
  public void printOutput(String paramString) {
    ((IBurpExtenderCallbacks)this.Zz.get()).printOutput(paramString);
  }
  
  public void printError(String paramString) {
    ((IBurpExtenderCallbacks)this.Zz.get()).printError(paramString);
  }
  
  public void registerExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerExtensionStateListener(paramIExtensionStateListener);
  }
  
  public List<IExtensionStateListener> getExtensionStateListeners() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getExtensionStateListeners();
  }
  
  public void removeExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeExtensionStateListener(paramIExtensionStateListener);
  }
  
  public void registerHttpListener(IHttpListener paramIHttpListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerHttpListener(paramIHttpListener);
  }
  
  public List<IHttpListener> getHttpListeners() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getHttpListeners();
  }
  
  public void removeHttpListener(IHttpListener paramIHttpListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeHttpListener(paramIHttpListener);
  }
  
  public void registerProxyListener(IProxyListener paramIProxyListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerProxyListener(paramIProxyListener);
  }
  
  public List<IProxyListener> getProxyListeners() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getProxyListeners();
  }
  
  public void removeProxyListener(IProxyListener paramIProxyListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeProxyListener(paramIProxyListener);
  }
  
  public void registerScannerListener(IScannerListener paramIScannerListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerScannerListener(paramIScannerListener);
  }
  
  public List<IScannerListener> getScannerListeners() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getScannerListeners();
  }
  
  public void removeScannerListener(IScannerListener paramIScannerListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeScannerListener(paramIScannerListener);
  }
  
  public void registerScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerScopeChangeListener(paramIScopeChangeListener);
  }
  
  public List<IScopeChangeListener> getScopeChangeListeners() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getScopeChangeListeners();
  }
  
  public void removeScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeScopeChangeListener(paramIScopeChangeListener);
  }
  
  public void registerContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerContextMenuFactory(paramIContextMenuFactory);
  }
  
  public List<IContextMenuFactory> getContextMenuFactories() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getContextMenuFactories();
  }
  
  public void removeContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeContextMenuFactory(paramIContextMenuFactory);
  }
  
  public void registerMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerMessageEditorTabFactory(paramIMessageEditorTabFactory);
  }
  
  public List<IMessageEditorTabFactory> getMessageEditorTabFactories() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getMessageEditorTabFactories();
  }
  
  public void removeMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeMessageEditorTabFactory(paramIMessageEditorTabFactory);
  }
  
  public void registerScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerScannerInsertionPointProvider(paramIScannerInsertionPointProvider);
  }
  
  public List<IScannerInsertionPointProvider> getScannerInsertionPointProviders() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getScannerInsertionPointProviders();
  }
  
  public void removeScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeScannerInsertionPointProvider(paramIScannerInsertionPointProvider);
  }
  
  public void registerScannerCheck(IScannerCheck paramIScannerCheck) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerScannerCheck(paramIScannerCheck);
  }
  
  public List<IScannerCheck> getScannerChecks() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getScannerChecks();
  }
  
  public void removeScannerCheck(IScannerCheck paramIScannerCheck) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeScannerCheck(paramIScannerCheck);
  }
  
  public void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerIntruderPayloadGeneratorFactory(paramIIntruderPayloadGeneratorFactory);
  }
  
  public List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getIntruderPayloadGeneratorFactories();
  }
  
  public void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeIntruderPayloadGeneratorFactory(paramIIntruderPayloadGeneratorFactory);
  }
  
  public void registerIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerIntruderPayloadProcessor(paramIIntruderPayloadProcessor);
  }
  
  public List<IIntruderPayloadProcessor> getIntruderPayloadProcessors() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getIntruderPayloadProcessors();
  }
  
  public void removeIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeIntruderPayloadProcessor(paramIIntruderPayloadProcessor);
  }
  
  public void registerSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerSessionHandlingAction(paramISessionHandlingAction);
  }
  
  public List<ISessionHandlingAction> getSessionHandlingActions() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getSessionHandlingActions();
  }
  
  public void removeSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeSessionHandlingAction(paramISessionHandlingAction);
  }
  
  public void unloadExtension() {
    ((IBurpExtenderCallbacks)this.Zz.get()).unloadExtension();
  }
  
  public void addSuiteTab(ITab paramITab) {
    ((IBurpExtenderCallbacks)this.Zz.get()).addSuiteTab(paramITab);
  }
  
  public void removeSuiteTab(ITab paramITab) {
    ((IBurpExtenderCallbacks)this.Zz.get()).removeSuiteTab(paramITab);
  }
  
  public void customizeUiComponent(Component paramComponent) {
    ((IBurpExtenderCallbacks)this.Zz.get()).customizeUiComponent(paramComponent);
  }
  
  public IMessageEditor createMessageEditor(IMessageEditorController paramIMessageEditorController, boolean paramBoolean) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).createMessageEditor(paramIMessageEditorController, paramBoolean);
  }
  
  public String[] getCommandLineArguments() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getCommandLineArguments();
  }
  
  public void saveExtensionSetting(String paramString1, String paramString2) {
    ((IBurpExtenderCallbacks)this.Zz.get()).saveExtensionSetting(paramString1, paramString2);
  }
  
  public String loadExtensionSetting(String paramString) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).loadExtensionSetting(paramString);
  }
  
  public ITextEditor createTextEditor() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).createTextEditor();
  }
  
  public void sendToRepeater(String paramString1, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, String paramString2) {
    ((IBurpExtenderCallbacks)this.Zz.get()).sendToRepeater(paramString1, paramInt, paramBoolean, paramArrayOfbyte, paramString2);
  }
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    ((IBurpExtenderCallbacks)this.Zz.get()).sendToIntruder(paramString, paramInt, paramBoolean, paramArrayOfbyte);
  }
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    ((IBurpExtenderCallbacks)this.Zz.get()).sendToIntruder(paramString, paramInt, paramBoolean, paramArrayOfbyte, paramList);
  }
  
  public void sendToComparer(byte[] paramArrayOfbyte) {
    ((IBurpExtenderCallbacks)this.Zz.get()).sendToComparer(paramArrayOfbyte);
  }
  
  public void sendToSpider(URL paramURL) {
    ((IBurpExtenderCallbacks)this.Zz.get()).sendToSpider(paramURL);
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).doActiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte);
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).doActiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte, paramList);
  }
  
  public void doPassiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    ((IBurpExtenderCallbacks)this.Zz.get()).doPassiveScan(paramString, paramInt, paramBoolean, paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttpRequest(paramIHttpService, paramArrayOfbyte);
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttpRequest(paramIHttpService, paramArrayOfbyte, paramBoolean);
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttpRequest(paramString, paramInt, paramBoolean, paramArrayOfbyte);
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttpRequest(paramString, paramInt, paramBoolean1, paramArrayOfbyte, paramBoolean2);
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte);
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, paramBoolean);
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean, String paramString) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).makeHttp2Request(paramIHttpService, paramList, paramArrayOfbyte, paramBoolean, paramString);
  }
  
  public boolean isInScope(URL paramURL) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).isInScope(paramURL);
  }
  
  public void includeInScope(URL paramURL) {
    ((IBurpExtenderCallbacks)this.Zz.get()).includeInScope(paramURL);
  }
  
  public void excludeFromScope(URL paramURL) {
    ((IBurpExtenderCallbacks)this.Zz.get()).excludeFromScope(paramURL);
  }
  
  public void issueAlert(String paramString) {
    ((IBurpExtenderCallbacks)this.Zz.get()).issueAlert(paramString);
  }
  
  public IHttpRequestResponse[] getProxyHistory() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getProxyHistory();
  }
  
  public IHttpRequestResponse[] getSiteMap(String paramString) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getSiteMap(paramString);
  }
  
  public IScanIssue[] getScanIssues(String paramString) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getScanIssues(paramString);
  }
  
  public void generateScanReport(String paramString, IScanIssue[] paramArrayOfIScanIssue, File paramFile) {
    ((IBurpExtenderCallbacks)this.Zz.get()).generateScanReport(paramString, paramArrayOfIScanIssue, paramFile);
  }
  
  public List<ICookie> getCookieJarContents() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getCookieJarContents();
  }
  
  public void updateCookieJar(ICookie paramICookie) {
    ((IBurpExtenderCallbacks)this.Zz.get()).updateCookieJar(paramICookie);
  }
  
  public void addToSiteMap(IHttpRequestResponse paramIHttpRequestResponse) {
    ((IBurpExtenderCallbacks)this.Zz.get()).addToSiteMap(paramIHttpRequestResponse);
  }
  
  public void restoreState(File paramFile) {
    ((IBurpExtenderCallbacks)this.Zz.get()).restoreState(paramFile);
  }
  
  public void saveState(File paramFile) {
    ((IBurpExtenderCallbacks)this.Zz.get()).saveState(paramFile);
  }
  
  public Map<String, String> saveConfig() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).saveConfig();
  }
  
  public void loadConfig(Map<String, String> paramMap) {
    ((IBurpExtenderCallbacks)this.Zz.get()).loadConfig(paramMap);
  }
  
  public String saveConfigAsJson(String... paramVarArgs) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).saveConfigAsJson(paramVarArgs);
  }
  
  public void loadConfigFromJson(String paramString) {
    ((IBurpExtenderCallbacks)this.Zz.get()).loadConfigFromJson(paramString);
  }
  
  public void setProxyInterceptionEnabled(boolean paramBoolean) {
    ((IBurpExtenderCallbacks)this.Zz.get()).setProxyInterceptionEnabled(paramBoolean);
  }
  
  public String[] getBurpVersion() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getBurpVersion();
  }
  
  public String getExtensionFilename() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getExtensionFilename();
  }
  
  public boolean isExtensionBapp() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).isExtensionBapp();
  }
  
  public void exitSuite(boolean paramBoolean) {
    ((IBurpExtenderCallbacks)this.Zz.get()).exitSuite(paramBoolean);
  }
  
  public ITempFile saveToTempFile(byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).saveToTempFile(paramArrayOfbyte);
  }
  
  public IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse paramIHttpRequestResponse) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).saveBuffersToTempFiles(paramIHttpRequestResponse);
  }
  
  public IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse paramIHttpRequestResponse, List<int[]> paramList1, List<int[]> paramList2) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).applyMarkers(paramIHttpRequestResponse, paramList1, paramList2);
  }
  
  public String getToolName(int paramInt) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getToolName(paramInt);
  }
  
  public void addScanIssue(IScanIssue paramIScanIssue) {
    ((IBurpExtenderCallbacks)this.Zz.get()).addScanIssue(paramIScanIssue);
  }
  
  public IBurpCollaboratorClientContext createBurpCollaboratorClientContext() {
    return ((IBurpExtenderCallbacks)this.Zz.get()).createBurpCollaboratorClientContext();
  }
  
  public String[][] getParameters(byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getParameters(paramArrayOfbyte);
  }
  
  public String[] getHeaders(byte[] paramArrayOfbyte) {
    return ((IBurpExtenderCallbacks)this.Zz.get()).getHeaders(paramArrayOfbyte);
  }
  
  public void registerMenuItem(String paramString, IMenuItemHandler paramIMenuItemHandler) {
    ((IBurpExtenderCallbacks)this.Zz.get()).registerMenuItem(paramString, paramIMenuItemHandler);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeoq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */