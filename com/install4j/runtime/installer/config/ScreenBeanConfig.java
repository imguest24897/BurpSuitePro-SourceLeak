/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.screens.BackButtonType;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.io.File;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class ScreenBeanConfig extends FormComponentContainerBeanConfig {
/*     */   private Screen instance;
/*  19 */   private String preActivationClassName = ""; private List<AbstractBeanConfig> actionConfigs;
/*  20 */   private String postActivationClassName = "";
/*  21 */   private String validationClassName = "";
/*  22 */   private BackButtonType backButtonType = BackButtonType.SAFE;
/*     */   private boolean finishScreen = false;
/*  24 */   private int wizardIndexChangeType = 1;
/*  25 */   private String wizardIndexKey = "";
/*  26 */   private String styleId = "";
/*     */   private WizardIndex wizardIndex;
/*     */   
/*     */   public Screen getOrInstantiateScreen(boolean suppressErrors) {
/*  30 */     if (this.instance == null) {
/*  31 */       this.instance = (Screen)instantiateBean(suppressErrors);
/*     */     }
/*  33 */     return this.instance;
/*     */   }
/*     */   
/*     */   public BackButtonType getBackButtonType() {
/*  37 */     return this.backButtonType;
/*     */   }
/*     */   
/*     */   public boolean isFinishScreen() {
/*  41 */     return this.finishScreen;
/*     */   }
/*     */   
/*     */   public String getPreActivationClassName() {
/*  45 */     return this.preActivationClassName;
/*     */   }
/*     */   
/*     */   public String getPostActivationClassName() {
/*  49 */     return this.postActivationClassName;
/*     */   }
/*     */   
/*     */   public String getValidationClassName() {
/*  53 */     return this.validationClassName;
/*     */   }
/*     */   
/*     */   public List<AbstractBeanConfig> getActionConfigs() {
/*  57 */     return this.actionConfigs;
/*     */   }
/*     */   
/*     */   public int getWizardIndexChangeType() {
/*  61 */     return this.wizardIndexChangeType;
/*     */   }
/*     */   
/*     */   public String getWizardIndexKey() {
/*  65 */     return this.wizardIndexKey;
/*     */   }
/*     */   
/*     */   public String getStyleId() {
/*  69 */     return this.styleId;
/*     */   }
/*     */   
/*     */   public WizardIndex getWizardIndex() {
/*  73 */     return this.wizardIndex;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInstantiated() {
/*  78 */     return (this.instance != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void clearInstance() {
/*  83 */     this.instance = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setBean(Bean bean) {
/*  88 */     this.instance = (Screen)bean;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/*  93 */     super.read(element);
/*     */     
/*  95 */     this.backButtonType = readAttribute(element, "backButtonType", this.backButtonType);
/*  96 */     this.finishScreen = readAttribute(element, "finishScreen", this.finishScreen);
/*  97 */     this.validationClassName = readAttribute(element, "validationClass", this.validationClassName);
/*  98 */     this.preActivationClassName = readAttribute(element, "preActivationClass", this.preActivationClassName);
/*  99 */     this.postActivationClassName = readAttribute(element, "postActivationClass", this.postActivationClassName);
/* 100 */     this.wizardIndexChangeType = readAttribute(element, "wizardIndexChangeType", this.wizardIndexChangeType);
/* 101 */     this.wizardIndexKey = readAttribute(element, "wizardIndexKey", this.wizardIndexKey);
/* 102 */     this.styleId = readAttribute(element, "styleId", this.styleId);
/* 103 */     readWizardIndex(element);
/*     */     
/* 105 */     readActionConfigs(element);
/*     */   }
/*     */   
/*     */   private void readActionConfigs(Element element) {
/* 109 */     List<AbstractBeanConfig> actionConfigs = new LinkedList<>();
/*     */     
/* 111 */     Element actionsElement = findChild(element, "actions");
/*     */     
/* 113 */     if (actionsElement != null) {
/* 114 */       for (Element beanElement : childElements(actionsElement)) {
/* 115 */         AbstractBeanConfig beanConfig = readNestedBeanConfig(beanElement);
/* 116 */         if (beanConfig != null) {
/* 117 */           actionConfigs.add(beanConfig);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 122 */     this.actionConfigs = Collections.unmodifiableList(actionConfigs);
/*     */   }
/*     */   
/*     */   private void readWizardIndex(Element element) {
/* 126 */     Element wizardElement = XmlHelper.findChild(element, "wizardIndex");
/* 127 */     if (wizardElement == null) {
/*     */       return;
/*     */     }
/*     */     
/* 131 */     LinkedHashMap<String, String> steps = readWizardSteps(wizardElement);
/* 132 */     int stepCount = steps.size();
/* 133 */     if (stepCount == 0) {
/*     */       return;
/*     */     }
/* 136 */     String[] keys = new String[stepCount];
/* 137 */     String[] stepNames = new String[stepCount];
/* 138 */     int i = 0;
/* 139 */     for (Map.Entry<String, String> entry : steps.entrySet()) {
/* 140 */       keys[i] = entry.getKey();
/* 141 */       stepNames[i] = entry.getValue();
/* 142 */       i++;
/*     */     } 
/*     */     
/* 145 */     this.wizardIndex = new WizardIndex(stepNames, keys);
/* 146 */     this.wizardIndex.partiallyDefined(readAttribute(wizardElement, "partiallyDefined", this.wizardIndex.isPartiallyDefined()));
/*     */     
/* 148 */     this.wizardIndex.maxWidth(readAttribute(wizardElement, "maxWidth", this.wizardIndex.getMaxWidth()));
/* 149 */     this.wizardIndex.minWidth(readAttribute(wizardElement, "minWidth", this.wizardIndex.getMinWidth()));
/* 150 */     this.wizardIndex.numbered(readAttribute(wizardElement, "numbered", this.wizardIndex.isNumbered()));
/* 151 */     this.wizardIndex.background(readAttribute(wizardElement, "background", this.wizardIndex.getBackground()));
/* 152 */     this.wizardIndex.foreground(readAttribute(wizardElement, "foreground", this.wizardIndex.getForeground()));
/* 153 */     String backgroundImage = readFileAttribute(wizardElement, "backgroundImage", null);
/* 154 */     if (backgroundImage != null && backgroundImage.length() > 0) {
/* 155 */       this.wizardIndex.backgroundImage(new File(backgroundImage));
/*     */     }
/* 157 */     Anchor anchor = Anchor.getByValue(readAttribute(wizardElement, "backgroundImageAnchor", this.wizardIndex.getBackgroundImageAnchor().getValue()));
/* 158 */     if (anchor != null) {
/* 159 */       this.wizardIndex.backgroundImageAnchor(anchor);
/*     */     }
/* 161 */     String initialKey = readAttribute(wizardElement, "initialKey", "");
/* 162 */     if (initialKey.length() > 0) {
/* 163 */       this.wizardIndex.initialKey(initialKey);
/*     */     }
/*     */   }
/*     */   
/*     */   private LinkedHashMap<String, String> readWizardSteps(Element wizardElement) {
/* 168 */     Element stepsElement = XmlHelper.findChild(wizardElement, "steps");
/* 169 */     LinkedHashMap<String, String> steps = new LinkedHashMap<>();
/* 170 */     if (stepsElement != null) {
/* 171 */       for (Element stepElement : childElements(stepsElement)) {
/* 172 */         String key = readAttribute(stepElement, "key", "");
/* 173 */         String name = readAttribute(stepElement, "name", "");
/* 174 */         if (key.length() > 0 && name.length() > 0) {
/* 175 */           steps.put(key, name);
/*     */         }
/*     */       } 
/*     */     }
/* 179 */     return steps;
/*     */   }
/*     */ 
/*     */   
/*     */   public void addAllTo(Map<String, AbstractBeanConfig> id2BeanConfig) {
/* 184 */     super.addAllTo(id2BeanConfig);
/*     */     
/* 186 */     for (AbstractBeanConfig actionConfig : this.actionConfigs)
/* 187 */       actionConfig.addAllTo(id2BeanConfig); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ScreenBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */