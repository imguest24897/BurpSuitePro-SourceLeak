/*    */ package javafx.beans.property.adapter;
/*    */ 
/*    */ import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor;
/*    */ import java.lang.ref.WeakReference;
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
/*    */ class DescriptorListenerCleaner<T>
/*    */   implements Runnable
/*    */ {
/*    */   private final ReadOnlyPropertyDescriptor<T> pd;
/*    */   private final WeakReference<ReadOnlyPropertyDescriptor<T>.ReadOnlyListener> lRef;
/*    */   
/*    */   DescriptorListenerCleaner(ReadOnlyPropertyDescriptor<T> paramReadOnlyPropertyDescriptor, ReadOnlyPropertyDescriptor<T>.ReadOnlyListener paramReadOnlyListener) {
/* 37 */     this.pd = paramReadOnlyPropertyDescriptor;
/* 38 */     this.lRef = new WeakReference<>(paramReadOnlyListener);
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 43 */     ReadOnlyPropertyDescriptor.ReadOnlyListener readOnlyListener = this.lRef.get();
/* 44 */     if (readOnlyListener != null)
/* 45 */       this.pd.removeListener(readOnlyListener); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\DescriptorListenerCleaner.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */