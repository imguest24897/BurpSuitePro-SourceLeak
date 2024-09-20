/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.binding.Binding;
/*     */ import javafx.beans.binding.ObjectBinding;
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
/*     */ public class AsObject<T>
/*     */   extends ObjectBinding<T>
/*     */ {
/*     */   private final SelectBinding.SelectBindingHelper helper;
/*     */   
/*     */   public AsObject(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  71 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObservableValue, paramVarArgs);
/*     */   }
/*     */   
/*     */   public AsObject(Object paramObject, String... paramVarArgs) {
/*  75 */     this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, paramObject, paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/*  80 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void onInvalidating() {
/*  85 */     this.helper.unregisterListener();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected T computeValue() {
/*  91 */     ObservableValue<?> observableValue = this.helper.getObservableValue();
/*  92 */     if (observableValue == null) {
/*  93 */       return null;
/*     */     }
/*     */     try {
/*  96 */       return (T)observableValue.getValue();
/*  97 */     } catch (ClassCastException classCastException) {
/*  98 */       Logging.getLogger().warning("Value of select-binding has wrong type, returning null.", classCastException);
/*     */       
/* 100 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 106 */     return this.helper.getDependencies();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding$AsObject.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */