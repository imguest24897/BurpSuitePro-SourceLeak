/*     */ package com.install4j.runtime.installer.config;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class ComponentConfig extends ComponentNodeConfig {
/*     */   private boolean includesAll;
/*     */   private boolean changeable;
/*     */   
/*     */   public static String getUninstallerFilename() {
/*  12 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  13 */     List<LauncherConfig> launchers = config.getLaunchers();
/*  14 */     for (LauncherConfig launcherConfig : launchers) {
/*  15 */       if (launcherConfig.isUninstaller()) {
/*  16 */         return launcherConfig.getFile();
/*     */       }
/*     */     } 
/*  19 */     return "";
/*     */   }
/*     */   private boolean downloaded; private boolean initiallySelected;
/*     */   public static boolean isIncludedInSelectedComponents(String fileName) {
/*  23 */     fileName = fileName.replace('\\', '/');
/*     */     
/*  25 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  26 */     if (Objects.equals(config.getType(), "macos") && config.getMacSpecificConfig().isSingleBundle()) {
/*  27 */       String appDir = config.getMacSpecificConfig().getRuntimeDirParent().trim();
/*  28 */       if (fileName.startsWith(appDir)) {
/*  29 */         fileName = fileName.substring(appDir.length());
/*     */       } else {
/*  31 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/*  35 */     if (fileName.startsWith(".install4j")) {
/*  36 */       return true;
/*     */     }
/*     */     
/*  39 */     String uninstallerFilename = getUninstallerFilename().trim();
/*  40 */     if (uninstallerFilename.length() > 0 && (fileName
/*  41 */       .equals(uninstallerFilename) || fileName.startsWith(uninstallerFilename + ".app")))
/*     */     {
/*  43 */       return true;
/*     */     }
/*     */     
/*  46 */     List<ComponentConfig> components = config.getComponents();
/*  47 */     if (components.size() == 0) {
/*  48 */       return true;
/*     */     }
/*     */     
/*  51 */     for (ComponentConfig componentConfig : components) {
/*  52 */       if (!componentConfig.isSelected())
/*     */         continue; 
/*  54 */       if (componentConfig.isIncludesAll())
/*  55 */         return true; 
/*  56 */       if (isIncludedInComponent(fileName, componentConfig)) {
/*  57 */         return true;
/*     */       }
/*     */     } 
/*  60 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isIncludedInComponent(String fileName, ComponentConfig componentConfig) {
/*  65 */     for (String location : componentConfig.getLocations()) {
/*  66 */       if (isInFileset(location, fileName))
/*  67 */         return true; 
/*  68 */       if (isEqualOrContained(location, fileName) || (InstallerUtil.isMacOS() && isEqualOrContained(location + ".app", fileName))) {
/*  69 */         return true;
/*     */       }
/*     */     } 
/*  72 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean isEqualOrContained(String location, String fileName) {
/*  76 */     return (Objects.equals(location, fileName) || fileName.startsWith(location + "/") || (
/*  77 */       Objects.equals(location, ".") && !fileName.startsWith(".i4j_")));
/*     */   }
/*     */   public static boolean isInFileset(String location, String fileName) {
/*     */     String fileFileSet;
/*  81 */     if (!location.startsWith(".i4j_fileset_")) {
/*  82 */       return false;
/*     */     }
/*  84 */     String locationFileSet = location.substring(".i4j_fileset_".length());
/*     */ 
/*     */     
/*  87 */     if (fileName.startsWith(".i4j_external_")) {
/*  88 */       int rootEnd = fileName.indexOf('/');
/*  89 */       String root = fileName.substring(".i4j_external_".length(), 
/*  90 */           (rootEnd == -1) ? fileName.length() : rootEnd);
/*  91 */       fileFileSet = InstallerConfig.getCurrentInstance().getFilesetForRootId(root);
/*     */     } else {
/*  93 */       fileFileSet = "";
/*     */     } 
/*     */     
/*  96 */     return Objects.equals(locationFileSet, fileFileSet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   private List<String> locations = new ArrayList<>();
/* 105 */   private List<String> dependencies = new ArrayList<>();
/*     */   
/* 107 */   private Set<ComponentConfig> dependencyOrigins = new HashSet<>();
/*     */   
/*     */   public ComponentConfig(ComponentNodeConfig parent) {
/* 110 */     super(parent);
/*     */   }
/*     */   
/*     */   public boolean isIncludesAll() {
/* 114 */     return this.includesAll;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isSelected() {
/* 119 */     return (super.isSelected() || this.dependencyOrigins.size() > 0);
/*     */   }
/*     */   
/*     */   public boolean isInitiallySelected() {
/* 123 */     return this.initiallySelected;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSelected(boolean selected) {
/* 128 */     super.setSelected(selected);
/* 129 */     notifyDependentComponents(InstallerConfig.getCurrentInstance());
/*     */   }
/*     */   
/*     */   public void notifyDependentComponents(InstallerConfig installerConfig) {
/* 133 */     for (String dependency : this.dependencies) {
/* 134 */       ComponentConfig dependentComponent = installerConfig.getComponentById(dependency);
/* 135 */       if (dependentComponent != null) {
/* 136 */         if (isSelected()) {
/* 137 */           dependentComponent.addDependencyOrigin(this, installerConfig); continue;
/*     */         } 
/* 139 */         dependentComponent.removeDependencyOrigin(this, installerConfig);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void addDependencyOrigin(ComponentConfig dependencyOrigin, InstallerConfig installerConfig) {
/* 146 */     boolean oldSelected = isSelected();
/* 147 */     this.dependencyOrigins.add(dependencyOrigin);
/* 148 */     if (isSelected() != oldSelected) {
/* 149 */       fireSelectionChanged();
/*     */     }
/* 151 */     notifyDependentComponents(installerConfig);
/*     */   }
/*     */   
/*     */   private void removeDependencyOrigin(ComponentConfig dependencyOrigin, InstallerConfig installerConfig) {
/* 155 */     boolean oldSelected = isSelected();
/* 156 */     this.dependencyOrigins.remove(dependencyOrigin);
/* 157 */     if (isSelected() != oldSelected) {
/* 158 */       fireSelectionChanged();
/*     */     }
/* 160 */     notifyDependentComponents(installerConfig);
/*     */   }
/*     */   
/*     */   public boolean isMandatory() {
/* 164 */     return (this.dependencyOrigins.size() > 0);
/*     */   }
/*     */   
/*     */   public boolean isChangeable() {
/* 168 */     return this.changeable;
/*     */   }
/*     */   
/*     */   public void setChangeable(boolean changeable) {
/* 172 */     boolean oldChangeable = this.changeable;
/* 173 */     this.changeable = changeable;
/* 174 */     if (changeable != oldChangeable) {
/* 175 */       fireChangeableChanged();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isDownloaded() {
/* 180 */     return this.downloaded;
/*     */   }
/*     */   
/*     */   public List<String> getLocations() {
/* 184 */     return this.locations;
/*     */   }
/*     */   
/*     */   public List<String> getDependencies() {
/* 188 */     return this.dependencies;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/* 193 */     super.read(element);
/*     */     
/* 195 */     this.initiallySelected = isSelected();
/*     */     
/* 197 */     this.includesAll = readAttribute(element, "allIncluded", this.includesAll);
/* 198 */     this.changeable = readAttribute(element, "changeable", this.changeable);
/* 199 */     this.downloaded = readAttribute(element, "downloaded", this.downloaded);
/*     */     
/* 201 */     for (Element childElement : childElements(element)) {
/* 202 */       String elementName = childElement.getTagName();
/* 203 */       if (Objects.equals(elementName, "entry")) {
/* 204 */         String location = readAttribute(childElement, "location", "").replace('\\', '/');
/* 205 */         this.locations.add(location); continue;
/* 206 */       }  if (Objects.equals(elementName, "dependsOn")) {
/* 207 */         String id = readAttribute(childElement, "id", "");
/* 208 */         this.dependencies.add(id);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 215 */     return getName() + "[" + getId() + "]; Selected: " + isSelected();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ComponentConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */