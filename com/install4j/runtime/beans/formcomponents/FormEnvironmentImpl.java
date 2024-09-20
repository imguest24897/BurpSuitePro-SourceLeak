/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.api.beans.UndefinedVariableException;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.ComponentTuple;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.GroupType;
/*     */ import com.install4j.api.formcomponents.LayoutGroup;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.groups.TabGroup;
/*     */ import com.install4j.runtime.beans.screens.components.ScrollablePanel;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.VariableReplacer;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import com.install4j.runtime.installer.frontend.LayoutGroupImpl;
/*     */ import com.install4j.runtime.util.ObjectUtil;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.awt.Component;
/*     */ import java.awt.Rectangle;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.event.ChangeListener;
/*     */ 
/*     */ public class FormEnvironmentImpl implements FormEnvironment, VariableReplacer {
/*     */   private FormPanel formPanel;
/*     */   private FormComponent[] formComponents;
/*     */   private String[] ids;
/*  34 */   private Map<String, Object> formVariables = Collections.synchronizedMap(new TreeMap<>()); private String[] displayedIds; private ComponentTuple[] componentTuples; private List formComponentTree;
/*     */   private List<String> replacementRecording;
/*  36 */   private FormEnvironmentTextBinder textBinder = new FormEnvironmentTextBinder(this);
/*     */   private boolean initialized;
/*     */   
/*     */   public FormEnvironmentImpl(FormPanel formPanel, FormComponent[] formComponents, String[] ids, String[] displayedIds, ComponentTuple[] componentTuples, List beanConfigs, boolean initialized) {
/*  40 */     this.formPanel = formPanel;
/*  41 */     this.formComponents = formComponents;
/*  42 */     this.ids = ids;
/*  43 */     this.displayedIds = displayedIds;
/*  44 */     this.componentTuples = componentTuples;
/*  45 */     this.formComponentTree = LayoutGroupImpl.createChildren(beanConfigs);
/*  46 */     this.initialized = initialized;
/*     */   }
/*     */ 
/*     */   
/*     */   public FormComponent[] getFormComponents() {
/*  51 */     return this.formComponents;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<?> getFormComponentTree() {
/*  56 */     return this.formComponentTree;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getId(FormComponent formComponent) {
/*  61 */     int index = getIndex((Object[])this.formComponents, formComponent);
/*  62 */     if (index < 0) {
/*  63 */       return null;
/*     */     }
/*  65 */     return this.displayedIds[index];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T[] getFormComponents(Class<T> formComponentClass) {
/*  71 */     List<T> formComponents = new ArrayList<>();
/*  72 */     for (FormComponent formComponent : getFormComponents()) {
/*  73 */       if (formComponentClass.isAssignableFrom(formComponent.getClass())) {
/*  74 */         formComponents.add(formComponentClass.cast(formComponent));
/*     */       }
/*     */     } 
/*  77 */     return (T[])ObjectUtil.toTypedArray(formComponents, formComponentClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T getFirstFormComponent(Class<T> formComponentClass) throws NotSupportedInElevationException {
/*  82 */     for (FormComponent formComponent : this.formComponents) {
/*  83 */       if (formComponentClass.isAssignableFrom(formComponent.getClass())) {
/*  84 */         return formComponentClass.cast(formComponent);
/*     */       }
/*     */     } 
/*  87 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public FormComponent getFormComponentById(String id) {
/*  92 */     int index = getIndex((Object[])this.ids, id);
/*  93 */     if (index < 0) {
/*  94 */       index = getIndex((Object[])this.displayedIds, id);
/*     */     }
/*  96 */     if (index < 0) {
/*  97 */       return null;
/*     */     }
/*  99 */     return this.formComponents[index];
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LayoutGroup getLayoutGroupById(String id) {
/* 105 */     return LayoutGroupImpl.findLayoutGroupById(id, this.formComponentTree);
/*     */   }
/*     */ 
/*     */   
/*     */   public ComponentTuple getComponentTuple(FormComponent formComponent) {
/* 110 */     int index = getIndex((Object[])this.formComponents, formComponent);
/* 111 */     if (index < 0) {
/* 112 */       return null;
/*     */     }
/* 114 */     return this.componentTuples[index];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void scrollComponentToVisible(FormComponent formComponent) {
/* 121 */     EventQueue.invokeLater(() -> {
/*     */           ComponentTuple componentTuple = getComponentTuple(formComponent);
/*     */           JComponent c = componentTuple.getCenterComponent();
/*     */           if (c == null) {
/*     */             return;
/*     */           }
/*     */           ScrollablePanel panel = (ScrollablePanel)SwingUtilities.getAncestorOfClass(ScrollablePanel.class, c);
/*     */           if (panel == null) {
/*     */             return;
/*     */           }
/*     */           Rectangle rect = SwingUtilities.convertRectangle(c.getParent(), c.getBounds(), (Component)panel);
/*     */           c.scrollRectToVisible(rect);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDesignTime() {
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addDesignTimeChangeListener(ChangeListener changeListener) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeDesignTimeChangeListener(ChangeListener changeListener) {}
/*     */ 
/*     */   
/*     */   public String getDesignTimeName(FormComponent formComponent) {
/* 151 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDesignTimeName(LayoutGroup layoutGroup) {
/* 156 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen getScreen() {
/* 161 */     return this.formPanel.getScreen();
/*     */   }
/*     */ 
/*     */   
/*     */   public void resetFormComponents() {
/* 166 */     this.formPanel.previous();
/*     */   }
/*     */ 
/*     */   
/*     */   public void reinitializeFormComponents() {
/* 171 */     this.formPanel.reinitializeComponents();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean saveFormComponents() {
/* 176 */     return this.formPanel.checkCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public void makeParentGroupVisible(FormComponent formComponent) {
/* 181 */     makeParentGroupVisible(formComponent, this.formComponentTree);
/*     */   }
/*     */ 
/*     */   
/*     */   public void bindTextWithVariables(String textWithVariables, JComponent componentWithText) {
/* 186 */     this.textBinder.bind(textWithVariables, componentWithText);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getFormVariable(String variableName) {
/* 191 */     if (this.replacementRecording != null) {
/* 192 */       this.replacementRecording.add("form:" + variableName);
/*     */     }
/* 194 */     return this.formVariables.get(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormVariable(String variableName, Object value) {
/* 199 */     this.formVariables.put(variableName, value);
/* 200 */     this.textBinder.formVariableChanged(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<String> getFormVariableNames() {
/* 205 */     return new HashSet<>(this.formVariables.keySet());
/*     */   }
/*     */ 
/*     */   
/*     */   public String replaceFormVariables(String value, ReplacementMode replacementMode, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/* 210 */     String formVariablesReplacedText = replaceFormVariablesOnly(value, errorHandlingDescriptor);
/* 211 */     return InstallerVariables.replaceVariables(formVariablesReplacedText, replacementMode, errorHandlingDescriptor);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInitialized() {
/* 216 */     return this.initialized;
/*     */   }
/*     */   
/*     */   public String replaceFormVariablesOnly(String value, VariableErrorHandlingDescriptor variableErrorHandlingDescriptor) {
/* 220 */     if (value == null) {
/* 221 */       return null;
/*     */     }
/* 223 */     return StringUtil.replaceVariable(value, "${form:", "}", (token, memento, hasFallback) -> {
/*     */           String value1 = getStringFormVariable(token);
/*     */           return (value1 == null) ? InstallerVariables.handleError("form variable", "form:" + token, token, variableErrorHandlingDescriptor.getFormVariables()) : value1;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String getStringFormVariable(String variableName) {
/* 235 */     Object value = getFormVariable(variableName);
/* 236 */     return (value == null) ? null : value.toString();
/*     */   }
/*     */   
/*     */   public FormPanel getFormPanel() {
/* 240 */     return this.formPanel;
/*     */   }
/*     */   
/*     */   private boolean makeParentGroupVisible(FormComponent formComponent, List<?> components) {
/* 244 */     for (Object bean : components) {
/* 245 */       if (bean instanceof LayoutGroup) {
/* 246 */         LayoutGroupImpl layoutGroup = (LayoutGroupImpl)bean;
/* 247 */         boolean found = makeParentGroupVisible(formComponent, layoutGroup.getChildren());
/* 248 */         if (found && layoutGroup.getGroupType() == GroupType.SINGLE_TAB) {
/* 249 */           ((TabGroup)layoutGroup.getGroup()).makeTabVisible();
/*     */         }
/* 251 */         if (found)
/* 252 */           return true;  continue;
/*     */       } 
/* 254 */       if (bean == formComponent) {
/* 255 */         return true;
/*     */       }
/*     */     } 
/* 258 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 263 */     return this.formPanel.handleConsole(console);
/*     */   }
/*     */   
/*     */   public void setReplacementRecording(List<String> replacementRecording) {
/* 267 */     this.replacementRecording = replacementRecording;
/*     */   }
/*     */   
/*     */   protected int getIndex(Object[] items, Object target) {
/* 271 */     for (int i = 0; i < items.length; i++) {
/* 272 */       if (items[i] == target || items[i].equals(target)) {
/* 273 */         return i;
/*     */       }
/*     */     } 
/*     */     
/* 277 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getVariable(String variableName) {
/* 282 */     return getFormVariable(variableName);
/*     */   }
/*     */ 
/*     */   
/*     */   public String replaceVariables(String content, ReplacementMode replacementMode, VariableErrorHandlingDescriptor variableErrorHandlingDescriptor) {
/* 287 */     return replaceFormVariables(content, replacementMode, variableErrorHandlingDescriptor);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FormEnvironmentImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */