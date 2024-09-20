/*      */ package com.formdev.flatlaf.ui;
/*      */ 
/*      */ import com.formdev.flatlaf.FlatClientProperties;
/*      */ import com.formdev.flatlaf.FlatLaf;
/*      */ import com.formdev.flatlaf.icons.FlatTabbedPaneCloseIcon;
/*      */ import com.formdev.flatlaf.util.Animator;
/*      */ import com.formdev.flatlaf.util.CubicBezierEasing;
/*      */ import com.formdev.flatlaf.util.JavaCompatibility;
/*      */ import com.formdev.flatlaf.util.LoggingFacade;
/*      */ import com.formdev.flatlaf.util.StringUtils;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.AWTKeyStroke;
/*      */ import java.awt.BorderLayout;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Container;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.Font;
/*      */ import java.awt.FontMetrics;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.Graphics2D;
/*      */ import java.awt.Insets;
/*      */ import java.awt.KeyboardFocusManager;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.Point;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.Shape;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.ComponentEvent;
/*      */ import java.awt.event.ComponentListener;
/*      */ import java.awt.event.ContainerEvent;
/*      */ import java.awt.event.ContainerListener;
/*      */ import java.awt.event.FocusEvent;
/*      */ import java.awt.event.FocusListener;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.awt.event.MouseListener;
/*      */ import java.awt.event.MouseMotionListener;
/*      */ import java.awt.event.MouseWheelEvent;
/*      */ import java.awt.geom.Area;
/*      */ import java.awt.geom.Path2D;
/*      */ import java.awt.geom.Rectangle2D;
/*      */ import java.beans.PropertyChangeEvent;
/*      */ import java.beans.PropertyChangeListener;
/*      */ import java.util.Collections;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.function.BiConsumer;
/*      */ import java.util.function.IntConsumer;
/*      */ import java.util.function.Predicate;
/*      */ import javax.accessibility.Accessible;
/*      */ import javax.accessibility.AccessibleContext;
/*      */ import javax.swing.Action;
/*      */ import javax.swing.ActionMap;
/*      */ import javax.swing.ButtonModel;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JComponent;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JMenuItem;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JPopupMenu;
/*      */ import javax.swing.JTabbedPane;
/*      */ import javax.swing.JViewport;
/*      */ import javax.swing.KeyStroke;
/*      */ import javax.swing.SwingUtilities;
/*      */ import javax.swing.Timer;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.event.ChangeEvent;
/*      */ import javax.swing.event.ChangeListener;
/*      */ import javax.swing.event.PopupMenuEvent;
/*      */ import javax.swing.event.PopupMenuListener;
/*      */ import javax.swing.plaf.ComponentUI;
/*      */ import javax.swing.plaf.TabbedPaneUI;
/*      */ import javax.swing.plaf.UIResource;
/*      */ import javax.swing.plaf.basic.BasicTabbedPaneUI;
/*      */ import javax.swing.text.JTextComponent;
/*      */ import javax.swing.text.View;
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
/*      */ public class FlatTabbedPaneUI
/*      */   extends BasicTabbedPaneUI
/*      */   implements FlatStylingSupport.StyleableUI
/*      */ {
/*      */   protected static final int TAB_TYPE_UNDERLINED = 0;
/*      */   protected static final int TAB_TYPE_CARD = 1;
/*      */   protected static final int NEVER = 0;
/*      */   protected static final int AS_NEEDED = 2;
/*      */   protected static final int AS_NEEDED_SINGLE = 3;
/*      */   protected static final int BOTH = 100;
/*      */   protected static final int FILL = 100;
/*      */   protected static final int WIDTH_MODE_PREFERRED = 0;
/*      */   protected static final int WIDTH_MODE_EQUAL = 1;
/*      */   protected static final int WIDTH_MODE_COMPACT = 2;
/*      */   private static Set<KeyStroke> focusForwardTraversalKeys;
/*      */   private static Set<KeyStroke> focusBackwardTraversalKeys;
/*      */   protected Color foreground;
/*      */   @Styleable
/*      */   protected Color disabledForeground;
/*      */   @Styleable
/*      */   protected Color selectedBackground;
/*      */   @Styleable
/*      */   protected Color selectedForeground;
/*      */   @Styleable
/*      */   protected Color underlineColor;
/*      */   @Styleable
/*      */   protected Color inactiveUnderlineColor;
/*      */   @Styleable
/*      */   protected Color disabledUnderlineColor;
/*      */   @Styleable
/*      */   protected Color hoverColor;
/*      */   @Styleable
/*      */   protected Color hoverForeground;
/*      */   @Styleable
/*      */   protected Color focusColor;
/*      */   @Styleable
/*      */   protected Color focusForeground;
/*      */   @Styleable
/*      */   protected Color tabSeparatorColor;
/*      */   @Styleable
/*      */   protected Color contentAreaColor;
/*      */   private int textIconGapUnscaled;
/*      */   @Styleable
/*      */   protected int minimumTabWidth;
/*      */   @Styleable
/*      */   protected int maximumTabWidth;
/*      */   @Styleable
/*      */   protected int tabHeight;
/*      */   @Styleable
/*      */   protected int tabSelectionHeight;
/*      */   @Styleable
/*      */   protected int cardTabSelectionHeight;
/*      */   @Styleable
/*      */   protected int tabArc;
/*      */   @Styleable
/*      */   protected int tabSelectionArc;
/*      */   @Styleable
/*      */   protected int cardTabArc;
/*      */   @Styleable
/*      */   protected Insets selectedInsets;
/*      */   @Styleable
/*      */   protected Insets tabSelectionInsets;
/*      */   @Styleable
/*      */   protected int contentSeparatorHeight;
/*      */   @Styleable
/*      */   protected boolean showTabSeparators;
/*      */   @Styleable
/*      */   protected boolean tabSeparatorsFullHeight;
/*      */   @Styleable
/*      */   protected boolean hasFullBorder;
/*      */   @Styleable
/*      */   protected boolean tabsOpaque = true;
/*      */   @Styleable
/*      */   protected boolean rotateTabRuns = true;
/*      */   @Styleable(type = String.class)
/*      */   private int tabType;
/*      */   @Styleable(type = String.class)
/*      */   private int tabsPopupPolicy;
/*      */   @Styleable(type = String.class)
/*      */   private int scrollButtonsPolicy;
/*      */   @Styleable(type = String.class)
/*      */   private int scrollButtonsPlacement;
/*      */   @Styleable(type = String.class)
/*      */   private int tabAreaAlignment;
/*      */   @Styleable(type = String.class)
/*      */   private int tabAlignment;
/*      */   @Styleable(type = String.class)
/*      */   private int tabWidthMode;
/*      */   protected Icon closeIcon;
/*      */   @Styleable
/*      */   protected String arrowType;
/*      */   @Styleable
/*      */   protected Insets buttonInsets;
/*      */   @Styleable
/*      */   protected int buttonArc;
/*      */   @Styleable
/*      */   protected Color buttonHoverBackground;
/*      */   @Styleable
/*      */   protected Color buttonPressedBackground;
/*      */   @Styleable
/*      */   protected String moreTabsButtonToolTipText;
/*      */   @Styleable
/*      */   protected String tabCloseToolTipText;
/*      */   @Styleable
/*      */   protected boolean showContentSeparator = true;
/*      */   @Styleable
/*      */   protected boolean hideTabAreaWithOneTab;
/*      */   @Styleable
/*      */   protected boolean tabClosable;
/*      */   @Styleable
/*  263 */   protected int tabIconPlacement = 10;
/*      */   
/*      */   protected JViewport tabViewport;
/*      */   
/*      */   protected FlatWheelTabScroller wheelTabScroller;
/*      */   
/*      */   private JButton tabCloseButton;
/*      */   
/*      */   private JButton moreTabsButton;
/*      */   private Container leadingComponent;
/*      */   private Container trailingComponent;
/*      */   private Dimension scrollBackwardButtonPrefSize;
/*      */   private Handler handler;
/*      */   private boolean blockRollover;
/*      */   private boolean rolloverTabClose;
/*      */   private boolean pressedTabClose;
/*      */   private Object[] oldRenderingHints;
/*      */   private Map<String, Object> oldStyleValues;
/*      */   private boolean closeIconShared = true;
/*      */   private boolean inCalculateEqual;
/*      */   
/*      */   public static ComponentUI createUI(JComponent c) {
/*  285 */     return new FlatTabbedPaneUI();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void installUI(JComponent c) {
/*  291 */     String tabLayoutPolicyStr = UIManager.getString("TabbedPane.tabLayoutPolicy");
/*  292 */     if (tabLayoutPolicyStr != null) {
/*      */       int tabLayoutPolicy;
/*  294 */       switch (tabLayoutPolicyStr) {
/*      */         default:
/*  296 */           tabLayoutPolicy = 0; break;
/*  297 */         case "scroll": tabLayoutPolicy = 1; break;
/*      */       } 
/*  299 */       ((JTabbedPane)c).setTabLayoutPolicy(tabLayoutPolicy);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  304 */     this.arrowType = UIManager.getString("TabbedPane.arrowType");
/*  305 */     this.foreground = UIManager.getColor("TabbedPane.foreground");
/*  306 */     this.disabledForeground = UIManager.getColor("TabbedPane.disabledForeground");
/*  307 */     this.buttonHoverBackground = UIManager.getColor("TabbedPane.buttonHoverBackground");
/*  308 */     this.buttonPressedBackground = UIManager.getColor("TabbedPane.buttonPressedBackground");
/*      */     
/*  310 */     super.installUI(c);
/*      */     
/*  312 */     FlatSelectedTabRepainter.install();
/*  313 */     installStyle();
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installDefaults() {
/*  318 */     if (UIManager.getBoolean("TabbedPane.tabsOverlapBorder")) {
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
/*  334 */       Object oldValue = UIManager.put("TabbedPane.tabsOverlapBorder", Boolean.valueOf(false));
/*  335 */       super.installDefaults();
/*  336 */       UIManager.put("TabbedPane.tabsOverlapBorder", oldValue);
/*      */     } else {
/*  338 */       super.installDefaults();
/*      */     } 
/*  340 */     this.selectedBackground = UIManager.getColor("TabbedPane.selectedBackground");
/*  341 */     this.selectedForeground = UIManager.getColor("TabbedPane.selectedForeground");
/*  342 */     this.underlineColor = UIManager.getColor("TabbedPane.underlineColor");
/*  343 */     this.inactiveUnderlineColor = FlatUIUtils.getUIColor("TabbedPane.inactiveUnderlineColor", this.underlineColor);
/*  344 */     this.disabledUnderlineColor = UIManager.getColor("TabbedPane.disabledUnderlineColor");
/*  345 */     this.hoverColor = UIManager.getColor("TabbedPane.hoverColor");
/*  346 */     this.hoverForeground = UIManager.getColor("TabbedPane.hoverForeground");
/*  347 */     this.focusColor = UIManager.getColor("TabbedPane.focusColor");
/*  348 */     this.focusForeground = UIManager.getColor("TabbedPane.focusForeground");
/*  349 */     this.tabSeparatorColor = UIManager.getColor("TabbedPane.tabSeparatorColor");
/*  350 */     this.contentAreaColor = UIManager.getColor("TabbedPane.contentAreaColor");
/*      */     
/*  352 */     this.textIconGapUnscaled = UIManager.getInt("TabbedPane.textIconGap");
/*  353 */     this.minimumTabWidth = UIManager.getInt("TabbedPane.minimumTabWidth");
/*  354 */     this.maximumTabWidth = UIManager.getInt("TabbedPane.maximumTabWidth");
/*  355 */     this.tabHeight = UIManager.getInt("TabbedPane.tabHeight");
/*  356 */     this.tabSelectionHeight = UIManager.getInt("TabbedPane.tabSelectionHeight");
/*  357 */     this.cardTabSelectionHeight = UIManager.getInt("TabbedPane.cardTabSelectionHeight");
/*  358 */     this.tabArc = UIManager.getInt("TabbedPane.tabArc");
/*  359 */     this.tabSelectionArc = UIManager.getInt("TabbedPane.tabSelectionArc");
/*  360 */     this.cardTabArc = UIManager.getInt("TabbedPane.cardTabArc");
/*  361 */     this.selectedInsets = UIManager.getInsets("TabbedPane.selectedInsets");
/*  362 */     this.tabSelectionInsets = UIManager.getInsets("TabbedPane.tabSelectionInsets");
/*  363 */     this.contentSeparatorHeight = UIManager.getInt("TabbedPane.contentSeparatorHeight");
/*  364 */     this.showTabSeparators = UIManager.getBoolean("TabbedPane.showTabSeparators");
/*  365 */     this.tabSeparatorsFullHeight = UIManager.getBoolean("TabbedPane.tabSeparatorsFullHeight");
/*  366 */     this.hasFullBorder = UIManager.getBoolean("TabbedPane.hasFullBorder");
/*  367 */     this.tabsOpaque = UIManager.getBoolean("TabbedPane.tabsOpaque");
/*  368 */     this.rotateTabRuns = FlatUIUtils.getUIBoolean("TabbedPane.rotateTabRuns", true);
/*      */     
/*  370 */     this.tabType = parseTabType(UIManager.getString("TabbedPane.tabType"));
/*  371 */     this.tabsPopupPolicy = parseTabsPopupPolicy(UIManager.getString("TabbedPane.tabsPopupPolicy"));
/*  372 */     this.scrollButtonsPolicy = parseScrollButtonsPolicy(UIManager.getString("TabbedPane.scrollButtonsPolicy"));
/*  373 */     this.scrollButtonsPlacement = parseScrollButtonsPlacement(UIManager.getString("TabbedPane.scrollButtonsPlacement"));
/*      */     
/*  375 */     this.tabAreaAlignment = parseAlignment(UIManager.getString("TabbedPane.tabAreaAlignment"), 10);
/*  376 */     this.tabAlignment = parseAlignment(UIManager.getString("TabbedPane.tabAlignment"), 0);
/*  377 */     this.tabWidthMode = parseTabWidthMode(UIManager.getString("TabbedPane.tabWidthMode"));
/*  378 */     this.closeIcon = UIManager.getIcon("TabbedPane.closeIcon");
/*  379 */     this.closeIconShared = true;
/*      */     
/*  381 */     this.buttonInsets = UIManager.getInsets("TabbedPane.buttonInsets");
/*  382 */     this.buttonArc = UIManager.getInt("TabbedPane.buttonArc");
/*      */     
/*  384 */     Locale l = this.tabPane.getLocale();
/*  385 */     this.moreTabsButtonToolTipText = UIManager.getString("TabbedPane.moreTabsButtonToolTipText", l);
/*  386 */     this.tabCloseToolTipText = UIManager.getString("TabbedPane.tabCloseToolTipText", l);
/*      */ 
/*      */     
/*  389 */     this.textIconGap = UIScale.scale(this.textIconGapUnscaled);
/*      */ 
/*      */ 
/*      */     
/*  393 */     if (focusForwardTraversalKeys == null) {
/*  394 */       focusForwardTraversalKeys = Collections.singleton(KeyStroke.getKeyStroke(9, 0));
/*  395 */       focusBackwardTraversalKeys = Collections.singleton(KeyStroke.getKeyStroke(9, 64));
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  400 */     this.tabPane.setFocusTraversalKeys(0, (Set)focusForwardTraversalKeys);
/*  401 */     this.tabPane.setFocusTraversalKeys(1, (Set)focusBackwardTraversalKeys);
/*      */     
/*  403 */     MigLayoutVisualPadding.install(this.tabPane, null);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void uninstallDefaults() {
/*  409 */     this.tabPane.setFocusTraversalKeys(0, (Set<? extends AWTKeyStroke>)null);
/*  410 */     this.tabPane.setFocusTraversalKeys(1, (Set<? extends AWTKeyStroke>)null);
/*      */     
/*  412 */     super.uninstallDefaults();
/*      */     
/*  414 */     this.foreground = null;
/*  415 */     this.disabledForeground = null;
/*  416 */     this.selectedBackground = null;
/*  417 */     this.selectedForeground = null;
/*  418 */     this.underlineColor = null;
/*  419 */     this.inactiveUnderlineColor = null;
/*  420 */     this.disabledUnderlineColor = null;
/*  421 */     this.hoverColor = null;
/*  422 */     this.hoverForeground = null;
/*  423 */     this.focusColor = null;
/*  424 */     this.focusForeground = null;
/*  425 */     this.tabSeparatorColor = null;
/*  426 */     this.contentAreaColor = null;
/*  427 */     this.closeIcon = null;
/*      */     
/*  429 */     this.buttonHoverBackground = null;
/*  430 */     this.buttonPressedBackground = null;
/*      */     
/*  432 */     this.oldStyleValues = null;
/*      */     
/*  434 */     MigLayoutVisualPadding.uninstall(this.tabPane);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installComponents() {
/*  439 */     super.installComponents();
/*      */ 
/*      */     
/*  442 */     this.tabViewport = null;
/*  443 */     if (isScrollTabLayout()) {
/*  444 */       for (Component c : this.tabPane.getComponents()) {
/*  445 */         if (c instanceof JViewport && c.getClass().getName().equals("javax.swing.plaf.basic.BasicTabbedPaneUI$ScrollableTabViewport")) {
/*  446 */           this.tabViewport = (JViewport)c;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */     }
/*  452 */     installHiddenTabsNavigation();
/*  453 */     installLeadingComponent();
/*  454 */     installTrailingComponent();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void uninstallComponents() {
/*  461 */     uninstallHiddenTabsNavigation();
/*  462 */     uninstallLeadingComponent();
/*  463 */     uninstallTrailingComponent();
/*      */     
/*  465 */     super.uninstallComponents();
/*      */     
/*  467 */     this.tabCloseButton = null;
/*  468 */     this.tabViewport = null;
/*      */   }
/*      */   
/*      */   protected void installHiddenTabsNavigation() {
/*  472 */     if (!isScrollTabLayout() || this.tabViewport == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  481 */     this.tabPane.setLayout(createScrollLayoutManager((BasicTabbedPaneUI.TabbedPaneLayout)this.tabPane.getLayout()));
/*      */ 
/*      */     
/*  484 */     this.moreTabsButton = createMoreTabsButton();
/*  485 */     this.tabPane.add(this.moreTabsButton);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void uninstallHiddenTabsNavigation() {
/*  491 */     if (this.tabPane.getLayout() instanceof FlatTabbedPaneScrollLayout) {
/*  492 */       this.tabPane.setLayout(((FlatTabbedPaneScrollLayout)this.tabPane.getLayout()).delegate);
/*      */     }
/*  494 */     if (this.moreTabsButton != null) {
/*  495 */       this.tabPane.remove(this.moreTabsButton);
/*  496 */       this.moreTabsButton = null;
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void installLeadingComponent() {
/*  501 */     Object c = this.tabPane.getClientProperty("JTabbedPane.leadingComponent");
/*  502 */     if (c instanceof Component) {
/*  503 */       this.leadingComponent = new ContainerUIResource((Component)c);
/*  504 */       this.tabPane.add(this.leadingComponent);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void uninstallLeadingComponent() {
/*  509 */     if (this.leadingComponent != null) {
/*  510 */       this.tabPane.remove(this.leadingComponent);
/*  511 */       this.leadingComponent = null;
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void installTrailingComponent() {
/*  516 */     Object c = this.tabPane.getClientProperty("JTabbedPane.trailingComponent");
/*  517 */     if (c instanceof Component) {
/*  518 */       this.trailingComponent = new ContainerUIResource((Component)c);
/*  519 */       this.tabPane.add(this.trailingComponent);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void uninstallTrailingComponent() {
/*  524 */     if (this.trailingComponent != null) {
/*  525 */       this.tabPane.remove(this.trailingComponent);
/*  526 */       this.trailingComponent = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installListeners() {
/*  532 */     super.installListeners();
/*      */     
/*  534 */     getHandler().installListeners();
/*      */     
/*  536 */     if (this.tabViewport != null && (this.wheelTabScroller = createWheelTabScroller()) != null) {
/*      */ 
/*      */ 
/*      */       
/*  540 */       this.tabPane.addMouseWheelListener(this.wheelTabScroller);
/*  541 */       this.tabPane.addMouseMotionListener(this.wheelTabScroller);
/*  542 */       this.tabPane.addMouseListener(this.wheelTabScroller);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void uninstallListeners() {
/*  548 */     super.uninstallListeners();
/*      */     
/*  550 */     if (this.handler != null) {
/*  551 */       this.handler.uninstallListeners();
/*  552 */       this.handler = null;
/*      */     } 
/*      */     
/*  555 */     if (this.wheelTabScroller != null) {
/*  556 */       this.wheelTabScroller.uninstall();
/*      */       
/*  558 */       this.tabPane.removeMouseWheelListener(this.wheelTabScroller);
/*  559 */       this.tabPane.removeMouseMotionListener(this.wheelTabScroller);
/*  560 */       this.tabPane.removeMouseListener(this.wheelTabScroller);
/*  561 */       this.wheelTabScroller = null;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installKeyboardActions() {
/*  567 */     super.installKeyboardActions();
/*      */ 
/*      */     
/*  570 */     ActionMap map = SwingUtilities.getUIActionMap(this.tabPane);
/*  571 */     if (map != null) {
/*      */ 
/*      */       
/*  574 */       RunWithOriginalLayoutManagerDelegateAction.install(map, "scrollTabsForwardAction");
/*  575 */       RunWithOriginalLayoutManagerDelegateAction.install(map, "scrollTabsBackwardAction");
/*      */     } 
/*      */   }
/*      */   
/*      */   private Handler getHandler() {
/*  580 */     if (this.handler == null)
/*  581 */       this.handler = new Handler(); 
/*  582 */     return this.handler;
/*      */   }
/*      */   
/*      */   protected FlatWheelTabScroller createWheelTabScroller() {
/*  586 */     return new FlatWheelTabScroller();
/*      */   }
/*      */ 
/*      */   
/*      */   protected MouseListener createMouseListener() {
/*  591 */     Handler handler = getHandler();
/*  592 */     handler.mouseDelegate = super.createMouseListener();
/*  593 */     return handler;
/*      */   }
/*      */ 
/*      */   
/*      */   protected PropertyChangeListener createPropertyChangeListener() {
/*  598 */     Handler handler = getHandler();
/*  599 */     handler.propertyChangeDelegate = super.createPropertyChangeListener();
/*  600 */     return handler;
/*      */   }
/*      */ 
/*      */   
/*      */   protected ChangeListener createChangeListener() {
/*  605 */     Handler handler = getHandler();
/*  606 */     handler.changeDelegate = super.createChangeListener();
/*  607 */     return handler;
/*      */   }
/*      */ 
/*      */   
/*      */   protected FocusListener createFocusListener() {
/*  612 */     Handler handler = getHandler();
/*  613 */     handler.focusDelegate = super.createFocusListener();
/*  614 */     return handler;
/*      */   }
/*      */ 
/*      */   
/*      */   protected LayoutManager createLayoutManager() {
/*  619 */     if (this.tabPane.getTabLayoutPolicy() == 0) {
/*  620 */       return new FlatTabbedPaneLayout();
/*      */     }
/*  622 */     return super.createLayoutManager();
/*      */   }
/*      */   
/*      */   protected LayoutManager createScrollLayoutManager(BasicTabbedPaneUI.TabbedPaneLayout delegate) {
/*  626 */     return new FlatTabbedPaneScrollLayout(delegate);
/*      */   }
/*      */   
/*      */   protected JButton createMoreTabsButton() {
/*  630 */     return new FlatMoreTabsButton();
/*      */   }
/*      */ 
/*      */   
/*      */   protected JButton createScrollButton(int direction) {
/*  635 */     return new FlatScrollableTabButton(direction);
/*      */   }
/*      */ 
/*      */   
/*      */   protected void installStyle() {
/*      */     try {
/*  641 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.tabPane, "TabbedPane"));
/*  642 */     } catch (RuntimeException ex) {
/*  643 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void applyStyle(Object style) {
/*  649 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*      */ 
/*      */     
/*  652 */     for (Component c : this.tabPane.getComponents()) {
/*  653 */       if (c instanceof FlatTabAreaButton) {
/*  654 */         ((FlatTabAreaButton)c).updateStyle();
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected Object applyStyleProperty(String key, Object value) {
/*  661 */     if (key.startsWith("close")) {
/*  662 */       if (!(this.closeIcon instanceof FlatTabbedPaneCloseIcon)) {
/*  663 */         return new FlatStylingSupport.UnknownStyleException(key);
/*      */       }
/*  665 */       if (this.closeIconShared) {
/*  666 */         this.closeIcon = FlatStylingSupport.cloneIcon(this.closeIcon);
/*  667 */         this.closeIconShared = false;
/*      */       } 
/*      */       
/*  670 */       return ((FlatTabbedPaneCloseIcon)this.closeIcon).applyStyleProperty(key, value);
/*      */     } 
/*      */     
/*  673 */     if (value instanceof String) {
/*  674 */       switch (key) { case "tabType":
/*  675 */           value = Integer.valueOf(parseTabType((String)value)); break;
/*  676 */         case "tabsPopupPolicy": value = Integer.valueOf(parseTabsPopupPolicy((String)value)); break;
/*  677 */         case "scrollButtonsPolicy": value = Integer.valueOf(parseScrollButtonsPolicy((String)value)); break;
/*  678 */         case "scrollButtonsPlacement": value = Integer.valueOf(parseScrollButtonsPlacement((String)value)); break;
/*      */         case "tabAreaAlignment":
/*  680 */           value = Integer.valueOf(parseAlignment((String)value, 10)); break;
/*  681 */         case "tabAlignment": value = Integer.valueOf(parseAlignment((String)value, 0)); break;
/*  682 */         case "tabWidthMode": value = Integer.valueOf(parseTabWidthMode((String)value)); break;
/*      */         case "tabIconPlacement":
/*  684 */           value = Integer.valueOf(parseTabIconPlacement((String)value)); break; }
/*      */     
/*      */     } else {
/*      */       Object oldValue;
/*  688 */       switch (key) {
/*      */         case "tabInsets":
/*  690 */           oldValue = this.tabInsets; this.tabInsets = (Insets)value; return oldValue;
/*  691 */         case "tabAreaInsets": oldValue = this.tabAreaInsets; this.tabAreaInsets = (Insets)value; return oldValue;
/*      */         case "textIconGap":
/*  693 */           oldValue = Integer.valueOf(this.textIconGapUnscaled);
/*  694 */           this.textIconGapUnscaled = ((Integer)value).intValue();
/*  695 */           this.textIconGap = UIScale.scale(this.textIconGapUnscaled);
/*  696 */           return oldValue;
/*      */       } 
/*      */     
/*      */     } 
/*  700 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, this.tabPane, key, value);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/*  706 */     Map<String, Class<?>> infos = new FlatStylingSupport.StyleableInfosMap<>();
/*  707 */     infos.put("tabInsets", Insets.class);
/*  708 */     infos.put("tabAreaInsets", Insets.class);
/*  709 */     infos.put("textIconGap", int.class);
/*  710 */     FlatStylingSupport.collectAnnotatedStyleableInfos(this, infos);
/*  711 */     if (this.closeIcon instanceof FlatTabbedPaneCloseIcon)
/*  712 */       infos.putAll(((FlatTabbedPaneCloseIcon)this.closeIcon).getStyleableInfos()); 
/*  713 */     return infos;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object getStyleableValue(JComponent c, String key) {
/*  720 */     if (key.startsWith("close")) {
/*  721 */       return (this.closeIcon instanceof FlatTabbedPaneCloseIcon) ? (
/*  722 */         (FlatTabbedPaneCloseIcon)this.closeIcon).getStyleableValue(key) : 
/*  723 */         null;
/*      */     }
/*      */     
/*  726 */     switch (key) {
/*      */       case "tabInsets":
/*  728 */         return this.tabInsets;
/*  729 */       case "tabAreaInsets": return this.tabAreaInsets;
/*  730 */       case "textIconGap": return Integer.valueOf(this.textIconGapUnscaled);
/*      */ 
/*      */       
/*      */       case "tabType":
/*  734 */         switch (this.tabType)
/*      */         { default:
/*  736 */             return "underlined";
/*  737 */           case 1: break; }  return "card";
/*      */ 
/*      */       
/*      */       case "tabsPopupPolicy":
/*  741 */         switch (this.tabsPopupPolicy)
/*      */         { default:
/*  743 */             return "asNeeded";
/*  744 */           case 0: break; }  return "never";
/*      */ 
/*      */       
/*      */       case "scrollButtonsPolicy":
/*  748 */         switch (this.scrollButtonsPolicy)
/*      */         { default:
/*  750 */             return "asNeededSingle";
/*  751 */           case 2: return "asNeeded";
/*  752 */           case 0: break; }  return "never";
/*      */ 
/*      */       
/*      */       case "scrollButtonsPlacement":
/*  756 */         switch (this.scrollButtonsPlacement)
/*      */         { default:
/*  758 */             return "both";
/*  759 */           case 11: break; }  return "trailing";
/*      */       
/*      */       case "tabAreaAlignment":
/*  762 */         return alignmentToString(this.tabAreaAlignment, "leading");
/*  763 */       case "tabAlignment": return alignmentToString(this.tabAlignment, "center");
/*      */       
/*      */       case "tabWidthMode":
/*  766 */         switch (this.tabWidthMode)
/*      */         { default:
/*  768 */             return "preferred";
/*  769 */           case 1: return "equal";
/*  770 */           case 2: break; }  return "compact";
/*      */ 
/*      */       
/*      */       case "tabIconPlacement":
/*  774 */         switch (this.tabIconPlacement)
/*      */         { default:
/*  776 */             return "leading";
/*  777 */           case 11: return "trailing";
/*  778 */           case 1: return "top";
/*  779 */           case 3: break; }  return "bottom";
/*      */     } 
/*      */ 
/*      */     
/*  783 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*      */   }
/*      */   
/*      */   protected void setRolloverTab(int x, int y) {
/*  787 */     setRolloverTab(tabForCoordinate(this.tabPane, x, y));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void setRolloverTab(int index) {
/*  792 */     if (this.blockRollover) {
/*      */       return;
/*      */     }
/*  795 */     int oldIndex = getRolloverTab();
/*  796 */     super.setRolloverTab(index);
/*      */     
/*  798 */     if (index == oldIndex) {
/*      */       return;
/*      */     }
/*      */     
/*  802 */     repaintTab(oldIndex);
/*  803 */     repaintTab(index);
/*      */   }
/*      */   
/*      */   protected boolean isRolloverTabClose() {
/*  807 */     return this.rolloverTabClose;
/*      */   }
/*      */   
/*      */   protected void setRolloverTabClose(boolean rollover) {
/*  811 */     if (this.rolloverTabClose == rollover) {
/*      */       return;
/*      */     }
/*  814 */     this.rolloverTabClose = rollover;
/*  815 */     repaintTab(getRolloverTab());
/*      */   }
/*      */   
/*      */   protected boolean isPressedTabClose() {
/*  819 */     return this.pressedTabClose;
/*      */   }
/*      */   
/*      */   protected void setPressedTabClose(boolean pressed) {
/*  823 */     if (this.pressedTabClose == pressed) {
/*      */       return;
/*      */     }
/*  826 */     this.pressedTabClose = pressed;
/*  827 */     repaintTab(getRolloverTab());
/*      */   }
/*      */   
/*      */   private void repaintTab(int tabIndex) {
/*  831 */     if (tabIndex < 0 || tabIndex >= this.tabPane.getTabCount()) {
/*      */       return;
/*      */     }
/*  834 */     Rectangle r = getTabBounds(this.tabPane, tabIndex);
/*  835 */     if (r == null) {
/*      */       return;
/*      */     }
/*      */     
/*  839 */     if (this.contentSeparatorHeight > 0 && 
/*  840 */       FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.showContentSeparator", true)) {
/*      */       
/*  842 */       int sh = UIScale.scale(this.contentSeparatorHeight);
/*  843 */       switch (this.tabPane.getTabPlacement()) {
/*      */         default:
/*  845 */           r.height += sh; break;
/*  846 */         case 3: r.height += sh; r.y -= sh; break;
/*  847 */         case 2: r.width += sh; break;
/*  848 */         case 4: r.width += sh; r.x -= sh;
/*      */           break;
/*      */       } 
/*      */     } 
/*  852 */     this.tabPane.repaint(r);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
/*  859 */     int tabWidth, tabWidthMode = getTabWidthMode();
/*  860 */     if (tabWidthMode == 1 && isHorizontalTabPlacement() && !this.inCalculateEqual) {
/*  861 */       this.inCalculateEqual = true;
/*      */       try {
/*  863 */         tabWidth = calculateMaxTabWidth(tabPlacement); return tabWidth;
/*      */       } finally {
/*  865 */         this.inCalculateEqual = false;
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  870 */     this.textIconGap = UIScale.scale(this.textIconGapUnscaled);
/*      */     
/*      */     Icon icon;
/*      */     
/*  874 */     if (tabWidthMode == 2 && tabIndex != this.tabPane
/*  875 */       .getSelectedIndex() && 
/*  876 */       isHorizontalTabPlacement() && this.tabPane
/*  877 */       .getTabComponentAt(tabIndex) == null && (
/*  878 */       icon = getIconForTab(tabIndex)) != null) {
/*      */       
/*  880 */       Insets tabInsets = getTabInsets(tabPlacement, tabIndex);
/*  881 */       tabWidth = icon.getIconWidth() + tabInsets.left + tabInsets.right;
/*      */     } else {
/*  883 */       int iconPlacement = FlatClientProperties.clientPropertyInt(this.tabPane, "JTabbedPane.tabIconPlacement", this.tabIconPlacement);
/*  884 */       if ((iconPlacement == 1 || iconPlacement == 3) && this.tabPane
/*  885 */         .getTabComponentAt(tabIndex) == null && (
/*  886 */         icon = getIconForTab(tabIndex)) != null) {
/*      */ 
/*      */         
/*  889 */         tabWidth = icon.getIconWidth();
/*      */         
/*  891 */         View view = getTextViewForTab(tabIndex);
/*  892 */         if (view != null) {
/*  893 */           tabWidth = Math.max(tabWidth, (int)view.getPreferredSpan(0));
/*      */         } else {
/*  895 */           String title = this.tabPane.getTitleAt(tabIndex);
/*  896 */           if (title != null) {
/*  897 */             tabWidth = Math.max(tabWidth, metrics.stringWidth(title));
/*      */           }
/*      */         } 
/*  900 */         Insets tabInsets = getTabInsets(tabPlacement, tabIndex);
/*  901 */         tabWidth += tabInsets.left + tabInsets.right;
/*      */       } else {
/*  903 */         tabWidth = super.calculateTabWidth(tabPlacement, tabIndex, metrics) - 3;
/*      */       } 
/*      */     } 
/*      */     
/*  907 */     if (isTabClosable(tabIndex)) {
/*  908 */       tabWidth += this.closeIcon.getIconWidth();
/*      */     }
/*      */     
/*  911 */     int min = getTabClientPropertyInt(tabIndex, "JTabbedPane.minimumTabWidth", this.minimumTabWidth);
/*  912 */     int max = getTabClientPropertyInt(tabIndex, "JTabbedPane.maximumTabWidth", this.maximumTabWidth);
/*  913 */     if (min > 0)
/*  914 */       tabWidth = Math.max(tabWidth, UIScale.scale(min)); 
/*  915 */     if (max > 0 && this.tabPane.getTabComponentAt(tabIndex) == null) {
/*  916 */       tabWidth = Math.min(tabWidth, UIScale.scale(max));
/*      */     }
/*  918 */     return tabWidth;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
/*  926 */     int tabHeight, iconPlacement = FlatClientProperties.clientPropertyInt(this.tabPane, "JTabbedPane.tabIconPlacement", this.tabIconPlacement); Icon icon;
/*  927 */     if ((iconPlacement == 1 || iconPlacement == 3) && this.tabPane
/*  928 */       .getTabComponentAt(tabIndex) == null && (
/*  929 */       icon = getIconForTab(tabIndex)) != null) {
/*      */ 
/*      */       
/*  932 */       tabHeight = icon.getIconHeight();
/*      */       
/*  934 */       View view = getTextViewForTab(tabIndex);
/*  935 */       if (view != null) {
/*  936 */         tabHeight += (int)view.getPreferredSpan(1) + UIScale.scale(this.textIconGapUnscaled);
/*  937 */       } else if (this.tabPane.getTitleAt(tabIndex) != null) {
/*  938 */         tabHeight += fontHeight + UIScale.scale(this.textIconGapUnscaled);
/*      */       } 
/*  940 */       Insets tabInsets = getTabInsets(tabPlacement, tabIndex);
/*  941 */       tabHeight += tabInsets.top + tabInsets.bottom;
/*      */     } else {
/*  943 */       tabHeight = super.calculateTabHeight(tabPlacement, tabIndex, fontHeight) - 2;
/*      */     } 
/*  945 */     return Math.max(tabHeight, UIScale.scale(FlatClientProperties.clientPropertyInt(this.tabPane, "JTabbedPane.tabHeight", this.tabHeight)));
/*      */   }
/*      */ 
/*      */   
/*      */   protected int calculateMaxTabWidth(int tabPlacement) {
/*  950 */     return hideTabArea() ? 0 : super.calculateMaxTabWidth(tabPlacement);
/*      */   }
/*      */ 
/*      */   
/*      */   protected int calculateMaxTabHeight(int tabPlacement) {
/*  955 */     return hideTabArea() ? 0 : super.calculateMaxTabHeight(tabPlacement);
/*      */   }
/*      */ 
/*      */   
/*      */   protected int calculateTabAreaWidth(int tabPlacement, int vertRunCount, int maxTabWidth) {
/*  960 */     return hideTabArea() ? 0 : super.calculateTabAreaWidth(tabPlacement, vertRunCount, maxTabWidth);
/*      */   }
/*      */ 
/*      */   
/*      */   protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
/*  965 */     return hideTabArea() ? 0 : super.calculateTabAreaHeight(tabPlacement, horizRunCount, maxTabHeight);
/*      */   }
/*      */ 
/*      */   
/*      */   protected Insets getTabInsets(int tabPlacement, int tabIndex) {
/*  970 */     Object value = getTabClientProperty(tabIndex, "JTabbedPane.tabInsets");
/*  971 */     return UIScale.scale((value instanceof Insets) ? 
/*  972 */         (Insets)value : 
/*  973 */         super.getTabInsets(tabPlacement, tabIndex));
/*      */   }
/*      */ 
/*      */   
/*      */   protected Insets getSelectedTabPadInsets(int tabPlacement) {
/*  978 */     return new Insets(0, 0, 0, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Insets getRealTabAreaInsets(int tabPlacement) {
/*  986 */     if (this.tabAreaInsets == null) {
/*  987 */       this.tabAreaInsets = new Insets(0, 0, 0, 0);
/*      */     }
/*  989 */     Insets currentTabAreaInsets = super.getTabAreaInsets(tabPlacement);
/*  990 */     Insets insets = (Insets)currentTabAreaInsets.clone();
/*      */     
/*  992 */     Object value = this.tabPane.getClientProperty("JTabbedPane.tabAreaInsets");
/*  993 */     if (value instanceof Insets) {
/*  994 */       rotateInsets((Insets)value, insets, tabPlacement);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1001 */     currentTabAreaInsets.top = currentTabAreaInsets.left = -10000;
/*      */ 
/*      */     
/* 1004 */     insets = UIScale.scale(insets);
/*      */     
/* 1006 */     return insets;
/*      */   }
/*      */ 
/*      */   
/*      */   protected Insets getTabAreaInsets(int tabPlacement) {
/* 1011 */     Insets insets = getRealTabAreaInsets(tabPlacement);
/*      */ 
/*      */     
/* 1014 */     if (this.tabPane.getTabLayoutPolicy() == 0) {
/* 1015 */       if (isHorizontalTabPlacement()) {
/* 1016 */         insets.left += getLeadingPreferredWidth();
/* 1017 */         insets.right += getTrailingPreferredWidth();
/*      */       } else {
/* 1019 */         insets.top += getLeadingPreferredHeight();
/* 1020 */         insets.bottom += getTrailingPreferredHeight();
/*      */       } 
/*      */     }
/*      */     
/* 1024 */     return insets;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Insets getContentBorderInsets(int tabPlacement) {
/* 1034 */     if (hideTabArea() || this.contentSeparatorHeight == 0 || !FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.showContentSeparator", this.showContentSeparator)) {
/* 1035 */       return new Insets(0, 0, 0, 0);
/*      */     }
/* 1037 */     boolean hasFullBorder = FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.hasFullBorder", this.hasFullBorder);
/* 1038 */     int sh = UIScale.scale(this.contentSeparatorHeight);
/* 1039 */     Insets insets = hasFullBorder ? new Insets(sh, sh, sh, sh) : new Insets(sh, 0, 0, 0);
/*      */     
/* 1041 */     Insets contentBorderInsets = new Insets(0, 0, 0, 0);
/* 1042 */     rotateInsets(insets, contentBorderInsets, tabPlacement);
/* 1043 */     return contentBorderInsets;
/*      */   }
/*      */ 
/*      */   
/*      */   protected int getTabLabelShiftX(int tabPlacement, int tabIndex, boolean isSelected) {
/* 1048 */     if (isTabClosable(tabIndex)) {
/* 1049 */       int shift = this.closeIcon.getIconWidth() / 2;
/* 1050 */       return isLeftToRight() ? -shift : shift;
/*      */     } 
/* 1052 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected int getTabLabelShiftY(int tabPlacement, int tabIndex, boolean isSelected) {
/* 1057 */     return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   public void update(Graphics g, JComponent c) {
/* 1062 */     this.oldRenderingHints = FlatUIUtils.setRenderingHints(g);
/*      */     
/* 1064 */     super.update(g, c);
/*      */     
/* 1066 */     FlatUIUtils.resetRenderingHints(g, this.oldRenderingHints);
/* 1067 */     this.oldRenderingHints = null;
/*      */   }
/*      */ 
/*      */   
/*      */   public void paint(Graphics g, JComponent c) {
/* 1072 */     if (hideTabArea()) {
/*      */       return;
/*      */     }
/* 1075 */     ensureCurrentLayout();
/*      */     
/* 1077 */     int tabPlacement = this.tabPane.getTabPlacement();
/* 1078 */     int selectedIndex = this.tabPane.getSelectedIndex();
/*      */     
/* 1080 */     paintContentBorder(g, tabPlacement, selectedIndex);
/*      */     
/* 1082 */     if (!isScrollTabLayout()) {
/* 1083 */       paintTabArea(g, tabPlacement, selectedIndex);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
/* 1090 */     Object[] oldHints = FlatUIUtils.setRenderingHints(g);
/*      */     
/* 1092 */     super.paintTabArea(g, tabPlacement, selectedIndex);
/*      */     
/* 1094 */     FlatUIUtils.resetRenderingHints(g, oldHints);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintTab(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect) {
/* 1101 */     Rectangle tabRect = rects[tabIndex];
/* 1102 */     int x = tabRect.x;
/* 1103 */     int y = tabRect.y;
/* 1104 */     int w = tabRect.width;
/* 1105 */     int h = tabRect.height;
/* 1106 */     boolean isSelected = (tabIndex == this.tabPane.getSelectedIndex());
/*      */ 
/*      */     
/* 1109 */     if (this.tabsOpaque || this.tabPane.isOpaque()) {
/* 1110 */       paintTabBackground(g, tabPlacement, tabIndex, x, y, w, h, isSelected);
/*      */     }
/*      */     
/* 1113 */     paintTabBorder(g, tabPlacement, tabIndex, x, y, w, h, isSelected);
/*      */ 
/*      */     
/* 1116 */     if (isTabClosable(tabIndex)) {
/* 1117 */       paintTabCloseButton(g, tabIndex, x, y, w, h);
/*      */     }
/*      */     
/* 1120 */     if (isSelected) {
/* 1121 */       paintTabSelection(g, tabPlacement, tabIndex, x, y, w, h);
/*      */     }
/* 1123 */     if (this.tabPane.getTabComponentAt(tabIndex) != null) {
/*      */       return;
/*      */     }
/*      */     
/* 1127 */     String title = this.tabPane.getTitleAt(tabIndex);
/* 1128 */     Icon icon = getIconForTab(tabIndex);
/* 1129 */     Font font = this.tabPane.getFont();
/* 1130 */     FontMetrics metrics = this.tabPane.getFontMetrics(font);
/* 1131 */     boolean isCompact = (icon != null && !isSelected && getTabWidthMode() == 2 && isHorizontalTabPlacement());
/* 1132 */     if (isCompact)
/* 1133 */       title = null; 
/* 1134 */     String clippedTitle = layoutAndClipLabel(tabPlacement, metrics, tabIndex, title, icon, tabRect, iconRect, textRect, isSelected);
/*      */ 
/*      */     
/* 1137 */     if (this.tabViewport != null && (tabPlacement == 1 || tabPlacement == 3)) {
/* 1138 */       Rectangle viewRect = this.tabViewport.getViewRect();
/* 1139 */       viewRect.width -= 4;
/* 1140 */       if (!viewRect.contains(textRect)) {
/* 1141 */         Rectangle r = viewRect.intersection(textRect);
/* 1142 */         if (r.x > viewRect.x) {
/* 1143 */           clippedTitle = JavaCompatibility.getClippedString(null, metrics, title, r.width);
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1148 */     if (!isCompact)
/* 1149 */       paintText(g, tabPlacement, font, metrics, tabIndex, clippedTitle, textRect, isSelected); 
/* 1150 */     paintIcon(g, tabPlacement, tabIndex, icon, iconRect, isSelected);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
/* 1157 */     g.setFont(font);
/*      */     
/* 1159 */     FlatUIUtils.runWithoutRenderingHints(g, this.oldRenderingHints, () -> {
/*      */           View view = getTextViewForTab(tabIndex);
/*      */           if (view != null) {
/*      */             view.paint(g, textRect);
/*      */             return;
/*      */           } 
/*      */           int mnemIndex = FlatLaf.isShowMnemonics() ? this.tabPane.getDisplayedMnemonicIndexAt(tabIndex) : -1;
/*      */           g.setColor(getTabForeground(tabPlacement, tabIndex, isSelected));
/*      */           FlatUIUtils.drawStringUnderlineCharAt(this.tabPane, g, title, mnemIndex, textRect.x, textRect.y + metrics.getAscent());
/*      */         });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Color getTabForeground(int tabPlacement, int tabIndex, boolean isSelected) {
/* 1178 */     if (!this.tabPane.isEnabled() || !this.tabPane.isEnabledAt(tabIndex)) {
/* 1179 */       return this.disabledForeground;
/*      */     }
/*      */     
/* 1182 */     if (this.hoverForeground != null && getRolloverTab() == tabIndex) {
/* 1183 */       return this.hoverForeground;
/*      */     }
/*      */     
/* 1186 */     Color foreground = this.tabPane.getForegroundAt(tabIndex);
/* 1187 */     if (foreground != this.tabPane.getForeground()) {
/* 1188 */       return foreground;
/*      */     }
/*      */     
/* 1191 */     if (this.focusForeground != null && isSelected && FlatUIUtils.isPermanentFocusOwner(this.tabPane))
/* 1192 */       return this.focusForeground; 
/* 1193 */     if (this.selectedForeground != null && isSelected) {
/* 1194 */       return this.selectedForeground;
/*      */     }
/* 1196 */     return foreground;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
/* 1203 */     boolean isCard = (getTabType() == 1);
/*      */ 
/*      */     
/* 1206 */     if ((!isCard && this.tabArc > 0) || (isCard && this.cardTabArc > 0) || (!isCard && this.selectedInsets != null && (this.selectedInsets.top != 0 || this.selectedInsets.left != 0 || this.selectedInsets.bottom != 0 || this.selectedInsets.right != 0))) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1212 */       Color color = this.tabPane.getBackgroundAt(tabIndex);
/* 1213 */       g.setColor(FlatUIUtils.deriveColor(color, this.tabPane.getBackground()));
/* 1214 */       g.fillRect(x, y, w, h);
/*      */     } 
/*      */ 
/*      */     
/* 1218 */     if (!isCard && this.selectedInsets != null) {
/* 1219 */       Insets insets = new Insets(0, 0, 0, 0);
/* 1220 */       rotateInsets(this.selectedInsets, insets, this.tabPane.getTabPlacement());
/*      */       
/* 1222 */       x += UIScale.scale(insets.left);
/* 1223 */       y += UIScale.scale(insets.top);
/* 1224 */       w -= UIScale.scale(insets.left + insets.right);
/* 1225 */       h -= UIScale.scale(insets.top + insets.bottom);
/*      */     } 
/*      */ 
/*      */     
/* 1229 */     Color background = getTabBackground(tabPlacement, tabIndex, isSelected);
/* 1230 */     g.setColor(FlatUIUtils.deriveColor(background, this.tabPane.getBackground()));
/* 1231 */     if (!isCard && this.tabArc > 0) {
/* 1232 */       float arc = UIScale.scale(this.tabArc) / 2.0F;
/* 1233 */       FlatUIUtils.paintSelection((Graphics2D)g, x, y, w, h, null, arc, arc, arc, arc, 0);
/* 1234 */     } else if (isCard && this.cardTabArc > 0) {
/* 1235 */       ((Graphics2D)g).fill(createCardTabOuterPath(tabPlacement, x, y, w, h));
/*      */     } else {
/* 1237 */       g.fillRect(x, y, w, h);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected Color getTabBackground(int tabPlacement, int tabIndex, boolean isSelected) {
/* 1242 */     Color background = this.tabPane.getBackgroundAt(tabIndex);
/*      */ 
/*      */     
/* 1245 */     if (!this.tabPane.isEnabled() || !this.tabPane.isEnabledAt(tabIndex)) {
/* 1246 */       return background;
/*      */     }
/*      */     
/* 1249 */     if (this.hoverColor != null && getRolloverTab() == tabIndex) {
/* 1250 */       return this.hoverColor;
/*      */     }
/*      */     
/* 1253 */     if (background != this.tabPane.getBackground()) {
/* 1254 */       return background;
/*      */     }
/*      */     
/* 1257 */     if (this.focusColor != null && isSelected && FlatUIUtils.isPermanentFocusOwner(this.tabPane))
/* 1258 */       return this.focusColor; 
/* 1259 */     if (this.selectedBackground != null && isSelected) {
/* 1260 */       return this.selectedBackground;
/*      */     }
/* 1262 */     return background;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
/* 1270 */     if (FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.showTabSeparators", this.showTabSeparators) && 
/* 1271 */       !isLastInRun(tabIndex))
/*      */     {
/* 1273 */       if (getTabType() == 1) {
/*      */         
/* 1275 */         int selectedIndex = this.tabPane.getSelectedIndex();
/* 1276 */         if (tabIndex != selectedIndex - 1 && tabIndex != selectedIndex)
/* 1277 */           paintTabSeparator(g, tabPlacement, x, y, w, h); 
/*      */       } else {
/* 1279 */         paintTabSeparator(g, tabPlacement, x, y, w, h);
/*      */       } 
/*      */     }
/*      */     
/* 1283 */     if (isSelected && getTabType() == 1) {
/* 1284 */       paintCardTabBorder(g, tabPlacement, tabIndex, x, y, w, h);
/*      */     }
/*      */   }
/*      */   
/*      */   protected void paintCardTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h) {
/* 1289 */     Graphics2D g2 = (Graphics2D)g;
/*      */     
/* 1291 */     Path2D path = new Path2D.Float(0);
/* 1292 */     path.append(createCardTabOuterPath(tabPlacement, x, y, w, h), false);
/* 1293 */     path.append(createCardTabInnerPath(tabPlacement, x, y, w, h), false);
/*      */     
/* 1295 */     g.setColor((this.tabSeparatorColor != null) ? this.tabSeparatorColor : this.contentAreaColor);
/* 1296 */     g2.fill(path);
/*      */   }
/*      */ 
/*      */   
/*      */   protected Shape createCardTabOuterPath(int tabPlacement, int x, int y, int w, int h) {
/* 1301 */     float arc = UIScale.scale(this.cardTabArc) / 2.0F;
/*      */     
/* 1303 */     switch (tabPlacement)
/*      */     { default:
/* 1305 */         return FlatUIUtils.createRoundRectanglePath(x, y, w, h, arc, arc, 0.0F, 0.0F);
/* 1306 */       case 3: return FlatUIUtils.createRoundRectanglePath(x, y, w, h, 0.0F, 0.0F, arc, arc);
/* 1307 */       case 2: return FlatUIUtils.createRoundRectanglePath(x, y, w, h, arc, 0.0F, arc, 0.0F);
/* 1308 */       case 4: break; }  return FlatUIUtils.createRoundRectanglePath(x, y, w, h, 0.0F, arc, 0.0F, arc);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected Shape createCardTabInnerPath(int tabPlacement, int x, int y, int w, int h) {
/* 1314 */     float bw = UIScale.scale(this.contentSeparatorHeight);
/* 1315 */     float arc = UIScale.scale(this.cardTabArc) / 2.0F - bw;
/*      */     
/* 1317 */     switch (tabPlacement)
/*      */     { default:
/* 1319 */         return FlatUIUtils.createRoundRectanglePath(x + bw, y + bw, w - bw * 2.0F, h - bw, arc, arc, 0.0F, 0.0F);
/* 1320 */       case 3: return FlatUIUtils.createRoundRectanglePath(x + bw, y, w - bw * 2.0F, h - bw, 0.0F, 0.0F, arc, arc);
/* 1321 */       case 2: return FlatUIUtils.createRoundRectanglePath(x + bw, y + bw, w - bw, h - bw * 2.0F, arc, 0.0F, arc, 0.0F);
/* 1322 */       case 4: break; }  return FlatUIUtils.createRoundRectanglePath(x, y + bw, w - bw, h - bw * 2.0F, 0.0F, arc, 0.0F, arc);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintTabCloseButton(Graphics g, int tabIndex, int x, int y, int w, int h) {
/* 1328 */     if (this.tabCloseButton == null) {
/* 1329 */       this.tabCloseButton = new TabCloseButton();
/* 1330 */       this.tabCloseButton.setVisible(false);
/*      */     } 
/*      */ 
/*      */     
/* 1334 */     boolean rollover = (tabIndex == getRolloverTab());
/* 1335 */     ButtonModel bm = this.tabCloseButton.getModel();
/* 1336 */     bm.setRollover((rollover && isRolloverTabClose()));
/* 1337 */     bm.setPressed((rollover && isPressedTabClose()));
/*      */ 
/*      */     
/* 1340 */     this.tabCloseButton.setBackground(this.tabPane.getBackground());
/* 1341 */     this.tabCloseButton.setForeground(this.tabPane.getForeground());
/*      */ 
/*      */     
/* 1344 */     Rectangle tabCloseRect = getTabCloseBounds(tabIndex, x, y, w, h, this.calcRect);
/* 1345 */     this.closeIcon.paintIcon(this.tabCloseButton, g, tabCloseRect.x, tabCloseRect.y);
/*      */   }
/*      */   
/*      */   protected void paintTabSeparator(Graphics g, int tabPlacement, int x, int y, int w, int h) {
/* 1349 */     float sepWidth = UIScale.scale(1.0F);
/* 1350 */     float offset = this.tabSeparatorsFullHeight ? 0.0F : UIScale.scale(5.0F);
/*      */     
/* 1352 */     g.setColor((this.tabSeparatorColor != null) ? this.tabSeparatorColor : this.contentAreaColor);
/* 1353 */     if (tabPlacement == 2 || tabPlacement == 4) {
/*      */       
/* 1355 */       ((Graphics2D)g).fill(new Rectangle2D.Float(x + offset, (y + h) - sepWidth, w - offset * 2.0F, sepWidth));
/* 1356 */     } else if (isLeftToRight()) {
/*      */       
/* 1358 */       ((Graphics2D)g).fill(new Rectangle2D.Float((x + w) - sepWidth, y + offset, sepWidth, h - offset * 2.0F));
/*      */     } else {
/*      */       
/* 1361 */       ((Graphics2D)g).fill(new Rectangle2D.Float(x, y + offset, sepWidth, h - offset * 2.0F));
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void paintTabSelection(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h) {
/* 1366 */     g.setColor(this.tabPane.isEnabled() ? (
/* 1367 */         isTabbedPaneOrChildFocused() ? this.underlineColor : this.inactiveUnderlineColor) : 
/* 1368 */         this.disabledUnderlineColor);
/*      */     
/* 1370 */     boolean isCard = (getTabType() == 1);
/* 1371 */     boolean atBottom = !isCard;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1376 */     Insets contentInsets = atBottom ? ((!this.rotateTabRuns && this.runCount > 1 && !isScrollTabLayout() && getRunForTab(this.tabPane.getTabCount(), tabIndex) > 0) ? new Insets(0, 0, 0, 0) : getContentBorderInsets(tabPlacement)) : null;
/*      */     
/* 1378 */     int tabSelectionHeight = UIScale.scale(isCard ? this.cardTabSelectionHeight : this.tabSelectionHeight);
/* 1379 */     float arc = UIScale.scale((isCard ? this.cardTabArc : this.tabSelectionArc)) / 2.0F;
/* 1380 */     int sx = x, sy = y, sw = w, sh = h;
/* 1381 */     switch (tabPlacement) {
/*      */       
/*      */       default:
/* 1384 */         sy = atBottom ? (y + h + contentInsets.top - tabSelectionHeight) : y;
/* 1385 */         sh = tabSelectionHeight;
/*      */         break;
/*      */       
/*      */       case 3:
/* 1389 */         sy = atBottom ? (y - contentInsets.bottom) : (y + h - tabSelectionHeight);
/* 1390 */         sh = tabSelectionHeight;
/*      */         break;
/*      */       
/*      */       case 2:
/* 1394 */         sx = atBottom ? (x + w + contentInsets.left - tabSelectionHeight) : x;
/* 1395 */         sw = tabSelectionHeight;
/*      */         break;
/*      */       
/*      */       case 4:
/* 1399 */         sx = atBottom ? (x - contentInsets.right) : (x + w - tabSelectionHeight);
/* 1400 */         sw = tabSelectionHeight;
/*      */         break;
/*      */     } 
/*      */ 
/*      */     
/* 1405 */     if (!isCard && this.tabSelectionInsets != null) {
/* 1406 */       Insets insets = new Insets(0, 0, 0, 0);
/* 1407 */       rotateInsets(this.tabSelectionInsets, insets, this.tabPane.getTabPlacement());
/*      */       
/* 1409 */       sx += UIScale.scale(insets.left);
/* 1410 */       sy += UIScale.scale(insets.top);
/* 1411 */       sw -= UIScale.scale(insets.left + insets.right);
/* 1412 */       sh -= UIScale.scale(insets.top + insets.bottom);
/*      */     } 
/*      */ 
/*      */     
/* 1416 */     if (arc <= 0.0F) {
/* 1417 */       g.fillRect(sx, sy, sw, sh);
/*      */     }
/* 1419 */     else if (isCard) {
/* 1420 */       Area area = new Area(createCardTabOuterPath(tabPlacement, x, y, w, h));
/* 1421 */       area.intersect(new Area(new Rectangle2D.Float(sx, sy, sw, sh)));
/* 1422 */       ((Graphics2D)g).fill(area);
/*      */     } else {
/* 1424 */       FlatUIUtils.paintSelection((Graphics2D)g, sx, sy, sw, sh, null, arc, arc, arc, arc, 0);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean isTabbedPaneOrChildFocused() {
/* 1431 */     KeyboardFocusManager keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
/*      */     
/* 1433 */     Object value = this.tabPane.getClientProperty("JComponent.focusOwner");
/* 1434 */     if (value instanceof Predicate) {
/* 1435 */       return (((Predicate<JTabbedPane>)value).test(this.tabPane) && 
/* 1436 */         FlatUIUtils.isInActiveWindow(this.tabPane, keyboardFocusManager.getActiveWindow()));
/*      */     }
/*      */     
/* 1439 */     Component focusOwner = keyboardFocusManager.getPermanentFocusOwner();
/* 1440 */     return (focusOwner != null && 
/* 1441 */       SwingUtilities.isDescendingFrom(focusOwner, this.tabPane) && 
/* 1442 */       FlatUIUtils.isInActiveWindow(focusOwner, keyboardFocusManager.getActiveWindow()));
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
/*      */   
/*      */   protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
/* 1456 */     if (this.tabPane.getTabCount() <= 0 || this.contentSeparatorHeight == 0 || 
/*      */       
/* 1458 */       !FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.showContentSeparator", this.showContentSeparator)) {
/*      */       return;
/*      */     }
/* 1461 */     Insets insets = this.tabPane.getInsets();
/* 1462 */     Insets tabAreaInsets = getTabAreaInsets(tabPlacement);
/*      */     
/* 1464 */     int x = insets.left;
/* 1465 */     int y = insets.top;
/* 1466 */     int w = this.tabPane.getWidth() - insets.right - insets.left;
/* 1467 */     int h = this.tabPane.getHeight() - insets.top - insets.bottom;
/*      */ 
/*      */     
/* 1470 */     switch (tabPlacement) {
/*      */       
/*      */       default:
/* 1473 */         y += calculateTabAreaHeight(tabPlacement, this.runCount, this.maxTabHeight);
/* 1474 */         y -= tabAreaInsets.bottom;
/* 1475 */         h -= y - insets.top;
/*      */         break;
/*      */       
/*      */       case 3:
/* 1479 */         h -= calculateTabAreaHeight(tabPlacement, this.runCount, this.maxTabHeight);
/* 1480 */         h += tabAreaInsets.top;
/*      */         break;
/*      */       
/*      */       case 2:
/* 1484 */         x += calculateTabAreaWidth(tabPlacement, this.runCount, this.maxTabWidth);
/* 1485 */         x -= tabAreaInsets.right;
/* 1486 */         w -= x - insets.left;
/*      */         break;
/*      */       
/*      */       case 4:
/* 1490 */         w -= calculateTabAreaWidth(tabPlacement, this.runCount, this.maxTabWidth);
/* 1491 */         w += tabAreaInsets.left;
/*      */         break;
/*      */     } 
/*      */ 
/*      */     
/* 1496 */     boolean hasFullBorder = FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.hasFullBorder", this.hasFullBorder);
/* 1497 */     int sh = UIScale.scale(this.contentSeparatorHeight * 100);
/* 1498 */     Insets ci = new Insets(0, 0, 0, 0);
/* 1499 */     rotateInsets(hasFullBorder ? new Insets(sh, sh, sh, sh) : new Insets(sh, 0, 0, 0), ci, tabPlacement);
/*      */ 
/*      */     
/* 1502 */     Path2D path = new Path2D.Float(0);
/* 1503 */     path.append(new Rectangle2D.Float(x, y, w, h), false);
/* 1504 */     path.append(new Rectangle2D.Float(x + ci.left / 100.0F, y + ci.top / 100.0F, w - ci.left / 100.0F - ci.right / 100.0F, h - ci.top / 100.0F - ci.bottom / 100.0F), false);
/*      */ 
/*      */ 
/*      */     
/* 1508 */     if (getTabType() == 1) {
/* 1509 */       float csh = UIScale.scale(this.contentSeparatorHeight);
/*      */       
/* 1511 */       Rectangle tabRect = getTabBounds(this.tabPane, selectedIndex);
/* 1512 */       Rectangle2D.Float innerTabRect = new Rectangle2D.Float(tabRect.x + csh, tabRect.y + csh, tabRect.width - csh * 2.0F, tabRect.height - csh * 2.0F);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1517 */       if (this.tabViewport != null) {
/* 1518 */         Rectangle2D.intersect(this.tabViewport.getBounds(), innerTabRect, innerTabRect);
/*      */       }
/* 1520 */       Rectangle2D.Float gap = null;
/* 1521 */       if (isHorizontalTabPlacement()) {
/* 1522 */         if (innerTabRect.width > 0.0F) {
/* 1523 */           float y2 = (tabPlacement == 1) ? y : ((y + h) - csh);
/* 1524 */           gap = new Rectangle2D.Float(innerTabRect.x, y2, innerTabRect.width, csh);
/*      */         }
/*      */       
/* 1527 */       } else if (innerTabRect.height > 0.0F) {
/* 1528 */         float x2 = (tabPlacement == 2) ? x : ((x + w) - csh);
/* 1529 */         gap = new Rectangle2D.Float(x2, innerTabRect.y, csh, innerTabRect.height);
/*      */       } 
/*      */ 
/*      */       
/* 1533 */       if (gap != null) {
/* 1534 */         path.append(gap, false);
/*      */ 
/*      */         
/* 1537 */         Color background = getTabBackground(tabPlacement, selectedIndex, true);
/* 1538 */         g.setColor(FlatUIUtils.deriveColor(background, this.tabPane.getBackground()));
/* 1539 */         ((Graphics2D)g).fill(gap);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1544 */     g.setColor(this.contentAreaColor);
/* 1545 */     ((Graphics2D)g).fill(path);
/*      */ 
/*      */ 
/*      */     
/* 1549 */     if (isScrollTabLayout() && selectedIndex >= 0 && this.tabViewport != null) {
/* 1550 */       Rectangle tabRect = getTabBounds(this.tabPane, selectedIndex);
/*      */ 
/*      */ 
/*      */       
/* 1554 */       Shape oldClip = g.getClip();
/* 1555 */       Rectangle vr = this.tabViewport.getBounds();
/* 1556 */       if (isHorizontalTabPlacement()) {
/* 1557 */         g.clipRect(vr.x, 0, vr.width, this.tabPane.getHeight());
/*      */       } else {
/* 1559 */         g.clipRect(0, vr.y, this.tabPane.getWidth(), vr.height);
/*      */       } 
/* 1561 */       paintTabSelection(g, tabPlacement, selectedIndex, tabRect.x, tabRect.y, tabRect.width, tabRect.height);
/* 1562 */       g.setClip(oldClip);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected String layoutAndClipLabel(int tabPlacement, FontMetrics metrics, int tabIndex, String title, Icon icon, Rectangle tabRect, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
/*      */     int verticalTextPosition, horizontalTextPosition;
/* 1577 */     tabRect = FlatUIUtils.subtractInsets(tabRect, getTabInsets(tabPlacement, tabIndex));
/* 1578 */     if (isTabClosable(tabIndex)) {
/* 1579 */       tabRect.width -= this.closeIcon.getIconWidth();
/* 1580 */       if (!isLeftToRight()) {
/* 1581 */         tabRect.x += this.closeIcon.getIconWidth();
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1587 */     switch (FlatClientProperties.clientPropertyInt(this.tabPane, "JTabbedPane.tabIconPlacement", this.tabIconPlacement)) {
/*      */       default:
/* 1589 */         verticalTextPosition = 0; horizontalTextPosition = 11; break;
/* 1590 */       case 11: verticalTextPosition = 0; horizontalTextPosition = 10; break;
/* 1591 */       case 1: verticalTextPosition = 3; horizontalTextPosition = 0; break;
/* 1592 */       case 3: verticalTextPosition = 1; horizontalTextPosition = 0;
/*      */         break;
/*      */     } 
/*      */     
/* 1596 */     textRect.setBounds(0, 0, 0, 0);
/* 1597 */     iconRect.setBounds(0, 0, 0, 0);
/*      */ 
/*      */     
/* 1600 */     View view = getTextViewForTab(tabIndex);
/* 1601 */     if (view != null) {
/* 1602 */       this.tabPane.putClientProperty("html", view);
/*      */     }
/*      */     
/* 1605 */     String clippedTitle = SwingUtilities.layoutCompoundLabel(this.tabPane, metrics, title, icon, 0, 
/* 1606 */         getTabAlignment(tabIndex), verticalTextPosition, horizontalTextPosition, tabRect, iconRect, textRect, 
/* 1607 */         UIScale.scale(this.textIconGapUnscaled));
/*      */ 
/*      */     
/* 1610 */     this.tabPane.putClientProperty("html", (Object)null);
/*      */     
/* 1612 */     return clippedTitle;
/*      */   }
/*      */ 
/*      */   
/*      */   public int tabForCoordinate(JTabbedPane pane, int x, int y) {
/* 1617 */     if (this.moreTabsButton != null) {
/*      */       
/* 1619 */       Point viewPosition = this.tabViewport.getViewPosition();
/* 1620 */       x = x - this.tabViewport.getX() + viewPosition.x;
/* 1621 */       y = y - this.tabViewport.getY() + viewPosition.y;
/*      */ 
/*      */       
/* 1624 */       if (!this.tabViewport.getViewRect().contains(x, y)) {
/* 1625 */         return -1;
/*      */       }
/*      */     } 
/* 1628 */     return super.tabForCoordinate(pane, x, y);
/*      */   }
/*      */ 
/*      */   
/*      */   protected Rectangle getTabBounds(int tabIndex, Rectangle dest) {
/* 1633 */     if (this.moreTabsButton != null) {
/*      */       
/* 1635 */       dest.setBounds(this.rects[tabIndex]);
/*      */ 
/*      */       
/* 1638 */       Point viewPosition = this.tabViewport.getViewPosition();
/* 1639 */       dest.x = dest.x + this.tabViewport.getX() - viewPosition.x;
/* 1640 */       dest.y = dest.y + this.tabViewport.getY() - viewPosition.y;
/* 1641 */       return dest;
/*      */     } 
/* 1643 */     return super.getTabBounds(tabIndex, dest);
/*      */   }
/*      */   
/*      */   protected Rectangle getTabCloseBounds(int tabIndex, int x, int y, int w, int h, Rectangle dest) {
/* 1647 */     int iconWidth = this.closeIcon.getIconWidth();
/* 1648 */     int iconHeight = this.closeIcon.getIconHeight();
/* 1649 */     Insets tabInsets = getTabInsets(this.tabPane.getTabPlacement(), tabIndex);
/*      */ 
/*      */     
/* 1652 */     dest
/*      */       
/* 1654 */       .x = isLeftToRight() ? (x + w - tabInsets.right / 3 * 2 - iconWidth) : (x + tabInsets.left / 3 * 2);
/* 1655 */     dest.y = y + (h - iconHeight) / 2;
/* 1656 */     dest.width = iconWidth;
/* 1657 */     dest.height = iconHeight;
/* 1658 */     return dest;
/*      */   }
/*      */   
/*      */   protected Rectangle getTabCloseHitArea(int tabIndex) {
/* 1662 */     Rectangle tabRect = getTabBounds(this.tabPane, tabIndex);
/* 1663 */     Rectangle tabCloseRect = getTabCloseBounds(tabIndex, tabRect.x, tabRect.y, tabRect.width, tabRect.height, this.calcRect);
/* 1664 */     return new Rectangle(tabCloseRect.x, tabRect.y, tabCloseRect.width, tabRect.height);
/*      */   }
/*      */   
/*      */   protected boolean isTabClosable(int tabIndex) {
/* 1668 */     if (tabIndex < 0) {
/* 1669 */       return false;
/*      */     }
/* 1671 */     Object value = getTabClientProperty(tabIndex, "JTabbedPane.tabClosable");
/* 1672 */     return (value instanceof Boolean) ? ((Boolean)value).booleanValue() : this.tabClosable;
/*      */   }
/*      */ 
/*      */   
/*      */   protected void closeTab(int tabIndex) {
/* 1677 */     Object callback = getTabClientProperty(tabIndex, "JTabbedPane.tabCloseCallback");
/* 1678 */     if (callback instanceof IntConsumer) {
/* 1679 */       ((IntConsumer)callback).accept(tabIndex);
/* 1680 */     } else if (callback instanceof BiConsumer) {
/* 1681 */       ((BiConsumer<JTabbedPane, Integer>)callback).accept(this.tabPane, Integer.valueOf(tabIndex));
/*      */     } else {
/* 1683 */       throw new RuntimeException("Missing tab close callback. Set client property 'JTabbedPane.tabCloseCallback' to a 'java.util.function.IntConsumer' or 'java.util.function.BiConsumer<JTabbedPane, Integer>'");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Object getTabClientProperty(int tabIndex, String key) {
/* 1691 */     if (tabIndex < 0) {
/* 1692 */       return null;
/*      */     }
/* 1694 */     Component c = this.tabPane.getComponentAt(tabIndex);
/* 1695 */     if (c instanceof JComponent) {
/* 1696 */       Object value = ((JComponent)c).getClientProperty(key);
/* 1697 */       if (value != null)
/* 1698 */         return value; 
/*      */     } 
/* 1700 */     return this.tabPane.getClientProperty(key);
/*      */   }
/*      */   
/*      */   protected int getTabClientPropertyInt(int tabIndex, String key, int defaultValue) {
/* 1704 */     Object value = getTabClientProperty(tabIndex, key);
/* 1705 */     return (value instanceof Integer) ? ((Integer)value).intValue() : defaultValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void ensureCurrentLayout() {
/* 1711 */     getTabRunCount(this.tabPane);
/*      */   }
/*      */ 
/*      */   
/*      */   protected boolean shouldRotateTabRuns(int tabPlacement) {
/* 1716 */     return this.rotateTabRuns;
/*      */   }
/*      */   
/*      */   private boolean isLastInRun(int tabIndex) {
/* 1720 */     int run = getRunForTab(this.tabPane.getTabCount(), tabIndex);
/* 1721 */     return (lastTabInRun(this.tabPane.getTabCount(), run) == tabIndex);
/*      */   }
/*      */   
/*      */   private boolean isScrollTabLayout() {
/* 1725 */     return (this.tabPane.getTabLayoutPolicy() == 1);
/*      */   }
/*      */   
/*      */   private boolean isLeftToRight() {
/* 1729 */     return this.tabPane.getComponentOrientation().isLeftToRight();
/*      */   }
/*      */   
/*      */   protected boolean isHorizontalTabPlacement() {
/* 1733 */     int tabPlacement = this.tabPane.getTabPlacement();
/* 1734 */     return (tabPlacement == 1 || tabPlacement == 3);
/*      */   }
/*      */   
/*      */   protected boolean isSmoothScrollingEnabled() {
/* 1738 */     if (!Animator.useAnimation()) {
/* 1739 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1744 */     return UIManager.getBoolean("ScrollPane.smoothScrolling");
/*      */   }
/*      */   
/*      */   protected boolean hideTabArea() {
/* 1748 */     return (this.tabPane.getTabCount() == 1 && this.leadingComponent == null && this.trailingComponent == null && 
/*      */ 
/*      */       
/* 1751 */       FlatClientProperties.clientPropertyBoolean(this.tabPane, "JTabbedPane.hideTabAreaWithOneTab", this.hideTabAreaWithOneTab));
/*      */   }
/*      */ 
/*      */   
/*      */   protected int getTabType() {
/* 1756 */     Object value = this.tabPane.getClientProperty("JTabbedPane.tabType");
/*      */     
/* 1758 */     return (value instanceof String) ? 
/* 1759 */       parseTabType((String)value) : 
/* 1760 */       this.tabType;
/*      */   }
/*      */   
/*      */   protected int getTabsPopupPolicy() {
/* 1764 */     Object value = this.tabPane.getClientProperty("JTabbedPane.tabsPopupPolicy");
/*      */     
/* 1766 */     return (value instanceof String) ? 
/* 1767 */       parseTabsPopupPolicy((String)value) : 
/* 1768 */       this.tabsPopupPolicy;
/*      */   }
/*      */   
/*      */   protected int getScrollButtonsPolicy() {
/* 1772 */     Object value = this.tabPane.getClientProperty("JTabbedPane.scrollButtonsPolicy");
/*      */     
/* 1774 */     return (value instanceof String) ? 
/* 1775 */       parseScrollButtonsPolicy((String)value) : 
/* 1776 */       this.scrollButtonsPolicy;
/*      */   }
/*      */   
/*      */   protected int getScrollButtonsPlacement() {
/* 1780 */     Object value = this.tabPane.getClientProperty("JTabbedPane.scrollButtonsPlacement");
/*      */     
/* 1782 */     return (value instanceof String) ? 
/* 1783 */       parseScrollButtonsPlacement((String)value) : 
/* 1784 */       this.scrollButtonsPlacement;
/*      */   }
/*      */   
/*      */   protected int getTabAreaAlignment() {
/* 1788 */     Object value = this.tabPane.getClientProperty("JTabbedPane.tabAreaAlignment");
/* 1789 */     if (value instanceof Integer) {
/* 1790 */       return ((Integer)value).intValue();
/*      */     }
/* 1792 */     return (value instanceof String) ? 
/* 1793 */       parseAlignment((String)value, 10) : 
/* 1794 */       this.tabAreaAlignment;
/*      */   }
/*      */   
/*      */   protected int getTabAlignment(int tabIndex) {
/* 1798 */     Object value = getTabClientProperty(tabIndex, "JTabbedPane.tabAlignment");
/* 1799 */     if (value instanceof Integer) {
/* 1800 */       return ((Integer)value).intValue();
/*      */     }
/* 1802 */     return (value instanceof String) ? 
/* 1803 */       parseAlignment((String)value, 0) : 
/* 1804 */       this.tabAlignment;
/*      */   }
/*      */   
/*      */   protected int getTabWidthMode() {
/* 1808 */     Object value = this.tabPane.getClientProperty("JTabbedPane.tabWidthMode");
/*      */     
/* 1810 */     return (value instanceof String) ? 
/* 1811 */       parseTabWidthMode((String)value) : 
/* 1812 */       this.tabWidthMode;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseTabType(String str) {
/* 1817 */     if (str == null) {
/* 1818 */       return 0;
/*      */     }
/* 1820 */     switch (str)
/*      */     { default:
/* 1822 */         return 0;
/* 1823 */       case "card": break; }  return 1;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseTabsPopupPolicy(String str) {
/* 1828 */     if (str == null) {
/* 1829 */       return 2;
/*      */     }
/* 1831 */     switch (str)
/*      */     { default:
/* 1833 */         return 2;
/* 1834 */       case "never": break; }  return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseScrollButtonsPolicy(String str) {
/* 1839 */     if (str == null) {
/* 1840 */       return 3;
/*      */     }
/* 1842 */     switch (str)
/*      */     { default:
/* 1844 */         return 3;
/* 1845 */       case "asNeeded": return 2;
/* 1846 */       case "never": break; }  return 0;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseScrollButtonsPlacement(String str) {
/* 1851 */     if (str == null) {
/* 1852 */       return 100;
/*      */     }
/* 1854 */     switch (str)
/*      */     { default:
/* 1856 */         return 100;
/* 1857 */       case "trailing": break; }  return 11;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseAlignment(String str, int defaultValue) {
/* 1862 */     if (str == null) {
/* 1863 */       return defaultValue;
/*      */     }
/* 1865 */     switch (str) { case "leading":
/* 1866 */         return 10;
/* 1867 */       case "trailing": return 11;
/* 1868 */       case "center": return 0;
/* 1869 */       case "fill": return 100; }
/* 1870 */      return defaultValue;
/*      */   }
/*      */ 
/*      */   
/*      */   private static String alignmentToString(int value, String defaultValue) {
/* 1875 */     switch (value) { case 10:
/* 1876 */         return "leading";
/* 1877 */       case 11: return "trailing";
/* 1878 */       case 0: return "center";
/* 1879 */       case 100: return "fill"; }
/* 1880 */      return defaultValue;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseTabWidthMode(String str) {
/* 1885 */     if (str == null) {
/* 1886 */       return 0;
/*      */     }
/* 1888 */     switch (str)
/*      */     { default:
/* 1890 */         return 0;
/* 1891 */       case "equal": return 1;
/* 1892 */       case "compact": break; }  return 2;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static int parseTabIconPlacement(String str) {
/* 1897 */     if (str == null) {
/* 1898 */       return 10;
/*      */     }
/* 1900 */     switch (str)
/*      */     { default:
/* 1902 */         return 10;
/* 1903 */       case "trailing": return 11;
/* 1904 */       case "top": return 1;
/* 1905 */       case "bottom": break; }  return 3;
/*      */   }
/*      */ 
/*      */   
/*      */   private void runWithOriginalLayoutManager(Runnable runnable) {
/* 1910 */     LayoutManager layout = this.tabPane.getLayout();
/* 1911 */     if (layout instanceof FlatTabbedPaneScrollLayout) {
/*      */ 
/*      */       
/* 1914 */       this.tabPane.setLayout(((FlatTabbedPaneScrollLayout)layout).delegate);
/* 1915 */       runnable.run();
/* 1916 */       this.tabPane.setLayout(layout);
/*      */     } else {
/* 1918 */       runnable.run();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void ensureSelectedTabIsVisibleLater() {
/* 1924 */     if (!this.tabPane.isDisplayable() || !EventQueue.isDispatchThread()) {
/*      */       return;
/*      */     }
/* 1927 */     EventQueue.invokeLater(() -> ensureSelectedTabIsVisible());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void ensureSelectedTabIsVisible() {
/* 1933 */     if (this.tabPane == null || this.tabViewport == null || !this.tabPane.isDisplayable()) {
/*      */       return;
/*      */     }
/* 1936 */     ensureCurrentLayout();
/*      */     
/* 1938 */     int selectedIndex = this.tabPane.getSelectedIndex();
/* 1939 */     if (selectedIndex < 0 || selectedIndex >= this.rects.length) {
/*      */       return;
/*      */     }
/* 1942 */     ((JComponent)this.tabViewport.getView()).scrollRectToVisible((Rectangle)this.rects[selectedIndex].clone());
/*      */   }
/*      */   
/*      */   private int getLeadingPreferredWidth() {
/* 1946 */     return (this.leadingComponent != null) ? (this.leadingComponent.getPreferredSize()).width : 0;
/*      */   }
/*      */   
/*      */   private int getLeadingPreferredHeight() {
/* 1950 */     return (this.leadingComponent != null) ? (this.leadingComponent.getPreferredSize()).height : 0;
/*      */   }
/*      */   
/*      */   private int getTrailingPreferredWidth() {
/* 1954 */     return (this.trailingComponent != null) ? (this.trailingComponent.getPreferredSize()).width : 0;
/*      */   }
/*      */   
/*      */   private int getTrailingPreferredHeight() {
/* 1958 */     return (this.trailingComponent != null) ? (this.trailingComponent.getPreferredSize()).height : 0;
/*      */   }
/*      */   
/*      */   private void shiftTabs(int sx, int sy) {
/* 1962 */     if (sx == 0 && sy == 0) {
/*      */       return;
/*      */     }
/* 1965 */     for (int i = 0; i < this.rects.length; i++) {
/*      */       
/* 1967 */       (this.rects[i]).x += sx;
/* 1968 */       (this.rects[i]).y += sy;
/*      */ 
/*      */       
/* 1971 */       Component c = this.tabPane.getTabComponentAt(i);
/* 1972 */       if (c != null)
/* 1973 */         c.setLocation(c.getX() + sx, c.getY() + sy); 
/*      */     } 
/*      */   }
/*      */   
/*      */   private void stretchTabsWidth(int sw, boolean leftToRight) {
/* 1978 */     int rsw = sw / this.rects.length;
/* 1979 */     int x = (this.rects[0]).x - (leftToRight ? 0 : rsw);
/* 1980 */     for (int i = 0; i < this.rects.length; i++) {
/*      */       
/* 1982 */       Component c = this.tabPane.getTabComponentAt(i);
/* 1983 */       if (c != null) {
/* 1984 */         c.setLocation(x + c.getX() - (this.rects[i]).x + rsw / 2, c.getY());
/*      */       }
/*      */       
/* 1987 */       (this.rects[i]).x = x;
/* 1988 */       (this.rects[i]).width += rsw;
/*      */       
/* 1990 */       if (leftToRight) {
/* 1991 */         x += (this.rects[i]).width;
/* 1992 */       } else if (i + 1 < this.rects.length) {
/* 1993 */         x = (this.rects[i]).x - (this.rects[i + 1]).width - rsw;
/*      */       } 
/*      */     } 
/*      */     
/* 1997 */     int diff = sw - rsw * this.rects.length;
/* 1998 */     (this.rects[this.rects.length - 1]).width += diff;
/* 1999 */     if (!leftToRight)
/* 2000 */       (this.rects[this.rects.length - 1]).x -= diff; 
/*      */   }
/*      */   
/*      */   private void stretchTabsHeight(int sh) {
/* 2004 */     int rsh = sh / this.rects.length;
/* 2005 */     int y = (this.rects[0]).y;
/* 2006 */     for (int i = 0; i < this.rects.length; i++) {
/*      */       
/* 2008 */       Component c = this.tabPane.getTabComponentAt(i);
/* 2009 */       if (c != null) {
/* 2010 */         c.setLocation(c.getX(), y + c.getY() - (this.rects[i]).y + rsh / 2);
/*      */       }
/*      */       
/* 2013 */       (this.rects[i]).y = y;
/* 2014 */       (this.rects[i]).height += rsh;
/*      */       
/* 2016 */       y += (this.rects[i]).height;
/*      */     } 
/*      */ 
/*      */     
/* 2020 */     (this.rects[this.rects.length - 1]).height += sh - rsh * this.rects.length;
/*      */   }
/*      */   
/*      */   private int rectsTotalWidth(boolean leftToRight) {
/* 2024 */     int last = this.rects.length - 1;
/* 2025 */     return leftToRight ? (
/* 2026 */       (this.rects[last]).x + (this.rects[last]).width - (this.rects[0]).x) : (
/* 2027 */       (this.rects[0]).x + (this.rects[0]).width - (this.rects[last]).x);
/*      */   }
/*      */   
/*      */   private int rectsTotalHeight() {
/* 2031 */     int last = this.rects.length - 1;
/* 2032 */     return (this.rects[last]).y + (this.rects[last]).height - (this.rects[0]).y;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class TabCloseButton
/*      */     extends JButton
/*      */     implements UIResource
/*      */   {
/*      */     private TabCloseButton() {}
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class ContainerUIResource
/*      */     extends JPanel
/*      */     implements UIResource
/*      */   {
/*      */     private ContainerUIResource(Component c) {
/* 2052 */       super(new BorderLayout());
/* 2053 */       add(c);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected class FlatTabAreaButton
/*      */     extends FlatArrowButton
/*      */   {
/*      */     public FlatTabAreaButton(int direction) {
/* 2063 */       super(direction, FlatTabbedPaneUI.this.arrowType, FlatTabbedPaneUI.this.foreground, FlatTabbedPaneUI.this.disabledForeground, (Color)null, FlatTabbedPaneUI.this.buttonHoverBackground, (Color)null, FlatTabbedPaneUI.this.buttonPressedBackground);
/*      */ 
/*      */       
/* 2066 */       setArrowWidth(11);
/*      */     }
/*      */     
/*      */     protected void updateStyle() {
/* 2070 */       updateStyle(FlatTabbedPaneUI.this.arrowType, FlatTabbedPaneUI.this.foreground, FlatTabbedPaneUI.this.disabledForeground, (Color)null, FlatTabbedPaneUI.this.buttonHoverBackground, (Color)null, FlatTabbedPaneUI.this.buttonPressedBackground);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected Color deriveBackground(Color background) {
/* 2077 */       return FlatUIUtils.deriveColor(background, FlatTabbedPaneUI.this.tabPane.getBackground());
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void paint(Graphics g) {
/* 2083 */       if (FlatTabbedPaneUI.this.tabsOpaque || FlatTabbedPaneUI.this.tabPane.isOpaque()) {
/* 2084 */         g.setColor(FlatTabbedPaneUI.this.tabPane.getBackground());
/* 2085 */         g.fillRect(0, 0, getWidth(), getHeight());
/*      */       } 
/*      */       
/* 2088 */       super.paint(g);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected void paintBackground(Graphics2D g) {
/* 2094 */       Insets insets = new Insets(0, 0, 0, 0);
/* 2095 */       FlatTabbedPaneUI.rotateInsets(FlatTabbedPaneUI.this.buttonInsets, insets, FlatTabbedPaneUI.this.tabPane.getTabPlacement());
/*      */ 
/*      */       
/* 2098 */       int top = UIScale.scale2(insets.top);
/* 2099 */       int left = UIScale.scale2(insets.left);
/* 2100 */       int bottom = UIScale.scale2(insets.bottom);
/* 2101 */       int right = UIScale.scale2(insets.right);
/*      */       
/* 2103 */       FlatUIUtils.paintComponentBackground(g, left, top, 
/* 2104 */           getWidth() - left - right, 
/* 2105 */           getHeight() - top - bottom, 0.0F, 
/* 2106 */           UIScale.scale(FlatTabbedPaneUI.this.buttonArc));
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected class FlatMoreTabsButton
/*      */     extends FlatTabAreaButton
/*      */     implements ActionListener, PopupMenuListener
/*      */   {
/*      */     private boolean popupVisible;
/*      */ 
/*      */     
/*      */     public FlatMoreTabsButton() {
/* 2119 */       super(5);
/*      */       
/* 2121 */       updateDirection();
/* 2122 */       setToolTipText(FlatTabbedPaneUI.this.moreTabsButtonToolTipText);
/* 2123 */       addActionListener(this);
/*      */     }
/*      */     
/*      */     protected void updateDirection() {
/*      */       int direction;
/* 2128 */       switch (FlatTabbedPaneUI.this.tabPane.getTabPlacement()) {
/*      */         default:
/* 2130 */           direction = 5; break;
/* 2131 */         case 3: direction = 1; break;
/* 2132 */         case 2: direction = 3; break;
/* 2133 */         case 4: direction = 7;
/*      */           break;
/*      */       } 
/* 2136 */       setDirection(direction);
/*      */     }
/*      */ 
/*      */     
/*      */     public Dimension getPreferredSize() {
/* 2141 */       Dimension size = super.getPreferredSize();
/* 2142 */       boolean horizontal = (this.direction == 5 || this.direction == 1);
/* 2143 */       int margin = UIScale.scale(8);
/* 2144 */       return new Dimension(size.width + (
/* 2145 */           horizontal ? margin : 0), size.height + (
/* 2146 */           horizontal ? 0 : margin));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void paint(Graphics g) {
/* 2152 */       if (this.direction == 3 || this.direction == 7) {
/* 2153 */         int xoffset = Math.max(UIScale.unscale((getWidth() - getHeight()) / 2) - 4, 0);
/* 2154 */         setXOffset((this.direction == 3) ? xoffset : -xoffset);
/*      */       } else {
/* 2156 */         setXOffset(0.0F);
/*      */       } 
/* 2158 */       super.paint(g);
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean isHover() {
/* 2163 */       return (super.isHover() || this.popupVisible);
/*      */     }
/*      */ 
/*      */     
/*      */     public void actionPerformed(ActionEvent e) {
/* 2168 */       if (FlatTabbedPaneUI.this.tabViewport == null) {
/*      */         return;
/*      */       }
/*      */       
/* 2172 */       JPopupMenu popupMenu = new JPopupMenu();
/* 2173 */       popupMenu.addPopupMenuListener(this);
/* 2174 */       Rectangle viewRect = FlatTabbedPaneUI.this.tabViewport.getViewRect();
/* 2175 */       int lastIndex = -1;
/* 2176 */       for (int i = 0; i < FlatTabbedPaneUI.this.rects.length; i++) {
/* 2177 */         if (!viewRect.contains(FlatTabbedPaneUI.this.rects[i])) {
/*      */           
/* 2179 */           if (lastIndex >= 0 && lastIndex + 1 != i)
/* 2180 */             popupMenu.addSeparator(); 
/* 2181 */           lastIndex = i;
/*      */ 
/*      */           
/* 2184 */           popupMenu.add(createTabMenuItem(i));
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 2189 */       int buttonWidth = getWidth();
/* 2190 */       int buttonHeight = getHeight();
/* 2191 */       Dimension popupSize = popupMenu.getPreferredSize();
/*      */       
/* 2193 */       int x = FlatTabbedPaneUI.this.isLeftToRight() ? (buttonWidth - popupSize.width) : 0;
/* 2194 */       int y = buttonHeight - popupSize.height;
/* 2195 */       switch (FlatTabbedPaneUI.this.tabPane.getTabPlacement()) {
/*      */         default:
/* 2197 */           y = buttonHeight; break;
/* 2198 */         case 3: y = -popupSize.height; break;
/* 2199 */         case 2: x = buttonWidth; break;
/* 2200 */         case 4: x = -popupSize.width;
/*      */           break;
/*      */       } 
/*      */       
/* 2204 */       popupMenu.show(this, x, y);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected JMenuItem createTabMenuItem(int tabIndex) {
/* 2214 */       String title = FlatTabbedPaneUI.this.tabPane.getTitleAt(tabIndex);
/* 2215 */       if (StringUtils.isEmpty(title)) {
/* 2216 */         Component tabComp = FlatTabbedPaneUI.this.tabPane.getTabComponentAt(tabIndex);
/* 2217 */         if (tabComp != null)
/* 2218 */           title = findTabTitle(tabComp); 
/* 2219 */         if (StringUtils.isEmpty(title))
/* 2220 */           title = FlatTabbedPaneUI.this.tabPane.getAccessibleContext().getAccessibleChild(tabIndex).getAccessibleContext().getAccessibleName(); 
/* 2221 */         if (StringUtils.isEmpty(title) && tabComp instanceof Accessible)
/* 2222 */           title = findTabTitleInAccessible((Accessible)tabComp); 
/* 2223 */         if (StringUtils.isEmpty(title)) {
/* 2224 */           title = (tabIndex + 1) + ". Tab";
/*      */         }
/*      */       } 
/* 2227 */       JMenuItem menuItem = new JMenuItem(title, FlatTabbedPaneUI.this.tabPane.getIconAt(tabIndex));
/* 2228 */       menuItem.setDisabledIcon(FlatTabbedPaneUI.this.tabPane.getDisabledIconAt(tabIndex));
/* 2229 */       menuItem.setToolTipText(FlatTabbedPaneUI.this.tabPane.getToolTipTextAt(tabIndex));
/*      */       
/* 2231 */       Color foregroundAt = FlatTabbedPaneUI.this.tabPane.getForegroundAt(tabIndex);
/* 2232 */       if (foregroundAt != FlatTabbedPaneUI.this.tabPane.getForeground()) {
/* 2233 */         menuItem.setForeground(foregroundAt);
/*      */       }
/* 2235 */       Color backgroundAt = FlatTabbedPaneUI.this.tabPane.getBackgroundAt(tabIndex);
/* 2236 */       if (backgroundAt != FlatTabbedPaneUI.this.tabPane.getBackground()) {
/* 2237 */         menuItem.setBackground(backgroundAt);
/* 2238 */         menuItem.setOpaque(true);
/*      */       } 
/*      */       
/* 2241 */       if (!FlatTabbedPaneUI.this.tabPane.isEnabled() || !FlatTabbedPaneUI.this.tabPane.isEnabledAt(tabIndex)) {
/* 2242 */         menuItem.setEnabled(false);
/*      */       }
/* 2244 */       menuItem.addActionListener(e -> selectTab(tabIndex));
/* 2245 */       return menuItem;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String findTabTitle(Component c) {
/* 2252 */       String title = null;
/* 2253 */       if (c instanceof JLabel) {
/* 2254 */         title = ((JLabel)c).getText();
/* 2255 */       } else if (c instanceof JTextComponent) {
/* 2256 */         title = ((JTextComponent)c).getText();
/*      */       } 
/* 2258 */       if (!StringUtils.isEmpty(title)) {
/* 2259 */         return title;
/*      */       }
/* 2261 */       if (c instanceof Container) {
/* 2262 */         for (Component child : ((Container)c).getComponents()) {
/* 2263 */           title = findTabTitle(child);
/* 2264 */           if (title != null) {
/* 2265 */             return title;
/*      */           }
/*      */         } 
/*      */       }
/* 2269 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String findTabTitleInAccessible(Accessible accessible) {
/* 2276 */       AccessibleContext context = accessible.getAccessibleContext();
/* 2277 */       if (context == null) {
/* 2278 */         return null;
/*      */       }
/* 2280 */       String title = context.getAccessibleName();
/* 2281 */       if (!StringUtils.isEmpty(title)) {
/* 2282 */         return title;
/*      */       }
/* 2284 */       int childrenCount = context.getAccessibleChildrenCount();
/* 2285 */       for (int i = 0; i < childrenCount; i++) {
/* 2286 */         title = findTabTitleInAccessible(context.getAccessibleChild(i));
/* 2287 */         if (title != null) {
/* 2288 */           return title;
/*      */         }
/*      */       } 
/* 2291 */       return null;
/*      */     }
/*      */     
/*      */     protected void selectTab(int tabIndex) {
/* 2295 */       FlatTabbedPaneUI.this.tabPane.setSelectedIndex(tabIndex);
/* 2296 */       FlatTabbedPaneUI.this.ensureSelectedTabIsVisible();
/*      */     }
/*      */ 
/*      */     
/*      */     public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
/* 2301 */       this.popupVisible = true;
/* 2302 */       repaint();
/*      */     }
/*      */ 
/*      */     
/*      */     public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
/* 2307 */       this.popupVisible = false;
/* 2308 */       repaint();
/*      */     }
/*      */ 
/*      */     
/*      */     public void popupMenuCanceled(PopupMenuEvent e) {
/* 2313 */       this.popupVisible = false;
/* 2314 */       repaint();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected class FlatScrollableTabButton
/*      */     extends FlatTabAreaButton
/*      */     implements MouseListener
/*      */   {
/*      */     private Timer autoRepeatTimer;
/*      */ 
/*      */     
/*      */     protected FlatScrollableTabButton(int direction) {
/* 2327 */       super(direction);
/*      */       
/* 2329 */       addMouseListener(this);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void fireActionPerformed(ActionEvent event) {
/* 2334 */       FlatTabbedPaneUI.this.runWithOriginalLayoutManager(() -> super.fireActionPerformed(event));
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void mousePressed(MouseEvent e) {
/* 2341 */       if (SwingUtilities.isLeftMouseButton(e) && isEnabled()) {
/* 2342 */         if (this.autoRepeatTimer == null) {
/*      */           
/* 2344 */           this.autoRepeatTimer = new Timer(60, e2 -> {
/*      */                 if (isEnabled())
/*      */                   doClick(); 
/*      */               });
/* 2348 */           this.autoRepeatTimer.setInitialDelay(300);
/*      */         } 
/*      */         
/* 2351 */         this.autoRepeatTimer.start();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void mouseReleased(MouseEvent e) {
/* 2357 */       if (this.autoRepeatTimer != null) {
/* 2358 */         this.autoRepeatTimer.stop();
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public void mouseClicked(MouseEvent e) {}
/*      */ 
/*      */     
/*      */     public void mouseEntered(MouseEvent e) {
/* 2367 */       if (this.autoRepeatTimer != null && isPressed()) {
/* 2368 */         this.autoRepeatTimer.start();
/*      */       }
/*      */     }
/*      */     
/*      */     public void mouseExited(MouseEvent e) {
/* 2373 */       if (this.autoRepeatTimer != null) {
/* 2374 */         this.autoRepeatTimer.stop();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected class FlatWheelTabScroller
/*      */     extends MouseAdapter
/*      */   {
/*      */     private int lastMouseX;
/*      */     
/*      */     private int lastMouseY;
/*      */     
/*      */     private boolean inViewport;
/*      */     private boolean scrolled;
/*      */     private Timer rolloverTimer;
/*      */     private Timer exitedTimer;
/*      */     private Animator animator;
/*      */     private Point startViewPosition;
/*      */     private Point targetViewPosition;
/*      */     
/*      */     protected void uninstall() {
/* 2396 */       if (this.rolloverTimer != null)
/* 2397 */         this.rolloverTimer.stop(); 
/* 2398 */       if (this.exitedTimer != null)
/* 2399 */         this.exitedTimer.stop(); 
/* 2400 */       if (this.animator != null) {
/* 2401 */         this.animator.cancel();
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public void mouseWheelMoved(MouseWheelEvent e) {
/* 2407 */       if ((FlatTabbedPaneUI.this.tabPane.getMouseWheelListeners()).length > 1) {
/*      */         return;
/*      */       }
/*      */ 
/*      */       
/* 2412 */       if (!isInViewport(e.getX(), e.getY())) {
/*      */         return;
/*      */       }
/* 2415 */       this.lastMouseX = e.getX();
/* 2416 */       this.lastMouseY = e.getY();
/*      */       
/* 2418 */       double preciseWheelRotation = e.getPreciseWheelRotation();
/* 2419 */       boolean isPreciseWheel = (preciseWheelRotation != 0.0D && preciseWheelRotation != e.getWheelRotation());
/* 2420 */       int amount = (int)(FlatTabbedPaneUI.this.maxTabHeight * preciseWheelRotation);
/*      */ 
/*      */       
/* 2423 */       if (amount == 0) {
/* 2424 */         if (preciseWheelRotation > 0.0D) {
/* 2425 */           amount = 1;
/* 2426 */         } else if (preciseWheelRotation < 0.0D) {
/* 2427 */           amount = -1;
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 2433 */       Point viewPosition = (this.targetViewPosition != null) ? this.targetViewPosition : FlatTabbedPaneUI.this.tabViewport.getViewPosition();
/* 2434 */       Dimension viewSize = FlatTabbedPaneUI.this.tabViewport.getViewSize();
/* 2435 */       boolean horizontal = FlatTabbedPaneUI.this.isHorizontalTabPlacement();
/* 2436 */       int x = viewPosition.x;
/* 2437 */       int y = viewPosition.y;
/* 2438 */       if (horizontal) {
/* 2439 */         x += FlatTabbedPaneUI.this.isLeftToRight() ? amount : -amount;
/*      */       } else {
/* 2441 */         y += amount;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2449 */       if (isPreciseWheel && FlatTabbedPaneUI.this
/* 2450 */         .getScrollButtonsPlacement() == 100 && FlatTabbedPaneUI.this
/* 2451 */         .getScrollButtonsPolicy() == 3 && (FlatTabbedPaneUI.this
/* 2452 */         .isLeftToRight() || !horizontal) && FlatTabbedPaneUI.this
/* 2453 */         .scrollBackwardButtonPrefSize != null)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2464 */         if (horizontal) {
/*      */           
/* 2466 */           if (viewPosition.x == 0 && x > 0) {
/* 2467 */             x += FlatTabbedPaneUI.this.scrollBackwardButtonPrefSize.width;
/* 2468 */           } else if (amount < 0 && x <= FlatTabbedPaneUI.this.scrollBackwardButtonPrefSize.width) {
/* 2469 */             x = 0;
/*      */           } 
/* 2471 */         } else if (viewPosition.y == 0 && y > 0) {
/* 2472 */           y += FlatTabbedPaneUI.this.scrollBackwardButtonPrefSize.height;
/* 2473 */         } else if (amount < 0 && y <= FlatTabbedPaneUI.this.scrollBackwardButtonPrefSize.height) {
/* 2474 */           y = 0;
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 2479 */       if (horizontal) {
/* 2480 */         x = Math.min(Math.max(x, 0), viewSize.width - FlatTabbedPaneUI.this.tabViewport.getWidth());
/*      */       } else {
/* 2482 */         y = Math.min(Math.max(y, 0), viewSize.height - FlatTabbedPaneUI.this.tabViewport.getHeight());
/*      */       } 
/*      */       
/* 2485 */       Point newViewPosition = new Point(x, y);
/* 2486 */       if (newViewPosition.equals(viewPosition)) {
/*      */         return;
/*      */       }
/*      */       
/* 2490 */       if (isPreciseWheel) {
/*      */ 
/*      */ 
/*      */         
/* 2494 */         if (this.animator != null) {
/* 2495 */           this.animator.stop();
/*      */         }
/* 2497 */         FlatTabbedPaneUI.this.tabViewport.setViewPosition(newViewPosition);
/* 2498 */         updateRolloverDelayed();
/*      */       } else {
/* 2500 */         setViewPositionAnimated(newViewPosition);
/*      */       } 
/* 2502 */       this.scrolled = true;
/*      */     }
/*      */ 
/*      */     
/*      */     protected void setViewPositionAnimated(Point viewPosition) {
/* 2507 */       if (viewPosition.equals(FlatTabbedPaneUI.this.tabViewport.getViewPosition())) {
/*      */         return;
/*      */       }
/*      */       
/* 2511 */       if (!FlatTabbedPaneUI.this.isSmoothScrollingEnabled()) {
/* 2512 */         FlatTabbedPaneUI.this.tabViewport.setViewPosition(viewPosition);
/* 2513 */         updateRolloverDelayed();
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/* 2518 */       this.startViewPosition = FlatTabbedPaneUI.this.tabViewport.getViewPosition();
/* 2519 */       this.targetViewPosition = viewPosition;
/*      */ 
/*      */       
/* 2522 */       if (this.animator == null) {
/*      */         
/* 2524 */         int duration = 200;
/* 2525 */         int resolution = 10;
/*      */         
/* 2527 */         this.animator = new Animator(duration, fraction -> {
/*      */               if (FlatTabbedPaneUI.this.tabViewport == null || !FlatTabbedPaneUI.this.tabViewport.isShowing()) {
/*      */                 this.animator.stop();
/*      */                 
/*      */                 return;
/*      */               } 
/*      */               
/*      */               int x = this.startViewPosition.x + Math.round((this.targetViewPosition.x - this.startViewPosition.x) * fraction);
/*      */               
/*      */               int y = this.startViewPosition.y + Math.round((this.targetViewPosition.y - this.startViewPosition.y) * fraction);
/*      */               FlatTabbedPaneUI.this.tabViewport.setViewPosition(new Point(x, y));
/*      */             }() -> {
/*      */               this.startViewPosition = this.targetViewPosition = null;
/*      */               if (FlatTabbedPaneUI.this.tabPane != null) {
/*      */                 FlatTabbedPaneUI.this.setRolloverTab(this.lastMouseX, this.lastMouseY);
/*      */               }
/*      */             });
/* 2544 */         this.animator.setResolution(resolution);
/* 2545 */         this.animator.setInterpolator((Animator.Interpolator)new CubicBezierEasing(0.5F, 0.5F, 0.5F, 1.0F));
/*      */       } 
/*      */ 
/*      */       
/* 2549 */       this.animator.restart();
/*      */     }
/*      */     
/*      */     protected void updateRolloverDelayed() {
/* 2553 */       FlatTabbedPaneUI.this.blockRollover = true;
/*      */ 
/*      */       
/* 2556 */       int oldIndex = FlatTabbedPaneUI.this.getRolloverTab();
/* 2557 */       if (oldIndex >= 0) {
/* 2558 */         int index = FlatTabbedPaneUI.this.tabForCoordinate(FlatTabbedPaneUI.this.tabPane, this.lastMouseX, this.lastMouseY);
/* 2559 */         if (index >= 0 && index != oldIndex) {
/*      */           
/* 2561 */           FlatTabbedPaneUI.this.blockRollover = false;
/* 2562 */           FlatTabbedPaneUI.this.setRolloverTab(-1);
/* 2563 */           FlatTabbedPaneUI.this.blockRollover = true;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 2568 */       if (this.rolloverTimer == null) {
/* 2569 */         this.rolloverTimer = new Timer(150, e -> {
/*      */               FlatTabbedPaneUI.this.blockRollover = false;
/*      */               
/*      */               if (FlatTabbedPaneUI.this.tabPane != null) {
/*      */                 FlatTabbedPaneUI.this.setRolloverTab(this.lastMouseX, this.lastMouseY);
/*      */               }
/*      */             });
/* 2576 */         this.rolloverTimer.setRepeats(false);
/*      */       } 
/*      */ 
/*      */       
/* 2580 */       this.rolloverTimer.restart();
/*      */     }
/*      */ 
/*      */     
/*      */     public void mouseMoved(MouseEvent e) {
/* 2585 */       checkViewportExited(e.getX(), e.getY());
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void mouseExited(MouseEvent e) {
/* 2592 */       checkViewportExited(e.getX(), e.getY());
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void mousePressed(MouseEvent e) {
/* 2598 */       FlatTabbedPaneUI.this.setRolloverTab(e.getX(), e.getY());
/*      */     }
/*      */     
/*      */     protected boolean isInViewport(int x, int y) {
/* 2602 */       return (FlatTabbedPaneUI.this.tabViewport != null && FlatTabbedPaneUI.this.tabViewport.getBounds().contains(x, y));
/*      */     }
/*      */     
/*      */     protected void checkViewportExited(int x, int y) {
/* 2606 */       this.lastMouseX = x;
/* 2607 */       this.lastMouseY = y;
/*      */       
/* 2609 */       boolean wasInViewport = this.inViewport;
/* 2610 */       this.inViewport = isInViewport(x, y);
/*      */       
/* 2612 */       if (this.inViewport != wasInViewport)
/* 2613 */         if (!this.inViewport) {
/* 2614 */           viewportExited();
/* 2615 */         } else if (this.exitedTimer != null) {
/* 2616 */           this.exitedTimer.stop();
/*      */         }  
/*      */     }
/*      */     
/*      */     protected void viewportExited() {
/* 2621 */       if (!this.scrolled) {
/*      */         return;
/*      */       }
/* 2624 */       if (this.exitedTimer == null) {
/* 2625 */         this.exitedTimer = new Timer(500, e -> ensureSelectedTabVisible());
/* 2626 */         this.exitedTimer.setRepeats(false);
/*      */       } 
/*      */       
/* 2629 */       this.exitedTimer.start();
/*      */     }
/*      */ 
/*      */     
/*      */     protected void ensureSelectedTabVisible() {
/* 2634 */       if (FlatTabbedPaneUI.this.tabPane == null || FlatTabbedPaneUI.this.tabViewport == null) {
/*      */         return;
/*      */       }
/* 2637 */       if (!this.scrolled)
/*      */         return; 
/* 2639 */       this.scrolled = false;
/*      */ 
/*      */       
/* 2642 */       FlatTabbedPaneUI.this.ensureSelectedTabIsVisible();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private class Handler
/*      */     implements MouseListener, MouseMotionListener, PropertyChangeListener, ChangeListener, ComponentListener, ContainerListener, FocusListener
/*      */   {
/*      */     MouseListener mouseDelegate;
/*      */     
/*      */     PropertyChangeListener propertyChangeDelegate;
/*      */     
/*      */     ChangeListener changeDelegate;
/*      */     
/*      */     FocusListener focusDelegate;
/* 2657 */     private final PropertyChangeListener contentListener = this::contentPropertyChange;
/*      */     
/* 2659 */     private int pressedTabIndex = -1;
/* 2660 */     private int lastTipTabIndex = -1;
/*      */     private String lastTip;
/*      */     
/*      */     void installListeners() {
/* 2664 */       FlatTabbedPaneUI.this.tabPane.addMouseMotionListener(this);
/* 2665 */       FlatTabbedPaneUI.this.tabPane.addComponentListener(this);
/* 2666 */       FlatTabbedPaneUI.this.tabPane.addContainerListener(this);
/*      */       
/* 2668 */       for (Component c : FlatTabbedPaneUI.this.tabPane.getComponents()) {
/* 2669 */         if (!(c instanceof UIResource))
/* 2670 */           c.addPropertyChangeListener(this.contentListener); 
/*      */       } 
/*      */     }
/*      */     
/*      */     void uninstallListeners() {
/* 2675 */       FlatTabbedPaneUI.this.tabPane.removeMouseMotionListener(this);
/* 2676 */       FlatTabbedPaneUI.this.tabPane.removeComponentListener(this);
/* 2677 */       FlatTabbedPaneUI.this.tabPane.removeContainerListener(this);
/*      */       
/* 2679 */       for (Component c : FlatTabbedPaneUI.this.tabPane.getComponents()) {
/* 2680 */         if (!(c instanceof UIResource)) {
/* 2681 */           c.removePropertyChangeListener(this.contentListener);
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void mouseClicked(MouseEvent e) {
/* 2689 */       this.mouseDelegate.mouseClicked(e);
/*      */     }
/*      */ 
/*      */     
/*      */     public void mousePressed(MouseEvent e) {
/* 2694 */       updateRollover(e);
/*      */       
/* 2696 */       if (!FlatTabbedPaneUI.this.isPressedTabClose() && SwingUtilities.isLeftMouseButton(e)) {
/* 2697 */         this.mouseDelegate.mousePressed(e);
/*      */       }
/*      */     }
/*      */     
/*      */     public void mouseReleased(MouseEvent e) {
/* 2702 */       if (FlatTabbedPaneUI.this.isPressedTabClose()) {
/* 2703 */         updateRollover(e);
/* 2704 */         if (this.pressedTabIndex >= 0 && this.pressedTabIndex == FlatTabbedPaneUI.this.getRolloverTab()) {
/* 2705 */           restoreTabToolTip();
/* 2706 */           FlatTabbedPaneUI.this.closeTab(this.pressedTabIndex);
/*      */         } 
/*      */       } else {
/* 2709 */         this.mouseDelegate.mouseReleased(e);
/*      */       } 
/* 2711 */       this.pressedTabIndex = -1;
/* 2712 */       updateRollover(e);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void mouseEntered(MouseEvent e) {
/* 2718 */       updateRollover(e);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void mouseExited(MouseEvent e) {
/* 2726 */       updateRollover(e);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void mouseDragged(MouseEvent e) {
/* 2733 */       updateRollover(e);
/*      */     }
/*      */ 
/*      */     
/*      */     public void mouseMoved(MouseEvent e) {
/* 2738 */       updateRollover(e);
/*      */     }
/*      */     
/*      */     private void updateRollover(MouseEvent e) {
/* 2742 */       int x = e.getX();
/* 2743 */       int y = e.getY();
/*      */       
/* 2745 */       int tabIndex = FlatTabbedPaneUI.this.tabForCoordinate(FlatTabbedPaneUI.this.tabPane, x, y);
/*      */       
/* 2747 */       FlatTabbedPaneUI.this.setRolloverTab(tabIndex);
/*      */ 
/*      */       
/* 2750 */       boolean hitClose = (FlatTabbedPaneUI.this.isTabClosable(tabIndex) && FlatTabbedPaneUI.this.getTabCloseHitArea(tabIndex).contains(x, y));
/* 2751 */       if (e.getID() == 501 && SwingUtilities.isLeftMouseButton(e))
/* 2752 */         this.pressedTabIndex = hitClose ? tabIndex : -1; 
/* 2753 */       FlatTabbedPaneUI.this.setRolloverTabClose(hitClose);
/* 2754 */       FlatTabbedPaneUI.this.setPressedTabClose((hitClose && tabIndex == this.pressedTabIndex));
/*      */ 
/*      */       
/* 2757 */       if (tabIndex >= 0 && hitClose)
/* 2758 */       { Object closeTip = FlatTabbedPaneUI.this.getTabClientProperty(tabIndex, "JTabbedPane.tabCloseToolTipText");
/* 2759 */         if (closeTip == null)
/* 2760 */           closeTip = FlatTabbedPaneUI.this.tabCloseToolTipText; 
/* 2761 */         if (closeTip instanceof String) {
/* 2762 */           setCloseToolTip(tabIndex, (String)closeTip);
/*      */         } else {
/* 2764 */           restoreTabToolTip();
/*      */         }  }
/* 2766 */       else { restoreTabToolTip(); }
/*      */     
/*      */     }
/*      */     private void setCloseToolTip(int tabIndex, String closeTip) {
/* 2770 */       if (tabIndex == this.lastTipTabIndex) {
/*      */         return;
/*      */       }
/* 2773 */       restoreTabToolTip();
/*      */       
/* 2775 */       this.lastTipTabIndex = tabIndex;
/* 2776 */       this.lastTip = FlatTabbedPaneUI.this.tabPane.getToolTipTextAt(this.lastTipTabIndex);
/* 2777 */       FlatTabbedPaneUI.this.tabPane.setToolTipTextAt(this.lastTipTabIndex, closeTip);
/*      */     }
/*      */     
/*      */     private void restoreTabToolTip() {
/* 2781 */       if (this.lastTipTabIndex < 0) {
/*      */         return;
/*      */       }
/* 2784 */       if (this.lastTipTabIndex < FlatTabbedPaneUI.this.tabPane.getTabCount())
/* 2785 */         FlatTabbedPaneUI.this.tabPane.setToolTipTextAt(this.lastTipTabIndex, this.lastTip); 
/* 2786 */       this.lastTip = null;
/* 2787 */       this.lastTipTabIndex = -1;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void propertyChange(PropertyChangeEvent e) {
/* 2795 */       switch (e.getPropertyName()) {
/*      */         case "tabPlacement":
/*      */         case "opaque":
/*      */         case "background":
/*      */         case "indexForTabComponent":
/* 2800 */           FlatTabbedPaneUI.this.runWithOriginalLayoutManager(() -> this.propertyChangeDelegate.propertyChange(e));
/*      */           break;
/*      */ 
/*      */ 
/*      */         
/*      */         default:
/* 2806 */           this.propertyChangeDelegate.propertyChange(e);
/*      */           break;
/*      */       } 
/*      */ 
/*      */       
/* 2811 */       switch (e.getPropertyName()) {
/*      */         case "tabPlacement":
/* 2813 */           if (FlatTabbedPaneUI.this.moreTabsButton instanceof FlatTabbedPaneUI.FlatMoreTabsButton) {
/* 2814 */             ((FlatTabbedPaneUI.FlatMoreTabsButton)FlatTabbedPaneUI.this.moreTabsButton).updateDirection();
/*      */           }
/*      */           break;
/*      */         case "componentOrientation":
/* 2818 */           FlatTabbedPaneUI.this.ensureSelectedTabIsVisibleLater();
/*      */           break;
/*      */         
/*      */         case "JTabbedPane.showTabSeparators":
/*      */         case "JTabbedPane.tabType":
/* 2823 */           FlatTabbedPaneUI.this.tabPane.repaint();
/*      */           break;
/*      */ 
/*      */ 
/*      */         
/*      */         case "JTabbedPane.showContentSeparator":
/*      */         case "JTabbedPane.hasFullBorder":
/*      */         case "JTabbedPane.hideTabAreaWithOneTab":
/*      */         case "JTabbedPane.minimumTabWidth":
/*      */         case "JTabbedPane.maximumTabWidth":
/*      */         case "JTabbedPane.tabHeight":
/*      */         case "JTabbedPane.tabInsets":
/*      */         case "JTabbedPane.tabAreaInsets":
/*      */         case "JTabbedPane.tabsPopupPolicy":
/*      */         case "JTabbedPane.scrollButtonsPolicy":
/*      */         case "JTabbedPane.scrollButtonsPlacement":
/*      */         case "JTabbedPane.tabAreaAlignment":
/*      */         case "JTabbedPane.tabAlignment":
/*      */         case "JTabbedPane.tabWidthMode":
/*      */         case "JTabbedPane.tabIconPlacement":
/*      */         case "JTabbedPane.tabClosable":
/* 2844 */           FlatTabbedPaneUI.this.tabPane.revalidate();
/* 2845 */           FlatTabbedPaneUI.this.tabPane.repaint();
/*      */           break;
/*      */         
/*      */         case "JTabbedPane.leadingComponent":
/* 2849 */           FlatTabbedPaneUI.this.uninstallLeadingComponent();
/* 2850 */           FlatTabbedPaneUI.this.installLeadingComponent();
/* 2851 */           FlatTabbedPaneUI.this.tabPane.revalidate();
/* 2852 */           FlatTabbedPaneUI.this.tabPane.repaint();
/* 2853 */           FlatTabbedPaneUI.this.ensureSelectedTabIsVisibleLater();
/*      */           break;
/*      */         
/*      */         case "JTabbedPane.trailingComponent":
/* 2857 */           FlatTabbedPaneUI.this.uninstallTrailingComponent();
/* 2858 */           FlatTabbedPaneUI.this.installTrailingComponent();
/* 2859 */           FlatTabbedPaneUI.this.tabPane.revalidate();
/* 2860 */           FlatTabbedPaneUI.this.tabPane.repaint();
/* 2861 */           FlatTabbedPaneUI.this.ensureSelectedTabIsVisibleLater();
/*      */           break;
/*      */         
/*      */         case "FlatLaf.style":
/*      */         case "FlatLaf.styleClass":
/* 2866 */           FlatTabbedPaneUI.this.installStyle();
/* 2867 */           FlatTabbedPaneUI.this.tabPane.revalidate();
/* 2868 */           FlatTabbedPaneUI.this.tabPane.repaint();
/*      */           break;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void stateChanged(ChangeEvent e) {
/* 2877 */       this.changeDelegate.stateChanged(e);
/*      */ 
/*      */       
/* 2880 */       if (FlatTabbedPaneUI.this.moreTabsButton != null)
/* 2881 */         FlatTabbedPaneUI.this.ensureSelectedTabIsVisible(); 
/*      */     }
/*      */     
/*      */     protected void contentPropertyChange(PropertyChangeEvent e) {
/* 2885 */       switch (e.getPropertyName()) {
/*      */         case "JTabbedPane.minimumTabWidth":
/*      */         case "JTabbedPane.maximumTabWidth":
/*      */         case "JTabbedPane.tabInsets":
/*      */         case "JTabbedPane.tabAlignment":
/*      */         case "JTabbedPane.tabClosable":
/* 2891 */           FlatTabbedPaneUI.this.tabPane.revalidate();
/* 2892 */           FlatTabbedPaneUI.this.tabPane.repaint();
/*      */           break;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void componentResized(ComponentEvent e) {
/* 2902 */       FlatTabbedPaneUI.this.ensureSelectedTabIsVisibleLater();
/*      */     }
/*      */ 
/*      */     
/*      */     public void componentMoved(ComponentEvent e) {}
/*      */     
/*      */     public void componentShown(ComponentEvent e) {}
/*      */     
/*      */     public void componentHidden(ComponentEvent e) {}
/*      */     
/*      */     public void componentAdded(ContainerEvent e) {
/* 2913 */       Component c = e.getChild();
/* 2914 */       if (!(c instanceof UIResource)) {
/* 2915 */         c.addPropertyChangeListener(this.contentListener);
/*      */       }
/*      */     }
/*      */     
/*      */     public void componentRemoved(ContainerEvent e) {
/* 2920 */       Component c = e.getChild();
/* 2921 */       if (!(c instanceof UIResource)) {
/* 2922 */         c.removePropertyChangeListener(this.contentListener);
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void focusGained(FocusEvent e) {
/* 2929 */       this.focusDelegate.focusGained(e);
/* 2930 */       FlatTabbedPaneUI.this.repaintTab(FlatTabbedPaneUI.this.tabPane.getSelectedIndex());
/*      */     }
/*      */ 
/*      */     
/*      */     public void focusLost(FocusEvent e) {
/* 2935 */       this.focusDelegate.focusLost(e);
/* 2936 */       FlatTabbedPaneUI.this.repaintTab(FlatTabbedPaneUI.this.tabPane.getSelectedIndex());
/*      */     }
/*      */ 
/*      */     
/*      */     private Handler() {}
/*      */   }
/*      */   
/*      */   protected class FlatTabbedPaneLayout
/*      */     extends BasicTabbedPaneUI.TabbedPaneLayout
/*      */   {
/*      */     protected Dimension calculateSize(boolean minimum) {
/* 2947 */       if (isContentEmpty()) {
/* 2948 */         return calculateTabAreaSize();
/*      */       }
/* 2950 */       return super.calculateSize(minimum);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected boolean isContentEmpty() {
/* 2960 */       int tabCount = FlatTabbedPaneUI.this.tabPane.getTabCount();
/* 2961 */       if (tabCount == 0) {
/* 2962 */         return false;
/*      */       }
/* 2964 */       for (int i = 0; i < tabCount; i++) {
/* 2965 */         Component c = FlatTabbedPaneUI.this.tabPane.getComponentAt(i);
/* 2966 */         if (c != null) {
/* 2967 */           Dimension cs = c.getPreferredSize();
/* 2968 */           if (cs.width != 0 || cs.height != 0) {
/* 2969 */             return false;
/*      */           }
/*      */         } 
/*      */       } 
/* 2973 */       return true;
/*      */     }
/*      */     
/*      */     protected Dimension calculateTabAreaSize() {
/* 2977 */       boolean horizontal = FlatTabbedPaneUI.this.isHorizontalTabPlacement();
/* 2978 */       int tabPlacement = FlatTabbedPaneUI.this.tabPane.getTabPlacement();
/* 2979 */       FontMetrics metrics = FlatTabbedPaneUI.this.getFontMetrics();
/* 2980 */       int fontHeight = metrics.getHeight();
/*      */ 
/*      */       
/* 2983 */       int width = 0;
/* 2984 */       int height = 0;
/* 2985 */       int tabCount = FlatTabbedPaneUI.this.tabPane.getTabCount();
/* 2986 */       for (int i = 0; i < tabCount; i++) {
/* 2987 */         if (horizontal) {
/* 2988 */           width += FlatTabbedPaneUI.this.calculateTabWidth(tabPlacement, i, metrics);
/* 2989 */           height = Math.max(height, FlatTabbedPaneUI.this.calculateTabHeight(tabPlacement, i, fontHeight));
/*      */         } else {
/* 2991 */           width = Math.max(width, FlatTabbedPaneUI.this.calculateTabWidth(tabPlacement, i, metrics));
/* 2992 */           height += FlatTabbedPaneUI.this.calculateTabHeight(tabPlacement, i, fontHeight);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 2997 */       if (horizontal) {
/* 2998 */         height += UIScale.scale(FlatTabbedPaneUI.this.contentSeparatorHeight);
/*      */       } else {
/* 3000 */         width += UIScale.scale(FlatTabbedPaneUI.this.contentSeparatorHeight);
/*      */       } 
/*      */       
/* 3003 */       Insets insets = FlatTabbedPaneUI.this.tabPane.getInsets();
/* 3004 */       Insets tabAreaInsets = FlatTabbedPaneUI.this.getTabAreaInsets(tabPlacement);
/* 3005 */       return new Dimension(width + insets.left + insets.right + tabAreaInsets.left + tabAreaInsets.right, height + insets.bottom + insets.top + tabAreaInsets.top + tabAreaInsets.bottom);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void layoutContainer(Container parent) {
/* 3012 */       super.layoutContainer(parent);
/*      */       
/* 3014 */       Rectangle bounds = FlatTabbedPaneUI.this.tabPane.getBounds();
/* 3015 */       Insets insets = FlatTabbedPaneUI.this.tabPane.getInsets();
/* 3016 */       int tabPlacement = FlatTabbedPaneUI.this.tabPane.getTabPlacement();
/* 3017 */       int tabAreaAlignment = FlatTabbedPaneUI.this.getTabAreaAlignment();
/* 3018 */       Insets tabAreaInsets = FlatTabbedPaneUI.this.getRealTabAreaInsets(tabPlacement);
/* 3019 */       boolean leftToRight = FlatTabbedPaneUI.this.isLeftToRight();
/*      */ 
/*      */       
/* 3022 */       if (tabPlacement == 1 || tabPlacement == 3) {
/*      */         
/* 3024 */         if (!leftToRight) {
/* 3025 */           FlatTabbedPaneUI.this.shiftTabs(insets.left + tabAreaInsets.right + FlatTabbedPaneUI.this.getTrailingPreferredWidth(), 0);
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 3030 */         int tabAreaHeight = (FlatTabbedPaneUI.this.maxTabHeight > 0) ? FlatTabbedPaneUI.this.maxTabHeight : Math.max(
/* 3031 */             Math.max(FlatTabbedPaneUI.this.getLeadingPreferredHeight(), FlatTabbedPaneUI.this.getTrailingPreferredHeight()), 
/* 3032 */             UIScale.scale(FlatClientProperties.clientPropertyInt(FlatTabbedPaneUI.this.tabPane, "JTabbedPane.tabHeight", FlatTabbedPaneUI.this.tabHeight)));
/*      */ 
/*      */         
/* 3035 */         int tx = insets.left;
/*      */ 
/*      */         
/* 3038 */         int ty = (tabPlacement == 1) ? (insets.top + tabAreaInsets.top) : (bounds.height - insets.bottom - tabAreaInsets.bottom - tabAreaHeight);
/* 3039 */         int tw = bounds.width - insets.left - insets.right;
/* 3040 */         int th = tabAreaHeight;
/*      */         
/* 3042 */         int leadingWidth = FlatTabbedPaneUI.this.getLeadingPreferredWidth();
/* 3043 */         int trailingWidth = FlatTabbedPaneUI.this.getTrailingPreferredWidth();
/*      */ 
/*      */         
/* 3046 */         if (FlatTabbedPaneUI.this.runCount == 1 && FlatTabbedPaneUI.this.rects.length > 0) {
/* 3047 */           int availWidth = tw - leadingWidth - trailingWidth - tabAreaInsets.left - tabAreaInsets.right;
/* 3048 */           int totalTabWidth = FlatTabbedPaneUI.this.rectsTotalWidth(leftToRight);
/* 3049 */           int diff = availWidth - totalTabWidth;
/*      */           
/* 3051 */           switch (tabAreaAlignment) {
/*      */             case 10:
/* 3053 */               trailingWidth += diff;
/*      */               break;
/*      */             
/*      */             case 11:
/* 3057 */               FlatTabbedPaneUI.this.shiftTabs(leftToRight ? diff : -diff, 0);
/* 3058 */               leadingWidth += diff;
/*      */               break;
/*      */             
/*      */             case 0:
/* 3062 */               FlatTabbedPaneUI.this.shiftTabs((leftToRight ? diff : -diff) / 2, 0);
/* 3063 */               leadingWidth += diff / 2;
/* 3064 */               trailingWidth += diff - diff / 2;
/*      */               break;
/*      */             
/*      */             case 100:
/* 3068 */               FlatTabbedPaneUI.this.stretchTabsWidth(diff, leftToRight);
/*      */               break;
/*      */           } 
/* 3071 */         } else if (FlatTabbedPaneUI.this.rects.length == 0) {
/* 3072 */           trailingWidth = tw - leadingWidth;
/*      */         } 
/*      */         
/* 3075 */         Container leftComponent = leftToRight ? FlatTabbedPaneUI.this.leadingComponent : FlatTabbedPaneUI.this.trailingComponent;
/* 3076 */         if (leftComponent != null) {
/* 3077 */           int leftWidth = leftToRight ? leadingWidth : trailingWidth;
/* 3078 */           leftComponent.setBounds(tx, ty, leftWidth, th);
/*      */         } 
/*      */ 
/*      */         
/* 3082 */         Container rightComponent = leftToRight ? FlatTabbedPaneUI.this.trailingComponent : FlatTabbedPaneUI.this.leadingComponent;
/* 3083 */         if (rightComponent != null) {
/* 3084 */           int rightWidth = leftToRight ? trailingWidth : leadingWidth;
/* 3085 */           rightComponent.setBounds(tx + tw - rightWidth, ty, rightWidth, th);
/*      */         }
/*      */       
/*      */       }
/*      */       else {
/*      */         
/* 3091 */         int tabAreaWidth = (FlatTabbedPaneUI.this.maxTabWidth > 0) ? FlatTabbedPaneUI.this.maxTabWidth : Math.max(FlatTabbedPaneUI.this.getLeadingPreferredWidth(), FlatTabbedPaneUI.this.getTrailingPreferredWidth());
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3096 */         int tx = (tabPlacement == 2) ? (insets.left + tabAreaInsets.left) : (bounds.width - insets.right - tabAreaInsets.right - tabAreaWidth);
/* 3097 */         int ty = insets.top;
/* 3098 */         int tw = tabAreaWidth;
/* 3099 */         int th = bounds.height - insets.top - insets.bottom;
/*      */         
/* 3101 */         int topHeight = FlatTabbedPaneUI.this.getLeadingPreferredHeight();
/* 3102 */         int bottomHeight = FlatTabbedPaneUI.this.getTrailingPreferredHeight();
/*      */ 
/*      */         
/* 3105 */         if (FlatTabbedPaneUI.this.runCount == 1 && FlatTabbedPaneUI.this.rects.length > 0) {
/* 3106 */           int availHeight = th - topHeight - bottomHeight - tabAreaInsets.top - tabAreaInsets.bottom;
/* 3107 */           int totalTabHeight = FlatTabbedPaneUI.this.rectsTotalHeight();
/* 3108 */           int diff = availHeight - totalTabHeight;
/*      */           
/* 3110 */           switch (tabAreaAlignment) {
/*      */             case 10:
/* 3112 */               bottomHeight += diff;
/*      */               break;
/*      */             
/*      */             case 11:
/* 3116 */               FlatTabbedPaneUI.this.shiftTabs(0, diff);
/* 3117 */               topHeight += diff;
/*      */               break;
/*      */             
/*      */             case 0:
/* 3121 */               FlatTabbedPaneUI.this.shiftTabs(0, diff / 2);
/* 3122 */               topHeight += diff / 2;
/* 3123 */               bottomHeight += diff - diff / 2;
/*      */               break;
/*      */             
/*      */             case 100:
/* 3127 */               FlatTabbedPaneUI.this.stretchTabsHeight(diff);
/*      */               break;
/*      */           } 
/* 3130 */         } else if (FlatTabbedPaneUI.this.rects.length == 0) {
/* 3131 */           bottomHeight = th - topHeight;
/*      */         } 
/*      */         
/* 3134 */         if (FlatTabbedPaneUI.this.leadingComponent != null) {
/* 3135 */           FlatTabbedPaneUI.this.leadingComponent.setBounds(tx, ty, tw, topHeight);
/*      */         }
/*      */         
/* 3138 */         if (FlatTabbedPaneUI.this.trailingComponent != null) {
/* 3139 */           FlatTabbedPaneUI.this.trailingComponent.setBounds(tx, ty + th - bottomHeight, tw, bottomHeight);
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
/*      */   protected class FlatTabbedPaneScrollLayout
/*      */     extends FlatTabbedPaneLayout
/*      */     implements LayoutManager
/*      */   {
/*      */     private final BasicTabbedPaneUI.TabbedPaneLayout delegate;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected FlatTabbedPaneScrollLayout(BasicTabbedPaneUI.TabbedPaneLayout delegate) {
/* 3162 */       this.delegate = delegate;
/*      */     }
/*      */ 
/*      */     
/*      */     public void calculateLayoutInfo() {
/* 3167 */       this.delegate.calculateLayoutInfo();
/*      */     }
/*      */ 
/*      */     
/*      */     protected Dimension calculateTabAreaSize() {
/* 3172 */       Dimension size = super.calculateTabAreaSize();
/*      */ 
/*      */       
/* 3175 */       if (FlatTabbedPaneUI.this.isHorizontalTabPlacement()) {
/* 3176 */         size.width = Math.min(size.width, UIScale.scale(100));
/*      */       } else {
/* 3178 */         size.height = Math.min(size.height, UIScale.scale(100));
/* 3179 */       }  return size;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Dimension preferredLayoutSize(Container parent) {
/* 3186 */       if (isContentEmpty()) {
/* 3187 */         return calculateTabAreaSize();
/*      */       }
/* 3189 */       return this.delegate.preferredLayoutSize(parent);
/*      */     }
/*      */ 
/*      */     
/*      */     public Dimension minimumLayoutSize(Container parent) {
/* 3194 */       if (isContentEmpty()) {
/* 3195 */         return calculateTabAreaSize();
/*      */       }
/* 3197 */       return this.delegate.minimumLayoutSize(parent);
/*      */     }
/*      */ 
/*      */     
/*      */     public void addLayoutComponent(String name, Component comp) {
/* 3202 */       this.delegate.addLayoutComponent(name, comp);
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeLayoutComponent(Component comp) {
/* 3207 */       this.delegate.removeLayoutComponent(comp);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void layoutContainer(Container parent) {
/* 3216 */       FlatTabbedPaneUI.this.runWithOriginalLayoutManager(() -> this.delegate.layoutContainer(parent));
/*      */ 
/*      */ 
/*      */       
/* 3220 */       int tabsPopupPolicy = FlatTabbedPaneUI.this.getTabsPopupPolicy();
/* 3221 */       int scrollButtonsPolicy = FlatTabbedPaneUI.this.getScrollButtonsPolicy();
/* 3222 */       int scrollButtonsPlacement = FlatTabbedPaneUI.this.getScrollButtonsPlacement();
/*      */       
/* 3224 */       boolean useMoreTabsButton = (tabsPopupPolicy == 2);
/* 3225 */       boolean useScrollButtons = (scrollButtonsPolicy == 2 || scrollButtonsPolicy == 3);
/* 3226 */       boolean hideDisabledScrollButtons = (scrollButtonsPolicy == 3 && scrollButtonsPlacement == 100);
/* 3227 */       boolean trailingScrollButtons = (scrollButtonsPlacement == 11);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 3232 */       boolean leftToRight = FlatTabbedPaneUI.this.isLeftToRight();
/* 3233 */       if (!leftToRight && FlatTabbedPaneUI.this.isHorizontalTabPlacement()) {
/* 3234 */         useMoreTabsButton = true;
/* 3235 */         useScrollButtons = false;
/*      */       } 
/*      */ 
/*      */       
/* 3239 */       JButton backwardButton = null;
/* 3240 */       JButton forwardButton = null;
/* 3241 */       for (Component c : FlatTabbedPaneUI.this.tabPane.getComponents()) {
/* 3242 */         if (c instanceof FlatTabbedPaneUI.FlatScrollableTabButton) {
/* 3243 */           int direction = ((FlatTabbedPaneUI.FlatScrollableTabButton)c).getDirection();
/* 3244 */           if (direction == 7 || direction == 1) {
/* 3245 */             backwardButton = (JButton)c;
/* 3246 */           } else if (direction == 3 || direction == 5) {
/* 3247 */             forwardButton = (JButton)c;
/*      */           } 
/*      */         } 
/*      */       } 
/* 3251 */       if (backwardButton == null || forwardButton == null) {
/*      */         return;
/*      */       }
/* 3254 */       Rectangle bounds = FlatTabbedPaneUI.this.tabPane.getBounds();
/* 3255 */       Insets insets = FlatTabbedPaneUI.this.tabPane.getInsets();
/* 3256 */       int tabPlacement = FlatTabbedPaneUI.this.tabPane.getTabPlacement();
/* 3257 */       int tabAreaAlignment = FlatTabbedPaneUI.this.getTabAreaAlignment();
/* 3258 */       Insets tabAreaInsets = FlatTabbedPaneUI.this.getRealTabAreaInsets(tabPlacement);
/* 3259 */       boolean moreTabsButtonVisible = false;
/* 3260 */       boolean backwardButtonVisible = false;
/* 3261 */       boolean forwardButtonVisible = false;
/*      */ 
/*      */ 
/*      */       
/* 3265 */       if (tabAreaInsets.left != 0 || tabAreaInsets.top != 0) {
/*      */         
/* 3267 */         FlatTabbedPaneUI.this.shiftTabs(-tabAreaInsets.left, -tabAreaInsets.top);
/*      */ 
/*      */         
/* 3270 */         Component view = FlatTabbedPaneUI.this.tabViewport.getView();
/* 3271 */         Dimension viewSize = view.getPreferredSize();
/* 3272 */         boolean horizontal = (tabPlacement == 1 || tabPlacement == 3);
/* 3273 */         view.setPreferredSize(new Dimension(viewSize.width - (
/* 3274 */               horizontal ? tabAreaInsets.left : 0), viewSize.height - (
/* 3275 */               horizontal ? 0 : tabAreaInsets.top)));
/*      */       } 
/*      */ 
/*      */       
/* 3279 */       if (tabPlacement == 1 || tabPlacement == 3) {
/*      */         
/* 3281 */         if (useScrollButtons && hideDisabledScrollButtons) {
/* 3282 */           Point viewPosition = FlatTabbedPaneUI.this.tabViewport.getViewPosition();
/* 3283 */           if (viewPosition.x <= (backwardButton.getPreferredSize()).width) {
/* 3284 */             FlatTabbedPaneUI.this.tabViewport.setViewPosition(new Point(0, viewPosition.y));
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 3290 */         int tabAreaHeight = (FlatTabbedPaneUI.this.maxTabHeight > 0) ? FlatTabbedPaneUI.this.maxTabHeight : Math.max(
/* 3291 */             Math.max(FlatTabbedPaneUI.this.getLeadingPreferredHeight(), FlatTabbedPaneUI.this.getTrailingPreferredHeight()), 
/* 3292 */             UIScale.scale(FlatClientProperties.clientPropertyInt(FlatTabbedPaneUI.this.tabPane, "JTabbedPane.tabHeight", FlatTabbedPaneUI.this.tabHeight)));
/*      */ 
/*      */         
/* 3295 */         int tx = insets.left;
/*      */ 
/*      */         
/* 3298 */         int ty = (tabPlacement == 1) ? (insets.top + tabAreaInsets.top) : (bounds.height - insets.bottom - tabAreaInsets.bottom - tabAreaHeight);
/* 3299 */         int tw = bounds.width - insets.left - insets.right;
/* 3300 */         int th = tabAreaHeight;
/*      */         
/* 3302 */         int leadingWidth = FlatTabbedPaneUI.this.getLeadingPreferredWidth();
/* 3303 */         int trailingWidth = FlatTabbedPaneUI.this.getTrailingPreferredWidth();
/* 3304 */         int availWidth = tw - leadingWidth - trailingWidth - tabAreaInsets.left - tabAreaInsets.right;
/* 3305 */         int totalTabWidth = (FlatTabbedPaneUI.this.rects.length > 0) ? FlatTabbedPaneUI.this.rectsTotalWidth(leftToRight) : 0;
/*      */ 
/*      */         
/* 3308 */         if (totalTabWidth < availWidth && FlatTabbedPaneUI.this.rects.length > 0) {
/* 3309 */           int diff = availWidth - totalTabWidth;
/* 3310 */           switch (tabAreaAlignment) {
/*      */             case 10:
/* 3312 */               trailingWidth += diff;
/*      */               break;
/*      */             
/*      */             case 11:
/* 3316 */               leadingWidth += diff;
/*      */               break;
/*      */             
/*      */             case 0:
/* 3320 */               leadingWidth += diff / 2;
/* 3321 */               trailingWidth += diff - diff / 2;
/*      */               break;
/*      */             
/*      */             case 100:
/* 3325 */               FlatTabbedPaneUI.this.stretchTabsWidth(diff, leftToRight);
/* 3326 */               totalTabWidth = FlatTabbedPaneUI.this.rectsTotalWidth(leftToRight);
/*      */               break;
/*      */           } 
/* 3329 */         } else if (FlatTabbedPaneUI.this.rects.length == 0) {
/* 3330 */           trailingWidth = tw - leadingWidth;
/*      */         } 
/*      */         
/* 3333 */         Container leftComponent = leftToRight ? FlatTabbedPaneUI.this.leadingComponent : FlatTabbedPaneUI.this.trailingComponent;
/* 3334 */         int leftWidth = leftToRight ? leadingWidth : trailingWidth;
/* 3335 */         if (leftComponent != null) {
/* 3336 */           leftComponent.setBounds(tx, ty, leftWidth, th);
/*      */         }
/*      */         
/* 3339 */         Container rightComponent = leftToRight ? FlatTabbedPaneUI.this.trailingComponent : FlatTabbedPaneUI.this.leadingComponent;
/* 3340 */         int rightWidth = leftToRight ? trailingWidth : leadingWidth;
/* 3341 */         if (rightComponent != null) {
/* 3342 */           rightComponent.setBounds(tx + tw - rightWidth, ty, rightWidth, th);
/*      */         }
/*      */         
/* 3345 */         if (FlatTabbedPaneUI.this.rects.length > 0) {
/* 3346 */           int txi = tx + leftWidth + (leftToRight ? tabAreaInsets.left : tabAreaInsets.right);
/* 3347 */           int twi = tw - leftWidth - rightWidth - tabAreaInsets.left - tabAreaInsets.right;
/*      */ 
/*      */           
/* 3350 */           int x = txi;
/* 3351 */           int w = twi;
/*      */           
/* 3353 */           if (w < totalTabWidth) {
/*      */ 
/*      */ 
/*      */             
/* 3357 */             if (useMoreTabsButton) {
/* 3358 */               int buttonWidth = (FlatTabbedPaneUI.this.moreTabsButton.getPreferredSize()).width;
/* 3359 */               FlatTabbedPaneUI.this.moreTabsButton.setBounds(leftToRight ? (x + w - buttonWidth) : x, ty, buttonWidth, th);
/* 3360 */               x += leftToRight ? 0 : buttonWidth;
/* 3361 */               w -= buttonWidth;
/* 3362 */               moreTabsButtonVisible = true;
/*      */             } 
/* 3364 */             if (useScrollButtons) {
/*      */               
/* 3366 */               if (!hideDisabledScrollButtons || forwardButton.isEnabled()) {
/* 3367 */                 int buttonWidth = (forwardButton.getPreferredSize()).width;
/* 3368 */                 forwardButton.setBounds(leftToRight ? (x + w - buttonWidth) : x, ty, buttonWidth, th);
/* 3369 */                 x += leftToRight ? 0 : buttonWidth;
/* 3370 */                 w -= buttonWidth;
/* 3371 */                 forwardButtonVisible = true;
/*      */               } 
/*      */ 
/*      */               
/* 3375 */               if (!hideDisabledScrollButtons || backwardButton.isEnabled()) {
/* 3376 */                 int buttonWidth = (backwardButton.getPreferredSize()).width;
/* 3377 */                 if (trailingScrollButtons) {
/*      */                   
/* 3379 */                   backwardButton.setBounds(leftToRight ? (x + w - buttonWidth) : x, ty, buttonWidth, th);
/* 3380 */                   x += leftToRight ? 0 : buttonWidth;
/*      */                 } else {
/*      */                   
/* 3383 */                   backwardButton.setBounds(leftToRight ? x : (x + w - buttonWidth), ty, buttonWidth, th);
/* 3384 */                   x += leftToRight ? buttonWidth : 0;
/*      */                 } 
/* 3386 */                 w -= buttonWidth;
/* 3387 */                 backwardButtonVisible = true;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           
/* 3392 */           FlatTabbedPaneUI.this.tabViewport.setBounds(x, ty, w, th);
/*      */           
/* 3394 */           if (!leftToRight) {
/*      */             
/* 3396 */             FlatTabbedPaneUI.this.tabViewport.doLayout();
/*      */ 
/*      */             
/* 3399 */             FlatTabbedPaneUI.this.shiftTabs(FlatTabbedPaneUI.this.tabViewport.getView().getWidth() - (FlatTabbedPaneUI.this.rects[0]).x + (FlatTabbedPaneUI.this.rects[0]).width, 0);
/*      */           } 
/*      */         } 
/*      */       } else {
/*      */         
/* 3404 */         if (useScrollButtons && hideDisabledScrollButtons) {
/* 3405 */           Point viewPosition = FlatTabbedPaneUI.this.tabViewport.getViewPosition();
/* 3406 */           if (viewPosition.y <= (backwardButton.getPreferredSize()).height) {
/* 3407 */             FlatTabbedPaneUI.this.tabViewport.setViewPosition(new Point(viewPosition.x, 0));
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 3413 */         int tabAreaWidth = (FlatTabbedPaneUI.this.maxTabWidth > 0) ? FlatTabbedPaneUI.this.maxTabWidth : Math.max(FlatTabbedPaneUI.this.getLeadingPreferredWidth(), FlatTabbedPaneUI.this.getTrailingPreferredWidth());
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 3418 */         int tx = (tabPlacement == 2) ? (insets.left + tabAreaInsets.left) : (bounds.width - insets.right - tabAreaInsets.right - tabAreaWidth);
/* 3419 */         int ty = insets.top;
/* 3420 */         int tw = tabAreaWidth;
/* 3421 */         int th = bounds.height - insets.top - insets.bottom;
/*      */         
/* 3423 */         int topHeight = FlatTabbedPaneUI.this.getLeadingPreferredHeight();
/* 3424 */         int bottomHeight = FlatTabbedPaneUI.this.getTrailingPreferredHeight();
/* 3425 */         int availHeight = th - topHeight - bottomHeight - tabAreaInsets.top - tabAreaInsets.bottom;
/* 3426 */         int totalTabHeight = (FlatTabbedPaneUI.this.rects.length > 0) ? FlatTabbedPaneUI.this.rectsTotalHeight() : 0;
/*      */ 
/*      */         
/* 3429 */         if (totalTabHeight < availHeight && FlatTabbedPaneUI.this.rects.length > 0) {
/* 3430 */           int diff = availHeight - totalTabHeight;
/* 3431 */           switch (tabAreaAlignment) {
/*      */             case 10:
/* 3433 */               bottomHeight += diff;
/*      */               break;
/*      */             
/*      */             case 11:
/* 3437 */               topHeight += diff;
/*      */               break;
/*      */             
/*      */             case 0:
/* 3441 */               topHeight += diff / 2;
/* 3442 */               bottomHeight += diff - diff / 2;
/*      */               break;
/*      */             
/*      */             case 100:
/* 3446 */               FlatTabbedPaneUI.this.stretchTabsHeight(diff);
/* 3447 */               totalTabHeight = FlatTabbedPaneUI.this.rectsTotalHeight();
/*      */               break;
/*      */           } 
/* 3450 */         } else if (FlatTabbedPaneUI.this.rects.length == 0) {
/* 3451 */           bottomHeight = th - topHeight;
/*      */         } 
/*      */         
/* 3454 */         if (FlatTabbedPaneUI.this.leadingComponent != null) {
/* 3455 */           FlatTabbedPaneUI.this.leadingComponent.setBounds(tx, ty, tw, topHeight);
/*      */         }
/*      */         
/* 3458 */         if (FlatTabbedPaneUI.this.trailingComponent != null) {
/* 3459 */           FlatTabbedPaneUI.this.trailingComponent.setBounds(tx, ty + th - bottomHeight, tw, bottomHeight);
/*      */         }
/*      */         
/* 3462 */         if (FlatTabbedPaneUI.this.rects.length > 0) {
/* 3463 */           int tyi = ty + topHeight + tabAreaInsets.top;
/* 3464 */           int thi = th - topHeight - bottomHeight - tabAreaInsets.top - tabAreaInsets.bottom;
/*      */ 
/*      */           
/* 3467 */           int y = tyi;
/* 3468 */           int h = thi;
/*      */           
/* 3470 */           if (h < totalTabHeight) {
/*      */ 
/*      */ 
/*      */             
/* 3474 */             if (useMoreTabsButton) {
/* 3475 */               int buttonHeight = (FlatTabbedPaneUI.this.moreTabsButton.getPreferredSize()).height;
/* 3476 */               FlatTabbedPaneUI.this.moreTabsButton.setBounds(tx, y + h - buttonHeight, tw, buttonHeight);
/* 3477 */               h -= buttonHeight;
/* 3478 */               moreTabsButtonVisible = true;
/*      */             } 
/* 3480 */             if (useScrollButtons) {
/*      */               
/* 3482 */               if (!hideDisabledScrollButtons || forwardButton.isEnabled()) {
/* 3483 */                 int buttonHeight = (forwardButton.getPreferredSize()).height;
/* 3484 */                 forwardButton.setBounds(tx, y + h - buttonHeight, tw, buttonHeight);
/* 3485 */                 h -= buttonHeight;
/* 3486 */                 forwardButtonVisible = true;
/*      */               } 
/*      */ 
/*      */               
/* 3490 */               if (!hideDisabledScrollButtons || backwardButton.isEnabled()) {
/* 3491 */                 int buttonHeight = (backwardButton.getPreferredSize()).height;
/* 3492 */                 if (trailingScrollButtons) {
/*      */                   
/* 3494 */                   backwardButton.setBounds(tx, y + h - buttonHeight, tw, buttonHeight);
/*      */                 } else {
/*      */                   
/* 3497 */                   backwardButton.setBounds(tx, y, tw, buttonHeight);
/* 3498 */                   y += buttonHeight;
/*      */                 } 
/* 3500 */                 h -= buttonHeight;
/* 3501 */                 backwardButtonVisible = true;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */           
/* 3506 */           FlatTabbedPaneUI.this.tabViewport.setBounds(tx, y, tw, h);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 3511 */       FlatTabbedPaneUI.this.tabViewport.setVisible((FlatTabbedPaneUI.this.rects.length > 0));
/* 3512 */       FlatTabbedPaneUI.this.moreTabsButton.setVisible(moreTabsButtonVisible);
/* 3513 */       backwardButton.setVisible(backwardButtonVisible);
/* 3514 */       forwardButton.setVisible(forwardButtonVisible);
/*      */       
/* 3516 */       FlatTabbedPaneUI.this.scrollBackwardButtonPrefSize = backwardButton.getPreferredSize();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class RunWithOriginalLayoutManagerDelegateAction
/*      */     implements Action
/*      */   {
/*      */     private final Action delegate;
/*      */ 
/*      */     
/*      */     static void install(ActionMap map, String key) {
/* 3528 */       Action oldAction = map.get(key);
/* 3529 */       if (oldAction == null || oldAction instanceof RunWithOriginalLayoutManagerDelegateAction) {
/*      */         return;
/*      */       }
/* 3532 */       map.put(key, new RunWithOriginalLayoutManagerDelegateAction(oldAction));
/*      */     }
/*      */     
/*      */     private RunWithOriginalLayoutManagerDelegateAction(Action delegate) {
/* 3536 */       this.delegate = delegate;
/*      */     }
/*      */ 
/*      */     
/*      */     public Object getValue(String key) {
/* 3541 */       return this.delegate.getValue(key);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEnabled() {
/* 3546 */       return this.delegate.isEnabled();
/*      */     }
/*      */     public void putValue(String key, Object value) {}
/*      */     public void setEnabled(boolean b) {}
/*      */     
/*      */     public void addPropertyChangeListener(PropertyChangeListener listener) {}
/*      */     
/*      */     public void removePropertyChangeListener(PropertyChangeListener listener) {}
/*      */     
/*      */     public void actionPerformed(ActionEvent e) {
/* 3556 */       JTabbedPane tabbedPane = (JTabbedPane)e.getSource();
/* 3557 */       ComponentUI ui = tabbedPane.getUI();
/* 3558 */       if (ui instanceof FlatTabbedPaneUI) {
/* 3559 */         ((FlatTabbedPaneUI)ui).runWithOriginalLayoutManager(() -> this.delegate.actionPerformed(e));
/*      */       }
/*      */       else {
/*      */         
/* 3563 */         this.delegate.actionPerformed(e);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class FlatSelectedTabRepainter
/*      */     implements PropertyChangeListener
/*      */   {
/*      */     private static FlatSelectedTabRepainter instance;
/*      */     
/*      */     private KeyboardFocusManager keyboardFocusManager;
/*      */     
/*      */     static void install() {
/* 3577 */       synchronized (FlatSelectedTabRepainter.class) {
/* 3578 */         if (instance != null) {
/*      */           return;
/*      */         }
/* 3581 */         instance = new FlatSelectedTabRepainter();
/*      */       } 
/*      */     }
/*      */     
/*      */     FlatSelectedTabRepainter() {
/* 3586 */       this.keyboardFocusManager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
/* 3587 */       this.keyboardFocusManager.addPropertyChangeListener(this);
/*      */     }
/*      */     
/*      */     private void uninstall() {
/* 3591 */       synchronized (FlatSelectedTabRepainter.class) {
/* 3592 */         if (instance == null) {
/*      */           return;
/*      */         }
/* 3595 */         this.keyboardFocusManager.removePropertyChangeListener(this);
/* 3596 */         this.keyboardFocusManager = null;
/* 3597 */         instance = null;
/*      */       } 
/*      */     }
/*      */     public void propertyChange(PropertyChangeEvent e) {
/*      */       Object oldValue;
/*      */       Object newValue;
/*      */       Component permanentFocusOwner;
/* 3604 */       if (!(UIManager.getLookAndFeel() instanceof FlatLaf)) {
/* 3605 */         uninstall();
/*      */         
/*      */         return;
/*      */       } 
/* 3609 */       switch (e.getPropertyName()) {
/*      */         case "permanentFocusOwner":
/* 3611 */           oldValue = e.getOldValue();
/* 3612 */           newValue = e.getNewValue();
/* 3613 */           if (oldValue instanceof Component)
/* 3614 */             repaintSelectedTabs((Component)oldValue); 
/* 3615 */           if (newValue instanceof Component) {
/* 3616 */             repaintSelectedTabs((Component)newValue);
/*      */           }
/*      */           break;
/*      */         case "activeWindow":
/* 3620 */           permanentFocusOwner = this.keyboardFocusManager.getPermanentFocusOwner();
/* 3621 */           if (permanentFocusOwner != null) {
/* 3622 */             repaintSelectedTabs(permanentFocusOwner);
/*      */           }
/*      */           break;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private void repaintSelectedTabs(Component c) {
/* 3633 */       EventQueue.invokeLater(() -> {
/*      */             if (!c.isDisplayable()) {
/*      */               return;
/*      */             }
/*      */             if (c instanceof JTabbedPane) {
/*      */               repaintSelectedTab((JTabbedPane)c);
/*      */             }
/*      */             Component c2 = c;
/*      */             while ((c2 = SwingUtilities.getAncestorOfClass(JTabbedPane.class, c2)) != null) {
/*      */               repaintSelectedTab((JTabbedPane)c2);
/*      */             }
/*      */           });
/*      */     }
/*      */     
/*      */     private void repaintSelectedTab(JTabbedPane tabbedPane) {
/* 3648 */       TabbedPaneUI ui = tabbedPane.getUI();
/* 3649 */       if (ui instanceof FlatTabbedPaneUI)
/* 3650 */         ((FlatTabbedPaneUI)ui).repaintTab(tabbedPane.getSelectedIndex()); 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTabbedPaneUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */