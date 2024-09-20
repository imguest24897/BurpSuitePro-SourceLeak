/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.Point;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JScrollPane;
/*    */ import javax.swing.JViewport;
/*    */ import javax.swing.border.Border;
/*    */ 
/*    */ public class ComponentsScrollPane extends JScrollPane {
/*    */   public ComponentsScrollPane(JPanel componentsPanel) {
/* 10 */     setViewport(new JViewport()
/*    */         {
/*    */           public void setViewPosition(Point p)
/*    */           {
/* 14 */             p.y = Math.max(0, p.y);
/* 15 */             super.setViewPosition(p);
/*    */           }
/*    */         });
/*    */     
/* 19 */     setViewportView(componentsPanel);
/*    */     
/* 21 */     setHorizontalScrollBarPolicy(31);
/* 22 */     getViewport().setOpaque(false);
/* 23 */     setOpaque(false);
/*    */     
/* 25 */     setViewportBorder((Border)null);
/* 26 */     super.setBorder(null);
/*    */   }
/*    */   
/*    */   public void setBorder(Border border) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\ComponentsScrollPane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */