/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.ArrayChangeListener;
/*     */ import javafx.collections.ObservableArray;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Generic<T extends ObservableArray<T>>
/*     */   extends ArrayListenerHelper<T>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private ArrayChangeListener<T>[] changeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private boolean locked;
/*     */   
/*     */   private Generic(T paramT, InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 185 */     super(paramT);
/* 186 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 187 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(T paramT, ArrayChangeListener<T> paramArrayChangeListener1, ArrayChangeListener<T> paramArrayChangeListener2) {
/* 191 */     super(paramT);
/* 192 */     this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[] { paramArrayChangeListener1, paramArrayChangeListener2 };
/* 193 */     this.changeSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(T paramT, InvalidationListener paramInvalidationListener, ArrayChangeListener<T> paramArrayChangeListener) {
/* 197 */     super(paramT);
/* 198 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 199 */     this.invalidationSize = 1;
/* 200 */     this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[] { paramArrayChangeListener };
/* 201 */     this.changeSize = 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Generic<T> addListener(InvalidationListener paramInvalidationListener) {
/* 206 */     if (this.invalidationListeners == null) {
/* 207 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 208 */       this.invalidationSize = 1;
/*     */     } else {
/* 210 */       int i = this.invalidationListeners.length;
/* 211 */       if (this.locked) {
/* 212 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 213 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 214 */       } else if (this.invalidationSize == i) {
/* 215 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 216 */         if (this.invalidationSize == i) {
/* 217 */           int j = i * 3 / 2 + 1;
/* 218 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 221 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 223 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> removeListener(InvalidationListener paramInvalidationListener) {
/* 228 */     if (this.invalidationListeners != null) {
/* 229 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 230 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 231 */           if (this.invalidationSize == 1) {
/* 232 */             if (this.changeSize == 1) {
/* 233 */               return new ArrayListenerHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */             }
/* 235 */             this.invalidationListeners = null;
/* 236 */             this.invalidationSize = 0; break;
/* 237 */           }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 238 */             return new ArrayListenerHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */           }
/* 240 */           int i = this.invalidationSize - b - 1;
/* 241 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 242 */           if (this.locked) {
/* 243 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 244 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */           } 
/* 246 */           if (i > 0) {
/* 247 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 249 */           this.invalidationSize--;
/* 250 */           if (!this.locked) {
/* 251 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 258 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> addListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 263 */     if (this.changeListeners == null) {
/* 264 */       this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[] { paramArrayChangeListener };
/* 265 */       this.changeSize = 1;
/*     */     } else {
/* 267 */       int i = this.changeListeners.length;
/* 268 */       if (this.locked) {
/* 269 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 270 */         this.changeListeners = Arrays.<ArrayChangeListener<T>>copyOf(this.changeListeners, j);
/* 271 */       } else if (this.changeSize == i) {
/* 272 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 273 */         if (this.changeSize == i) {
/* 274 */           int j = i * 3 / 2 + 1;
/* 275 */           this.changeListeners = Arrays.<ArrayChangeListener<T>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 278 */       this.changeListeners[this.changeSize++] = paramArrayChangeListener;
/*     */     } 
/* 280 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 285 */     if (this.changeListeners != null) {
/* 286 */       for (byte b = 0; b < this.changeSize; b++) {
/* 287 */         if (paramArrayChangeListener.equals(this.changeListeners[b])) {
/* 288 */           if (this.changeSize == 1) {
/* 289 */             if (this.invalidationSize == 1) {
/* 290 */               return new ArrayListenerHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]);
/*     */             }
/* 292 */             this.changeListeners = null;
/* 293 */             this.changeSize = 0; break;
/* 294 */           }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 295 */             return new ArrayListenerHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */           }
/* 297 */           int i = this.changeSize - b - 1;
/* 298 */           ArrayChangeListener<T>[] arrayOfArrayChangeListener = this.changeListeners;
/* 299 */           if (this.locked) {
/* 300 */             this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[this.changeListeners.length];
/* 301 */             System.arraycopy(arrayOfArrayChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */           } 
/* 303 */           if (i > 0) {
/* 304 */             System.arraycopy(arrayOfArrayChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 306 */           this.changeSize--;
/* 307 */           if (!this.locked) {
/* 308 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 315 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(boolean paramBoolean, int paramInt1, int paramInt2) {
/* 320 */     InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 321 */     int i = this.invalidationSize;
/* 322 */     ArrayChangeListener<T>[] arrayOfArrayChangeListener = this.changeListeners;
/* 323 */     int j = this.changeSize;
/*     */     
/*     */     try {
/* 326 */       this.locked = true; byte b;
/* 327 */       for (b = 0; b < i; b++) {
/*     */         try {
/* 329 */           arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/* 330 */         } catch (Exception exception) {
/* 331 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/* 334 */       for (b = 0; b < j; b++) {
/*     */         try {
/* 336 */           arrayOfArrayChangeListener[b].onChanged((ObservableArray)this.observable, paramBoolean, paramInt1, paramInt2);
/* 337 */         } catch (Exception exception) {
/* 338 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 342 */       this.locked = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ArrayListenerHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */