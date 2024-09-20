/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.beans.ActionList;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.runtime.beans.ConfigurableActionType;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ 
/*    */ public abstract class ActionComponent extends LeadingLabelComponent {
/* 11 */   private ConfigurableActionType configurableActionType = ConfigurableActionType.SCRIPT;
/*    */   private ScriptProperty actionScript;
/*    */   private ActionList actionList;
/*    */   
/*    */   public ConfigurableActionType getConfigurableActionType() {
/* 16 */     return (ConfigurableActionType)replaceWithTextOverride("configurableActionType", this.configurableActionType, ConfigurableActionType.class);
/*    */   }
/*    */   
/*    */   public void setConfigurableActionType(ConfigurableActionType configurableActionType) {
/* 20 */     this.configurableActionType = configurableActionType;
/*    */   }
/*    */   
/*    */   public ScriptProperty getActionScript() {
/* 24 */     return (ScriptProperty)replaceWithTextOverride("actionScript", this.actionScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setActionScript(ScriptProperty actionScript) {
/* 28 */     this.actionScript = actionScript;
/*    */   }
/*    */   
/*    */   public ActionList getActionList() {
/* 32 */     return (ActionList)replaceWithTextOverride("actionList", this.actionList, ActionList.class);
/*    */   }
/*    */   
/*    */   public void setActionList(ActionList actionList) {
/* 36 */     this.actionList = actionList;
/*    */   }
/*    */   
/*    */   protected void executeAction() {
/* 40 */     switch (getConfigurableActionType()) {
/*    */       case SCRIPT:
/* 42 */         executeActionScript();
/*    */         break;
/*    */       case ACTION_LIST:
/* 45 */         executeActionListAsync(getActionList(), new Object[] { getFormEnvironment() });
/*    */         break;
/*    */     } 
/*    */   }
/*    */   
/*    */   private void executeActionScript() {
/* 51 */     if (getActionScript() != null)
/*    */       try {
/* 53 */         getContext().runScript(getActionScript(), (Bean)this, new Object[] { getFormEnvironment() });
/* 54 */       } catch (Exception e1) {
/* 55 */         Util.printAnnotatedStackTrace(e1);
/* 56 */         Logger.getInstance().log(e1);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ActionComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */