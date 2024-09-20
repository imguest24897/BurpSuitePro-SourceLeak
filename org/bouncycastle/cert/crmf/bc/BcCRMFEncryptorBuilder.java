package org.bouncycastle.cert.crmf.bc;

import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OutputEncryptor;

public class BcCRMFEncryptorBuilder {
  private final ASN1ObjectIdentifier encryptionOID;
  
  private final int keySize;
  
  private CRMFHelper helper = new CRMFHelper();
  
  private SecureRandom random;
  
  public BcCRMFEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this(paramASN1ObjectIdentifier, -1);
  }
  
  public BcCRMFEncryptorBuilder(ASN1ObjectIdentifier paramASN1ObjectIdentifier, int paramInt) {
    this.encryptionOID = paramASN1ObjectIdentifier;
    this.keySize = paramInt;
  }
  
  public BcCRMFEncryptorBuilder setSecureRandom(SecureRandom paramSecureRandom) {
    this.random = paramSecureRandom;
    return this;
  }
  
  public OutputEncryptor build() throws CRMFException {
    return new CRMFOutputEncryptor(this.encryptionOID, this.keySize, this.random);
  }
  
  private class CRMFOutputEncryptor implements OutputEncryptor {
    private KeyParameter encKey;
    
    private AlgorithmIdentifier algorithmIdentifier;
    
    private Object cipher;
    
    CRMFOutputEncryptor(ASN1ObjectIdentifier param1ASN1ObjectIdentifier, int param1Int, SecureRandom param1SecureRandom) throws CRMFException {
      param1SecureRandom = CryptoServicesRegistrar.getSecureRandom(param1SecureRandom);
      CipherKeyGenerator cipherKeyGenerator = BcCRMFEncryptorBuilder.this.helper.createKeyGenerator(param1ASN1ObjectIdentifier, param1SecureRandom);
      this.encKey = new KeyParameter(cipherKeyGenerator.generateKey());
      this.algorithmIdentifier = BcCRMFEncryptorBuilder.this.helper.generateEncryptionAlgID(param1ASN1ObjectIdentifier, this.encKey, param1SecureRandom);
      BcCRMFEncryptorBuilder.this.helper;
      this.cipher = CRMFHelper.createContentCipher(true, (CipherParameters)this.encKey, this.algorithmIdentifier);
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\bc\BcCRMFEncryptorBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */