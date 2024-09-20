package org.bouncycastle.cms.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.jcajce.io.CipherOutputStream;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCaptureStream;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.operator.jcajce.JceGenericKey;
import org.bouncycastle.util.Strings;

public class JceCMSContentEncryptorBuilder {
  private static final SecretKeySizeProvider KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
  
  private static final byte[] hkdfSalt = Strings.toByteArray("The Cryptographic Message Syntax");
  
  private final ASN1ObjectIdentifier encryptionOID;
  
  private final int keySize;
  
  private EnvelopedDataHelper helper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
  
  private SecureRandom random;
  
  private AlgorithmIdentifier algorithmIdentifier;
  
  private AlgorithmParameters algorithmParameters;
  
  private ASN1ObjectIdentifier kdfAlgorithm;
  
  public JceCMSContentEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this(paramASN1ObjectIdentifier, KEY_SIZE_PROVIDER.getKeySize(paramASN1ObjectIdentifier));
  }
  
  public JceCMSContentEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt) {
    this.encryptionOID = paramASN1ObjectIdentifier;
    int i = KEY_SIZE_PROVIDER.getKeySize(paramASN1ObjectIdentifier);
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.des_EDE3_CBC)) {
      if (paramInt != 168 && paramInt != i)
        throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder."); 
      this.keySize = 168;
    } else if (paramASN1ObjectIdentifier.equals((ASN1Primitive)OIWObjectIdentifiers.desCBC)) {
      if (paramInt != 56 && paramInt != i)
        throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder."); 
      this.keySize = 56;
    } else {
      if (i > 0 && i != paramInt)
        throw new IllegalArgumentException("incorrect keySize for encryptionOID passed to builder."); 
      this.keySize = paramInt;
    } 
  }
  
  public JceCMSContentEncryptorBuilder(AlgorithmIdentifier paramAlgorithmIdentifier) {
    this(paramAlgorithmIdentifier.getAlgorithm(), KEY_SIZE_PROVIDER.getKeySize(paramAlgorithmIdentifier.getAlgorithm()));
    this.algorithmIdentifier = paramAlgorithmIdentifier;
  }
  
  public JceCMSContentEncryptorBuilder setEnableSha256HKdf(boolean paramBoolean) {
    if (paramBoolean) {
      this.kdfAlgorithm = CMSObjectIdentifiers.id_alg_cek_hkdf_sha256;
    } else if (this.kdfAlgorithm != null) {
      if (this.kdfAlgorithm.equals((ASN1Primitive)CMSObjectIdentifiers.id_alg_cek_hkdf_sha256)) {
        this.kdfAlgorithm = null;
      } else {
        throw new IllegalStateException("SHA256 HKDF not enabled");
      } 
    } 
    return this;
  }
  
  public JceCMSContentEncryptorBuilder setProvider(Provider paramProvider) {
    this.helper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(paramProvider));
    return this;
  }
  
  public JceCMSContentEncryptorBuilder setProvider(String paramString) {
    this.helper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(paramString));
    return this;
  }
  
  public JceCMSContentEncryptorBuilder setSecureRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public JceCMSContentEncryptorBuilder setAlgorithmParameters(AlgorithmParameters paramAlgorithmParameters) {
    this.algorithmParameters = paramAlgorithmParameters;
    return this;
  }
  
  public OutputEncryptor build() throws CMSException {
    if (this.algorithmParameters != null)
      return (OutputEncryptor)(this.helper.isAuthEnveloped(this.encryptionOID) ? new CMSAuthOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random) : new CMSOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random)); 
    if (this.algorithmIdentifier != null) {
      ASN1Encodable aSN1Encodable = this.algorithmIdentifier.getParameters();
      if (aSN1Encodable != null && !aSN1Encodable.equals(DERNull.INSTANCE))
        try {
          this.algorithmParameters = this.helper.createAlgorithmParameters(this.algorithmIdentifier.getAlgorithm());
          this.algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
        } catch (Exception exception) {
          throw new CMSException("unable to process provided algorithmIdentifier: " + exception.toString(), exception);
        }  
    } 
    return (OutputEncryptor)(this.helper.isAuthEnveloped(this.encryptionOID) ? new CMSAuthOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random) : new CMSOutputEncryptor(this.kdfAlgorithm, this.encryptionOID, this.keySize, this.algorithmParameters, this.random));
  }
  
  private static boolean checkForAEAD() {
    return ((Boolean)AccessController.<Boolean>doPrivileged(new PrivilegedAction<Boolean>() {
          public Object run() {
            try {
              return Boolean.valueOf((Cipher.class.getMethod("updateAAD", new Class[] { byte[].class }) != null));
            } catch (Exception exception) {
              return Boolean.FALSE;
            } 
          }
        })).booleanValue();
  }
  
  private class CMSAuthOutputEncryptor extends CMSOutEncryptor implements OutputAEADEncryptor {
    private MacCaptureStream macOut;
    
    CMSAuthOutputEncryptor(ASN1ObjectIdentifier param1ASN1ObjectIdentifier1, ASN1ObjectIdentifier param1ASN1ObjectIdentifier2, int param1Int, AlgorithmParameters param1AlgorithmParameters, SecureRandom param1SecureRandom) throws CMSException {
      init(param1ASN1ObjectIdentifier1, param1ASN1ObjectIdentifier2, param1Int, param1AlgorithmParameters, param1SecureRandom);
    }
    
    public AlgorithmIdentifier getAlgorithmIdentifier() {
      return this.algorithmIdentifier;
    }
    
    public OutputStream getOutputStream(OutputStream param1OutputStream) {
      AlgorithmIdentifier algorithmIdentifier;
      if (JceCMSContentEncryptorBuilder.this.kdfAlgorithm != null) {
        algorithmIdentifier = AlgorithmIdentifier.getInstance(this.algorithmIdentifier.getParameters());
      } else {
        algorithmIdentifier = this.algorithmIdentifier;
      } 
      GCMParameters gCMParameters = GCMParameters.getInstance(algorithmIdentifier.getParameters());
      this.macOut = new MacCaptureStream(param1OutputStream, gCMParameters.getIcvLen());
      return (OutputStream)new CipherOutputStream((OutputStream)this.macOut, this.cipher);
    }
    
    public GenericKey getKey() {
      return (GenericKey)new JceGenericKey(this.algorithmIdentifier, this.encKey);
    }
    
    public OutputStream getAADStream() {
      return JceCMSContentEncryptorBuilder.checkForAEAD() ? new JceAADStream(this.cipher) : null;
    }
    
    public byte[] getMAC() {
      return this.macOut.getMac();
    }
  }
  
  private class CMSOutEncryptor {
    protected SecretKey encKey;
    
    protected AlgorithmIdentifier algorithmIdentifier;
    
    protected Cipher cipher;
    
    private CMSOutEncryptor() {}
    
    private void applyKdf(ASN1ObjectIdentifier param1ASN1ObjectIdentifier, AlgorithmParameters param1AlgorithmParameters, SecureRandom param1SecureRandom) throws CMSException {
      HKDFBytesGenerator hKDFBytesGenerator = new HKDFBytesGenerator((Digest)new SHA256Digest());
      byte[] arrayOfByte = this.encKey.getEncoded();
      try {
        hKDFBytesGenerator.init((DerivationParameters)new HKDFParameters(arrayOfByte, JceCMSContentEncryptorBuilder.hkdfSalt, this.algorithmIdentifier.getEncoded("DER")));
      } catch (IOException iOException) {
        throw new CMSException("unable to encode enc algorithm parameters", iOException);
      } 
      hKDFBytesGenerator.generateBytes(arrayOfByte, 0, arrayOfByte.length);
      SecretKeySpec secretKeySpec = new SecretKeySpec(arrayOfByte, this.encKey.getAlgorithm());
      try {
        this.cipher.init(1, secretKeySpec, param1AlgorithmParameters, param1SecureRandom);
      } catch (GeneralSecurityException generalSecurityException) {
        throw new CMSException("unable to initialize cipher: " + generalSecurityException.getMessage(), generalSecurityException);
      } 
      this.algorithmIdentifier = new AlgorithmIdentifier(param1ASN1ObjectIdentifier, (ASN1Encodable)this.algorithmIdentifier);
    }
    
    protected void init(ASN1ObjectIdentifier param1ASN1ObjectIdentifier1, ASN1ObjectIdentifier param1ASN1ObjectIdentifier2, int param1Int, AlgorithmParameters param1AlgorithmParameters, SecureRandom param1SecureRandom) throws CMSException {
      KeyGenerator keyGenerator = JceCMSContentEncryptorBuilder.this.helper.createKeyGenerator(param1ASN1ObjectIdentifier2);
      param1SecureRandom = CryptoServicesRegistrar.getSecureRandom(param1SecureRandom);
      if (param1Int < 0) {
        keyGenerator.init(param1SecureRandom);
      } else {
        keyGenerator.init(param1Int, param1SecureRandom);
      } 
      this.cipher = JceCMSContentEncryptorBuilder.this.helper.createCipher(param1ASN1ObjectIdentifier2);
      this.encKey = keyGenerator.generateKey();
      if (param1AlgorithmParameters == null)
        param1AlgorithmParameters = JceCMSContentEncryptorBuilder.this.helper.generateParameters(param1ASN1ObjectIdentifier2, this.encKey, param1SecureRandom); 
      if (param1AlgorithmParameters != null) {
        this.algorithmIdentifier = JceCMSContentEncryptorBuilder.this.helper.getAlgorithmIdentifier(param1ASN1ObjectIdentifier2, param1AlgorithmParameters);
        if (param1ASN1ObjectIdentifier1 != null) {
          applyKdf(param1ASN1ObjectIdentifier1, param1AlgorithmParameters, param1SecureRandom);
        } else {
          try {
            this.cipher.init(1, this.encKey, param1AlgorithmParameters, param1SecureRandom);
          } catch (GeneralSecurityException generalSecurityException) {
            throw new CMSException("unable to initialize cipher: " + generalSecurityException.getMessage(), generalSecurityException);
          } 
        } 
      } else {
        try {
          this.cipher.init(1, this.encKey, param1AlgorithmParameters, param1SecureRandom);
        } catch (GeneralSecurityException generalSecurityException) {
          throw new CMSException("unable to initialize cipher: " + generalSecurityException.getMessage(), generalSecurityException);
        } 
        param1AlgorithmParameters = this.cipher.getParameters();
        this.algorithmIdentifier = JceCMSContentEncryptorBuilder.this.helper.getAlgorithmIdentifier(param1ASN1ObjectIdentifier2, param1AlgorithmParameters);
        if (param1ASN1ObjectIdentifier1 != null)
          applyKdf(param1ASN1ObjectIdentifier1, param1AlgorithmParameters, param1SecureRandom); 
      } 
    }
  }
  
  private class CMSOutputEncryptor extends CMSOutEncryptor implements OutputEncryptor {
    CMSOutputEncryptor(ASN1ObjectIdentifier param1ASN1ObjectIdentifier1, ASN1ObjectIdentifier param1ASN1ObjectIdentifier2, int param1Int, AlgorithmParameters param1AlgorithmParameters, SecureRandom param1SecureRandom) throws CMSException {
      init(param1ASN1ObjectIdentifier1, param1ASN1ObjectIdentifier2, param1Int, param1AlgorithmParameters, param1SecureRandom);
    }
    
    public AlgorithmIdentifier getAlgorithmIdentifier() {
      return this.algorithmIdentifier;
    }
    
    public OutputStream getOutputStream(OutputStream param1OutputStream) {
      return (OutputStream)new CipherOutputStream(param1OutputStream, this.cipher);
    }
    
    public GenericKey getKey() {
      return (GenericKey)new JceGenericKey(this.algorithmIdentifier, this.encKey);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JceCMSContentEncryptorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */