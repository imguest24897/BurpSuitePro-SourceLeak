package org.bouncycastle.pqc.jcajce.provider.util;

import java.security.InvalidKeyException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.ARIAEngine;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.RFC3394WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.util.Arrays;

public class WrapUtil {
  public static Wrapper getKeyWrapper(KTSParameterSpec paramKTSParameterSpec, byte[] paramArrayOfbyte) throws InvalidKeyException {
    Wrapper wrapper = getWrapper(paramKTSParameterSpec.getKeyAlgorithmName());
    AlgorithmIdentifier algorithmIdentifier = paramKTSParameterSpec.getKdfAlgorithm();
    if (algorithmIdentifier == null) {
      wrapper.init(true, (CipherParameters)new KeyParameter(Arrays.copyOfRange(paramArrayOfbyte, 0, (paramKTSParameterSpec.getKeySize() + 7) / 8)));
    } else {
      wrapper.init(true, (CipherParameters)new KeyParameter(makeKeyBytes(paramKTSParameterSpec, paramArrayOfbyte)));
    } 
    return wrapper;
  }
  
  public static Wrapper getKeyUnwrapper(KTSParameterSpec paramKTSParameterSpec, byte[] paramArrayOfbyte) throws InvalidKeyException {
    Wrapper wrapper = getWrapper(paramKTSParameterSpec.getKeyAlgorithmName());
    AlgorithmIdentifier algorithmIdentifier = paramKTSParameterSpec.getKdfAlgorithm();
    if (algorithmIdentifier == null) {
      wrapper.init(false, (CipherParameters)new KeyParameter(paramArrayOfbyte, 0, (paramKTSParameterSpec.getKeySize() + 7) / 8));
    } else {
      wrapper.init(false, (CipherParameters)new KeyParameter(makeKeyBytes(paramKTSParameterSpec, paramArrayOfbyte)));
    } 
    return wrapper;
  }
  
  public static Wrapper getWrapper(String paramString) {
    RFC5649WrapEngine rFC5649WrapEngine;
    if (paramString.equalsIgnoreCase("AESWRAP") || paramString.equalsIgnoreCase("AES")) {
      RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine((BlockCipher)new AESEngine());
    } else if (paramString.equalsIgnoreCase("ARIA")) {
      RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine((BlockCipher)new ARIAEngine());
    } else if (paramString.equalsIgnoreCase("Camellia")) {
      RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine((BlockCipher)new CamelliaEngine());
    } else if (paramString.equalsIgnoreCase("SEED")) {
      RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine((BlockCipher)new SEEDEngine());
    } else if (paramString.equalsIgnoreCase("AES-KWP")) {
      rFC5649WrapEngine = new RFC5649WrapEngine((BlockCipher)new AESEngine());
    } else if (paramString.equalsIgnoreCase("Camellia-KWP")) {
      rFC5649WrapEngine = new RFC5649WrapEngine((BlockCipher)new CamelliaEngine());
    } else if (paramString.equalsIgnoreCase("ARIA-KWP")) {
      rFC5649WrapEngine = new RFC5649WrapEngine((BlockCipher)new ARIAEngine());
    } else {
      throw new UnsupportedOperationException("unknown key algorithm: " + paramString);
    } 
    return (Wrapper)rFC5649WrapEngine;
  }
  
  private static byte[] makeKeyBytes(KTSParameterSpec paramKTSParameterSpec, byte[] paramArrayOfbyte) throws InvalidKeyException {
    AlgorithmIdentifier algorithmIdentifier = paramKTSParameterSpec.getKdfAlgorithm();
    byte[] arrayOfByte1 = paramKTSParameterSpec.getOtherInfo();
    byte[] arrayOfByte2 = new byte[(paramKTSParameterSpec.getKeySize() + 7) / 8];
    if (X9ObjectIdentifiers.id_kdf_kdf2.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
      AlgorithmIdentifier algorithmIdentifier1 = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
      KDF2BytesGenerator kDF2BytesGenerator = new KDF2BytesGenerator(getDigest(algorithmIdentifier1.getAlgorithm()));
      kDF2BytesGenerator.init((DerivationParameters)new KDFParameters(paramArrayOfbyte, arrayOfByte1));
      kDF2BytesGenerator.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
    } else if (X9ObjectIdentifiers.id_kdf_kdf3.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
      AlgorithmIdentifier algorithmIdentifier1 = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
      ConcatenationKDFGenerator concatenationKDFGenerator = new ConcatenationKDFGenerator(getDigest(algorithmIdentifier1.getAlgorithm()));
      concatenationKDFGenerator.init((DerivationParameters)new KDFParameters(paramArrayOfbyte, arrayOfByte1));
      concatenationKDFGenerator.generateBytes(arrayOfByte2, 0, arrayOfByte2.length);
    } else if (NISTObjectIdentifiers.id_shake256.equals((ASN1Primitive)algorithmIdentifier.getAlgorithm())) {
      SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
      sHAKEDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      sHAKEDigest.update(arrayOfByte1, 0, arrayOfByte1.length);
      sHAKEDigest.doFinal(arrayOfByte2, 0, arrayOfByte2.length);
    } else {
      throw new InvalidKeyException("Unrecognized KDF: " + algorithmIdentifier.getAlgorithm());
    } 
    return arrayOfByte2;
  }
  
  static Digest getDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256))
      return (Digest)new SHA256Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha512))
      return (Digest)new SHA512Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake128))
      return (Digest)new SHAKEDigest(128); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake256))
      return (Digest)new SHAKEDigest(256); 
    throw new IllegalArgumentException("unrecognized digest OID: " + paramASN1ObjectIdentifier);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provide\\util\WrapUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */