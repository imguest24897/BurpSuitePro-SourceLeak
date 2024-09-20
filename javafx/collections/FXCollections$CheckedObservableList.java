/*      */ package javafx.collections;
/*      */ 
/*      */ import com.sun.javafx.collections.SourceAdapterChange;
/*      */ import java.lang.reflect.Array;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class CheckedObservableList<T>
/*      */   extends ObservableListBase<T>
/*      */ {
/*      */   private final ObservableList<T> list;
/*      */   private final Class<T> type;
/*      */   private final ListChangeListener<T> listener;
/*      */   
/*      */   CheckedObservableList(ObservableList<T> paramObservableList, Class<T> paramClass) {
/* 1286 */     if (paramObservableList == null || paramClass == null) {
/* 1287 */       throw new NullPointerException();
/*      */     }
/* 1289 */     this.list = paramObservableList;
/* 1290 */     this.type = paramClass;
/* 1291 */     this.listener = (paramChange -> fireChange((ListChangeListener.Change<? extends T>)new SourceAdapterChange(this, paramChange)));
/*      */ 
/*      */     
/* 1294 */     paramObservableList.addListener(new WeakListChangeListener<>(this.listener));
/*      */   }
/*      */   
/*      */   void typeCheck(Object paramObject) {
/* 1298 */     if (paramObject != null && !this.type.isInstance(paramObject)) {
/* 1299 */       throw new ClassCastException("Attempt to insert " + 
/* 1300 */           String.valueOf(paramObject.getClass()) + " element into collection with element type " + String.valueOf(this.type));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int size() {
/* 1307 */     return this.list.size();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isEmpty() {
/* 1312 */     return this.list.isEmpty();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean contains(Object paramObject) {
/* 1317 */     return this.list.contains(paramObject);
/*      */   }
/*      */ 
/*      */   
/*      */   public Object[] toArray() {
/* 1322 */     return this.list.toArray();
/*      */   }
/*      */ 
/*      */   
/*      */   public <X> X[] toArray(X[] paramArrayOfX) {
/* 1327 */     return (X[])this.list.toArray((Object[])paramArrayOfX);
/*      */   }
/*      */ 
/*      */   
/*      */   public String toString() {
/* 1332 */     return this.list.toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean remove(Object paramObject) {
/* 1337 */     return this.list.remove(paramObject);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean containsAll(Collection<?> paramCollection) {
/* 1342 */     return this.list.containsAll(paramCollection);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean removeAll(Collection<?> paramCollection) {
/* 1347 */     return this.list.removeAll(paramCollection);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean retainAll(Collection<?> paramCollection) {
/* 1352 */     return this.list.retainAll(paramCollection);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean removeAll(T... paramVarArgs) {
/* 1357 */     return this.list.removeAll(paramVarArgs);
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean retainAll(T... paramVarArgs) {
/* 1362 */     return this.list.retainAll(paramVarArgs);
/*      */   }
/*      */ 
/*      */   
/*      */   public void remove(int paramInt1, int paramInt2) {
/* 1367 */     this.list.remove(paramInt1, paramInt2);
/*      */   }
/*      */ 
/*      */   
/*      */   public void clear() {
/* 1372 */     this.list.clear();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object paramObject) {
/* 1377 */     return (paramObject == this || this.list.equals(paramObject));
/*      */   }
/*      */ 
/*      */   
/*      */   public int hashCode() {
/* 1382 */     return this.list.hashCode();
/*      */   }
/*      */ 
/*      */   
/*      */   public T get(int paramInt) {
/* 1387 */     return this.list.get(paramInt);
/*      */   }
/*      */ 
/*      */   
/*      */   public T remove(int paramInt) {
/* 1392 */     return this.list.remove(paramInt);
/*      */   }
/*      */ 
/*      */   
/*      */   public int indexOf(Object paramObject) {
/* 1397 */     return this.list.indexOf(paramObject);
/*      */   }
/*      */ 
/*      */   
/*      */   public int lastIndexOf(Object paramObject) {
/* 1402 */     return this.list.lastIndexOf(paramObject);
/*      */   }
/*      */ 
/*      */   
/*      */   public T set(int paramInt, T paramT) {
/* 1407 */     typeCheck(paramT);
/* 1408 */     return this.list.set(paramInt, paramT);
/*      */   }
/*      */ 
/*      */   
/*      */   public void add(int paramInt, T paramT) {
/* 1413 */     typeCheck(paramT);
/* 1414 */     this.list.add(paramInt, paramT);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean addAll(int paramInt, Collection<? extends T> paramCollection) {
/* 1420 */     Object[] arrayOfObject = null;
/*      */     try {
/* 1422 */       arrayOfObject = paramCollection.toArray((Object[])Array.newInstance(this.type, 0));
/* 1423 */     } catch (ArrayStoreException arrayStoreException) {
/* 1424 */       throw new ClassCastException();
/*      */     } 
/*      */     
/* 1427 */     return this.list.addAll(paramInt, Arrays.asList((T[])arrayOfObject));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean addAll(Collection<? extends T> paramCollection) {
/* 1433 */     Object[] arrayOfObject = null;
/*      */     try {
/* 1435 */       arrayOfObject = paramCollection.toArray((Object[])Array.newInstance(this.type, 0));
/* 1436 */     } catch (ArrayStoreException arrayStoreException) {
/* 1437 */       throw new ClassCastException();
/*      */     } 
/*      */     
/* 1440 */     return this.list.addAll(Arrays.asList((T[])arrayOfObject));
/*      */   }
/*      */ 
/*      */   
/*      */   public ListIterator<T> listIterator() {
/* 1445 */     return listIterator(0);
/*      */   }
/*      */ 
/*      */   
/*      */   public ListIterator<T> listIterator(final int index) {
/* 1450 */     return new ListIterator<T>()
/*      */       {
/* 1452 */         ListIterator<T> i = FXCollections.CheckedObservableList.this.list.listIterator(index);
/*      */ 
/*      */         
/*      */         public boolean hasNext() {
/* 1456 */           return this.i.hasNext();
/*      */         }
/*      */ 
/*      */         
/*      */         public T next() {
/* 1461 */           return this.i.next();
/*      */         }
/*      */ 
/*      */         
/*      */         public boolean hasPrevious() {
/* 1466 */           return this.i.hasPrevious();
/*      */         }
/*      */ 
/*      */         
/*      */         public T previous() {
/* 1471 */           return this.i.previous();
/*      */         }
/*      */ 
/*      */         
/*      */         public int nextIndex() {
/* 1476 */           return this.i.nextIndex();
/*      */         }
/*      */ 
/*      */         
/*      */         public int previousIndex() {
/* 1481 */           return this.i.previousIndex();
/*      */         }
/*      */ 
/*      */         
/*      */         public void remove() {
/* 1486 */           this.i.remove();
/*      */         }
/*      */ 
/*      */         
/*      */         public void set(T param2T) {
/* 1491 */           FXCollections.CheckedObservableList.this.typeCheck(param2T);
/* 1492 */           this.i.set(param2T);
/*      */         }
/*      */ 
/*      */         
/*      */         public void add(T param2T) {
/* 1497 */           FXCollections.CheckedObservableList.this.typeCheck(param2T);
/* 1498 */           this.i.add(param2T);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */   
/*      */   public Iterator<T> iterator() {
/* 1505 */     return new Iterator<T>()
/*      */       {
/* 1507 */         private final Iterator<T> it = FXCollections.CheckedObservableList.this.list.iterator();
/*      */ 
/*      */         
/*      */         public boolean hasNext() {
/* 1511 */           return this.it.hasNext();
/*      */         }
/*      */ 
/*      */         
/*      */         public T next() {
/* 1516 */           return this.it.next();
/*      */         }
/*      */ 
/*      */         
/*      */         public void remove() {
/* 1521 */           this.it.remove();
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean add(T paramT) {
/* 1528 */     typeCheck(paramT);
/* 1529 */     return this.list.add(paramT);
/*      */   }
/*      */ 
/*      */   
/*      */   public List<T> subList(int paramInt1, int paramInt2) {
/* 1534 */     return Collections.checkedList(this.list.subList(paramInt1, paramInt2), this.type);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean addAll(T... paramVarArgs) {
/*      */     try {
/* 1541 */       Object[] arrayOfObject = (Object[])Array.newInstance(this.type, paramVarArgs.length);
/* 1542 */       System.arraycopy(paramVarArgs, 0, arrayOfObject, 0, paramVarArgs.length);
/* 1543 */       return this.list.addAll((T[])arrayOfObject);
/* 1544 */     } catch (ArrayStoreException arrayStoreException) {
/* 1545 */       throw new ClassCastException();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean setAll(T... paramVarArgs) {
/*      */     try {
/* 1553 */       Object[] arrayOfObject = (Object[])Array.newInstance(this.type, paramVarArgs.length);
/* 1554 */       System.arraycopy(paramVarArgs, 0, arrayOfObject, 0, paramVarArgs.length);
/* 1555 */       return this.list.setAll((T[])arrayOfObject);
/* 1556 */     } catch (ArrayStoreException arrayStoreException) {
/* 1557 */       throw new ClassCastException();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean setAll(Collection<? extends T> paramCollection) {
/* 1564 */     Object[] arrayOfObject = null;
/*      */     try {
/* 1566 */       arrayOfObject = paramCollection.toArray((Object[])Array.newInstance(this.type, 0));
/* 1567 */     } catch (ArrayStoreException arrayStoreException) {
/* 1568 */       throw new ClassCastException();
/*      */     } 
/*      */     
/* 1571 */     return this.list.setAll(Arrays.asList((T[])arrayOfObject));
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\FXCollections$CheckedObservableList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */