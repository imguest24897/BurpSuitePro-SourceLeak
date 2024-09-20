/*      */ package com.formdev.flatlaf.ui;
/*      */ 
/*      */ import com.formdev.flatlaf.FlatClientProperties;
/*      */ import com.formdev.flatlaf.util.SystemInfo;
/*      */ import com.formdev.flatlaf.util.UIScale;
/*      */ import java.awt.BorderLayout;
/*      */ import java.awt.Color;
/*      */ import java.awt.Component;
/*      */ import java.awt.Container;
/*      */ import java.awt.Dialog;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.Font;
/*      */ import java.awt.FontMetrics;
/*      */ import java.awt.Frame;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.GraphicsConfiguration;
/*      */ import java.awt.Image;
/*      */ import java.awt.Insets;
/*      */ import java.awt.Point;
/*      */ import java.awt.Rectangle;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.Window;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.ComponentEvent;
/*      */ import java.awt.event.ComponentListener;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.awt.event.MouseListener;
/*      */ import java.awt.event.MouseMotionListener;
/*      */ import java.awt.event.WindowAdapter;
/*      */ import java.awt.event.WindowEvent;
/*      */ import java.awt.geom.AffineTransform;
/*      */ import java.beans.PropertyChangeEvent;
/*      */ import java.beans.PropertyChangeListener;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import java.util.Objects;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.BoxLayout;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JComponent;
/*      */ import javax.swing.JInternalFrame;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JMenuBar;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JRootPane;
/*      */ import javax.swing.SwingUtilities;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.border.AbstractBorder;
/*      */ import javax.swing.border.Border;
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
/*      */ public class FlatTitlePane
/*      */   extends JComponent
/*      */ {
/*      */   private static final String KEY_DEBUG_SHOW_RECTANGLES = "FlatLaf.debug.titlebar.showRectangles";
/*      */   protected final Font titleFont;
/*      */   protected final Color activeBackground;
/*      */   protected final Color inactiveBackground;
/*      */   protected final Color activeForeground;
/*      */   protected final Color inactiveForeground;
/*      */   protected final Color embeddedForeground;
/*      */   protected final Color borderColor;
/*      */   protected final boolean showIcon;
/*      */   protected final boolean showIconInDialogs;
/*      */   protected final int noIconLeftGap;
/*      */   protected final Dimension iconSize;
/*      */   protected final int titleMinimumWidth;
/*      */   protected final int buttonMinimumWidth;
/*      */   protected final int buttonMaximizedHeight;
/*      */   protected final boolean centerTitle;
/*      */   protected final boolean centerTitleIfMenuBarEmbedded;
/*      */   protected final boolean showIconBesideTitle;
/*      */   protected final int menuBarTitleGap;
/*      */   protected final int menuBarTitleMinimumGap;
/*      */   protected final int menuBarResizeHeight;
/*      */   protected final JRootPane rootPane;
/*      */   protected final String windowStyle;
/*      */   protected JPanel leftPanel;
/*      */   protected JLabel iconLabel;
/*      */   protected JComponent menuBarPlaceholder;
/*      */   protected JLabel titleLabel;
/*      */   protected JPanel buttonPanel;
/*      */   protected JButton iconifyButton;
/*      */   protected JButton maximizeButton;
/*      */   protected JButton restoreButton;
/*      */   protected JButton closeButton;
/*      */   protected Window window;
/*      */   private final Handler handler;
/*      */   private int laterCounter;
/*      */   private int debugTitleBarHeight;
/*      */   private List<Rectangle> debugHitTestSpots;
/*      */   private Rectangle debugAppIconBounds;
/*      */   private Rectangle debugMinimizeButtonBounds;
/*      */   private Rectangle debugMaximizeButtonBounds;
/*      */   private Rectangle debugCloseButtonBounds;
/*      */   
/*      */   public FlatTitlePane(JRootPane rootPane) {
/*  154 */     this.rootPane = rootPane;
/*      */     
/*  156 */     Window w = SwingUtilities.getWindowAncestor(rootPane);
/*  157 */     String defaultWindowStyle = (w != null && w.getType() == Window.Type.UTILITY) ? "small" : null;
/*  158 */     this.windowStyle = (String)FlatClientProperties.clientProperty(rootPane, "Window.style", defaultWindowStyle, String.class);
/*      */     
/*  160 */     this.titleFont = FlatUIUtils.getSubUIFont("TitlePane.font", this.windowStyle);
/*  161 */     this.activeBackground = FlatUIUtils.getSubUIColor("TitlePane.background", this.windowStyle);
/*  162 */     this.inactiveBackground = FlatUIUtils.getSubUIColor("TitlePane.inactiveBackground", this.windowStyle);
/*  163 */     this.activeForeground = FlatUIUtils.getSubUIColor("TitlePane.foreground", this.windowStyle);
/*  164 */     this.inactiveForeground = FlatUIUtils.getSubUIColor("TitlePane.inactiveForeground", this.windowStyle);
/*  165 */     this.embeddedForeground = FlatUIUtils.getSubUIColor("TitlePane.embeddedForeground", this.windowStyle);
/*      */     
/*  167 */     this.borderColor = UIManager.getColor("TitlePane.borderColor");
/*      */     
/*  169 */     this.showIcon = FlatUIUtils.getSubUIBoolean("TitlePane.showIcon", this.windowStyle, true);
/*  170 */     this.showIconInDialogs = FlatUIUtils.getSubUIBoolean("TitlePane.showIconInDialogs", this.windowStyle, true);
/*  171 */     this.noIconLeftGap = FlatUIUtils.getSubUIInt("TitlePane.noIconLeftGap", this.windowStyle, 8);
/*  172 */     this.iconSize = FlatUIUtils.getSubUIDimension("TitlePane.iconSize", this.windowStyle);
/*  173 */     this.titleMinimumWidth = FlatUIUtils.getSubUIInt("TitlePane.titleMinimumWidth", this.windowStyle, 60);
/*  174 */     this.buttonMinimumWidth = FlatUIUtils.getSubUIInt("TitlePane.buttonMinimumWidth", this.windowStyle, 30);
/*  175 */     this.buttonMaximizedHeight = FlatUIUtils.getSubUIInt("TitlePane.buttonMaximizedHeight", this.windowStyle, 0);
/*  176 */     this.centerTitle = FlatUIUtils.getSubUIBoolean("TitlePane.centerTitle", this.windowStyle, false);
/*  177 */     this.centerTitleIfMenuBarEmbedded = FlatUIUtils.getSubUIBoolean("TitlePane.centerTitleIfMenuBarEmbedded", this.windowStyle, true);
/*  178 */     this.showIconBesideTitle = FlatUIUtils.getSubUIBoolean("TitlePane.showIconBesideTitle", this.windowStyle, false);
/*  179 */     this.menuBarTitleGap = FlatUIUtils.getSubUIInt("TitlePane.menuBarTitleGap", this.windowStyle, 40);
/*  180 */     this.menuBarTitleMinimumGap = FlatUIUtils.getSubUIInt("TitlePane.menuBarTitleMinimumGap", this.windowStyle, 12);
/*  181 */     this.menuBarResizeHeight = FlatUIUtils.getSubUIInt("TitlePane.menuBarResizeHeight", this.windowStyle, 4);
/*      */ 
/*      */     
/*  184 */     this.handler = createHandler();
/*  185 */     setBorder(createTitlePaneBorder());
/*      */     
/*  187 */     addSubComponents();
/*  188 */     activeChanged(true);
/*      */     
/*  190 */     addMouseListener(this.handler);
/*  191 */     addMouseMotionListener(this.handler);
/*      */ 
/*      */     
/*  194 */     this.iconLabel.addMouseListener(this.handler);
/*      */     
/*  196 */     applyComponentOrientation(rootPane.getComponentOrientation());
/*      */   }
/*      */   
/*      */   protected FlatTitlePaneBorder createTitlePaneBorder() {
/*  200 */     return new FlatTitlePaneBorder();
/*      */   }
/*      */   
/*      */   protected Handler createHandler() {
/*  204 */     return new Handler();
/*      */   }
/*      */   
/*      */   protected void addSubComponents() {
/*  208 */     this.leftPanel = new JPanel();
/*  209 */     this.iconLabel = new JLabel();
/*  210 */     this.titleLabel = new JLabel()
/*      */       {
/*      */         public void updateUI() {
/*  213 */           setUI(new FlatTitlePane.FlatTitleLabelUI());
/*      */         }
/*      */       };
/*  216 */     this.iconLabel.setBorder(new FlatEmptyBorder(FlatUIUtils.getSubUIInsets("TitlePane.iconMargins", this.windowStyle)));
/*  217 */     this.titleLabel.setBorder(new FlatEmptyBorder(FlatUIUtils.getSubUIInsets("TitlePane.titleMargins", this.windowStyle)));
/*      */     
/*  219 */     this.leftPanel.setLayout(new BoxLayout(this.leftPanel, 2));
/*  220 */     this.leftPanel.setOpaque(false);
/*  221 */     this.leftPanel.add(this.iconLabel);
/*      */     
/*  223 */     this.menuBarPlaceholder = new JComponent()
/*      */       {
/*      */         public Dimension getPreferredSize() {
/*  226 */           JMenuBar menuBar = FlatTitlePane.this.rootPane.getJMenuBar();
/*  227 */           return FlatTitlePane.this.hasVisibleEmbeddedMenuBar(menuBar) ? menuBar.getPreferredSize() : new Dimension();
/*      */         }
/*      */       };
/*  230 */     this.leftPanel.add(this.menuBarPlaceholder);
/*      */     
/*  232 */     createButtons();
/*      */     
/*  234 */     setLayout(new BorderLayout()
/*      */         {
/*      */           public void layoutContainer(Container target)
/*      */           {
/*  238 */             Insets insets = target.getInsets();
/*  239 */             int x = insets.left;
/*  240 */             int y = insets.top;
/*  241 */             int w = target.getWidth() - insets.left - insets.right;
/*  242 */             int h = target.getHeight() - insets.top - insets.bottom;
/*      */ 
/*      */             
/*  245 */             int leftWidth = (FlatTitlePane.this.leftPanel.getPreferredSize()).width;
/*  246 */             int buttonsWidth = (FlatTitlePane.this.buttonPanel.getPreferredSize()).width;
/*  247 */             int titleWidth = w - leftWidth - buttonsWidth;
/*  248 */             int minTitleWidth = UIScale.scale(FlatTitlePane.this.titleMinimumWidth);
/*      */ 
/*      */             
/*  251 */             Icon icon = FlatTitlePane.this.titleLabel.getIcon();
/*  252 */             if (icon != null) {
/*  253 */               Insets iconInsets = FlatTitlePane.this.iconLabel.getInsets();
/*  254 */               int iconTextGap = FlatTitlePane.this.titleLabel.getComponentOrientation().isLeftToRight() ? iconInsets.right : iconInsets.left;
/*  255 */               minTitleWidth += icon.getIconWidth() + iconTextGap;
/*      */             } 
/*      */ 
/*      */             
/*  259 */             if (titleWidth < minTitleWidth) {
/*  260 */               buttonsWidth = Math.max(buttonsWidth - minTitleWidth - titleWidth, (FlatTitlePane.this.buttonPanel.getMinimumSize()).width);
/*  261 */               titleWidth = w - leftWidth - buttonsWidth;
/*      */             } 
/*      */ 
/*      */             
/*  265 */             if (titleWidth < minTitleWidth) {
/*      */ 
/*      */               
/*  268 */               int minLeftWidth = FlatTitlePane.this.iconLabel.isVisible() ? (FlatTitlePane.this.iconLabel.getWidth() - (FlatTitlePane.this.iconLabel.getInsets()).right) : UIScale.scale(FlatTitlePane.this.noIconLeftGap);
/*  269 */               leftWidth = Math.max(leftWidth - minTitleWidth - titleWidth, minLeftWidth);
/*  270 */               titleWidth = w - leftWidth - buttonsWidth;
/*      */             } 
/*      */             
/*  273 */             if (target.getComponentOrientation().isLeftToRight()) {
/*      */               
/*  275 */               FlatTitlePane.this.leftPanel.setBounds(x, y, leftWidth, h);
/*  276 */               FlatTitlePane.this.titleLabel.setBounds(x + leftWidth, y, titleWidth, h);
/*  277 */               FlatTitlePane.this.buttonPanel.setBounds(x + leftWidth + titleWidth, y, buttonsWidth, h);
/*      */             } else {
/*      */               
/*  280 */               FlatTitlePane.this.buttonPanel.setBounds(x, y, buttonsWidth, h);
/*  281 */               FlatTitlePane.this.titleLabel.setBounds(x + buttonsWidth, y, titleWidth, h);
/*  282 */               FlatTitlePane.this.leftPanel.setBounds(x + buttonsWidth + titleWidth, y, leftWidth, h);
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  289 */             JMenuBar menuBar = FlatTitlePane.this.rootPane.getJMenuBar();
/*  290 */             if (FlatTitlePane.this.hasVisibleEmbeddedMenuBar(menuBar)) {
/*  291 */               Component horizontalGlue = FlatTitlePane.this.findHorizontalGlue(menuBar);
/*  292 */               if (horizontalGlue != null) {
/*  293 */                 Point glueLocation = SwingUtilities.convertPoint(horizontalGlue, 0, 0, FlatTitlePane.this.titleLabel);
/*  294 */                 FlatTitlePane.this.titleLabel.setBounds(FlatTitlePane.this.titleLabel.getX() + glueLocation.x, FlatTitlePane.this.titleLabel.getY(), horizontalGlue
/*  295 */                     .getWidth(), FlatTitlePane.this.titleLabel.getHeight());
/*      */               } 
/*      */             } 
/*      */           }
/*      */         });
/*      */     
/*  301 */     add(this.leftPanel, "Before");
/*  302 */     add(this.titleLabel, "Center");
/*  303 */     add(this.buttonPanel, "After");
/*      */   }
/*      */   
/*      */   protected void createButtons() {
/*  307 */     this.iconifyButton = createButton("TitlePane.iconifyIcon", "Iconify", e -> iconify());
/*  308 */     this.maximizeButton = createButton("TitlePane.maximizeIcon", "Maximize", e -> maximize());
/*  309 */     this.restoreButton = createButton("TitlePane.restoreIcon", "Restore", e -> restore());
/*  310 */     this.closeButton = createButton("TitlePane.closeIcon", "Close", e -> close());
/*      */ 
/*      */     
/*  313 */     this.iconifyButton.setVisible(false);
/*  314 */     this.maximizeButton.setVisible(false);
/*  315 */     this.restoreButton.setVisible(false);
/*      */     
/*  317 */     this.buttonPanel = new JPanel()
/*      */       {
/*      */         public Dimension getPreferredSize() {
/*  320 */           Dimension size = super.getPreferredSize();
/*  321 */           if (FlatTitlePane.this.buttonMaximizedHeight > 0 && FlatTitlePane.this.isWindowMaximized() && !FlatTitlePane.this.hasVisibleEmbeddedMenuBar(FlatTitlePane.this.rootPane.getJMenuBar()))
/*      */           {
/*  323 */             size = new Dimension(size.width, Math.min(size.height, UIScale.scale(FlatTitlePane.this.buttonMaximizedHeight)));
/*      */           }
/*  325 */           return size;
/*      */         }
/*      */       };
/*  328 */     this.buttonPanel.setOpaque(false);
/*  329 */     this.buttonPanel.setLayout(new BoxLayout(this.buttonPanel, 2));
/*  330 */     if (this.rootPane.getWindowDecorationStyle() == 1) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  336 */       this.buttonPanel.add(this.iconifyButton);
/*  337 */       this.buttonPanel.add(this.maximizeButton);
/*  338 */       this.buttonPanel.add(this.restoreButton);
/*      */     } 
/*  340 */     this.buttonPanel.add(this.closeButton);
/*      */   }
/*      */   
/*      */   protected JButton createButton(String iconKey, String accessibleName, ActionListener action) {
/*  344 */     JButton button = new JButton(FlatUIUtils.getSubUIIcon(iconKey, this.windowStyle))
/*      */       {
/*      */         public Dimension getMinimumSize()
/*      */         {
/*  348 */           return new Dimension(UIScale.scale(FlatTitlePane.this.buttonMinimumWidth), (super.getMinimumSize()).height);
/*      */         }
/*      */       };
/*  351 */     button.setFocusable(false);
/*  352 */     button.setContentAreaFilled(false);
/*  353 */     button.setBorder(BorderFactory.createEmptyBorder());
/*  354 */     button.putClientProperty("AccessibleName", accessibleName);
/*  355 */     button.addActionListener(action);
/*  356 */     return button;
/*      */   }
/*      */   
/*      */   protected void activeChanged(boolean active) {
/*  360 */     Color background = FlatClientProperties.clientPropertyColor(this.rootPane, "JRootPane.titleBarBackground", null);
/*  361 */     Color foreground = FlatClientProperties.clientPropertyColor(this.rootPane, "JRootPane.titleBarForeground", null);
/*  362 */     Color titleForeground = foreground;
/*  363 */     if (background == null)
/*  364 */       background = FlatUIUtils.nonUIResource(active ? this.activeBackground : this.inactiveBackground); 
/*  365 */     if (foreground == null) {
/*  366 */       foreground = FlatUIUtils.nonUIResource(active ? this.activeForeground : this.inactiveForeground);
/*      */ 
/*      */       
/*  369 */       titleForeground = (active && hasVisibleEmbeddedMenuBar(this.rootPane.getJMenuBar())) ? FlatUIUtils.nonUIResource(this.embeddedForeground) : foreground;
/*      */     } 
/*      */     
/*  372 */     setBackground(background);
/*  373 */     this.titleLabel.setForeground(titleForeground);
/*  374 */     this.iconifyButton.setForeground(foreground);
/*  375 */     this.maximizeButton.setForeground(foreground);
/*  376 */     this.restoreButton.setForeground(foreground);
/*  377 */     this.closeButton.setForeground(foreground);
/*      */ 
/*      */     
/*  380 */     this.iconifyButton.setBackground(background);
/*  381 */     this.maximizeButton.setBackground(background);
/*  382 */     this.restoreButton.setBackground(background);
/*  383 */     this.closeButton.setBackground(background);
/*      */   }
/*      */   
/*      */   protected void frameStateChanged() {
/*  387 */     if (this.window == null || this.rootPane.getWindowDecorationStyle() != 1) {
/*      */       return;
/*      */     }
/*  390 */     updateVisibility();
/*      */     
/*  392 */     if (this.window instanceof Frame) {
/*  393 */       Frame frame = (Frame)this.window;
/*      */       
/*  395 */       if (isWindowMaximized() && (!SystemInfo.isLinux || 
/*  396 */         !FlatNativeLinuxLibrary.isWMUtilsSupported(this.window)) && this.rootPane
/*  397 */         .getClientProperty("_flatlaf.maximizedBoundsUpToDate") == null) {
/*      */         
/*  399 */         this.rootPane.putClientProperty("_flatlaf.maximizedBoundsUpToDate", (Object)null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  406 */         Rectangle oldMaximizedBounds = frame.getMaximizedBounds();
/*  407 */         updateMaximizedBounds();
/*  408 */         Rectangle newMaximizedBounds = frame.getMaximizedBounds();
/*  409 */         if (newMaximizedBounds != null && !newMaximizedBounds.equals(oldMaximizedBounds)) {
/*  410 */           int oldExtendedState = frame.getExtendedState();
/*  411 */           frame.setExtendedState(oldExtendedState & 0xFFFFFFF9);
/*  412 */           frame.setExtendedState(oldExtendedState);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   protected void updateVisibility() {
/*  420 */     this.titleLabel.setVisible(FlatClientProperties.clientPropertyBoolean(this.rootPane, "JRootPane.titleBarShowTitle", true));
/*  421 */     this.closeButton.setVisible(FlatClientProperties.clientPropertyBoolean(this.rootPane, "JRootPane.titleBarShowClose", true));
/*      */     
/*  423 */     if (this.window instanceof Frame) {
/*  424 */       Frame frame = (Frame)this.window;
/*  425 */       boolean maximizable = (frame.isResizable() && FlatClientProperties.clientPropertyBoolean(this.rootPane, "JRootPane.titleBarShowMaximize", true));
/*  426 */       boolean maximized = isWindowMaximized();
/*      */       
/*  428 */       this.iconifyButton.setVisible(FlatClientProperties.clientPropertyBoolean(this.rootPane, "JRootPane.titleBarShowIconify", true));
/*  429 */       this.maximizeButton.setVisible((maximizable && !maximized));
/*  430 */       this.restoreButton.setVisible((maximizable && maximized));
/*      */     } else {
/*      */       
/*  433 */       this.iconifyButton.setVisible(false);
/*  434 */       this.maximizeButton.setVisible(false);
/*  435 */       this.restoreButton.setVisible(false);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void updateIcon() {
/*  440 */     boolean defaultShowIcon = this.showIcon;
/*  441 */     if (!this.showIconInDialogs && this.rootPane.getParent() instanceof javax.swing.JDialog) {
/*  442 */       defaultShowIcon = false;
/*      */     }
/*      */     
/*  445 */     List<Image> images = null;
/*  446 */     if (FlatClientProperties.clientPropertyBoolean(this.rootPane, "JRootPane.titleBarShowIcon", defaultShowIcon)) {
/*  447 */       images = this.window.getIconImages();
/*  448 */       if (images.isEmpty())
/*      */       {
/*  450 */         for (Window owner = this.window.getOwner(); owner != null; owner = owner.getOwner()) {
/*  451 */           images = owner.getIconImages();
/*  452 */           if (!images.isEmpty()) {
/*      */             break;
/*      */           }
/*      */         } 
/*      */       }
/*      */     } 
/*  458 */     boolean hasIcon = (images != null && !images.isEmpty());
/*      */ 
/*      */     
/*  461 */     this.iconLabel.setIcon((hasIcon && !this.showIconBesideTitle) ? (Icon)new FlatTitlePaneIcon(images, this.iconSize) : null);
/*  462 */     this.titleLabel.setIcon((hasIcon && this.showIconBesideTitle) ? (Icon)new FlatTitlePaneIcon(images, this.iconSize) : null);
/*      */ 
/*      */     
/*  465 */     this.iconLabel.setVisible((hasIcon && !this.showIconBesideTitle));
/*  466 */     this.leftPanel.setBorder((hasIcon && !this.showIconBesideTitle) ? null : FlatUIUtils.nonUIResource(new FlatEmptyBorder(0, this.noIconLeftGap, 0, 0)));
/*      */     
/*  468 */     updateNativeTitleBarHeightAndHitTestSpotsLater();
/*      */   }
/*      */ 
/*      */   
/*      */   public void addNotify() {
/*  473 */     super.addNotify();
/*      */     
/*  475 */     uninstallWindowListeners();
/*      */     
/*  477 */     this.window = SwingUtilities.getWindowAncestor(this);
/*  478 */     if (this.window != null) {
/*  479 */       frameStateChanged();
/*  480 */       activeChanged(this.window.isActive());
/*  481 */       updateIcon();
/*  482 */       this.titleLabel.setText(getWindowTitle());
/*  483 */       installWindowListeners();
/*      */     } 
/*      */     
/*  486 */     updateNativeTitleBarHeightAndHitTestSpotsLater();
/*      */   }
/*      */ 
/*      */   
/*      */   public void removeNotify() {
/*  491 */     super.removeNotify();
/*      */     
/*  493 */     uninstallWindowListeners();
/*  494 */     this.window = null;
/*      */   }
/*      */   
/*      */   protected String getWindowTitle() {
/*  498 */     if (this.window instanceof Frame)
/*  499 */       return ((Frame)this.window).getTitle(); 
/*  500 */     if (this.window instanceof Dialog)
/*  501 */       return ((Dialog)this.window).getTitle(); 
/*  502 */     return null;
/*      */   }
/*      */   
/*      */   protected void installWindowListeners() {
/*  506 */     if (this.window == null) {
/*      */       return;
/*      */     }
/*  509 */     this.window.addPropertyChangeListener(this.handler);
/*  510 */     this.window.addWindowListener(this.handler);
/*  511 */     this.window.addWindowStateListener(this.handler);
/*  512 */     this.window.addComponentListener(this.handler);
/*      */   }
/*      */   
/*      */   protected void uninstallWindowListeners() {
/*  516 */     if (this.window == null) {
/*      */       return;
/*      */     }
/*  519 */     this.window.removePropertyChangeListener(this.handler);
/*  520 */     this.window.removeWindowListener(this.handler);
/*  521 */     this.window.removeWindowStateListener(this.handler);
/*  522 */     this.window.removeComponentListener(this.handler);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean hasVisibleEmbeddedMenuBar(JMenuBar menuBar) {
/*  529 */     return (menuBar != null && menuBar.isVisible() && isMenuBarEmbedded());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean isMenuBarEmbedded() {
/*  537 */     return FlatUIUtils.getBoolean(this.rootPane, "flatlaf.menuBarEmbedded", "JRootPane.menuBarEmbedded", "TitlePane.menuBarEmbedded", false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Rectangle getMenuBarBounds() {
/*  545 */     Insets insets = this.rootPane.getInsets();
/*      */ 
/*      */     
/*  548 */     Rectangle bounds = new Rectangle(SwingUtilities.convertPoint(this.menuBarPlaceholder, -insets.left, -insets.top, this.rootPane), this.menuBarPlaceholder.getSize());
/*      */ 
/*      */ 
/*      */     
/*  552 */     Insets borderInsets = getBorder().getBorderInsets(this);
/*  553 */     bounds.height += borderInsets.bottom;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  560 */     Component horizontalGlue = findHorizontalGlue(this.rootPane.getJMenuBar());
/*  561 */     if (horizontalGlue != null) {
/*  562 */       boolean leftToRight = getComponentOrientation().isLeftToRight();
/*      */ 
/*      */       
/*  565 */       int titleWidth = leftToRight ? (this.buttonPanel.getX() - this.leftPanel.getX() + this.leftPanel.getWidth()) : (this.leftPanel.getX() - this.buttonPanel.getX() + this.buttonPanel.getWidth());
/*  566 */       titleWidth = Math.max(titleWidth, 0);
/*  567 */       bounds.width += titleWidth;
/*  568 */       if (!leftToRight) {
/*  569 */         bounds.x -= titleWidth;
/*      */       }
/*      */     } 
/*  572 */     return bounds;
/*      */   }
/*      */   
/*      */   protected Component findHorizontalGlue(JMenuBar menuBar) {
/*  576 */     if (menuBar == null) {
/*  577 */       return null;
/*      */     }
/*  579 */     int count = menuBar.getComponentCount();
/*  580 */     for (int i = count - 1; i >= 0; i--) {
/*  581 */       Component c = menuBar.getComponent(i);
/*  582 */       if (c instanceof javax.swing.Box.Filler && (c.getMaximumSize()).width >= 32767)
/*  583 */         return c; 
/*      */     } 
/*  585 */     return null;
/*      */   }
/*      */   
/*      */   protected void titleBarColorsChanged() {
/*  589 */     activeChanged((this.window == null || this.window.isActive()));
/*  590 */     repaint();
/*      */   }
/*      */   
/*      */   protected void menuBarChanged() {
/*  594 */     this.menuBarPlaceholder.invalidate();
/*      */ 
/*      */ 
/*      */     
/*  598 */     repaint();
/*      */ 
/*      */     
/*  601 */     EventQueue.invokeLater(() -> activeChanged(
/*  602 */           (this.window == null || this.window.isActive())));
/*      */   }
/*      */ 
/*      */   
/*      */   protected void menuBarLayouted() {
/*  607 */     updateNativeTitleBarHeightAndHitTestSpotsLater();
/*  608 */     doLayout();
/*      */   }
/*      */ 
/*      */   
/*      */   public void paint(Graphics g) {
/*  613 */     super.paint(g);
/*      */     
/*  615 */     if (!UIManager.getBoolean("FlatLaf.debug.titlebar.showRectangles")) {
/*      */       return;
/*      */     }
/*  618 */     if (this.debugTitleBarHeight > 0) {
/*  619 */       g.setColor(Color.green);
/*  620 */       g.drawLine(0, this.debugTitleBarHeight, getWidth(), this.debugTitleBarHeight);
/*      */     } 
/*  622 */     if (this.debugHitTestSpots != null)
/*  623 */       for (Rectangle r : this.debugHitTestSpots) {
/*  624 */         paintRect(g, Color.red, r);
/*      */       } 
/*  626 */     paintRect(g, Color.cyan, this.debugCloseButtonBounds);
/*  627 */     paintRect(g, Color.blue, this.debugAppIconBounds);
/*  628 */     paintRect(g, Color.blue, this.debugMinimizeButtonBounds);
/*  629 */     paintRect(g, Color.magenta, this.debugMaximizeButtonBounds);
/*  630 */     paintRect(g, Color.cyan, this.debugCloseButtonBounds);
/*      */   }
/*      */   
/*      */   private void paintRect(Graphics g, Color color, Rectangle r) {
/*  634 */     if (r == null) {
/*      */       return;
/*      */     }
/*  637 */     g.setColor(color);
/*  638 */     Point offset = SwingUtilities.convertPoint(this, 0, 0, this.window);
/*  639 */     g.drawRect(r.x - offset.x, r.y - offset.y, r.width - 1, r.height - 1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void paintComponent(Graphics g) {
/*  645 */     g.setColor((UIManager.getBoolean("TitlePane.unifiedBackground") && 
/*  646 */         FlatClientProperties.clientPropertyColor(this.rootPane, "JRootPane.titleBarBackground", null) == null) ? 
/*  647 */         FlatUIUtils.getParentBackground(this) : 
/*  648 */         getBackground());
/*  649 */     g.fillRect(0, 0, getWidth(), getHeight());
/*      */   }
/*      */   
/*      */   protected void repaintWindowBorder() {
/*  653 */     int width = this.rootPane.getWidth();
/*  654 */     int height = this.rootPane.getHeight();
/*  655 */     Insets insets = this.rootPane.getInsets();
/*  656 */     this.rootPane.repaint(0, 0, width, insets.top);
/*  657 */     this.rootPane.repaint(0, 0, insets.left, height);
/*  658 */     this.rootPane.repaint(0, height - insets.bottom, width, insets.bottom);
/*  659 */     this.rootPane.repaint(width - insets.right, 0, insets.right, height);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void iconify() {
/*  666 */     if (!(this.window instanceof Frame)) {
/*      */       return;
/*      */     }
/*  669 */     Frame frame = (Frame)this.window;
/*  670 */     if (!FlatNativeWindowBorder.showWindow(this.window, 6)) {
/*  671 */       frame.setExtendedState(frame.getExtendedState() | 0x1);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean isWindowMaximized() {
/*  679 */     return (this.window instanceof Frame && (((Frame)this.window).getExtendedState() & 0x6) == 6);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void maximize() {
/*  686 */     if (!(this.window instanceof Frame)) {
/*      */       return;
/*      */     }
/*  689 */     Frame frame = (Frame)this.window;
/*      */     
/*  691 */     updateMaximizedBounds();
/*      */ 
/*      */     
/*  694 */     this.rootPane.putClientProperty("_flatlaf.maximizedBoundsUpToDate", Boolean.valueOf(true));
/*      */ 
/*      */     
/*  697 */     if (!FlatNativeWindowBorder.showWindow(frame, 3)) {
/*  698 */       int oldState = frame.getExtendedState();
/*  699 */       int newState = oldState | 0x6;
/*      */       
/*  701 */       if (SystemInfo.isLinux)
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
/*      */ 
/*      */ 
/*      */         
/*  715 */         if ((oldState & 0x6) == 4) {
/*  716 */           newState = oldState & 0xFFFFFFF9 | 0x2;
/*      */         }
/*      */       }
/*  719 */       frame.setExtendedState(newState);
/*      */     } 
/*      */   }
/*      */   
/*      */   protected void updateMaximizedBounds() {
/*  724 */     Frame frame = (Frame)this.window;
/*      */ 
/*      */ 
/*      */     
/*  728 */     Rectangle oldMaximizedBounds = frame.getMaximizedBounds();
/*  729 */     if (!hasNativeCustomDecoration() && (oldMaximizedBounds == null || 
/*      */       
/*  731 */       Objects.equals(oldMaximizedBounds, this.rootPane.getClientProperty("_flatlaf.maximizedBounds")))) {
/*      */       
/*  733 */       GraphicsConfiguration gc = this.window.getGraphicsConfiguration();
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
/*  745 */       Rectangle screenBounds = gc.getBounds();
/*      */       
/*  747 */       int maximizedX = screenBounds.x;
/*  748 */       int maximizedY = screenBounds.y;
/*  749 */       int maximizedWidth = screenBounds.width;
/*  750 */       int maximizedHeight = screenBounds.height;
/*      */       
/*  752 */       if (SystemInfo.isWindows && !isMaximizedBoundsFixed()) {
/*      */         
/*  754 */         maximizedX = 0;
/*  755 */         maximizedY = 0;
/*      */ 
/*      */         
/*  758 */         AffineTransform defaultTransform = gc.getDefaultTransform();
/*  759 */         maximizedWidth = (int)(maximizedWidth * defaultTransform.getScaleX());
/*  760 */         maximizedHeight = (int)(maximizedHeight * defaultTransform.getScaleY());
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  766 */       Insets screenInsets = this.window.getToolkit().getScreenInsets(gc);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  772 */       Rectangle newMaximizedBounds = new Rectangle(maximizedX + screenInsets.left, maximizedY + screenInsets.top, maximizedWidth - screenInsets.left - screenInsets.right, maximizedHeight - screenInsets.top - screenInsets.bottom);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  778 */       if (!Objects.equals(oldMaximizedBounds, newMaximizedBounds)) {
/*      */         
/*  780 */         frame.setMaximizedBounds(newMaximizedBounds);
/*      */ 
/*      */ 
/*      */         
/*  784 */         this.rootPane.putClientProperty("_flatlaf.maximizedBounds", newMaximizedBounds);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isMaximizedBoundsFixed() {
/*  797 */     return (SystemInfo.isJava_15_orLater || (SystemInfo.javaVersion >= 
/*  798 */       SystemInfo.toVersion(11, 0, 8, 0) && SystemInfo.javaVersion < 
/*  799 */       SystemInfo.toVersion(12, 0, 0, 0)) || (SystemInfo.javaVersion >= 
/*  800 */       SystemInfo.toVersion(13, 0, 4, 0) && SystemInfo.javaVersion < 
/*  801 */       SystemInfo.toVersion(14, 0, 0, 0)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void restore() {
/*  808 */     if (!(this.window instanceof Frame)) {
/*      */       return;
/*      */     }
/*  811 */     Frame frame = (Frame)this.window;
/*  812 */     if (!FlatNativeWindowBorder.showWindow(this.window, 9)) {
/*  813 */       int state = frame.getExtendedState();
/*  814 */       frame.setExtendedState(((state & 0x1) != 0) ? (
/*  815 */           state & 0xFFFFFFFE) : (
/*  816 */           state & 0xFFFFFFF9));
/*      */     } 
/*      */   }
/*      */   
/*      */   private void maximizeOrRestore() {
/*  821 */     if (!(this.window instanceof Frame) || !((Frame)this.window).isResizable()) {
/*      */       return;
/*      */     }
/*  824 */     if (isWindowMaximized()) {
/*  825 */       restore();
/*      */     } else {
/*  827 */       maximize();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected void close() {
/*  834 */     if (this.window != null)
/*  835 */       this.window.dispatchEvent(new WindowEvent(this.window, 201)); 
/*      */   }
/*      */   
/*      */   private boolean hasJBRCustomDecoration() {
/*  839 */     return (this.window != null && JBRCustomDecorations.hasCustomDecoration(this.window));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean hasNativeCustomDecoration() {
/*  846 */     return (this.window != null && FlatNativeWindowBorder.hasCustomDecoration(this.window));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void updateNativeTitleBarHeightAndHitTestSpotsLater() {
/*  853 */     this.laterCounter++;
/*  854 */     EventQueue.invokeLater(() -> {
/*      */           this.laterCounter--;
/*      */           if (this.laterCounter == 0)
/*      */             updateNativeTitleBarHeightAndHitTestSpots(); 
/*      */         });
/*      */   }
/*      */   
/*      */   protected void updateNativeTitleBarHeightAndHitTestSpots() {
/*  862 */     if (!isDisplayable()) {
/*      */       return;
/*      */     }
/*  865 */     if (!hasNativeCustomDecoration()) {
/*      */       return;
/*      */     }
/*  868 */     int titleBarHeight = getHeight();
/*      */     
/*  870 */     if (titleBarHeight > 0) {
/*  871 */       titleBarHeight--;
/*      */     }
/*  873 */     List<Rectangle> hitTestSpots = new ArrayList<>();
/*  874 */     Rectangle appIconBounds = null;
/*      */     
/*  876 */     if (!this.showIconBesideTitle && this.iconLabel.isVisible()) {
/*      */       
/*  878 */       Point location = SwingUtilities.convertPoint(this.iconLabel, 0, 0, this.window);
/*  879 */       Insets iconInsets = this.iconLabel.getInsets();
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  884 */       Rectangle iconBounds = new Rectangle(location.x + iconInsets.left - 1, location.y + iconInsets.top - 1, this.iconLabel.getWidth() - iconInsets.left - iconInsets.right + 2, this.iconLabel.getHeight() - iconInsets.top - iconInsets.bottom + 2);
/*      */ 
/*      */ 
/*      */       
/*  888 */       if (isWindowMaximized()) {
/*  889 */         iconBounds.height += iconBounds.y;
/*  890 */         iconBounds.y = 0;
/*      */         
/*  892 */         if (this.window.getComponentOrientation().isLeftToRight()) {
/*  893 */           iconBounds.width += iconBounds.x;
/*  894 */           iconBounds.x = 0;
/*      */         } else {
/*  896 */           iconBounds.width += iconInsets.right;
/*      */         } 
/*      */       } 
/*  899 */       if (hasJBRCustomDecoration())
/*  900 */       { hitTestSpots.add(iconBounds); }
/*      */       else
/*  902 */       { appIconBounds = iconBounds; } 
/*  903 */     } else if (this.showIconBesideTitle && this.titleLabel.getIcon() != null && this.titleLabel.getUI() instanceof FlatTitleLabelUI) {
/*  904 */       FlatTitleLabelUI ui = (FlatTitleLabelUI)this.titleLabel.getUI();
/*      */ 
/*      */       
/*  907 */       Insets insets = this.titleLabel.getInsets();
/*      */ 
/*      */       
/*  910 */       Rectangle viewR = new Rectangle(insets.left, insets.top, this.titleLabel.getWidth() - insets.left - insets.right, this.titleLabel.getHeight() - insets.top - insets.bottom);
/*  911 */       Rectangle iconR = new Rectangle();
/*  912 */       Rectangle textR = new Rectangle();
/*  913 */       ui.layoutCL(this.titleLabel, this.titleLabel.getFontMetrics(this.titleLabel.getFont()), this.titleLabel
/*  914 */           .getText(), this.titleLabel.getIcon(), viewR, iconR, textR);
/*      */ 
/*      */ 
/*      */       
/*  918 */       if (iconR.x == 0) {
/*      */         
/*  920 */         Point location = SwingUtilities.convertPoint(this.titleLabel, 0, 0, this.window);
/*  921 */         iconR.x += location.x;
/*  922 */         iconR.y += location.y;
/*      */ 
/*      */         
/*  925 */         iconR.x--;
/*  926 */         iconR.y--;
/*  927 */         iconR.width += 2;
/*  928 */         iconR.height += 2;
/*      */         
/*  930 */         if (hasJBRCustomDecoration()) {
/*  931 */           hitTestSpots.add(iconR);
/*      */         } else {
/*  933 */           appIconBounds = iconR;
/*      */         } 
/*      */       } 
/*      */     } 
/*  937 */     Rectangle r = getNativeHitTestSpot(this.buttonPanel);
/*  938 */     if (r != null) {
/*  939 */       hitTestSpots.add(r);
/*      */     }
/*  941 */     JMenuBar menuBar = this.rootPane.getJMenuBar();
/*  942 */     if (hasVisibleEmbeddedMenuBar(menuBar)) {
/*  943 */       r = getNativeHitTestSpot(menuBar);
/*  944 */       if (r != null) {
/*      */ 
/*      */         
/*  947 */         if (this.window instanceof Frame && ((Frame)this.window).isResizable() && !isWindowMaximized()) {
/*      */           
/*  949 */           int resizeHeight = UIScale.scale(Math.min(this.menuBarResizeHeight, 8));
/*  950 */           r.y += resizeHeight;
/*  951 */           r.height -= resizeHeight;
/*      */         } 
/*      */         
/*  954 */         int count = menuBar.getComponentCount();
/*  955 */         for (int i = count - 1; i >= 0; i--) {
/*  956 */           Component c = menuBar.getComponent(i);
/*  957 */           if (c instanceof javax.swing.Box.Filler || (c instanceof JComponent && 
/*  958 */             FlatClientProperties.clientPropertyBoolean((JComponent)c, "JComponent.titleBarCaption", false))) {
/*      */             Rectangle r2;
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  964 */             Point glueLocation = SwingUtilities.convertPoint(c, 0, 0, this.window);
/*  965 */             int x2 = glueLocation.x + c.getWidth();
/*      */             
/*  967 */             if (getComponentOrientation().isLeftToRight()) {
/*  968 */               r2 = new Rectangle(x2, r.y, r.x + r.width - x2, r.height);
/*      */               
/*  970 */               r.width = glueLocation.x - r.x;
/*      */             } else {
/*  972 */               r2 = new Rectangle(r.x, r.y, glueLocation.x - r.x, r.height);
/*      */               
/*  974 */               r.width = r.x + r.width - x2;
/*  975 */               r.x = x2;
/*      */             } 
/*  977 */             if (r2.width > 0) {
/*  978 */               hitTestSpots.add(r2);
/*      */             }
/*      */           } 
/*      */         } 
/*  982 */         hitTestSpots.add(r);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  987 */     for (Component c : this.rootPane.getLayeredPane().getComponents()) {
/*  988 */       r = (c instanceof JInternalFrame) ? getNativeHitTestSpot((JInternalFrame)c) : null;
/*  989 */       if (r != null) {
/*  990 */         hitTestSpots.add(r);
/*      */       }
/*      */     } 
/*  993 */     Rectangle minimizeButtonBounds = boundsInWindow(this.iconifyButton);
/*  994 */     Rectangle maximizeButtonBounds = boundsInWindow(this.maximizeButton.isVisible() ? this.maximizeButton : this.restoreButton);
/*  995 */     Rectangle closeButtonBounds = boundsInWindow(this.closeButton);
/*      */     
/*  997 */     FlatNativeWindowBorder.setTitleBarHeightAndHitTestSpots(this.window, titleBarHeight, hitTestSpots, appIconBounds, minimizeButtonBounds, maximizeButtonBounds, closeButtonBounds);
/*      */ 
/*      */     
/* 1000 */     this.debugTitleBarHeight = titleBarHeight;
/* 1001 */     this.debugHitTestSpots = hitTestSpots;
/* 1002 */     this.debugAppIconBounds = appIconBounds;
/* 1003 */     this.debugMinimizeButtonBounds = minimizeButtonBounds;
/* 1004 */     this.debugMaximizeButtonBounds = maximizeButtonBounds;
/* 1005 */     this.debugCloseButtonBounds = closeButtonBounds;
/* 1006 */     if (UIManager.getBoolean("FlatLaf.debug.titlebar.showRectangles"))
/* 1007 */       repaint(); 
/*      */   }
/*      */   
/*      */   private Rectangle boundsInWindow(JComponent c) {
/* 1011 */     return c.isShowing() ? 
/* 1012 */       SwingUtilities.convertRectangle(c.getParent(), c.getBounds(), this.window) : 
/* 1013 */       null;
/*      */   }
/*      */   
/*      */   protected Rectangle getNativeHitTestSpot(JComponent c) {
/* 1017 */     Dimension size = c.getSize();
/* 1018 */     if (size.width <= 0 || size.height <= 0) {
/* 1019 */       return null;
/*      */     }
/* 1021 */     Point location = SwingUtilities.convertPoint(c, 0, 0, this.window);
/* 1022 */     Rectangle r = new Rectangle(location, size);
/* 1023 */     return r;
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
/*      */   protected class FlatTitlePaneBorder
/*      */     extends AbstractBorder
/*      */   {
/*      */     public Insets getBorderInsets(Component c, Insets insets) {
/* 1040 */       super.getBorderInsets(c, insets);
/*      */       
/* 1042 */       Border menuBarBorder = getMenuBarBorder();
/* 1043 */       if (menuBarBorder != null) {
/*      */         
/* 1045 */         Insets menuBarInsets = menuBarBorder.getBorderInsets(c);
/* 1046 */         insets.bottom += menuBarInsets.bottom;
/* 1047 */       } else if (FlatTitlePane.this.borderColor != null && (FlatTitlePane.this.rootPane.getJMenuBar() == null || !FlatTitlePane.this.rootPane.getJMenuBar().isVisible())) {
/* 1048 */         insets.bottom += UIScale.scale(1);
/*      */       } 
/* 1050 */       if (!SystemInfo.isWindows_11_orLater && FlatTitlePane.this.hasNativeCustomDecoration() && !FlatTitlePane.this.isWindowMaximized()) {
/* 1051 */         insets = FlatUIUtils.addInsets(insets, FlatNativeWindowBorder.WindowTopBorder.getInstance().getBorderInsets());
/*      */       }
/* 1053 */       return insets;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
/* 1059 */       Border menuBarBorder = getMenuBarBorder();
/* 1060 */       if (menuBarBorder != null) {
/*      */         
/* 1062 */         menuBarBorder.paintBorder(FlatTitlePane.this.rootPane.getJMenuBar(), g, x, y, width, height);
/* 1063 */       } else if (FlatTitlePane.this.borderColor != null && (FlatTitlePane.this.rootPane.getJMenuBar() == null || !FlatTitlePane.this.rootPane.getJMenuBar().isVisible())) {
/*      */         
/* 1065 */         float lineHeight = UIScale.scale(1.0F);
/* 1066 */         FlatUIUtils.paintFilledRectangle(g, FlatTitlePane.this.borderColor, x, (y + height) - lineHeight, width, lineHeight);
/*      */       } 
/*      */       
/* 1069 */       if (!SystemInfo.isWindows_11_orLater && FlatTitlePane.this.hasNativeCustomDecoration() && !FlatTitlePane.this.isWindowMaximized())
/* 1070 */         FlatNativeWindowBorder.WindowTopBorder.getInstance().paintBorder(c, g, x, y, width, height); 
/*      */     }
/*      */     
/*      */     protected Border getMenuBarBorder() {
/* 1074 */       JMenuBar menuBar = FlatTitlePane.this.rootPane.getJMenuBar();
/* 1075 */       return FlatTitlePane.this.hasVisibleEmbeddedMenuBar(menuBar) ? menuBar.getBorder() : null;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected class FlatTitleLabelUI
/*      */     extends FlatLabelUI
/*      */   {
/*      */     protected FlatTitleLabelUI() {
/* 1086 */       super(false);
/*      */     }
/*      */ 
/*      */     
/*      */     protected void installDefaults(JLabel c) {
/* 1091 */       super.installDefaults(c);
/*      */       
/* 1093 */       if (FlatTitlePane.this.titleFont != null) {
/* 1094 */         c.setFont(FlatTitlePane.this.titleFont);
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     protected String layoutCL(JLabel label, FontMetrics fontMetrics, String text, Icon icon, Rectangle viewR, Rectangle iconR, Rectangle textR) {
/* 1101 */       JMenuBar menuBar = FlatTitlePane.this.rootPane.getJMenuBar();
/* 1102 */       boolean hasEmbeddedMenuBar = FlatTitlePane.this.hasVisibleEmbeddedMenuBar(menuBar);
/* 1103 */       boolean hasEmbeddedLeadingMenus = (hasEmbeddedMenuBar && hasLeadingMenus(menuBar));
/* 1104 */       boolean leftToRight = FlatTitlePane.this.getComponentOrientation().isLeftToRight();
/*      */       
/* 1106 */       if (hasEmbeddedMenuBar) {
/* 1107 */         int minGap = UIScale.scale(FlatTitlePane.this.menuBarTitleMinimumGap);
/*      */ 
/*      */         
/* 1110 */         if (hasEmbeddedLeadingMenus) {
/* 1111 */           if (leftToRight)
/* 1112 */             viewR.x += minGap; 
/* 1113 */           viewR.width -= minGap;
/*      */         } 
/*      */ 
/*      */         
/* 1117 */         Component horizontalGlue = FlatTitlePane.this.findHorizontalGlue(menuBar);
/* 1118 */         if (horizontalGlue != null && menuBar.getComponent(menuBar.getComponentCount() - 1) != horizontalGlue) {
/* 1119 */           if (!leftToRight)
/* 1120 */             viewR.x += minGap; 
/* 1121 */           viewR.width -= minGap;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1126 */       int iconTextGap = 0;
/* 1127 */       int iconWidthAndGap = 0;
/* 1128 */       if (icon != null) {
/* 1129 */         Insets iconInsets = FlatTitlePane.this.iconLabel.getInsets();
/* 1130 */         iconTextGap = leftToRight ? iconInsets.right : iconInsets.left;
/* 1131 */         iconWidthAndGap = icon.getIconWidth() + iconTextGap;
/*      */       } 
/*      */ 
/*      */       
/* 1135 */       String clippedText = SwingUtilities.layoutCompoundLabel(label, fontMetrics, text, icon, label
/* 1136 */           .getVerticalAlignment(), label.getHorizontalAlignment(), label
/* 1137 */           .getVerticalTextPosition(), label.getHorizontalTextPosition(), viewR, iconR, textR, iconTextGap);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1142 */       if (!clippedText.equals(text)) {
/*      */         
/* 1144 */         textR
/*      */           
/* 1146 */           .x = leftToRight ? (viewR.x + iconWidthAndGap) : (viewR.x + viewR.width - iconWidthAndGap - textR.width);
/*      */       } else {
/* 1148 */         int leadingGap = hasEmbeddedLeadingMenus ? UIScale.scale(FlatTitlePane.this.menuBarTitleGap - FlatTitlePane.this.menuBarTitleMinimumGap) : 0;
/*      */         
/* 1150 */         boolean center = hasEmbeddedLeadingMenus ? FlatTitlePane.this.centerTitleIfMenuBarEmbedded : FlatTitlePane.this.centerTitle;
/* 1151 */         if (center) {
/*      */ 
/*      */           
/* 1154 */           Container parent = label.getParent();
/* 1155 */           int centeredTextX = (parent != null) ? ((parent.getWidth() - textR.width - iconWidthAndGap) / 2 + iconWidthAndGap - label.getX()) : -1;
/* 1156 */           textR
/*      */             
/* 1158 */             .x = (centeredTextX >= viewR.x + leadingGap && centeredTextX + textR.width <= viewR.x + viewR.width - leadingGap) ? centeredTextX : (viewR.x + (viewR.width - textR.width - iconWidthAndGap) / 2 + iconWidthAndGap);
/*      */         } else {
/*      */           
/* 1161 */           textR
/*      */             
/* 1163 */             .x = leftToRight ? Math.min(viewR.x + leadingGap + iconWidthAndGap, viewR.x + viewR.width - textR.width) : Math.max(viewR.x + viewR.width - leadingGap - iconWidthAndGap - textR.width, viewR.x);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1168 */       if (icon != null) {
/* 1169 */         iconR
/*      */           
/* 1171 */           .x = leftToRight ? (textR.x - iconWidthAndGap) : (textR.x + textR.width + iconTextGap);
/*      */       }
/*      */       
/* 1174 */       return clippedText;
/*      */     }
/*      */ 
/*      */     
/*      */     private boolean hasLeadingMenus(JMenuBar menuBar) {
/* 1179 */       if (menuBar.getComponentCount() == 0 || menuBar.getWidth() == 0) {
/* 1180 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1184 */       Component horizontalGlue = FlatTitlePane.this.findHorizontalGlue(menuBar);
/* 1185 */       if (horizontalGlue != null) {
/* 1186 */         boolean leftToRight = FlatTitlePane.this.getComponentOrientation().isLeftToRight();
/* 1187 */         if ((leftToRight && horizontalGlue.getX() == 0) || (!leftToRight && horizontalGlue
/* 1188 */           .getX() + horizontalGlue.getWidth() == menuBar.getWidth())) {
/* 1189 */           return false;
/*      */         }
/*      */       } 
/* 1192 */       return true;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   protected class Handler
/*      */     extends WindowAdapter
/*      */     implements PropertyChangeListener, MouseListener, MouseMotionListener, ComponentListener
/*      */   {
/*      */     private Point dragOffset;
/*      */     private boolean linuxNativeMove;
/*      */     private long lastSingleClickWhen;
/*      */     
/*      */     public void propertyChange(PropertyChangeEvent e) {
/* 1206 */       switch (e.getPropertyName()) {
/*      */         case "title":
/* 1208 */           FlatTitlePane.this.titleLabel.setText(FlatTitlePane.this.getWindowTitle());
/*      */           break;
/*      */         
/*      */         case "resizable":
/* 1212 */           if (FlatTitlePane.this.window instanceof Frame) {
/* 1213 */             FlatTitlePane.this.frameStateChanged();
/*      */           }
/*      */           break;
/*      */         case "iconImage":
/* 1217 */           FlatTitlePane.this.updateIcon();
/*      */           break;
/*      */         
/*      */         case "componentOrientation":
/* 1221 */           FlatTitlePane.this.updateNativeTitleBarHeightAndHitTestSpotsLater();
/*      */           break;
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void windowActivated(WindowEvent e) {
/* 1230 */       FlatTitlePane.this.activeChanged(true);
/* 1231 */       FlatTitlePane.this.updateNativeTitleBarHeightAndHitTestSpots();
/*      */       
/* 1233 */       if (!SystemInfo.isWindows_11_orLater && FlatTitlePane.this.hasNativeCustomDecoration()) {
/* 1234 */         FlatNativeWindowBorder.WindowTopBorder.getInstance().repaintBorder(FlatTitlePane.this);
/*      */       }
/* 1236 */       FlatTitlePane.this.repaintWindowBorder();
/*      */     }
/*      */ 
/*      */     
/*      */     public void windowDeactivated(WindowEvent e) {
/* 1241 */       FlatTitlePane.this.activeChanged(false);
/* 1242 */       FlatTitlePane.this.updateNativeTitleBarHeightAndHitTestSpots();
/*      */       
/* 1244 */       if (!SystemInfo.isWindows_11_orLater && FlatTitlePane.this.hasNativeCustomDecoration()) {
/* 1245 */         FlatNativeWindowBorder.WindowTopBorder.getInstance().repaintBorder(FlatTitlePane.this);
/*      */       }
/* 1247 */       FlatTitlePane.this.repaintWindowBorder();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void windowStateChanged(WindowEvent e) {
/* 1259 */       FlatTitlePane.this.frameStateChanged();
/* 1260 */       FlatTitlePane.this.updateNativeTitleBarHeightAndHitTestSpots();
/*      */     }
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
/*      */     public void mouseClicked(MouseEvent e) {
/* 1274 */       if (this.linuxNativeMove && SystemInfo.isLinux && FlatNativeLinuxLibrary.isWMUtilsSupported(FlatTitlePane.this.window)) {
/*      */         
/* 1276 */         if (this.lastSingleClickWhen != 0L && e.getWhen() - this.lastSingleClickWhen <= getMultiClickInterval()) {
/* 1277 */           this.lastSingleClickWhen = 0L;
/* 1278 */           FlatTitlePane.this.maximizeOrRestore();
/*      */         } 
/*      */         
/*      */         return;
/*      */       } 
/* 1283 */       if (e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e)) {
/* 1284 */         if (e.getSource() == FlatTitlePane.this.iconLabel) {
/*      */           
/* 1286 */           FlatTitlePane.this.close();
/* 1287 */         } else if (!FlatTitlePane.this.hasNativeCustomDecoration()) {
/*      */           
/* 1289 */           FlatTitlePane.this.maximizeOrRestore();
/*      */         } 
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public void mousePressed(MouseEvent e) {
/* 1296 */       if (FlatTitlePane.this.window == null) {
/*      */         return;
/*      */       }
/*      */       
/* 1300 */       if (SwingUtilities.isRightMouseButton(e) && SystemInfo.isLinux && 
/* 1301 */         FlatNativeLinuxLibrary.isWMUtilsSupported(FlatTitlePane.this.window)) {
/*      */         
/* 1303 */         e.consume();
/* 1304 */         FlatNativeLinuxLibrary.showWindowMenu(FlatTitlePane.this.window, e);
/*      */         
/*      */         return;
/*      */       } 
/* 1308 */       if (!SwingUtilities.isLeftMouseButton(e)) {
/*      */         return;
/*      */       }
/* 1311 */       this.dragOffset = SwingUtilities.convertPoint(FlatTitlePane.this, e.getPoint(), FlatTitlePane.this.window);
/* 1312 */       this.linuxNativeMove = false;
/*      */ 
/*      */       
/* 1315 */       if (SystemInfo.isLinux && FlatNativeLinuxLibrary.isWMUtilsSupported(FlatTitlePane.this.window)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1324 */         int clickCount = e.getClickCount();
/* 1325 */         if (clickCount == 1 && this.lastSingleClickWhen != 0L && e.getWhen() - this.lastSingleClickWhen <= getMultiClickInterval()) {
/* 1326 */           clickCount = 2;
/*      */         }
/* 1328 */         switch (clickCount) {
/*      */           
/*      */           case 1:
/* 1331 */             e.consume();
/* 1332 */             this.linuxNativeMove = FlatNativeLinuxLibrary.moveOrResizeWindow(FlatTitlePane.this.window, e, 8);
/* 1333 */             this.lastSingleClickWhen = e.getWhen();
/*      */             break;
/*      */ 
/*      */ 
/*      */           
/*      */           case 2:
/* 1339 */             this.lastSingleClickWhen = 0L;
/* 1340 */             FlatTitlePane.this.maximizeOrRestore();
/*      */             break;
/*      */         } 
/*      */       } 
/*      */     }
/*      */     
/*      */     private int getMultiClickInterval() {
/* 1347 */       Object value = Toolkit.getDefaultToolkit().getDesktopProperty("awt.multiClickInterval");
/* 1348 */       return (value instanceof Integer) ? ((Integer)value).intValue() : 500;
/*      */     }
/*      */ 
/*      */     
/*      */     public void mouseReleased(MouseEvent e) {}
/*      */     
/*      */     public void mouseEntered(MouseEvent e) {}
/*      */     
/*      */     public void mouseExited(MouseEvent e) {}
/*      */     
/*      */     public void mouseDragged(MouseEvent e) {
/* 1359 */       if (FlatTitlePane.this.window == null || this.dragOffset == null) {
/*      */         return;
/*      */       }
/* 1362 */       if (this.linuxNativeMove) {
/*      */         return;
/*      */       }
/* 1365 */       if (!SwingUtilities.isLeftMouseButton(e)) {
/*      */         return;
/*      */       }
/* 1368 */       if (FlatTitlePane.this.hasNativeCustomDecoration()) {
/*      */         return;
/*      */       }
/*      */       
/* 1372 */       if (FlatTitlePane.this.window instanceof Frame) {
/* 1373 */         Frame frame = (Frame)FlatTitlePane.this.window;
/* 1374 */         int state = frame.getExtendedState();
/* 1375 */         if ((state & 0x6) != 0) {
/* 1376 */           int maximizedWidth = FlatTitlePane.this.window.getWidth();
/*      */ 
/*      */           
/* 1379 */           frame.setExtendedState(state & 0xFFFFFFF9);
/*      */ 
/*      */ 
/*      */           
/* 1383 */           int restoredWidth = FlatTitlePane.this.window.getWidth();
/* 1384 */           int center = restoredWidth / 2;
/* 1385 */           if (this.dragOffset.x > center)
/*      */           {
/* 1387 */             if (this.dragOffset.x > maximizedWidth - center) {
/* 1388 */               this.dragOffset.x = restoredWidth - maximizedWidth - this.dragOffset.x;
/*      */             } else {
/* 1390 */               this.dragOffset.x = center;
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */       
/* 1396 */       int newX = e.getXOnScreen() - this.dragOffset.x;
/* 1397 */       int newY = e.getYOnScreen() - this.dragOffset.y;
/*      */       
/* 1399 */       if (newX == FlatTitlePane.this.window.getX() && newY == FlatTitlePane.this.window.getY()) {
/*      */         return;
/*      */       }
/*      */       
/* 1403 */       FlatTitlePane.this.window.setLocation(newX, newY);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void mouseMoved(MouseEvent e) {}
/*      */ 
/*      */     
/*      */     public void componentResized(ComponentEvent e) {
/* 1412 */       FlatTitlePane.this.updateNativeTitleBarHeightAndHitTestSpotsLater();
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void componentShown(ComponentEvent e) {
/* 1418 */       FlatTitlePane.this.frameStateChanged();
/*      */     }
/*      */     
/*      */     public void componentMoved(ComponentEvent e) {}
/*      */     
/*      */     public void componentHidden(ComponentEvent e) {}
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTitlePane.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */