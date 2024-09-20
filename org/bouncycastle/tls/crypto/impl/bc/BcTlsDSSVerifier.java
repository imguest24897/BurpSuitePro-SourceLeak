package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;

public abstract class BcTlsDSSVerifier extends BcTlsVerifier {
  protected BcTlsDSSVerifier(BcTlsCrypto paramBcTlsCrypto, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(paramBcTlsCrypto, paramAsymmetricKeyParameter);
  }
  
  protected abstract DSA createDSAImpl();
  
  protected abstract short getSignatureAlgorithm();
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm != null && signatureAndHashAlgorithm.getSignature() != getSignatureAlgorithm())
      throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
    DSADigestSigner dSADigestSigner = new DSADigestSigner(createDSAImpl(), (Digest)new NullDigest());
    dSADigestSigner.init(false, (CipherParameters)this.publicKey);
    if (signatureAndHashAlgorithm == null) {
      dSADigestSigner.update(paramArrayOfbyte, 16, 20);
    } else {
      dSADigestSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    } 
    return dSADigestSigner.verifySignature(paramDigitallySigned.getSignature());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsDSSVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */