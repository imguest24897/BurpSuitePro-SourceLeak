/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.value.WritableListValue;
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
/*     */ public abstract class ListProperty<E>
/*     */   extends ReadOnlyListProperty<E>
/*     */   implements Property<ObservableList<E>>, WritableListValue<E>
/*     */ {
/*     */   public void setValue(ObservableList<E> paramObservableList) {
/*  70 */     set(paramObservableList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<ObservableList<E>> paramProperty) {
/*  78 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<ObservableList<E>> paramProperty) {
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
/*  97 */     StringBuilder stringBuilder = new StringBuilder("ListProperty [");
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ListProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */