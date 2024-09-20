/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.Shape;
/*     */ import java.awt.event.FocusEvent;
/*     */ import java.awt.event.FocusListener;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.atomic.AtomicBoolean;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JSpinner;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicSpinnerUI;
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
/*     */ public class FlatSpinnerUI
/*     */   extends BasicSpinnerUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   private Handler handler;
/*     */   @Styleable
/*     */   protected int minimumWidth;
/*     */   @Styleable
/*     */   protected String buttonStyle;
/*     */   @Styleable
/*     */   protected String arrowType;
/*     */   @Styleable
/*     */   protected Color disabledBackground;
/*     */   @Styleable
/*     */   protected Color disabledForeground;
/*     */   @Styleable
/*     */   protected Color focusedBackground;
/*     */   @Styleable
/*     */   protected Color buttonBackground;
/*     */   @Styleable
/*     */   protected float buttonSeparatorWidth;
/*     */   @Styleable
/*     */   protected Color buttonSeparatorColor;
/*     */   @Styleable
/*     */   protected Color buttonDisabledSeparatorColor;
/*     */   @Styleable
/*     */   protected Color buttonArrowColor;
/*     */   @Styleable
/*     */   protected Color buttonDisabledArrowColor;
/*     */   @Styleable
/*     */   protected Color buttonHoverArrowColor;
/*     */   @Styleable
/*     */   protected Color buttonPressedArrowColor;
/*     */   @Styleable
/*     */   protected Insets padding;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   private AtomicBoolean borderShared;
/*     */   private static final int MAC_STEPPER_WIDTH = 15;
/*     */   private static final int MAC_STEPPER_GAP = 3;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 111 */     return new FlatSpinnerUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 116 */     super.installUI(c);
/*     */     
/* 118 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 123 */     super.installDefaults();
/*     */     
/* 125 */     LookAndFeel.installProperty(this.spinner, "opaque", Boolean.valueOf(false));
/*     */     
/* 127 */     this.minimumWidth = UIManager.getInt("Component.minimumWidth");
/* 128 */     this.buttonStyle = UIManager.getString("Spinner.buttonStyle");
/* 129 */     this.arrowType = UIManager.getString("Component.arrowType");
/* 130 */     this.disabledBackground = UIManager.getColor("Spinner.disabledBackground");
/* 131 */     this.disabledForeground = UIManager.getColor("Spinner.disabledForeground");
/* 132 */     this.focusedBackground = UIManager.getColor("Spinner.focusedBackground");
/* 133 */     this.buttonBackground = UIManager.getColor("Spinner.buttonBackground");
/* 134 */     this.buttonSeparatorWidth = FlatUIUtils.getUIFloat("Spinner.buttonSeparatorWidth", FlatUIUtils.getUIFloat("Component.borderWidth", 1.0F));
/* 135 */     this.buttonSeparatorColor = UIManager.getColor("Spinner.buttonSeparatorColor");
/* 136 */     this.buttonDisabledSeparatorColor = UIManager.getColor("Spinner.buttonDisabledSeparatorColor");
/* 137 */     this.buttonArrowColor = UIManager.getColor("Spinner.buttonArrowColor");
/* 138 */     this.buttonDisabledArrowColor = UIManager.getColor("Spinner.buttonDisabledArrowColor");
/* 139 */     this.buttonHoverArrowColor = UIManager.getColor("Spinner.buttonHoverArrowColor");
/* 140 */     this.buttonPressedArrowColor = UIManager.getColor("Spinner.buttonPressedArrowColor");
/* 141 */     this.padding = UIManager.getInsets("Spinner.padding");
/*     */     
/* 143 */     MigLayoutVisualPadding.install(this.spinner);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 148 */     super.uninstallDefaults();
/*     */     
/* 150 */     this.disabledBackground = null;
/* 151 */     this.disabledForeground = null;
/* 152 */     this.focusedBackground = null;
/* 153 */     this.buttonBackground = null;
/* 154 */     this.buttonSeparatorColor = null;
/* 155 */     this.buttonDisabledSeparatorColor = null;
/* 156 */     this.buttonArrowColor = null;
/* 157 */     this.buttonDisabledArrowColor = null;
/* 158 */     this.buttonHoverArrowColor = null;
/* 159 */     this.buttonPressedArrowColor = null;
/* 160 */     this.padding = null;
/*     */     
/* 162 */     this.oldStyleValues = null;
/* 163 */     this.borderShared = null;
/*     */     
/* 165 */     MigLayoutVisualPadding.uninstall(this.spinner);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installListeners() {
/* 170 */     super.installListeners();
/*     */     
/* 172 */     addEditorFocusListener(this.spinner.getEditor());
/* 173 */     this.spinner.addFocusListener(getHandler());
/* 174 */     this.spinner.addPropertyChangeListener(getHandler());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallListeners() {
/* 179 */     super.uninstallListeners();
/*     */     
/* 181 */     removeEditorFocusListener(this.spinner.getEditor());
/* 182 */     this.spinner.removeFocusListener(getHandler());
/* 183 */     this.spinner.removePropertyChangeListener(getHandler());
/*     */     
/* 185 */     this.handler = null;
/*     */   }
/*     */   
/*     */   private Handler getHandler() {
/* 189 */     if (this.handler == null)
/* 190 */       this.handler = new Handler(); 
/* 191 */     return this.handler;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 197 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.spinner, "Spinner"));
/* 198 */     } catch (RuntimeException ex) {
/* 199 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 205 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/* 206 */     updateEditorPadding();
/* 207 */     updateArrowButtonsStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 212 */     if (this.borderShared == null)
/* 213 */       this.borderShared = new AtomicBoolean(true); 
/* 214 */     return FlatStylingSupport.applyToAnnotatedObjectOrBorder(this, key, value, this.spinner, this.borderShared);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 220 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this, this.spinner.getBorder());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 226 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, this.spinner.getBorder(), key);
/*     */   }
/*     */ 
/*     */   
/*     */   protected JComponent createEditor() {
/* 231 */     JComponent editor = super.createEditor();
/* 232 */     configureEditor(editor);
/* 233 */     return editor;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void replaceEditor(JComponent oldEditor, JComponent newEditor) {
/* 238 */     super.replaceEditor(oldEditor, newEditor);
/*     */     
/* 240 */     configureEditor(newEditor);
/*     */     
/* 242 */     removeEditorFocusListener(oldEditor);
/* 243 */     addEditorFocusListener(newEditor);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void configureEditor(JComponent editor) {
/* 249 */     editor.setOpaque(false);
/* 250 */     JTextField textField = getEditorTextField(editor);
/* 251 */     if (textField != null) {
/* 252 */       textField.setOpaque(false);
/*     */     }
/* 254 */     updateEditorPadding();
/* 255 */     updateEditorColors();
/*     */   }
/*     */   
/*     */   private void addEditorFocusListener(JComponent editor) {
/* 259 */     JTextField textField = getEditorTextField(editor);
/* 260 */     if (textField != null)
/* 261 */       textField.addFocusListener(getHandler()); 
/*     */   }
/*     */   
/*     */   private void removeEditorFocusListener(JComponent editor) {
/* 265 */     JTextField textField = getEditorTextField(editor);
/* 266 */     if (textField != null)
/* 267 */       textField.removeFocusListener(getHandler()); 
/*     */   }
/*     */   
/*     */   private void updateEditorPadding() {
/* 271 */     JTextField textField = getEditorTextField(this.spinner.getEditor());
/* 272 */     if (textField != null)
/* 273 */       textField.putClientProperty("JTextField.padding", this.padding); 
/*     */   }
/*     */   
/*     */   private void updateEditorColors() {
/* 277 */     JTextField textField = getEditorTextField(this.spinner.getEditor());
/* 278 */     if (textField != null) {
/*     */ 
/*     */ 
/*     */       
/* 282 */       textField.setForeground(FlatUIUtils.nonUIResource(getForeground(true)));
/* 283 */       textField.setDisabledTextColor(FlatUIUtils.nonUIResource(getForeground(false)));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static JTextField getEditorTextField(JComponent editor) {
/* 288 */     return (editor instanceof JSpinner.DefaultEditor) ? (
/* 289 */       (JSpinner.DefaultEditor)editor).getTextField() : 
/* 290 */       null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isPermanentFocusOwner(JSpinner spinner) {
/* 295 */     if (FlatUIUtils.isPermanentFocusOwner(spinner)) {
/* 296 */       return true;
/*     */     }
/* 298 */     JTextField textField = getEditorTextField(spinner.getEditor());
/* 299 */     return (textField != null && FlatUIUtils.isPermanentFocusOwner(textField));
/*     */   }
/*     */   
/*     */   protected Color getBackground(boolean enabled) {
/* 303 */     if (enabled) {
/* 304 */       Color background = this.spinner.getBackground();
/*     */ 
/*     */       
/* 307 */       if (!(background instanceof javax.swing.plaf.UIResource)) {
/* 308 */         return background;
/*     */       }
/*     */       
/* 311 */       if (this.focusedBackground != null && isPermanentFocusOwner(this.spinner)) {
/* 312 */         return this.focusedBackground;
/*     */       }
/* 314 */       return background;
/*     */     } 
/* 316 */     return this.disabledBackground;
/*     */   }
/*     */   
/*     */   protected Color getForeground(boolean enabled) {
/* 320 */     return enabled ? this.spinner.getForeground() : this.disabledForeground;
/*     */   }
/*     */ 
/*     */   
/*     */   protected LayoutManager createLayout() {
/* 325 */     return getHandler();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Component createNextButton() {
/* 330 */     return createArrowButton(1, "Spinner.nextButton");
/*     */   }
/*     */ 
/*     */   
/*     */   protected Component createPreviousButton() {
/* 335 */     return createArrowButton(5, "Spinner.previousButton");
/*     */   }
/*     */   
/*     */   private Component createArrowButton(int direction, String name) {
/* 339 */     FlatArrowButton button = new FlatArrowButton(direction, this.arrowType, this.buttonArrowColor, this.buttonDisabledArrowColor, this.buttonHoverArrowColor, null, this.buttonPressedArrowColor, null)
/*     */       {
/*     */         
/*     */         public int getArrowWidth()
/*     */         {
/* 344 */           return FlatSpinnerUI.this.isMacStyle() ? 7 : super.getArrowWidth();
/*     */         }
/*     */         
/*     */         public float getArrowThickness() {
/* 348 */           return FlatSpinnerUI.this.isMacStyle() ? 1.5F : super.getArrowThickness();
/*     */         }
/*     */         
/*     */         public float getYOffset() {
/* 352 */           return FlatSpinnerUI.this.isMacStyle() ? 0.0F : super.getYOffset();
/*     */         }
/*     */         
/*     */         public boolean isRoundBorderAutoXOffset() {
/* 356 */           return FlatSpinnerUI.this.isMacStyle() ? false : super.isRoundBorderAutoXOffset();
/*     */         }
/*     */       };
/* 359 */     button.setName(name);
/* 360 */     button.setYOffset((direction == 1) ? 1.25F : -1.25F);
/* 361 */     if (direction == 1) {
/* 362 */       installNextButtonListeners(button);
/*     */     } else {
/* 364 */       installPreviousButtonListeners(button);
/* 365 */     }  return button;
/*     */   }
/*     */   
/*     */   private void updateArrowButtonsStyle() {
/* 369 */     for (Component c : this.spinner.getComponents()) {
/* 370 */       if (c instanceof FlatArrowButton) {
/* 371 */         ((FlatArrowButton)c).updateStyle(this.arrowType, this.buttonArrowColor, this.buttonDisabledArrowColor, this.buttonHoverArrowColor, (Color)null, this.buttonPressedArrowColor, (Color)null);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(Graphics g, JComponent c) {
/* 379 */     float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
/* 380 */     float arc = FlatUIUtils.getBorderArc(c);
/*     */ 
/*     */     
/* 383 */     if (c.isOpaque() && (focusWidth > 0.0F || arc > 0.0F)) {
/* 384 */       FlatUIUtils.paintParentBackground(g, c);
/*     */     }
/* 386 */     Graphics2D g2 = (Graphics2D)g;
/* 387 */     Object[] oldRenderingHints = FlatUIUtils.setRenderingHints(g2);
/*     */     
/* 389 */     int width = c.getWidth();
/* 390 */     int height = c.getHeight();
/* 391 */     boolean enabled = this.spinner.isEnabled();
/* 392 */     boolean ltr = this.spinner.getComponentOrientation().isLeftToRight();
/* 393 */     boolean isMacStyle = isMacStyle();
/* 394 */     int macStyleButtonsWidth = isMacStyle ? getMacStyleButtonsWidth() : 0;
/*     */ 
/*     */     
/* 397 */     g2.setColor(getBackground(enabled));
/* 398 */     FlatUIUtils.paintComponentBackground(g2, ltr ? 0 : macStyleButtonsWidth, 0, width - macStyleButtonsWidth, height, focusWidth, arc);
/*     */ 
/*     */     
/* 401 */     boolean paintButton = !"none".equals(this.buttonStyle);
/* 402 */     Handler handler = getHandler();
/* 403 */     if (paintButton && (handler.nextButton != null || handler.previousButton != null)) {
/* 404 */       Component button = (handler.nextButton != null) ? handler.nextButton : handler.previousButton;
/* 405 */       int arrowX = button.getX();
/* 406 */       int arrowWidth = button.getWidth();
/* 407 */       Color separatorColor = enabled ? this.buttonSeparatorColor : this.buttonDisabledSeparatorColor;
/*     */       
/* 409 */       if (isMacStyle) {
/* 410 */         Insets insets = this.spinner.getInsets();
/* 411 */         int lineWidth = Math.round(FlatUIUtils.getBorderLineWidth(this.spinner));
/* 412 */         int bx = arrowX;
/* 413 */         int by = insets.top - lineWidth;
/* 414 */         int bw = arrowWidth;
/* 415 */         int bh = height - insets.top - insets.bottom + lineWidth * 2;
/* 416 */         float lw = UIScale.scale(this.buttonSeparatorWidth);
/*     */ 
/*     */         
/* 419 */         FlatUIUtils.paintOutlinedComponent(g2, bx, by, bw, bh, 0.0F, 0.0F, 0.0F, lw, 
/* 420 */             UIScale.scale(12), null, separatorColor, this.buttonBackground);
/*     */ 
/*     */ 
/*     */         
/* 424 */         if (separatorColor != null) {
/* 425 */           int thickness = UIScale.scale(1);
/* 426 */           g2.setColor(separatorColor);
/* 427 */           g2.fill(new Rectangle2D.Float(bx + lw, by + (bh - thickness) / 2.0F, bw - lw * 2.0F, thickness));
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 432 */         if (enabled && this.buttonBackground != null) {
/* 433 */           g2.setColor(this.buttonBackground);
/* 434 */           Shape oldClip = g2.getClip();
/* 435 */           if (ltr) {
/* 436 */             g2.clipRect(arrowX, 0, width - arrowX, height);
/*     */           } else {
/* 438 */             g2.clipRect(0, 0, arrowX + arrowWidth, height);
/* 439 */           }  FlatUIUtils.paintComponentBackground(g2, 0, 0, width, height, focusWidth, arc);
/* 440 */           g2.setClip(oldClip);
/*     */         } 
/*     */ 
/*     */         
/* 444 */         if (separatorColor != null && this.buttonSeparatorWidth > 0.0F) {
/* 445 */           g2.setColor(separatorColor);
/* 446 */           float lw = UIScale.scale(this.buttonSeparatorWidth);
/* 447 */           float lx = ltr ? arrowX : ((arrowX + arrowWidth) - lw);
/* 448 */           g2.fill(new Rectangle2D.Float(lx, focusWidth, lw, (height - 1) - focusWidth * 2.0F));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 453 */     paint(g, c);
/*     */     
/* 455 */     FlatUIUtils.resetRenderingHints(g, oldRenderingHints);
/*     */   }
/*     */   
/*     */   boolean isMacStyle() {
/* 459 */     return "mac".equals(this.buttonStyle);
/*     */   }
/*     */   
/*     */   int getMacStyleButtonsWidth() {
/* 463 */     return (this.handler.nextButton != null || this.handler.previousButton != null) ? (
/* 464 */       UIScale.scale(3) + UIScale.scale(15)) : 
/* 465 */       0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private class Handler
/*     */     implements LayoutManager, FocusListener, PropertyChangeListener
/*     */   {
/* 478 */     private Component editor = null;
/*     */     
/*     */     private Component nextButton;
/*     */     private Component previousButton;
/*     */     
/*     */     public void addLayoutComponent(String name, Component c) {
/* 484 */       switch (name) { case "Editor":
/* 485 */           this.editor = c; break;
/* 486 */         case "Next": this.nextButton = c; break;
/* 487 */         case "Previous": this.previousButton = c;
/*     */           break; }
/*     */     
/*     */     }
/*     */     
/*     */     public void removeLayoutComponent(Component c) {
/* 493 */       if (c == this.editor) {
/* 494 */         this.editor = null;
/* 495 */       } else if (c == this.nextButton) {
/* 496 */         this.nextButton = null;
/* 497 */       } else if (c == this.previousButton) {
/* 498 */         this.previousButton = null;
/*     */       } 
/*     */     }
/*     */     
/*     */     public Dimension preferredLayoutSize(Container parent) {
/* 503 */       Insets insets = parent.getInsets();
/* 504 */       Insets padding = UIScale.scale(FlatSpinnerUI.this.padding);
/* 505 */       Dimension editorSize = (this.editor != null) ? this.editor.getPreferredSize() : new Dimension(0, 0);
/*     */ 
/*     */       
/* 508 */       int minimumWidth = FlatUIUtils.minimumWidth(FlatSpinnerUI.this.spinner, FlatSpinnerUI.this.minimumWidth);
/* 509 */       int innerHeight = editorSize.height + padding.top + padding.bottom;
/* 510 */       float focusWidth = FlatUIUtils.getBorderFocusWidth(FlatSpinnerUI.this.spinner);
/* 511 */       return new Dimension(
/* 512 */           Math.max(insets.left + insets.right + editorSize.width + padding.left + padding.right + innerHeight, UIScale.scale(minimumWidth) + Math.round(focusWidth * 2.0F)), insets.top + insets.bottom + innerHeight);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Dimension minimumLayoutSize(Container parent) {
/* 518 */       return preferredLayoutSize(parent);
/*     */     }
/*     */ 
/*     */     
/*     */     public void layoutContainer(Container parent) {
/* 523 */       Dimension size = parent.getSize();
/* 524 */       Insets insets = parent.getInsets();
/* 525 */       Rectangle r = FlatUIUtils.subtractInsets(new Rectangle(size), insets);
/*     */ 
/*     */       
/* 528 */       if (this.nextButton == null && this.previousButton == null) {
/* 529 */         if (this.editor != null) {
/* 530 */           this.editor.setBounds(r);
/*     */         }
/*     */         return;
/*     */       } 
/* 534 */       Rectangle editorRect = new Rectangle(r);
/* 535 */       Rectangle buttonsRect = new Rectangle(r);
/*     */ 
/*     */       
/* 538 */       FontMetrics fm = FlatSpinnerUI.this.spinner.getFontMetrics(FlatSpinnerUI.this.spinner.getFont());
/* 539 */       int maxButtonWidth = fm.getHeight() + UIScale.scale(FlatSpinnerUI.this.padding.top) + UIScale.scale(FlatSpinnerUI.this.padding.bottom);
/* 540 */       int minButtonWidth = maxButtonWidth * 3 / 4;
/*     */ 
/*     */       
/* 543 */       boolean isMacStyle = FlatSpinnerUI.this.isMacStyle();
/* 544 */       int buttonsGap = isMacStyle ? UIScale.scale(3) : 0;
/* 545 */       int prefButtonWidth = isMacStyle ? UIScale.scale(15) : buttonsRect.height;
/* 546 */       int buttonsWidth = Math.min(Math.max(prefButtonWidth, minButtonWidth), maxButtonWidth);
/*     */ 
/*     */       
/* 549 */       buttonsRect.width = buttonsWidth;
/* 550 */       editorRect.width -= buttonsWidth + buttonsGap;
/* 551 */       boolean ltr = parent.getComponentOrientation().isLeftToRight();
/* 552 */       if (ltr) {
/* 553 */         buttonsRect.x += editorRect.width + buttonsGap;
/*     */       } else {
/* 555 */         editorRect.x += buttonsWidth + buttonsGap;
/*     */       } 
/*     */ 
/*     */       
/* 559 */       if (isMacStyle) {
/* 560 */         int lineWidth = Math.round(FlatUIUtils.getBorderLineWidth(FlatSpinnerUI.this.spinner));
/* 561 */         if (lineWidth > 0) {
/* 562 */           buttonsRect.x += ltr ? lineWidth : -lineWidth;
/* 563 */           buttonsRect.y -= lineWidth;
/* 564 */           buttonsRect.height += lineWidth * 2;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 569 */       if (this.editor != null) {
/* 570 */         this.editor.setBounds(editorRect);
/*     */       }
/*     */       
/* 573 */       int nextHeight = buttonsRect.height / 2 + buttonsRect.height % 2;
/* 574 */       if (this.nextButton != null)
/* 575 */         this.nextButton.setBounds(buttonsRect.x, buttonsRect.y, buttonsRect.width, nextHeight); 
/* 576 */       if (this.previousButton != null) {
/*     */ 
/*     */         
/* 579 */         int previousY = buttonsRect.y + buttonsRect.height - nextHeight;
/* 580 */         this.previousButton.setBounds(buttonsRect.x, previousY, buttonsRect.width, nextHeight);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void focusGained(FocusEvent e) {
/* 589 */       FlatSpinnerUI.this.spinner.repaint();
/*     */ 
/*     */       
/* 592 */       if (e.getComponent() == FlatSpinnerUI.this.spinner) {
/* 593 */         JTextField textField = FlatSpinnerUI.getEditorTextField(FlatSpinnerUI.this.spinner.getEditor());
/* 594 */         if (textField != null) {
/* 595 */           textField.requestFocusInWindow();
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void focusLost(FocusEvent e) {
/* 602 */       FlatSpinnerUI.this.spinner.repaint();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent e) {
/* 609 */       switch (e.getPropertyName()) {
/*     */         case "foreground":
/*     */         case "enabled":
/* 612 */           FlatSpinnerUI.this.updateEditorColors();
/*     */           break;
/*     */         
/*     */         case "JComponent.roundRect":
/*     */         case "JComponent.outline":
/* 617 */           FlatSpinnerUI.this.spinner.repaint();
/*     */           break;
/*     */         
/*     */         case "JComponent.minimumWidth":
/* 621 */           FlatSpinnerUI.this.spinner.revalidate();
/*     */           break;
/*     */         
/*     */         case "FlatLaf.style":
/*     */         case "FlatLaf.styleClass":
/* 626 */           FlatSpinnerUI.this.installStyle();
/* 627 */           FlatSpinnerUI.this.spinner.revalidate();
/* 628 */           FlatSpinnerUI.this.spinner.repaint();
/*     */           break;
/*     */       } 
/*     */     }
/*     */     
/*     */     private Handler() {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatSpinnerUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */