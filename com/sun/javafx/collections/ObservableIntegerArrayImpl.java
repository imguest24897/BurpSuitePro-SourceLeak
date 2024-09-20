/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import javafx.collections.ObservableArrayBase;
/*     */ import javafx.collections.ObservableIntegerArray;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ObservableIntegerArrayImpl
/*     */   extends ObservableArrayBase<ObservableIntegerArray>
/*     */   implements ObservableIntegerArray
/*     */ {
/*  36 */   private static final int[] INITIAL = new int[0];
/*     */   
/*  38 */   private int[] array = INITIAL;
/*  39 */   private int size = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int MAX_ARRAY_SIZE = 2147483639;
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableIntegerArrayImpl() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableIntegerArrayImpl(int... paramVarArgs) {
/*  52 */     setAll(paramVarArgs);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableIntegerArrayImpl(ObservableIntegerArray paramObservableIntegerArray) {
/*  60 */     setAll(paramObservableIntegerArray);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/*  65 */     resize(0);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  70 */     return this.size;
/*     */   }
/*     */   
/*     */   private void addAllInternal(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2) {
/*  74 */     growCapacity(paramInt2);
/*  75 */     paramObservableIntegerArray.copyTo(paramInt1, this.array, this.size, paramInt2);
/*  76 */     this.size += paramInt2;
/*  77 */     fireChange((paramInt2 != 0), this.size - paramInt2, this.size);
/*     */   }
/*     */   
/*     */   private void addAllInternal(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/*  81 */     growCapacity(paramInt2);
/*  82 */     System.arraycopy(paramArrayOfint, paramInt1, this.array, this.size, paramInt2);
/*  83 */     this.size += paramInt2;
/*  84 */     fireChange((paramInt2 != 0), this.size - paramInt2, this.size);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addAll(ObservableIntegerArray paramObservableIntegerArray) {
/*  89 */     addAllInternal(paramObservableIntegerArray, 0, paramObservableIntegerArray.size());
/*     */   }
/*     */ 
/*     */   
/*     */   public void addAll(int... paramVarArgs) {
/*  94 */     addAllInternal(paramVarArgs, 0, paramVarArgs.length);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addAll(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2) {
/*  99 */     rangeCheck(paramObservableIntegerArray, paramInt1, paramInt2);
/* 100 */     addAllInternal(paramObservableIntegerArray, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addAll(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 105 */     rangeCheck(paramArrayOfint, paramInt1, paramInt2);
/* 106 */     addAllInternal(paramArrayOfint, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   private void setAllInternal(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2) {
/* 110 */     boolean bool = (size() != paramInt2) ? true : false;
/* 111 */     if (paramObservableIntegerArray == this) {
/* 112 */       if (paramInt1 == 0) {
/* 113 */         resize(paramInt2);
/*     */       } else {
/* 115 */         System.arraycopy(this.array, paramInt1, this.array, 0, paramInt2);
/* 116 */         this.size = paramInt2;
/* 117 */         fireChange(bool, 0, this.size);
/*     */       } 
/*     */     } else {
/* 120 */       this.size = 0;
/* 121 */       ensureCapacity(paramInt2);
/* 122 */       paramObservableIntegerArray.copyTo(paramInt1, this.array, 0, paramInt2);
/* 123 */       this.size = paramInt2;
/* 124 */       fireChange(bool, 0, this.size);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setAllInternal(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 129 */     boolean bool = (size() != paramInt2) ? true : false;
/* 130 */     this.size = 0;
/* 131 */     ensureCapacity(paramInt2);
/* 132 */     System.arraycopy(paramArrayOfint, paramInt1, this.array, 0, paramInt2);
/* 133 */     this.size = paramInt2;
/* 134 */     fireChange(bool, 0, this.size);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAll(ObservableIntegerArray paramObservableIntegerArray) {
/* 139 */     setAllInternal(paramObservableIntegerArray, 0, paramObservableIntegerArray.size());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAll(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2) {
/* 144 */     rangeCheck(paramObservableIntegerArray, paramInt1, paramInt2);
/* 145 */     setAllInternal(paramObservableIntegerArray, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAll(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 150 */     rangeCheck(paramArrayOfint, paramInt1, paramInt2);
/* 151 */     setAllInternal(paramArrayOfint, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAll(int... paramVarArgs) {
/* 156 */     setAllInternal(paramVarArgs, 0, paramVarArgs.length);
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) {
/* 161 */     rangeCheck(paramInt1 + paramInt3);
/* 162 */     System.arraycopy(paramArrayOfint, paramInt2, this.array, paramInt1, paramInt3);
/* 163 */     fireChange(false, paramInt1, paramInt1 + paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(int paramInt1, ObservableIntegerArray paramObservableIntegerArray, int paramInt2, int paramInt3) {
/* 168 */     rangeCheck(paramInt1 + paramInt3);
/* 169 */     paramObservableIntegerArray.copyTo(paramInt2, this.array, paramInt1, paramInt3);
/* 170 */     fireChange(false, paramInt1, paramInt1 + paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] toArray(int[] paramArrayOfint) {
/* 175 */     if (paramArrayOfint == null || size() > paramArrayOfint.length) {
/* 176 */       paramArrayOfint = new int[size()];
/*     */     }
/* 178 */     System.arraycopy(this.array, 0, paramArrayOfint, 0, size());
/* 179 */     return paramArrayOfint;
/*     */   }
/*     */ 
/*     */   
/*     */   public int get(int paramInt) {
/* 184 */     rangeCheck(paramInt + 1);
/* 185 */     return this.array[paramInt];
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(int paramInt1, int paramInt2) {
/* 190 */     rangeCheck(paramInt1 + 1);
/* 191 */     this.array[paramInt1] = paramInt2;
/* 192 */     fireChange(false, paramInt1, paramInt1 + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] toArray(int paramInt1, int[] paramArrayOfint, int paramInt2) {
/* 197 */     rangeCheck(paramInt1 + paramInt2);
/* 198 */     if (paramArrayOfint == null || paramInt2 > paramArrayOfint.length) {
/* 199 */       paramArrayOfint = new int[paramInt2];
/*     */     }
/* 201 */     System.arraycopy(this.array, paramInt1, paramArrayOfint, 0, paramInt2);
/* 202 */     return paramArrayOfint;
/*     */   }
/*     */ 
/*     */   
/*     */   public void copyTo(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3) {
/* 207 */     rangeCheck(paramInt1 + paramInt3);
/* 208 */     System.arraycopy(this.array, paramInt1, paramArrayOfint, paramInt2, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void copyTo(int paramInt1, ObservableIntegerArray paramObservableIntegerArray, int paramInt2, int paramInt3) {
/* 213 */     rangeCheck(paramInt1 + paramInt3);
/* 214 */     paramObservableIntegerArray.set(paramInt2, this.array, paramInt1, paramInt3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void resize(int paramInt) {
/* 219 */     if (paramInt < 0) {
/* 220 */       throw new NegativeArraySizeException("Can't resize to negative value: " + paramInt);
/*     */     }
/* 222 */     ensureCapacity(paramInt);
/* 223 */     int i = Math.min(this.size, paramInt);
/* 224 */     boolean bool = (this.size != paramInt) ? true : false;
/* 225 */     this.size = paramInt;
/* 226 */     Arrays.fill(this.array, i, this.size, 0);
/* 227 */     fireChange(bool, i, paramInt);
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
/*     */   private void growCapacity(int paramInt) {
/* 239 */     int i = this.size + paramInt;
/* 240 */     int j = this.array.length;
/* 241 */     if (i > this.array.length) {
/* 242 */       int k = j + (j >> 1);
/* 243 */       if (k < i) k = i; 
/* 244 */       if (k > 2147483639) k = hugeCapacity(i); 
/* 245 */       ensureCapacity(k);
/* 246 */     } else if (paramInt > 0 && i < 0) {
/* 247 */       throw new OutOfMemoryError();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void ensureCapacity(int paramInt) {
/* 253 */     if (this.array.length < paramInt) {
/* 254 */       this.array = Arrays.copyOf(this.array, paramInt);
/*     */     }
/*     */   }
/*     */   
/*     */   private static int hugeCapacity(int paramInt) {
/* 259 */     if (paramInt < 0)
/* 260 */       throw new OutOfMemoryError(); 
/* 261 */     return (paramInt > 2147483639) ? Integer
/* 262 */       .MAX_VALUE : 
/* 263 */       2147483639;
/*     */   }
/*     */ 
/*     */   
/*     */   public void trimToSize() {
/* 268 */     if (this.array.length != this.size) {
/* 269 */       int[] arrayOfInt = new int[this.size];
/* 270 */       System.arraycopy(this.array, 0, arrayOfInt, 0, this.size);
/* 271 */       this.array = arrayOfInt;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void rangeCheck(int paramInt) {
/* 276 */     if (paramInt > this.size) throw new ArrayIndexOutOfBoundsException(this.size); 
/*     */   }
/*     */   
/*     */   private void rangeCheck(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2) {
/* 280 */     if (paramObservableIntegerArray == null) throw new NullPointerException(); 
/* 281 */     if (paramInt1 < 0 || paramInt1 + paramInt2 > paramObservableIntegerArray.size()) {
/* 282 */       throw new ArrayIndexOutOfBoundsException(paramObservableIntegerArray.size());
/*     */     }
/* 284 */     if (paramInt2 < 0) throw new ArrayIndexOutOfBoundsException(-1); 
/*     */   }
/*     */   
/*     */   private void rangeCheck(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 288 */     if (paramArrayOfint == null) throw new NullPointerException(); 
/* 289 */     if (paramInt1 < 0 || paramInt1 + paramInt2 > paramArrayOfint.length) {
/* 290 */       throw new ArrayIndexOutOfBoundsException(paramArrayOfint.length);
/*     */     }
/* 292 */     if (paramInt2 < 0) throw new ArrayIndexOutOfBoundsException(-1);
/*     */   
/*     */   }
/*     */   
/*     */   public String toString() {
/* 297 */     if (this.array == null) {
/* 298 */       return "null";
/*     */     }
/* 300 */     int i = size() - 1;
/* 301 */     if (i == -1) {
/* 302 */       return "[]";
/*     */     }
/* 304 */     StringBuilder stringBuilder = new StringBuilder();
/* 305 */     stringBuilder.append('[');
/* 306 */     for (int j = 0;; j++) {
/* 307 */       stringBuilder.append(this.array[j]);
/* 308 */       if (j == i)
/* 309 */         return stringBuilder.append(']').toString(); 
/* 310 */       stringBuilder.append(", ");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableIntegerArrayImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */