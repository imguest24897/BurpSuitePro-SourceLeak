/*     */ package com.install4j.runtime.installer.frontend.headless;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.DefaultUnattendedProgressInterface;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UnattendedProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.FormPanelContainer;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.installer.DummyWizardContext;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LanguageConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*     */ import com.install4j.runtime.installer.controller.ReturnToken;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.LookAndFeelHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.SplashProgressInterface;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.RunningProcessChecker;
/*     */ import com.install4j.runtime.installer.helper.applaunch.ProgressCommunication;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public abstract class UnattendedScreenExecutor extends AbstractHeadlessScreenExecutor {
/*     */   private UnattendedProgressInterface progressInterface;
/*     */   private boolean quietOverwrite;
/*     */   private boolean noFileFailures;
/*     */   private int wait;
/*     */   private String splash;
/*     */   
/*     */   public UnattendedScreenExecutor(boolean quietOverwrite, boolean noFileFailures, int wait, String splash, boolean unattendedAlerts, boolean dialog, Window parentWindow) {
/*  42 */     this.quietOverwrite = quietOverwrite;
/*  43 */     this.noFileFailures = noFileFailures;
/*  44 */     this.wait = wait;
/*  45 */     this.splash = splash;
/*  46 */     this.unattendedAlerts = unattendedAlerts;
/*  47 */     this.dialog = dialog;
/*  48 */     this.parentWindow = parentWindow;
/*  49 */     this.suppressStdout = Boolean.getBoolean("install4j.suppressStdout");
/*  50 */     this.detailStdout = Boolean.getBoolean("install4j.detailStdout");
/*  51 */     init(((splash == null && getUnattendedProgressInterfaceProvider() == null) || InstallerUtil.isHeadless()));
/*     */   }
/*     */   private boolean dialog; private Window parentWindow; private boolean suppressStdout; private boolean detailStdout; private boolean unattendedAlerts;
/*     */   private ScriptProperty getUnattendedProgressInterfaceProvider() {
/*  55 */     ScriptProperty unattendedProgressInterfaceProvider = InstallerConfig.getCurrentApplication().getUnattendedProgressInterfaceProvider();
/*  56 */     if (unattendedProgressInterfaceProvider != null && unattendedProgressInterfaceProvider.getValue() != null && unattendedProgressInterfaceProvider.getValue().length() > 0) {
/*  57 */       return unattendedProgressInterfaceProvider;
/*     */     }
/*  59 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected ControllerCommand handleScreen(ScreenBeanConfig screenConfig) {
/*  65 */     if (this.wait > 0) {
/*     */       try {
/*  67 */         boolean success = false;
/*  68 */         for (int i = 0; i < this.wait; i++) {
/*  69 */           if (RunningProcessChecker.checkDefaultRunningLauncher(null)) {
/*  70 */             success = true;
/*     */             break;
/*     */           } 
/*  73 */           Thread.sleep(1000L);
/*     */         } 
/*  75 */         if (!success) {
/*  76 */           System.err.println(Messages.getString(".UnattendedRunningFailure"));
/*  77 */           getContext().immediateExit(-1);
/*     */         } 
/*  79 */       } catch (InterruptedException e) {
/*  80 */         e.printStackTrace();
/*  81 */       } catch (UserCanceledException userCanceledException) {}
/*     */       
/*  83 */       this.wait = 0;
/*     */     } 
/*  85 */     Object[] scriptParameters = null;
/*     */     
/*  87 */     Screen screen = screenConfig.getOrInstantiateScreen(false);
/*  88 */     if (screen instanceof FormPanelContainer) {
/*  89 */       FormPanel formPanel = new FormPanel(screenConfig.getFormComponentConfigs(), (Context)getContext(), (Bean)screen, null);
/*  90 */       ((FormPanelContainer)screen).setFormPanel((JPanel)formPanel, formPanel.getFormEnvironment());
/*  91 */       if (!formPanel.handleUnattended()) {
/*  92 */         return ControllerCommand.CANCEL;
/*     */       }
/*  94 */       scriptParameters = new Object[] { formPanel.getFormEnvironment() };
/*     */     } 
/*  96 */     if (screen.isHidden() || screen.isHiddenForNext()) {
/*  97 */       return null;
/*     */     }
/*  99 */     if (!screen.handleUnattended()) {
/* 100 */       return ControllerCommand.CANCEL;
/*     */     }
/* 102 */     getContext().runBooleanScript(screenConfig.getPreActivationClassName(), (Bean)screen, scriptParameters);
/* 103 */     return runValidationScript(screenConfig, screen, scriptParameters);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattended() {
/* 108 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedAlerts() {
/* 113 */     return this.unattendedAlerts;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedWithProgress() {
/* 118 */     return (this.splash != null || getUnattendedProgressInterfaceProvider() != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isConsole() {
/* 123 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface() {
/* 128 */     if (this.progressInterface == null) {
/* 129 */       ProgressCommunication communication = ProgressCommunication.getCurrent();
/* 130 */       ScriptProperty unattendedProgressInterfaceProvider = getUnattendedProgressInterfaceProvider();
/* 131 */       if (this.splash == null && unattendedProgressInterfaceProvider == null) {
/* 132 */         this.progressInterface = communication.wrap((UnattendedProgressInterface)new NullProgressInterface());
/*     */       } else {
/* 134 */         Runnable runnable = () -> {
/*     */             LookAndFeelHelper.setLookAndFeel();
/*     */             try {
/*     */               if (unattendedProgressInterfaceProvider != null) {
/*     */                 this.progressInterface = communication.wrap((UnattendedProgressInterface)getContext().runScript(unattendedProgressInterfaceProvider, (Bean)InstallerConfig.getCurrentApplication(), new Object[0]));
/*     */               } else {
/*     */                 this.progressInterface = communication.wrap((UnattendedProgressInterface)new SplashProgressInterface(this.splash, false, this.quietOverwrite, this.noFileFailures, this, this.dialog, this.parentWindow));
/*     */               } 
/*     */               this.progressInterface.setVisible(true);
/* 143 */             } catch (Exception e) {
/*     */               Util.fatalError(e);
/*     */             } 
/*     */           };
/*     */         try {
/* 148 */           GUIHelper.invokeOnEDT(runnable);
/* 149 */         } catch (Exception e) {
/* 150 */           e.printStackTrace();
/* 151 */           this.progressInterface = communication.wrap((UnattendedProgressInterface)new NullProgressInterface());
/*     */         } 
/*     */       } 
/*     */     } 
/* 155 */     return (ProgressInterface)this.progressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public void closeWindows() {
/* 160 */     if (this.progressInterface != null) {
/* 161 */       this.progressInterface.setVisible(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void selectLanguage(ReturnToken wakeupToken) {
/* 167 */     String id = null;
/*     */     
/* 169 */     List<LanguageConfig> languages = InstallerConfig.getCurrentInstance().getLanguages();
/*     */     
/* 171 */     String systemLanguageId = Locale.getDefault().getLanguage();
/* 172 */     LanguageConfig language = InstallerConfig.getCurrentInstance().getLanguageById(systemLanguageId);
/* 173 */     if (language != null) {
/* 174 */       id = language.getId();
/* 175 */     } else if (languages.size() > 0) {
/* 176 */       id = ((LanguageConfig)languages.get(0)).getId();
/*     */     } 
/*     */     
/* 179 */     wakeupToken.returnToController(id);
/*     */   }
/*     */ 
/*     */   
/*     */   protected DummyWizardContext createWizardContext() {
/* 184 */     return new UnattendedWizardContext();
/*     */   }
/*     */   
/*     */   private class NullProgressInterface extends DefaultUnattendedProgressInterface {
/*     */     private NullProgressInterface() {}
/*     */     
/*     */     public void setStatusMessage(String message) {
/* 191 */       if (!UnattendedScreenExecutor.this.suppressStdout) {
/* 192 */         ConsoleImpl.getInstance().setStatusMessage(message);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void setDetailMessage(String message) {
/* 198 */       if (UnattendedScreenExecutor.this.detailStdout) {
/* 199 */         ConsoleImpl.getInstance().setDetailMessage(message);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void showFailure(String message) {
/* 205 */       ConsoleImpl.getInstance().showFailure(message);
/*     */     }
/*     */ 
/*     */     
/*     */     public int askOverwrite(File file) {
/* 210 */       if (UnattendedScreenExecutor.this.quietOverwrite) {
/* 211 */         return 2;
/*     */       }
/* 213 */       return 1;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int askRetry(File file) throws UserCanceledException {
/* 219 */       if (UnattendedScreenExecutor.this.noFileFailures) {
/* 220 */         return super.askRetry(file);
/*     */       }
/* 222 */       return 3;
/*     */     }
/*     */   }
/*     */   
/*     */   private class UnattendedWizardContext
/*     */     extends DummyWizardContext {
/*     */     private UnattendedWizardContext() {}
/*     */     
/*     */     @Deprecated
/*     */     public void setCancelButtonEnabled(boolean enabled) {
/* 232 */       if (UnattendedScreenExecutor.this.progressInterface != null) {
/* 233 */         UnattendedScreenExecutor.this.progressInterface.setCancelButtonEnabled(enabled);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public void setCancelButtonVisible(boolean visible) {
/* 240 */       if (UnattendedScreenExecutor.this.progressInterface != null)
/* 241 */         UnattendedScreenExecutor.this.progressInterface.setCancelButtonVisible(visible); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\headless\UnattendedScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */