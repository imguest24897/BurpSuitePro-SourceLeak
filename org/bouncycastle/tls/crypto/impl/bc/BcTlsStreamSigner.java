package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

class BcTlsStreamSigner implements TlsStreamSigner {
  private final SignerOutputStream output;
  
  BcTlsStreamSigner(Signer paramSigner) {
    this.output = new SignerOutputStream(paramSigner);
  }
  
  public OutputStream getOutputStream() throws IOException {
    return (OutputStream)this.output;
  }
  
  public byte[] getSignature() throws IOException {
    try {
      return this.output.getSigner().generateSignature();
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)80, cryptoException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsStreamSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */