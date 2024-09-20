package com.install4j.runtime.installer.config;

import com.install4j.api.beans.Bean;
import java.util.List;

public interface GroupProvider {
  Bean getOrInstantiateBean();
  
  List getBeanConfigs();
  
  String getId();
  
  String getDisplayedId();
  
  boolean isEnabled();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\GroupProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */