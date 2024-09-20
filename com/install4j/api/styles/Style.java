package com.install4j.api.styles;

import com.install4j.api.beans.VisualContainerBean;
import com.install4j.api.context.Context;
import javax.swing.JComponent;

public interface Style extends VisualContainerBean, StyleContextReceiver, ControlButtonContainer {
  void setContext(Context paramContext);
  
  JComponent createComponent();
  
  boolean isStandalone();
  
  void willActivate();
  
  void activated();
  
  void deactivated();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\styles\Style.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */