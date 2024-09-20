/*      */ package javafx.collections;
/*      */ 
/*      */ import com.sun.javafx.collections.ListListenerHelper;
/*      */ import com.sun.javafx.collections.MapAdapterChange;
/*      */ import com.sun.javafx.collections.MapListenerHelper;
/*      */ import com.sun.javafx.collections.ObservableFloatArrayImpl;
/*      */ import com.sun.javafx.collections.ObservableIntegerArrayImpl;
/*      */ import com.sun.javafx.collections.ObservableListWrapper;
/*      */ import com.sun.javafx.collections.ObservableMapWrapper;
/*      */ import com.sun.javafx.collections.ObservableSequentialListWrapper;
/*      */ import com.sun.javafx.collections.ObservableSetWrapper;
/*      */ import com.sun.javafx.collections.SetAdapterChange;
/*      */ import com.sun.javafx.collections.SetListenerHelper;
/*      */ import com.sun.javafx.collections.SourceAdapterChange;
/*      */ import com.sun.javafx.collections.UnmodifiableObservableMap;
/*      */ import java.lang.reflect.Array;
/*      */ import java.util.AbstractList;
/*      */ import java.util.AbstractMap;
/*      */ import java.util.AbstractSet;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.Comparator;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import java.util.Map;
/*      */ import java.util.NoSuchElementException;
/*      */ import java.util.Random;
/*      */ import java.util.Set;
/*      */ import javafx.beans.InvalidationListener;
/*      */ import javafx.beans.Observable;
/*      */ import javafx.util.Callback;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FXCollections
/*      */ {
/*      */   public static <E> ObservableList<E> observableList(List<E> paramList) {
/*   96 */     if (paramList == null) {
/*   97 */       throw new NullPointerException();
/*      */     }
/*   99 */     return (paramList instanceof java.util.RandomAccess) ? (ObservableList<E>)new ObservableListWrapper(paramList) : 
/*  100 */       (ObservableList<E>)new ObservableSequentialListWrapper(paramList);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> observableList(List<E> paramList, Callback<E, Observable[]> paramCallback) {
/*  124 */     if (paramList == null || paramCallback == null) {
/*  125 */       throw new NullPointerException();
/*      */     }
/*  127 */     return (paramList instanceof java.util.RandomAccess) ? (ObservableList<E>)new ObservableListWrapper(paramList, paramCallback) : 
/*  128 */       (ObservableList<E>)new ObservableSequentialListWrapper(paramList, paramCallback);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObservableMap<K, V> observableMap(Map<K, V> paramMap) {
/*  143 */     if (paramMap == null) {
/*  144 */       throw new NullPointerException();
/*      */     }
/*  146 */     return (ObservableMap<K, V>)new ObservableMapWrapper(paramMap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableSet<E> observableSet(Set<E> paramSet) {
/*  161 */     if (paramSet == null) {
/*  162 */       throw new NullPointerException();
/*      */     }
/*  164 */     return (ObservableSet<E>)new ObservableSetWrapper(paramSet);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableSet<E> observableSet(E... paramVarArgs) {
/*  176 */     if (paramVarArgs == null) {
/*  177 */       throw new NullPointerException();
/*      */     }
/*  179 */     HashSet<? super E> hashSet = new HashSet(paramVarArgs.length);
/*  180 */     Collections.addAll(hashSet, paramVarArgs);
/*  181 */     return (ObservableSet<E>)new ObservableSetWrapper(hashSet);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObservableMap<K, V> unmodifiableObservableMap(ObservableMap<K, V> paramObservableMap) {
/*  195 */     if (paramObservableMap == null) {
/*  196 */       throw new NullPointerException();
/*      */     }
/*  198 */     return (ObservableMap<K, V>)new UnmodifiableObservableMap(paramObservableMap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObservableMap<K, V> checkedObservableMap(ObservableMap<K, V> paramObservableMap, Class<K> paramClass, Class<V> paramClass1) {
/*  213 */     if (paramObservableMap == null || paramClass == null || paramClass1 == null) {
/*  214 */       throw new NullPointerException();
/*      */     }
/*  216 */     return new CheckedObservableMap<>(paramObservableMap, paramClass, paramClass1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObservableMap<K, V> synchronizedObservableMap(ObservableMap<K, V> paramObservableMap) {
/*  229 */     if (paramObservableMap == null) {
/*  230 */       throw new NullPointerException();
/*      */     }
/*  232 */     return new SynchronizedObservableMap<>(paramObservableMap);
/*      */   }
/*      */   
/*  235 */   private static final ObservableMap<?, ?> EMPTY_OBSERVABLE_MAP = new EmptyObservableMap<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObservableMap<K, V> emptyObservableMap() {
/*  247 */     return (ObservableMap)EMPTY_OBSERVABLE_MAP;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ObservableIntegerArray observableIntegerArray() {
/*  256 */     return (ObservableIntegerArray)new ObservableIntegerArrayImpl();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ObservableIntegerArray observableIntegerArray(int... paramVarArgs) {
/*  266 */     return (ObservableIntegerArray)new ObservableIntegerArrayImpl(paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ObservableIntegerArray observableIntegerArray(ObservableIntegerArray paramObservableIntegerArray) {
/*  277 */     return (ObservableIntegerArray)new ObservableIntegerArrayImpl(paramObservableIntegerArray);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ObservableFloatArray observableFloatArray() {
/*  286 */     return (ObservableFloatArray)new ObservableFloatArrayImpl();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ObservableFloatArray observableFloatArray(float... paramVarArgs) {
/*  296 */     return (ObservableFloatArray)new ObservableFloatArrayImpl(paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static ObservableFloatArray observableFloatArray(ObservableFloatArray paramObservableFloatArray) {
/*  307 */     return (ObservableFloatArray)new ObservableFloatArrayImpl(paramObservableFloatArray);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> observableArrayList() {
/*  317 */     return observableList(new ArrayList<>());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> observableArrayList(Callback<E, Observable[]> paramCallback) {
/*  337 */     return observableList(new ArrayList<>(), paramCallback);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> observableArrayList(E... paramVarArgs) {
/*  348 */     return observableList(new ArrayList<>(Arrays.asList(paramVarArgs)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> observableArrayList(Collection<? extends E> paramCollection) {
/*  359 */     return observableList(new ArrayList<>(paramCollection));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObservableMap<K, V> observableHashMap() {
/*  369 */     return observableMap(new HashMap<>());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> concat(ObservableList<E>... paramVarArgs) {
/*  380 */     if (paramVarArgs.length == 0) {
/*  381 */       return observableArrayList();
/*      */     }
/*  383 */     if (paramVarArgs.length == 1) {
/*  384 */       return observableArrayList(paramVarArgs[0]);
/*      */     }
/*  386 */     ArrayList<E> arrayList = new ArrayList();
/*  387 */     for (ObservableList<E> observableList : paramVarArgs) {
/*  388 */       arrayList.addAll(observableList);
/*      */     }
/*      */     
/*  391 */     return observableList(arrayList);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> unmodifiableObservableList(ObservableList<E> paramObservableList) {
/*  402 */     if (paramObservableList == null) {
/*  403 */       throw new NullPointerException();
/*      */     }
/*  405 */     return new UnmodifiableObservableListImpl<>(paramObservableList);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> checkedObservableList(ObservableList<E> paramObservableList, Class<E> paramClass) {
/*  417 */     if (paramObservableList == null) {
/*  418 */       throw new NullPointerException();
/*      */     }
/*  420 */     return new CheckedObservableList<>(paramObservableList, paramClass);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> synchronizedObservableList(ObservableList<E> paramObservableList) {
/*  431 */     if (paramObservableList == null) {
/*  432 */       throw new NullPointerException();
/*      */     }
/*  434 */     return new SynchronizedObservableList<>(paramObservableList);
/*      */   }
/*      */   
/*  437 */   private static final ObservableList<?> EMPTY_OBSERVABLE_LIST = new EmptyObservableList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> emptyObservableList() {
/*  447 */     return (ObservableList)EMPTY_OBSERVABLE_LIST;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableList<E> singletonObservableList(E paramE) {
/*  458 */     return new SingletonObservableList<>(paramE);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableSet<E> unmodifiableObservableSet(ObservableSet<E> paramObservableSet) {
/*  470 */     if (paramObservableSet == null) {
/*  471 */       throw new NullPointerException();
/*      */     }
/*  473 */     return new UnmodifiableObservableSet<>(paramObservableSet);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableSet<E> checkedObservableSet(ObservableSet<E> paramObservableSet, Class<E> paramClass) {
/*  486 */     if (paramObservableSet == null) {
/*  487 */       throw new NullPointerException();
/*      */     }
/*  489 */     return new CheckedObservableSet<>(paramObservableSet, paramClass);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableSet<E> synchronizedObservableSet(ObservableSet<E> paramObservableSet) {
/*  501 */     if (paramObservableSet == null) {
/*  502 */       throw new NullPointerException();
/*      */     }
/*  504 */     return new SynchronizedObservableSet<>(paramObservableSet);
/*      */   }
/*      */   
/*  507 */   private static final ObservableSet<?> EMPTY_OBSERVABLE_SET = new EmptyObservableSet();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static Random r;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObservableSet<E> emptyObservableSet() {
/*  518 */     return (ObservableSet)EMPTY_OBSERVABLE_SET;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> void copy(ObservableList<? super T> paramObservableList, List<? extends T> paramList) {
/*  530 */     int i = paramList.size();
/*  531 */     if (i > paramObservableList.size()) {
/*  532 */       throw new IndexOutOfBoundsException("Source does not fit in dest");
/*      */     }
/*  534 */     Object[] arrayOfObject = paramObservableList.toArray();
/*  535 */     System.arraycopy(paramList.toArray(), 0, arrayOfObject, 0, i);
/*  536 */     paramObservableList.setAll((T[])arrayOfObject);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> void fill(ObservableList<? super T> paramObservableList, T paramT) {
/*  548 */     Object[] arrayOfObject = new Object[paramObservableList.size()];
/*  549 */     Arrays.fill(arrayOfObject, paramT);
/*  550 */     paramObservableList.setAll((T[])arrayOfObject);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> boolean replaceAll(ObservableList<T> paramObservableList, T paramT1, T paramT2) {
/*  565 */     Object[] arrayOfObject = paramObservableList.toArray();
/*  566 */     boolean bool = false;
/*  567 */     for (byte b = 0; b < arrayOfObject.length; b++) {
/*  568 */       if (arrayOfObject[b].equals(paramT1)) {
/*  569 */         arrayOfObject[b] = paramT2;
/*  570 */         bool = true;
/*      */       } 
/*      */     } 
/*  573 */     if (bool) {
/*  574 */       paramObservableList.setAll((T[])arrayOfObject);
/*      */     }
/*  576 */     return bool;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void reverse(ObservableList<Object> paramObservableList) {
/*  587 */     Object[] arrayOfObject = paramObservableList.toArray();
/*  588 */     for (byte b = 0; b < arrayOfObject.length / 2; b++) {
/*  589 */       Object object = arrayOfObject[b];
/*  590 */       arrayOfObject[b] = arrayOfObject[arrayOfObject.length - b - 1];
/*  591 */       arrayOfObject[arrayOfObject.length - b - 1] = object;
/*      */     } 
/*  593 */     paramObservableList.setAll(arrayOfObject);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void rotate(ObservableList<Object> paramObservableList, int paramInt) {
/*  605 */     Object[] arrayOfObject = paramObservableList.toArray();
/*      */     
/*  607 */     int i = paramObservableList.size();
/*  608 */     paramInt %= i;
/*  609 */     if (paramInt < 0)
/*  610 */       paramInt += i; 
/*  611 */     if (paramInt == 0)
/*      */       return;  byte b;
/*      */     int j;
/*  614 */     for (b = 0, j = 0; j != i; ) {
/*  615 */       Object object = arrayOfObject[b];
/*      */       
/*  617 */       int k = b;
/*      */       while (true)
/*  619 */       { k += paramInt;
/*  620 */         if (k >= i)
/*  621 */           k -= i; 
/*  622 */         Object object1 = arrayOfObject[k];
/*  623 */         arrayOfObject[k] = object;
/*  624 */         object = object1;
/*  625 */         j++;
/*  626 */         if (k == b)
/*      */           b++;  } 
/*  628 */     }  paramObservableList.setAll(arrayOfObject);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void shuffle(ObservableList<?> paramObservableList) {
/*  638 */     if (r == null) {
/*  639 */       r = new Random();
/*      */     }
/*  641 */     shuffle(paramObservableList, r);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void shuffle(ObservableList<Object> paramObservableList, Random paramRandom) {
/*  654 */     Object[] arrayOfObject = paramObservableList.toArray();
/*      */     
/*  656 */     for (int i = paramObservableList.size(); i > 1; i--) {
/*  657 */       swap(arrayOfObject, i - 1, paramRandom.nextInt(i));
/*      */     }
/*      */     
/*  660 */     paramObservableList.setAll(arrayOfObject);
/*      */   }
/*      */   
/*      */   private static void swap(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
/*  664 */     Object object = paramArrayOfObject[paramInt1];
/*  665 */     paramArrayOfObject[paramInt1] = paramArrayOfObject[paramInt2];
/*  666 */     paramArrayOfObject[paramInt2] = object;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T extends Comparable<? super T>> void sort(ObservableList<T> paramObservableList) {
/*  678 */     sort(paramObservableList, Comparator.naturalOrder());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> void sort(ObservableList<T> paramObservableList, Comparator<? super T> paramComparator) {
/*  692 */     if (paramObservableList instanceof com.sun.javafx.collections.SortableList) {
/*  693 */       paramObservableList.sort(paramComparator);
/*      */     } else {
/*  695 */       ArrayList<T> arrayList = new ArrayList<>(paramObservableList);
/*  696 */       arrayList.sort(paramComparator);
/*  697 */       paramObservableList.setAll(arrayList);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static class EmptyObservableList<E>
/*      */     extends AbstractList<E> implements ObservableList<E> {
/*  703 */     private final ListIterator<E> iterator = new ListIterator<E>()
/*      */       {
/*      */         public boolean hasNext()
/*      */         {
/*  707 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public E next() {
/*  712 */           throw new NoSuchElementException();
/*      */         }
/*      */ 
/*      */         
/*      */         public void remove() {
/*  717 */           throw new UnsupportedOperationException();
/*      */         }
/*      */ 
/*      */         
/*      */         public boolean hasPrevious() {
/*  722 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public E previous() {
/*  727 */           throw new NoSuchElementException();
/*      */         }
/*      */ 
/*      */         
/*      */         public int nextIndex() {
/*  732 */           return 0;
/*      */         }
/*      */ 
/*      */         
/*      */         public int previousIndex() {
/*  737 */           return -1;
/*      */         }
/*      */ 
/*      */         
/*      */         public void set(Object param2Object) {
/*  742 */           throw new UnsupportedOperationException();
/*      */         }
/*      */ 
/*      */         
/*      */         public void add(Object param2Object) {
/*  747 */           throw new UnsupportedOperationException();
/*      */         }
/*      */       };
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void addListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public final void removeListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(ListChangeListener<? super E> param1ListChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(ListChangeListener<? super E> param1ListChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public int size() {
/*  772 */       return 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/*  777 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<E> iterator() {
/*  782 */       return this.iterator;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/*  787 */       return param1Collection.isEmpty();
/*      */     }
/*      */ 
/*      */     
/*      */     public E get(int param1Int) {
/*  792 */       throw new IndexOutOfBoundsException();
/*      */     }
/*      */ 
/*      */     
/*      */     public int indexOf(Object param1Object) {
/*  797 */       return -1;
/*      */     }
/*      */ 
/*      */     
/*      */     public int lastIndexOf(Object param1Object) {
/*  802 */       return -1;
/*      */     }
/*      */ 
/*      */     
/*      */     public ListIterator<E> listIterator() {
/*  807 */       return this.iterator;
/*      */     }
/*      */ 
/*      */     
/*      */     public ListIterator<E> listIterator(int param1Int) {
/*  812 */       if (param1Int != 0) {
/*  813 */         throw new IndexOutOfBoundsException();
/*      */       }
/*  815 */       return this.iterator;
/*      */     }
/*      */ 
/*      */     
/*      */     public List<E> subList(int param1Int1, int param1Int2) {
/*  820 */       if (param1Int1 != 0 || param1Int2 != 0) {
/*  821 */         throw new IndexOutOfBoundsException();
/*      */       }
/*  823 */       return this;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(E... param1VarArgs) {
/*  828 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(E... param1VarArgs) {
/*  833 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(Collection<? extends E> param1Collection) {
/*  838 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(E... param1VarArgs) {
/*  843 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(E... param1VarArgs) {
/*  848 */       throw new UnsupportedOperationException();
/*      */     }
/*      */     
/*      */     public void remove(int param1Int1, int param1Int2)
/*      */     {
/*  853 */       throw new UnsupportedOperationException();
/*      */     } } class null implements ListIterator<E> { public boolean hasNext() { return false; } public E next() { throw new NoSuchElementException(); } public void remove() { throw new UnsupportedOperationException(); }
/*      */     public boolean hasPrevious() { return false; }
/*      */     public E previous() { throw new NoSuchElementException(); }
/*      */     public int nextIndex() { return 0; }
/*      */     public int previousIndex() { return -1; }
/*      */     public void set(Object param1Object) { throw new UnsupportedOperationException(); }
/*      */     public void add(Object param1Object) { throw new UnsupportedOperationException(); } }
/*      */   private static class SingletonObservableList<E> extends AbstractList<E> implements ObservableList<E> { private final E element;
/*  862 */     public SingletonObservableList(E param1E) { if (param1E == null) {
/*  863 */         throw new NullPointerException();
/*      */       }
/*  865 */       this.element = param1E; }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean addAll(E... param1VarArgs) {
/*  870 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(E... param1VarArgs) {
/*  875 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(Collection<? extends E> param1Collection) {
/*  880 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(E... param1VarArgs) {
/*  885 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(E... param1VarArgs) {
/*  890 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public void remove(int param1Int1, int param1Int2) {
/*  895 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(ListChangeListener<? super E> param1ListChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(ListChangeListener<? super E> param1ListChangeListener) {}
/*      */ 
/*      */     
/*      */     public int size() {
/*  916 */       return 1;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/*  921 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/*  926 */       return this.element.equals(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public E get(int param1Int) {
/*  931 */       if (param1Int != 0) {
/*  932 */         throw new IndexOutOfBoundsException();
/*      */       }
/*  934 */       return this.element;
/*      */     } }
/*      */ 
/*      */   
/*      */   private static class UnmodifiableObservableListImpl<T>
/*      */     extends ObservableListBase<T>
/*      */   {
/*      */     private final ObservableList<T> backingList;
/*      */     private final ListChangeListener<T> listener;
/*      */     
/*      */     public UnmodifiableObservableListImpl(ObservableList<T> param1ObservableList) {
/*  945 */       this.backingList = param1ObservableList;
/*  946 */       this.listener = (param1Change -> fireChange((ListChangeListener.Change<? extends T>)new SourceAdapterChange(this, param1Change)));
/*      */ 
/*      */       
/*  949 */       this.backingList.addListener(new WeakListChangeListener<>(this.listener));
/*      */     }
/*      */ 
/*      */     
/*      */     public T get(int param1Int) {
/*  954 */       return this.backingList.get(param1Int);
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/*  959 */       return this.backingList.size();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(T... param1VarArgs) {
/*  964 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(T... param1VarArgs) {
/*  969 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(Collection<? extends T> param1Collection) {
/*  974 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(T... param1VarArgs) {
/*  979 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(T... param1VarArgs) {
/*  984 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public void remove(int param1Int1, int param1Int2) {
/*  989 */       throw new UnsupportedOperationException();
/*      */     }
/*      */   }
/*      */   
/*      */   private static class SynchronizedList<T>
/*      */     implements List<T> {
/*      */     final Object mutex;
/*      */     private final List<T> backingList;
/*      */     
/*      */     SynchronizedList(List<T> param1List, Object param1Object) {
/*  999 */       this.backingList = param1List;
/* 1000 */       this.mutex = param1Object;
/*      */     }
/*      */     
/*      */     SynchronizedList(List<T> param1List) {
/* 1004 */       this.backingList = param1List;
/* 1005 */       this.mutex = this;
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/* 1010 */       synchronized (this.mutex) {
/* 1011 */         return this.backingList.size();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 1017 */       synchronized (this.mutex) {
/* 1018 */         return this.backingList.isEmpty();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 1024 */       synchronized (this.mutex) {
/* 1025 */         return this.backingList.contains(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<T> iterator() {
/* 1031 */       return this.backingList.iterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public Object[] toArray() {
/* 1036 */       synchronized (this.mutex) {
/* 1037 */         return this.backingList.toArray();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public <X> X[] toArray(X[] param1ArrayOfX) {
/* 1043 */       synchronized (this.mutex) {
/* 1044 */         return this.backingList.toArray(param1ArrayOfX);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean add(T param1T) {
/* 1050 */       synchronized (this.mutex) {
/* 1051 */         return this.backingList.add(param1T);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean remove(Object param1Object) {
/* 1057 */       synchronized (this.mutex) {
/* 1058 */         return this.backingList.remove(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/* 1064 */       synchronized (this.mutex) {
/* 1065 */         return this.backingList.containsAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(Collection<? extends T> param1Collection) {
/* 1071 */       synchronized (this.mutex) {
/* 1072 */         return this.backingList.addAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(int param1Int, Collection<? extends T> param1Collection) {
/* 1078 */       synchronized (this.mutex) {
/* 1079 */         return this.backingList.addAll(param1Int, param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean removeAll(Collection<?> param1Collection) {
/* 1086 */       synchronized (this.mutex) {
/* 1087 */         return this.backingList.removeAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(Collection<?> param1Collection) {
/* 1093 */       synchronized (this.mutex) {
/* 1094 */         return this.backingList.retainAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void clear() {
/* 1100 */       synchronized (this.mutex) {
/* 1101 */         this.backingList.clear();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public T get(int param1Int) {
/* 1107 */       synchronized (this.mutex) {
/* 1108 */         return this.backingList.get(param1Int);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public T set(int param1Int, T param1T) {
/* 1114 */       synchronized (this.mutex) {
/* 1115 */         return this.backingList.set(param1Int, param1T);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void add(int param1Int, T param1T) {
/* 1121 */       synchronized (this.mutex) {
/* 1122 */         this.backingList.add(param1Int, param1T);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public T remove(int param1Int) {
/* 1128 */       synchronized (this.mutex) {
/* 1129 */         return this.backingList.remove(param1Int);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int indexOf(Object param1Object) {
/* 1135 */       synchronized (this.mutex) {
/* 1136 */         return this.backingList.indexOf(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int lastIndexOf(Object param1Object) {
/* 1142 */       synchronized (this.mutex) {
/* 1143 */         return this.backingList.lastIndexOf(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public ListIterator<T> listIterator() {
/* 1149 */       return this.backingList.listIterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public ListIterator<T> listIterator(int param1Int) {
/* 1154 */       synchronized (this.mutex) {
/* 1155 */         return this.backingList.listIterator(param1Int);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public List<T> subList(int param1Int1, int param1Int2) {
/* 1161 */       synchronized (this.mutex) {
/* 1162 */         return new SynchronizedList(this.backingList.subList(param1Int1, param1Int2), this.mutex);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1169 */       synchronized (this.mutex) {
/* 1170 */         return this.backingList.toString();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 1176 */       synchronized (this.mutex) {
/* 1177 */         return this.backingList.hashCode();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 1183 */       synchronized (this.mutex) {
/* 1184 */         return this.backingList.equals(param1Object);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private static class SynchronizedObservableList<T>
/*      */     extends SynchronizedList<T>
/*      */     implements ObservableList<T>
/*      */   {
/*      */     private ListListenerHelper<T> helper;
/*      */     private final ObservableList<T> backingList;
/*      */     private final ListChangeListener<T> listener;
/*      */     
/*      */     SynchronizedObservableList(ObservableList<T> param1ObservableList) {
/* 1198 */       super(param1ObservableList);
/* 1199 */       this.backingList = param1ObservableList;
/* 1200 */       this.listener = (param1Change -> ListListenerHelper.fireValueChangedEvent(this.helper, (ListChangeListener.Change)new SourceAdapterChange(this, param1Change)));
/*      */ 
/*      */       
/* 1203 */       this.backingList.addListener(new WeakListChangeListener<>(this.listener));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(T... param1VarArgs) {
/* 1208 */       synchronized (this.mutex) {
/* 1209 */         return this.backingList.addAll(param1VarArgs);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(T... param1VarArgs) {
/* 1215 */       synchronized (this.mutex) {
/* 1216 */         return this.backingList.setAll(param1VarArgs);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(T... param1VarArgs) {
/* 1222 */       synchronized (this.mutex) {
/* 1223 */         return this.backingList.removeAll(param1VarArgs);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(T... param1VarArgs) {
/* 1229 */       synchronized (this.mutex) {
/* 1230 */         return this.backingList.retainAll(param1VarArgs);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void remove(int param1Int1, int param1Int2) {
/* 1236 */       synchronized (this.mutex) {
/* 1237 */         this.backingList.remove(param1Int1, param1Int2);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean setAll(Collection<? extends T> param1Collection) {
/* 1243 */       synchronized (this.mutex) {
/* 1244 */         return this.backingList.setAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public final void addListener(InvalidationListener param1InvalidationListener) {
/* 1250 */       synchronized (this.mutex) {
/* 1251 */         this.helper = ListListenerHelper.addListener(this.helper, param1InvalidationListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public final void removeListener(InvalidationListener param1InvalidationListener) {
/* 1257 */       synchronized (this.mutex) {
/* 1258 */         this.helper = ListListenerHelper.removeListener(this.helper, param1InvalidationListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(ListChangeListener<? super T> param1ListChangeListener) {
/* 1264 */       synchronized (this.mutex) {
/* 1265 */         this.helper = ListListenerHelper.addListener(this.helper, param1ListChangeListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(ListChangeListener<? super T> param1ListChangeListener) {
/* 1271 */       synchronized (this.mutex) {
/* 1272 */         this.helper = ListListenerHelper.removeListener(this.helper, param1ListChangeListener);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class CheckedObservableList<T>
/*      */     extends ObservableListBase<T>
/*      */   {
/*      */     private final ObservableList<T> list;
/*      */     private final Class<T> type;
/*      */     private final ListChangeListener<T> listener;
/*      */     
/*      */     CheckedObservableList(ObservableList<T> param1ObservableList, Class<T> param1Class) {
/* 1286 */       if (param1ObservableList == null || param1Class == null) {
/* 1287 */         throw new NullPointerException();
/*      */       }
/* 1289 */       this.list = param1ObservableList;
/* 1290 */       this.type = param1Class;
/* 1291 */       this.listener = (param1Change -> fireChange((ListChangeListener.Change<? extends T>)new SourceAdapterChange(this, param1Change)));
/*      */ 
/*      */       
/* 1294 */       param1ObservableList.addListener(new WeakListChangeListener<>(this.listener));
/*      */     }
/*      */     
/*      */     void typeCheck(Object param1Object) {
/* 1298 */       if (param1Object != null && !this.type.isInstance(param1Object)) {
/* 1299 */         throw new ClassCastException("Attempt to insert " + 
/* 1300 */             String.valueOf(param1Object.getClass()) + " element into collection with element type " + String.valueOf(this.type));
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int size() {
/* 1307 */       return this.list.size();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 1312 */       return this.list.isEmpty();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 1317 */       return this.list.contains(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public Object[] toArray() {
/* 1322 */       return this.list.toArray();
/*      */     }
/*      */ 
/*      */     
/*      */     public <X> X[] toArray(X[] param1ArrayOfX) {
/* 1327 */       return (X[])this.list.toArray((Object[])param1ArrayOfX);
/*      */     }
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1332 */       return this.list.toString();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean remove(Object param1Object) {
/* 1337 */       return this.list.remove(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/* 1342 */       return this.list.containsAll(param1Collection);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(Collection<?> param1Collection) {
/* 1347 */       return this.list.removeAll(param1Collection);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(Collection<?> param1Collection) {
/* 1352 */       return this.list.retainAll(param1Collection);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(T... param1VarArgs) {
/* 1357 */       return this.list.removeAll(param1VarArgs);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(T... param1VarArgs) {
/* 1362 */       return this.list.retainAll(param1VarArgs);
/*      */     }
/*      */ 
/*      */     
/*      */     public void remove(int param1Int1, int param1Int2) {
/* 1367 */       this.list.remove(param1Int1, param1Int2);
/*      */     }
/*      */ 
/*      */     
/*      */     public void clear() {
/* 1372 */       this.list.clear();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 1377 */       return (param1Object == this || this.list.equals(param1Object));
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 1382 */       return this.list.hashCode();
/*      */     }
/*      */ 
/*      */     
/*      */     public T get(int param1Int) {
/* 1387 */       return this.list.get(param1Int);
/*      */     }
/*      */ 
/*      */     
/*      */     public T remove(int param1Int) {
/* 1392 */       return this.list.remove(param1Int);
/*      */     }
/*      */ 
/*      */     
/*      */     public int indexOf(Object param1Object) {
/* 1397 */       return this.list.indexOf(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public int lastIndexOf(Object param1Object) {
/* 1402 */       return this.list.lastIndexOf(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public T set(int param1Int, T param1T) {
/* 1407 */       typeCheck(param1T);
/* 1408 */       return this.list.set(param1Int, param1T);
/*      */     }
/*      */ 
/*      */     
/*      */     public void add(int param1Int, T param1T) {
/* 1413 */       typeCheck(param1T);
/* 1414 */       this.list.add(param1Int, param1T);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean addAll(int param1Int, Collection<? extends T> param1Collection) {
/* 1420 */       Object[] arrayOfObject = null;
/*      */       try {
/* 1422 */         arrayOfObject = param1Collection.toArray((Object[])Array.newInstance(this.type, 0));
/* 1423 */       } catch (ArrayStoreException arrayStoreException) {
/* 1424 */         throw new ClassCastException();
/*      */       } 
/*      */       
/* 1427 */       return this.list.addAll(param1Int, Arrays.asList((T[])arrayOfObject));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean addAll(Collection<? extends T> param1Collection) {
/* 1433 */       Object[] arrayOfObject = null;
/*      */       try {
/* 1435 */         arrayOfObject = param1Collection.toArray((Object[])Array.newInstance(this.type, 0));
/* 1436 */       } catch (ArrayStoreException arrayStoreException) {
/* 1437 */         throw new ClassCastException();
/*      */       } 
/*      */       
/* 1440 */       return this.list.addAll(Arrays.asList((T[])arrayOfObject));
/*      */     }
/*      */ 
/*      */     
/*      */     public ListIterator<T> listIterator() {
/* 1445 */       return listIterator(0);
/*      */     }
/*      */ 
/*      */     
/*      */     public ListIterator<T> listIterator(final int index) {
/* 1450 */       return new ListIterator<T>()
/*      */         {
/* 1452 */           ListIterator<T> i = FXCollections.CheckedObservableList.this.list.listIterator(index);
/*      */ 
/*      */           
/*      */           public boolean hasNext() {
/* 1456 */             return this.i.hasNext();
/*      */           }
/*      */ 
/*      */           
/*      */           public T next() {
/* 1461 */             return this.i.next();
/*      */           }
/*      */ 
/*      */           
/*      */           public boolean hasPrevious() {
/* 1466 */             return this.i.hasPrevious();
/*      */           }
/*      */ 
/*      */           
/*      */           public T previous() {
/* 1471 */             return this.i.previous();
/*      */           }
/*      */ 
/*      */           
/*      */           public int nextIndex() {
/* 1476 */             return this.i.nextIndex();
/*      */           }
/*      */ 
/*      */           
/*      */           public int previousIndex() {
/* 1481 */             return this.i.previousIndex();
/*      */           }
/*      */ 
/*      */           
/*      */           public void remove() {
/* 1486 */             this.i.remove();
/*      */           }
/*      */ 
/*      */           
/*      */           public void set(T param2T) {
/* 1491 */             FXCollections.CheckedObservableList.this.typeCheck(param2T);
/* 1492 */             this.i.set(param2T);
/*      */           }
/*      */ 
/*      */           
/*      */           public void add(T param2T) {
/* 1497 */             FXCollections.CheckedObservableList.this.typeCheck(param2T);
/* 1498 */             this.i.add(param2T);
/*      */           }
/*      */         };
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<T> iterator() {
/* 1505 */       return new Iterator<T>()
/*      */         {
/* 1507 */           private final Iterator<T> it = FXCollections.CheckedObservableList.this.list.iterator();
/*      */ 
/*      */           
/*      */           public boolean hasNext() {
/* 1511 */             return this.it.hasNext();
/*      */           }
/*      */ 
/*      */           
/*      */           public T next() {
/* 1516 */             return this.it.next();
/*      */           }
/*      */ 
/*      */           
/*      */           public void remove() {
/* 1521 */             this.it.remove();
/*      */           }
/*      */         };
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean add(T param1T) {
/* 1528 */       typeCheck(param1T);
/* 1529 */       return this.list.add(param1T);
/*      */     }
/*      */ 
/*      */     
/*      */     public List<T> subList(int param1Int1, int param1Int2) {
/* 1534 */       return Collections.checkedList(this.list.subList(param1Int1, param1Int2), this.type);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean addAll(T... param1VarArgs) {
/*      */       try {
/* 1541 */         Object[] arrayOfObject = (Object[])Array.newInstance(this.type, param1VarArgs.length);
/* 1542 */         System.arraycopy(param1VarArgs, 0, arrayOfObject, 0, param1VarArgs.length);
/* 1543 */         return this.list.addAll((T[])arrayOfObject);
/* 1544 */       } catch (ArrayStoreException arrayStoreException) {
/* 1545 */         throw new ClassCastException();
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean setAll(T... param1VarArgs) {
/*      */       try {
/* 1553 */         Object[] arrayOfObject = (Object[])Array.newInstance(this.type, param1VarArgs.length);
/* 1554 */         System.arraycopy(param1VarArgs, 0, arrayOfObject, 0, param1VarArgs.length);
/* 1555 */         return this.list.setAll((T[])arrayOfObject);
/* 1556 */       } catch (ArrayStoreException arrayStoreException) {
/* 1557 */         throw new ClassCastException();
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean setAll(Collection<? extends T> param1Collection) {
/* 1564 */       Object[] arrayOfObject = null;
/*      */       try {
/* 1566 */         arrayOfObject = param1Collection.toArray((Object[])Array.newInstance(this.type, 0));
/* 1567 */       } catch (ArrayStoreException arrayStoreException) {
/* 1568 */         throw new ClassCastException();
/*      */       } 
/*      */       
/* 1571 */       return this.list.setAll(Arrays.asList((T[])arrayOfObject));
/*      */     }
/*      */   } class null implements ListIterator<T> { ListIterator<T> i = this.this$0.list.listIterator(index); public boolean hasNext() { return this.i.hasNext(); } public T next() { return this.i.next(); } public boolean hasPrevious() { return this.i.hasPrevious(); } public T previous() { return this.i.previous(); } public int nextIndex() { return this.i.nextIndex(); } public int previousIndex() { return this.i.previousIndex(); } public void remove() { this.i.remove(); } public void set(T param1T) { this.this$0.typeCheck(param1T); this.i.set(param1T); } public void add(T param1T) { this.this$0.typeCheck(param1T); this.i.add(param1T); } } class null implements Iterator<T> { private final Iterator<T> it = this.this$0.list.iterator();
/*      */     public boolean hasNext() { return this.it.hasNext(); }
/*      */     public T next() { return this.it.next(); }
/*      */     public void remove() { this.it.remove(); } }
/* 1577 */   private static class EmptyObservableSet<E> extends AbstractSet<E> implements ObservableSet<E> { private final Iterator<E> iterator = new Iterator<E>()
/*      */       {
/*      */         public boolean hasNext() {
/* 1580 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public E next() {
/* 1585 */           throw new NoSuchElementException();
/*      */         }
/*      */ 
/*      */         
/*      */         public void remove() {
/* 1590 */           throw new UnsupportedOperationException();
/*      */         }
/*      */       };
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(SetChangeListener<? super E> param1SetChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(SetChangeListener<? super E> param1SetChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public int size() {
/* 1615 */       return 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 1620 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 1625 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/* 1630 */       return param1Collection.isEmpty();
/*      */     }
/*      */ 
/*      */     
/*      */     public Object[] toArray() {
/* 1635 */       return new Object[0];
/*      */     }
/*      */ 
/*      */     
/*      */     public <X> X[] toArray(X[] param1ArrayOfX) {
/* 1640 */       if (param1ArrayOfX.length > 0)
/* 1641 */         param1ArrayOfX[0] = null; 
/* 1642 */       return param1ArrayOfX;
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<E> iterator() {
/* 1647 */       return this.iterator;
/*      */     } } class null implements Iterator<E> { public boolean hasNext() {
/*      */       return false;
/*      */     } public E next() {
/*      */       throw new NoSuchElementException();
/*      */     }
/*      */     public void remove() {
/*      */       throw new UnsupportedOperationException();
/*      */     } }
/*      */   private static class UnmodifiableObservableSet<E> extends AbstractSet<E> implements ObservableSet<E> { private final ObservableSet<E> backingSet; private SetListenerHelper<E> listenerHelper; private SetChangeListener<E> listener;
/*      */     public UnmodifiableObservableSet(ObservableSet<E> param1ObservableSet) {
/* 1658 */       this.backingSet = param1ObservableSet;
/* 1659 */       this.listener = null;
/*      */     }
/*      */     
/*      */     private void initListener() {
/* 1663 */       if (this.listener == null) {
/* 1664 */         this.listener = (param1Change -> callObservers((SetChangeListener.Change<? extends E>)new SetAdapterChange(this, param1Change)));
/*      */ 
/*      */         
/* 1667 */         this.backingSet.addListener(new WeakSetChangeListener<>(this.listener));
/*      */       } 
/*      */     }
/*      */     
/*      */     private void callObservers(SetChangeListener.Change<? extends E> param1Change) {
/* 1672 */       SetListenerHelper.fireValueChangedEvent(this.listenerHelper, param1Change);
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<E> iterator() {
/* 1677 */       return new Iterator<E>() {
/* 1678 */           private final Iterator<? extends E> i = FXCollections.UnmodifiableObservableSet.this.backingSet.iterator();
/*      */ 
/*      */           
/*      */           public boolean hasNext() {
/* 1682 */             return this.i.hasNext();
/*      */           }
/*      */ 
/*      */           
/*      */           public E next() {
/* 1687 */             return this.i.next();
/*      */           }
/*      */         };
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/* 1694 */       return this.backingSet.size();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 1699 */       return this.backingSet.isEmpty();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 1704 */       return this.backingSet.contains(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {
/* 1709 */       initListener();
/* 1710 */       this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, param1InvalidationListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {
/* 1715 */       this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, param1InvalidationListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 1720 */       initListener();
/* 1721 */       this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, param1SetChangeListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 1726 */       this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, param1SetChangeListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean add(E param1E) {
/* 1731 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean remove(Object param1Object) {
/* 1736 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(Collection<? extends E> param1Collection) {
/* 1741 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(Collection<?> param1Collection) {
/* 1746 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(Collection<?> param1Collection) {
/* 1751 */       throw new UnsupportedOperationException();
/*      */     }
/*      */ 
/*      */     
/*      */     public void clear() {
/* 1756 */       throw new UnsupportedOperationException();
/*      */     } } class null implements Iterator<E> { private final Iterator<? extends E> i = this.this$0.backingSet.iterator(); public boolean hasNext() {
/*      */       return this.i.hasNext();
/*      */     }
/*      */     public E next() {
/*      */       return this.i.next();
/*      */     } }
/*      */   private static class SynchronizedSet<E> implements Set<E> { final Object mutex; private final Set<E> backingSet;
/*      */     SynchronizedSet(Set<E> param1Set, Object param1Object) {
/* 1765 */       this.backingSet = param1Set;
/* 1766 */       this.mutex = param1Object;
/*      */     }
/*      */     
/*      */     SynchronizedSet(Set<E> param1Set) {
/* 1770 */       this.backingSet = param1Set;
/* 1771 */       this.mutex = this;
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/* 1776 */       synchronized (this.mutex) {
/* 1777 */         return this.backingSet.size();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 1783 */       synchronized (this.mutex) {
/* 1784 */         return this.backingSet.isEmpty();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 1790 */       synchronized (this.mutex) {
/* 1791 */         return this.backingSet.contains(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<E> iterator() {
/* 1797 */       return this.backingSet.iterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public Object[] toArray() {
/* 1802 */       synchronized (this.mutex) {
/* 1803 */         return this.backingSet.toArray();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public <X> X[] toArray(X[] param1ArrayOfX) {
/* 1809 */       synchronized (this.mutex) {
/* 1810 */         return this.backingSet.toArray(param1ArrayOfX);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean add(E param1E) {
/* 1816 */       synchronized (this.mutex) {
/* 1817 */         return this.backingSet.add(param1E);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean remove(Object param1Object) {
/* 1823 */       synchronized (this.mutex) {
/* 1824 */         return this.backingSet.remove(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/* 1830 */       synchronized (this.mutex) {
/* 1831 */         return this.backingSet.containsAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(Collection<? extends E> param1Collection) {
/* 1837 */       synchronized (this.mutex) {
/* 1838 */         return this.backingSet.addAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(Collection<?> param1Collection) {
/* 1844 */       synchronized (this.mutex) {
/* 1845 */         return this.backingSet.retainAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(Collection<?> param1Collection) {
/* 1851 */       synchronized (this.mutex) {
/* 1852 */         return this.backingSet.removeAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void clear() {
/* 1858 */       synchronized (this.mutex) {
/* 1859 */         this.backingSet.clear();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 1865 */       if (param1Object == this) {
/* 1866 */         return true;
/*      */       }
/* 1868 */       synchronized (this.mutex) {
/* 1869 */         return this.backingSet.equals(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 1875 */       synchronized (this.mutex) {
/* 1876 */         return this.backingSet.hashCode();
/*      */       } 
/*      */     } }
/*      */ 
/*      */   
/*      */   private static class SynchronizedObservableSet<E>
/*      */     extends SynchronizedSet<E> implements ObservableSet<E> {
/*      */     private final ObservableSet<E> backingSet;
/*      */     private SetListenerHelper<E> listenerHelper;
/*      */     private final SetChangeListener<E> listener;
/*      */     
/*      */     SynchronizedObservableSet(ObservableSet<E> param1ObservableSet) {
/* 1888 */       super(param1ObservableSet);
/* 1889 */       this.backingSet = param1ObservableSet;
/* 1890 */       this.listener = (param1Change -> SetListenerHelper.fireValueChangedEvent(this.listenerHelper, (SetChangeListener.Change)new SetAdapterChange(this, param1Change)));
/*      */ 
/*      */       
/* 1893 */       this.backingSet.addListener(new WeakSetChangeListener<>(this.listener));
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {
/* 1898 */       synchronized (this.mutex) {
/* 1899 */         this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, param1InvalidationListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {
/* 1905 */       synchronized (this.mutex) {
/* 1906 */         this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, param1InvalidationListener);
/*      */       } 
/*      */     }
/*      */     
/*      */     public void addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 1911 */       synchronized (this.mutex) {
/* 1912 */         this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, param1SetChangeListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 1918 */       synchronized (this.mutex) {
/* 1919 */         this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, param1SetChangeListener);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private static class CheckedObservableSet<E>
/*      */     extends AbstractSet<E> implements ObservableSet<E> {
/*      */     private final ObservableSet<E> backingSet;
/*      */     private final Class<E> type;
/*      */     private SetListenerHelper<E> listenerHelper;
/*      */     private final SetChangeListener<E> listener;
/*      */     
/*      */     CheckedObservableSet(ObservableSet<E> param1ObservableSet, Class<E> param1Class) {
/* 1932 */       if (param1ObservableSet == null || param1Class == null) {
/* 1933 */         throw new NullPointerException();
/*      */       }
/* 1935 */       this.backingSet = param1ObservableSet;
/* 1936 */       this.type = param1Class;
/* 1937 */       this.listener = (param1Change -> callObservers((SetChangeListener.Change<? extends E>)new SetAdapterChange(this, param1Change)));
/*      */ 
/*      */       
/* 1940 */       this.backingSet.addListener(new WeakSetChangeListener<>(this.listener));
/*      */     }
/*      */     
/*      */     private void callObservers(SetChangeListener.Change<? extends E> param1Change) {
/* 1944 */       SetListenerHelper.fireValueChangedEvent(this.listenerHelper, param1Change);
/*      */     }
/*      */     
/*      */     void typeCheck(Object param1Object) {
/* 1948 */       if (param1Object != null && !this.type.isInstance(param1Object)) {
/* 1949 */         throw new ClassCastException("Attempt to insert " + 
/* 1950 */             String.valueOf(param1Object.getClass()) + " element into collection with element type " + String.valueOf(this.type));
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {
/* 1957 */       this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, param1InvalidationListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {
/* 1962 */       this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, param1InvalidationListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 1967 */       this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, param1SetChangeListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 1972 */       this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, param1SetChangeListener);
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/* 1977 */       return this.backingSet.size();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 1982 */       return this.backingSet.isEmpty();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 1987 */       return this.backingSet.contains(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public Object[] toArray() {
/* 1992 */       return this.backingSet.toArray();
/*      */     }
/*      */ 
/*      */     
/*      */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 1997 */       return (T[])this.backingSet.toArray((Object[])param1ArrayOfT);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean add(E param1E) {
/* 2002 */       typeCheck(param1E);
/* 2003 */       return this.backingSet.add(param1E);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean remove(Object param1Object) {
/* 2008 */       return this.backingSet.remove(param1Object);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/* 2013 */       return this.backingSet.containsAll(param1Collection);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean addAll(Collection<? extends E> param1Collection) {
/* 2019 */       Object[] arrayOfObject = null;
/*      */       try {
/* 2021 */         arrayOfObject = param1Collection.toArray((Object[])Array.newInstance(this.type, 0));
/* 2022 */       } catch (ArrayStoreException arrayStoreException) {
/* 2023 */         throw new ClassCastException();
/*      */       } 
/*      */       
/* 2026 */       return this.backingSet.addAll(Arrays.asList((E[])arrayOfObject));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(Collection<?> param1Collection) {
/* 2031 */       return this.backingSet.retainAll(param1Collection);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(Collection<?> param1Collection) {
/* 2036 */       return this.backingSet.removeAll(param1Collection);
/*      */     }
/*      */ 
/*      */     
/*      */     public void clear() {
/* 2041 */       this.backingSet.clear();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 2046 */       return (param1Object == this || this.backingSet.equals(param1Object));
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 2051 */       return this.backingSet.hashCode();
/*      */     }
/*      */     
/*      */     public Iterator<E> iterator()
/*      */     {
/* 2056 */       final Iterator<E> it = this.backingSet.iterator();
/*      */       
/* 2058 */       return new Iterator<E>()
/*      */         {
/*      */           public boolean hasNext() {
/* 2061 */             return it.hasNext();
/*      */           }
/*      */ 
/*      */           
/*      */           public E next() {
/* 2066 */             return it.next();
/*      */           }
/*      */           
/*      */           public void remove()
/*      */           {
/* 2071 */             it.remove(); } }; } } class null implements Iterator<E> { public boolean hasNext() { return it.hasNext(); } public E next() { return it.next(); } public void remove() { it.remove(); }
/*      */      }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class EmptyObservableMap<K, V>
/*      */     extends AbstractMap<K, V>
/*      */     implements ObservableMap<K, V>
/*      */   {
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {}
/*      */ 
/*      */ 
/*      */     
/*      */     public int size() {
/* 2101 */       return 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 2106 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsKey(Object param1Object) {
/* 2111 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsValue(Object param1Object) {
/* 2116 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public V get(Object param1Object) {
/* 2121 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public Set<K> keySet() {
/* 2126 */       return FXCollections.emptyObservableSet();
/*      */     }
/*      */ 
/*      */     
/*      */     public Collection<V> values() {
/* 2131 */       return FXCollections.emptyObservableSet();
/*      */     }
/*      */ 
/*      */     
/*      */     public Set<Map.Entry<K, V>> entrySet() {
/* 2136 */       return FXCollections.emptyObservableSet();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 2141 */       return (param1Object instanceof Map && ((Map)param1Object).isEmpty());
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 2146 */       return 0;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class CheckedObservableMap<K, V>
/*      */     extends AbstractMap<K, V>
/*      */     implements ObservableMap<K, V>
/*      */   {
/*      */     private final ObservableMap<K, V> backingMap;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Class<K> keyType;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Class<V> valueType;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private MapListenerHelper<K, V> listenerHelper;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final MapChangeListener<K, V> listener;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private transient Set<Map.Entry<K, V>> entrySet;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     CheckedObservableMap(ObservableMap<K, V> param1ObservableMap, Class<K> param1Class, Class<V> param1Class1) {
/* 2280 */       this.entrySet = null; this.backingMap = param1ObservableMap; this.keyType = param1Class; this.valueType = param1Class1; this.listener = (param1Change -> callObservers((MapChangeListener.Change<? extends K, ? extends V>)new MapAdapterChange(this, param1Change))); this.backingMap.addListener(new WeakMapChangeListener<>(this.listener));
/*      */     } private void callObservers(MapChangeListener.Change<? extends K, ? extends V> param1Change) { MapListenerHelper.fireValueChangedEvent(this.listenerHelper, param1Change); } void typeCheck(Object param1Object1, Object param1Object2) { if (param1Object1 != null && !this.keyType.isInstance(param1Object1)) throw new ClassCastException("Attempt to insert " + String.valueOf(param1Object1.getClass()) + " key into map with key type " + String.valueOf(this.keyType));  if (param1Object2 != null && !this.valueType.isInstance(param1Object2)) throw new ClassCastException("Attempt to insert " + String.valueOf(param1Object2.getClass()) + " value into map with value type " + String.valueOf(this.valueType));  } public void addListener(InvalidationListener param1InvalidationListener) { this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, param1InvalidationListener); } public void removeListener(InvalidationListener param1InvalidationListener) { this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, param1InvalidationListener); } public void addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) { this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, param1MapChangeListener); } public void removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) { this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, param1MapChangeListener); } public int size() { return this.backingMap.size(); } public boolean isEmpty() { return this.backingMap.isEmpty(); } public boolean containsKey(Object param1Object) { return this.backingMap.containsKey(param1Object); } public boolean containsValue(Object param1Object) { return this.backingMap.containsValue(param1Object); } public V get(Object param1Object) { return this.backingMap.get(param1Object); } public V put(K param1K, V param1V) { typeCheck(param1K, param1V); return this.backingMap.put(param1K, param1V); } public V remove(Object param1Object) { return this.backingMap.remove(param1Object); } public void putAll(Map<? extends K, ? extends V> param1Map) { Object[] arrayOfObject = param1Map.entrySet().toArray(); ArrayList arrayList = new ArrayList(arrayOfObject.length); for (Object object1 : arrayOfObject) { Map.Entry entry = (Map.Entry)object1; Object object2 = entry.getKey(); Object object3 = entry.getValue(); typeCheck(object2, object3); arrayList.add(new AbstractMap.SimpleImmutableEntry<>(object2, object3)); }  for (Map.Entry entry : arrayList) this.backingMap.put((K)entry.getKey(), (V)entry.getValue());  } public void clear() { this.backingMap.clear(); }
/*      */     public Set<K> keySet() { return this.backingMap.keySet(); }
/*      */     public Collection<V> values() { return this.backingMap.values(); }
/* 2284 */     public Set<Map.Entry<K, V>> entrySet() { if (this.entrySet == null)
/* 2285 */         this.entrySet = new CheckedEntrySet<>(this.backingMap.entrySet(), this.valueType); 
/* 2286 */       return this.entrySet; }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 2291 */       return (param1Object == this || this.backingMap.equals(param1Object));
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 2296 */       return this.backingMap.hashCode();
/*      */     }
/*      */     
/*      */     static class CheckedEntrySet<K, V> implements Set<Map.Entry<K, V>> {
/*      */       private final Set<Map.Entry<K, V>> s;
/*      */       private final Class<V> valueType;
/*      */       
/*      */       CheckedEntrySet(Set<Map.Entry<K, V>> param2Set, Class<V> param2Class) {
/* 2304 */         this.s = param2Set;
/* 2305 */         this.valueType = param2Class;
/*      */       }
/*      */ 
/*      */       
/*      */       public int size() {
/* 2310 */         return this.s.size();
/*      */       }
/*      */ 
/*      */       
/*      */       public boolean isEmpty() {
/* 2315 */         return this.s.isEmpty();
/*      */       }
/*      */ 
/*      */       
/*      */       public String toString() {
/* 2320 */         return this.s.toString();
/*      */       }
/*      */ 
/*      */       
/*      */       public int hashCode() {
/* 2325 */         return this.s.hashCode();
/*      */       }
/*      */ 
/*      */       
/*      */       public void clear() {
/* 2330 */         this.s.clear();
/*      */       }
/*      */ 
/*      */       
/*      */       public boolean add(Map.Entry<K, V> param2Entry) {
/* 2335 */         throw new UnsupportedOperationException();
/*      */       }
/*      */ 
/*      */       
/*      */       public boolean addAll(Collection<? extends Map.Entry<K, V>> param2Collection) {
/* 2340 */         throw new UnsupportedOperationException();
/*      */       }
/*      */ 
/*      */       
/*      */       public Iterator<Map.Entry<K, V>> iterator() {
/* 2345 */         final Iterator<Map.Entry<K, V>> i = this.s.iterator();
/* 2346 */         final Class<V> valueType = this.valueType;
/*      */         
/* 2348 */         return new Iterator<Map.Entry<K, V>>()
/*      */           {
/*      */             public boolean hasNext() {
/* 2351 */               return i.hasNext();
/*      */             }
/*      */ 
/*      */             
/*      */             public void remove() {
/* 2356 */               i.remove();
/*      */             }
/*      */ 
/*      */             
/*      */             public Map.Entry<K, V> next() {
/* 2361 */               return FXCollections.CheckedObservableMap.CheckedEntrySet.checkedEntry(i.next(), valueType);
/*      */             }
/*      */           };
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*      */       public Object[] toArray() {
/* 2369 */         Object[] arrayOfObject1 = this.s.toArray();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 2377 */         Object[] arrayOfObject2 = CheckedEntry.class.isInstance(arrayOfObject1.getClass().getComponentType()) ? arrayOfObject1 : new Object[arrayOfObject1.length];
/*      */         
/* 2379 */         for (byte b = 0; b < arrayOfObject1.length; b++) {
/* 2380 */           arrayOfObject2[b] = checkedEntry((Map.Entry<?, ?>)arrayOfObject1[b], this.valueType);
/*      */         }
/* 2382 */         return arrayOfObject2;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public <T> T[] toArray(T[] param2ArrayOfT) {
/* 2391 */         Object[] arrayOfObject = this.s.toArray((param2ArrayOfT.length == 0) ? (Object[])param2ArrayOfT : Arrays.<Object>copyOf((Object[])param2ArrayOfT, 0));
/*      */         
/* 2393 */         for (byte b = 0; b < arrayOfObject.length; b++) {
/* 2394 */           arrayOfObject[b] = checkedEntry((Map.Entry<?, ?>)arrayOfObject[b], this.valueType);
/*      */         }
/* 2396 */         if (arrayOfObject.length > param2ArrayOfT.length) {
/* 2397 */           return (T[])arrayOfObject;
/*      */         }
/* 2399 */         System.arraycopy(arrayOfObject, 0, param2ArrayOfT, 0, arrayOfObject.length);
/* 2400 */         if (param2ArrayOfT.length > arrayOfObject.length)
/* 2401 */           param2ArrayOfT[arrayOfObject.length] = null; 
/* 2402 */         return param2ArrayOfT;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public boolean contains(Object param2Object) {
/* 2413 */         if (!(param2Object instanceof Map.Entry))
/* 2414 */           return false; 
/* 2415 */         Map.Entry<?, ?> entry = (Map.Entry)param2Object;
/* 2416 */         return this.s.contains(
/* 2417 */             (entry instanceof CheckedEntry) ? entry : checkedEntry(entry, this.valueType));
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       public boolean containsAll(Collection<?> param2Collection) {
/* 2427 */         for (Object object : param2Collection) {
/* 2428 */           if (!contains(object))
/* 2429 */             return false; 
/* 2430 */         }  return true;
/*      */       }
/*      */ 
/*      */       
/*      */       public boolean remove(Object param2Object) {
/* 2435 */         if (!(param2Object instanceof Map.Entry))
/* 2436 */           return false; 
/* 2437 */         return this.s.remove(new AbstractMap.SimpleImmutableEntry<>((Map.Entry<?, ?>)param2Object));
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*      */       public boolean removeAll(Collection<?> param2Collection) {
/* 2443 */         return batchRemove(param2Collection, false);
/*      */       }
/*      */ 
/*      */       
/*      */       public boolean retainAll(Collection<?> param2Collection) {
/* 2448 */         return batchRemove(param2Collection, true);
/*      */       }
/*      */       
/*      */       private boolean batchRemove(Collection<?> param2Collection, boolean param2Boolean) {
/* 2452 */         boolean bool = false;
/* 2453 */         Iterator<Map.Entry<K, V>> iterator = iterator();
/* 2454 */         while (iterator.hasNext()) {
/* 2455 */           if (param2Collection.contains(iterator.next()) != param2Boolean) {
/* 2456 */             iterator.remove();
/* 2457 */             bool = true;
/*      */           } 
/*      */         } 
/* 2460 */         return bool;
/*      */       }
/*      */ 
/*      */       
/*      */       public boolean equals(Object param2Object) {
/* 2465 */         if (param2Object == this)
/* 2466 */           return true; 
/* 2467 */         if (!(param2Object instanceof Set))
/* 2468 */           return false; 
/* 2469 */         Set<?> set = (Set)param2Object;
/* 2470 */         return (set.size() == this.s.size() && 
/* 2471 */           containsAll(set));
/*      */       }
/*      */ 
/*      */       
/*      */       static <K, V, T> CheckedEntry<K, V, T> checkedEntry(Map.Entry<K, V> param2Entry, Class<T> param2Class) {
/* 2476 */         return new CheckedEntry<>(param2Entry, param2Class);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*      */       private static class CheckedEntry<K, V, T>
/*      */         implements Map.Entry<K, V>
/*      */       {
/*      */         private final Map.Entry<K, V> e;
/*      */ 
/*      */         
/*      */         private final Class<T> valueType;
/*      */ 
/*      */         
/*      */         CheckedEntry(Map.Entry<K, V> param3Entry, Class<T> param3Class) {
/* 2491 */           this.e = param3Entry;
/* 2492 */           this.valueType = param3Class;
/*      */         }
/*      */ 
/*      */         
/*      */         public K getKey() {
/* 2497 */           return this.e.getKey();
/*      */         }
/*      */ 
/*      */         
/*      */         public V getValue() {
/* 2502 */           return this.e.getValue();
/*      */         }
/*      */ 
/*      */         
/*      */         public int hashCode() {
/* 2507 */           return this.e.hashCode();
/*      */         }
/*      */ 
/*      */         
/*      */         public String toString() {
/* 2512 */           return this.e.toString();
/*      */         }
/*      */ 
/*      */         
/*      */         public V setValue(V param3V) {
/* 2517 */           if (param3V != null && !this.valueType.isInstance(param3V))
/* 2518 */             throw new ClassCastException(badValueMsg(param3V)); 
/* 2519 */           return this.e.setValue(param3V);
/*      */         }
/*      */         
/*      */         private String badValueMsg(Object param3Object) {
/* 2523 */           return "Attempt to insert " + String.valueOf(param3Object.getClass()) + " value into map with value type " + String.valueOf(this.valueType);
/*      */         }
/*      */ 
/*      */         
/*      */         public boolean equals(Object param3Object)
/*      */         {
/* 2529 */           if (param3Object == this)
/* 2530 */             return true; 
/* 2531 */           if (!(param3Object instanceof Map.Entry))
/* 2532 */             return false; 
/* 2533 */           return this.e.equals(new AbstractMap.SimpleImmutableEntry<>((Map.Entry<?, ?>)param3Object)); } } } } static class CheckedEntrySet<K, V> implements Set<Map.Entry<K, V>> { private final Set<Map.Entry<K, V>> s; private final Class<V> valueType; CheckedEntrySet(Set<Map.Entry<K, V>> param1Set, Class<V> param1Class) { this.s = param1Set; this.valueType = param1Class; } public int size() { return this.s.size(); } public boolean isEmpty() { return this.s.isEmpty(); } public String toString() { return this.s.toString(); } public int hashCode() { return this.s.hashCode(); } public void clear() { this.s.clear(); } public boolean add(Map.Entry<K, V> param1Entry) { throw new UnsupportedOperationException(); } public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) { throw new UnsupportedOperationException(); } public Iterator<Map.Entry<K, V>> iterator() { final Iterator<Map.Entry<K, V>> i = this.s.iterator(); final Class<V> valueType = this.valueType; return new Iterator<Map.Entry<K, V>>() { public boolean hasNext() { return i.hasNext(); } public void remove() { i.remove(); } public Map.Entry<K, V> next() { return FXCollections.CheckedObservableMap.CheckedEntrySet.checkedEntry(i.next(), valueType); } }; } public Object[] toArray() { Object[] arrayOfObject1 = this.s.toArray(); Object[] arrayOfObject2 = CheckedEntry.class.isInstance(arrayOfObject1.getClass().getComponentType()) ? arrayOfObject1 : new Object[arrayOfObject1.length]; for (byte b = 0; b < arrayOfObject1.length; b++) arrayOfObject2[b] = checkedEntry((Map.Entry<?, ?>)arrayOfObject1[b], this.valueType);  return arrayOfObject2; } public <T> T[] toArray(T[] param1ArrayOfT) { Object[] arrayOfObject = this.s.toArray((param1ArrayOfT.length == 0) ? (Object[])param1ArrayOfT : Arrays.<Object>copyOf((Object[])param1ArrayOfT, 0)); for (byte b = 0; b < arrayOfObject.length; b++) arrayOfObject[b] = checkedEntry((Map.Entry<?, ?>)arrayOfObject[b], this.valueType);  if (arrayOfObject.length > param1ArrayOfT.length) return (T[])arrayOfObject;  System.arraycopy(arrayOfObject, 0, param1ArrayOfT, 0, arrayOfObject.length); if (param1ArrayOfT.length > arrayOfObject.length) param1ArrayOfT[arrayOfObject.length] = null;  return param1ArrayOfT; } public boolean contains(Object param1Object) { if (!(param1Object instanceof Map.Entry)) return false;  Map.Entry<?, ?> entry = (Map.Entry)param1Object; return this.s.contains((entry instanceof CheckedEntry) ? entry : checkedEntry(entry, this.valueType)); } public boolean containsAll(Collection<?> param1Collection) { for (Object object : param1Collection) { if (!contains(object)) return false;  }  return true; } public boolean remove(Object param1Object) { if (!(param1Object instanceof Map.Entry)) return false;  return this.s.remove(new AbstractMap.SimpleImmutableEntry<>((Map.Entry<?, ?>)param1Object)); } public boolean removeAll(Collection<?> param1Collection) { return batchRemove(param1Collection, false); } public boolean retainAll(Collection<?> param1Collection) { return batchRemove(param1Collection, true); } private boolean batchRemove(Collection<?> param1Collection, boolean param1Boolean) { boolean bool = false; Iterator<Map.Entry<K, V>> iterator = iterator(); while (iterator.hasNext()) { if (param1Collection.contains(iterator.next()) != param1Boolean) { iterator.remove(); bool = true; }  }  return bool; } public boolean equals(Object param1Object) { if (param1Object == this) return true;  if (!(param1Object instanceof Set)) return false;  Set<?> set = (Set)param1Object; return (set.size() == this.s.size() && containsAll(set)); } static <K, V, T> CheckedEntry<K, V, T> checkedEntry(Map.Entry<K, V> param1Entry, Class<T> param1Class) { return new CheckedEntry<>(param1Entry, param1Class); } private static class CheckedEntry<K, V, T> implements Map.Entry<K, V> { private final Map.Entry<K, V> e; private final Class<T> valueType; public boolean equals(Object param3Object) { if (param3Object == this) return true;  if (!(param3Object instanceof Map.Entry)) return false;  return this.e.equals(new AbstractMap.SimpleImmutableEntry<>((Map.Entry<?, ?>)param3Object)); } CheckedEntry(Map.Entry<K, V> param3Entry, Class<T> param3Class) { this.e = param3Entry; this.valueType = param3Class; } public K getKey() { return this.e.getKey(); } public V getValue() { return this.e.getValue(); } public int hashCode() { return this.e.hashCode(); } public String toString() { return this.e.toString(); } public V setValue(V param3V) { if (param3V != null && !this.valueType.isInstance(param3V)) throw new ClassCastException(badValueMsg(param3V));  return this.e.setValue(param3V); } private String badValueMsg(Object param3Object) { return "Attempt to insert " + String.valueOf(param3Object.getClass()) + " value into map with value type " + String.valueOf(this.valueType); } } } class null implements Iterator<Map.Entry<K, V>> { public boolean hasNext() { return i.hasNext(); } public void remove() { i.remove(); } public Map.Entry<K, V> next() { return FXCollections.CheckedObservableMap.CheckedEntrySet.checkedEntry(i.next(), valueType); } } private static class CheckedEntry<K, V, T> implements Map.Entry<K, V> { private final Map.Entry<K, V> e; private final Class<T> valueType; CheckedEntry(Map.Entry<K, V> param1Entry, Class<T> param1Class) { this.e = param1Entry; this.valueType = param1Class; } public K getKey() { return this.e.getKey(); } public V getValue() { return this.e.getValue(); } public int hashCode() { return this.e.hashCode(); } public String toString() { return this.e.toString(); } public V setValue(V param1V) { if (param1V != null && !this.valueType.isInstance(param1V)) throw new ClassCastException(badValueMsg(param1V));  return this.e.setValue(param1V); } private String badValueMsg(Object param1Object) { return "Attempt to insert " + String.valueOf(param1Object.getClass()) + " value into map with value type " + String.valueOf(this.valueType); } public boolean equals(Object param1Object) { if (param1Object == this) return true;  if (!(param1Object instanceof Map.Entry)) return false;  return this.e.equals(new AbstractMap.SimpleImmutableEntry<>((Map.Entry<?, ?>)param1Object)); }
/*      */      }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class SynchronizedMap<K, V>
/*      */     implements Map<K, V>
/*      */   {
/*      */     final Object mutex;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private final Map<K, V> backingMap;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private transient Set<K> keySet;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private transient Set<Map.Entry<K, V>> entrySet;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private transient Collection<V> values;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     SynchronizedMap(Map<K, V> param1Map) {
/* 2613 */       this.keySet = null;
/* 2614 */       this.entrySet = null;
/* 2615 */       this.values = null; this.backingMap = param1Map; this.mutex = this;
/*      */     } public int size() { synchronized (this.mutex) { return this.backingMap.size(); }  } public boolean isEmpty() { synchronized (this.mutex) { return this.backingMap.isEmpty(); }  } public boolean containsKey(Object param1Object) { synchronized (this.mutex) { return this.backingMap.containsKey(param1Object); }  } public boolean containsValue(Object param1Object) { synchronized (this.mutex) { return this.backingMap.containsValue(param1Object); }  } public V get(Object param1Object) { synchronized (this.mutex) { return this.backingMap.get(param1Object); }  } public V put(K param1K, V param1V) { synchronized (this.mutex) { return this.backingMap.put(param1K, param1V); }  } public V remove(Object param1Object) { synchronized (this.mutex) { return this.backingMap.remove(param1Object); }  }
/*      */     public void putAll(Map<? extends K, ? extends V> param1Map) { synchronized (this.mutex) { this.backingMap.putAll(param1Map); }  }
/*      */     public void clear() { synchronized (this.mutex) { this.backingMap.clear(); }  }
/* 2619 */     public Set<K> keySet() { synchronized (this.mutex) {
/* 2620 */         if (this.keySet == null)
/* 2621 */           this.keySet = new FXCollections.SynchronizedSet<>(this.backingMap.keySet(), this.mutex); 
/* 2622 */         return this.keySet;
/*      */       }  }
/*      */ 
/*      */ 
/*      */     
/*      */     public Collection<V> values() {
/* 2628 */       synchronized (this.mutex) {
/* 2629 */         if (this.values == null)
/* 2630 */           this.values = new FXCollections.SynchronizedCollection<>(this.backingMap.values(), this.mutex); 
/* 2631 */         return this.values;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public Set<Map.Entry<K, V>> entrySet() {
/* 2637 */       synchronized (this.mutex) {
/* 2638 */         if (this.entrySet == null)
/* 2639 */           this.entrySet = new FXCollections.SynchronizedSet<>(this.backingMap.entrySet(), this.mutex); 
/* 2640 */         return this.entrySet;
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object param1Object) {
/* 2646 */       if (param1Object == this) {
/* 2647 */         return true;
/*      */       }
/* 2649 */       synchronized (this.mutex) {
/* 2650 */         return this.backingMap.equals(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 2656 */       synchronized (this.mutex) {
/* 2657 */         return this.backingMap.hashCode();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private static class SynchronizedCollection<E>
/*      */     implements Collection<E>
/*      */   {
/*      */     private final Collection<E> backingCollection;
/*      */     final Object mutex;
/*      */     
/*      */     SynchronizedCollection(Collection<E> param1Collection, Object param1Object) {
/* 2669 */       this.backingCollection = param1Collection;
/* 2670 */       this.mutex = param1Object;
/*      */     }
/*      */     
/*      */     SynchronizedCollection(Collection<E> param1Collection) {
/* 2674 */       this(param1Collection, new Object());
/*      */     }
/*      */ 
/*      */     
/*      */     public int size() {
/* 2679 */       synchronized (this.mutex) {
/* 2680 */         return this.backingCollection.size();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isEmpty() {
/* 2686 */       synchronized (this.mutex) {
/* 2687 */         return this.backingCollection.isEmpty();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean contains(Object param1Object) {
/* 2693 */       synchronized (this.mutex) {
/* 2694 */         return this.backingCollection.contains(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public Iterator<E> iterator() {
/* 2700 */       return this.backingCollection.iterator();
/*      */     }
/*      */ 
/*      */     
/*      */     public Object[] toArray() {
/* 2705 */       synchronized (this.mutex) {
/* 2706 */         return this.backingCollection.toArray();
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 2712 */       synchronized (this.mutex) {
/* 2713 */         return this.backingCollection.toArray(param1ArrayOfT);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean add(E param1E) {
/* 2719 */       synchronized (this.mutex) {
/* 2720 */         return this.backingCollection.add(param1E);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean remove(Object param1Object) {
/* 2726 */       synchronized (this.mutex) {
/* 2727 */         return this.backingCollection.remove(param1Object);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean containsAll(Collection<?> param1Collection) {
/* 2733 */       synchronized (this.mutex) {
/* 2734 */         return this.backingCollection.containsAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean addAll(Collection<? extends E> param1Collection) {
/* 2740 */       synchronized (this.mutex) {
/* 2741 */         return this.backingCollection.addAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean removeAll(Collection<?> param1Collection) {
/* 2747 */       synchronized (this.mutex) {
/* 2748 */         return this.backingCollection.removeAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean retainAll(Collection<?> param1Collection) {
/* 2754 */       synchronized (this.mutex) {
/* 2755 */         return this.backingCollection.retainAll(param1Collection);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void clear() {
/* 2761 */       synchronized (this.mutex) {
/* 2762 */         this.backingCollection.clear();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   private static class SynchronizedObservableMap<K, V>
/*      */     extends SynchronizedMap<K, V> implements ObservableMap<K, V> {
/*      */     private final ObservableMap<K, V> backingMap;
/*      */     private MapListenerHelper<K, V> listenerHelper;
/*      */     private final MapChangeListener<K, V> listener;
/*      */     
/*      */     SynchronizedObservableMap(ObservableMap<K, V> param1ObservableMap) {
/* 2774 */       super(param1ObservableMap);
/* 2775 */       this.backingMap = param1ObservableMap;
/* 2776 */       this.listener = (param1Change -> MapListenerHelper.fireValueChangedEvent(this.listenerHelper, (MapChangeListener.Change)new MapAdapterChange(this, param1Change)));
/*      */ 
/*      */       
/* 2779 */       this.backingMap.addListener(new WeakMapChangeListener<>(this.listener));
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(InvalidationListener param1InvalidationListener) {
/* 2784 */       synchronized (this.mutex) {
/* 2785 */         this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, param1InvalidationListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(InvalidationListener param1InvalidationListener) {
/* 2791 */       synchronized (this.mutex) {
/* 2792 */         this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, param1InvalidationListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 2798 */       synchronized (this.mutex) {
/* 2799 */         this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, param1MapChangeListener);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 2805 */       synchronized (this.mutex) {
/* 2806 */         this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, param1MapChangeListener);
/*      */       } 
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\FXCollections.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */