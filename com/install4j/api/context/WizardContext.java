package com.install4j.api.context;

import com.install4j.api.styles.StyleManager;

public interface WizardContext {
  void setControlButtonEnabled(ControlButtonType paramControlButtonType, boolean paramBoolean);
  
  void setControlButtonVisible(ControlButtonType paramControlButtonType, boolean paramBoolean);
  
  void pressControlButton(ControlButtonType paramControlButtonType);
  
  void focusControlButton(ControlButtonType paramControlButtonType);
  
  void setControlButtonText(ControlButtonType paramControlButtonType, String paramString);
  
  @Deprecated
  void setNextButtonEnabled(boolean paramBoolean);
  
  @Deprecated
  void setBackButtonEnabled(boolean paramBoolean);
  
  @Deprecated
  void setCancelButtonEnabled(boolean paramBoolean);
  
  @Deprecated
  void setNextButtonVisible(boolean paramBoolean);
  
  @Deprecated
  void setBackButtonVisible(boolean paramBoolean);
  
  @Deprecated
  void setCancelButtonVisible(boolean paramBoolean);
  
  @Deprecated
  void pressNextButton();
  
  @Deprecated
  void pressPreviousButton();
  
  @Deprecated
  void pressCancelButton();
  
  @Deprecated
  void focusNextButton();
  
  @Deprecated
  void setNextButtonText(String paramString);
  
  @Deprecated
  void setPreviousButtonText(String paramString);
  
  @Deprecated
  void setCancelButtonText(String paramString);
  
  void setWizardIndex(WizardIndex paramWizardIndex);
  
  void setWizardIndexKey(String paramString);
  
  StyleManager getStyleManager();
  
  void setWindowSize(int paramInt1, int paramInt2);
  
  void setWindowTitle(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\WizardContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */