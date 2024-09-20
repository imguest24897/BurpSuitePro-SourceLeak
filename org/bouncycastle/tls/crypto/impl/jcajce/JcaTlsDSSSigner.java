package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public abstract class JcaTlsDSSSigner implements TlsSigner {
  protected final JcaTlsCrypto crypto;
  
  protected final PrivateKey privateKey;
  
  protected final short algorithmType;
  
  protected final String algorithmName;
  
  protected JcaTlsDSSSigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, short paramShort, String paramString) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPrivateKey)
      throw new NullPointerException("privateKey"); 
    this.crypto = paramJcaTlsCrypto;
    this.privateKey = paramPrivateKey;
    this.algorithmType = paramShort;
    this.algorithmName = paramString;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    if (paramSignatureAndHashAlgorithm != null && paramSignatureAndHashAlgorithm.getSignature() != this.algorithmType)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    try {
      Signature signature = this.crypto.getHelper().createSignature(this.algorithmName);
      signature.initSign(this.privateKey, this.crypto.getSecureRandom());
      if (paramSignatureAndHashAlgorithm == null) {
        signature.update(paramArrayOfbyte, 16, 20);
      } else {
        signature.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      } 
      return signature.sign();
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsDSSSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */