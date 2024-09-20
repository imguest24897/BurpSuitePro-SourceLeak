/*     */ package com.install4j.runtime.util;
/*     */ 
/*     */ import com.install4j.runtime.beans.LightOrDarkColor;
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Objects;
/*     */ import javax.swing.Action;
/*     */ 
/*     */ public class HyperlinkLabel extends CustomLabel implements MouseListener {
/*  14 */   public static final Color COLOR_PASSIVE = (Color)new LightOrDarkColor(new Color(0, 77, 145), new Color(88, 157, 246));
/*  15 */   public static final Color COLOR_ACTIVE = (Color)new LightOrDarkColor(new Color(225, 9, 21), new Color(186, 51, 36));
/*     */   
/*     */   private Action action;
/*     */   
/*     */   private boolean override;
/*     */   
/*  21 */   private Color passiveColor = COLOR_PASSIVE;
/*  22 */   private Color activeColor = COLOR_ACTIVE;
/*     */   
/*     */   public HyperlinkLabel(Action action) {
/*  25 */     this((String)action.getValue("Name"), action);
/*     */   }
/*     */   
/*     */   public HyperlinkLabel(String text, Action action) {
/*  29 */     super(text);
/*  30 */     this.action = action;
/*  31 */     setupComponent();
/*  32 */     setupEventHandlers();
/*  33 */     changeState(action.isEnabled());
/*     */   }
/*     */   
/*     */   public void setPassiveColor(Color passiveColor) {
/*  37 */     this.passiveColor = passiveColor;
/*  38 */     setForeground(passiveColor);
/*     */   }
/*     */   
/*     */   public void setActiveColor(Color activeColor) {
/*  42 */     this.activeColor = activeColor;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/*  47 */     this.override = true;
/*  48 */     changeState(enabled);
/*     */   }
/*     */   
/*     */   public Action getAction() {
/*  52 */     return this.action;
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/*  56 */     setUnderlined(true);
/*  57 */     setForeground(this.passiveColor);
/*  58 */     setCursor(Cursor.getPredefinedCursor(12));
/*     */   }
/*     */   
/*     */   private void setupEventHandlers() {
/*  62 */     this.action.addPropertyChangeListener(event -> {
/*     */           if (Objects.equals(event.getPropertyName(), "enabled") && !this.override) {
/*     */             changeState(((Boolean)event.getNewValue()).booleanValue());
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private void changeState(boolean enabled) {
/*  70 */     setUnderlined(enabled);
/*  71 */     if (enabled) {
/*  72 */       addMouseListener(this);
/*     */     } else {
/*  74 */       removeMouseListener(this);
/*     */     } 
/*  76 */     super.setEnabled(enabled);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void mousePressed(MouseEvent event) {
/*  83 */     if ((event.getModifiers() & 0x10) == 0) {
/*     */       return;
/*     */     }
/*  86 */     setForeground(this.activeColor);
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseReleased(MouseEvent event) {
/*  91 */     if ((event.getModifiers() & 0x10) == 0) {
/*     */       return;
/*     */     }
/*  94 */     setForeground(this.passiveColor);
/*     */   }
/*     */ 
/*     */   
/*     */   public void mouseClicked(MouseEvent event) {
/*  99 */     if ((event.getModifiers() & 0x10) == 0) {
/*     */       return;
/*     */     }
/* 102 */     if (this.action != null && this.action.isEnabled())
/* 103 */       this.action.actionPerformed(new ActionEvent(this, 0, null)); 
/*     */   }
/*     */   
/*     */   public void mouseExited(MouseEvent event) {}
/*     */   
/*     */   public void mouseEntered(MouseEvent event) {}
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\HyperlinkLabel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */