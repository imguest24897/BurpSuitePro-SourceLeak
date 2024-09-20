/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.ListChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends ListListenerHelper<E>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private ListChangeListener<? super E>[] changeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private boolean locked;
/*     */   
/*     */   private Generic(InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 178 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 179 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(ListChangeListener<? super E> paramListChangeListener1, ListChangeListener<? super E> paramListChangeListener2) {
/* 183 */     this.changeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener1, paramListChangeListener2 };
/* 184 */     this.changeSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(InvalidationListener paramInvalidationListener, ListChangeListener<? super E> paramListChangeListener) {
/* 188 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 189 */     this.invalidationSize = 1;
/* 190 */     this.changeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener };
/* 191 */     this.changeSize = 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Generic<E> addListener(InvalidationListener paramInvalidationListener) {
/* 196 */     if (this.invalidationListeners == null) {
/* 197 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 198 */       this.invalidationSize = 1;
/*     */     } else {
/* 200 */       int i = this.invalidationListeners.length;
/* 201 */       if (this.locked) {
/* 202 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 203 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 204 */       } else if (this.invalidationSize == i) {
/* 205 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 206 */         if (this.invalidationSize == i) {
/* 207 */           int j = i * 3 / 2 + 1;
/* 208 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 211 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 213 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 218 */     if (this.invalidationListeners != null) {
/* 219 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 220 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 221 */           if (this.invalidationSize == 1) {
/* 222 */             if (this.changeSize == 1) {
/* 223 */               return new ListListenerHelper.SingleChange<>(this.changeListeners[0]);
/*     */             }
/* 225 */             this.invalidationListeners = null;
/* 226 */             this.invalidationSize = 0; break;
/* 227 */           }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 228 */             return new ListListenerHelper.SingleInvalidation<>(this.invalidationListeners[1 - b]);
/*     */           }
/* 230 */           int i = this.invalidationSize - b - 1;
/* 231 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 232 */           if (this.locked) {
/* 233 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 234 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b);
/*     */           } 
/* 236 */           if (i > 0) {
/* 237 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 239 */           this.invalidationSize--;
/* 240 */           if (!this.locked) {
/* 241 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 248 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 253 */     if (this.changeListeners == null) {
/* 254 */       this.changeListeners = (ListChangeListener<? super E>[])new ListChangeListener[] { paramListChangeListener };
/* 255 */       this.changeSize = 1;
/*     */     } else {
/* 257 */       int i = this.changeListeners.length;
/* 258 */       if (this.locked) {
/* 259 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 260 */         this.changeListeners = Arrays.<ListChangeListener<? super E>>copyOf(this.changeListeners, j);
/* 261 */       } else if (this.changeSize == i) {
/* 262 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 263 */         if (this.changeSize == i) {
/* 264 */           int j = i * 3 / 2 + 1;
/* 265 */           this.changeListeners = Arrays.<ListChangeListener<? super E>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 268 */       this.changeListeners[this.changeSize++] = paramListChangeListener;
/*     */     } 
/* 270 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 275 */     if (this.changeListeners != null) {
/* 276 */       for (byte b = 0; b < this.changeSize; b++) {
/* 277 */         if (paramListChangeListener.equals(this.changeListeners[b])) {
/* 278 */           if (this.changeSize == 1) {
/* 279 */             if (this.invalidationSize == 1) {
/* 280 */               return new ListListenerHelper.SingleInvalidation<>(this.invalidationListeners[0]);
/*     */             }
/* 282 */             this.changeListeners = null;
/* 283 */             this.changeSize = 0; break;
/* 284 */           }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 285 */             return new ListListenerHelper.SingleChange<>(this.changeListeners[1 - b]);
/*     */           }
/* 287 */           int i = this.changeSize - b - 1;
/* 288 */           ListChangeListener<? super E>[] arrayOfListChangeListener = this.changeListeners;
/* 289 */           if (this.locked) {
/* 290 */             this.changeListeners = (ListChangeListener<? super E>[])new ListChangeListener[this.changeListeners.length];
/* 291 */             System.arraycopy(arrayOfListChangeListener, 0, this.changeListeners, 0, b);
/*     */           } 
/* 293 */           if (i > 0) {
/* 294 */             System.arraycopy(arrayOfListChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 296 */           this.changeSize--;
/* 297 */           if (!this.locked) {
/* 298 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 305 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 310 */     InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 311 */     int i = this.invalidationSize;
/* 312 */     ListChangeListener<? super E>[] arrayOfListChangeListener = this.changeListeners;
/* 313 */     int j = this.changeSize;
/*     */     
/*     */     try {
/* 316 */       this.locked = true; byte b;
/* 317 */       for (b = 0; b < i; b++) {
/*     */         try {
/* 319 */           arrayOfInvalidationListener[b].invalidated((Observable)paramChange.getList());
/* 320 */         } catch (Exception exception) {
/* 321 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/* 324 */       for (b = 0; b < j; b++) {
/* 325 */         paramChange.reset();
/*     */         try {
/* 327 */           arrayOfListChangeListener[b].onChanged(paramChange);
/* 328 */         } catch (Exception exception) {
/* 329 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 333 */       this.locked = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ListListenerHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */