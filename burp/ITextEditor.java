package burp;

import java.awt.Component;

public interface ITextEditor {
  Component getComponent();
  
  void setEditable(boolean paramBoolean);
  
  void setText(byte[] paramArrayOfbyte);
  
  byte[] getText();
  
  boolean isTextModified();
  
  byte[] getSelectedText();
  
  int[] getSelectionBounds();
  
  void setSearchExpression(String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\ITextEditor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */