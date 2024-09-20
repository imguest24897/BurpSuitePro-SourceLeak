/*     */ package com.install4j.runtime.beans.screens;
/*     */ 
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.screens.componentselection.DescriptionModeProvider;
/*     */ import com.install4j.runtime.beans.screens.installationtype.ComponentsSelectionType;
/*     */ import com.install4j.runtime.beans.screens.installationtype.InstallationTypeConfig;
/*     */ import com.install4j.runtime.beans.screens.installationtype.InstallationTypeTree;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.ComponentConfig;
/*     */ import com.install4j.runtime.installer.config.ComponentFolderConfig;
/*     */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ public class InstallationTypeScreen
/*     */   extends SystemScreen
/*     */   implements DescriptionModeProvider {
/*     */   public static final String VARIABLE_PREVENT_COMPONENT_CUSTOMIZATION = "sys.preventComponentCustomization";
/*     */   private InstallationTypeTree tree;
/*     */   private JScrollPane scpTree;
/*  30 */   private List<InstallationTypeConfig> installationTypeConfigs = new ArrayList<>();
/*  31 */   private String initialId = null;
/*     */   
/*     */   private Boolean overridePreventComponentCustomization;
/*     */   private boolean boldDescription = false;
/*     */   private boolean italicDescription = false;
/*     */   private boolean smallerDescription = false;
/*     */   
/*     */   public List<InstallationTypeConfig> getInstallationTypeConfigs() {
/*  39 */     return (List<InstallationTypeConfig>)replaceWithTextOverride("installationTypeConfigs", this.installationTypeConfigs, List.class);
/*     */   }
/*     */   
/*     */   public void setInstallationTypeConfigs(List<InstallationTypeConfig> installationTypeConfigs) {
/*  43 */     this.installationTypeConfigs = installationTypeConfigs;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBoldDescription() {
/*  48 */     return replaceWithTextOverride("boldDescription", this.boldDescription);
/*     */   }
/*     */   
/*     */   public void setBoldDescription(boolean boldDescription) {
/*  52 */     this.boldDescription = boldDescription;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isItalicDescription() {
/*  57 */     return replaceWithTextOverride("italicDescription", this.italicDescription);
/*     */   }
/*     */   
/*     */   public void setItalicDescription(boolean italicDescription) {
/*  61 */     this.italicDescription = italicDescription;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isSmallerDescription() {
/*  66 */     return replaceWithTextOverride("smallerDescription", this.smallerDescription);
/*     */   }
/*     */   
/*     */   public void setSmallerDescription(boolean smallerDescription) {
/*  70 */     this.smallerDescription = smallerDescription;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTitle() {
/*  75 */     return getMessage(".WizardInstallationType");
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSubTitle() {
/*  80 */     return getMessage(".SelectInstallationType");
/*     */   }
/*     */   
/*     */   public String getInitialId() {
/*  84 */     return this.initialId;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean next() {
/*  89 */     applySelectedConfig(this.tree.getSelectedConfig());
/*  90 */     return true;
/*     */   }
/*     */   
/*     */   private void applySelectedConfig(InstallationTypeConfig selectedConfig) {
/*  94 */     if (selectedConfig != null) {
/*     */       
/*  96 */       Iterator<ComponentConfig> it = InstallerConfig.getCurrentInstance().getComponents().iterator();
/*  97 */       while (it.hasNext()) {
/*  98 */         ComponentConfig componentConfig = it.next();
/*  99 */         if (!componentConfig.isMandatory()) {
/* 100 */           componentConfig.setSelected(false);
/*     */         }
/*     */       } 
/*     */       
/* 104 */       it = InstallerConfig.getCurrentInstance().getComponents().iterator();
/* 105 */       while (it.hasNext()) {
/* 106 */         ComponentConfig componentConfig = it.next();
/* 107 */         if (!componentConfig.isMandatory()) {
/* 108 */           componentConfig.setSelected(isSelectedComponent(componentConfig, selectedConfig));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isSelectedComponent(ComponentConfig componentConfig, InstallationTypeConfig selectedConfig) {
/* 116 */     ComponentsSelectionType componentsSelectionType = selectedConfig.getComponentsSelectionType();
/* 117 */     if (componentsSelectionType == ComponentsSelectionType.ALL)
/* 118 */       return true; 
/* 119 */     if (componentsSelectionType == ComponentsSelectionType.DEFAULT) {
/* 120 */       return componentConfig.isInitiallySelected();
/*     */     }
/* 122 */     String targetId = componentConfig.getId();
/* 123 */     for (String componentId : selectedConfig.getSelectedComponentIds()) {
/* 124 */       ComponentNodeConfig selectedComponentConfig = InstallerConfig.getCurrentInstance().getComponentNodeById(componentId);
/* 125 */       if (selectedComponentConfig != null) {
/* 126 */         if (selectedComponentConfig instanceof ComponentFolderConfig) {
/* 127 */           if (isContainedInFolder((ComponentFolderConfig)selectedComponentConfig, targetId))
/* 128 */             return true; 
/*     */           continue;
/*     */         } 
/* 131 */         if (Objects.equals(selectedComponentConfig.getId(), targetId)) {
/* 132 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean isContainedInFolder(ComponentFolderConfig componentFolderConfig, String id) {
/* 143 */     for (ComponentNodeConfig componentNodeConfig : componentFolderConfig.getComponents()) {
/* 144 */       if (componentNodeConfig instanceof ComponentFolderConfig) {
/* 145 */         boolean found = isContainedInFolder((ComponentFolderConfig)componentNodeConfig, id);
/* 146 */         if (found)
/* 147 */           return true;  continue;
/*     */       } 
/* 149 */       if (Objects.equals(componentNodeConfig.getId(), id)) {
/* 150 */         return true;
/*     */       }
/*     */     } 
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void addScreenContent(JPanel panel, GridBagConstraints gc) {
/* 159 */     String headerMessage = getMessage(".SelectInstallationTypeLabel");
/* 160 */     if (headerMessage.trim().length() > 0) {
/* 161 */       addDisplayTextArea(headerMessage, panel, gc);
/* 162 */       gc.insets.top = 5;
/*     */     } 
/*     */     
/* 165 */     gc.weightx = gc.weighty = 1.0D;
/* 166 */     gc.fill = 1;
/*     */     
/* 168 */     panel.add(this.scpTree, gc);
/* 169 */     gc.gridy++;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInstallerContext(InstallerContext context) {
/* 175 */     super.setInstallerContext(context);
/*     */     
/* 177 */     InstallerVariables.registerResponseFileVariable("sys.installationTypeId");
/* 178 */     Object varValue = InstallerVariables.getVariable("sys.installationTypeId");
/* 179 */     if (varValue instanceof String) {
/* 180 */       this.initialId = (String)varValue;
/*     */     }
/*     */     
/* 183 */     InstallerVariables.registerVariableProvider("sys.installationTypeId", new InstallerVariables.VariableProvider()
/*     */         {
/*     */           public Object getVariable()
/*     */           {
/* 187 */             return (InstallationTypeScreen.this.tree == null) ? InstallationTypeScreen.this.initialId : InstallationTypeScreen.this.tree.getSelectedId();
/*     */           }
/*     */ 
/*     */           
/*     */           public void setVariable(Object value) {
/* 192 */             if (value instanceof String) {
/* 193 */               String id = (String)value;
/* 194 */               if (InstallationTypeScreen.this.tree == null) {
/* 195 */                 InstallationTypeScreen.this.initialId = id;
/*     */               } else {
/* 197 */                 InstallationTypeScreen.this.tree.setSelectedId(id);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 203 */     InstallerVariables.registerVariableProvider("sys.preventComponentCustomization", new InstallerVariables.VariableProvider()
/*     */         {
/*     */           public Object getVariable()
/*     */           {
/* 207 */             if (InstallationTypeScreen.this.overridePreventComponentCustomization != null) {
/* 208 */               return InstallationTypeScreen.this.overridePreventComponentCustomization;
/*     */             }
/* 210 */             if (InstallationTypeScreen.this.tree == null) {
/* 211 */               return Boolean.FALSE;
/*     */             }
/* 213 */             InstallationTypeConfig selectedConfig = InstallationTypeScreen.this.tree.getSelectedConfig();
/* 214 */             if (selectedConfig == null) {
/* 215 */               return Boolean.FALSE;
/*     */             }
/* 217 */             return selectedConfig.isUserCanCustomize() ? Boolean.FALSE : Boolean.TRUE;
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void setVariable(Object value) {}
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setupControls() {
/* 231 */     super.setupControls();
/*     */ 
/*     */     
/* 234 */     this.tree = new InstallationTypeTree(this);
/* 235 */     this.scpTree = new JScrollPane((Component)this.tree);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 240 */     if (!super.handleConsole(console)) {
/* 241 */       return false;
/*     */     }
/*     */     
/* 244 */     int typeCount = getInstallationTypeConfigs().size();
/* 245 */     String[] keys = new String[typeCount];
/* 246 */     String[] descriptions = new String[typeCount];
/* 247 */     String[] helpTexts = new String[typeCount];
/* 248 */     int defaultValue = 0;
/* 249 */     for (int i = 0; i < keys.length; i++) {
/* 250 */       keys[i] = String.valueOf(i + 1);
/* 251 */       InstallationTypeConfig config = getInstallationTypeConfigs().get(i);
/* 252 */       descriptions[i] = config.getName();
/* 253 */       helpTexts[i] = config.getDescription();
/* 254 */       if (config.getId().equals(this.initialId) || config.getDisplayedId().equals(this.initialId)) {
/* 255 */         defaultValue = i;
/*     */       }
/*     */     } 
/*     */     
/* 259 */     int result = console.askOption(getMessage(".SelectInstallationType"), descriptions, keys, helpTexts, defaultValue, false, true);
/* 260 */     if (result > -1) {
/* 261 */       InstallationTypeConfig selectedConfig = getInstallationTypeConfigs().get(result);
/* 262 */       this.tree.setSelectedId(selectedConfig.getId());
/* 263 */       this.overridePreventComponentCustomization = selectedConfig.isUserCanCustomize() ? Boolean.FALSE : Boolean.TRUE;
/* 264 */       applySelectedConfig(selectedConfig);
/* 265 */       this.initialId = selectedConfig.getDisplayedId();
/*     */     } 
/* 267 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\InstallationTypeScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */