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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends ReadOnlyObjectPropertyBase<Integer>
/*     */ {
/*     */   private boolean valid;
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   null() {
/* 141 */     this.valid = true;
/* 142 */     this.listener = (paramObservable -> {
/*     */         if (this.valid) {
/*     */           this.valid = false;
/*     */           
/*     */           fireValueChangedEvent();
/*     */         } 
/*     */       });
/*     */     
/* 150 */     ReadOnlyIntegerProperty.this.addListener((InvalidationListener)new WeakInvalidationListener(this.listener));
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 155 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 160 */     return ReadOnlyIntegerProperty.this.getName();
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer get() {
/* 165 */     this.valid = true;
/* 166 */     return ReadOnlyIntegerProperty.this.getValue();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyIntegerProperty$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */