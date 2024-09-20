/*     */ package com.install4j.runtime.installer.controller;
/*     */ import com.ejt.internal.CommonApplicationServices;
/*     */ import com.ejt.internal.util.JavaVersionUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.Action;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ActionList;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.UndefinedVariableException;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.actions.FailureStrategy;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.beans.groups.ActionGroup;
/*     */ import com.install4j.runtime.beans.screens.BackButtonType;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*     */ import com.install4j.runtime.installer.config.ActionBeanConfig;
/*     */ import com.install4j.runtime.installer.config.GroupBeanConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.LoggerImpl;
/*     */ import com.install4j.runtime.installer.helper.MsiHelper;
/*     */ import com.install4j.runtime.installer.helper.ServiceHandler;
/*     */ import com.install4j.runtime.installer.helper.applaunch.ProgressCommunication;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.win32.MsiCommunication;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Handle;
/*     */ import com.install4j.runtime.installer.platform.win32.WinTaskBar;
/*     */ import com.install4j.runtime.launcher.integration.LockFile;
/*     */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*     */ import java.awt.EventQueue;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class Controller {
/*     */   private static final int MSI_INSUFFICIENT_RIGHTS_EXIT_CODE = 25;
/*  49 */   private List<ActionBeanConfig> startedActionsConfigs = new ArrayList<>(); private ScreenExecutor screenExecutor; private ContextImpl context;
/*  50 */   private Map<ActionList, List<ActionBeanConfig>> startedActionListActions = new HashMap<>();
/*  51 */   private int rollbackBarrierExitCode = 1;
/*     */   
/*     */   private ScreenNavigator screenNavigator;
/*     */   private boolean executingActions;
/*     */   
/*     */   public Controller(ScreenExecutor screenExecutor) {
/*  57 */     this.screenExecutor = screenExecutor;
/*  58 */     this.context = screenExecutor.getContext();
/*     */   }
/*     */   
/*     */   public void start() {
/*  62 */     if (MsiHelper.isStartedFromMsi() && this.screenExecutor.isUnattended() && MsiHelper.isMsiAllUsers((Context)this.context) && !Util.hasFullAdminRights()) {
/*  63 */       System.exit(25);
/*     */     }
/*     */     
/*  66 */     LanguageSelector.initSystemAndDefaultLanguage();
/*  67 */     CommonApplicationServices.setInstance(new Install4jRuntimeApplicationServices());
/*     */     
/*  69 */     InstallerVariables.initUserVars();
/*     */     
/*  71 */     InstallerUtil.registerStarted(false);
/*  72 */     InstallerVariables.setReplaceI18nVariables(true);
/*  73 */     InstallerVariables.setReplaceInstallerAndCompilerVariables(true);
/*  74 */     this.context.initWithVariables();
/*  75 */     LoggerImpl.getImpl().checkAlternativeLogfile();
/*     */     
/*  77 */     InstallerUtil.setConsole(this.screenExecutor.isConsole());
/*  78 */     InstallerUtil.setUnattended(this.screenExecutor.isUnattended());
/*  79 */     InstallerUtil.setUnattendedAlerts(this.screenExecutor.isUnattendedAlerts());
/*  80 */     InstallerUtil.setUnattendedWithProgress(this.screenExecutor.isUnattendedWithProgress());
/*     */     
/*  82 */     if (InstallerVariables.getBooleanVariable("sys.automaticUpdate")) {
/*  83 */       LockFile.createInstallerLock();
/*  84 */       LockFile.waitForShutdownLockFile();
/*     */     } 
/*     */     
/*  87 */     this.context.setupClasspath();
/*  88 */     LanguageSelector.initLanguage(this.context, this.screenExecutor);
/*  89 */     if (!this.context.checkStart()) {
/*  90 */       this.context.exit(1);
/*     */     }
/*  92 */     if (MsiCommunication.connect()) {
/*  93 */       Logger.getInstance().info(null, "connected to MSI installer");
/*     */     }
/*     */     try {
/*  96 */       ((Runnable)Install4jClassLoader.getInstance().loadClass("AfterLafSet").newInstance()).run();
/*  97 */     } catch (Throwable throwable) {}
/*     */     
/*  99 */     if (Util.isWindows() && InstallerConfig.isInstaller() && !Boolean.getBoolean("install4j.disableCloseModuleHandles") && (
/* 100 */       Boolean.getBoolean("install4j.forceCloseModuleHandles") || JavaVersionUtil.JAVA_MAJOR_VERSION == 9 || JavaVersionUtil.JAVA_MAJOR_VERSION == 10))
/*     */     {
/* 102 */       Win32Handle.closeInheritedModulesHandle(Logger.LAUNCHER_LOGGER);
/*     */     }
/*     */ 
/*     */     
/* 106 */     this.context.registerScreens();
/* 107 */     if (getScreenConfigsFlat().size() == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 111 */     this.screenNavigator = new ScreenNavigator(this.context);
/*     */     
/* 113 */     ScreenBeanConfig screenConfig = handleStartup();
/* 114 */     if (screenConfig == null && InstallerUtil.isInProcess()) {
/*     */       return;
/*     */     }
/*     */     
/* 118 */     ControllerCommand lastCommand = null;
/* 119 */     while (screenConfig != null) {
/*     */       
/* 121 */       CommandSink commandSink = new CommandSink(this);
/*     */       
/* 123 */       execute(screenConfig, commandSink, lastCommand);
/*     */       
/* 125 */       synchronized (commandSink) {
/* 126 */         while (commandSink.getCommand() == null) {
/*     */           try {
/* 128 */             commandSink.wait();
/* 129 */           } catch (InterruptedException e) {
/* 130 */             e.printStackTrace();
/*     */           } 
/*     */         } 
/*     */       } 
/* 134 */       lastCommand = commandSink.getCommand();
/* 135 */       screenConfig = handleCommand(commandSink, screenConfig);
/* 136 */       if (commandSink.isFinished()) {
/*     */         return;
/*     */       }
/*     */       
/* 140 */       if (screenConfig == null) {
/* 141 */         Logger.getImpl().setCurrentScreen(null);
/* 142 */         commandSink.finished(); continue;
/*     */       } 
/* 144 */       Logger.getImpl().setCurrentScreen(screenConfig.getOrInstantiateScreen(false));
/*     */     } 
/*     */ 
/*     */     
/* 148 */     this.context.immediateExit(0);
/*     */   }
/*     */ 
/*     */   
/*     */   private ScreenBeanConfig handleStartup() {
/* 153 */     ScreenBeanConfig startupScreenConfig = getScreenConfigsFlat().get(0);
/* 154 */     CommandSink commandSink = new CommandSink(this);
/* 155 */     commandSink.returnToController(new GoForwardCommand(1, true, true, null));
/* 156 */     this.screenExecutor.setCommandSink(commandSink);
/* 157 */     return handleCommand(commandSink, startupScreenConfig);
/*     */   }
/*     */   
/*     */   private void execute(ScreenBeanConfig screenConfig, CommandSink commandSink, ControllerCommand lastCommand) {
/* 161 */     if (lastCommand == null || lastCommand.isAddHistoryEntry()) {
/* 162 */       this.screenNavigator.addHistory(screenConfig);
/*     */     }
/*     */     
/* 165 */     List<AbstractBeanConfig> hiddenForPreviousActionConfigs = new ArrayList<>();
/* 166 */     ScreenBeanConfig previousScreenConfig = this.screenNavigator.findPreviousScreenConfigInHistory(false, hiddenForPreviousActionConfigs, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     boolean previousPossible = (previousScreenConfig != null && screenConfig.getBackButtonType() != BackButtonType.HIDDEN && (screenConfig.getBackButtonType() != BackButtonType.SAFE || (!hasNonMultiExecActions(previousScreenConfig.getActionConfigs()) && !hasNonMultiExecActions(hiddenForPreviousActionConfigs))));
/*     */     
/* 173 */     Screen screen = screenConfig.getOrInstantiateScreen(false);
/* 174 */     ProgressCommunication.getCurrent().screenActivated(screenConfig.getQualifiedDisplayedId());
/* 175 */     this.context.fireInstallerEvent(new InstallerEvent(screen, (Context)this.context, EventType.SHOW_SCREEN));
/*     */     
/* 177 */     EventQueue.invokeLater(() -> this.screenExecutor.execute(screenConfig, commandSink, previousPossible, lastCommand));
/*     */   }
/*     */   
/*     */   private boolean hasNonMultiExecActions(List<AbstractBeanConfig> actionConfigs) {
/* 181 */     for (AbstractBeanConfig beanConfig : actionConfigs) {
/* 182 */       if (beanConfig instanceof GroupBeanConfig) {
/* 183 */         if (hasNonMultiExecActions(((GroupBeanConfig)beanConfig).getBeanConfigs()))
/* 184 */           return true;  continue;
/*     */       } 
/* 186 */       if (beanConfig instanceof ActionBeanConfig && 
/* 187 */         !((ActionBeanConfig)beanConfig).isMultiExec()) {
/* 188 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 192 */     return false;
/*     */   }
/*     */   
/*     */   private ScreenBeanConfig handleCommand(CommandSink commandSink, ScreenBeanConfig currentScreenConfig) {
/* 196 */     Logger.getImpl().resetOrigin();
/* 197 */     ControllerCommand command = commandSink.getCommand();
/* 198 */     ActionCallback actionCallback = null;
/*     */     
/*     */     try {
/* 201 */       if (command instanceof ExecuteActionListCommand) {
/* 202 */         ExecuteActionListCommand executeActionListCommand = (ExecuteActionListCommand)command;
/* 203 */         ActionList actionList = executeActionListCommand.getActionList();
/* 204 */         actionCallback = ((ActionCallbackCommand)command).getActionCallback();
/* 205 */         commandSink.allowOverride();
/* 206 */         if (actionCallback != null) {
/* 207 */           actionCallback.actionsStarted();
/*     */         }
/*     */         
/* 210 */         try { executeActionList(actionList, executeActionListCommand.getExtraScriptParameters()); }
/* 211 */         catch (UserCanceledException userCanceledException) {  }
/* 212 */         catch (Exception e)
/* 213 */         { e.printStackTrace(); }
/*     */         
/* 215 */         if (command == commandSink.getOverriddenCommand()) {
/* 216 */           return currentScreenConfig;
/*     */         }
/* 218 */         command = commandSink.getOverriddenCommand();
/*     */       
/*     */       }
/* 221 */       else if ((command instanceof CheckingScreenChangeCommand && ((CheckingScreenChangeCommand)command).isExecuteActions()) || command instanceof FinishCommand) {
/*     */ 
/*     */ 
/*     */         
/* 225 */         actionCallback = ((ActionCallbackCommand)command).getActionCallback();
/*     */         
/* 227 */         commandSink.allowOverride();
/* 228 */         if (actionCallback != null) {
/* 229 */           actionCallback.actionsStarted();
/*     */         }
/*     */         try {
/*     */           try {
/* 233 */             executeActions(currentScreenConfig.getActionConfigs(), "", false, this.startedActionsConfigs);
/*     */           } finally {
/* 235 */             hideTaskBarProgress();
/*     */           } 
/* 237 */           checkRollbackBarrier((AbstractBeanConfig)currentScreenConfig, (Bean)currentScreenConfig.getOrInstantiateScreen(false));
/* 238 */         } catch (ReturnToScreenException e) {
/* 239 */           if (!(currentScreenConfig.getOrInstantiateScreen(false) instanceof com.install4j.runtime.beans.screens.StartupScreen)) {
/* 240 */             this.context.goBackInHistory(0);
/*     */           }
/* 242 */         } catch (UserCanceledException e) {
/* 243 */           rollback(commandSink);
/* 244 */           return null;
/*     */         } 
/*     */         
/* 247 */         command = commandSink.getOverriddenCommand();
/*     */       } 
/* 249 */       Logger.getInstance().info(currentScreenConfig.getOrInstantiateScreen(false), "command: " + command);
/*     */       
/* 251 */       if (command instanceof GoForwardCommand) {
/* 252 */         GoForwardCommand goForwardCommand = (GoForwardCommand)command;
/*     */         
/* 254 */         ScreenBeanConfig nextScreenConfig = this.screenNavigator.findNextScreenConfig(currentScreenConfig, goForwardCommand.getNumber(), goForwardCommand.isCheckCondition());
/* 255 */         if (nextScreenConfig == null) {
/* 256 */           this.context.fireInstallerEvent(new InstallerEvent(this.context, (Context)this.context, EventType.FINISHING));
/* 257 */           commandSink.finished();
/* 258 */           this.context.finish(0);
/*     */         } 
/* 260 */         return nextScreenConfig;
/* 261 */       }  if (command instanceof GoBackCommand) {
/* 262 */         GoBackCommand goBackCommand = (GoBackCommand)command;
/*     */         
/* 264 */         if (goBackCommand.isUseHistory()) {
/* 265 */           this.screenNavigator.removeLastHistoryItem();
/* 266 */           if (goBackCommand.getNumber() == 0) {
/* 267 */             return currentScreenConfig;
/*     */           }
/* 269 */           ScreenBeanConfig screenConfig = this.screenNavigator.findPreviousScreenConfigInHistory(true, null, goBackCommand.getNumber());
/* 270 */           if (screenConfig == null) {
/* 271 */             throw new RuntimeException("Could not go back " + goBackCommand.getNumber() + " step in history from " + currentScreenConfig.getOrInstantiateScreen(true));
/*     */           }
/* 273 */           return screenConfig;
/*     */         } 
/*     */         
/* 276 */         return this.screenNavigator.findPreviousScreenConfig(currentScreenConfig, goBackCommand.getNumber());
/*     */       } 
/* 278 */       if (command instanceof GoBackInHistoryToScreenCommand) {
/* 279 */         Screen targetScreen = ((GoBackInHistoryToScreenCommand)command).getScreen();
/* 280 */         this.screenNavigator.removeLastHistoryItem();
/* 281 */         if (targetScreen == currentScreenConfig.getOrInstantiateScreen(false)) {
/* 282 */           return currentScreenConfig;
/*     */         }
/*     */         
/*     */         while (true) {
/* 286 */           ScreenBeanConfig screenConfig = this.screenNavigator.findPreviousScreenConfigInHistory(true, null, 1);
/* 287 */           if (screenConfig == null)
/* 288 */             throw new RuntimeException("Could not go back in history to screen " + targetScreen.toString()); 
/* 289 */           if (screenConfig.getOrInstantiateScreen(false) == targetScreen) {
/* 290 */             return screenConfig;
/*     */           }
/*     */         } 
/*     */       } 
/* 294 */       if (command instanceof FinishCommand) {
/* 295 */         this.context.fireInstallerEvent(new InstallerEvent(this.context, (Context)this.context, EventType.FINISHING));
/* 296 */         commandSink.finished();
/* 297 */         this.context.finish(0);
/* 298 */         return null;
/* 299 */       }  if (command == ControllerCommand.CANCEL) {
/* 300 */         rollback(commandSink);
/* 301 */         return null;
/* 302 */       }  if (command instanceof GotoScreenCommand) {
/* 303 */         GotoScreenCommand gotoScreenCommand = (GotoScreenCommand)command;
/* 304 */         ScreenBeanConfig screenConfig = findScreenConfig(gotoScreenCommand.getScreen());
/* 305 */         if (gotoScreenCommand.isCheckCondition() && !this.screenNavigator.shouldBeShown(screenConfig)) {
/* 306 */           screenConfig = this.screenNavigator.findNextScreenConfig(screenConfig, 1, true);
/*     */         }
/* 308 */         this.screenNavigator.sync(screenConfig);
/* 309 */         return screenConfig;
/*     */       } 
/* 311 */       throw new RuntimeException("Unknown command " + command.toString());
/*     */     } finally {
/*     */       
/* 314 */       if (actionCallback != null) {
/* 315 */         actionCallback.actionsFinished();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(CommandSink commandSink) {
/* 322 */     this.context.fireInstallerEvent(new InstallerEvent(this.context, (Context)this.context, EventType.CANCELLING));
/*     */     
/* 324 */     Application currentApplication = InstallerConfig.getCurrentApplication();
/* 325 */     if (currentApplication != null && currentApplication.isRollback()) {
/* 326 */       FileInstaller fileInstaller = FileInstaller.getInstance();
/* 327 */       boolean rollbackFiles = fileInstaller.hasRollbackFiles();
/* 328 */       if (this.startedActionsConfigs.size() > 0 || rollbackFiles) {
/* 329 */         ServiceHandler.resetStopState();
/* 330 */         this.context.setRollback();
/*     */         
/* 332 */         this.context.getProgressInterface().setDetailMessage("");
/* 333 */         if (rollbackFiles) {
/* 334 */           ServiceHandler.stopServices((Context)this.context, true);
/*     */         }
/* 336 */         this.context.getProgressInterface().setStatusMessage(Messages.getString(".StatusRollback"));
/*     */         
/* 338 */         rollbackActions(this.startedActionsConfigs);
/*     */         
/* 340 */         if (rollbackFiles) {
/* 341 */           fileInstaller.rollbackAll();
/*     */         }
/*     */       } 
/* 344 */       if (fileInstaller.hasUnrollbackedFiles()) {
/* 345 */         this.context.fireInstallerEvent(new InstallerEvent(this.context, (Context)this.context, EventType.CANCELED));
/* 346 */         commandSink.finished();
/* 347 */         this.context.finish(1);
/*     */       } 
/*     */     } 
/*     */     
/* 351 */     this.context.fireInstallerEvent(new InstallerEvent(this.context, (Context)this.context, EventType.CANCELED));
/* 352 */     commandSink.finished();
/* 353 */     this.context.exit(this.rollbackBarrierExitCode);
/*     */   }
/*     */   
/*     */   private void rollbackActions(List<ActionBeanConfig> rollbackList) {
/* 357 */     FileInstaller fileInstaller = FileInstaller.getInstance();
/* 358 */     boolean rollbackFiles = fileInstaller.hasRollbackFiles();
/* 359 */     for (int i = rollbackList.size() - 1; i >= 0; i--) {
/* 360 */       Logger.getImpl().resetOrigin();
/* 361 */       ActionBeanConfig actionBeanConfig = rollbackList.get(i);
/* 362 */       if (!actionBeanConfig.isRolledBack()) {
/* 363 */         if (rollbackFiles) {
/* 364 */           fileInstaller.rollback(actionBeanConfig.getRollbackId());
/*     */         }
/* 366 */         this.context.rollbackAction(actionBeanConfig);
/* 367 */         actionBeanConfig.setRolledBack(true);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean executeActions(List<AbstractBeanConfig> actionConfigs, String defaultMessage, boolean parentBreakGroup, List<ActionBeanConfig> rollbackList) throws UserCanceledException {
/* 373 */     boolean oldExecutingActions = this.executingActions;
/* 374 */     this.executingActions = true;
/*     */     try {
/* 376 */       for (AbstractBeanConfig beanConfig : actionConfigs) {
/* 377 */         Logger.getImpl().resetOrigin();
/* 378 */         if (beanConfig instanceof ActionBeanConfig) {
/* 379 */           if (!executeAction((ActionBeanConfig)beanConfig, defaultMessage, parentBreakGroup, rollbackList))
/* 380 */             return false; 
/*     */           continue;
/*     */         } 
/* 383 */         GroupBeanConfig groupBeanConfig = (GroupBeanConfig)beanConfig;
/* 384 */         if (!executeActionGroup(groupBeanConfig, defaultMessage, parentBreakGroup)) {
/* 385 */           return false;
/*     */         }
/*     */       } 
/*     */     } finally {
/*     */       
/* 390 */       this.executingActions = oldExecutingActions;
/*     */     } 
/* 392 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean executeAction(ActionBeanConfig actionBeanConfig, String defaultMessage, boolean parentBreakGroup, List<ActionBeanConfig> rollbackList) throws UserCanceledException {
/* 397 */     Action action = actionBeanConfig.getOrInstantiateAction(false);
/* 398 */     boolean repeat = false;
/*     */     do {
/* 400 */       if (this.context.isCancelling()) {
/* 401 */         throw new UserCanceledException();
/*     */       }
/*     */       
/* 404 */       if (!repeat && ((!actionBeanConfig.isMultiExec() && actionBeanConfig.isExecuted()) || 
/* 405 */         !this.context.runBooleanScript(actionBeanConfig.getConditionClassName(), (Bean)action, new Object[0])))
/* 406 */         continue;  if (!actionBeanConfig.isExecuted() && (!(action instanceof InstallAction) || 
/* 407 */         isRollbackSupported(action))) {
/* 408 */         rollbackList.add(actionBeanConfig);
/*     */       }
/* 410 */       actionBeanConfig.setExecuted(true);
/*     */       try {
/* 412 */         Logger.getImpl().setCurrentAction(actionBeanConfig.getOrInstantiateAction(false));
/* 413 */         if (!this.context.performAction(actionBeanConfig)) {
/* 414 */           repeat = handleFailure(actionBeanConfig, action.getClass(), defaultMessage);
/* 415 */           if (!repeat && parentBreakGroup) {
/* 416 */             return false;
/*     */           }
/*     */         } else {
/* 419 */           repeat = false;
/*     */         } 
/* 421 */       } catch (UndefinedVariableException e) {
/* 422 */         Logger.getInstance().error(action, "undefined variable: " + e.getMessage());
/* 423 */         repeat = handleFailure(actionBeanConfig, action.getClass(), defaultMessage);
/* 424 */         if (!repeat && parentBreakGroup) {
/* 425 */           return false;
/*     */         }
/*     */       } finally {
/* 428 */         checkRollbackBarrier((AbstractBeanConfig)actionBeanConfig, (Bean)action);
/* 429 */         Logger.getImpl().setCurrentAction(null);
/*     */       }
/*     */     
/* 432 */     } while (repeat);
/*     */     
/* 434 */     return true;
/*     */   }
/*     */   
/*     */   private boolean executeActionGroup(GroupBeanConfig groupBeanConfig, String defaultMessage, boolean parentBreakGroup) throws UserCanceledException {
/* 438 */     if (this.context.checkGroupCondition(groupBeanConfig)) {
/* 439 */       boolean forcedRepeat; ActionGroup actionGroup = (ActionGroup)groupBeanConfig.getOrInstantiateGroup(false);
/* 440 */       ContextImpl.GroupState groupState = new ContextImpl.GroupState();
/* 441 */       this.context.initLoopIndex(groupBeanConfig, groupState);
/*     */       
/*     */       do {
/* 444 */         forcedRepeat = false;
/* 445 */         String newDefaultMessage = actionGroup.getDefaultErrorMessage().trim();
/* 446 */         if (newDefaultMessage.length() == 0) {
/* 447 */           newDefaultMessage = defaultMessage;
/*     */         }
/* 449 */         boolean breakGroup = actionGroup.isOnErrorBreakGroup();
/* 450 */         if (executeActions(groupBeanConfig.getBeanConfigs(), newDefaultMessage, breakGroup, this.startedActionsConfigs))
/* 451 */           continue;  if (breakGroup) {
/* 452 */           if (this.context.runBooleanScript(actionGroup.getRetryExpression(), (Bean)actionGroup) || handleFailure(actionGroup.getFailureStrategy(), actionGroup.getErrorMessage(), "Action group")) {
/* 453 */             forcedRepeat = true;
/* 454 */           } else if (parentBreakGroup) {
/* 455 */             return false;
/*     */           } 
/* 457 */         } else if (parentBreakGroup) {
/* 458 */           return false;
/*     */         }
/*     */       
/* 461 */       } while (forcedRepeat || this.context.isGroupLoop(groupBeanConfig, groupState));
/*     */     } 
/* 463 */     return true;
/*     */   }
/*     */   
/*     */   private boolean isRollbackSupported(Action action) {
/*     */     try {
/* 468 */       return ((InstallAction)action).isRollbackSupported();
/* 469 */     } catch (AbstractMethodError e) {
/*     */       
/* 471 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean handleFailure(ActionBeanConfig actionBeanConfig, Class actionClass, String defaultMessage) throws UserCanceledException {
/* 476 */     String errorMessage = actionBeanConfig.getErrorMessage().trim();
/* 477 */     if (errorMessage.length() == 0) {
/* 478 */       errorMessage = defaultMessage.trim();
/*     */     }
/* 480 */     return handleFailure(actionBeanConfig.getFailureStrategy(), errorMessage, actionClass.getName());
/*     */   }
/*     */   
/*     */   private boolean handleFailure(FailureStrategy failureStrategy, String errorMessage, String origin) throws UserCanceledException {
/* 484 */     if (errorMessage == null) {
/* 485 */       errorMessage = "";
/*     */     }
/* 487 */     if (failureStrategy != FailureStrategy.CONTINUE || !errorMessage.isEmpty()) {
/* 488 */       UpdateLog.logIfUpdater(1, "An error occurred in " + origin + ". Message: " + errorMessage + ", strategy: " + failureStrategy);
/*     */     }
/* 490 */     this.context.setErrorOccurred(true);
/*     */     
/* 492 */     boolean strategyQuit = (failureStrategy == FailureStrategy.QUIT);
/* 493 */     boolean strategyReturnToScreen = (failureStrategy == FailureStrategy.RETURN_TO_SCREEN);
/* 494 */     if (strategyReturnToScreen && InstallerUtil.isUnattended()) {
/* 495 */       strategyReturnToScreen = false;
/* 496 */       strategyQuit = true;
/*     */     } 
/* 498 */     if (strategyQuit || strategyReturnToScreen || failureStrategy == FailureStrategy.CONTINUE) {
/* 499 */       if (!errorMessage.isEmpty()) {
/* 500 */         Util.showMessage(getPrefixedMessage(this.context, errorMessage), 
/* 501 */             strategyQuit ? 0 : 2);
/*     */       }
/*     */       
/* 504 */       if (strategyQuit) {
/* 505 */         quitAndKeepLogFile();
/* 506 */       } else if (strategyReturnToScreen) {
/* 507 */         throw new ReturnToScreenException();
/*     */       }
/*     */     
/* 510 */     } else if (this.context.isUnattended() && this.context.getBooleanVariable("sys.actionFailureUnattendedQuit")) {
/* 511 */       Util.showErrorMessage(errorMessage);
/* 512 */       quitAndKeepLogFile();
/*     */     } else {
/* 514 */       if (errorMessage.length() == 0) {
/* 515 */         errorMessage = Messages.format(Messages.getString(".ErrorFunctionFailedNoCode"), new Object[] { origin }) + "\n";
/*     */       }
/* 517 */       errorMessage = getPrefixedMessage(this.context, errorMessage);
/*     */       
/* 519 */       if (failureStrategy == FailureStrategy.ASK_USER) {
/* 520 */         if (Util.showOptionDialog(errorMessage, new String[] {
/* 521 */               Messages.getString(".ButtonIgnore"), Messages.getString(".ButtonQuit") }, 0) == 1)
/*     */         {
/*     */           
/* 524 */           quitAndKeepLogFile();
/*     */         }
/*     */       }
/* 527 */       else if (this.context.getBooleanVariable("sys.actionRetryDisableIgnore")) {
/* 528 */         int result = Util.showOptionDialog(errorMessage, new String[] {
/* 529 */               Messages.getString(".ButtonRetry"), Messages.getString(".ButtonQuit") }, 0);
/*     */ 
/*     */         
/* 532 */         if (result == 1) {
/* 533 */           quitAndKeepLogFile();
/*     */         } else {
/* 535 */           return true;
/*     */         } 
/* 537 */       } else if (this.context.getBooleanVariable("sys.actionRetryDisableQuit")) {
/* 538 */         int result = Util.showOptionDialog(errorMessage, new String[] {
/* 539 */               Messages.getString(".ButtonRetry"), Messages.getString(".ButtonIgnore") }, 0);
/*     */ 
/*     */         
/* 542 */         if (result == 0) {
/* 543 */           return true;
/*     */         }
/*     */       } else {
/* 546 */         int result = Util.showOptionDialog(errorMessage, new String[] {
/* 547 */               Messages.getString(".ButtonIgnore"), Messages.getString(".ButtonRetry"), Messages.getString(".ButtonQuit") }, 0);
/*     */ 
/*     */         
/* 550 */         if (result == 2) {
/* 551 */           quitAndKeepLogFile();
/* 552 */         } else if (result == 1) {
/* 553 */           return true;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 559 */     return false;
/*     */   }
/*     */   
/*     */   private static String getPrefixedMessage(ContextImpl context, String errorMessage) {
/* 563 */     String prefix = (String)context.getVariable("sys.actionErrorMessagePrefix");
/* 564 */     if (prefix != null) {
/* 565 */       return prefix + errorMessage;
/*     */     }
/* 567 */     return errorMessage;
/*     */   }
/*     */ 
/*     */   
/*     */   private void quitAndKeepLogFile() throws UserCanceledException {
/* 572 */     System.setProperty("install4j.keepLog", "true");
/* 573 */     throw new UserCanceledException();
/*     */   }
/*     */   
/*     */   private void checkRollbackBarrier(AbstractBeanConfig beanConfig, Bean source) {
/* 577 */     if (beanConfig.isRollbackBarrier()) {
/* 578 */       this.startedActionsConfigs.clear();
/* 579 */       this.startedActionListActions.clear();
/* 580 */       this.rollbackBarrierExitCode = beanConfig.getRollbackBarrierExitCode();
/* 581 */       FileInstaller.getInstance().setRollbackBarrier();
/* 582 */       Logger.getInstance().info(source, "Rollback barrier reached");
/*     */     } 
/*     */   }
/*     */   
/*     */   private ScreenBeanConfig findScreenConfig(Screen screen) {
/* 587 */     for (ScreenBeanConfig screenConfig : getScreenConfigsFlat()) {
/* 588 */       if (screenConfig.getOrInstantiateScreen(false) == screen) {
/* 589 */         return screenConfig;
/*     */       }
/*     */     } 
/* 592 */     throw new RuntimeException("not in screen sequence; " + screen);
/*     */   }
/*     */   
/*     */   private List<ScreenBeanConfig> getScreenConfigsFlat() {
/* 596 */     return this.context.getScreenConfigsFlat();
/*     */   }
/*     */   
/*     */   public boolean executeActionList(ActionList actionList, Object... extraScriptParameters) throws UserCanceledException {
/* 600 */     if (actionList == null) {
/* 601 */       throw new IllegalArgumentException("action list parameter must not be null");
/*     */     }
/* 603 */     List<AbstractBeanConfig> actionConfigs = AbstractBeanConfig.getActionListBeans(actionList.getId());
/* 604 */     if (actionConfigs == null) {
/* 605 */       throw new IllegalStateException("action list with ID " + actionList.getId() + " was not found");
/*     */     }
/* 607 */     List<ActionBeanConfig> rollbackList = new ArrayList<>();
/* 608 */     this.startedActionListActions.put(actionList, rollbackList);
/* 609 */     Object[] oldExtraScriptParameters = this.context.getExtraScriptParameters();
/* 610 */     this.context.setExtraScriptParameters(extraScriptParameters);
/*     */     try {
/* 612 */       return executeActions(actionConfigs, "", actionList.isBreakOnError(), rollbackList);
/*     */     } finally {
/* 614 */       hideTaskBarProgress();
/* 615 */       this.context.setExtraScriptParameters(oldExtraScriptParameters);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void rollbackActionList(ActionList actionList) {
/* 620 */     if (InstallerConfig.getCurrentApplication().isRollback()) {
/* 621 */       List<ActionBeanConfig> rollbackList = this.startedActionListActions.get(actionList);
/* 622 */       if (rollbackList != null) {
/* 623 */         rollbackActions(rollbackList);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean isExecutingActions() {
/* 629 */     return this.executingActions;
/*     */   }
/*     */   
/*     */   private void hideTaskBarProgress() {
/* 633 */     WinTaskBar.getTaskBar(GUIHelper.getParentWindow()).setProgressState(WinTaskBar.ProgressState.NOPROGRESS);
/*     */   }
/*     */   
/*     */   private static class ReturnToScreenException extends RuntimeException {
/*     */     private ReturnToScreenException() {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\Controller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */