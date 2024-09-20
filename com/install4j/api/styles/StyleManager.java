package com.install4j.api.styles;

import javax.swing.JComponent;

public interface StyleManager {
  Style getStyleById(String paramString);
  
  Style cloneStyleById(String paramString);
  
  JComponent createStyleComponent(Style paramStyle);
  
  void willActivate(Style paramStyle);
  
  void activated(Style paramStyle);
  
  void deactivated(Style paramStyle);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\styles\StyleManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */