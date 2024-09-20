/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.util.Objects;
/*     */ import java.util.WeakHashMap;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ComponentNodeConfig
/*     */   extends AbstractNameAndIdConfig
/*     */ {
/*     */   private ComponentNodeConfig parent;
/*     */   private boolean selected = true;
/*  17 */   private String description = "";
/*     */   
/*     */   private boolean displayDescription;
/*     */   private boolean hideHelpButton = true;
/*     */   private boolean hidden;
/*  22 */   private transient WeakHashMap<ComponentChangeListener, Object> listeners = new WeakHashMap<>();
/*     */   private transient Boolean initialDisplayDescription;
/*     */   
/*     */   protected ComponentNodeConfig(ComponentNodeConfig parent) {
/*  26 */     this.parent = parent;
/*  27 */     this.displayDescription = getDefaultDisplayDescriptionValue();
/*     */   }
/*     */   
/*     */   public boolean isSelected() {
/*  31 */     return this.selected;
/*     */   }
/*     */   
/*     */   public void setSelected(boolean selected) {
/*  35 */     boolean oldSelected = this.selected;
/*  36 */     this.selected = selected;
/*  37 */     if (oldSelected != selected) {
/*  38 */       fireSelectionChanged();
/*     */     }
/*     */   }
/*     */   
/*     */   public String getDescription() {
/*  43 */     return InstallerVariables.replaceVariables(this.description);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDescription(String description) {
/*  48 */     this.description = description;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDisplayDescription() {
/*  53 */     return this.displayDescription;
/*     */   }
/*     */   
/*     */   public void setDisplayDescription(boolean displayDescription) {
/*  57 */     this.displayDescription = displayDescription;
/*  58 */     if (this.initialDisplayDescription == null) {
/*  59 */       this.initialDisplayDescription = Boolean.valueOf(displayDescription);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isHideHelpButton() {
/*  64 */     return this.hideHelpButton;
/*     */   }
/*     */   
/*     */   public void setHideHelpButton(boolean hideHelpButton) {
/*  68 */     this.hideHelpButton = hideHelpButton;
/*     */   }
/*     */   
/*     */   public boolean isHidden() {
/*  72 */     return this.hidden;
/*     */   }
/*     */   
/*     */   public void setHidden(boolean hidden) {
/*  76 */     boolean oldHidden = this.hidden;
/*  77 */     this.hidden = hidden;
/*  78 */     if (hidden != oldHidden) {
/*  79 */       fireHiddenChanged();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isIncluded() {
/*  85 */     return (isSelected() || (this.parent != null && this.parent.isIncluded()));
/*     */   }
/*     */   
/*     */   protected boolean getDefaultDisplayDescriptionValue() {
/*  89 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/*  94 */     super.read(element);
/*     */     
/*  96 */     this.selected = readAttribute(element, "selected", this.selected);
/*  97 */     this.displayDescription = readAttribute(element, "displayDescription", this.displayDescription);
/*  98 */     this.initialDisplayDescription = Boolean.valueOf(this.displayDescription);
/*  99 */     this.hideHelpButton = readAttribute(element, "hideHelpButton", this.hideHelpButton);
/* 100 */     this.hidden = readAttribute(element, "hidden", this.hidden);
/*     */     
/* 102 */     for (Element childElement : childElements(element)) {
/* 103 */       String elementName = childElement.getTagName();
/* 104 */       if (Objects.equals(elementName, "description")) {
/* 105 */         this.description = XmlHelper.getTextValue(childElement);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void addComponentChangeListener(ComponentChangeListener changeListener) {
/* 111 */     this.listeners.put(changeListener, null);
/*     */   }
/*     */   
/*     */   protected void fireSelectionChanged() {
/* 115 */     for (ComponentChangeListener listener : this.listeners.keySet()) {
/* 116 */       if (listener != null) {
/* 117 */         listener.selectionChanged(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void fireChangeableChanged() {
/* 123 */     for (ComponentChangeListener listener : this.listeners.keySet()) {
/* 124 */       if (listener != null) {
/* 125 */         listener.changeableChanged(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void fireHiddenChanged() {
/* 131 */     for (ComponentChangeListener listener : this.listeners.keySet()) {
/* 132 */       if (listener != null) {
/* 133 */         listener.hiddenChanged(this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInitialDisplayDescription() {
/* 140 */     if (this.initialDisplayDescription == null) {
/* 141 */       return getDefaultDisplayDescriptionValue();
/*     */     }
/* 143 */     return this.initialDisplayDescription.booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isHelpButtonVisible() {
/* 148 */     return (getDescription().trim().length() > 0 && (!isHideHelpButton() || !isInitialDisplayDescription()));
/*     */   }
/*     */   
/*     */   public static interface ComponentChangeListener {
/*     */     void selectionChanged(ComponentNodeConfig param1ComponentNodeConfig);
/*     */     
/*     */     void changeableChanged(ComponentNodeConfig param1ComponentNodeConfig);
/*     */     
/*     */     void hiddenChanged(ComponentNodeConfig param1ComponentNodeConfig);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ComponentNodeConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */