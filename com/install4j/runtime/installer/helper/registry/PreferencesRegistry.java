/*    */ package com.install4j.runtime.installer.helper.registry;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*    */ import java.util.prefs.Preferences;
/*    */ 
/*    */ public class PreferencesRegistry
/*    */   implements RegistryInterface
/*    */ {
/*    */   private static final String PATH_NAME = "/com/install4j/installations";
/*    */   
/*    */   public void setValue(String name, String value) {
/* 17 */     setValueInt(name, value);
/*    */   }
/*    */   
/*    */   private static void setValueInt(final String name, final String value) {
/* 21 */     if (!PreferencesUtil.isDisableSystemRoot()) {
/* 22 */       Preferences node = Preferences.systemRoot().node("/com/install4j/installations");
/*    */       try {
/* 24 */         node.put(name, value);
/* 25 */         node.flush();
/* 26 */       } catch (Throwable throwable) {}
/*    */     } 
/*    */ 
/*    */     
/* 30 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) throws Exception {
/* 33 */             Preferences node = Preferences.userRoot().node("/com/install4j/installations");
/*    */             try {
/* 35 */               node.put(name, value);
/* 36 */               node.flush();
/* 37 */             } catch (Throwable throwable) {}
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getValue(String name) {
/* 45 */     Preferences node = Preferences.userRoot().node("/com/install4j/installations");
/* 46 */     String ret = node.get(name, null);
/* 47 */     if (ret != null) {
/* 48 */       return ret;
/*    */     }
/* 50 */     if (!PreferencesUtil.isDisableSystemRoot()) {
/* 51 */       node = Preferences.systemRoot().node("/com/install4j/installations");
/* 52 */       return node.get(name, null);
/*    */     } 
/* 54 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getOtherBitnessValue(String valueName) {
/* 60 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void deleteValue(String name) {
/* 65 */     deleteValueInt(name);
/*    */   }
/*    */   
/*    */   private static void deleteValueInt(final String name) {
/* 69 */     if (!PreferencesUtil.isDisableSystemRoot()) {
/* 70 */       Preferences node = Preferences.systemRoot().node("/com/install4j/installations");
/* 71 */       node.remove(name);
/*    */       try {
/* 73 */         node.flush();
/* 74 */       } catch (Throwable throwable) {}
/*    */     } 
/*    */     
/* 77 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) throws Exception {
/* 80 */             Preferences node = Preferences.userRoot().node("/com/install4j/installations");
/* 81 */             node.remove(name);
/*    */             try {
/* 83 */               node.flush();
/* 84 */             } catch (Throwable throwable) {}
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\registry\PreferencesRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */