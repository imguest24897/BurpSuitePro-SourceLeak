package META-INF.versions.9.org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.internal.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.encoders.Hex;

public class ECGOST3410NamedCurves {
  static X9ECParametersHolder gostR3410_2001_CryptoPro_A = (X9ECParametersHolder)new Object();
  
  static X9ECParametersHolder gostR3410_2001_CryptoPro_B = (X9ECParametersHolder)new Object();
  
  static X9ECParametersHolder gostR3410_2001_CryptoPro_C = (X9ECParametersHolder)new Object();
  
  static X9ECParametersHolder id_tc26_gost_3410_12_256_paramSetA = (X9ECParametersHolder)new Object();
  
  static X9ECParametersHolder id_tc26_gost_3410_12_512_paramSetA = (X9ECParametersHolder)new Object();
  
  static X9ECParametersHolder id_tc26_gost_3410_12_512_paramSetB = (X9ECParametersHolder)new Object();
  
  static X9ECParametersHolder id_tc26_gost_3410_12_512_paramSetC = (X9ECParametersHolder)new Object();
  
  static final Hashtable objIds = new Hashtable<>();
  
  static final Hashtable curves = new Hashtable<>();
  
  static final Hashtable names = new Hashtable<>();
  
  private static X9ECPoint configureBasepoint(ECCurve paramECCurve, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    ECPoint eCPoint = paramECCurve.createPoint(paramBigInteger1, paramBigInteger2);
    WNafUtil.configureBasepoint(eCPoint);
    return new X9ECPoint(eCPoint, false);
  }
  
  private static ECCurve configureCurve(ECCurve paramECCurve) {
    return paramECCurve;
  }
  
  private static BigInteger fromHex(String paramString) {
    return new BigInteger(1, Hex.decodeStrict(paramString));
  }
  
  static void defineCurve(String paramString, ASN1ObjectIdentifier paramASN1ObjectIdentifier, X9ECParametersHolder paramX9ECParametersHolder) {
    objIds.put(paramString, paramASN1ObjectIdentifier);
    names.put(paramASN1ObjectIdentifier, paramString);
    curves.put(paramASN1ObjectIdentifier, paramX9ECParametersHolder);
  }
  
  public static X9ECParameters getByNameX9(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = getOID(paramString);
    return (aSN1ObjectIdentifier == null) ? null : getByOIDX9(aSN1ObjectIdentifier);
  }
  
  public static X9ECParametersHolder getByNameLazy(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = getOID(paramString);
    return (aSN1ObjectIdentifier == null) ? null : getByOIDLazy(aSN1ObjectIdentifier);
  }
  
  public static X9ECParameters getByOIDX9(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    X9ECParametersHolder x9ECParametersHolder = getByOIDLazy(paramASN1ObjectIdentifier);
    return (x9ECParametersHolder == null) ? null : x9ECParametersHolder.getParameters();
  }
  
  public static X9ECParametersHolder getByOIDLazy(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (X9ECParametersHolder)curves.get(paramASN1ObjectIdentifier);
  }
  
  public static ASN1ObjectIdentifier getOID(String paramString) {
    return (ASN1ObjectIdentifier)objIds.get(paramString);
  }
  
  public static String getName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (String)names.get(paramASN1ObjectIdentifier);
  }
  
  public static Enumeration getNames() {
    return names.elements();
  }
  
  static {
    defineCurve("GostR3410-2001-CryptoPro-A", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A, gostR3410_2001_CryptoPro_A);
    defineCurve("GostR3410-2001-CryptoPro-B", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B, gostR3410_2001_CryptoPro_B);
    defineCurve("GostR3410-2001-CryptoPro-C", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C, gostR3410_2001_CryptoPro_C);
    defineCurve("GostR3410-2001-CryptoPro-XchA", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA, gostR3410_2001_CryptoPro_A);
    defineCurve("GostR3410-2001-CryptoPro-XchB", CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB, gostR3410_2001_CryptoPro_C);
    defineCurve("Tc26-Gost-3410-12-256-paramSetA", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA, id_tc26_gost_3410_12_256_paramSetA);
    defineCurve("Tc26-Gost-3410-12-256-paramSetB", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetB, gostR3410_2001_CryptoPro_A);
    defineCurve("Tc26-Gost-3410-12-256-paramSetC", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetC, gostR3410_2001_CryptoPro_B);
    defineCurve("Tc26-Gost-3410-12-256-paramSetD", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetD, gostR3410_2001_CryptoPro_C);
    defineCurve("Tc26-Gost-3410-12-512-paramSetA", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetA, id_tc26_gost_3410_12_512_paramSetA);
    defineCurve("Tc26-Gost-3410-12-512-paramSetB", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetB, id_tc26_gost_3410_12_512_paramSetB);
    defineCurve("Tc26-Gost-3410-12-512-paramSetC", RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetC, id_tc26_gost_3410_12_512_paramSetC);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\cryptopro\ECGOST3410NamedCurves.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */