/*     */ package com.install4j.runtime.beans.styles;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.screens.FormPanelContainer;
/*     */ import com.install4j.api.styles.Style;
/*     */ import com.install4j.runtime.installer.IdWrapperContext;
/*     */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.StyleBeanConfig;
/*     */ import com.install4j.runtime.installer.config.StyleProvider;
/*     */ import com.install4j.runtime.installer.config.WrapperBeanConfig;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.swing.JPanel;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class StyleManagerImpl implements StyleManagerInt {
/*  21 */   private static StyleManagerImpl styleManagerImpl = new StyleManagerImpl();
/*     */   
/*     */   @NotNull
/*     */   public static StyleManagerImpl getInstance() {
/*  25 */     return styleManagerImpl;
/*     */   }
/*     */   
/*  28 */   private Map<Style, FormPanel> styleToFormPanel = new HashMap<>();
/*  29 */   private Map<Style, StyleProvider> styleToConfig = new HashMap<>();
/*  30 */   private Map<Style, String> styleToId = new HashMap<>();
/*  31 */   private Map<String, Bean> idToReplacedBean = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/*  37 */     this.styleToFormPanel.clear();
/*  38 */     this.styleToConfig.clear();
/*  39 */     this.styleToId.clear();
/*  40 */     this.idToReplacedBean.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Style getStyleById(String styleId) {
/*  46 */     StyleProvider styleConfig = getStyleConfigById(styleId);
/*  47 */     if (styleConfig != null) {
/*  48 */       return registerStyle(styleConfig, styleId);
/*     */     }
/*  50 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Style cloneStyleById(String styleId) {
/*  56 */     StyleProvider styleConfig = getStyleConfigById(styleId);
/*  57 */     if (styleConfig != null) {
/*  58 */       return registerStyle(styleConfig.cloneStyleProvider(), styleId);
/*     */     }
/*  60 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public JComponent createStyleComponent(Style style) {
/*  66 */     initializeStyle(style);
/*  67 */     return style.createComponent();
/*     */   }
/*     */ 
/*     */   
/*     */   public void willActivate(Style style) {
/*  72 */     if (style == null) {
/*     */       return;
/*     */     }
/*  75 */     FormPanel formPanel = this.styleToFormPanel.get(style);
/*  76 */     if (formPanel != null) {
/*  77 */       formPanel.willActivate();
/*     */     }
/*  79 */     style.willActivate();
/*     */   }
/*     */ 
/*     */   
/*     */   public void activated(Style style) {
/*  84 */     if (style == null) {
/*     */       return;
/*     */     }
/*  87 */     FormPanel formPanel = this.styleToFormPanel.get(style);
/*  88 */     if (formPanel != null) {
/*  89 */       formPanel.activated();
/*     */     }
/*  91 */     style.activated();
/*     */   }
/*     */ 
/*     */   
/*     */   public void deactivated(Style style) {
/*  96 */     if (style == null) {
/*     */       return;
/*     */     }
/*  99 */     FormPanel formPanel = this.styleToFormPanel.get(style);
/* 100 */     if (formPanel != null) {
/* 101 */       formPanel.deactivated();
/*     */     }
/* 103 */     style.deactivated();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected FormPanel createStyleFormPanel(Style style, @NotNull String styleId) {
/* 108 */     StyleBeanConfig styleConfig = (StyleBeanConfig)this.styleToConfig.get(style);
/* 109 */     if (styleConfig == null) {
/* 110 */       throw new IllegalStateException("Style with ID " + styleId + " not found");
/*     */     }
/* 112 */     List<AbstractBeanConfig> formComponentConfigs = styleConfig.getFormComponentConfigs();
/* 113 */     return new FormPanel(formComponentConfigs, getContext(styleId), (Bean)styleConfig.getOrInstantiateStyle(false), null);
/*     */   }
/*     */   
/*     */   protected void collectReplacedBeans(StyleProvider styleConfig, Map<String, Bean> idToReplacedBean) {
/* 117 */     for (WrapperBeanConfig wrapperBeanConfig : ((StyleBeanConfig)styleConfig).getOverriddenBeanConfigs()) {
/* 118 */       idToReplacedBean.put(wrapperBeanConfig.getId(), wrapperBeanConfig.getOrInstantiateBean(false));
/*     */     }
/*     */   }
/*     */   
/*     */   public void setTopLevelStyle(Style style) {
/* 123 */     if (style != null) {
/* 124 */       StyleProvider styleConfig = this.styleToConfig.get(style);
/* 125 */       if (styleConfig == null) {
/* 126 */         throw new IllegalStateException();
/*     */       }
/* 128 */       collectReplacedBeans(styleConfig, this.idToReplacedBean);
/*     */       
/* 130 */       initializeStyle(style);
/*     */     } else {
/* 132 */       this.idToReplacedBean.clear();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Bean replaceBean(String id, Bean bean) {
/* 138 */     Bean replacedBean = this.idToReplacedBean.get(id);
/* 139 */     if (replacedBean != null) {
/* 140 */       return replacedBean;
/*     */     }
/* 142 */     return bean;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initializeStyle(Style style) {
/* 147 */     StyleProvider styleConfig = this.styleToConfig.get(style);
/* 148 */     if (styleConfig == null) {
/* 149 */       throw new IllegalStateException("Style config for " + style + " not found");
/*     */     }
/* 151 */     String styleId = this.styleToId.get(style);
/* 152 */     if (styleId == null) {
/* 153 */       throw new IllegalStateException("Style ID for " + style + " not found");
/*     */     }
/* 155 */     initializeStyle(style, styleId);
/*     */   }
/*     */   
/*     */   protected Context getContext(String styleId) {
/* 159 */     Context currentContext = getContext();
/* 160 */     if (styleId.contains(":")) {
/* 161 */       String[] parts = styleId.split(":");
/* 162 */       String mergedProjectId = parts[0];
/* 163 */       return (Context)new IdWrapperContext(currentContext, mergedProjectId);
/*     */     } 
/* 165 */     return currentContext;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Context getContext() {
/* 170 */     return ContextImpl.getCurrentContext();
/*     */   }
/*     */   
/*     */   protected void initializeStyle(Style style, @NotNull String styleId) {
/* 174 */     if (style instanceof FormPanelContainer) {
/* 175 */       FormPanel formPanel = createStyleFormPanel(style, styleId);
/* 176 */       this.styleToFormPanel.put(style, formPanel);
/* 177 */       ((FormPanelContainer)style).setFormPanel((JPanel)formPanel, formPanel.getFormEnvironment());
/*     */     } 
/*     */   }
/*     */   
/*     */   protected StyleProvider getStyleConfigById(String styleId) {
/* 182 */     return (StyleProvider)InstallerConfig.getCurrentInstance().getStyleConfigById(styleId);
/*     */   }
/*     */   
/*     */   private Style registerStyle(StyleProvider styleConfig, String styleId) {
/* 186 */     Style style = styleConfig.getStyle();
/* 187 */     style.setContext(getContext(styleId));
/* 188 */     this.styleToConfig.put(style, styleConfig);
/* 189 */     this.styleToId.put(style, styleId);
/* 190 */     return style;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\StyleManagerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */