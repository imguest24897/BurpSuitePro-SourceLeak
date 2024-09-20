package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.Signature;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

public class JcaTlsRSAVerifier implements TlsVerifier {
  private final JcaTlsCrypto crypto;
  
  private final PublicKey publicKey;
  
  private Signature rawVerifier = null;
  
  public JcaTlsRSAVerifier(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPublicKey)
      throw new NullPointerException("publicKey"); 
    this.crypto = paramJcaTlsCrypto;
    this.publicKey = paramPublicKey;
  }
  
  public TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    return (signatureAndHashAlgorithm != null && signatureAndHashAlgorithm.getSignature() == 1 && JcaUtils.isSunMSCAPIProviderActive() && isSunMSCAPIRawVerifier()) ? this.crypto.createStreamVerifier(paramDigitallySigned, this.publicKey) : null;
  }
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    try {
      Signature signature = getRawVerifier();
      if (signatureAndHashAlgorithm != null) {
        if (signatureAndHashAlgorithm.getSignature() != 1)
          throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(TlsUtils.getOIDForHashAlgorithm(signatureAndHashAlgorithm.getHash()), (ASN1Encodable)DERNull.INSTANCE);
        byte[] arrayOfByte = (new DigestInfo(algorithmIdentifier, paramArrayOfbyte)).getEncoded();
        signature.update(arrayOfByte, 0, arrayOfByte.length);
      } else {
        signature.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      } 
      return signature.verify(paramDigitallySigned.getSignature());
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("unable to process signature: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  protected Signature getRawVerifier() throws GeneralSecurityException {
    if (this.rawVerifier == null) {
      this.rawVerifier = this.crypto.getHelper().createSignature("NoneWithRSA");
      this.rawVerifier.initVerify(this.publicKey);
    } 
    return this.rawVerifier;
  }
  
  protected boolean isSunMSCAPIRawVerifier() throws IOException {
    try {
      Signature signature = getRawVerifier();
      return JcaUtils.isSunMSCAPIProvider(signature.getProvider());
    } catch (GeneralSecurityException generalSecurityException) {
      return true;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsRSAVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */