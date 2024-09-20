package com.install4j.api.formcomponents;

import com.install4j.api.beans.Bean;
import com.install4j.api.context.Context;
import com.install4j.api.context.UserCanceledException;
import com.install4j.api.screens.Console;
import java.util.Map;
import javax.swing.JComponent;

public interface FormComponent extends Bean {
  void setContext(Context paramContext);
  
  void setFormEnvironment(FormEnvironment paramFormEnvironment);
  
  JComponent createLeftComponent();
  
  JComponent createCenterComponent();
  
  boolean isFillCenterHorizontal();
  
  boolean isFillCenterVertical();
  
  JComponent createRightComponent();
  
  Class getConfigurationObjectClass();
  
  Object getConfigurationObject();
  
  boolean checkCompleted();
  
  void initialize();
  
  void formWillActivate();
  
  void formActivated();
  
  void formDeactivated();
  
  boolean handleConsole(Console paramConsole) throws UserCanceledException;
  
  boolean handleUnattended();
  
  void setEnabled(boolean paramBoolean);
  
  boolean isEnabled();
  
  void setVisible(boolean paramBoolean);
  
  boolean isVisible();
  
  void migrateIds(Map<String, String> paramMap);
  
  void requestFocus();
  
  boolean hasUserInput();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\formcomponents\FormComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */