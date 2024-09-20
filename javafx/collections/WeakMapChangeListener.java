/*    */ package javafx.collections;
/*    */ 
/*    */ import java.lang.ref.WeakReference;
/*    */ import javafx.beans.NamedArg;
/*    */ import javafx.beans.WeakListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class WeakMapChangeListener<K, V>
/*    */   implements MapChangeListener<K, V>, WeakListener
/*    */ {
/*    */   private final WeakReference<MapChangeListener<K, V>> ref;
/*    */   
/*    */   public WeakMapChangeListener(@NamedArg("listener") MapChangeListener<K, V> paramMapChangeListener) {
/* 67 */     if (paramMapChangeListener == null) {
/* 68 */       throw new NullPointerException("Listener must be specified.");
/*    */     }
/* 70 */     this.ref = new WeakReference<>(paramMapChangeListener);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean wasGarbageCollected() {
/* 78 */     return (this.ref.get() == null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onChanged(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 86 */     MapChangeListener<K, V> mapChangeListener = this.ref.get();
/* 87 */     if (mapChangeListener != null) {
/* 88 */       mapChangeListener.onChanged(paramChange);
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 93 */       paramChange.getMap().removeListener(this);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\WeakMapChangeListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */