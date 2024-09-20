package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsEncryptor;

final class BcTlsRSAEncryptor implements TlsEncryptor {
  private final BcTlsCrypto crypto;
  
  private final RSAKeyParameters pubKeyRSA;
  
  private static RSAKeyParameters checkPublicKey(RSAKeyParameters paramRSAKeyParameters) {
    if (null == paramRSAKeyParameters || paramRSAKeyParameters.isPrivate())
      throw new IllegalArgumentException("No public RSA key provided"); 
    return paramRSAKeyParameters;
  }
  
  BcTlsRSAEncryptor(BcTlsCrypto paramBcTlsCrypto, RSAKeyParameters paramRSAKeyParameters) {
    this.crypto = paramBcTlsCrypto;
    this.pubKeyRSA = checkPublicKey(paramRSAKeyParameters);
  }
  
  public byte[] encrypt(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      PKCS1Encoding pKCS1Encoding = new PKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine());
      pKCS1Encoding.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)this.pubKeyRSA, this.crypto.getSecureRandom()));
      return pKCS1Encoding.processBlock(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (InvalidCipherTextException invalidCipherTextException) {
      throw new TlsFatalAlert((short)80, invalidCipherTextException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsRSAEncryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */