/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.binding.Binding;
/*     */ import javafx.beans.binding.DoubleBinding;
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
/*     */ public class AsDouble
/*     */   extends DoubleBinding
/*     */ {
/*     */   private static final double DEFAULT_VALUE = 0.0D;
/*     */   private final SelectBinding.SelectBindingHelper helper;
/*     */   
/*     */   public AsDouble(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/* 168 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObservableValue, paramVarArgs);
/*     */   }
/*     */   
/*     */   public AsDouble(Object paramObject, String... paramVarArgs) {
/* 172 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObject, paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 177 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void onInvalidating() {
/* 182 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected double computeValue() {
/* 187 */     ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 188 */     if (observableValue == null) {
/* 189 */       return 0.0D;
/*     */     }
/* 191 */     if (observableValue instanceof ObservableNumberValue) {
/* 192 */       return ((ObservableNumberValue)observableValue).doubleValue();
/*     */     }
/*     */     try {
/* 195 */       return ((Number)observableValue.getValue()).doubleValue();
/* 196 */     } catch (NullPointerException nullPointerException) {
/* 197 */       Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 198 */     } catch (ClassCastException classCastException) {
/* 199 */       Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */     } 
/* 201 */     return 0.0D;
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 206 */     return this.helper.getDependencies();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding$AsDouble.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */