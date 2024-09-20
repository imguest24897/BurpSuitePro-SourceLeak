/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.Map;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.collections.MapChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class MapContentBinding<K, V>
/*     */   implements MapChangeListener<K, V>, WeakListener
/*     */ {
/*     */   private final WeakReference<Map<K, V>> mapRef;
/*     */   
/*     */   public MapContentBinding(Map<K, V> paramMap) {
/* 222 */     this.mapRef = new WeakReference<>(paramMap);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChanged(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 227 */     Map<Object, Object> map = (Map)this.mapRef.get();
/* 228 */     if (map == null) {
/* 229 */       paramChange.getMap().removeListener(this);
/*     */     } else {
/* 231 */       if (paramChange.wasRemoved()) {
/* 232 */         map.remove(paramChange.getKey());
/*     */       }
/* 234 */       if (paramChange.wasAdded()) {
/* 235 */         map.put(paramChange.getKey(), paramChange.getValueAdded());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 242 */     return (this.mapRef.get() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 247 */     Map map = this.mapRef.get();
/* 248 */     return (map == null) ? 0 : map.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 253 */     if (this == paramObject) {
/* 254 */       return true;
/*     */     }
/*     */     
/* 257 */     Map map = this.mapRef.get();
/* 258 */     if (map == null) {
/* 259 */       return false;
/*     */     }
/*     */     
/* 262 */     if (paramObject instanceof MapContentBinding) {
/* 263 */       MapContentBinding mapContentBinding = (MapContentBinding)paramObject;
/* 264 */       Map map1 = mapContentBinding.mapRef.get();
/* 265 */       return (map == map1);
/*     */     } 
/* 267 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ContentBinding$MapContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */