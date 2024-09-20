/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class VetoableListDecorator<E>
/*     */   implements ObservableList<E>
/*     */ {
/*     */   private final ObservableList<E> list;
/*     */   private int modCount;
/*     */   private ListListenerHelper<E> helper;
/*     */   
/*     */   public VetoableListDecorator(ObservableList<E> paramObservableList) {
/*  76 */     this.list = paramObservableList;
/*  77 */     this.list.addListener(paramChange -> ListListenerHelper.fireValueChangedEvent(this.helper, new SourceAdapterChange<>(this, paramChange)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(ListChangeListener<? super E> paramListChangeListener) {
/*  85 */     this.helper = ListListenerHelper.addListener(this.helper, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ListChangeListener<? super E> paramListChangeListener) {
/*  90 */     this.helper = ListListenerHelper.removeListener(this.helper, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  95 */     this.helper = ListListenerHelper.addListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 100 */     this.helper = ListListenerHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(E... paramVarArgs) {
/* 105 */     return addAll(Arrays.asList(paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(E... paramVarArgs) {
/* 110 */     return setAll(Arrays.asList(paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(Collection<? extends E> paramCollection) {
/* 115 */     Objects.requireNonNull(paramCollection);
/* 116 */     onProposedChange(Collections.unmodifiableList(new ArrayList<>(paramCollection)), new int[] { 0, size() });
/*     */     try {
/* 118 */       this.modCount++;
/* 119 */       return this.list.setAll(paramCollection);
/* 120 */     } catch (Exception exception) {
/* 121 */       this.modCount--;
/* 122 */       throw exception;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void removeFromList(List<E> paramList, int paramInt, Collection<?> paramCollection, boolean paramBoolean) {
/* 127 */     int[] arrayOfInt = new int[2];
/* 128 */     byte b = -1;
/* 129 */     for (byte b1 = 0; b1 < paramList.size(); b1++) {
/* 130 */       E e = paramList.get(b1);
/* 131 */       if (paramCollection.contains(e) ^ paramBoolean) {
/* 132 */         if (b == -1) {
/* 133 */           arrayOfInt[b + 1] = paramInt + b1;
/* 134 */           arrayOfInt[b + 2] = paramInt + b1 + 1;
/* 135 */           b += 2;
/*     */         }
/* 137 */         else if (arrayOfInt[b - 1] == paramInt + b1) {
/* 138 */           arrayOfInt[b - 1] = paramInt + b1 + 1;
/*     */         } else {
/* 140 */           int[] arrayOfInt1 = new int[arrayOfInt.length + 2];
/* 141 */           System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
/* 142 */           arrayOfInt = arrayOfInt1;
/* 143 */           arrayOfInt[b + 1] = paramInt + b1;
/* 144 */           arrayOfInt[b + 2] = paramInt + b1 + 1;
/* 145 */           b += 2;
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 150 */     if (b != -1) {
/* 151 */       onProposedChange(Collections.emptyList(), arrayOfInt);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(E... paramVarArgs) {
/* 157 */     return removeAll(Arrays.asList((Object[])paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(E... paramVarArgs) {
/* 162 */     return retainAll(Arrays.asList((Object[])paramVarArgs));
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove(int paramInt1, int paramInt2) {
/* 167 */     Objects.checkFromToIndex(paramInt1, paramInt2, size());
/* 168 */     onProposedChange(Collections.emptyList(), new int[] { paramInt1, paramInt2 });
/*     */     try {
/* 170 */       this.modCount++;
/* 171 */       this.list.remove(paramInt1, paramInt2);
/* 172 */     } catch (Exception exception) {
/* 173 */       this.modCount--;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 179 */     return this.list.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 184 */     return this.list.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 189 */     return this.list.contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 194 */     return new VetoableIteratorDecorator(new ModCountAccessorImpl(), this.list.iterator(), 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 199 */     return this.list.toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 204 */     return (T[])this.list.toArray((Object[])paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(E paramE) {
/* 209 */     onProposedChange(Collections.singletonList(paramE), new int[] { size(), size() });
/*     */     try {
/* 211 */       this.modCount++;
/* 212 */       this.list.add(paramE);
/* 213 */       return true;
/* 214 */     } catch (Exception exception) {
/* 215 */       this.modCount--;
/* 216 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 222 */     int i = this.list.indexOf(paramObject);
/* 223 */     if (i != -1) {
/* 224 */       remove(i);
/* 225 */       return true;
/*     */     } 
/* 227 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 232 */     return this.list.containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 237 */     Objects.requireNonNull(paramCollection);
/* 238 */     onProposedChange(Collections.unmodifiableList(new ArrayList<>(paramCollection)), new int[] { size(), size() });
/*     */     try {
/* 240 */       this.modCount++;
/* 241 */       boolean bool = this.list.addAll(paramCollection);
/* 242 */       if (!bool)
/* 243 */         this.modCount--; 
/* 244 */       return bool;
/* 245 */     } catch (Exception exception) {
/* 246 */       this.modCount--;
/* 247 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 253 */     Objects.requireNonNull(paramCollection);
/* 254 */     Objects.checkIndex(paramInt, size() + 1);
/* 255 */     onProposedChange(Collections.unmodifiableList(new ArrayList<>(paramCollection)), new int[] { paramInt, paramInt });
/*     */     try {
/* 257 */       this.modCount++;
/* 258 */       boolean bool = this.list.addAll(paramInt, paramCollection);
/* 259 */       if (!bool)
/* 260 */         this.modCount--; 
/* 261 */       return bool;
/* 262 */     } catch (Exception exception) {
/* 263 */       this.modCount--;
/* 264 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 270 */     Objects.requireNonNull(paramCollection);
/* 271 */     removeFromList((List<E>)this, 0, paramCollection, false);
/*     */     try {
/* 273 */       this.modCount++;
/* 274 */       boolean bool = this.list.removeAll(paramCollection);
/* 275 */       if (!bool)
/* 276 */         this.modCount--; 
/* 277 */       return bool;
/* 278 */     } catch (Exception exception) {
/* 279 */       this.modCount--;
/* 280 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 286 */     Objects.requireNonNull(paramCollection);
/* 287 */     removeFromList((List<E>)this, 0, paramCollection, true);
/*     */     try {
/* 289 */       this.modCount++;
/* 290 */       boolean bool = this.list.retainAll(paramCollection);
/* 291 */       if (!bool)
/* 292 */         this.modCount--; 
/* 293 */       return bool;
/* 294 */     } catch (Exception exception) {
/* 295 */       this.modCount--;
/* 296 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 302 */     onProposedChange(Collections.emptyList(), new int[] { 0, size() });
/*     */     try {
/* 304 */       this.modCount++;
/* 305 */       this.list.clear();
/* 306 */     } catch (Exception exception) {
/* 307 */       this.modCount--;
/* 308 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/* 314 */     return (E)this.list.get(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public E set(int paramInt, E paramE) {
/* 319 */     onProposedChange(Collections.singletonList(paramE), new int[] { paramInt, paramInt + 1 });
/* 320 */     return (E)this.list.set(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(int paramInt, E paramE) {
/* 325 */     Objects.checkIndex(paramInt, size() + 1);
/* 326 */     onProposedChange(Collections.singletonList(paramE), new int[] { paramInt, paramInt });
/*     */     try {
/* 328 */       this.modCount++;
/* 329 */       this.list.add(paramInt, paramE);
/* 330 */     } catch (Exception exception) {
/* 331 */       this.modCount--;
/* 332 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public E remove(int paramInt) {
/* 338 */     Objects.checkIndex(paramInt, size());
/* 339 */     onProposedChange(Collections.emptyList(), new int[] { paramInt, paramInt + 1 });
/*     */     try {
/* 341 */       this.modCount++;
/* 342 */       return (E)this.list.remove(paramInt);
/*     */     }
/* 344 */     catch (Exception exception) {
/* 345 */       this.modCount--;
/* 346 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 352 */     return this.list.indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 357 */     return this.list.lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator() {
/* 362 */     return new VetoableListIteratorDecorator(new ModCountAccessorImpl(), this.list.listIterator(), 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator(int paramInt) {
/* 367 */     return new VetoableListIteratorDecorator(new ModCountAccessorImpl(), this.list.listIterator(paramInt), paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> subList(int paramInt1, int paramInt2) {
/* 372 */     return new VetoableSubListDecorator(new ModCountAccessorImpl(), this.list.subList(paramInt1, paramInt2), paramInt1);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 377 */     return this.list.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 382 */     return this.list.equals(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 387 */     return this.list.hashCode();
/*     */   }
/*     */   
/*     */   protected abstract void onProposedChange(List<E> paramList, int... paramVarArgs);
/*     */   
/*     */   private class VetoableSubListDecorator implements List<E> { private final List<E> subList;
/*     */     private final int offset;
/*     */     private final VetoableListDecorator.ModCountAccessor modCountAccessor;
/*     */     private int modCount;
/*     */     
/*     */     public VetoableSubListDecorator(VetoableListDecorator.ModCountAccessor param1ModCountAccessor, List<E> param1List, int param1Int) {
/* 398 */       this.modCountAccessor = param1ModCountAccessor;
/* 399 */       this.modCount = param1ModCountAccessor.get();
/* 400 */       this.subList = param1List;
/* 401 */       this.offset = param1Int;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int size() {
/* 407 */       checkForComodification();
/* 408 */       return this.subList.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 413 */       checkForComodification();
/* 414 */       return this.subList.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object param1Object) {
/* 419 */       checkForComodification();
/* 420 */       return this.subList.contains(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<E> iterator() {
/* 425 */       checkForComodification();
/* 426 */       return new VetoableListDecorator.VetoableIteratorDecorator(new ModCountAccessorImplSub(), this.subList.iterator(), this.offset);
/*     */     }
/*     */ 
/*     */     
/*     */     public Object[] toArray() {
/* 431 */       checkForComodification();
/* 432 */       return this.subList.toArray();
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 437 */       checkForComodification();
/* 438 */       return this.subList.toArray(param1ArrayOfT);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean add(E param1E) {
/* 443 */       checkForComodification();
/* 444 */       VetoableListDecorator.this.onProposedChange(Collections.singletonList(param1E), new int[] { this.offset + size(), this.offset + size() });
/*     */       try {
/* 446 */         incrementModCount();
/* 447 */         this.subList.add(param1E);
/* 448 */       } catch (Exception exception) {
/* 449 */         decrementModCount();
/* 450 */         throw exception;
/*     */       } 
/* 452 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(Object param1Object) {
/* 457 */       checkForComodification();
/* 458 */       int i = indexOf(param1Object);
/* 459 */       if (i != -1) {
/* 460 */         remove(i);
/* 461 */         return true;
/*     */       } 
/* 463 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(Collection<?> param1Collection) {
/* 468 */       checkForComodification();
/* 469 */       return this.subList.containsAll(param1Collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(Collection<? extends E> param1Collection) {
/* 474 */       Objects.requireNonNull(param1Collection);
/* 475 */       checkForComodification();
/* 476 */       VetoableListDecorator.this.onProposedChange(Collections.unmodifiableList(new ArrayList(param1Collection)), new int[] { this.offset + size(), this.offset + size() });
/*     */       try {
/* 478 */         incrementModCount();
/* 479 */         boolean bool = this.subList.addAll(param1Collection);
/* 480 */         if (!bool)
/* 481 */           decrementModCount(); 
/* 482 */         return bool;
/* 483 */       } catch (Exception exception) {
/* 484 */         decrementModCount();
/* 485 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(int param1Int, Collection<? extends E> param1Collection) {
/* 491 */       Objects.requireNonNull(param1Collection);
/* 492 */       Objects.checkIndex(param1Int, size() + 1);
/* 493 */       checkForComodification();
/* 494 */       VetoableListDecorator.this.onProposedChange(Collections.unmodifiableList(new ArrayList(param1Collection)), new int[] { this.offset + param1Int, this.offset + param1Int });
/*     */       try {
/* 496 */         incrementModCount();
/* 497 */         boolean bool = this.subList.addAll(param1Int, param1Collection);
/* 498 */         if (!bool)
/* 499 */           decrementModCount(); 
/* 500 */         return bool;
/* 501 */       } catch (Exception exception) {
/* 502 */         decrementModCount();
/* 503 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean removeAll(Collection<?> param1Collection) {
/* 509 */       Objects.requireNonNull(param1Collection);
/* 510 */       checkForComodification();
/* 511 */       VetoableListDecorator.this.removeFromList(this, this.offset, param1Collection, false);
/*     */       try {
/* 513 */         incrementModCount();
/* 514 */         boolean bool = this.subList.removeAll(param1Collection);
/* 515 */         if (!bool)
/* 516 */           decrementModCount(); 
/* 517 */         return bool;
/* 518 */       } catch (Exception exception) {
/* 519 */         decrementModCount();
/* 520 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean retainAll(Collection<?> param1Collection) {
/* 526 */       Objects.requireNonNull(param1Collection);
/* 527 */       checkForComodification();
/* 528 */       VetoableListDecorator.this.removeFromList(this, this.offset, param1Collection, true);
/*     */       try {
/* 530 */         incrementModCount();
/* 531 */         boolean bool = this.subList.retainAll(param1Collection);
/* 532 */         if (!bool)
/* 533 */           decrementModCount(); 
/* 534 */         return bool;
/* 535 */       } catch (Exception exception) {
/* 536 */         decrementModCount();
/* 537 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 543 */       checkForComodification();
/* 544 */       VetoableListDecorator.this.onProposedChange(Collections.emptyList(), new int[] { this.offset, this.offset + size() });
/*     */       try {
/* 546 */         incrementModCount();
/* 547 */         this.subList.clear();
/* 548 */       } catch (Exception exception) {
/* 549 */         decrementModCount();
/* 550 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public E get(int param1Int) {
/* 556 */       checkForComodification();
/* 557 */       return this.subList.get(param1Int);
/*     */     }
/*     */ 
/*     */     
/*     */     public E set(int param1Int, E param1E) {
/* 562 */       checkForComodification();
/* 563 */       VetoableListDecorator.this.onProposedChange(Collections.singletonList(param1E), new int[] { this.offset + param1Int, this.offset + param1Int + 1 });
/* 564 */       return this.subList.set(param1Int, param1E);
/*     */     }
/*     */ 
/*     */     
/*     */     public void add(int param1Int, E param1E) {
/* 569 */       Objects.checkIndex(param1Int, size() + 1);
/* 570 */       checkForComodification();
/* 571 */       VetoableListDecorator.this.onProposedChange(Collections.singletonList(param1E), new int[] { this.offset + param1Int, this.offset + param1Int });
/*     */       try {
/* 573 */         incrementModCount();
/* 574 */         this.subList.add(param1Int, param1E);
/* 575 */       } catch (Exception exception) {
/* 576 */         decrementModCount();
/* 577 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public E remove(int param1Int) {
/* 583 */       Objects.checkIndex(param1Int, size());
/* 584 */       checkForComodification();
/* 585 */       VetoableListDecorator.this.onProposedChange(Collections.emptyList(), new int[] { this.offset + param1Int, this.offset + param1Int + 1 });
/*     */       try {
/* 587 */         incrementModCount();
/* 588 */         return this.subList.remove(param1Int);
/*     */       }
/* 590 */       catch (Exception exception) {
/* 591 */         decrementModCount();
/* 592 */         throw exception;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int indexOf(Object param1Object) {
/* 599 */       checkForComodification();
/* 600 */       return this.subList.indexOf(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int lastIndexOf(Object param1Object) {
/* 605 */       checkForComodification();
/* 606 */       return this.subList.lastIndexOf(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public ListIterator<E> listIterator() {
/* 611 */       checkForComodification();
/* 612 */       return new VetoableListDecorator.VetoableListIteratorDecorator(new ModCountAccessorImplSub(), this.subList
/* 613 */           .listIterator(), this.offset);
/*     */     }
/*     */ 
/*     */     
/*     */     public ListIterator<E> listIterator(int param1Int) {
/* 618 */       checkForComodification();
/* 619 */       return new VetoableListDecorator.VetoableListIteratorDecorator(new ModCountAccessorImplSub(), this.subList
/* 620 */           .listIterator(param1Int), this.offset + param1Int);
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> subList(int param1Int1, int param1Int2) {
/* 625 */       checkForComodification();
/* 626 */       return new VetoableSubListDecorator(new ModCountAccessorImplSub(), this.subList
/* 627 */           .subList(param1Int1, param1Int2), this.offset + param1Int1);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 632 */       checkForComodification();
/* 633 */       return this.subList.toString();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 638 */       checkForComodification();
/* 639 */       return this.subList.equals(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 644 */       checkForComodification();
/* 645 */       return this.subList.hashCode();
/*     */     }
/*     */     
/*     */     private void checkForComodification() {
/* 649 */       if (this.modCount != this.modCountAccessor.get()) {
/* 650 */         throw new ConcurrentModificationException();
/*     */       }
/*     */     }
/*     */     
/*     */     private void incrementModCount() {
/* 655 */       this.modCount = this.modCountAccessor.incrementAndGet();
/*     */     }
/*     */     
/*     */     private void decrementModCount() {
/* 659 */       this.modCount = this.modCountAccessor.decrementAndGet();
/*     */     }
/*     */     
/*     */     private class ModCountAccessorImplSub
/*     */       implements VetoableListDecorator.ModCountAccessor
/*     */     {
/*     */       public int get() {
/* 666 */         return VetoableListDecorator.VetoableSubListDecorator.this.modCount;
/*     */       }
/*     */ 
/*     */       
/*     */       public int incrementAndGet() {
/* 671 */         return VetoableListDecorator.VetoableSubListDecorator.this.modCount = VetoableListDecorator.VetoableSubListDecorator.this.modCountAccessor.incrementAndGet();
/*     */       }
/*     */       
/*     */       public int decrementAndGet()
/*     */       {
/* 676 */         return VetoableListDecorator.VetoableSubListDecorator.this.modCount = VetoableListDecorator.VetoableSubListDecorator.this.modCountAccessor.decrementAndGet(); } } } private class ModCountAccessorImplSub implements ModCountAccessor { public int decrementAndGet() { return this.this$1.modCount = this.this$1.modCountAccessor.decrementAndGet(); }
/*     */     
/*     */     public int get() {
/*     */       return this.this$1.modCount;
/*     */     }
/*     */     public int incrementAndGet() {
/*     */       return this.this$1.modCount = this.this$1.modCountAccessor.incrementAndGet();
/*     */     } }
/*     */   private class VetoableIteratorDecorator implements Iterator<E> { private final Iterator<E> it; private final VetoableListDecorator.ModCountAccessor modCountAccessor;
/*     */     private int modCount;
/*     */     protected final int offset;
/*     */     protected int cursor;
/*     */     protected int lastReturned;
/*     */     
/*     */     public VetoableIteratorDecorator(VetoableListDecorator.ModCountAccessor param1ModCountAccessor, Iterator<E> param1Iterator, int param1Int) {
/* 691 */       this.modCountAccessor = param1ModCountAccessor;
/* 692 */       this.modCount = param1ModCountAccessor.get();
/* 693 */       this.it = param1Iterator;
/* 694 */       this.offset = param1Int;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean hasNext() {
/* 699 */       checkForComodification();
/* 700 */       return this.it.hasNext();
/*     */     }
/*     */ 
/*     */     
/*     */     public E next() {
/* 705 */       checkForComodification();
/* 706 */       E e = this.it.next();
/* 707 */       this.lastReturned = this.cursor++;
/* 708 */       return e;
/*     */     }
/*     */ 
/*     */     
/*     */     public void remove() {
/* 713 */       checkForComodification();
/* 714 */       if (this.lastReturned == -1) {
/* 715 */         throw new IllegalStateException();
/*     */       }
/* 717 */       VetoableListDecorator.this.onProposedChange(Collections.emptyList(), new int[] { this.offset + this.lastReturned, this.offset + this.lastReturned + 1 });
/*     */       try {
/* 719 */         incrementModCount();
/* 720 */         this.it.remove();
/* 721 */       } catch (Exception exception) {
/* 722 */         decrementModCount();
/* 723 */         throw exception;
/*     */       } 
/* 725 */       this.lastReturned = -1;
/* 726 */       this.cursor--;
/*     */     }
/*     */     
/*     */     protected void checkForComodification() {
/* 730 */       if (this.modCount != this.modCountAccessor.get()) {
/* 731 */         throw new ConcurrentModificationException();
/*     */       }
/*     */     }
/*     */     
/*     */     protected void incrementModCount() {
/* 736 */       this.modCount = this.modCountAccessor.incrementAndGet();
/*     */     }
/*     */     
/*     */     protected void decrementModCount() {
/* 740 */       this.modCount = this.modCountAccessor.decrementAndGet();
/*     */     } }
/*     */ 
/*     */   
/*     */   private class VetoableListIteratorDecorator
/*     */     extends VetoableIteratorDecorator implements ListIterator<E> {
/*     */     private final ListIterator<E> lit;
/*     */     
/*     */     public VetoableListIteratorDecorator(VetoableListDecorator.ModCountAccessor param1ModCountAccessor, ListIterator<E> param1ListIterator, int param1Int) {
/* 749 */       super(param1ModCountAccessor, param1ListIterator, param1Int);
/* 750 */       this.lit = param1ListIterator;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean hasPrevious() {
/* 755 */       checkForComodification();
/* 756 */       return this.lit.hasPrevious();
/*     */     }
/*     */ 
/*     */     
/*     */     public E previous() {
/* 761 */       checkForComodification();
/* 762 */       E e = this.lit.previous();
/* 763 */       this.lastReturned = --this.cursor;
/* 764 */       return e;
/*     */     }
/*     */ 
/*     */     
/*     */     public int nextIndex() {
/* 769 */       checkForComodification();
/* 770 */       return this.lit.nextIndex();
/*     */     }
/*     */ 
/*     */     
/*     */     public int previousIndex() {
/* 775 */       checkForComodification();
/* 776 */       return this.lit.previousIndex();
/*     */     }
/*     */ 
/*     */     
/*     */     public void set(E param1E) {
/* 781 */       checkForComodification();
/* 782 */       if (this.lastReturned == -1) {
/* 783 */         throw new IllegalStateException();
/*     */       }
/* 785 */       VetoableListDecorator.this.onProposedChange(Collections.singletonList(param1E), new int[] { this.offset + this.lastReturned, this.offset + this.lastReturned + 1 });
/* 786 */       this.lit.set(param1E);
/*     */     }
/*     */ 
/*     */     
/*     */     public void add(E param1E) {
/* 791 */       checkForComodification();
/* 792 */       VetoableListDecorator.this.onProposedChange(Collections.singletonList(param1E), new int[] { this.offset + this.cursor, this.offset + this.cursor });
/*     */       try {
/* 794 */         incrementModCount();
/* 795 */         this.lit.add(param1E);
/* 796 */       } catch (Exception exception) {
/* 797 */         decrementModCount();
/* 798 */         throw exception;
/*     */       } 
/* 800 */       this.cursor++;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private class ModCountAccessorImpl
/*     */     implements ModCountAccessor
/*     */   {
/*     */     public int get() {
/* 811 */       return VetoableListDecorator.this.modCount;
/*     */     }
/*     */ 
/*     */     
/*     */     public int incrementAndGet() {
/* 816 */       return ++VetoableListDecorator.this.modCount;
/*     */     }
/*     */ 
/*     */     
/*     */     public int decrementAndGet() {
/* 821 */       return --VetoableListDecorator.this.modCount;
/*     */     }
/*     */   }
/*     */   
/*     */   private static interface ModCountAccessor {
/*     */     int get();
/*     */     
/*     */     int incrementAndGet();
/*     */     
/*     */     int decrementAndGet();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\VetoableListDecorator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */