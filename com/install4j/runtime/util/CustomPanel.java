/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import javax.accessibility.AccessibleContext;
/*    */ import javax.accessibility.AccessibleRole;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ public class CustomPanel
/*    */   extends JPanel {
/*    */   public AccessibleContext getAccessibleContext() {
/* 11 */     if (this.accessibleContext == null) {
/* 12 */       this.accessibleContext = new AccessibleCustomPanel();
/*    */     }
/* 14 */     return this.accessibleContext;
/*    */   }
/*    */ 
/*    */   
/*    */   protected class AccessibleCustomPanel
/*    */     extends Component.AccessibleAWTComponent
/*    */   {
/*    */     public AccessibleRole getAccessibleRole() {
/* 22 */       return AccessibleRole.PANEL;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\CustomPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */