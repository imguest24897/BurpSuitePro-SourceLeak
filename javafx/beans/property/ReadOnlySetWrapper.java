/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.collections.ObservableSet;
/*     */ import javafx.collections.SetChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ReadOnlySetWrapper<E>
/*     */   extends SimpleSetProperty<E>
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlySetWrapper() {}
/*     */   
/*     */   public ReadOnlySetWrapper(ObservableSet<E> paramObservableSet) {
/*  56 */     super(paramObservableSet);
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
/*     */   public ReadOnlySetWrapper(Object paramObject, String paramString) {
/*  68 */     super(paramObject, paramString);
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
/*     */   public ReadOnlySetWrapper(Object paramObject, String paramString, ObservableSet<E> paramObservableSet) {
/*  83 */     super(paramObject, paramString, paramObservableSet);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlySetProperty<E> getReadOnlyProperty() {
/*  93 */     if (this.readOnlyProperty == null) {
/*  94 */       this.readOnlyProperty = new ReadOnlyPropertyImpl();
/*     */     }
/*  96 */     return this.readOnlyProperty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 104 */     super.fireValueChangedEvent();
/* 105 */     if (this.readOnlyProperty != null) {
/* 106 */       this.readOnlyProperty.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/* 115 */     super.fireValueChangedEvent(paramChange);
/* 116 */     if (this.readOnlyProperty != null) {
/* 117 */       this.readOnlyProperty.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */   
/*     */   private class ReadOnlyPropertyImpl
/*     */     extends ReadOnlySetPropertyBase<E>
/*     */   {
/*     */     public ObservableSet<E> get() {
/* 125 */       return ReadOnlySetWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 130 */       return ReadOnlySetWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 135 */       return ReadOnlySetWrapper.this.getName();
/*     */     }
/*     */ 
/*     */     
/*     */     public ReadOnlyIntegerProperty sizeProperty() {
/* 140 */       return ReadOnlySetWrapper.this.sizeProperty();
/*     */     }
/*     */ 
/*     */     
/*     */     public ReadOnlyBooleanProperty emptyProperty() {
/* 145 */       return ReadOnlySetWrapper.this.emptyProperty();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlySetWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */