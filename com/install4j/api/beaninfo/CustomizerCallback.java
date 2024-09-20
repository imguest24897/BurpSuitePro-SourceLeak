package com.install4j.api.beaninfo;

import java.awt.Window;

public interface CustomizerCallback {
  void stopEditing();
  
  void setParentWindow(Window paramWindow);
  
  ProjectReportProperty[] getProjectReportProperties();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\CustomizerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */