package burp;

import java.awt.Component;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;

public interface IBurpExtenderCallbacks {
  public static final int TOOL_SUITE = 1;
  
  public static final int TOOL_TARGET = 2;
  
  public static final int TOOL_PROXY = 4;
  
  public static final int TOOL_SPIDER = 8;
  
  public static final int TOOL_SCANNER = 16;
  
  public static final int TOOL_INTRUDER = 32;
  
  public static final int TOOL_REPEATER = 64;
  
  public static final int TOOL_SEQUENCER = 128;
  
  public static final int TOOL_DECODER = 256;
  
  public static final int TOOL_COMPARER = 512;
  
  public static final int TOOL_EXTENDER = 1024;
  
  void setExtensionName(String paramString);
  
  IExtensionHelpers getHelpers();
  
  OutputStream getStdout();
  
  OutputStream getStderr();
  
  void printOutput(String paramString);
  
  void printError(String paramString);
  
  void registerExtensionStateListener(IExtensionStateListener paramIExtensionStateListener);
  
  List<IExtensionStateListener> getExtensionStateListeners();
  
  void removeExtensionStateListener(IExtensionStateListener paramIExtensionStateListener);
  
  void registerHttpListener(IHttpListener paramIHttpListener);
  
  List<IHttpListener> getHttpListeners();
  
  void removeHttpListener(IHttpListener paramIHttpListener);
  
  void registerProxyListener(IProxyListener paramIProxyListener);
  
  List<IProxyListener> getProxyListeners();
  
  void removeProxyListener(IProxyListener paramIProxyListener);
  
  void registerScannerListener(IScannerListener paramIScannerListener);
  
  List<IScannerListener> getScannerListeners();
  
  void removeScannerListener(IScannerListener paramIScannerListener);
  
  void registerScopeChangeListener(IScopeChangeListener paramIScopeChangeListener);
  
  List<IScopeChangeListener> getScopeChangeListeners();
  
  void removeScopeChangeListener(IScopeChangeListener paramIScopeChangeListener);
  
  void registerContextMenuFactory(IContextMenuFactory paramIContextMenuFactory);
  
  List<IContextMenuFactory> getContextMenuFactories();
  
  void removeContextMenuFactory(IContextMenuFactory paramIContextMenuFactory);
  
  void registerMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory);
  
  List<IMessageEditorTabFactory> getMessageEditorTabFactories();
  
  void removeMessageEditorTabFactory(IMessageEditorTabFactory paramIMessageEditorTabFactory);
  
  void registerScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider);
  
  List<IScannerInsertionPointProvider> getScannerInsertionPointProviders();
  
  void removeScannerInsertionPointProvider(IScannerInsertionPointProvider paramIScannerInsertionPointProvider);
  
  void registerScannerCheck(IScannerCheck paramIScannerCheck);
  
  List<IScannerCheck> getScannerChecks();
  
  void removeScannerCheck(IScannerCheck paramIScannerCheck);
  
  void registerIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory);
  
  List<IIntruderPayloadGeneratorFactory> getIntruderPayloadGeneratorFactories();
  
  void removeIntruderPayloadGeneratorFactory(IIntruderPayloadGeneratorFactory paramIIntruderPayloadGeneratorFactory);
  
  void registerIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor);
  
  List<IIntruderPayloadProcessor> getIntruderPayloadProcessors();
  
  void removeIntruderPayloadProcessor(IIntruderPayloadProcessor paramIIntruderPayloadProcessor);
  
  void registerSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction);
  
  List<ISessionHandlingAction> getSessionHandlingActions();
  
  void removeSessionHandlingAction(ISessionHandlingAction paramISessionHandlingAction);
  
  void unloadExtension();
  
  void addSuiteTab(ITab paramITab);
  
  void removeSuiteTab(ITab paramITab);
  
  void customizeUiComponent(Component paramComponent);
  
  IMessageEditor createMessageEditor(IMessageEditorController paramIMessageEditorController, boolean paramBoolean);
  
  String[] getCommandLineArguments();
  
  void saveExtensionSetting(String paramString1, String paramString2);
  
  String loadExtensionSetting(String paramString);
  
  ITextEditor createTextEditor();
  
  void sendToRepeater(String paramString1, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, String paramString2);
  
  void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte);
  
  void sendToIntruder(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList);
  
  void sendToComparer(byte[] paramArrayOfbyte);
  
  void sendToSpider(URL paramURL);
  
  IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte);
  
  IScanQueueItem doActiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte, List<int[]> paramList);
  
  void doPassiveScan(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
  
  IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte);
  
  IHttpRequestResponse makeHttpRequest(IHttpService paramIHttpService, byte[] paramArrayOfbyte, boolean paramBoolean);
  
  byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean, byte[] paramArrayOfbyte);
  
  byte[] makeHttpRequest(String paramString, int paramInt, boolean paramBoolean1, byte[] paramArrayOfbyte, boolean paramBoolean2);
  
  byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte);
  
  byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean);
  
  byte[] makeHttp2Request(IHttpService paramIHttpService, List<IHttpHeader> paramList, byte[] paramArrayOfbyte, boolean paramBoolean, String paramString);
  
  boolean isInScope(URL paramURL);
  
  void includeInScope(URL paramURL);
  
  void excludeFromScope(URL paramURL);
  
  void issueAlert(String paramString);
  
  IHttpRequestResponse[] getProxyHistory();
  
  IHttpRequestResponse[] getSiteMap(String paramString);
  
  IScanIssue[] getScanIssues(String paramString);
  
  void generateScanReport(String paramString, IScanIssue[] paramArrayOfIScanIssue, File paramFile);
  
  List<ICookie> getCookieJarContents();
  
  void updateCookieJar(ICookie paramICookie);
  
  void addToSiteMap(IHttpRequestResponse paramIHttpRequestResponse);
  
  @Deprecated
  void restoreState(File paramFile);
  
  @Deprecated
  void saveState(File paramFile);
  
  @Deprecated
  Map<String, String> saveConfig();
  
  @Deprecated
  void loadConfig(Map<String, String> paramMap);
  
  String saveConfigAsJson(String... paramVarArgs);
  
  void loadConfigFromJson(String paramString);
  
  void setProxyInterceptionEnabled(boolean paramBoolean);
  
  String[] getBurpVersion();
  
  String getExtensionFilename();
  
  boolean isExtensionBapp();
  
  void exitSuite(boolean paramBoolean);
  
  ITempFile saveToTempFile(byte[] paramArrayOfbyte);
  
  IHttpRequestResponsePersisted saveBuffersToTempFiles(IHttpRequestResponse paramIHttpRequestResponse);
  
  IHttpRequestResponseWithMarkers applyMarkers(IHttpRequestResponse paramIHttpRequestResponse, List<int[]> paramList1, List<int[]> paramList2);
  
  String getToolName(int paramInt);
  
  void addScanIssue(IScanIssue paramIScanIssue);
  
  IBurpCollaboratorClientContext createBurpCollaboratorClientContext();
  
  @Deprecated
  String[][] getParameters(byte[] paramArrayOfbyte);
  
  @Deprecated
  String[] getHeaders(byte[] paramArrayOfbyte);
  
  @Deprecated
  void registerMenuItem(String paramString, IMenuItemHandler paramIMenuItemHandler);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IBurpExtenderCallbacks.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */