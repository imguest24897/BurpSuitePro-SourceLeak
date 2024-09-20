package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;

class BcTlsStreamVerifier implements TlsStreamVerifier {
  private final SignerOutputStream output;
  
  private final byte[] signature;
  
  BcTlsStreamVerifier(Signer paramSigner, byte[] paramArrayOfbyte) {
    this.output = new SignerOutputStream(paramSigner);
    this.signature = paramArrayOfbyte;
  }
  
  public OutputStream getOutputStream() throws IOException {
    return (OutputStream)this.output;
  }
  
  public boolean isVerified() throws IOException {
    return this.output.getSigner().verifySignature(this.signature);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsStreamVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */