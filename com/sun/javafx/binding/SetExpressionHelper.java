/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableSetValue;
/*     */ import javafx.beans.value.ObservableValue;
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
/*     */ public abstract class SetExpressionHelper<E>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   protected final ObservableSetValue<E> observable;
/*     */   
/*     */   public static <E> SetExpressionHelper<E> addListener(SetExpressionHelper<E> paramSetExpressionHelper, ObservableSetValue<E> paramObservableSetValue, InvalidationListener paramInvalidationListener) {
/*  44 */     if (paramObservableSetValue == null || paramInvalidationListener == null) {
/*  45 */       throw new NullPointerException();
/*     */     }
/*  47 */     paramObservableSetValue.getValue();
/*  48 */     return (paramSetExpressionHelper == null) ? new SingleInvalidation<>(paramObservableSetValue, paramInvalidationListener) : paramSetExpressionHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <E> SetExpressionHelper<E> removeListener(SetExpressionHelper<E> paramSetExpressionHelper, InvalidationListener paramInvalidationListener) {
/*  52 */     if (paramInvalidationListener == null) {
/*  53 */       throw new NullPointerException();
/*     */     }
/*  55 */     return (paramSetExpressionHelper == null) ? null : paramSetExpressionHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <E> SetExpressionHelper<E> addListener(SetExpressionHelper<E> paramSetExpressionHelper, ObservableSetValue<E> paramObservableSetValue, ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/*  59 */     if (paramObservableSetValue == null || paramChangeListener == null) {
/*  60 */       throw new NullPointerException();
/*     */     }
/*  62 */     return (paramSetExpressionHelper == null) ? new SingleChange<>(paramObservableSetValue, paramChangeListener) : paramSetExpressionHelper.addListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> SetExpressionHelper<E> removeListener(SetExpressionHelper<E> paramSetExpressionHelper, ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/*  66 */     if (paramChangeListener == null) {
/*  67 */       throw new NullPointerException();
/*     */     }
/*  69 */     return (paramSetExpressionHelper == null) ? null : paramSetExpressionHelper.removeListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> SetExpressionHelper<E> addListener(SetExpressionHelper<E> paramSetExpressionHelper, ObservableSetValue<E> paramObservableSetValue, SetChangeListener<? super E> paramSetChangeListener) {
/*  73 */     if (paramObservableSetValue == null || paramSetChangeListener == null) {
/*  74 */       throw new NullPointerException();
/*     */     }
/*  76 */     return (paramSetExpressionHelper == null) ? new SingleSetChange<>(paramObservableSetValue, paramSetChangeListener) : paramSetExpressionHelper.addListener(paramSetChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> SetExpressionHelper<E> removeListener(SetExpressionHelper<E> paramSetExpressionHelper, SetChangeListener<? super E> paramSetChangeListener) {
/*  80 */     if (paramSetChangeListener == null) {
/*  81 */       throw new NullPointerException();
/*     */     }
/*  83 */     return (paramSetExpressionHelper == null) ? null : paramSetExpressionHelper.removeListener(paramSetChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> void fireValueChangedEvent(SetExpressionHelper<E> paramSetExpressionHelper) {
/*  87 */     if (paramSetExpressionHelper != null) {
/*  88 */       paramSetExpressionHelper.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E> void fireValueChangedEvent(SetExpressionHelper<E> paramSetExpressionHelper, SetChangeListener.Change<? extends E> paramChange) {
/*  93 */     if (paramSetExpressionHelper != null) {
/*  94 */       paramSetExpressionHelper.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper(ObservableSetValue<E> paramObservableSetValue) {
/* 104 */     this.observable = paramObservableSetValue;
/*     */   }
/*     */   
/*     */   protected abstract SetExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract SetExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener);
/*     */   
/*     */   protected abstract SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener);
/*     */   
/*     */   protected abstract SetExpressionHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener);
/*     */   
/*     */   protected abstract SetExpressionHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent();
/*     */   
/*     */   protected abstract void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange);
/*     */   
/*     */   private static class SingleInvalidation<E> extends SetExpressionHelper<E> {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(ObservableSetValue<E> param1ObservableSetValue, InvalidationListener param1InvalidationListener) {
/* 127 */       super(param1ObservableSetValue);
/* 128 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 133 */       return new SetExpressionHelper.Generic<>(this.observable, this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 138 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 143 */       return new SetExpressionHelper.Generic<>(this.observable, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 148 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 153 */       return new SetExpressionHelper.Generic<>(this.observable, this.listener, param1SetChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 158 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 163 */       this.listener.invalidated((Observable)this.observable);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/* 168 */       this.listener.invalidated((Observable)this.observable);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<E>
/*     */     extends SetExpressionHelper<E> {
/*     */     private final ChangeListener<? super ObservableSet<E>> listener;
/*     */     private ObservableSet<E> currentValue;
/*     */     
/*     */     private SingleChange(ObservableSetValue<E> param1ObservableSetValue, ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 178 */       super(param1ObservableSetValue);
/* 179 */       this.listener = param1ChangeListener;
/* 180 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 185 */       return new SetExpressionHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 190 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 195 */       return new SetExpressionHelper.Generic<>(this.observable, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 200 */       return param1ChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 205 */       return new SetExpressionHelper.Generic<>(this.observable, this.listener, param1SetChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 210 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 215 */       ObservableSet<E> observableSet = this.currentValue;
/* 216 */       this.currentValue = (ObservableSet<E>)this.observable.getValue();
/* 217 */       if (this.currentValue != observableSet) {
/* 218 */         this.listener.changed((ObservableValue)this.observable, observableSet, this.currentValue);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/* 224 */       this.listener.changed((ObservableValue)this.observable, this.currentValue, this.currentValue);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleSetChange<E>
/*     */     extends SetExpressionHelper<E> {
/*     */     private final SetChangeListener<? super E> listener;
/*     */     private ObservableSet<E> currentValue;
/*     */     
/*     */     private SingleSetChange(ObservableSetValue<E> param1ObservableSetValue, SetChangeListener<? super E> param1SetChangeListener) {
/* 234 */       super(param1ObservableSetValue);
/* 235 */       this.listener = param1SetChangeListener;
/* 236 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 241 */       return new SetExpressionHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 246 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 251 */       return new SetExpressionHelper.Generic<>(this.observable, param1ChangeListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 256 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 261 */       return new SetExpressionHelper.Generic<>(this.observable, this.listener, param1SetChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 266 */       return param1SetChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   4: astore_1
/*     */       //   5: aload_0
/*     */       //   6: aload_0
/*     */       //   7: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */       //   10: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   15: checkcast javafx/collections/ObservableSet
/*     */       //   18: putfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   21: aload_0
/*     */       //   22: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   25: aload_1
/*     */       //   26: if_acmpeq -> 257
/*     */       //   29: new com/sun/javafx/binding/SetExpressionHelper$SimpleChange
/*     */       //   32: dup
/*     */       //   33: aload_0
/*     */       //   34: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */       //   37: invokespecial <init> : (Ljavafx/collections/ObservableSet;)V
/*     */       //   40: astore_2
/*     */       //   41: aload_0
/*     */       //   42: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   45: ifnonnull -> 93
/*     */       //   48: aload_1
/*     */       //   49: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   54: astore_3
/*     */       //   55: aload_3
/*     */       //   56: invokeinterface hasNext : ()Z
/*     */       //   61: ifeq -> 90
/*     */       //   64: aload_3
/*     */       //   65: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   70: astore #4
/*     */       //   72: aload_0
/*     */       //   73: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */       //   76: aload_2
/*     */       //   77: aload #4
/*     */       //   79: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   82: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   87: goto -> 55
/*     */       //   90: goto -> 257
/*     */       //   93: aload_1
/*     */       //   94: ifnonnull -> 145
/*     */       //   97: aload_0
/*     */       //   98: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   101: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   106: astore_3
/*     */       //   107: aload_3
/*     */       //   108: invokeinterface hasNext : ()Z
/*     */       //   113: ifeq -> 142
/*     */       //   116: aload_3
/*     */       //   117: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   122: astore #4
/*     */       //   124: aload_0
/*     */       //   125: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */       //   128: aload_2
/*     */       //   129: aload #4
/*     */       //   131: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   134: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   139: goto -> 107
/*     */       //   142: goto -> 257
/*     */       //   145: aload_1
/*     */       //   146: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   151: astore_3
/*     */       //   152: aload_3
/*     */       //   153: invokeinterface hasNext : ()Z
/*     */       //   158: ifeq -> 201
/*     */       //   161: aload_3
/*     */       //   162: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   167: astore #4
/*     */       //   169: aload_0
/*     */       //   170: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   173: aload #4
/*     */       //   175: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   180: ifne -> 198
/*     */       //   183: aload_0
/*     */       //   184: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */       //   187: aload_2
/*     */       //   188: aload #4
/*     */       //   190: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   193: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   198: goto -> 152
/*     */       //   201: aload_0
/*     */       //   202: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   205: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   210: astore_3
/*     */       //   211: aload_3
/*     */       //   212: invokeinterface hasNext : ()Z
/*     */       //   217: ifeq -> 257
/*     */       //   220: aload_3
/*     */       //   221: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   226: astore #4
/*     */       //   228: aload_1
/*     */       //   229: aload #4
/*     */       //   231: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   236: ifne -> 254
/*     */       //   239: aload_0
/*     */       //   240: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */       //   243: aload_2
/*     */       //   244: aload #4
/*     */       //   246: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   249: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   254: goto -> 211
/*     */       //   257: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #271	-> 0
/*     */       //   #272	-> 5
/*     */       //   #273	-> 21
/*     */       //   #274	-> 29
/*     */       //   #275	-> 41
/*     */       //   #276	-> 48
/*     */       //   #277	-> 72
/*     */       //   #278	-> 87
/*     */       //   #279	-> 93
/*     */       //   #280	-> 97
/*     */       //   #281	-> 124
/*     */       //   #282	-> 139
/*     */       //   #284	-> 145
/*     */       //   #285	-> 169
/*     */       //   #286	-> 183
/*     */       //   #288	-> 198
/*     */       //   #289	-> 201
/*     */       //   #290	-> 228
/*     */       //   #291	-> 239
/*     */       //   #293	-> 254
/*     */       //   #296	-> 257
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/* 300 */       this.listener.onChanged(new SetExpressionHelper.SimpleChange<>((ObservableSet<E>)this.observable, param1Change));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<E>
/*     */     extends SetExpressionHelper<E> {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private ChangeListener<? super ObservableSet<E>>[] changeListeners;
/*     */     private SetChangeListener<? super E>[] setChangeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private int setChangeSize;
/*     */     private boolean locked;
/*     */     private ObservableSet<E> currentValue;
/*     */     
/*     */     private Generic(ObservableSetValue<E> param1ObservableSetValue, InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 316 */       super(param1ObservableSetValue);
/* 317 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 318 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(ObservableSetValue<E> param1ObservableSetValue, ChangeListener<? super ObservableSet<E>> param1ChangeListener1, ChangeListener<? super ObservableSet<E>> param1ChangeListener2) {
/* 322 */       super(param1ObservableSetValue);
/* 323 */       this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { param1ChangeListener1, param1ChangeListener2 };
/* 324 */       this.changeSize = 2;
/* 325 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableSetValue<E> param1ObservableSetValue, SetChangeListener<? super E> param1SetChangeListener1, SetChangeListener<? super E> param1SetChangeListener2) {
/* 329 */       super(param1ObservableSetValue);
/* 330 */       this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener1, param1SetChangeListener2 };
/* 331 */       this.setChangeSize = 2;
/* 332 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableSetValue<E> param1ObservableSetValue, InvalidationListener param1InvalidationListener, ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 336 */       super(param1ObservableSetValue);
/* 337 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 338 */       this.invalidationSize = 1;
/* 339 */       this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { param1ChangeListener };
/* 340 */       this.changeSize = 1;
/* 341 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableSetValue<E> param1ObservableSetValue, InvalidationListener param1InvalidationListener, SetChangeListener<? super E> param1SetChangeListener) {
/* 345 */       super(param1ObservableSetValue);
/* 346 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 347 */       this.invalidationSize = 1;
/* 348 */       this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener };
/* 349 */       this.setChangeSize = 1;
/* 350 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */     
/*     */     private Generic(ObservableSetValue<E> param1ObservableSetValue, ChangeListener<? super ObservableSet<E>> param1ChangeListener, SetChangeListener<? super E> param1SetChangeListener) {
/* 354 */       super(param1ObservableSetValue);
/* 355 */       this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { param1ChangeListener };
/* 356 */       this.changeSize = 1;
/* 357 */       this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener };
/* 358 */       this.setChangeSize = 1;
/* 359 */       this.currentValue = (ObservableSet<E>)param1ObservableSetValue.getValue();
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 364 */       if (this.invalidationListeners == null) {
/* 365 */         this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 366 */         this.invalidationSize = 1;
/*     */       } else {
/* 368 */         int i = this.invalidationListeners.length;
/* 369 */         if (this.locked) {
/* 370 */           int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 371 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 372 */         } else if (this.invalidationSize == i) {
/* 373 */           this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 374 */           if (this.invalidationSize == i) {
/* 375 */             int j = i * 3 / 2 + 1;
/* 376 */             this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */           } 
/*     */         } 
/* 379 */         this.invalidationListeners[this.invalidationSize++] = param1InvalidationListener;
/*     */       } 
/* 381 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 386 */       if (this.invalidationListeners != null) {
/* 387 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 388 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 389 */             if (this.invalidationSize == 1) {
/* 390 */               if (this.changeSize == 1 && this.setChangeSize == 0)
/* 391 */                 return new SetExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]); 
/* 392 */               if (this.changeSize == 0 && this.setChangeSize == 1) {
/* 393 */                 return new SetExpressionHelper.SingleSetChange<>(this.observable, this.setChangeListeners[0]);
/*     */               }
/* 395 */               this.invalidationListeners = null;
/* 396 */               this.invalidationSize = 0; break;
/* 397 */             }  if (this.invalidationSize == 2 && this.changeSize == 0 && this.setChangeSize == 0) {
/* 398 */               return new SetExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */             }
/* 400 */             int i = this.invalidationSize - b - 1;
/* 401 */             InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 402 */             if (this.locked) {
/* 403 */               this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 404 */               System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */             } 
/* 406 */             if (i > 0) {
/* 407 */               System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */             }
/* 409 */             this.invalidationSize--;
/* 410 */             if (!this.locked) {
/* 411 */               this.invalidationListeners[this.invalidationSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 418 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 423 */       if (this.changeListeners == null) {
/* 424 */         this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[] { param1ChangeListener };
/* 425 */         this.changeSize = 1;
/*     */       } else {
/* 427 */         int i = this.changeListeners.length;
/* 428 */         if (this.locked) {
/* 429 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 430 */           this.changeListeners = Arrays.<ChangeListener<? super ObservableSet<E>>>copyOf(this.changeListeners, j);
/* 431 */         } else if (this.changeSize == i) {
/* 432 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 433 */           if (this.changeSize == i) {
/* 434 */             int j = i * 3 / 2 + 1;
/* 435 */             this.changeListeners = Arrays.<ChangeListener<? super ObservableSet<E>>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 438 */         this.changeListeners[this.changeSize++] = param1ChangeListener;
/*     */       } 
/* 440 */       if (this.changeSize == 1) {
/* 441 */         this.currentValue = (ObservableSet<E>)this.observable.getValue();
/*     */       }
/* 443 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> param1ChangeListener) {
/* 448 */       if (this.changeListeners != null) {
/* 449 */         for (byte b = 0; b < this.changeSize; b++) {
/* 450 */           if (param1ChangeListener.equals(this.changeListeners[b])) {
/* 451 */             if (this.changeSize == 1) {
/* 452 */               if (this.invalidationSize == 1 && this.setChangeSize == 0)
/* 453 */                 return new SetExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 454 */               if (this.invalidationSize == 0 && this.setChangeSize == 1) {
/* 455 */                 return new SetExpressionHelper.SingleSetChange<>(this.observable, this.setChangeListeners[0]);
/*     */               }
/* 457 */               this.changeListeners = null;
/* 458 */               this.changeSize = 0; break;
/* 459 */             }  if (this.changeSize == 2 && this.invalidationSize == 0 && this.setChangeSize == 0) {
/* 460 */               return new SetExpressionHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */             }
/* 462 */             int i = this.changeSize - b - 1;
/* 463 */             ChangeListener<? super ObservableSet<E>>[] arrayOfChangeListener = this.changeListeners;
/* 464 */             if (this.locked) {
/* 465 */               this.changeListeners = (ChangeListener<? super ObservableSet<E>>[])new ChangeListener[this.changeListeners.length];
/* 466 */               System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */             } 
/* 468 */             if (i > 0) {
/* 469 */               System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */             }
/* 471 */             this.changeSize--;
/* 472 */             if (!this.locked) {
/* 473 */               this.changeListeners[this.changeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 480 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 485 */       if (this.setChangeListeners == null) {
/* 486 */         this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener };
/* 487 */         this.setChangeSize = 1;
/*     */       } else {
/* 489 */         int i = this.setChangeListeners.length;
/* 490 */         if (this.locked) {
/* 491 */           int j = (this.setChangeSize < i) ? i : (i * 3 / 2 + 1);
/* 492 */           this.setChangeListeners = Arrays.<SetChangeListener<? super E>>copyOf(this.setChangeListeners, j);
/* 493 */         } else if (this.setChangeSize == i) {
/* 494 */           this.setChangeSize = trim(this.setChangeSize, (Object[])this.setChangeListeners);
/* 495 */           if (this.setChangeSize == i) {
/* 496 */             int j = i * 3 / 2 + 1;
/* 497 */             this.setChangeListeners = Arrays.<SetChangeListener<? super E>>copyOf(this.setChangeListeners, j);
/*     */           } 
/*     */         } 
/* 500 */         this.setChangeListeners[this.setChangeSize++] = param1SetChangeListener;
/*     */       } 
/* 502 */       if (this.setChangeSize == 1) {
/* 503 */         this.currentValue = (ObservableSet<E>)this.observable.getValue();
/*     */       }
/* 505 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 510 */       if (this.setChangeListeners != null) {
/* 511 */         for (byte b = 0; b < this.setChangeSize; b++) {
/* 512 */           if (param1SetChangeListener.equals(this.setChangeListeners[b])) {
/* 513 */             if (this.setChangeSize == 1) {
/* 514 */               if (this.invalidationSize == 1 && this.changeSize == 0)
/* 515 */                 return new SetExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]); 
/* 516 */               if (this.invalidationSize == 0 && this.changeSize == 1) {
/* 517 */                 return new SetExpressionHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */               }
/* 519 */               this.setChangeListeners = null;
/* 520 */               this.setChangeSize = 0; break;
/* 521 */             }  if (this.setChangeSize == 2 && this.invalidationSize == 0 && this.changeSize == 0) {
/* 522 */               return new SetExpressionHelper.SingleSetChange<>(this.observable, this.setChangeListeners[1 - b]);
/*     */             }
/* 524 */             int i = this.setChangeSize - b - 1;
/* 525 */             SetChangeListener<? super E>[] arrayOfSetChangeListener = this.setChangeListeners;
/* 526 */             if (this.locked) {
/* 527 */               this.setChangeListeners = (SetChangeListener<? super E>[])new SetChangeListener[this.setChangeListeners.length];
/* 528 */               System.arraycopy(arrayOfSetChangeListener, 0, this.setChangeListeners, 0, b + 1);
/*     */             } 
/* 530 */             if (i > 0) {
/* 531 */               System.arraycopy(arrayOfSetChangeListener, b + 1, this.setChangeListeners, b, i);
/*     */             }
/* 533 */             this.setChangeSize--;
/* 534 */             if (!this.locked) {
/* 535 */               this.setChangeListeners[this.setChangeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 542 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 547 */       if (this.changeSize == 0 && this.setChangeSize == 0) {
/* 548 */         notifyListeners(this.currentValue, (SetExpressionHelper.SimpleChange<E>)null);
/*     */       } else {
/* 550 */         ObservableSet<E> observableSet = this.currentValue;
/* 551 */         this.currentValue = (ObservableSet<E>)this.observable.getValue();
/* 552 */         notifyListeners(observableSet, (SetExpressionHelper.SimpleChange<E>)null);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/* 558 */       SetExpressionHelper.SimpleChange<E> simpleChange = (this.setChangeSize == 0) ? null : new SetExpressionHelper.SimpleChange<>((ObservableSet<E>)this.observable, param1Change);
/* 559 */       notifyListeners(this.currentValue, simpleChange);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private void notifyListeners(ObservableSet<E> param1ObservableSet, SetExpressionHelper.SimpleChange<E> param1SimpleChange) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield invalidationListeners : [Ljavafx/beans/InvalidationListener;
/*     */       //   4: astore_3
/*     */       //   5: aload_0
/*     */       //   6: getfield invalidationSize : I
/*     */       //   9: istore #4
/*     */       //   11: aload_0
/*     */       //   12: getfield changeListeners : [Ljavafx/beans/value/ChangeListener;
/*     */       //   15: astore #5
/*     */       //   17: aload_0
/*     */       //   18: getfield changeSize : I
/*     */       //   21: istore #6
/*     */       //   23: aload_0
/*     */       //   24: getfield setChangeListeners : [Ljavafx/collections/SetChangeListener;
/*     */       //   27: astore #7
/*     */       //   29: aload_0
/*     */       //   30: getfield setChangeSize : I
/*     */       //   33: istore #8
/*     */       //   35: aload_0
/*     */       //   36: iconst_1
/*     */       //   37: putfield locked : Z
/*     */       //   40: iconst_0
/*     */       //   41: istore #9
/*     */       //   43: iload #9
/*     */       //   45: iload #4
/*     */       //   47: if_icmpge -> 69
/*     */       //   50: aload_3
/*     */       //   51: iload #9
/*     */       //   53: aaload
/*     */       //   54: aload_0
/*     */       //   55: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */       //   58: invokeinterface invalidated : (Ljavafx/beans/Observable;)V
/*     */       //   63: iinc #9, 1
/*     */       //   66: goto -> 43
/*     */       //   69: aload_0
/*     */       //   70: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   73: aload_1
/*     */       //   74: if_acmpne -> 81
/*     */       //   77: aload_2
/*     */       //   78: ifnull -> 471
/*     */       //   81: iconst_0
/*     */       //   82: istore #9
/*     */       //   84: iload #9
/*     */       //   86: iload #6
/*     */       //   88: if_icmpge -> 116
/*     */       //   91: aload #5
/*     */       //   93: iload #9
/*     */       //   95: aaload
/*     */       //   96: aload_0
/*     */       //   97: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */       //   100: aload_1
/*     */       //   101: aload_0
/*     */       //   102: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   105: invokeinterface changed : (Ljavafx/beans/value/ObservableValue;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   110: iinc #9, 1
/*     */       //   113: goto -> 84
/*     */       //   116: iload #8
/*     */       //   118: ifle -> 471
/*     */       //   121: aload_2
/*     */       //   122: ifnull -> 155
/*     */       //   125: iconst_0
/*     */       //   126: istore #9
/*     */       //   128: iload #9
/*     */       //   130: iload #8
/*     */       //   132: if_icmpge -> 152
/*     */       //   135: aload #7
/*     */       //   137: iload #9
/*     */       //   139: aaload
/*     */       //   140: aload_2
/*     */       //   141: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   146: iinc #9, 1
/*     */       //   149: goto -> 128
/*     */       //   152: goto -> 471
/*     */       //   155: new com/sun/javafx/binding/SetExpressionHelper$SimpleChange
/*     */       //   158: dup
/*     */       //   159: aload_0
/*     */       //   160: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */       //   163: invokespecial <init> : (Ljavafx/collections/ObservableSet;)V
/*     */       //   166: astore_2
/*     */       //   167: aload_0
/*     */       //   168: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   171: ifnonnull -> 241
/*     */       //   174: aload_1
/*     */       //   175: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   180: astore #9
/*     */       //   182: aload #9
/*     */       //   184: invokeinterface hasNext : ()Z
/*     */       //   189: ifeq -> 238
/*     */       //   192: aload #9
/*     */       //   194: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   199: astore #10
/*     */       //   201: aload_2
/*     */       //   202: aload #10
/*     */       //   204: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   207: pop
/*     */       //   208: iconst_0
/*     */       //   209: istore #11
/*     */       //   211: iload #11
/*     */       //   213: iload #8
/*     */       //   215: if_icmpge -> 235
/*     */       //   218: aload #7
/*     */       //   220: iload #11
/*     */       //   222: aaload
/*     */       //   223: aload_2
/*     */       //   224: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   229: iinc #11, 1
/*     */       //   232: goto -> 211
/*     */       //   235: goto -> 182
/*     */       //   238: goto -> 471
/*     */       //   241: aload_1
/*     */       //   242: ifnonnull -> 315
/*     */       //   245: aload_0
/*     */       //   246: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   249: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   254: astore #9
/*     */       //   256: aload #9
/*     */       //   258: invokeinterface hasNext : ()Z
/*     */       //   263: ifeq -> 312
/*     */       //   266: aload #9
/*     */       //   268: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   273: astore #10
/*     */       //   275: aload_2
/*     */       //   276: aload #10
/*     */       //   278: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   281: pop
/*     */       //   282: iconst_0
/*     */       //   283: istore #11
/*     */       //   285: iload #11
/*     */       //   287: iload #8
/*     */       //   289: if_icmpge -> 309
/*     */       //   292: aload #7
/*     */       //   294: iload #11
/*     */       //   296: aaload
/*     */       //   297: aload_2
/*     */       //   298: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   303: iinc #11, 1
/*     */       //   306: goto -> 285
/*     */       //   309: goto -> 256
/*     */       //   312: goto -> 471
/*     */       //   315: aload_1
/*     */       //   316: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   321: astore #9
/*     */       //   323: aload #9
/*     */       //   325: invokeinterface hasNext : ()Z
/*     */       //   330: ifeq -> 393
/*     */       //   333: aload #9
/*     */       //   335: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   340: astore #10
/*     */       //   342: aload_0
/*     */       //   343: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   346: aload #10
/*     */       //   348: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   353: ifne -> 390
/*     */       //   356: aload_2
/*     */       //   357: aload #10
/*     */       //   359: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   362: pop
/*     */       //   363: iconst_0
/*     */       //   364: istore #11
/*     */       //   366: iload #11
/*     */       //   368: iload #8
/*     */       //   370: if_icmpge -> 390
/*     */       //   373: aload #7
/*     */       //   375: iload #11
/*     */       //   377: aaload
/*     */       //   378: aload_2
/*     */       //   379: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   384: iinc #11, 1
/*     */       //   387: goto -> 366
/*     */       //   390: goto -> 323
/*     */       //   393: aload_0
/*     */       //   394: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */       //   397: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   402: astore #9
/*     */       //   404: aload #9
/*     */       //   406: invokeinterface hasNext : ()Z
/*     */       //   411: ifeq -> 471
/*     */       //   414: aload #9
/*     */       //   416: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   421: astore #10
/*     */       //   423: aload_1
/*     */       //   424: aload #10
/*     */       //   426: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   431: ifne -> 468
/*     */       //   434: aload_2
/*     */       //   435: aload #10
/*     */       //   437: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */       //   440: pop
/*     */       //   441: iconst_0
/*     */       //   442: istore #11
/*     */       //   444: iload #11
/*     */       //   446: iload #8
/*     */       //   448: if_icmpge -> 468
/*     */       //   451: aload #7
/*     */       //   453: iload #11
/*     */       //   455: aaload
/*     */       //   456: aload_2
/*     */       //   457: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */       //   462: iinc #11, 1
/*     */       //   465: goto -> 444
/*     */       //   468: goto -> 404
/*     */       //   471: aload_0
/*     */       //   472: iconst_0
/*     */       //   473: putfield locked : Z
/*     */       //   476: goto -> 489
/*     */       //   479: astore #12
/*     */       //   481: aload_0
/*     */       //   482: iconst_0
/*     */       //   483: putfield locked : Z
/*     */       //   486: aload #12
/*     */       //   488: athrow
/*     */       //   489: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #563	-> 0
/*     */       //   #564	-> 5
/*     */       //   #565	-> 11
/*     */       //   #566	-> 17
/*     */       //   #567	-> 23
/*     */       //   #568	-> 29
/*     */       //   #570	-> 35
/*     */       //   #571	-> 40
/*     */       //   #572	-> 50
/*     */       //   #571	-> 63
/*     */       //   #574	-> 69
/*     */       //   #575	-> 81
/*     */       //   #576	-> 91
/*     */       //   #575	-> 110
/*     */       //   #578	-> 116
/*     */       //   #579	-> 121
/*     */       //   #580	-> 125
/*     */       //   #581	-> 135
/*     */       //   #580	-> 146
/*     */       //   #584	-> 155
/*     */       //   #585	-> 167
/*     */       //   #586	-> 174
/*     */       //   #587	-> 201
/*     */       //   #588	-> 208
/*     */       //   #589	-> 218
/*     */       //   #588	-> 229
/*     */       //   #591	-> 235
/*     */       //   #592	-> 241
/*     */       //   #593	-> 245
/*     */       //   #594	-> 275
/*     */       //   #595	-> 282
/*     */       //   #596	-> 292
/*     */       //   #595	-> 303
/*     */       //   #598	-> 309
/*     */       //   #600	-> 315
/*     */       //   #601	-> 342
/*     */       //   #602	-> 356
/*     */       //   #603	-> 363
/*     */       //   #604	-> 373
/*     */       //   #603	-> 384
/*     */       //   #607	-> 390
/*     */       //   #608	-> 393
/*     */       //   #609	-> 423
/*     */       //   #610	-> 434
/*     */       //   #611	-> 441
/*     */       //   #612	-> 451
/*     */       //   #611	-> 462
/*     */       //   #615	-> 468
/*     */       //   #622	-> 471
/*     */       //   #623	-> 476
/*     */       //   #622	-> 479
/*     */       //   #623	-> 486
/*     */       //   #624	-> 489
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   35	471	479	finally
/*     */       //   479	481	479	finally
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class SimpleChange<E>
/*     */     extends SetChangeListener.Change<E>
/*     */   {
/*     */     private E old;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private E added;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean addOp;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public SimpleChange(ObservableSet<E> param1ObservableSet) {
/* 635 */       super(param1ObservableSet);
/*     */     }
/*     */     
/*     */     public SimpleChange(ObservableSet<E> param1ObservableSet, SetChangeListener.Change<? extends E> param1Change) {
/* 639 */       super(param1ObservableSet);
/* 640 */       this.old = (E)param1Change.getElementRemoved();
/* 641 */       this.added = (E)param1Change.getElementAdded();
/* 642 */       this.addOp = param1Change.wasAdded();
/*     */     }
/*     */     
/*     */     public SimpleChange<E> setRemoved(E param1E) {
/* 646 */       this.old = param1E;
/* 647 */       this.added = null;
/* 648 */       this.addOp = false;
/* 649 */       return this;
/*     */     }
/*     */     
/*     */     public SimpleChange<E> setAdded(E param1E) {
/* 653 */       this.old = null;
/* 654 */       this.added = param1E;
/* 655 */       this.addOp = true;
/* 656 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasAdded() {
/* 661 */       return this.addOp;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasRemoved() {
/* 666 */       return !this.addOp;
/*     */     }
/*     */ 
/*     */     
/*     */     public E getElementAdded() {
/* 671 */       return this.added;
/*     */     }
/*     */ 
/*     */     
/*     */     public E getElementRemoved() {
/* 676 */       return this.old;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 681 */       return this.addOp ? ("added " + String.valueOf(this.added)) : ("removed " + String.valueOf(this.old));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SetExpressionHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */