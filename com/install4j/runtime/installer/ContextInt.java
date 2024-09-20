package com.install4j.runtime.installer;

import com.install4j.api.beans.ActionList;
import com.install4j.api.beans.Bean;
import com.install4j.api.context.Context;
import com.install4j.api.context.FileInfo;
import com.install4j.api.context.RemoteCallable;
import com.install4j.api.context.UserCanceledException;
import com.install4j.api.events.InstallerEvent;
import com.install4j.api.screens.Screen;
import com.install4j.runtime.installer.config.AbstractBeanConfig;
import com.install4j.runtime.installer.helper.InstallationProperties;
import java.io.File;
import java.util.List;

public interface ContextInt extends Context {
  boolean runBooleanActivityWithFallback(RemoteCallable paramRemoteCallable);
  
  <T extends com.install4j.api.actions.Action> List<T> getExecutableActionsStartingFrom(Class<T> paramClass, Screen paramScreen);
  
  Object getEventSource();
  
  void fireInstallerEvent(InstallerEvent paramInstallerEvent);
  
  Context getIdWrapperContext(AbstractBeanConfig paramAbstractBeanConfig);
  
  boolean runBooleanScript(String paramString, Bean paramBean, Object... paramVarArgs);
  
  File getRuntimeDirectory();
  
  InstallationProperties getInstallationProperties();
  
  File getAdditionalUserJarsDir();
  
  FileInfo getDestinationFileInfo(String paramString, boolean paramBoolean);
  
  boolean executeActionListSync(ActionList paramActionList, Object... paramVarArgs) throws UserCanceledException;
  
  void executeActionListAsync(ActionList paramActionList, Object... paramVarArgs);
  
  void rollbackActionList(ActionList paramActionList);
  
  Object[] getExtraScriptParameters();
  
  void setExtraScriptParameters(Object... paramVarArgs);
  
  void setCurrentActionId(String paramString);
  
  String getCurrentActionId();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\ContextInt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */