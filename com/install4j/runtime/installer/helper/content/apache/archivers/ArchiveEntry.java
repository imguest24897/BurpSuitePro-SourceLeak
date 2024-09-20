package com.install4j.runtime.installer.helper.content.apache.archivers;

import java.util.Date;

public interface ArchiveEntry {
  public static final long SIZE_UNKNOWN = -1L;
  
  String getName();
  
  long getSize();
  
  boolean isDirectory();
  
  Date getLastModifiedDate();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apache\archivers\ArchiveEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */