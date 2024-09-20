package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.util.Arrays;

public class JceX25519Domain implements TlsECDomain {
  protected final JcaTlsCrypto crypto;
  
  public JceX25519Domain(JcaTlsCrypto paramJcaTlsCrypto) {
    this.crypto = paramJcaTlsCrypto;
  }
  
  public JceTlsSecret calculateECDHAgreement(PrivateKey paramPrivateKey, PublicKey paramPublicKey) throws IOException {
    try {
      byte[] arrayOfByte = this.crypto.calculateKeyAgreement("X25519", paramPrivateKey, paramPublicKey, "TlsPremasterSecret");
      if (arrayOfByte == null || arrayOfByte.length != 32)
        throw new TlsCryptoException("invalid secret calculated"); 
      if (Arrays.areAllZeroes(arrayOfByte, 0, arrayOfByte.length))
        throw new TlsFatalAlert((short)40); 
      return this.crypto.adoptLocalSecret(arrayOfByte);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("cannot calculate secret", generalSecurityException);
    } 
  }
  
  public TlsAgreement createECDH() {
    return new JceX25519(this);
  }
  
  public PublicKey decodePublicKey(byte[] paramArrayOfbyte) throws IOException {
    return XDHUtil.decodePublicKey(this.crypto, "X25519", EdECObjectIdentifiers.id_X25519, paramArrayOfbyte);
  }
  
  public byte[] encodePublicKey(PublicKey paramPublicKey) throws IOException {
    return XDHUtil.encodePublicKey(paramPublicKey);
  }
  
  public KeyPair generateKeyPair() {
    try {
      KeyPairGenerator keyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("X25519");
      keyPairGenerator.initialize(255, this.crypto.getSecureRandom());
      return keyPairGenerator.generateKeyPair();
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("unable to create key pair: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceX25519Domain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */