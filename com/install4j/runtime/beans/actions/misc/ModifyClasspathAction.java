/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ public class ModifyClasspathAction
/*    */   extends AbstractModifyVmOptionsAction
/*    */ {
/*    */   private String[] entries;
/* 10 */   private ModifyStringType type = ModifyStringType.APPEND;
/*    */   
/*    */   public String[] getEntries() {
/* 13 */     return (String[])replaceWithTextOverride("entries", replaceVariables(this.entries), String[].class);
/*    */   }
/*    */   
/*    */   public void setEntries(String[] entries) {
/* 17 */     this.entries = entries;
/*    */   }
/*    */   
/*    */   public ModifyStringType getType() {
/* 21 */     return (ModifyStringType)replaceWithTextOverride("type", this.type, ModifyStringType.class);
/*    */   }
/*    */   
/*    */   public void setType(ModifyStringType type) {
/* 25 */     this.type = type;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String[] getAddVmOptions() {
/* 30 */     String[] entries = getEntries();
/* 31 */     StringBuilder builder = new StringBuilder();
/* 32 */     for (String entry : entries) {
/* 33 */       if (builder.length() > 0) {
/* 34 */         builder.append(File.pathSeparator);
/*    */       }
/* 36 */       builder.append(entry);
/*    */     } 
/* 38 */     String value = builder.toString();
/*    */     
/* 40 */     String[] ret = new String[1];
/* 41 */     ModifyStringType type = getType();
/* 42 */     if (type == ModifyStringType.SET) {
/* 43 */       ret[0] = "-classpath " + value;
/* 44 */     } else if (type == ModifyStringType.APPEND) {
/* 45 */       ret[0] = "-classpath/a " + value;
/* 46 */     } else if (type == ModifyStringType.PREPEND) {
/* 47 */       ret[0] = "-classpath/p " + value;
/*    */     } else {
/* 49 */       throw new IllegalStateException(type.name());
/*    */     } 
/* 51 */     return ret;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\ModifyClasspathAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */