package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.bouncycastle.tls.crypto.Tls13Verifier;

final class BcTls13Verifier implements Tls13Verifier {
  private final SignerOutputStream output;
  
  BcTls13Verifier(Signer paramSigner) {
    if (paramSigner == null)
      throw new NullPointerException("'verifier' cannot be null"); 
    this.output = new SignerOutputStream(paramSigner);
  }
  
  public final OutputStream getOutputStream() throws IOException {
    return (OutputStream)this.output;
  }
  
  public final boolean verifySignature(byte[] paramArrayOfbyte) throws IOException {
    return this.output.getSigner().verifySignature(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTls13Verifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */