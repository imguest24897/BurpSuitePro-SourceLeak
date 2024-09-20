package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;

public abstract class BcTlsDSSSigner extends BcTlsSigner {
  protected BcTlsDSSSigner(BcTlsCrypto paramBcTlsCrypto, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(paramBcTlsCrypto, paramAsymmetricKeyParameter);
  }
  
  protected abstract DSA createDSAImpl(int paramInt);
  
  protected abstract short getSignatureAlgorithm();
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    if (paramSignatureAndHashAlgorithm != null && paramSignatureAndHashAlgorithm.getSignature() != getSignatureAlgorithm())
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    boolean bool = (null == paramSignatureAndHashAlgorithm) ? true : TlsCryptoUtils.getHash(paramSignatureAndHashAlgorithm.getHash());
    DSADigestSigner dSADigestSigner = new DSADigestSigner(createDSAImpl(bool), (Digest)new NullDigest());
    dSADigestSigner.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)this.privateKey, this.crypto.getSecureRandom()));
    if (paramSignatureAndHashAlgorithm == null) {
      dSADigestSigner.update(paramArrayOfbyte, 16, 20);
    } else {
      dSADigestSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    } 
    try {
      return dSADigestSigner.generateSignature();
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)80, cryptoException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsDSSSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */