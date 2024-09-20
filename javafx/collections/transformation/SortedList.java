/*     */ package javafx.collections.transformation;
/*     */ 
/*     */ import com.sun.javafx.collections.NonIterableChange;
/*     */ import com.sun.javafx.collections.SortHelper;
/*     */ import com.sun.javafx.collections.SourceAdapterChange;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
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
/*     */ public final class SortedList<E>
/*     */   extends TransformationList<E, E>
/*     */ {
/*     */   private Comparator<Element<E>> elementComparator;
/*     */   private Element<E>[] sorted;
/*     */   private int[] perm;
/*     */   private int size;
/*  61 */   private final SortHelper helper = new SortHelper();
/*     */   
/*  63 */   private final Element<E> tempElement = new Element<>(null, -1);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ObjectProperty<Comparator<? super E>> comparator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SortedList(@NamedArg("source") ObservableList<? extends E> paramObservableList, @NamedArg("comparator") Comparator<? super E> paramComparator) {
/*  75 */     super(paramObservableList);
/*  76 */     this.sorted = (Element<E>[])new Element[paramObservableList.size() * 3 / 2 + 1];
/*  77 */     this.perm = new int[this.sorted.length];
/*  78 */     this.size = paramObservableList.size();
/*  79 */     for (byte b = 0; b < this.size; b++) {
/*  80 */       this.sorted[b] = new Element<>((E)paramObservableList.get(b), b);
/*  81 */       this.perm[b] = b;
/*     */     } 
/*  83 */     if (paramComparator != null) {
/*  84 */       setComparator(paramComparator);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SortedList(@NamedArg("source") ObservableList<? extends E> paramObservableList) {
/*  95 */     this(paramObservableList, (Comparator<? super E>)null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void sourceChanged(ListChangeListener.Change<? extends E> paramChange) {
/* 100 */     if (this.elementComparator != null) {
/* 101 */       beginChange();
/* 102 */       while (paramChange.next()) {
/* 103 */         if (paramChange.wasPermutated()) {
/* 104 */           updatePermutationIndexes(paramChange); continue;
/* 105 */         }  if (paramChange.wasUpdated()) {
/* 106 */           update(paramChange); continue;
/*     */         } 
/* 108 */         addRemove(paramChange);
/*     */       } 
/*     */       
/* 111 */       endChange();
/*     */     } else {
/* 113 */       updateUnsorted(paramChange);
/* 114 */       fireChange((ListChangeListener.Change)new SourceAdapterChange((ObservableList)this, paramChange));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final ObjectProperty<Comparator<? super E>> comparatorProperty() {
/* 125 */     if (this.comparator == null) {
/* 126 */       this.comparator = (ObjectProperty<Comparator<? super E>>)new ObjectPropertyBase<Comparator<? super E>>()
/*     */         {
/*     */           protected void invalidated()
/*     */           {
/* 130 */             Comparator<?> comparator = (Comparator)get();
/* 131 */             SortedList.this.elementComparator = (comparator != null) ? new SortedList.ElementComparator(comparator) : null;
/* 132 */             SortedList.this.doSortWithPermutationChange();
/*     */           }
/*     */ 
/*     */           
/*     */           public Object getBean() {
/* 137 */             return SortedList.this;
/*     */           }
/*     */ 
/*     */           
/*     */           public String getName() {
/* 142 */             return "comparator";
/*     */           }
/*     */         };
/*     */     }
/*     */     
/* 147 */     return this.comparator;
/*     */   }
/*     */   
/*     */   public final Comparator<? super E> getComparator() {
/* 151 */     return (this.comparator == null) ? null : (Comparator<? super E>)this.comparator.get();
/*     */   }
/*     */   
/*     */   public final void setComparator(Comparator<? super E> paramComparator) {
/* 155 */     comparatorProperty().set(paramComparator);
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
/* 167 */     if (paramInt >= this.size) {
/* 168 */       throw new IndexOutOfBoundsException();
/*     */     }
/* 170 */     return (this.sorted[paramInt]).e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 180 */     return this.size;
/*     */   }
/*     */   
/*     */   private void doSortWithPermutationChange() {
/* 184 */     if (this.elementComparator != null) {
/* 185 */       int[] arrayOfInt = this.helper.sort((Object[])this.sorted, 0, this.size, this.elementComparator);
/* 186 */       for (byte b = 0; b < this.size; b++) {
/* 187 */         this.perm[(this.sorted[b]).index] = b;
/*     */       }
/* 189 */       fireChange((ListChangeListener.Change)new NonIterableChange.SimplePermutationChange(0, this.size, arrayOfInt, (ObservableList)this));
/*     */     } else {
/* 191 */       int[] arrayOfInt1 = new int[this.size];
/* 192 */       int[] arrayOfInt2 = new int[this.size]; byte b1;
/* 193 */       for (b1 = 0; b1 < this.size; b1++) {
/* 194 */         arrayOfInt2[b1] = b1; arrayOfInt1[b1] = b1;
/*     */       } 
/* 196 */       b1 = 0;
/* 197 */       byte b2 = 0;
/* 198 */       while (b2 < this.size) {
/* 199 */         int i = (this.sorted[b2]).index;
/* 200 */         if (i == b2) {
/* 201 */           b2++;
/*     */           continue;
/*     */         } 
/* 204 */         Element<E> element = this.sorted[i];
/* 205 */         this.sorted[i] = this.sorted[b2];
/* 206 */         this.sorted[b2] = element;
/* 207 */         this.perm[b2] = b2;
/* 208 */         this.perm[i] = i;
/* 209 */         arrayOfInt1[arrayOfInt2[b2]] = i;
/* 210 */         arrayOfInt1[arrayOfInt2[i]] = b2;
/* 211 */         int j = arrayOfInt2[b2];
/* 212 */         arrayOfInt2[b2] = arrayOfInt2[i];
/* 213 */         arrayOfInt2[i] = j;
/* 214 */         b1 = 1;
/*     */       } 
/* 216 */       if (b1 != 0) {
/* 217 */         fireChange((ListChangeListener.Change)new NonIterableChange.SimplePermutationChange(0, this.size, arrayOfInt1, (ObservableList)this));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int getSourceIndex(int paramInt) {
/* 224 */     return (this.sorted[paramInt]).index;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getViewIndex(int paramInt) {
/* 229 */     return this.perm[paramInt];
/*     */   }
/*     */   
/*     */   private void updatePermutationIndexes(ListChangeListener.Change<? extends E> paramChange) {
/* 233 */     for (byte b = 0; b < this.size; b++) {
/* 234 */       int i = paramChange.getPermutation((this.sorted[b]).index);
/* 235 */       (this.sorted[b]).index = i;
/* 236 */       this.perm[i] = b;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void updateUnsorted(ListChangeListener.Change<? extends E> paramChange) {
/* 241 */     while (paramChange.next()) {
/* 242 */       if (paramChange.wasPermutated()) {
/* 243 */         Element[] arrayOfElement = new Element[this.sorted.length];
/* 244 */         for (byte b = 0; b < this.size; b++) {
/* 245 */           if (b >= paramChange.getFrom() && b < paramChange.getTo()) {
/* 246 */             int i = paramChange.getPermutation(b);
/* 247 */             arrayOfElement[i] = this.sorted[b];
/* 248 */             (arrayOfElement[i]).index = i;
/* 249 */             this.perm[b] = b;
/*     */           } else {
/* 251 */             arrayOfElement[b] = this.sorted[b];
/*     */           } 
/*     */         } 
/* 254 */         this.sorted = (Element<E>[])arrayOfElement;
/*     */       } 
/* 256 */       if (paramChange.wasRemoved()) {
/* 257 */         int i = paramChange.getFrom() + paramChange.getRemovedSize();
/* 258 */         System.arraycopy(this.sorted, i, this.sorted, paramChange.getFrom(), this.size - i);
/* 259 */         System.arraycopy(this.perm, i, this.perm, paramChange.getFrom(), this.size - i);
/* 260 */         this.size -= paramChange.getRemovedSize();
/* 261 */         updateIndices(i, i, -paramChange.getRemovedSize());
/*     */       } 
/* 263 */       if (paramChange.wasAdded()) {
/* 264 */         ensureSize(this.size + paramChange.getAddedSize());
/* 265 */         updateIndices(paramChange.getFrom(), paramChange.getFrom(), paramChange.getAddedSize());
/* 266 */         System.arraycopy(this.sorted, paramChange.getFrom(), this.sorted, paramChange.getTo(), this.size - paramChange.getFrom());
/* 267 */         System.arraycopy(this.perm, paramChange.getFrom(), this.perm, paramChange.getTo(), this.size - paramChange.getFrom());
/* 268 */         this.size += paramChange.getAddedSize();
/* 269 */         for (int i = paramChange.getFrom(); i < paramChange.getTo(); i++) {
/* 270 */           this.sorted[i] = new Element<>((E)paramChange.getList().get(i), i);
/* 271 */           this.perm[i] = i;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private static class Element<E> { private E e;
/*     */     private int index;
/*     */     
/*     */     public Element(E param1E, int param1Int) {
/* 280 */       this.e = param1E;
/* 281 */       this.index = param1Int;
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class ElementComparator<E>
/*     */     implements Comparator<Element<E>>
/*     */   {
/*     */     private final Comparator<? super E> comparator;
/*     */ 
/*     */     
/*     */     public ElementComparator(Comparator<? super E> param1Comparator) {
/* 293 */       this.comparator = param1Comparator;
/*     */     }
/*     */ 
/*     */     
/*     */     public int compare(SortedList.Element<E> param1Element1, SortedList.Element<E> param1Element2) {
/* 298 */       return this.comparator.compare(param1Element1.e, param1Element2.e);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void ensureSize(int paramInt) {
/* 304 */     if (this.sorted.length < paramInt) {
/* 305 */       Element[] arrayOfElement = new Element[paramInt * 3 / 2 + 1];
/* 306 */       System.arraycopy(this.sorted, 0, arrayOfElement, 0, this.size);
/* 307 */       this.sorted = (Element<E>[])arrayOfElement;
/* 308 */       int[] arrayOfInt = new int[paramInt * 3 / 2 + 1];
/* 309 */       System.arraycopy(this.perm, 0, arrayOfInt, 0, this.size);
/* 310 */       this.perm = arrayOfInt;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void updateIndices(int paramInt1, int paramInt2, int paramInt3) {
/* 315 */     for (byte b = 0; b < this.size; b++) {
/* 316 */       if ((this.sorted[b]).index >= paramInt1) {
/* 317 */         (this.sorted[b]).index += paramInt3;
/*     */       }
/* 319 */       if (this.perm[b] >= paramInt2) {
/* 320 */         this.perm[b] = this.perm[b] + paramInt3;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private int findPosition(E paramE) {
/* 326 */     if (this.sorted.length == 0) {
/* 327 */       return 0;
/*     */     }
/* 329 */     this.tempElement.e = paramE;
/* 330 */     return Arrays.binarySearch(this.sorted, 0, this.size, this.tempElement, this.elementComparator);
/*     */   }
/*     */ 
/*     */   
/*     */   private void insertToMapping(E paramE, int paramInt) {
/* 335 */     int i = findPosition(paramE);
/* 336 */     if (i < 0) {
/* 337 */       i ^= 0xFFFFFFFF;
/*     */     }
/* 339 */     ensureSize(this.size + 1);
/* 340 */     updateIndices(paramInt, i, 1);
/* 341 */     System.arraycopy(this.sorted, i, this.sorted, i + 1, this.size - i);
/* 342 */     this.sorted[i] = new Element<>(paramE, paramInt);
/* 343 */     System.arraycopy(this.perm, paramInt, this.perm, paramInt + 1, this.size - paramInt);
/* 344 */     this.perm[paramInt] = i;
/* 345 */     this.size++;
/* 346 */     nextAdd(i, i + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   private void setAllToMapping(List<? extends E> paramList, int paramInt) {
/* 351 */     ensureSize(paramInt);
/* 352 */     this.size = paramInt;
/* 353 */     for (byte b = 0; b < paramInt; b++) {
/* 354 */       this.sorted[b] = new Element<>(paramList.get(b), b);
/*     */     }
/* 356 */     int[] arrayOfInt = this.helper.sort((Object[])this.sorted, 0, this.size, this.elementComparator);
/* 357 */     System.arraycopy(arrayOfInt, 0, this.perm, 0, this.size);
/* 358 */     nextAdd(0, this.size);
/*     */   }
/*     */   
/*     */   private void removeFromMapping(int paramInt, E paramE) {
/* 362 */     int i = this.perm[paramInt];
/* 363 */     System.arraycopy(this.sorted, i + 1, this.sorted, i, this.size - i - 1);
/* 364 */     System.arraycopy(this.perm, paramInt + 1, this.perm, paramInt, this.size - paramInt - 1);
/* 365 */     this.size--;
/* 366 */     this.sorted[this.size] = null;
/* 367 */     updateIndices(paramInt + 1, i, -1);
/*     */     
/* 369 */     nextRemove(i, paramE);
/*     */   }
/*     */   
/*     */   private void removeAllFromMapping() {
/* 373 */     ArrayList arrayList = new ArrayList((Collection<?>)this);
/* 374 */     for (byte b = 0; b < this.size; b++) {
/* 375 */       this.sorted[b] = null;
/*     */     }
/* 377 */     this.size = 0;
/* 378 */     nextRemove(0, arrayList);
/*     */   }
/*     */   
/*     */   private void update(ListChangeListener.Change<? extends E> paramChange) {
/* 382 */     int[] arrayOfInt = this.helper.sort((Object[])this.sorted, 0, this.size, this.elementComparator); int i;
/* 383 */     for (i = 0; i < this.size; i++) {
/* 384 */       this.perm[(this.sorted[i]).index] = i;
/*     */     }
/* 386 */     nextPermutation(0, this.size, arrayOfInt); int j;
/* 387 */     for (i = paramChange.getFrom(), j = paramChange.getTo(); i < j; i++) {
/* 388 */       nextUpdate(this.perm[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   private void addRemove(ListChangeListener.Change<? extends E> paramChange) {
/* 393 */     if (paramChange.getFrom() == 0 && paramChange.getRemovedSize() == this.size) {
/* 394 */       removeAllFromMapping();
/*     */     } else {
/* 396 */       byte b; int i; for (b = 0, i = paramChange.getRemovedSize(); b < i; b++) {
/* 397 */         removeFromMapping(paramChange.getFrom(), paramChange.getRemoved().get(b));
/*     */       }
/*     */     } 
/* 400 */     if (this.size == 0) {
/* 401 */       setAllToMapping((List<? extends E>)paramChange.getList(), paramChange.getTo());
/*     */     } else {
/*     */       
/* 404 */       for (int i = paramChange.getFrom(), j = paramChange.getTo(); i < j; i++)
/* 405 */         insertToMapping((E)paramChange.getList().get(i), i); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\transformation\SortedList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */