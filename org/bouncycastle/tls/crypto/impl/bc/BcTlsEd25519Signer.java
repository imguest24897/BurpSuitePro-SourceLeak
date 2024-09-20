package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.signers.Ed25519Signer;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public class BcTlsEd25519Signer extends BcTlsSigner {
  public BcTlsEd25519Signer(BcTlsCrypto paramBcTlsCrypto, Ed25519PrivateKeyParameters paramEd25519PrivateKeyParameters) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramEd25519PrivateKeyParameters);
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    if (paramSignatureAndHashAlgorithm == null || SignatureScheme.from(paramSignatureAndHashAlgorithm) != 2055)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    Ed25519Signer ed25519Signer = new Ed25519Signer();
    ed25519Signer.init(true, (CipherParameters)this.privateKey);
    return new BcTlsStreamSigner((Signer)ed25519Signer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsEd25519Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */