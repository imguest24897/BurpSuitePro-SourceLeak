package org.bouncycastle.cms.bc;

import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacCaptureStream;
import org.bouncycastle.operator.OutputAEADEncryptor;
import org.bouncycastle.operator.OutputEncryptor;
import org.bouncycastle.operator.SecretKeySizeProvider;

public class BcCMSContentEncryptorBuilder {
  private static final SecretKeySizeProvider KEY_SIZE_PROVIDER = DefaultSecretKeySizeProvider.INSTANCE;
  
  private final ASN1ObjectIdentifier encryptionOID;
  
  private final int keySize;
  
  private EnvelopedDataHelper helper = new EnvelopedDataHelper();
  
  private SecureRandom random;
  
  public BcCMSContentEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this(paramASN1ObjectIdentifier, KEY_SIZE_PROVIDER.getKeySize(paramASN1ObjectIdentifier));
  }
  
  public BcCMSContentEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt) {
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
  
  public BcCMSContentEncryptorBuilder setSecureRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public OutputEncryptor build() throws CMSException {
    return this.helper.isAuthEnveloped(this.encryptionOID) ? new CMSAuthOutputEncryptor(this.encryptionOID, this.keySize, this.random) : new CMSOutputEncryptor(this.encryptionOID, this.keySize, this.random);
  }
  
  private static class AADStream extends OutputStream {
    private AEADBlockCipher cipher;
    
    public AADStream(AEADBlockCipher param1AEADBlockCipher) {
      this.cipher = param1AEADBlockCipher;
    }
    
    public void write(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException {
      this.cipher.processAADBytes(param1ArrayOfbyte, param1Int1, param1Int2);
    }
    
    public void write(int param1Int) throws IOException {
      this.cipher.processAADByte((byte)param1Int);
    }
  }
  
  private class CMSAuthOutputEncryptor extends CMSOutputEncryptor implements OutputAEADEncryptor {
    private AEADBlockCipher aeadCipher = getCipher();
    
    private MacCaptureStream macOut;
    
    CMSAuthOutputEncryptor(ASN1ObjectIdentifier param1ASN1ObjectIdentifier, int param1Int, SecureRandom param1SecureRandom) throws CMSException {
      super(param1ASN1ObjectIdentifier, param1Int, param1SecureRandom);
    }
    
    private AEADBlockCipher getCipher() {
      if (!(this.cipher instanceof AEADBlockCipher))
        throw new IllegalArgumentException("Unable to create Authenticated Output Encryptor without Authenticaed Data cipher!"); 
      return (AEADBlockCipher)this.cipher;
    }
    
    public OutputStream getOutputStream(OutputStream param1OutputStream) {
      this.macOut = new MacCaptureStream(param1OutputStream, (this.aeadCipher.getMac()).length);
      return (OutputStream)CipherFactory.createOutputStream((OutputStream)this.macOut, this.cipher);
    }
    
    public OutputStream getAADStream() {
      return new BcCMSContentEncryptorBuilder.AADStream(this.aeadCipher);
    }
    
    public byte[] getMAC() {
      return this.macOut.getMac();
    }
  }
  
  private class CMSOutputEncryptor implements OutputEncryptor {
    private KeyParameter encKey;
    
    private AlgorithmIdentifier algorithmIdentifier;
    
    protected Object cipher;
    
    CMSOutputEncryptor(ASN1ObjectIdentifier param1ASN1ObjectIdentifier, int param1Int, SecureRandom param1SecureRandom) throws CMSException {
      if (param1SecureRandom == null)
        param1SecureRandom = new SecureRandom(); 
      CipherKeyGenerator cipherKeyGenerator = BcCMSContentEncryptorBuilder.this.helper.createKeyGenerator(param1ASN1ObjectIdentifier, param1Int, param1SecureRandom);
      this.encKey = new KeyParameter(cipherKeyGenerator.generateKey());
      this.algorithmIdentifier = BcCMSContentEncryptorBuilder.this.helper.generateEncryptionAlgID(param1ASN1ObjectIdentifier, this.encKey, param1SecureRandom);
      this.cipher = EnvelopedDataHelper.createContentCipher(true, (CipherParameters)this.encKey, this.algorithmIdentifier);
    }
    
    public AlgorithmIdentifier getAlgorithmIdentifier() {
      return this.algorithmIdentifier;
    }
    
    public OutputStream getOutputStream(OutputStream param1OutputStream) {
      return (OutputStream)CipherFactory.createOutputStream(param1OutputStream, this.cipher);
    }
    
    public GenericKey getKey() {
      return new GenericKey(this.algorithmIdentifier, this.encKey.getKey());
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\bc\BcCMSContentEncryptorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */