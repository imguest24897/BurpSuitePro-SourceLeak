/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.AbstractMap;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.collections.MapChangeListener;
/*     */ import javafx.collections.ObservableMap;
/*     */ import javafx.collections.WeakMapChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UnmodifiableObservableMap<K, V>
/*     */   extends AbstractMap<K, V>
/*     */   implements ObservableMap<K, V>
/*     */ {
/*     */   private MapListenerHelper<K, V> listenerHelper;
/*     */   private final ObservableMap<K, V> backingMap;
/*     */   private final MapChangeListener<K, V> listener;
/*     */   private Set<K> keyset;
/*     */   private Collection<V> values;
/*     */   private Set<Map.Entry<K, V>> entryset;
/*     */   
/*     */   public UnmodifiableObservableMap(ObservableMap<K, V> paramObservableMap) {
/*  55 */     this.backingMap = paramObservableMap;
/*  56 */     this.listener = (paramChange -> callObservers(new MapAdapterChange<>(this, paramChange)));
/*     */ 
/*     */     
/*  59 */     this.backingMap.addListener((MapChangeListener)new WeakMapChangeListener(this.listener));
/*     */   }
/*     */   
/*     */   private void callObservers(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/*  63 */     MapListenerHelper.fireValueChangedEvent(this.listenerHelper, paramChange);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  68 */     this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  73 */     this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  78 */     this.listenerHelper = MapListenerHelper.addListener(this.listenerHelper, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  83 */     this.listenerHelper = MapListenerHelper.removeListener(this.listenerHelper, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  88 */     return this.backingMap.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/*  93 */     return this.backingMap.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsKey(Object paramObject) {
/*  98 */     return this.backingMap.containsKey(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsValue(Object paramObject) {
/* 103 */     return this.backingMap.containsValue(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public V get(Object paramObject) {
/* 108 */     return (V)this.backingMap.get(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<K> keySet() {
/* 113 */     if (this.keyset == null) {
/* 114 */       this.keyset = Collections.unmodifiableSet(this.backingMap.keySet());
/*     */     }
/* 116 */     return this.keyset;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<V> values() {
/* 121 */     if (this.values == null) {
/* 122 */       this.values = Collections.unmodifiableCollection(this.backingMap.values());
/*     */     }
/* 124 */     return this.values;
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<Map.Entry<K, V>> entrySet() {
/* 129 */     if (this.entryset == null) {
/* 130 */       this.entryset = Collections.<K, V>unmodifiableMap((Map<? extends K, ? extends V>)this.backingMap).entrySet();
/*     */     }
/* 132 */     return this.entryset;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\UnmodifiableObservableMap.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */