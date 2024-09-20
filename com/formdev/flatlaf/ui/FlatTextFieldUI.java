/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatClientProperties;
/*     */ import com.formdev.flatlaf.util.HiDPIUtils;
/*     */ import com.formdev.flatlaf.util.JavaCompatibility;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.LayoutManager2;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import java.util.function.Consumer;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.event.DocumentEvent;
/*     */ import javax.swing.event.DocumentListener;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.UIResource;
/*     */ import javax.swing.plaf.basic.BasicTextFieldUI;
/*     */ import javax.swing.text.Caret;
/*     */ import javax.swing.text.Document;
/*     */ import javax.swing.text.JTextComponent;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatTextFieldUI
/*     */   extends BasicTextFieldUI
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
/*     */   protected Color placeholderForeground;
/*     */   @Styleable
/*     */   protected Color focusedBackground;
/*     */   @Styleable
/*     */   protected int iconTextGap;
/*     */   @Styleable
/*     */   protected Icon leadingIcon;
/*     */   @Styleable
/*     */   protected Icon trailingIcon;
/*     */   protected JComponent leadingComponent;
/*     */   protected JComponent trailingComponent;
/*     */   protected JComponent clearButton;
/*     */   @Styleable
/*     */   protected boolean showClearButton;
/*     */   private Color oldDisabledBackground;
/*     */   private Color oldInactiveBackground;
/*     */   private Insets defaultMargin;
/*     */   private FocusListener focusListener;
/*     */   private DocumentListener documentListener;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   private AtomicBoolean borderShared;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 125 */     return new FlatTextFieldUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 130 */     if (FlatUIUtils.needsLightAWTPeer(c)) {
/* 131 */       FlatUIUtils.runWithLightAWTPeerUIDefaults(() -> installUIImpl(c));
/*     */     } else {
/* 133 */       installUIImpl(c);
/*     */     } 
/*     */   }
/*     */   private void installUIImpl(JComponent c) {
/* 137 */     super.installUI(c);
/*     */     
/* 139 */     this.leadingIcon = (Icon)FlatClientProperties.clientProperty(c, "JTextField.leadingIcon", null, Icon.class);
/* 140 */     this.trailingIcon = (Icon)FlatClientProperties.clientProperty(c, "JTextField.trailingIcon", null, Icon.class);
/*     */     
/* 142 */     installLeadingComponent();
/* 143 */     installTrailingComponent();
/* 144 */     installClearButton();
/*     */     
/* 146 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   public void uninstallUI(JComponent c) {
/* 151 */     uninstallLeadingComponent();
/* 152 */     uninstallTrailingComponent();
/* 153 */     uninstallClearButton();
/*     */     
/* 155 */     super.uninstallUI(c);
/*     */     
/* 157 */     this.leadingIcon = null;
/* 158 */     this.trailingIcon = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 163 */     super.installDefaults();
/*     */     
/* 165 */     String prefix = getPropertyPrefix();
/* 166 */     this.minimumWidth = UIManager.getInt("Component.minimumWidth");
/* 167 */     this.background = UIManager.getColor(prefix + ".background");
/* 168 */     this.disabledBackground = UIManager.getColor(prefix + ".disabledBackground");
/* 169 */     this.inactiveBackground = UIManager.getColor(prefix + ".inactiveBackground");
/* 170 */     this.placeholderForeground = UIManager.getColor(prefix + ".placeholderForeground");
/* 171 */     this.focusedBackground = UIManager.getColor(prefix + ".focusedBackground");
/* 172 */     this.iconTextGap = FlatUIUtils.getUIInt(prefix + ".iconTextGap", 4);
/*     */     
/* 174 */     this.defaultMargin = UIManager.getInsets(prefix + ".margin");
/*     */     
/* 176 */     LookAndFeel.installProperty(getComponent(), "opaque", Boolean.valueOf(false));
/*     */     
/* 178 */     MigLayoutVisualPadding.install(getComponent());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 183 */     super.uninstallDefaults();
/*     */     
/* 185 */     this.background = null;
/* 186 */     this.disabledBackground = null;
/* 187 */     this.inactiveBackground = null;
/* 188 */     this.placeholderForeground = null;
/* 189 */     this.focusedBackground = null;
/*     */     
/* 191 */     this.oldDisabledBackground = null;
/* 192 */     this.oldInactiveBackground = null;
/*     */     
/* 194 */     this.oldStyleValues = null;
/* 195 */     this.borderShared = null;
/*     */     
/* 197 */     MigLayoutVisualPadding.uninstall(getComponent());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 202 */     super.installListeners();
/*     */ 
/*     */     
/* 205 */     this.focusListener = new FlatUIUtils.RepaintFocusListener(getComponent(), null);
/* 206 */     getComponent().addFocusListener(this.focusListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 211 */     super.uninstallListeners();
/*     */     
/* 213 */     getComponent().removeFocusListener(this.focusListener);
/* 214 */     this.focusListener = null;
/*     */     
/* 216 */     if (this.documentListener != null) {
/* 217 */       getComponent().getDocument().removeDocumentListener(this.documentListener);
/* 218 */       this.documentListener = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected Caret createCaret() {
/* 224 */     return new FlatCaret(UIManager.getString("TextComponent.selectAllOnFocusPolicy"), 
/* 225 */         UIManager.getBoolean("TextComponent.selectAllOnMouseClick"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void propertyChange(PropertyChangeEvent e) {
/* 230 */     String propertyName = e.getPropertyName();
/* 231 */     if ("editable".equals(propertyName) || "enabled".equals(propertyName)) {
/* 232 */       updateBackground();
/*     */     } else {
/* 234 */       super.propertyChange(e);
/*     */     } 
/* 236 */     JTextComponent c = getComponent();
/* 237 */     switch (e.getPropertyName()) {
/*     */       case "JTextField.placeholderText":
/*     */       case "JComponent.roundRect":
/*     */       case "JComponent.outline":
/*     */       case "JTextField.padding":
/* 242 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "JComponent.minimumWidth":
/* 246 */         c.revalidate();
/*     */         break;
/*     */       
/*     */       case "FlatLaf.style":
/*     */       case "FlatLaf.styleClass":
/* 251 */         installStyle();
/* 252 */         c.revalidate();
/* 253 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "JTextField.leadingIcon":
/* 257 */         this.leadingIcon = (e.getNewValue() instanceof Icon) ? (Icon)e.getNewValue() : null;
/* 258 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "JTextField.trailingIcon":
/* 262 */         this.trailingIcon = (e.getNewValue() instanceof Icon) ? (Icon)e.getNewValue() : null;
/* 263 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "JTextField.leadingComponent":
/* 267 */         uninstallLeadingComponent();
/* 268 */         installLeadingComponent();
/* 269 */         c.revalidate();
/* 270 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "JTextField.trailingComponent":
/* 274 */         uninstallTrailingComponent();
/* 275 */         installTrailingComponent();
/* 276 */         c.revalidate();
/* 277 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "JTextField.showClearButton":
/* 281 */         uninstallClearButton();
/* 282 */         installClearButton();
/* 283 */         c.revalidate();
/* 284 */         c.repaint();
/*     */         break;
/*     */       
/*     */       case "enabled":
/*     */       case "editable":
/* 289 */         updateClearButton();
/*     */         break;
/*     */       
/*     */       case "document":
/* 293 */         if (this.documentListener != null) {
/* 294 */           if (e.getOldValue() instanceof Document)
/* 295 */             ((Document)e.getOldValue()).removeDocumentListener(this.documentListener); 
/* 296 */           if (e.getNewValue() instanceof Document) {
/* 297 */             ((Document)e.getNewValue()).addDocumentListener(this.documentListener);
/*     */           }
/* 299 */           updateClearButton();
/*     */         } 
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDocumentListener() {
/* 307 */     if (this.documentListener != null) {
/*     */       return;
/*     */     }
/* 310 */     this.documentListener = new FlatDocumentListener();
/* 311 */     getComponent().getDocument().addDocumentListener(this.documentListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void documentChanged(DocumentEvent e) {
/* 316 */     if (this.clearButton != null) {
/* 317 */       updateClearButton();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 323 */       applyStyle(FlatStylingSupport.getResolvedStyle(getComponent(), getStyleType()));
/* 324 */     } catch (RuntimeException ex) {
/* 325 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   String getStyleType() {
/* 331 */     return "TextField";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 336 */     this.oldDisabledBackground = this.disabledBackground;
/* 337 */     this.oldInactiveBackground = this.inactiveBackground;
/* 338 */     boolean oldShowClearButton = this.showClearButton;
/*     */     
/* 340 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */     
/* 342 */     updateBackground();
/* 343 */     if (this.showClearButton != oldShowClearButton) {
/* 344 */       uninstallClearButton();
/* 345 */       installClearButton();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 351 */     if (this.borderShared == null)
/* 352 */       this.borderShared = new AtomicBoolean(true); 
/* 353 */     return FlatStylingSupport.applyToAnnotatedObjectOrBorder(this, key, value, getComponent(), this.borderShared);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 359 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this, getComponent().getBorder());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 365 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, getComponent().getBorder(), key);
/*     */   }
/*     */   
/*     */   private void updateBackground() {
/* 369 */     updateBackground(getComponent(), this.background, this.disabledBackground, this.inactiveBackground, this.oldDisabledBackground, this.oldInactiveBackground);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void updateBackground(JTextComponent c, Color background, Color disabledBackground, Color inactiveBackground, Color oldDisabledBackground, Color oldInactiveBackground) {
/* 379 */     Color oldBackground = c.getBackground();
/* 380 */     if (!(oldBackground instanceof UIResource)) {
/*     */       return;
/*     */     }
/*     */     
/* 384 */     if (oldBackground != background && oldBackground != disabledBackground && oldBackground != inactiveBackground && oldBackground != oldDisabledBackground && oldBackground != oldInactiveBackground) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 395 */     Color newBackground = !c.isEnabled() ? disabledBackground : (!c.isEditable() ? inactiveBackground : background);
/*     */     
/* 397 */     if (newBackground != oldBackground) {
/* 398 */       c.setBackground(newBackground);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void paintSafely(Graphics g) {
/* 403 */     paintBackground(g, getComponent(), this.focusedBackground);
/* 404 */     paintPlaceholder(g);
/*     */     
/* 406 */     if (hasLeadingIcon() || hasTrailingIcon()) {
/* 407 */       paintIcons(g, new Rectangle(getIconsRect()));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     super.paintSafely(HiDPIUtils.createGraphicsTextYCorrection((Graphics2D)g));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintBackground(Graphics g) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void paintBackground(Graphics g, JTextComponent c, Color focusedBackground) {
/* 429 */     if (!c.isOpaque() && FlatUIUtils.getOutsideFlatBorder(c) == null && FlatUIUtils.hasOpaqueBeenExplicitlySet(c)) {
/*     */       return;
/*     */     }
/* 432 */     float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
/* 433 */     float arc = FlatUIUtils.getBorderArc(c);
/*     */ 
/*     */     
/* 436 */     if (c.isOpaque() && (focusWidth > 0.0F || arc > 0.0F)) {
/* 437 */       FlatUIUtils.paintParentBackground(g, c);
/*     */     }
/*     */     
/* 440 */     Graphics2D g2 = (Graphics2D)g.create();
/*     */     try {
/* 442 */       FlatUIUtils.setRenderingHints(g2);
/*     */       
/* 444 */       g2.setColor(getBackground(c, focusedBackground));
/* 445 */       FlatUIUtils.paintComponentBackground(g2, 0, 0, c.getWidth(), c.getHeight(), focusWidth, arc);
/*     */     } finally {
/* 447 */       g2.dispose();
/*     */     } 
/*     */   }
/*     */   
/*     */   static Color getBackground(JTextComponent c, Color focusedBackground) {
/* 452 */     Color background = c.getBackground();
/*     */ 
/*     */     
/* 455 */     if (!(background instanceof UIResource)) {
/* 456 */       return background;
/*     */     }
/*     */     
/* 459 */     if (focusedBackground != null && FlatUIUtils.isPermanentFocusOwner(c)) {
/* 460 */       return focusedBackground;
/*     */     }
/* 462 */     return background;
/*     */   }
/*     */   
/*     */   protected void paintPlaceholder(Graphics g) {
/* 466 */     JTextComponent c = getComponent();
/*     */ 
/*     */     
/* 469 */     if (c.getDocument().getLength() > 0) {
/*     */       return;
/*     */     }
/*     */     
/* 473 */     Container parent = c.getParent();
/* 474 */     JComponent jc = (parent instanceof JComboBox) ? (JComboBox)parent : c;
/*     */ 
/*     */     
/* 477 */     String placeholder = (String)FlatClientProperties.clientProperty(jc, "JTextField.placeholderText", null, String.class);
/* 478 */     if (placeholder == null) {
/*     */       return;
/*     */     }
/*     */     
/* 482 */     Rectangle r = getVisibleEditorRect();
/* 483 */     FontMetrics fm = c.getFontMetrics(c.getFont());
/* 484 */     int x = r.x;
/* 485 */     int y = r.y + fm.getAscent() + (r.height - fm.getHeight()) / 2;
/*     */ 
/*     */     
/* 488 */     String clippedPlaceholder = JavaCompatibility.getClippedString(c, fm, placeholder, r.width);
/* 489 */     int stringWidth = fm.stringWidth(clippedPlaceholder);
/* 490 */     int halign = (c instanceof JTextField) ? ((JTextField)c).getHorizontalAlignment() : 10;
/* 491 */     if (halign == 10) {
/* 492 */       halign = isLeftToRight() ? 2 : 4;
/* 493 */     } else if (halign == 11) {
/* 494 */       halign = isLeftToRight() ? 4 : 2;
/* 495 */     }  if (halign == 4) {
/* 496 */       x += r.width - stringWidth;
/* 497 */     } else if (halign == 0) {
/* 498 */       x = Math.max(0, x + r.width / 2 - stringWidth / 2);
/*     */     } 
/*     */     
/* 501 */     g.setColor(this.placeholderForeground);
/* 502 */     FlatUIUtils.drawString(c, g, clippedPlaceholder, x, y);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintIcons(Graphics g, Rectangle r) {
/* 513 */     boolean ltr = isLeftToRight();
/* 514 */     Icon leftIcon = ltr ? this.leadingIcon : this.trailingIcon;
/* 515 */     Icon rightIcon = ltr ? this.trailingIcon : this.leadingIcon;
/*     */ 
/*     */     
/* 518 */     if (leftIcon != null) {
/* 519 */       int x = r.x;
/* 520 */       int y = r.y + Math.round((r.height - leftIcon.getIconHeight()) / 2.0F);
/* 521 */       leftIcon.paintIcon(getComponent(), g, x, y);
/*     */ 
/*     */       
/* 524 */       int w = leftIcon.getIconWidth() + UIScale.scale(this.iconTextGap);
/* 525 */       r.x += w;
/* 526 */       r.width -= w;
/*     */     } 
/*     */ 
/*     */     
/* 530 */     if (rightIcon != null) {
/* 531 */       int iconWidth = rightIcon.getIconWidth();
/* 532 */       int x = r.x + r.width - iconWidth;
/* 533 */       int y = r.y + Math.round((r.height - rightIcon.getIconHeight()) / 2.0F);
/* 534 */       rightIcon.paintIcon(getComponent(), g, x, y);
/*     */ 
/*     */       
/* 537 */       r.width -= iconWidth + UIScale.scale(this.iconTextGap);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 543 */     return applyMinimumWidth(c, applyExtraSize(super.getPreferredSize(c)), this.minimumWidth);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getMinimumSize(JComponent c) {
/* 548 */     return applyMinimumWidth(c, applyExtraSize(super.getMinimumSize(c)), this.minimumWidth);
/*     */   }
/*     */ 
/*     */   
/*     */   private Dimension applyExtraSize(Dimension size) {
/* 553 */     size.width += getLeadingIconWidth() + getTrailingIconWidth();
/*     */ 
/*     */     
/* 556 */     for (JComponent comp : getLeadingComponents()) {
/* 557 */       if (comp != null && comp.isVisible())
/* 558 */         size.width += (comp.getPreferredSize()).width; 
/*     */     } 
/* 560 */     for (JComponent comp : getTrailingComponents()) {
/* 561 */       if (comp != null && comp.isVisible()) {
/* 562 */         size.width += (comp.getPreferredSize()).width;
/*     */       }
/*     */     } 
/* 565 */     return size;
/*     */   }
/*     */ 
/*     */   
/*     */   private Dimension applyMinimumWidth(JComponent c, Dimension size, int minimumWidth) {
/* 570 */     if (c instanceof JTextField && ((JTextField)c).getColumns() > 0) {
/* 571 */       return size;
/*     */     }
/*     */     
/* 574 */     if (!hasDefaultMargins(c, this.defaultMargin)) {
/* 575 */       return size;
/*     */     }
/*     */     
/* 578 */     Container parent = c.getParent();
/* 579 */     if (parent instanceof JComboBox || parent instanceof javax.swing.JSpinner || (parent != null && parent
/*     */       
/* 581 */       .getParent() instanceof javax.swing.JSpinner)) {
/* 582 */       return size;
/*     */     }
/* 584 */     minimumWidth = FlatUIUtils.minimumWidth(c, minimumWidth);
/* 585 */     float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
/* 586 */     size.width = Math.max(size.width, UIScale.scale(minimumWidth) + Math.round(focusWidth * 2.0F));
/* 587 */     return size;
/*     */   }
/*     */   
/*     */   static boolean hasDefaultMargins(JComponent c, Insets defaultMargin) {
/* 591 */     Insets margin = ((JTextComponent)c).getMargin();
/* 592 */     return (margin instanceof UIResource && Objects.equals(margin, defaultMargin));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Rectangle getVisibleEditorRect() {
/* 601 */     Rectangle r = getIconsRect();
/* 602 */     if (r == null) {
/* 603 */       return null;
/*     */     }
/*     */     
/* 606 */     int leading = getLeadingIconWidth();
/* 607 */     int trailing = getTrailingIconWidth();
/* 608 */     if (leading != 0 || trailing != 0) {
/* 609 */       boolean ltr = isLeftToRight();
/* 610 */       int left = ltr ? leading : trailing;
/* 611 */       int right = ltr ? trailing : leading;
/* 612 */       r.x += left;
/* 613 */       r.width -= left + right;
/*     */     } 
/*     */ 
/*     */     
/* 617 */     Insets padding = getPadding();
/* 618 */     if (padding != null) {
/* 619 */       r = FlatUIUtils.subtractInsets(r, padding);
/*     */     }
/*     */     
/* 622 */     r.width = Math.max(r.width, 0);
/* 623 */     r.height = Math.max(r.height, 0);
/*     */     
/* 625 */     return r;
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
/*     */   protected Rectangle getIconsRect() {
/* 637 */     Rectangle r = super.getVisibleEditorRect();
/* 638 */     if (r == null) {
/* 639 */       return null;
/*     */     }
/* 641 */     boolean ltr = isLeftToRight();
/*     */ 
/*     */     
/* 644 */     JComponent[] leftComponents = ltr ? getLeadingComponents() : getTrailingComponents();
/* 645 */     JComponent[] rightComponents = ltr ? getTrailingComponents() : getLeadingComponents();
/* 646 */     boolean leftVisible = false;
/* 647 */     boolean rightVisible = false;
/* 648 */     for (JComponent leftComponent : leftComponents) {
/* 649 */       if (leftComponent != null && leftComponent.isVisible()) {
/* 650 */         int w = (leftComponent.getPreferredSize()).width;
/* 651 */         r.x += w;
/* 652 */         r.width -= w;
/* 653 */         leftVisible = true;
/*     */       } 
/*     */     } 
/* 656 */     for (JComponent rightComponent : rightComponents) {
/* 657 */       if (rightComponent != null && rightComponent.isVisible()) {
/* 658 */         r.width -= (rightComponent.getPreferredSize()).width;
/* 659 */         rightVisible = true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 665 */     if (leftVisible || (ltr ? hasLeadingIcon() : hasTrailingIcon())) {
/*     */       
/* 667 */       Insets margin = getComponent().getMargin();
/* 668 */       int newLeftMargin = Math.min(margin.left, margin.top);
/* 669 */       if (newLeftMargin < margin.left) {
/* 670 */         int diff = UIScale.scale(margin.left - newLeftMargin);
/* 671 */         r.x -= diff;
/* 672 */         r.width += diff;
/*     */       } 
/*     */     } 
/* 675 */     if (rightVisible || (ltr ? hasTrailingIcon() : hasLeadingIcon())) {
/*     */       
/* 677 */       Insets margin = getComponent().getMargin();
/* 678 */       int newRightMargin = Math.min(margin.right, margin.top);
/* 679 */       if (newRightMargin < margin.left) {
/* 680 */         r.width += UIScale.scale(margin.right - newRightMargin);
/*     */       }
/*     */     } 
/*     */     
/* 684 */     r.width = Math.max(r.width, 0);
/* 685 */     r.height = Math.max(r.height, 0);
/*     */     
/* 687 */     return r;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean hasLeadingIcon() {
/* 692 */     return (this.leadingIcon != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean hasTrailingIcon() {
/* 697 */     return (this.trailingIcon != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getLeadingIconWidth() {
/* 702 */     return (this.leadingIcon != null) ? (this.leadingIcon.getIconWidth() + UIScale.scale(this.iconTextGap)) : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getTrailingIconWidth() {
/* 707 */     return (this.trailingIcon != null) ? (this.trailingIcon.getIconWidth() + UIScale.scale(this.iconTextGap)) : 0;
/*     */   }
/*     */   
/*     */   boolean isLeftToRight() {
/* 711 */     return getComponent().getComponentOrientation().isLeftToRight();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Insets getPadding() {
/* 716 */     return UIScale.scale((Insets)FlatClientProperties.clientProperty(getComponent(), "JTextField.padding", null, Insets.class));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void scrollCaretToVisible() {
/* 721 */     Caret caret = getComponent().getCaret();
/* 722 */     if (caret instanceof FlatCaret) {
/* 723 */       ((FlatCaret)caret).scrollCaretToVisible();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void installLeadingComponent() {
/* 728 */     JTextComponent c = getComponent();
/* 729 */     this.leadingComponent = (JComponent)FlatClientProperties.clientProperty(c, "JTextField.leadingComponent", null, JComponent.class);
/* 730 */     if (this.leadingComponent != null) {
/* 731 */       prepareLeadingOrTrailingComponent(this.leadingComponent);
/* 732 */       installLayout();
/* 733 */       c.add(this.leadingComponent);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installTrailingComponent() {
/* 739 */     JTextComponent c = getComponent();
/* 740 */     this.trailingComponent = (JComponent)FlatClientProperties.clientProperty(c, "JTextField.trailingComponent", null, JComponent.class);
/* 741 */     if (this.trailingComponent != null) {
/* 742 */       prepareLeadingOrTrailingComponent(this.trailingComponent);
/* 743 */       installLayout();
/* 744 */       c.add(this.trailingComponent);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallLeadingComponent() {
/* 750 */     if (this.leadingComponent != null) {
/* 751 */       getComponent().remove(this.leadingComponent);
/* 752 */       this.leadingComponent = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallTrailingComponent() {
/* 758 */     if (this.trailingComponent != null) {
/* 759 */       getComponent().remove(this.trailingComponent);
/* 760 */       this.trailingComponent = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installClearButton() {
/* 766 */     JTextComponent c = getComponent();
/* 767 */     if (FlatClientProperties.clientPropertyBoolean(c, "JTextField.showClearButton", this.showClearButton)) {
/* 768 */       this.clearButton = createClearButton();
/* 769 */       updateClearButton();
/* 770 */       installDocumentListener();
/* 771 */       installLayout();
/* 772 */       c.add(this.clearButton);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallClearButton() {
/* 778 */     if (this.clearButton != null) {
/* 779 */       getComponent().remove(this.clearButton);
/* 780 */       this.clearButton = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected JComponent createClearButton() {
/* 786 */     JButton button = new JButton();
/* 787 */     button.setName("TextField.clearButton");
/* 788 */     button.putClientProperty("FlatLaf.styleClass", "clearButton");
/* 789 */     button.putClientProperty("JButton.buttonType", "toolBarButton");
/* 790 */     button.setCursor(Cursor.getDefaultCursor());
/* 791 */     button.addActionListener(e -> clearButtonClicked());
/* 792 */     return button;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void clearButtonClicked() {
/* 798 */     JTextComponent c = getComponent();
/* 799 */     Object callback = c.getClientProperty("JTextField.clearCallback");
/* 800 */     if (callback instanceof Runnable) {
/* 801 */       ((Runnable)callback).run();
/* 802 */     } else if (callback instanceof Consumer) {
/* 803 */       ((Consumer<JTextComponent>)callback).accept(c);
/*     */     } else {
/* 805 */       c.setText("");
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void updateClearButton() {
/* 810 */     if (this.clearButton == null) {
/*     */       return;
/*     */     }
/* 813 */     JTextComponent c = getComponent();
/* 814 */     boolean visible = (c.isEnabled() && c.isEditable() && c.getDocument().getLength() > 0);
/* 815 */     if (visible != this.clearButton.isVisible()) {
/* 816 */       this.clearButton.setVisible(visible);
/* 817 */       c.revalidate();
/* 818 */       c.repaint();
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
/*     */   protected JComponent[] getLeadingComponents() {
/* 830 */     return new JComponent[] { this.leadingComponent };
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
/*     */   protected JComponent[] getTrailingComponents() {
/* 843 */     return new JComponent[] { this.trailingComponent, this.clearButton };
/*     */   }
/*     */ 
/*     */   
/*     */   protected void prepareLeadingOrTrailingComponent(JComponent c) {
/* 848 */     c.putClientProperty("FlatLaf.styleClass", "inTextField");
/*     */     
/* 850 */     if (c instanceof JButton || c instanceof javax.swing.JToggleButton) {
/* 851 */       c.putClientProperty("JButton.buttonType", "toolBarButton");
/*     */       
/* 853 */       if (!c.isCursorSet())
/* 854 */         c.setCursor(Cursor.getDefaultCursor()); 
/* 855 */     } else if (c instanceof javax.swing.JToolBar) {
/* 856 */       for (Component child : c.getComponents()) {
/* 857 */         if (child instanceof JComponent) {
/* 858 */           ((JComponent)child).putClientProperty("FlatLaf.styleClass", "inTextField");
/*     */         }
/*     */       } 
/* 861 */       if (!c.isCursorSet()) {
/* 862 */         c.setCursor(Cursor.getDefaultCursor());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void installLayout() {
/* 868 */     JTextComponent c = getComponent();
/* 869 */     LayoutManager oldLayout = c.getLayout();
/* 870 */     if (!(oldLayout instanceof FlatTextFieldLayout)) {
/* 871 */       c.setLayout(new FlatTextFieldLayout(oldLayout));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private class FlatTextFieldLayout
/*     */     implements LayoutManager2, UIResource
/*     */   {
/*     */     private final LayoutManager delegate;
/*     */     
/*     */     FlatTextFieldLayout(LayoutManager delegate) {
/* 882 */       this.delegate = delegate;
/*     */     }
/*     */ 
/*     */     
/*     */     public void addLayoutComponent(String name, Component comp) {
/* 887 */       if (this.delegate != null) {
/* 888 */         this.delegate.addLayoutComponent(name, comp);
/*     */       }
/*     */     }
/*     */     
/*     */     public void removeLayoutComponent(Component comp) {
/* 893 */       if (this.delegate != null) {
/* 894 */         this.delegate.removeLayoutComponent(comp);
/*     */       }
/*     */     }
/*     */     
/*     */     public Dimension preferredLayoutSize(Container parent) {
/* 899 */       return (this.delegate != null) ? this.delegate.preferredLayoutSize(parent) : null;
/*     */     }
/*     */ 
/*     */     
/*     */     public Dimension minimumLayoutSize(Container parent) {
/* 904 */       return (this.delegate != null) ? this.delegate.minimumLayoutSize(parent) : null;
/*     */     }
/*     */ 
/*     */     
/*     */     public void layoutContainer(Container parent) {
/* 909 */       if (this.delegate != null) {
/* 910 */         this.delegate.layoutContainer(parent);
/*     */       }
/* 912 */       int ow = FlatUIUtils.getBorderFocusAndLineWidth(FlatTextFieldUI.this.getComponent());
/* 913 */       int h = parent.getHeight() - ow - ow;
/* 914 */       boolean ltr = FlatTextFieldUI.this.isLeftToRight();
/* 915 */       JComponent[] leftComponents = ltr ? FlatTextFieldUI.this.getLeadingComponents() : FlatTextFieldUI.this.getTrailingComponents();
/* 916 */       JComponent[] rightComponents = ltr ? FlatTextFieldUI.this.getTrailingComponents() : FlatTextFieldUI.this.getLeadingComponents();
/*     */ 
/*     */       
/* 919 */       int x = ow;
/* 920 */       for (JComponent leftComponent : leftComponents) {
/* 921 */         if (leftComponent != null && leftComponent.isVisible()) {
/* 922 */           int cw = (leftComponent.getPreferredSize()).width;
/* 923 */           leftComponent.setBounds(x, ow, cw, h);
/* 924 */           x += cw;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 929 */       x = parent.getWidth() - ow;
/* 930 */       for (JComponent rightComponent : rightComponents) {
/* 931 */         if (rightComponent != null && rightComponent.isVisible()) {
/* 932 */           int cw = (rightComponent.getPreferredSize()).width;
/* 933 */           x -= cw;
/* 934 */           rightComponent.setBounds(x, ow, cw, h);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void addLayoutComponent(Component comp, Object constraints) {
/* 941 */       if (this.delegate instanceof LayoutManager2) {
/* 942 */         ((LayoutManager2)this.delegate).addLayoutComponent(comp, constraints);
/*     */       }
/*     */     }
/*     */     
/*     */     public Dimension maximumLayoutSize(Container target) {
/* 947 */       return (this.delegate instanceof LayoutManager2) ? ((LayoutManager2)this.delegate).maximumLayoutSize(target) : null;
/*     */     }
/*     */ 
/*     */     
/*     */     public float getLayoutAlignmentX(Container target) {
/* 952 */       return (this.delegate instanceof LayoutManager2) ? ((LayoutManager2)this.delegate).getLayoutAlignmentX(target) : 0.5F;
/*     */     }
/*     */ 
/*     */     
/*     */     public float getLayoutAlignmentY(Container target) {
/* 957 */       return (this.delegate instanceof LayoutManager2) ? ((LayoutManager2)this.delegate).getLayoutAlignmentY(target) : 0.5F;
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidateLayout(Container target) {
/* 962 */       if (this.delegate instanceof LayoutManager2) {
/* 963 */         ((LayoutManager2)this.delegate).invalidateLayout(target);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private class FlatDocumentListener
/*     */     implements DocumentListener
/*     */   {
/*     */     private FlatDocumentListener() {}
/*     */     
/*     */     public void insertUpdate(DocumentEvent e) {
/* 974 */       FlatTextFieldUI.this.documentChanged(e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void removeUpdate(DocumentEvent e) {
/* 979 */       FlatTextFieldUI.this.documentChanged(e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void changedUpdate(DocumentEvent e) {
/* 984 */       FlatTextFieldUI.this.documentChanged(e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTextFieldUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */