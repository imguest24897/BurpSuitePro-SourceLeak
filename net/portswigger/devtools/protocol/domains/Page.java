package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.page.BackForwardCacheNotUsed;
import net.portswigger.devtools.protocol.events.page.CompilationCacheProduced;
import net.portswigger.devtools.protocol.events.page.DocumentOpened;
import net.portswigger.devtools.protocol.events.page.DomContentEventFired;
import net.portswigger.devtools.protocol.events.page.DownloadProgress;
import net.portswigger.devtools.protocol.events.page.DownloadWillBegin;
import net.portswigger.devtools.protocol.events.page.FileChooserOpened;
import net.portswigger.devtools.protocol.events.page.FrameAttached;
import net.portswigger.devtools.protocol.events.page.FrameClearedScheduledNavigation;
import net.portswigger.devtools.protocol.events.page.FrameDetached;
import net.portswigger.devtools.protocol.events.page.FrameNavigated;
import net.portswigger.devtools.protocol.events.page.FrameRequestedNavigation;
import net.portswigger.devtools.protocol.events.page.FrameResized;
import net.portswigger.devtools.protocol.events.page.FrameScheduledNavigation;
import net.portswigger.devtools.protocol.events.page.FrameStartedLoading;
import net.portswigger.devtools.protocol.events.page.FrameStoppedLoading;
import net.portswigger.devtools.protocol.events.page.InterstitialHidden;
import net.portswigger.devtools.protocol.events.page.InterstitialShown;
import net.portswigger.devtools.protocol.events.page.JavascriptDialogClosed;
import net.portswigger.devtools.protocol.events.page.JavascriptDialogOpening;
import net.portswigger.devtools.protocol.events.page.LifecycleEvent;
import net.portswigger.devtools.protocol.events.page.LoadEventFired;
import net.portswigger.devtools.protocol.events.page.NavigatedWithinDocument;
import net.portswigger.devtools.protocol.events.page.ScreencastFrame;
import net.portswigger.devtools.protocol.events.page.ScreencastVisibilityChanged;
import net.portswigger.devtools.protocol.events.page.WindowOpen;
import net.portswigger.devtools.protocol.types.debugger.SearchMatch;
import net.portswigger.devtools.protocol.types.page.AdScriptId;
import net.portswigger.devtools.protocol.types.page.AppId;
import net.portswigger.devtools.protocol.types.page.AppManifest;
import net.portswigger.devtools.protocol.types.page.AutoResponseMode;
import net.portswigger.devtools.protocol.types.page.CaptureScreenshotFormat;
import net.portswigger.devtools.protocol.types.page.CaptureSnapshotFormat;
import net.portswigger.devtools.protocol.types.page.CompilationCacheParams;
import net.portswigger.devtools.protocol.types.page.FontFamilies;
import net.portswigger.devtools.protocol.types.page.FontSizes;
import net.portswigger.devtools.protocol.types.page.FrameResourceTree;
import net.portswigger.devtools.protocol.types.page.FrameTree;
import net.portswigger.devtools.protocol.types.page.InstallabilityError;
import net.portswigger.devtools.protocol.types.page.LayoutMetrics;
import net.portswigger.devtools.protocol.types.page.Navigate;
import net.portswigger.devtools.protocol.types.page.NavigationHistory;
import net.portswigger.devtools.protocol.types.page.OriginTrial;
import net.portswigger.devtools.protocol.types.page.PermissionsPolicyFeatureState;
import net.portswigger.devtools.protocol.types.page.PrintToPDF;
import net.portswigger.devtools.protocol.types.page.PrintToPDFTransferMode;
import net.portswigger.devtools.protocol.types.page.ReferrerPolicy;
import net.portswigger.devtools.protocol.types.page.ResourceContent;
import net.portswigger.devtools.protocol.types.page.ScriptFontFamilies;
import net.portswigger.devtools.protocol.types.page.SetDownloadBehaviorBehavior;
import net.portswigger.devtools.protocol.types.page.SetWebLifecycleStateState;
import net.portswigger.devtools.protocol.types.page.StartScreencastFormat;
import net.portswigger.devtools.protocol.types.page.TransitionType;
import net.portswigger.devtools.protocol.types.page.Viewport;

public interface Page {
  @Deprecated
  @Zy
  @Zr("identifier")
  CompletableFuture<Zf<String>> addScriptToEvaluateOnLoad(@Zu("scriptSource") String paramString);
  
  @Zr("identifier")
  CompletableFuture<Zf<String>> addScriptToEvaluateOnNewDocument(@Zu("source") String paramString);
  
  @Zr("identifier")
  CompletableFuture<Zf<String>> addScriptToEvaluateOnNewDocument(@Zu("source") String paramString1, @Zy @Zj @Zu("worldName") String paramString2, @Zy @Zj @Zu("includeCommandLineAPI") Boolean paramBoolean1, @Zy @Zj @Zu("runImmediately") Boolean paramBoolean2);
  
  CompletableFuture<Zf<Void>> bringToFront();
  
  @Zr("data")
  CompletableFuture<Zf<String>> captureScreenshot();
  
  @Zr("data")
  CompletableFuture<Zf<String>> captureScreenshot(@Zj @Zu("format") CaptureScreenshotFormat paramCaptureScreenshotFormat, @Zj @Zu("quality") Integer paramInteger, @Zj @Zu("clip") Viewport paramViewport, @Zy @Zj @Zu("fromSurface") Boolean paramBoolean1, @Zy @Zj @Zu("captureBeyondViewport") Boolean paramBoolean2, @Zy @Zj @Zu("optimizeForSpeed") Boolean paramBoolean3);
  
  @Zy
  @Zr("data")
  CompletableFuture<Zf<String>> captureSnapshot();
  
  @Zy
  @Zr("data")
  CompletableFuture<Zf<String>> captureSnapshot(@Zj @Zu("format") CaptureSnapshotFormat paramCaptureSnapshotFormat);
  
  @Zr("executionContextId")
  CompletableFuture<Zf<Integer>> createIsolatedWorld(@Zu("frameId") String paramString);
  
  @Zr("executionContextId")
  CompletableFuture<Zf<Integer>> createIsolatedWorld(@Zu("frameId") String paramString1, @Zj @Zu("worldName") String paramString2, @Zj @Zu("grantUniveralAccess") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<AppManifest>> getAppManifest();
  
  CompletableFuture<Zf<AppManifest>> getAppManifest(@Zj @Zu("manifestId") String paramString);
  
  @Zy
  @Zr("installabilityErrors")
  CompletableFuture<Zf<List<InstallabilityError>>> getInstallabilityErrors();
  
  @Deprecated
  @Zy
  @Zr("primaryIcon")
  CompletableFuture<Zf<String>> getManifestIcons();
  
  @Zy
  CompletableFuture<Zf<AppId>> getAppId();
  
  @Zy
  @Zr("adScriptId")
  CompletableFuture<Zf<AdScriptId>> getAdScriptId(@Zu("frameId") String paramString);
  
  @Zr("frameTree")
  CompletableFuture<Zf<FrameTree>> getFrameTree();
  
  CompletableFuture<Zf<LayoutMetrics>> getLayoutMetrics();
  
  CompletableFuture<Zf<NavigationHistory>> getNavigationHistory();
  
  CompletableFuture<Zf<Void>> resetNavigationHistory();
  
  @Zy
  CompletableFuture<Zf<ResourceContent>> getResourceContent(@Zu("frameId") String paramString1, @Zu("url") String paramString2);
  
  @Zy
  @Zr("frameTree")
  CompletableFuture<Zf<FrameResourceTree>> getResourceTree();
  
  CompletableFuture<Zf<Void>> handleJavaScriptDialog(@Zu("accept") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> handleJavaScriptDialog(@Zu("accept") Boolean paramBoolean, @Zj @Zu("promptText") String paramString);
  
  CompletableFuture<Zf<Navigate>> navigate(@Zu("url") String paramString);
  
  CompletableFuture<Zf<Navigate>> navigate(@Zu("url") String paramString1, @Zj @Zu("referrer") String paramString2, @Zj @Zu("transitionType") TransitionType paramTransitionType, @Zj @Zu("frameId") String paramString3, @Zy @Zj @Zu("referrerPolicy") ReferrerPolicy paramReferrerPolicy);
  
  CompletableFuture<Zf<Void>> navigateToHistoryEntry(@Zu("entryId") Integer paramInteger);
  
  CompletableFuture<Zf<PrintToPDF>> printToPDF();
  
  CompletableFuture<Zf<PrintToPDF>> printToPDF(@Zj @Zu("landscape") Boolean paramBoolean1, @Zj @Zu("displayHeaderFooter") Boolean paramBoolean2, @Zj @Zu("printBackground") Boolean paramBoolean3, @Zj @Zu("scale") Double paramDouble1, @Zj @Zu("paperWidth") Double paramDouble2, @Zj @Zu("paperHeight") Double paramDouble3, @Zj @Zu("marginTop") Double paramDouble4, @Zj @Zu("marginBottom") Double paramDouble5, @Zj @Zu("marginLeft") Double paramDouble6, @Zj @Zu("marginRight") Double paramDouble7, @Zj @Zu("pageRanges") String paramString1, @Zj @Zu("headerTemplate") String paramString2, @Zj @Zu("footerTemplate") String paramString3, @Zj @Zu("preferCSSPageSize") Boolean paramBoolean4, @Zy @Zj @Zu("transferMode") PrintToPDFTransferMode paramPrintToPDFTransferMode, @Zy @Zj @Zu("generateTaggedPDF") Boolean paramBoolean5, @Zy @Zj @Zu("generateDocumentOutline") Boolean paramBoolean6);
  
  CompletableFuture<Zf<Void>> reload();
  
  CompletableFuture<Zf<Void>> reload(@Zj @Zu("ignoreCache") Boolean paramBoolean, @Zj @Zu("scriptToEvaluateOnLoad") String paramString1, @Zy @Zj @Zu("loaderId") String paramString2);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> removeScriptToEvaluateOnLoad(@Zu("identifier") String paramString);
  
  CompletableFuture<Zf<Void>> removeScriptToEvaluateOnNewDocument(@Zu("identifier") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> screencastFrameAck(@Zu("sessionId") Integer paramInteger);
  
  @Zy
  @Zr("result")
  CompletableFuture<Zf<List<SearchMatch>>> searchInResource(@Zu("frameId") String paramString1, @Zu("url") String paramString2, @Zu("query") String paramString3);
  
  @Zy
  @Zr("result")
  CompletableFuture<Zf<List<SearchMatch>>> searchInResource(@Zu("frameId") String paramString1, @Zu("url") String paramString2, @Zu("query") String paramString3, @Zj @Zu("caseSensitive") Boolean paramBoolean1, @Zj @Zu("isRegex") Boolean paramBoolean2);
  
  @Zy
  CompletableFuture<Zf<Void>> setAdBlockingEnabled(@Zu("enabled") Boolean paramBoolean);
  
  CompletableFuture<Zf<Void>> setBypassCSP(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  @Zr("states")
  CompletableFuture<Zf<List<PermissionsPolicyFeatureState>>> getPermissionsPolicyState(@Zu("frameId") String paramString);
  
  @Zy
  @Zr("originTrials")
  CompletableFuture<Zf<List<OriginTrial>>> getOriginTrials(@Zu("frameId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setFontFamilies(@Zu("fontFamilies") FontFamilies paramFontFamilies);
  
  @Zy
  CompletableFuture<Zf<Void>> setFontFamilies(@Zu("fontFamilies") FontFamilies paramFontFamilies, @Zj @Zu("forScripts") List<ScriptFontFamilies> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> setFontSizes(@Zu("fontSizes") FontSizes paramFontSizes);
  
  CompletableFuture<Zf<Void>> setDocumentContent(@Zu("frameId") String paramString1, @Zu("html") String paramString2);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> setDownloadBehavior(@Zu("behavior") SetDownloadBehaviorBehavior paramSetDownloadBehaviorBehavior);
  
  @Deprecated
  @Zy
  CompletableFuture<Zf<Void>> setDownloadBehavior(@Zu("behavior") SetDownloadBehaviorBehavior paramSetDownloadBehaviorBehavior, @Zj @Zu("downloadPath") String paramString);
  
  CompletableFuture<Zf<Void>> setLifecycleEventsEnabled(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> startScreencast();
  
  @Zy
  CompletableFuture<Zf<Void>> startScreencast(@Zj @Zu("format") StartScreencastFormat paramStartScreencastFormat, @Zj @Zu("quality") Integer paramInteger1, @Zj @Zu("maxWidth") Integer paramInteger2, @Zj @Zu("maxHeight") Integer paramInteger3, @Zj @Zu("everyNthFrame") Integer paramInteger4);
  
  CompletableFuture<Zf<Void>> stopLoading();
  
  @Zy
  CompletableFuture<Zf<Void>> crash();
  
  CompletableFuture<Zf<Void>> close();
  
  @Zy
  CompletableFuture<Zf<Void>> setWebLifecycleState(@Zu("state") SetWebLifecycleStateState paramSetWebLifecycleStateState);
  
  @Zy
  CompletableFuture<Zf<Void>> stopScreencast();
  
  @Zy
  CompletableFuture<Zf<Void>> produceCompilationCache(@Zu("scripts") List<CompilationCacheParams> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> addCompilationCache(@Zu("url") String paramString1, @Zu("data") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> clearCompilationCache();
  
  @Zy
  CompletableFuture<Zf<Void>> setSPCTransactionMode(@Zu("mode") AutoResponseMode paramAutoResponseMode);
  
  @Zy
  CompletableFuture<Zf<Void>> setRPHRegistrationMode(@Zu("mode") AutoResponseMode paramAutoResponseMode);
  
  @Zy
  CompletableFuture<Zf<Void>> generateTestReport(@Zu("message") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> generateTestReport(@Zu("message") String paramString1, @Zj @Zu("group") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> waitForDebugger();
  
  CompletableFuture<Zf<Void>> setInterceptFileChooserDialog(@Zu("enabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> setPrerenderingAllowed(@Zu("isAllowed") Boolean paramBoolean);
  
  @Zb("domContentEventFired")
  Zs onDomContentEventFired(Zp<DomContentEventFired> paramZp) throws Zp;
  
  @Zb("fileChooserOpened")
  Zs onFileChooserOpened(Zp<FileChooserOpened> paramZp) throws Zp;
  
  @Zb("frameAttached")
  Zs onFrameAttached(Zp<FrameAttached> paramZp) throws Zp;
  
  @Zb("frameClearedScheduledNavigation")
  @Deprecated
  Zs onFrameClearedScheduledNavigation(Zp<FrameClearedScheduledNavigation> paramZp) throws Zp;
  
  @Zb("frameDetached")
  Zs onFrameDetached(Zp<FrameDetached> paramZp) throws Zp;
  
  @Zb("frameNavigated")
  Zs onFrameNavigated(Zp<FrameNavigated> paramZp) throws Zp;
  
  @Zb("documentOpened")
  @Zy
  Zs onDocumentOpened(Zp<DocumentOpened> paramZp) throws Zp;
  
  @Zb("frameResized")
  @Zy
  Zs onFrameResized(Zp<FrameResized> paramZp) throws Zp;
  
  @Zb("frameRequestedNavigation")
  @Zy
  Zs onFrameRequestedNavigation(Zp<FrameRequestedNavigation> paramZp) throws Zp;
  
  @Zb("frameScheduledNavigation")
  @Deprecated
  Zs onFrameScheduledNavigation(Zp<FrameScheduledNavigation> paramZp) throws Zp;
  
  @Zb("frameStartedLoading")
  @Zy
  Zs onFrameStartedLoading(Zp<FrameStartedLoading> paramZp) throws Zp;
  
  @Zb("frameStoppedLoading")
  @Zy
  Zs onFrameStoppedLoading(Zp<FrameStoppedLoading> paramZp) throws Zp;
  
  @Zb("downloadWillBegin")
  @Deprecated
  @Zy
  Zs onDownloadWillBegin(Zp<DownloadWillBegin> paramZp) throws Zp;
  
  @Zb("downloadProgress")
  @Deprecated
  @Zy
  Zs onDownloadProgress(Zp<DownloadProgress> paramZp) throws Zp;
  
  @Zb("interstitialHidden")
  Zs onInterstitialHidden(Zp<InterstitialHidden> paramZp) throws Zp;
  
  @Zb("interstitialShown")
  Zs onInterstitialShown(Zp<InterstitialShown> paramZp) throws Zp;
  
  @Zb("javascriptDialogClosed")
  Zs onJavascriptDialogClosed(Zp<JavascriptDialogClosed> paramZp) throws Zp;
  
  @Zb("javascriptDialogOpening")
  Zs onJavascriptDialogOpening(Zp<JavascriptDialogOpening> paramZp) throws Zp;
  
  @Zb("lifecycleEvent")
  Zs onLifecycleEvent(Zp<LifecycleEvent> paramZp) throws Zp;
  
  @Zb("backForwardCacheNotUsed")
  @Zy
  Zs onBackForwardCacheNotUsed(Zp<BackForwardCacheNotUsed> paramZp) throws Zp;
  
  @Zb("loadEventFired")
  Zs onLoadEventFired(Zp<LoadEventFired> paramZp) throws Zp;
  
  @Zb("navigatedWithinDocument")
  @Zy
  Zs onNavigatedWithinDocument(Zp<NavigatedWithinDocument> paramZp) throws Zp;
  
  @Zb("screencastFrame")
  @Zy
  Zs onScreencastFrame(Zp<ScreencastFrame> paramZp) throws Zp;
  
  @Zb("screencastVisibilityChanged")
  @Zy
  Zs onScreencastVisibilityChanged(Zp<ScreencastVisibilityChanged> paramZp) throws Zp;
  
  @Zb("windowOpen")
  Zs onWindowOpen(Zp<WindowOpen> paramZp) throws Zp;
  
  @Zb("compilationCacheProduced")
  @Zy
  Zs onCompilationCacheProduced(Zp<CompilationCacheProduced> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Page.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */