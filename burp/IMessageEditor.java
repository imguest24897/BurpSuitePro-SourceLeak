package burp;

import java.awt.Component;

public interface IMessageEditor {
  Component getComponent();
  
  void setMessage(byte[] paramArrayOfbyte, boolean paramBoolean);
  
  byte[] getMessage();
  
  boolean isMessageModified();
  
  byte[] getSelectedData();
  
  int[] getSelectionBounds();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IMessageEditor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */