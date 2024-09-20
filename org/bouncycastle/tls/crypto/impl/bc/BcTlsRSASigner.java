package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.GenericSigner;
import org.bouncycastle.crypto.signers.RSADigestSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;

public class BcTlsRSASigner extends BcTlsSigner {
  private final RSAKeyParameters publicKey;
  
  public BcTlsRSASigner(BcTlsCrypto paramBcTlsCrypto, RSAKeyParameters paramRSAKeyParameters1, RSAKeyParameters paramRSAKeyParameters2) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramRSAKeyParameters1);
    this.publicKey = paramRSAKeyParameters2;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    GenericSigner genericSigner;
    NullDigest nullDigest = new NullDigest();
    if (paramSignatureAndHashAlgorithm != null) {
      if (paramSignatureAndHashAlgorithm.getSignature() != 1)
        throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
      RSADigestSigner rSADigestSigner = new RSADigestSigner((Digest)nullDigest, TlsUtils.getOIDForHashAlgorithm(paramSignatureAndHashAlgorithm.getHash()));
    } else {
      genericSigner = new GenericSigner((AsymmetricBlockCipher)new PKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine()), (Digest)nullDigest);
    } 
    genericSigner.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)this.privateKey, this.crypto.getSecureRandom()));
    genericSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    try {
      byte[] arrayOfByte = genericSigner.generateSignature();
      genericSigner.init(false, (CipherParameters)this.publicKey);
      genericSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      if (genericSigner.verifySignature(arrayOfByte))
        return arrayOfByte; 
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)80, cryptoException);
    } 
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsRSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */