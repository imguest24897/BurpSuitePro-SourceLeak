package org.bouncycastle.math.ec.tools;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Integers;

public class TraceOptimizer {
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private static final SecureRandom R = new SecureRandom();
  
  public static void main(String[] paramArrayOfString) {
    TreeSet treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
    treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
    for (String str : treeSet) {
      X9ECParametersHolder x9ECParametersHolder = CustomNamedCurves.getByNameLazy(str);
      if (x9ECParametersHolder == null)
        x9ECParametersHolder = ECNamedCurveTable.getByNameLazy(str); 
      if (x9ECParametersHolder != null) {
        ECCurve eCCurve = x9ECParametersHolder.getCurve();
        if (ECAlgorithms.isF2mCurve(eCCurve)) {
          System.out.print(str + ":");
          implPrintNonZeroTraceBits(eCCurve);
        } 
      } 
    } 
  }
  
  public static void printNonZeroTraceBits(ECCurve paramECCurve) {
    if (!ECAlgorithms.isF2mCurve(paramECCurve))
      throw new IllegalArgumentException("Trace only defined over characteristic-2 fields"); 
    implPrintNonZeroTraceBits(paramECCurve);
  }
  
  public static void implPrintNonZeroTraceBits(ECCurve paramECCurve) {
    int i = paramECCurve.getFieldSize();
    ArrayList<Integer> arrayList = new ArrayList();
    byte b;
    for (b = 0; b < i; b++) {
      if (0 == (b & 0x1) && 0 != b) {
        if (arrayList.contains(Integers.valueOf(b >>> 1))) {
          arrayList.add(Integers.valueOf(b));
          System.out.print(" " + b);
        } 
      } else {
        BigInteger bigInteger = ONE.shiftLeft(b);
        ECFieldElement eCFieldElement = paramECCurve.fromBigInteger(bigInteger);
        int j = calculateTrace(eCFieldElement);
        if (j != 0) {
          arrayList.add(Integers.valueOf(b));
          System.out.print(" " + b);
        } 
      } 
    } 
    System.out.println();
    for (b = 0; b < 'Ϩ'; b++) {
      BigInteger bigInteger = new BigInteger(i, R);
      ECFieldElement eCFieldElement = paramECCurve.fromBigInteger(bigInteger);
      int j = calculateTrace(eCFieldElement);
      int k = 0;
      for (byte b1 = 0; b1 < arrayList.size(); b1++) {
        int m = ((Integer)arrayList.get(b1)).intValue();
        if (bigInteger.testBit(m))
          k ^= 0x1; 
      } 
      if (j != k)
        throw new IllegalStateException("Optimized-trace sanity check failed"); 
    } 
  }
  
  private static int calculateTrace(ECFieldElement paramECFieldElement) {
    int i = paramECFieldElement.getFieldSize();
    int j = 31 - Integers.numberOfLeadingZeros(i);
    int k = 1;
    ECFieldElement eCFieldElement = paramECFieldElement;
    while (j > 0) {
      eCFieldElement = eCFieldElement.squarePow(k).add(eCFieldElement);
      k = i >>> --j;
      if (0 != (k & 0x1))
        eCFieldElement = eCFieldElement.square().add(paramECFieldElement); 
    } 
    if (eCFieldElement.isZero())
      return 0; 
    if (eCFieldElement.isOne())
      return 1; 
    throw new IllegalStateException("Internal error in trace calculation");
  }
  
  private static List enumToList(Enumeration paramEnumeration) {
    ArrayList arrayList = new ArrayList();
    while (paramEnumeration.hasMoreElements())
      arrayList.add(paramEnumeration.nextElement()); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\tools\TraceOptimizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */