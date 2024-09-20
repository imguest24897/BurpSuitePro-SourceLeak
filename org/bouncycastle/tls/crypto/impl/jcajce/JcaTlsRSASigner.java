package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public class JcaTlsRSASigner implements TlsSigner {
  private final JcaTlsCrypto crypto;
  
  private final PrivateKey privateKey;
  
  private final PublicKey publicKey;
  
  private Signature rawSigner = null;
  
  public JcaTlsRSASigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, PublicKey paramPublicKey) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPrivateKey)
      throw new NullPointerException("privateKey"); 
    this.crypto = paramJcaTlsCrypto;
    this.privateKey = paramPrivateKey;
    this.publicKey = paramPublicKey;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    try {
      byte[] arrayOfByte1;
      Signature signature = getRawSigner();
      if (paramSignatureAndHashAlgorithm != null) {
        if (paramSignatureAndHashAlgorithm.getSignature() != 1)
          throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(TlsUtils.getOIDForHashAlgorithm(paramSignatureAndHashAlgorithm.getHash()), (ASN1Encodable)DERNull.INSTANCE);
        arrayOfByte1 = (new DigestInfo(algorithmIdentifier, paramArrayOfbyte)).getEncoded();
      } else {
        arrayOfByte1 = paramArrayOfbyte;
      } 
      signature.update(arrayOfByte1, 0, arrayOfByte1.length);
      byte[] arrayOfByte2 = signature.sign();
      signature.initVerify(this.publicKey);
      signature.update(arrayOfByte1, 0, arrayOfByte1.length);
      if (signature.verify(arrayOfByte2))
        return arrayOfByte2; 
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } finally {
      this.rawSigner = null;
    } 
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    return (paramSignatureAndHashAlgorithm != null && 1 == paramSignatureAndHashAlgorithm.getSignature() && JcaUtils.isSunMSCAPIProviderActive() && isSunMSCAPIRawSigner()) ? this.crypto.createVerifyingStreamSigner(paramSignatureAndHashAlgorithm, this.privateKey, true, this.publicKey) : null;
  }
  
  protected Signature getRawSigner() throws GeneralSecurityException {
    if (this.rawSigner == null) {
      this.rawSigner = this.crypto.getHelper().createSignature("NoneWithRSA");
      this.rawSigner.initSign(this.privateKey, this.crypto.getSecureRandom());
    } 
    return this.rawSigner;
  }
  
  protected boolean isSunMSCAPIRawSigner() throws IOException {
    try {
      Signature signature = getRawSigner();
      return JcaUtils.isSunMSCAPIProvider(signature.getProvider());
    } catch (GeneralSecurityException generalSecurityException) {
      return true;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsRSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */