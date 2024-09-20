/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class WindowsSpecificConfig
/*    */   extends AbstractConfig
/*    */ {
/*  8 */   private MsiScope msiScope = MsiScope.PER_MACHINE;
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 12 */     this.msiScope = readAttribute(element, "msiScope", this.msiScope);
/*    */   }
/*    */   
/*    */   public MsiScope getMsiScope() {
/* 16 */     return this.msiScope;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\WindowsSpecificConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */