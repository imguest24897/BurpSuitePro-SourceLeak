package com.install4j.api.context;

public interface InstallationComponentSetup {
  boolean isSelected();
  
  void setSelected(boolean paramBoolean);
  
  boolean isChangeable();
  
  void setChangeable(boolean paramBoolean);
  
  boolean isHidden();
  
  void setHidden(boolean paramBoolean);
  
  String getName();
  
  String getId();
  
  boolean isDownloaded();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\InstallationComponentSetup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */