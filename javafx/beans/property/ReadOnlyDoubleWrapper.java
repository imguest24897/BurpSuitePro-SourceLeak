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
/*     */ public class ReadOnlyDoubleWrapper
/*     */   extends SimpleDoubleProperty
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyDoubleWrapper() {}
/*     */   
/*     */   public ReadOnlyDoubleWrapper(double paramDouble) {
/*  53 */     super(paramDouble);
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
/*     */   public ReadOnlyDoubleWrapper(Object paramObject, String paramString) {
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
/*     */   
/*     */   public ReadOnlyDoubleWrapper(Object paramObject, String paramString, double paramDouble) {
/*  80 */     super(paramObject, paramString, paramDouble);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyDoubleProperty getReadOnlyProperty() {
/*  90 */     if (this.readOnlyProperty == null) {
/*  91 */       this.readOnlyProperty = new ReadOnlyPropertyImpl();
/*     */     }
/*  93 */     return this.readOnlyProperty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 101 */     super.fireValueChangedEvent();
/* 102 */     if (this.readOnlyProperty != null) {
/* 103 */       this.readOnlyProperty.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */   
/*     */   private class ReadOnlyPropertyImpl
/*     */     extends ReadOnlyDoublePropertyBase
/*     */   {
/*     */     public double get() {
/* 111 */       return ReadOnlyDoubleWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 116 */       return ReadOnlyDoubleWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 121 */       return ReadOnlyDoubleWrapper.this.getName();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyDoubleWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */