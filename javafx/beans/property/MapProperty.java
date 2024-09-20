/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.value.WritableMapValue;
/*     */ import javafx.collections.ObservableMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class MapProperty<K, V>
/*     */   extends ReadOnlyMapProperty<K, V>
/*     */   implements Property<ObservableMap<K, V>>, WritableMapValue<K, V>
/*     */ {
/*     */   public void setValue(ObservableMap<K, V> paramObservableMap) {
/*  71 */     set(paramObservableMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<ObservableMap<K, V>> paramProperty) {
/*  79 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<ObservableMap<K, V>> paramProperty) {
/*  87 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/*  96 */     Object object = getBean();
/*  97 */     String str = getName();
/*  98 */     StringBuilder stringBuilder = new StringBuilder("MapProperty [");
/*     */     
/* 100 */     if (object != null) {
/* 101 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 103 */     if (str != null && !str.equals("")) {
/* 104 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 106 */     stringBuilder.append("value: ").append(get()).append("]");
/* 107 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\MapProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */