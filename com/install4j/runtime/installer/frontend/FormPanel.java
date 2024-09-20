/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.ComponentTuple;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.api.styles.Style;
/*     */ import com.install4j.runtime.beans.formcomponents.FormEnvironmentImpl;
/*     */ import com.install4j.runtime.beans.groups.FormComponentGroup;
/*     */ import com.install4j.runtime.beans.groups.GroupOrientation;
/*     */ import com.install4j.runtime.beans.groups.HorizontalFormComponentGroup;
/*     */ import com.install4j.runtime.beans.groups.LayoutManagerGroup;
/*     */ import com.install4j.runtime.beans.groups.TabGroup;
/*     */ import com.install4j.runtime.beans.groups.VerticalFormComponentGroup;
/*     */ import com.install4j.runtime.beans.styles.StyleManagerInt;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.config.FormComponentBeanConfig;
/*     */ import com.install4j.runtime.installer.config.FormComponentProvider;
/*     */ import com.install4j.runtime.installer.config.GroupProvider;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.util.ComponentsScrollPane;
/*     */ import com.install4j.runtime.util.CustomPanel;
/*     */ import com.install4j.runtime.util.SizeGroupComponentWrapper;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class FormPanel extends CustomPanel {
/*     */   private List<?> beanConfigs;
/*     */   private List<FormComponentProvider> formComponentProviders;
/*     */   private Context context;
/*  47 */   private Set<FormComponent> initializedComponents = new HashSet<>(); private Bean parentComponent; private ScreenEnvelope screenEnvelope; private ComponentsScrollPane scpComponents; protected JPanel componentsPanel;
/*     */   private FormEnvironment formEnvironment;
/*     */   
/*     */   public FormPanel(List<?> beanConfigs, Context context, Bean parentComponent, ScreenEnvelope screenEnvelope) {
/*  51 */     this.beanConfigs = beanConfigs;
/*  52 */     this.context = context;
/*  53 */     this.parentComponent = parentComponent;
/*  54 */     this.screenEnvelope = screenEnvelope;
/*  55 */     if (isAutoInit()) {
/*  56 */       init();
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean isAutoInit() {
/*  61 */     return true;
/*     */   }
/*     */   
/*     */   protected void init() {
/*  65 */     setupControls();
/*  66 */     setupComponent();
/*     */   }
/*     */   
/*     */   public Context getContext() {
/*  70 */     return this.context;
/*     */   }
/*     */   
/*     */   public FormEnvironment getFormEnvironment() {
/*  74 */     return this.formEnvironment;
/*     */   }
/*     */   
/*     */   public ScreenEnvelope getScreenEnvelope() {
/*  78 */     return this.screenEnvelope;
/*     */   }
/*     */   
/*     */   public Screen getScreen() {
/*  82 */     if (this.screenEnvelope != null) {
/*  83 */       return this.screenEnvelope.getScreen();
/*     */     }
/*  85 */     return (this.parentComponent instanceof Screen) ? (Screen)this.parentComponent : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface findProgressInterface() {
/*  90 */     for (FormComponentProvider formComponentProvider : this.formComponentProviders) {
/*  91 */       FormComponent formComponent = getBean(formComponentProvider);
/*  92 */       if (formComponent instanceof ProgressInterface && formComponent.isEnabled()) {
/*  93 */         return (ProgressInterface)formComponent;
/*     */       }
/*     */     } 
/*  96 */     return null;
/*     */   }
/*     */   
/*     */   public void reinitializeComponents() {
/* 100 */     this.initializedComponents.clear();
/* 101 */     initializeComponents();
/*     */   }
/*     */   
/*     */   public void previous() {
/* 105 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 106 */       if (config.isResetInitOnPrevious()) {
/* 107 */         this.initializedComponents.remove(getBean(config));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean checkCompleted() {
/* 113 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 114 */       FormComponent formComponent = getBean(config);
/* 115 */       if (formComponent.isVisible() && !formComponent.checkCompleted()) {
/* 116 */         return false;
/*     */       }
/*     */     } 
/* 119 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void willActivate() {
/* 124 */     initializeComponents();
/*     */     
/* 126 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 127 */       getBean(config).formWillActivate();
/*     */     }
/*     */   }
/*     */   
/*     */   public void activated() {
/* 132 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 133 */       getBean(config).formActivated();
/*     */     }
/*     */   }
/*     */   
/*     */   public void deactivated() {
/* 138 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 139 */       getBean(config).formDeactivated();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleUnattended() {
/* 145 */     initializeComponents();
/*     */     
/* 147 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 148 */       FormComponent formComponent = processFormComponent(config);
/* 149 */       if (formComponent != null && !formComponent.handleUnattended()) {
/* 150 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 154 */     return checkCompleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 159 */     if (this.parentComponent instanceof Screen) {
/* 160 */       ((Screen)this.parentComponent).willActivate();
/*     */     }
/* 162 */     willActivate();
/* 163 */     if (this.parentComponent instanceof Screen) {
/* 164 */       ((Screen)this.parentComponent).activated();
/*     */     }
/* 166 */     activated();
/* 167 */     enableLayoutGroups(this.beanConfigs);
/*     */     do {
/* 169 */       for (FormComponentProvider config : this.formComponentProviders) {
/* 170 */         FormComponent formComponent = processFormComponent(config);
/* 171 */         if (formComponent != null && !formComponent.handleConsole(console)) {
/* 172 */           deactivated();
/* 173 */           return false;
/*     */         } 
/*     */       } 
/* 176 */     } while (!checkCompleted());
/*     */     
/* 178 */     deactivated();
/* 179 */     return true;
/*     */   }
/*     */   
/*     */   private boolean isInHiddenLayoutGroup(FormComponent formComponent) {
/* 183 */     return isInHiddenLayoutGroup(formComponent, this.beanConfigs);
/*     */   }
/*     */   
/*     */   private boolean isInHiddenLayoutGroup(FormComponent formComponent, List<?> beanConfigs) {
/* 187 */     for (Object bean : beanConfigs) {
/* 188 */       if (bean instanceof GroupProvider) {
/* 189 */         GroupProvider groupProvider = (GroupProvider)bean;
/* 190 */         if (getBean(groupProvider).isVisible() && 
/* 191 */           !isInHiddenLayoutGroup(formComponent, groupProvider.getBeanConfigs()))
/* 192 */           return false; 
/*     */         continue;
/*     */       } 
/* 195 */       if (bean instanceof FormComponentProvider && 
/* 196 */         getBean((FormComponentProvider)bean) == formComponent) {
/* 197 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 201 */     return true;
/*     */   }
/*     */   
/*     */   private void enableLayoutGroups(List beanConfigs) {
/* 205 */     for (Object bean : beanConfigs) {
/* 206 */       if (bean instanceof GroupProvider) {
/* 207 */         GroupProvider groupProvider = (GroupProvider)bean;
/* 208 */         FormComponentGroup group = getBean(groupProvider);
/*     */         try {
/* 210 */           Boolean visible = (Boolean)this.context.runScript(group.getVisibilityScript(), (Bean)group, new Object[] { this.formEnvironment });
/* 211 */           if (visible != null) {
/* 212 */             group.setVisible(visible.booleanValue());
/*     */           }
/* 214 */           enableLayoutGroups(groupProvider.getBeanConfigs());
/* 215 */         } catch (Exception e) {
/* 216 */           Util.printAnnotatedStackTrace(e);
/* 217 */           Logger.getInstance().log(e);
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private FormComponent processFormComponent(FormComponentProvider config) {
/*     */     Object[] parameters;
/* 225 */     FormComponent formComponent = getBean(config);
/* 226 */     if (isInHiddenLayoutGroup(formComponent)) {
/* 227 */       return null;
/*     */     }
/*     */     
/* 230 */     if (formComponent.getConfigurationObjectClass() != null) {
/* 231 */       parameters = new Object[] { this.formEnvironment, formComponent.getConfigurationObject() };
/*     */     } else {
/* 233 */       parameters = new Object[] { this.formEnvironment };
/*     */     } 
/* 235 */     String visibilityClassName = ((FormComponentBeanConfig)config).getVisibilityClassName();
/* 236 */     if (visibilityClassName != null && !visibilityClassName.isEmpty()) {
/* 237 */       formComponent.setVisible(ContextImpl.getContextInt(this.context).runBooleanScript(visibilityClassName, (Bean)formComponent, parameters));
/*     */     }
/* 239 */     if (!(formComponent instanceof com.install4j.runtime.beans.formcomponents.CompoundComponentHandler) && (!formComponent.isVisible() || !formComponent.isEnabled())) {
/* 240 */       return null;
/*     */     }
/* 242 */     return formComponent;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void initializeComponents() {
/* 247 */     enableLayoutGroups(this.beanConfigs);
/*     */     
/* 249 */     for (FormComponentProvider config : this.formComponentProviders) {
/* 250 */       FormComponent formComponent = getBean(config);
/* 251 */       if (!this.initializedComponents.contains(formComponent)) {
/* 252 */         initializeComponent(formComponent, config);
/* 253 */         this.initializedComponents.add(formComponent);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected void initializeComponent(FormComponent formComponent, FormComponentProvider config) {
/*     */     Object[] parameters;
/*     */     try {
/* 260 */       formComponent.initialize();
/* 261 */     } catch (Exception e) {
/* 262 */       e.printStackTrace();
/* 263 */       Logger.getInstance().log(e);
/*     */     } 
/*     */     
/* 266 */     if (formComponent.getConfigurationObjectClass() != null) {
/* 267 */       parameters = new Object[] { this.formEnvironment, formComponent.getConfigurationObject() };
/*     */     } else {
/* 269 */       parameters = new Object[] { this.formEnvironment };
/*     */     } 
/* 271 */     ContextInt contextInt = ContextImpl.getContextInt(this.context);
/* 272 */     if (contextInt != null) {
/*     */       try {
/* 274 */         formComponent.setVisible(contextInt.runBooleanScript(((FormComponentBeanConfig)config).getVisibilityClassName(), (Bean)formComponent, parameters));
/* 275 */       } catch (Exception e) {
/* 276 */         e.printStackTrace();
/* 277 */         Logger.getInstance().log(e);
/*     */       } 
/*     */       try {
/* 280 */         contextInt.runBooleanScript(((FormComponentBeanConfig)config).getInitClassName(), (Bean)formComponent, parameters);
/* 281 */       } catch (Exception e) {
/* 282 */         e.printStackTrace();
/* 283 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupControls() {
/* 290 */     this.componentsPanel = (JPanel)new ScrollablePanel();
/* 291 */     this.componentsPanel.setLayout(new GridBagLayout());
/*     */     
/* 293 */     this.scpComponents = new ComponentsScrollPane(this.componentsPanel);
/*     */   }
/*     */ 
/*     */   
/*     */   public Dimension getMinimumSize() {
/* 298 */     return getPreferredSize();
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/* 302 */     setLayout(new BorderLayout());
/*     */     
/* 304 */     this.formEnvironment = (FormEnvironment)createFormEnvironment(new FormComponent[0], new String[0], new String[0], new ComponentTuple[0], Collections.emptyList(), false);
/* 305 */     List<FormComponent> formComponentsList = new ArrayList<>();
/* 306 */     List<String> idsList = new ArrayList<>();
/* 307 */     List<String> displayedIdsList = new ArrayList<>();
/* 308 */     List<ComponentTuple> componentTuplesList = new ArrayList<>();
/* 309 */     this.formComponentProviders = new ArrayList<>();
/*     */     
/* 311 */     PanelConstructionState panelConstructionState = buildPanel(this.beanConfigs, this.componentsPanel, (FormComponentGroup)new VerticalFormComponentGroup(), formComponentsList, idsList, displayedIdsList, componentTuplesList, false, (Color)null);
/*     */     
/* 313 */     FormComponent[] formComponents = formComponentsList.<FormComponent>toArray(new FormComponent[0]);
/* 314 */     String[] ids = idsList.<String>toArray(new String[0]);
/* 315 */     String[] displayedIds = displayedIdsList.<String>toArray(new String[idsList.size()]);
/* 316 */     ComponentTuple[] componentTuples = componentTuplesList.<ComponentTuple>toArray(new ComponentTuple[0]);
/* 317 */     this.formEnvironment = (FormEnvironment)createFormEnvironment(formComponents, ids, displayedIds, componentTuples, this.beanConfigs, true);
/* 318 */     setFormEnvironment(this.formEnvironment.getFormComponentTree());
/*     */     
/* 320 */     if (this.parentComponent != null) {
/* 321 */       if (this.parentComponent instanceof FormPanelContainer && ((FormPanelContainer)this.parentComponent).isScrollFormPanel()) {
/* 322 */         add((Component)this.scpComponents, "Center");
/*     */       } else {
/* 324 */         if (!panelConstructionState.verticalSpaceFilled && isFillVertical(this.parentComponent)) {
/* 325 */           GridBagConstraints gc = panelConstructionState.gc;
/* 326 */           gc.gridx = 0;
/* 327 */           gc.weighty = 1.0D;
/* 328 */           gc.fill = 3;
/* 329 */           JPanel spacerPanel = new JPanel();
/* 330 */           spacerPanel.setPreferredSize(new Dimension(100, 0));
/*     */           
/* 332 */           this.componentsPanel.add(spacerPanel, gc);
/* 333 */           gc.gridy++;
/*     */         } 
/* 335 */         add(this.componentsPanel, "Center");
/*     */       } 
/*     */     }
/*     */     
/* 339 */     this.componentsPanel.setOpaque(false);
/* 340 */     setOpaque(false);
/*     */   }
/*     */   
/*     */   private boolean isFillVertical(Bean parentComponent) {
/* 344 */     if (parentComponent instanceof Style) {
/* 345 */       return ((Style)parentComponent).isFillVertical();
/*     */     }
/* 347 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void setFormEnvironment(List<?> components) {
/* 352 */     for (Object bean : components) {
/* 353 */       if (bean instanceof FormComponent) {
/* 354 */         ((FormComponent)bean).setFormEnvironment(this.formEnvironment); continue;
/* 355 */       }  if (bean instanceof LayoutGroupImpl) {
/* 356 */         LayoutGroupImpl layoutGroup = (LayoutGroupImpl)bean;
/* 357 */         layoutGroup.getGroup().setFormEnvironment(this.formEnvironment);
/* 358 */         setFormEnvironment(layoutGroup.getChildren());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private PanelConstructionState buildPanel(List<?> beanConfigs, JComponent container, FormComponentGroup parentGroup, List<FormComponent> formComponentsList, List<String> idsList, List<String> displayedIdsList, List<ComponentTuple> componentTuplesList, boolean baseLineOverride, Color foregroundColor) {
/* 364 */     GridBagConstraints gc = new GridBagConstraints();
/* 365 */     gc.gridy = gc.gridx = 0;
/*     */     
/* 367 */     boolean verticalSpaceFilled = false;
/* 368 */     boolean horizontalSpaceFilled = false;
/* 369 */     boolean first = true;
/* 370 */     SizeGroupComponentWrapper firstSizeGroupComponentWrapper = null;
/* 371 */     for (Object bean : beanConfigs) {
/* 372 */       if (bean instanceof FormComponentProvider && parentGroup instanceof LayoutManagerGroup) {
/* 373 */         FormComponentProvider config = (FormComponentProvider)bean;
/* 374 */         FormComponent formComponent = getBean(config);
/* 375 */         formComponent.setContext(config.wrapContext(this.context));
/* 376 */         formComponent.setFormEnvironment(this.formEnvironment);
/* 377 */         if (!config.isEnabled()) {
/*     */           continue;
/*     */         }
/* 380 */         this.formComponentProviders.add(config);
/* 381 */         verticalSpaceFilled |= formComponent.isFillCenterVertical();
/* 382 */         horizontalSpaceFilled |= formComponent.isFillCenterHorizontal();
/* 383 */         ComponentTuple componentTuple = addFormComponent(config, (JPanel)container, gc, (LayoutManagerGroup)parentGroup, baseLineOverride, first);
/* 384 */         if (first && componentTuple.getLeftComponent() != null) {
/* 385 */           firstSizeGroupComponentWrapper = (SizeGroupComponentWrapper)componentTuple.getLeftComponent().getParent();
/*     */         }
/* 387 */         formComponentsList.add(formComponent);
/* 388 */         idsList.add(dequalifyId(config.getId()));
/* 389 */         displayedIdsList.add(dequalifyId(config.getDisplayedId()));
/* 390 */         componentTuplesList.add(componentTuple);
/* 391 */         adjustColors(componentTuple.getLeftComponent(), foregroundColor);
/* 392 */         adjustColors(componentTuple.getCenterComponent(), foregroundColor);
/* 393 */         adjustColors(componentTuple.getRightComponent(), foregroundColor);
/*     */       }
/* 395 */       else if (bean instanceof GroupProvider) {
/* 396 */         GroupProvider config = (GroupProvider)bean;
/* 397 */         if (!config.isEnabled()) {
/*     */           continue;
/*     */         }
/* 400 */         FormComponentGroup group = getBean(config);
/* 401 */         group.setFormEnvironment(this.formEnvironment);
/* 402 */         group.setContext(this.context);
/* 403 */         group.setId(config.getId());
/* 404 */         JComponent childContainer = group.createComponent(container);
/*     */         
/* 406 */         if (group instanceof LayoutManagerGroup) {
/* 407 */           Color groupForegroundColor = ((LayoutManagerGroup)group).getForegroundColor();
/* 408 */           if (groupForegroundColor != null) {
/* 409 */             foregroundColor = groupForegroundColor;
/* 410 */             childContainer.setForeground(groupForegroundColor);
/*     */           } 
/*     */         } 
/*     */         
/* 414 */         PanelConstructionState panelConstructionState = buildPanel(config.getBeanConfigs(), childContainer, group, formComponentsList, idsList, displayedIdsList, componentTuplesList, group.isBaselineOverride(), foregroundColor);
/* 415 */         verticalSpaceFilled |= panelConstructionState.verticalSpaceFilled;
/* 416 */         horizontalSpaceFilled |= panelConstructionState.horizontalSpaceFilled;
/*     */         
/* 418 */         if (group instanceof TabGroup) {
/* 419 */           addTabGroup((TabGroup)group, childContainer, panelConstructionState);
/*     */         } else {
/* 421 */           GroupOrientation parentGroupOrientation = parentGroup.getGroupOrientation();
/* 422 */           if (parentGroupOrientation == GroupOrientation.VERTICAL) {
/* 423 */             gc.gridx = 0;
/* 424 */             gc.gridwidth = 3;
/*     */           } else {
/* 426 */             gc.gridwidth = 1;
/*     */           } 
/* 428 */           if (parentGroup instanceof VerticalFormComponentGroup && group instanceof HorizontalFormComponentGroup && ((HorizontalFormComponentGroup)group)
/*     */             
/* 430 */             .isAlignFirstLabel() && panelConstructionState
/* 431 */             .firstSizeGroupComponentWrapper != null) {
/* 432 */             ((VerticalFormComponentGroup)parentGroup).getSizeGroup().addComponentWrapper(panelConstructionState.firstSizeGroupComponentWrapper);
/*     */           }
/*     */           
/* 435 */           horizontalSpaceFilled |= group.isWidthOverride();
/* 436 */           verticalSpaceFilled |= group.isHeightOverride();
/*     */           
/* 438 */           boolean groupHorizontalSpaceFilled = (panelConstructionState.horizontalSpaceFilled || group.isWidthOverride());
/* 439 */           boolean groupVerticalSpaceFilled = (panelConstructionState.verticalSpaceFilled || group.isHeightOverride());
/*     */           
/* 441 */           gc.anchor = group.getAnchor().getValue();
/* 442 */           gc.weightx = groupHorizontalSpaceFilled ? 1.0D : 0.0D;
/* 443 */           gc.weighty = groupVerticalSpaceFilled ? 1.0D : 0.0D;
/* 444 */           gc.fill = getFillMode(groupHorizontalSpaceFilled, groupVerticalSpaceFilled);
/* 445 */           gc.insets = new Insets(0, 0, 0, 0);
/* 446 */           if (group instanceof LayoutManagerGroup) {
/* 447 */             LayoutManagerGroup layoutManagerGroup = (LayoutManagerGroup)group;
/* 448 */             container.add(layoutManagerGroup.wrap(childContainer), gc);
/*     */           } else {
/* 450 */             container.add(childContainer, gc);
/*     */           } 
/* 452 */           gc.gridx++;
/* 453 */           if (parentGroupOrientation == GroupOrientation.VERTICAL) {
/* 454 */             gc.gridy++;
/*     */           }
/*     */         } 
/*     */       } 
/* 458 */       first = false;
/*     */     } 
/*     */     
/* 461 */     return new PanelConstructionState(gc, verticalSpaceFilled, horizontalSpaceFilled, firstSizeGroupComponentWrapper);
/*     */   }
/*     */   
/*     */   private void adjustColors(JComponent component, Color foregroundColor) {
/* 465 */     if (component != null) {
/* 466 */       GUIHelper.makeTransparent(component);
/* 467 */       if (foregroundColor != null && component.getForeground() instanceof javax.swing.plaf.UIResource) {
/* 468 */         component.setForeground(foregroundColor);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void addTabGroup(TabGroup group, JComponent childContainer, PanelConstructionState panelConstructionState) {
/* 474 */     GridBagConstraints gc = new GridBagConstraints();
/* 475 */     gc.anchor = group.getAnchor().getValue();
/* 476 */     gc.fill = getFillMode(panelConstructionState.horizontalSpaceFilled, panelConstructionState.verticalSpaceFilled);
/* 477 */     gc.insets = (Insets)group.getInsets().clone();
/* 478 */     gc.weightx = gc.weighty = 1.0D;
/* 479 */     group.getPanel().add(childContainer, gc);
/*     */   }
/*     */   
/*     */   private String dequalifyId(String id) {
/* 483 */     int index = id.indexOf(':');
/* 484 */     if (index < 0) {
/* 485 */       return id;
/*     */     }
/* 487 */     return id.substring(index + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   private int getFillMode(boolean horizontalSpaceFilled, boolean verticalSpaceFilled) {
/* 492 */     if (horizontalSpaceFilled) {
/* 493 */       return verticalSpaceFilled ? 1 : 2;
/*     */     }
/* 495 */     return verticalSpaceFilled ? 3 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected FormEnvironmentImpl createFormEnvironment(FormComponent[] formComponents, String[] ids, String[] displayedIds, ComponentTuple[] componentTuples, List beanConfigs, boolean initialized) {
/* 500 */     return new FormEnvironmentImpl(this, formComponents, ids, displayedIds, componentTuples, beanConfigs, initialized);
/*     */   }
/*     */ 
/*     */   
/*     */   private ComponentTuple addFormComponent(FormComponentProvider config, JPanel panel, GridBagConstraints gc, LayoutManagerGroup group, boolean baselineOverride, boolean first) {
/* 505 */     GroupOrientation orientation = group.getGroupOrientation();
/* 506 */     FormComponent formComponent = getBean(config);
/*     */     
/* 508 */     JComponent leftComponent = formComponent.createLeftComponent();
/* 509 */     JComponent centerComponent = formComponent.createCenterComponent();
/* 510 */     JComponent rightComponent = formComponent.createRightComponent();
/*     */     
/* 512 */     if (centerComponent == null) {
/* 513 */       return new ComponentTupleImpl(null, null, null);
/*     */     }
/*     */     
/* 516 */     gc.insets.top = config.getInsetTop();
/* 517 */     gc.insets.bottom = config.getInsetBottom();
/* 518 */     gc.insets.left = config.getInsetLeft();
/* 519 */     gc.insets.right = 0;
/*     */     
/* 521 */     int cellSpacing = first ? 0 : group.getCellSpacing();
/* 522 */     if (orientation == GroupOrientation.VERTICAL) {
/* 523 */       gc.gridx = 0;
/* 524 */       gc.insets.top += cellSpacing;
/*     */     } else {
/* 526 */       gc.insets.left += cellSpacing;
/*     */     } 
/* 528 */     gc.gridwidth = 1;
/*     */     
/* 530 */     boolean baselineLabel = baselineOverride;
/* 531 */     if (leftComponent != null) {
/* 532 */       if (leftComponent instanceof JLabel && ((JLabel)leftComponent).getText().length() > 0 && !group.isMakeSameHeight()) {
/* 533 */         baselineLabel = true;
/*     */       }
/*     */       
/* 536 */       gc.anchor = baselineLabel ? 512 : getAnchor(leftComponent);
/* 537 */       gc.weightx = 0.0D;
/* 538 */       gc.weighty = 0.0D;
/* 539 */       gc.fill = 0;
/* 540 */       SizeGroupComponentWrapper componentWrapper = new SizeGroupComponentWrapper(leftComponent);
/* 541 */       panel.add((Component)componentWrapper, gc);
/* 542 */       if (group instanceof VerticalFormComponentGroup) {
/* 543 */         ((VerticalFormComponentGroup)group).getSizeGroup().addComponentWrapper(componentWrapper);
/*     */       }
/*     */       
/* 546 */       gc.gridx++;
/* 547 */       gc.insets.left = 0;
/*     */     }
/* 549 */     else if (orientation == GroupOrientation.VERTICAL) {
/* 550 */       gc.gridwidth++;
/*     */     } 
/*     */ 
/*     */     
/* 554 */     if (rightComponent == null) {
/* 555 */       if (orientation == GroupOrientation.VERTICAL) {
/* 556 */         gc.gridwidth++;
/*     */       }
/* 558 */       gc.insets.right = config.getInsetRight();
/*     */     } 
/*     */     
/* 561 */     boolean heightOverride = false, widthOverride = false;
/* 562 */     if (orientation == GroupOrientation.HORIZONTAL) {
/* 563 */       gc.weightx = formComponent.isFillCenterHorizontal() ? 1.0D : 0.0D;
/* 564 */       heightOverride = group.isMakeSameHeight();
/*     */     } else {
/* 566 */       gc.weightx = 1.0D;
/*     */     } 
/* 568 */     if (orientation == GroupOrientation.VERTICAL) {
/* 569 */       gc.weighty = formComponent.isFillCenterVertical() ? 1.0D : 0.0D;
/* 570 */       widthOverride = group.isMakeSameWidth();
/*     */     } else {
/* 572 */       gc.weighty = 1.0D;
/*     */     } 
/* 574 */     if (widthOverride) {
/* 575 */       gc.weightx = 1.0D;
/*     */     }
/* 577 */     gc.fill = getFillMode((formComponent.isFillCenterHorizontal() || widthOverride), (formComponent.isFillCenterVertical() || heightOverride));
/* 578 */     gc.anchor = baselineLabel ? 512 : getAnchor(centerComponent);
/* 579 */     panel.add(centerComponent, gc);
/* 580 */     gc.gridx += gc.gridwidth;
/*     */     
/* 582 */     if (rightComponent != null) {
/* 583 */       gc.gridwidth = 1;
/* 584 */       gc.weightx = 0.0D;
/* 585 */       gc.weighty = 0.0D;
/* 586 */       gc.fill = 0;
/* 587 */       gc.anchor = baselineLabel ? 512 : getAnchor(rightComponent);
/* 588 */       gc.insets.right = config.getInsetRight();
/* 589 */       gc.insets.left = 0;
/* 590 */       panel.add(rightComponent, gc);
/* 591 */       gc.gridx++;
/*     */     } 
/*     */     
/* 594 */     if (orientation == GroupOrientation.VERTICAL) {
/* 595 */       gc.gridy++;
/*     */     }
/*     */     
/* 598 */     return new ComponentTupleImpl(leftComponent, centerComponent, rightComponent);
/*     */   }
/*     */   
/*     */   private int getAnchor(JComponent centerComponent) {
/* 602 */     return AnchorUtil.getAnchor(centerComponent);
/*     */   }
/*     */   
/*     */   private FormComponent getBean(FormComponentProvider formComponentProvider) {
/* 606 */     return (FormComponent)getStyleManager().replaceBean(formComponentProvider.getId(), (Bean)formComponentProvider.getFormComponent());
/*     */   }
/*     */   
/*     */   private FormComponentGroup getBean(GroupProvider groupProvider) {
/* 610 */     return (FormComponentGroup)getStyleManager().replaceBean(groupProvider.getId(), groupProvider.getOrInstantiateBean());
/*     */   }
/*     */   
/*     */   protected StyleManagerInt getStyleManager() {
/* 614 */     return (StyleManagerInt)getContext().getWizardContext().getStyleManager();
/*     */   }
/*     */ 
/*     */   
/*     */   private static class PanelConstructionState
/*     */   {
/*     */     private final GridBagConstraints gc;
/*     */     private final boolean verticalSpaceFilled;
/*     */     private final boolean horizontalSpaceFilled;
/*     */     private final SizeGroupComponentWrapper firstSizeGroupComponentWrapper;
/*     */     
/*     */     public PanelConstructionState(GridBagConstraints gc, boolean verticalSpaceFilled, boolean horizontalSpaceFilled, SizeGroupComponentWrapper firstSizeGroupComponentWrapper) {
/* 626 */       this.gc = gc;
/* 627 */       this.verticalSpaceFilled = verticalSpaceFilled;
/* 628 */       this.horizontalSpaceFilled = horizontalSpaceFilled;
/* 629 */       this.firstSizeGroupComponentWrapper = firstSizeGroupComponentWrapper;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\FormPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */