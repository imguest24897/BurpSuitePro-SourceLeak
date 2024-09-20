/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelperBase;
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
/*     */ public abstract class MapListenerHelper<K, V>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   public static <K, V> MapListenerHelper<K, V> addListener(MapListenerHelper<K, V> paramMapListenerHelper, InvalidationListener paramInvalidationListener) {
/*  41 */     if (paramInvalidationListener == null) {
/*  42 */       throw new NullPointerException();
/*     */     }
/*  44 */     return (paramMapListenerHelper == null) ? new SingleInvalidation<>(paramInvalidationListener) : paramMapListenerHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapListenerHelper<K, V> removeListener(MapListenerHelper<K, V> paramMapListenerHelper, InvalidationListener paramInvalidationListener) {
/*  48 */     if (paramInvalidationListener == null) {
/*  49 */       throw new NullPointerException();
/*     */     }
/*  51 */     return (paramMapListenerHelper == null) ? null : paramMapListenerHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapListenerHelper<K, V> addListener(MapListenerHelper<K, V> paramMapListenerHelper, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  55 */     if (paramMapChangeListener == null) {
/*  56 */       throw new NullPointerException();
/*     */     }
/*  58 */     return (paramMapListenerHelper == null) ? new SingleChange<>(paramMapChangeListener) : paramMapListenerHelper.addListener(paramMapChangeListener);
/*     */   }
/*     */   
/*     */   public static <K, V> MapListenerHelper<K, V> removeListener(MapListenerHelper<K, V> paramMapListenerHelper, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/*  62 */     if (paramMapChangeListener == null) {
/*  63 */       throw new NullPointerException();
/*     */     }
/*  65 */     return (paramMapListenerHelper == null) ? null : paramMapListenerHelper.removeListener(paramMapChangeListener);
/*     */   }
/*     */   
/*     */   public static <K, V> void fireValueChangedEvent(MapListenerHelper<K, V> paramMapListenerHelper, MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/*  69 */     if (paramMapListenerHelper != null) {
/*  70 */       paramMapListenerHelper.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */   
/*     */   public static <K, V> boolean hasListeners(MapListenerHelper<K, V> paramMapListenerHelper) {
/*  75 */     return (paramMapListenerHelper != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract MapListenerHelper<K, V> addListener(InvalidationListener paramInvalidationListener);
/*     */ 
/*     */   
/*     */   protected abstract MapListenerHelper<K, V> removeListener(InvalidationListener paramInvalidationListener);
/*     */ 
/*     */   
/*     */   protected abstract MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener);
/*     */   
/*     */   protected abstract MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange);
/*     */   
/*     */   private static class SingleInvalidation<K, V>
/*     */     extends MapListenerHelper<K, V>
/*     */   {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(InvalidationListener param1InvalidationListener) {
/*  97 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 102 */       return new MapListenerHelper.Generic<>(this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 107 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 112 */       return new MapListenerHelper.Generic<>(this.listener, param1MapChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 117 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/*     */       try {
/* 123 */         this.listener.invalidated((Observable)param1Change.getMap());
/* 124 */       } catch (Exception exception) {
/* 125 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<K, V>
/*     */     extends MapListenerHelper<K, V> {
/*     */     private final MapChangeListener<? super K, ? super V> listener;
/*     */     
/*     */     private SingleChange(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 135 */       this.listener = param1MapChangeListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 140 */       return new MapListenerHelper.Generic<>(param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 145 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 150 */       return new MapListenerHelper.Generic<>(this.listener, param1MapChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 155 */       return param1MapChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/*     */       try {
/* 161 */         this.listener.onChanged(param1Change);
/* 162 */       } catch (Exception exception) {
/* 163 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<K, V>
/*     */     extends MapListenerHelper<K, V> {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private MapChangeListener<? super K, ? super V>[] changeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private boolean locked;
/*     */     
/*     */     private Generic(InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 177 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 178 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(MapChangeListener<? super K, ? super V> param1MapChangeListener1, MapChangeListener<? super K, ? super V> param1MapChangeListener2) {
/* 182 */       this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener1, param1MapChangeListener2 };
/* 183 */       this.changeSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(InvalidationListener param1InvalidationListener, MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 187 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 188 */       this.invalidationSize = 1;
/* 189 */       this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener };
/* 190 */       this.changeSize = 1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Generic<K, V> addListener(InvalidationListener param1InvalidationListener) {
/* 195 */       if (this.invalidationListeners == null) {
/* 196 */         this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 197 */         this.invalidationSize = 1;
/*     */       } else {
/* 199 */         int i = this.invalidationListeners.length;
/* 200 */         if (this.locked) {
/* 201 */           int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 202 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 203 */         } else if (this.invalidationSize == i) {
/* 204 */           this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 205 */           if (this.invalidationSize == i) {
/* 206 */             int j = i * 3 / 2 + 1;
/* 207 */             this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */           } 
/*     */         } 
/* 210 */         this.invalidationListeners[this.invalidationSize++] = param1InvalidationListener;
/*     */       } 
/* 212 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> removeListener(InvalidationListener param1InvalidationListener) {
/* 217 */       if (this.invalidationListeners != null) {
/* 218 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 219 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 220 */             if (this.invalidationSize == 1) {
/* 221 */               if (this.changeSize == 1) {
/* 222 */                 return new MapListenerHelper.SingleChange<>(this.changeListeners[0]);
/*     */               }
/* 224 */               this.invalidationListeners = null;
/* 225 */               this.invalidationSize = 0; break;
/* 226 */             }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 227 */               return new MapListenerHelper.SingleInvalidation<>(this.invalidationListeners[1 - b]);
/*     */             }
/* 229 */             int i = this.invalidationSize - b - 1;
/* 230 */             InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 231 */             if (this.locked) {
/* 232 */               this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 233 */               System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b);
/*     */             } 
/* 235 */             if (i > 0) {
/* 236 */               System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */             }
/* 238 */             this.invalidationSize--;
/* 239 */             if (!this.locked) {
/* 240 */               this.invalidationListeners[this.invalidationSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 247 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 252 */       if (this.changeListeners == null) {
/* 253 */         this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[] { param1MapChangeListener };
/* 254 */         this.changeSize = 1;
/*     */       } else {
/* 256 */         int i = this.changeListeners.length;
/* 257 */         if (this.locked) {
/* 258 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 259 */           this.changeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.changeListeners, j);
/* 260 */         } else if (this.changeSize == i) {
/* 261 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 262 */           if (this.changeSize == i) {
/* 263 */             int j = i * 3 / 2 + 1;
/* 264 */             this.changeListeners = Arrays.<MapChangeListener<? super K, ? super V>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 267 */         this.changeListeners[this.changeSize++] = param1MapChangeListener;
/*     */       } 
/* 269 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> param1MapChangeListener) {
/* 274 */       if (this.changeListeners != null) {
/* 275 */         for (byte b = 0; b < this.changeSize; b++) {
/* 276 */           if (param1MapChangeListener.equals(this.changeListeners[b])) {
/* 277 */             if (this.changeSize == 1) {
/* 278 */               if (this.invalidationSize == 1) {
/* 279 */                 return new MapListenerHelper.SingleInvalidation<>(this.invalidationListeners[0]);
/*     */               }
/* 281 */               this.changeListeners = null;
/* 282 */               this.changeSize = 0; break;
/* 283 */             }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 284 */               return new MapListenerHelper.SingleChange<>(this.changeListeners[1 - b]);
/*     */             }
/* 286 */             int i = this.changeSize - b - 1;
/* 287 */             MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.changeListeners;
/* 288 */             if (this.locked) {
/* 289 */               this.changeListeners = (MapChangeListener<? super K, ? super V>[])new MapChangeListener[this.changeListeners.length];
/* 290 */               System.arraycopy(arrayOfMapChangeListener, 0, this.changeListeners, 0, b);
/*     */             } 
/* 292 */             if (i > 0) {
/* 293 */               System.arraycopy(arrayOfMapChangeListener, b + 1, this.changeListeners, b, i);
/*     */             }
/* 295 */             this.changeSize--;
/* 296 */             if (!this.locked) {
/* 297 */               this.changeListeners[this.changeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 304 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/* 309 */       InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 310 */       int i = this.invalidationSize;
/* 311 */       MapChangeListener<? super K, ? super V>[] arrayOfMapChangeListener = this.changeListeners;
/* 312 */       int j = this.changeSize;
/*     */       
/*     */       try {
/* 315 */         this.locked = true; byte b;
/* 316 */         for (b = 0; b < i; b++) {
/*     */           try {
/* 318 */             arrayOfInvalidationListener[b].invalidated((Observable)param1Change.getMap());
/* 319 */           } catch (Exception exception) {
/* 320 */             Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */           } 
/*     */         } 
/* 323 */         for (b = 0; b < j; b++) {
/*     */           try {
/* 325 */             arrayOfMapChangeListener[b].onChanged(param1Change);
/* 326 */           } catch (Exception exception) {
/* 327 */             Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */           } 
/*     */         } 
/*     */       } finally {
/* 331 */         this.locked = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\MapListenerHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */