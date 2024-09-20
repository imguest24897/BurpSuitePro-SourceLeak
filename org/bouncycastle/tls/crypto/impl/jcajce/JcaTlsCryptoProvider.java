package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoProvider;

public class JcaTlsCryptoProvider implements TlsCryptoProvider {
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  public JcaTlsCryptoProvider setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public JcaTlsCryptoProvider setProvider(String paramString) {
    this.helper = (JcaJceHelper)new NamedJcaJceHelper(paramString);
    return this;
  }
  
  public JcaTlsCrypto create(SecureRandom paramSecureRandom) {
    try {
      JcaJceHelper jcaJceHelper = getHelper();
      if (paramSecureRandom == null)
        if (jcaJceHelper instanceof DefaultJcaJceHelper) {
          paramSecureRandom = SecureRandom.getInstance("DEFAULT");
        } else {
          paramSecureRandom = SecureRandom.getInstance("DEFAULT", jcaJceHelper.createMessageDigest("SHA-512").getProvider());
        }  
      return create(paramSecureRandom, new NonceEntropySource(jcaJceHelper, paramSecureRandom));
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("unable to create JcaTlsCrypto: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
  
  public JcaTlsCrypto create(SecureRandom paramSecureRandom1, SecureRandom paramSecureRandom2) {
    return new JcaTlsCrypto(getHelper(), paramSecureRandom1, paramSecureRandom2);
  }
  
  public JcaJceHelper getHelper() {
    return this.helper;
  }
  
  private static class NonceEntropySource extends SecureRandom {
    NonceEntropySource(JcaJceHelper param1JcaJceHelper, SecureRandom param1SecureRandom) throws GeneralSecurityException {
      super(new NonceEntropySourceSpi(param1SecureRandom, param1JcaJceHelper.createMessageDigest("SHA-512")), param1SecureRandom.getProvider());
    }
    
    private static class NonceEntropySourceSpi extends SecureRandomSpi {
      private final SecureRandom source;
      
      private final MessageDigest digest;
      
      private final byte[] seed;
      
      private final byte[] state;
      
      NonceEntropySourceSpi(SecureRandom param2SecureRandom, MessageDigest param2MessageDigest) {
        this.source = param2SecureRandom;
        this.digest = param2MessageDigest;
        this.seed = param2SecureRandom.generateSeed(param2MessageDigest.getDigestLength());
        this.state = new byte[this.seed.length];
      }
      
      protected void engineSetSeed(byte[] param2ArrayOfbyte) {
        synchronized (this.digest) {
          runDigest(this.seed, param2ArrayOfbyte, this.seed);
        } 
      }
      
      protected void engineNextBytes(byte[] param2ArrayOfbyte) {
        synchronized (this.digest) {
          int i = this.state.length;
          for (byte b = 0; b != param2ArrayOfbyte.length; b++) {
            if (i == this.state.length) {
              this.source.nextBytes(this.state);
              runDigest(this.seed, this.state, this.state);
              i = 0;
            } 
            param2ArrayOfbyte[b] = this.state[i++];
          } 
        } 
      }
      
      protected byte[] engineGenerateSeed(int param2Int) {
        return this.source.generateSeed(param2Int);
      }
      
      private void runDigest(byte[] param2ArrayOfbyte1, byte[] param2ArrayOfbyte2, byte[] param2ArrayOfbyte3) {
        this.digest.update(param2ArrayOfbyte1);
        this.digest.update(param2ArrayOfbyte2);
        try {
          this.digest.digest(param2ArrayOfbyte3, 0, param2ArrayOfbyte3.length);
        } catch (DigestException digestException) {
          throw Exceptions.illegalStateException("unable to generate nonce data: " + digestException.getMessage(), digestException);
        } 
      }
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsCryptoProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */