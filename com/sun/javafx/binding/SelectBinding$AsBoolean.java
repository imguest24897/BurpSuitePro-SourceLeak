/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.binding.Binding;
/*     */ import javafx.beans.binding.BooleanBinding;
/*     */ import javafx.beans.value.ObservableBooleanValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.ObservableList;
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
/*     */ public class AsBoolean
/*     */   extends BooleanBinding
/*     */ {
/*     */   private static final boolean DEFAULT_VALUE = false;
/*     */   private final SelectBinding.SelectBindingHelper helper;
/*     */   
/*     */   public AsBoolean(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/* 118 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObservableValue, paramVarArgs);
/*     */   }
/*     */   
/*     */   public AsBoolean(Object paramObject, String... paramVarArgs) {
/* 122 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObject, paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 127 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void onInvalidating() {
/* 132 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean computeValue() {
/* 137 */     ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 138 */     if (observableValue == null) {
/* 139 */       return false;
/*     */     }
/* 141 */     if (observableValue instanceof ObservableBooleanValue) {
/* 142 */       return ((ObservableBooleanValue)observableValue).get();
/*     */     }
/*     */     try {
/* 145 */       return ((Boolean)observableValue.getValue()).booleanValue();
/* 146 */     } catch (NullPointerException nullPointerException) {
/* 147 */       Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 148 */     } catch (ClassCastException classCastException) {
/* 149 */       Logging.getLogger().warning("Value of select-binding has wrong type, returning default value.", classCastException);
/*     */     } 
/* 151 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 156 */     return this.helper.getDependencies();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding$AsBoolean.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */