/*     */ package javafx.beans.property;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ReadOnlyObjectWrapper<T>
/*     */   extends SimpleObjectProperty<T>
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyObjectWrapper() {}
/*     */   
/*     */   public ReadOnlyObjectWrapper(T paramT) {
/*  53 */     super(paramT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyObjectWrapper(Object paramObject, String paramString) {
/*  65 */     super(paramObject, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyObjectWrapper(Object paramObject, String paramString, T paramT) {
/*  79 */     super(paramObject, paramString, paramT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyObjectProperty<T> getReadOnlyProperty() {
/*  89 */     if (this.readOnlyProperty == null) {
/*  90 */       this.readOnlyProperty = new ReadOnlyPropertyImpl();
/*     */     }
/*  92 */     return this.readOnlyProperty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 100 */     super.fireValueChangedEvent();
/* 101 */     if (this.readOnlyProperty != null) {
/* 102 */       this.readOnlyProperty.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */   
/*     */   private class ReadOnlyPropertyImpl
/*     */     extends ReadOnlyObjectPropertyBase<T>
/*     */   {
/*     */     public T get() {
/* 110 */       return ReadOnlyObjectWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 115 */       return ReadOnlyObjectWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 120 */       return ReadOnlyObjectWrapper.this.getName();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyObjectWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */