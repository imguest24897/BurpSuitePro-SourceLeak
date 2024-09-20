/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.collections.MapChangeListener;
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
/*     */ public class ReadOnlyMapWrapper<K, V>
/*     */   extends SimpleMapProperty<K, V>
/*     */ {
/*     */   private ReadOnlyPropertyImpl readOnlyProperty;
/*     */   
/*     */   public ReadOnlyMapWrapper() {}
/*     */   
/*     */   public ReadOnlyMapWrapper(ObservableMap<K, V> paramObservableMap) {
/*  56 */     super(paramObservableMap);
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
/*     */   public ReadOnlyMapWrapper(Object paramObject, String paramString) {
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
/*     */   public ReadOnlyMapWrapper(Object paramObject, String paramString, ObservableMap<K, V> paramObservableMap) {
/*  83 */     super(paramObject, paramString, paramObservableMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyMapProperty<K, V> getReadOnlyProperty() {
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
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 115 */     super.fireValueChangedEvent(paramChange);
/* 116 */     if (this.readOnlyProperty != null) {
/* 117 */       this.readOnlyProperty.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */   
/*     */   private class ReadOnlyPropertyImpl
/*     */     extends ReadOnlyMapPropertyBase<K, V>
/*     */   {
/*     */     public ObservableMap<K, V> get() {
/* 125 */       return ReadOnlyMapWrapper.this.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 130 */       return ReadOnlyMapWrapper.this.getBean();
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 135 */       return ReadOnlyMapWrapper.this.getName();
/*     */     }
/*     */ 
/*     */     
/*     */     public ReadOnlyIntegerProperty sizeProperty() {
/* 140 */       return ReadOnlyMapWrapper.this.sizeProperty();
/*     */     }
/*     */ 
/*     */     
/*     */     public ReadOnlyBooleanProperty emptyProperty() {
/* 145 */       return ReadOnlyMapWrapper.this.emptyProperty();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyMapWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */