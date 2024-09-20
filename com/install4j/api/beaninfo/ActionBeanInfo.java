/*     */ package com.install4j.api.beaninfo;
/*     */ 
/*     */ import com.install4j.api.actions.Action;
/*     */ import java.beans.BeanDescriptor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ActionBeanInfo
/*     */   extends Install4JBeanInfo
/*     */ {
/*     */   public static final String ATTRIBUTE_ASSOCIATED_CONFIRMATION = "associatedConfirmation";
/*     */   public static final String ATTRIBUTE_ASSOCIATED_CONFIRMATION_INIT_SCRIPT = "associatedConfirmationInitScript";
/*     */   public static final String ATTRIBUTE_ASSOCIATED_CONFIRMATION_VISIBILITY_SCRIPT = "associatedConfirmationVisibilityScript";
/*     */   public static final String ATTRIBUTE_ASSOCIATED_SCREEN = "associatedScreen";
/*     */   public static final String ATTRIBUTE_INSTALLER_TARGET_SCREEN = "preferredTargetInstallerScreen";
/*     */   public static final String ATTRIBUTE_UNINSTALLER_TARGET_SCREEN = "preferredTargetUninstallerScreen";
/*     */   public static final String ATTRIBUTE_DEFAULT_MULTI_EXEC = "defaultMultiExec";
/*     */   public static final String ATTRIBUTE_COMPLEMENTARY_STARTUP_LINK = "complementaryStartupLink";
/*     */   public static final String ATTRIBUTE_UNINSTALLER_STARTUP_ACTION = "complementaryStartupAction";
/*     */   public static final String ATTRIBUTE_ASSOCIATED_STARTUP_ACTION = "associatedStartupAction";
/*     */   public static final String ATTRIBUTE_DEFAULT_FAILURE_STRATEGY = "defaultFailureStrategy";
/*     */   public static final String ATTRIBUTE_DEFAULT_ERROR_MESSAGE = "defaultErrorMessage";
/*     */   public static final String ATTRIBUTE_FULL_PRIVILEGES_REQUIRED = "fullPrivilegesRequired";
/*     */   public static final String ATTRIBUTE_WINDOWS_ONLY = "windowsOnly";
/*     */   public static final String ATTRIBUTE_DEFAULT_ACTION_ELEVATION_TYPE = "defaultActionElevationType";
/*     */   public static final String ATTRIBUTE_RESTRICT_ACTION_ELEVATION_TYPE = "restrictActionElevationType";
/*     */   public static final String STARTUP_SEQUENCE = "#startup";
/*     */   public static final String ATTRIBUTE_ACTION_LIST_INITIALIZER = "actionListInitializer";
/*     */   public static final String ATTRIBUTE_ACTION_VALIDATOR = "actionValidator";
/*     */   
/*     */   protected ActionBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, boolean installedFilesRequired, Integer sortKey, Class<? extends Action> beanClass, Class<?> customizerClass) {
/* 116 */     super(displayName, shortDescription, category, multipleInstancesSupported, installedFilesRequired, sortKey, (Class)beanClass, customizerClass);
/* 117 */     init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ActionBeanInfo(String displayName, String shortDescription, String category, boolean multipleInstancesSupported, boolean installedFilesRequired, Integer sortKey, Class<? extends Action> beanClass) {
/* 124 */     super(displayName, shortDescription, category, multipleInstancesSupported, installedFilesRequired, sortKey, (Class)beanClass);
/* 125 */     init();
/*     */   }
/*     */   
/*     */   private void init() {
/* 129 */     if (this instanceof ActionListInitializer) {
/* 130 */       setActionListInitializer((ActionListInitializer)this);
/*     */     }
/* 132 */     if (this instanceof ActionValidator) {
/* 133 */       setActionValidator((ActionValidator)this);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setAssociatedConfirmation(String confirmationDescription, String initScript) {
/* 144 */     setAssociatedConfirmation(confirmationDescription, initScript, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAssociatedConfirmation(String confirmationDescription, String initScript, String visibilityScript) {
/* 161 */     if (confirmationDescription != null) {
/* 162 */       getBeanDescriptor().setValue("associatedConfirmation", confirmationDescription);
/*     */     }
/* 164 */     if (initScript != null) {
/* 165 */       getBeanDescriptor().setValue("associatedConfirmationInitScript", initScript);
/*     */     }
/* 167 */     if (visibilityScript != null) {
/* 168 */       getBeanDescriptor().setValue("associatedConfirmationVisibilityScript", visibilityScript);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAssociatedScreen(String className) {
/* 180 */     if (className != null) {
/* 181 */       getBeanDescriptor().setValue("associatedScreen", className);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInstallerTargetScreen(String className) {
/* 193 */     if (className != null) {
/* 194 */       getBeanDescriptor().setValue("preferredTargetInstallerScreen", className);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUninstallerTargetScreen(String className) {
/* 206 */     if (className != null) {
/* 207 */       getBeanDescriptor().setValue("preferredTargetUninstallerScreen", className);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultMultiExec(boolean multiExec) {
/* 217 */     getBeanDescriptor().setValue("defaultMultiExec", Boolean.valueOf(multiExec));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComplementaryStartupLink(boolean complementaryStartupLink) {
/* 229 */     getBeanDescriptor().setValue("complementaryStartupLink", Boolean.valueOf(complementaryStartupLink));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAssociatedStartupAction(String className) {
/* 240 */     if (className != null) {
/* 241 */       getBeanDescriptor().setValue("associatedStartupAction", className);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUninstallerStartupAction(String className) {
/* 254 */     if (className != null) {
/* 255 */       getBeanDescriptor().setValue("complementaryStartupAction", className);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultFailureStrategy(FailureStrategy failureStrategy) {
/* 265 */     if (failureStrategy != null) {
/* 266 */       getBeanDescriptor().setValue("defaultFailureStrategy", failureStrategy);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultErrorMessage(String errorMessage) {
/* 276 */     if (errorMessage != null) {
/* 277 */       getBeanDescriptor().setValue("defaultErrorMessage", errorMessage);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFullPrivilegesRequired(boolean fullPrivilegesRequired) {
/* 292 */     BeanDescriptor beanDescriptor = getBeanDescriptor();
/* 293 */     beanDescriptor.setValue("fullPrivilegesRequired", Boolean.valueOf(fullPrivilegesRequired));
/* 294 */     beanDescriptor.setValue("restrictActionElevationType", Boolean.TRUE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultActionElevationType(ActionElevationType actionElevationType) {
/* 303 */     getBeanDescriptor().setValue("defaultActionElevationType", actionElevationType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDefaultActionElevationType(ActionElevationType actionElevationType, boolean restrict) {
/* 315 */     BeanDescriptor beanDescriptor = getBeanDescriptor();
/* 316 */     beanDescriptor.setValue("defaultActionElevationType", actionElevationType);
/* 317 */     beanDescriptor.setValue("restrictActionElevationType", Boolean.valueOf(restrict));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWindowsOnly(boolean windowsOnly) {
/* 326 */     BeanDescriptor beanDescriptor = getBeanDescriptor();
/* 327 */     beanDescriptor.setValue("windowsOnly", Boolean.valueOf(windowsOnly));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActionListInitializer(ActionListInitializer actionListInitializer) {
/* 337 */     if (actionListInitializer != null) {
/* 338 */       getBeanDescriptor().setValue("actionListInitializer", actionListInitializer);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActionValidator(ActionValidator actionValidator) {
/* 349 */     if (actionValidator != null)
/* 350 */       getBeanDescriptor().setValue("actionValidator", actionValidator); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ActionBeanInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */