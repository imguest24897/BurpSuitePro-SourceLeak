package org.bouncycastle.jce;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECNamedCurveTable {
  public static ECNamedCurveParameterSpec getParameterSpec(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier;
    X9ECParameters x9ECParameters;
    try {
      aSN1ObjectIdentifier = possibleOID(paramString) ? new ASN1ObjectIdentifier(paramString) : null;
    } catch (IllegalArgumentException illegalArgumentException) {
      aSN1ObjectIdentifier = null;
    } 
    if (aSN1ObjectIdentifier != null) {
      x9ECParameters = CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
    } else {
      x9ECParameters = CustomNamedCurves.getByName(paramString);
    } 
    if (x9ECParameters == null)
      if (aSN1ObjectIdentifier != null) {
        x9ECParameters = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
      } else {
        x9ECParameters = org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(paramString);
      }  
    return (x9ECParameters == null) ? null : new ECNamedCurveParameterSpec(paramString, x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
  }
  
  public static Enumeration getNames() {
    return org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames();
  }
  
  private static boolean possibleOID(String paramString) {
    if (paramString.length() < 3 || paramString.charAt(1) != '.')
      return false; 
    char c = paramString.charAt(0);
    return !(c < '0' || c > '2');
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\ECNamedCurveTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */