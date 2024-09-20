/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableMapValue;
/*     */ import javafx.beans.value.ObservableValue;
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
/*     */ public abstract class MapExpressionHelper<K, V>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   protected final ObservableMapValue<K, V> observable;
/*     */   
/*     */   public static <K, V> MapExpressionHelper<K, V> addListener(MapExpressionHelper<K, V> paramMapExpressionHelper, ObservableMapValue<K, V> paramObservableMapValue, InvalidationListener paramInvalidationListener) {
/*  45 */     if (paramObservableMapValue == null || paramInvalidationListener == null) {
/*  46 */       throw new NullPointerException();
/*     */     }
/*  48 */     paramObservableMapValue.getValue();
/*  49 */     return (paramMapExpressionHelper == null) ? new SingleInvalidation<>(paramObservableMapValue, paramInvalidationListener) : paramMapExpressionHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapExpressionHelper<K, V> removeListener(MapExpressionHelper<K, V> paramMapExpressionHelper, InvalidationListener paramInvalidationListener) {
/*  53 */     if (paramInvalidationListener == null) {
/*  54 */       throw new NullPointerException();
/*     */     }
/*  56 */     return (paramMapExpressionHelper == null) ? null : paramMapExpressionHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapExpressionHelper<K, V> addListener(MapExpressionHelper<K, V> paramMapExpressionHelper, ObservableMapValue<K, V> paramObservableMapValue, ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/*  60 */     if (paramObservableMapValue == null || paramChangeListener == null) {
/*  61 */       throw new NullPointerException();
/*     */     }
/*  63 */     return (paramMapExpressionHelper == null) ? new SingleChange<>(paramObservableMapValue, paramChangeListener) : paramMapExpressionHelper.addListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapExpressionHelper<K, V> removeListener(MapExpressionHelper<K, V> paramMapExpressionHelper, ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/*  67 */     if (paramChangeListener == null) {
/*  68 */       throw new NullPointerException();
/*     */     }
/*  70 */     return (paramMapExpressionHelper == null) ? null : paramMapExpressionHelper.removeListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapExpressionHelper<K, V> addListener(MapExpressionHelper<K, V> paramMapExpressionHelper, ObservableMapValue<K, V> paramObservableMapValue, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  74 */     if (paramObservableMapValue == null || paramMapChangeListener == null) {
/*  75 */       throw new NullPointerException();
/*     */     }
/*  77 */     return (paramMapExpressionHelper == null) ? new SingleMapChange<>(paramObservableMapValue, paramMapChangeListener) : paramMapExpressionHelper.addListener(paramMapChangeListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapExpressionHelper<K, V> removeListener(MapExpressionHelper<K, V> paramMapExpressionHelper, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  81 */     if (paramMapChangeListener == null) {
/*  82 */       throw new NullPointerException();
/*     */     }
/*  84 */     return (paramMapExpressionHelper == null) ? null : paramMapExpressionHelper.removeListener(paramMapChangeListener);
/*     */   }
/*     */   
/*     */   public static <K, V> void fireValueChangedEvent(MapExpressionHelper<K, V> paramMapExpressionHelper) {
/*  88 */     if (paramMapExpressionHelper != null) {
/*  89 */       paramMapExpressionHelper.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */   
/*     */   public static <K, V> void fireValueChangedEvent(MapExpressionHelper<K, V> paramMapExpressionHelper, MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/*  94 */     if (paramMapExpressionHelper != null) {
/*  95 */       paramMapExpressionHelper.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper(ObservableMapValue<K, V> paramObservableMapValue) {
/* 105 */     this.observable = paramObservableMapValue;
/*     */   }
/*     */   
/*     */   protected abstract MapExpressionHelper<K, V> addListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract MapExpressionHelper<K, V> removeListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener);
/*     */   
/*     */   protected abstract MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener);
/*     */   
/*     */   protected abstract MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener);
/*     */   
/*     */   protected abstract MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent();
/*     */   
/*     */   protected abstract void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange);
/*     */   
/*     */   private static class SingleInvalidation<K, V> extends MapExpressionHelper<K, V> {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(ObservableMapValue<K, V> param1ObservableMapValue, InvalidationListener param1InvalidationListener) {
/* 128 */       super(param1ObservableMapValue);
/* 129 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 134 */       return new MapExpressionHelper.Generic<>(this.observable, this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 139 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 144 */       return new MapExpressionHelper.Generic<>(this.observable, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 149 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 154 */       return new MapExpressionHelper.Generic<>(this.observable, this.listener, param1MapChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 159 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 164 */       this.listener.invalidated((Observable)this.observable);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 169 */       this.listener.invalidated((Observable)this.observable);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<K, V>
/*     */     extends MapExpressionHelper<K, V> {
/*     */     private final ChangeListener<? super ObservableMap<K, V>> listener;
/*     */     private ObservableMap<K, V> currentValue;
/*     */     
/*     */     private SingleChange(ObservableMapValue<K, V> param1ObservableMapValue, ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 179 */       super(param1ObservableMapValue);
/* 180 */       this.listener = param1ChangeListener;
/* 181 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 186 */       return new MapExpressionHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 191 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 196 */       return new MapExpressionHelper.Generic<>(this.observable, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 201 */       return param1ChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 206 */       return new MapExpressionHelper.Generic<>(this.observable, this.listener, param1MapChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 211 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 216 */       ObservableMap<K, V> observableMap = this.currentValue;
/* 217 */       this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/* 218 */       if (this.currentValue != observableMap) {
/* 219 */         this.listener.changed((ObservableValue)this.observable, observableMap, this.currentValue);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 225 */       this.listener.changed((ObservableValue)this.observable, this.currentValue, this.currentValue);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleMapChange<K, V>
/*     */     extends MapExpressionHelper<K, V> {
/*     */     private final MapChangeListener<? super K, ? super V> listener;
/*     */     private ObservableMap<K, V> currentValue;
/*     */     
/*     */     private SingleMapChange(ObservableMapValue<K, V> param1ObservableMapValue, MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 235 */       super(param1ObservableMapValue);
/* 236 */       this.listener = param1MapChangeListener;
/* 237 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 242 */       return new MapExpressionHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 247 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 252 */       return new MapExpressionHelper.Generic<>(this.observable, param1ChangeListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 257 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 262 */       return new MapExpressionHelper.Generic<>(this.observable, this.listener, param1MapChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 267 */       return param1MapChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 272 */       ObservableMap<K, V> observableMap = this.currentValue;
/* 273 */       this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/* 274 */       if (this.currentValue != observableMap) {
/* 275 */         MapExpressionHelper.SimpleChange<K, V> simpleChange = new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable);
/* 276 */         if (this.currentValue == null) {
/* 277 */           for (Map.Entry entry : observableMap.entrySet()) {
/* 278 */             this.listener.onChanged(simpleChange.setRemoved((K)entry.getKey(), (V)entry.getValue()));
/*     */           }
/* 280 */         } else if (observableMap == null) {
/* 281 */           for (Map.Entry entry : this.currentValue.entrySet()) {
/* 282 */             this.listener.onChanged(simpleChange.setAdded((K)entry.getKey(), (V)entry.getValue()));
/*     */           }
/*     */         } else {
/* 285 */           for (Map.Entry entry : observableMap.entrySet()) {
/* 286 */             Object object1 = entry.getKey();
/* 287 */             Object object2 = entry.getValue();
/* 288 */             if (this.currentValue.containsKey(object1)) {
/* 289 */               Object object = this.currentValue.get(object1);
/* 290 */               if ((object2 == null) ? (object != null) : !object.equals(object2))
/* 291 */                 this.listener.onChanged(simpleChange.setPut((K)object1, (V)object2, (V)object)); 
/*     */               continue;
/*     */             } 
/* 294 */             this.listener.onChanged(simpleChange.setRemoved((K)object1, (V)object2));
/*     */           } 
/*     */           
/* 297 */           for (Map.Entry entry : this.currentValue.entrySet()) {
/* 298 */             Object object = entry.getKey();
/* 299 */             if (!observableMap.containsKey(object)) {
/* 300 */               this.listener.onChanged(simpleChange.setAdded((K)object, (V)entry.getValue()));
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 309 */       this.listener.onChanged(new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable, param1Change));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<K, V>
/*     */     extends MapExpressionHelper<K, V> {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private ChangeListener<? super ObservableMap<K, V>>[] changeListeners;
/*     */     private MapChangeListener<? super K, ? super V>[] mapChangeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private int mapChangeSize;
/*     */     private boolean locked;
/*     */     private ObservableMap<K, V> currentValue;
/*     */     
/*     */     private Generic(ObservableMapValue<K, V> param1ObservableMapValue, InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 325 */       super(param1ObservableMapValue);
/* 326 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 327 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(ObservableMapValue<K, V> param1ObservableMapValue, ChangeListener<? super ObservableMap<K, V>> param1ChangeListener1, ChangeListener<? super ObservableMap<K, V>> param1ChangeListener2) {
/* 331 */       super(param1ObservableMapValue);
/* 332 */       this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { param1ChangeListener1, param1ChangeListener2 };
/* 333 */       this.changeSize = 2;
/* 334 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableMapValue<K, V> param1ObservableMapValue, MapChangeListener<? super K, ? super V> param1MapChangeListener1, MapChangeListener<? super K, ? super V> param1MapChangeListener2) {
/* 338 */       super(param1ObservableMapValue);
/* 339 */       this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener1, param1MapChangeListener2 };
/* 340 */       this.mapChangeSize = 2;
/* 341 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableMapValue<K, V> param1ObservableMapValue, InvalidationListener param1InvalidationListener, ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 345 */       super(param1ObservableMapValue);
/* 346 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 347 */       this.invalidationSize = 1;
/* 348 */       this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { param1ChangeListener };
/* 349 */       this.changeSize = 1;
/* 350 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableMapValue<K, V> param1ObservableMapValue, InvalidationListener param1InvalidationListener, MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 354 */       super(param1ObservableMapValue);
/* 355 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 356 */       this.invalidationSize = 1;
/* 357 */       this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener };
/* 358 */       this.mapChangeSize = 1;
/* 359 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableMapValue<K, V> param1ObservableMapValue, ChangeListener<? super ObservableMap<K, V>> param1ChangeListener, MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 363 */       super(param1ObservableMapValue);
/* 364 */       this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { param1ChangeListener };
/* 365 */       this.changeSize = 1;
/* 366 */       this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener };
/* 367 */       this.mapChangeSize = 1;
/* 368 */       this.currentValue = (ObservableMap<K, V>)param1ObservableMapValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 373 */       if (this.invalidationListeners == null) {
/* 374 */         this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 375 */         this.invalidationSize = 1;
/*     */       } else {
/* 377 */         int i = this.invalidationListeners.length;
/* 378 */         if (this.locked) {
/* 379 */           int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 380 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 381 */         } else if (this.invalidationSize == i) {
/* 382 */           this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 383 */           if (this.invalidationSize == i) {
/* 384 */             int j = i * 3 / 2 + 1;
/* 385 */             this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */           } 
/*     */         } 
/* 388 */         this.invalidationListeners[this.invalidationSize++] = param1InvalidationListener;
/*     */       } 
/* 390 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 395 */       if (this.invalidationListeners != null) {
/* 396 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 397 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 398 */             if (this.invalidationSize == 1) {
/* 399 */               if (this.changeSize == 1 && this.mapChangeSize == 0)
/* 400 */                 return new MapExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]); 
/* 401 */               if (this.changeSize == 0 && this.mapChangeSize == 1) {
/* 402 */                 return new MapExpressionHelper.SingleMapChange<>(this.observable, this.mapChangeListeners[0]);
/*     */               }
/* 404 */               this.invalidationListeners = null;
/* 405 */               this.invalidationSize = 0; break;
/* 406 */             }  if (this.invalidationSize == 2 && this.changeSize == 0 && this.mapChangeSize == 0) {
/* 407 */               return new MapExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */             }
/* 409 */             int i = this.invalidationSize - b - 1;
/* 410 */             InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 411 */             if (this.locked) {
/* 412 */               this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 413 */               System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */             } 
/* 415 */             if (i > 0) {
/* 416 */               System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */             }
/* 418 */             this.invalidationSize--;
/* 419 */             if (!this.locked) {
/* 420 */               this.invalidationListeners[this.invalidationSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 427 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 432 */       if (this.changeListeners == null) {
/* 433 */         this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { param1ChangeListener };
/* 434 */         this.changeSize = 1;
/*     */       } else {
/* 436 */         int i = this.changeListeners.length;
/* 437 */         if (this.locked) {
/* 438 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 439 */           this.changeListeners = Arrays.<ChangeListener<? super ObservableMap<K, V>>>copyOf(this.changeListeners, j);
/* 440 */         } else if (this.changeSize == i) {
/* 441 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 442 */           if (this.changeSize == i) {
/* 443 */             int j = i * 3 / 2 + 1;
/* 444 */             this.changeListeners = Arrays.<ChangeListener<? super ObservableMap<K, V>>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 447 */         this.changeListeners[this.changeSize++] = param1ChangeListener;
/*     */       } 
/* 449 */       if (this.changeSize == 1) {
/* 450 */         this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/*     */       }
/* 452 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> param1ChangeListener) {
/* 457 */       if (this.changeListeners != null) {
/* 458 */         for (byte b = 0; b < this.changeSize; b++) {
/* 459 */           if (param1ChangeListener.equals(this.changeListeners[b])) {
/* 460 */             if (this.changeSize == 1) {
/* 461 */               if (this.invalidationSize == 1 && this.mapChangeSize == 0)
/* 462 */                 return new MapExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 463 */               if (this.invalidationSize == 0 && this.mapChangeSize == 1) {
/* 464 */                 return new MapExpressionHelper.SingleMapChange<>(this.observable, this.mapChangeListeners[0]);
/*     */               }
/* 466 */               this.changeListeners = null;
/* 467 */               this.changeSize = 0; break;
/* 468 */             }  if (this.changeSize == 2 && this.invalidationSize == 0 && this.mapChangeSize == 0) {
/* 469 */               return new MapExpressionHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */             }
/* 471 */             int i = this.changeSize - b - 1;
/* 472 */             ChangeListener<? super ObservableMap<K, V>>[] arrayOfChangeListener = this.changeListeners;
/* 473 */             if (this.locked) {
/* 474 */               this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[this.changeListeners.length];
/* 475 */               System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */             } 
/* 477 */             if (i > 0) {
/* 478 */               System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */             }
/* 480 */             this.changeSize--;
/* 481 */             if (!this.locked) {
/* 482 */               this.changeListeners[this.changeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 489 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 494 */       if (this.mapChangeListeners == null) {
/* 495 */         this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener };
/* 496 */         this.mapChangeSize = 1;
/*     */       } else {
/* 498 */         int i = this.mapChangeListeners.length;
/* 499 */         if (this.locked) {
/* 500 */           int j = (this.mapChangeSize < i) ? i : (i * 3 / 2 + 1);
/* 501 */           this.mapChangeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.mapChangeListeners, j);
/* 502 */         } else if (this.mapChangeSize == i) {
/* 503 */           this.mapChangeSize = trim(this.mapChangeSize, (Object[])this.mapChangeListeners);
/* 504 */           if (this.mapChangeSize == i) {
/* 505 */             int j = i * 3 / 2 + 1;
/* 506 */             this.mapChangeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.mapChangeListeners, j);
/*     */           } 
/*     */         } 
/* 509 */         this.mapChangeListeners[this.mapChangeSize++] = param1MapChangeListener;
/*     */       } 
/* 511 */       if (this.mapChangeSize == 1) {
/* 512 */         this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/*     */       }
/* 514 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 519 */       if (this.mapChangeListeners != null) {
/* 520 */         for (byte b = 0; b < this.mapChangeSize; b++) {
/* 521 */           if (param1MapChangeListener.equals(this.mapChangeListeners[b])) {
/* 522 */             if (this.mapChangeSize == 1) {
/* 523 */               if (this.invalidationSize == 1 && this.changeSize == 0)
/* 524 */                 return new MapExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 525 */               if (this.invalidationSize == 0 && this.changeSize == 1) {
/* 526 */                 return new MapExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */               }
/* 528 */               this.mapChangeListeners = null;
/* 529 */               this.mapChangeSize = 0; break;
/* 530 */             }  if (this.mapChangeSize == 2 && this.invalidationSize == 0 && this.changeSize == 0) {
/* 531 */               return new MapExpressionHelper.SingleMapChange<>(this.observable, this.mapChangeListeners[1 - b]);
/*     */             }
/* 533 */             int i = this.mapChangeSize - b - 1;
/* 534 */             MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.mapChangeListeners;
/* 535 */             if (this.locked) {
/* 536 */               this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[this.mapChangeListeners.length];
/* 537 */               System.arraycopy(arrayOfMapChangeListener, 0, this.mapChangeListeners, 0, b + 1);
/*     */             } 
/* 539 */             if (i > 0) {
/* 540 */               System.arraycopy(arrayOfMapChangeListener, b + 1, this.mapChangeListeners, b, i);
/*     */             }
/* 542 */             this.mapChangeSize--;
/* 543 */             if (!this.locked) {
/* 544 */               this.mapChangeListeners[this.mapChangeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 551 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 556 */       if (this.changeSize == 0 && this.mapChangeSize == 0) {
/* 557 */         notifyListeners(this.currentValue, (MapExpressionHelper.SimpleChange<K, V>)null);
/*     */       } else {
/* 559 */         ObservableMap<K, V> observableMap = this.currentValue;
/* 560 */         this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/* 561 */         notifyListeners(observableMap, (MapExpressionHelper.SimpleChange<K, V>)null);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 567 */       MapExpressionHelper.SimpleChange<K, V> simpleChange = (this.mapChangeSize == 0) ? null : new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable, param1Change);
/* 568 */       notifyListeners(this.currentValue, simpleChange);
/*     */     }
/*     */     
/*     */     private void notifyListeners(ObservableMap<K, V> param1ObservableMap, MapExpressionHelper.SimpleChange<K, V> param1SimpleChange) {
/* 572 */       InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 573 */       int i = this.invalidationSize;
/* 574 */       ChangeListener<? super ObservableMap<K, V>>[] arrayOfChangeListener = this.changeListeners;
/* 575 */       int j = this.changeSize;
/* 576 */       MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.mapChangeListeners;
/* 577 */       int k = this.mapChangeSize;
/*     */       try {
/* 579 */         this.locked = true; byte b;
/* 580 */         for (b = 0; b < i; b++) {
/* 581 */           arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/*     */         }
/* 583 */         if (this.currentValue != param1ObservableMap || param1SimpleChange != null) {
/* 584 */           for (b = 0; b < j; b++) {
/* 585 */             arrayOfChangeListener[b].changed((ObservableValue)this.observable, param1ObservableMap, this.currentValue);
/*     */           }
/* 587 */           if (k > 0) {
/* 588 */             if (param1SimpleChange != null) {
/* 589 */               for (b = 0; b < k; b++) {
/* 590 */                 arrayOfMapChangeListener[b].onChanged(param1SimpleChange);
/*     */               }
/*     */             } else {
/* 593 */               param1SimpleChange = new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable);
/* 594 */               if (this.currentValue == null) {
/* 595 */                 for (Map.Entry entry : param1ObservableMap.entrySet()) {
/* 596 */                   param1SimpleChange.setRemoved((K)entry.getKey(), (V)entry.getValue());
/* 597 */                   for (byte b1 = 0; b1 < k; b1++) {
/* 598 */                     arrayOfMapChangeListener[b1].onChanged(param1SimpleChange);
/*     */                   }
/*     */                 } 
/* 601 */               } else if (param1ObservableMap == null) {
/* 602 */                 for (Map.Entry entry : this.currentValue.entrySet()) {
/* 603 */                   param1SimpleChange.setAdded((K)entry.getKey(), (V)entry.getValue());
/* 604 */                   for (byte b1 = 0; b1 < k; b1++) {
/* 605 */                     arrayOfMapChangeListener[b1].onChanged(param1SimpleChange);
/*     */                   }
/*     */                 } 
/*     */               } else {
/* 609 */                 for (Map.Entry entry : param1ObservableMap.entrySet()) {
/* 610 */                   Object object1 = entry.getKey();
/* 611 */                   Object object2 = entry.getValue();
/* 612 */                   if (this.currentValue.containsKey(object1)) {
/* 613 */                     Object object = this.currentValue.get(object1);
/* 614 */                     if ((object2 == null) ? (object != null) : !object.equals(object2)) {
/* 615 */                       param1SimpleChange.setPut((K)object1, (V)object2, (V)object);
/* 616 */                       for (byte b2 = 0; b2 < k; b2++)
/* 617 */                         arrayOfMapChangeListener[b2].onChanged(param1SimpleChange); 
/*     */                     } 
/*     */                     continue;
/*     */                   } 
/* 621 */                   param1SimpleChange.setRemoved((K)object1, (V)object2);
/* 622 */                   for (byte b1 = 0; b1 < k; b1++) {
/* 623 */                     arrayOfMapChangeListener[b1].onChanged(param1SimpleChange);
/*     */                   }
/*     */                 } 
/*     */                 
/* 627 */                 for (Map.Entry entry : this.currentValue.entrySet()) {
/* 628 */                   Object object = entry.getKey();
/* 629 */                   if (!param1ObservableMap.containsKey(object)) {
/* 630 */                     param1SimpleChange.setAdded((K)object, (V)entry.getValue());
/* 631 */                     for (byte b1 = 0; b1 < k; b1++) {
/* 632 */                       arrayOfMapChangeListener[b1].onChanged(param1SimpleChange);
/*     */                     }
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } finally {
/* 641 */         this.locked = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static class SimpleChange<K, V>
/*     */     extends MapChangeListener.Change<K, V>
/*     */   {
/*     */     private K key;
/*     */     private V old;
/*     */     private V added;
/*     */     private boolean removeOp;
/*     */     private boolean addOp;
/*     */     
/*     */     public SimpleChange(ObservableMap<K, V> param1ObservableMap) {
/* 656 */       super(param1ObservableMap);
/*     */     }
/*     */     
/*     */     public SimpleChange(ObservableMap<K, V> param1ObservableMap, MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 660 */       super(param1ObservableMap);
/* 661 */       this.key = (K)param1Change.getKey();
/* 662 */       this.old = (V)param1Change.getValueRemoved();
/* 663 */       this.added = (V)param1Change.getValueAdded();
/* 664 */       this.addOp = param1Change.wasAdded();
/* 665 */       this.removeOp = param1Change.wasRemoved();
/*     */     }
/*     */     
/*     */     public SimpleChange<K, V> setRemoved(K param1K, V param1V) {
/* 669 */       this.key = param1K;
/* 670 */       this.old = param1V;
/* 671 */       this.added = null;
/* 672 */       this.addOp = false;
/* 673 */       this.removeOp = true;
/* 674 */       return this;
/*     */     }
/*     */     
/*     */     public SimpleChange<K, V> setAdded(K param1K, V param1V) {
/* 678 */       this.key = param1K;
/* 679 */       this.old = null;
/* 680 */       this.added = param1V;
/* 681 */       this.addOp = true;
/* 682 */       this.removeOp = false;
/* 683 */       return this;
/*     */     }
/*     */     
/*     */     public SimpleChange<K, V> setPut(K param1K, V param1V1, V param1V2) {
/* 687 */       this.key = param1K;
/* 688 */       this.old = param1V1;
/* 689 */       this.added = param1V2;
/* 690 */       this.addOp = true;
/* 691 */       this.removeOp = true;
/* 692 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasAdded() {
/* 697 */       return this.addOp;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/* 702 */       return this.removeOp;
/*     */     }
/*     */ 
/*     */     
/*     */     public K getKey() {
/* 707 */       return this.key;
/*     */     }
/*     */ 
/*     */     
/*     */     public V getValueAdded() {
/* 712 */       return this.added;
/*     */     }
/*     */ 
/*     */     
/*     */     public V getValueRemoved() {
/* 717 */       return this.old;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 722 */       StringBuilder stringBuilder = new StringBuilder();
/* 723 */       if (this.addOp) {
/* 724 */         if (this.removeOp) {
/* 725 */           stringBuilder.append("replaced ").append(this.old).append(" by ").append(this.added);
/*     */         } else {
/* 727 */           stringBuilder.append("added ").append(this.added);
/*     */         } 
/*     */       } else {
/* 730 */         stringBuilder.append("removed ").append(this.old);
/*     */       } 
/* 732 */       stringBuilder.append(" at key ").append(this.key);
/* 733 */       return stringBuilder.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\MapExpressionHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */