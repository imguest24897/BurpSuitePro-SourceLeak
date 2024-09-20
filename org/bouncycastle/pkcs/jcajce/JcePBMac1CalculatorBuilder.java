package org.bouncycastle.pkcs.jcajce;

import java.io.OutputStream;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PBMAC1Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.io.MacOutputStream;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DefaultMacAlgorithmIdentifierFinder;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacAlgorithmIdentifierFinder;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.BigIntegers;

public class JcePBMac1CalculatorBuilder {
  public static final AlgorithmIdentifier PRF_SHA224 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA224, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA256 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA384 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA384, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA512 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, (ASN1Encodable)DERNull.INSTANCE);
  
  public static final AlgorithmIdentifier PRF_SHA3_224 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_224);
  
  public static final AlgorithmIdentifier PRF_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_256);
  
  public static final AlgorithmIdentifier PRF_SHA3_384 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_384);
  
  public static final AlgorithmIdentifier PRF_SHA3_512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512);
  
  private static final DefaultMacAlgorithmIdentifierFinder defaultFinder = new DefaultMacAlgorithmIdentifierFinder();
  
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  private AlgorithmIdentifier macAlgorithm;
  
  private SecureRandom random;
  
  private int saltLength = -1;
  
  private int iterationCount = 8192;
  
  private int keySize;
  
  private PBKDF2Params pbeParams = null;
  
  private AlgorithmIdentifier prf = PRF_SHA256;
  
  private byte[] salt = null;
  
  public JcePBMac1CalculatorBuilder(String paramString, int paramInt) {
    this(paramString, paramInt, (MacAlgorithmIdentifierFinder)defaultFinder);
  }
  
  public JcePBMac1CalculatorBuilder(String paramString, int paramInt, MacAlgorithmIdentifierFinder paramMacAlgorithmIdentifierFinder) {
    this.macAlgorithm = paramMacAlgorithmIdentifierFinder.find(paramString);
    this.keySize = paramInt;
  }
  
  public JcePBMac1CalculatorBuilder(PBMAC1Params paramPBMAC1Params) {
    this.macAlgorithm = paramPBMAC1Params.getMessageAuthScheme();
    this.pbeParams = PBKDF2Params.getInstance(paramPBMAC1Params.getKeyDerivationFunc().getParameters());
  }
  
  public JcePBMac1CalculatorBuilder setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JcePBMac1CalculatorBuilder setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  JcePBMac1CalculatorBuilder setHelper(JcaJceHelper paramJcaJceHelper) {
    this.helper = paramJcaJceHelper;
    return this;
  }
  
  public JcePBMac1CalculatorBuilder setIterationCount(int paramInt) {
    this.iterationCount = paramInt;
    return this;
  }
  
  public JcePBMac1CalculatorBuilder setSaltLength(int paramInt) {
    this.saltLength = paramInt;
    return this;
  }
  
  public JcePBMac1CalculatorBuilder setSalt(byte[] paramArrayOfbyte) {
    this.salt = paramArrayOfbyte;
    return this;
  }
  
  public JcePBMac1CalculatorBuilder setRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public JcePBMac1CalculatorBuilder setPrf(AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.prf = paramAlgorithmIdentifier;
    return this;
  }
  
  public MacCalculator build(char[] paramArrayOfchar) throws OperatorCreationException {
    if (this.random == null)
      this.random = new SecureRandom(); 
    try {
      final Mac mac = this.helper.createMac(this.macAlgorithm.getAlgorithm().getId());
      if (this.pbeParams == null) {
        if (this.salt == null) {
          if (this.saltLength < 0)
            this.saltLength = mac.getMacLength(); 
          this.salt = new byte[this.saltLength];
          this.random.nextBytes(this.salt);
        } 
      } else {
        this.salt = this.pbeParams.getSalt();
        this.iterationCount = BigIntegers.intValueExact(this.pbeParams.getIterationCount());
        this.keySize = BigIntegers.intValueExact(this.pbeParams.getKeyLength()) * 8;
      } 
      SecretKeyFactory secretKeyFactory = this.helper.createSecretKeyFactory("PBKDF2");
      final SecretKey key = secretKeyFactory.generateSecret((KeySpec)new PBKDF2KeySpec(paramArrayOfchar, this.salt, this.iterationCount, this.keySize, this.prf));
      mac.init(secretKey);
      return new MacCalculator() {
          public AlgorithmIdentifier getAlgorithmIdentifier() {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBMAC1, (ASN1Encodable)new PBMAC1Params(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, (ASN1Encodable)new PBKDF2Params(JcePBMac1CalculatorBuilder.this.salt, JcePBMac1CalculatorBuilder.this.iterationCount, (JcePBMac1CalculatorBuilder.this.keySize + 7) / 8, JcePBMac1CalculatorBuilder.this.prf)), JcePBMac1CalculatorBuilder.this.macAlgorithm));
          }
          
          public OutputStream getOutputStream() {
            return (OutputStream)new MacOutputStream(mac);
          }
          
          public byte[] getMac() {
            return mac.doFinal();
          }
          
          public GenericKey getKey() {
            return new GenericKey(getAlgorithmIdentifier(), key.getEncoded());
          }
        };
    } catch (Exception exception) {
      throw new OperatorCreationException("unable to create MAC calculator: " + exception.getMessage(), exception);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\jcajce\JcePBMac1CalculatorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */