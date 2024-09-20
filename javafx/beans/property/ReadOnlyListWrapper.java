/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.collections.ListChangeListener;
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
/*     */ public class ReadOnlyListWrapper<E>
/*     */   extends SimpleListProperty<E>
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyListWrapper() {}
/*     */   
/*     */   public ReadOnlyListWrapper(ObservableList<E> paramObservableList) {
/*  56 */     super(paramObservableList);
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
/*     */   public ReadOnlyListWrapper(Object paramObject, String paramString) {
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
/*     */   public ReadOnlyListWrapper(Object paramObject, String paramString, ObservableList<E> paramObservableList) {
/*  83 */     super(paramObject, paramString, paramObservableList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyListProperty<E> getReadOnlyProperty() {
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
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 115 */     super.fireValueChangedEvent(paramChange);
/* 116 */     if (this.readOnlyProperty != null) {
/* 117 */       paramChange.reset();
/* 118 */       this.readOnlyProperty.fireValueChangedEvent(paramChange);
/*     */     } 
/*     */   }
/*     */   
/*     */   private class ReadOnlyPropertyImpl
/*     */     extends ReadOnlyListPropertyBase<E>
/*     */   {
/*     */     public ObservableList<E> get() {
/* 126 */       return ReadOnlyListWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 131 */       return ReadOnlyListWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 136 */       return ReadOnlyListWrapper.this.getName();
/*     */     }
/*     */ 
/*     */     
/*     */     public ReadOnlyIntegerProperty sizeProperty() {
/* 141 */       return ReadOnlyListWrapper.this.sizeProperty();
/*     */     }
/*     */ 
/*     */     
/*     */     public ReadOnlyBooleanProperty emptyProperty() {
/* 146 */       return ReadOnlyListWrapper.this.emptyProperty();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyListWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */