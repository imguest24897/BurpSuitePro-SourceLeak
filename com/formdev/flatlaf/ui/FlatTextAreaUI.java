/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.HiDPIUtils;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Map;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicTextAreaUI;
/*     */ import javax.swing.text.Caret;
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
/*     */ public class FlatTextAreaUI
/*     */   extends BasicTextAreaUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected int minimumWidth;
/*     */   private Color background;
/*     */   @Styleable
/*     */   protected Color disabledBackground;
/*     */   @Styleable
/*     */   protected Color inactiveBackground;
/*     */   @Styleable
/*     */   protected Color focusedBackground;
/*     */   private Color oldDisabledBackground;
/*     */   private Color oldInactiveBackground;
/*     */   private Insets defaultMargin;
/*     */   private FocusListener focusListener;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/*  82 */     return new FlatTextAreaUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/*  87 */     if (FlatUIUtils.needsLightAWTPeer(c)) {
/*  88 */       FlatUIUtils.runWithLightAWTPeerUIDefaults(() -> installUIImpl(c));
/*     */     } else {
/*  90 */       installUIImpl(c);
/*     */     } 
/*     */   }
/*     */   private void installUIImpl(JComponent c) {
/*  94 */     super.installUI(c);
/*     */     
/*  96 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 101 */     super.installDefaults();
/*     */     
/* 103 */     this.minimumWidth = UIManager.getInt("Component.minimumWidth");
/* 104 */     this.background = UIManager.getColor("TextArea.background");
/* 105 */     this.disabledBackground = UIManager.getColor("TextArea.disabledBackground");
/* 106 */     this.inactiveBackground = UIManager.getColor("TextArea.inactiveBackground");
/* 107 */     this.focusedBackground = UIManager.getColor("TextArea.focusedBackground");
/*     */     
/* 109 */     this.defaultMargin = UIManager.getInsets("TextArea.margin");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 114 */     super.uninstallDefaults();
/*     */     
/* 116 */     this.background = null;
/* 117 */     this.disabledBackground = null;
/* 118 */     this.inactiveBackground = null;
/* 119 */     this.focusedBackground = null;
/*     */     
/* 121 */     this.oldDisabledBackground = null;
/* 122 */     this.oldInactiveBackground = null;
/*     */     
/* 124 */     this.oldStyleValues = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 129 */     super.installListeners();
/*     */ 
/*     */     
/* 132 */     this.focusListener = new FlatUIUtils.RepaintFocusListener(getComponent(), c -> (this.focusedBackground != null));
/* 133 */     getComponent().addFocusListener(this.focusListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 138 */     super.uninstallListeners();
/*     */     
/* 140 */     getComponent().removeFocusListener(this.focusListener);
/* 141 */     this.focusListener = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Caret createCaret() {
/* 146 */     return new FlatCaret(null, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void propertyChange(PropertyChangeEvent e) {
/* 152 */     String propertyName = e.getPropertyName();
/* 153 */     if ("editable".equals(propertyName) || "enabled".equals(propertyName)) {
/* 154 */       updateBackground();
/*     */     }
/* 156 */     super.propertyChange(e);
/* 157 */     FlatEditorPaneUI.propertyChange(getComponent(), e, this::installStyle);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 163 */       applyStyle(FlatStylingSupport.getResolvedStyle(getComponent(), "TextArea"));
/* 164 */     } catch (RuntimeException ex) {
/* 165 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 171 */     this.oldDisabledBackground = this.disabledBackground;
/* 172 */     this.oldInactiveBackground = this.inactiveBackground;
/*     */     
/* 174 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */     
/* 176 */     updateBackground();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 181 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, getComponent(), key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 187 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 193 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */   
/*     */   private void updateBackground() {
/* 197 */     FlatTextFieldUI.updateBackground(getComponent(), this.background, this.disabledBackground, this.inactiveBackground, this.oldDisabledBackground, this.oldInactiveBackground);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 204 */     return applyMinimumWidth(c, super.getPreferredSize(c));
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getMinimumSize(JComponent c) {
/* 209 */     return applyMinimumWidth(c, super.getMinimumSize(c));
/*     */   }
/*     */ 
/*     */   
/*     */   private Dimension applyMinimumWidth(JComponent c, Dimension size) {
/* 214 */     if (c instanceof JTextArea && ((JTextArea)c).getColumns() > 0) {
/* 215 */       return size;
/*     */     }
/* 217 */     return FlatEditorPaneUI.applyMinimumWidth(c, size, this.minimumWidth, this.defaultMargin);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintSafely(Graphics g) {
/* 222 */     super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintBackground(Graphics g) {
/* 227 */     FlatEditorPaneUI.paintBackground(g, getComponent(), this.focusedBackground);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTextAreaUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */