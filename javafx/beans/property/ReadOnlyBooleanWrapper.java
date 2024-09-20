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
/*     */ public class ReadOnlyBooleanWrapper
/*     */   extends SimpleBooleanProperty
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyBooleanWrapper() {}
/*     */   
/*     */   public ReadOnlyBooleanWrapper(boolean paramBoolean) {
/*  53 */     super(paramBoolean);
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
/*     */   public ReadOnlyBooleanWrapper(Object paramObject, String paramString) {
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
/*     */   public ReadOnlyBooleanWrapper(Object paramObject, String paramString, boolean paramBoolean) {
/*  80 */     super(paramObject, paramString, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyBooleanProperty getReadOnlyProperty() {
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
/*     */     extends ReadOnlyBooleanPropertyBase
/*     */   {
/*     */     public boolean get() {
/* 111 */       return ReadOnlyBooleanWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 116 */       return ReadOnlyBooleanWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 121 */       return ReadOnlyBooleanWrapper.this.getName();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyBooleanWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */