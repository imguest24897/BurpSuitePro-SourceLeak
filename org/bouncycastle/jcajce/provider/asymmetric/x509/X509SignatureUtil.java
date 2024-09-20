package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.util.Objects;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.encoders.Hex;

class X509SignatureUtil {
  private static final Map<ASN1ObjectIdentifier, String> algNames = new HashMap<>();
  
  static boolean areEquivalentAlgorithms(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    return !paramAlgorithmIdentifier1.getAlgorithm().equals((ASN1Primitive)paramAlgorithmIdentifier2.getAlgorithm()) ? false : ((Properties.isOverrideSet("org.bouncycastle.x509.allow_absent_equiv_NULL") && isAbsentOrEmptyParameters(paramAlgorithmIdentifier1.getParameters()) && isAbsentOrEmptyParameters(paramAlgorithmIdentifier2.getParameters())) ? true : Objects.areEqual(paramAlgorithmIdentifier1.getParameters(), paramAlgorithmIdentifier2.getParameters()));
  }
  
  private static boolean isAbsentOrEmptyParameters(ASN1Encodable paramASN1Encodable) {
    return (paramASN1Encodable == null || DERNull.INSTANCE.equals(paramASN1Encodable));
  }
  
  static boolean isCompositeAlgorithm(AlgorithmIdentifier paramAlgorithmIdentifier) {
    return MiscObjectIdentifiers.id_alg_composite.equals((ASN1Primitive)paramAlgorithmIdentifier.getAlgorithm());
  }
  
  static void setSignatureParameters(Signature paramSignature, ASN1Encodable paramASN1Encodable) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
    if (!isAbsentOrEmptyParameters(paramASN1Encodable)) {
      String str = paramSignature.getAlgorithm();
      AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(str, paramSignature.getProvider());
      try {
        algorithmParameters.init(paramASN1Encodable.toASN1Primitive().getEncoded());
      } catch (IOException iOException) {
        throw new SignatureException("IOException decoding parameters: " + iOException.getMessage());
      } 
      if (str.endsWith("MGF1"))
        try {
          paramSignature.setParameter(algorithmParameters.getParameterSpec((Class)PSSParameterSpec.class));
        } catch (GeneralSecurityException generalSecurityException) {
          throw new SignatureException("Exception extracting parameters: " + generalSecurityException.getMessage());
        }  
    } 
  }
  
  static String getSignatureName(AlgorithmIdentifier paramAlgorithmIdentifier) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramAlgorithmIdentifier.getAlgorithm();
    ASN1Encodable aSN1Encodable = paramAlgorithmIdentifier.getParameters();
    if (!isAbsentOrEmptyParameters(aSN1Encodable)) {
      if (PKCSObjectIdentifiers.id_RSASSA_PSS.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
        RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(aSN1Encodable);
        return getDigestAlgName(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()) + "withRSAandMGF1";
      } 
      if (X9ObjectIdentifiers.ecdsa_with_SHA2.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Encodable);
        return getDigestAlgName((ASN1ObjectIdentifier)aSN1Sequence.getObjectAt(0)) + "withECDSA";
      } 
    } 
    String str = algNames.get(aSN1ObjectIdentifier);
    return (str != null) ? str : findAlgName(aSN1ObjectIdentifier);
  }
  
  private static String getDigestAlgName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = MessageDigestUtils.getDigestName(paramASN1ObjectIdentifier);
    int i = str.indexOf('-');
    return (i > 0 && !str.startsWith("SHA3")) ? (str.substring(0, i) + str.substring(i + 1)) : str;
  }
  
  private static String findAlgName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    Provider provider = Security.getProvider("BC");
    if (provider != null) {
      String str = lookupAlg(provider, paramASN1ObjectIdentifier);
      if (str != null)
        return str; 
    } 
    Provider[] arrayOfProvider = Security.getProviders();
    for (byte b = 0; b != arrayOfProvider.length; b++) {
      if (provider != arrayOfProvider[b]) {
        String str = lookupAlg(arrayOfProvider[b], paramASN1ObjectIdentifier);
        if (str != null)
          return str; 
      } 
    } 
    return paramASN1ObjectIdentifier.getId();
  }
  
  private static String lookupAlg(Provider paramProvider, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = paramProvider.getProperty("Alg.Alias.Signature." + paramASN1ObjectIdentifier);
    if (str != null)
      return str; 
    str = paramProvider.getProperty("Alg.Alias.Signature.OID." + paramASN1ObjectIdentifier);
    return (str != null) ? str : null;
  }
  
  static void prettyPrintSignature(byte[] paramArrayOfbyte, StringBuffer paramStringBuffer, String paramString) {
    if (paramArrayOfbyte.length > 20) {
      paramStringBuffer.append("            Signature: ").append(Hex.toHexString(paramArrayOfbyte, 0, 20)).append(paramString);
      for (byte b = 20; b < paramArrayOfbyte.length; b += 20) {
        if (b < paramArrayOfbyte.length - 20) {
          paramStringBuffer.append("                       ").append(Hex.toHexString(paramArrayOfbyte, b, 20)).append(paramString);
        } else {
          paramStringBuffer.append("                       ").append(Hex.toHexString(paramArrayOfbyte, b, paramArrayOfbyte.length - b)).append(paramString);
        } 
      } 
    } else {
      paramStringBuffer.append("            Signature: ").append(Hex.toHexString(paramArrayOfbyte)).append(paramString);
    } 
  }
  
  static {
    algNames.put(EdECObjectIdentifiers.id_Ed25519, "Ed25519");
    algNames.put(EdECObjectIdentifiers.id_Ed448, "Ed448");
    algNames.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1withDSA");
    algNames.put(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1withDSA");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\x509\X509SignatureUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */