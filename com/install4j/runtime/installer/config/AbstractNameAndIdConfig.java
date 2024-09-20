/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ public abstract class AbstractNameAndIdConfig
/*    */   extends AbstractConfig
/*    */ {
/* 10 */   private String id = "";
/* 11 */   private String customizedId = "";
/* 12 */   private String name = "";
/*    */   
/*    */   public String getId() {
/* 15 */     return this.id;
/*    */   }
/*    */   
/*    */   public String getCustomizedId() {
/* 19 */     return this.customizedId;
/*    */   }
/*    */   
/*    */   public String getDisplayedId() {
/* 23 */     return (this.customizedId.length() == 0) ? this.id : this.customizedId;
/*    */   }
/*    */   
/*    */   public String getName() {
/* 27 */     return InstallerVariables.replaceVariables(this.name);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 32 */     this.id = readAttribute(element, "id", this.id);
/* 33 */     this.customizedId = readAttribute(element, "customizedId", this.id);
/* 34 */     this.name = readAttribute(element, "name", this.name);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setId(String id) {
/* 40 */     this.id = id;
/*    */   }
/*    */   
/*    */   public void setCustomizedId(String customizedId) {
/* 44 */     this.customizedId = customizedId;
/*    */   }
/*    */   
/*    */   public void setName(String name) {
/* 48 */     this.name = name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\AbstractNameAndIdConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */