package com.install4j.api.context;

import java.io.File;

public interface FileInfo {
  File getDestinationFile();
  
  String getRootUnresolved();
  
  File getRootResolved();
  
  String getRelativeFilePath();
  
  String getFilesetId();
  
  String getFilesetName();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\FileInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */