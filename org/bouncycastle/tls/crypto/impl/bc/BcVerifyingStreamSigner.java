package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.io.SignerOutputStream;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.util.io.TeeOutputStream;

class BcVerifyingStreamSigner implements TlsStreamSigner {
  private final Signer signer;
  
  private final Signer verifier;
  
  private final TeeOutputStream output;
  
  BcVerifyingStreamSigner(Signer paramSigner1, Signer paramSigner2) {
    SignerOutputStream signerOutputStream1 = new SignerOutputStream(paramSigner1);
    SignerOutputStream signerOutputStream2 = new SignerOutputStream(paramSigner2);
    this.signer = paramSigner1;
    this.verifier = paramSigner2;
    this.output = new TeeOutputStream((OutputStream)signerOutputStream1, (OutputStream)signerOutputStream2);
  }
  
  public OutputStream getOutputStream() throws IOException {
    return (OutputStream)this.output;
  }
  
  public byte[] getSignature() throws IOException {
    try {
      byte[] arrayOfByte = this.signer.generateSignature();
      if (this.verifier.verifySignature(arrayOfByte))
        return arrayOfByte; 
    } catch (CryptoException cryptoException) {
      throw new TlsFatalAlert((short)80, cryptoException);
    } 
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcVerifyingStreamSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */