/*     */ package javafx.util;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @FunctionalInterface
/*     */ public interface Subscription
/*     */ {
/*     */   public static final Subscription EMPTY = () -> {
/*     */     
/*     */     };
/*     */   
/*     */   static Subscription combine(Subscription... paramVarArgs) {
/*  74 */     List<Subscription> list = List.of(paramVarArgs);
/*     */     
/*  76 */     return () -> paramList.forEach(Subscription::unsubscribe);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default Subscription and(Subscription paramSubscription) {
/* 100 */     Objects.requireNonNull(paramSubscription, "other cannot be null");
/*     */     
/* 102 */     return () -> {
/*     */         unsubscribe();
/*     */         paramSubscription.unsubscribe();
/*     */       };
/*     */   }
/*     */   
/*     */   void unsubscribe();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javaf\\util\Subscription.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */