package com.install4j.api.beaninfo;

import com.install4j.api.beans.Bean;
import java.awt.Window;

public interface PropertyCustomizer {
  void setValue(Object paramObject, Bean paramBean);
  
  boolean ok();
  
  void cancel();
  
  boolean isModified();
  
  void setParentWindow(Window paramWindow);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\PropertyCustomizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */