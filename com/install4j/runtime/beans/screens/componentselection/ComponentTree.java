/*     */ package com.install4j.runtime.beans.screens.componentselection;
/*     */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*     */ import java.awt.ComponentOrientation;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.Enumeration;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.DefaultTreeModel;
/*     */ import javax.swing.tree.TreeNode;
/*     */ import javax.swing.tree.TreePath;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public abstract class ComponentTree extends JTree {
/*  19 */   public static KeyStroke KEY_STROKE_HELP = KeyStroke.getKeyStroke(112, 0);
/*  20 */   public static KeyStroke KEY_STROKE_SELECT = KeyStroke.getKeyStroke(32, 0);
/*     */   
/*     */   private DescriptionModeProvider descriptionModeProvider;
/*     */   private ComponentCellHandler renderer;
/*     */   
/*     */   public ComponentTree(DescriptionModeProvider descriptionModeProvider) {
/*  26 */     this.descriptionModeProvider = descriptionModeProvider;
/*     */     
/*  28 */     setupControls();
/*  29 */     setupComponent();
/*  30 */     setupEventHandlers();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DescriptionModeProvider getDescriptionModeProvider() {
/*  39 */     return this.descriptionModeProvider;
/*     */   }
/*     */   
/*     */   protected void setupControls() {
/*  43 */     this.renderer = createComponentCellHandler();
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyComponentOrientation(ComponentOrientation o) {
/*  48 */     super.applyComponentOrientation(o);
/*  49 */     this.renderer.applyComponentOrientation(o);
/*     */   }
/*     */   
/*     */   protected ComponentCellHandler createComponentCellHandler() {
/*  53 */     return new ComponentCellHandler(this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupComponent() {
/*  58 */     setRootVisible(false);
/*     */     
/*  60 */     DefaultTreeModel model = createTreeModel();
/*  61 */     setVisibleRowCount(5);
/*  62 */     setModel(model);
/*  63 */     setCellRenderer(this.renderer);
/*  64 */     modelSet();
/*  65 */     setRowHeight(0);
/*  66 */     getSelectionModel().setSelectionMode(1);
/*     */     
/*  68 */     DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode)model.getRoot();
/*  69 */     int childCount = rootNode.getChildCount();
/*  70 */     boolean topLevelOnly = true;
/*  71 */     for (int i = 0; i < childCount; i++) {
/*  72 */       if (rootNode.getChildAt(i).getChildCount() > 0) {
/*  73 */         topLevelOnly = false;
/*     */         break;
/*     */       } 
/*     */     } 
/*  77 */     setShowsRootHandles(!topLevelOnly);
/*  78 */     if (isDisableSelectionPainting()) {
/*  79 */       UiUtil.getLookAndFeelEnhancer().disableExtraSelectionPainting(this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void modelSet() {}
/*     */ 
/*     */   
/*     */   protected void setupEventHandlers() {
/*  88 */     addMouseListener(new ComponentTreeMouseListener());
/*  89 */     addKeyListener(new ComponentTreeKeyListener());
/*  90 */     ToolTipManager.sharedInstance().registerComponent(this);
/*     */     
/*  92 */     addComponentListener(new ComponentAdapter()
/*     */         {
/*     */           private boolean cellRendererUpdated;
/*     */           
/*     */           public void componentResized(ComponentEvent e) {
/*  97 */             if (!this.cellRendererUpdated && ComponentTree.this.getWidth() > 0) {
/*  98 */               this.cellRendererUpdated = true;
/*  99 */               ComponentTree.this.updateCellRenderer();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void updateAllNodes() {
/* 106 */     DefaultTreeModel model = (DefaultTreeModel)getModel();
/* 107 */     Enumeration<TreeNode> en = ((DefaultMutableTreeNode)model.getRoot()).depthFirstEnumeration();
/* 108 */     while (en.hasMoreElements()) {
/* 109 */       DefaultMutableTreeNode node = (DefaultMutableTreeNode)en.nextElement();
/* 110 */       model.nodeChanged(node);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String getToolTipText(MouseEvent event) {
/* 116 */     if (event != null) {
/* 117 */       Point p = initRenderer(event);
/* 118 */       if (p != null) {
/* 119 */         return this.renderer.getToolTipText(p);
/*     */       }
/*     */     } 
/* 122 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TreePath getNextMatch(String prefix, int startingRow, Position.Bias bias) {
/* 130 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeSelectionRow(int row) {}
/*     */ 
/*     */   
/*     */   private Point initRenderer(MouseEvent event) {
/* 138 */     TreePath path = getPathForLocation(event.getX(), event.getY());
/* 139 */     if (path == null) {
/* 140 */       return null;
/*     */     }
/*     */     
/* 143 */     int row = getRowForLocation(event.getX(), event.getY());
/* 144 */     Rectangle bounds = getRowBounds(row);
/* 145 */     Point point = event.getPoint();
/* 146 */     point.translate(-bounds.x, -bounds.y);
/*     */     
/* 148 */     this.renderer.getTreeCellRendererComponent(this, path.getLastPathComponent(), false, false, true, 0, false);
/* 149 */     this.renderer.setSize(this.renderer.getPreferredSize());
/* 150 */     this.renderer.doLayout();
/*     */     
/* 152 */     return point;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void nodeToggled() {}
/*     */ 
/*     */   
/*     */   public void selectionChanged(ComponentNode componentNode, boolean dependency) {}
/*     */ 
/*     */   
/*     */   private void updateCellRenderer() {
/* 164 */     this.renderer = createComponentCellHandler();
/* 165 */     setCellRenderer(this.renderer);
/*     */   }
/*     */   
/*     */   public boolean isDisableSelectionPainting() {
/* 169 */     return false;
/*     */   }
/*     */   
/*     */   private void togglePathDescription(@NotNull TreePath path) {
/* 173 */     ComponentNode node = (ComponentNode)path.getLastPathComponent();
/* 174 */     ComponentNodeConfig componentNodeConfig = node.getComponentNodeConfig();
/* 175 */     if (componentNodeConfig.isHelpButtonVisible()) {
/* 176 */       node.toggleDisplayDescription();
/*     */     }
/*     */   }
/*     */   
/*     */   private void togglePathSelection(@NotNull TreePath path) {
/* 181 */     ComponentNode componentNode = (ComponentNode)path.getLastPathComponent();
/* 182 */     if (componentNode.isChangeable()) {
/* 183 */       if (componentNode instanceof ComponentFolderNode && componentNode.isSelected() && !((ComponentFolderNode)componentNode).isAllSelected()) {
/* 184 */         componentNode.setSelected(true, true);
/*     */       } else {
/* 186 */         componentNode.setSelected(!componentNode.isSelected(), true);
/*     */       } 
/* 188 */       ((DefaultTreeModel)getModel()).nodeChanged(componentNode);
/* 189 */       requestFocus();
/* 190 */       nodeToggled();
/* 191 */       pathToggled(path);
/*     */     } 
/*     */   }
/*     */   protected void pathToggled(TreePath path) {}
/*     */   protected abstract ComponentTreeModel createTreeModel();
/*     */   public abstract String getIconTooltip(ComponentNodeConfig paramComponentNodeConfig);
/*     */   public abstract Icon getLeafIcon(ComponentNodeConfig paramComponentNodeConfig);
/*     */   public abstract int getLeafIconWidth();
/*     */   
/* 200 */   private class ComponentTreeMouseListener extends MouseAdapter { private int toggleCount = -1;
/*     */ 
/*     */     
/*     */     public void mouseClicked(MouseEvent e) {
/* 204 */       if (e.isConsumed()) {
/*     */         return;
/*     */       }
/* 207 */       preventToggleEvent(e);
/*     */     }
/*     */ 
/*     */     
/*     */     public void mousePressed(MouseEvent e) {
/* 212 */       if (e.isConsumed()) {
/*     */         return;
/*     */       }
/* 215 */       ComponentTree.PathWithAction pathWithAction = preventToggleEvent(e);
/* 216 */       if (pathWithAction != null) {
/* 217 */         switch (pathWithAction.actionType) {
/*     */           case CHECK_BOX:
/* 219 */             ComponentTree.this.togglePathSelection(pathWithAction.path);
/*     */             break;
/*     */           case HELP:
/* 222 */             ComponentTree.this.togglePathDescription(pathWithAction.path);
/*     */             break;
/*     */         } 
/* 225 */         Object source = e.getSource();
/* 226 */         if (source instanceof JTree) {
/* 227 */           JTree tree = (JTree)source;
/* 228 */           if (!tree.hasFocus() && tree.isFocusable() && tree.isRequestFocusEnabled()) {
/* 229 */             tree.requestFocusInWindow();
/*     */           }
/*     */         } 
/* 232 */         e.consume();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void mouseReleased(MouseEvent e) {
/* 238 */       if (e.isConsumed()) {
/*     */         return;
/*     */       }
/* 241 */       ComponentTree.PathWithAction pathWithAction = preventToggleEvent(e);
/* 242 */       if (pathWithAction != null) {
/* 243 */         e.consume();
/*     */       }
/* 245 */       if (this.toggleCount != -1) {
/* 246 */         ComponentTree.this.setToggleClickCount(this.toggleCount);
/*     */       }
/*     */     }
/*     */     
/*     */     private ComponentTree.PathWithAction preventToggleEvent(MouseEvent e) {
/* 251 */       TreePath path = getTreePath(e);
/* 252 */       if (path == null) {
/* 253 */         return null;
/*     */       }
/* 255 */       Point point = ComponentTree.this.initRenderer(e);
/* 256 */       ComponentTree.ActionType actionType = getActionType(point);
/* 257 */       if (actionType != null) {
/* 258 */         int toggleCount = ComponentTree.this.getToggleClickCount();
/* 259 */         if (toggleCount != -1) {
/* 260 */           this.toggleCount = toggleCount;
/* 261 */           ComponentTree.this.setToggleClickCount(-1);
/*     */         } 
/* 263 */         return new ComponentTree.PathWithAction(path, actionType);
/*     */       } 
/* 265 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     private TreePath getTreePath(MouseEvent e) {
/* 270 */       if (!SwingUtilities.isLeftMouseButton(e)) {
/* 271 */         return null;
/*     */       }
/* 273 */       return ComponentTree.this.getPathForLocation(e.getX(), e.getY());
/*     */     }
/*     */     
/*     */     public ComponentTree.ActionType getActionType(Point point) {
/* 277 */       if (ComponentTree.this.renderer.isPointInCheckBox(point))
/* 278 */         return ComponentTree.ActionType.CHECK_BOX; 
/* 279 */       if (ComponentTree.this.renderer.isPointInHelpButton(point)) {
/* 280 */         return ComponentTree.ActionType.HELP;
/*     */       }
/* 282 */       return null;
/*     */     }
/*     */     
/*     */     private ComponentTreeMouseListener() {} }
/*     */   
/*     */   private class ComponentTreeKeyListener extends KeyAdapter { private ComponentTreeKeyListener() {}
/*     */     
/*     */     public void keyPressed(KeyEvent event) {
/* 290 */       KeyStroke keyStroke = KeyStroke.getKeyStrokeForEvent(event);
/* 291 */       if (ComponentTree.KEY_STROKE_HELP.equals(keyStroke)) {
/* 292 */         TreePath path = ComponentTree.this.getSelectionPath();
/* 293 */         if (path != null) {
/* 294 */           ComponentTree.this.togglePathDescription(path);
/* 295 */           event.consume();
/*     */         } 
/* 297 */       } else if (ComponentTree.KEY_STROKE_SELECT.equals(keyStroke)) {
/* 298 */         TreePath path = ComponentTree.this.getSelectionPath();
/* 299 */         if (path != null) {
/* 300 */           ComponentTree.this.togglePathSelection(path);
/* 301 */           event.consume();
/*     */         } 
/*     */       } 
/*     */     } }
/*     */ 
/*     */   
/*     */   private static class PathWithAction {
/*     */     @NotNull
/*     */     private final TreePath path;
/*     */     @NotNull
/*     */     private final ComponentTree.ActionType actionType;
/*     */     
/*     */     public PathWithAction(@NotNull TreePath path, @NotNull ComponentTree.ActionType actionType) {
/* 314 */       this.path = path;
/* 315 */       this.actionType = actionType;
/*     */     }
/*     */   }
/*     */   
/*     */   public enum ActionType {
/* 320 */     CHECK_BOX, HELP;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\componentselection\ComponentTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */