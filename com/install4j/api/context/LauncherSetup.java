package com.install4j.api.context;

public interface LauncherSetup {
  String getRelativeFileName();
  
  String getId();
  
  LauncherType getType();
  
  boolean isExcludeFromMenu();
  
  boolean isUninstaller();
  
  String getName();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\LauncherSetup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */