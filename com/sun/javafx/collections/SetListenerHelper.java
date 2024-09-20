/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelperBase;
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
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
/*     */ public abstract class SetListenerHelper<E>
/*     */   extends ExpressionHelperBase
/*     */ {
/*     */   public static <E> SetListenerHelper<E> addListener(SetListenerHelper<E> paramSetListenerHelper, InvalidationListener paramInvalidationListener) {
/*  41 */     if (paramInvalidationListener == null) {
/*  42 */       throw new NullPointerException();
/*     */     }
/*  44 */     return (paramSetListenerHelper == null) ? new SingleInvalidation<>(paramInvalidationListener) : paramSetListenerHelper.addListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <E> SetListenerHelper<E> removeListener(SetListenerHelper<E> paramSetListenerHelper, InvalidationListener paramInvalidationListener) {
/*  48 */     if (paramInvalidationListener == null) {
/*  49 */       throw new NullPointerException();
/*     */     }
/*  51 */     return (paramSetListenerHelper == null) ? null : paramSetListenerHelper.removeListener(paramInvalidationListener);
/*     */   }
/*     */   
/*     */   public static <E> SetListenerHelper<E> addListener(SetListenerHelper<E> paramSetListenerHelper, SetChangeListener<? super E> paramSetChangeListener) {
/*  55 */     if (paramSetChangeListener == null) {
/*  56 */       throw new NullPointerException();
/*     */     }
/*  58 */     return (paramSetListenerHelper == null) ? new SingleChange<>(paramSetChangeListener) : paramSetListenerHelper.addListener(paramSetChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> SetListenerHelper<E> removeListener(SetListenerHelper<E> paramSetListenerHelper, SetChangeListener<? super E> paramSetChangeListener) {
/*  62 */     if (paramSetChangeListener == null) {
/*  63 */       throw new NullPointerException();
/*     */     }
/*  65 */     return (paramSetListenerHelper == null) ? null : paramSetListenerHelper.removeListener(paramSetChangeListener);
/*     */   }
/*     */   
/*     */   public static <E> void fireValueChangedEvent(SetListenerHelper<E> paramSetListenerHelper, SetChangeListener.Change<? extends E> paramChange) {
/*  69 */     if (paramSetListenerHelper != null) {
/*  70 */       paramSetListenerHelper.fireValueChangedEvent(paramChange);
/*     */     }
/*     */   }
/*     */   
/*     */   public static <E> boolean hasListeners(SetListenerHelper<E> paramSetListenerHelper) {
/*  75 */     return (paramSetListenerHelper != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract SetListenerHelper<E> addListener(InvalidationListener paramInvalidationListener);
/*     */ 
/*     */   
/*     */   protected abstract SetListenerHelper<E> removeListener(InvalidationListener paramInvalidationListener);
/*     */ 
/*     */   
/*     */   protected abstract SetListenerHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener);
/*     */   
/*     */   protected abstract SetListenerHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener);
/*     */   
/*     */   protected abstract void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange);
/*     */   
/*     */   private static class SingleInvalidation<E>
/*     */     extends SetListenerHelper<E>
/*     */   {
/*     */     private final InvalidationListener listener;
/*     */     
/*     */     private SingleInvalidation(InvalidationListener param1InvalidationListener) {
/*  97 */       this.listener = param1InvalidationListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 102 */       return new SetListenerHelper.Generic<>(this.listener, param1InvalidationListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 107 */       return param1InvalidationListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 112 */       return new SetListenerHelper.Generic<>(this.listener, param1SetChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 117 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/*     */       try {
/* 123 */         this.listener.invalidated((Observable)param1Change.getSet());
/* 124 */       } catch (Exception exception) {
/* 125 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class SingleChange<E>
/*     */     extends SetListenerHelper<E> {
/*     */     private final SetChangeListener<? super E> listener;
/*     */     
/*     */     private SingleChange(SetChangeListener<? super E> param1SetChangeListener) {
/* 135 */       this.listener = param1SetChangeListener;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> addListener(InvalidationListener param1InvalidationListener) {
/* 140 */       return new SetListenerHelper.Generic<>(param1InvalidationListener, this.listener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 145 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 150 */       return new SetListenerHelper.Generic<>(this.listener, param1SetChangeListener);
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 155 */       return param1SetChangeListener.equals(this.listener) ? null : this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/*     */       try {
/* 161 */         this.listener.onChanged(param1Change);
/* 162 */       } catch (Exception exception) {
/* 163 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Generic<E>
/*     */     extends SetListenerHelper<E> {
/*     */     private InvalidationListener[] invalidationListeners;
/*     */     private SetChangeListener<? super E>[] changeListeners;
/*     */     private int invalidationSize;
/*     */     private int changeSize;
/*     */     private boolean locked;
/*     */     
/*     */     private Generic(InvalidationListener param1InvalidationListener1, InvalidationListener param1InvalidationListener2) {
/* 177 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener1, param1InvalidationListener2 };
/* 178 */       this.invalidationSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(SetChangeListener<? super E> param1SetChangeListener1, SetChangeListener<? super E> param1SetChangeListener2) {
/* 182 */       this.changeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener1, param1SetChangeListener2 };
/* 183 */       this.changeSize = 2;
/*     */     }
/*     */     
/*     */     private Generic(InvalidationListener param1InvalidationListener, SetChangeListener<? super E> param1SetChangeListener) {
/* 187 */       this.invalidationListeners = new InvalidationListener[] { param1InvalidationListener };
/* 188 */       this.invalidationSize = 1;
/* 189 */       this.changeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener };
/* 190 */       this.changeSize = 1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Generic<E> addListener(InvalidationListener param1InvalidationListener) {
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
/*     */     protected SetListenerHelper<E> removeListener(InvalidationListener param1InvalidationListener) {
/* 217 */       if (this.invalidationListeners != null) {
/* 218 */         for (byte b = 0; b < this.invalidationSize; b++) {
/* 219 */           if (param1InvalidationListener.equals(this.invalidationListeners[b])) {
/* 220 */             if (this.invalidationSize == 1) {
/* 221 */               if (this.changeSize == 1) {
/* 222 */                 return new SetListenerHelper.SingleChange<>(this.changeListeners[0]);
/*     */               }
/* 224 */               this.invalidationListeners = null;
/* 225 */               this.invalidationSize = 0; break;
/* 226 */             }  if (this.invalidationSize == 2 && this.changeSize == 0) {
/* 227 */               return new SetListenerHelper.SingleInvalidation<>(this.invalidationListeners[1 - b]);
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
/*     */     protected SetListenerHelper<E> addListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 252 */       if (this.changeListeners == null) {
/* 253 */         this.changeListeners = (SetChangeListener<? super E>[])new SetChangeListener[] { param1SetChangeListener };
/* 254 */         this.changeSize = 1;
/*     */       } else {
/* 256 */         int i = this.changeListeners.length;
/* 257 */         if (this.locked) {
/* 258 */           int j = (this.changeSize < i) ? i : (i * 3 / 2 + 1);
/* 259 */           this.changeListeners = Arrays.<SetChangeListener<? super E>>copyOf(this.changeListeners, j);
/* 260 */         } else if (this.changeSize == i) {
/* 261 */           this.changeSize = trim(this.changeSize, (Object[])this.changeListeners);
/* 262 */           if (this.changeSize == i) {
/* 263 */             int j = i * 3 / 2 + 1;
/* 264 */             this.changeListeners = Arrays.<SetChangeListener<? super E>>copyOf(this.changeListeners, j);
/*     */           } 
/*     */         } 
/* 267 */         this.changeListeners[this.changeSize++] = param1SetChangeListener;
/*     */       } 
/* 269 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected SetListenerHelper<E> removeListener(SetChangeListener<? super E> param1SetChangeListener) {
/* 274 */       if (this.changeListeners != null) {
/* 275 */         for (byte b = 0; b < this.changeSize; b++) {
/* 276 */           if (param1SetChangeListener.equals(this.changeListeners[b])) {
/* 277 */             if (this.changeSize == 1) {
/* 278 */               if (this.invalidationSize == 1) {
/* 279 */                 return new SetListenerHelper.SingleInvalidation<>(this.invalidationListeners[0]);
/*     */               }
/* 281 */               this.changeListeners = null;
/* 282 */               this.changeSize = 0; break;
/* 283 */             }  if (this.changeSize == 2 && this.invalidationSize == 0) {
/* 284 */               return new SetListenerHelper.SingleChange<>(this.changeListeners[1 - b]);
/*     */             }
/* 286 */             int i = this.changeSize - b - 1;
/* 287 */             SetChangeListener<? super E>[] arrayOfSetChangeListener = this.changeListeners;
/* 288 */             if (this.locked) {
/* 289 */               this.changeListeners = (SetChangeListener<? super E>[])new SetChangeListener[this.changeListeners.length];
/* 290 */               System.arraycopy(arrayOfSetChangeListener, 0, this.changeListeners, 0, b);
/*     */             } 
/* 292 */             if (i > 0) {
/* 293 */               System.arraycopy(arrayOfSetChangeListener, b + 1, this.changeListeners, b, i);
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
/*     */     protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> param1Change) {
/* 309 */       InvalidationListener[] arrayOfInvalidationListener = this.invalidationListeners;
/* 310 */       int i = this.invalidationSize;
/* 311 */       SetChangeListener<? super E>[] arrayOfSetChangeListener = this.changeListeners;
/* 312 */       int j = this.changeSize;
/*     */       
/*     */       try {
/* 315 */         this.locked = true; byte b;
/* 316 */         for (b = 0; b < i; b++) {
/*     */           try {
/* 318 */             arrayOfInvalidationListener[b].invalidated((Observable)param1Change.getSet());
/* 319 */           } catch (Exception exception) {
/* 320 */             Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */           } 
/*     */         } 
/* 323 */         for (b = 0; b < j; b++) {
/*     */           try {
/* 325 */             arrayOfSetChangeListener[b].onChanged(param1Change);
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\SetListenerHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */