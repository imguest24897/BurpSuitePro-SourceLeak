/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.MapChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.collections.ObservableMap;
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
/*     */ public class ContentBinding
/*     */ {
/*     */   private static void checkParameters(Object paramObject1, Object paramObject2) {
/*  41 */     if (paramObject1 == null || paramObject2 == null) {
/*  42 */       throw new NullPointerException("Both parameters must be specified.");
/*     */     }
/*  44 */     if (paramObject1 == paramObject2) {
/*  45 */       throw new IllegalArgumentException("Cannot bind object to itself");
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E> Object bind(List<E> paramList, ObservableList<? extends E> paramObservableList) {
/*  50 */     checkParameters(paramList, paramObservableList);
/*  51 */     ListContentBinding<E> listContentBinding = new ListContentBinding<>(paramList);
/*  52 */     if (paramList instanceof ObservableList) { ObservableList observableList = (ObservableList)paramList;
/*  53 */       observableList.setAll((Collection)paramObservableList); }
/*     */     else
/*  55 */     { paramList.clear();
/*  56 */       paramList.addAll((Collection<? extends E>)paramObservableList); }
/*     */     
/*  58 */     paramObservableList.removeListener(listContentBinding);
/*  59 */     paramObservableList.addListener(listContentBinding);
/*  60 */     return listContentBinding;
/*     */   }
/*     */   
/*     */   public static <E> Object bind(Set<E> paramSet, ObservableSet<? extends E> paramObservableSet) {
/*  64 */     checkParameters(paramSet, paramObservableSet);
/*  65 */     SetContentBinding<E> setContentBinding = new SetContentBinding<>(paramSet);
/*  66 */     paramSet.clear();
/*  67 */     paramSet.addAll((Collection<? extends E>)paramObservableSet);
/*  68 */     paramObservableSet.removeListener(setContentBinding);
/*  69 */     paramObservableSet.addListener(setContentBinding);
/*  70 */     return setContentBinding;
/*     */   }
/*     */   
/*     */   public static <K, V> Object bind(Map<K, V> paramMap, ObservableMap<? extends K, ? extends V> paramObservableMap) {
/*  74 */     checkParameters(paramMap, paramObservableMap);
/*  75 */     MapContentBinding<K, V> mapContentBinding = new MapContentBinding<>(paramMap);
/*  76 */     paramMap.clear();
/*  77 */     paramMap.putAll((Map<? extends K, ? extends V>)paramObservableMap);
/*  78 */     paramObservableMap.removeListener(mapContentBinding);
/*  79 */     paramObservableMap.addListener(mapContentBinding);
/*  80 */     return mapContentBinding;
/*     */   }
/*     */   
/*     */   public static void unbind(Object paramObject1, Object paramObject2) {
/*  84 */     checkParameters(paramObject1, paramObject2);
/*  85 */     if (paramObject1 instanceof List) { List<?> list = (List)paramObject1; if (paramObject2 instanceof ObservableList) { ObservableList observableList = (ObservableList)paramObject2;
/*     */         
/*  87 */         ListContentBinding listContentBinding = new ListContentBinding(list);
/*     */         
/*  89 */         observableList.removeListener(listContentBinding); return; }  }
/*  90 */      if (paramObject1 instanceof Set) { Set<?> set = (Set)paramObject1; if (paramObject2 instanceof ObservableSet) { ObservableSet observableSet = (ObservableSet)paramObject2;
/*     */         
/*  92 */         SetContentBinding setContentBinding = new SetContentBinding(set);
/*     */         
/*  94 */         observableSet.removeListener(setContentBinding); return; }  }
/*  95 */      if (paramObject1 instanceof Map) { Map<?, ?> map = (Map)paramObject1; if (paramObject2 instanceof ObservableMap) { ObservableMap observableMap = (ObservableMap)paramObject2;
/*     */         
/*  97 */         MapContentBinding<Object, Object> mapContentBinding = new MapContentBinding<>(map);
/*     */         
/*  99 */         observableMap.removeListener(mapContentBinding); }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   private static class ListContentBinding<E> implements ListChangeListener<E>, WeakListener {
/*     */     private final WeakReference<List<E>> listRef;
/*     */     
/*     */     public ListContentBinding(List<E> param1List) {
/* 108 */       this.listRef = new WeakReference<>(param1List);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onChanged(ListChangeListener.Change<? extends E> param1Change) {
/* 113 */       List list = this.listRef.get();
/* 114 */       if (list == null) {
/* 115 */         param1Change.getList().removeListener(this);
/*     */       } else {
/* 117 */         while (param1Change.next()) {
/* 118 */           if (param1Change.wasPermutated()) {
/* 119 */             list.subList(param1Change.getFrom(), param1Change.getTo()).clear();
/* 120 */             list.addAll(param1Change.getFrom(), param1Change.getList().subList(param1Change.getFrom(), param1Change.getTo())); continue;
/*     */           } 
/* 122 */           if (param1Change.wasRemoved()) {
/* 123 */             list.subList(param1Change.getFrom(), param1Change.getFrom() + param1Change.getRemovedSize()).clear();
/*     */           }
/* 125 */           if (param1Change.wasAdded()) {
/* 126 */             list.addAll(param1Change.getFrom(), param1Change.getAddedSubList());
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 135 */       return (this.listRef.get() == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 140 */       List list = this.listRef.get();
/* 141 */       return (list == null) ? 0 : list.hashCode();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 146 */       if (this == param1Object) {
/* 147 */         return true;
/*     */       }
/*     */       
/* 150 */       List list = this.listRef.get();
/* 151 */       if (list == null) {
/* 152 */         return false;
/*     */       }
/*     */       
/* 155 */       if (param1Object instanceof ListContentBinding) {
/* 156 */         ListContentBinding listContentBinding = (ListContentBinding)param1Object;
/* 157 */         List list1 = listContentBinding.listRef.get();
/* 158 */         return (list == list1);
/*     */       } 
/* 160 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SetContentBinding<E>
/*     */     implements SetChangeListener<E>, WeakListener {
/*     */     private final WeakReference<Set<E>> setRef;
/*     */     
/*     */     public SetContentBinding(Set<E> param1Set) {
/* 169 */       this.setRef = new WeakReference<>(param1Set);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onChanged(SetChangeListener.Change<? extends E> param1Change) {
/* 174 */       Set<Object> set = (Set)this.setRef.get();
/* 175 */       if (set == null) {
/* 176 */         param1Change.getSet().removeListener(this);
/*     */       }
/* 178 */       else if (param1Change.wasRemoved()) {
/* 179 */         set.remove(param1Change.getElementRemoved());
/*     */       } else {
/* 181 */         set.add(param1Change.getElementAdded());
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 188 */       return (this.setRef.get() == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 193 */       Set set = this.setRef.get();
/* 194 */       return (set == null) ? 0 : set.hashCode();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 199 */       if (this == param1Object) {
/* 200 */         return true;
/*     */       }
/*     */       
/* 203 */       Set set = this.setRef.get();
/* 204 */       if (set == null) {
/* 205 */         return false;
/*     */       }
/*     */       
/* 208 */       if (param1Object instanceof SetContentBinding) {
/* 209 */         SetContentBinding setContentBinding = (SetContentBinding)param1Object;
/* 210 */         Set set1 = setContentBinding.setRef.get();
/* 211 */         return (set == set1);
/*     */       } 
/* 213 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class MapContentBinding<K, V>
/*     */     implements MapChangeListener<K, V>, WeakListener {
/*     */     private final WeakReference<Map<K, V>> mapRef;
/*     */     
/*     */     public MapContentBinding(Map<K, V> param1Map) {
/* 222 */       this.mapRef = new WeakReference<>(param1Map);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onChanged(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 227 */       Map<Object, Object> map = (Map)this.mapRef.get();
/* 228 */       if (map == null) {
/* 229 */         param1Change.getMap().removeListener(this);
/*     */       } else {
/* 231 */         if (param1Change.wasRemoved()) {
/* 232 */           map.remove(param1Change.getKey());
/*     */         }
/* 234 */         if (param1Change.wasAdded()) {
/* 235 */           map.put(param1Change.getKey(), param1Change.getValueAdded());
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 242 */       return (this.mapRef.get() == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 247 */       Map map = this.mapRef.get();
/* 248 */       return (map == null) ? 0 : map.hashCode();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 253 */       if (this == param1Object) {
/* 254 */         return true;
/*     */       }
/*     */       
/* 257 */       Map map = this.mapRef.get();
/* 258 */       if (map == null) {
/* 259 */         return false;
/*     */       }
/*     */       
/* 262 */       if (param1Object instanceof MapContentBinding) {
/* 263 */         MapContentBinding mapContentBinding = (MapContentBinding)param1Object;
/* 264 */         Map map1 = mapContentBinding.mapRef.get();
/* 265 */         return (map == map1);
/*     */       } 
/* 267 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */