package org.bouncycastle.cms;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bsi.BSIObjectIdentifiers;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.eac.EACObjectIdentifiers;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

public class DefaultCMSSignatureAlgorithmNameGenerator implements CMSSignatureAlgorithmNameGenerator {
  private final Map encryptionAlgs = new HashMap<>();
  
  private final Map digestAlgs = new HashMap<>();
  
  private final Map simpleAlgs = new HashMap<>();
  
  private void addEntries(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString1, String paramString2) {
    this.digestAlgs.put(paramASN1ObjectIdentifier, paramString1);
    this.encryptionAlgs.put(paramASN1ObjectIdentifier, paramString2);
  }
  
  public DefaultCMSSignatureAlgorithmNameGenerator() {
    addEntries(NISTObjectIdentifiers.dsa_with_sha224, "SHA224", "DSA");
    addEntries(NISTObjectIdentifiers.dsa_with_sha256, "SHA256", "DSA");
    addEntries(NISTObjectIdentifiers.dsa_with_sha384, "SHA384", "DSA");
    addEntries(NISTObjectIdentifiers.dsa_with_sha512, "SHA512", "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_224, "SHA3-224", "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_256, "SHA3-256", "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_384, "SHA3-384", "DSA");
    addEntries(NISTObjectIdentifiers.id_dsa_with_sha3_512, "SHA3-512", "DSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, "SHA3-224", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, "SHA3-256", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, "SHA3-384", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, "SHA3-512", "RSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_224, "SHA3-224", "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_256, "SHA3-256", "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_384, "SHA3-384", "ECDSA");
    addEntries(NISTObjectIdentifiers.id_ecdsa_with_sha3_512, "SHA3-512", "ECDSA");
    addEntries(OIWObjectIdentifiers.dsaWithSHA1, "SHA1", "DSA");
    addEntries(OIWObjectIdentifiers.md4WithRSA, "MD4", "RSA");
    addEntries(OIWObjectIdentifiers.md4WithRSAEncryption, "MD4", "RSA");
    addEntries(OIWObjectIdentifiers.md5WithRSA, "MD5", "RSA");
    addEntries(OIWObjectIdentifiers.sha1WithRSA, "SHA1", "RSA");
    addEntries(PKCSObjectIdentifiers.md2WithRSAEncryption, "MD2", "RSA");
    addEntries(PKCSObjectIdentifiers.md4WithRSAEncryption, "MD4", "RSA");
    addEntries(PKCSObjectIdentifiers.md5WithRSAEncryption, "MD5", "RSA");
    addEntries(PKCSObjectIdentifiers.sha1WithRSAEncryption, "SHA1", "RSA");
    addEntries(PKCSObjectIdentifiers.sha224WithRSAEncryption, "SHA224", "RSA");
    addEntries(PKCSObjectIdentifiers.sha256WithRSAEncryption, "SHA256", "RSA");
    addEntries(PKCSObjectIdentifiers.sha384WithRSAEncryption, "SHA384", "RSA");
    addEntries(PKCSObjectIdentifiers.sha512WithRSAEncryption, "SHA512", "RSA");
    addEntries(PKCSObjectIdentifiers.sha512_224WithRSAEncryption, "SHA512(224)", "RSA");
    addEntries(PKCSObjectIdentifiers.sha512_256WithRSAEncryption, "SHA512(256)", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224, "SHA3-224", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256, "SHA3-256", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384, "SHA3-384", "RSA");
    addEntries(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, "SHA3-512", "RSA");
    addEntries(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128, "SHAKE128", "RSAPSS");
    addEntries(CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256, "SHAKE256", "RSAPSS");
    addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128, "RIPEMD128", "RSA");
    addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160, "RIPEMD160", "RSA");
    addEntries(TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256, "RIPEMD256", "RSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA1, "SHA1", "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA224, "SHA224", "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA256, "SHA256", "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA384, "SHA384", "ECDSA");
    addEntries(X9ObjectIdentifiers.ecdsa_with_SHA512, "SHA512", "ECDSA");
    addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake128, "SHAKE128", "ECDSA");
    addEntries(CMSObjectIdentifiers.id_ecdsa_with_shake256, "SHAKE256", "ECDSA");
    addEntries(X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1", "DSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_1, "SHA1", "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_224, "SHA224", "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_256, "SHA256", "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_384, "SHA384", "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_ECDSA_SHA_512, "SHA512", "ECDSA");
    addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1, "SHA1", "RSA");
    addEntries(EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256, "SHA256", "RSA");
    addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1, "SHA1", "RSAandMGF1");
    addEntries(EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256, "SHA256", "RSAandMGF1");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA1, "SHA1", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA224, "SHA224", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA256, "SHA256", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA384, "SHA384", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA512, "SHA512", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_RIPEMD160, "RIPEMD160", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_224, "SHA3-224", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_256, "SHA3-256", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_384, "SHA3-384", "PLAIN-ECDSA");
    addEntries(BSIObjectIdentifiers.ecdsa_plain_SHA3_512, "SHA3-512", "PLAIN-ECDSA");
    addEntries(GMObjectIdentifiers.sm2sign_with_sha256, "SHA256", "SM2");
    addEntries(GMObjectIdentifiers.sm2sign_with_sm3, "SM3", "SM2");
    addEntries(BCObjectIdentifiers.sphincs256_with_SHA512, "SHA512", "SPHINCS256");
    addEntries(BCObjectIdentifiers.sphincs256_with_SHA3_512, "SHA3-512", "SPHINCS256");
    addEntries(BCObjectIdentifiers.picnic_with_shake256, "SHAKE256", "Picnic");
    addEntries(BCObjectIdentifiers.picnic_with_sha512, "SHA512", "Picnic");
    addEntries(BCObjectIdentifiers.picnic_with_sha3_512, "SHA3-512", "Picnic");
    this.encryptionAlgs.put(X9ObjectIdentifiers.id_dsa, "DSA");
    this.encryptionAlgs.put(PKCSObjectIdentifiers.rsaEncryption, "RSA");
    this.encryptionAlgs.put(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, "RSA");
    this.encryptionAlgs.put(X509ObjectIdentifiers.id_ea_rsa, "RSA");
    this.encryptionAlgs.put(PKCSObjectIdentifiers.id_RSASSA_PSS, "RSAandMGF1");
    this.encryptionAlgs.put(CryptoProObjectIdentifiers.gostR3410_94, "GOST3410");
    this.encryptionAlgs.put(CryptoProObjectIdentifiers.gostR3410_2001, "ECGOST3410");
    this.encryptionAlgs.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.6.2"), "ECGOST3410");
    this.encryptionAlgs.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.1.5"), "GOST3410");
    this.encryptionAlgs.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256, "ECGOST3410-2012-256");
    this.encryptionAlgs.put(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512, "ECGOST3410-2012-512");
    this.encryptionAlgs.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001, "ECGOST3410");
    this.encryptionAlgs.put(CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, "GOST3410");
    this.encryptionAlgs.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256, "ECGOST3410-2012-256");
    this.encryptionAlgs.put(RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512, "ECGOST3410-2012-512");
    this.encryptionAlgs.put(X9ObjectIdentifiers.id_ecPublicKey, "ECDSA");
    this.digestAlgs.put(PKCSObjectIdentifiers.md2, "MD2");
    this.digestAlgs.put(PKCSObjectIdentifiers.md4, "MD4");
    this.digestAlgs.put(PKCSObjectIdentifiers.md5, "MD5");
    this.digestAlgs.put(OIWObjectIdentifiers.idSHA1, "SHA1");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha224, "SHA224");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha256, "SHA256");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha384, "SHA384");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha512, "SHA512");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha512_224, "SHA512(224)");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha512_256, "SHA512(256)");
    this.digestAlgs.put(NISTObjectIdentifiers.id_shake128, "SHAKE128");
    this.digestAlgs.put(NISTObjectIdentifiers.id_shake256, "SHAKE256");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
    this.digestAlgs.put(NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
    this.digestAlgs.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD128");
    this.digestAlgs.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD160");
    this.digestAlgs.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD256");
    this.digestAlgs.put(CryptoProObjectIdentifiers.gostR3411, "GOST3411");
    this.digestAlgs.put(new ASN1ObjectIdentifier("1.3.6.1.4.1.5849.1.2.1"), "GOST3411");
    this.digestAlgs.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256, "GOST3411-2012-256");
    this.digestAlgs.put(RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512, "GOST3411-2012-512");
    this.digestAlgs.put(GMObjectIdentifiers.sm3, "SM3");
    this.simpleAlgs.put(EdECObjectIdentifiers.id_Ed25519, "Ed25519");
    this.simpleAlgs.put(EdECObjectIdentifiers.id_Ed448, "Ed448");
    this.simpleAlgs.put(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, "LMS");
    this.simpleAlgs.put(MiscObjectIdentifiers.id_alg_composite, "COMPOSITE");
    this.simpleAlgs.put(BCObjectIdentifiers.falcon_512, "Falcon-512");
    this.simpleAlgs.put(BCObjectIdentifiers.falcon_1024, "Falcon-1024");
    this.simpleAlgs.put(BCObjectIdentifiers.dilithium2, "Dilithium2");
    this.simpleAlgs.put(BCObjectIdentifiers.dilithium3, "Dilithium3");
    this.simpleAlgs.put(BCObjectIdentifiers.dilithium5, "Dilithium5");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_sha2_128s, "SPHINCS+-SHA2-128s");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_sha2_128f, "SPHINCS+-SHA2-128f");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_sha2_192s, "SPHINCS+-SHA2-192s");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_sha2_192f, "SPHINCS+-SHA2-192f");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_sha2_256s, "SPHINCS+-SHA2-256s");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_sha2_256f, "SPHINCS+-SHA2-256f");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_shake_128s, "SPHINCS+-SHAKE-128s");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_shake_128f, "SPHINCS+-SHAKE-128f");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_shake_192s, "SPHINCS+-SHAKE-192s");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_shake_192f, "SPHINCS+-SHAKE-192f");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_shake_256s, "SPHINCS+-SHAKE-256s");
    this.simpleAlgs.put(BCObjectIdentifiers.sphincsPlus_shake_256f, "SPHINCS+-SHAKE-256f");
    this.simpleAlgs.put(BCObjectIdentifiers.dilithium2, "Dilithium2");
    this.simpleAlgs.put(BCObjectIdentifiers.dilithium3, "Dilithium3");
    this.simpleAlgs.put(BCObjectIdentifiers.dilithium5, "Dilithium5");
    this.simpleAlgs.put(BCObjectIdentifiers.picnic_signature, "Picnic");
  }
  
  private String getDigestAlgName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = (String)this.digestAlgs.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  private String getEncryptionAlgName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = (String)this.encryptionAlgs.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  protected void setSigningEncryptionAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    this.encryptionAlgs.put(paramASN1ObjectIdentifier, paramString);
  }
  
  protected void setSigningDigestAlgorithmMapping(ASN1ObjectIdentifier paramASN1ObjectIdentifier, String paramString) {
    this.digestAlgs.put(paramASN1ObjectIdentifier, paramString);
  }
  
  public String getSignatureName(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramAlgorithmIdentifier2.getAlgorithm();
    String str1 = (String)this.simpleAlgs.get(aSN1ObjectIdentifier);
    if (str1 != null)
      return str1; 
    if (aSN1ObjectIdentifier.on(BCObjectIdentifiers.sphincsPlus))
      return "SPHINCSPlus"; 
    String str2 = getDigestAlgName(aSN1ObjectIdentifier);
    return !str2.equals(aSN1ObjectIdentifier.getId()) ? (str2 + "with" + getEncryptionAlgName(aSN1ObjectIdentifier)) : (getDigestAlgName(paramAlgorithmIdentifier1.getAlgorithm()) + "with" + getEncryptionAlgName(aSN1ObjectIdentifier));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\DefaultCMSSignatureAlgorithmNameGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */