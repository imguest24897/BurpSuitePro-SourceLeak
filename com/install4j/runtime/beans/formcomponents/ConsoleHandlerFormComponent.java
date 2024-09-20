/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.screens.Console;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class ConsoleHandlerFormComponent
/*    */   extends SystemFormComponent {
/*    */   private ScriptProperty consoleScript;
/*    */   
/*    */   public ScriptProperty getConsoleScript() {
/* 16 */     return (ScriptProperty)replaceWithTextOverride("consoleScript", this.consoleScript, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setConsoleScript(ScriptProperty consoleScript) {
/* 20 */     this.consoleScript = consoleScript;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createCenterComponent() {
/* 25 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isFillCenterHorizontal() {
/* 30 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/*    */     try {
/* 36 */       return ((Boolean)getContext().runScript(getConsoleScript(), (Bean)this, new Object[] { getFormEnvironment(), console })).booleanValue();
/* 37 */     } catch (UserCanceledException e) {
/* 38 */       throw e;
/* 39 */     } catch (Exception e) {
/* 40 */       Util.printAnnotatedStackTrace(e);
/* 41 */       Logger.getInstance().log(e);
/* 42 */       return true;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ConsoleHandlerFormComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */