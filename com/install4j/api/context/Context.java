package com.install4j.api.context;

import com.install4j.api.actions.Action;
import com.install4j.api.beans.Bean;
import com.install4j.api.beans.ExternalFile;
import com.install4j.api.beans.LocalizedExternalFile;
import com.install4j.api.beans.ScriptProperty;
import com.install4j.api.events.InstallerEventListener;
import com.install4j.api.screens.Screen;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.MissingResourceException;
import java.util.Set;

public interface Context {
  String getLanguageId();
  
  String getMessage(String paramString) throws MissingResourceException;
  
  String getMessage(String paramString, Object... paramVarArgs) throws MissingResourceException;
  
  File getInstallationDirectory();
  
  File getDefaultInstallationDirectory();
  
  File getContentDirectory();
  
  File getResourceDirectory();
  
  boolean isUnattended();
  
  boolean isConsole();
  
  boolean isGui();
  
  boolean isArchive();
  
  String getApplicationId();
  
  String getAddOnApplicationId();
  
  void addInstallerEventListener(InstallerEventListener paramInstallerEventListener) throws NotSupportedInElevationException;
  
  void removeInstallerEventListener(InstallerEventListener paramInstallerEventListener) throws NotSupportedInElevationException;
  
  void gotoScreen(Screen paramScreen) throws NotSupportedInElevationException;
  
  void gotoScreen(Screen paramScreen, boolean paramBoolean1, boolean paramBoolean2) throws NotSupportedInElevationException;
  
  Screen getScreenById(String paramString) throws NotSupportedInElevationException;
  
  Screen[] getScreens();
  
  Screen[] getScreens(Class paramClass) throws NotSupportedInElevationException;
  
  Screen getFirstScreen(Class paramClass) throws NotSupportedInElevationException;
  
  Action getActionById(String paramString) throws NotSupportedInElevationException;
  
  Action[] getActions(Screen paramScreen) throws NotSupportedInElevationException;
  
  Action[] getActions(Class<? extends Action> paramClass, Screen paramScreen) throws NotSupportedInElevationException;
  
  Action getFirstAction(Class<? extends Action> paramClass, Screen paramScreen) throws NotSupportedInElevationException;
  
  String getId(Action paramAction);
  
  String getId(Screen paramScreen);
  
  WizardContext getWizardContext();
  
  Collection<FileSetSetup> getFileSets();
  
  FileSetSetup getFileSetById(String paramString);
  
  FileSetSetup getFileSetByName(String paramString);
  
  Collection<InstallationComponentSetup> getInstallationComponents();
  
  InstallationComponentSetup getInstallationComponentById(String paramString);
  
  Collection<LauncherSetup> getLaunchers();
  
  LauncherSetup getLauncherById(String paramString);
  
  boolean isCancelling();
  
  void cancel();
  
  void runWithSuspendedActions(Runnable paramRunnable);
  
  void handleCriticalException(Throwable paramThrowable);
  
  File getDestinationFile(File paramFile);
  
  File getDestinationFile(String paramString);
  
  FileInfo getDestinationFileInfo(String paramString);
  
  Object getVariable(String paramString);
  
  boolean getBooleanVariable(String paramString);
  
  void setVariable(String paramString, Object paramObject);
  
  Set<String> getVariableNames();
  
  String getCompilerVariable(String paramString);
  
  Object runScript(ScriptProperty paramScriptProperty, Bean paramBean, Object... paramVarArgs) throws Exception;
  
  ProgressInterface getProgressInterface();
  
  void goForward(int paramInt, boolean paramBoolean1, boolean paramBoolean2) throws NotSupportedInElevationException;
  
  void goBack(int paramInt) throws NotSupportedInElevationException;
  
  void goBackInHistory(int paramInt) throws NotSupportedInElevationException;
  
  void goBackInHistory(Screen paramScreen) throws NotSupportedInElevationException;
  
  File getExternalFile(ExternalFile paramExternalFile, boolean paramBoolean);
  
  File getExternalFile(LocalizedExternalFile paramLocalizedExternalFile, boolean paramBoolean);
  
  boolean isErrorOccurred();
  
  void setErrorOccurred(boolean paramBoolean);
  
  void registerResponseFileVariable(String paramString);
  
  void unregisterResponseFileVariable(String paramString);
  
  void registerResponseFileComment(String paramString1, String paramString2);
  
  void registerHiddenVariable(String paramString);
  
  void triggerReboot(boolean paramBoolean);
  
  boolean isRebootRequired();
  
  void finish(int paramInt);
  
  boolean hasBeenElevated();
  
  Serializable runElevated(RemoteCallable paramRemoteCallable, boolean paramBoolean);
  
  Serializable runUnelevated(RemoteCallable paramRemoteCallable);
  
  void initializeLazilyCreatedScreens();
  
  void addToClassPath(File paramFile);
  
  String[] getExtraCommandLineArguments();
  
  String getMediaFileId();
  
  String getVersion();
  
  String getApplicationName();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\Context.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */