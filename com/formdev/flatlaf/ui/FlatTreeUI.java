/*     */ package com.formdev.flatlaf.ui;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatClientProperties;
/*     */ import com.formdev.flatlaf.util.LoggingFacade;
/*     */ import com.formdev.flatlaf.util.UIScale;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Insets;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.event.MouseListener;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.LookAndFeel;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.event.TreeSelectionEvent;
/*     */ import javax.swing.event.TreeSelectionListener;
/*     */ import javax.swing.plaf.ComponentUI;
/*     */ import javax.swing.plaf.basic.BasicTreeUI;
/*     */ import javax.swing.tree.DefaultTreeCellRenderer;
/*     */ import javax.swing.tree.TreePath;
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
/*     */ public class FlatTreeUI
/*     */   extends BasicTreeUI
/*     */   implements FlatStylingSupport.StyleableUI
/*     */ {
/*     */   @Styleable
/*     */   protected Color selectionBackground;
/*     */   @Styleable
/*     */   protected Color selectionForeground;
/*     */   @Styleable
/*     */   protected Color selectionInactiveBackground;
/*     */   @Styleable
/*     */   protected Color selectionInactiveForeground;
/*     */   @Styleable
/*     */   protected Color selectionBorderColor;
/*     */   @Styleable
/*     */   protected Insets selectionInsets;
/*     */   @Styleable
/*     */   protected int selectionArc;
/*     */   @Styleable
/*     */   protected boolean wideSelection;
/*     */   @Styleable
/*     */   protected boolean showCellFocusIndicator;
/*     */   protected boolean showDefaultIcons;
/*     */   @Styleable(dot = true)
/*     */   public String iconArrowType;
/*     */   @Styleable(dot = true)
/*     */   public Color iconExpandedColor;
/*     */   @Styleable(dot = true)
/*     */   public Color iconCollapsedColor;
/*     */   @Styleable(dot = true)
/*     */   public Color iconLeafColor;
/*     */   @Styleable(dot = true)
/*     */   public Color iconClosedColor;
/*     */   @Styleable(dot = true)
/*     */   public Color iconOpenColor;
/*     */   @Styleable
/*     */   protected boolean paintSelection = true;
/*     */   private Icon defaultLeafIcon;
/*     */   private Icon defaultClosedIcon;
/*     */   private Icon defaultOpenIcon;
/*     */   private boolean paintLines;
/*     */   private Color defaultCellNonSelectionBackground;
/*     */   private Color defaultSelectionBackground;
/*     */   private Color defaultSelectionForeground;
/*     */   private Color defaultSelectionBorderColor;
/*     */   private Map<String, Object> oldStyleValues;
/*     */   
/*     */   public static ComponentUI createUI(JComponent c) {
/* 173 */     return new FlatTreeUI();
/*     */   }
/*     */ 
/*     */   
/*     */   public void installUI(JComponent c) {
/* 178 */     super.installUI(c);
/*     */     
/* 180 */     installStyle();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installDefaults() {
/* 185 */     super.installDefaults();
/*     */     
/* 187 */     LookAndFeel.installBorder(this.tree, "Tree.border");
/*     */     
/* 189 */     this.selectionBackground = UIManager.getColor("Tree.selectionBackground");
/* 190 */     this.selectionForeground = UIManager.getColor("Tree.selectionForeground");
/* 191 */     this.selectionInactiveBackground = UIManager.getColor("Tree.selectionInactiveBackground");
/* 192 */     this.selectionInactiveForeground = UIManager.getColor("Tree.selectionInactiveForeground");
/* 193 */     this.selectionBorderColor = UIManager.getColor("Tree.selectionBorderColor");
/* 194 */     this.selectionInsets = UIManager.getInsets("Tree.selectionInsets");
/* 195 */     this.selectionArc = UIManager.getInt("Tree.selectionArc");
/* 196 */     this.wideSelection = UIManager.getBoolean("Tree.wideSelection");
/* 197 */     this.showCellFocusIndicator = UIManager.getBoolean("Tree.showCellFocusIndicator");
/* 198 */     this.showDefaultIcons = UIManager.getBoolean("Tree.showDefaultIcons");
/*     */     
/* 200 */     this.defaultLeafIcon = UIManager.getIcon("Tree.leafIcon");
/* 201 */     this.defaultClosedIcon = UIManager.getIcon("Tree.closedIcon");
/* 202 */     this.defaultOpenIcon = UIManager.getIcon("Tree.openIcon");
/*     */     
/* 204 */     this.paintLines = UIManager.getBoolean("Tree.paintLines");
/* 205 */     this.defaultCellNonSelectionBackground = UIManager.getColor("Tree.textBackground");
/* 206 */     this.defaultSelectionBackground = this.selectionBackground;
/* 207 */     this.defaultSelectionForeground = this.selectionForeground;
/* 208 */     this.defaultSelectionBorderColor = this.selectionBorderColor;
/*     */ 
/*     */     
/* 211 */     int rowHeight = FlatUIUtils.getUIInt("Tree.rowHeight", 16);
/* 212 */     if (rowHeight > 0)
/* 213 */       LookAndFeel.installProperty(this.tree, "rowHeight", Integer.valueOf(UIScale.scale(rowHeight))); 
/* 214 */     setLeftChildIndent(UIScale.scale(getLeftChildIndent()));
/* 215 */     setRightChildIndent(UIScale.scale(getRightChildIndent()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void uninstallDefaults() {
/* 220 */     super.uninstallDefaults();
/*     */     
/* 222 */     LookAndFeel.uninstallBorder(this.tree);
/*     */     
/* 224 */     this.selectionBackground = null;
/* 225 */     this.selectionForeground = null;
/* 226 */     this.selectionInactiveBackground = null;
/* 227 */     this.selectionInactiveForeground = null;
/* 228 */     this.selectionBorderColor = null;
/*     */     
/* 230 */     this.defaultLeafIcon = null;
/* 231 */     this.defaultClosedIcon = null;
/* 232 */     this.defaultOpenIcon = null;
/*     */     
/* 234 */     this.defaultCellNonSelectionBackground = null;
/* 235 */     this.defaultSelectionBackground = null;
/* 236 */     this.defaultSelectionForeground = null;
/* 237 */     this.defaultSelectionBorderColor = null;
/* 238 */     this.oldStyleValues = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void updateRenderer() {
/* 243 */     super.updateRenderer();
/*     */ 
/*     */     
/* 246 */     if (!this.showDefaultIcons && this.currentCellRenderer instanceof DefaultTreeCellRenderer) {
/* 247 */       DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer)this.currentCellRenderer;
/* 248 */       if (renderer.getLeafIcon() == this.defaultLeafIcon && renderer
/* 249 */         .getClosedIcon() == this.defaultClosedIcon && renderer
/* 250 */         .getOpenIcon() == this.defaultOpenIcon) {
/*     */         
/* 252 */         renderer.setLeafIcon(null);
/* 253 */         renderer.setClosedIcon(null);
/* 254 */         renderer.setOpenIcon(null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected MouseListener createMouseListener() {
/* 261 */     return new BasicTreeUI.MouseHandler()
/*     */       {
/*     */         public void mousePressed(MouseEvent e) {
/* 264 */           super.mousePressed(handleWideMouseEvent(e));
/*     */         }
/*     */ 
/*     */         
/*     */         public void mouseReleased(MouseEvent e) {
/* 269 */           super.mouseReleased(handleWideMouseEvent(e));
/*     */         }
/*     */ 
/*     */         
/*     */         public void mouseDragged(MouseEvent e) {
/* 274 */           super.mouseDragged(handleWideMouseEvent(e));
/*     */         }
/*     */         
/*     */         private MouseEvent handleWideMouseEvent(MouseEvent e) {
/* 278 */           if (!FlatTreeUI.this.isWideSelection() || !FlatTreeUI.this.tree.isEnabled() || !SwingUtilities.isLeftMouseButton(e) || e.isConsumed()) {
/* 279 */             return e;
/*     */           }
/* 281 */           int x = e.getX();
/* 282 */           int y = e.getY();
/* 283 */           TreePath path = FlatTreeUI.this.getClosestPathForLocation(FlatTreeUI.this.tree, x, y);
/* 284 */           if (path == null || FlatTreeUI.this.isLocationInExpandControl(path, x, y)) {
/* 285 */             return e;
/*     */           }
/* 287 */           Rectangle bounds = FlatTreeUI.this.getPathBounds(FlatTreeUI.this.tree, path);
/* 288 */           if (bounds == null || y < bounds.y || y >= bounds.y + bounds.height) {
/* 289 */             return e;
/*     */           }
/* 291 */           int newX = Math.max(bounds.x, Math.min(x, bounds.x + bounds.width - 1));
/* 292 */           if (newX == x) {
/* 293 */             return e;
/*     */           }
/*     */           
/* 296 */           return new MouseEvent(e.getComponent(), e.getID(), e.getWhen(), e
/* 297 */               .getModifiers() | e.getModifiersEx(), newX, e.getY(), e
/* 298 */               .getClickCount(), e.isPopupTrigger(), e.getButton());
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   protected PropertyChangeListener createPropertyChangeListener() {
/* 305 */     PropertyChangeListener superListener = super.createPropertyChangeListener();
/* 306 */     return e -> {
/*     */         superListener.propertyChange(e);
/*     */         if (e.getSource() == this.tree) {
/*     */           switch (e.getPropertyName()) {
/*     */             case "JTree.wideSelection":
/*     */             case "JTree.paintSelection":
/*     */               this.tree.repaint();
/*     */               break;
/*     */             case "dropLocation":
/*     */               if (isWideSelection()) {
/*     */                 JTree.DropLocation oldValue = (JTree.DropLocation)e.getOldValue();
/*     */                 repaintWideDropLocation(oldValue);
/*     */                 repaintWideDropLocation(this.tree.getDropLocation());
/*     */               } 
/*     */               break;
/*     */             case "FlatLaf.style":
/*     */             case "FlatLaf.styleClass":
/*     */               installStyle();
/*     */               this.tree.revalidate();
/*     */               this.tree.repaint();
/*     */               break;
/*     */             case "enabled":
/*     */               if (!this.showDefaultIcons && this.currentCellRenderer instanceof DefaultTreeCellRenderer && this.currentCellRenderer.getClass() != DefaultTreeCellRenderer.class && this.treeState != null) {
/*     */                 this.treeState.invalidateSizes();
/*     */                 updateSize();
/*     */               } 
/*     */               break;
/*     */           } 
/*     */         }
/*     */       };
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
/*     */   private void repaintWideDropLocation(JTree.DropLocation loc) {
/* 351 */     if (loc == null || isDropLine(loc)) {
/*     */       return;
/*     */     }
/* 354 */     Rectangle r = this.tree.getPathBounds(loc.getPath());
/* 355 */     if (r != null) {
/* 356 */       this.tree.repaint(0, r.y, this.tree.getWidth(), r.height);
/*     */     }
/*     */   }
/*     */   
/*     */   protected TreeSelectionListener createTreeSelectionListener() {
/* 361 */     TreeSelectionListener superListener = super.createTreeSelectionListener();
/* 362 */     return e -> {
/*     */         superListener.valueChanged(e);
/*     */         TreePath[] changedPaths;
/*     */         if (useUnitedRoundedSelection() && this.tree.getSelectionCount() > 1 && (changedPaths = e.getPaths()) != null) {
/*     */           if (changedPaths.length > 4) {
/*     */             this.tree.repaint();
/*     */           } else {
/*     */             int arc = (int)Math.ceil(UIScale.scale(this.selectionArc / 2.0F));
/*     */             for (TreePath path : changedPaths) {
/*     */               Rectangle r = getPathBounds(this.tree, path);
/*     */               if (r != null) {
/*     */                 this.tree.repaint(r.x, r.y - arc, r.width, r.height + arc * 2);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rectangle getPathBounds(JTree tree, TreePath path) {
/* 389 */     Rectangle bounds = super.getPathBounds(tree, path);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 396 */     if (bounds != null && 
/* 397 */       isWideSelection() && 
/* 398 */       UIManager.getBoolean("FlatLaf.experimental.tree.widePathForLocation") && 
/* 399 */       StackUtils.wasInvokedFrom(JTree.class.getName(), "getPathForLocation", 5)) {
/*     */       
/* 401 */       bounds.x = 0;
/* 402 */       bounds.width = tree.getWidth();
/*     */     } 
/* 404 */     return bounds;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void installStyle() {
/*     */     try {
/* 410 */       applyStyle(FlatStylingSupport.getResolvedStyle(this.tree, "Tree"));
/* 411 */     } catch (RuntimeException ex) {
/* 412 */       LoggingFacade.INSTANCE.logSevere(null, ex);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void applyStyle(Object style) {
/* 418 */     this.oldStyleValues = FlatStylingSupport.parseAndApply(this.oldStyleValues, style, this::applyStyleProperty);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object applyStyleProperty(String key, Object value) {
/* 423 */     if ("rowHeight".equals(key) && value instanceof Integer) {
/* 424 */       value = Integer.valueOf(UIScale.scale(((Integer)value).intValue()));
/*     */     }
/* 426 */     return FlatStylingSupport.applyToAnnotatedObjectOrComponent(this, this.tree, key, value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Class<?>> getStyleableInfos(JComponent c) {
/* 432 */     return FlatStylingSupport.getAnnotatedStyleableInfos(this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getStyleableValue(JComponent c, String key) {
/* 438 */     return FlatStylingSupport.getAnnotatedStyleableValue(this, key);
/*     */   }
/*     */ 
/*     */   
/*     */   public void paint(Graphics g, JComponent c) {
/* 443 */     if (this.treeState == null) {
/*     */       return;
/*     */     }
/*     */     
/* 447 */     Rectangle clipBounds = g.getClipBounds();
/* 448 */     TreePath firstPath = getClosestPathForLocation(this.tree, 0, clipBounds.y);
/* 449 */     Enumeration<TreePath> visiblePaths = this.treeState.getVisiblePathsFrom(firstPath);
/*     */     
/* 451 */     if (visiblePaths != null) {
/* 452 */       Insets insets = this.tree.getInsets();
/*     */       
/* 454 */       HashSet<TreePath> verticalLinePaths = this.paintLines ? new HashSet<>() : null;
/* 455 */       ArrayList<Runnable> paintLinesLater = this.paintLines ? new ArrayList<>() : null;
/* 456 */       ArrayList<Runnable> paintExpandControlsLater = this.paintLines ? new ArrayList<>() : null;
/*     */ 
/*     */       
/* 459 */       if (this.paintLines) {
/* 460 */         for (TreePath path = firstPath.getParentPath(); path != null; path = path.getParentPath()) {
/* 461 */           verticalLinePaths.add(path);
/*     */         }
/*     */       }
/* 464 */       Rectangle boundsBuffer = new Rectangle();
/* 465 */       boolean rootVisible = isRootVisible();
/* 466 */       int row = this.treeState.getRowForPath(firstPath);
/* 467 */       boolean leftToRight = this.tree.getComponentOrientation().isLeftToRight();
/* 468 */       int treeWidth = this.tree.getWidth();
/*     */ 
/*     */       
/* 471 */       while (visiblePaths.hasMoreElements()) {
/* 472 */         TreePath path = visiblePaths.nextElement();
/* 473 */         if (path == null) {
/*     */           break;
/*     */         }
/*     */         
/* 477 */         Rectangle bounds = this.treeState.getBounds(path, boundsBuffer);
/* 478 */         if (bounds == null) {
/*     */           break;
/*     */         }
/*     */         
/* 482 */         if (leftToRight) {
/* 483 */           bounds.x += insets.left;
/*     */         } else {
/* 485 */           bounds.x = treeWidth - insets.right - bounds.x + bounds.width;
/* 486 */         }  bounds.y += insets.top;
/*     */         
/* 488 */         boolean isLeaf = this.treeModel.isLeaf(path.getLastPathComponent());
/* 489 */         boolean isExpanded = isLeaf ? false : this.treeState.getExpandedState(path);
/* 490 */         boolean hasBeenExpanded = isLeaf ? false : this.tree.hasBeenExpanded(path);
/*     */ 
/*     */         
/* 493 */         paintRow(g, clipBounds, insets, bounds, path, row, isExpanded, hasBeenExpanded, isLeaf);
/*     */ 
/*     */         
/* 496 */         if (this.paintLines) {
/* 497 */           TreePath parentPath = path.getParentPath();
/*     */ 
/*     */           
/* 500 */           if (parentPath != null) {
/* 501 */             verticalLinePaths.add(parentPath);
/*     */           }
/*     */           
/* 504 */           if (parentPath != null || (rootVisible && row == 0)) {
/* 505 */             Rectangle bounds2 = new Rectangle(bounds);
/* 506 */             int row2 = row;
/* 507 */             paintLinesLater.add(() -> paintHorizontalPartOfLeg(g, clipBounds, insets, bounds2, path, row2, isExpanded, hasBeenExpanded, isLeaf));
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 514 */         if (shouldPaintExpandControl(path, row, isExpanded, hasBeenExpanded, isLeaf)) {
/* 515 */           if (this.paintLines) {
/*     */             
/* 517 */             Rectangle bounds2 = new Rectangle(bounds);
/* 518 */             int row2 = row;
/* 519 */             paintExpandControlsLater.add(() -> paintExpandControl(g, clipBounds, insets, bounds2, path, row2, isExpanded, hasBeenExpanded, isLeaf));
/*     */           }
/*     */           else {
/*     */             
/* 523 */             paintExpandControl(g, clipBounds, insets, bounds, path, row, isExpanded, hasBeenExpanded, isLeaf);
/*     */           } 
/*     */         }
/* 526 */         if (bounds.y + bounds.height >= clipBounds.y + clipBounds.height) {
/*     */           break;
/*     */         }
/* 529 */         row++;
/*     */       } 
/*     */       
/* 532 */       if (this.paintLines) {
/*     */         
/* 534 */         Object[] oldRenderingHints = FlatUIUtils.setRenderingHints(g);
/*     */ 
/*     */         
/* 537 */         for (Runnable r : paintLinesLater) {
/* 538 */           r.run();
/*     */         }
/*     */         
/* 541 */         g.setColor(Color.green);
/* 542 */         for (TreePath path : verticalLinePaths) {
/* 543 */           paintVerticalPartOfLeg(g, clipBounds, insets, path);
/*     */         }
/*     */         
/* 546 */         if (oldRenderingHints != null) {
/* 547 */           FlatUIUtils.resetRenderingHints(g, oldRenderingHints);
/*     */         }
/*     */         
/* 550 */         for (Runnable r : paintExpandControlsLater) {
/* 551 */           r.run();
/*     */         }
/*     */       } 
/*     */     } 
/* 555 */     paintDropLine(g);
/*     */     
/* 557 */     this.rendererPane.removeAll();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintRow(Graphics g, Rectangle clipBounds, Insets insets, Rectangle bounds, TreePath path, int row, boolean isExpanded, boolean hasBeenExpanded, boolean isLeaf) {
/* 568 */     boolean isEditing = (this.editingComponent != null && this.editingRow == row);
/* 569 */     boolean isSelected = this.tree.isRowSelected(row);
/* 570 */     boolean isDropRow = isDropRow(row);
/* 571 */     boolean needsSelectionPainting = ((isSelected || isDropRow) && isPaintSelection());
/*     */ 
/*     */     
/* 574 */     if (isEditing) {
/*     */ 
/*     */ 
/*     */       
/* 578 */       if (isSelected && isWideSelection()) {
/* 579 */         Color oldColor = g.getColor();
/* 580 */         g.setColor(this.selectionInactiveBackground);
/* 581 */         paintWideSelection(g, bounds, row);
/* 582 */         g.setColor(oldColor);
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/* 587 */     boolean hasFocus = FlatUIUtils.isPermanentFocusOwner(this.tree);
/* 588 */     boolean cellHasFocus = (hasFocus && row == getLeadSelectionRow());
/*     */ 
/*     */ 
/*     */     
/* 592 */     if (!hasFocus && isSelected && this.tree.getParent() instanceof javax.swing.CellRendererPane) {
/* 593 */       hasFocus = FlatUIUtils.isPermanentFocusOwner(this.tree.getParent().getParent());
/*     */     }
/*     */     
/* 596 */     Component rendererComponent = this.currentCellRenderer.getTreeCellRendererComponent(this.tree, path
/* 597 */         .getLastPathComponent(), isSelected, isExpanded, isLeaf, row, cellHasFocus);
/*     */ 
/*     */     
/* 600 */     Color oldBackgroundSelectionColor = null;
/* 601 */     if (isSelected && !hasFocus && !isDropRow) {
/*     */       
/* 603 */       oldBackgroundSelectionColor = setRendererBackgroundSelectionColor(rendererComponent, this.selectionInactiveBackground);
/* 604 */       setRendererForeground(rendererComponent, this.selectionInactiveForeground);
/*     */     }
/* 606 */     else if (isSelected) {
/*     */       
/* 608 */       if (this.selectionBackground != this.defaultSelectionBackground)
/* 609 */         oldBackgroundSelectionColor = setRendererBackgroundSelectionColor(rendererComponent, this.selectionBackground); 
/* 610 */       if (this.selectionForeground != this.defaultSelectionForeground) {
/* 611 */         setRendererForeground(rendererComponent, this.selectionForeground);
/*     */       }
/*     */     } 
/*     */     
/* 615 */     Color oldBorderSelectionColor = null;
/* 616 */     if (isSelected && hasFocus && (!this.showCellFocusIndicator || this.tree
/* 617 */       .getMinSelectionRow() == this.tree.getMaxSelectionRow())) {
/*     */ 
/*     */       
/* 620 */       oldBorderSelectionColor = setRendererBorderSelectionColor(rendererComponent, (Color)null);
/*     */     }
/* 622 */     else if (hasFocus && this.selectionBorderColor != this.defaultSelectionBorderColor) {
/*     */       
/* 624 */       oldBorderSelectionColor = setRendererBorderSelectionColor(rendererComponent, this.selectionBorderColor);
/*     */     } 
/*     */ 
/*     */     
/* 628 */     if (needsSelectionPainting) {
/*     */       
/* 630 */       Color oldColor = g.getColor();
/* 631 */       g.setColor(isDropRow ? 
/* 632 */           UIManager.getColor("Tree.dropCellBackground") : (
/* 633 */           (rendererComponent instanceof DefaultTreeCellRenderer) ? (
/* 634 */           (DefaultTreeCellRenderer)rendererComponent).getBackgroundSelectionColor() : (
/* 635 */           hasFocus ? this.selectionBackground : this.selectionInactiveBackground)));
/*     */       
/* 637 */       if (isWideSelection()) {
/*     */         
/* 639 */         paintWideSelection(g, bounds, row);
/*     */       } else {
/*     */         
/* 642 */         paintCellBackground(g, rendererComponent, bounds, row, true);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 647 */       g.setColor(oldColor);
/*     */     
/*     */     }
/* 650 */     else if (rendererComponent instanceof DefaultTreeCellRenderer) {
/* 651 */       DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer)rendererComponent;
/* 652 */       Color bg = renderer.getBackgroundNonSelectionColor();
/* 653 */       if (bg != null && !bg.equals(this.defaultCellNonSelectionBackground)) {
/* 654 */         Color oldColor = g.getColor();
/* 655 */         g.setColor(bg);
/* 656 */         paintCellBackground(g, rendererComponent, bounds, row, false);
/* 657 */         g.setColor(oldColor);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 663 */     this.rendererPane.paintComponent(g, rendererComponent, this.tree, bounds.x, bounds.y, bounds.width, bounds.height, true);
/*     */ 
/*     */     
/* 666 */     if (oldBackgroundSelectionColor != null)
/* 667 */       ((DefaultTreeCellRenderer)rendererComponent).setBackgroundSelectionColor(oldBackgroundSelectionColor); 
/* 668 */     if (oldBorderSelectionColor != null)
/* 669 */       ((DefaultTreeCellRenderer)rendererComponent).setBorderSelectionColor(oldBorderSelectionColor); 
/*     */   }
/*     */   
/*     */   private Color setRendererBackgroundSelectionColor(Component rendererComponent, Color color) {
/* 673 */     Color oldColor = null;
/*     */     
/* 675 */     if (rendererComponent instanceof DefaultTreeCellRenderer) {
/* 676 */       DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer)rendererComponent;
/* 677 */       if (renderer.getBackgroundSelectionColor() == this.defaultSelectionBackground) {
/* 678 */         oldColor = renderer.getBackgroundSelectionColor();
/* 679 */         renderer.setBackgroundSelectionColor(color);
/*     */       }
/*     */     
/* 682 */     } else if (rendererComponent.getBackground() == this.defaultSelectionBackground) {
/* 683 */       rendererComponent.setBackground(color);
/*     */     } 
/*     */     
/* 686 */     return oldColor;
/*     */   }
/*     */   
/*     */   private void setRendererForeground(Component rendererComponent, Color color) {
/* 690 */     if (rendererComponent.getForeground() == this.defaultSelectionForeground)
/* 691 */       rendererComponent.setForeground(color); 
/*     */   }
/*     */   
/*     */   private Color setRendererBorderSelectionColor(Component rendererComponent, Color color) {
/* 695 */     Color oldColor = null;
/*     */     
/* 697 */     if (rendererComponent instanceof DefaultTreeCellRenderer) {
/* 698 */       DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer)rendererComponent;
/* 699 */       if (renderer.getBorderSelectionColor() == this.defaultSelectionBorderColor) {
/* 700 */         oldColor = renderer.getBorderSelectionColor();
/* 701 */         renderer.setBorderSelectionColor(color);
/*     */       } 
/*     */     } 
/*     */     
/* 705 */     return oldColor;
/*     */   }
/*     */ 
/*     */   
/*     */   private void paintWideSelection(Graphics g, Rectangle bounds, int row) {
/* 710 */     float arcBottom = UIScale.scale(this.selectionArc / 2.0F), arcTop = arcBottom;
/*     */     
/* 712 */     if (useUnitedRoundedSelection()) {
/* 713 */       if (row > 0 && this.tree.isRowSelected(row - 1))
/* 714 */         arcTop = 0.0F; 
/* 715 */       if (row < this.tree.getRowCount() - 1 && this.tree.isRowSelected(row + 1)) {
/* 716 */         arcBottom = 0.0F;
/*     */       }
/*     */     } 
/* 719 */     FlatUIUtils.paintSelection((Graphics2D)g, 0, bounds.y, this.tree.getWidth(), bounds.height, 
/* 720 */         UIScale.scale(this.selectionInsets), arcTop, arcTop, arcBottom, arcBottom, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void paintCellBackground(Graphics g, Component rendererComponent, Rectangle bounds, int row, boolean paintSelection) {
/* 726 */     int xOffset = 0;
/* 727 */     int imageOffset = 0;
/*     */     
/* 729 */     if (rendererComponent instanceof JLabel) {
/* 730 */       JLabel label = (JLabel)rendererComponent;
/* 731 */       Icon icon = label.isEnabled() ? label.getIcon() : label.getDisabledIcon();
/*     */ 
/*     */       
/* 734 */       imageOffset = (icon != null && label.getText() != null) ? (icon.getIconWidth() + Math.max(label.getIconTextGap() - 1, 0)) : 0;
/* 735 */       xOffset = label.getComponentOrientation().isLeftToRight() ? imageOffset : 0;
/*     */     } 
/*     */     
/* 738 */     if (paintSelection) {
/*     */       
/* 740 */       float arcBottomRight = UIScale.scale(this.selectionArc / 2.0F), arcBottomLeft = arcBottomRight, arcTopRight = arcBottomLeft, arcTopLeft = arcTopRight;
/*     */       
/* 742 */       if (useUnitedRoundedSelection()) {
/* 743 */         if (row > 0 && this.tree.isRowSelected(row - 1)) {
/* 744 */           Rectangle r = getPathBounds(this.tree, this.tree.getPathForRow(row - 1));
/* 745 */           arcTopLeft = Math.min(arcTopLeft, (r.x - bounds.x));
/* 746 */           arcTopRight = Math.min(arcTopRight, (bounds.x + bounds.width - r.x + r.width));
/*     */         } 
/* 748 */         if (row < this.tree.getRowCount() - 1 && this.tree.isRowSelected(row + 1)) {
/* 749 */           Rectangle r = getPathBounds(this.tree, this.tree.getPathForRow(row + 1));
/* 750 */           arcBottomLeft = Math.min(arcBottomLeft, (r.x - bounds.x));
/* 751 */           arcBottomRight = Math.min(arcBottomRight, (bounds.x + bounds.width - r.x + r.width));
/*     */         } 
/*     */       } 
/*     */       
/* 755 */       FlatUIUtils.paintSelection((Graphics2D)g, bounds.x + xOffset, bounds.y, bounds.width - imageOffset, bounds.height, 
/* 756 */           UIScale.scale(this.selectionInsets), arcTopLeft, arcTopRight, arcBottomLeft, arcBottomRight, 0);
/*     */     } else {
/* 758 */       g.fillRect(bounds.x + xOffset, bounds.y, bounds.width - imageOffset, bounds.height);
/*     */     } 
/*     */   }
/*     */   private boolean useUnitedRoundedSelection() {
/* 762 */     return (this.selectionArc > 0 && (this.selectionInsets == null || (this.selectionInsets.top == 0 && this.selectionInsets.bottom == 0)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintVerticalLine(Graphics g, JComponent c, int x, int top, int bottom) {
/* 768 */     ((Graphics2D)g).fill(new Rectangle2D.Float(x, top, UIScale.scale(1.0F), (bottom - top)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void paintHorizontalLine(Graphics g, JComponent c, int y, int left, int right) {
/* 773 */     ((Graphics2D)g).fill(new Rectangle2D.Float(left, y, (right - left), UIScale.scale(1.0F)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isDropRow(int row) {
/* 781 */     JTree.DropLocation dropLocation = this.tree.getDropLocation();
/* 782 */     return (dropLocation != null && dropLocation
/* 783 */       .getChildIndex() == -1 && this.tree
/* 784 */       .getRowForPath(dropLocation.getPath()) == row);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Rectangle getDropLineRect(JTree.DropLocation loc) {
/* 789 */     Rectangle r = super.getDropLineRect(loc);
/* 790 */     return isWideSelection() ? new Rectangle(0, r.y, this.tree.getWidth(), r.height) : r;
/*     */   }
/*     */   
/*     */   protected boolean isWideSelection() {
/* 794 */     return FlatClientProperties.clientPropertyBoolean(this.tree, "JTree.wideSelection", this.wideSelection);
/*     */   }
/*     */   
/*     */   protected boolean isPaintSelection() {
/* 798 */     return FlatClientProperties.clientPropertyBoolean(this.tree, "JTree.paintSelection", this.paintSelection);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\formdev\flatla\\ui\FlatTreeUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */