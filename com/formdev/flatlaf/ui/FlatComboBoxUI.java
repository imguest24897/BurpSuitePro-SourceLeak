/*      */ package com.formdev.flatlaf.ui;
/*      */ 
/*      */ import com.formdev.flatlaf.FlatClientProperties;
/*      */ import com.formdev.flatlaf.icons.FlatCheckBoxMenuItemIcon;
/*      */ import com.formdev.flatlaf.util.LoggingFacade;
/*      */ import com.formdev.flatlaf.util.SystemInfo;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.ComponentOrientation;
/*      */ import java.awt.Container;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.FontMetrics;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.GraphicsConfiguration;
/*      */ import java.awt.Insets;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.Shape;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.FocusEvent;
/*      */ import java.awt.event.FocusListener;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.awt.event.MouseListener;
/*      */ import java.awt.geom.Rectangle2D;
/*      */ import java.beans.PropertyChangeEvent;
/*      */ import java.beans.PropertyChangeListener;
/*      */ import java.lang.invoke.MethodHandles;
/*      */ import java.util.Map;
/*      */ import java.util.concurrent.atomic.AtomicBoolean;
/*      */ import javax.swing.AbstractAction;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.ComboBoxModel;
/*      */ import javax.swing.DefaultListCellRenderer;
/*      */ import javax.swing.InputMap;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JComboBox;
/*      */ import javax.swing.JComponent;
/*      */ import javax.swing.JList;
/*      */ import javax.swing.JScrollBar;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.KeyStroke;
/*      */ import javax.swing.ListCellRenderer;
/*      */ import javax.swing.LookAndFeel;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.border.AbstractBorder;
/*      */ import javax.swing.border.Border;
/*      */ import javax.swing.plaf.ComponentUI;
/*      */ import javax.swing.plaf.UIResource;
/*      */ import javax.swing.plaf.basic.BasicComboBoxUI;
/*      */ import javax.swing.plaf.basic.BasicComboPopup;
/*      */ import javax.swing.plaf.basic.ComboPopup;
/*      */ import javax.swing.text.JTextComponent;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @StyleableField(cls = BasicComboBoxUI.class, key = "padding")
/*      */ public class FlatComboBoxUI
/*      */   extends BasicComboBoxUI
/*      */   implements FlatStylingSupport.StyleableUI, FlatStylingSupport.StyleableLookupProvider
/*      */ {
/*      */   @Styleable
/*      */   protected int minimumWidth;
/*      */   @Styleable
/*      */   protected int editorColumns;
/*      */   @Styleable
/*      */   protected String buttonStyle;
/*      */   @Styleable
/*      */   protected String arrowType;
/*      */   private Color background;
/*      */   @Styleable
/*      */   protected Color editableBackground;
/*      */   @Styleable
/*      */   protected Color focusedBackground;
/*      */   @Styleable
/*      */   protected Color disabledBackground;
/*      */   @Styleable
/*      */   protected Color disabledForeground;
/*      */   @Styleable
/*      */   protected Color buttonBackground;
/*      */   @Styleable
/*      */   protected Color buttonEditableBackground;
/*      */   @Styleable
/*      */   protected Color buttonFocusedBackground;
/*      */   @Styleable
/*      */   protected float buttonSeparatorWidth;
/*      */   @Styleable
/*      */   protected Color buttonSeparatorColor;
/*      */   @Styleable
/*      */   protected Color buttonDisabledSeparatorColor;
/*      */   @Styleable
/*      */   protected Color buttonArrowColor;
/*      */   @Styleable
/*      */   protected Color buttonDisabledArrowColor;
/*      */   @Styleable
/*      */   protected Color buttonHoverArrowColor;
/*      */   @Styleable
/*      */   protected Color buttonPressedArrowColor;
/*      */   @Styleable
/*      */   protected Color popupBackground;
/*      */   @Styleable
/*      */   protected Insets popupInsets;
/*      */   @Styleable
/*      */   protected Insets selectionInsets;
/*      */   @Styleable
/*      */   protected int selectionArc;
/*      */   private MouseListener hoverListener;
/*      */   protected boolean hover;
/*      */   protected boolean pressed;
/*      */   private CellPaddingBorder paddingBorder;
/*      */   private Map<String, Object> oldStyleValues;
/*      */   private AtomicBoolean borderShared;
/*      */   
/*      */   public static ComponentUI createUI(JComponent c) {
/*  172 */     return new FlatComboBoxUI();
/*      */   }
/*      */ 
/*      */   
/*      */   public void installUI(JComponent c) {
/*  177 */     if (FlatUIUtils.needsLightAWTPeer(c)) {
/*  178 */       FlatUIUtils.runWithLightAWTPeerUIDefaults(() -> installUIImpl(c));
/*      */     } else {
/*  180 */       installUIImpl(c);
/*      */     } 
/*      */   }
/*      */   private void installUIImpl(JComponent c) {
/*  184 */     super.installUI(c);
/*      */ 
/*      */     
/*  187 */     this.comboBox.setKeySelectionManager(new FlatKeySelectionManager(this.comboBox.getKeySelectionManager()));
/*      */     
/*  189 */     installStyle();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installListeners() {
/*  194 */     super.installListeners();
/*      */     
/*  196 */     this.hoverListener = new MouseAdapter()
/*      */       {
/*      */         public void mouseEntered(MouseEvent e) {
/*  199 */           FlatComboBoxUI.this.hover = true;
/*  200 */           repaintArrowButton();
/*      */         }
/*      */ 
/*      */         
/*      */         public void mouseExited(MouseEvent e) {
/*  205 */           FlatComboBoxUI.this.hover = false;
/*  206 */           repaintArrowButton();
/*      */         }
/*      */ 
/*      */         
/*      */         public void mousePressed(MouseEvent e) {
/*  211 */           FlatComboBoxUI.this.pressed = true;
/*  212 */           repaintArrowButton();
/*      */         }
/*      */ 
/*      */         
/*      */         public void mouseReleased(MouseEvent e) {
/*  217 */           FlatComboBoxUI.this.pressed = false;
/*  218 */           repaintArrowButton();
/*      */         }
/*      */         
/*      */         private void repaintArrowButton() {
/*  222 */           if (FlatComboBoxUI.this.arrowButton != null && !FlatComboBoxUI.this.comboBox.isEditable())
/*  223 */             FlatComboBoxUI.this.arrowButton.repaint(); 
/*      */         }
/*      */       };
/*  226 */     this.comboBox.addMouseListener(this.hoverListener);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void uninstallListeners() {
/*  231 */     super.uninstallListeners();
/*      */     
/*  233 */     this.comboBox.removeMouseListener(this.hoverListener);
/*  234 */     this.hoverListener = null;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installDefaults() {
/*  239 */     super.installDefaults();
/*      */     
/*  241 */     LookAndFeel.installProperty(this.comboBox, "opaque", Boolean.valueOf(false));
/*      */     
/*  243 */     this.minimumWidth = UIManager.getInt("ComboBox.minimumWidth");
/*  244 */     this.editorColumns = UIManager.getInt("ComboBox.editorColumns");
/*  245 */     this.buttonStyle = UIManager.getString("ComboBox.buttonStyle");
/*  246 */     this.arrowType = UIManager.getString("Component.arrowType");
/*      */     
/*  248 */     this.background = UIManager.getColor("ComboBox.background");
/*  249 */     this.editableBackground = UIManager.getColor("ComboBox.editableBackground");
/*  250 */     this.focusedBackground = UIManager.getColor("ComboBox.focusedBackground");
/*  251 */     this.disabledBackground = UIManager.getColor("ComboBox.disabledBackground");
/*  252 */     this.disabledForeground = UIManager.getColor("ComboBox.disabledForeground");
/*      */     
/*  254 */     this.buttonBackground = UIManager.getColor("ComboBox.buttonBackground");
/*  255 */     this.buttonFocusedBackground = UIManager.getColor("ComboBox.buttonFocusedBackground");
/*  256 */     this.buttonEditableBackground = UIManager.getColor("ComboBox.buttonEditableBackground");
/*  257 */     this.buttonSeparatorWidth = FlatUIUtils.getUIFloat("ComboBox.buttonSeparatorWidth", FlatUIUtils.getUIFloat("Component.borderWidth", 1.0F));
/*  258 */     this.buttonSeparatorColor = UIManager.getColor("ComboBox.buttonSeparatorColor");
/*  259 */     this.buttonDisabledSeparatorColor = UIManager.getColor("ComboBox.buttonDisabledSeparatorColor");
/*  260 */     this.buttonArrowColor = UIManager.getColor("ComboBox.buttonArrowColor");
/*  261 */     this.buttonDisabledArrowColor = UIManager.getColor("ComboBox.buttonDisabledArrowColor");
/*  262 */     this.buttonHoverArrowColor = UIManager.getColor("ComboBox.buttonHoverArrowColor");
/*  263 */     this.buttonPressedArrowColor = UIManager.getColor("ComboBox.buttonPressedArrowColor");
/*      */     
/*  265 */     this.popupBackground = UIManager.getColor("ComboBox.popupBackground");
/*  266 */     this.popupInsets = UIManager.getInsets("ComboBox.popupInsets");
/*  267 */     this.selectionInsets = UIManager.getInsets("ComboBox.selectionInsets");
/*  268 */     this.selectionArc = UIManager.getInt("ComboBox.selectionArc");
/*      */ 
/*      */     
/*  271 */     int maximumRowCount = UIManager.getInt("ComboBox.maximumRowCount");
/*  272 */     if (maximumRowCount > 0 && maximumRowCount != 8 && this.comboBox.getMaximumRowCount() == 8) {
/*  273 */       this.comboBox.setMaximumRowCount(maximumRowCount);
/*      */     }
/*  275 */     this.paddingBorder = new CellPaddingBorder(this.padding);
/*      */     
/*  277 */     MigLayoutVisualPadding.install(this.comboBox);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void uninstallDefaults() {
/*  282 */     super.uninstallDefaults();
/*      */     
/*  284 */     this.background = null;
/*  285 */     this.editableBackground = null;
/*  286 */     this.focusedBackground = null;
/*  287 */     this.disabledBackground = null;
/*  288 */     this.disabledForeground = null;
/*      */     
/*  290 */     this.buttonBackground = null;
/*  291 */     this.buttonEditableBackground = null;
/*  292 */     this.buttonFocusedBackground = null;
/*  293 */     this.buttonSeparatorColor = null;
/*  294 */     this.buttonDisabledSeparatorColor = null;
/*  295 */     this.buttonArrowColor = null;
/*  296 */     this.buttonDisabledArrowColor = null;
/*  297 */     this.buttonHoverArrowColor = null;
/*  298 */     this.buttonPressedArrowColor = null;
/*      */     
/*  300 */     this.popupBackground = null;
/*      */     
/*  302 */     this.paddingBorder.uninstall();
/*      */     
/*  304 */     this.oldStyleValues = null;
/*  305 */     this.borderShared = null;
/*      */     
/*  307 */     MigLayoutVisualPadding.uninstall(this.comboBox);
/*      */   }
/*      */ 
/*      */   
/*      */   protected LayoutManager createLayoutManager() {
/*  312 */     return new BasicComboBoxUI.ComboBoxLayoutManager()
/*      */       {
/*      */         public void layoutContainer(Container parent) {
/*  315 */           super.layoutContainer(parent);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  320 */           if (FlatComboBoxUI.this.arrowButton != null && FlatComboBoxUI.this.comboBox.getFont() != null) {
/*      */             
/*  322 */             FontMetrics fm = FlatComboBoxUI.this.comboBox.getFontMetrics(FlatComboBoxUI.this.comboBox.getFont());
/*  323 */             int maxButtonWidth = fm.getHeight() + UIScale.scale(FlatComboBoxUI.this.padding.top) + UIScale.scale(FlatComboBoxUI.this.padding.bottom);
/*  324 */             int minButtonWidth = maxButtonWidth * 3 / 4;
/*      */ 
/*      */             
/*  327 */             Insets insets = FlatComboBoxUI.this.getInsets();
/*  328 */             int buttonWidth = Math.min(Math.max(parent.getHeight() - insets.top - insets.bottom, minButtonWidth), maxButtonWidth);
/*      */             
/*  330 */             if (buttonWidth != FlatComboBoxUI.this.arrowButton.getWidth()) {
/*      */ 
/*      */ 
/*      */               
/*  334 */               int xOffset = FlatComboBoxUI.this.comboBox.getComponentOrientation().isLeftToRight() ? (FlatComboBoxUI.this.arrowButton.getWidth() - buttonWidth) : 0;
/*  335 */               FlatComboBoxUI.this.arrowButton.setBounds(FlatComboBoxUI.this.arrowButton.getX() + xOffset, FlatComboBoxUI.this.arrowButton.getY(), buttonWidth, FlatComboBoxUI.this
/*  336 */                   .arrowButton.getHeight());
/*      */ 
/*      */               
/*  339 */               if (FlatComboBoxUI.this.editor != null) {
/*  340 */                 FlatComboBoxUI.this.editor.setBounds(FlatComboBoxUI.this.rectangleForCurrentValue());
/*      */               }
/*      */             } 
/*      */           } 
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */   
/*      */   protected FocusListener createFocusListener() {
/*  350 */     return new BasicComboBoxUI.FocusHandler()
/*      */       {
/*      */         public void focusGained(FocusEvent e) {
/*  353 */           super.focusGained(e);
/*  354 */           if (FlatComboBoxUI.this.comboBox != null && FlatComboBoxUI.this.comboBox.isEditable()) {
/*  355 */             FlatComboBoxUI.this.comboBox.repaint();
/*      */           }
/*      */         }
/*      */         
/*      */         public void focusLost(FocusEvent e) {
/*  360 */           super.focusLost(e);
/*  361 */           if (FlatComboBoxUI.this.comboBox != null && FlatComboBoxUI.this.comboBox.isEditable()) {
/*  362 */             FlatComboBoxUI.this.comboBox.repaint();
/*      */           }
/*      */         }
/*      */       };
/*      */   }
/*      */   
/*      */   protected PropertyChangeListener createPropertyChangeListener() {
/*  369 */     PropertyChangeListener superListener = super.createPropertyChangeListener();
/*  370 */     return e -> {
/*      */         superListener.propertyChange(e);
/*      */         Object source = e.getSource();
/*      */         String propertyName = e.getPropertyName();
/*      */         if (this.editor != null && ((source == this.comboBox && propertyName == "foreground") || (source == this.editor && propertyName == "enabled"))) {
/*      */           updateEditorColors();
/*      */         } else if (this.editor != null && source == this.comboBox && propertyName == "componentOrientation") {
/*      */           ComponentOrientation o = (ComponentOrientation)e.getNewValue();
/*      */           this.editor.applyComponentOrientation(o);
/*      */         } else {
/*      */           switch (propertyName) {
/*      */             case "JTextField.placeholderText":
/*      */               if (this.editor != null) {
/*      */                 this.editor.repaint();
/*      */               }
/*      */               break;
/*      */             case "JComponent.roundRect":
/*      */             case "JComponent.outline":
/*      */               this.comboBox.repaint();
/*      */               break;
/*      */             case "JComponent.minimumWidth":
/*      */               this.comboBox.revalidate();
/*      */               break;
/*      */             case "FlatLaf.style":
/*      */             case "FlatLaf.styleClass":
/*      */               installStyle();
/*      */               this.comboBox.revalidate();
/*      */               this.comboBox.repaint();
/*      */               break;
/*      */           } 
/*      */         } 
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected ComboPopup createPopup() {
/*  414 */     return new FlatComboPopup(this.comboBox);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void configureEditor() {
/*  419 */     super.configureEditor();
/*      */     
/*  421 */     if (this.editor instanceof JTextField) {
/*  422 */       JTextField textField = (JTextField)this.editor;
/*  423 */       textField.setColumns(this.editorColumns);
/*      */ 
/*      */       
/*  426 */       Border border = textField.getBorder();
/*  427 */       if (border == null || border instanceof UIResource)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  433 */         textField.setBorder(BorderFactory.createEmptyBorder());
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/*  438 */     if (this.editor instanceof JComponent) {
/*  439 */       ((JComponent)this.editor).setOpaque(false);
/*      */     }
/*  441 */     this.editor.applyComponentOrientation(this.comboBox.getComponentOrientation());
/*      */     
/*  443 */     updateEditorPadding();
/*  444 */     updateEditorColors();
/*      */ 
/*      */     
/*  447 */     if (SystemInfo.isMacOS && this.editor instanceof JTextComponent) {
/*      */ 
/*      */       
/*  450 */       InputMap inputMap = ((JTextComponent)this.editor).getInputMap();
/*  451 */       new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("UP"));
/*  452 */       new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("KP_UP"));
/*  453 */       new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("DOWN"));
/*  454 */       new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("KP_DOWN"));
/*  455 */       new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("HOME"));
/*  456 */       new EditorDelegateAction(inputMap, KeyStroke.getKeyStroke("END"));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void updateEditorPadding() {
/*  461 */     if (!(this.editor instanceof JTextField)) {
/*      */       return;
/*      */     }
/*  464 */     JTextField textField = (JTextField)this.editor;
/*  465 */     Insets insets = textField.getInsets();
/*  466 */     Insets pad = this.padding;
/*  467 */     if (insets.top != 0 || insets.left != 0 || insets.bottom != 0 || insets.right != 0)
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  473 */       pad = new Insets(UIScale.unscale(Math.max(UIScale.scale(this.padding.top) - insets.top, 0)), UIScale.unscale(Math.max(UIScale.scale(this.padding.left) - insets.left, 0)), UIScale.unscale(Math.max(UIScale.scale(this.padding.bottom) - insets.bottom, 0)), UIScale.unscale(Math.max(UIScale.scale(this.padding.right) - insets.right, 0)));
/*      */     }
/*      */     
/*  476 */     textField.putClientProperty("JTextField.padding", pad);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void updateEditorColors() {
/*  483 */     boolean isTextComponent = this.editor instanceof JTextComponent;
/*  484 */     this.editor.setForeground(FlatUIUtils.nonUIResource(getForeground((isTextComponent || this.editor.isEnabled()))));
/*      */     
/*  486 */     if (isTextComponent) {
/*  487 */       ((JTextComponent)this.editor).setDisabledTextColor(FlatUIUtils.nonUIResource(getForeground(false)));
/*      */     }
/*      */   }
/*      */   
/*      */   protected JButton createArrowButton() {
/*  492 */     return new FlatComboBoxButton();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installStyle() {
/*      */     try {
/*  498 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.comboBox, "ComboBox"));
/*  499 */     } catch (RuntimeException ex) {
/*  500 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void applyStyle(Object style) {
/*  506 */     Insets oldPadding = this.padding;
/*  507 */     int oldEditorColumns = this.editorColumns;
/*      */     
/*  509 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*      */     
/*  511 */     if (!this.padding.equals(oldPadding)) {
/*  512 */       this.paddingBorder.padding = this.padding;
/*  513 */       updateEditorPadding();
/*      */     } 
/*  515 */     if (this.arrowButton instanceof FlatComboBoxButton)
/*  516 */       ((FlatComboBoxButton)this.arrowButton).updateStyle(); 
/*  517 */     if (this.popup instanceof FlatComboPopup)
/*  518 */       ((FlatComboPopup)this.popup).updateStyle(); 
/*  519 */     if (this.editorColumns != oldEditorColumns && this.editor instanceof JTextField) {
/*  520 */       ((JTextField)this.editor).setColumns(this.editorColumns);
/*      */     }
/*      */   }
/*      */   
/*      */   protected Object applyStyleProperty(String key, Object value) {
/*  525 */     if (this.borderShared == null)
/*  526 */       this.borderShared = new AtomicBoolean(true); 
/*  527 */     return FlatStylingSupport.applyToAnnotatedObjectOrBorder(this, key, value, this.comboBox, this.borderShared);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/*  533 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this, this.comboBox.getBorder());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Object getStyleableValue(JComponent c, String key) {
/*  539 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, this.comboBox.getBorder(), key);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MethodHandles.Lookup getLookupForStyling() {
/*  547 */     return MethodHandles.lookup();
/*      */   }
/*      */ 
/*      */   
/*      */   public void update(Graphics g, JComponent c) {
/*  552 */     float focusWidth = FlatUIUtils.getBorderFocusWidth(c);
/*  553 */     float arc = FlatUIUtils.getBorderArc(c);
/*  554 */     boolean paintBackground = true;
/*      */ 
/*      */     
/*  557 */     boolean isCellRenderer = c.getParent() instanceof javax.swing.CellRendererPane;
/*  558 */     if (isCellRenderer) {
/*  559 */       focusWidth = 0.0F;
/*  560 */       arc = 0.0F;
/*  561 */       paintBackground = isCellRendererBackgroundChanged();
/*      */     } 
/*      */ 
/*      */     
/*  565 */     if (c.isOpaque() && (focusWidth > 0.0F || arc > 0.0F)) {
/*  566 */       FlatUIUtils.paintParentBackground(g, c);
/*      */     }
/*  568 */     Graphics2D g2 = (Graphics2D)g;
/*  569 */     Object[] oldRenderingHints = FlatUIUtils.setRenderingHints(g2);
/*      */     
/*  571 */     int width = c.getWidth();
/*  572 */     int height = c.getHeight();
/*  573 */     int arrowX = this.arrowButton.getX();
/*  574 */     int arrowWidth = this.arrowButton.getWidth();
/*      */ 
/*      */     
/*  577 */     boolean paintButton = ((this.comboBox.isEditable() || "button".equals(this.buttonStyle)) && !"none".equals(this.buttonStyle) && !isMacStyle());
/*  578 */     boolean enabled = this.comboBox.isEnabled();
/*  579 */     boolean isLeftToRight = this.comboBox.getComponentOrientation().isLeftToRight();
/*      */ 
/*      */     
/*  582 */     if (paintBackground || c.isOpaque()) {
/*  583 */       g2.setColor(getBackground(enabled));
/*  584 */       FlatUIUtils.paintComponentBackground(g2, 0, 0, width, height, focusWidth, arc);
/*      */ 
/*      */       
/*  587 */       if (enabled && !isCellRenderer) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  592 */         Color buttonColor = paintButton ? this.buttonEditableBackground : (((this.buttonFocusedBackground != null || this.focusedBackground != null) && isPermanentFocusOwner(this.comboBox)) ? ((this.buttonFocusedBackground != null) ? this.buttonFocusedBackground : this.focusedBackground) : this.buttonBackground);
/*  593 */         if (buttonColor != null) {
/*  594 */           g2.setColor(buttonColor);
/*  595 */           if (isMacStyle()) {
/*  596 */             Insets insets = this.comboBox.getInsets();
/*  597 */             int gap = UIScale.scale(2);
/*  598 */             FlatUIUtils.paintComponentBackground(g2, arrowX + gap, insets.top + gap, arrowWidth - gap * 2, height - insets.top - insets.bottom - gap * 2, 0.0F, arc - focusWidth);
/*      */           }
/*      */           else {
/*      */             
/*  602 */             Shape oldClip = g2.getClip();
/*  603 */             if (isLeftToRight) {
/*  604 */               g2.clipRect(arrowX, 0, width - arrowX, height);
/*      */             } else {
/*  606 */               g2.clipRect(0, 0, arrowX + arrowWidth, height);
/*  607 */             }  FlatUIUtils.paintComponentBackground(g2, 0, 0, width, height, focusWidth, arc);
/*  608 */             g2.setClip(oldClip);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  614 */       if (paintButton) {
/*  615 */         Color separatorColor = enabled ? this.buttonSeparatorColor : this.buttonDisabledSeparatorColor;
/*  616 */         if (separatorColor != null && this.buttonSeparatorWidth > 0.0F) {
/*  617 */           g2.setColor(separatorColor);
/*  618 */           float lw = UIScale.scale(this.buttonSeparatorWidth);
/*  619 */           float lx = isLeftToRight ? arrowX : ((arrowX + arrowWidth) - lw);
/*  620 */           g2.fill(new Rectangle2D.Float(lx, focusWidth, lw, (height - 1) - focusWidth * 2.0F));
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  626 */     FlatUIUtils.resetRenderingHints(g2, oldRenderingHints);
/*      */     
/*  628 */     paint(g, c);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void paintCurrentValue(Graphics g, Rectangle bounds, boolean hasFocus) {
/*  634 */     this.paddingBorder.uninstall();
/*      */     
/*  636 */     ListCellRenderer<Object> renderer = (ListCellRenderer)this.comboBox.getRenderer();
/*  637 */     if (renderer == null)
/*  638 */       renderer = new DefaultListCellRenderer(); 
/*  639 */     Component c = renderer.getListCellRendererComponent(this.listBox, this.comboBox.getSelectedItem(), -1, false, false);
/*  640 */     c.setFont(this.comboBox.getFont());
/*  641 */     c.applyComponentOrientation(this.comboBox.getComponentOrientation());
/*      */     
/*  643 */     boolean enabled = this.comboBox.isEnabled();
/*  644 */     c.setBackground(getBackground(enabled));
/*  645 */     c.setForeground(getForeground(enabled));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  650 */     if (c instanceof JComponent) {
/*  651 */       ((JComponent)c).setOpaque(false);
/*      */     }
/*  653 */     boolean shouldValidate = c instanceof javax.swing.JPanel;
/*      */     
/*  655 */     this.paddingBorder.install(c, 0);
/*  656 */     this.currentValuePane.paintComponent(g, c, this.comboBox, bounds.x, bounds.y, bounds.width, bounds.height, shouldValidate);
/*  657 */     this.paddingBorder.uninstall();
/*      */     
/*  659 */     if (c instanceof JComponent) {
/*  660 */       ((JComponent)c).setOpaque(true);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {}
/*      */ 
/*      */   
/*      */   protected Color getBackground(boolean enabled) {
/*  669 */     if (enabled) {
/*  670 */       if (FlatUIUtils.isAWTPeer(this.comboBox)) {
/*  671 */         return this.background;
/*      */       }
/*  673 */       Color background = this.comboBox.getBackground();
/*      */ 
/*      */       
/*  676 */       if (!(background instanceof UIResource)) {
/*  677 */         return background;
/*      */       }
/*      */       
/*  680 */       if (this.focusedBackground != null && isPermanentFocusOwner(this.comboBox)) {
/*  681 */         return this.focusedBackground;
/*      */       }
/*  683 */       return (this.editableBackground != null && this.comboBox.isEditable()) ? this.editableBackground : background;
/*      */     } 
/*  685 */     return this.disabledBackground;
/*      */   }
/*      */   
/*      */   protected Color getForeground(boolean enabled) {
/*  689 */     return enabled ? this.comboBox.getForeground() : this.disabledForeground;
/*      */   }
/*      */ 
/*      */   
/*      */   public Dimension getMinimumSize(JComponent c) {
/*  694 */     Dimension minimumSize = super.getMinimumSize(c);
/*  695 */     int fw = Math.round(FlatUIUtils.getBorderFocusWidth(c) * 2.0F);
/*  696 */     minimumSize.width = Math.max(minimumSize.width, UIScale.scale(FlatUIUtils.minimumWidth(c, this.minimumWidth)) + fw);
/*  697 */     return minimumSize;
/*      */   }
/*      */ 
/*      */   
/*      */   protected Dimension getDefaultSize() {
/*  702 */     this.paddingBorder.uninstall();
/*  703 */     Dimension size = super.getDefaultSize();
/*  704 */     this.paddingBorder.uninstall();
/*  705 */     return size;
/*      */   }
/*      */ 
/*      */   
/*      */   protected Dimension getDisplaySize() {
/*  710 */     this.paddingBorder.uninstall();
/*  711 */     Dimension displaySize = super.getDisplaySize();
/*  712 */     this.paddingBorder.uninstall();
/*      */ 
/*      */     
/*  715 */     int displayWidth = displaySize.width - this.padding.left - this.padding.right;
/*  716 */     int displayHeight = displaySize.height - this.padding.top - this.padding.bottom;
/*      */ 
/*      */     
/*  719 */     if (displayWidth == 100 && this.comboBox
/*  720 */       .isEditable() && this.comboBox
/*  721 */       .getItemCount() == 0 && this.comboBox
/*  722 */       .getPrototypeDisplayValue() == null)
/*      */     {
/*  724 */       displayWidth = Math.max((getDefaultSize()).width, (this.editor.getPreferredSize()).width);
/*      */     }
/*      */     
/*  727 */     return new Dimension(displayWidth, displayHeight);
/*      */   }
/*      */ 
/*      */   
/*      */   protected Dimension getSizeForComponent(Component comp) {
/*  732 */     this.paddingBorder.install(comp, 0);
/*  733 */     Dimension size = super.getSizeForComponent(comp);
/*  734 */     this.paddingBorder.uninstall();
/*  735 */     return size;
/*      */   }
/*      */   
/*      */   private boolean isCellRenderer() {
/*  739 */     return this.comboBox.getParent() instanceof javax.swing.CellRendererPane;
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean isCellRendererBackgroundChanged() {
/*  744 */     Container parentParent = this.comboBox.getParent().getParent();
/*  745 */     return (parentParent != null && !this.comboBox.getBackground().equals(parentParent.getBackground()));
/*      */   }
/*      */   
/*      */   private boolean isMacStyle() {
/*  749 */     return "mac".equals(this.buttonStyle);
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isPermanentFocusOwner(JComboBox<?> comboBox) {
/*  754 */     if (comboBox.isEditable()) {
/*  755 */       if (FlatUIUtils.isPermanentFocusOwner(comboBox)) {
/*  756 */         return true;
/*      */       }
/*  758 */       Component editorComponent = comboBox.getEditor().getEditorComponent();
/*  759 */       return (editorComponent != null && FlatUIUtils.isPermanentFocusOwner(editorComponent));
/*      */     } 
/*  761 */     return FlatUIUtils.isPermanentFocusOwner(comboBox);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected class FlatComboBoxButton
/*      */     extends FlatArrowButton
/*      */   {
/*      */     protected FlatComboBoxButton() {
/*  770 */       this(5, FlatComboBoxUI.this.arrowType, FlatComboBoxUI.this.buttonArrowColor, FlatComboBoxUI.this.buttonDisabledArrowColor, FlatComboBoxUI.this.buttonHoverArrowColor, (Color)null, FlatComboBoxUI.this.buttonPressedArrowColor, (Color)null);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected FlatComboBoxButton(int direction, String type, Color foreground, Color disabledForeground, Color hoverForeground, Color hoverBackground, Color pressedForeground, Color pressedBackground) {
/*  777 */       super(direction, type, foreground, disabledForeground, hoverForeground, hoverBackground, pressedForeground, pressedBackground);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void updateStyle() {
/*  782 */       updateStyle(FlatComboBoxUI.this.arrowType, FlatComboBoxUI.this.buttonArrowColor, FlatComboBoxUI.this.buttonDisabledArrowColor, FlatComboBoxUI.this.buttonHoverArrowColor, (Color)null, FlatComboBoxUI.this.buttonPressedArrowColor, (Color)null);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int getArrowWidth() {
/*  788 */       return FlatComboBoxUI.this.isMacStyle() ? ((getWidth() % 2 == 0) ? 6 : 7) : super.getArrowWidth();
/*      */     }
/*      */ 
/*      */     
/*      */     public float getArrowThickness() {
/*  793 */       return FlatComboBoxUI.this.isMacStyle() ? 1.5F : super.getArrowThickness();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isRoundBorderAutoXOffset() {
/*  798 */       return FlatComboBoxUI.this.isMacStyle() ? false : super.isRoundBorderAutoXOffset();
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean isHover() {
/*  803 */       return (super.isHover() || (!FlatComboBoxUI.this.comboBox.isEditable() && FlatComboBoxUI.this.hover));
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean isPressed() {
/*  808 */       return (super.isPressed() || (!FlatComboBoxUI.this.comboBox.isEditable() && FlatComboBoxUI.this.pressed));
/*      */     }
/*      */ 
/*      */     
/*      */     protected Color getArrowColor() {
/*  813 */       if (FlatComboBoxUI.this.isCellRenderer() && FlatComboBoxUI.this.isCellRendererBackgroundChanged()) {
/*  814 */         return FlatComboBoxUI.this.comboBox.getForeground();
/*      */       }
/*  816 */       return super.getArrowColor();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void paintArrow(Graphics2D g) {
/*  821 */       if (FlatComboBoxUI.this.isMacStyle() && !FlatComboBoxUI.this.comboBox.isEditable()) {
/*      */         
/*  823 */         int height = getHeight();
/*  824 */         int h = Math.round(height / 2.0F);
/*  825 */         FlatUIUtils.paintArrow(g, 0, 0, getWidth(), h, 1, this.chevron, 
/*  826 */             getArrowWidth(), getArrowThickness(), getXOffset(), getYOffset() + 1.25F);
/*  827 */         FlatUIUtils.paintArrow(g, 0, height - h, getWidth(), h, 5, this.chevron, 
/*  828 */             getArrowWidth(), getArrowThickness(), getXOffset(), getYOffset() - 1.25F);
/*      */       } else {
/*  830 */         super.paintArrow(g);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected class FlatComboPopup
/*      */     extends BasicComboPopup
/*      */   {
/*      */     protected FlatComboPopup(JComboBox<Object> combo) {
/*  841 */       super(combo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  847 */       ComponentOrientation o = this.comboBox.getComponentOrientation();
/*  848 */       this.list.setComponentOrientation(o);
/*  849 */       this.scroller.setComponentOrientation(o);
/*  850 */       setComponentOrientation(o);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected Rectangle computePopupBounds(int px, int py, int pw, int ph) {
/*  856 */       int displayWidth = (FlatComboBoxUI.this.getDisplaySize()).width;
/*      */ 
/*      */       
/*  859 */       for (Border border : new Border[] { this.scroller.getViewportBorder(), this.scroller.getBorder() }) {
/*  860 */         if (border != null) {
/*  861 */           Insets borderInsets = border.getBorderInsets(null);
/*  862 */           displayWidth += borderInsets.left + borderInsets.right;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  867 */       boolean isPopupOverComboBox = isPopupOverComboBox();
/*  868 */       int selectedIndex = -1;
/*  869 */       if (isPopupOverComboBox && (selectedIndex = this.comboBox.getSelectedIndex()) >= 0) {
/*  870 */         displayWidth += FlatComboBoxUI.MacCheckedItemIcon.INSTANCE.getIconWidth() + UIScale.scale(4);
/*      */       }
/*      */       
/*  873 */       JScrollBar verticalScrollBar = this.scroller.getVerticalScrollBar();
/*  874 */       if (verticalScrollBar != null) {
/*  875 */         displayWidth += (verticalScrollBar.getPreferredSize()).width;
/*      */       }
/*      */       
/*  878 */       int pw0 = pw;
/*  879 */       if (displayWidth > pw) {
/*      */         
/*  881 */         GraphicsConfiguration gc = this.comboBox.getGraphicsConfiguration();
/*  882 */         if (gc != null) {
/*  883 */           Rectangle screenBounds = gc.getBounds();
/*  884 */           Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(gc);
/*  885 */           displayWidth = Math.min(displayWidth, screenBounds.width - screenInsets.left - screenInsets.right);
/*      */         } else {
/*  887 */           Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
/*  888 */           displayWidth = Math.min(displayWidth, screenSize.width);
/*      */         } 
/*      */         
/*  891 */         int diff = displayWidth - pw;
/*  892 */         pw = displayWidth;
/*      */         
/*  894 */         if (!this.comboBox.getComponentOrientation().isLeftToRight()) {
/*  895 */           px -= diff;
/*      */         }
/*      */       } 
/*      */       
/*      */       Rectangle cellBounds;
/*  900 */       if (isPopupOverComboBox && selectedIndex >= 0 && (
/*  901 */         cellBounds = this.list.getCellBounds(0, 0)) != null) {
/*      */         
/*  903 */         Insets comboBoxInsets = this.comboBox.getInsets();
/*  904 */         Insets listInsets = this.list.getInsets();
/*  905 */         Insets popupInsets = getInsets();
/*      */ 
/*      */         
/*  908 */         py -= cellBounds.height * (selectedIndex + 1) + comboBoxInsets.top + listInsets.top + popupInsets.top;
/*      */ 
/*      */         
/*  911 */         int offset = Math.min(pw - pw0, FlatComboBoxUI.MacCheckedItemIcon.INSTANCE.getIconWidth()) + UIScale.scale(4);
/*  912 */         if (this.comboBox.getComponentOrientation().isLeftToRight()) {
/*  913 */           px -= offset + comboBoxInsets.right + listInsets.right;
/*      */         } else {
/*  915 */           px += offset + comboBoxInsets.left + listInsets.left;
/*      */         } 
/*      */ 
/*      */         
/*  919 */         return new Rectangle(px, py, pw, ph);
/*      */       } 
/*      */       
/*  922 */       return super.computePopupBounds(px, py, pw, ph);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void configurePopup() {
/*  927 */       super.configurePopup();
/*      */ 
/*      */       
/*  930 */       setOpaque(true);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  935 */       Border border = UIManager.getBorder("PopupMenu.border");
/*  936 */       if (border != null) {
/*  937 */         setBorder(FlatUIUtils.nonUIResource(border));
/*      */       }
/*  939 */       this.list.setCellRenderer(new PopupListCellRenderer());
/*  940 */       updateStyle();
/*      */     }
/*      */     
/*      */     void updateStyle() {
/*  944 */       if (FlatComboBoxUI.this.popupBackground != null) {
/*  945 */         this.list.setBackground(FlatComboBoxUI.this.popupBackground);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  950 */       setBackground(FlatUIUtils.nonUIResource(this.list.getBackground()));
/*      */       
/*  952 */       this.scroller.setViewportBorder((FlatComboBoxUI.this.popupInsets != null) ? new FlatEmptyBorder(FlatComboBoxUI.this.popupInsets) : null);
/*  953 */       this.scroller.setOpaque(false);
/*      */       
/*  955 */       if (this.list.getUI() instanceof FlatListUI) {
/*  956 */         FlatListUI ui = (FlatListUI)this.list.getUI();
/*  957 */         ui.selectionInsets = FlatComboBoxUI.this.selectionInsets;
/*  958 */         ui.selectionArc = FlatComboBoxUI.this.selectionArc;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     protected PropertyChangeListener createPropertyChangeListener() {
/*  964 */       PropertyChangeListener superListener = super.createPropertyChangeListener();
/*  965 */       return e -> {
/*      */           superListener.propertyChange(e);
/*      */           if (e.getPropertyName() == "renderer") {
/*      */             this.list.setCellRenderer(new PopupListCellRenderer());
/*      */           }
/*      */         };
/*      */     }
/*      */ 
/*      */     
/*      */     protected int getPopupHeightForRowCount(int maxRowCount) {
/*  975 */       int height = super.getPopupHeightForRowCount(maxRowCount);
/*  976 */       FlatComboBoxUI.this.paddingBorder.uninstall();
/*  977 */       return height;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void show(Component invoker, int x, int y) {
/*  984 */       if (y < 0 && !SystemInfo.isJava_9_orLater) {
/*  985 */         Border popupBorder = getBorder();
/*  986 */         if (popupBorder != null) {
/*  987 */           Insets insets = popupBorder.getBorderInsets(this);
/*  988 */           y -= insets.top + insets.bottom;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  993 */       if (this.list.getHeight() == 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1000 */         int selectedIndex = this.list.getSelectedIndex();
/* 1001 */         if (selectedIndex >= 1) {
/* 1002 */           int maximumRowCount = this.comboBox.getMaximumRowCount();
/* 1003 */           if (selectedIndex < maximumRowCount) {
/*      */             
/* 1005 */             this.list.scrollRectToVisible(new Rectangle());
/*      */           } else {
/*      */             
/* 1008 */             int firstVisibleIndex = Math.max(selectedIndex - maximumRowCount / 2, 0);
/* 1009 */             if (firstVisibleIndex > 0) {
/* 1010 */               this.list.ensureIndexIsVisible(firstVisibleIndex);
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/* 1015 */       super.show(invoker, x, y);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void paintChildren(Graphics g) {
/* 1020 */       super.paintChildren(g);
/* 1021 */       FlatComboBoxUI.this.paddingBorder.uninstall();
/*      */     }
/*      */     
/*      */     private boolean isPopupOverComboBox() {
/* 1025 */       return (FlatComboBoxUI.this.isMacStyle() && 
/* 1026 */         !this.comboBox.isEditable() && this.comboBox
/* 1027 */         .getItemCount() > 0 && this.comboBox
/* 1028 */         .getItemCount() <= this.comboBox.getMaximumRowCount() && 
/*      */         
/* 1030 */         !FlatClientProperties.clientPropertyBoolean(this.comboBox, "JComboBox.isPopDown", false));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private class PopupListCellRenderer
/*      */       implements ListCellRenderer
/*      */     {
/*      */       private PopupListCellRenderer() {}
/*      */ 
/*      */       
/*      */       public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
/* 1042 */         FlatComboBoxUI.this.paddingBorder.uninstall();
/*      */         
/* 1044 */         ListCellRenderer<Object> renderer = FlatComboBoxUI.FlatComboPopup.this.comboBox.getRenderer();
/* 1045 */         if (renderer == null)
/* 1046 */           renderer = new DefaultListCellRenderer(); 
/* 1047 */         Component c = renderer.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
/* 1048 */         c.applyComponentOrientation(FlatComboBoxUI.FlatComboPopup.this.comboBox.getComponentOrientation());
/*      */ 
/*      */         
/* 1051 */         if (FlatComboBoxUI.FlatComboPopup.this.isPopupOverComboBox() && c instanceof JComponent) {
/* 1052 */           int selectedIndex = FlatComboBoxUI.FlatComboPopup.this.comboBox.getSelectedIndex();
/* 1053 */           ((JComponent)c).putClientProperty("FlatLaf.internal.FlatComboBoxUI.macStyleHint", 
/* 1054 */               (selectedIndex >= 0) ? Boolean.valueOf((index == selectedIndex)) : null);
/*      */         } 
/*      */         
/* 1057 */         FlatComboBoxUI.this.paddingBorder.install(c, Math.round(FlatUIUtils.getBorderFocusWidth(FlatComboBoxUI.FlatComboPopup.this.comboBox)));
/*      */         
/* 1059 */         return c;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class CellPaddingBorder
/*      */     extends AbstractBorder
/*      */   {
/*      */     static final String KEY_MAC_STYLE_HINT = "FlatLaf.internal.FlatComboBoxUI.macStyleHint";
/*      */ 
/*      */     
/*      */     static final int MAC_STYLE_GAP = 4;
/*      */ 
/*      */     
/*      */     private Insets padding;
/*      */ 
/*      */     
/*      */     private JComponent rendererComponent;
/*      */ 
/*      */     
/*      */     private Border rendererBorder;
/*      */ 
/*      */     
/*      */     private int focusWidth;
/*      */ 
/*      */ 
/*      */     
/*      */     CellPaddingBorder(Insets padding) {
/* 1089 */       this.padding = padding;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     synchronized void install(Component c, int focusWidth) {
/* 1095 */       if (!(c instanceof JComponent)) {
/*      */         return;
/*      */       }
/* 1098 */       this.focusWidth = focusWidth;
/*      */       
/* 1100 */       JComponent jc = (JComponent)c;
/* 1101 */       Border oldBorder = jc.getBorder();
/* 1102 */       if (oldBorder == this) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/* 1107 */       if (oldBorder instanceof CellPaddingBorder) {
/* 1108 */         ((CellPaddingBorder)oldBorder).uninstall();
/*      */       }
/*      */ 
/*      */       
/* 1112 */       uninstall();
/*      */ 
/*      */       
/* 1115 */       this.rendererComponent = jc;
/*      */ 
/*      */       
/* 1118 */       this.rendererBorder = jc.getBorder();
/* 1119 */       jc.setBorder(this);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     synchronized void uninstall() {
/* 1129 */       if (this.rendererComponent == null) {
/*      */         return;
/*      */       }
/* 1132 */       this.rendererComponent.putClientProperty("FlatLaf.internal.FlatComboBoxUI.macStyleHint", (Object)null);
/*      */       
/* 1134 */       if (this.rendererComponent.getBorder() == this)
/* 1135 */         this.rendererComponent.setBorder(this.rendererBorder); 
/* 1136 */       this.rendererComponent = null;
/* 1137 */       this.rendererBorder = null;
/*      */     }
/*      */ 
/*      */     
/*      */     public synchronized Insets getBorderInsets(Component c, Insets insets) {
/* 1142 */       Insets padding = UIScale.scale(this.padding);
/* 1143 */       if (this.rendererBorder != null && !(this.rendererBorder instanceof CellPaddingBorder)) {
/* 1144 */         Insets insideInsets = this.rendererBorder.getBorderInsets(c);
/* 1145 */         insets.top = Math.max(padding.top, insideInsets.top);
/* 1146 */         insets.left = Math.max(padding.left, insideInsets.left);
/* 1147 */         insets.bottom = Math.max(padding.bottom, insideInsets.bottom);
/* 1148 */         insets.right = Math.max(padding.right, insideInsets.right);
/*      */       } else {
/* 1150 */         insets.top = padding.top;
/* 1151 */         insets.left = padding.left;
/* 1152 */         insets.bottom = padding.bottom;
/* 1153 */         insets.right = padding.right;
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1158 */       insets.left += this.focusWidth;
/* 1159 */       insets.right += this.focusWidth;
/*      */ 
/*      */       
/* 1162 */       if (c instanceof JComponent) {
/* 1163 */         Boolean macStyleHint = FlatClientProperties.clientPropertyBooleanStrict((JComponent)c, "FlatLaf.internal.FlatComboBoxUI.macStyleHint", null);
/* 1164 */         if (macStyleHint != null) {
/* 1165 */           int indent = FlatComboBoxUI.MacCheckedItemIcon.INSTANCE.getIconWidth() + UIScale.scale(4);
/* 1166 */           if (c.getComponentOrientation().isLeftToRight()) {
/* 1167 */             insets.left += indent;
/*      */           } else {
/* 1169 */             insets.right += indent;
/*      */           } 
/*      */         } 
/*      */       } 
/* 1173 */       return insets;
/*      */     }
/*      */ 
/*      */     
/*      */     public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
/* 1178 */       if (this.rendererBorder != null) {
/* 1179 */         this.rendererBorder.paintBorder(c, g, x, y, width, height);
/*      */       }
/*      */       
/* 1182 */       if (c instanceof JComponent) {
/* 1183 */         Boolean macStyleHint = FlatClientProperties.clientPropertyBooleanStrict((JComponent)c, "FlatLaf.internal.FlatComboBoxUI.macStyleHint", null);
/* 1184 */         if (macStyleHint == Boolean.TRUE) {
/*      */ 
/*      */ 
/*      */           
/* 1188 */           int ix = c.getComponentOrientation().isLeftToRight() ? (x + UIScale.scale(this.padding.left)) : (x + width - UIScale.scale(this.padding.right) - FlatComboBoxUI.MacCheckedItemIcon.INSTANCE.getIconWidth());
/* 1189 */           FlatComboBoxUI.MacCheckedItemIcon.INSTANCE.paintIcon(c, g, ix, y + (height - FlatComboBoxUI.MacCheckedItemIcon.INSTANCE.getIconHeight()) / 2);
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class MacCheckedItemIcon
/*      */     extends FlatCheckBoxMenuItemIcon
/*      */   {
/* 1203 */     static MacCheckedItemIcon INSTANCE = new MacCheckedItemIcon();
/*      */ 
/*      */     
/*      */     protected void paintIcon(Component c, Graphics2D g2) {
/* 1207 */       g2.setColor(c.getForeground());
/* 1208 */       paintCheckmark(g2);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class EditorDelegateAction
/*      */     extends AbstractAction
/*      */   {
/*      */     private final KeyStroke keyStroke;
/*      */ 
/*      */ 
/*      */     
/*      */     EditorDelegateAction(InputMap inputMap, KeyStroke keyStroke) {
/* 1223 */       this.keyStroke = keyStroke;
/*      */ 
/*      */       
/* 1226 */       inputMap.put(keyStroke, this);
/*      */     }
/*      */ 
/*      */     
/*      */     public void actionPerformed(ActionEvent e) {
/* 1231 */       ActionListener action = FlatComboBoxUI.this.comboBox.getActionForKeyStroke(this.keyStroke);
/* 1232 */       if (action != null) {
/* 1233 */         action.actionPerformed(new ActionEvent(FlatComboBoxUI.this.comboBox, e.getID(), e
/* 1234 */               .getActionCommand(), e.getWhen(), e.getModifiers()));
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private class FlatKeySelectionManager
/*      */     implements JComboBox.KeySelectionManager, UIResource
/*      */   {
/*      */     private final JComboBox.KeySelectionManager delegate;
/*      */ 
/*      */     
/*      */     private final long timeFactor;
/*      */ 
/*      */     
/*      */     private long lastTime;
/*      */ 
/*      */ 
/*      */     
/*      */     FlatKeySelectionManager(JComboBox.KeySelectionManager delegate) {
/* 1255 */       this.delegate = delegate;
/*      */       
/* 1257 */       Long value = (Long)UIManager.get("ComboBox.timeFactor");
/* 1258 */       this.timeFactor = (value != null) ? value.longValue() : 1000L;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int selectionForKey(char aKey, ComboBoxModel<?> aModel) {
/* 1264 */       long time = EventQueue.getMostRecentEventTime();
/* 1265 */       long oldLastTime = this.lastTime;
/* 1266 */       this.lastTime = time;
/*      */ 
/*      */       
/* 1269 */       if (aKey == ' ' && time - oldLastTime >= this.timeFactor && 
/*      */         
/* 1271 */         !FlatComboBoxUI.this.comboBox.isPopupVisible()) {
/*      */         
/* 1273 */         FlatComboBoxUI.this.comboBox.setPopupVisible(true);
/* 1274 */         return -1;
/*      */       } 
/*      */       
/* 1277 */       return this.delegate.selectionForKey(aKey, aModel);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatComboBoxUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */