package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCertificate;
import org.bouncycastle.util.Arrays;

class ProvAlgorithmChecker extends PKIXCertPathChecker {
  static final int KU_DIGITAL_SIGNATURE = 0;
  
  static final int KU_KEY_ENCIPHERMENT = 2;
  
  static final int KU_KEY_AGREEMENT = 4;
  
  private static final Map<String, String> sigAlgNames = createSigAlgNames();
  
  private static final Set<String> sigAlgNoParams = createSigAlgNoParams();
  
  private static final byte[] DER_NULL_ENCODING = new byte[] { 5, 0 };
  
  private static final String SIG_ALG_NAME_rsa_pss_pss_sha256 = JsseUtils.getJcaSignatureAlgorithmBC("SHA256withRSAandMGF1", "RSASSA-PSS");
  
  private static final String SIG_ALG_NAME_rsa_pss_pss_sha384 = JsseUtils.getJcaSignatureAlgorithmBC("SHA384withRSAandMGF1", "RSASSA-PSS");
  
  private static final String SIG_ALG_NAME_rsa_pss_pss_sha512 = JsseUtils.getJcaSignatureAlgorithmBC("SHA512withRSAandMGF1", "RSASSA-PSS");
  
  private static final String SIG_ALG_NAME_rsa_pss_rsae_sha256 = JsseUtils.getJcaSignatureAlgorithmBC("SHA256withRSAandMGF1", "RSA");
  
  private static final String SIG_ALG_NAME_rsa_pss_rsae_sha384 = JsseUtils.getJcaSignatureAlgorithmBC("SHA384withRSAandMGF1", "RSA");
  
  private static final String SIG_ALG_NAME_rsa_pss_rsae_sha512 = JsseUtils.getJcaSignatureAlgorithmBC("SHA512withRSAandMGF1", "RSA");
  
  private final boolean isInFipsMode;
  
  private final JcaJceHelper helper;
  
  private final BCAlgorithmConstraints algorithmConstraints;
  
  private X509Certificate issuerCert;
  
  private static Map<String, String> createSigAlgNames() {
    HashMap<Object, Object> hashMap = new HashMap<>(4);
    hashMap.put(EdECObjectIdentifiers.id_Ed25519.getId(), "Ed25519");
    hashMap.put(EdECObjectIdentifiers.id_Ed448.getId(), "Ed448");
    hashMap.put(OIWObjectIdentifiers.dsaWithSHA1.getId(), "SHA1withDSA");
    hashMap.put(X9ObjectIdentifiers.id_dsa_with_sha1.getId(), "SHA1withDSA");
    return (Map)Collections.unmodifiableMap(hashMap);
  }
  
  private static Set<String> createSigAlgNoParams() {
    HashSet<String> hashSet = new HashSet();
    hashSet.add(OIWObjectIdentifiers.dsaWithSHA1.getId());
    hashSet.add(X9ObjectIdentifiers.id_dsa_with_sha1.getId());
    hashSet.add(PKCSObjectIdentifiers.id_RSASSA_PSS.getId());
    return Collections.unmodifiableSet(hashSet);
  }
  
  ProvAlgorithmChecker(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    if (null == paramJcaJceHelper)
      throw new NullPointerException("'helper' cannot be null"); 
    if (null == paramBCAlgorithmConstraints)
      throw new NullPointerException("'algorithmConstraints' cannot be null"); 
    this.isInFipsMode = paramBoolean;
    this.helper = paramJcaJceHelper;
    this.algorithmConstraints = paramBCAlgorithmConstraints;
    this.issuerCert = null;
  }
  
  public void init(boolean paramBoolean) throws CertPathValidatorException {
    if (paramBoolean)
      throw new CertPathValidatorException("forward checking not supported"); 
    this.issuerCert = null;
  }
  
  public boolean isForwardCheckingSupported() {
    return false;
  }
  
  public Set<String> getSupportedExtensions() {
    return null;
  }
  
  public void check(Certificate paramCertificate) throws CertPathValidatorException {
    check(paramCertificate, Collections.emptySet());
  }
  
  public void check(Certificate paramCertificate, Collection<String> paramCollection) throws CertPathValidatorException {
    if (!(paramCertificate instanceof X509Certificate))
      throw new CertPathValidatorException("checker can only be used for X.509 certificates"); 
    X509Certificate x509Certificate = (X509Certificate)paramCertificate;
    if (this.isInFipsMode && !isValidFIPSPublicKey(x509Certificate.getPublicKey()))
      throw new CertPathValidatorException("non-FIPS public key found"); 
    if (null != this.issuerCert)
      checkIssuedBy(this.helper, this.algorithmConstraints, x509Certificate, this.issuerCert); 
    this.issuerCert = x509Certificate;
  }
  
  static void checkCertPathExtras(JcaJceHelper paramJcaJceHelper, BCAlgorithmConstraints paramBCAlgorithmConstraints, X509Certificate[] paramArrayOfX509Certificate, KeyPurposeId paramKeyPurposeId, int paramInt) throws CertPathValidatorException {
    X509Certificate x509Certificate1 = paramArrayOfX509Certificate[paramArrayOfX509Certificate.length - 1];
    if (paramArrayOfX509Certificate.length > 1)
      checkIssuedBy(paramJcaJceHelper, paramBCAlgorithmConstraints, paramArrayOfX509Certificate[paramArrayOfX509Certificate.length - 2], x509Certificate1); 
    X509Certificate x509Certificate2 = paramArrayOfX509Certificate[0];
    checkEndEntity(paramJcaJceHelper, paramBCAlgorithmConstraints, x509Certificate2, paramKeyPurposeId, paramInt);
  }
  
  static void checkChain(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, BCAlgorithmConstraints paramBCAlgorithmConstraints, Set<X509Certificate> paramSet, X509Certificate[] paramArrayOfX509Certificate, KeyPurposeId paramKeyPurposeId, int paramInt) throws CertPathValidatorException {
    int i;
    for (i = paramArrayOfX509Certificate.length; i > 0 && paramSet.contains(paramArrayOfX509Certificate[i - 1]); i--);
    if (i < paramArrayOfX509Certificate.length) {
      X509Certificate x509Certificate1 = paramArrayOfX509Certificate[i];
      if (i > 0)
        checkIssuedBy(paramJcaJceHelper, paramBCAlgorithmConstraints, paramArrayOfX509Certificate[i - 1], x509Certificate1); 
    } else {
      checkIssued(paramJcaJceHelper, paramBCAlgorithmConstraints, paramArrayOfX509Certificate[i - 1]);
    } 
    ProvAlgorithmChecker provAlgorithmChecker = new ProvAlgorithmChecker(paramBoolean, paramJcaJceHelper, paramBCAlgorithmConstraints);
    provAlgorithmChecker.init(false);
    for (int j = i - 1; j >= 0; j--)
      provAlgorithmChecker.check(paramArrayOfX509Certificate[j], Collections.emptySet()); 
    X509Certificate x509Certificate = paramArrayOfX509Certificate[0];
    checkEndEntity(paramJcaJceHelper, paramBCAlgorithmConstraints, x509Certificate, paramKeyPurposeId, paramInt);
  }
  
  private static void checkEndEntity(JcaJceHelper paramJcaJceHelper, BCAlgorithmConstraints paramBCAlgorithmConstraints, X509Certificate paramX509Certificate, KeyPurposeId paramKeyPurposeId, int paramInt) throws CertPathValidatorException {
    if (null != paramKeyPurposeId && !supportsExtendedKeyUsage(paramX509Certificate, paramKeyPurposeId))
      throw new CertPathValidatorException("Certificate doesn't support '" + getExtendedKeyUsageName(paramKeyPurposeId) + "' ExtendedKeyUsage"); 
    if (paramInt >= 0) {
      if (!supportsKeyUsage(paramX509Certificate, paramInt))
        throw new CertPathValidatorException("Certificate doesn't support '" + getKeyUsageName(paramInt) + "' KeyUsage"); 
      if (!paramBCAlgorithmConstraints.permits(getKeyUsagePrimitives(paramInt), paramX509Certificate.getPublicKey()))
        throw new CertPathValidatorException("Public key not permitted for '" + getKeyUsageName(paramInt) + "' KeyUsage"); 
    } 
  }
  
  private static void checkIssued(JcaJceHelper paramJcaJceHelper, BCAlgorithmConstraints paramBCAlgorithmConstraints, X509Certificate paramX509Certificate) throws CertPathValidatorException {
    String str = getSigAlgName(paramX509Certificate, null);
    if (!JsseUtils.isNameSpecified(str))
      throw new CertPathValidatorException("Signature algorithm could not be determined"); 
    AlgorithmParameters algorithmParameters = getSigAlgParams(paramJcaJceHelper, paramX509Certificate);
    if (!paramBCAlgorithmConstraints.permits(JsseUtils.SIGNATURE_CRYPTO_PRIMITIVES_BC, str, algorithmParameters))
      throw new CertPathValidatorException("Signature algorithm '" + str + "' not permitted with given parameters"); 
  }
  
  private static void checkIssuedBy(JcaJceHelper paramJcaJceHelper, BCAlgorithmConstraints paramBCAlgorithmConstraints, X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2) throws CertPathValidatorException {
    String str = getSigAlgName(paramX509Certificate1, paramX509Certificate2);
    if (!JsseUtils.isNameSpecified(str))
      throw new CertPathValidatorException("Signature algorithm could not be determined"); 
    AlgorithmParameters algorithmParameters = getSigAlgParams(paramJcaJceHelper, paramX509Certificate1);
    if (!paramBCAlgorithmConstraints.permits(JsseUtils.SIGNATURE_CRYPTO_PRIMITIVES_BC, str, paramX509Certificate2.getPublicKey(), algorithmParameters))
      throw new CertPathValidatorException("Signature algorithm '" + str + "' not permitted with given parameters and issuer public key"); 
  }
  
  static String getExtendedKeyUsageName(KeyPurposeId paramKeyPurposeId) {
    return KeyPurposeId.id_kp_clientAuth.equals(paramKeyPurposeId) ? "clientAuth" : (KeyPurposeId.id_kp_serverAuth.equals(paramKeyPurposeId) ? "serverAuth" : ("(" + paramKeyPurposeId + ")"));
  }
  
  static String getKeyUsageName(int paramInt) {
    switch (paramInt) {
      case 0:
        return "digitalSignature";
      case 2:
        return "keyEncipherment";
      case 4:
        return "keyAgreement";
    } 
    return "(" + paramInt + ")";
  }
  
  static Set<BCCryptoPrimitive> getKeyUsagePrimitives(int paramInt) {
    switch (paramInt) {
      case 4:
        return JsseUtils.KEY_AGREEMENT_CRYPTO_PRIMITIVES_BC;
      case 2:
        return JsseUtils.KEY_ENCAPSULATION_CRYPTO_PRIMITIVES_BC;
    } 
    return JsseUtils.SIGNATURE_CRYPTO_PRIMITIVES_BC;
  }
  
  static String getSigAlgName(X509Certificate paramX509Certificate1, X509Certificate paramX509Certificate2) {
    String str1 = paramX509Certificate1.getSigAlgOID();
    String str2 = sigAlgNames.get(str1);
    if (null != str2)
      return str2; 
    if (PKCSObjectIdentifiers.id_RSASSA_PSS.getId().equals(str1)) {
      RSASSAPSSparams rSASSAPSSparams = RSASSAPSSparams.getInstance(paramX509Certificate1.getSigAlgParams());
      if (null != rSASSAPSSparams) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = rSASSAPSSparams.getHashAlgorithm().getAlgorithm();
        if (null != aSN1ObjectIdentifier) {
          X509Certificate x509Certificate = paramX509Certificate2;
          if (null == x509Certificate)
            x509Certificate = paramX509Certificate1; 
          try {
            JcaTlsCertificate jcaTlsCertificate = new JcaTlsCertificate(null, x509Certificate);
            if (NISTObjectIdentifiers.id_sha256.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
              if (jcaTlsCertificate.supportsSignatureAlgorithmCA((short)9))
                return SIG_ALG_NAME_rsa_pss_pss_sha256; 
              if (jcaTlsCertificate.supportsSignatureAlgorithmCA((short)4))
                return SIG_ALG_NAME_rsa_pss_rsae_sha256; 
            } else if (NISTObjectIdentifiers.id_sha384.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
              if (jcaTlsCertificate.supportsSignatureAlgorithmCA((short)10))
                return SIG_ALG_NAME_rsa_pss_pss_sha384; 
              if (jcaTlsCertificate.supportsSignatureAlgorithmCA((short)5))
                return SIG_ALG_NAME_rsa_pss_rsae_sha384; 
            } else if (NISTObjectIdentifiers.id_sha512.equals((ASN1Primitive)aSN1ObjectIdentifier)) {
              if (jcaTlsCertificate.supportsSignatureAlgorithmCA((short)11))
                return SIG_ALG_NAME_rsa_pss_pss_sha512; 
              if (jcaTlsCertificate.supportsSignatureAlgorithmCA((short)6))
                return SIG_ALG_NAME_rsa_pss_rsae_sha512; 
            } 
          } catch (IOException iOException) {}
        } 
      } 
      return null;
    } 
    return paramX509Certificate1.getSigAlgName();
  }
  
  static AlgorithmParameters getSigAlgParams(JcaJceHelper paramJcaJceHelper, X509Certificate paramX509Certificate) throws CertPathValidatorException {
    AlgorithmParameters algorithmParameters;
    byte[] arrayOfByte = paramX509Certificate.getSigAlgParams();
    if (null == arrayOfByte)
      return null; 
    String str = paramX509Certificate.getSigAlgOID();
    if (sigAlgNoParams.contains(str) && Arrays.areEqual(DER_NULL_ENCODING, arrayOfByte))
      return null; 
    try {
      algorithmParameters = paramJcaJceHelper.createAlgorithmParameters(str);
    } catch (GeneralSecurityException generalSecurityException) {
      return null;
    } 
    try {
      algorithmParameters.init(arrayOfByte);
    } catch (Exception exception) {
      throw new CertPathValidatorException(exception);
    } 
    return algorithmParameters;
  }
  
  static boolean isValidFIPSPublicKey(PublicKey paramPublicKey) {
    try {
      SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded());
      AlgorithmIdentifier algorithmIdentifier = subjectPublicKeyInfo.getAlgorithm();
      if (!X9ObjectIdentifiers.id_ecPublicKey.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm()))
        return true; 
      ASN1Encodable aSN1Encodable = algorithmIdentifier.getParameters();
      if (null != aSN1Encodable) {
        ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
        if (aSN1Primitive instanceof ASN1ObjectIdentifier)
          return true; 
      } 
    } catch (Exception exception) {}
    return false;
  }
  
  static boolean permitsKeyUsage(PublicKey paramPublicKey, boolean[] paramArrayOfboolean, int paramInt, BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    return (supportsKeyUsage(paramArrayOfboolean, paramInt) && paramBCAlgorithmConstraints.permits(getKeyUsagePrimitives(paramInt), paramPublicKey));
  }
  
  static boolean supportsExtendedKeyUsage(X509Certificate paramX509Certificate, KeyPurposeId paramKeyPurposeId) {
    try {
      return supportsExtendedKeyUsage(paramX509Certificate.getExtendedKeyUsage(), paramKeyPurposeId);
    } catch (CertificateParsingException certificateParsingException) {
      return false;
    } 
  }
  
  static boolean supportsExtendedKeyUsage(List<String> paramList, KeyPurposeId paramKeyPurposeId) {
    return (null == paramList || paramList.contains(paramKeyPurposeId.getId()) || paramList.contains(KeyPurposeId.anyExtendedKeyUsage.getId()));
  }
  
  static boolean supportsKeyUsage(X509Certificate paramX509Certificate, int paramInt) {
    return supportsKeyUsage(paramX509Certificate.getKeyUsage(), paramInt);
  }
  
  static boolean supportsKeyUsage(boolean[] paramArrayOfboolean, int paramInt) {
    return (null == paramArrayOfboolean || (paramArrayOfboolean.length > paramInt && paramArrayOfboolean[paramInt]));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvAlgorithmChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */