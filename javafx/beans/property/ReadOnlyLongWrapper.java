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
/*     */ public class ReadOnlyLongWrapper
/*     */   extends SimpleLongProperty
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyLongWrapper() {}
/*     */   
/*     */   public ReadOnlyLongWrapper(long paramLong) {
/*  53 */     super(paramLong);
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
/*     */   public ReadOnlyLongWrapper(Object paramObject, String paramString) {
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
/*     */   public ReadOnlyLongWrapper(Object paramObject, String paramString, long paramLong) {
/*  79 */     super(paramObject, paramString, paramLong);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyLongProperty getReadOnlyProperty() {
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
/*     */     extends ReadOnlyLongPropertyBase
/*     */   {
/*     */     public long get() {
/* 110 */       return ReadOnlyLongWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 115 */       return ReadOnlyLongWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 120 */       return ReadOnlyLongWrapper.this.getName();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyLongWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */