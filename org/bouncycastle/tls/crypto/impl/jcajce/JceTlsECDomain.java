package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsECDomain;

public class JceTlsECDomain implements TlsECDomain {
  protected final JcaTlsCrypto crypto;
  
  protected final TlsECConfig ecConfig;
  
  protected final ECParameterSpec ecSpec;
  
  protected final ECCurve ecCurve;
  
  public JceTlsECDomain(JcaTlsCrypto paramJcaTlsCrypto, TlsECConfig paramTlsECConfig) {
    int i = paramTlsECConfig.getNamedGroup();
    if (NamedGroup.refersToAnECDSACurve(i)) {
      ECParameterSpec eCParameterSpec = ECUtil.getECParameterSpec(paramJcaTlsCrypto, NamedGroup.getCurveName(i));
      if (null != eCParameterSpec) {
        this.crypto = paramJcaTlsCrypto;
        this.ecConfig = paramTlsECConfig;
        this.ecSpec = eCParameterSpec;
        this.ecCurve = ECUtil.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        return;
      } 
    } 
    throw new IllegalArgumentException("NamedGroup not supported: " + NamedGroup.getText(i));
  }
  
  public JceTlsSecret calculateECDHAgreement(PrivateKey paramPrivateKey, PublicKey paramPublicKey) throws IOException {
    try {
      byte[] arrayOfByte = this.crypto.calculateKeyAgreement("ECDH", paramPrivateKey, paramPublicKey, "TlsPremasterSecret");
      return this.crypto.adoptLocalSecret(arrayOfByte);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("cannot calculate secret", generalSecurityException);
    } 
  }
  
  public TlsAgreement createECDH() {
    return new JceTlsECDH(this);
  }
  
  public ECPoint decodePoint(byte[] paramArrayOfbyte) throws IOException {
    return this.ecCurve.decodePoint(paramArrayOfbyte);
  }
  
  public PublicKey decodePublicKey(byte[] paramArrayOfbyte) throws IOException {
    try {
      ECPoint eCPoint = decodePoint(paramArrayOfbyte).normalize();
      BigInteger bigInteger1 = eCPoint.getAffineXCoord().toBigInteger();
      BigInteger bigInteger2 = eCPoint.getAffineYCoord().toBigInteger();
      ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(bigInteger1, bigInteger2), this.ecSpec);
      KeyFactory keyFactory = this.crypto.getHelper().createKeyFactory("EC");
      return keyFactory.generatePublic(eCPublicKeySpec);
    } catch (Exception exception) {
      throw new TlsFatalAlert((short)47, exception);
    } 
  }
  
  public byte[] encodePoint(ECPoint paramECPoint) throws IOException {
    return paramECPoint.getEncoded(false);
  }
  
  public byte[] encodePublicKey(PublicKey paramPublicKey) throws IOException {
    if (paramPublicKey instanceof ECPublicKey)
      return encodePoint(((ECPublicKey)paramPublicKey).getQ()); 
    if (paramPublicKey instanceof ECPublicKey) {
      ECPoint eCPoint = ((ECPublicKey)paramPublicKey).getW();
      return encodePoint(this.ecCurve.createPoint(eCPoint.getAffineX(), eCPoint.getAffineY()));
    } 
    SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded());
    return subjectPublicKeyInfo.getPublicKeyData().getOctets();
  }
  
  public KeyPair generateKeyPair() {
    try {
      KeyPairGenerator keyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("EC");
      keyPairGenerator.initialize(this.ecSpec, this.crypto.getSecureRandom());
      return keyPairGenerator.generateKeyPair();
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("unable to create key pair: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsECDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */