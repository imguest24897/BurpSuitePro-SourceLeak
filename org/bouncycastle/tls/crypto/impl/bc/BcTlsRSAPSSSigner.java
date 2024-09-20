package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;

public class BcTlsRSAPSSSigner extends BcTlsSigner {
  private final int signatureScheme;
  
  public BcTlsRSAPSSSigner(BcTlsCrypto paramBcTlsCrypto, RSAKeyParameters paramRSAKeyParameters, int paramInt) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramRSAKeyParameters);
    if (!SignatureScheme.isRSAPSS(paramInt))
      throw new IllegalArgumentException("signatureScheme"); 
    this.signatureScheme = paramInt;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    if (paramSignatureAndHashAlgorithm == null || SignatureScheme.from(paramSignatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    int i = SignatureScheme.getCryptoHashAlgorithm(this.signatureScheme);
    Digest digest = this.crypto.createDigest(i);
    PSSSigner pSSSigner = PSSSigner.createRawSigner((AsymmetricBlockCipher)new RSABlindedEngine(), digest);
    pSSSigner.init(true, (CipherParameters)new ParametersWithRandom((CipherParameters)this.privateKey, this.crypto.getSecureRandom()));
    pSSSigner.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    try {
      return pSSSigner.generateSignature();
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)80, cryptoException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsRSAPSSSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */