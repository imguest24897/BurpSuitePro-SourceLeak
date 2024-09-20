/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class FormComponentBeanConfig
/*     */   extends AbstractBeanConfig
/*     */   implements FormComponentProvider
/*     */ {
/*     */   private FormComponent instance;
/*  14 */   private String initClassName = "";
/*  15 */   private String visibilityClassName = "";
/*     */   
/*  17 */   private int insetTop = 3;
/*  18 */   private int insetLeft = 0;
/*  19 */   private int insetBottom = 3;
/*  20 */   private int insetRight = 0;
/*     */   
/*     */   private boolean resetInitOnPrevious;
/*     */   
/*     */   public FormComponent getOrInstantiateFormComponent(boolean suppressErrors) {
/*  25 */     if (this.instance == null) {
/*  26 */       this.instance = (FormComponent)instantiateBean(suppressErrors);
/*     */     }
/*  28 */     return this.instance;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInstantiated() {
/*  33 */     return (this.instance != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void clearInstance() {
/*  38 */     this.instance = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setBean(Bean bean) {
/*  43 */     this.instance = (FormComponent)bean;
/*     */   }
/*     */   
/*     */   public String getInitClassName() {
/*  47 */     return this.initClassName;
/*     */   }
/*     */   
/*     */   public String getVisibilityClassName() {
/*  51 */     return this.visibilityClassName;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getInsetTop() {
/*  56 */     return this.insetTop;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getInsetLeft() {
/*  61 */     return this.insetLeft;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getInsetBottom() {
/*  66 */     return this.insetBottom;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getInsetRight() {
/*  71 */     return this.insetRight;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEnabled() {
/*  76 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Context wrapContext(Context context) {
/*  81 */     return ContextImpl.getContextInt(context).getIdWrapperContext(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isResetInitOnPrevious() {
/*  86 */     return this.resetInitOnPrevious;
/*     */   }
/*     */ 
/*     */   
/*     */   public FormComponent getFormComponent() {
/*  91 */     return getOrInstantiateFormComponent(false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/*  96 */     super.read(element);
/*     */     
/*  98 */     this.initClassName = readAttribute(element, "initClassName", this.initClassName);
/*  99 */     this.visibilityClassName = readAttribute(element, "visibilityClassName", this.visibilityClassName);
/*     */     
/* 101 */     this.insetTop = readAttribute(element, "insetsTop", this.insetTop);
/* 102 */     this.insetLeft = readAttribute(element, "insetsLeft", this.insetLeft);
/* 103 */     this.insetBottom = readAttribute(element, "insetsBottom", this.insetBottom);
/* 104 */     this.insetRight = readAttribute(element, "insetsRight", this.insetRight);
/*     */     
/* 106 */     this.resetInitOnPrevious = readAttribute(element, "resetInitOnPrevious", this.resetInitOnPrevious);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\FormComponentBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */