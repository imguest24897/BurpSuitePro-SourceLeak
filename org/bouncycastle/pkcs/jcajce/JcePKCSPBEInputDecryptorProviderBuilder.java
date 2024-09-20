package org.bouncycastle.pkcs.jcajce;

import java.io.InputStream;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.ScryptParams;
import org.bouncycastle.asn1.pkcs.PBEParameter;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.CharToByteConverter;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.io.CipherInputStream;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.spec.ScryptKeySpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.operator.InputDecryptorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.SecretKeySizeProvider;

public class JcePKCSPBEInputDecryptorProviderBuilder {
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  private boolean wrongPKCS12Zero = false;
  
  private SecretKeySizeProvider keySizeProvider = DefaultSecretKeySizeProvider.INSTANCE;
  
  public JcePKCSPBEInputDecryptorProviderBuilder setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JcePKCSPBEInputDecryptorProviderBuilder setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  public JcePKCSPBEInputDecryptorProviderBuilder setTryWrongPKCS12Zero(boolean paramBoolean) {
    this.wrongPKCS12Zero = paramBoolean;
    return this;
  }
  
  public JcePKCSPBEInputDecryptorProviderBuilder setKeySizeProvider(SecretKeySizeProvider paramSecretKeySizeProvider) {
    this.keySizeProvider = paramSecretKeySizeProvider;
    return this;
  }
  
  public InputDecryptorProvider build(final char[] password) {
    return new InputDecryptorProvider() {
        private Cipher cipher;
        
        private AlgorithmIdentifier encryptionAlg;
        
        public InputDecryptor get(AlgorithmIdentifier param1AlgorithmIdentifier) throws OperatorCreationException {
          ASN1ObjectIdentifier aSN1ObjectIdentifier = param1AlgorithmIdentifier.getAlgorithm();
          try {
            if (aSN1ObjectIdentifier.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
              PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(param1AlgorithmIdentifier.getParameters());
              this.cipher = JcePKCSPBEInputDecryptorProviderBuilder.this.helper.createCipher(aSN1ObjectIdentifier.getId());
              this.cipher.init(2, (Key)new PKCS12KeyWithParameters(password, JcePKCSPBEInputDecryptorProviderBuilder.this.wrongPKCS12Zero, pKCS12PBEParams.getIV(), pKCS12PBEParams.getIterations().intValue()));
              this.encryptionAlg = param1AlgorithmIdentifier;
            } else if (aSN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.id_PBES2)) {
              SecretKey secretKey;
              PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(param1AlgorithmIdentifier.getParameters());
              if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive)pBES2Parameters.getKeyDerivationFunc().getAlgorithm())) {
                ScryptParams scryptParams = ScryptParams.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
                AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
                SecretKeyFactory secretKeyFactory = JcePKCSPBEInputDecryptorProviderBuilder.this.helper.createSecretKeyFactory("SCRYPT");
                secretKey = secretKeyFactory.generateSecret((KeySpec)new ScryptKeySpec(password, scryptParams.getSalt(), scryptParams.getCostParameter().intValue(), scryptParams.getBlockSize().intValue(), scryptParams.getParallelizationParameter().intValue(), JcePKCSPBEInputDecryptorProviderBuilder.this.keySizeProvider.getKeySize(algorithmIdentifier)));
              } else {
                SecretKeyFactory secretKeyFactory = JcePKCSPBEInputDecryptorProviderBuilder.this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId());
                PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
                AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
                if (pBKDF2Params.isDefaultPrf()) {
                  secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(password, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), JcePKCSPBEInputDecryptorProviderBuilder.this.keySizeProvider.getKeySize(algorithmIdentifier)));
                } else {
                  secretKey = secretKeyFactory.generateSecret((KeySpec)new PBKDF2KeySpec(password, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), JcePKCSPBEInputDecryptorProviderBuilder.this.keySizeProvider.getKeySize(algorithmIdentifier), pBKDF2Params.getPrf()));
                } 
              } 
              this.cipher = JcePKCSPBEInputDecryptorProviderBuilder.this.helper.createCipher(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
              this.encryptionAlg = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
              ASN1Encodable aSN1Encodable = pBES2Parameters.getEncryptionScheme().getParameters();
              if (aSN1Encodable instanceof ASN1OctetString) {
                this.cipher.init(2, secretKey, new IvParameterSpec(ASN1OctetString.getInstance(aSN1Encodable).getOctets()));
              } else if (aSN1Encodable instanceof ASN1Sequence && JcePKCSPBEInputDecryptorProviderBuilder.this.isCCMorGCM((ASN1Encodable)pBES2Parameters.getEncryptionScheme())) {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
                algorithmParameters.init(((ASN1Sequence)aSN1Encodable).getEncoded());
                this.cipher.init(2, secretKey, algorithmParameters);
              } else if (aSN1Encodable == null) {
                this.cipher.init(2, secretKey);
              } else {
                GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(aSN1Encodable);
                this.cipher.init(2, secretKey, (AlgorithmParameterSpec)new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV()));
              } 
            } else if (aSN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC)) {
              PBEParameter pBEParameter = PBEParameter.getInstance(param1AlgorithmIdentifier.getParameters());
              this.cipher = JcePKCSPBEInputDecryptorProviderBuilder.this.helper.createCipher(aSN1ObjectIdentifier.getId());
              this.cipher.init(2, (Key)new PBKDF1Key(password, (CharToByteConverter)PasswordConverter.ASCII), new PBEParameterSpec(pBEParameter.getSalt(), pBEParameter.getIterationCount().intValue()));
            } else {
              throw new OperatorCreationException("unable to create InputDecryptor: algorithm " + aSN1ObjectIdentifier + " unknown.");
            } 
          } catch (Exception exception) {
            throw new OperatorCreationException("unable to create InputDecryptor: " + exception.getMessage(), exception);
          } 
          return new InputDecryptor() {
              public AlgorithmIdentifier getAlgorithmIdentifier() {
                return JcePKCSPBEInputDecryptorProviderBuilder.null.this.encryptionAlg;
              }
              
              public InputStream getInputStream(InputStream param2InputStream) {
                return (InputStream)new CipherInputStream(param2InputStream, JcePKCSPBEInputDecryptorProviderBuilder.null.this.cipher);
              }
            };
        }
      };
  }
  
  private boolean isCCMorGCM(ASN1Encodable paramASN1Encodable) {
    AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance(paramASN1Encodable);
    ASN1Encodable aSN1Encodable = algorithmIdentifier.getParameters();
    if (aSN1Encodable instanceof ASN1Sequence) {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Encodable);
      if (aSN1Sequence.size() == 2)
        return aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1Integer; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\jcajce\JcePKCSPBEInputDecryptorProviderBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */