/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.collections.ObservableListBase;
/*     */ import javafx.collections.WeakListChangeListener;
/*     */ import javafx.util.Callback;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ElementObservableListDecorator<E>
/*     */   extends ObservableListBase<E>
/*     */ {
/*     */   private final ObservableList<E> decoratedList;
/*     */   private final ListChangeListener<E> listener;
/*     */   private ElementObserver<E> observer;
/*     */   
/*     */   public ElementObservableListDecorator(ObservableList<E> paramObservableList, Callback<E, Observable[]> paramCallback) {
/*  50 */     this.observer = new ElementObserver<>(paramCallback, new Callback<E, InvalidationListener>()
/*     */         {
/*     */           public InvalidationListener call(final E e)
/*     */           {
/*  54 */             return new InvalidationListener()
/*     */               {
/*     */                 public void invalidated(Observable param2Observable)
/*     */                 {
/*  58 */                   ElementObservableListDecorator.this.beginChange();
/*  59 */                   byte b = 0;
/*  60 */                   if (ElementObservableListDecorator.this.decoratedList instanceof java.util.RandomAccess) {
/*  61 */                     int i = ElementObservableListDecorator.this.size();
/*  62 */                     for (; b < i; b++) {
/*  63 */                       if (ElementObservableListDecorator.this.get(b) == e) {
/*  64 */                         ElementObservableListDecorator.this.nextUpdate(b);
/*     */                       }
/*     */                     } 
/*     */                   } else {
/*  68 */                     for (Iterator iterator = ElementObservableListDecorator.this.iterator(); iterator.hasNext(); ) {
/*  69 */                       if (iterator.next() == e) {
/*  70 */                         ElementObservableListDecorator.this.nextUpdate(b);
/*     */                       }
/*  72 */                       b++;
/*     */                     } 
/*     */                   } 
/*  75 */                   ElementObservableListDecorator.this.endChange();
/*     */                 }
/*     */               };
/*     */           }
/*     */         }this);
/*  80 */     this.decoratedList = paramObservableList;
/*  81 */     int i = this.decoratedList.size();
/*  82 */     for (byte b = 0; b < i; b++) {
/*  83 */       this.observer.attachListener((E)this.decoratedList.get(b));
/*     */     }
/*  85 */     this.listener = new ListChangeListener<E>()
/*     */       {
/*     */         public void onChanged(ListChangeListener.Change<? extends E> param1Change)
/*     */         {
/*  89 */           while (param1Change.next()) {
/*  90 */             if (param1Change.wasAdded() || param1Change.wasRemoved()) {
/*  91 */               int i = param1Change.getRemovedSize();
/*  92 */               List list = param1Change.getRemoved(); int j;
/*  93 */               for (j = 0; j < i; j++) {
/*  94 */                 ElementObservableListDecorator.this.observer.detachListener(list.get(j));
/*     */               }
/*  96 */               if (ElementObservableListDecorator.this.decoratedList instanceof java.util.RandomAccess) {
/*  97 */                 j = param1Change.getTo();
/*  98 */                 for (int k = param1Change.getFrom(); k < j; k++)
/*  99 */                   ElementObservableListDecorator.this.observer.attachListener(ElementObservableListDecorator.this.decoratedList.get(k)); 
/*     */                 continue;
/*     */               } 
/* 102 */               for (Object object : param1Change.getAddedSubList()) {
/* 103 */                 ElementObservableListDecorator.this.observer.attachListener(object);
/*     */               }
/*     */             } 
/*     */           } 
/*     */           
/* 108 */           param1Change.reset();
/* 109 */           ElementObservableListDecorator.this.fireChange(param1Change);
/*     */         }
/*     */       };
/* 112 */     this.decoratedList.addListener((ListChangeListener)new WeakListChangeListener(this.listener));
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 117 */     return (T[])this.decoratedList.toArray((Object[])paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 122 */     return this.decoratedList.toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> subList(int paramInt1, int paramInt2) {
/* 127 */     return this.decoratedList.subList(paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 132 */     return this.decoratedList.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public E set(int paramInt, E paramE) {
/* 137 */     return (E)this.decoratedList.set(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 142 */     return this.decoratedList.retainAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 147 */     return this.decoratedList.removeAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public E remove(int paramInt) {
/* 152 */     return (E)this.decoratedList.remove(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 157 */     return this.decoratedList.remove(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator(int paramInt) {
/* 162 */     return this.decoratedList.listIterator(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator() {
/* 167 */     return this.decoratedList.listIterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 172 */     return this.decoratedList.lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 177 */     return this.decoratedList.iterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 182 */     return this.decoratedList.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 187 */     return this.decoratedList.indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/* 192 */     return (E)this.decoratedList.get(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 197 */     return this.decoratedList.containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 202 */     return this.decoratedList.contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 207 */     this.decoratedList.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 212 */     return this.decoratedList.addAll(paramInt, paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 217 */     return this.decoratedList.addAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(int paramInt, E paramE) {
/* 222 */     this.decoratedList.add(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(E paramE) {
/* 227 */     return this.decoratedList.add(paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(Collection<? extends E> paramCollection) {
/* 232 */     return this.decoratedList.setAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(E... paramVarArgs) {
/* 237 */     return this.decoratedList.setAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(E... paramVarArgs) {
/* 242 */     return this.decoratedList.retainAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(E... paramVarArgs) {
/* 247 */     return this.decoratedList.removeAll((Object[])paramVarArgs);
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove(int paramInt1, int paramInt2) {
/* 252 */     this.decoratedList.remove(paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(E... paramVarArgs) {
/* 257 */     return this.decoratedList.addAll((Object[])paramVarArgs);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ElementObservableListDecorator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */