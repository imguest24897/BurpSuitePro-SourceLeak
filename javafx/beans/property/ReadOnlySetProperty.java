/*     */ package javafx.beans.property;
/*     */ 
/*     */ import java.util.Set;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.SetExpression;
/*     */ import javafx.collections.ObservableSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlySetProperty<E>
/*     */   extends SetExpression<E>
/*     */   implements ReadOnlyProperty<ObservableSet<E>>
/*     */ {
/*     */   public void bindContentBidirectional(ObservableSet<E> paramObservableSet) {
/*  64 */     Bindings.bindContentBidirectional((ObservableSet)this, paramObservableSet);
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
/*     */   public void unbindContentBidirectional(Object paramObject) {
/*  76 */     Bindings.unbindContentBidirectional(this, paramObject);
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
/*     */   public void bindContent(ObservableSet<E> paramObservableSet) {
/*  92 */     Bindings.bindContent((Set)this, paramObservableSet);
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
/*     */   public void unbindContent(Object paramObject) {
/* 104 */     Bindings.unbindContent(this, paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 109 */     if (paramObject == this) {
/* 110 */       return true;
/*     */     }
/* 112 */     if (paramObject instanceof Set) { Set set = (Set)paramObject; if (set.size() == size()) {
/*     */         
/*     */         try {
/*     */ 
/*     */           
/* 117 */           return containsAll(set);
/* 118 */         } catch (ClassCastException|NullPointerException classCastException) {
/* 119 */           return false;
/*     */         } 
/*     */       } }
/*     */     
/*     */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 129 */     int i = 0;
/* 130 */     for (Object object : this) {
/* 131 */       if (object != null)
/* 132 */         i += object.hashCode(); 
/*     */     } 
/* 134 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 143 */     Object object = getBean();
/* 144 */     String str = getName();
/* 145 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlySetProperty [");
/*     */     
/* 147 */     if (object != null) {
/* 148 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 150 */     if (str != null && !str.equals("")) {
/* 151 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 153 */     stringBuilder.append("value: ").append(get()).append("]");
/* 154 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlySetProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */