/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.api.context.FileOptions;
/*    */ import com.install4j.api.context.OverwriteMode;
/*    */ import com.install4j.api.context.UninstallMode;
/*    */ import com.install4j.runtime.installer.helper.fileinst.ExtendedFileOptions;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FileOptionsConfig
/*    */   extends AbstractConfig
/*    */ {
/* 18 */   private Map<String, ExtendedFileOptions> fileNameToFileOptions = new HashMap<>();
/*    */   
/* 20 */   private List<String> launchers = new ArrayList<>();
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 24 */     for (Element childElement : childElements(element)) {
/* 25 */       String fileName = readAttribute(childElement, "name", "").replace('\\', '/');
/* 26 */       String mode = AbstractConfig.readAttribute(childElement, "mode", "644");
/* 27 */       int overwrite = readAttribute(childElement, "overwrite", 4);
/* 28 */       boolean shared = readAttribute(childElement, "shared", false);
/* 29 */       ExtendedFileOptions fileOptions = new ExtendedFileOptions(mode, OverwriteMode.getFromIntValue(overwrite), shared);
/*    */       
/* 31 */       UninstallMode uninstallMode = UninstallMode.getFromIntValue(
/* 32 */           readAttribute(childElement, "uninstallMode", 0));
/*    */       
/* 34 */       fileOptions.setUninstallMode(uninstallMode);
/*    */       
/* 36 */       for (Element attributeElement : childElements(childElement)) {
/* 37 */         fileOptions.addExtendedAttribute(readAttribute(attributeElement, "name", ""), readAttribute(attributeElement, "value", ""));
/*    */       }
/* 39 */       fileOptions.setRemoveSignatureType(readAttribute(childElement, "removeSignature", RemoveSignatureType.KEEP));
/*    */       
/* 41 */       this.fileNameToFileOptions.put(fileName, fileOptions);
/* 42 */       if (readAttribute(childElement, "isLauncher", false)) {
/* 43 */         this.launchers.add(fileName);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public List<String> getLaunchers() {
/* 49 */     return this.launchers;
/*    */   }
/*    */   
/*    */   public FileOptions getOptions(String fileName) {
/* 53 */     fileName = fileName.replace('\\', '/');
/* 54 */     while (fileName.endsWith("/")) {
/* 55 */       fileName = fileName.substring(0, fileName.length() - 1);
/*    */     }
/* 57 */     return (FileOptions)this.fileNameToFileOptions.get(fileName);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\FileOptionsConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */