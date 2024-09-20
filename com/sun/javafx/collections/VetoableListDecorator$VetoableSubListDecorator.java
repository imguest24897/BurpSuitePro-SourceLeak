/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.ConcurrentModificationException;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class VetoableSubListDecorator
/*     */   implements List<E>
/*     */ {
/*     */   private final List<E> subList;
/*     */   private final int offset;
/*     */   private final VetoableListDecorator.ModCountAccessor modCountAccessor;
/*     */   private int modCount;
/*     */   
/*     */   public VetoableSubListDecorator(VetoableListDecorator.ModCountAccessor paramModCountAccessor, List<E> paramList, int paramInt) {
/* 398 */     this.modCountAccessor = paramModCountAccessor;
/* 399 */     this.modCount = paramModCountAccessor.get();
/* 400 */     this.subList = paramList;
/* 401 */     this.offset = paramInt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 407 */     checkForComodification();
/* 408 */     return this.subList.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 413 */     checkForComodification();
/* 414 */     return this.subList.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 419 */     checkForComodification();
/* 420 */     return this.subList.contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 425 */     checkForComodification();
/* 426 */     return new VetoableListDecorator.VetoableIteratorDecorator(VetoableListDecorator.this, new ModCountAccessorImplSub(), this.subList.iterator(), this.offset);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 431 */     checkForComodification();
/* 432 */     return this.subList.toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 437 */     checkForComodification();
/* 438 */     return this.subList.toArray(paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(E paramE) {
/* 443 */     checkForComodification();
/* 444 */     VetoableListDecorator.this.onProposedChange(Collections.singletonList(paramE), new int[] { this.offset + size(), this.offset + size() });
/*     */     try {
/* 446 */       incrementModCount();
/* 447 */       this.subList.add(paramE);
/* 448 */     } catch (Exception exception) {
/* 449 */       decrementModCount();
/* 450 */       throw exception;
/*     */     } 
/* 452 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 457 */     checkForComodification();
/* 458 */     int i = indexOf(paramObject);
/* 459 */     if (i != -1) {
/* 460 */       remove(i);
/* 461 */       return true;
/*     */     } 
/* 463 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 468 */     checkForComodification();
/* 469 */     return this.subList.containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 474 */     Objects.requireNonNull(paramCollection);
/* 475 */     checkForComodification();
/* 476 */     VetoableListDecorator.this.onProposedChange(Collections.unmodifiableList(new ArrayList(paramCollection)), new int[] { this.offset + size(), this.offset + size() });
/*     */     try {
/* 478 */       incrementModCount();
/* 479 */       boolean bool = this.subList.addAll(paramCollection);
/* 480 */       if (!bool)
/* 481 */         decrementModCount(); 
/* 482 */       return bool;
/* 483 */     } catch (Exception exception) {
/* 484 */       decrementModCount();
/* 485 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 491 */     Objects.requireNonNull(paramCollection);
/* 492 */     Objects.checkIndex(paramInt, size() + 1);
/* 493 */     checkForComodification();
/* 494 */     VetoableListDecorator.this.onProposedChange(Collections.unmodifiableList(new ArrayList(paramCollection)), new int[] { this.offset + paramInt, this.offset + paramInt });
/*     */     try {
/* 496 */       incrementModCount();
/* 497 */       boolean bool = this.subList.addAll(paramInt, paramCollection);
/* 498 */       if (!bool)
/* 499 */         decrementModCount(); 
/* 500 */       return bool;
/* 501 */     } catch (Exception exception) {
/* 502 */       decrementModCount();
/* 503 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 509 */     Objects.requireNonNull(paramCollection);
/* 510 */     checkForComodification();
/* 511 */     VetoableListDecorator.this.removeFromList(this, this.offset, paramCollection, false);
/*     */     try {
/* 513 */       incrementModCount();
/* 514 */       boolean bool = this.subList.removeAll(paramCollection);
/* 515 */       if (!bool)
/* 516 */         decrementModCount(); 
/* 517 */       return bool;
/* 518 */     } catch (Exception exception) {
/* 519 */       decrementModCount();
/* 520 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 526 */     Objects.requireNonNull(paramCollection);
/* 527 */     checkForComodification();
/* 528 */     VetoableListDecorator.this.removeFromList(this, this.offset, paramCollection, true);
/*     */     try {
/* 530 */       incrementModCount();
/* 531 */       boolean bool = this.subList.retainAll(paramCollection);
/* 532 */       if (!bool)
/* 533 */         decrementModCount(); 
/* 534 */       return bool;
/* 535 */     } catch (Exception exception) {
/* 536 */       decrementModCount();
/* 537 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 543 */     checkForComodification();
/* 544 */     VetoableListDecorator.this.onProposedChange(Collections.emptyList(), new int[] { this.offset, this.offset + size() });
/*     */     try {
/* 546 */       incrementModCount();
/* 547 */       this.subList.clear();
/* 548 */     } catch (Exception exception) {
/* 549 */       decrementModCount();
/* 550 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/* 556 */     checkForComodification();
/* 557 */     return this.subList.get(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public E set(int paramInt, E paramE) {
/* 562 */     checkForComodification();
/* 563 */     VetoableListDecorator.this.onProposedChange(Collections.singletonList(paramE), new int[] { this.offset + paramInt, this.offset + paramInt + 1 });
/* 564 */     return this.subList.set(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(int paramInt, E paramE) {
/* 569 */     Objects.checkIndex(paramInt, size() + 1);
/* 570 */     checkForComodification();
/* 571 */     VetoableListDecorator.this.onProposedChange(Collections.singletonList(paramE), new int[] { this.offset + paramInt, this.offset + paramInt });
/*     */     try {
/* 573 */       incrementModCount();
/* 574 */       this.subList.add(paramInt, paramE);
/* 575 */     } catch (Exception exception) {
/* 576 */       decrementModCount();
/* 577 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public E remove(int paramInt) {
/* 583 */     Objects.checkIndex(paramInt, size());
/* 584 */     checkForComodification();
/* 585 */     VetoableListDecorator.this.onProposedChange(Collections.emptyList(), new int[] { this.offset + paramInt, this.offset + paramInt + 1 });
/*     */     try {
/* 587 */       incrementModCount();
/* 588 */       return this.subList.remove(paramInt);
/*     */     }
/* 590 */     catch (Exception exception) {
/* 591 */       decrementModCount();
/* 592 */       throw exception;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 599 */     checkForComodification();
/* 600 */     return this.subList.indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 605 */     checkForComodification();
/* 606 */     return this.subList.lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator() {
/* 611 */     checkForComodification();
/* 612 */     return new VetoableListDecorator.VetoableListIteratorDecorator(VetoableListDecorator.this, new ModCountAccessorImplSub(), this.subList
/* 613 */         .listIterator(), this.offset);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator(int paramInt) {
/* 618 */     checkForComodification();
/* 619 */     return new VetoableListDecorator.VetoableListIteratorDecorator(VetoableListDecorator.this, new ModCountAccessorImplSub(), this.subList
/* 620 */         .listIterator(paramInt), this.offset + paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> subList(int paramInt1, int paramInt2) {
/* 625 */     checkForComodification();
/* 626 */     return new VetoableSubListDecorator(new ModCountAccessorImplSub(), this.subList
/* 627 */         .subList(paramInt1, paramInt2), this.offset + paramInt1);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 632 */     checkForComodification();
/* 633 */     return this.subList.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 638 */     checkForComodification();
/* 639 */     return this.subList.equals(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 644 */     checkForComodification();
/* 645 */     return this.subList.hashCode();
/*     */   }
/*     */   
/*     */   private void checkForComodification() {
/* 649 */     if (this.modCount != this.modCountAccessor.get()) {
/* 650 */       throw new ConcurrentModificationException();
/*     */     }
/*     */   }
/*     */   
/*     */   private void incrementModCount() {
/* 655 */     this.modCount = this.modCountAccessor.incrementAndGet();
/*     */   }
/*     */   
/*     */   private void decrementModCount() {
/* 659 */     this.modCount = this.modCountAccessor.decrementAndGet();
/*     */   }
/*     */   
/*     */   private class ModCountAccessorImplSub
/*     */     implements VetoableListDecorator.ModCountAccessor
/*     */   {
/*     */     public int get() {
/* 666 */       return VetoableListDecorator.VetoableSubListDecorator.this.modCount;
/*     */     }
/*     */ 
/*     */     
/*     */     public int incrementAndGet() {
/* 671 */       return VetoableListDecorator.VetoableSubListDecorator.this.modCount = VetoableListDecorator.VetoableSubListDecorator.this.modCountAccessor.incrementAndGet();
/*     */     }
/*     */ 
/*     */     
/*     */     public int decrementAndGet() {
/* 676 */       return VetoableListDecorator.VetoableSubListDecorator.this.modCount = VetoableListDecorator.VetoableSubListDecorator.this.modCountAccessor.decrementAndGet();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\VetoableListDecorator$VetoableSubListDecorator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */