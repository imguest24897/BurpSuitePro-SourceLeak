package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorCreationException;

class CMSUtils {
  private static final Set mqvAlgs = new HashSet();
  
  private static final Set ecAlgs = new HashSet();
  
  private static final Set gostAlgs = new HashSet();
  
  private static final Map asymmetricWrapperAlgNames = new HashMap<>();
  
  private static Map<ASN1ObjectIdentifier, String> wrapAlgNames = new HashMap<>();
  
  static boolean isMQV(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return mqvAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  static boolean isEC(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return ecAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  static boolean isGOST(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return gostAlgs.contains(paramASN1ObjectIdentifier);
  }
  
  static boolean isRFC2631(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (paramASN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.id_alg_ESDH) || paramASN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.id_alg_SSDH));
  }
  
  static String getWrapAlgorithmName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return wrapAlgNames.get(paramASN1ObjectIdentifier);
  }
  
  static PrivateKey cleanPrivateKey(PrivateKey paramPrivateKey) {
    return (paramPrivateKey instanceof AnnotatedPrivateKey) ? cleanPrivateKey(((AnnotatedPrivateKey)paramPrivateKey).getKey()) : paramPrivateKey;
  }
  
  static IssuerAndSerialNumber getIssuerAndSerialNumber(X509Certificate paramX509Certificate) throws CertificateEncodingException {
    Certificate certificate = Certificate.getInstance(paramX509Certificate.getEncoded());
    return new IssuerAndSerialNumber(certificate.getIssuer(), paramX509Certificate.getSerialNumber());
  }
  
  static byte[] getSubjectKeyId(X509Certificate paramX509Certificate) {
    byte[] arrayOfByte = paramX509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
    return (arrayOfByte != null) ? ASN1OctetString.getInstance(ASN1OctetString.getInstance(arrayOfByte).getOctets()).getOctets() : null;
  }
  
  static EnvelopedDataHelper createContentHelper(Provider paramProvider) {
    return (paramProvider != null) ? new EnvelopedDataHelper(new ProviderJcaJceExtHelper(paramProvider)) : new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
  }
  
  static EnvelopedDataHelper createContentHelper(String paramString) {
    return (paramString != null) ? new EnvelopedDataHelper(new NamedJcaJceExtHelper(paramString)) : new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
  }
  
  static ASN1Encodable extractParameters(AlgorithmParameters paramAlgorithmParameters) throws CMSException {
    try {
      return AlgorithmParametersUtils.extractParameters(paramAlgorithmParameters);
    } catch (IOException iOException) {
      throw new CMSException("cannot extract parameters: " + iOException.getMessage(), iOException);
    } 
  }
  
  static void loadParameters(AlgorithmParameters paramAlgorithmParameters, ASN1Encodable paramASN1Encodable) throws CMSException {
    try {
      AlgorithmParametersUtils.loadParameters(paramAlgorithmParameters, paramASN1Encodable);
    } catch (IOException iOException) {
      throw new CMSException("error encoding algorithm parameters.", iOException);
    } 
  }
  
  static Key getJceKey(GenericKey paramGenericKey) {
    if (paramGenericKey.getRepresentation() instanceof Key)
      return (Key)paramGenericKey.getRepresentation(); 
    if (paramGenericKey.getRepresentation() instanceof byte[])
      return new SecretKeySpec((byte[])paramGenericKey.getRepresentation(), "ENC"); 
    throw new IllegalArgumentException("unknown generic key type");
  }
  
  static Cipher createAsymmetricWrapper(JcaJceHelper paramJcaJceHelper, ASN1ObjectIdentifier paramASN1ObjectIdentifier, Map paramMap) throws OperatorCreationException {
    try {
      String str = null;
      if (!paramMap.isEmpty())
        str = (String)paramMap.get(paramASN1ObjectIdentifier); 
      if (str == null)
        str = (String)asymmetricWrapperAlgNames.get(paramASN1ObjectIdentifier); 
      if (str != null)
        try {
          return paramJcaJceHelper.createCipher(str);
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
          if (str.equals("RSA/ECB/PKCS1Padding"))
            try {
              return paramJcaJceHelper.createCipher("RSA/NONE/PKCS1Padding");
            } catch (NoSuchAlgorithmException noSuchAlgorithmException1) {} 
        }  
      return paramJcaJceHelper.createCipher(paramASN1ObjectIdentifier.getId());
    } catch (GeneralSecurityException generalSecurityException) {
      throw new OperatorCreationException("cannot create cipher: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public static int getKekSize(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)CMSAlgorithm.AES256_WRAP))
      return 32; 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)CMSAlgorithm.AES128_WRAP))
      return 16; 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)CMSAlgorithm.AES192_WRAP))
      return 24; 
    throw new IllegalArgumentException("unknown wrap algorithm");
  }
  
  static {
    wrapAlgNames.put(CMSAlgorithm.AES128_WRAP, "AESWRAP");
    wrapAlgNames.put(CMSAlgorithm.AES192_WRAP, "AESWRAP");
    wrapAlgNames.put(CMSAlgorithm.AES256_WRAP, "AESWRAP");
    mqvAlgs.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
    mqvAlgs.add(SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
    ecAlgs.add(X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
    ecAlgs.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
    ecAlgs.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
    gostAlgs.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
    gostAlgs.add(CryptoProObjectIdentifiers.gostR3410_2001);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
    gostAlgs.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
    asymmetricWrapperAlgNames.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
    asymmetricWrapperAlgNames.put(OIWObjectIdentifiers.elGamalAlgorithm, "Elgamal/ECB/PKCS1Padding");
    asymmetricWrapperAlgNames.put(PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA/ECB/OAEPPadding");
    asymmetricWrapperAlgNames.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
    asymmetricWrapperAlgNames.put(ISOIECObjectIdentifiers.id_kem_rsa, "RSA-KTS-KEM-KWS");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\CMSUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */