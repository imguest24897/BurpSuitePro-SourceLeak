package burp;

import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class Zb8r implements IBurpExtenderCallbacks {
  public void setExtensionName(String paramString) {}
  
  public IExtensionHelpers getHelpers() {
    return new Zs3j();
  }
  
  public OutputStream getStdout() {
    return new Zscu();
  }
  
  public OutputStream getStderr() {
    return new Zscu();
  }
  
  public void printOutput(String paramString) {}
  
  public void printError(String paramString) {}
  
  public void registerExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {}
  
  public List<IExtensionStateListener> getExtensionStateListeners() {
    return Collections.emptyList();
  }
  
  public void removeExtensionStateListener(IExtensionStateListener paramIExtensionStateListener) {}
  
  public void registerHttpListener(IHttpListener paramIHttpListener) {}
  
  public List<IHttpListener> getHttpListeners() {
    return Collections.emptyList();
  }
  
  public void removeHttpListener(IHttpListener paramIHttpListener) {}
  
  public void registerProxyListener(IProxyListener paramIProxyListener) {}
  
  public List<IProxyListener> getProxyListeners() {
    return Collections.emptyList();
  }
  
  public void removeProxyListener(IProxyListener paramIProxyListener) {}
  
  public void registerScannerListener(IScannerListener paramIScannerListener) {}
  
  public List<IScannerListener> getScannerListeners() {
    return Collections.emptyList();
  }
  
  public void removeScannerListener(IScannerListener paramIScannerListener) {}
  
  public void registerScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {}
  
  public List<IScopeChangeListener> getScopeChangeListeners() {
    return Collections.emptyList();
  }
  
  public void removeScopeChangeListener(IScopeChangeListener paramIScopeChangeListener) {}
  
  public void registerContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {}
  
  public List<IContextMenuFactory> getContextMenuFactories() {
    return Collections.emptyList();
  }
  
  public void removeContextMenuFactory(IContextMenuFactory paramIContextMenuFactory) {}
  
  public void registerMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {}
  
  public List<IMessageEditorTabFactory> getMessageEditorTabFactories() {
    return Collections.emptyList();
  }
  
  public void removeMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory) {}
  
  public void registerScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {}
  
  public List<IScannerInsertionPointProvider> getScannerInsertionPointProviders() {
    return Collections.emptyList();
  }
  
  public void removeScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider) {}
  
  public void registerScannerCheck(IScannerCheck paramIScannerCheck) {}
  
  public List<IScannerCheck> getScannerChecks() {
    return Collections.emptyList();
  }
  
  public void removeScannerCheck(IScannerCheck paramIScannerCheck) {}
  
  public void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {}
  
  public List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories() {
    return Collections.emptyList();
  }
  
  public void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory) {}
  
  public void registerIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {}
  
  public List<IIntruderPayloadProcessor> getIntruderPayloadProcessors() {
    return Collections.emptyList();
  }
  
  public void removeIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor) {}
  
  public void registerSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {}
  
  public List<ISessionHandlingAction> getSessionHandlingActions() {
    return Collections.emptyList();
  }
  
  public void removeSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction) {}
  
  public void unloadExtension() {}
  
  public void addSuiteTab(ITab paramITab) {}
  
  public void removeSuiteTab(ITab paramITab) {}
  
  public void customizeUiComponent(Component paramComponent) {}
  
  public IMessageEditor createMessageEditor(IMessageEditorController paramIMessageEditorController, boolean paramBoolean) {
    return new Ze0n(this);
  }
  
  public String[] getCommandLineArguments() {
    return new String[0];
  }
  
  public void saveExtensionSetting(String paramString1, String paramString2) {}
  
  public String loadExtensionSetting(String paramString) {
    return null;
  }
  
  public ITextEditor createTextEditor() {
    return new Zrx0(this);
  }
  
  public void sendToRepeater(String paramString1, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, String paramString2) {}
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {}
  
  public void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {}
  
  public void sendToComparer(byte[] paramArrayOfbyte) {}
  
  public void sendToSpider(URL paramURL) {}
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return new Zxfc();
  }
  
  public IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList) {
    return new Zxfc();
  }
  
  public void doPassiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {}
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte) {
    return new Zmdg();
  }
  
  public IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new Zmdg();
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte) {
    return new byte[0];
  }
  
  public byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2) {
    return new byte[0];
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte) {
    return new byte[0];
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean) {
    return new byte[0];
  }
  
  public byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean, String paramString) {
    return new byte[0];
  }
  
  public boolean isInScope(URL paramURL) {
    return false;
  }
  
  public void includeInScope(URL paramURL) {}
  
  public void excludeFromScope(URL paramURL) {}
  
  public void issueAlert(String paramString) {}
  
  public IHttpRequestResponse[] getProxyHistory() {
    return new IHttpRequestResponse[0];
  }
  
  public IHttpRequestResponse[] getSiteMap(String paramString) {
    return new IHttpRequestResponse[0];
  }
  
  public IScanIssue[] getScanIssues(String paramString) {
    return new IScanIssue[0];
  }
  
  public void generateScanReport(String paramString, IScanIssue[] paramArrayOfIScanIssue, File paramFile) {}
  
  public List<ICookie> getCookieJarContents() {
    return Collections.emptyList();
  }
  
  public void updateCookieJar(ICookie paramICookie) {}
  
  public void addToSiteMap(IHttpRequestResponse paramIHttpRequestResponse) {}
  
  public void restoreState(File paramFile) {}
  
  public void saveState(File paramFile) {}
  
  public Map<String, String> saveConfig() {
    return Collections.emptyMap();
  }
  
  public void loadConfig(Map<String, String> paramMap) {}
  
  public String saveConfigAsJson(String... paramVarArgs) {
    return "";
  }
  
  public void loadConfigFromJson(String paramString) {}
  
  public void setProxyInterceptionEnabled(boolean paramBoolean) {}
  
  public String[] getBurpVersion() {
    return new String[0];
  }
  
  public String getExtensionFilename() {
    return "";
  }
  
  public boolean isExtensionBapp() {
    return false;
  }
  
  public void exitSuite(boolean paramBoolean) {}
  
  public ITempFile saveToTempFile(byte[] paramArrayOfbyte) {
    return new Ze9b(this, paramArrayOfbyte);
  }
  
  public IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse paramIHttpRequestResponse) {
    return new Zmdr();
  }
  
  public IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse paramIHttpRequestResponse, List<int[]> paramList1, List<int[]> paramList2) {
    return new Zmdt();
  }
  
  public String getToolName(int paramInt) {
    return "";
  }
  
  public void addScanIssue(IScanIssue paramIScanIssue) {}
  
  public IBurpCollaboratorClientContext createBurpCollaboratorClientContext() {
    return new Zb8g(this);
  }
  
  public String[][] getParameters(byte[] paramArrayOfbyte) {
    return new String[0][];
  }
  
  public String[] getHeaders(byte[] paramArrayOfbyte) {
    return new String[0];
  }
  
  public void registerMenuItem(String paramString, IMenuItemHandler paramIMenuItemHandler) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb8r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */