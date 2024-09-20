package com.install4j.api.context;

import java.io.File;

public interface InstallerContext extends Context {
  void setInstallationDirectory(File paramFile);
  
  boolean isUpdateInstallation();
  
  File getInstallerFile();
  
  String getMediaName();
  
  boolean installFile(File paramFile1, File paramFile2) throws UserCanceledException;
  
  boolean installFile(File paramFile1, File paramFile2, FileOptions paramFileOptions) throws UserCanceledException;
  
  boolean installFile(File paramFile1, File paramFile2, FileOptions paramFileOptions, ProgressInterface paramProgressInterface, int paramInt1, int paramInt2) throws UserCanceledException;
  
  void installDirectory(File paramFile, UninstallMode paramUninstallMode);
  
  void registerUninstallFile(File paramFile);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\InstallerContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */