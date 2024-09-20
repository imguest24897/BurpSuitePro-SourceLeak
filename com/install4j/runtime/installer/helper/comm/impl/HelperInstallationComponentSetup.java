/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallationComponentSetup;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class HelperInstallationComponentSetup
/*    */   implements InstallationComponentSetup, Serializable {
/*    */   private final String id;
/*    */   private final String name;
/*    */   private final boolean downloaded;
/*    */   
/*    */   public HelperInstallationComponentSetup(InstallationComponentSetup copy) {
/* 19 */     this.id = copy.getId();
/* 20 */     this.name = copy.getName();
/* 21 */     this.downloaded = copy.isDownloaded();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isSelected() {
/* 26 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) {
/* 29 */             return context.getInstallationComponentById(HelperInstallationComponentSetup.this.id).isSelected();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSelected(final boolean selected) {
/* 36 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) throws Exception {
/* 39 */             context.getInstallationComponentById(HelperInstallationComponentSetup.this.id).setSelected(selected);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isChangeable() {
/* 46 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) {
/* 49 */             return context.getInstallationComponentById(HelperInstallationComponentSetup.this.id).isChangeable();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void setChangeable(final boolean changeable) {
/* 56 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) throws Exception {
/* 59 */             context.getInstallationComponentById(HelperInstallationComponentSetup.this.id).setChangeable(changeable);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isHidden() {
/* 66 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) {
/* 69 */             return context.getInstallationComponentById(HelperInstallationComponentSetup.this.id).isHidden();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void setHidden(final boolean hidden) {
/* 76 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) throws Exception {
/* 79 */             context.getInstallationComponentById(HelperInstallationComponentSetup.this.id).setHidden(hidden);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getName() {
/* 86 */     return this.name;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getId() {
/* 91 */     return this.id;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isDownloaded() {
/* 96 */     return this.downloaded;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\HelperInstallationComponentSetup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */