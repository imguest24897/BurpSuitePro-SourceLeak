package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.types.pwa.DisplayMode;
import net.portswigger.devtools.protocol.types.pwa.OsAppState;

@Zy
public interface PWA {
  CompletableFuture<Zf<OsAppState>> getOsAppState(@Zu("manifestId") String paramString);
  
  CompletableFuture<Zf<Void>> install(@Zu("manifestId") String paramString);
  
  CompletableFuture<Zf<Void>> install(@Zu("manifestId") String paramString1, @Zj @Zu("installUrlOrBundleUrl") String paramString2);
  
  CompletableFuture<Zf<Void>> uninstall(@Zu("manifestId") String paramString);
  
  @Zr("targetId")
  CompletableFuture<Zf<String>> launch(@Zu("manifestId") String paramString);
  
  @Zr("targetId")
  CompletableFuture<Zf<String>> launch(@Zu("manifestId") String paramString1, @Zj @Zu("url") String paramString2);
  
  @Zr("targetIds")
  CompletableFuture<Zf<List<String>>> launchFilesInApp(@Zu("manifestId") String paramString, @Zu("files") List<String> paramList);
  
  CompletableFuture<Zf<Void>> openCurrentPageInApp(@Zu("manifestId") String paramString);
  
  CompletableFuture<Zf<Void>> changeAppUserSettings(@Zu("manifestId") String paramString);
  
  CompletableFuture<Zf<Void>> changeAppUserSettings(@Zu("manifestId") String paramString, @Zj @Zu("linkCapturing") Boolean paramBoolean, @Zj @Zu("displayMode") DisplayMode paramDisplayMode);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\PWA.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */