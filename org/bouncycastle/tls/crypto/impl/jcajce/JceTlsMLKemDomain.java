package org.bouncycastle.tls.crypto.impl.jcajce;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsKemConfig;
import org.bouncycastle.tls.crypto.TlsKemDomain;

public class JceTlsMLKemDomain implements TlsKemDomain {
  protected final JcaTlsCrypto crypto;
  
  protected final KyberParameters kyberParameters;
  
  protected final boolean isServer;
  
  protected static KyberParameters getKyberParameters(int paramInt) {
    switch (paramInt) {
      case 583:
        return KyberParameters.kyber512;
      case 584:
      case 1896:
        return KyberParameters.kyber768;
      case 585:
      case 4132:
        return KyberParameters.kyber1024;
    } 
    return null;
  }
  
  public JceTlsMLKemDomain(JcaTlsCrypto paramJcaTlsCrypto, TlsKemConfig paramTlsKemConfig) {
    this.crypto = paramJcaTlsCrypto;
    this.kyberParameters = getKyberParameters(paramTlsKemConfig.getNamedGroup());
    this.isServer = paramTlsKemConfig.isServer();
  }
  
  public JceTlsSecret adoptLocalSecret(byte[] paramArrayOfbyte) {
    return this.crypto.adoptLocalSecret(paramArrayOfbyte);
  }
  
  public TlsAgreement createKem() {
    return new JceTlsMLKem(this);
  }
  
  public JceTlsSecret decapsulate(KyberPrivateKeyParameters paramKyberPrivateKeyParameters, byte[] paramArrayOfbyte) {
    KyberKEMExtractor kyberKEMExtractor = new KyberKEMExtractor(paramKyberPrivateKeyParameters);
    byte[] arrayOfByte = kyberKEMExtractor.extractSecret(paramArrayOfbyte);
    return adoptLocalSecret(arrayOfByte);
  }
  
  public KyberPublicKeyParameters decodePublicKey(byte[] paramArrayOfbyte) {
    return new KyberPublicKeyParameters(this.kyberParameters, paramArrayOfbyte);
  }
  
  public SecretWithEncapsulation encapsulate(KyberPublicKeyParameters paramKyberPublicKeyParameters) {
    KyberKEMGenerator kyberKEMGenerator = new KyberKEMGenerator(this.crypto.getSecureRandom());
    return kyberKEMGenerator.generateEncapsulated((AsymmetricKeyParameter)paramKyberPublicKeyParameters);
  }
  
  public byte[] encodePublicKey(KyberPublicKeyParameters paramKyberPublicKeyParameters) {
    return paramKyberPublicKeyParameters.getEncoded();
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    KyberKeyPairGenerator kyberKeyPairGenerator = new KyberKeyPairGenerator();
    kyberKeyPairGenerator.init((KeyGenerationParameters)new KyberKeyGenerationParameters(this.crypto.getSecureRandom(), this.kyberParameters));
    return kyberKeyPairGenerator.generateKeyPair();
  }
  
  public boolean isServer() {
    return this.isServer;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsMLKemDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */