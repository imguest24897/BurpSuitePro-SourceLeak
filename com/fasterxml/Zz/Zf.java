package com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class Zf {
  public static final BigInteger Zh = BigInteger.valueOf(5L);
  
  static final BigInteger ZD = BigInteger.valueOf(10000000000000000L);
  
  static final BigInteger Zz = BigInteger.valueOf(152587890625L);
  
  private static final BigInteger[] Zl = new BigInteger[] { 
      BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100L), BigInteger.valueOf(1000L), BigInteger.valueOf(10000L), BigInteger.valueOf(100000L), BigInteger.valueOf(1000000L), BigInteger.valueOf(10000000L), BigInteger.valueOf(100000000L), BigInteger.valueOf(1000000000L), 
      BigInteger.valueOf(10000000000L), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L) };
  
  static BigInteger Ze(NavigableMap<Integer, BigInteger> paramNavigableMap, int paramInt) {
    if (paramInt < Zl.length)
      return Zl[paramInt]; 
    if (paramNavigableMap != null) {
      Map.Entry<Integer, BigInteger> entry = paramNavigableMap.floorEntry(Integer.valueOf(paramInt));
      Integer integer = entry.getKey();
      return (integer.intValue() == paramInt) ? entry.getValue() : Zbs.ZT(entry.getValue(), Ze(paramNavigableMap, paramInt - integer.intValue()));
    } 
    return Zh.pow(paramInt).shiftLeft(paramInt);
  }
  
  static BigInteger Zt(NavigableMap<Integer, BigInteger> paramNavigableMap, int paramInt) {
    paramInt &= 0xFFFFFFF0;
    Map.Entry<Integer, BigInteger> entry = paramNavigableMap.floorEntry(Integer.valueOf(paramInt));
    int i = ((Integer)entry.getKey()).intValue();
    BigInteger bigInteger1 = entry.getValue();
    if (i == paramInt)
      return bigInteger1; 
    int j = paramInt - i;
    BigInteger bigInteger2 = paramNavigableMap.get(Integer.valueOf(j));
    if (bigInteger2 == null) {
      bigInteger2 = Zt(paramNavigableMap, j);
      paramNavigableMap.put(Integer.valueOf(j), bigInteger2);
    } 
    return Zbs.ZT(bigInteger1, bigInteger2);
  }
  
  static NavigableMap<Integer, BigInteger> Zh() {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    treeMap.put(Integer.valueOf(0), BigInteger.ONE);
    treeMap.put(Integer.valueOf(16), ZD);
    return (NavigableMap)treeMap;
  }
  
  public static long ZX(long paramLong) {
    return (paramLong * 3402L >>> 10L) + 1L;
  }
  
  static NavigableMap<Integer, BigInteger> Zt(int paramInt1, int paramInt2) {
    TreeMap<Object, Object> treeMap = new TreeMap<>();
    treeMap.put(Integer.valueOf(0), BigInteger.valueOf(5L));
    treeMap.put(Integer.valueOf(16), Zz);
    Zf((NavigableMap)treeMap, paramInt1, paramInt2);
    Iterator<Map.Entry> iterator = treeMap.entrySet().iterator();
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      entry.setValue(((BigInteger)entry.getValue()).shiftLeft(((Integer)entry.getKey()).intValue()));
      if (arrayOfZbqc != null)
        break; 
    } 
    return (NavigableMap)treeMap;
  }
  
  static void Zf(NavigableMap<Integer, BigInteger> paramNavigableMap, int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    if (i <= 18)
      return; 
    int j = ZK(paramInt1, paramInt2);
    int k = paramInt2 - j;
    if (!paramNavigableMap.containsKey(Integer.valueOf(k))) {
      Zf(paramNavigableMap, paramInt1, j);
      Zf(paramNavigableMap, j, paramInt2);
      paramNavigableMap.put(Integer.valueOf(k), Zt(paramNavigableMap, k));
    } 
  }
  
  static long ZV(long paramLong1, long paramLong2) {
    long l1 = paramLong1 & 0xFFFFFFFFL;
    long l2 = paramLong1 >>> 32L;
    long l3 = paramLong2 & 0xFFFFFFFFL;
    long l4 = paramLong2 >>> 32L;
    long l5 = l2 * l4;
    long l6 = l1 * l4;
    long l7 = l2 * l3;
    long l8 = l1 * l3;
    long l9 = l7 + (l8 >>> 32L) + (l6 & 0xFFFFFFFFL);
    return l5 + (l9 >>> 32L) + (l6 >>> 32L);
  }
  
  static int ZK(int paramInt1, int paramInt2) {
    null = paramInt1 + paramInt2 >>> 1;
    return paramInt2 - (paramInt2 - null + 15 >> 4 << 4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */