/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Insets;
/*    */ import javax.swing.border.LineBorder;
/*    */ 
/*    */ 
/*    */ public class PartialLineBorder
/*    */   extends LineBorder
/*    */ {
/*    */   public static final int NORTH = 1;
/*    */   public static final int SOUTH = 2;
/*    */   public static final int EAST = 4;
/*    */   public static final int WEST = 8;
/*    */   
/*    */   public PartialLineBorder(Color color, int thickness, int sides) {
/* 19 */     super(color, thickness);
/* 20 */     this.sides = sides;
/*    */   }
/*    */   public static final int HORIZONTAL = 3; public static final int VERTICAL = 12; public static final int ALL = 15; private int sides;
/*    */   
/*    */   public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
/* 25 */     Color oldColor = g.getColor();
/*    */ 
/*    */     
/* 28 */     g.setColor(this.lineColor);
/* 29 */     for (int i = 0; i < this.thickness; i++) {
/* 30 */       if (this.sides == 15) {
/* 31 */         g.drawRect(x + i, y + i, width - i - i - 1, height - i - i - 1);
/*    */       } else {
/* 33 */         if ((this.sides & 0x1) != 0) {
/* 34 */           g.drawLine(x, y + i, x + width - 1, y + i);
/*    */         }
/* 36 */         if ((this.sides & 0x2) != 0) {
/* 37 */           g.drawLine(x, y + height - i - 1, x + width - 1, y + height - i - 1);
/*    */         }
/* 39 */         if ((this.sides & 0x8) != 0) {
/* 40 */           g.drawLine(x + i, y, x + i, y + height - 1);
/*    */         }
/* 42 */         if ((this.sides & 0x4) != 0) {
/* 43 */           g.drawLine(x + width - i - 1, y, x + width - i - 1, y + height - 1);
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 48 */     g.setColor(oldColor);
/*    */   }
/*    */ 
/*    */   
/*    */   public Insets getBorderInsets(Component c) {
/* 53 */     Insets borderInsets = super.getBorderInsets(c);
/* 54 */     if ((this.sides & 0x1) == 0) {
/* 55 */       borderInsets.top = 0;
/*    */     }
/* 57 */     if ((this.sides & 0x2) == 0) {
/* 58 */       borderInsets.bottom = 0;
/*    */     }
/* 60 */     if ((this.sides & 0x8) == 0) {
/* 61 */       borderInsets.left = 0;
/*    */     }
/* 63 */     if ((this.sides & 0x4) == 0) {
/* 64 */       borderInsets.right = 0;
/*    */     }
/* 66 */     return borderInsets;
/*    */   }
/*    */ 
/*    */   
/*    */   public Insets getBorderInsets(Component c, Insets insets) {
/* 71 */     Insets borderInsets = super.getBorderInsets(c, insets);
/* 72 */     if ((this.sides & 0x1) == 0) {
/* 73 */       borderInsets.top = 0;
/*    */     }
/* 75 */     if ((this.sides & 0x2) == 0) {
/* 76 */       borderInsets.bottom = 0;
/*    */     }
/* 78 */     if ((this.sides & 0x8) == 0) {
/* 79 */       borderInsets.left = 0;
/*    */     }
/* 81 */     if ((this.sides & 0x4) == 0) {
/* 82 */       borderInsets.right = 0;
/*    */     }
/* 84 */     return borderInsets;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\PartialLineBorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */