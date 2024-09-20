/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.collections.MapChangeListener;
/*     */ import javafx.collections.ObservableMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ObservableMapWrapper<K, V>
/*     */   implements ObservableMap<K, V>
/*     */ {
/*     */   private ObservableEntrySet entrySet;
/*     */   private ObservableKeySet keySet;
/*     */   private ObservableValues values;
/*     */   private MapListenerHelper<K, V> listenerHelper;
/*     */   private final Map<K, V> backingMap;
/*     */   
/*     */   public ObservableMapWrapper(Map<K, V> paramMap) {
/*  50 */     this.backingMap = paramMap;
/*     */   }
/*     */   
/*     */   private class SimpleChange
/*     */     extends MapChangeListener.Change<K, V> {
/*     */     private final K key;
/*     */     private final V old;
/*     */     private final V added;
/*     */     private final boolean wasAdded;
/*     */     private final boolean wasRemoved;
/*     */     
/*     */     public SimpleChange(K param1K, V param1V1, V param1V2, boolean param1Boolean1, boolean param1Boolean2) {
/*  62 */       super(ObservableMapWrapper.this);
/*  63 */       assert param1Boolean1 || param1Boolean2;
/*  64 */       this.key = param1K;
/*  65 */       this.old = param1V1;
/*  66 */       this.added = param1V2;
/*  67 */       this.wasAdded = param1Boolean1;
/*  68 */       this.wasRemoved = param1Boolean2;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasAdded() {
/*  73 */       return this.wasAdded;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/*  78 */       return this.wasRemoved;
/*     */     }
/*     */ 
/*     */     
/*     */     public K getKey() {
/*  83 */       return this.key;
/*     */     }
/*     */ 
/*     */     
/*     */     public V getValueAdded() {
/*  88 */       return this.added;
/*     */     }
/*     */ 
/*     */     
/*     */     public V getValueRemoved() {
/*  93 */       return this.old;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  98 */       StringBuilder stringBuilder = new StringBuilder();
/*  99 */       if (this.wasAdded) {
/* 100 */         if (this.wasRemoved) {
/* 101 */           stringBuilder.append(this.old).append(" replaced by ").append(this.added);
/*     */         } else {
/* 103 */           stringBuilder.append(this.added).append(" added");
/*     */         } 
/*     */       } else {
/* 106 */         stringBuilder.append(this.old).append(" removed");
/*     */       } 
/* 108 */       stringBuilder.append(" at key ").append(this.key);
/* 109 */       return stringBuilder.toString();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void callObservers(MapChangeListener.Change<K, V> paramChange) {
/* 115 */     MapListenerHelper.fireValueChangedEvent(this.listenerHelper, paramChange);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 120 */     this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 125 */     this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 130 */     this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 135 */     this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 140 */     return this.backingMap.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 145 */     return this.backingMap.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsKey(Object paramObject) {
/* 150 */     return this.backingMap.containsKey(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsValue(Object paramObject) {
/* 155 */     return this.backingMap.containsValue(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public V get(Object paramObject) {
/* 160 */     return this.backingMap.get(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public V put(K paramK, V paramV) {
/*     */     V v;
/* 166 */     if (this.backingMap.containsKey(paramK)) {
/* 167 */       V v1 = this.backingMap.put(paramK, paramV);
/* 168 */       if ((v1 == null && paramV != null) || (v1 != null && !v1.equals(paramV))) {
/* 169 */         callObservers(new SimpleChange(paramK, v1, paramV, true, true));
/*     */       }
/*     */     } else {
/* 172 */       v = this.backingMap.put(paramK, paramV);
/* 173 */       callObservers(new SimpleChange(paramK, v, paramV, true, false));
/*     */     } 
/* 175 */     return v;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public V remove(Object paramObject) {
/* 181 */     if (!this.backingMap.containsKey(paramObject)) {
/* 182 */       return null;
/*     */     }
/* 184 */     V v = this.backingMap.remove(paramObject);
/* 185 */     callObservers(new SimpleChange((K)paramObject, v, null, false, true));
/* 186 */     return v;
/*     */   }
/*     */ 
/*     */   
/*     */   public void putAll(Map<? extends K, ? extends V> paramMap) {
/* 191 */     for (Map.Entry<? extends K, ? extends V> entry : paramMap.entrySet()) {
/* 192 */       put((K)entry.getKey(), (V)entry.getValue());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 198 */     for (Iterator<Map.Entry> iterator = this.backingMap.entrySet().iterator(); iterator.hasNext(); ) {
/* 199 */       Map.Entry entry = iterator.next();
/* 200 */       Object object1 = entry.getKey();
/* 201 */       Object object2 = entry.getValue();
/* 202 */       iterator.remove();
/* 203 */       callObservers(new SimpleChange((K)object1, (V)object2, null, false, true));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<K> keySet() {
/* 209 */     if (this.keySet == null) {
/* 210 */       this.keySet = new ObservableKeySet();
/*     */     }
/* 212 */     return this.keySet;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<V> values() {
/* 217 */     if (this.values == null) {
/* 218 */       this.values = new ObservableValues();
/*     */     }
/* 220 */     return this.values;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<Map.Entry<K, V>> entrySet() {
/* 225 */     if (this.entrySet == null) {
/* 226 */       this.entrySet = new ObservableEntrySet();
/*     */     }
/* 228 */     return this.entrySet;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 233 */     return this.backingMap.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 238 */     return this.backingMap.equals(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 243 */     return this.backingMap.hashCode();
/*     */   }
/*     */   
/*     */   private class ObservableKeySet
/*     */     implements Set<K>
/*     */   {
/*     */     public int size() {
/* 250 */       return ObservableMapWrapper.this.backingMap.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 255 */       return ObservableMapWrapper.this.backingMap.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object param1Object) {
/* 260 */       return ObservableMapWrapper.this.backingMap.keySet().contains(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<K> iterator() {
/* 265 */       return new Iterator<K>()
/*     */         {
/* 267 */           private Iterator<Map.Entry<K, V>> entryIt = ObservableMapWrapper.this.backingMap.entrySet().iterator();
/*     */           private K lastKey;
/*     */           private V lastValue;
/*     */           
/*     */           public boolean hasNext() {
/* 272 */             return this.entryIt.hasNext();
/*     */           }
/*     */ 
/*     */           
/*     */           public K next() {
/* 277 */             Map.Entry entry = this.entryIt.next();
/* 278 */             this.lastKey = (K)entry.getKey();
/* 279 */             this.lastValue = (V)entry.getValue();
/* 280 */             return (K)entry.getKey();
/*     */           }
/*     */ 
/*     */           
/*     */           public void remove() {
/* 285 */             this.entryIt.remove();
/* 286 */             ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(this.lastKey, this.lastValue, null, false, true));
/*     */           }
/*     */         };
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object[] toArray() {
/* 294 */       return ObservableMapWrapper.this.backingMap.keySet().toArray();
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 299 */       return (T[])ObservableMapWrapper.this.backingMap.keySet().toArray((Object[])param1ArrayOfT);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean add(K param1K) {
/* 304 */       throw new UnsupportedOperationException("Not supported.");
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(Object param1Object) {
/* 309 */       return (ObservableMapWrapper.this.remove(param1Object) != null);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(Collection<?> param1Collection) {
/* 314 */       return ObservableMapWrapper.this.backingMap.keySet().containsAll(param1Collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(Collection<? extends K> param1Collection) {
/* 319 */       throw new UnsupportedOperationException("Not supported.");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean retainAll(Collection<?> param1Collection) {
/* 325 */       if (param1Collection.isEmpty() && !ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 326 */         clear();
/* 327 */         return true;
/*     */       } 
/*     */       
/* 330 */       if (ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 331 */         return false;
/*     */       }
/*     */       
/* 334 */       return removeRetain(param1Collection, false);
/*     */     }
/*     */     
/*     */     private boolean removeRetain(Collection<?> param1Collection, boolean param1Boolean) {
/* 338 */       boolean bool = false;
/* 339 */       for (Iterator<Map.Entry> iterator = ObservableMapWrapper.this.backingMap.entrySet().iterator(); iterator.hasNext(); ) {
/* 340 */         Map.Entry entry = iterator.next();
/* 341 */         if (param1Boolean == param1Collection.contains(entry.getKey())) {
/* 342 */           bool = true;
/* 343 */           Object object1 = entry.getKey();
/* 344 */           Object object2 = entry.getValue();
/* 345 */           iterator.remove();
/* 346 */           ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange((K)object1, (V)object2, null, false, true));
/*     */         } 
/*     */       } 
/* 349 */       return bool;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean removeAll(Collection<?> param1Collection) {
/* 355 */       if (param1Collection.isEmpty() || ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 356 */         return false;
/*     */       }
/*     */       
/* 359 */       return removeRetain(param1Collection, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 364 */       ObservableMapWrapper.this.clear();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 369 */       return ObservableMapWrapper.this.backingMap.keySet().toString();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 374 */       return ObservableMapWrapper.this.backingMap.keySet().equals(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 379 */       return ObservableMapWrapper.this.backingMap.keySet().hashCode(); }
/*     */   } class null implements Iterator<K> {
/*     */     private Iterator<Map.Entry<K, V>> entryIt = ObservableMapWrapper.this.backingMap.entrySet().iterator(); private K lastKey; private V lastValue; public boolean hasNext() { return this.entryIt.hasNext(); } public K next() { Map.Entry entry = this.entryIt.next();
/*     */       this.lastKey = (K)entry.getKey();
/*     */       this.lastValue = (V)entry.getValue();
/*     */       return (K)entry.getKey(); } public void remove() { this.entryIt.remove();
/*     */       ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(this.lastKey, this.lastValue, null, false, true)); }
/*     */   } private class ObservableValues implements Collection<V> {
/*     */     public int size() {
/* 388 */       return ObservableMapWrapper.this.backingMap.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 393 */       return ObservableMapWrapper.this.backingMap.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object param1Object) {
/* 398 */       return ObservableMapWrapper.this.backingMap.values().contains(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<V> iterator() {
/* 403 */       return new Iterator<V>()
/*     */         {
/* 405 */           private Iterator<Map.Entry<K, V>> entryIt = ObservableMapWrapper.this.backingMap.entrySet().iterator();
/*     */           private K lastKey;
/*     */           private V lastValue;
/*     */           
/*     */           public boolean hasNext() {
/* 410 */             return this.entryIt.hasNext();
/*     */           }
/*     */ 
/*     */           
/*     */           public V next() {
/* 415 */             Map.Entry entry = this.entryIt.next();
/* 416 */             this.lastKey = (K)entry.getKey();
/* 417 */             this.lastValue = (V)entry.getValue();
/* 418 */             return this.lastValue;
/*     */           }
/*     */ 
/*     */           
/*     */           public void remove() {
/* 423 */             this.entryIt.remove();
/* 424 */             ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(this.lastKey, this.lastValue, null, false, true));
/*     */           }
/*     */         };
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object[] toArray() {
/* 432 */       return ObservableMapWrapper.this.backingMap.values().toArray();
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 437 */       return (T[])ObservableMapWrapper.this.backingMap.values().toArray((Object[])param1ArrayOfT);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean add(V param1V) {
/* 442 */       throw new UnsupportedOperationException("Not supported.");
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(Object param1Object) {
/* 447 */       for (Iterator<V> iterator = iterator(); iterator.hasNext();) {
/* 448 */         if (iterator.next().equals(param1Object)) {
/* 449 */           iterator.remove();
/* 450 */           return true;
/*     */         } 
/*     */       } 
/* 453 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(Collection<?> param1Collection) {
/* 458 */       return ObservableMapWrapper.this.backingMap.values().containsAll(param1Collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(Collection<? extends V> param1Collection) {
/* 463 */       throw new UnsupportedOperationException("Not supported.");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean removeAll(Collection<?> param1Collection) {
/* 469 */       if (param1Collection.isEmpty() || ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 470 */         return false;
/*     */       }
/*     */       
/* 473 */       return removeRetain(param1Collection, true);
/*     */     }
/*     */     
/*     */     private boolean removeRetain(Collection<?> param1Collection, boolean param1Boolean) {
/* 477 */       boolean bool = false;
/* 478 */       for (Iterator<Map.Entry> iterator = ObservableMapWrapper.this.backingMap.entrySet().iterator(); iterator.hasNext(); ) {
/* 479 */         Map.Entry entry = iterator.next();
/* 480 */         if (param1Boolean == param1Collection.contains(entry.getValue())) {
/* 481 */           bool = true;
/* 482 */           Object object1 = entry.getKey();
/* 483 */           Object object2 = entry.getValue();
/* 484 */           iterator.remove();
/* 485 */           ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange((K)object1, (V)object2, null, false, true));
/*     */         } 
/*     */       } 
/* 488 */       return bool;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean retainAll(Collection<?> param1Collection) {
/* 494 */       if (param1Collection.isEmpty() && !ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 495 */         clear();
/* 496 */         return true;
/*     */       } 
/*     */       
/* 499 */       if (ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 500 */         return false;
/*     */       }
/*     */       
/* 503 */       return removeRetain(param1Collection, false);
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 508 */       ObservableMapWrapper.this.clear();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 513 */       return ObservableMapWrapper.this.backingMap.values().toString();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 518 */       return ObservableMapWrapper.this.backingMap.values().equals(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 523 */       return ObservableMapWrapper.this.backingMap.values().hashCode();
/*     */     }
/*     */   } class null implements Iterator<V> { private Iterator<Map.Entry<K, V>> entryIt = ObservableMapWrapper.this.backingMap.entrySet().iterator(); private K lastKey; private V lastValue; public boolean hasNext() {
/*     */       return this.entryIt.hasNext();
/*     */     } public V next() {
/*     */       Map.Entry entry = this.entryIt.next();
/*     */       this.lastKey = (K)entry.getKey();
/*     */       this.lastValue = (V)entry.getValue();
/*     */       return this.lastValue;
/*     */     } public void remove() {
/*     */       this.entryIt.remove();
/*     */       ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(this.lastKey, this.lastValue, null, false, true));
/*     */     } } private class ObservableEntry implements Map.Entry<K, V> { private final Map.Entry<K, V> backingEntry; public ObservableEntry(Map.Entry<K, V> param1Entry) {
/* 536 */       this.backingEntry = param1Entry;
/*     */     }
/*     */ 
/*     */     
/*     */     public K getKey() {
/* 541 */       return this.backingEntry.getKey();
/*     */     }
/*     */ 
/*     */     
/*     */     public V getValue() {
/* 546 */       return this.backingEntry.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     public V setValue(V param1V) {
/* 551 */       V v = this.backingEntry.setValue(param1V);
/* 552 */       ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(getKey(), v, param1V, true, true));
/* 553 */       return v;
/*     */     }
/*     */     
/*     */     public final boolean equals(Object param1Object) {
/*     */       Map.Entry entry;
/* 558 */       if (param1Object instanceof Map.Entry) { entry = (Map.Entry)param1Object; }
/* 559 */       else { return false; }
/*     */       
/* 561 */       K k = getKey();
/* 562 */       Object object = entry.getKey();
/* 563 */       if (k == object || (k != null && k.equals(object))) {
/* 564 */         V v = getValue();
/* 565 */         Object object1 = entry.getValue();
/* 566 */         if (v == object1 || (v != null && v.equals(object1))) {
/* 567 */           return true;
/*     */         }
/*     */       } 
/* 570 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public final int hashCode() {
/* 575 */       return ((getKey() == null) ? 0 : getKey().hashCode()) ^ (
/* 576 */         (getValue() == null) ? 0 : getValue().hashCode());
/*     */     }
/*     */ 
/*     */     
/*     */     public final String toString() {
/* 581 */       return String.valueOf(getKey()) + "=" + String.valueOf(getKey());
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   private class ObservableEntrySet
/*     */     implements Set<Map.Entry<K, V>>
/*     */   {
/*     */     public int size() {
/* 590 */       return ObservableMapWrapper.this.backingMap.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 595 */       return ObservableMapWrapper.this.backingMap.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object param1Object) {
/* 600 */       return ObservableMapWrapper.this.backingMap.entrySet().contains(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<Map.Entry<K, V>> iterator() {
/* 605 */       return new Iterator<Map.Entry<K, V>>()
/*     */         {
/* 607 */           private Iterator<Map.Entry<K, V>> backingIt = ObservableMapWrapper.this.backingMap.entrySet().iterator();
/*     */           private K lastKey;
/*     */           private V lastValue;
/*     */           
/*     */           public boolean hasNext() {
/* 612 */             return this.backingIt.hasNext();
/*     */           }
/*     */ 
/*     */           
/*     */           public Map.Entry<K, V> next() {
/* 617 */             Map.Entry<K, V> entry = this.backingIt.next();
/* 618 */             this.lastKey = (K)entry.getKey();
/* 619 */             this.lastValue = (V)entry.getValue();
/* 620 */             return new ObservableMapWrapper.ObservableEntry(entry);
/*     */           }
/*     */ 
/*     */           
/*     */           public void remove() {
/* 625 */             this.backingIt.remove();
/* 626 */             ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(this.lastKey, this.lastValue, null, false, true));
/*     */           }
/*     */         };
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object[] toArray() {
/* 634 */       Object[] arrayOfObject = ObservableMapWrapper.this.backingMap.entrySet().toArray();
/* 635 */       for (byte b = 0; b < arrayOfObject.length; b++) {
/* 636 */         arrayOfObject[b] = new ObservableMapWrapper.ObservableEntry((Map.Entry<K, V>)arrayOfObject[b]);
/*     */       }
/* 638 */       return arrayOfObject;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 644 */       Object[] arrayOfObject = ObservableMapWrapper.this.backingMap.entrySet().toArray((Object[])param1ArrayOfT);
/* 645 */       for (byte b = 0; b < arrayOfObject.length; b++) {
/* 646 */         arrayOfObject[b] = new ObservableMapWrapper.ObservableEntry((Map.Entry<K, V>)arrayOfObject[b]);
/*     */       }
/* 648 */       return (T[])arrayOfObject;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean add(Map.Entry<K, V> param1Entry) {
/* 653 */       throw new UnsupportedOperationException("Not supported.");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean remove(Object param1Object) {
/* 659 */       boolean bool = ObservableMapWrapper.this.backingMap.entrySet().remove(param1Object);
/* 660 */       if (bool) {
/* 661 */         Map.Entry entry = (Map.Entry)param1Object;
/* 662 */         ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange((K)entry.getKey(), (V)entry.getValue(), null, false, true));
/*     */       } 
/* 664 */       return bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(Collection<?> param1Collection) {
/* 669 */       return ObservableMapWrapper.this.backingMap.entrySet().containsAll(param1Collection);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(Collection<? extends Map.Entry<K, V>> param1Collection) {
/* 674 */       throw new UnsupportedOperationException("Not supported.");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean retainAll(Collection<?> param1Collection) {
/* 680 */       if (param1Collection.isEmpty() && !ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 681 */         clear();
/* 682 */         return true;
/*     */       } 
/*     */       
/* 685 */       if (ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 686 */         return false;
/*     */       }
/*     */       
/* 689 */       return removeRetain(param1Collection, false);
/*     */     }
/*     */     
/*     */     private boolean removeRetain(Collection<?> param1Collection, boolean param1Boolean) {
/* 693 */       boolean bool = false;
/* 694 */       for (Iterator<Map.Entry> iterator = ObservableMapWrapper.this.backingMap.entrySet().iterator(); iterator.hasNext(); ) {
/* 695 */         Map.Entry entry = iterator.next();
/* 696 */         if (param1Boolean == param1Collection.contains(entry)) {
/* 697 */           bool = true;
/* 698 */           Object object1 = entry.getKey();
/* 699 */           Object object2 = entry.getValue();
/* 700 */           iterator.remove();
/* 701 */           ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange((K)object1, (V)object2, null, false, true));
/*     */         } 
/*     */       } 
/* 704 */       return bool;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean removeAll(Collection<?> param1Collection) {
/* 710 */       if (param1Collection.isEmpty() || ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 711 */         return false;
/*     */       }
/*     */       
/* 714 */       return removeRetain(param1Collection, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 719 */       ObservableMapWrapper.this.clear();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 724 */       return ObservableMapWrapper.this.backingMap.entrySet().toString();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 729 */       return ObservableMapWrapper.this.backingMap.entrySet().equals(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 734 */       return ObservableMapWrapper.this.backingMap.entrySet().hashCode();
/*     */     }
/*     */   }
/*     */   
/*     */   class null implements Iterator<Map.Entry<K, V>> {
/*     */     private Iterator<Map.Entry<K, V>> backingIt;
/*     */     private K lastKey;
/*     */     private V lastValue;
/*     */     
/*     */     null() {
/*     */       this.backingIt = ObservableMapWrapper.this.backingMap.entrySet().iterator();
/*     */     }
/*     */     
/*     */     public boolean hasNext() {
/*     */       return this.backingIt.hasNext();
/*     */     }
/*     */     
/*     */     public Map.Entry<K, V> next() {
/*     */       Map.Entry<K, V> entry = this.backingIt.next();
/*     */       this.lastKey = (K)entry.getKey();
/*     */       this.lastValue = (V)entry.getValue();
/*     */       return new ObservableMapWrapper.ObservableEntry(entry);
/*     */     }
/*     */     
/*     */     public void remove() {
/*     */       this.backingIt.remove();
/*     */       ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(this.lastKey, this.lastValue, null, false, true));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableMapWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */