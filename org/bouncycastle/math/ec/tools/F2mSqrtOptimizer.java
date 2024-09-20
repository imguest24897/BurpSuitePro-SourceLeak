package org.bouncycastle.math.ec.tools;

import java.math.BigInteger;
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
import org.bouncycastle.util.Strings;

public class F2mSqrtOptimizer {
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
          implPrintRootZ(eCCurve);
        } 
      } 
    } 
  }
  
  public static void printRootZ(ECCurve paramECCurve) {
    if (!ECAlgorithms.isF2mCurve(paramECCurve))
      throw new IllegalArgumentException("Sqrt optimization only defined over characteristic-2 fields"); 
    implPrintRootZ(paramECCurve);
  }
  
  private static void implPrintRootZ(ECCurve paramECCurve) {
    ECFieldElement eCFieldElement1 = paramECCurve.fromBigInteger(BigInteger.valueOf(2L));
    ECFieldElement eCFieldElement2 = eCFieldElement1.sqrt();
    System.out.println(Strings.toUpperCase(eCFieldElement2.toBigInteger().toString(16)));
    if (!eCFieldElement2.square().equals(eCFieldElement1))
      throw new IllegalStateException("Optimized-sqrt sanity check failed"); 
  }
  
  private static List enumToList(Enumeration paramEnumeration) {
    ArrayList arrayList = new ArrayList();
    while (paramEnumeration.hasMoreElements())
      arrayList.add(paramEnumeration.nextElement()); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\tools\F2mSqrtOptimizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */