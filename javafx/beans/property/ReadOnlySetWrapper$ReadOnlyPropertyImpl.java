/*     */ package javafx.beans.property;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ReadOnlyPropertyImpl
/*     */   extends ReadOnlySetPropertyBase<E>
/*     */ {
/*     */   public ObservableSet<E> get() {
/* 125 */     return ReadOnlySetWrapper.this.get();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 130 */     return ReadOnlySetWrapper.this.getBean();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 135 */     return ReadOnlySetWrapper.this.getName();
/*     */   }
/*     */ 
/*     */   
/*     */   public ReadOnlyIntegerProperty sizeProperty() {
/* 140 */     return ReadOnlySetWrapper.this.sizeProperty();
/*     */   }
/*     */ 
/*     */   
/*     */   public ReadOnlyBooleanProperty emptyProperty() {
/* 145 */     return ReadOnlySetWrapper.this.emptyProperty();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlySetWrapper$ReadOnlyPropertyImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */