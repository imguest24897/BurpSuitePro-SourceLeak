/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.binding.Binding;
/*     */ import javafx.beans.binding.IntegerBinding;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AsInteger
/*     */   extends IntegerBinding
/*     */ {
/*     */   private static final int DEFAULT_VALUE = 0;
/*     */   private final SelectBinding.SelectBindingHelper helper;
/*     */   
/*     */   public AsInteger(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/* 268 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObservableValue, paramVarArgs);
/*     */   }
/*     */   
/*     */   public AsInteger(Object paramObject, String... paramVarArgs) {
/* 272 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObject, paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 277 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void onInvalidating() {
/* 282 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected int computeValue() {
/* 287 */     ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 288 */     if (observableValue == null) {
/* 289 */       return 0;
/*     */     }
/* 291 */     if (observableValue instanceof ObservableNumberValue) {
/* 292 */       return ((ObservableNumberValue)observableValue).intValue();
/*     */     }
/*     */     try {
/* 295 */       return ((Number)observableValue.getValue()).intValue();
/* 296 */     } catch (NullPointerException nullPointerException) {
/* 297 */       Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 298 */     } catch (ClassCastException classCastException) {
/* 299 */       Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */     } 
/* 301 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 306 */     return this.helper.getDependencies();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding$AsInteger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */