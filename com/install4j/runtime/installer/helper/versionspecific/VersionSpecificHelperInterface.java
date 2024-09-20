package com.install4j.runtime.installer.helper.versionspecific;

import com.install4j.api.launcher.StartupNotification;
import com.install4j.runtime.installer.helper.content.JavaHttpConnection;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;

public interface VersionSpecificHelperInterface {
  boolean isJavaFxWindowShown();
  
  void requestForeground();
  
  void setMacStartupListener(StartupNotification.Listener paramListener);
  
  void setMacHandleQuit(boolean paramBoolean);
  
  void setMacQuitHandler(Runnable paramRunnable);
  
  void setMacAboutHandler(Runnable paramRunnable);
  
  void setMacPreferencesHandler(Runnable paramRunnable);
  
  void addReads(String paramString);
  
  long getPid();
  
  int waitFor(Process paramProcess, int paramInt, boolean paramBoolean) throws InterruptedException;
  
  JavaHttpConnection createHttpConnection(URL paramURL, Proxy paramProxy, boolean paramBoolean) throws IOException;
  
  void setSecurityManager(SecurityManager paramSecurityManager);
  
  String getAccessibilityProviderName();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\VersionSpecificHelperInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */