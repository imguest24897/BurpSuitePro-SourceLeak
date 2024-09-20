package com.install4j.runtime.installer.frontend.components;

import java.io.File;
import javax.swing.JButton;
import javax.swing.JTextField;

public interface AbstractFileSelector {
  void setSelectedFile(File paramFile);
  
  File getSelectedFile();
  
  JTextField getTextField();
  
  JButton getButton();
  
  void setManualEntryAllowed(boolean paramBoolean);
  
  void setValidator(FileValidator paramFileValidator);
  
  boolean checkSelectedFile();
  
  void setInitialBrowserDirectory(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\components\AbstractFileSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */