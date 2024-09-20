/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class RootConfig
/*    */   extends AbstractConfig
/*    */ {
/*  8 */   private String id = "";
/*  9 */   private String location = "";
/* 10 */   private String fileset = "";
/*    */   
/*    */   public String getId() {
/* 13 */     return this.id;
/*    */   }
/*    */   
/*    */   public String getLocation() {
/* 17 */     return this.location;
/*    */   }
/*    */   
/*    */   public String getFileset() {
/* 21 */     return this.fileset;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 26 */     this.id = readAttribute(element, "id", this.id);
/* 27 */     this.location = readAttribute(element, "location", this.location);
/* 28 */     this.fileset = readAttribute(element, "fileset", this.fileset);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\RootConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */