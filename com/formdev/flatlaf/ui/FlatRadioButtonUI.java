/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.icons.FlatCheckBoxIcon;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicButtonListener;
/*     */ import javax.swing.plaf.basic.BasicRadioButtonUI;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatRadioButtonUI
/*     */   extends BasicRadioButtonUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   protected int iconTextGap;
/*     */   @Styleable
/*     */   protected Color disabledText;
/*     */   private Color defaultBackground;
/*     */   private final boolean shared;
/*     */   private boolean iconShared = true;
/*     */   private boolean defaults_initialized = false;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/*  87 */     return (FlatUIUtils.canUseSharedUI(c) && !FlatUIUtils.needsLightAWTPeer(c)) ? 
/*  88 */       FlatUIUtils.createSharedUI(FlatRadioButtonUI.class, () -> new FlatRadioButtonUI(true)) : 
/*  89 */       new FlatRadioButtonUI(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected FlatRadioButtonUI(boolean shared) {
/*  94 */     this.shared = shared;
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/*  99 */     if (FlatUIUtils.needsLightAWTPeer(c)) {
/* 100 */       FlatUIUtils.runWithLightAWTPeerUIDefaults(() -> installUIImpl(c));
/*     */     } else {
/* 102 */       installUIImpl(c);
/*     */     } 
/*     */   }
/*     */   private void installUIImpl(JComponent c) {
/* 106 */     super.installUI(c);
/*     */     
/* 108 */     if (FlatUIUtils.isAWTPeer(c)) {
/* 109 */       AWTPeerMouseExitedFix.install(c);
/*     */     }
/* 111 */     installStyle((AbstractButton)c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void uninstallUI(JComponent c) {
/* 116 */     super.uninstallUI(c);
/*     */     
/* 118 */     if (FlatUIUtils.isAWTPeer(c)) {
/* 119 */       AWTPeerMouseExitedFix.uninstall(c);
/*     */     }
/*     */   }
/*     */   
/*     */   public void installDefaults(AbstractButton b) {
/* 124 */     super.installDefaults(b);
/*     */     
/* 126 */     if (!this.defaults_initialized) {
/* 127 */       String prefix = getPropertyPrefix();
/*     */       
/* 129 */       this.iconTextGap = FlatUIUtils.getUIInt(prefix + "iconTextGap", 4);
/* 130 */       this.disabledText = UIManager.getColor(prefix + "disabledText");
/*     */       
/* 132 */       this.defaultBackground = UIManager.getColor(prefix + "background");
/*     */       
/* 134 */       this.iconShared = true;
/* 135 */       this.defaults_initialized = true;
/*     */     } 
/*     */     
/* 138 */     LookAndFeel.installProperty(b, "opaque", Boolean.valueOf(false));
/* 139 */     LookAndFeel.installProperty(b, "iconTextGap", Integer.valueOf(UIScale.scale(this.iconTextGap)));
/*     */     
/* 141 */     MigLayoutVisualPadding.install(b, null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults(AbstractButton b) {
/* 146 */     super.uninstallDefaults(b);
/*     */     
/* 148 */     this.oldStyleValues = null;
/*     */     
/* 150 */     MigLayoutVisualPadding.uninstall(b);
/* 151 */     this.defaults_initialized = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected BasicButtonListener createButtonListener(AbstractButton b) {
/* 156 */     return new FlatRadioButtonListener(b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void propertyChange(AbstractButton b, PropertyChangeEvent e) {
/* 161 */     switch (e.getPropertyName()) {
/*     */       case "FlatLaf.style":
/*     */       case "FlatLaf.styleClass":
/* 164 */         if (this.shared && FlatStylingSupport.hasStyleProperty(b)) {
/*     */ 
/*     */           
/* 167 */           b.updateUI();
/*     */         } else {
/* 169 */           installStyle(b);
/* 170 */         }  b.revalidate();
/* 171 */         b.repaint();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle(AbstractButton b) {
/*     */     try {
/* 179 */       applyStyle(b, FlatStylingSupport.getResolvedStyle(b, getStyleType()));
/* 180 */     } catch (RuntimeException ex) {
/* 181 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   String getStyleType() {
/* 187 */     return "RadioButton";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(AbstractButton b, Object style) {
/* 192 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, (key, value) -> applyStyleProperty(b, key, value));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(AbstractButton b, String key, Object value) {
/* 199 */     if (key.startsWith("icon.")) {
/* 200 */       if (!(this.icon instanceof FlatCheckBoxIcon)) {
/* 201 */         return new FlatStylingSupport.UnknownStyleException(key);
/*     */       }
/* 203 */       if (this.iconShared) {
/* 204 */         this.icon = FlatStylingSupport.cloneIcon(this.icon);
/* 205 */         this.iconShared = false;
/*     */       } 
/*     */       
/* 208 */       key = key.substring("icon.".length());
/* 209 */       return ((FlatCheckBoxIcon)this.icon).applyStyleProperty(key, value);
/*     */     } 
/*     */     
/* 212 */     if ("iconTextGap".equals(key) && value instanceof Integer) {
/* 213 */       value = Integer.valueOf(UIScale.scale(((Integer)value).intValue()));
/*     */     }
/* 215 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, b, key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 221 */     Map<String, Class<?>> infos = FlatStylingSupport.getAnnotatedStyleableInfos(this);
/* 222 */     if (this.icon instanceof FlatCheckBoxIcon)
/* 223 */       for (Map.Entry<String, Class<?>> e : (Iterable<Map.Entry<String, Class<?>>>)((FlatCheckBoxIcon)this.icon).getStyleableInfos().entrySet()) {
/* 224 */         infos.put("icon.".concat(e.getKey()), e.getValue());
/*     */       } 
/* 226 */     return infos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 233 */     if (key.startsWith("icon.")) {
/* 234 */       return (this.icon instanceof FlatCheckBoxIcon) ? (
/* 235 */         (FlatCheckBoxIcon)this.icon).getStyleableValue(key.substring("icon.".length())) : 
/* 236 */         null;
/*     */     }
/*     */     
/* 239 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */   
/* 242 */   private static final Insets tempInsets = new Insets(0, 0, 0, 0);
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 246 */     Dimension size = super.getPreferredSize(c);
/* 247 */     if (size == null) {
/* 248 */       return null;
/*     */     }
/*     */     
/* 251 */     int focusWidth = getIconFocusWidth(c);
/* 252 */     if (focusWidth > 0) {
/*     */ 
/*     */ 
/*     */       
/* 256 */       Insets insets = c.getInsets(tempInsets);
/* 257 */       size.width += Math.max(focusWidth - insets.left, 0) + Math.max(focusWidth - insets.right, 0);
/* 258 */       size.height += Math.max(focusWidth - insets.top, 0) + Math.max(focusWidth - insets.bottom, 0);
/*     */     } 
/*     */     
/* 261 */     return size;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void paint(Graphics g, JComponent c) {
/* 270 */     if (!c.isOpaque() && ((AbstractButton)c)
/* 271 */       .isContentAreaFilled() && 
/* 272 */       !Objects.equals(c.getBackground(), getDefaultBackground(c))) {
/*     */       
/* 274 */       g.setColor(c.getBackground());
/* 275 */       g.fillRect(0, 0, c.getWidth(), c.getHeight());
/*     */     } 
/*     */ 
/*     */     
/* 279 */     int focusWidth = getIconFocusWidth(c);
/* 280 */     if (focusWidth > 0) {
/* 281 */       boolean ltr = c.getComponentOrientation().isLeftToRight();
/* 282 */       int halign = ((AbstractButton)c).getHorizontalAlignment();
/* 283 */       if (halign == 10) {
/* 284 */         halign = ltr ? 2 : 4;
/* 285 */       } else if (halign == 11) {
/* 286 */         halign = ltr ? 4 : 2;
/*     */       } 
/* 288 */       Insets insets = c.getInsets(tempInsets);
/* 289 */       if ((focusWidth > insets.left || focusWidth > insets.right) && (halign == 2 || halign == 4)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 298 */         int offset = (halign == 2) ? Math.max(focusWidth - insets.left, 0) : -Math.max(focusWidth - insets.right, 0);
/*     */ 
/*     */         
/* 301 */         g.translate(offset, 0);
/* 302 */         super.paint(FlatLabelUI.createGraphicsHTMLTextYCorrection(g, c), c);
/* 303 */         g.translate(-offset, 0);
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 308 */     super.paint(FlatLabelUI.createGraphicsHTMLTextYCorrection(g, c), c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintText(Graphics g, AbstractButton b, Rectangle textRect, String text) {
/* 313 */     FlatButtonUI.paintText(g, b, textRect, text, b.isEnabled() ? b.getForeground() : this.disabledText);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Color getDefaultBackground(JComponent c) {
/* 322 */     Container parent = c.getParent();
/* 323 */     return (parent instanceof javax.swing.CellRendererPane && parent.getParent() != null) ? 
/* 324 */       parent.getParent().getBackground() : 
/* 325 */       this.defaultBackground;
/*     */   }
/*     */   
/*     */   private int getIconFocusWidth(JComponent c) {
/* 329 */     AbstractButton b = (AbstractButton)c;
/* 330 */     Icon icon = b.getIcon();
/* 331 */     if (icon == null) {
/* 332 */       icon = getDefaultIcon();
/*     */     }
/* 334 */     return (icon instanceof FlatCheckBoxIcon) ? 
/* 335 */       Math.round(UIScale.scale(((FlatCheckBoxIcon)icon).getFocusWidth())) : 
/* 336 */       0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBaseline(JComponent c, int width, int height) {
/* 341 */     return FlatButtonUI.getBaselineImpl(c, width, height);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected class FlatRadioButtonListener
/*     */     extends BasicButtonListener
/*     */   {
/*     */     private final AbstractButton b;
/*     */ 
/*     */     
/*     */     protected FlatRadioButtonListener(AbstractButton b) {
/* 353 */       super(b);
/* 354 */       this.b = b;
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 359 */       super.propertyChange(e);
/* 360 */       FlatRadioButtonUI.this.propertyChange(this.b, e);
/*     */     }
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
/*     */   private static class AWTPeerMouseExitedFix
/*     */     extends MouseAdapter
/*     */     implements PropertyChangeListener
/*     */   {
/*     */     private final JComponent button;
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
/*     */     static void install(JComponent button) {
/* 390 */       AWTPeerMouseExitedFix l = new AWTPeerMouseExitedFix(button);
/* 391 */       button.addPropertyChangeListener("ancestor", l);
/* 392 */       Container parent = button.getParent();
/* 393 */       if (parent != null)
/* 394 */         parent.addMouseListener(l); 
/*     */     }
/*     */     
/*     */     static void uninstall(JComponent button) {
/* 398 */       for (PropertyChangeListener l : button.getPropertyChangeListeners("ancestor")) {
/* 399 */         if (l instanceof AWTPeerMouseExitedFix) {
/* 400 */           button.removePropertyChangeListener("ancestor", l);
/* 401 */           Container parent = button.getParent();
/* 402 */           if (parent != null)
/* 403 */             parent.removeMouseListener((AWTPeerMouseExitedFix)l); 
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     AWTPeerMouseExitedFix(JComponent button) {
/* 410 */       this.button = button;
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 415 */       if (e.getOldValue() instanceof Component)
/* 416 */         ((Component)e.getOldValue()).removeMouseListener(this); 
/* 417 */       if (e.getNewValue() instanceof Component) {
/* 418 */         ((Component)e.getNewValue()).removeMouseListener(this);
/* 419 */         ((Component)e.getNewValue()).addMouseListener(this);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseExited(MouseEvent e) {
/* 425 */       this.button.dispatchEvent(SwingUtilities.convertMouseEvent(e.getComponent(), e, this.button));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatRadioButtonUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */