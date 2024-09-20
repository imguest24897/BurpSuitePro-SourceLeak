/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SortHelper
/*     */ {
/*     */   private int[] permutation;
/*     */   private int[] reversePermutation;
/*     */   private static final int INSERTIONSORT_THRESHOLD = 7;
/*     */   
/*     */   public <T> int[] sort(List<T> paramList, Comparator<? super T> paramComparator) {
/*  50 */     Object[] arrayOfObject = paramList.toArray();
/*  51 */     int[] arrayOfInt = sort(arrayOfObject, (Comparator)paramComparator);
/*  52 */     ListIterator<T> listIterator = paramList.listIterator();
/*  53 */     for (byte b = 0; b < arrayOfObject.length; b++) {
/*  54 */       listIterator.next();
/*  55 */       listIterator.set((T)arrayOfObject[b]);
/*     */     } 
/*  57 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   private <T> int[] sort(T[] paramArrayOfT, Comparator<? super T> paramComparator) {
/*  61 */     Object[] arrayOfObject = (Object[])paramArrayOfT.clone();
/*  62 */     int[] arrayOfInt = initPermutation(paramArrayOfT.length);
/*  63 */     mergeSort(arrayOfObject, (Object[])paramArrayOfT, 0, paramArrayOfT.length, 0, (Comparator)paramComparator);
/*  64 */     this.reversePermutation = null;
/*  65 */     this.permutation = null;
/*  66 */     return arrayOfInt;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> int[] sort(T[] paramArrayOfT, int paramInt1, int paramInt2, Comparator<? super T> paramComparator) {
/*  71 */     rangeCheck(paramArrayOfT.length, paramInt1, paramInt2);
/*  72 */     Object[] arrayOfObject = copyOfRange((Object[])paramArrayOfT, paramInt1, paramInt2);
/*  73 */     int[] arrayOfInt = initPermutation(paramArrayOfT.length);
/*  74 */     mergeSort(arrayOfObject, (Object[])paramArrayOfT, paramInt1, paramInt2, -paramInt1, (Comparator)paramComparator);
/*  75 */     this.reversePermutation = null;
/*  76 */     this.permutation = null;
/*  77 */     return Arrays.copyOfRange(arrayOfInt, paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] sort(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/*  82 */     rangeCheck(paramArrayOfint.length, paramInt1, paramInt2);
/*  83 */     int[] arrayOfInt1 = copyOfRange(paramArrayOfint, paramInt1, paramInt2);
/*  84 */     int[] arrayOfInt2 = initPermutation(paramArrayOfint.length);
/*  85 */     mergeSort(arrayOfInt1, paramArrayOfint, paramInt1, paramInt2, -paramInt1);
/*  86 */     this.reversePermutation = null;
/*  87 */     this.permutation = null;
/*  88 */     return Arrays.copyOfRange(arrayOfInt2, paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   private static void rangeCheck(int paramInt1, int paramInt2, int paramInt3) {
/*  92 */     if (paramInt2 > paramInt3) {
/*  93 */       throw new IllegalArgumentException("fromIndex(" + paramInt2 + ") > toIndex(" + paramInt3 + ")");
/*     */     }
/*  95 */     if (paramInt2 < 0) {
/*  96 */       throw new ArrayIndexOutOfBoundsException(paramInt2);
/*     */     }
/*  98 */     if (paramInt3 > paramInt1) {
/*  99 */       throw new ArrayIndexOutOfBoundsException(paramInt3);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static int[] copyOfRange(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 105 */     int i = paramInt2 - paramInt1;
/* 106 */     if (i < 0) {
/* 107 */       throw new IllegalArgumentException("" + paramInt1 + " > " + paramInt1);
/*     */     }
/* 109 */     int[] arrayOfInt = new int[i];
/* 110 */     System.arraycopy(paramArrayOfint, paramInt1, arrayOfInt, 0, Math.min(paramArrayOfint.length - paramInt1, i));
/* 111 */     return arrayOfInt;
/*     */   }
/*     */   
/*     */   private static <T> T[] copyOfRange(T[] paramArrayOfT, int paramInt1, int paramInt2) {
/* 115 */     return copyOfRange(paramArrayOfT, paramInt1, paramInt2, (Class)paramArrayOfT.getClass());
/*     */   }
/*     */   
/*     */   private static <T, U> T[] copyOfRange(U[] paramArrayOfU, int paramInt1, int paramInt2, Class<? extends T[]> paramClass) {
/* 119 */     int i = paramInt2 - paramInt1;
/* 120 */     if (i < 0) {
/* 121 */       throw new IllegalArgumentException("" + paramInt1 + " > " + paramInt1);
/*     */     }
/*     */     
/* 124 */     Object[] arrayOfObject = (paramClass == Object[].class) ? new Object[i] : (Object[])Array.newInstance(paramClass.getComponentType(), i);
/* 125 */     System.arraycopy(paramArrayOfU, paramInt1, arrayOfObject, 0, Math.min(paramArrayOfU.length - paramInt1, i));
/* 126 */     return (T[])arrayOfObject;
/*     */   }
/*     */ 
/*     */   
/*     */   private void mergeSort(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt1, int paramInt2, int paramInt3) {
/* 131 */     int i = paramInt2 - paramInt1;
/*     */ 
/*     */     
/* 134 */     if (i < 7) {
/* 135 */       for (int i3 = paramInt1; i3 < paramInt2; i3++) {
/* 136 */         for (int i4 = i3; i4 > paramInt1 && Integer.compare(paramArrayOfint2[i4 - 1], paramArrayOfint2[i4]) > 0; i4--) {
/* 137 */           swap(paramArrayOfint2, i4, i4 - 1);
/*     */         }
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 144 */     int j = paramInt1;
/* 145 */     int k = paramInt2;
/* 146 */     paramInt1 += paramInt3;
/* 147 */     paramInt2 += paramInt3;
/* 148 */     int m = paramInt1 + paramInt2 >>> 1;
/* 149 */     mergeSort(paramArrayOfint2, paramArrayOfint1, paramInt1, m, -paramInt3);
/* 150 */     mergeSort(paramArrayOfint2, paramArrayOfint1, m, paramInt2, -paramInt3);
/*     */ 
/*     */ 
/*     */     
/* 154 */     if (Integer.compare(paramArrayOfint1[m - 1], paramArrayOfint1[m]) <= 0) {
/* 155 */       System.arraycopy(paramArrayOfint1, paramInt1, paramArrayOfint2, j, i);
/*     */       
/*     */       return;
/*     */     } 
/*     */     int n, i1, i2;
/* 160 */     for (n = j, i1 = paramInt1, i2 = m; n < k; n++) {
/* 161 */       if (i2 >= paramInt2 || (i1 < m && Integer.compare(paramArrayOfint1[i1], paramArrayOfint1[i2]) <= 0)) {
/* 162 */         paramArrayOfint2[n] = paramArrayOfint1[i1];
/* 163 */         this.permutation[this.reversePermutation[i1++]] = n;
/*     */       } else {
/* 165 */         paramArrayOfint2[n] = paramArrayOfint1[i2];
/* 166 */         this.permutation[this.reversePermutation[i2++]] = n;
/*     */       } 
/*     */     } 
/*     */     
/* 170 */     for (n = j; n < k; n++) {
/* 171 */       this.reversePermutation[this.permutation[n]] = n;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private <T> void mergeSort(T[] paramArrayOfT1, T[] paramArrayOfT2, int paramInt1, int paramInt2, int paramInt3, Comparator<? super T> paramComparator) {
/* 177 */     int i = paramInt2 - paramInt1;
/*     */ 
/*     */     
/* 180 */     if (i < 7) {
/* 181 */       for (int i3 = paramInt1; i3 < paramInt2; i3++) {
/* 182 */         for (int i4 = i3; i4 > paramInt1 && paramComparator.compare(paramArrayOfT2[i4 - 1], paramArrayOfT2[i4]) > 0; i4--) {
/* 183 */           swap((Object[])paramArrayOfT2, i4, i4 - 1);
/*     */         }
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 190 */     int j = paramInt1;
/* 191 */     int k = paramInt2;
/* 192 */     paramInt1 += paramInt3;
/* 193 */     paramInt2 += paramInt3;
/* 194 */     int m = paramInt1 + paramInt2 >>> 1;
/* 195 */     mergeSort(paramArrayOfT2, paramArrayOfT1, paramInt1, m, -paramInt3, paramComparator);
/* 196 */     mergeSort(paramArrayOfT2, paramArrayOfT1, m, paramInt2, -paramInt3, paramComparator);
/*     */ 
/*     */ 
/*     */     
/* 200 */     if (paramComparator.compare(paramArrayOfT1[m - 1], paramArrayOfT1[m]) <= 0) {
/* 201 */       System.arraycopy(paramArrayOfT1, paramInt1, paramArrayOfT2, j, i);
/*     */       
/*     */       return;
/*     */     } 
/*     */     int n, i1, i2;
/* 206 */     for (n = j, i1 = paramInt1, i2 = m; n < k; n++) {
/* 207 */       if (i2 >= paramInt2 || (i1 < m && paramComparator.compare(paramArrayOfT1[i1], paramArrayOfT1[i2]) <= 0)) {
/* 208 */         paramArrayOfT2[n] = paramArrayOfT1[i1];
/* 209 */         this.permutation[this.reversePermutation[i1++]] = n;
/*     */       } else {
/* 211 */         paramArrayOfT2[n] = paramArrayOfT1[i2];
/* 212 */         this.permutation[this.reversePermutation[i2++]] = n;
/*     */       } 
/*     */     } 
/*     */     
/* 216 */     for (n = j; n < k; n++) {
/* 217 */       this.reversePermutation[this.permutation[n]] = n;
/*     */     }
/*     */   }
/*     */   
/*     */   private void swap(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 222 */     int i = paramArrayOfint[paramInt1];
/* 223 */     paramArrayOfint[paramInt1] = paramArrayOfint[paramInt2];
/* 224 */     paramArrayOfint[paramInt2] = i;
/* 225 */     this.permutation[this.reversePermutation[paramInt1]] = paramInt2;
/* 226 */     this.permutation[this.reversePermutation[paramInt2]] = paramInt1;
/* 227 */     int j = this.reversePermutation[paramInt1];
/* 228 */     this.reversePermutation[paramInt1] = this.reversePermutation[paramInt2];
/* 229 */     this.reversePermutation[paramInt2] = j;
/*     */   }
/*     */   
/*     */   private void swap(Object[] paramArrayOfObject, int paramInt1, int paramInt2) {
/* 233 */     Object object = paramArrayOfObject[paramInt1];
/* 234 */     paramArrayOfObject[paramInt1] = paramArrayOfObject[paramInt2];
/* 235 */     paramArrayOfObject[paramInt2] = object;
/* 236 */     this.permutation[this.reversePermutation[paramInt1]] = paramInt2;
/* 237 */     this.permutation[this.reversePermutation[paramInt2]] = paramInt1;
/* 238 */     int i = this.reversePermutation[paramInt1];
/* 239 */     this.reversePermutation[paramInt1] = this.reversePermutation[paramInt2];
/* 240 */     this.reversePermutation[paramInt2] = i;
/*     */   }
/*     */   
/*     */   private int[] initPermutation(int paramInt) {
/* 244 */     this.permutation = new int[paramInt];
/* 245 */     this.reversePermutation = new int[paramInt];
/* 246 */     for (byte b = 0; b < paramInt; b++) {
/* 247 */       this.reversePermutation[b] = b; this.permutation[b] = b;
/*     */     } 
/* 249 */     return this.permutation;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\SortHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */