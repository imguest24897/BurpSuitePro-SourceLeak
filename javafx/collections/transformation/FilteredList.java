/*     */ package javafx.collections.transformation;
/*     */ 
/*     */ import com.sun.javafx.collections.SortHelper;
/*     */ import java.util.Arrays;
/*     */ import java.util.ListIterator;
/*     */ import java.util.function.Predicate;
/*     */ import javafx.beans.NamedArg;
/*     */ import javafx.beans.property.ObjectProperty;
/*     */ import javafx.beans.property.ObjectPropertyBase;
/*     */ import javafx.collections.ListChangeListener;
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
/*     */ public final class FilteredList<E>
/*     */   extends TransformationList<E, E>
/*     */ {
/*     */   private int[] filtered;
/*     */   private int size;
/*     */   private SortHelper helper;
/*     */   private ObjectProperty<Predicate<? super E>> predicate;
/*     */   
/*     */   public FilteredList(@NamedArg("source") ObservableList<E> paramObservableList, @NamedArg("predicate") Predicate<? super E> paramPredicate) {
/*  65 */     super(paramObservableList);
/*  66 */     this.filtered = new int[paramObservableList.size() * 3 / 2 + 1];
/*  67 */     if (paramPredicate != null) {
/*  68 */       setPredicate(paramPredicate);
/*     */     } else {
/*  70 */       for (this.size = 0; this.size < paramObservableList.size(); this.size++) {
/*  71 */         this.filtered[this.size] = this.size;
/*     */       }
/*     */     } 
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
/*     */   public FilteredList(@NamedArg("source") ObservableList<E> paramObservableList) {
/*  86 */     this(paramObservableList, (Predicate<? super E>)null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final ObjectProperty<Predicate<? super E>> predicateProperty() {
/*  97 */     if (this.predicate == null) {
/*  98 */       this.predicate = (ObjectProperty<Predicate<? super E>>)new ObjectPropertyBase<Predicate<? super E>>()
/*     */         {
/*     */           protected void invalidated() {
/* 101 */             FilteredList.this.refilter();
/*     */           }
/*     */ 
/*     */           
/*     */           public Object getBean() {
/* 106 */             return FilteredList.this;
/*     */           }
/*     */ 
/*     */           
/*     */           public String getName() {
/* 111 */             return "predicate";
/*     */           }
/*     */         };
/*     */     }
/*     */     
/* 116 */     return this.predicate;
/*     */   }
/*     */   
/*     */   public final Predicate<? super E> getPredicate() {
/* 120 */     return (this.predicate == null) ? null : (Predicate<? super E>)this.predicate.get();
/*     */   }
/*     */   
/*     */   public final void setPredicate(Predicate<? super E> paramPredicate) {
/* 124 */     predicateProperty().set(paramPredicate);
/*     */   }
/*     */   
/*     */   private Predicate<? super E> getPredicateImpl() {
/* 128 */     if (getPredicate() != null) {
/* 129 */       return getPredicate();
/*     */     }
/* 131 */     return paramObject -> true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void sourceChanged(ListChangeListener.Change<? extends E> paramChange) {
/* 136 */     beginChange();
/* 137 */     while (paramChange.next()) {
/* 138 */       if (paramChange.wasPermutated()) {
/* 139 */         permutate(paramChange); continue;
/* 140 */       }  if (paramChange.wasUpdated()) {
/* 141 */         update(paramChange); continue;
/*     */       } 
/* 143 */       addRemove(paramChange);
/*     */     } 
/*     */     
/* 146 */     endChange();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 156 */     return this.size;
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
/*     */   public E get(int paramInt) {
/* 168 */     if (paramInt >= this.size) {
/* 169 */       throw new IndexOutOfBoundsException();
/*     */     }
/* 171 */     return (E)getSource().get(this.filtered[paramInt]);
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSourceIndex(int paramInt) {
/* 176 */     if (paramInt >= this.size) {
/* 177 */       throw new IndexOutOfBoundsException();
/*     */     }
/* 179 */     return this.filtered[paramInt];
/*     */   }
/*     */ 
/*     */   
/*     */   public int getViewIndex(int paramInt) {
/* 184 */     return Arrays.binarySearch(this.filtered, 0, this.size, paramInt);
/*     */   }
/*     */   
/*     */   private SortHelper getSortHelper() {
/* 188 */     if (this.helper == null) {
/* 189 */       this.helper = new SortHelper();
/*     */     }
/* 191 */     return this.helper;
/*     */   }
/*     */   
/*     */   private int findPosition(int paramInt) {
/* 195 */     if (this.filtered.length == 0) {
/* 196 */       return 0;
/*     */     }
/* 198 */     if (paramInt == 0) {
/* 199 */       return 0;
/*     */     }
/* 201 */     int i = Arrays.binarySearch(this.filtered, 0, this.size, paramInt);
/* 202 */     if (i < 0) {
/* 203 */       i ^= 0xFFFFFFFF;
/*     */     }
/* 205 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   private void ensureSize(int paramInt) {
/* 210 */     if (this.filtered.length < paramInt) {
/* 211 */       int[] arrayOfInt = new int[paramInt * 3 / 2 + 1];
/* 212 */       System.arraycopy(this.filtered, 0, arrayOfInt, 0, this.size);
/* 213 */       this.filtered = arrayOfInt;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void updateIndexes(int paramInt1, int paramInt2) {
/* 218 */     for (int i = paramInt1; i < this.size; i++) {
/* 219 */       this.filtered[i] = this.filtered[i] + paramInt2;
/*     */     }
/*     */   }
/*     */   
/*     */   private void permutate(ListChangeListener.Change<? extends E> paramChange) {
/* 224 */     int i = findPosition(paramChange.getFrom());
/* 225 */     int j = findPosition(paramChange.getTo());
/*     */     
/* 227 */     if (j > i) {
/* 228 */       for (int k = i; k < j; k++) {
/* 229 */         this.filtered[k] = paramChange.getPermutation(this.filtered[k]);
/*     */       }
/*     */       
/* 232 */       int[] arrayOfInt = getSortHelper().sort(this.filtered, i, j);
/* 233 */       nextPermutation(i, j, arrayOfInt);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void addRemove(ListChangeListener.Change<? extends E> paramChange) {
/* 238 */     Predicate<? super E> predicate = getPredicateImpl();
/* 239 */     ensureSize(getSource().size());
/* 240 */     int i = findPosition(paramChange.getFrom());
/* 241 */     int j = findPosition(paramChange.getFrom() + paramChange.getRemovedSize());
/*     */     
/*     */     int k;
/* 244 */     for (k = i; k < j; k++) {
/* 245 */       nextRemove(i, paramChange.getRemoved().get(this.filtered[k] - paramChange.getFrom()));
/*     */     }
/*     */ 
/*     */     
/* 249 */     updateIndexes(j, paramChange.getAddedSize() - paramChange.getRemovedSize());
/*     */ 
/*     */     
/* 252 */     k = i;
/* 253 */     int m = paramChange.getFrom();
/*     */     
/* 255 */     ListIterator<E> listIterator = getSource().listIterator(m);
/* 256 */     while (k < j && listIterator.nextIndex() < paramChange.getTo()) {
/* 257 */       if (predicate.test(listIterator.next())) {
/* 258 */         this.filtered[k] = listIterator.previousIndex();
/* 259 */         nextAdd(k, k + 1);
/* 260 */         k++;
/*     */       } 
/*     */     } 
/*     */     
/* 264 */     if (k < j) {
/*     */       
/* 266 */       System.arraycopy(this.filtered, j, this.filtered, k, this.size - j);
/* 267 */       this.size -= j - k;
/*     */     } else {
/*     */       
/* 270 */       while (listIterator.nextIndex() < paramChange.getTo()) {
/* 271 */         if (predicate.test(listIterator.next())) {
/* 272 */           System.arraycopy(this.filtered, k, this.filtered, k + 1, this.size - k);
/* 273 */           this.filtered[k] = listIterator.previousIndex();
/* 274 */           nextAdd(k, k + 1);
/* 275 */           k++;
/* 276 */           this.size++;
/*     */         } 
/* 278 */         m++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void update(ListChangeListener.Change<? extends E> paramChange) {
/* 284 */     Predicate<? super E> predicate = getPredicateImpl();
/* 285 */     ensureSize(getSource().size());
/* 286 */     int i = paramChange.getFrom();
/* 287 */     int j = paramChange.getTo();
/* 288 */     int k = findPosition(i);
/* 289 */     int m = findPosition(j);
/* 290 */     ListIterator<Object> listIterator = getSource().listIterator(i);
/* 291 */     int n = k;
/* 292 */     while (n < m || i < j) {
/* 293 */       E e = (E)listIterator.next();
/* 294 */       if (n < this.size && this.filtered[n] == i) {
/* 295 */         if (!predicate.test(e)) {
/* 296 */           nextRemove(n, e);
/* 297 */           System.arraycopy(this.filtered, n + 1, this.filtered, n, this.size - n - 1);
/* 298 */           this.size--;
/* 299 */           m--;
/*     */         } else {
/* 301 */           nextUpdate(n);
/* 302 */           n++;
/*     */         }
/*     */       
/* 305 */       } else if (predicate.test(e)) {
/* 306 */         nextAdd(n, n + 1);
/* 307 */         System.arraycopy(this.filtered, n, this.filtered, n + 1, this.size - n);
/* 308 */         this.filtered[n] = i;
/* 309 */         this.size++;
/* 310 */         n++;
/* 311 */         m++;
/*     */       } 
/*     */       
/* 314 */       i++;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void refilter() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_0
/*     */     //   2: invokevirtual getSource : ()Ljavafx/collections/ObservableList;
/*     */     //   5: invokeinterface size : ()I
/*     */     //   10: invokevirtual ensureSize : (I)V
/*     */     //   13: aconst_null
/*     */     //   14: astore_1
/*     */     //   15: aload_0
/*     */     //   16: invokevirtual hasListeners : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: new java/util/ArrayList
/*     */     //   25: dup
/*     */     //   26: aload_0
/*     */     //   27: invokespecial <init> : (Ljava/util/Collection;)V
/*     */     //   30: astore_1
/*     */     //   31: aload_0
/*     */     //   32: iconst_0
/*     */     //   33: putfield size : I
/*     */     //   36: iconst_0
/*     */     //   37: istore_2
/*     */     //   38: aload_0
/*     */     //   39: invokevirtual getPredicateImpl : ()Ljava/util/function/Predicate;
/*     */     //   42: astore_3
/*     */     //   43: aload_0
/*     */     //   44: invokevirtual getSource : ()Ljavafx/collections/ObservableList;
/*     */     //   47: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   52: astore #4
/*     */     //   54: aload #4
/*     */     //   56: invokeinterface hasNext : ()Z
/*     */     //   61: ifeq -> 107
/*     */     //   64: aload #4
/*     */     //   66: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   71: astore #5
/*     */     //   73: aload_3
/*     */     //   74: aload #5
/*     */     //   76: invokeinterface test : (Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 101
/*     */     //   84: aload_0
/*     */     //   85: getfield filtered : [I
/*     */     //   88: aload_0
/*     */     //   89: dup
/*     */     //   90: getfield size : I
/*     */     //   93: dup_x1
/*     */     //   94: iconst_1
/*     */     //   95: iadd
/*     */     //   96: putfield size : I
/*     */     //   99: iload_2
/*     */     //   100: iastore
/*     */     //   101: iinc #2, 1
/*     */     //   104: goto -> 54
/*     */     //   107: aload_0
/*     */     //   108: invokevirtual hasListeners : ()Z
/*     */     //   111: ifeq -> 132
/*     */     //   114: aload_0
/*     */     //   115: new com/sun/javafx/collections/NonIterableChange$GenericAddRemoveChange
/*     */     //   118: dup
/*     */     //   119: iconst_0
/*     */     //   120: aload_0
/*     */     //   121: getfield size : I
/*     */     //   124: aload_1
/*     */     //   125: aload_0
/*     */     //   126: invokespecial <init> : (IILjava/util/List;Ljavafx/collections/ObservableList;)V
/*     */     //   129: invokevirtual fireChange : (Ljavafx/collections/ListChangeListener$Change;)V
/*     */     //   132: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #319	-> 0
/*     */     //   #320	-> 13
/*     */     //   #321	-> 15
/*     */     //   #322	-> 22
/*     */     //   #324	-> 31
/*     */     //   #325	-> 36
/*     */     //   #326	-> 38
/*     */     //   #327	-> 43
/*     */     //   #328	-> 64
/*     */     //   #329	-> 73
/*     */     //   #330	-> 84
/*     */     //   #332	-> 101
/*     */     //   #333	-> 104
/*     */     //   #334	-> 107
/*     */     //   #335	-> 114
/*     */     //   #337	-> 132
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\transformation\FilteredList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */