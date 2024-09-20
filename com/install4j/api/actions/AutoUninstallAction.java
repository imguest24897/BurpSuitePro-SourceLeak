package com.install4j.api.actions;

import java.util.Properties;

public interface AutoUninstallAction extends UninstallAction {
  Properties getPersistentProperties();
  
  void setPersistentProperties(Properties paramProperties);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\actions\AutoUninstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */