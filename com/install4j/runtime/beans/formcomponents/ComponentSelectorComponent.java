/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallationComponentSetup;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.beans.screens.componentselection.ComponentNode;
/*     */ import com.install4j.runtime.beans.screens.componentselection.DescriptionModeProvider;
/*     */ import com.install4j.runtime.beans.screens.installationcomponents.InstallationComponentTree;
/*     */ import com.install4j.runtime.installer.config.ComponentConfig;
/*     */ import com.install4j.runtime.installer.config.ComponentFolderConfig;
/*     */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.awt.Component;
/*     */ import java.util.HashSet;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.StringTokenizer;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JScrollPane;
/*     */ 
/*     */ public class ComponentSelectorComponent extends SystemFormComponent implements DescriptionModeProvider {
/*     */   private ScriptProperty selectionChangedScript;
/*     */   private boolean boldDescription = false;
/*     */   private boolean italicDescription = false;
/*     */   
/*     */   public ComponentSelectorComponent() {
/*  34 */     setBoldDescription(true);
/*     */   }
/*     */   private boolean smallerDescription = false; private boolean fillVertical; private InstallationComponentTree tree; private JScrollPane scpTree;
/*     */   public ScriptProperty getSelectionChangedScript() {
/*  38 */     return (ScriptProperty)replaceWithTextOverride("selectionChangedScript", this.selectionChangedScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setSelectionChangedScript(ScriptProperty selectionChangedScript) {
/*  42 */     this.selectionChangedScript = selectionChangedScript;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBoldDescription() {
/*  47 */     return replaceWithTextOverride("boldDescription", this.boldDescription);
/*     */   }
/*     */   
/*     */   public void setBoldDescription(boolean boldDescription) {
/*  51 */     this.boldDescription = boldDescription;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isItalicDescription() {
/*  56 */     return replaceWithTextOverride("italicDescription", this.italicDescription);
/*     */   }
/*     */   
/*     */   public void setItalicDescription(boolean italicDescription) {
/*  60 */     this.italicDescription = italicDescription;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isSmallerDescription() {
/*  65 */     return replaceWithTextOverride("smallerDescription", this.smallerDescription);
/*     */   }
/*     */   
/*     */   public void setSmallerDescription(boolean smallerDescription) {
/*  69 */     this.smallerDescription = smallerDescription;
/*     */   }
/*     */   
/*     */   public boolean isFillVertical() {
/*  73 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  77 */     this.fillVertical = fillVertical;
/*     */   }
/*     */ 
/*     */   
/*     */   public void formActivated() {
/*  82 */     this.tree.updateAllNodes();
/*  83 */     this.tree.checkFolders();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/*  88 */     if (!super.handleConsole(console)) {
/*  89 */       return false;
/*     */     }
/*     */     
/*  92 */     console.println(getMessage(".SelectComponentsDesc"));
/*     */     
/*  94 */     ComponentFolderConfig componentRoot = InstallerConfig.getCurrentInstance().getComponentRoot();
/*  95 */     ComponentConsoleState componentConsoleState = new ComponentConsoleState();
/*  96 */     printFolder(console, componentRoot, componentConsoleState, "");
/*     */     
/*     */     while (true) {
/*  99 */       if (!componentConsoleState.helpIndexToComponentNodeConfig.isEmpty()) {
/* 100 */         StringBuilder buffer = new StringBuilder();
/* 101 */         for (Integer index : componentConsoleState.helpIndexToComponentNodeConfig.keySet()) {
/* 102 */           if (buffer.length() > 0) {
/* 103 */             buffer.append(", ");
/*     */           }
/* 105 */           buffer.append("*");
/* 106 */           buffer.append(index);
/*     */         } 
/*     */         
/* 109 */         console.println(Messages.format(getMessage(".ConsoleComponentHelpLabel"), new Object[] { buffer.toString() }));
/*     */       } 
/* 111 */       String answer = console.askString(getMessage(".ConsoleMultipleSelectionLabel"), componentConsoleState.defaultConsoleSelection);
/*     */       try {
/* 113 */         if (answer.startsWith("*")) {
/* 114 */           ComponentNodeConfig config = getConfigForIndex(answer.substring(1), componentConsoleState.helpIndexToComponentNodeConfig);
/* 115 */           console.println();
/* 116 */           console.println(config.getName() + ": " + config.getDescription());
/* 117 */           console.println();
/*     */           continue;
/*     */         } 
/* 120 */         if (Objects.equals(answer, "\"\"")) {
/* 121 */           answer = "";
/*     */         }
/*     */         
/* 124 */         Set<ComponentNodeConfig> selectedComponents = new HashSet<>();
/* 125 */         for (StringTokenizer stringTokenizer = new StringTokenizer(answer, ","); stringTokenizer.hasMoreTokens(); ) {
/* 126 */           String token = stringTokenizer.nextToken().trim();
/* 127 */           if (!Objects.equals(token.toLowerCase(Locale.ENGLISH), "x")) {
/* 128 */             ComponentNodeConfig config = getConfigForIndex(token, componentConsoleState.indexToComponentNodeConfig);
/* 129 */             selectedComponents.add(config);
/*     */           } 
/*     */         } 
/* 132 */         selectedComponents.addAll(componentConsoleState.mandatoryComponents);
/* 133 */         componentRoot.setSelected(false);
/* 134 */         updateTree(selectedComponents, componentRoot);
/* 135 */         return true;
/*     */       }
/* 137 */       catch (NumberFormatException numberFormatException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private String getMessage(String messageKey) {
/* 144 */     return getContext().getMessage(messageKey);
/*     */   }
/*     */   
/*     */   private ComponentNodeConfig getConfigForIndex(String numberString, Map<Integer, ComponentNodeConfig> indexToComponentNodeConfig) throws NumberFormatException {
/* 148 */     int number = Integer.parseInt(numberString);
/* 149 */     ComponentNodeConfig config = indexToComponentNodeConfig.get(Integer.valueOf(number));
/* 150 */     if (config == null) {
/* 151 */       throw new NumberFormatException("not available");
/*     */     }
/* 153 */     return config;
/*     */   }
/*     */   
/*     */   private void updateTree(Set<ComponentNodeConfig> selectedComponents, ComponentFolderConfig folderConfig) {
/* 157 */     folderConfig.setBlockStateChanges(true);
/* 158 */     for (int i = 0; i < folderConfig.getComponents().size(); i++) {
/* 159 */       ComponentNodeConfig childConfig = folderConfig.getComponents().get(i);
/* 160 */       childConfig.setSelected((selectedComponents.contains(childConfig) || folderConfig.isIncluded()));
/* 161 */       if (childConfig instanceof ComponentFolderConfig) {
/* 162 */         updateTree(selectedComponents, (ComponentFolderConfig)childConfig);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void printFolder(Console console, ComponentFolderConfig folderConfig, ComponentConsoleState componentConsoleState, String prefix) {
/* 168 */     for (int i = 0; i < folderConfig.getComponents().size(); i++) {
/* 169 */       ComponentNodeConfig childConfig = folderConfig.getComponents().get(i);
/* 170 */       printNode(componentConsoleState, childConfig, console, prefix);
/* 171 */       if (childConfig instanceof ComponentFolderConfig) {
/* 172 */         printFolder(console, (ComponentFolderConfig)childConfig, componentConsoleState, prefix + "      ");
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void printNode(ComponentConsoleState componentConsoleState, ComponentNodeConfig nodeConfig, Console console, String prefix) {
/* 178 */     if (nodeConfig.isHidden()) {
/* 179 */       if (nodeConfig.isSelected()) {
/* 180 */         componentConsoleState.mandatoryComponents.add(nodeConfig);
/*     */       }
/*     */       return;
/*     */     } 
/* 184 */     boolean unchangeableNode = (nodeConfig instanceof ComponentConfig && !((ComponentConfig)nodeConfig).isChangeable());
/* 185 */     if (!unchangeableNode || nodeConfig.isSelected()) {
/* 186 */       console.print(prefix + (unchangeableNode ? "X" : String.valueOf(componentConsoleState.index)) + ": " + nodeConfig.getName());
/* 187 */       if (!nodeConfig.getDescription().isEmpty()) {
/* 188 */         console.print(" [*" + componentConsoleState.index + "]");
/* 189 */         componentConsoleState.helpIndexToComponentNodeConfig.put(Integer.valueOf(componentConsoleState.index), nodeConfig);
/*     */       } 
/* 191 */       console.println();
/* 192 */       if (nodeConfig instanceof ComponentFolderConfig) {
/* 193 */         nodeConfig.setSelected(false);
/*     */       }
/* 195 */       if (unchangeableNode) {
/* 196 */         componentConsoleState.mandatoryComponents.add(nodeConfig);
/*     */       } else {
/* 198 */         if (nodeConfig.isSelected()) {
/* 199 */           if (componentConsoleState.defaultConsoleSelection == null) {
/* 200 */             componentConsoleState.defaultConsoleSelection = "";
/*     */           } else {
/* 202 */             componentConsoleState.defaultConsoleSelection += ",";
/*     */           } 
/* 204 */           componentConsoleState.defaultConsoleSelection += componentConsoleState.index;
/*     */         } 
/* 206 */         componentConsoleState.indexToComponentNodeConfig.put(Integer.valueOf(componentConsoleState.index), nodeConfig);
/*     */       } 
/* 208 */       componentConsoleState.index++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 214 */     this.tree = new InstallationComponentTree(this);
/* 215 */     this.scpTree = new JScrollPane((Component)this.tree);
/* 216 */     return this.scpTree;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/* 221 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/* 226 */     return isFillVertical();
/*     */   }
/*     */   
/*     */   public void nodeToggled() {
/* 230 */     InstallationDirectoryChooserComponent installationDirectoryChooserComponent = (InstallationDirectoryChooserComponent)getFormEnvironment().getFirstFormComponent(InstallationDirectoryChooserComponent.class);
/* 231 */     if (installationDirectoryChooserComponent != null) {
/* 232 */       installationDirectoryChooserComponent.update();
/*     */     }
/*     */   }
/*     */   
/*     */   public void selectionChanged(ComponentNode componentNode, boolean dependency) {
/* 237 */     ComponentNodeConfig componentNodeConfig = componentNode.getComponentNodeConfig();
/* 238 */     if (componentNodeConfig instanceof ComponentConfig) {
/* 239 */       ComponentConfig componentConfig = (ComponentConfig)componentNodeConfig;
/* 240 */       Context context = getContext();
/* 241 */       InstallationComponentSetup installationComponentSetup = context.getInstallationComponentById(componentConfig.getId());
/*     */       try {
/* 243 */         context.runScript(getSelectionChangedScript(), (Bean)this, new Object[] { installationComponentSetup, Boolean.valueOf(dependency) });
/* 244 */       } catch (Exception e) {
/* 245 */         Util.printAnnotatedStackTrace(e);
/* 246 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private static class ComponentConsoleState { private ComponentConsoleState() {}
/*     */     
/* 252 */     public int index = 1;
/*     */     public String defaultConsoleSelection;
/* 254 */     public Map<Integer, ComponentNodeConfig> indexToComponentNodeConfig = new LinkedHashMap<>();
/* 255 */     public Map<Integer, ComponentNodeConfig> helpIndexToComponentNodeConfig = new LinkedHashMap<>();
/* 256 */     public Set<ComponentNodeConfig> mandatoryComponents = new HashSet<>(); }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ComponentSelectorComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */