package com.install4j.api.styles;

import com.install4j.api.context.ControlButtonType;

public interface ControlButtonContainer {
  void setControlButtonEnabled(ControlButtonType paramControlButtonType, boolean paramBoolean);
  
  void setControlButtonVisible(ControlButtonType paramControlButtonType, boolean paramBoolean);
  
  void setControlButtonText(ControlButtonType paramControlButtonType, String paramString);
  
  void focusControlButton(ControlButtonType paramControlButtonType);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\styles\ControlButtonContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */