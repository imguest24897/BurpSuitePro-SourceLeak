package org.bouncycastle.crypto.util;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.DESKeyGenerator;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.internal.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.internal.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;

public class CipherKeyGeneratorFactory {
  public static CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier paramASN1ObjectIdentifier, SecureRandom paramSecureRandom) throws IllegalArgumentException {
    if (NISTObjectIdentifiers.id_aes128_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (NISTObjectIdentifiers.id_aes192_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 192); 
    if (NISTObjectIdentifiers.id_aes256_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 256); 
    if (NISTObjectIdentifiers.id_aes128_GCM.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (NISTObjectIdentifiers.id_aes192_GCM.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 192); 
    if (NISTObjectIdentifiers.id_aes256_GCM.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 256); 
    if (NISTObjectIdentifiers.id_aes128_CCM.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (NISTObjectIdentifiers.id_aes192_CCM.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 192); 
    if (NISTObjectIdentifiers.id_aes256_CCM.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 256); 
    if (PKCSObjectIdentifiers.des_EDE3_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier)) {
      DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
      dESedeKeyGenerator.init(new KeyGenerationParameters(paramSecureRandom, 192));
      return (CipherKeyGenerator)dESedeKeyGenerator;
    } 
    if (NTTObjectIdentifiers.id_camellia128_cbc.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (NTTObjectIdentifiers.id_camellia192_cbc.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 192); 
    if (NTTObjectIdentifiers.id_camellia256_cbc.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 256); 
    if (KISAObjectIdentifiers.id_seedCBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (AlgorithmIdentifierFactory.CAST5_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (OIWObjectIdentifiers.desCBC.equals((ASN1Primitive)paramASN1ObjectIdentifier)) {
      DESKeyGenerator dESKeyGenerator = new DESKeyGenerator();
      dESKeyGenerator.init(new KeyGenerationParameters(paramSecureRandom, 64));
      return (CipherKeyGenerator)dESKeyGenerator;
    } 
    if (PKCSObjectIdentifiers.rc4.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    if (PKCSObjectIdentifiers.RC2_CBC.equals((ASN1Primitive)paramASN1ObjectIdentifier))
      return createCipherKeyGenerator(paramSecureRandom, 128); 
    throw new IllegalArgumentException("cannot recognise cipher: " + paramASN1ObjectIdentifier);
  }
  
  private static CipherKeyGenerator createCipherKeyGenerator(SecureRandom paramSecureRandom, int paramInt) {
    CipherKeyGenerator cipherKeyGenerator = new CipherKeyGenerator();
    cipherKeyGenerator.init(new KeyGenerationParameters(paramSecureRandom, paramInt));
    return cipherKeyGenerator;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypt\\util\CipherKeyGeneratorFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */