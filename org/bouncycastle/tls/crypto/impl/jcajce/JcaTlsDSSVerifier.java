package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

public abstract class JcaTlsDSSVerifier implements TlsVerifier {
  protected final JcaTlsCrypto crypto;
  
  protected final PublicKey publicKey;
  
  protected final short algorithmType;
  
  protected final String algorithmName;
  
  protected JcaTlsDSSVerifier(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey, short paramShort, String paramString) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPublicKey)
      throw new NullPointerException("publicKey"); 
    this.crypto = paramJcaTlsCrypto;
    this.publicKey = paramPublicKey;
    this.algorithmType = paramShort;
    this.algorithmName = paramString;
  }
  
  public TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException {
    return null;
  }
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm != null && signatureAndHashAlgorithm.getSignature() != this.algorithmType)
      throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
    try {
      Signature signature = this.crypto.getHelper().createSignature(this.algorithmName);
      signature.initVerify(this.publicKey);
      if (signatureAndHashAlgorithm == null) {
        signature.update(paramArrayOfbyte, 16, 20);
      } else {
        signature.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      } 
      return signature.verify(paramDigitallySigned.getSignature());
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("unable to process signature: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsDSSVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */