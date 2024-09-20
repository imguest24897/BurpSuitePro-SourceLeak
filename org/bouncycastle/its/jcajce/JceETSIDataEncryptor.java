package org.bouncycastle.its.jcajce;

import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.its.operator.ETSIDataEncryptor;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;

public class JceETSIDataEncryptor implements ETSIDataEncryptor {
  private final SecureRandom random;
  
  private final JcaJceHelper helper;
  
  private byte[] nonce;
  
  private byte[] key;
  
  private JceETSIDataEncryptor(SecureRandom paramSecureRandom, JcaJceHelper paramJcaJceHelper) {
    this.random = paramSecureRandom;
    this.helper = paramJcaJceHelper;
  }
  
  public byte[] encrypt(byte[] paramArrayOfbyte) {
    this.key = new byte[16];
    this.random.nextBytes(this.key);
    this.nonce = new byte[12];
    this.random.nextBytes(this.nonce);
    try {
      SecretKeySpec secretKeySpec = new SecretKeySpec(this.key, "AES");
      Cipher cipher = this.helper.createCipher("CCM");
      cipher.init(1, secretKeySpec, ClassUtil.getGCMSpec(this.nonce, 128));
      return cipher.doFinal(paramArrayOfbyte);
    } catch (Exception exception) {
      throw new RuntimeException(exception.getMessage(), exception);
    } 
  }
  
  public byte[] getKey() {
    return this.key;
  }
  
  public byte[] getNonce() {
    return this.nonce;
  }
  
  public static class Builder {
    private SecureRandom random;
    
    private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
    
    public Builder setRandom(SecureRandom param1SecureRandom) {
      this.random = param1SecureRandom;
      return this;
    }
    
    public Builder setProvider(Provider param1Provider) {
      this.helper = (JcaJceHelper)new ProviderJcaJceHelper(param1Provider);
      return this;
    }
    
    public Builder setProvider(String param1String) {
      this.helper = (JcaJceHelper)new NamedJcaJceHelper(param1String);
      return this;
    }
    
    public JceETSIDataEncryptor build() {
      if (this.random == null)
        this.random = new SecureRandom(); 
      return new JceETSIDataEncryptor(this.random, this.helper);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\jcajce\JceETSIDataEncryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */