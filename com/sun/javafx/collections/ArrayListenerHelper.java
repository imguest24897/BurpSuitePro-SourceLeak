/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelperBase;
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
/*     */ public abstract class ArrayListenerHelper<T extends ObservableArray<T>>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   protected final T observable;
/*     */   
/*     */   public static <T extends ObservableArray<T>> ArrayListenerHelper<T> addListener(ArrayListenerHelper<T> paramArrayListenerHelper, T paramT, InvalidationListener paramInvalidationListener) {
/*  41 */     if (paramInvalidationListener == null) {
/*  42 */       throw new NullPointerException();
/*     */     }
/*  44 */     return (paramArrayListenerHelper == null) ? new SingleInvalidation<>(paramT, paramInvalidationListener) : paramArrayListenerHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <T extends ObservableArray<T>> ArrayListenerHelper<T> removeListener(ArrayListenerHelper<T> paramArrayListenerHelper, InvalidationListener paramInvalidationListener) {
/*  48 */     if (paramInvalidationListener == null) {
/*  49 */       throw new NullPointerException();
/*     */     }
/*  51 */     return (paramArrayListenerHelper == null) ? null : paramArrayListenerHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <T extends ObservableArray<T>> ArrayListenerHelper<T> addListener(ArrayListenerHelper<T> paramArrayListenerHelper, T paramT, ArrayChangeListener<T> paramArrayChangeListener) {
/*  55 */     if (paramArrayChangeListener == null) {
/*  56 */       throw new NullPointerException();
/*     */     }
/*  58 */     return (paramArrayListenerHelper == null) ? new SingleChange<>(paramT, paramArrayChangeListener) : paramArrayListenerHelper.addListener(paramArrayChangeListener);
/*     */   }
/*     */   
/*     */   public static <T extends ObservableArray<T>> ArrayListenerHelper<T> removeListener(ArrayListenerHelper<T> paramArrayListenerHelper, ArrayChangeListener<T> paramArrayChangeListener) {
/*  62 */     if (paramArrayChangeListener == null) {
/*  63 */       throw new NullPointerException();
/*     */     }
/*  65 */     return (paramArrayListenerHelper == null) ? null : paramArrayListenerHelper.removeListener(paramArrayChangeListener);
/*     */   }
/*     */   
/*     */   public static <T extends ObservableArray<T>> void fireValueChangedEvent(ArrayListenerHelper<T> paramArrayListenerHelper, boolean paramBoolean, int paramInt1, int paramInt2) {
/*  69 */     if (paramArrayListenerHelper != null && (paramInt1 < paramInt2 || paramBoolean)) {
/*  70 */       paramArrayListenerHelper.fireValueChangedEvent(paramBoolean, paramInt1, paramInt2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static <T extends ObservableArray<T>> boolean hasListeners(ArrayListenerHelper<T> paramArrayListenerHelper) {
/*  75 */     return (paramArrayListenerHelper != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayListenerHelper(T paramT) {
/*  84 */     this.observable = paramT;
/*     */   }
/*     */   
/*     */   protected abstract ArrayListenerHelper<T> addListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract ArrayListenerHelper<T> removeListener(InvalidationListener paramInvalidationListener);
/*     */   
/*     */   protected abstract ArrayListenerHelper<T> addListener(ArrayChangeListener<T> paramArrayChangeListener);
/*     */   
/*     */   protected abstract ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> paramArrayChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent(boolean paramBoolean, int paramInt1, int paramInt2);
/*     */   
/*     */   private static class SingleInvalidation<T extends ObservableArray<T>>
/*     */     extends ArrayListenerHelper<T>
/*     */   {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(T param1T, InvalidationListener param1InvalidationListener) {
/* 103 */       super(param1T);
/* 104 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> addListener(InvalidationListener param1InvalidationListener) {
/* 109 */       return new ArrayListenerHelper.Generic<>(this.observable, this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> removeListener(InvalidationListener param1InvalidationListener) {
/* 114 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> addListener(ArrayChangeListener<T> param1ArrayChangeListener) {
/* 119 */       return new ArrayListenerHelper.Generic<>(this.observable, this.listener, param1ArrayChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> param1ArrayChangeListener) {
/* 124 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(boolean param1Boolean, int param1Int1, int param1Int2) {
/*     */       try {
/* 130 */         this.listener.invalidated((Observable)this.observable);
/* 131 */       } catch (Exception exception) {
/* 132 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<T extends ObservableArray<T>>
/*     */     extends ArrayListenerHelper<T> {
/*     */     private final ArrayChangeListener<T> listener;
/*     */     
/*     */     private SingleChange(T param1T, ArrayChangeListener<T> param1ArrayChangeListener) {
/* 142 */       super(param1T);
/* 143 */       this.listener = param1ArrayChangeListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> addListener(InvalidationListener param1InvalidationListener) {
/* 148 */       return new ArrayListenerHelper.Generic<>(this.observable, param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> removeListener(InvalidationListener param1InvalidationListener) {
/* 153 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> addListener(ArrayChangeListener<T> param1ArrayChangeListener) {
/* 158 */       return new ArrayListenerHelper.Generic<>(this.observable, this.listener, param1ArrayChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> param1ArrayChangeListener) {
/* 163 */       return param1ArrayChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(boolean param1Boolean, int param1Int1, int param1Int2) {
/*     */       try {
/* 169 */         this.listener.onChanged((ObservableArray)this.observable, param1Boolean, param1Int1, param1Int2);
/* 170 */       } catch (Exception exception) {
/* 171 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<T extends ObservableArray<T>>
/*     */     extends ArrayListenerHelper<T> {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private ArrayChangeListener<T>[] changeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private boolean locked;
/*     */     
/*     */     private Generic(T param1T, InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 185 */       super(param1T);
/* 186 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 187 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(T param1T, ArrayChangeListener<T> param1ArrayChangeListener1, ArrayChangeListener<T> param1ArrayChangeListener2) {
/* 191 */       super(param1T);
/* 192 */       this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[] { param1ArrayChangeListener1, param1ArrayChangeListener2 };
/* 193 */       this.changeSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(T param1T, InvalidationListener param1InvalidationListener, ArrayChangeListener<T> param1ArrayChangeListener) {
/* 197 */       super(param1T);
/* 198 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 199 */       this.invalidationSize = 1;
/* 200 */       this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[] { param1ArrayChangeListener };
/* 201 */       this.changeSize = 1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Generic<T> addListener(InvalidationListener param1InvalidationListener) {
/* 206 */       if (this.invalidationListeners == null) {
/* 207 */         this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 208 */         this.invalidationSize = 1;
/*     */       } else {
/* 210 */         int i = this.invalidationListeners.length;
/* 211 */         if (this.locked) {
/* 212 */           int j = (this.invalidationSize < i) ? i : (i * 3 / 2 + 1);
/* 213 */           this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/* 214 */         } else if (this.invalidationSize == i) {
/* 215 */           this.invalidationSize = trim(this.invalidationSize, (Object[])this.invalidationListeners);
/* 216 */           if (this.invalidationSize == i) {
/* 217 */             int j = i * 3 / 2 + 1;
/* 218 */             this.invalidationListeners = Arrays.<InvalidationListener>copyOf(this.invalidationListeners, j);
/*     */           } 
/*     */         } 
/* 221 */         this.invalidationListeners[this.invalidationSize++] = param1InvalidationListener;
/*     */       } 
/* 223 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> removeListener(InvalidationListener param1InvalidationListener) {
/* 228 */       if (this.invalidationListeners != null) {
/* 229 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 230 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 231 */             if (this.invalidationSize == 1) {
/* 232 */               if (this.changeSize == 1) {
/* 233 */                 return new ArrayListenerHelper.SingleChange<>(this.observable, this.changeListeners[0]);
/*     */               }
/* 235 */               this.invalidationListeners = null;
/* 236 */               this.invalidationSize = 0; break;
/* 237 */             }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 238 */               return new ArrayListenerHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[1 - b]);
/*     */             }
/* 240 */             int i = this.invalidationSize - b - 1;
/* 241 */             InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 242 */             if (this.locked) {
/* 243 */               this.invalidationListeners = new InvalidationListener[this.invalidationListeners.length];
/* 244 */               System.arraycopy(arrayOfInvalidationListener, 0, this.invalidationListeners, 0, b + 1);
/*     */             } 
/* 246 */             if (i > 0) {
/* 247 */               System.arraycopy(arrayOfInvalidationListener, b + 1, this.invalidationListeners, b, i);
/*     */             }
/* 249 */             this.invalidationSize--;
/* 250 */             if (!this.locked) {
/* 251 */               this.invalidationListeners[this.invalidationSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 258 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> addListener(ArrayChangeListener<T> param1ArrayChangeListener) {
/* 263 */       if (this.changeListeners == null) {
/* 264 */         this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[] { param1ArrayChangeListener };
/* 265 */         this.changeSize = 1;
/*     */       } else {
/* 267 */         int i = this.changeListeners.length;
/* 268 */         if (this.locked) {
/* 269 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 270 */           this.changeListeners = Arrays.<ArrayChangeListener<T>>copyOf(this.changeListeners, j);
/* 271 */         } else if (this.changeSize == i) {
/* 272 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 273 */           if (this.changeSize == i) {
/* 274 */             int j = i * 3 / 2 + 1;
/* 275 */             this.changeListeners = Arrays.<ArrayChangeListener<T>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 278 */         this.changeListeners[this.changeSize++] = param1ArrayChangeListener;
/*     */       } 
/* 280 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> param1ArrayChangeListener) {
/* 285 */       if (this.changeListeners != null) {
/* 286 */         for (byte b = 0; b < this.changeSize; b++) {
/* 287 */           if (param1ArrayChangeListener.equals(this.changeListeners[b])) {
/* 288 */             if (this.changeSize == 1) {
/* 289 */               if (this.invalidationSize == 1) {
/* 290 */                 return new ArrayListenerHelper.SingleInvalidation<>(this.observable, this.invalidationListeners[0]);
/*     */               }
/* 292 */               this.changeListeners = null;
/* 293 */               this.changeSize = 0; break;
/* 294 */             }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 295 */               return new ArrayListenerHelper.SingleChange<>(this.observable, this.changeListeners[1 - b]);
/*     */             }
/* 297 */             int i = this.changeSize - b - 1;
/* 298 */             ArrayChangeListener<T>[] arrayOfArrayChangeListener = this.changeListeners;
/* 299 */             if (this.locked) {
/* 300 */               this.changeListeners = (ArrayChangeListener<T>[])new ArrayChangeListener[this.changeListeners.length];
/* 301 */               System.arraycopy(arrayOfArrayChangeListener, 0, this.changeListeners, 0, b + 1);
/*     */             } 
/* 303 */             if (i > 0) {
/* 304 */               System.arraycopy(arrayOfArrayChangeListener, b + 1, this.changeListeners, b, i);
/*     */             }
/* 306 */             this.changeSize--;
/* 307 */             if (!this.locked) {
/* 308 */               this.changeListeners[this.changeSize] = null;
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       }
/* 315 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(boolean param1Boolean, int param1Int1, int param1Int2) {
/* 320 */       InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 321 */       int i = this.invalidationSize;
/* 322 */       ArrayChangeListener<T>[] arrayOfArrayChangeListener = this.changeListeners;
/* 323 */       int j = this.changeSize;
/*     */       
/*     */       try {
/* 326 */         this.locked = true; byte b;
/* 327 */         for (b = 0; b < i; b++) {
/*     */           try {
/* 329 */             arrayOfInvalidationListener[b].invalidated((Observable)this.observable);
/* 330 */           } catch (Exception exception) {
/* 331 */             Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */           } 
/*     */         } 
/* 334 */         for (b = 0; b < j; b++) {
/*     */           try {
/* 336 */             arrayOfArrayChangeListener[b].onChanged((ObservableArray)this.observable, param1Boolean, param1Int1, param1Int2);
/* 337 */           } catch (Exception exception) {
/* 338 */             Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */           } 
/*     */         } 
/*     */       } finally {
/* 342 */         this.locked = false;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ArrayListenerHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */