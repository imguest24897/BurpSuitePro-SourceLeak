package com.install4j.api.screens;

import com.install4j.api.beans.VisualContainerBean;
import com.install4j.api.context.ProgressInterface;
import com.install4j.api.context.UserCanceledException;
import javax.swing.JComponent;

public interface Screen extends VisualContainerBean {
  JComponent createComponent();
  
  String getTitle();
  
  String getSubTitle();
  
  boolean isNextVisible();
  
  boolean isPreviousVisible();
  
  boolean isCancelVisible();
  
  void willActivate();
  
  void activated();
  
  void deactivated();
  
  boolean next();
  
  boolean previous();
  
  boolean cancel();
  
  boolean isHiddenForNext();
  
  boolean isHiddenForPrevious();
  
  boolean isHidden();
  
  boolean handleUnattended();
  
  boolean handleConsole(Console paramConsole) throws UserCanceledException;
  
  ProgressInterface getProgressInterface(ProgressInterface paramProgressInterface);
  
  boolean isCreateLazily();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\screens\Screen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */