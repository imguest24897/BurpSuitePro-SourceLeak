/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.Dimension;
/*    */ import java.util.LinkedList;
/*    */ import java.util.List;
/*    */ import javax.swing.Box;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ButtonUtil
/*    */ {
/*    */   public static final int NO_PADDING = 0;
/*    */   public static final int LEFT_PADDING = 1;
/*    */   public static final int RIGHT_PADDING = 2;
/*    */   public static final int CENTER_PADDING = 3;
/*    */   public static final String CLIENT_PROPERTY_EQUALIZE = "buttonEqualize";
/* 19 */   private static final Dimension BUTTONS_HORIZONTAL_GAP = new Dimension(5, 0);
/* 20 */   private static final Dimension BUTTONS_VERTICAL_GAP = new Dimension(0, 0);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Box createHorizontalButtonBox(Component[] components, int paddingMode) {
/* 26 */     Box buttonBox = new Box(2);
/* 27 */     fillButtonBox(buttonBox, 
/* 28 */         equalizeButtonsForHorizontalBox(components), 
/* 29 */         Box.createHorizontalGlue(), paddingMode);
/*    */ 
/*    */     
/* 32 */     return buttonBox;
/*    */   }
/*    */   
/*    */   public static Box createVerticalButtonBox(Component[] components, int paddingMode) {
/* 36 */     Box buttonBox = new Box(3);
/* 37 */     fillButtonBox(buttonBox, 
/* 38 */         equalizeButtonsForVerticalBox(components), 
/* 39 */         Box.createVerticalGlue(), paddingMode);
/*    */ 
/*    */     
/* 42 */     return buttonBox;
/*    */   }
/*    */   
/*    */   private static void fillButtonBox(Box buttonBox, Component[] components, Component glue, int paddingMode) {
/* 46 */     if ((paddingMode & 0x1) != 0) {
/* 47 */       buttonBox.add(glue);
/*    */     }
/* 49 */     for (Component component : components) {
/* 50 */       buttonBox.add(component);
/*    */     }
/* 52 */     if ((paddingMode & 0x2) != 0) {
/* 53 */       buttonBox.add(glue);
/*    */     }
/*    */   }
/*    */   
/*    */   public static Component[] equalizeButtonsForVerticalBox(Component[] components) {
/* 58 */     return equalizeButtonsForBox(components, BUTTONS_VERTICAL_GAP);
/*    */   }
/*    */   
/*    */   public static Component[] equalizeButtonsForHorizontalBox(Component[] components) {
/* 62 */     return equalizeButtonsForBox(components, BUTTONS_HORIZONTAL_GAP);
/*    */   }
/*    */   
/*    */   private static Component[] equalizeButtonsForBox(Component[] components, Dimension gapDimension) {
/* 66 */     List<Component> newComponentList = new LinkedList<>();
/* 67 */     List<JButton> buttonList = new LinkedList<>();
/* 68 */     int maxWidth = 0;
/* 69 */     for (int i = 0; i < components.length; i++) {
/* 70 */       Component component = components[i];
/* 71 */       if (component instanceof JButton) {
/* 72 */         JButton button = (JButton)component;
/* 73 */         if (button.getText() != null && button.getText().length() != 0) {
/* 74 */           button.setPreferredSize((Dimension)null);
/*    */         }
/* 76 */         Boolean equalize = (Boolean)button.getClientProperty("buttonEqualize");
/* 77 */         if (equalize == null || equalize.booleanValue()) {
/* 78 */           maxWidth = Math.max(maxWidth, (button.getPreferredSize()).width);
/* 79 */           buttonList.add(button);
/*    */         } 
/* 81 */         if (i > 0) {
/* 82 */           newComponentList.add(Box.createRigidArea(gapDimension));
/*    */         }
/*    */       } 
/* 85 */       newComponentList.add(component);
/*    */     } 
/*    */     
/* 88 */     for (JButton button : buttonList) {
/* 89 */       Dimension preferredSize = button.getPreferredSize();
/* 90 */       preferredSize.width = maxWidth;
/* 91 */       button.setPreferredSize(preferredSize);
/* 92 */       button.setMinimumSize(preferredSize);
/* 93 */       button.setMaximumSize(preferredSize);
/*    */     } 
/*    */     
/* 96 */     return newComponentList.<Component>toArray(components);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\ButtonUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */