/*     */ package com.sun.javafx.binding;
/*     */ 
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
/*     */ class SingleSetChange<E>
/*     */   extends SetExpressionHelper<E>
/*     */ {
/*     */   private final SetChangeListener<? super E> listener;
/*     */   private ObservableSet<E> currentValue;
/*     */   
/*     */   private SingleSetChange(ObservableSetValue<E> paramObservableSetValue, SetChangeListener<? super E> paramSetChangeListener) {
/* 234 */     super(paramObservableSetValue);
/* 235 */     this.listener = paramSetChangeListener;
/* 236 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 241 */     return new SetExpressionHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 246 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 251 */     return new SetExpressionHelper.Generic<>(this.observable, paramChangeListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 256 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 261 */     return new SetExpressionHelper.Generic<>(this.observable, this.listener, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 266 */     return paramSetChangeListener.equals(this.listener) ? null : this;
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
/*     */   
/*     */   protected void fireValueChangedEvent() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   4: astore_1
/*     */     //   5: aload_0
/*     */     //   6: aload_0
/*     */     //   7: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */     //   10: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   15: checkcast javafx/collections/ObservableSet
/*     */     //   18: putfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   21: aload_0
/*     */     //   22: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   25: aload_1
/*     */     //   26: if_acmpeq -> 257
/*     */     //   29: new com/sun/javafx/binding/SetExpressionHelper$SimpleChange
/*     */     //   32: dup
/*     */     //   33: aload_0
/*     */     //   34: getfield observable : Ljavafx/beans/value/ObservableSetValue;
/*     */     //   37: invokespecial <init> : (Ljavafx/collections/ObservableSet;)V
/*     */     //   40: astore_2
/*     */     //   41: aload_0
/*     */     //   42: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   45: ifnonnull -> 93
/*     */     //   48: aload_1
/*     */     //   49: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   54: astore_3
/*     */     //   55: aload_3
/*     */     //   56: invokeinterface hasNext : ()Z
/*     */     //   61: ifeq -> 90
/*     */     //   64: aload_3
/*     */     //   65: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   70: astore #4
/*     */     //   72: aload_0
/*     */     //   73: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */     //   76: aload_2
/*     */     //   77: aload #4
/*     */     //   79: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   82: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   87: goto -> 55
/*     */     //   90: goto -> 257
/*     */     //   93: aload_1
/*     */     //   94: ifnonnull -> 145
/*     */     //   97: aload_0
/*     */     //   98: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   101: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   106: astore_3
/*     */     //   107: aload_3
/*     */     //   108: invokeinterface hasNext : ()Z
/*     */     //   113: ifeq -> 142
/*     */     //   116: aload_3
/*     */     //   117: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   122: astore #4
/*     */     //   124: aload_0
/*     */     //   125: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */     //   128: aload_2
/*     */     //   129: aload #4
/*     */     //   131: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   134: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   139: goto -> 107
/*     */     //   142: goto -> 257
/*     */     //   145: aload_1
/*     */     //   146: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   151: astore_3
/*     */     //   152: aload_3
/*     */     //   153: invokeinterface hasNext : ()Z
/*     */     //   158: ifeq -> 201
/*     */     //   161: aload_3
/*     */     //   162: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   167: astore #4
/*     */     //   169: aload_0
/*     */     //   170: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   173: aload #4
/*     */     //   175: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   180: ifne -> 198
/*     */     //   183: aload_0
/*     */     //   184: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */     //   187: aload_2
/*     */     //   188: aload #4
/*     */     //   190: invokevirtual setRemoved : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   193: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   198: goto -> 152
/*     */     //   201: aload_0
/*     */     //   202: getfield currentValue : Ljavafx/collections/ObservableSet;
/*     */     //   205: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   210: astore_3
/*     */     //   211: aload_3
/*     */     //   212: invokeinterface hasNext : ()Z
/*     */     //   217: ifeq -> 257
/*     */     //   220: aload_3
/*     */     //   221: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   226: astore #4
/*     */     //   228: aload_1
/*     */     //   229: aload #4
/*     */     //   231: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   236: ifne -> 254
/*     */     //   239: aload_0
/*     */     //   240: getfield listener : Ljavafx/collections/SetChangeListener;
/*     */     //   243: aload_2
/*     */     //   244: aload #4
/*     */     //   246: invokevirtual setAdded : (Ljava/lang/Object;)Lcom/sun/javafx/binding/SetExpressionHelper$SimpleChange;
/*     */     //   249: invokeinterface onChanged : (Ljavafx/collections/SetChangeListener$Change;)V
/*     */     //   254: goto -> 211
/*     */     //   257: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #271	-> 0
/*     */     //   #272	-> 5
/*     */     //   #273	-> 21
/*     */     //   #274	-> 29
/*     */     //   #275	-> 41
/*     */     //   #276	-> 48
/*     */     //   #277	-> 72
/*     */     //   #278	-> 87
/*     */     //   #279	-> 93
/*     */     //   #280	-> 97
/*     */     //   #281	-> 124
/*     */     //   #282	-> 139
/*     */     //   #284	-> 145
/*     */     //   #285	-> 169
/*     */     //   #286	-> 183
/*     */     //   #288	-> 198
/*     */     //   #289	-> 201
/*     */     //   #290	-> 228
/*     */     //   #291	-> 239
/*     */     //   #293	-> 254
/*     */     //   #296	-> 257
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
/*     */   
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/* 300 */     this.listener.onChanged(new SetExpressionHelper.SimpleChange<>((ObservableSet<E>)this.observable, paramChange));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SetExpressionHelper$SingleSetChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */