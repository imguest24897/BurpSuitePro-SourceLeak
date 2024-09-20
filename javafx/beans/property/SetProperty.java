/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.value.WritableSetValue;
/*     */ import javafx.collections.ObservableSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class SetProperty<E>
/*     */   extends ReadOnlySetProperty<E>
/*     */   implements Property<ObservableSet<E>>, WritableSetValue<E>
/*     */ {
/*     */   public void setValue(ObservableSet<E> paramObservableSet) {
/*  70 */     set(paramObservableSet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<ObservableSet<E>> paramProperty) {
/*  78 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<ObservableSet<E>> paramProperty) {
/*  86 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  95 */     Object object = getBean();
/*  96 */     String str = getName();
/*  97 */     StringBuilder stringBuilder = new StringBuilder("SetProperty [");
/*     */     
/*  99 */     if (object != null) {
/* 100 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 102 */     if (str != null && !str.equals("")) {
/* 103 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 105 */     stringBuilder.append("value: ").append(get()).append("]");
/* 106 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SetProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */