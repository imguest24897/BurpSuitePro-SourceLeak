/*     */ package javafx.collections;
/*     */ 
/*     */ import com.sun.javafx.collections.ChangeHelper;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.TreeSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class ListChangeBuilder<E>
/*     */ {
/*  41 */   private static final int[] EMPTY_PERM = new int[0];
/*     */   private final ObservableListBase<E> list;
/*     */   private int changeLock;
/*     */   private List<SubChange<E>> addRemoveChanges;
/*     */   private List<SubChange<E>> updateChanges;
/*     */   private SubChange<E> permutationChange;
/*     */   
/*     */   private void checkAddRemoveList() {
/*  49 */     if (this.addRemoveChanges == null) {
/*  50 */       this.addRemoveChanges = new ArrayList<>();
/*     */     }
/*     */   }
/*     */   
/*     */   private void checkState() {
/*  55 */     if (this.changeLock == 0) {
/*  56 */       throw new IllegalStateException("beginChange was not called on this builder");
/*     */     }
/*     */   }
/*     */   
/*     */   private int findSubChange(int paramInt, List<SubChange<E>> paramList) {
/*  61 */     int i = 0;
/*  62 */     int j = paramList.size() - 1;
/*     */     
/*  64 */     while (i <= j) {
/*  65 */       int k = (i + j) / 2;
/*  66 */       SubChange subChange = paramList.get(k);
/*     */       
/*  68 */       if (paramInt >= subChange.to) {
/*  69 */         i = k + 1; continue;
/*  70 */       }  if (paramInt < subChange.from) {
/*  71 */         j = k - 1; continue;
/*     */       } 
/*  73 */       return k;
/*     */     } 
/*     */     
/*  76 */     return i ^ 0xFFFFFFFF;
/*     */   }
/*     */   
/*     */   private void insertUpdate(int paramInt) {
/*  80 */     int i = findSubChange(paramInt, this.updateChanges);
/*  81 */     if (i < 0) {
/*  82 */       i ^= 0xFFFFFFFF;
/*     */       SubChange subChange;
/*  84 */       if (i > 0 && (subChange = this.updateChanges.get(i - 1)).to == paramInt) {
/*  85 */         subChange.to = paramInt + 1;
/*  86 */       } else if (i < this.updateChanges.size() && (subChange = this.updateChanges.get(i)).from == paramInt + 1) {
/*  87 */         subChange.from = paramInt;
/*     */       } else {
/*  89 */         this.updateChanges.add(i, new SubChange<>(paramInt, paramInt + 1, null, EMPTY_PERM, true));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void insertRemoved(int paramInt, E paramE) {
/*  95 */     int i = findSubChange(paramInt, this.addRemoveChanges);
/*  96 */     if (i < 0) {
/*  97 */       i ^= 0xFFFFFFFF;
/*     */       
/*     */       SubChange subChange;
/* 100 */       if (i > 0 && (subChange = this.addRemoveChanges.get(i - 1)).to == paramInt) {
/* 101 */         subChange.removed.add(paramE);
/* 102 */         i--;
/* 103 */       } else if (i < this.addRemoveChanges.size() && (subChange = this.addRemoveChanges.get(i)).from == paramInt + 1) {
/* 104 */         subChange.from--;
/* 105 */         subChange.to--;
/* 106 */         subChange.removed.add(0, paramE);
/*     */       } else {
/* 108 */         ArrayList<E> arrayList = new ArrayList();
/* 109 */         arrayList.add(paramE);
/* 110 */         this.addRemoveChanges.add(i, new SubChange<>(paramInt, paramInt, arrayList, EMPTY_PERM, false));
/*     */       } 
/*     */     } else {
/* 113 */       SubChange subChange = this.addRemoveChanges.get(i);
/* 114 */       subChange.to--;
/* 115 */       if (subChange.from == subChange.to && (subChange.removed == null || subChange.removed.isEmpty())) {
/* 116 */         this.addRemoveChanges.remove(i);
/*     */       }
/*     */     } 
/* 119 */     for (int j = i + 1; j < this.addRemoveChanges.size(); j++) {
/* 120 */       SubChange subChange = this.addRemoveChanges.get(j);
/* 121 */       subChange.from--;
/* 122 */       subChange.to--;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void insertAdd(int paramInt1, int paramInt2) {
/* 127 */     int i = findSubChange(paramInt1, this.addRemoveChanges);
/* 128 */     int j = paramInt2 - paramInt1;
/*     */     
/* 130 */     if (i < 0) {
/* 131 */       i ^= 0xFFFFFFFF;
/*     */       
/*     */       SubChange subChange;
/* 134 */       if (i > 0 && (subChange = this.addRemoveChanges.get(i - 1)).to == paramInt1) {
/* 135 */         subChange.to = paramInt2;
/* 136 */         i--;
/*     */       } else {
/* 138 */         this.addRemoveChanges.add(i, new SubChange<>(paramInt1, paramInt2, new ArrayList<>(), EMPTY_PERM, false));
/*     */       } 
/*     */     } else {
/* 141 */       SubChange subChange = this.addRemoveChanges.get(i);
/* 142 */       subChange.to += j;
/*     */     } 
/*     */     
/* 145 */     for (int k = i + 1; k < this.addRemoveChanges.size(); k++) {
/* 146 */       SubChange subChange = this.addRemoveChanges.get(k);
/* 147 */       subChange.from += j;
/* 148 */       subChange.to += j;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int compress(List<SubChange<E>> paramList) {
/* 153 */     byte b1 = 0;
/*     */     
/* 155 */     SubChange subChange = paramList.get(0); byte b2; int i;
/* 156 */     for (b2 = 1, i = paramList.size(); b2 < i; b2++) {
/* 157 */       SubChange subChange1 = paramList.get(b2);
/* 158 */       if (subChange.to == subChange1.from) {
/* 159 */         subChange.to = subChange1.to;
/* 160 */         if (subChange.removed != null || subChange1.removed != null) {
/* 161 */           if (subChange.removed == null) {
/* 162 */             subChange.removed = new ArrayList();
/*     */           }
/* 164 */           subChange.removed.addAll(subChange1.removed);
/*     */         } 
/* 166 */         paramList.set(b2, null);
/* 167 */         b1++;
/*     */       } else {
/* 169 */         subChange = subChange1;
/*     */       } 
/*     */     } 
/* 172 */     return b1;
/*     */   }
/*     */   
/*     */   private static class SubChange<E>
/*     */   {
/*     */     int from;
/*     */     int to;
/*     */     List<E> removed;
/*     */     int[] perm;
/*     */     boolean updated;
/*     */     
/*     */     public SubChange(int param1Int1, int param1Int2, List<E> param1List, int[] param1ArrayOfint, boolean param1Boolean) {
/* 184 */       this.from = param1Int1;
/* 185 */       this.to = param1Int2;
/* 186 */       this.removed = param1List;
/* 187 */       this.perm = param1ArrayOfint;
/* 188 */       this.updated = param1Boolean;
/*     */     }
/*     */   }
/*     */   
/*     */   ListChangeBuilder(ObservableListBase<E> paramObservableListBase) {
/* 193 */     this.list = paramObservableListBase;
/*     */   }
/*     */   
/*     */   public void nextRemove(int paramInt, E paramE) {
/* 197 */     checkState();
/* 198 */     checkAddRemoveList();
/*     */ 
/*     */     
/* 201 */     SubChange subChange = this.addRemoveChanges.isEmpty() ? null : this.addRemoveChanges.get(this.addRemoveChanges.size() - 1);
/*     */     
/* 203 */     if (subChange != null && subChange.to == paramInt) {
/* 204 */       subChange.removed.add(paramE);
/* 205 */     } else if (subChange != null && subChange.from == paramInt + 1) {
/* 206 */       subChange.from--;
/* 207 */       subChange.to--;
/* 208 */       subChange.removed.add(0, paramE);
/*     */     } else {
/* 210 */       insertRemoved(paramInt, paramE);
/*     */     } 
/*     */     
/* 213 */     if (this.updateChanges != null && !this.updateChanges.isEmpty()) {
/* 214 */       int i = findSubChange(paramInt, this.updateChanges);
/* 215 */       if (i < 0) {
/* 216 */         i ^= 0xFFFFFFFF;
/*     */       } else {
/* 218 */         SubChange subChange1 = this.updateChanges.get(i);
/* 219 */         if (subChange1.from == subChange1.to - 1) {
/* 220 */           this.updateChanges.remove(i);
/*     */         } else {
/* 222 */           subChange1.to--;
/* 223 */           i++;
/*     */         } 
/*     */       } 
/* 226 */       for (int j = i; j < this.updateChanges.size(); j++) {
/* 227 */         ((SubChange)this.updateChanges.get(j)).from--;
/* 228 */         ((SubChange)this.updateChanges.get(j)).to--;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void nextRemove(int paramInt, List<? extends E> paramList) {
/* 235 */     checkState();
/*     */     
/* 237 */     for (byte b = 0; b < paramList.size(); b++) {
/* 238 */       nextRemove(paramInt, paramList.get(b));
/*     */     }
/*     */   }
/*     */   
/*     */   public void nextAdd(int paramInt1, int paramInt2) {
/* 243 */     checkState();
/* 244 */     checkAddRemoveList();
/*     */     
/* 246 */     SubChange subChange = this.addRemoveChanges.isEmpty() ? null : this.addRemoveChanges.get(this.addRemoveChanges.size() - 1);
/* 247 */     int i = paramInt2 - paramInt1;
/*     */     
/* 249 */     if (subChange != null && subChange.to == paramInt1) {
/* 250 */       subChange.to = paramInt2;
/* 251 */     } else if (subChange != null && paramInt1 >= subChange.from && paramInt1 < subChange.to) {
/* 252 */       subChange.to += i;
/*     */     } else {
/* 254 */       insertAdd(paramInt1, paramInt2);
/*     */     } 
/*     */     
/* 257 */     if (this.updateChanges != null && !this.updateChanges.isEmpty()) {
/* 258 */       int j = findSubChange(paramInt1, this.updateChanges);
/* 259 */       if (j < 0) {
/* 260 */         j ^= 0xFFFFFFFF;
/*     */       } else {
/*     */         
/* 263 */         SubChange subChange1 = this.updateChanges.get(j);
/* 264 */         this.updateChanges.add(j + 1, new SubChange<>(paramInt2, subChange1.to + paramInt2 - paramInt1, null, EMPTY_PERM, true));
/* 265 */         subChange1.to = paramInt1;
/* 266 */         j += 2;
/*     */       } 
/* 268 */       for (int k = j; k < this.updateChanges.size(); k++) {
/* 269 */         ((SubChange)this.updateChanges.get(k)).from += i;
/* 270 */         ((SubChange)this.updateChanges.get(k)).to += i;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void nextPermutation(int paramInt1, int paramInt2, int[] paramArrayOfint) {
/* 277 */     checkState();
/*     */     
/* 279 */     int i = paramInt1;
/* 280 */     int j = paramInt2;
/* 281 */     int[] arrayOfInt = paramArrayOfint;
/*     */     
/* 283 */     if (this.addRemoveChanges != null && !this.addRemoveChanges.isEmpty()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 294 */       int[] arrayOfInt1 = new int[this.list.size()];
/*     */       
/* 296 */       TreeSet<Integer> treeSet = new TreeSet();
/* 297 */       int k = 0;
/* 298 */       int m = 0; int n, i1;
/* 299 */       for (n = 0, i1 = this.addRemoveChanges.size(); n < i1; n++) {
/* 300 */         SubChange subChange = this.addRemoveChanges.get(n); int i2;
/* 301 */         for (i2 = k; i2 < subChange.from; i2++) {
/* 302 */           arrayOfInt1[(i2 < paramInt1 || i2 >= paramInt2) ? i2 : paramArrayOfint[i2 - paramInt1]] = i2 + m;
/*     */         }
/* 304 */         for (i2 = subChange.from; i2 < subChange.to; i2++) {
/* 305 */           arrayOfInt1[(i2 < paramInt1 || i2 >= paramInt2) ? i2 : paramArrayOfint[i2 - paramInt1]] = -1;
/*     */         }
/* 307 */         k = subChange.to;
/* 308 */         i2 = (subChange.removed != null) ? subChange.removed.size() : 0;
/* 309 */         int i3 = subChange.from + m, i4 = subChange.from + m + i2;
/* 310 */         for (; i3 < i4; i3++) {
/* 311 */           treeSet.add(Integer.valueOf(i3));
/*     */         }
/* 313 */         m += i2 - subChange.to - subChange.from;
/*     */       } 
/*     */ 
/*     */       
/* 317 */       for (n = k; n < arrayOfInt1.length; n++) {
/* 318 */         arrayOfInt1[(n < paramInt1 || n >= paramInt2) ? n : paramArrayOfint[n - paramInt1]] = n + m;
/*     */       }
/*     */       
/* 321 */       int[] arrayOfInt2 = new int[this.list.size() + m];
/* 322 */       i1 = 0;
/* 323 */       for (byte b = 0; b < arrayOfInt2.length; b++) {
/* 324 */         if (treeSet.contains(Integer.valueOf(b))) {
/* 325 */           arrayOfInt2[b] = b;
/*     */         } else {
/* 327 */           while (arrayOfInt1[i1] == -1) {
/* 328 */             i1++;
/*     */           }
/* 330 */           arrayOfInt2[arrayOfInt1[i1++]] = b;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 336 */       i = 0;
/* 337 */       j = arrayOfInt2.length;
/* 338 */       arrayOfInt = arrayOfInt2;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 343 */     if (this.permutationChange != null) {
/* 344 */       if (i == this.permutationChange.from && j == this.permutationChange.to) {
/* 345 */         for (byte b = 0; b < arrayOfInt.length; b++) {
/* 346 */           this.permutationChange.perm[b] = arrayOfInt[this.permutationChange.perm[b] - i];
/*     */         }
/*     */       } else {
/* 349 */         int k = Math.max(this.permutationChange.to, j);
/* 350 */         int m = Math.min(this.permutationChange.from, i);
/* 351 */         int[] arrayOfInt1 = new int[k - m];
/*     */         
/* 353 */         for (int n = m; n < k; n++) {
/* 354 */           if (n < this.permutationChange.from || n >= this.permutationChange.to) {
/* 355 */             arrayOfInt1[n - m] = arrayOfInt[n - i];
/*     */           } else {
/* 357 */             int i1 = this.permutationChange.perm[n - this.permutationChange.from];
/* 358 */             if (i1 < i || i1 >= j) {
/* 359 */               arrayOfInt1[n - m] = i1;
/*     */             } else {
/* 361 */               arrayOfInt1[n - m] = arrayOfInt[i1 - i];
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 366 */         this.permutationChange.from = m;
/* 367 */         this.permutationChange.to = k;
/* 368 */         this.permutationChange.perm = arrayOfInt1;
/*     */       } 
/*     */     } else {
/* 371 */       this.permutationChange = new SubChange<>(i, j, null, arrayOfInt, false);
/*     */     } 
/*     */     
/* 374 */     if (this.addRemoveChanges != null && !this.addRemoveChanges.isEmpty()) {
/* 375 */       TreeSet<Integer> treeSet = new TreeSet();
/* 376 */       HashMap<Object, Object> hashMap = new HashMap<>(); byte b; int k;
/* 377 */       for (b = 0, k = this.addRemoveChanges.size(); b < k; b++) {
/* 378 */         SubChange subChange1 = this.addRemoveChanges.get(b);
/* 379 */         for (int m = subChange1.from; m < subChange1.to; m++) {
/* 380 */           if (m < paramInt1 || m >= paramInt2) {
/* 381 */             treeSet.add(Integer.valueOf(m));
/*     */           } else {
/* 383 */             treeSet.add(Integer.valueOf(paramArrayOfint[m - paramInt1]));
/*     */           } 
/*     */         } 
/* 386 */         if (subChange1.removed != null) {
/* 387 */           if (subChange1.from < paramInt1 || subChange1.from >= paramInt2) {
/* 388 */             hashMap.put(Integer.valueOf(subChange1.from), subChange1.removed);
/*     */           } else {
/* 390 */             hashMap.put(Integer.valueOf(paramArrayOfint[subChange1.from - paramInt1]), subChange1.removed);
/*     */           } 
/*     */         }
/*     */       } 
/* 394 */       this.addRemoveChanges.clear();
/* 395 */       SubChange<E> subChange = null;
/* 396 */       for (Integer integer : treeSet) {
/* 397 */         if (subChange == null || subChange.to != integer.intValue()) {
/* 398 */           subChange = new SubChange(integer.intValue(), integer.intValue() + 1, null, EMPTY_PERM, false);
/* 399 */           this.addRemoveChanges.add(subChange);
/*     */         } else {
/* 401 */           subChange.to = integer.intValue() + 1;
/*     */         } 
/* 403 */         List<? extends E> list = (List)hashMap.remove(integer);
/* 404 */         if (list != null) {
/* 405 */           if (subChange.removed != null) {
/* 406 */             subChange.removed.addAll(list); continue;
/*     */           } 
/* 408 */           subChange.removed = (List)list;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 413 */       for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
/* 414 */         Integer integer = (Integer)entry.getKey();
/* 415 */         int m = findSubChange(integer.intValue(), this.addRemoveChanges);
/* 416 */         assert m < 0;
/* 417 */         this.addRemoveChanges.add(m ^ 0xFFFFFFFF, new SubChange<>(integer.intValue(), integer.intValue(), (List<E>)entry.getValue(), new int[0], false));
/*     */       } 
/*     */     } 
/*     */     
/* 421 */     if (this.updateChanges != null && !this.updateChanges.isEmpty()) {
/* 422 */       TreeSet<Integer> treeSet = new TreeSet(); byte b; int k;
/* 423 */       for (b = 0, k = this.updateChanges.size(); b < k; b++) {
/* 424 */         SubChange subChange1 = this.updateChanges.get(b);
/* 425 */         for (int m = subChange1.from; m < subChange1.to; m++) {
/* 426 */           if (m < paramInt1 || m >= paramInt2) {
/* 427 */             treeSet.add(Integer.valueOf(m));
/*     */           } else {
/* 429 */             treeSet.add(Integer.valueOf(paramArrayOfint[m - paramInt1]));
/*     */           } 
/*     */         } 
/*     */       } 
/* 433 */       this.updateChanges.clear();
/* 434 */       SubChange<E> subChange = null;
/* 435 */       for (Integer integer : treeSet) {
/* 436 */         if (subChange == null || subChange.to != integer.intValue()) {
/* 437 */           subChange = new SubChange(integer.intValue(), integer.intValue() + 1, null, EMPTY_PERM, true);
/* 438 */           this.updateChanges.add(subChange); continue;
/*     */         } 
/* 440 */         subChange.to = integer.intValue() + 1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void nextReplace(int paramInt1, int paramInt2, List<? extends E> paramList) {
/* 448 */     nextRemove(paramInt1, paramList);
/* 449 */     nextAdd(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void nextSet(int paramInt, E paramE) {
/* 453 */     nextRemove(paramInt, paramE);
/* 454 */     nextAdd(paramInt, paramInt + 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void nextUpdate(int paramInt) {
/* 459 */     checkState();
/* 460 */     if (this.updateChanges == null) {
/* 461 */       this.updateChanges = new ArrayList<>();
/*     */     }
/* 463 */     SubChange subChange = this.updateChanges.isEmpty() ? null : this.updateChanges.get(this.updateChanges.size() - 1);
/* 464 */     if (subChange != null && subChange.to == paramInt) {
/* 465 */       subChange.to = paramInt + 1;
/*     */     } else {
/* 467 */       insertUpdate(paramInt);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void commit() {
/* 472 */     boolean bool1 = (this.addRemoveChanges != null && !this.addRemoveChanges.isEmpty()) ? true : false;
/* 473 */     boolean bool2 = (this.updateChanges != null && !this.updateChanges.isEmpty()) ? true : false;
/* 474 */     if (this.changeLock == 0 && (bool1 || bool2 || this.permutationChange != null)) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 479 */       int i = ((this.updateChanges != null) ? this.updateChanges.size() : 0) + ((this.addRemoveChanges != null) ? this.addRemoveChanges.size() : 0) + ((this.permutationChange != null) ? 1 : 0);
/* 480 */       if (i == 1) {
/* 481 */         if (bool1) {
/* 482 */           this.list.fireChange(new SingleChange<>(finalizeSubChange(this.addRemoveChanges.get(0)), this.list));
/* 483 */           this.addRemoveChanges.clear();
/* 484 */         } else if (bool2) {
/* 485 */           this.list.fireChange(new SingleChange<>(finalizeSubChange(this.updateChanges.get(0)), this.list));
/* 486 */           this.updateChanges.clear();
/*     */         } else {
/* 488 */           this.list.fireChange(new SingleChange<>(finalizeSubChange(this.permutationChange), this.list));
/* 489 */           this.permutationChange = null;
/*     */         } 
/*     */       } else {
/* 492 */         if (bool2) {
/* 493 */           int j = compress(this.updateChanges);
/* 494 */           i -= j;
/*     */         } 
/* 496 */         if (bool1) {
/* 497 */           int j = compress(this.addRemoveChanges);
/* 498 */           i -= j;
/*     */         } 
/*     */         
/* 501 */         SubChange[] arrayOfSubChange = new SubChange[i];
/* 502 */         byte b = 0;
/* 503 */         if (this.permutationChange != null) {
/* 504 */           arrayOfSubChange[b++] = this.permutationChange;
/*     */         }
/* 506 */         if (bool1) {
/* 507 */           int j = this.addRemoveChanges.size();
/* 508 */           for (byte b1 = 0; b1 < j; b1++) {
/* 509 */             SubChange subChange = this.addRemoveChanges.get(b1);
/* 510 */             if (subChange != null) {
/* 511 */               arrayOfSubChange[b++] = subChange;
/*     */             }
/*     */           } 
/*     */         } 
/* 515 */         if (bool2) {
/* 516 */           int j = this.updateChanges.size();
/* 517 */           for (byte b1 = 0; b1 < j; b1++) {
/* 518 */             SubChange subChange = this.updateChanges.get(b1);
/* 519 */             if (subChange != null) {
/* 520 */               arrayOfSubChange[b++] = subChange;
/*     */             }
/*     */           } 
/*     */         } 
/* 524 */         this.list.fireChange(new IterableChange<>((SubChange[])finalizeSubChangeArray((SubChange<?>[])arrayOfSubChange), this.list));
/* 525 */         if (this.addRemoveChanges != null) this.addRemoveChanges.clear(); 
/* 526 */         if (this.updateChanges != null) this.updateChanges.clear(); 
/* 527 */         this.permutationChange = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void beginChange() {
/* 533 */     this.changeLock++;
/*     */   }
/*     */   
/*     */   public void endChange() {
/* 537 */     if (this.changeLock <= 0) {
/* 538 */       throw new IllegalStateException("Called endChange before beginChange");
/*     */     }
/* 540 */     this.changeLock--;
/* 541 */     commit();
/*     */   }
/*     */   
/*     */   private static <E> SubChange<E>[] finalizeSubChangeArray(SubChange<E>[] paramArrayOfSubChange) {
/* 545 */     for (SubChange<E> subChange : paramArrayOfSubChange) {
/* 546 */       finalizeSubChange(subChange);
/*     */     }
/* 548 */     return paramArrayOfSubChange;
/*     */   }
/*     */   
/*     */   private static <E> SubChange<E> finalizeSubChange(SubChange<E> paramSubChange) {
/* 552 */     if (paramSubChange.perm == null) {
/* 553 */       paramSubChange.perm = EMPTY_PERM;
/*     */     }
/* 555 */     if (paramSubChange.removed == null) {
/* 556 */       paramSubChange.removed = Collections.emptyList();
/*     */     } else {
/* 558 */       paramSubChange.removed = Collections.unmodifiableList(paramSubChange.removed);
/*     */     } 
/* 560 */     return paramSubChange;
/*     */   }
/*     */   
/*     */   private static class SingleChange<E> extends ListChangeListener.Change<E> {
/*     */     private final ListChangeBuilder.SubChange<E> change;
/*     */     private boolean onChange;
/*     */     
/*     */     public SingleChange(ListChangeBuilder.SubChange<E> param1SubChange, ObservableListBase<E> param1ObservableListBase) {
/* 568 */       super(param1ObservableListBase);
/* 569 */       this.change = param1SubChange;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean next() {
/* 574 */       if (this.onChange) {
/* 575 */         return false;
/*     */       }
/* 577 */       this.onChange = true;
/* 578 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void reset() {
/* 583 */       this.onChange = false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getFrom() {
/* 588 */       checkState();
/* 589 */       return this.change.from;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getTo() {
/* 594 */       checkState();
/* 595 */       return this.change.to;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 600 */       checkState();
/* 601 */       return this.change.removed;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int[] getPermutation() {
/* 606 */       checkState();
/* 607 */       return this.change.perm;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasUpdated() {
/* 612 */       checkState();
/* 613 */       return this.change.updated;
/*     */     }
/*     */     
/*     */     private void checkState() {
/* 617 */       if (!this.onChange) {
/* 618 */         throw new IllegalStateException("Invalid Change state: next() must be called before inspecting the Change.");
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*     */       String str;
/* 625 */       if (this.change.perm.length != 0) {
/* 626 */         str = ChangeHelper.permChangeToString(this.change.perm);
/* 627 */       } else if (this.change.updated) {
/* 628 */         str = ChangeHelper.updateChangeToString(this.change.from, this.change.to);
/*     */       } else {
/* 630 */         str = ChangeHelper.addRemoveChangeToString(this.change.from, this.change.to, getList(), this.change.removed);
/*     */       } 
/* 632 */       return "{ " + str + " }";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class IterableChange<E>
/*     */     extends ListChangeListener.Change<E>
/*     */   {
/*     */     private ListChangeBuilder.SubChange<E>[] changes;
/* 641 */     private int cursor = -1;
/*     */     
/*     */     private IterableChange(ListChangeBuilder.SubChange<E>[] param1ArrayOfSubChange, ObservableList<E> param1ObservableList) {
/* 644 */       super(param1ObservableList);
/* 645 */       this.changes = param1ArrayOfSubChange;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean next() {
/* 650 */       if (this.cursor + 1 < this.changes.length) {
/* 651 */         this.cursor++;
/* 652 */         return true;
/*     */       } 
/* 654 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void reset() {
/* 659 */       this.cursor = -1;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getFrom() {
/* 664 */       checkState();
/* 665 */       return (this.changes[this.cursor]).from;
/*     */     }
/*     */ 
/*     */     
/*     */     public int getTo() {
/* 670 */       checkState();
/* 671 */       return (this.changes[this.cursor]).to;
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> getRemoved() {
/* 676 */       checkState();
/* 677 */       return (this.changes[this.cursor]).removed;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int[] getPermutation() {
/* 682 */       checkState();
/* 683 */       return (this.changes[this.cursor]).perm;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasUpdated() {
/* 688 */       checkState();
/* 689 */       return (this.changes[this.cursor]).updated;
/*     */     }
/*     */     
/*     */     private void checkState() {
/* 693 */       if (this.cursor == -1) {
/* 694 */         throw new IllegalStateException("Invalid Change state: next() must be called before inspecting the Change.");
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 700 */       byte b = 0;
/* 701 */       StringBuilder stringBuilder = new StringBuilder();
/* 702 */       stringBuilder.append("{ ");
/* 703 */       while (b < this.changes.length) {
/* 704 */         if ((this.changes[b]).perm.length != 0) {
/* 705 */           stringBuilder.append(ChangeHelper.permChangeToString((this.changes[b]).perm));
/* 706 */         } else if ((this.changes[b]).updated) {
/* 707 */           stringBuilder.append(ChangeHelper.updateChangeToString((this.changes[b]).from, (this.changes[b]).to));
/*     */         } else {
/* 709 */           stringBuilder.append(ChangeHelper.addRemoveChangeToString((this.changes[b]).from, (this.changes[b]).to, getList(), (this.changes[b]).removed));
/*     */         } 
/* 711 */         if (b != this.changes.length - 1) {
/* 712 */           stringBuilder.append(", ");
/*     */         }
/* 714 */         b++;
/*     */       } 
/* 716 */       stringBuilder.append(" }");
/* 717 */       return stringBuilder.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ListChangeBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */