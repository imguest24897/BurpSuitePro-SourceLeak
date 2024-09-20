/*     */ package com.install4j.runtime.beans.screens.componentselection;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*     */ import com.install4j.runtime.util.DisplayTextArea;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JToggleButton;
/*     */ import javax.swing.JTree;
/*     */ import javax.swing.tree.DefaultTreeCellRenderer;
/*     */ import javax.swing.tree.TreePath;
/*     */ 
/*     */ public class ComponentCellHandler extends JPanel implements TreeCellRenderer {
/*  20 */   private static final Icon ICON_HELP = IconHelper.loadIcon("help_14.png");
/*  21 */   private static final int CHECKBOX_WIDTH = ((new JCheckBox()).getPreferredSize()).width;
/*  22 */   private static final int SCROLL_BAR_WIDTH = ((new JScrollBar(1)).getPreferredSize()).width;
/*  23 */   private static final Border CHECKBOX_BORDER = BorderFactory.createEmptyBorder(0, 3, 0, 4);
/*     */   
/*     */   private ComponentTree tree;
/*     */   
/*     */   private JToggleButton chkSelected;
/*     */   
/*     */   private JToggleButton chkSelectedDisabled;
/*     */   private DefaultTreeCellRenderer defaultRenderer;
/*     */   private ComponentToggleButton btnHelp;
/*     */   private DisplayTextArea dtxaDescription;
/*     */   private boolean pathBoundCheck = false;
/*     */   private int dtxaInset;
/*     */   private ComponentNodeConfig lastConfig;
/*     */   
/*     */   public ComponentCellHandler(ComponentTree tree) {
/*  38 */     this.tree = tree;
/*  39 */     setupControls();
/*  40 */     setupComponents();
/*  41 */     applyComponentOrientation(tree.getComponentOrientation());
/*     */   }
/*     */   
/*     */   public ComponentTree getTree() {
/*  45 */     return this.tree;
/*     */   }
/*     */   
/*     */   private void setupControls() {
/*  49 */     this.chkSelected = createSelectionToggleButton();
/*  50 */     this.chkSelected.setBorder(CHECKBOX_BORDER);
/*  51 */     this.chkSelectedDisabled = createSelectionToggleButton();
/*  52 */     this.chkSelectedDisabled.setEnabled(false);
/*  53 */     this.chkSelectedDisabled.setBorder(CHECKBOX_BORDER);
/*     */     
/*  55 */     this.defaultRenderer = new DefaultTreeCellRenderer();
/*  56 */     customizeDefaultRenderer(this.defaultRenderer);
/*  57 */     this.btnHelp = new ComponentToggleButton(ICON_HELP);
/*  58 */     this.dtxaDescription = new DisplayTextArea();
/*  59 */     Font font = this.dtxaDescription.getFont();
/*  60 */     DescriptionModeProvider descriptionModeProvider = this.tree.getDescriptionModeProvider();
/*     */     
/*  62 */     int style = 0;
/*  63 */     float size = font.getSize2D();
/*  64 */     if (descriptionModeProvider.isBoldDescription()) {
/*  65 */       style++;
/*     */     }
/*  67 */     if (descriptionModeProvider.isItalicDescription()) {
/*  68 */       style += 2;
/*     */     }
/*  70 */     if (descriptionModeProvider.isSmallerDescription()) {
/*  71 */       size--;
/*     */     }
/*  73 */     font = font.deriveFont(style, size);
/*  74 */     this.dtxaDescription.setFont(font);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void customizeDefaultRenderer(DefaultTreeCellRenderer defaultRenderer) {}
/*     */ 
/*     */   
/*     */   protected JToggleButton createSelectionToggleButton() {
/*  82 */     JCheckBox triStateCheckBox = UiUtil.getLookAndFeelEnhancer().createTriStateCheckBox();
/*  83 */     triStateCheckBox.setFocusable(false);
/*  84 */     return triStateCheckBox;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFocusable() {
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   private void setupComponents() {
/*  93 */     setOpaque(false);
/*     */     
/*  95 */     setLayout(new GridBagLayout());
/*  96 */     GridBagConstraints gc = new GridBagConstraints();
/*  97 */     gc.gridx = 0;
/*  98 */     gc.gridy = 0;
/*  99 */     gc.weighty = 0.0D;
/* 100 */     gc.anchor = 21;
/* 101 */     add(this.chkSelected, gc);
/* 102 */     gc.gridx = 1;
/* 103 */     add(this.chkSelectedDisabled, gc);
/*     */     
/* 105 */     gc.gridx = 2;
/* 106 */     gc.fill = 0;
/* 107 */     add(this.defaultRenderer, gc);
/*     */     
/* 109 */     gc.gridx = 3;
/* 110 */     gc.weightx = 0.0D;
/* 111 */     gc.fill = 0;
/* 112 */     add(this.btnHelp, gc);
/*     */     
/* 114 */     gc.gridy = 1;
/* 115 */     gc.gridx = 2;
/* 116 */     gc.gridwidth = 3;
/* 117 */     gc.fill = 2;
/* 118 */     gc.weightx = 1.0D;
/* 119 */     this.dtxaInset = this.tree.getLeafIconWidth() + this.defaultRenderer.getIconTextGap();
/* 120 */     gc.insets.left += this.dtxaInset;
/* 121 */     add((Component)this.dtxaDescription, gc);
/* 122 */     gc.insets.left -= this.dtxaInset;
/*     */     
/* 124 */     this.defaultRenderer.setOpenIcon(IconHelper.ICON_FOLDER_OPEN);
/* 125 */     this.defaultRenderer.setClosedIcon(IconHelper.ICON_FOLDER_CLOSED);
/*     */   }
/*     */ 
/*     */   
/*     */   public Component getTreeCellRendererComponent(JTree treeUnused, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
/* 130 */     ComponentNode componentNode = (ComponentNode)value;
/* 131 */     this.lastConfig = componentNode.getComponentNodeConfig();
/* 132 */     if (this.lastConfig != null && !this.pathBoundCheck) {
/* 133 */       boolean changeable = componentNode.isChangeable();
/* 134 */       this.chkSelected.setVisible(changeable);
/* 135 */       this.chkSelectedDisabled.setVisible(!changeable);
/* 136 */       JToggleButton toggleButton = changeable ? this.chkSelected : this.chkSelectedDisabled;
/* 137 */       toggleButton.setSelected(this.lastConfig.isSelected());
/* 138 */       if (toggleButton instanceof IndeterminateStateComponent && isPartiallySelected(componentNode)) {
/* 139 */         ((IndeterminateStateComponent)toggleButton).setIndeterminate(true);
/*     */       }
/*     */       
/* 142 */       String description = this.lastConfig.getDescription().trim();
/* 143 */       boolean helpButtonVisible = this.lastConfig.isHelpButtonVisible();
/* 144 */       this.btnHelp.setVisible(helpButtonVisible);
/* 145 */       this.defaultRenderer.setLeafIcon(this.tree.getLeafIcon(this.lastConfig));
/* 146 */       this.defaultRenderer.getTreeCellRendererComponent(this.tree, this.lastConfig.getName(), (!isWideTreeSelectionPrevented() && selected), expanded, leaf, row, isWideTreeSelection() ? false : hasFocus);
/* 147 */       if (description.length() > 0) {
/* 148 */         prepareDescriptionDisplay(this.lastConfig, description, this.tree, row, selected);
/*     */       } else {
/* 150 */         this.dtxaDescription.setVisible(false);
/*     */       } 
/*     */       
/* 153 */       invalidate();
/* 154 */       validate();
/*     */     } 
/*     */     
/* 157 */     return this;
/*     */   }
/*     */   
/*     */   private boolean isPartiallySelected(ComponentNode componentNode) {
/* 161 */     return (componentNode instanceof ComponentFolderNode && this.lastConfig.isSelected() && !((ComponentFolderNode)componentNode).isAllSelected());
/*     */   }
/*     */   
/*     */   private void prepareDescriptionDisplay(ComponentNodeConfig componentNodeConfig, String description, JTree tree, int row, boolean selected) {
/* 165 */     boolean displayDescription = componentNodeConfig.isDisplayDescription();
/* 166 */     this.btnHelp.setSelected(displayDescription);
/*     */     
/* 168 */     this.dtxaDescription.setVisible(displayDescription);
/* 169 */     boolean wideTreeSelection = isWideTreeSelectionActive();
/* 170 */     if (wideTreeSelection && 
/* 171 */       selected) {
/*     */       
/* 173 */       setBackground(UIManager.getColor("Tree.selectionBackground"));
/* 174 */       setForeground(UIManager.getColor("Tree.selectionForeground"));
/*     */     } 
/*     */     
/* 177 */     if (displayDescription) {
/* 178 */       if (wideTreeSelection) {
/* 179 */         this.dtxaDescription.setForeground(this.defaultRenderer.getForeground());
/*     */       }
/* 181 */       this.dtxaDescription.setText(description);
/* 182 */       Container parent = tree.getParent();
/* 183 */       if (parent != null) {
/* 184 */         int parentWidth = parent.getParent().getWidth();
/* 185 */         TreePath path = tree.getPathForRow(row);
/* 186 */         if (path != null) {
/* 187 */           this.pathBoundCheck = true;
/*     */           try {
/* 189 */             Rectangle pathBounds = tree.getPathBounds(path);
/* 190 */             if (pathBounds != null) {
/* 191 */               int mainWidth = getComponentOrientation().isLeftToRight() ? (parentWidth - pathBounds.x) : (pathBounds.x + pathBounds.width);
/* 192 */               int width = mainWidth - this.dtxaInset - getToggleButtonWidth() - 5 - SCROLL_BAR_WIDTH;
/* 193 */               Dimension size = new Dimension(width, 20);
/* 194 */               this.dtxaDescription.setPreferredSize(null);
/* 195 */               this.dtxaDescription.setSize(size);
/* 196 */               this.dtxaDescription.setPreferredSize(this.dtxaDescription.getPreferredSize());
/*     */             } 
/*     */           } finally {
/* 199 */             this.pathBoundCheck = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 205 */       this.dtxaDescription.setText("");
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean isWideTreeSelectionPrevented() {
/* 210 */     return (isWideTreeSelection() && this.tree.isDisableSelectionPainting());
/*     */   }
/*     */   
/*     */   private boolean isWideTreeSelectionActive() {
/* 214 */     return (isWideTreeSelection() && !this.tree.isDisableSelectionPainting());
/*     */   }
/*     */   
/*     */   private boolean isWideTreeSelection() {
/* 218 */     return UiUtil.getLookAndFeelEnhancer().isWideTreeSelection();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setForeground(Color fg) {
/* 223 */     super.setForeground(fg);
/* 224 */     if (this.defaultRenderer != null) {
/* 225 */       this.defaultRenderer.setForeground(fg);
/*     */     }
/* 227 */     if (this.dtxaDescription != null) {
/* 228 */       this.dtxaDescription.setForeground(fg);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isPointInLabel(Point point) {
/* 233 */     return this.defaultRenderer.getBounds().contains(point);
/*     */   }
/*     */   
/*     */   public boolean isPointInHelpButton(Point point) {
/* 237 */     return (this.btnHelp.isVisible() && this.btnHelp.getBounds().contains(point));
/*     */   }
/*     */   
/*     */   private boolean isPointInIcon(Point point) {
/* 241 */     return (isPointInLabel(point) && point.x - this.defaultRenderer.getX() < 16);
/*     */   }
/*     */   
/*     */   public boolean isPointInCheckBox(Point point) {
/* 245 */     return this.chkSelected.getBounds().contains(point);
/*     */   }
/*     */   
/*     */   public String getToolTipText(Point point) {
/* 249 */     if (isPointInHelpButton(point))
/* 250 */       return (this.btnHelp.isSelected() ? Messages.getString(".ComponentHideDescription") : Messages.getString(".ComponentShowDescription")) + KeyboardUtil.getAcceleratorTextForTooltip(ComponentTree.KEY_STROKE_HELP); 
/* 251 */     if (isPointInIcon(point)) {
/* 252 */       return this.tree.getIconTooltip(this.lastConfig);
/*     */     }
/* 254 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getToggleButtonWidth() {
/* 259 */     return CHECKBOX_WIDTH;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\componentselection\ComponentCellHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */