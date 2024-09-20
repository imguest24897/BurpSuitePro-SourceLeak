package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.GenericSigner;
import org.bouncycastle.crypto.signers.RSADigestSigner;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsUtils;

public class BcTlsRSAVerifier extends BcTlsVerifier {
  public BcTlsRSAVerifier(BcTlsCrypto paramBcTlsCrypto, RSAKeyParameters paramRSAKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramRSAKeyParameters);
  }
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) {
    GenericSigner genericSigner;
    NullDigest nullDigest = new NullDigest();
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm != null) {
      if (signatureAndHashAlgorithm.getSignature() != 1)
        throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
      RSADigestSigner rSADigestSigner = new RSADigestSigner((Digest)nullDigest, TlsUtils.getOIDForHashAlgorithm(signatureAndHashAlgorithm.getHash()));
    } else {
      genericSigner = new GenericSigner((AsymmetricBlockCipher)new PKCS1Encoding((AsymmetricBlockCipher)new RSABlindedEngine()), (Digest)nullDigest);
    } 
    genericSigner.init(false, (CipherParameters)this.publicKey);
    genericSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    return genericSigner.verifySignature(paramDigitallySigned.getSignature());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsRSAVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */