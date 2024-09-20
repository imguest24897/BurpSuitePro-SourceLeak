/*     */ package javafx.beans.property;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.ListExpression;
/*     */ import javafx.collections.ObservableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ReadOnlyListProperty<E>
/*     */   extends ListExpression<E>
/*     */   implements ReadOnlyProperty<ObservableList<E>>
/*     */ {
/*     */   public void bindContentBidirectional(ObservableList<E> paramObservableList) {
/*  68 */     Bindings.bindContentBidirectional((ObservableList)this, paramObservableList);
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
/*  80 */     Bindings.unbindContentBidirectional(this, paramObject);
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
/*     */   public void bindContent(ObservableList<E> paramObservableList) {
/*  96 */     Bindings.bindContent((List)this, paramObservableList);
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
/* 108 */     Bindings.unbindContent(this, paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 113 */     if (this == paramObject) {
/* 114 */       return true;
/*     */     }
/* 116 */     if (paramObject instanceof List) { List list = (List)paramObject; if (size() == list.size()) {
/*     */ 
/*     */ 
/*     */         
/* 120 */         ListIterator listIterator1 = listIterator();
/* 121 */         ListIterator listIterator2 = list.listIterator();
/*     */         
/* 123 */         while (listIterator1.hasNext() && listIterator2.hasNext()) {
/* 124 */           if (!Objects.equals(listIterator1.next(), listIterator2.next())) {
/* 125 */             return false;
/*     */           }
/*     */         } 
/*     */         
/* 129 */         return true;
/*     */       }  }
/*     */     
/*     */     return false;
/*     */   } public int hashCode() {
/* 134 */     int i = 1;
/* 135 */     for (Object object : this)
/* 136 */       i = 31 * i + ((object == null) ? 0 : object.hashCode()); 
/* 137 */     return i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 146 */     Object object = getBean();
/* 147 */     String str = getName();
/* 148 */     StringBuilder stringBuilder = new StringBuilder("ReadOnlyListProperty [");
/*     */     
/* 150 */     if (object != null) {
/* 151 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 153 */     if (str != null && !str.equals("")) {
/* 154 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 156 */     stringBuilder.append("value: ").append(get()).append("]");
/* 157 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyListProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */