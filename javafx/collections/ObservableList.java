/*     */ package javafx.collections;
/*     */ 
/*     */ import java.text.Collator;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.transformation.FilteredList;
/*     */ import javafx.collections.transformation.SortedList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface ObservableList<E>
/*     */   extends List<E>, Observable
/*     */ {
/*     */   void addListener(ListChangeListener<? super E> paramListChangeListener);
/*     */   
/*     */   void removeListener(ListChangeListener<? super E> paramListChangeListener);
/*     */   
/*     */   boolean addAll(E... paramVarArgs);
/*     */   
/*     */   boolean setAll(E... paramVarArgs);
/*     */   
/*     */   boolean setAll(Collection<? extends E> paramCollection);
/*     */   
/*     */   boolean removeAll(E... paramVarArgs);
/*     */   
/*     */   boolean retainAll(E... paramVarArgs);
/*     */   
/*     */   void remove(int paramInt1, int paramInt2);
/*     */   
/*     */   default FilteredList<E> filtered(Predicate<E> paramPredicate) {
/* 116 */     return new FilteredList(this, paramPredicate);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default SortedList<E> sorted(Comparator<E> paramComparator) {
/* 127 */     return new SortedList(this, paramComparator);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default SortedList<E> sorted() {
/* 137 */     Comparator<E> comparator = new Comparator<E>()
/*     */       {
/*     */         public int compare(E param1E1, E param1E2)
/*     */         {
/* 141 */           if (param1E1 == null && param1E2 == null) {
/* 142 */             return 0;
/*     */           }
/* 144 */           if (param1E1 == null) {
/* 145 */             return -1;
/*     */           }
/* 147 */           if (param1E2 == null) {
/* 148 */             return 1;
/*     */           }
/*     */           
/* 151 */           if (param1E1 instanceof Comparable) {
/*     */             
/* 153 */             Comparable<E> comparable = (Comparable)param1E1;
/*     */             
/* 155 */             return comparable.compareTo(param1E2);
/*     */           } 
/*     */           
/* 158 */           return Collator.getInstance().compare(param1E1.toString(), param1E2.toString());
/*     */         }
/*     */       };
/* 161 */     return sorted(comparator);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */