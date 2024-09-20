package com.install4j.runtime.installer.helper.comm;

public interface CommunicationBackend {
  boolean writeDataBlock(byte[] paramArrayOfbyte);
  
  byte[] readDataBlock();
  
  String createListener();
  
  boolean connect(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\CommunicationBackend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */