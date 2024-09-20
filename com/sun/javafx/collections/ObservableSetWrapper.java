/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.collections.ObservableSet;
/*     */ import javafx.collections.SetChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ObservableSetWrapper<E>
/*     */   implements ObservableSet<E>
/*     */ {
/*     */   private final Set<E> backingSet;
/*     */   private SetListenerHelper<E> listenerHelper;
/*     */   
/*     */   public ObservableSetWrapper(Set<E> paramSet) {
/*  52 */     this.backingSet = paramSet;
/*     */   }
/*     */   
/*     */   private class SimpleAddChange
/*     */     extends SetChangeListener.Change<E> {
/*     */     private final E added;
/*     */     
/*     */     public SimpleAddChange(E param1E) {
/*  60 */       super(ObservableSetWrapper.this);
/*  61 */       this.added = param1E;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasAdded() {
/*  66 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/*  71 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public E getElementAdded() {
/*  76 */       return this.added;
/*     */     }
/*     */ 
/*     */     
/*     */     public E getElementRemoved() {
/*  81 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  86 */       return "added " + String.valueOf(this.added);
/*     */     }
/*     */   }
/*     */   
/*     */   private class SimpleRemoveChange
/*     */     extends SetChangeListener.Change<E>
/*     */   {
/*     */     private final E removed;
/*     */     
/*     */     public SimpleRemoveChange(E param1E) {
/*  96 */       super(ObservableSetWrapper.this);
/*  97 */       this.removed = param1E;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasAdded() {
/* 102 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/* 107 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public E getElementAdded() {
/* 112 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public E getElementRemoved() {
/* 117 */       return this.removed;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 122 */       return "removed " + String.valueOf(this.removed);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void callObservers(SetChangeListener.Change<E> paramChange) {
/* 128 */     SetListenerHelper.fireValueChangedEvent(this.listenerHelper, paramChange);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 136 */     this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 144 */     this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 152 */     this.listenerHelper = SetListenerHelper.addListener(this.listenerHelper, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 160 */     this.listenerHelper = SetListenerHelper.removeListener(this.listenerHelper, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 171 */     return this.backingSet.size();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 182 */     return this.backingSet.isEmpty();
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
/*     */   public boolean contains(Object paramObject) {
/* 194 */     return this.backingSet.contains(paramObject);
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
/*     */   public Iterator<E> iterator() {
/* 207 */     return new Iterator<E>()
/*     */       {
/* 209 */         private final Iterator<E> backingIt = ObservableSetWrapper.this.backingSet.iterator();
/*     */         
/*     */         private E lastElement;
/*     */         
/*     */         public boolean hasNext() {
/* 214 */           return this.backingIt.hasNext();
/*     */         }
/*     */ 
/*     */         
/*     */         public E next() {
/* 219 */           this.lastElement = this.backingIt.next();
/* 220 */           return this.lastElement;
/*     */         }
/*     */ 
/*     */         
/*     */         public void remove() {
/* 225 */           this.backingIt.remove();
/* 226 */           ObservableSetWrapper.this.callObservers(new ObservableSetWrapper.SimpleRemoveChange(this.lastElement));
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 239 */     return this.backingSet.toArray();
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
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 253 */     return this.backingSet.toArray(paramArrayOfT);
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
/*     */   public boolean add(E paramE) {
/* 267 */     boolean bool = this.backingSet.add(paramE);
/* 268 */     if (bool) {
/* 269 */       callObservers(new SimpleAddChange(paramE));
/*     */     }
/* 271 */     return bool;
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
/*     */   public boolean remove(Object paramObject) {
/* 285 */     boolean bool = this.backingSet.remove(paramObject);
/* 286 */     if (bool) {
/* 287 */       callObservers(new SimpleRemoveChange((E)paramObject));
/*     */     }
/* 289 */     return bool;
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
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 302 */     return this.backingSet.containsAll(paramCollection);
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
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_2
/*     */     //   2: aload_1
/*     */     //   3: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: invokeinterface hasNext : ()Z
/*     */     //   15: ifeq -> 38
/*     */     //   18: aload_3
/*     */     //   19: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   24: astore #4
/*     */     //   26: iload_2
/*     */     //   27: aload_0
/*     */     //   28: aload #4
/*     */     //   30: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   33: ior
/*     */     //   34: istore_2
/*     */     //   35: goto -> 9
/*     */     //   38: iload_2
/*     */     //   39: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #316	-> 0
/*     */     //   #317	-> 2
/*     */     //   #318	-> 26
/*     */     //   #319	-> 35
/*     */     //   #320	-> 38
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
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 335 */     if (paramCollection.isEmpty() && !this.backingSet.isEmpty()) {
/* 336 */       clear();
/* 337 */       return true;
/*     */     } 
/*     */     
/* 340 */     if (this.backingSet.isEmpty()) {
/* 341 */       return false;
/*     */     }
/*     */     
/* 344 */     return removeRetain(paramCollection, false);
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
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 358 */     if (paramCollection.isEmpty() || this.backingSet.isEmpty()) {
/* 359 */       return false;
/*     */     }
/*     */     
/* 362 */     return removeRetain(paramCollection, true);
/*     */   }
/*     */   
/*     */   private boolean removeRetain(Collection<?> paramCollection, boolean paramBoolean) {
/* 366 */     boolean bool = false;
/* 367 */     for (Iterator<E> iterator = this.backingSet.iterator(); iterator.hasNext(); ) {
/* 368 */       E e = iterator.next();
/* 369 */       if (paramBoolean == paramCollection.contains(e)) {
/* 370 */         bool = true;
/* 371 */         iterator.remove();
/* 372 */         callObservers(new SimpleRemoveChange(e));
/*     */       } 
/*     */     } 
/* 375 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clear() {
/* 385 */     for (Iterator<E> iterator = this.backingSet.iterator(); iterator.hasNext(); ) {
/* 386 */       E e = iterator.next();
/* 387 */       iterator.remove();
/* 388 */       callObservers(new SimpleRemoveChange(e));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 399 */     return this.backingSet.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 410 */     return this.backingSet.equals(paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 420 */     return this.backingSet.hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSetWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */