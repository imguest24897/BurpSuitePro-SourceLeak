package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoProvider;
import org.bouncycastle.tls.crypto.impl.jcajce.Exceptions;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

public class JcaTlsCryptoProvider implements TlsCryptoProvider {
  private JcaJceHelper helper = (JcaJceHelper)new DefaultJcaJceHelper();
  
  public org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider setProvider(Provider paramProvider) {
    this.helper = (JcaJceHelper)new ProviderJcaJceHelper(paramProvider);
    return this;
  }
  
  public org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider setProvider(String paramString) {
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
      return create(paramSecureRandom, (SecureRandom)new NonceEntropySource(jcaJceHelper, paramSecureRandom));
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
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsCryptoProvider.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */