package org.bouncycastle.its.jcajce;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.its.operator.ETSIDataDecryptor;
import org.bouncycastle.jcajce.spec.IESKEMParameterSpec;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.util.Arrays;

public class JcaETSIDataDecryptor implements ETSIDataDecryptor {
  private final PrivateKey privateKey;
  
  private final JcaJceHelper helper;
  
  private final byte[] recipientHash;
  
  private SecretKey secretKey = null;
  
  JcaETSIDataDecryptor(PrivateKey paramPrivateKey, byte[] paramArrayOfbyte, JcaJceHelper paramJcaJceHelper) {
    this.privateKey = paramPrivateKey;
    this.helper = paramJcaJceHelper;
    this.recipientHash = paramArrayOfbyte;
  }
  
  public byte[] decrypt(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    try {
      Cipher cipher1 = this.helper.createCipher("ETSIKEMwithSHA256");
      cipher1.init(4, this.privateKey, (AlgorithmParameterSpec)new IESKEMParameterSpec(this.recipientHash));
      this.secretKey = (SecretKey)cipher1.unwrap(paramArrayOfbyte1, "AES", 3);
      Cipher cipher2 = this.helper.createCipher("CCM");
      cipher2.init(2, this.secretKey, ClassUtil.getGCMSpec(paramArrayOfbyte3, 128));
      return cipher2.doFinal(paramArrayOfbyte2);
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
  
  public byte[] getKey() {
    if (this.secretKey == null)
      throw new IllegalStateException("no secret key recovered"); 
    return this.secretKey.getEncoded();
  }
  
  public static Builder builder(PrivateKey paramPrivateKey, byte[] paramArrayOfbyte) {
    return new Builder(paramPrivateKey, paramArrayOfbyte);
  }
  
  public static class Builder {
    private JcaJceHelper provider;
    
    private final byte[] recipientHash;
    
    private final PrivateKey key;
    
    public Builder(PrivateKey param1PrivateKey, byte[] param1ArrayOfbyte) {
      this.key = param1PrivateKey;
      this.recipientHash = Arrays.clone(param1ArrayOfbyte);
    }
    
    public Builder provider(Provider param1Provider) {
      this.provider = (JcaJceHelper)new ProviderJcaJceHelper(param1Provider);
      return this;
    }
    
    public Builder provider(String param1String) {
      this.provider = (JcaJceHelper)new NamedJcaJceHelper(param1String);
      return this;
    }
    
    public JcaETSIDataDecryptor build() {
      return new JcaETSIDataDecryptor(this.key, this.recipientHash, this.provider);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JcaETSIDataDecryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */