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
/*     */ public class ReadOnlyIntegerWrapper
/*     */   extends SimpleIntegerProperty
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyIntegerWrapper() {}
/*     */   
/*     */   public ReadOnlyIntegerWrapper(int paramInt) {
/*  53 */     super(paramInt);
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
/*     */   public ReadOnlyIntegerWrapper(Object paramObject, String paramString) {
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
/*     */   public ReadOnlyIntegerWrapper(Object paramObject, String paramString, int paramInt) {
/*  79 */     super(paramObject, paramString, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyIntegerProperty getReadOnlyProperty() {
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
/*     */     extends ReadOnlyIntegerPropertyBase
/*     */   {
/*     */     public int get() {
/* 110 */       return ReadOnlyIntegerWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 115 */       return ReadOnlyIntegerWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 120 */       return ReadOnlyIntegerWrapper.this.getName();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyIntegerWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */