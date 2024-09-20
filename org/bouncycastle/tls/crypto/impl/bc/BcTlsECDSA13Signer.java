package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSADigestSigner;
import org.bouncycastle.crypto.signers.DSAKCalculator;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;

public class BcTlsECDSA13Signer extends BcTlsSigner {
  private final int signatureScheme;
  
  public BcTlsECDSA13Signer(BcTlsCrypto paramBcTlsCrypto, ECPrivateKeyParameters paramECPrivateKeyParameters, int paramInt) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramECPrivateKeyParameters);
    if (!SignatureScheme.isECDSA(paramInt))
      throw new IllegalArgumentException("signatureScheme"); 
    this.signatureScheme = paramInt;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    if (paramSignatureAndHashAlgorithm == null || SignatureScheme.from(paramSignatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    int i = SignatureScheme.getCryptoHashAlgorithm(this.signatureScheme);
    ECDSASigner eCDSASigner = new ECDSASigner((DSAKCalculator)new HMacDSAKCalculator(this.crypto.createDigest(i)));
    DSADigestSigner dSADigestSigner = new DSADigestSigner((DSA)eCDSASigner, (Digest)new NullDigest());
    dSADigestSigner.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)this.privateKey, this.crypto.getSecureRandom()));
    dSADigestSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    try {
      return dSADigestSigner.generateSignature();
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)80, cryptoException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsECDSA13Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */