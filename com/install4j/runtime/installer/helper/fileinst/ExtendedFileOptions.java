/*    */ package com.install4j.runtime.installer.helper.fileinst;
/*    */ 
/*    */ import com.install4j.api.context.FileOptions;
/*    */ import com.install4j.api.context.OverwriteMode;
/*    */ import com.install4j.runtime.installer.config.RemoveSignatureType;
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ import java.util.TreeMap;
/*    */ 
/*    */ public class ExtendedFileOptions
/*    */   extends FileOptions {
/*    */   private TreeMap<String, String> extendedAttributes;
/* 13 */   private RemoveSignatureType removeSignatureType = RemoveSignatureType.KEEP;
/*    */   
/*    */   public ExtendedFileOptions(String mode, OverwriteMode overwriteMode, boolean shared) {
/* 16 */     super(mode, overwriteMode, shared);
/*    */   }
/*    */   
/*    */   public Map<String, String> getExtendedAttributes() {
/* 20 */     return (this.extendedAttributes == null) ? Collections.<String, String>emptyMap() : this.extendedAttributes;
/*    */   }
/*    */   
/*    */   public void addExtendedAttribute(String name, String value) {
/* 24 */     if (this.extendedAttributes == null) this.extendedAttributes = new TreeMap<>(); 
/* 25 */     this.extendedAttributes.put(name, value);
/*    */   }
/*    */   
/*    */   public RemoveSignatureType getRemoveSignatureType() {
/* 29 */     return this.removeSignatureType;
/*    */   }
/*    */   
/*    */   public void setRemoveSignatureType(RemoveSignatureType removeSignatureType) {
/* 33 */     this.removeSignatureType = removeSignatureType;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\ExtendedFileOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */