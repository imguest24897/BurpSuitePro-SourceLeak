/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ import com.install4j.runtime.util.IconHelper;
/*    */ import java.io.File;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExternalFile
/*    */   extends File
/*    */ {
/*    */   public ExternalFile(String pathname) {
/* 31 */     super(pathname);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 37 */     return super.equals(obj);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean exists() {
/* 42 */     String path = getPath();
/* 43 */     if (path.startsWith("icon:")) {
/* 44 */       return (IconHelper.getIconUrl(path) != null);
/*    */     }
/* 46 */     return super.exists();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\ExternalFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */