/*     */ package com.ejt.internal.gui;
/*     */ 
/*     */ import com.ejt.internal.util.CommonPlatformUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import javax.swing.AbstractAction;
/*     */ import javax.swing.Action;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.UIManager;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KeyboardUtil
/*     */ {
/*     */   public static void addAccelerator(int condition, @NotNull JComponent component, Action action) {
/*  28 */     Object key = new Object();
/*  29 */     component.getInputMap(condition).put((KeyStroke)action.getValue("AcceleratorKey"), key);
/*  30 */     component.getActionMap().put(key, action);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object addAccelerator(int condition, @NotNull JComponent component, @NotNull JComponent parent, ActionListener listener, int keyCode, int keyMask) {
/*  45 */     return addAccelerator(condition, component, parent, listener, null, keyCode, keyMask);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void addAccelerator(int condition, @NotNull JComponent component, @NotNull JComponent parent, ActionListener listener, KeyStroke keystroke) {
/*  64 */     addAccelerator(condition, component, parent, listener, keystroke.getKeyCode(), keystroke.getModifiers());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object addAccelerator(int condition, @NotNull JComponent component, @NotNull JComponent parent, ActionListener listener, String actionCommand, int keyCode, int keyMask) {
/*  80 */     ComponentAction action = new ComponentAction(component, listener, actionCommand);
/*  81 */     KeyStroke keyStroke = KeyStroke.getKeyStroke(keyCode, keyMask);
/*  82 */     Object key = new Object();
/*     */     
/*  84 */     parent.getInputMap(condition).put(keyStroke, key);
/*  85 */     parent.getActionMap().put(key, action);
/*     */     
/*  87 */     return key;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void addAccelerator(int condition, Object key, @NotNull JComponent parent, int keyCode, int keyMask) {
/* 100 */     KeyStroke keyStroke = KeyStroke.getKeyStroke(keyCode, keyMask);
/* 101 */     parent.getInputMap(condition).put(keyStroke, key);
/*     */   }
/*     */   
/*     */   public static String getAcceleratorTextForTooltip(@Nullable KeyStroke accelerator) {
/* 105 */     if (accelerator == null) {
/* 106 */       return "";
/*     */     }
/* 108 */     return " [" + getAcceleratorText(accelerator) + "]";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getAcceleratorText(@NotNull KeyStroke accelerator) {
/* 114 */     StringBuilder buffer = new StringBuilder();
/* 115 */     appendModifierText(buffer, accelerator.getModifiers());
/*     */     
/* 117 */     int keyCode = accelerator.getKeyCode();
/* 118 */     if (keyCode != 0) {
/* 119 */       buffer.append(KeyEvent.getKeyText(keyCode));
/*     */     }
/* 121 */     else if (accelerator.getKeyChar() == ' ') {
/* 122 */       buffer.append(KeyEvent.getKeyText(32));
/*     */     } else {
/* 124 */       buffer.append(accelerator.getKeyChar());
/*     */     } 
/*     */     
/* 127 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static void appendModifierText(StringBuilder buffer, int modifiers) {
/* 131 */     String acceleratorDelimiter = UIManager.getString("MenuItem.acceleratorDelimiter");
/* 132 */     if (acceleratorDelimiter == null) {
/* 133 */       acceleratorDelimiter = "+";
/* 134 */     } else if (acceleratorDelimiter.length() == 0) {
/* 135 */       acceleratorDelimiter = " ";
/*     */     } 
/* 137 */     if (modifiers > 0) {
/* 138 */       String keyModifiersText = KeyEvent.getModifiersExText(modifiers);
/* 139 */       if (CommonPlatformUtil.isMacOS()) {
/* 140 */         keyModifiersText = keyModifiersText.replace("Meta", "Cmd");
/*     */       }
/* 142 */       buffer.append(keyModifiersText);
/* 143 */       buffer.append(acceleratorDelimiter);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static class ComponentAction
/*     */     extends AbstractAction {
/*     */     private Component component;
/*     */     private ActionListener actionListener;
/*     */     private String actionCommand;
/*     */     
/*     */     public ComponentAction(@NotNull Component component, ActionListener actionListener, String actionCommand) {
/* 154 */       this.component = component;
/* 155 */       this.actionListener = actionListener;
/* 156 */       this.actionCommand = actionCommand;
/*     */     }
/*     */ 
/*     */     
/*     */     public void actionPerformed(ActionEvent event) {
/* 161 */       if (this.component.isEnabled())
/* 162 */         this.actionListener.actionPerformed(new ActionEvent(this.component, event
/*     */               
/* 164 */               .getID(), 
/* 165 */               (this.actionCommand == null) ? event.getActionCommand() : this.actionCommand, event
/* 166 */               .getModifiers())); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\ejt\internal\gui\KeyboardUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */