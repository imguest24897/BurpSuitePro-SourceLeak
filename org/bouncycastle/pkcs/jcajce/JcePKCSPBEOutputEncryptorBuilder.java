package org.bouncycastle.pkcs.jcajce;

import java.io.OutputStream;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.ScryptParams;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;
import org.bouncycastle.crypto.util.ScryptConfig;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.io.CipherOutputStream;
import org.bouncycastle.jcajce.spec.ScryptKeySpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AlgorithmNameFinder;
import org.bouncycastle.operator.DefaultAlgorithmNameFinder;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SecretKeySizeProvider;

public class JcePKCSPBEOutputEncryptorBuilder {
  private final PBKDFConfig pbkdf;
  
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  private ASN1ObjectIdentifier algorithm;
  
  private ASN1ObjectIdentifier keyEncAlgorithm;
  
  private SecureRandom random;
  
  private SecretKeySizeProvider keySizeProvider = DefaultSecretKeySizeProvider.INSTANCE;
  
  private AlgorithmNameFinder algorithmNameFinder = (AlgorithmNameFinder)new DefaultAlgorithmNameFinder();
  
  private int iterationCount = 1024;
  
  private PBKDF2Config.Builder pbkdfBuilder = new PBKDF2Config.Builder();
  
  public JcePKCSPBEOutputEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.pbkdf = null;
    if (isPKCS12(paramASN1ObjectIdentifier)) {
      this.algorithm = paramASN1ObjectIdentifier;
      this.keyEncAlgorithm = paramASN1ObjectIdentifier;
    } else {
      this.algorithm = PKCSObjectIdentifiers.id_PBES2;
      this.keyEncAlgorithm = paramASN1ObjectIdentifier;
    } 
  }
  
  public JcePKCSPBEOutputEncryptorBuilder(PBKDFConfig paramPBKDFConfig, ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this.algorithm = PKCSObjectIdentifiers.id_PBES2;
    this.pbkdf = paramPBKDFConfig;
    this.keyEncAlgorithm = paramASN1ObjectIdentifier;
  }
  
  public JcePKCSPBEOutputEncryptorBuilder setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JcePKCSPBEOutputEncryptorBuilder setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  public JcePKCSPBEOutputEncryptorBuilder setRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public JcePKCSPBEOutputEncryptorBuilder setKeySizeProvider(SecretKeySizeProvider paramSecretKeySizeProvider) {
    this.keySizeProvider = paramSecretKeySizeProvider;
    return this;
  }
  
  public JcePKCSPBEOutputEncryptorBuilder setPRF(AlgorithmIdentifier paramAlgorithmIdentifier) {
    if (this.pbkdf != null)
      throw new IllegalStateException("set PRF count using PBKDFDef"); 
    this.pbkdfBuilder.withPRF(paramAlgorithmIdentifier);
    return this;
  }
  
  public JcePKCSPBEOutputEncryptorBuilder setIterationCount(int paramInt) {
    if (this.pbkdf != null)
      throw new IllegalStateException("set iteration count using PBKDFDef"); 
    this.iterationCount = paramInt;
    this.pbkdfBuilder.withIterationCount(paramInt);
    return this;
  }
  
  public OutputEncryptor build(final char[] password) throws OperatorCreationException {
    if (this.random == null)
      this.random = new SecureRandom(); 
    try {
      final Cipher cipher;
      final AlgorithmIdentifier encryptionAlg;
      if (isPKCS12(this.algorithm)) {
        byte[] arrayOfByte = new byte[20];
        this.random.nextBytes(arrayOfByte);
        cipher = this.helper.createCipher(this.algorithm.getId());
        cipher.init(1, (Key)new PKCS12KeyWithParameters(password, arrayOfByte, this.iterationCount));
        algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, (ASN1Encodable)new PKCS12PBEParams(arrayOfByte, this.iterationCount));
      } else if (this.algorithm.equals((ASN1Primitive)PKCSObjectIdentifiers.id_PBES2)) {
        PBKDFConfig pBKDFConfig = (PBKDFConfig)((this.pbkdf == null) ? this.pbkdfBuilder.build() : this.pbkdf);
        if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive)pBKDFConfig.getAlgorithm())) {
          PBES2Parameters pBES2Parameters;
          ScryptConfig scryptConfig = (ScryptConfig)pBKDFConfig;
          byte[] arrayOfByte = new byte[scryptConfig.getSaltLength()];
          this.random.nextBytes(arrayOfByte);
          ScryptParams scryptParams = new ScryptParams(arrayOfByte, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter());
          SecretKeyFactory secretKeyFactory = this.helper.createSecretKeyFactory("SCRYPT");
          SecretKey secretKey = secretKeyFactory.generateSecret((KeySpec)new ScryptKeySpec(password, arrayOfByte, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), this.keySizeProvider.getKeySize(new AlgorithmIdentifier(this.keyEncAlgorithm))));
          cipher = this.helper.createCipher(this.keyEncAlgorithm.getId());
          cipher.init(1, simplifyPbeKey(secretKey), this.random);
          AlgorithmParameters algorithmParameters = cipher.getParameters();
          if (algorithmParameters != null) {
            pBES2Parameters = new PBES2Parameters(new KeyDerivationFunc(MiscObjectIdentifiers.id_scrypt, (ASN1Encodable)scryptParams), new EncryptionScheme(this.keyEncAlgorithm, (ASN1Encodable)ASN1Primitive.fromByteArray(cipher.getParameters().getEncoded())));
          } else {
            pBES2Parameters = new PBES2Parameters(new KeyDerivationFunc(MiscObjectIdentifiers.id_scrypt, (ASN1Encodable)scryptParams), new EncryptionScheme(this.keyEncAlgorithm));
          } 
          algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, (ASN1Encodable)pBES2Parameters);
        } else {
          PBES2Parameters pBES2Parameters;
          PBKDF2Config pBKDF2Config = (PBKDF2Config)pBKDFConfig;
          byte[] arrayOfByte = new byte[pBKDF2Config.getSaltLength()];
          this.random.nextBytes(arrayOfByte);
          SecretKeyFactory secretKeyFactory = this.helper.createSecretKeyFactory(JceUtils.getAlgorithm(pBKDF2Config.getPRF().getAlgorithm()));
          SecretKey secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(password, arrayOfByte, pBKDF2Config.getIterationCount(), this.keySizeProvider.getKeySize(new AlgorithmIdentifier(this.keyEncAlgorithm))));
          cipher = this.helper.createCipher(this.keyEncAlgorithm.getId());
          cipher.init(1, simplifyPbeKey(secretKey), this.random);
          AlgorithmParameters algorithmParameters = cipher.getParameters();
          if (algorithmParameters != null) {
            pBES2Parameters = new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, (ASN1Encodable)new PBKDF2Params(arrayOfByte, pBKDF2Config.getIterationCount(), pBKDF2Config.getPRF())), new EncryptionScheme(this.keyEncAlgorithm, (ASN1Encodable)ASN1Primitive.fromByteArray(cipher.getParameters().getEncoded())));
          } else {
            pBES2Parameters = new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, (ASN1Encodable)new PBKDF2Params(arrayOfByte, pBKDF2Config.getIterationCount(), pBKDF2Config.getPRF())), new EncryptionScheme(this.keyEncAlgorithm));
          } 
          algorithmIdentifier = new AlgorithmIdentifier(this.algorithm, (ASN1Encodable)pBES2Parameters);
        } 
      } else {
        throw new OperatorCreationException("unrecognised algorithm");
      } 
      return new OutputEncryptor() {
          public AlgorithmIdentifier getAlgorithmIdentifier() {
            return encryptionAlg;
          }
          
          public OutputStream getOutputStream(OutputStream param1OutputStream) {
            return (OutputStream)new CipherOutputStream(param1OutputStream, cipher);
          }
          
          public GenericKey getKey() {
            return JcePKCSPBEOutputEncryptorBuilder.this.isPKCS12(encryptionAlg.getAlgorithm()) ? new GenericKey(encryptionAlg, JcePKCSPBEOutputEncryptorBuilder.PKCS12PasswordToBytes(password)) : new GenericKey(encryptionAlg, JcePKCSPBEOutputEncryptorBuilder.PKCS5PasswordToBytes(password));
          }
        };
    } catch (Exception exception) {
      throw new OperatorCreationException("unable to create OutputEncryptor: " + exception.getMessage(), exception);
    } 
  }
  
  private SecretKey simplifyPbeKey(SecretKey paramSecretKey) {
    if (this.algorithmNameFinder.hasAlgorithmName(this.keyEncAlgorithm)) {
      String str = this.algorithmNameFinder.getAlgorithmName(this.keyEncAlgorithm);
      if (str.indexOf("AES") >= 0)
        paramSecretKey = new SecretKeySpec(paramSecretKey.getEncoded(), "AES"); 
    } 
    return paramSecretKey;
  }
  
  private boolean isPKCS12(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    return (paramASN1ObjectIdentifier.on(PKCSObjectIdentifiers.pkcs_12PbeIds) || paramASN1ObjectIdentifier.on(BCObjectIdentifiers.bc_pbe_sha1_pkcs12) || paramASN1ObjectIdentifier.on(BCObjectIdentifiers.bc_pbe_sha256_pkcs12));
  }
  
  private static byte[] PKCS5PasswordToBytes(char[] paramArrayOfchar) {
    if (paramArrayOfchar != null) {
      byte[] arrayOfByte = new byte[paramArrayOfchar.length];
      for (byte b = 0; b != arrayOfByte.length; b++)
        arrayOfByte[b] = (byte)paramArrayOfchar[b]; 
      return arrayOfByte;
    } 
    return new byte[0];
  }
  
  private static byte[] PKCS12PasswordToBytes(char[] paramArrayOfchar) {
    if (paramArrayOfchar != null && paramArrayOfchar.length > 0) {
      byte[] arrayOfByte = new byte[(paramArrayOfchar.length + 1) * 2];
      for (byte b = 0; b != paramArrayOfchar.length; b++) {
        arrayOfByte[b * 2] = (byte)(paramArrayOfchar[b] >>> 8);
        arrayOfByte[b * 2 + 1] = (byte)paramArrayOfchar[b];
      } 
      return arrayOfByte;
    } 
    return new byte[0];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\jcajce\JcePKCSPBEOutputEncryptorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */