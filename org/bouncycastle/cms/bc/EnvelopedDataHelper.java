package org.bouncycastle.cms.bc;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.AlgorithmIdentifierFactory;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.crypto.util.CipherKeyGeneratorFactory;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.bc.BcDigestProvider;

class EnvelopedDataHelper {
  protected static final Map BASE_CIPHER_NAMES = new HashMap<>();
  
  protected static final Map MAC_ALG_NAMES = new HashMap<>();
  
  private static final Set authEnvelopedAlgorithms = new HashSet();
  
  private static final Map prfs = createTable();
  
  private static Map createTable() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA1, new BcDigestProvider() {
          public ExtendedDigest get(AlgorithmIdentifier param1AlgorithmIdentifier) {
            return (ExtendedDigest)new SHA1Digest();
          }
        });
    hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA224, new BcDigestProvider() {
          public ExtendedDigest get(AlgorithmIdentifier param1AlgorithmIdentifier) {
            return (ExtendedDigest)new SHA224Digest();
          }
        });
    hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA256, new BcDigestProvider() {
          public ExtendedDigest get(AlgorithmIdentifier param1AlgorithmIdentifier) {
            return (ExtendedDigest)SHA256Digest.newInstance();
          }
        });
    hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA384, new BcDigestProvider() {
          public ExtendedDigest get(AlgorithmIdentifier param1AlgorithmIdentifier) {
            return (ExtendedDigest)new SHA384Digest();
          }
        });
    hashMap.put(PKCSObjectIdentifiers.id_hmacWithSHA512, new BcDigestProvider() {
          public ExtendedDigest get(AlgorithmIdentifier param1AlgorithmIdentifier) {
            return (ExtendedDigest)new SHA512Digest();
          }
        });
    return Collections.unmodifiableMap(hashMap);
  }
  
  static ExtendedDigest getPRF(AlgorithmIdentifier paramAlgorithmIdentifier) throws OperatorCreationException {
    return ((BcDigestProvider)prfs.get(paramAlgorithmIdentifier.getAlgorithm())).get(null);
  }
  
  static Wrapper createRFC3211Wrapper(ASN1ObjectIdentifier paramASN1ObjectIdentifier) throws CMSException {
    if (NISTObjectIdentifiers.id_aes128_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier) || NISTObjectIdentifiers.id_aes192_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier) || NISTObjectIdentifiers.id_aes256_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return (Wrapper)new RFC3211WrapEngine((BlockCipher)AESEngine.newInstance()); 
    if (PKCSObjectIdentifiers.des_EDE3_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return (Wrapper)new RFC3211WrapEngine((BlockCipher)new DESedeEngine()); 
    if (OIWObjectIdentifiers.desCBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return (Wrapper)new RFC3211WrapEngine((BlockCipher)new DESEngine()); 
    if (PKCSObjectIdentifiers.RC2_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return (Wrapper)new RFC3211WrapEngine((BlockCipher)new RC2Engine()); 
    throw new CMSException("cannot recognise wrapper: " + paramASN1ObjectIdentifier);
  }
  
  static Object createContentCipher(boolean paramBoolean, CipherParameters paramCipherParameters, AlgorithmIdentifier paramAlgorithmIdentifier) throws CMSException {
    try {
      return CipherFactory.createContentCipher(paramBoolean, paramCipherParameters, paramAlgorithmIdentifier);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CMSException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  AlgorithmIdentifier generateEncryptionAlgID(ASN1ObjectIdentifier paramASN1ObjectIdentifier, KeyParameter paramKeyParameter, SecureRandom paramSecureRandom) throws CMSException {
    try {
      return AlgorithmIdentifierFactory.generateEncryptionAlgID(paramASN1ObjectIdentifier, (paramKeyParameter.getKey()).length * 8, paramSecureRandom);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CMSException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt, SecureRandom paramSecureRandom) throws CMSException {
    try {
      return CipherKeyGeneratorFactory.createKeyGenerator(paramASN1ObjectIdentifier, paramSecureRandom);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new CMSException(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  boolean isAuthEnveloped(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return authEnvelopedAlgorithms.contains(paramASN1ObjectIdentifier);
  }
  
  static {
    BASE_CIPHER_NAMES.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDE");
    BASE_CIPHER_NAMES.put(CMSAlgorithm.AES128_CBC, "AES");
    BASE_CIPHER_NAMES.put(CMSAlgorithm.AES192_CBC, "AES");
    BASE_CIPHER_NAMES.put(CMSAlgorithm.AES256_CBC, "AES");
    MAC_ALG_NAMES.put(CMSAlgorithm.DES_EDE3_CBC, "DESEDEMac");
    MAC_ALG_NAMES.put(CMSAlgorithm.AES128_CBC, "AESMac");
    MAC_ALG_NAMES.put(CMSAlgorithm.AES192_CBC, "AESMac");
    MAC_ALG_NAMES.put(CMSAlgorithm.AES256_CBC, "AESMac");
    MAC_ALG_NAMES.put(CMSAlgorithm.RC2_CBC, "RC2Mac");
    authEnvelopedAlgorithms.add(NISTObjectIdentifiers.id_aes128_GCM);
    authEnvelopedAlgorithms.add(NISTObjectIdentifiers.id_aes192_GCM);
    authEnvelopedAlgorithms.add(NISTObjectIdentifiers.id_aes256_GCM);
    authEnvelopedAlgorithms.add(NISTObjectIdentifiers.id_aes128_CCM);
    authEnvelopedAlgorithms.add(NISTObjectIdentifiers.id_aes192_CCM);
    authEnvelopedAlgorithms.add(NISTObjectIdentifiers.id_aes256_CCM);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\bc\EnvelopedDataHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */