/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.MapChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends MapListenerHelper<K, V>
/*     */ {
/*     */   private InvalidationListener[] invalidationListeners;
/*     */   private MapChangeListener<? super K, ? super V>[] changeListeners;
/*     */   private int invalidationSize;
/*     */   private int changeSize;
/*     */   private boolean locked;
/*     */   
/*     */   private Generic(InvalidationListener paramInvalidationListener1, InvalidationListener paramInvalidationListener2) {
/* 177 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener1, paramInvalidationListener2 };
/* 178 */     this.invalidationSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(MapChangeListener<? super K, ? super V> paramMapChangeListener1, MapChangeListener<? super K, ? super V> paramMapChangeListener2) {
/* 182 */     this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener1, paramMapChangeListener2 };
/* 183 */     this.changeSize = 2;
/*     */   }
/*     */   
/*     */   private Generic(InvalidationListener paramInvalidationListener, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 187 */     this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 188 */     this.invalidationSize = 1;
/* 189 */     this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener };
/* 190 */     this.changeSize = 1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Generic<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 195 */     if (this.invalidationListeners == null) {
/* 196 */       this.invalidationListeners = new InvalidationListener[] { paramInvalidationListener };
/* 197 */       this.invalidationSize = 1;
/*     */     } else {
/* 199 */       int i = this.invalidationListeners.length;
/* 200 */       if (this.locked) {
/* 201 */         int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 202 */         this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 203 */       } else if (this.invalidationSize == i) {
/* 204 */         this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 205 */         if (this.invalidationSize == i) {
/* 206 */           int j = i * 3 / 2 + 1;
/* 207 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */         } 
/*     */       } 
/* 210 */       this.invalidationListeners[this.invalidationSize++] = paramInvalidationListener;
/*     */     } 
/* 212 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 217 */     if (this.invalidationListeners != null) {
/* 218 */       for (byte b = 0; b < this.invalidationSize; b++) {
/* 219 */         if (paramInvalidationListener.equals(this.invalidationListeners[b])) {
/* 220 */           if (this.invalidationSize == 1) {
/* 221 */             if (this.changeSize == 1) {
/* 222 */               return new MapListenerHelper.SingleChange<>(this.changeListeners[0]);
/*     */             }
/* 224 */             this.invalidationListeners = null;
/* 225 */             this.invalidationSize = 0; break;
/* 226 */           }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 227 */             return new MapListenerHelper.SingleInvalidation<>(this.invalidationListeners[1 - b]);
/*     */           }
/* 229 */           int i = this.invalidationSize - b - 1;
/* 230 */           InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 231 */           if (this.locked) {
/* 232 */             this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 233 */             System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b);
/*     */           } 
/* 235 */           if (i > 0) {
/* 236 */             System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */           }
/* 238 */           this.invalidationSize--;
/* 239 */           if (!this.locked) {
/* 240 */             this.invalidationListeners[this.invalidationSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 247 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 252 */     if (this.changeListeners == null) {
/* 253 */       this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { paramMapChangeListener };
/* 254 */       this.changeSize = 1;
/*     */     } else {
/* 256 */       int i = this.changeListeners.length;
/* 257 */       if (this.locked) {
/* 258 */         int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 259 */         this.changeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.changeListeners, j);
/* 260 */       } else if (this.changeSize == i) {
/* 261 */         this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 262 */         if (this.changeSize == i) {
/* 263 */           int j = i * 3 / 2 + 1;
/* 264 */           this.changeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.changeListeners, j);
/*     */         } 
/*     */       } 
/* 267 */       this.changeListeners[this.changeSize++] = paramMapChangeListener;
/*     */     } 
/* 269 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 274 */     if (this.changeListeners != null) {
/* 275 */       for (byte b = 0; b < this.changeSize; b++) {
/* 276 */         if (paramMapChangeListener.equals(this.changeListeners[b])) {
/* 277 */           if (this.changeSize == 1) {
/* 278 */             if (this.invalidationSize == 1) {
/* 279 */               return new MapListenerHelper.SingleInvalidation<>(this.invalidationListeners[0]);
/*     */             }
/* 281 */             this.changeListeners = null;
/* 282 */             this.changeSize = 0; break;
/* 283 */           }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 284 */             return new MapListenerHelper.SingleChange<>(this.changeListeners[1 - b]);
/*     */           }
/* 286 */           int i = this.changeSize - b - 1;
/* 287 */           MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.changeListeners;
/* 288 */           if (this.locked) {
/* 289 */             this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[this.changeListeners.length];
/* 290 */             System.arraycopy(arrayOfMapChangeListener, 0, this.changeListeners, 0, b);
/*     */           } 
/* 292 */           if (i > 0) {
/* 293 */             System.arraycopy(arrayOfMapChangeListener, b + 1, this.changeListeners, b, i);
/*     */           }
/* 295 */           this.changeSize--;
/* 296 */           if (!this.locked) {
/* 297 */             this.changeListeners[this.changeSize] = null;
/*     */           }
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 304 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 309 */     InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 310 */     int i = this.invalidationSize;
/* 311 */     MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.changeListeners;
/* 312 */     int j = this.changeSize;
/*     */     
/*     */     try {
/* 315 */       this.locked = true; byte b;
/* 316 */       for (b = 0; b < i; b++) {
/*     */         try {
/* 318 */           arrayOfInvalidationListener[b].invalidated((Observable)paramChange.getMap());
/* 319 */         } catch (Exception exception) {
/* 320 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/* 323 */       for (b = 0; b < j; b++) {
/*     */         try {
/* 325 */           arrayOfMapChangeListener[b].onChanged(paramChange);
/* 326 */         } catch (Exception exception) {
/* 327 */           Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 331 */       this.locked = false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\MapListenerHelper$Generic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */