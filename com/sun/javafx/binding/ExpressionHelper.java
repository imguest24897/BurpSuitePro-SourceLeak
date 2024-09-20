/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ExpressionHelper<T>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   protected final ObservableValue<T> observable;
/*     */   
/*     */   public static <T> ExpressionHelper<T> addListener(ExpressionHelper<T> paramExpressionHelper, ObservableValue<T> paramObservableValue, InvalidationListener paramInvalidationListener) {
/*  61 */     if (paramObservableValue == null || paramInvalidationListener == null) {
/*  62 */       throw new NullPointerException();
/*     */     }
/*  64 */     paramObservableValue.getValue();
/*  65 */     return (paramExpressionHelper == null) ? new SingleInvalidation<>(paramObservableValue, paramInvalidationListener) : paramExpressionHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <T> ExpressionHelper<T> removeListener(ExpressionHelper<T> paramExpressionHelper, InvalidationListener paramInvalidationListener) {
/*  69 */     if (paramInvalidationListener == null) {
/*  70 */       throw new NullPointerException();
/*     */     }
/*  72 */     return (paramExpressionHelper == null) ? null : paramExpressionHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <T> ExpressionHelper<T> addListener(ExpressionHelper<T> paramExpressionHelper, ObservableValue<T> paramObservableValue, ChangeListener<? super T> paramChangeListener) {
/*  76 */     if (paramObservableValue == null || paramChangeListener == null) {
/*  77 */       throw new NullPointerException();
/*     */     }
/*  79 */     return (paramExpressionHelper == null) ? new SingleChange<>(paramObservableValue, (T)paramObservableValue.getValue(), paramChangeListener) : paramExpressionHelper.addListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <T> ExpressionHelper<T> removeListener(ExpressionHelper<T> paramExpressionHelper, ChangeListener<? super T> paramChangeListener) {
/*  83 */     if (paramChangeListener == null) {
/*  84 */       throw new NullPointerException();
/*     */     }
/*  86 */     return (paramExpressionHelper == null) ? null : paramExpressionHelper.removeListener(paramChangeListener);
/*     */   }
/*     */   
/*     */   public static <T> void fireValueChangedEvent(ExpressionHelper<T> paramExpressionHelper) {
/*  90 */     if (paramExpressionHelper != null) {
/*  91 */       paramExpressionHelper.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ExpressionHelper(ObservableValue<T> paramObservableValue) {
/* 101 */     this.observable = paramObservableValue;
/*     */   }
/*     */   
/*     */   protected abstract ExpressionHelper<T> addListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract ExpressionHelper<T> removeListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract ExpressionHelper<T> addListener(ChangeListener<? super T> paramChangeListener);
/*     */   
/*     */   protected abstract ExpressionHelper<T> removeListener(ChangeListener<? super T> paramChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent();
/*     */   
/*     */   private static class SingleInvalidation<T>
/*     */     extends ExpressionHelper<T>
/*     */   {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(ObservableValue<T> param1ObservableValue, InvalidationListener param1InvalidationListener) {
/* 120 */       super(param1ObservableValue);
/* 121 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> addListener(InvalidationListener param1InvalidationListener) {
/* 126 */       return new ExpressionHelper.Generic<>(this.observable, this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> removeListener(InvalidationListener param1InvalidationListener) {
/* 131 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> addListener(ChangeListener<? super T> param1ChangeListener) {
/* 136 */       return new ExpressionHelper.Generic<>(this.observable, (T)this.observable.getValue(), this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> removeListener(ChangeListener<? super T> param1ChangeListener) {
/* 141 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/*     */       try {
/* 147 */         this.listener.invalidated((Observable)this.observable);
/* 148 */       } catch (Exception exception) {
/* 149 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<T>
/*     */     extends ExpressionHelper<T> {
/*     */     private final ChangeListener<? super T> listener;
/*     */     private T currentValue;
/*     */     
/*     */     private SingleChange(ObservableValue<T> param1ObservableValue, T param1T, ChangeListener<? super T> param1ChangeListener) {
/* 160 */       super(param1ObservableValue);
/* 161 */       this.listener = param1ChangeListener;
/* 162 */       this.currentValue = param1T;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> addListener(InvalidationListener param1InvalidationListener) {
/* 167 */       return new ExpressionHelper.Generic<>(this.observable, this.currentValue, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> removeListener(InvalidationListener param1InvalidationListener) {
/* 172 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> addListener(ChangeListener<? super T> param1ChangeListener) {
/* 177 */       return new ExpressionHelper.Generic<>(this.observable, this.currentValue, this.listener, param1ChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> removeListener(ChangeListener<? super T> param1ChangeListener) {
/* 182 */       return param1ChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 187 */       T t = this.currentValue;
/* 188 */       this.currentValue = (T)this.observable.getValue();
/* 189 */       boolean bool = (this.currentValue == null) ? ((t != null) ? true : false) : (!this.currentValue.equals(t) ? true : false);
/* 190 */       if (bool)
/*     */         try {
/* 192 */           this.listener.changed(this.observable, t, this.currentValue);
/* 193 */         } catch (Exception exception) {
/* 194 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         }  
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<T>
/*     */     extends ExpressionHelper<T>
/*     */   {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private ChangeListener<? super T>[] changeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private boolean locked;
/*     */     private T currentValue;
/*     */     
/*     */     private Generic(ObservableValue<T> param1ObservableValue, InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 210 */       super(param1ObservableValue);
/* 211 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 212 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(ObservableValue<T> param1ObservableValue, T param1T, ChangeListener<? super T> param1ChangeListener1, ChangeListener<? super T> param1ChangeListener2) {
/* 216 */       super(param1ObservableValue);
/* 217 */       this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[] { param1ChangeListener1, param1ChangeListener2 };
/* 218 */       this.changeSize = 2;
/* 219 */       this.currentValue = param1T;
/*     */     }
/*     */     
/*     */     private Generic(ObservableValue<T> param1ObservableValue, T param1T, InvalidationListener param1InvalidationListener, ChangeListener<? super T> param1ChangeListener) {
/* 223 */       super(param1ObservableValue);
/* 224 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 225 */       this.invalidationSize = 1;
/* 226 */       this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[] { param1ChangeListener };
/* 227 */       this.changeSize = 1;
/* 228 */       this.currentValue = param1T;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Generic<T> addListener(InvalidationListener param1InvalidationListener) {
/* 233 */       if (this.invalidationListeners == null) {
/* 234 */         this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 235 */         this.invalidationSize = 1;
/*     */       } else {
/* 237 */         int i = this.invalidationListeners.length;
/* 238 */         if (this.locked) {
/* 239 */           int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 240 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 241 */         } else if (this.invalidationSize == i) {
/* 242 */           this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 243 */           if (this.invalidationSize == i) {
/* 244 */             int j = i * 3 / 2 + 1;
/* 245 */             this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */           } 
/*     */         } 
/* 248 */         this.invalidationListeners[this.invalidationSize++] = param1InvalidationListener;
/*     */       } 
/* 250 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> removeListener(InvalidationListener param1InvalidationListener) {
/* 255 */       if (this.invalidationListeners != null) {
/* 256 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 257 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 258 */             if (this.invalidationSize == 1) {
/* 259 */               if (this.changeSize == 1) {
/* 260 */                 return new ExpressionHelper.SingleChange<>(this.observable, this.currentValue, this.changeListeners[0]);
/*     */               }
/* 262 */               this.invalidationListeners = null;
/* 263 */               this.invalidationSize = 0; break;
/* 264 */             }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 265 */               return new ExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */             }
/* 267 */             int i = this.invalidationSize - b - 1;
/* 268 */             InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 269 */             if (this.locked) {
/* 270 */               this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 271 */               System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b);
/*     */             } 
/* 273 */             if (i > 0) {
/* 274 */               System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */             }
/* 276 */             this.invalidationSize--;
/* 277 */             if (!this.locked) {
/* 278 */               this.invalidationListeners[this.invalidationSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 285 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> addListener(ChangeListener<? super T> param1ChangeListener) {
/* 290 */       if (this.changeListeners == null) {
/* 291 */         this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[] { param1ChangeListener };
/* 292 */         this.changeSize = 1;
/*     */       } else {
/* 294 */         int i = this.changeListeners.length;
/* 295 */         if (this.locked) {
/* 296 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 297 */           this.changeListeners = Arrays.<ChangeListener<? super T>>copyOf(this.changeListeners, j);
/* 298 */         } else if (this.changeSize == i) {
/* 299 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 300 */           if (this.changeSize == i) {
/* 301 */             int j = i * 3 / 2 + 1;
/* 302 */             this.changeListeners = Arrays.<ChangeListener<? super T>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 305 */         this.changeListeners[this.changeSize++] = param1ChangeListener;
/*     */       } 
/* 307 */       if (this.changeSize == 1) {
/* 308 */         this.currentValue = (T)this.observable.getValue();
/*     */       }
/* 310 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ExpressionHelper<T> removeListener(ChangeListener<? super T> param1ChangeListener) {
/* 315 */       if (this.changeListeners != null) {
/* 316 */         for (byte b = 0; b < this.changeSize; b++) {
/* 317 */           if (param1ChangeListener.equals(this.changeListeners[b])) {
/* 318 */             if (this.changeSize == 1) {
/* 319 */               if (this.invalidationSize == 1) {
/* 320 */                 return new ExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]);
/*     */               }
/* 322 */               this.changeListeners = null;
/* 323 */               this.changeSize = 0;
/* 324 */               this.currentValue = null; break;
/* 325 */             }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 326 */               return new ExpressionHelper.SingleChange<>(this.observable, this.currentValue, this.changeListeners[1 - b]);
/*     */             }
/* 328 */             int i = this.changeSize - b - 1;
/* 329 */             ChangeListener<? super T>[] arrayOfChangeListener = this.changeListeners;
/* 330 */             if (this.locked) {
/* 331 */               this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[this.changeListeners.length];
/* 332 */               System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b);
/*     */             } 
/* 334 */             if (i > 0) {
/* 335 */               System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */             }
/* 337 */             this.changeSize--;
/* 338 */             if (!this.locked) {
/* 339 */               this.changeListeners[this.changeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 346 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 351 */       InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 352 */       int i = this.invalidationSize;
/* 353 */       ChangeListener<? super T>[] arrayOfChangeListener = this.changeListeners;
/* 354 */       int j = this.changeSize;
/*     */       
/*     */       try {
/* 357 */         this.locked = true;
/* 358 */         for (byte b = 0; b < i; b++) {
/*     */           try {
/* 360 */             arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/* 361 */           } catch (Exception exception) {
/* 362 */             Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */           } 
/*     */         } 
/* 365 */         if (j > 0) {
/* 366 */           T t = this.currentValue;
/* 367 */           this.currentValue = (T)this.observable.getValue();
/* 368 */           boolean bool = (this.currentValue == null) ? ((t != null) ? true : false) : (!this.currentValue.equals(t) ? true : false);
/* 369 */           if (bool) {
/* 370 */             for (byte b1 = 0; b1 < j; b1++) {
/*     */               try {
/* 372 */                 arrayOfChangeListener[b1].changed(this.observable, t, this.currentValue);
/* 373 */               } catch (Exception exception) {
/* 374 */                 Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } finally {
/* 380 */         this.locked = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ExpressionHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */