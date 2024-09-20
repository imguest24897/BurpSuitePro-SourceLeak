package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.RSAEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;

public class BcTlsRSAPSSVerifier extends BcTlsVerifier {
  private final int signatureScheme;
  
  public BcTlsRSAPSSVerifier(BcTlsCrypto paramBcTlsCrypto, RSAKeyParameters paramRSAKeyParameters, int paramInt) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramRSAKeyParameters);
    if (!SignatureScheme.isRSAPSS(paramInt))
      throw new IllegalArgumentException("signatureScheme"); 
    this.signatureScheme = paramInt;
  }
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm == null || SignatureScheme.from(signatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
    int i = SignatureScheme.getCryptoHashAlgorithm(this.signatureScheme);
    Digest digest = this.crypto.createDigest(i);
    PSSSigner pSSSigner = PSSSigner.createRawSigner((AsymmetricBlockCipher)new RSAEngine(), digest);
    pSSSigner.init(false, (CipherParameters)this.publicKey);
    pSSSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    return pSSSigner.verifySignature(paramDigitallySigned.getSignature());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsRSAPSSVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */