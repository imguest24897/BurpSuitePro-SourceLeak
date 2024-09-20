/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.value.WritableObjectValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ObjectProperty<T>
/*     */   extends ReadOnlyObjectProperty<T>
/*     */   implements Property<T>, WritableObjectValue<T>
/*     */ {
/*     */   public void setValue(T paramT) {
/*  78 */     set(paramT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<T> paramProperty) {
/*  86 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<T> paramProperty) {
/*  94 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 103 */     Object object = getBean();
/* 104 */     String str = getName();
/* 105 */     StringBuilder stringBuilder = new StringBuilder("ObjectProperty [");
/*     */     
/* 107 */     if (object != null) {
/* 108 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 110 */     if (str != null && !str.equals("")) {
/* 111 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 113 */     stringBuilder.append("value: ").append(get()).append("]");
/* 114 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ObjectProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */