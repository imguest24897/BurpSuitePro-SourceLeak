package burp;

import java.awt.Component;

public interface IMessageEditorTab {
  String getTabCaption();
  
  Component getUiComponent();
  
  boolean isEnabled(byte[] paramArrayOfbyte, boolean paramBoolean);
  
  void setMessage(byte[] paramArrayOfbyte, boolean paramBoolean);
  
  byte[] getMessage();
  
  boolean isModified();
  
  byte[] getSelectedData();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IMessageEditorTab.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */