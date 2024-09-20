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
/*     */ 
/*     */ class null
/*     */   extends ReadOnlyIntegerPropertyBase
/*     */ {
/*     */   private boolean valid;
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   null() {
/*  97 */     this.valid = true;
/*  98 */     this.listener = (paramObservable -> {
/*     */         if (this.valid) {
/*     */           this.valid = false;
/*     */           
/*     */           fireValueChangedEvent();
/*     */         } 
/*     */       });
/*     */     
/* 106 */     property.addListener((InvalidationListener)new WeakInvalidationListener(this.listener));
/*     */   }
/*     */ 
/*     */   
/*     */   public int get() {
/* 111 */     this.valid = true;
/* 112 */     Number number = (Number)property.getValue();
/* 113 */     return (number == null) ? 0 : number.intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 118 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 123 */     return property.getName();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyIntegerProperty$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */