/*    */ package com.install4j.runtime.beans.applications;
/*    */ 
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ 
/*    */ public enum ExecutionMode
/*    */   implements XMLEnum<ExecutionMode> {
/* 10 */   GUI("GUI mode", "gui", new String[0]),
/* 11 */   CONSOLE("Console mode", "console", new String[] { "-c" }),
/* 12 */   UNATTENDED("Unattended mode", "unattended", new String[] { "-q" }),
/* 13 */   UNATTENDED_WITH_PROGRESS("Unattended mode with progress dialog", "unattendedProgress", new String[] { "-q", "-alerts", "-splash" });
/*    */   
/*    */   private final String verbose;
/*    */   private final String xmlValue;
/*    */   private final String[] arguments;
/*    */   
/*    */   ExecutionMode(String verbose, String xmlValue, String... arguments) {
/* 20 */     this.verbose = verbose;
/* 21 */     this.xmlValue = xmlValue;
/* 22 */     this.arguments = arguments;
/*    */   }
/*    */   
/*    */   public List<String> getArguments(String unattendedUpdateTitle) {
/* 26 */     List<String> ret = new ArrayList<>(Arrays.asList(this.arguments));
/* 27 */     if (this == UNATTENDED_WITH_PROGRESS) {
/* 28 */       ret.add((unattendedUpdateTitle == null) ? "" : unattendedUpdateTitle);
/* 29 */       if (Boolean.getBoolean("install4j.noAlerts")) {
/* 30 */         ret.remove("-alerts");
/*    */       }
/*    */     } 
/* 33 */     return ret;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 38 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public ExecutionMode[] getXMLEnums() {
/* 43 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 48 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\applications\ExecutionMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */