/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ public class ComponentFolderConfig
/*    */   extends ComponentNodeConfig
/*    */ {
/* 12 */   private List<ComponentNodeConfig> components = new ArrayList<>();
/*    */   
/*    */   private boolean expanded = true;
/*    */   private boolean blockStateChanges;
/*    */   
/*    */   public ComponentFolderConfig(ComponentNodeConfig parent) {
/* 18 */     super(parent);
/*    */   }
/*    */   
/*    */   public boolean isExpanded() {
/* 22 */     return this.expanded;
/*    */   }
/*    */   
/*    */   public List<ComponentNodeConfig> getComponents() {
/* 26 */     return this.components;
/*    */   }
/*    */   
/*    */   public void setBlockStateChanges(boolean blockStateChanges) {
/* 30 */     this.blockStateChanges = blockStateChanges;
/*    */   }
/*    */   
/*    */   public boolean isBlockStateChanges() {
/* 34 */     return this.blockStateChanges;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 39 */     super.read(element);
/*    */     
/* 41 */     this.expanded = readAttribute(element, "expanded", this.expanded);
/*    */     
/* 43 */     for (Element childElement : childElements(element)) {
/* 44 */       ComponentNodeConfig componentConfig; String elementName = childElement.getTagName();
/*    */       
/* 46 */       if (Objects.equals(elementName, "component")) {
/* 47 */         componentConfig = new ComponentConfig(this);
/* 48 */       } else if (Objects.equals(elementName, "componentFolder")) {
/* 49 */         componentConfig = new ComponentFolderConfig(this);
/*    */       } else {
/*    */         continue;
/*    */       } 
/* 53 */       componentConfig.read(childElement);
/* 54 */       this.components.add(componentConfig);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ComponentFolderConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */