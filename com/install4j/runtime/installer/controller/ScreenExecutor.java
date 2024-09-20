package com.install4j.runtime.installer.controller;

import com.install4j.api.context.ProgressInterface;
import com.install4j.api.screens.Screen;
import com.install4j.runtime.installer.ContextImpl;
import com.install4j.runtime.installer.WizardContextInt;
import com.install4j.runtime.installer.config.ScreenBeanConfig;

public interface ScreenExecutor {
  void register(Screen paramScreen, ScreenBeanConfig paramScreenBeanConfig);
  
  void execute(ScreenBeanConfig paramScreenBeanConfig, CommandSink paramCommandSink, boolean paramBoolean, ControllerCommand paramControllerCommand);
  
  boolean isUnattended();
  
  boolean isUnattendedAlerts();
  
  boolean isUnattendedWithProgress();
  
  boolean isConsole();
  
  CommandSink getCommandSink();
  
  ProgressInterface getProgressInterface();
  
  ProgressInterface getDefaultProgressInterface();
  
  WizardContextInt getWizardContext();
  
  void selectLanguage(ReturnToken paramReturnToken);
  
  void setRollback();
  
  void closeWindows();
  
  ActionCallback getActionCallback();
  
  ContextImpl getContext();
  
  void initializeLazilyLoadedScreens();
  
  void setCommandSink(CommandSink paramCommandSink);
  
  void cancelImmediately();
  
  default void actionsCompleted() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\ScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */