/*     */ package javafx.beans.property;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends ReadOnlyDoublePropertyBase
/*     */ {
/*     */   private boolean valid;
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   null() {
/*  96 */     this.valid = true;
/*  97 */     this.listener = (paramObservable -> {
/*     */         if (this.valid) {
/*     */           this.valid = false;
/*     */           
/*     */           fireValueChangedEvent();
/*     */         } 
/*     */       });
/*     */     
/* 105 */     property.addListener((InvalidationListener)new WeakInvalidationListener(this.listener));
/*     */   }
/*     */ 
/*     */   
/*     */   public double get() {
/* 110 */     this.valid = true;
/* 111 */     Number number = (Number)property.getValue();
/* 112 */     return (number == null) ? 0.0D : number.doubleValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 117 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 122 */     return property.getName();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyDoubleProperty$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */