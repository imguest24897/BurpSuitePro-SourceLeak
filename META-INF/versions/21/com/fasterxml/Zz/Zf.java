package META-INF.versions.21.com.fasterxml.Zz;

import burp.Zbqc;
import burp.Zmuc;
import com.fasterxml.Zz.Zbs;
import java.math.BigInteger;
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
    Zbqc[] arrayOfZbqc = Zmuc.ZA();
    Zf((NavigableMap)treeMap, paramInt1, paramInt2);
    for (Map.Entry<Object, Object> entry : treeMap.entrySet()) {
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
    return Math.unsignedMultiplyHigh(paramLong1, paramLong2);
  }
  
  static int ZK(int paramInt1, int paramInt2) {
    null = paramInt1 + paramInt2 >>> 1;
    return paramInt2 - (paramInt2 - null + 15 >> 4 << 4);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\21\com\fasterxml\Zz\Zf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */