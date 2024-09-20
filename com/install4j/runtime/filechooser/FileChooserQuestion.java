/*    */ package com.install4j.runtime.filechooser;
/*    */ 
/*    */ import org.jetbrains.annotations.Nls;
/*    */ 
/*    */ public class FileChooserQuestion
/*    */ {
/*    */   private String description;
/*    */   private boolean selected;
/*    */   
/*    */   public FileChooserQuestion(@Nls String description, boolean selected) {
/* 11 */     this.description = description;
/* 12 */     this.selected = selected;
/*    */   }
/*    */   
/*    */   @Nls
/*    */   public String getDescription() {
/* 17 */     return this.description;
/*    */   }
/*    */   
/*    */   public boolean isSelected() {
/* 21 */     return this.selected;
/*    */   }
/*    */   
/*    */   public void setSelected(boolean selected) {
/* 25 */     this.selected = selected;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\FileChooserQuestion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */