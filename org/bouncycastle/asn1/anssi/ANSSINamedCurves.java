package org.bouncycastle.asn1.anssi;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class ANSSINamedCurves {
  static X9ECParametersHolder FRP256v1 = new X9ECParametersHolder() {
      protected ECCurve createCurve() {
        BigInteger bigInteger1 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
        BigInteger bigInteger2 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
        BigInteger bigInteger3 = ANSSINamedCurves.fromHex("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
        BigInteger bigInteger4 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
        BigInteger bigInteger5 = BigInteger.valueOf(1L);
        return ANSSINamedCurves.configureCurve((ECCurve)new ECCurve.Fp(bigInteger1, bigInteger2, bigInteger3, bigInteger4, bigInteger5, true));
      }
      
      protected X9ECParameters createParameters() {
        byte[] arrayOfByte = null;
        ECCurve eCCurve = createCurve();
        X9ECPoint x9ECPoint = ANSSINamedCurves.configureBasepoint(eCCurve, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB");
        return new X9ECParameters(eCCurve, x9ECPoint, eCCurve.getOrder(), eCCurve.getCofactor(), arrayOfByte);
      }
    };
  
  static final Hashtable objIds = new Hashtable<>();
  
  static final Hashtable curves = new Hashtable<>();
  
  static final Hashtable names = new Hashtable<>();
  
  private static X9ECPoint configureBasepoint(ECCurve paramECCurve, String paramString) {
    X9ECPoint x9ECPoint = new X9ECPoint(paramECCurve, Hex.decodeStrict(paramString));
    WNafUtil.configureBasepoint(x9ECPoint.getPoint());
    return x9ECPoint;
  }
  
  private static ECCurve configureCurve(ECCurve paramECCurve) {
    return paramECCurve;
  }
  
  private static BigInteger fromHex(String paramString) {
    return new BigInteger(1, Hex.decodeStrict(paramString));
  }
  
  static void defineCurve(String paramString, ASN1ObjectIdentifier paramASN1ObjectIdentifier, X9ECParametersHolder paramX9ECParametersHolder) {
    objIds.put(Strings.toLowerCase(paramString), paramASN1ObjectIdentifier);
    names.put(paramASN1ObjectIdentifier, paramString);
    curves.put(paramASN1ObjectIdentifier, paramX9ECParametersHolder);
  }
  
  public static X9ECParameters getByName(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = getOID(paramString);
    return (aSN1ObjectIdentifier == null) ? null : getByOID(aSN1ObjectIdentifier);
  }
  
  public static X9ECParametersHolder getByNameLazy(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = getOID(paramString);
    return (aSN1ObjectIdentifier == null) ? null : getByOIDLazy(aSN1ObjectIdentifier);
  }
  
  public static X9ECParameters getByOID(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    X9ECParametersHolder x9ECParametersHolder = getByOIDLazy(paramASN1ObjectIdentifier);
    return (x9ECParametersHolder == null) ? null : x9ECParametersHolder.getParameters();
  }
  
  public static X9ECParametersHolder getByOIDLazy(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (X9ECParametersHolder)curves.get(paramASN1ObjectIdentifier);
  }
  
  public static ASN1ObjectIdentifier getOID(String paramString) {
    return (ASN1ObjectIdentifier)objIds.get(Strings.toLowerCase(paramString));
  }
  
  public static String getName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (String)names.get(paramASN1ObjectIdentifier);
  }
  
  public static Enumeration getNames() {
    return names.elements();
  }
  
  static {
    defineCurve("FRP256v1", ANSSIObjectIdentifiers.FRP256v1, FRP256v1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\anssi\ANSSINamedCurves.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */