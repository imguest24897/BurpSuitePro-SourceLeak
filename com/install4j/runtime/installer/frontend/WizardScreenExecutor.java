/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.AbstractBean;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.api.styles.StyleManager;
/*     */ import com.install4j.runtime.beans.TextBinder;
/*     */ import com.install4j.runtime.beans.styles.StyleManagerImpl;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.WizardContextInt;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.CommandSink;
/*     */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*     */ import com.install4j.runtime.installer.controller.ReturnToken;
/*     */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.applaunch.ProgressCommunication;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import com.install4j.runtime.installer.platform.win32.WinTaskBar;
/*     */ import com.install4j.runtime.wizard.WizardBase;
/*     */ import com.install4j.runtime.wizard.WizardScreen;
/*     */ import java.awt.Button;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Window;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ public abstract class WizardScreenExecutor extends WizardBase implements ScreenExecutor, WizardContextInt {
/*     */   private GUIProgressInterface defaultProgressInterface;
/*     */   private RollbackProgressInterface rollbackProgressInterface;
/*     */   private ScreenEnvelope screenEnvelope;
/*  42 */   private Map<Screen, WizardIndexAndKey> cachedWizardIndexKeys = new HashMap<>(); private CommandSink commandSink; private WizardIndex wizardIndex; private String wizardIndexKey;
/*     */   private boolean dialog;
/*     */   private Window parentWindow;
/*     */   private Dimension overriddenSize;
/*     */   private TextBinder textBinder;
/*     */   private String overriddenTitle;
/*     */   
/*     */   public WizardScreenExecutor(boolean dialog, Window parentWindow) {
/*  50 */     super("");
/*  51 */     this.dialog = dialog;
/*  52 */     this.parentWindow = parentWindow;
/*  53 */     initAWT();
/*     */ 
/*     */ 
/*     */     
/*  57 */     if (Boolean.getBoolean("install4j.runtime.overrideDisplay")) {
/*  58 */       ScreenSizeUtil.checkOverrideScreenDevice();
/*     */     }
/*     */     
/*  61 */     this.defaultProgressInterface = new GUIProgressInterface();
/*  62 */     FileInstaller.getInstance().setDefaultProgressInterface(this.defaultProgressInterface);
/*     */     
/*  64 */     if (Util.isMacOS() && !InstallerUtil.isInProcess()) {
/*  65 */       VersionSpecificHelper.setMacQuitHandler(() -> pressControlButton(ControlButtonType.CANCEL));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {
/*  71 */     this.screenEnvelope.setControlButtonEnabled(controlButtonType, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {
/*  76 */     this.screenEnvelope.setControlButtonVisible(controlButtonType, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   public void pressControlButton(ControlButtonType controlButtonType) {
/*  81 */     this.screenEnvelope.pressControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {
/*  86 */     this.screenEnvelope.focusControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {
/*  91 */     this.screenEnvelope.setControlButtonText(controlButtonType, text);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonEnabled(boolean enabled) {
/*  97 */     setControlButtonEnabled(ControlButtonType.NEXT, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setBackButtonEnabled(boolean enabled) {
/* 103 */     setControlButtonEnabled(ControlButtonType.PREVIOUS, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonEnabled(boolean enabled) {
/* 109 */     setControlButtonEnabled(ControlButtonType.CANCEL, enabled);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonVisible(boolean visible) {
/* 115 */     setControlButtonVisible(ControlButtonType.NEXT, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setBackButtonVisible(boolean visible) {
/* 121 */     setControlButtonVisible(ControlButtonType.PREVIOUS, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonVisible(boolean visible) {
/* 127 */     setControlButtonVisible(ControlButtonType.CANCEL, visible);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void pressNextButton() {
/* 133 */     pressControlButton(ControlButtonType.NEXT);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void pressPreviousButton() {
/* 139 */     pressControlButton(ControlButtonType.PREVIOUS);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void pressCancelButton() {
/* 145 */     pressControlButton(ControlButtonType.CANCEL);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void focusNextButton() {
/* 151 */     focusControlButton(ControlButtonType.NEXT);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setNextButtonText(String text) {
/* 157 */     setControlButtonText(ControlButtonType.NEXT, text);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setPreviousButtonText(String text) {
/* 163 */     setControlButtonText(ControlButtonType.PREVIOUS, text);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCancelButtonText(String text) {
/* 169 */     setControlButtonText(ControlButtonType.CANCEL, text);
/*     */   }
/*     */   
/*     */   public WizardIndex getWizardIndex() {
/* 173 */     return this.wizardIndex;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWizardIndex(WizardIndex wizardIndex) {
/* 178 */     this.wizardIndex = wizardIndex;
/* 179 */     this.wizardIndexKey = (wizardIndex == null) ? null : AbstractBean.replaceVariables(wizardIndex.getInitialKey());
/* 180 */     updateWizardIndex();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWizardIndexKey(String key) {
/* 185 */     this.wizardIndexKey = AbstractBean.replaceVariables(key);
/* 186 */     updateWizardIndex();
/*     */   }
/*     */   
/*     */   public void updateWizardIndex() {
/* 190 */     EventQueue.invokeLater(() -> {
/*     */           if (this.screenEnvelope != null) {
/*     */             this.screenEnvelope.activateWizardIndex();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public StyleManager getStyleManager() {
/* 199 */     return (StyleManager)StyleManagerImpl.getInstance();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWindowSize(int width, int height) {
/* 204 */     if (width == 0 || height == 0) {
/* 205 */       this.overriddenSize = null;
/*     */     } else {
/* 207 */       this.overriddenSize = new Dimension(width, height);
/* 208 */       Window parentWindow = UiUtil.getParentWindow();
/* 209 */       if (parentWindow != null) {
/* 210 */         parentWindow.setSize(width, height);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWindowTitle() {
/* 217 */     return this.overriddenTitle;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWindowTitle(String title) {
/* 222 */     Window parentWindow = UiUtil.getParentWindow();
/* 223 */     if (parentWindow != null) {
/* 224 */       getTextBinder().bind(title, parentWindow);
/*     */     }
/* 226 */     this.overriddenTitle = title;
/*     */   }
/*     */   
/*     */   protected TextBinder getTextBinder() {
/* 230 */     if (this.textBinder == null) {
/* 231 */       this.textBinder = new TextBinder();
/*     */     }
/* 233 */     return this.textBinder;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getWindowSize() {
/* 238 */     return this.overriddenSize;
/*     */   }
/*     */   
/*     */   public String getWizardIndexKey() {
/* 242 */     return this.wizardIndexKey;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void register(Screen screen, ScreenBeanConfig config) {
/* 248 */     getContext().applyToScreen(screen, config);
/* 249 */     GUIHelper.invokeOnEDT(() -> registerScreen(new ScreenEnvelope(this, screen, config.getStyleId(), config)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void execute(ScreenBeanConfig screenConfig, CommandSink commandSink, boolean previousPossible, ControllerCommand lastCommand) {
/* 254 */     Screen screen = screenConfig.getOrInstantiateScreen(false);
/*     */     
/* 256 */     if ((lastCommand instanceof com.install4j.runtime.installer.controller.GoBackCommand || lastCommand instanceof com.install4j.runtime.installer.controller.GoBackInHistoryToScreenCommand) && 
/* 257 */       this.cachedWizardIndexKeys.containsKey(screen)) {
/* 258 */       WizardIndexAndKey wizardIndexAndKey = this.cachedWizardIndexKeys.get(screen);
/* 259 */       this.wizardIndex = wizardIndexAndKey.wizardIndex;
/* 260 */       this.wizardIndexKey = wizardIndexAndKey.key;
/*     */     } 
/*     */ 
/*     */     
/* 264 */     setCommandSink(commandSink);
/* 265 */     for (WizardScreen wizardScreen : getScreens()) {
/* 266 */       ScreenEnvelope screenEnvelope = (ScreenEnvelope)wizardScreen;
/* 267 */       if (screenEnvelope.getScreen() == screen) {
/* 268 */         if (this.screenEnvelope != null) {
/* 269 */           this.screenEnvelope.deactivate();
/*     */         }
/* 271 */         this.screenEnvelope = screenEnvelope;
/* 272 */         setScreen(screenEnvelope);
/* 273 */         if (!previousPossible) {
/* 274 */           screenEnvelope.setControlButtonVisible(ControlButtonType.PREVIOUS, false);
/*     */         }
/* 276 */         if (!isShowing()) {
/* 277 */           if (this.dialog) {
/* 278 */             showDialog(this.parentWindow);
/*     */           } else {
/* 280 */             showFrame(null);
/*     */           } 
/*     */         }
/*     */         return;
/*     */       } 
/*     */     } 
/* 286 */     throw new RuntimeException("screen not registered " + screen.toString());
/*     */   }
/*     */   
/*     */   public void cacheWizardIndexAndKey(Screen screen) {
/* 290 */     this.cachedWizardIndexKeys.put(screen, new WizardIndexAndKey(this.wizardIndex, this.wizardIndexKey));
/*     */   }
/*     */ 
/*     */   
/*     */   public CommandSink getCommandSink() {
/* 295 */     return this.commandSink;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCommandSink(CommandSink commandSink) {
/* 300 */     this.commandSink = commandSink;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ProgressInterface getProgressInterface() {
/* 306 */     return ProgressCommunication.getCurrent().wrap(getProgressInterfaceInternal());
/*     */   }
/*     */   
/*     */   private ProgressInterface getProgressInterfaceInternal() {
/* 310 */     if (this.rollbackProgressInterface != null)
/* 311 */       return this.rollbackProgressInterface; 
/* 312 */     if (this.screenEnvelope != null) {
/* 313 */       FormPanel formPanel = this.screenEnvelope.getFormPanel();
/* 314 */       if (formPanel != null) {
/* 315 */         ProgressInterface formPanelProgressInterface = formPanel.findProgressInterface();
/* 316 */         if (formPanelProgressInterface != null) {
/* 317 */           return formPanelProgressInterface;
/*     */         }
/*     */       } 
/* 320 */       return this.screenEnvelope.getScreen().getProgressInterface(this.defaultProgressInterface);
/*     */     } 
/* 322 */     return this.defaultProgressInterface;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ProgressInterface getDefaultProgressInterface() {
/* 328 */     return this.defaultProgressInterface;
/*     */   }
/*     */ 
/*     */   
/*     */   public WizardContextInt getWizardContext() {
/* 333 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public void selectLanguage(ReturnToken returnToken) {
/* 338 */     (new LanguageSelectionDialog(returnToken)).setVisible(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattended() {
/* 343 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedAlerts() {
/* 348 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isUnattendedWithProgress() {
/* 353 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isConsole() {
/* 358 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameWidth() {
/* 363 */     ContextImpl context = getContext();
/* 364 */     String overriddenWidth = context.getCompilerVariable("__internal.app." + InstallerConfig.getCurrentApplicationId() + ".width");
/* 365 */     if (overriddenWidth != null) {
/* 366 */       return Integer.parseInt(overriddenWidth);
/*     */     }
/* 368 */     Dimension windowSize = context.getWizardContext().getWindowSize();
/* 369 */     if (windowSize != null) {
/* 370 */       return windowSize.width;
/*     */     }
/* 372 */     return InstallerConfig.getCurrentApplication().getFrameWidth();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getFrameHeight() {
/* 379 */     ContextImpl context = getContext();
/* 380 */     String overriddenHeight = context.getCompilerVariable("__internal.app." + InstallerConfig.getCurrentApplicationId() + ".height");
/* 381 */     if (overriddenHeight != null) {
/* 382 */       return Integer.parseInt(overriddenHeight);
/*     */     }
/* 384 */     Dimension windowSize = context.getWizardContext().getWindowSize();
/* 385 */     if (windowSize != null) {
/* 386 */       return windowSize.height;
/*     */     }
/* 388 */     return InstallerConfig.getCurrentApplication().getFrameHeight();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean needsNextScreenOnVisible() {
/* 395 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void beforeShow(Window wizardWindow) {
/* 400 */     super.beforeShow(wizardWindow);
/* 401 */     if (wizardWindow instanceof JFrame) {
/* 402 */       JFrame frame = (JFrame)wizardWindow;
/* 403 */       frame.setResizable(InstallerConfig.getCurrentApplication().isResizable());
/*     */     } else {
/* 405 */       JDialog dialog = (JDialog)wizardWindow;
/* 406 */       dialog.setResizable(InstallerConfig.getCurrentApplication().isResizable());
/*     */     } 
/* 408 */     getContext().getWizardContext().setWindowTitle(getWindowTitle());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void beforeHide(Window wizardWindow) {
/* 413 */     super.beforeHide(wizardWindow);
/* 414 */     if (this.rollbackProgressInterface != null && this.rollbackProgressInterface.isVisible()) {
/* 415 */       this.rollbackProgressInterface.setVisible(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isSizeClientArea() {
/* 421 */     return InstallerConfig.getCurrentApplication().isFrameSizeClientArea();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isQuitOnWindowClose() {
/* 426 */     if (this.screenEnvelope == null) {
/* 427 */       return true;
/*     */     }
/* 429 */     return (this.screenEnvelope.isCancelVisible() && this.screenEnvelope.isCancelButtonEnabled());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFinishOnWindowClose() {
/* 434 */     if (this.screenEnvelope == null) {
/* 435 */       return false;
/*     */     }
/* 437 */     return this.screenEnvelope.isFinishScreen();
/*     */   }
/*     */ 
/*     */   
/*     */   public void finishFromCloseButton() {
/* 442 */     this.screenEnvelope.doNext();
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancel() {
/* 447 */     getContext().runWithSuspendedActions(() -> {
/*     */           if (GUIHelper.confirmCancel((Component)this)) {
/*     */             cancelImmediately();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancelImmediately() {
/* 456 */     this.screenEnvelope.setControlButtonEnabled(ControlButtonType.CANCEL, false);
/* 457 */     ContextImpl.setCancelling();
/* 458 */     this.commandSink.returnToController(ControllerCommand.CANCEL);
/*     */   }
/*     */ 
/*     */   
/*     */   public void actionsCompleted() {
/* 463 */     SwingUtilities.invokeLater(() -> WinTaskBar.getTaskBar(GUIHelper.getParentWindow()).setProgressState(WinTaskBar.ProgressState.NOPROGRESS));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupComponent() {
/* 468 */     super.setupComponent();
/*     */     
/* 470 */     setMinimumSize(new Dimension(500, 300));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRollback() {
/* 476 */     if (this.screenEnvelope != null && this.screenEnvelope.getScreen() instanceof com.install4j.runtime.beans.screens.SystemProgressScreen) {
/* 477 */       ProgressInterface progressInterface = getProgressInterface();
/*     */       
/* 479 */       progressInterface.setIndeterminateProgress(false);
/* 480 */       progressInterface.setDetailMessage("");
/* 481 */       progressInterface.setStatusMessage(Messages.getString(".StatusRollback"));
/* 482 */       progressInterface.setPercentCompleted(0);
/* 483 */     } else if (this.rollbackProgressInterface == null) {
/* 484 */       Runnable runnable = () -> {
/*     */           this.rollbackProgressInterface = new RollbackProgressInterface(getWizardWindow());
/*     */           this.rollbackProgressInterface.setVisible(true);
/*     */         };
/* 488 */       GUIHelper.invokeOnEDT(runnable);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void closeWindows() {
/* 494 */     finish();
/*     */   }
/*     */ 
/*     */   
/*     */   public ActionCallback getActionCallback() {
/* 499 */     return this.screenEnvelope;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initializeLazilyLoadedScreens() {
/* 504 */     for (WizardScreen wizardScreen : getScreens()) {
/* 505 */       ((ScreenEnvelope)wizardScreen).initializeLazilyLoaded();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initAWT() {
/* 513 */     if (SwingUtilities.isEventDispatchThread()) {
/* 514 */       new Button();
/*     */     } else {
/*     */       try {
/* 517 */         SwingUtilities.invokeAndWait(Button::new);
/* 518 */       } catch (InterruptedException e) {
/* 519 */         e.printStackTrace();
/* 520 */       } catch (InvocationTargetException e) {
/* 521 */         Throwable cause = e.getTargetException();
/* 522 */         if (cause instanceof RuntimeException)
/* 523 */           throw (RuntimeException)cause; 
/* 524 */         if (cause instanceof Error) {
/* 525 */           throw (Error)cause;
/*     */         }
/* 527 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void disarmButtons() {
/* 534 */     if (this.screenEnvelope != null)
/* 535 */       this.screenEnvelope.disarmButtons(); 
/*     */   }
/*     */   
/*     */   private static class WizardIndexAndKey
/*     */   {
/*     */     private WizardIndex wizardIndex;
/*     */     private String key;
/*     */     
/*     */     private WizardIndexAndKey(WizardIndex wizardIndex, String key) {
/* 544 */       this.wizardIndex = wizardIndex;
/* 545 */       this.key = key;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\WizardScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */