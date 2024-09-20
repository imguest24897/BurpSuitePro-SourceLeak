package com.install4j.runtime.installer.config;

import com.install4j.api.styles.Style;

public interface StyleProvider {
  String getId();
  
  Style getStyle();
  
  StyleProvider cloneStyleProvider();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\StyleProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */