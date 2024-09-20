package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.tls.NamedGroup;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.util.BigIntegers;

public class BcTlsECDomain implements TlsECDomain {
  protected final BcTlsCrypto crypto;
  
  protected final TlsECConfig config;
  
  protected final ECDomainParameters domainParameters;
  
  public static BcTlsSecret calculateECDHAgreement(BcTlsCrypto paramBcTlsCrypto, ECPrivateKeyParameters paramECPrivateKeyParameters, ECPublicKeyParameters paramECPublicKeyParameters) {
    ECDHBasicAgreement eCDHBasicAgreement = new ECDHBasicAgreement();
    eCDHBasicAgreement.init((CipherParameters)paramECPrivateKeyParameters);
    BigInteger bigInteger = eCDHBasicAgreement.calculateAgreement((CipherParameters)paramECPublicKeyParameters);
    byte[] arrayOfByte = BigIntegers.asUnsignedByteArray(eCDHBasicAgreement.getFieldSize(), bigInteger);
    return paramBcTlsCrypto.adoptLocalSecret(arrayOfByte);
  }
  
  public static ECDomainParameters getDomainParameters(TlsECConfig paramTlsECConfig) {
    return getDomainParameters(paramTlsECConfig.getNamedGroup());
  }
  
  public static ECDomainParameters getDomainParameters(int paramInt) {
    if (!NamedGroup.refersToASpecificCurve(paramInt))
      return null; 
    String str = NamedGroup.getCurveName(paramInt);
    X9ECParameters x9ECParameters = CustomNamedCurves.getByName(str);
    if (x9ECParameters == null) {
      x9ECParameters = ECNamedCurveTable.getByName(str);
      if (x9ECParameters == null)
        return null; 
    } 
    return new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
  }
  
  public BcTlsECDomain(BcTlsCrypto paramBcTlsCrypto, TlsECConfig paramTlsECConfig) {
    this.crypto = paramBcTlsCrypto;
    this.config = paramTlsECConfig;
    this.domainParameters = getDomainParameters(paramTlsECConfig);
  }
  
  public BcTlsSecret calculateECDHAgreement(ECPrivateKeyParameters paramECPrivateKeyParameters, ECPublicKeyParameters paramECPublicKeyParameters) {
    return calculateECDHAgreement(this.crypto, paramECPrivateKeyParameters, paramECPublicKeyParameters);
  }
  
  public TlsAgreement createECDH() {
    return new BcTlsECDH(this);
  }
  
  public ECPoint decodePoint(byte[] paramArrayOfbyte) {
    return this.domainParameters.getCurve().decodePoint(paramArrayOfbyte);
  }
  
  public ECPublicKeyParameters decodePublicKey(byte[] paramArrayOfbyte) throws IOException {
    try {
      ECPoint eCPoint = decodePoint(paramArrayOfbyte);
      return new ECPublicKeyParameters(eCPoint, this.domainParameters);
    } catch (RuntimeException runtimeException) {
      throw new TlsFatalAlert((short)47, runtimeException);
    } 
  }
  
  public byte[] encodePoint(ECPoint paramECPoint) {
    return paramECPoint.getEncoded(false);
  }
  
  public byte[] encodePublicKey(ECPublicKeyParameters paramECPublicKeyParameters) {
    return encodePoint(paramECPublicKeyParameters.getQ());
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    ECKeyPairGenerator eCKeyPairGenerator = new ECKeyPairGenerator();
    eCKeyPairGenerator.init((KeyGenerationParameters)new ECKeyGenerationParameters(this.domainParameters, this.crypto.getSecureRandom()));
    return eCKeyPairGenerator.generateKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsECDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */