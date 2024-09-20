/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import com.sun.javafx.collections.NonIterableChange;
/*     */ import com.sun.javafx.collections.SourceAdapterChange;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableListValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Generic<E>
/*     */   extends ListExpressionHelper<E>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private ChangeListener<? super ObservableList<E>>[] changeListeners;
/*     */   private ListChangeListener<? super E>[] listChangeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private int listChangeSize;
/*     */   private boolean locked;
/*     */   private ObservableList<E> currentValue;
/*     */   
/*     */   private Generic(ObservableListValue<E> paramObservableListValue, InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 314 */     super(paramObservableListValue);
/* 315 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 316 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(ObservableListValue<E> paramObservableListValue, ChangeListener<? super ObservableList<E>> paramChangeListener1, ChangeListener<? super ObservableList<E>> paramChangeListener2) {
/* 320 */     super(paramObservableListValue);
/* 321 */     this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { paramChangeListener1, paramChangeListener2 };
/* 322 */     this.changeSize = 2;
/* 323 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableListValue<E> paramObservableListValue, ListChangeListener<? super E> paramListChangeListener1, ListChangeListener<? super E> paramListChangeListener2) {
/* 327 */     super(paramObservableListValue);
/* 328 */     this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener1, paramListChangeListener2 };
/* 329 */     this.listChangeSize = 2;
/* 330 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableListValue<E> paramObservableListValue, InvalidationListener paramInvalidationListener, ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 334 */     super(paramObservableListValue);
/* 335 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 336 */     this.invalidationSize = 1;
/* 337 */     this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { paramChangeListener };
/* 338 */     this.changeSize = 1;
/* 339 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableListValue<E> paramObservableListValue, InvalidationListener paramInvalidationListener, ListChangeListener<? super E> paramListChangeListener) {
/* 343 */     super(paramObservableListValue);
/* 344 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 345 */     this.invalidationSize = 1;
/* 346 */     this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener };
/* 347 */     this.listChangeSize = 1;
/* 348 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableListValue<E> paramObservableListValue, ChangeListener<? super ObservableList<E>> paramChangeListener, ListChangeListener<? super E> paramListChangeListener) {
/* 352 */     super(paramObservableListValue);
/* 353 */     this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { paramChangeListener };
/* 354 */     this.changeSize = 1;
/* 355 */     this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener };
/* 356 */     this.listChangeSize = 1;
/* 357 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 362 */     if (this.invalidationListeners == null) {
/* 363 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 364 */       this.invalidationSize = 1;
/*     */     } else {
/* 366 */       int i = this.invalidationListeners.length;
/* 367 */       if (this.locked) {
/* 368 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 369 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 370 */       } else if (this.invalidationSize == i) {
/* 371 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 372 */         if (this.invalidationSize == i) {
/* 373 */           int j = i * 3 / 2 + 1;
/* 374 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 377 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 379 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 384 */     if (this.invalidationListeners != null) {
/* 385 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 386 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 387 */           if (this.invalidationSize == 1) {
/* 388 */             if (this.changeSize == 1 && this.listChangeSize == 0)
/* 389 */               return new ListExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]); 
/* 390 */             if (this.changeSize == 0 && this.listChangeSize == 1) {
/* 391 */               return new ListExpressionHelper.SingleListChange<>(this.observable, this.listChangeListeners[0]);
/*     */             }
/* 393 */             this.invalidationListeners = null;
/* 394 */             this.invalidationSize = 0; break;
/* 395 */           }  if (this.invalidationSize == 2 && this.changeSize == 0 && this.listChangeSize == 0) {
/* 396 */             return new ListExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */           }
/* 398 */           int i = this.invalidationSize - b - 1;
/* 399 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 400 */           if (this.locked) {
/* 401 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 402 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */           } 
/* 404 */           if (i > 0) {
/* 405 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 407 */           this.invalidationSize--;
/* 408 */           if (!this.locked) {
/* 409 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 416 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 421 */     if (this.changeListeners == null) {
/* 422 */       this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { paramChangeListener };
/* 423 */       this.changeSize = 1;
/*     */     } else {
/* 425 */       int i = this.changeListeners.length;
/* 426 */       if (this.locked) {
/* 427 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 428 */         this.changeListeners = Arrays.<ChangeListener<? super ObservableList<E>>>copyOf(this.changeListeners, j);
/* 429 */       } else if (this.changeSize == i) {
/* 430 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 431 */         if (this.changeSize == i) {
/* 432 */           int j = i * 3 / 2 + 1;
/* 433 */           this.changeListeners = Arrays.<ChangeListener<? super ObservableList<E>>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 436 */       this.changeListeners[this.changeSize++] = paramChangeListener;
/*     */     } 
/* 438 */     if (this.changeSize == 1) {
/* 439 */       this.currentValue = (ObservableList<E>)this.observable.getValue();
/*     */     }
/* 441 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 446 */     if (this.changeListeners != null) {
/* 447 */       for (byte b = 0; b < this.changeSize; b++) {
/* 448 */         if (paramChangeListener.equals(this.changeListeners[b])) {
/* 449 */           if (this.changeSize == 1) {
/* 450 */             if (this.invalidationSize == 1 && this.listChangeSize == 0)
/* 451 */               return new ListExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 452 */             if (this.invalidationSize == 0 && this.listChangeSize == 1) {
/* 453 */               return new ListExpressionHelper.SingleListChange<>(this.observable, this.listChangeListeners[0]);
/*     */             }
/* 455 */             this.changeListeners = null;
/* 456 */             this.changeSize = 0; break;
/* 457 */           }  if (this.changeSize == 2 && this.invalidationSize == 0 && this.listChangeSize == 0) {
/* 458 */             return new ListExpressionHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */           }
/* 460 */           int i = this.changeSize - b - 1;
/* 461 */           ChangeListener<? super ObservableList<E>>[] arrayOfChangeListener = this.changeListeners;
/* 462 */           if (this.locked) {
/* 463 */             this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[this.changeListeners.length];
/* 464 */             System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */           } 
/* 466 */           if (i > 0) {
/* 467 */             System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 469 */           this.changeSize--;
/* 470 */           if (!this.locked) {
/* 471 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 478 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 483 */     if (this.listChangeListeners == null) {
/* 484 */       this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener };
/* 485 */       this.listChangeSize = 1;
/*     */     } else {
/* 487 */       int i = this.listChangeListeners.length;
/* 488 */       if (this.locked) {
/* 489 */         int j = (this.listChangeSize < i) ? i : (i * 3 / 2 + 1);
/* 490 */         this.listChangeListeners = Arrays.<ListChangeListener<? super E>>copyOf(this.listChangeListeners, j);
/* 491 */       } else if (this.listChangeSize == i) {
/* 492 */         this.listChangeSize = trim(this.listChangeSize, (Object[])this.listChangeListeners);
/* 493 */         if (this.listChangeSize == i) {
/* 494 */           int j = i * 3 / 2 + 1;
/* 495 */           this.listChangeListeners = Arrays.<ListChangeListener<? super E>>copyOf(this.listChangeListeners, j);
/*     */         } 
/*     */       } 
/* 498 */       this.listChangeListeners[this.listChangeSize++] = paramListChangeListener;
/*     */     } 
/* 500 */     if (this.listChangeSize == 1) {
/* 501 */       this.currentValue = (ObservableList<E>)this.observable.getValue();
/*     */     }
/* 503 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 508 */     if (this.listChangeListeners != null) {
/* 509 */       for (byte b = 0; b < this.listChangeSize; b++) {
/* 510 */         if (paramListChangeListener.equals(this.listChangeListeners[b])) {
/* 511 */           if (this.listChangeSize == 1) {
/* 512 */             if (this.invalidationSize == 1 && this.changeSize == 0)
/* 513 */               return new ListExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 514 */             if (this.invalidationSize == 0 && this.changeSize == 1) {
/* 515 */               return new ListExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */             }
/* 517 */             this.listChangeListeners = null;
/* 518 */             this.listChangeSize = 0; break;
/* 519 */           }  if (this.listChangeSize == 2 && this.invalidationSize == 0 && this.changeSize == 0) {
/* 520 */             return new ListExpressionHelper.SingleListChange<>(this.observable, this.listChangeListeners[1 - b]);
/*     */           }
/* 522 */           int i = this.listChangeSize - b - 1;
/* 523 */           ListChangeListener<? super E>[] arrayOfListChangeListener = this.listChangeListeners;
/* 524 */           if (this.locked) {
/* 525 */             this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[this.listChangeListeners.length];
/* 526 */             System.arraycopy(arrayOfListChangeListener, 0, this.listChangeListeners, 0, b + 1);
/*     */           } 
/* 528 */           if (i > 0) {
/* 529 */             System.arraycopy(arrayOfListChangeListener, b + 1, this.listChangeListeners, b, i);
/*     */           }
/* 531 */           this.listChangeSize--;
/* 532 */           if (!this.locked) {
/* 533 */             this.listChangeListeners[this.listChangeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 540 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 545 */     if (this.changeSize == 0 && this.listChangeSize == 0) {
/* 546 */       notifyListeners(this.currentValue, (ListChangeListener.Change<E>)null, false);
/*     */     } else {
/* 548 */       ObservableList<E> observableList = this.currentValue;
/* 549 */       this.currentValue = (ObservableList<E>)this.observable.getValue();
/* 550 */       if (this.currentValue != observableList) {
/* 551 */         NonIterableChange.GenericAddRemoveChange genericAddRemoveChange = null;
/* 552 */         if (this.listChangeSize > 0) {
/* 553 */           boolean bool = (this.currentValue == null) ? false : this.currentValue.size();
/*     */ 
/*     */           
/* 556 */           ObservableList observableList1 = (observableList == null) ? FXCollections.emptyObservableList() : FXCollections.unmodifiableObservableList(observableList);
/* 557 */           genericAddRemoveChange = new NonIterableChange.GenericAddRemoveChange(0, bool, (List)observableList1, (ObservableList)this.observable);
/*     */         } 
/* 559 */         notifyListeners(observableList, (ListChangeListener.Change<E>)genericAddRemoveChange, false);
/*     */       } else {
/* 561 */         notifyListeners(this.currentValue, (ListChangeListener.Change<E>)null, true);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 568 */     SourceAdapterChange sourceAdapterChange = (this.listChangeSize == 0) ? null : new SourceAdapterChange((ObservableList)this.observable, paramChange);
/* 569 */     notifyListeners(this.currentValue, (ListChangeListener.Change<E>)sourceAdapterChange, false);
/*     */   }
/*     */   
/*     */   private void notifyListeners(ObservableList<E> paramObservableList, ListChangeListener.Change<E> paramChange, boolean paramBoolean) {
/* 573 */     InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 574 */     int i = this.invalidationSize;
/* 575 */     ChangeListener<? super ObservableList<E>>[] arrayOfChangeListener = this.changeListeners;
/* 576 */     int j = this.changeSize;
/* 577 */     ListChangeListener<? super E>[] arrayOfListChangeListener = this.listChangeListeners;
/* 578 */     int k = this.listChangeSize;
/*     */     try {
/* 580 */       this.locked = true; byte b;
/* 581 */       for (b = 0; b < i; b++) {
/* 582 */         arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/*     */       }
/* 584 */       if (!paramBoolean) {
/* 585 */         for (b = 0; b < j; b++) {
/* 586 */           arrayOfChangeListener[b].changed((ObservableValue)this.observable, paramObservableList, this.currentValue);
/*     */         }
/* 588 */         if (paramChange != null) {
/* 589 */           for (b = 0; b < k; b++) {
/* 590 */             paramChange.reset();
/* 591 */             arrayOfListChangeListener[b].onChanged(paramChange);
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } finally {
/* 596 */       this.locked = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ListExpressionHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */