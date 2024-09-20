/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ public class BidirectionalContentBinding
/*     */ {
/*     */   private static void checkParameters(Object paramObject1, Object paramObject2) {
/*  40 */     if (paramObject1 == null || paramObject2 == null) {
/*  41 */       throw new NullPointerException("Both parameters must be specified.");
/*     */     }
/*  43 */     if (paramObject1 == paramObject2) {
/*  44 */       throw new IllegalArgumentException("Cannot bind object to itself");
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E> Object bind(ObservableList<E> paramObservableList1, ObservableList<E> paramObservableList2) {
/*  49 */     checkParameters(paramObservableList1, paramObservableList2);
/*  50 */     ListContentBinding<E> listContentBinding = new ListContentBinding<>(paramObservableList1, paramObservableList2);
/*  51 */     paramObservableList1.setAll((Collection)paramObservableList2);
/*  52 */     paramObservableList1.addListener(listContentBinding);
/*  53 */     paramObservableList2.addListener(listContentBinding);
/*  54 */     return listContentBinding;
/*     */   }
/*     */   
/*     */   public static <E> Object bind(ObservableSet<E> paramObservableSet1, ObservableSet<E> paramObservableSet2) {
/*  58 */     checkParameters(paramObservableSet1, paramObservableSet2);
/*  59 */     SetContentBinding<E> setContentBinding = new SetContentBinding<>(paramObservableSet1, paramObservableSet2);
/*  60 */     paramObservableSet1.clear();
/*  61 */     paramObservableSet1.addAll((Collection)paramObservableSet2);
/*  62 */     paramObservableSet1.addListener(setContentBinding);
/*  63 */     paramObservableSet2.addListener(setContentBinding);
/*  64 */     return setContentBinding;
/*     */   }
/*     */   
/*     */   public static <K, V> Object bind(ObservableMap<K, V> paramObservableMap1, ObservableMap<K, V> paramObservableMap2) {
/*  68 */     checkParameters(paramObservableMap1, paramObservableMap2);
/*  69 */     MapContentBinding<K, V> mapContentBinding = new MapContentBinding<>(paramObservableMap1, paramObservableMap2);
/*  70 */     paramObservableMap1.clear();
/*  71 */     paramObservableMap1.putAll((Map)paramObservableMap2);
/*  72 */     paramObservableMap1.addListener(mapContentBinding);
/*  73 */     paramObservableMap2.addListener(mapContentBinding);
/*  74 */     return mapContentBinding;
/*     */   }
/*     */   
/*     */   public static void unbind(Object paramObject1, Object paramObject2) {
/*  78 */     checkParameters(paramObject1, paramObject2);
/*  79 */     if (paramObject1 instanceof ObservableList) { ObservableList<?> observableList = (ObservableList)paramObject1; if (paramObject2 instanceof ObservableList) { ObservableList<?> observableList1 = (ObservableList)paramObject2;
/*     */         
/*  81 */         ListContentBinding listContentBinding = new ListContentBinding(observableList, observableList1);
/*  82 */         observableList.removeListener(listContentBinding);
/*  83 */         observableList1.removeListener(listContentBinding); return; }  }
/*  84 */      if (paramObject1 instanceof ObservableSet) { ObservableSet<?> observableSet = (ObservableSet)paramObject1; if (paramObject2 instanceof ObservableSet) { ObservableSet<?> observableSet1 = (ObservableSet)paramObject2;
/*     */         
/*  86 */         SetContentBinding setContentBinding = new SetContentBinding(observableSet, observableSet1);
/*  87 */         observableSet.removeListener(setContentBinding);
/*  88 */         observableSet1.removeListener(setContentBinding); return; }  }
/*  89 */      if (paramObject1 instanceof ObservableMap) { ObservableMap<?, ?> observableMap = (ObservableMap)paramObject1; if (paramObject2 instanceof ObservableMap) { ObservableMap<?, ?> observableMap1 = (ObservableMap)paramObject2;
/*     */         
/*  91 */         MapContentBinding<Object, Object> mapContentBinding = new MapContentBinding<>(observableMap, observableMap1);
/*  92 */         observableMap.removeListener(mapContentBinding);
/*  93 */         observableMap1.removeListener(mapContentBinding); }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   private static class ListContentBinding<E>
/*     */     implements ListChangeListener<E>, WeakListener
/*     */   {
/*     */     private final WeakReference<ObservableList<E>> propertyRef1;
/*     */     private final WeakReference<ObservableList<E>> propertyRef2;
/*     */     private boolean updating = false;
/*     */     
/*     */     public ListContentBinding(ObservableList<E> param1ObservableList1, ObservableList<E> param1ObservableList2) {
/* 106 */       this.propertyRef1 = new WeakReference<>(param1ObservableList1);
/* 107 */       this.propertyRef2 = new WeakReference<>(param1ObservableList2);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onChanged(ListChangeListener.Change<? extends E> param1Change) {
/* 112 */       if (!this.updating) {
/* 113 */         ObservableList observableList1 = this.propertyRef1.get();
/* 114 */         ObservableList observableList2 = this.propertyRef2.get();
/* 115 */         if (observableList1 == null || observableList2 == null) {
/* 116 */           if (observableList1 != null) {
/* 117 */             observableList1.removeListener(this);
/*     */           }
/* 119 */           if (observableList2 != null) {
/* 120 */             observableList2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 124 */             this.updating = true;
/* 125 */             ObservableList observableList = (observableList1 == param1Change.getList()) ? observableList2 : observableList1;
/* 126 */             while (param1Change.next()) {
/* 127 */               if (param1Change.wasPermutated()) {
/* 128 */                 observableList.remove(param1Change.getFrom(), param1Change.getTo());
/* 129 */                 observableList.addAll(param1Change.getFrom(), param1Change.getList().subList(param1Change.getFrom(), param1Change.getTo())); continue;
/*     */               } 
/* 131 */               if (param1Change.wasRemoved()) {
/* 132 */                 observableList.remove(param1Change.getFrom(), param1Change.getFrom() + param1Change.getRemovedSize());
/*     */               }
/* 134 */               if (param1Change.wasAdded()) {
/* 135 */                 observableList.addAll(param1Change.getFrom(), param1Change.getAddedSubList());
/*     */               }
/*     */             } 
/*     */           } finally {
/*     */             
/* 140 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 148 */       return (this.propertyRef1.get() == null || this.propertyRef2.get() == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 153 */       ObservableList observableList1 = this.propertyRef1.get();
/* 154 */       ObservableList observableList2 = this.propertyRef2.get();
/* 155 */       byte b1 = (observableList1 == null) ? 0 : observableList1.hashCode();
/* 156 */       byte b2 = (observableList2 == null) ? 0 : observableList2.hashCode();
/* 157 */       return b1 * b2;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 162 */       if (this == param1Object) {
/* 163 */         return true;
/*     */       }
/*     */       
/* 166 */       Object object1 = this.propertyRef1.get();
/* 167 */       Object object2 = this.propertyRef2.get();
/* 168 */       if (object1 == null || object2 == null) {
/* 169 */         return false;
/*     */       }
/*     */       
/* 172 */       if (param1Object instanceof ListContentBinding) { ListContentBinding listContentBinding = (ListContentBinding)param1Object;
/* 173 */         Object object3 = listContentBinding.propertyRef1.get();
/* 174 */         Object object4 = listContentBinding.propertyRef2.get();
/* 175 */         if (object3 == null || object4 == null) {
/* 176 */           return false;
/*     */         }
/*     */         
/* 179 */         if (object1 == object3 && object2 == object4) {
/* 180 */           return true;
/*     */         }
/* 182 */         if (object1 == object4 && object2 == object3) {
/* 183 */           return true;
/*     */         } }
/*     */       
/* 186 */       return false;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class SetContentBinding<E>
/*     */     implements SetChangeListener<E>, WeakListener
/*     */   {
/*     */     private final WeakReference<ObservableSet<E>> propertyRef1;
/*     */     private final WeakReference<ObservableSet<E>> propertyRef2;
/*     */     private boolean updating = false;
/*     */     
/*     */     public SetContentBinding(ObservableSet<E> param1ObservableSet1, ObservableSet<E> param1ObservableSet2) {
/* 199 */       this.propertyRef1 = new WeakReference<>(param1ObservableSet1);
/* 200 */       this.propertyRef2 = new WeakReference<>(param1ObservableSet2);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onChanged(SetChangeListener.Change<? extends E> param1Change) {
/* 205 */       if (!this.updating) {
/* 206 */         ObservableSet observableSet1 = this.propertyRef1.get();
/* 207 */         ObservableSet observableSet2 = this.propertyRef2.get();
/* 208 */         if (observableSet1 == null || observableSet2 == null) {
/* 209 */           if (observableSet1 != null) {
/* 210 */             observableSet1.removeListener(this);
/*     */           }
/* 212 */           if (observableSet2 != null) {
/* 213 */             observableSet2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 217 */             this.updating = true;
/* 218 */             ObservableSet<Object> observableSet = (observableSet1 == param1Change.getSet()) ? observableSet2 : observableSet1;
/* 219 */             if (param1Change.wasRemoved()) {
/* 220 */               observableSet.remove(param1Change.getElementRemoved());
/*     */             } else {
/* 222 */               observableSet.add(param1Change.getElementAdded());
/*     */             } 
/*     */           } finally {
/* 225 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 233 */       return (this.propertyRef1.get() == null || this.propertyRef2.get() == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 238 */       ObservableSet observableSet1 = this.propertyRef1.get();
/* 239 */       ObservableSet observableSet2 = this.propertyRef2.get();
/* 240 */       byte b1 = (observableSet1 == null) ? 0 : observableSet1.hashCode();
/* 241 */       byte b2 = (observableSet2 == null) ? 0 : observableSet2.hashCode();
/* 242 */       return b1 * b2;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 247 */       if (this == param1Object) {
/* 248 */         return true;
/*     */       }
/*     */       
/* 251 */       Object object1 = this.propertyRef1.get();
/* 252 */       Object object2 = this.propertyRef2.get();
/* 253 */       if (object1 == null || object2 == null) {
/* 254 */         return false;
/*     */       }
/*     */       
/* 257 */       if (param1Object instanceof SetContentBinding) { SetContentBinding setContentBinding = (SetContentBinding)param1Object;
/* 258 */         Object object3 = setContentBinding.propertyRef1.get();
/* 259 */         Object object4 = setContentBinding.propertyRef2.get();
/* 260 */         if (object3 == null || object4 == null) {
/* 261 */           return false;
/*     */         }
/*     */         
/* 264 */         if (object1 == object3 && object2 == object4) {
/* 265 */           return true;
/*     */         }
/* 267 */         if (object1 == object4 && object2 == object3) {
/* 268 */           return true;
/*     */         } }
/*     */       
/* 271 */       return false;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class MapContentBinding<K, V>
/*     */     implements MapChangeListener<K, V>, WeakListener
/*     */   {
/*     */     private final WeakReference<ObservableMap<K, V>> propertyRef1;
/*     */     private final WeakReference<ObservableMap<K, V>> propertyRef2;
/*     */     private boolean updating = false;
/*     */     
/*     */     public MapContentBinding(ObservableMap<K, V> param1ObservableMap1, ObservableMap<K, V> param1ObservableMap2) {
/* 284 */       this.propertyRef1 = new WeakReference<>(param1ObservableMap1);
/* 285 */       this.propertyRef2 = new WeakReference<>(param1ObservableMap2);
/*     */     }
/*     */ 
/*     */     
/*     */     public void onChanged(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 290 */       if (!this.updating) {
/* 291 */         ObservableMap observableMap1 = this.propertyRef1.get();
/* 292 */         ObservableMap observableMap2 = this.propertyRef2.get();
/* 293 */         if (observableMap1 == null || observableMap2 == null) {
/* 294 */           if (observableMap1 != null) {
/* 295 */             observableMap1.removeListener(this);
/*     */           }
/* 297 */           if (observableMap2 != null) {
/* 298 */             observableMap2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 302 */             this.updating = true;
/* 303 */             ObservableMap<Object, Object> observableMap = (observableMap1 == param1Change.getMap()) ? observableMap2 : observableMap1;
/* 304 */             if (param1Change.wasRemoved()) {
/* 305 */               observableMap.remove(param1Change.getKey());
/*     */             }
/* 307 */             if (param1Change.wasAdded()) {
/* 308 */               observableMap.put(param1Change.getKey(), param1Change.getValueAdded());
/*     */             }
/*     */           } finally {
/* 311 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 319 */       return (this.propertyRef1.get() == null || this.propertyRef2.get() == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 324 */       ObservableMap observableMap1 = this.propertyRef1.get();
/* 325 */       ObservableMap observableMap2 = this.propertyRef2.get();
/* 326 */       byte b1 = (observableMap1 == null) ? 0 : observableMap1.hashCode();
/* 327 */       byte b2 = (observableMap2 == null) ? 0 : observableMap2.hashCode();
/* 328 */       return b1 * b2;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 333 */       if (this == param1Object) {
/* 334 */         return true;
/*     */       }
/*     */       
/* 337 */       Object object1 = this.propertyRef1.get();
/* 338 */       Object object2 = this.propertyRef2.get();
/* 339 */       if (object1 == null || object2 == null) {
/* 340 */         return false;
/*     */       }
/*     */       
/* 343 */       if (param1Object instanceof MapContentBinding) { MapContentBinding mapContentBinding = (MapContentBinding)param1Object;
/* 344 */         Object object3 = mapContentBinding.propertyRef1.get();
/* 345 */         Object object4 = mapContentBinding.propertyRef2.get();
/* 346 */         if (object3 == null || object4 == null) {
/* 347 */           return false;
/*     */         }
/*     */         
/* 350 */         if (object1 == object3 && object2 == object4) {
/* 351 */           return true;
/*     */         }
/* 353 */         if (object1 == object4 && object2 == object3) {
/* 354 */           return true;
/*     */         } }
/*     */       
/* 357 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */