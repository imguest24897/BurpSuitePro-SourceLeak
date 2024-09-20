package com.install4j.api.formcomponents;

import java.util.List;

public interface LayoutGroup {
  GroupType getGroupType();
  
  void setEnabled(boolean paramBoolean);
  
  void setVisible(boolean paramBoolean);
  
  boolean isVisible();
  
  String getId();
  
  List<?> getChildren();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\formcomponents\LayoutGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */