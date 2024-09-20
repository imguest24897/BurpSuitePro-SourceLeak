/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatClientProperties;
/*     */ import com.formdev.flatlaf.FlatLaf;
/*     */ import com.formdev.flatlaf.icons.FlatHelpButtonIcon;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.GradientPaint;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.geom.RoundRectangle2D;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.ButtonModel;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.JToolBar;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.plaf.ButtonUI;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.ToolBarUI;
/*     */ import javax.swing.plaf.basic.BasicButtonListener;
/*     */ import javax.swing.plaf.basic.BasicButtonUI;
/*     */ import javax.swing.plaf.basic.BasicHTML;
/*     */ import javax.swing.text.View;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlatButtonUI
/*     */   extends BasicButtonUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected int minimumWidth;
/*     */   protected int iconTextGap;
/*     */   protected Color background;
/*     */   protected Color foreground;
/*     */   protected Color startBackground;
/*     */   protected Color endBackground;
/*     */   @Styleable
/*     */   protected Color focusedBackground;
/*     */   @Styleable
/*     */   protected Color focusedForeground;
/*     */   @Styleable
/*     */   protected Color hoverBackground;
/*     */   @Styleable
/*     */   protected Color hoverForeground;
/*     */   @Styleable
/*     */   protected Color pressedBackground;
/*     */   @Styleable
/*     */   protected Color pressedForeground;
/*     */   @Styleable
/*     */   protected Color selectedBackground;
/*     */   @Styleable
/*     */   protected Color selectedForeground;
/*     */   @Styleable
/*     */   protected Color disabledBackground;
/*     */   @Styleable
/*     */   protected Color disabledText;
/*     */   @Styleable
/*     */   protected Color disabledSelectedBackground;
/*     */   @Styleable
/*     */   protected Color disabledSelectedForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultBackground;
/*     */   protected Color defaultEndBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultFocusedBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultFocusedForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultHoverBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultHoverForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultPressedBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultPressedForeground;
/*     */   @Styleable(dot = true)
/*     */   protected boolean defaultBoldText;
/*     */   @Styleable
/*     */   protected boolean paintShadow;
/*     */   @Styleable
/*     */   protected int shadowWidth;
/*     */   @Styleable
/*     */   protected Color shadowColor;
/*     */   @Styleable(dot = true)
/*     */   protected Color defaultShadowColor;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarHoverBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarHoverForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarPressedBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarPressedForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarSelectedBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarSelectedForeground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarDisabledSelectedBackground;
/*     */   @Styleable(dot = true)
/*     */   protected Color toolbarDisabledSelectedForeground;
/*     */   @Styleable
/*     */   protected String buttonType;
/*     */   @Styleable
/*     */   protected boolean squareSize;
/*     */   @Styleable
/*     */   protected int minimumHeight;
/*     */   private Icon helpButtonIcon;
/*     */   private Insets defaultMargin;
/*     */   private final boolean shared;
/*     */   private boolean helpButtonIconShared = true;
/*     */   private boolean defaults_initialized = false;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   private AtomicBoolean borderShared;
/*     */   static final int TYPE_OTHER = -1;
/*     */   static final int TYPE_SQUARE = 0;
/*     */   static final int TYPE_ROUND_RECT = 1;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 189 */     return (FlatUIUtils.canUseSharedUI(c) && !FlatUIUtils.needsLightAWTPeer(c)) ? 
/* 190 */       FlatUIUtils.createSharedUI(FlatButtonUI.class, () -> new FlatButtonUI(true)) : 
/* 191 */       new FlatButtonUI(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected FlatButtonUI(boolean shared) {
/* 196 */     this.shared = shared;
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 201 */     if (FlatUIUtils.needsLightAWTPeer(c)) {
/* 202 */       FlatUIUtils.runWithLightAWTPeerUIDefaults(() -> installUIImpl(c));
/*     */     } else {
/* 204 */       installUIImpl(c);
/*     */     } 
/*     */   }
/*     */   private void installUIImpl(JComponent c) {
/* 208 */     super.installUI(c);
/*     */     
/* 210 */     installStyle((AbstractButton)c);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults(AbstractButton b) {
/* 215 */     super.installDefaults(b);
/*     */     
/* 217 */     if (!this.defaults_initialized) {
/* 218 */       String prefix = getPropertyPrefix();
/*     */       
/* 220 */       this.minimumWidth = UIManager.getInt(prefix + "minimumWidth");
/* 221 */       this.iconTextGap = FlatUIUtils.getUIInt(prefix + "iconTextGap", 4);
/*     */       
/* 223 */       this.background = UIManager.getColor(prefix + "background");
/* 224 */       this.foreground = UIManager.getColor(prefix + "foreground");
/*     */       
/* 226 */       this.startBackground = UIManager.getColor(prefix + "startBackground");
/* 227 */       this.endBackground = UIManager.getColor(prefix + "endBackground");
/* 228 */       this.focusedBackground = UIManager.getColor(prefix + "focusedBackground");
/* 229 */       this.focusedForeground = UIManager.getColor(prefix + "focusedForeground");
/* 230 */       this.hoverBackground = UIManager.getColor(prefix + "hoverBackground");
/* 231 */       this.hoverForeground = UIManager.getColor(prefix + "hoverForeground");
/* 232 */       this.pressedBackground = UIManager.getColor(prefix + "pressedBackground");
/* 233 */       this.pressedForeground = UIManager.getColor(prefix + "pressedForeground");
/* 234 */       this.selectedBackground = UIManager.getColor(prefix + "selectedBackground");
/* 235 */       this.selectedForeground = UIManager.getColor(prefix + "selectedForeground");
/* 236 */       this.disabledBackground = UIManager.getColor(prefix + "disabledBackground");
/* 237 */       this.disabledText = UIManager.getColor(prefix + "disabledText");
/* 238 */       this.disabledSelectedBackground = UIManager.getColor(prefix + "disabledSelectedBackground");
/* 239 */       this.disabledSelectedForeground = UIManager.getColor(prefix + "disabledSelectedForeground");
/*     */       
/* 241 */       this.defaultBackground = FlatUIUtils.getUIColor("Button.default.startBackground", "Button.default.background");
/* 242 */       this.defaultEndBackground = UIManager.getColor("Button.default.endBackground");
/* 243 */       this.defaultForeground = UIManager.getColor("Button.default.foreground");
/* 244 */       this.defaultFocusedBackground = UIManager.getColor("Button.default.focusedBackground");
/* 245 */       this.defaultFocusedForeground = UIManager.getColor("Button.default.focusedForeground");
/* 246 */       this.defaultHoverBackground = UIManager.getColor("Button.default.hoverBackground");
/* 247 */       this.defaultHoverForeground = UIManager.getColor("Button.default.hoverForeground");
/* 248 */       this.defaultPressedBackground = UIManager.getColor("Button.default.pressedBackground");
/* 249 */       this.defaultPressedForeground = UIManager.getColor("Button.default.pressedForeground");
/* 250 */       this.defaultBoldText = UIManager.getBoolean("Button.default.boldText");
/*     */       
/* 252 */       this.paintShadow = UIManager.getBoolean("Button.paintShadow");
/* 253 */       this.shadowWidth = FlatUIUtils.getUIInt("Button.shadowWidth", 2);
/* 254 */       this.shadowColor = UIManager.getColor("Button.shadowColor");
/* 255 */       this.defaultShadowColor = UIManager.getColor("Button.default.shadowColor");
/*     */       
/* 257 */       this.toolbarHoverBackground = UIManager.getColor(prefix + "toolbar.hoverBackground");
/* 258 */       this.toolbarHoverForeground = UIManager.getColor(prefix + "toolbar.hoverForeground");
/* 259 */       this.toolbarPressedBackground = UIManager.getColor(prefix + "toolbar.pressedBackground");
/* 260 */       this.toolbarPressedForeground = UIManager.getColor(prefix + "toolbar.pressedForeground");
/* 261 */       this.toolbarSelectedBackground = UIManager.getColor(prefix + "toolbar.selectedBackground");
/* 262 */       this.toolbarSelectedForeground = UIManager.getColor(prefix + "toolbar.selectedForeground");
/* 263 */       this.toolbarDisabledSelectedBackground = UIManager.getColor(prefix + "toolbar.disabledSelectedBackground");
/* 264 */       this.toolbarDisabledSelectedForeground = UIManager.getColor(prefix + "toolbar.disabledSelectedForeground");
/*     */       
/* 266 */       this.helpButtonIcon = UIManager.getIcon("HelpButton.icon");
/* 267 */       this.defaultMargin = UIManager.getInsets(prefix + "margin");
/*     */       
/* 269 */       this.helpButtonIconShared = true;
/* 270 */       this.defaults_initialized = true;
/*     */     } 
/*     */     
/* 273 */     if (this.startBackground != null) {
/* 274 */       Color bg = b.getBackground();
/* 275 */       if (bg == null || bg instanceof javax.swing.plaf.UIResource) {
/* 276 */         b.setBackground(this.startBackground);
/*     */       }
/*     */     } 
/* 279 */     LookAndFeel.installProperty(b, "opaque", Boolean.valueOf(false));
/* 280 */     LookAndFeel.installProperty(b, "iconTextGap", Integer.valueOf(UIScale.scale(this.iconTextGap)));
/*     */     
/* 282 */     MigLayoutVisualPadding.install(b);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults(AbstractButton b) {
/* 287 */     super.uninstallDefaults(b);
/*     */     
/* 289 */     this.oldStyleValues = null;
/* 290 */     this.borderShared = null;
/*     */     
/* 292 */     MigLayoutVisualPadding.uninstall(b);
/* 293 */     this.defaults_initialized = false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected BasicButtonListener createButtonListener(AbstractButton b) {
/* 298 */     return new FlatButtonListener(b);
/*     */   }
/*     */   
/*     */   protected void propertyChange(AbstractButton b, PropertyChangeEvent e) {
/* 302 */     switch (e.getPropertyName()) {
/*     */       case "JButton.squareSize":
/*     */       case "JComponent.minimumWidth":
/*     */       case "JComponent.minimumHeight":
/* 306 */         b.revalidate();
/*     */         break;
/*     */       
/*     */       case "JButton.buttonType":
/* 310 */         b.revalidate();
/* 311 */         b.repaint();
/*     */         break;
/*     */       
/*     */       case "JComponent.outline":
/* 315 */         b.repaint();
/*     */         break;
/*     */       
/*     */       case "FlatLaf.style":
/*     */       case "FlatLaf.styleClass":
/* 320 */         if (this.shared && FlatStylingSupport.hasStyleProperty(b)) {
/*     */ 
/*     */           
/* 323 */           b.updateUI();
/*     */         } else {
/* 325 */           installStyle(b);
/* 326 */         }  b.revalidate();
/* 327 */         b.repaint();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle(AbstractButton b) {
/*     */     try {
/* 335 */       applyStyle(b, FlatStylingSupport.getResolvedStyle(b, getStyleType()));
/* 336 */     } catch (RuntimeException ex) {
/* 337 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   String getStyleType() {
/* 343 */     return "Button";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(AbstractButton b, Object style) {
/* 348 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, (key, value) -> applyStyleProperty(b, key, value));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(AbstractButton b, String key, Object value) {
/* 354 */     if (key.startsWith("help.")) {
/* 355 */       if (!(this.helpButtonIcon instanceof FlatHelpButtonIcon)) {
/* 356 */         return new FlatStylingSupport.UnknownStyleException(key);
/*     */       }
/* 358 */       if (this.helpButtonIconShared) {
/* 359 */         this.helpButtonIcon = FlatStylingSupport.cloneIcon(this.helpButtonIcon);
/* 360 */         this.helpButtonIconShared = false;
/*     */       } 
/*     */       
/* 363 */       key = key.substring("help.".length());
/* 364 */       return ((FlatHelpButtonIcon)this.helpButtonIcon).applyStyleProperty(key, value);
/*     */     } 
/*     */     
/* 367 */     if ("iconTextGap".equals(key) && value instanceof Integer) {
/* 368 */       value = Integer.valueOf(UIScale.scale(((Integer)value).intValue()));
/*     */     }
/* 370 */     if (this.borderShared == null)
/* 371 */       this.borderShared = new AtomicBoolean(true); 
/* 372 */     return FlatStylingSupport.applyToAnnotatedObjectOrBorder(this, key, value, b, this.borderShared);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 378 */     Map<String, Class<?>> infos = FlatStylingSupport.getAnnotatedStyleableInfos(this, c.getBorder());
/* 379 */     if (this.helpButtonIcon instanceof FlatHelpButtonIcon)
/* 380 */       FlatStylingSupport.putAllPrefixKey(infos, "help.", ((FlatHelpButtonIcon)this.helpButtonIcon).getStyleableInfos()); 
/* 381 */     return infos;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 387 */     if (key.startsWith("help.")) {
/* 388 */       return (this.helpButtonIcon instanceof FlatHelpButtonIcon) ? (
/* 389 */         (FlatHelpButtonIcon)this.helpButtonIcon).getStyleableValue(key.substring("help.".length())) : 
/* 390 */         null;
/*     */     }
/*     */     
/* 393 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, c.getBorder(), key);
/*     */   }
/*     */   
/*     */   static boolean isContentAreaFilled(Component c) {
/* 397 */     return (!(c instanceof AbstractButton) || ((AbstractButton)c).isContentAreaFilled());
/*     */   }
/*     */   
/*     */   public static boolean isFocusPainted(Component c) {
/* 401 */     return (!(c instanceof AbstractButton) || ((AbstractButton)c).isFocusPainted());
/*     */   }
/*     */   
/*     */   static boolean isDefaultButton(Component c) {
/* 405 */     return (c instanceof JButton && ((JButton)c).isDefaultButton());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static boolean isIconOnlyOrSingleCharacterButton(Component c) {
/* 413 */     if (!(c instanceof JButton) && !(c instanceof javax.swing.JToggleButton)) {
/* 414 */       return false;
/*     */     }
/* 416 */     Icon icon = ((AbstractButton)c).getIcon();
/* 417 */     String text = ((AbstractButton)c).getText();
/* 418 */     return ((icon != null && (text == null || text.isEmpty())) || (icon == null && text != null && ("..."
/*     */       
/* 420 */       .equals(text) || text
/* 421 */       .length() == 1 || (text
/* 422 */       .length() == 2 && Character.isSurrogatePair(text.charAt(0), text.charAt(1))))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static int getButtonType(Component c) {
/* 430 */     if (!(c instanceof AbstractButton)) {
/* 431 */       return -1;
/*     */     }
/* 433 */     String value = getButtonTypeStr((AbstractButton)c);
/* 434 */     if (value == null) {
/* 435 */       return -1;
/*     */     }
/* 437 */     switch (value) { case "square":
/* 438 */         return 0;
/* 439 */       case "roundRect": return 1; }
/* 440 */      return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   static boolean isHelpButton(Component c) {
/* 445 */     return (c instanceof JButton && "help".equals(getButtonTypeStr((JButton)c)));
/*     */   }
/*     */   
/*     */   static boolean isToolBarButton(Component c) {
/* 449 */     return (c.getParent() instanceof JToolBar || (c instanceof AbstractButton && "toolBarButton"
/* 450 */       .equals(getButtonTypeStr((AbstractButton)c))));
/*     */   }
/*     */   
/*     */   static boolean isBorderlessButton(Component c) {
/* 454 */     return (c instanceof AbstractButton && "borderless".equals(getButtonTypeStr((AbstractButton)c)));
/*     */   }
/*     */ 
/*     */   
/*     */   static String getButtonTypeStr(AbstractButton c) {
/* 459 */     Object value = c.getClientProperty("JButton.buttonType");
/* 460 */     if (value instanceof String) {
/* 461 */       return (String)value;
/*     */     }
/*     */     
/* 464 */     ButtonUI ui = c.getUI();
/* 465 */     return (ui instanceof FlatButtonUI) ? ((FlatButtonUI)ui).buttonType : null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(Graphics g, JComponent c) {
/* 471 */     if (c.isOpaque()) {
/* 472 */       FlatUIUtils.paintParentBackground(g, c);
/*     */     }
/* 474 */     if (isHelpButton(c)) {
/* 475 */       this.helpButtonIcon.paintIcon(c, g, 0, 0);
/*     */       
/*     */       return;
/*     */     } 
/* 479 */     if (isContentAreaFilled(c)) {
/* 480 */       paintBackground(g, c);
/*     */     }
/* 482 */     paint(g, c);
/*     */   }
/*     */   
/*     */   protected void paintBackground(Graphics g, JComponent c) {
/* 486 */     Color background = getBackground(c);
/* 487 */     if (background == null) {
/*     */       return;
/*     */     }
/* 490 */     Graphics2D g2 = (Graphics2D)g.create();
/*     */     try {
/* 492 */       FlatUIUtils.setRenderingHints(g2);
/*     */       
/* 494 */       boolean def = isDefaultButton(c);
/* 495 */       boolean isToolBarButton = isToolBarButton(c);
/* 496 */       float focusWidth = isToolBarButton ? 0.0F : FlatUIUtils.getBorderFocusWidth(c);
/* 497 */       float arc = FlatUIUtils.getBorderArc(c);
/* 498 */       float textFieldArc = 0.0F;
/*     */ 
/*     */ 
/*     */       
/* 502 */       if (isToolBarButton && (
/* 503 */         (String)FlatClientProperties.clientProperty(c, "FlatLaf.styleClass", "", String.class)).contains("inTextField")) {
/*     */         
/* 505 */         JTextField textField = (JTextField)SwingUtilities.getAncestorOfClass(JTextField.class, c);
/* 506 */         if (textField != null) {
/* 507 */           textFieldArc = FlatUIUtils.getBorderArc(textField);
/*     */         }
/*     */       } 
/* 510 */       int x = 0;
/* 511 */       int y = 0;
/* 512 */       int width = c.getWidth();
/* 513 */       int height = c.getHeight();
/*     */       
/* 515 */       if (isToolBarButton && c.getBorder() instanceof FlatButtonBorder) {
/* 516 */         Insets spacing = UIScale.scale(((FlatButtonBorder)c.getBorder()).toolbarSpacingInsets);
/* 517 */         x += spacing.left;
/* 518 */         y += spacing.top;
/* 519 */         width -= spacing.left + spacing.right;
/* 520 */         height -= spacing.top + spacing.bottom;
/*     */ 
/*     */         
/* 523 */         textFieldArc -= (spacing.top + spacing.bottom);
/*     */       } 
/*     */ 
/*     */       
/* 527 */       if (arc < textFieldArc) {
/* 528 */         arc = textFieldArc;
/*     */       }
/*     */       
/* 531 */       Color shadowColor = def ? this.defaultShadowColor : this.shadowColor;
/* 532 */       if (this.paintShadow && shadowColor != null && this.shadowWidth > 0 && focusWidth > 0.0F && c
/* 533 */         .isEnabled() && !isToolBarButton && 
/* 534 */         !isBorderlessButton(c) && (
/* 535 */         !isFocusPainted(c) || !FlatUIUtils.isPermanentFocusOwner(c))) {
/*     */         
/* 537 */         g2.setColor(shadowColor);
/* 538 */         g2.fill(new RoundRectangle2D.Float(focusWidth, focusWidth + UIScale.scale(this.shadowWidth), width - focusWidth * 2.0F, height - focusWidth * 2.0F, arc, arc));
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 543 */       Color startBg = def ? this.defaultBackground : this.startBackground;
/* 544 */       Color endBg = def ? this.defaultEndBackground : this.endBackground;
/* 545 */       if (background == startBg && endBg != null && !startBg.equals(endBg)) {
/* 546 */         g2.setPaint(new GradientPaint(0.0F, 0.0F, startBg, 0.0F, height, endBg));
/*     */       } else {
/* 548 */         g2.setColor(FlatUIUtils.deriveColor(background, getBackgroundBase(c, def)));
/*     */       } 
/* 550 */       FlatUIUtils.paintComponentBackground(g2, x, y, width, height, focusWidth, arc);
/*     */     } finally {
/* 552 */       g2.dispose();
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
/*     */   public void paint(Graphics g, JComponent c) {
/* 564 */     g = FlatLabelUI.createGraphicsHTMLTextYCorrection(g, c);
/*     */     
/* 566 */     AbstractButton b = (AbstractButton)c;
/*     */ 
/*     */     
/* 569 */     String clippedText = layout(b, b.getFontMetrics(b.getFont()), b.getWidth(), b.getHeight());
/*     */ 
/*     */     
/* 572 */     clearTextShiftOffset();
/*     */ 
/*     */     
/* 575 */     ButtonModel model = b.getModel();
/* 576 */     if (model.isArmed() && model.isPressed()) {
/* 577 */       paintButtonPressed(g, b);
/*     */     }
/*     */     
/* 580 */     if (b.getIcon() != null) {
/* 581 */       paintIcon(g, b, iconR);
/*     */     }
/*     */     
/* 584 */     if (clippedText != null && !clippedText.isEmpty()) {
/* 585 */       View view = (View)b.getClientProperty("html");
/* 586 */       if (view != null) {
/* 587 */         view.paint(g, textR);
/*     */       } else {
/* 589 */         paintText(g, b, textR, clippedText);
/*     */       } 
/*     */     } 
/*     */     
/* 593 */     if (b.isFocusPainted() && b.hasFocus()) {
/* 594 */       paintFocus(g, b, viewR, textR, iconR);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintIcon(Graphics g, JComponent c, Rectangle iconRect) {
/* 600 */     int xOffset = defaultBoldPlainWidthDiff(c) / 2;
/* 601 */     if (xOffset > 0) {
/* 602 */       boolean ltr = c.getComponentOrientation().isLeftToRight();
/* 603 */       switch (((AbstractButton)c).getHorizontalTextPosition()) { case 4:
/* 604 */           iconRect.x -= xOffset; break;
/* 605 */         case 2: iconRect.x += xOffset; break;
/* 606 */         case 11: iconRect.x -= ltr ? xOffset : -xOffset; break;
/* 607 */         case 10: iconRect.x += ltr ? xOffset : -xOffset;
/*     */           break; }
/*     */     
/*     */     } 
/* 611 */     super.paintIcon(g, c, iconRect);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintText(Graphics g, AbstractButton b, Rectangle textRect, String text) {
/* 616 */     if (isHelpButton(b)) {
/*     */       return;
/*     */     }
/* 619 */     if (this.defaultBoldText && isDefaultButton(b) && b.getFont() instanceof javax.swing.plaf.UIResource) {
/* 620 */       Font boldFont = g.getFont().deriveFont(1);
/* 621 */       g.setFont(boldFont);
/*     */       
/* 623 */       int boldWidth = b.getFontMetrics(boldFont).stringWidth(text);
/* 624 */       if (boldWidth > textRect.width) {
/* 625 */         textRect.x -= (boldWidth - textRect.width) / 2;
/* 626 */         textRect.width = boldWidth;
/*     */       } 
/*     */     } 
/*     */     
/* 630 */     paintText(g, b, textRect, text, getForeground(b));
/*     */   }
/*     */   
/*     */   public static void paintText(Graphics g, AbstractButton b, Rectangle textRect, String text, Color foreground) {
/* 634 */     if (foreground == null)
/* 635 */       foreground = Color.red; 
/* 636 */     FontMetrics fm = b.getFontMetrics(b.getFont());
/* 637 */     int mnemonicIndex = FlatLaf.isShowMnemonics() ? b.getDisplayedMnemonicIndex() : -1;
/*     */     
/* 639 */     g.setColor(foreground);
/* 640 */     FlatUIUtils.drawStringUnderlineCharAt(b, g, text, mnemonicIndex, textRect.x, textRect.y + fm
/* 641 */         .getAscent());
/*     */   }
/*     */   
/*     */   protected Color getBackground(JComponent c) {
/* 645 */     boolean toolBarButton = (isToolBarButton(c) || isBorderlessButton(c));
/*     */ 
/*     */     
/* 648 */     if (((AbstractButton)c).isSelected())
/*     */     {
/*     */ 
/*     */       
/* 652 */       return buttonStateColor(c, 
/* 653 */           toolBarButton ? this.toolbarSelectedBackground : this.selectedBackground, 
/* 654 */           toolBarButton ? (
/* 655 */           (this.toolbarDisabledSelectedBackground != null) ? this.toolbarDisabledSelectedBackground : this.toolbarSelectedBackground) : 
/* 656 */           this.disabledSelectedBackground, (Color)null, (Color)null, 
/*     */ 
/*     */           
/* 659 */           toolBarButton ? this.toolbarPressedBackground : this.pressedBackground);
/*     */     }
/*     */ 
/*     */     
/* 663 */     if (toolBarButton) {
/* 664 */       Color bg = c.getBackground();
/* 665 */       return buttonStateColor(c, 
/* 666 */           isCustomBackground(bg) ? bg : null, (Color)null, (Color)null, this.toolbarHoverBackground, this.toolbarPressedBackground);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 673 */     boolean def = isDefaultButton(c);
/* 674 */     return buttonStateColor(c, 
/* 675 */         getBackgroundBase(c, def), this.disabledBackground, 
/*     */         
/* 677 */         isCustomBackground(c.getBackground()) ? null : (def ? this.defaultFocusedBackground : this.focusedBackground), 
/* 678 */         def ? this.defaultHoverBackground : this.hoverBackground, 
/* 679 */         def ? this.defaultPressedBackground : this.pressedBackground);
/*     */   }
/*     */   
/*     */   protected Color getBackgroundBase(JComponent c, boolean def) {
/* 683 */     if (FlatUIUtils.isAWTPeer(c)) {
/* 684 */       return this.background;
/*     */     }
/*     */     
/* 687 */     Color bg = c.getBackground();
/* 688 */     if (isCustomBackground(bg)) {
/* 689 */       return bg;
/*     */     }
/* 691 */     return def ? this.defaultBackground : bg;
/*     */   }
/*     */   
/*     */   protected boolean isCustomBackground(Color bg) {
/* 695 */     return (bg != this.background && (this.startBackground == null || bg != this.startBackground));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Color buttonStateColor(Component c, Color enabledColor, Color disabledColor, Color focusedColor, Color hoverColor, Color pressedColor) {
/* 701 */     if (c == null) {
/* 702 */       return enabledColor;
/*     */     }
/* 704 */     if (!c.isEnabled()) {
/* 705 */       return disabledColor;
/*     */     }
/* 707 */     if (c instanceof AbstractButton) {
/* 708 */       ButtonModel model = ((AbstractButton)c).getModel();
/*     */       
/* 710 */       if (pressedColor != null && model.isPressed()) {
/* 711 */         return pressedColor;
/*     */       }
/* 713 */       if (hoverColor != null && model.isRollover()) {
/* 714 */         return hoverColor;
/*     */       }
/*     */     } 
/* 717 */     if (focusedColor != null && isFocusPainted(c) && FlatUIUtils.isPermanentFocusOwner(c)) {
/* 718 */       return focusedColor;
/*     */     }
/* 720 */     return enabledColor;
/*     */   }
/*     */   
/*     */   protected Color getForeground(JComponent c) {
/* 724 */     boolean toolBarButton = (isToolBarButton(c) || isBorderlessButton(c));
/*     */ 
/*     */     
/* 727 */     if (((AbstractButton)c).isSelected()) {
/* 728 */       return buttonStateColor(c, 
/* 729 */           toolBarButton ? (
/* 730 */           (this.toolbarSelectedForeground != null) ? this.toolbarSelectedForeground : c.getForeground()) : 
/* 731 */           this.selectedForeground, 
/* 732 */           toolBarButton ? (
/* 733 */           (this.toolbarDisabledSelectedForeground != null) ? this.toolbarDisabledSelectedForeground : this.disabledText) : (
/* 734 */           (this.disabledSelectedForeground != null) ? this.disabledSelectedForeground : this.disabledText), (Color)null, (Color)null, 
/*     */ 
/*     */           
/* 737 */           toolBarButton ? this.toolbarPressedForeground : this.pressedForeground);
/*     */     }
/*     */ 
/*     */     
/* 741 */     if (toolBarButton) {
/* 742 */       return buttonStateColor(c, c
/* 743 */           .getForeground(), this.disabledText, (Color)null, this.toolbarHoverForeground, this.toolbarPressedForeground);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 750 */     boolean def = isDefaultButton(c);
/* 751 */     return buttonStateColor(c, 
/* 752 */         getForegroundBase(c, def), this.disabledText, 
/*     */         
/* 754 */         isCustomForeground(c.getForeground()) ? null : (def ? this.defaultFocusedForeground : this.focusedForeground), 
/* 755 */         def ? this.defaultHoverForeground : this.hoverForeground, 
/* 756 */         def ? this.defaultPressedForeground : this.pressedForeground);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected Color getForegroundBase(JComponent c, boolean def) {
/* 762 */     Color fg = c.getForeground();
/* 763 */     if (isCustomForeground(fg)) {
/* 764 */       return fg;
/*     */     }
/* 766 */     return def ? this.defaultForeground : fg;
/*     */   }
/*     */   
/*     */   protected boolean isCustomForeground(Color fg) {
/* 770 */     return (fg != this.foreground);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getPreferredSize(JComponent c) {
/* 775 */     if (isHelpButton(c)) {
/* 776 */       return new Dimension(this.helpButtonIcon.getIconWidth(), this.helpButtonIcon.getIconHeight());
/*     */     }
/* 778 */     Dimension prefSize = super.getPreferredSize(c);
/* 779 */     if (prefSize == null) {
/* 780 */       return null;
/*     */     }
/*     */     
/* 783 */     prefSize.width += defaultBoldPlainWidthDiff(c);
/*     */ 
/*     */     
/* 786 */     boolean isIconOnlyOrSingleCharacter = isIconOnlyOrSingleCharacterButton(c);
/* 787 */     if (FlatClientProperties.clientPropertyBoolean(c, "JButton.squareSize", this.squareSize)) {
/*     */       
/* 789 */       prefSize.width = prefSize.height = Math.max(prefSize.width, prefSize.height);
/* 790 */     } else if (isIconOnlyOrSingleCharacter && ((AbstractButton)c).getIcon() == null) {
/*     */       
/* 792 */       prefSize.width = Math.max(prefSize.width, prefSize.height);
/* 793 */     } else if (!isIconOnlyOrSingleCharacter && !isToolBarButton(c) && c
/* 794 */       .getBorder() instanceof FlatButtonBorder && hasDefaultMargins(c)) {
/*     */ 
/*     */       
/* 797 */       int fw = Math.round(FlatUIUtils.getBorderFocusWidth(c) * 2.0F);
/* 798 */       prefSize.width = Math.max(prefSize.width, UIScale.scale(FlatUIUtils.minimumWidth(c, this.minimumWidth)) + fw);
/* 799 */       prefSize.height = Math.max(prefSize.height, UIScale.scale(FlatUIUtils.minimumHeight(c, this.minimumHeight)) + fw);
/*     */     } 
/*     */     
/* 802 */     return prefSize;
/*     */   }
/*     */   
/*     */   private int defaultBoldPlainWidthDiff(JComponent c) {
/* 806 */     if (this.defaultBoldText && isDefaultButton(c) && c.getFont() instanceof javax.swing.plaf.UIResource) {
/* 807 */       String text = ((AbstractButton)c).getText();
/* 808 */       if (text == null || text.isEmpty()) {
/* 809 */         return 0;
/*     */       }
/* 811 */       Font font = c.getFont();
/* 812 */       Font boldFont = font.deriveFont(1);
/* 813 */       int boldWidth = c.getFontMetrics(boldFont).stringWidth(text);
/* 814 */       int plainWidth = c.getFontMetrics(font).stringWidth(text);
/* 815 */       if (boldWidth > plainWidth) {
/* 816 */         return boldWidth - plainWidth;
/*     */       }
/*     */     } 
/* 819 */     return 0;
/*     */   }
/*     */   
/*     */   private boolean hasDefaultMargins(JComponent c) {
/* 823 */     Insets margin = ((AbstractButton)c).getMargin();
/* 824 */     return (margin instanceof javax.swing.plaf.UIResource && Objects.equals(margin, this.defaultMargin));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBaseline(JComponent c, int width, int height) {
/* 829 */     return getBaselineImpl(c, width, height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static int getBaselineImpl(JComponent c, int width, int height) {
/* 839 */     if (width < 0 || height < 0) {
/* 840 */       throw new IllegalArgumentException();
/*     */     }
/* 842 */     AbstractButton b = (AbstractButton)c;
/* 843 */     String text = b.getText();
/* 844 */     if (text == null || text.isEmpty()) {
/* 845 */       return -1;
/*     */     }
/* 847 */     FontMetrics fm = b.getFontMetrics(b.getFont());
/* 848 */     layout(b, fm, width, height);
/*     */     
/* 850 */     View view = (View)b.getClientProperty("html");
/* 851 */     if (view != null) {
/*     */       
/* 853 */       int baseline = BasicHTML.getHTMLBaseline(view, textR.width, textR.height);
/* 854 */       return (baseline >= 0) ? (textR.y + baseline) : baseline;
/*     */     } 
/* 856 */     return textR.y + fm.getAscent();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String layout(AbstractButton b, FontMetrics fm, int width, int height) {
/* 867 */     Insets insets = b.getInsets();
/* 868 */     viewR.setBounds(insets.left, insets.top, width - insets.left - insets.right, height - insets.top - insets.bottom);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 873 */     textR.setBounds(0, 0, 0, 0);
/* 874 */     iconR.setBounds(0, 0, 0, 0);
/*     */     
/* 876 */     String text = b.getText();
/* 877 */     return SwingUtilities.layoutCompoundLabel(b, fm, text, b.getIcon(), b
/* 878 */         .getVerticalAlignment(), b.getHorizontalAlignment(), b
/* 879 */         .getVerticalTextPosition(), b.getHorizontalTextPosition(), viewR, iconR, textR, 
/*     */         
/* 881 */         (text != null) ? b.getIconTextGap() : 0);
/*     */   }
/*     */   
/* 884 */   private static Rectangle viewR = new Rectangle();
/* 885 */   private static Rectangle textR = new Rectangle();
/* 886 */   private static Rectangle iconR = new Rectangle();
/*     */ 
/*     */   
/*     */   protected class FlatButtonListener
/*     */     extends BasicButtonListener
/*     */   {
/*     */     private final AbstractButton b;
/*     */ 
/*     */     
/*     */     protected FlatButtonListener(AbstractButton b) {
/* 896 */       super(b);
/* 897 */       this.b = b;
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 902 */       super.propertyChange(e);
/* 903 */       FlatButtonUI.this.propertyChange(this.b, e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void stateChanged(ChangeEvent e) {
/* 908 */       super.stateChanged(e);
/*     */ 
/*     */       
/* 911 */       AbstractButton b = (AbstractButton)e.getSource();
/* 912 */       Container parent = b.getParent();
/* 913 */       if (parent instanceof JToolBar) {
/* 914 */         JToolBar toolBar = (JToolBar)parent;
/* 915 */         ToolBarUI ui = toolBar.getUI();
/* 916 */         if (ui instanceof FlatToolBarUI)
/* 917 */           ((FlatToolBarUI)ui).repaintButtonGroup(b); 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatButtonUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */