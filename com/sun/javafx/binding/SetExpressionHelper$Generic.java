/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableSetValue;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends SetExpressionHelper<E>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private ChangeListener<? super ObservableSet<E>>[] changeListeners;
/*     */   private SetChangeListener<? super E>[] setChangeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private int setChangeSize;
/*     */   private boolean locked;
/*     */   private ObservableSet<E> currentValue;
/*     */   
/*     */   private Generic(ObservableSetValue<E> paramObservableSetValue, InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 316 */     super(paramObservableSetValue);
/* 317 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 318 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(ObservableSetValue<E> paramObservableSetValue, ChangeListener<? super ObservableSet<E>> paramChangeListener1, ChangeListener<? super ObservableSet<E>> paramChangeListener2) {
/* 322 */     super(paramObservableSetValue);
/* 323 */     this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { paramChangeListener1, paramChangeListener2 };
/* 324 */     this.changeSize = 2;
/* 325 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableSetValue<E> paramObservableSetValue, SetChangeListener<? super E> paramSetChangeListener1, SetChangeListener<? super E> paramSetChangeListener2) {
/* 329 */     super(paramObservableSetValue);
/* 330 */     this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { paramSetChangeListener1, paramSetChangeListener2 };
/* 331 */     this.setChangeSize = 2;
/* 332 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableSetValue<E> paramObservableSetValue, InvalidationListener paramInvalidationListener, ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 336 */     super(paramObservableSetValue);
/* 337 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 338 */     this.invalidationSize = 1;
/* 339 */     this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { paramChangeListener };
/* 340 */     this.changeSize = 1;
/* 341 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableSetValue<E> paramObservableSetValue, InvalidationListener paramInvalidationListener, SetChangeListener<? super E> paramSetChangeListener) {
/* 345 */     super(paramObservableSetValue);
/* 346 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 347 */     this.invalidationSize = 1;
/* 348 */     this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { paramSetChangeListener };
/* 349 */     this.setChangeSize = 1;
/* 350 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */   
/*     */   private Generic(ObservableSetValue<E> paramObservableSetValue, ChangeListener<? super ObservableSet<E>> paramChangeListener, SetChangeListener<? super E> paramSetChangeListener) {
/* 354 */     super(paramObservableSetValue);
/* 355 */     this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { paramChangeListener };
/* 356 */     this.changeSize = 1;
/* 357 */     this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { paramSetChangeListener };
/* 358 */     this.setChangeSize = 1;
/* 359 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 364 */     if (this.invalidationListeners == null) {
/* 365 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 366 */       this.invalidationSize = 1;
/*     */     } else {
/* 368 */       int i = this.invalidationListeners.length;
/* 369 */       if (this.locked) {
/* 370 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 371 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 372 */       } else if (this.invalidationSize == i) {
/* 373 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 374 */         if (this.invalidationSize == i) {
/* 375 */           int j = i * 3 / 2 + 1;
/* 376 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 379 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 381 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 386 */     if (this.invalidationListeners != null) {
/* 387 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 388 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 389 */           if (this.invalidationSize == 1) {
/* 390 */             if (this.changeSize == 1 && this.setChangeSize == 0)
/* 391 */               return new SetExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]); 
/* 392 */             if (this.changeSize == 0 && this.setChangeSize == 1) {
/* 393 */               return new SetExpressionHelper.SingleSetChange<>(this.observable, this.setChangeListeners[0]);
/*     */             }
/* 395 */             this.invalidationListeners = null;
/* 396 */             this.invalidationSize = 0; break;
/* 397 */           }  if (this.invalidationSize == 2 && this.changeSize == 0 && this.setChangeSize == 0) {
/* 398 */             return new SetExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */           }
/* 400 */           int i = this.invalidationSize - b - 1;
/* 401 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 402 */           if (this.locked) {
/* 403 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 404 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */           } 
/* 406 */           if (i > 0) {
/* 407 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 409 */           this.invalidationSize--;
/* 410 */           if (!this.locked) {
/* 411 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 418 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 423 */     if (this.changeListeners == null) {
/* 424 */       this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { paramChangeListener };
/* 425 */       this.changeSize = 1;
/*     */     } else {
/* 427 */       int i = this.changeListeners.length;
/* 428 */       if (this.locked) {
/* 429 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 430 */         this.changeListeners = Arrays.<ChangeListener<? super ObservableSet<E>>>copyOf(this.changeListeners, j);
/* 431 */       } else if (this.changeSize == i) {
/* 432 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 433 */         if (this.changeSize == i) {
/* 434 */           int j = i * 3 / 2 + 1;
/* 435 */           this.changeListeners = Arrays.<ChangeListener<? super ObservableSet<E>>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 438 */       this.changeListeners[this.changeSize++] = paramChangeListener;
/*     */     } 
/* 440 */     if (this.changeSize == 1) {
/* 441 */       this.currentValue = (ObservableSet<E>)this.observable.getValue();
/*     */     }
/* 443 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 448 */     if (this.changeListeners != null) {
/* 449 */       for (byte b = 0; b < this.changeSize; b++) {
/* 450 */         if (paramChangeListener.equals(this.changeListeners[b])) {
/* 451 */           if (this.changeSize == 1) {
/* 452 */             if (this.invalidationSize == 1 && this.setChangeSize == 0)
/* 453 */               return new SetExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 454 */             if (this.invalidationSize == 0 && this.setChangeSize == 1) {
/* 455 */               return new SetExpressionHelper.SingleSetChange<>(this.observable, this.setChangeListeners[0]);
/*     */             }
/* 457 */             this.changeListeners = null;
/* 458 */             this.changeSize = 0; break;
/* 459 */           }  if (this.changeSize == 2 && this.invalidationSize == 0 && this.setChangeSize == 0) {
/* 460 */             return new SetExpressionHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */           }
/* 462 */           int i = this.changeSize - b - 1;
/* 463 */           ChangeListener<? super ObservableSet<E>>[] arrayOfChangeListener = this.changeListeners;
/* 464 */           if (this.locked) {
/* 465 */             this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[this.changeListeners.length];
/* 466 */             System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */           } 
/* 468 */           if (i > 0) {
/* 469 */             System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 471 */           this.changeSize--;
/* 472 */           if (!this.locked) {
/* 473 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 480 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 485 */     if (this.setChangeListeners == null) {
/* 486 */       this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { paramSetChangeListener };
/* 487 */       this.setChangeSize = 1;
/*     */     } else {
/* 489 */       int i = this.setChangeListeners.length;
/* 490 */       if (this.locked) {
/* 491 */         int j = (this.setChangeSize < i) ? i : (i * 3 / 2 + 1);
/* 492 */         this.setChangeListeners = Arrays.<SetChangeListener<? super E>>copyOf(this.setChangeListeners, j);
/* 493 */       } else if (this.setChangeSize == i) {
/* 494 */         this.setChangeSize = trim(this.setChangeSize, (Object[])this.setChangeListeners);
/* 495 */         if (this.setChangeSize == i) {
/* 496 */           int j = i * 3 / 2 + 1;
/* 497 */           this.setChangeListeners = Arrays.<SetChangeListener<? super E>>copyOf(this.setChangeListeners, j);
/*     */         } 
/*     */       } 
/* 500 */       this.setChangeListeners[this.setChangeSize++] = paramSetChangeListener;
/*     */     } 
/* 502 */     if (this.setChangeSize == 1) {
/* 503 */       this.currentValue = (ObservableSet<E>)this.observable.getValue();
/*     */     }
/* 505 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 510 */     if (this.setChangeListeners != null) {
/* 511 */       for (byte b = 0; b < this.setChangeSize; b++) {
/* 512 */         if (paramSetChangeListener.equals(this.setChangeListeners[b])) {
/* 513 */           if (this.setChangeSize == 1) {
/* 514 */             if (this.invalidationSize == 1 && this.changeSize == 0)
/* 515 */               return new SetExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 516 */             if (this.invalidationSize == 0 && this.changeSize == 1) {
/* 517 */               return new SetExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */             }
/* 519 */             this.setChangeListeners = null;
/* 520 */             this.setChangeSize = 0; break;
/* 521 */           }  if (this.setChangeSize == 2 && this.invalidationSize == 0 && this.changeSize == 0) {
/* 522 */             return new SetExpressionHelper.SingleSetChange<>(this.observable, this.setChangeListeners[1 - b]);
/*     */           }
/* 524 */           int i = this.setChangeSize - b - 1;
/* 525 */           SetChangeListener<? super E>[] arrayOfSetChangeListener = this.setChangeListeners;
/* 526 */           if (this.locked) {
/* 527 */             this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[this.setChangeListeners.length];
/* 528 */             System.arraycopy(arrayOfSetChangeListener, 0, this.setChangeListeners, 0, b + 1);
/*     */           } 
/* 530 */           if (i > 0) {
/* 531 */             System.arraycopy(arrayOfSetChangeListener, b + 1, this.setChangeListeners, b, i);
/*     */           }
/* 533 */           this.setChangeSize--;
/* 534 */           if (!this.locked) {
/* 535 */             this.setChangeListeners[this.setChangeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 542 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 547 */     if (this.changeSize == 0 && this.setChangeSize == 0) {
/* 548 */       notifyListeners(this.currentValue, (SetExpressionHelper.SimpleChange<E>)null);
/*     */     } else {
/* 550 */       ObservableSet<E> observableSet = this.currentValue;
/* 551 */       this.currentValue = (ObservableSet<E>)this.observable.getValue();
/* 552 */       notifyListeners(observableSet, (SetExpressionHelper.SimpleChange<E>)null);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/* 558 */     SetExpressionHelper.SimpleChange<E> simpleChange = (this.setChangeSize == 0) ? null : new SetExpressionHelper.SimpleChange<>((ObservableSet<E>)this.observable, paramChange);
/* 559 */     notifyListeners(this.currentValue, simpleChange);
/*     */   }
/*     */   
/*     */   private void notifyListeners(ObservableSet<E> paramObservableSet, SetExpressionHelper.SimpleChange<E> paramSimpleChange) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield invalidationListeners : [Ljavafx/beans/InvalidationListener;
/*     */     //   4: astore_3
/*     */     //   5: aload_0
/*     */     //   6: getfield invalidationSize : I
/*     */     //   9: istore #4
/*     */     //   11: aload_0
/*     */     //   12: getfield changeListeners : [Ljavafx/beans/value/ChangeListener;
/*     */     //   15: astore #5
/*     */     //   17: aload_0
/*     */     //   18: getfield changeSize : I
/*     */     //   21: istore #6
/*     */     //   23: aload_0
/*     */     //   24: getfield setChangeListeners : [Ljavafx/collections/SetChangeListener;
/*     */     //   27: astore #7
/*     */     //   29: aload_0
/*     */     //   30: getfield setChangeSize : I
/*     */     //   33: istore #8
/*     */     //   35: aload_0
/*     */     //   36: iconst_1
/*     */     //   37: putfield locked : Z
/*     */     //   40: iconst_0
/*     */     //   41: istore #9
/*     */     //   43: iload #9
/*     */     //   45: iload #4
/*     */     //   47: if_icmpge -> 69
/*     */     //   50: aload_3
/*     */     //   51: iload #9
/*     */     //   53: aaload
/*     */     //   54: aload_0
/*     */     //   55: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */     //   58: invokeinterface invalidated : (Ljavafx/beans/Observable;)V
/*     */     //   63: iinc #9, 1
/*     */     //   66: goto -> 43
/*     */     //   69: aload_0
/*     */     //   70: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   73: aload_1
/*     */     //   74: if_acmpne -> 81
/*     */     //   77: aload_2
/*     */     //   78: ifnull -> 471
/*     */     //   81: iconst_0
/*     */     //   82: istore #9
/*     */     //   84: iload #9
/*     */     //   86: iload #6
/*     */     //   88: if_icmpge -> 116
/*     */     //   91: aload #5
/*     */     //   93: iload #9
/*     */     //   95: aaload
/*     */     //   96: aload_0
/*     */     //   97: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */     //   100: aload_1
/*     */     //   101: aload_0
/*     */     //   102: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   105: invokeinterface changed : (Ljavafx/beans/value/ObservableValue;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   110: iinc #9, 1
/*     */     //   113: goto -> 84
/*     */     //   116: iload #8
/*     */     //   118: ifle -> 471
/*     */     //   121: aload_2
/*     */     //   122: ifnull -> 155
/*     */     //   125: iconst_0
/*     */     //   126: istore #9
/*     */     //   128: iload #9
/*     */     //   130: iload #8
/*     */     //   132: if_icmpge -> 152
/*     */     //   135: aload #7
/*     */     //   137: iload #9
/*     */     //   139: aaload
/*     */     //   140: aload_2
/*     */     //   141: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   146: iinc #9, 1
/*     */     //   149: goto -> 128
/*     */     //   152: goto -> 471
/*     */     //   155: new com/sun/javafx/binding/SetExpressionHelper$SimpleChange
/*     */     //   158: dup
/*     */     //   159: aload_0
/*     */     //   160: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */     //   163: invokespecial <init> : (Ljavafx/collections/ObservableSet;)V
/*     */     //   166: astore_2
/*     */     //   167: aload_0
/*     */     //   168: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   171: ifnonnull -> 241
/*     */     //   174: aload_1
/*     */     //   175: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   180: astore #9
/*     */     //   182: aload #9
/*     */     //   184: invokeinterface hasNext : ()Z
/*     */     //   189: ifeq -> 238
/*     */     //   192: aload #9
/*     */     //   194: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   199: astore #10
/*     */     //   201: aload_2
/*     */     //   202: aload #10
/*     */     //   204: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   207: pop
/*     */     //   208: iconst_0
/*     */     //   209: istore #11
/*     */     //   211: iload #11
/*     */     //   213: iload #8
/*     */     //   215: if_icmpge -> 235
/*     */     //   218: aload #7
/*     */     //   220: iload #11
/*     */     //   222: aaload
/*     */     //   223: aload_2
/*     */     //   224: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   229: iinc #11, 1
/*     */     //   232: goto -> 211
/*     */     //   235: goto -> 182
/*     */     //   238: goto -> 471
/*     */     //   241: aload_1
/*     */     //   242: ifnonnull -> 315
/*     */     //   245: aload_0
/*     */     //   246: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   249: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   254: astore #9
/*     */     //   256: aload #9
/*     */     //   258: invokeinterface hasNext : ()Z
/*     */     //   263: ifeq -> 312
/*     */     //   266: aload #9
/*     */     //   268: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   273: astore #10
/*     */     //   275: aload_2
/*     */     //   276: aload #10
/*     */     //   278: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   281: pop
/*     */     //   282: iconst_0
/*     */     //   283: istore #11
/*     */     //   285: iload #11
/*     */     //   287: iload #8
/*     */     //   289: if_icmpge -> 309
/*     */     //   292: aload #7
/*     */     //   294: iload #11
/*     */     //   296: aaload
/*     */     //   297: aload_2
/*     */     //   298: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   303: iinc #11, 1
/*     */     //   306: goto -> 285
/*     */     //   309: goto -> 256
/*     */     //   312: goto -> 471
/*     */     //   315: aload_1
/*     */     //   316: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   321: astore #9
/*     */     //   323: aload #9
/*     */     //   325: invokeinterface hasNext : ()Z
/*     */     //   330: ifeq -> 393
/*     */     //   333: aload #9
/*     */     //   335: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   340: astore #10
/*     */     //   342: aload_0
/*     */     //   343: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   346: aload #10
/*     */     //   348: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   353: ifne -> 390
/*     */     //   356: aload_2
/*     */     //   357: aload #10
/*     */     //   359: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   362: pop
/*     */     //   363: iconst_0
/*     */     //   364: istore #11
/*     */     //   366: iload #11
/*     */     //   368: iload #8
/*     */     //   370: if_icmpge -> 390
/*     */     //   373: aload #7
/*     */     //   375: iload #11
/*     */     //   377: aaload
/*     */     //   378: aload_2
/*     */     //   379: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   384: iinc #11, 1
/*     */     //   387: goto -> 366
/*     */     //   390: goto -> 323
/*     */     //   393: aload_0
/*     */     //   394: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   397: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   402: astore #9
/*     */     //   404: aload #9
/*     */     //   406: invokeinterface hasNext : ()Z
/*     */     //   411: ifeq -> 471
/*     */     //   414: aload #9
/*     */     //   416: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   421: astore #10
/*     */     //   423: aload_1
/*     */     //   424: aload #10
/*     */     //   426: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   431: ifne -> 468
/*     */     //   434: aload_2
/*     */     //   435: aload #10
/*     */     //   437: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   440: pop
/*     */     //   441: iconst_0
/*     */     //   442: istore #11
/*     */     //   444: iload #11
/*     */     //   446: iload #8
/*     */     //   448: if_icmpge -> 468
/*     */     //   451: aload #7
/*     */     //   453: iload #11
/*     */     //   455: aaload
/*     */     //   456: aload_2
/*     */     //   457: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   462: iinc #11, 1
/*     */     //   465: goto -> 444
/*     */     //   468: goto -> 404
/*     */     //   471: aload_0
/*     */     //   472: iconst_0
/*     */     //   473: putfield locked : Z
/*     */     //   476: goto -> 489
/*     */     //   479: astore #12
/*     */     //   481: aload_0
/*     */     //   482: iconst_0
/*     */     //   483: putfield locked : Z
/*     */     //   486: aload #12
/*     */     //   488: athrow
/*     */     //   489: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #563	-> 0
/*     */     //   #564	-> 5
/*     */     //   #565	-> 11
/*     */     //   #566	-> 17
/*     */     //   #567	-> 23
/*     */     //   #568	-> 29
/*     */     //   #570	-> 35
/*     */     //   #571	-> 40
/*     */     //   #572	-> 50
/*     */     //   #571	-> 63
/*     */     //   #574	-> 69
/*     */     //   #575	-> 81
/*     */     //   #576	-> 91
/*     */     //   #575	-> 110
/*     */     //   #578	-> 116
/*     */     //   #579	-> 121
/*     */     //   #580	-> 125
/*     */     //   #581	-> 135
/*     */     //   #580	-> 146
/*     */     //   #584	-> 155
/*     */     //   #585	-> 167
/*     */     //   #586	-> 174
/*     */     //   #587	-> 201
/*     */     //   #588	-> 208
/*     */     //   #589	-> 218
/*     */     //   #588	-> 229
/*     */     //   #591	-> 235
/*     */     //   #592	-> 241
/*     */     //   #593	-> 245
/*     */     //   #594	-> 275
/*     */     //   #595	-> 282
/*     */     //   #596	-> 292
/*     */     //   #595	-> 303
/*     */     //   #598	-> 309
/*     */     //   #600	-> 315
/*     */     //   #601	-> 342
/*     */     //   #602	-> 356
/*     */     //   #603	-> 363
/*     */     //   #604	-> 373
/*     */     //   #603	-> 384
/*     */     //   #607	-> 390
/*     */     //   #608	-> 393
/*     */     //   #609	-> 423
/*     */     //   #610	-> 434
/*     */     //   #611	-> 441
/*     */     //   #612	-> 451
/*     */     //   #611	-> 462
/*     */     //   #615	-> 468
/*     */     //   #622	-> 471
/*     */     //   #623	-> 476
/*     */     //   #622	-> 479
/*     */     //   #623	-> 486
/*     */     //   #624	-> 489
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   35	471	479	finally
/*     */     //   479	481	479	finally
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SetExpressionHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */