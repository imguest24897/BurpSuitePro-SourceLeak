package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.tls.crypto.impl.TlsImplUtils;

public class DefaultTlsCredentialedSigner implements TlsCredentialedSigner {
  protected TlsCryptoParameters cryptoParams;
  
  protected Certificate certificate;
  
  protected SignatureAndHashAlgorithm signatureAndHashAlgorithm;
  
  protected TlsSigner signer;
  
  public DefaultTlsCredentialedSigner(TlsCryptoParameters paramTlsCryptoParameters, TlsSigner paramTlsSigner, Certificate paramCertificate, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    if (paramCertificate == null)
      throw new IllegalArgumentException("'certificate' cannot be null"); 
    if (paramCertificate.isEmpty())
      throw new IllegalArgumentException("'certificate' cannot be empty"); 
    if (paramTlsSigner == null)
      throw new IllegalArgumentException("'signer' cannot be null"); 
    this.signer = paramTlsSigner;
    this.cryptoParams = paramTlsCryptoParameters;
    this.certificate = paramCertificate;
    this.signatureAndHashAlgorithm = paramSignatureAndHashAlgorithm;
  }
  
  public Certificate getCertificate() {
    return this.certificate;
  }
  
  public byte[] generateRawSignature(byte[] paramArrayOfbyte) throws IOException {
    return this.signer.generateRawSignature(getEffectiveAlgorithm(), paramArrayOfbyte);
  }
  
  public SignatureAndHashAlgorithm getSignatureAndHashAlgorithm() {
    return this.signatureAndHashAlgorithm;
  }
  
  public TlsStreamSigner getStreamSigner() throws IOException {
    return this.signer.getStreamSigner(getEffectiveAlgorithm());
  }
  
  protected SignatureAndHashAlgorithm getEffectiveAlgorithm() {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
    if (TlsImplUtils.isTLSv12(this.cryptoParams)) {
      signatureAndHashAlgorithm = getSignatureAndHashAlgorithm();
      if (signatureAndHashAlgorithm == null)
        throw new IllegalStateException("'signatureAndHashAlgorithm' cannot be null for (D)TLS 1.2+"); 
    } 
    return signatureAndHashAlgorithm;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsCredentialedSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */