package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.signers.Ed448Signer;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public class BcTlsEd448Signer extends BcTlsSigner {
  public BcTlsEd448Signer(BcTlsCrypto paramBcTlsCrypto, Ed448PrivateKeyParameters paramEd448PrivateKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramEd448PrivateKeyParameters);
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    if (paramSignatureAndHashAlgorithm == null || SignatureScheme.from(paramSignatureAndHashAlgorithm) != 2056)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    Ed448Signer ed448Signer = new Ed448Signer(TlsUtils.EMPTY_BYTES);
    ed448Signer.init(true, (CipherParameters)this.privateKey);
    return new BcTlsStreamSigner((Signer)ed448Signer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsEd448Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */