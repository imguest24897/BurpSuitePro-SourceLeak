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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Generic<K, V>
/*     */   extends MapExpressionHelper<K, V>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private ChangeListener<? super ObservableMap<K, V>>[] changeListeners;
/*     */   private MapChangeListener<? super K, ? super V>[] mapChangeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private int mapChangeSize;
/*     */   private boolean locked;
/*     */   private ObservableMap<K, V> currentValue;
/*     */   
/*     */   private Generic(ObservableMapValue<K, V> paramObservableMapValue, InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 325 */     super(paramObservableMapValue);
/* 326 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 327 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(ObservableMapValue<K, V> paramObservableMapValue, ChangeListener<? super ObservableMap<K, V>> paramChangeListener1, ChangeListener<? super ObservableMap<K, V>> paramChangeListener2) {
/* 331 */     super(paramObservableMapValue);
/* 332 */     this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { paramChangeListener1, paramChangeListener2 };
/* 333 */     this.changeSize = 2;
/* 334 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableMapValue<K, V> paramObservableMapValue, MapChangeListener<? super K, ? super V> paramMapChangeListener1, MapChangeListener<? super K, ? super V> paramMapChangeListener2) {
/* 338 */     super(paramObservableMapValue);
/* 339 */     this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener1, paramMapChangeListener2 };
/* 340 */     this.mapChangeSize = 2;
/* 341 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableMapValue<K, V> paramObservableMapValue, InvalidationListener paramInvalidationListener, ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 345 */     super(paramObservableMapValue);
/* 346 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 347 */     this.invalidationSize = 1;
/* 348 */     this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { paramChangeListener };
/* 349 */     this.changeSize = 1;
/* 350 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableMapValue<K, V> paramObservableMapValue, InvalidationListener paramInvalidationListener, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 354 */     super(paramObservableMapValue);
/* 355 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 356 */     this.invalidationSize = 1;
/* 357 */     this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener };
/* 358 */     this.mapChangeSize = 1;
/* 359 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableMapValue<K, V> paramObservableMapValue, ChangeListener<? super ObservableMap<K, V>> paramChangeListener, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 363 */     super(paramObservableMapValue);
/* 364 */     this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { paramChangeListener };
/* 365 */     this.changeSize = 1;
/* 366 */     this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener };
/* 367 */     this.mapChangeSize = 1;
/* 368 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 373 */     if (this.invalidationListeners == null) {
/* 374 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 375 */       this.invalidationSize = 1;
/*     */     } else {
/* 377 */       int i = this.invalidationListeners.length;
/* 378 */       if (this.locked) {
/* 379 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 380 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 381 */       } else if (this.invalidationSize == i) {
/* 382 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 383 */         if (this.invalidationSize == i) {
/* 384 */           int j = i * 3 / 2 + 1;
/* 385 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 388 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 390 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 395 */     if (this.invalidationListeners != null) {
/* 396 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 397 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 398 */           if (this.invalidationSize == 1) {
/* 399 */             if (this.changeSize == 1 && this.mapChangeSize == 0)
/* 400 */               return new MapExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]); 
/* 401 */             if (this.changeSize == 0 && this.mapChangeSize == 1) {
/* 402 */               return new MapExpressionHelper.SingleMapChange<>(this.observable, this.mapChangeListeners[0]);
/*     */             }
/* 404 */             this.invalidationListeners = null;
/* 405 */             this.invalidationSize = 0; break;
/* 406 */           }  if (this.invalidationSize == 2 && this.changeSize == 0 && this.mapChangeSize == 0) {
/* 407 */             return new MapExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */           }
/* 409 */           int i = this.invalidationSize - b - 1;
/* 410 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 411 */           if (this.locked) {
/* 412 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 413 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */           } 
/* 415 */           if (i > 0) {
/* 416 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 418 */           this.invalidationSize--;
/* 419 */           if (!this.locked) {
/* 420 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 427 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 432 */     if (this.changeListeners == null) {
/* 433 */       this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[] { paramChangeListener };
/* 434 */       this.changeSize = 1;
/*     */     } else {
/* 436 */       int i = this.changeListeners.length;
/* 437 */       if (this.locked) {
/* 438 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 439 */         this.changeListeners = Arrays.<ChangeListener<? super ObservableMap<K, V>>>copyOf(this.changeListeners, j);
/* 440 */       } else if (this.changeSize == i) {
/* 441 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 442 */         if (this.changeSize == i) {
/* 443 */           int j = i * 3 / 2 + 1;
/* 444 */           this.changeListeners = Arrays.<ChangeListener<? super ObservableMap<K, V>>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 447 */       this.changeListeners[this.changeSize++] = paramChangeListener;
/*     */     } 
/* 449 */     if (this.changeSize == 1) {
/* 450 */       this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/*     */     }
/* 452 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 457 */     if (this.changeListeners != null) {
/* 458 */       for (byte b = 0; b < this.changeSize; b++) {
/* 459 */         if (paramChangeListener.equals(this.changeListeners[b])) {
/* 460 */           if (this.changeSize == 1) {
/* 461 */             if (this.invalidationSize == 1 && this.mapChangeSize == 0)
/* 462 */               return new MapExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 463 */             if (this.invalidationSize == 0 && this.mapChangeSize == 1) {
/* 464 */               return new MapExpressionHelper.SingleMapChange<>(this.observable, this.mapChangeListeners[0]);
/*     */             }
/* 466 */             this.changeListeners = null;
/* 467 */             this.changeSize = 0; break;
/* 468 */           }  if (this.changeSize == 2 && this.invalidationSize == 0 && this.mapChangeSize == 0) {
/* 469 */             return new MapExpressionHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */           }
/* 471 */           int i = this.changeSize - b - 1;
/* 472 */           ChangeListener<? super ObservableMap<K, V>>[] arrayOfChangeListener = this.changeListeners;
/* 473 */           if (this.locked) {
/* 474 */             this.changeListeners = (ChangeListener<? super ObservableMap<K, V>>[])new ChangeListener[this.changeListeners.length];
/* 475 */             System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */           } 
/* 477 */           if (i > 0) {
/* 478 */             System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 480 */           this.changeSize--;
/* 481 */           if (!this.locked) {
/* 482 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 489 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 494 */     if (this.mapChangeListeners == null) {
/* 495 */       this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener };
/* 496 */       this.mapChangeSize = 1;
/*     */     } else {
/* 498 */       int i = this.mapChangeListeners.length;
/* 499 */       if (this.locked) {
/* 500 */         int j = (this.mapChangeSize < i) ? i : (i * 3 / 2 + 1);
/* 501 */         this.mapChangeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.mapChangeListeners, j);
/* 502 */       } else if (this.mapChangeSize == i) {
/* 503 */         this.mapChangeSize = trim(this.mapChangeSize, (Object[])this.mapChangeListeners);
/* 504 */         if (this.mapChangeSize == i) {
/* 505 */           int j = i * 3 / 2 + 1;
/* 506 */           this.mapChangeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.mapChangeListeners, j);
/*     */         } 
/*     */       } 
/* 509 */       this.mapChangeListeners[this.mapChangeSize++] = paramMapChangeListener;
/*     */     } 
/* 511 */     if (this.mapChangeSize == 1) {
/* 512 */       this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/*     */     }
/* 514 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 519 */     if (this.mapChangeListeners != null) {
/* 520 */       for (byte b = 0; b < this.mapChangeSize; b++) {
/* 521 */         if (paramMapChangeListener.equals(this.mapChangeListeners[b])) {
/* 522 */           if (this.mapChangeSize == 1) {
/* 523 */             if (this.invalidationSize == 1 && this.changeSize == 0)
/* 524 */               return new MapExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 525 */             if (this.invalidationSize == 0 && this.changeSize == 1) {
/* 526 */               return new MapExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */             }
/* 528 */             this.mapChangeListeners = null;
/* 529 */             this.mapChangeSize = 0; break;
/* 530 */           }  if (this.mapChangeSize == 2 && this.invalidationSize == 0 && this.changeSize == 0) {
/* 531 */             return new MapExpressionHelper.SingleMapChange<>(this.observable, this.mapChangeListeners[1 - b]);
/*     */           }
/* 533 */           int i = this.mapChangeSize - b - 1;
/* 534 */           MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.mapChangeListeners;
/* 535 */           if (this.locked) {
/* 536 */             this.mapChangeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[this.mapChangeListeners.length];
/* 537 */             System.arraycopy(arrayOfMapChangeListener, 0, this.mapChangeListeners, 0, b + 1);
/*     */           } 
/* 539 */           if (i > 0) {
/* 540 */             System.arraycopy(arrayOfMapChangeListener, b + 1, this.mapChangeListeners, b, i);
/*     */           }
/* 542 */           this.mapChangeSize--;
/* 543 */           if (!this.locked) {
/* 544 */             this.mapChangeListeners[this.mapChangeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 551 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 556 */     if (this.changeSize == 0 && this.mapChangeSize == 0) {
/* 557 */       notifyListeners(this.currentValue, (MapExpressionHelper.SimpleChange<K, V>)null);
/*     */     } else {
/* 559 */       ObservableMap<K, V> observableMap = this.currentValue;
/* 560 */       this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/* 561 */       notifyListeners(observableMap, (MapExpressionHelper.SimpleChange<K, V>)null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 567 */     MapExpressionHelper.SimpleChange<K, V> simpleChange = (this.mapChangeSize == 0) ? null : new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable, paramChange);
/* 568 */     notifyListeners(this.currentValue, simpleChange);
/*     */   }
/*     */   
/*     */   private void notifyListeners(ObservableMap<K, V> paramObservableMap, MapExpressionHelper.SimpleChange<K, V> paramSimpleChange) {
/* 572 */     InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 573 */     int i = this.invalidationSize;
/* 574 */     ChangeListener<? super ObservableMap<K, V>>[] arrayOfChangeListener = this.changeListeners;
/* 575 */     int j = this.changeSize;
/* 576 */     MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.mapChangeListeners;
/* 577 */     int k = this.mapChangeSize;
/*     */     try {
/* 579 */       this.locked = true; byte b;
/* 580 */       for (b = 0; b < i; b++) {
/* 581 */         arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/*     */       }
/* 583 */       if (this.currentValue != paramObservableMap || paramSimpleChange != null) {
/* 584 */         for (b = 0; b < j; b++) {
/* 585 */           arrayOfChangeListener[b].changed((ObservableValue)this.observable, paramObservableMap, this.currentValue);
/*     */         }
/* 587 */         if (k > 0) {
/* 588 */           if (paramSimpleChange != null) {
/* 589 */             for (b = 0; b < k; b++) {
/* 590 */               arrayOfMapChangeListener[b].onChanged(paramSimpleChange);
/*     */             }
/*     */           } else {
/* 593 */             paramSimpleChange = new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable);
/* 594 */             if (this.currentValue == null) {
/* 595 */               for (Map.Entry entry : paramObservableMap.entrySet()) {
/* 596 */                 paramSimpleChange.setRemoved((K)entry.getKey(), (V)entry.getValue());
/* 597 */                 for (byte b1 = 0; b1 < k; b1++) {
/* 598 */                   arrayOfMapChangeListener[b1].onChanged(paramSimpleChange);
/*     */                 }
/*     */               } 
/* 601 */             } else if (paramObservableMap == null) {
/* 602 */               for (Map.Entry entry : this.currentValue.entrySet()) {
/* 603 */                 paramSimpleChange.setAdded((K)entry.getKey(), (V)entry.getValue());
/* 604 */                 for (byte b1 = 0; b1 < k; b1++) {
/* 605 */                   arrayOfMapChangeListener[b1].onChanged(paramSimpleChange);
/*     */                 }
/*     */               } 
/*     */             } else {
/* 609 */               for (Map.Entry entry : paramObservableMap.entrySet()) {
/* 610 */                 Object object1 = entry.getKey();
/* 611 */                 Object object2 = entry.getValue();
/* 612 */                 if (this.currentValue.containsKey(object1)) {
/* 613 */                   Object object = this.currentValue.get(object1);
/* 614 */                   if ((object2 == null) ? (object != null) : !object.equals(object2)) {
/* 615 */                     paramSimpleChange.setPut((K)object1, (V)object2, (V)object);
/* 616 */                     for (byte b2 = 0; b2 < k; b2++)
/* 617 */                       arrayOfMapChangeListener[b2].onChanged(paramSimpleChange); 
/*     */                   } 
/*     */                   continue;
/*     */                 } 
/* 621 */                 paramSimpleChange.setRemoved((K)object1, (V)object2);
/* 622 */                 for (byte b1 = 0; b1 < k; b1++) {
/* 623 */                   arrayOfMapChangeListener[b1].onChanged(paramSimpleChange);
/*     */                 }
/*     */               } 
/*     */               
/* 627 */               for (Map.Entry entry : this.currentValue.entrySet()) {
/* 628 */                 Object object = entry.getKey();
/* 629 */                 if (!paramObservableMap.containsKey(object)) {
/* 630 */                   paramSimpleChange.setAdded((K)object, (V)entry.getValue());
/* 631 */                   for (byte b1 = 0; b1 < k; b1++) {
/* 632 */                     arrayOfMapChangeListener[b1].onChanged(paramSimpleChange);
/*     */                   }
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } finally {
/* 641 */       this.locked = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\MapExpressionHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */