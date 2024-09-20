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
/*     */ public abstract class ListExpressionHelper<E>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   protected final ObservableListValue<E> observable;
/*     */   
/*     */   public static <E> ListExpressionHelper<E> addListener(ListExpressionHelper<E> paramListExpressionHelper, ObservableListValue<E> paramObservableListValue, InvalidationListener paramInvalidationListener) {
/*  57 */     if (paramObservableListValue == null || paramInvalidationListener == null) {
/*  58 */       throw new NullPointerException();
/*     */     }
/*  60 */     paramObservableListValue.getValue();
/*  61 */     return (paramListExpressionHelper == null) ? new SingleInvalidation<>(paramObservableListValue, paramInvalidationListener) : paramListExpressionHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <E> ListExpressionHelper<E> removeListener(ListExpressionHelper<E> paramListExpressionHelper, InvalidationListener paramInvalidationListener) {
/*  65 */     if (paramInvalidationListener == null) {
/*  66 */       throw new NullPointerException();
/*     */     }
/*  68 */     return (paramListExpressionHelper == null) ? null : paramListExpressionHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <E> ListExpressionHelper<E> addListener(ListExpressionHelper<E> paramListExpressionHelper, ObservableListValue<E> paramObservableListValue, ChangeListener<? super ObservableList<E>> paramChangeListener) {
/*  72 */     if (paramObservableListValue == null || paramChangeListener == null) {
/*  73 */       throw new NullPointerException();
/*     */     }
/*  75 */     return (paramListExpressionHelper == null) ? new SingleChange<>(paramObservableListValue, paramChangeListener) : paramListExpressionHelper.addListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> ListExpressionHelper<E> removeListener(ListExpressionHelper<E> paramListExpressionHelper, ChangeListener<? super ObservableList<E>> paramChangeListener) {
/*  79 */     if (paramChangeListener == null) {
/*  80 */       throw new NullPointerException();
/*     */     }
/*  82 */     return (paramListExpressionHelper == null) ? null : paramListExpressionHelper.removeListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> ListExpressionHelper<E> addListener(ListExpressionHelper<E> paramListExpressionHelper, ObservableListValue<E> paramObservableListValue, ListChangeListener<? super E> paramListChangeListener) {
/*  86 */     if (paramObservableListValue == null || paramListChangeListener == null) {
/*  87 */       throw new NullPointerException();
/*     */     }
/*  89 */     return (paramListExpressionHelper == null) ? new SingleListChange<>(paramObservableListValue, paramListChangeListener) : paramListExpressionHelper.addListener(paramListChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> ListExpressionHelper<E> removeListener(ListExpressionHelper<E> paramListExpressionHelper, ListChangeListener<? super E> paramListChangeListener) {
/*  93 */     if (paramListChangeListener == null) {
/*  94 */       throw new NullPointerException();
/*     */     }
/*  96 */     return (paramListExpressionHelper == null) ? null : paramListExpressionHelper.removeListener(paramListChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> void fireValueChangedEvent(ListExpressionHelper<E> paramListExpressionHelper) {
/* 100 */     if (paramListExpressionHelper != null) {
/* 101 */       paramListExpressionHelper.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E> void fireValueChangedEvent(ListExpressionHelper<E> paramListExpressionHelper, ListChangeListener.Change<? extends E> paramChange) {
/* 106 */     if (paramListExpressionHelper != null) {
/* 107 */       paramListExpressionHelper.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper(ObservableListValue<E> paramObservableListValue) {
/* 117 */     this.observable = paramObservableListValue;
/*     */   }
/*     */   
/*     */   protected abstract ListExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract ListExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> paramChangeListener);
/*     */   
/*     */   protected abstract ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener);
/*     */   
/*     */   protected abstract ListExpressionHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener);
/*     */   
/*     */   protected abstract ListExpressionHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent();
/*     */   
/*     */   protected abstract void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange);
/*     */   
/*     */   private static class SingleInvalidation<E> extends ListExpressionHelper<E> {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(ObservableListValue<E> param1ObservableListValue, InvalidationListener param1InvalidationListener) {
/* 140 */       super(param1ObservableListValue);
/* 141 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 146 */       return new ListExpressionHelper.Generic<>(this.observable, this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 151 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 156 */       return new ListExpressionHelper.Generic<>(this.observable, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 161 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 166 */       return new ListExpressionHelper.Generic<>(this.observable, this.listener, param1ListChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 171 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 176 */       this.listener.invalidated((Observable)this.observable);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> param1Change) {
/* 181 */       this.listener.invalidated((Observable)this.observable);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<E>
/*     */     extends ListExpressionHelper<E> {
/*     */     private final ChangeListener<? super ObservableList<E>> listener;
/*     */     private ObservableList<E> currentValue;
/*     */     
/*     */     private SingleChange(ObservableListValue<E> param1ObservableListValue, ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 191 */       super(param1ObservableListValue);
/* 192 */       this.listener = param1ChangeListener;
/* 193 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 198 */       return new ListExpressionHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 203 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 208 */       return new ListExpressionHelper.Generic<>(this.observable, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 213 */       return param1ChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 218 */       return new ListExpressionHelper.Generic<>(this.observable, this.listener, param1ListChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 223 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 228 */       ObservableList<E> observableList = this.currentValue;
/* 229 */       this.currentValue = (ObservableList<E>)this.observable.getValue();
/* 230 */       if (this.currentValue != observableList) {
/* 231 */         this.listener.changed((ObservableValue)this.observable, observableList, this.currentValue);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> param1Change) {
/* 237 */       this.listener.changed((ObservableValue)this.observable, this.currentValue, this.currentValue);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleListChange<E>
/*     */     extends ListExpressionHelper<E> {
/*     */     private final ListChangeListener<? super E> listener;
/*     */     private ObservableList<E> currentValue;
/*     */     
/*     */     private SingleListChange(ObservableListValue<E> param1ObservableListValue, ListChangeListener<? super E> param1ListChangeListener) {
/* 247 */       super(param1ObservableListValue);
/* 248 */       this.listener = param1ListChangeListener;
/* 249 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 254 */       return new ListExpressionHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 259 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 264 */       return new ListExpressionHelper.Generic<>(this.observable, param1ChangeListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 269 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 274 */       return new ListExpressionHelper.Generic<>(this.observable, this.listener, param1ListChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 279 */       return param1ListChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 284 */       ObservableList<E> observableList = this.currentValue;
/* 285 */       this.currentValue = (ObservableList<E>)this.observable.getValue();
/* 286 */       if (this.currentValue != observableList) {
/* 287 */         boolean bool = (this.currentValue == null) ? false : this.currentValue.size();
/*     */ 
/*     */         
/* 290 */         ObservableList observableList1 = (observableList == null) ? FXCollections.emptyObservableList() : FXCollections.unmodifiableObservableList(observableList);
/* 291 */         NonIterableChange.GenericAddRemoveChange genericAddRemoveChange = new NonIterableChange.GenericAddRemoveChange(0, bool, (List)observableList1, (ObservableList)this.observable);
/* 292 */         this.listener.onChanged((ListChangeListener.Change)genericAddRemoveChange);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> param1Change) {
/* 298 */       this.listener.onChanged((ListChangeListener.Change)new SourceAdapterChange((ObservableList)this.observable, param1Change));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<E>
/*     */     extends ListExpressionHelper<E> {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private ChangeListener<? super ObservableList<E>>[] changeListeners;
/*     */     private ListChangeListener<? super E>[] listChangeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private int listChangeSize;
/*     */     private boolean locked;
/*     */     private ObservableList<E> currentValue;
/*     */     
/*     */     private Generic(ObservableListValue<E> param1ObservableListValue, InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 314 */       super(param1ObservableListValue);
/* 315 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 316 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(ObservableListValue<E> param1ObservableListValue, ChangeListener<? super ObservableList<E>> param1ChangeListener1, ChangeListener<? super ObservableList<E>> param1ChangeListener2) {
/* 320 */       super(param1ObservableListValue);
/* 321 */       this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { param1ChangeListener1, param1ChangeListener2 };
/* 322 */       this.changeSize = 2;
/* 323 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableListValue<E> param1ObservableListValue, ListChangeListener<? super E> param1ListChangeListener1, ListChangeListener<? super E> param1ListChangeListener2) {
/* 327 */       super(param1ObservableListValue);
/* 328 */       this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { param1ListChangeListener1, param1ListChangeListener2 };
/* 329 */       this.listChangeSize = 2;
/* 330 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableListValue<E> param1ObservableListValue, InvalidationListener param1InvalidationListener, ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 334 */       super(param1ObservableListValue);
/* 335 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 336 */       this.invalidationSize = 1;
/* 337 */       this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { param1ChangeListener };
/* 338 */       this.changeSize = 1;
/* 339 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableListValue<E> param1ObservableListValue, InvalidationListener param1InvalidationListener, ListChangeListener<? super E> param1ListChangeListener) {
/* 343 */       super(param1ObservableListValue);
/* 344 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 345 */       this.invalidationSize = 1;
/* 346 */       this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { param1ListChangeListener };
/* 347 */       this.listChangeSize = 1;
/* 348 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableListValue<E> param1ObservableListValue, ChangeListener<? super ObservableList<E>> param1ChangeListener, ListChangeListener<? super E> param1ListChangeListener) {
/* 352 */       super(param1ObservableListValue);
/* 353 */       this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { param1ChangeListener };
/* 354 */       this.changeSize = 1;
/* 355 */       this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { param1ListChangeListener };
/* 356 */       this.listChangeSize = 1;
/* 357 */       this.currentValue = (ObservableList<E>)param1ObservableListValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 362 */       if (this.invalidationListeners == null) {
/* 363 */         this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 364 */         this.invalidationSize = 1;
/*     */       } else {
/* 366 */         int i = this.invalidationListeners.length;
/* 367 */         if (this.locked) {
/* 368 */           int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 369 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 370 */         } else if (this.invalidationSize == i) {
/* 371 */           this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 372 */           if (this.invalidationSize == i) {
/* 373 */             int j = i * 3 / 2 + 1;
/* 374 */             this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */           } 
/*     */         } 
/* 377 */         this.invalidationListeners[this.invalidationSize++] = param1InvalidationListener;
/*     */       } 
/* 379 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 384 */       if (this.invalidationListeners != null) {
/* 385 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 386 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 387 */             if (this.invalidationSize == 1) {
/* 388 */               if (this.changeSize == 1 && this.listChangeSize == 0)
/* 389 */                 return new ListExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]); 
/* 390 */               if (this.changeSize == 0 && this.listChangeSize == 1) {
/* 391 */                 return new ListExpressionHelper.SingleListChange<>(this.observable, this.listChangeListeners[0]);
/*     */               }
/* 393 */               this.invalidationListeners = null;
/* 394 */               this.invalidationSize = 0; break;
/* 395 */             }  if (this.invalidationSize == 2 && this.changeSize == 0 && this.listChangeSize == 0) {
/* 396 */               return new ListExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */             }
/* 398 */             int i = this.invalidationSize - b - 1;
/* 399 */             InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 400 */             if (this.locked) {
/* 401 */               this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 402 */               System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */             } 
/* 404 */             if (i > 0) {
/* 405 */               System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */             }
/* 407 */             this.invalidationSize--;
/* 408 */             if (!this.locked) {
/* 409 */               this.invalidationListeners[this.invalidationSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 416 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 421 */       if (this.changeListeners == null) {
/* 422 */         this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[] { param1ChangeListener };
/* 423 */         this.changeSize = 1;
/*     */       } else {
/* 425 */         int i = this.changeListeners.length;
/* 426 */         if (this.locked) {
/* 427 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 428 */           this.changeListeners = Arrays.<ChangeListener<? super ObservableList<E>>>copyOf(this.changeListeners, j);
/* 429 */         } else if (this.changeSize == i) {
/* 430 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 431 */           if (this.changeSize == i) {
/* 432 */             int j = i * 3 / 2 + 1;
/* 433 */             this.changeListeners = Arrays.<ChangeListener<? super ObservableList<E>>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 436 */         this.changeListeners[this.changeSize++] = param1ChangeListener;
/*     */       } 
/* 438 */       if (this.changeSize == 1) {
/* 439 */         this.currentValue = (ObservableList<E>)this.observable.getValue();
/*     */       }
/* 441 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> param1ChangeListener) {
/* 446 */       if (this.changeListeners != null) {
/* 447 */         for (byte b = 0; b < this.changeSize; b++) {
/* 448 */           if (param1ChangeListener.equals(this.changeListeners[b])) {
/* 449 */             if (this.changeSize == 1) {
/* 450 */               if (this.invalidationSize == 1 && this.listChangeSize == 0)
/* 451 */                 return new ListExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 452 */               if (this.invalidationSize == 0 && this.listChangeSize == 1) {
/* 453 */                 return new ListExpressionHelper.SingleListChange<>(this.observable, this.listChangeListeners[0]);
/*     */               }
/* 455 */               this.changeListeners = null;
/* 456 */               this.changeSize = 0; break;
/* 457 */             }  if (this.changeSize == 2 && this.invalidationSize == 0 && this.listChangeSize == 0) {
/* 458 */               return new ListExpressionHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */             }
/* 460 */             int i = this.changeSize - b - 1;
/* 461 */             ChangeListener<? super ObservableList<E>>[] arrayOfChangeListener = this.changeListeners;
/* 462 */             if (this.locked) {
/* 463 */               this.changeListeners = (ChangeListener<? super ObservableList<E>>[])new ChangeListener[this.changeListeners.length];
/* 464 */               System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */             } 
/* 466 */             if (i > 0) {
/* 467 */               System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */             }
/* 469 */             this.changeSize--;
/* 470 */             if (!this.locked) {
/* 471 */               this.changeListeners[this.changeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 478 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 483 */       if (this.listChangeListeners == null) {
/* 484 */         this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { param1ListChangeListener };
/* 485 */         this.listChangeSize = 1;
/*     */       } else {
/* 487 */         int i = this.listChangeListeners.length;
/* 488 */         if (this.locked) {
/* 489 */           int j = (this.listChangeSize < i) ? i : (i * 3 / 2 + 1);
/* 490 */           this.listChangeListeners = Arrays.<ListChangeListener<? super E>>copyOf(this.listChangeListeners, j);
/* 491 */         } else if (this.listChangeSize == i) {
/* 492 */           this.listChangeSize = trim(this.listChangeSize, (Object[])this.listChangeListeners);
/* 493 */           if (this.listChangeSize == i) {
/* 494 */             int j = i * 3 / 2 + 1;
/* 495 */             this.listChangeListeners = Arrays.<ListChangeListener<? super E>>copyOf(this.listChangeListeners, j);
/*     */           } 
/*     */         } 
/* 498 */         this.listChangeListeners[this.listChangeSize++] = param1ListChangeListener;
/*     */       } 
/* 500 */       if (this.listChangeSize == 1) {
/* 501 */         this.currentValue = (ObservableList<E>)this.observable.getValue();
/*     */       }
/* 503 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> param1ListChangeListener) {
/* 508 */       if (this.listChangeListeners != null) {
/* 509 */         for (byte b = 0; b < this.listChangeSize; b++) {
/* 510 */           if (param1ListChangeListener.equals(this.listChangeListeners[b])) {
/* 511 */             if (this.listChangeSize == 1) {
/* 512 */               if (this.invalidationSize == 1 && this.changeSize == 0)
/* 513 */                 return new ListExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 514 */               if (this.invalidationSize == 0 && this.changeSize == 1) {
/* 515 */                 return new ListExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */               }
/* 517 */               this.listChangeListeners = null;
/* 518 */               this.listChangeSize = 0; break;
/* 519 */             }  if (this.listChangeSize == 2 && this.invalidationSize == 0 && this.changeSize == 0) {
/* 520 */               return new ListExpressionHelper.SingleListChange<>(this.observable, this.listChangeListeners[1 - b]);
/*     */             }
/* 522 */             int i = this.listChangeSize - b - 1;
/* 523 */             ListChangeListener<? super E>[] arrayOfListChangeListener = this.listChangeListeners;
/* 524 */             if (this.locked) {
/* 525 */               this.listChangeListeners = (ListChangeListener<? super E>[])new ListChangeListener[this.listChangeListeners.length];
/* 526 */               System.arraycopy(arrayOfListChangeListener, 0, this.listChangeListeners, 0, b + 1);
/*     */             } 
/* 528 */             if (i > 0) {
/* 529 */               System.arraycopy(arrayOfListChangeListener, b + 1, this.listChangeListeners, b, i);
/*     */             }
/* 531 */             this.listChangeSize--;
/* 532 */             if (!this.locked) {
/* 533 */               this.listChangeListeners[this.listChangeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 540 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 545 */       if (this.changeSize == 0 && this.listChangeSize == 0) {
/* 546 */         notifyListeners(this.currentValue, (ListChangeListener.Change<E>)null, false);
/*     */       } else {
/* 548 */         ObservableList<E> observableList = this.currentValue;
/* 549 */         this.currentValue = (ObservableList<E>)this.observable.getValue();
/* 550 */         if (this.currentValue != observableList) {
/* 551 */           NonIterableChange.GenericAddRemoveChange genericAddRemoveChange = null;
/* 552 */           if (this.listChangeSize > 0) {
/* 553 */             boolean bool = (this.currentValue == null) ? false : this.currentValue.size();
/*     */ 
/*     */             
/* 556 */             ObservableList observableList1 = (observableList == null) ? FXCollections.emptyObservableList() : FXCollections.unmodifiableObservableList(observableList);
/* 557 */             genericAddRemoveChange = new NonIterableChange.GenericAddRemoveChange(0, bool, (List)observableList1, (ObservableList)this.observable);
/*     */           } 
/* 559 */           notifyListeners(observableList, (ListChangeListener.Change<E>)genericAddRemoveChange, false);
/*     */         } else {
/* 561 */           notifyListeners(this.currentValue, (ListChangeListener.Change<E>)null, true);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> param1Change) {
/* 568 */       SourceAdapterChange sourceAdapterChange = (this.listChangeSize == 0) ? null : new SourceAdapterChange((ObservableList)this.observable, param1Change);
/* 569 */       notifyListeners(this.currentValue, (ListChangeListener.Change<E>)sourceAdapterChange, false);
/*     */     }
/*     */     
/*     */     private void notifyListeners(ObservableList<E> param1ObservableList, ListChangeListener.Change<E> param1Change, boolean param1Boolean) {
/* 573 */       InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 574 */       int i = this.invalidationSize;
/* 575 */       ChangeListener<? super ObservableList<E>>[] arrayOfChangeListener = this.changeListeners;
/* 576 */       int j = this.changeSize;
/* 577 */       ListChangeListener<? super E>[] arrayOfListChangeListener = this.listChangeListeners;
/* 578 */       int k = this.listChangeSize;
/*     */       try {
/* 580 */         this.locked = true; byte b;
/* 581 */         for (b = 0; b < i; b++) {
/* 582 */           arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/*     */         }
/* 584 */         if (!param1Boolean) {
/* 585 */           for (b = 0; b < j; b++) {
/* 586 */             arrayOfChangeListener[b].changed((ObservableValue)this.observable, param1ObservableList, this.currentValue);
/*     */           }
/* 588 */           if (param1Change != null) {
/* 589 */             for (b = 0; b < k; b++) {
/* 590 */               param1Change.reset();
/* 591 */               arrayOfListChangeListener[b].onChanged(param1Change);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } finally {
/* 596 */         this.locked = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ListExpressionHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */