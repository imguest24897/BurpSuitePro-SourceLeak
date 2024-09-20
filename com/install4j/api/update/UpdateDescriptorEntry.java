package com.install4j.api.update;

import java.io.Serializable;
import java.net.URL;

public interface UpdateDescriptorEntry extends Serializable {
  String getTargetMediaFileId();
  
  String getUpdatableVersionMin();
  
  String getUpdatableVersionMax();
  
  String getFileName();
  
  URL getURL();
  
  String getNewVersion();
  
  String getNewMediaFileId();
  
  boolean isArchive();
  
  boolean isSingleBundle();
  
  long getFileSize();
  
  String getSha256Sum();
  
  String getMd5Sum();
  
  String getFileSizeVerbose();
  
  String getBundledJre();
  
  String getComment();
  
  String getAdditionalAttribute(String paramString1, String paramString2);
  
  boolean checkVersionCompatible(String paramString);
  
  boolean isDownloaded();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\ap\\update\UpdateDescriptorEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */