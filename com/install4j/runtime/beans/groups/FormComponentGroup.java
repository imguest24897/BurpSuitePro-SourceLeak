/*     */ package com.install4j.runtime.beans.groups;
/*     */ 
/*     */ import com.install4j.api.beans.Anchor;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.formcomponents.GroupType;
/*     */ import com.install4j.runtime.beans.formcomponents.FormEnvironmentContainer;
/*     */ import java.awt.Insets;
/*     */ import javax.swing.JComponent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class FormComponentGroup
/*     */   extends Group
/*     */   implements FormEnvironmentContainer
/*     */ {
/*     */   private Insets insets;
/*     */   private Anchor anchor;
/*     */   private ScriptProperty visibilityScript;
/*     */   private boolean visible;
/*     */   private boolean enabled;
/*     */   private FormEnvironment formEnvironment;
/*     */   private Context context;
/*     */   private String id;
/*     */   
/*     */   public Insets getInsets() {
/*     */     return (Insets)replaceWithTextOverride("insets", this.insets, Insets.class);
/*     */   }
/*     */   
/*     */   public void setInsets(Insets insets) {
/*     */     this.insets = insets;
/*     */   }
/*     */   
/*     */   public Anchor getAnchor() {
/*     */     return (Anchor)replaceWithTextOverride("anchor", this.anchor, Anchor.class);
/*     */   }
/*     */   
/*     */   protected FormComponentGroup() {
/*  50 */     this.visible = true;
/*  51 */     this.enabled = true;
/*     */     setAnchor(getDefaultAnchor());
/*     */     setInsets(getDefaultInsets());
/*     */   }
/*     */   public void setAnchor(Anchor anchor) {
/*     */     this.anchor = anchor;
/*     */   }
/*     */   public ScriptProperty getVisibilityScript() {
/*     */     return (ScriptProperty)replaceWithTextOverride("visibilityScript", this.visibilityScript, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public FormEnvironment getFormEnvironment() {
/*  63 */     return (FormEnvironment)replaceWithTextOverride("formEnvironment", this.formEnvironment, FormEnvironment.class);
/*     */   } public void setVisibilityScript(ScriptProperty visibilityScript) {
/*     */     this.visibilityScript = visibilityScript;
/*     */   } public abstract Anchor getDefaultAnchor();
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  68 */     this.formEnvironment = formEnvironment;
/*     */   } public abstract JComponent createComponent(JComponent paramJComponent); public abstract GroupType getGroupType();
/*     */   public abstract GroupOrientation getGroupOrientation();
/*     */   public boolean isVisible() {
/*  72 */     return replaceWithTextOverride("visible", this.visible);
/*     */   }
/*     */   
/*     */   public void setVisible(boolean visible) {
/*  76 */     this.visible = visible;
/*     */   }
/*     */   
/*     */   public boolean isWidthOverride() {
/*  80 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isHeightOverride() {
/*  84 */     return false;
/*     */   }
/*     */   
/*     */   protected Insets getDefaultInsets() {
/*  88 */     return new Insets(0, 0, 0, 0);
/*     */   }
/*     */   
/*     */   public boolean isMakeSameWidth() {
/*  92 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isMakeSameHeight() {
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isBaselineOverride() {
/* 100 */     return false;
/*     */   }
/*     */   
/*     */   public void setContext(Context context) {
/* 104 */     this.context = context;
/*     */   }
/*     */   
/*     */   protected Context getContext() {
/* 108 */     return this.context;
/*     */   }
/*     */   
/*     */   public void setId(String id) {
/* 112 */     this.id = id;
/*     */   }
/*     */   
/*     */   protected String getId() {
/* 116 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setEnabled(boolean enabled) {
/* 120 */     this.enabled = enabled;
/*     */   }
/*     */   
/*     */   protected boolean isEnabled() {
/* 124 */     return this.enabled;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\FormComponentGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */