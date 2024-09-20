/*     */ package com.install4j.runtime.beans.screens.installationtype;
/*     */ 
/*     */ import com.install4j.runtime.beans.screens.InstallationTypeScreen;
/*     */ import com.install4j.runtime.beans.screens.componentselection.ComponentCellHandler;
/*     */ import com.install4j.runtime.beans.screens.componentselection.ComponentTree;
/*     */ import com.install4j.runtime.beans.screens.componentselection.ComponentTreeModel;
/*     */ import com.install4j.runtime.beans.screens.componentselection.DescriptionModeProvider;
/*     */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.util.Enumeration;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.event.TreeSelectionEvent;
/*     */ import javax.swing.event.TreeSelectionListener;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.TreeNode;
/*     */ import javax.swing.tree.TreePath;
/*     */ 
/*     */ public class InstallationTypeTree extends ComponentTree implements TreeSelectionListener {
/*  19 */   private static final Icon ICON_DEFAULT = IconHelper.loadIcon("installation_type_default_16.png");
/*  20 */   private static final Icon ICON_CUSTOMIZE = IconHelper.loadIcon("installation_type_customize_16.png");
/*     */   
/*     */   public InstallationTypeTree(InstallationTypeScreen installationTypeScreen) {
/*  23 */     super((DescriptionModeProvider)installationTypeScreen);
/*     */   }
/*     */   
/*     */   public InstallationTypeScreen getInstallationTypeScreen() {
/*  27 */     return (InstallationTypeScreen)getDescriptionModeProvider();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void modelSet() {
/*  32 */     DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode)getModel().getRoot();
/*  33 */     for (int i = 0; i < rootNode.getChildCount(); i++) {
/*  34 */       InstallationTypeNode installationTypeNode = (InstallationTypeNode)rootNode.getChildAt(i);
/*  35 */       if (installationTypeNode.isSelected()) {
/*  36 */         setSelectionPath(new TreePath((Object[])installationTypeNode.getPath()));
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected ComponentTreeModel createTreeModel() {
/*  44 */     return new InstallationTypeTreeModel(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIconTooltip(ComponentNodeConfig config) {
/*  49 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Icon getLeafIcon(ComponentNodeConfig config) {
/*  54 */     if (config instanceof InstallationTypeConfig) {
/*  55 */       InstallationTypeConfig installationTypeConfig = (InstallationTypeConfig)config;
/*  56 */       return installationTypeConfig.isUserCanCustomize() ? ICON_CUSTOMIZE : ICON_DEFAULT;
/*     */     } 
/*  58 */     return ICON_DEFAULT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLeafIconWidth() {
/*  64 */     return ICON_DEFAULT.getIconWidth();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ComponentCellHandler createComponentCellHandler() {
/*  69 */     return new InstallationTypeCellHandler(this);
/*     */   }
/*     */   
/*     */   public String getSelectedId() {
/*  73 */     InstallationTypeConfig selectedConfig = getSelectedConfig();
/*  74 */     if (selectedConfig == null) {
/*  75 */       return null;
/*     */     }
/*  77 */     return selectedConfig.getDisplayedId();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSelectedId(String id) {
/*  82 */     Enumeration<TreeNode> en = ((DefaultMutableTreeNode)getModel().getRoot()).children();
/*  83 */     while (en.hasMoreElements()) {
/*  84 */       InstallationTypeNode node = (InstallationTypeNode)en.nextElement();
/*  85 */       InstallationTypeConfig installationTypeConfig = node.getInstallationTypeConfig();
/*  86 */       if (installationTypeConfig.getId().equals(id) || installationTypeConfig.getDisplayedId().equals(id)) {
/*  87 */         node.setSelected(true, false);
/*  88 */         setSelectionPath(new TreePath((Object[])node.getPath()));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public InstallationTypeConfig getSelectedConfig() {
/*  95 */     Enumeration<TreeNode> en = ((DefaultMutableTreeNode)getModel().getRoot()).children();
/*  96 */     while (en.hasMoreElements()) {
/*  97 */       InstallationTypeNode node = (InstallationTypeNode)en.nextElement();
/*  98 */       if (node.isSelected()) {
/*  99 */         return node.getInstallationTypeConfig();
/*     */       }
/*     */     } 
/* 102 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupEventHandlers() {
/* 107 */     super.setupEventHandlers();
/*     */     
/* 109 */     addTreeSelectionListener(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDisableSelectionPainting() {
/* 114 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void pathToggled(TreePath path) {
/* 119 */     super.pathToggled(path);
/* 120 */     setSelectionPath(path);
/*     */   }
/*     */ 
/*     */   
/*     */   public void valueChanged(TreeSelectionEvent event) {
/* 125 */     TreePath selectedPath = event.getPath();
/* 126 */     if (selectedPath != null) {
/* 127 */       InstallationTypeNode selectNode = (InstallationTypeNode)selectedPath.getLastPathComponent();
/* 128 */       selectNode.setSelected(true, true);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationtype\InstallationTypeTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */