/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class LanguageConfig
/*    */   extends AbstractConfig
/*    */   implements Comparable {
/*  9 */   private String id = "";
/* 10 */   private String messageFile = "";
/* 11 */   private String customLocalizationFile = "";
/* 12 */   private String name = "";
/*    */ 
/*    */   
/*    */   public LanguageConfig() {}
/*    */   
/*    */   public LanguageConfig(String id, String messageFile, String customLocalizationFile, String name) {
/* 18 */     this.id = id;
/* 19 */     this.messageFile = messageFile;
/* 20 */     this.customLocalizationFile = customLocalizationFile;
/* 21 */     this.name = name;
/*    */   }
/*    */   
/*    */   public String getId() {
/* 25 */     return this.id;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 29 */     return this.name;
/*    */   }
/*    */   
/*    */   public String getMessageFile() {
/* 33 */     return this.messageFile;
/*    */   }
/*    */   
/*    */   public String getCustomLocalizationFile() {
/* 37 */     return this.customLocalizationFile;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 43 */     this.id = readAttribute(element, "id", this.id);
/* 44 */     this.name = readAttribute(element, "name", this.name);
/* 45 */     this.messageFile = readAttribute(element, "messageFile", this.messageFile);
/* 46 */     this.customLocalizationFile = readAttribute(element, "customLocalizationFile", this.customLocalizationFile);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 51 */     return this.name;
/*    */   }
/*    */ 
/*    */   
/*    */   public int compareTo(@NotNull Object o) {
/* 56 */     return this.name.compareTo(((LanguageConfig)o).name);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\LanguageConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */