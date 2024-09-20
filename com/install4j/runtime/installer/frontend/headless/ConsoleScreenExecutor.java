/*     */ package com.install4j.runtime.installer.frontend.headless;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.api.screens.FormPanelContainer;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LanguageConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*     */ import com.install4j.runtime.installer.controller.ReturnToken;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.VariableResourceBundleWrapper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.applaunch.ProgressCommunication;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import java.util.List;
/*     */ import java.util.ResourceBundle;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public abstract class ConsoleScreenExecutor extends AbstractHeadlessScreenExecutor {
/*     */   protected ConsoleScreenExecutor() {
/*  25 */     init(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattended() {
/*  30 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedAlerts() {
/*  35 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedWithProgress() {
/*  40 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isConsole() {
/*  45 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ControllerCommand handleScreen(ScreenBeanConfig screenConfig) throws UserCanceledException {
/*  50 */     Screen screen = screenConfig.getOrInstantiateScreen(false);
/*     */     while (true) {
/*  52 */       ConsoleImpl console = ConsoleImpl.getInstance();
/*  53 */       Object[] scriptParameters = null;
/*  54 */       if (screen instanceof FormPanelContainer) {
/*  55 */         FormPanel formPanel = new FormPanel(screenConfig.getFormComponentConfigs(), (Context)getContext(), (Bean)screen, null);
/*  56 */         ((FormPanelContainer)screen).setFormPanel((JPanel)formPanel, formPanel.getFormEnvironment());
/*  57 */         scriptParameters = new Object[] { formPanel.getFormEnvironment() };
/*     */       } 
/*  59 */       screen.createComponent();
/*  60 */       if (screen.isHidden() || screen.isHiddenForNext()) {
/*  61 */         return null;
/*     */       }
/*  63 */       getContext().runBooleanScript(screenConfig.getPreActivationClassName(), (Bean)screen, scriptParameters);
/*  64 */       if (!screen.handleConsole((Console)console)) {
/*  65 */         return ControllerCommand.CANCEL;
/*     */       }
/*  67 */       ControllerCommand overriddenCommand = getCommandSink().getOverriddenCommand();
/*  68 */       if (overriddenCommand != null) {
/*  69 */         return overriddenCommand;
/*     */       }
/*  71 */       ControllerCommand controllerCommand = runValidationScript(screenConfig, screen, scriptParameters);
/*  72 */       if (controllerCommand != ControllerCommand.CANCEL) {
/*  73 */         return controllerCommand;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface() {
/*  80 */     return ProgressCommunication.getCurrent().wrap((ProgressInterface)ConsoleImpl.getInstance());
/*     */   }
/*     */   
/*     */   public void selectLanguage(ReturnToken wakeupToken) {
/*     */     LanguageConfig systemLanguage;
/*  85 */     ConsoleImpl consoleImpl = ConsoleImpl.getInstance();
/*     */     
/*  87 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  88 */     List<LanguageConfig> languages = config.getLanguages();
/*  89 */     String systemLanguageId = InstallerUtil.getSupportedSystemLanguageId();
/*     */     
/*  91 */     if (config.isLanguageSelectionInPrincipalLanguage() || systemLanguageId == null) {
/*  92 */       systemLanguage = languages.get(0);
/*     */     } else {
/*  94 */       systemLanguage = config.getLanguageById(systemLanguageId);
/*     */     } 
/*  96 */     VariableResourceBundleWrapper variableResourceBundleWrapper = Messages.createMessages(systemLanguage);
/*     */     
/*  98 */     consoleImpl.println(variableResourceBundleWrapper.getString(".LanguageSelectionLabel"));
/*     */     
/* 100 */     List<LanguageConfig> sortedList = Messages.sortLanguages(languages, (ResourceBundle)variableResourceBundleWrapper);
/*     */     
/* 102 */     int defaultPos = -1;
/* 103 */     for (int i = 0; i < sortedList.size(); i++) {
/* 104 */       consoleImpl.print((i + 1) + ": " + Messages.getLocalizedLanguageName(sortedList.get(i), (ResourceBundle)variableResourceBundleWrapper));
/* 105 */       if (sortedList.get(i) == systemLanguage) {
/* 106 */         consoleImpl.print(" [" + variableResourceBundleWrapper.getString(".ConsoleEnter") + "]");
/* 107 */         defaultPos = i;
/*     */       } 
/* 109 */       consoleImpl.println();
/*     */     } 
/*     */ 
/*     */     
/*     */     while (true) {
/*     */       try {
/* 115 */         consoleImpl.println("[1 - " + sortedList.size() + "]");
/* 116 */         String answer = consoleImpl.readLine();
/* 117 */         if (answer.trim().length() == 0 && defaultPos > -1) {
/* 118 */           wakeupToken.returnToController(((LanguageConfig)sortedList.get(defaultPos)).getId());
/*     */           return;
/*     */         } 
/* 121 */         int number = Integer.parseInt(answer);
/* 122 */         if (number > 0 && number <= sortedList.size()) {
/* 123 */           wakeupToken.returnToController(((LanguageConfig)sortedList.get(number - 1)).getId());
/*     */           return;
/*     */         } 
/* 126 */       } catch (NumberFormatException numberFormatException) {
/*     */       
/* 128 */       } catch (UserCanceledException e) {
/*     */         
/*     */         try {
/* 131 */           Thread.sleep(100000000L);
/* 132 */         } catch (InterruptedException e1) {
/* 133 */           e1.printStackTrace();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void closeWindows() {
/* 141 */     super.closeWindows();
/* 142 */     ConsoleImpl.getInstance().cleanup();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\headless\ConsoleScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */