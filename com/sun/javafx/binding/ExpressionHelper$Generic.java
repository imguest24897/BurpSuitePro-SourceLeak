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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Generic<T>
/*     */   extends ExpressionHelper<T>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private ChangeListener<? super T>[] changeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private boolean locked;
/*     */   private T currentValue;
/*     */   
/*     */   private Generic(ObservableValue<T> paramObservableValue, InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 210 */     super(paramObservableValue);
/* 211 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 212 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(ObservableValue<T> paramObservableValue, T paramT, ChangeListener<? super T> paramChangeListener1, ChangeListener<? super T> paramChangeListener2) {
/* 216 */     super(paramObservableValue);
/* 217 */     this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[] { paramChangeListener1, paramChangeListener2 };
/* 218 */     this.changeSize = 2;
/* 219 */     this.currentValue = paramT;
/*     */   }
/*     */   
/*     */   private Generic(ObservableValue<T> paramObservableValue, T paramT, InvalidationListener paramInvalidationListener, ChangeListener<? super T> paramChangeListener) {
/* 223 */     super(paramObservableValue);
/* 224 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 225 */     this.invalidationSize = 1;
/* 226 */     this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[] { paramChangeListener };
/* 227 */     this.changeSize = 1;
/* 228 */     this.currentValue = paramT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Generic<T> addListener(InvalidationListener paramInvalidationListener) {
/* 233 */     if (this.invalidationListeners == null) {
/* 234 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 235 */       this.invalidationSize = 1;
/*     */     } else {
/* 237 */       int i = this.invalidationListeners.length;
/* 238 */       if (this.locked) {
/* 239 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 240 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 241 */       } else if (this.invalidationSize == i) {
/* 242 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 243 */         if (this.invalidationSize == i) {
/* 244 */           int j = i * 3 / 2 + 1;
/* 245 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 248 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 250 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> removeListener(InvalidationListener paramInvalidationListener) {
/* 255 */     if (this.invalidationListeners != null) {
/* 256 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 257 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 258 */           if (this.invalidationSize == 1) {
/* 259 */             if (this.changeSize == 1) {
/* 260 */               return new ExpressionHelper.SingleChange<>(this.observable, this.currentValue, this.changeListeners[0]);
/*     */             }
/* 262 */             this.invalidationListeners = null;
/* 263 */             this.invalidationSize = 0; break;
/* 264 */           }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 265 */             return new ExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */           }
/* 267 */           int i = this.invalidationSize - b - 1;
/* 268 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 269 */           if (this.locked) {
/* 270 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 271 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b);
/*     */           } 
/* 273 */           if (i > 0) {
/* 274 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 276 */           this.invalidationSize--;
/* 277 */           if (!this.locked) {
/* 278 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 285 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> addListener(ChangeListener<? super T> paramChangeListener) {
/* 290 */     if (this.changeListeners == null) {
/* 291 */       this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[] { paramChangeListener };
/* 292 */       this.changeSize = 1;
/*     */     } else {
/* 294 */       int i = this.changeListeners.length;
/* 295 */       if (this.locked) {
/* 296 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 297 */         this.changeListeners = Arrays.<ChangeListener<? super T>>copyOf(this.changeListeners, j);
/* 298 */       } else if (this.changeSize == i) {
/* 299 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 300 */         if (this.changeSize == i) {
/* 301 */           int j = i * 3 / 2 + 1;
/* 302 */           this.changeListeners = Arrays.<ChangeListener<? super T>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 305 */       this.changeListeners[this.changeSize++] = paramChangeListener;
/*     */     } 
/* 307 */     if (this.changeSize == 1) {
/* 308 */       this.currentValue = (T)this.observable.getValue();
/*     */     }
/* 310 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> removeListener(ChangeListener<? super T> paramChangeListener) {
/* 315 */     if (this.changeListeners != null) {
/* 316 */       for (byte b = 0; b < this.changeSize; b++) {
/* 317 */         if (paramChangeListener.equals(this.changeListeners[b])) {
/* 318 */           if (this.changeSize == 1) {
/* 319 */             if (this.invalidationSize == 1) {
/* 320 */               return new ExpressionHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]);
/*     */             }
/* 322 */             this.changeListeners = null;
/* 323 */             this.changeSize = 0;
/* 324 */             this.currentValue = null; break;
/* 325 */           }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 326 */             return new ExpressionHelper.SingleChange<>(this.observable, this.currentValue, this.changeListeners[1 - b]);
/*     */           }
/* 328 */           int i = this.changeSize - b - 1;
/* 329 */           ChangeListener<? super T>[] arrayOfChangeListener = this.changeListeners;
/* 330 */           if (this.locked) {
/* 331 */             this.changeListeners = (ChangeListener<? super T>[])new ChangeListener[this.changeListeners.length];
/* 332 */             System.arraycopy(arrayOfChangeListener, 0, this.changeListeners, 0, b);
/*     */           } 
/* 334 */           if (i > 0) {
/* 335 */             System.arraycopy(arrayOfChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 337 */           this.changeSize--;
/* 338 */           if (!this.locked) {
/* 339 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 346 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 351 */     InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 352 */     int i = this.invalidationSize;
/* 353 */     ChangeListener<? super T>[] arrayOfChangeListener = this.changeListeners;
/* 354 */     int j = this.changeSize;
/*     */     
/*     */     try {
/* 357 */       this.locked = true;
/* 358 */       for (byte b = 0; b < i; b++) {
/*     */         try {
/* 360 */           arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/* 361 */         } catch (Exception exception) {
/* 362 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/* 365 */       if (j > 0) {
/* 366 */         T t = this.currentValue;
/* 367 */         this.currentValue = (T)this.observable.getValue();
/* 368 */         boolean bool = (this.currentValue == null) ? ((t != null) ? true : false) : (!this.currentValue.equals(t) ? true : false);
/* 369 */         if (bool) {
/* 370 */           for (byte b1 = 0; b1 < j; b1++) {
/*     */             try {
/* 372 */               arrayOfChangeListener[b1].changed(this.observable, t, this.currentValue);
/* 373 */             } catch (Exception exception) {
/* 374 */               Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } 
/*     */     } finally {
/* 380 */       this.locked = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ExpressionHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */