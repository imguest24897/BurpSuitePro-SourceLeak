package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.SM2Signer;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.util.Arrays;

public class BcTlsSM2Signer extends BcTlsSigner {
  protected final byte[] identifier;
  
  public BcTlsSM2Signer(BcTlsCrypto paramBcTlsCrypto, ECPrivateKeyParameters paramECPrivateKeyParameters, byte[] paramArrayOfbyte) {
    super(paramBcTlsCrypto, (AsymmetricKeyParameter)paramECPrivateKeyParameters);
    this.identifier = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    if (paramSignatureAndHashAlgorithm == null)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    ParametersWithRandom parametersWithRandom = new ParametersWithRandom((CipherParameters)this.privateKey, this.crypto.getSecureRandom());
    ParametersWithID parametersWithID = new ParametersWithID((CipherParameters)parametersWithRandom, this.identifier);
    SM2Signer sM2Signer = new SM2Signer();
    sM2Signer.init(true, (CipherParameters)parametersWithID);
    return new BcTlsStreamSigner((Signer)sM2Signer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsSM2Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */