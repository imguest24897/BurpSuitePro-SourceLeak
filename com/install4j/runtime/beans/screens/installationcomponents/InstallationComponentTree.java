/*    */ package com.install4j.runtime.beans.screens.installationcomponents;
/*    */ 
/*    */ import com.install4j.runtime.beans.formcomponents.ComponentSelectorComponent;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentNode;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentTree;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentTreeModel;
/*    */ import com.install4j.runtime.beans.screens.componentselection.DescriptionModeProvider;
/*    */ import com.install4j.runtime.installer.config.ComponentConfig;
/*    */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.util.IconHelper;
/*    */ import javax.swing.Icon;
/*    */ 
/*    */ public class InstallationComponentTree
/*    */   extends ComponentTree {
/* 17 */   private static final Icon ICON_COMPONENT = IconHelper.loadIcon("component_16.png");
/* 18 */   private static final Icon ICON_DOWNLOAD = IconHelper.loadIcon("download_16.png");
/*    */   
/*    */   public InstallationComponentTree(ComponentSelectorComponent componentSelectorComponent) {
/* 21 */     super((DescriptionModeProvider)componentSelectorComponent);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void modelSet() {
/* 26 */     checkFolders();
/*    */   }
/*    */ 
/*    */   
/*    */   public void nodeToggled() {
/* 31 */     getComponentsSelector().nodeToggled();
/*    */   }
/*    */ 
/*    */   
/*    */   public void selectionChanged(ComponentNode componentNode, boolean dependency) {
/* 36 */     getComponentsSelector().selectionChanged(componentNode, dependency);
/*    */   }
/*    */   
/*    */   private ComponentSelectorComponent getComponentsSelector() {
/* 40 */     return (ComponentSelectorComponent)getDescriptionModeProvider();
/*    */   }
/*    */   
/*    */   public void checkFolders() {
/* 44 */     ((InstallationComponentTreeModel)getModel()).checkFolders();
/*    */   }
/*    */ 
/*    */   
/*    */   protected ComponentTreeModel createTreeModel() {
/* 49 */     return new InstallationComponentTreeModel(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getIconTooltip(ComponentNodeConfig config) {
/* 54 */     if (config instanceof ComponentConfig && InstallerConfig.getCurrentInstance().getDownloadURL().length() > 0) {
/* 55 */       ComponentConfig componentConfig = (ComponentConfig)config;
/* 56 */       if (componentConfig.isDownloaded()) {
/* 57 */         return Messages.getString(".ComponentDownloadedFromInternet");
/*    */       }
/* 59 */       return Messages.getString(".ComponentIncludedInInstaller");
/*    */     } 
/*    */     
/* 62 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Icon getLeafIcon(ComponentNodeConfig config) {
/* 68 */     if (config instanceof ComponentConfig && ((ComponentConfig)config).isDownloaded()) {
/* 69 */       return ICON_DOWNLOAD;
/*    */     }
/* 71 */     return ICON_COMPONENT;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getLeafIconWidth() {
/* 77 */     return ICON_COMPONENT.getIconWidth();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationcomponents\InstallationComponentTree.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */