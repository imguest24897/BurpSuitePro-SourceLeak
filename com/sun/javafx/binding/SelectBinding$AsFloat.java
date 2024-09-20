/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.binding.Binding;
/*     */ import javafx.beans.binding.FloatBinding;
/*     */ import javafx.beans.value.ObservableNumberValue;
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
/*     */ public class AsFloat
/*     */   extends FloatBinding
/*     */ {
/*     */   private static final float DEFAULT_VALUE = 0.0F;
/*     */   private final SelectBinding.SelectBindingHelper helper;
/*     */   
/*     */   public AsFloat(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/* 218 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObservableValue, paramVarArgs);
/*     */   }
/*     */   
/*     */   public AsFloat(Object paramObject, String... paramVarArgs) {
/* 222 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObject, paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 227 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void onInvalidating() {
/* 232 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected float computeValue() {
/* 237 */     ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 238 */     if (observableValue == null) {
/* 239 */       return 0.0F;
/*     */     }
/* 241 */     if (observableValue instanceof ObservableNumberValue) {
/* 242 */       return ((ObservableNumberValue)observableValue).floatValue();
/*     */     }
/*     */     try {
/* 245 */       return ((Number)observableValue.getValue()).floatValue();
/* 246 */     } catch (NullPointerException nullPointerException) {
/* 247 */       Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 248 */     } catch (ClassCastException classCastException) {
/* 249 */       Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */     } 
/* 251 */     return 0.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 256 */     return this.helper.getDependencies();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding$AsFloat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */