package com.install4j.api.screens;

import com.install4j.api.formcomponents.FormEnvironment;
import javax.swing.JPanel;

public interface FormPanelContainer {
  void setFormPanel(JPanel paramJPanel, FormEnvironment paramFormEnvironment);
  
  boolean isScrollFormPanel();
  
  FormEnvironment getFormEnvironment();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\screens\FormPanelContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */