/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.VisualContainerBean;
/*     */ import com.install4j.api.context.ControlButtonType;
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.styles.StyleContextImpl;
/*     */ import com.install4j.runtime.beans.styles.StyleManagerImpl;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*     */ import com.install4j.runtime.installer.controller.GoBackCommand;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.util.ArrayList;
/*     */ import java.util.EnumMap;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.AbstractButton;
/*     */ import javax.swing.ButtonModel;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.SwingUtilities;
/*     */ 
/*     */ public class ScreenEnvelope extends WizardScreen implements ActionCallback {
/*     */   private WizardScreenExecutor wizard;
/*     */   private Screen screen;
/*     */   private String styleId;
/*  33 */   private EnumMap<ControlButtonType, Boolean> controlButtonEnabledStates = new EnumMap<>(ControlButtonType.class); private Style style; private JPanel contentComponent; private ScreenBeanConfig config; private FormPanel formPanel;
/*  34 */   private Map<FormComponent, Boolean> formComponentToEnabledStatus = new HashMap<>();
/*     */   private boolean actionsRunning;
/*     */   private IndexPanel indexPanel;
/*     */   
/*     */   public ScreenEnvelope(WizardScreenExecutor wizard, Screen screen, String styleId, ScreenBeanConfig config) {
/*  39 */     super(wizard);
/*  40 */     this.wizard = wizard;
/*  41 */     this.screen = screen;
/*  42 */     this.styleId = styleId;
/*  43 */     this.config = config;
/*  44 */     init();
/*     */   }
/*     */   
/*     */   protected ScreenEnvelope(Screen screen, String styleId) {
/*  48 */     super(null);
/*  49 */     this.screen = screen;
/*  50 */     this.styleId = styleId;
/*     */   }
/*     */   
/*     */   public FormPanel getFormPanel() {
/*  54 */     return this.formPanel;
/*     */   }
/*     */   
/*     */   protected void init() {
/*  58 */     for (ControlButtonType controlButtonType : ControlButtonType.values()) {
/*  59 */       this.controlButtonEnabledStates.put(controlButtonType, Boolean.valueOf(true));
/*     */     }
/*  61 */     initStyle();
/*  62 */     initFormPanel();
/*  63 */     initScreen();
/*  64 */     if (!this.screen.isCreateLazily()) {
/*  65 */       initContentComponent();
/*     */     }
/*     */   }
/*     */   
/*     */   private void initStyle() {
/*  70 */     this.style = (this.styleId != null) ? getStyleManager().cloneStyleById(this.styleId) : getStyleManager().getStyleById(this.styleId);
/*  71 */     if (this.style == null) {
/*  72 */       throw new IllegalStateException("No style with ID " + this.styleId + " could be found");
/*     */     }
/*     */   }
/*     */   
/*     */   protected void initFormPanel() {
/*  77 */     if (this.screen instanceof FormPanelContainer) {
/*  78 */       this.formPanel = createFormPanel();
/*  79 */       ((FormPanelContainer)this.screen).setFormPanel((JPanel)this.formPanel, this.formPanel.getFormEnvironment());
/*     */     } 
/*     */   }
/*     */   
/*     */   protected FormPanel createFormPanel() {
/*  84 */     return new FormPanel(this.config.getFormComponentConfigs(), (Context)this.wizard.getContext(), (Bean)this.screen, this);
/*     */   }
/*     */   
/*     */   public Screen getScreen() {
/*  88 */     return this.screen;
/*     */   }
/*     */ 
/*     */   
/*     */   public void formComponentEnabledChanged(FormComponent formComponent, boolean enabled) {
/*  93 */     if (this.actionsRunning) {
/*  94 */       this.formComponentToEnabledStatus.put(formComponent, Boolean.valueOf(enabled));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void actionsStarted() {
/* 101 */     List<FormComponent> disabledComponents = new ArrayList<>();
/* 102 */     if (this.formPanel != null) {
/* 103 */       FormComponent[] formComponents = this.formPanel.getFormEnvironment().getFormComponents();
/* 104 */       for (FormComponent formComponent : formComponents) {
/* 105 */         if (formComponent.hasUserInput()) {
/* 106 */           this.formComponentToEnabledStatus.put(formComponent, Boolean.valueOf(formComponent.isEnabled()));
/* 107 */           disabledComponents.add(formComponent);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 112 */     SwingUtilities.invokeLater(() -> {
/*     */           this.style.setControlButtonEnabled(ControlButtonType.NEXT, false);
/*     */           this.style.setControlButtonEnabled(ControlButtonType.PREVIOUS, false);
/*     */           for (FormComponent disabledComponent : disabledComponents) {
/*     */             disabledComponent.setEnabled(false);
/*     */           }
/*     */           this.actionsRunning = true;
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void actionsFinished() {
/* 125 */     SwingUtilities.invokeLater(() -> {
/*     */           this.actionsRunning = false;
/*     */           for (ControlButtonType controlButtonType : ControlButtonType.values()) {
/*     */             this.style.setControlButtonEnabled(controlButtonType, ((Boolean)this.controlButtonEnabledStates.get(controlButtonType)).booleanValue());
/*     */           }
/*     */           if (this.formPanel != null) {
/*     */             for (Map.Entry<FormComponent, Boolean> entry : this.formComponentToEnabledStatus.entrySet()) {
/*     */               ((FormComponent)entry.getKey()).setEnabled(((Boolean)entry.getValue()).booleanValue());
/*     */             }
/*     */             this.formComponentToEnabledStatus.clear();
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void activate() {
/* 143 */     initializeLazilyLoaded();
/*     */     
/* 145 */     applyConfiguredWizardIndex();
/*     */     
/* 147 */     ContextImpl context = this.wizard.getContext();
/* 148 */     context.runBooleanScript(this.config.getPreActivationClassName(), (Bean)this.screen, createScriptParameters());
/* 149 */     fillScreen();
/* 150 */     this.screen.willActivate();
/* 151 */     activateWizardIndex();
/* 152 */     if (this.formPanel != null) {
/* 153 */       this.formPanel.willActivate();
/*     */     }
/* 155 */     StyleManagerImpl styleManager = getStyleManager();
/* 156 */     styleManager.willActivate(this.style);
/* 157 */     super.activate();
/*     */     
/* 159 */     setControlButtonVisible(ControlButtonType.PREVIOUS, this.screen.isPreviousVisible());
/* 160 */     setControlButtonVisible(ControlButtonType.NEXT, (this.screen.isNextVisible() || isFinishScreen()));
/* 161 */     setControlButtonVisible(ControlButtonType.CANCEL, isCancelVisible());
/* 162 */     if (isFinishScreen()) {
/* 163 */       setControlButtonText(ControlButtonType.NEXT, Messages.getString(".ButtonFinish"));
/*     */     }
/*     */     
/* 166 */     styleManager.activated(this.style);
/* 167 */     this.screen.activated();
/* 168 */     if (this.formPanel != null) {
/* 169 */       this.formPanel.activated();
/*     */     }
/* 171 */     this.style.activated();
/* 172 */     context.runBooleanScript(this.config.getPostActivationClassName(), (Bean)this.screen, createScriptParameters());
/*     */   }
/*     */   
/*     */   public void initializeLazilyLoaded() {
/* 176 */     if (this.contentComponent == null) {
/* 177 */       initContentComponent();
/*     */     }
/*     */   }
/*     */   
/*     */   private void applyConfiguredWizardIndex() {
/* 182 */     int wizardIndexChangeType = this.config.getWizardIndexChangeType();
/* 183 */     switch (wizardIndexChangeType) {
/*     */       case 4:
/* 185 */         this.wizard.setWizardIndex(null);
/*     */         break;
/*     */       case 3:
/* 188 */         this.wizard.setWizardIndexKey(this.config.getWizardIndexKey());
/*     */         break;
/*     */       case 2:
/* 191 */         this.wizard.setWizardIndex(this.config.getWizardIndex());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void activateWizardIndex() {
/* 197 */     String wizardIndexKey = this.wizard.getWizardIndexKey();
/* 198 */     WizardIndex wizardIndex = this.wizard.getWizardIndex();
/*     */     
/* 200 */     setIndexPanel((wizardIndex == null || wizardIndexKey == null) ? null : new IndexPanel(wizardIndex, wizardIndexKey));
/* 201 */     this.wizard.cacheWizardIndexAndKey(this.screen);
/*     */   }
/*     */ 
/*     */   
/*     */   public void deactivate() {
/* 206 */     super.deactivate();
/* 207 */     this.screen.deactivated();
/* 208 */     if (this.formPanel != null) {
/* 209 */       this.formPanel.deactivated();
/*     */     }
/* 211 */     this.style.deactivated();
/*     */   }
/*     */   
/*     */   public void setControlButtonEnabled(ControlButtonType controlButtonType, boolean enabled) {
/* 215 */     this.style.setControlButtonEnabled(controlButtonType, enabled);
/* 216 */     this.controlButtonEnabledStates.put(controlButtonType, Boolean.valueOf(enabled));
/*     */   }
/*     */   
/*     */   public void setControlButtonVisible(ControlButtonType controlButtonType, boolean visible) {
/* 220 */     this.style.setControlButtonVisible(controlButtonType, visible);
/*     */   }
/*     */   
/*     */   public void pressControlButton(ControlButtonType controlButtonType) {
/* 224 */     switch (controlButtonType) {
/*     */       case NEXT:
/* 226 */         doNext();
/*     */         return;
/*     */       case PREVIOUS:
/* 229 */         doPrevious();
/*     */         return;
/*     */       case CANCEL:
/* 232 */         doCancel();
/*     */         return;
/*     */     } 
/* 235 */     throw new IllegalArgumentException(controlButtonType.name());
/*     */   }
/*     */ 
/*     */   
/*     */   public void focusControlButton(ControlButtonType controlButtonType) {
/* 240 */     this.style.focusControlButton(controlButtonType);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setControlButtonText(ControlButtonType controlButtonType, String text) {
/* 245 */     this.style.setControlButtonText(controlButtonType, text);
/*     */   }
/*     */   
/*     */   void doCancel() {
/* 249 */     if (this.screen.cancel()) {
/* 250 */       cancelWizard();
/*     */     }
/*     */   }
/*     */   
/*     */   void doNext() {
/* 255 */     if (this.screen.next() && checkFormCompleted()) {
/*     */       ControllerCommand storedCommand;
/*     */       boolean validated;
/* 258 */       this.wizard.getCommandSink().startStoreCommand();
/*     */       try {
/* 260 */         validated = this.wizard.getContext().runBooleanScript(this.config.getValidationClassName(), (Bean)this.screen, createScriptParameters());
/*     */       } finally {
/* 262 */         storedCommand = this.wizard.getCommandSink().finishStoreCommand();
/*     */       } 
/* 264 */       if (storedCommand != null) {
/* 265 */         this.wizard.getCommandSink().returnToController(storedCommand);
/* 266 */       } else if (validated) {
/* 267 */         if (isFinishScreen()) {
/* 268 */           this.screen.deactivated();
/* 269 */           this.wizard.getCommandSink().returnToController((ControllerCommand)new FinishCommand(this));
/*     */         } else {
/* 271 */           this.wizard.getCommandSink().returnToController((ControllerCommand)new GoForwardCommand(1, true, true, this));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private Object[] createScriptParameters() {
/*     */     Object[] scriptParameters;
/* 279 */     if (this.formPanel != null) {
/* 280 */       scriptParameters = new Object[] { this.formPanel.getFormEnvironment() };
/*     */     } else {
/* 282 */       scriptParameters = null;
/*     */     } 
/* 284 */     return scriptParameters;
/*     */   }
/*     */   
/*     */   void doPrevious() {
/* 288 */     if (this.screen.previous()) {
/* 289 */       if (this.formPanel != null) {
/* 290 */         this.formPanel.previous();
/*     */       }
/* 292 */       this.wizard.getCommandSink().returnToController((ControllerCommand)new GoBackCommand(1, true));
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void cancelWizard() {
/* 297 */     this.wizard.cancel();
/*     */   }
/*     */   
/*     */   private boolean checkFormCompleted() {
/* 301 */     return (this.formPanel == null || this.formPanel.checkCompleted());
/*     */   }
/*     */   
/*     */   public boolean isFinishScreen() {
/* 305 */     return (this.config == null || this.config.isFinishScreen());
/*     */   }
/*     */   
/*     */   public boolean isCancelVisible() {
/* 309 */     return (this.screen.isCancelVisible() && !isFinishScreen());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean supportsPrevious() {
/* 314 */     return (!this.screen.isHidden() && !this.screen.isHiddenForPrevious());
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean supportsNext() {
/* 319 */     return (!this.screen.isHidden() && !this.screen.isHiddenForNext());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setupComponent() {
/* 324 */     super.setupComponent();
/* 325 */     if (this.config != null) {
/* 326 */       setName(this.config.getDisplayedId());
/*     */     }
/*     */   }
/*     */   
/*     */   private void initContentComponent() {
/* 331 */     if (this.contentComponent == null) {
/* 332 */       this.contentComponent = new JPanel(new GridBagLayout());
/* 333 */       this.contentComponent.add(this.screen.createComponent(), getConstraints((VisualContainerBean)this.screen));
/* 334 */       GUIHelper.makeTransparent(this.contentComponent);
/*     */     } 
/*     */   }
/*     */   
/*     */   private GridBagConstraints getConstraints(VisualContainerBean visualContainerBean) {
/* 339 */     GridBagConstraints gc = new GridBagConstraints();
/* 340 */     gc.anchor = this.screen.getAnchor().getValue();
/* 341 */     gc.weightx = gc.weighty = 1.0D;
/* 342 */     if (visualContainerBean.isFillHorizontal() && visualContainerBean.isFillVertical()) {
/* 343 */       gc.fill = 1;
/* 344 */     } else if (visualContainerBean.isFillHorizontal()) {
/* 345 */       gc.fill = 2;
/* 346 */     } else if (visualContainerBean.isFillVertical()) {
/* 347 */       gc.fill = 3;
/*     */     } else {
/* 349 */       gc.fill = 0;
/*     */     } 
/* 351 */     return gc;
/*     */   }
/*     */   
/*     */   private void setStyleContext() {
/* 355 */     Container parent = this.contentComponent.getParent();
/* 356 */     if (parent != null) {
/* 357 */       parent.remove(this.contentComponent);
/*     */     }
/* 359 */     this.style.setStyleContext((StyleContext)new StyleContextImpl(this.contentComponent, this.screen.getTitle(), this.screen.getSubTitle()));
/*     */   }
/*     */   
/*     */   protected void fillScreen() {
/* 363 */     initializeLazilyLoaded();
/* 364 */     StyleManagerImpl styleManager = getStyleManager();
/* 365 */     styleManager.setTopLevelStyle(this.style);
/*     */     try {
/* 367 */       setStyleContext();
/* 368 */       JComponent styleComponent = this.style.createComponent();
/* 369 */       removeAll();
/* 370 */       JPanel stylePanel = new JPanel(new GridBagLayout());
/* 371 */       stylePanel.setOpaque(false);
/* 372 */       stylePanel.add(styleComponent, getConstraints((VisualContainerBean)this.style));
/* 373 */       add(stylePanel, "Center");
/*     */     } finally {
/* 375 */       styleManager.setTopLevelStyle(null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateUI() {
/* 381 */     super.updateUI();
/* 382 */     if (this.formPanel != null && SwingUtilities.getWindowAncestor((Component)this.formPanel) == null) {
/* 383 */       SwingUtilities.updateComponentTreeUI((Component)this.formPanel);
/*     */     }
/* 385 */     if (this.contentComponent != null) {
/* 386 */       SwingUtilities.updateComponentTreeUI(this.contentComponent);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isCancelButtonEnabled() {
/* 391 */     return ((Boolean)this.controlButtonEnabledStates.get(ControlButtonType.CANCEL)).booleanValue();
/*     */   }
/*     */   
/*     */   public void disarmButtons() {
/* 395 */     disarmButtons((JComponent)this);
/*     */   }
/*     */   
/*     */   private void disarmButtons(JComponent container) {
/* 399 */     for (int i = 0; i < container.getComponentCount(); i++) {
/* 400 */       Component component = container.getComponent(i);
/* 401 */       if (component instanceof AbstractButton) {
/* 402 */         AbstractButton button = (AbstractButton)component;
/* 403 */         ButtonModel model = button.getModel();
/* 404 */         model.setArmed(false);
/* 405 */         model.setPressed(false);
/* 406 */       } else if (component instanceof JComponent) {
/* 407 */         disarmButtons((JComponent)component);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setIndexPanel(IndexPanel indexPanel) {
/* 413 */     int componentCount = getComponentCount();
/* 414 */     for (int i = 0; i < componentCount; i++) {
/* 415 */       Component component = getComponent(i);
/* 416 */       if (component instanceof IndexPanel) {
/* 417 */         remove(component);
/*     */         break;
/*     */       } 
/*     */     } 
/* 421 */     if (this.indexPanel != null) {
/* 422 */       remove(indexPanel);
/*     */     }
/* 424 */     if (indexPanel != null) {
/* 425 */       add(indexPanel, "Before");
/* 426 */       this.indexPanel = indexPanel;
/* 427 */       revalidate();
/*     */     } 
/*     */   }
/*     */   
/*     */   public StyleManagerImpl getStyleManager() {
/* 432 */     return StyleManagerImpl.getInstance();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\ScreenEnvelope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */