package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.generators.DHBasicKeyPairGenerator;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.DHGroup;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsDHDomain;
import org.bouncycastle.util.BigIntegers;

public class BcTlsDHDomain implements TlsDHDomain {
  protected BcTlsCrypto crypto;
  
  protected TlsDHConfig config;
  
  protected DHParameters domainParameters;
  
  private static byte[] encodeValue(DHParameters paramDHParameters, boolean paramBoolean, BigInteger paramBigInteger) {
    return paramBoolean ? BigIntegers.asUnsignedByteArray(getValueLength(paramDHParameters), paramBigInteger) : BigIntegers.asUnsignedByteArray(paramBigInteger);
  }
  
  private static int getValueLength(DHParameters paramDHParameters) {
    return (paramDHParameters.getP().bitLength() + 7) / 8;
  }
  
  public static BcTlsSecret calculateDHAgreement(BcTlsCrypto paramBcTlsCrypto, DHPrivateKeyParameters paramDHPrivateKeyParameters, DHPublicKeyParameters paramDHPublicKeyParameters, boolean paramBoolean) {
    DHBasicAgreement dHBasicAgreement = new DHBasicAgreement();
    dHBasicAgreement.init((CipherParameters)paramDHPrivateKeyParameters);
    BigInteger bigInteger = dHBasicAgreement.calculateAgreement((CipherParameters)paramDHPublicKeyParameters);
    byte[] arrayOfByte = encodeValue(paramDHPrivateKeyParameters.getParameters(), paramBoolean, bigInteger);
    return paramBcTlsCrypto.adoptLocalSecret(arrayOfByte);
  }
  
  public static DHParameters getDomainParameters(TlsDHConfig paramTlsDHConfig) {
    DHGroup dHGroup = TlsDHUtils.getDHGroup(paramTlsDHConfig);
    if (dHGroup == null)
      throw new IllegalArgumentException("No DH configuration provided"); 
    return new DHParameters(dHGroup.getP(), dHGroup.getG(), dHGroup.getQ(), dHGroup.getL());
  }
  
  public BcTlsDHDomain(BcTlsCrypto paramBcTlsCrypto, TlsDHConfig paramTlsDHConfig) {
    this.crypto = paramBcTlsCrypto;
    this.config = paramTlsDHConfig;
    this.domainParameters = getDomainParameters(paramTlsDHConfig);
  }
  
  public BcTlsSecret calculateDHAgreement(DHPrivateKeyParameters paramDHPrivateKeyParameters, DHPublicKeyParameters paramDHPublicKeyParameters) {
    return calculateDHAgreement(this.crypto, paramDHPrivateKeyParameters, paramDHPublicKeyParameters, this.config.isPadded());
  }
  
  public TlsAgreement createDH() {
    return new BcTlsDH(this);
  }
  
  public BigInteger decodeParameter(byte[] paramArrayOfbyte) throws IOException {
    if (this.config.isPadded() && getValueLength(this.domainParameters) != paramArrayOfbyte.length)
      throw new TlsFatalAlert((short)47); 
    return new BigInteger(1, paramArrayOfbyte);
  }
  
  public DHPublicKeyParameters decodePublicKey(byte[] paramArrayOfbyte) throws IOException {
    try {
      BigInteger bigInteger = decodeParameter(paramArrayOfbyte);
      return new DHPublicKeyParameters(bigInteger, this.domainParameters);
    } catch (RuntimeException runtimeException) {
      throw new TlsFatalAlert((short)40, runtimeException);
    } 
  }
  
  public byte[] encodeParameter(BigInteger paramBigInteger) {
    return encodeValue(this.domainParameters, this.config.isPadded(), paramBigInteger);
  }
  
  public byte[] encodePublicKey(DHPublicKeyParameters paramDHPublicKeyParameters) {
    return encodeValue(this.domainParameters, true, paramDHPublicKeyParameters.getY());
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    DHBasicKeyPairGenerator dHBasicKeyPairGenerator = new DHBasicKeyPairGenerator();
    dHBasicKeyPairGenerator.init((KeyGenerationParameters)new DHKeyGenerationParameters(this.crypto.getSecureRandom(), this.domainParameters));
    return dHBasicKeyPairGenerator.generateKeyPair();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsDHDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */