/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LocalizedExternalFile
/*    */   implements Serializable
/*    */ {
/* 26 */   private Map<String, ExternalFile> languageIdToExternalFile = new LinkedHashMap<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<String, ExternalFile> getLanguageIdToExternalFile() {
/* 35 */     return this.languageIdToExternalFile;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLanguageIdToExternalFile(Map<String, ExternalFile> languageIdToExternalFile) {
/* 44 */     this.languageIdToExternalFile = languageIdToExternalFile;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 49 */     if (this == o) return true; 
/* 50 */     if (o == null || getClass() != o.getClass()) return false; 
/* 51 */     LocalizedExternalFile that = (LocalizedExternalFile)o;
/* 52 */     return Objects.equals(this.languageIdToExternalFile, that.languageIdToExternalFile);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 57 */     return Objects.hash(new Object[] { this.languageIdToExternalFile });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\LocalizedExternalFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */