package com.install4j.api.formcomponents;

import com.install4j.api.beans.ReplacementMode;
import com.install4j.api.beans.UndefinedVariableException;
import com.install4j.api.beans.VariableErrorHandlingDescriptor;
import com.install4j.api.context.NotSupportedInElevationException;
import com.install4j.api.context.UserCanceledException;
import com.install4j.api.screens.Console;
import com.install4j.api.screens.Screen;
import java.util.List;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.event.ChangeListener;

public interface FormEnvironment {
  FormComponent[] getFormComponents();
  
  List<?> getFormComponentTree();
  
  String getId(FormComponent paramFormComponent);
  
  <T> T[] getFormComponents(Class<T> paramClass);
  
  <T> T getFirstFormComponent(Class<T> paramClass) throws NotSupportedInElevationException;
  
  FormComponent getFormComponentById(String paramString);
  
  LayoutGroup getLayoutGroupById(String paramString);
  
  ComponentTuple getComponentTuple(FormComponent paramFormComponent);
  
  void scrollComponentToVisible(FormComponent paramFormComponent);
  
  boolean handleConsole(Console paramConsole) throws UserCanceledException;
  
  boolean isDesignTime();
  
  void addDesignTimeChangeListener(ChangeListener paramChangeListener);
  
  void removeDesignTimeChangeListener(ChangeListener paramChangeListener);
  
  String getDesignTimeName(FormComponent paramFormComponent);
  
  String getDesignTimeName(LayoutGroup paramLayoutGroup);
  
  Screen getScreen();
  
  void resetFormComponents();
  
  void reinitializeFormComponents();
  
  boolean saveFormComponents();
  
  void makeParentGroupVisible(FormComponent paramFormComponent);
  
  void bindTextWithVariables(String paramString, JComponent paramJComponent);
  
  Object getFormVariable(String paramString);
  
  void setFormVariable(String paramString, Object paramObject);
  
  Set<String> getFormVariableNames();
  
  String replaceFormVariables(String paramString, ReplacementMode paramReplacementMode, VariableErrorHandlingDescriptor paramVariableErrorHandlingDescriptor) throws UndefinedVariableException;
  
  boolean isInitialized();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\formcomponents\FormEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */