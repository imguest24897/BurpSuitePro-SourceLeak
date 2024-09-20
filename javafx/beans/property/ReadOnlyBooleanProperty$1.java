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
/*     */ class null
/*     */   extends ReadOnlyBooleanPropertyBase
/*     */ {
/*     */   private boolean valid;
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   null() {
/*  95 */     this.valid = true;
/*  96 */     this.listener = (paramObservable -> {
/*     */         if (this.valid) {
/*     */           this.valid = false;
/*     */           
/*     */           fireValueChangedEvent();
/*     */         } 
/*     */       });
/*     */     
/* 104 */     property.addListener((InvalidationListener)new WeakInvalidationListener(this.listener));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean get() {
/* 109 */     this.valid = true;
/* 110 */     Boolean bool = (Boolean)property.getValue();
/* 111 */     return (bool == null) ? false : bool.booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 116 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 121 */     return property.getName();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyBooleanProperty$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */