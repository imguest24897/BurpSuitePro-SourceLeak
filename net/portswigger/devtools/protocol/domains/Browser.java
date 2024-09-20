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
import net.portswigger.devtools.protocol.events.browser.DownloadProgress;
import net.portswigger.devtools.protocol.events.browser.DownloadWillBegin;
import net.portswigger.devtools.protocol.types.browser.Bounds;
import net.portswigger.devtools.protocol.types.browser.BrowserCommandId;
import net.portswigger.devtools.protocol.types.browser.Histogram;
import net.portswigger.devtools.protocol.types.browser.PermissionDescriptor;
import net.portswigger.devtools.protocol.types.browser.PermissionSetting;
import net.portswigger.devtools.protocol.types.browser.PermissionType;
import net.portswigger.devtools.protocol.types.browser.SetDownloadBehaviorBehavior;
import net.portswigger.devtools.protocol.types.browser.Version;
import net.portswigger.devtools.protocol.types.browser.WindowForTarget;

public interface Browser {
  @Zy
  CompletableFuture<Zf<Void>> setPermission(@Zu("permission") PermissionDescriptor paramPermissionDescriptor, @Zu("setting") PermissionSetting paramPermissionSetting);
  
  @Zy
  CompletableFuture<Zf<Void>> setPermission(@Zu("permission") PermissionDescriptor paramPermissionDescriptor, @Zu("setting") PermissionSetting paramPermissionSetting, @Zj @Zu("origin") String paramString1, @Zj @Zu("browserContextId") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> grantPermissions(@Zu("permissions") List<PermissionType> paramList);
  
  @Zy
  CompletableFuture<Zf<Void>> grantPermissions(@Zu("permissions") List<PermissionType> paramList, @Zj @Zu("origin") String paramString1, @Zj @Zu("browserContextId") String paramString2);
  
  CompletableFuture<Zf<Void>> resetPermissions();
  
  CompletableFuture<Zf<Void>> resetPermissions(@Zj @Zu("browserContextId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setDownloadBehavior(@Zu("behavior") SetDownloadBehaviorBehavior paramSetDownloadBehaviorBehavior);
  
  @Zy
  CompletableFuture<Zf<Void>> setDownloadBehavior(@Zu("behavior") SetDownloadBehaviorBehavior paramSetDownloadBehaviorBehavior, @Zj @Zu("browserContextId") String paramString1, @Zj @Zu("downloadPath") String paramString2, @Zj @Zu("eventsEnabled") Boolean paramBoolean);
  
  @Zy
  CompletableFuture<Zf<Void>> cancelDownload(@Zu("guid") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> cancelDownload(@Zu("guid") String paramString1, @Zj @Zu("browserContextId") String paramString2);
  
  CompletableFuture<Zf<Void>> close();
  
  @Zy
  CompletableFuture<Zf<Void>> crash();
  
  @Zy
  CompletableFuture<Zf<Void>> crashGpuProcess();
  
  CompletableFuture<Zf<Version>> getVersion();
  
  @Zy
  @Zr("arguments")
  CompletableFuture<Zf<List<String>>> getBrowserCommandLine();
  
  @Zy
  @Zr("histograms")
  CompletableFuture<Zf<List<Histogram>>> getHistograms();
  
  @Zy
  @Zr("histograms")
  CompletableFuture<Zf<List<Histogram>>> getHistograms(@Zj @Zu("query") String paramString, @Zj @Zu("delta") Boolean paramBoolean);
  
  @Zy
  @Zr("histogram")
  CompletableFuture<Zf<Histogram>> getHistogram(@Zu("name") String paramString);
  
  @Zy
  @Zr("histogram")
  CompletableFuture<Zf<Histogram>> getHistogram(@Zu("name") String paramString, @Zj @Zu("delta") Boolean paramBoolean);
  
  @Zy
  @Zr("bounds")
  CompletableFuture<Zf<Bounds>> getWindowBounds(@Zu("windowId") Integer paramInteger);
  
  @Zy
  CompletableFuture<Zf<WindowForTarget>> getWindowForTarget();
  
  @Zy
  CompletableFuture<Zf<WindowForTarget>> getWindowForTarget(@Zj @Zu("targetId") String paramString);
  
  @Zy
  CompletableFuture<Zf<Void>> setWindowBounds(@Zu("windowId") Integer paramInteger, @Zu("bounds") Bounds paramBounds);
  
  @Zy
  CompletableFuture<Zf<Void>> setDockTile();
  
  @Zy
  CompletableFuture<Zf<Void>> setDockTile(@Zj @Zu("badgeLabel") String paramString1, @Zj @Zu("image") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> executeBrowserCommand(@Zu("commandId") BrowserCommandId paramBrowserCommandId);
  
  CompletableFuture<Zf<Void>> addPrivacySandboxEnrollmentOverride(@Zu("url") String paramString);
  
  @Zb("downloadWillBegin")
  @Zy
  Zs onDownloadWillBegin(Zp<DownloadWillBegin> paramZp) throws Zp;
  
  @Zb("downloadProgress")
  @Zy
  Zs onDownloadProgress(Zp<DownloadProgress> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\Browser.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */