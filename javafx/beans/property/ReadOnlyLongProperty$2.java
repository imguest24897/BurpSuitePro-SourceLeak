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
/*     */ class null
/*     */   extends ReadOnlyObjectPropertyBase<Long>
/*     */ {
/*     */   private boolean valid;
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   null() {
/* 139 */     this.valid = true;
/* 140 */     this.listener = (paramObservable -> {
/*     */         if (this.valid) {
/*     */           this.valid = false;
/*     */           
/*     */           fireValueChangedEvent();
/*     */         } 
/*     */       });
/*     */     
/* 148 */     ReadOnlyLongProperty.this.addListener((InvalidationListener)new WeakInvalidationListener(this.listener));
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 153 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 158 */     return ReadOnlyLongProperty.this.getName();
/*     */   }
/*     */ 
/*     */   
/*     */   public Long get() {
/* 163 */     this.valid = true;
/* 164 */     return ReadOnlyLongProperty.this.getValue();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyLongProperty$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */