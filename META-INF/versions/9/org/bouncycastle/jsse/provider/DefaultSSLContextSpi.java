package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import org.bouncycastle.jsse.provider.ProvSSLContextSpi;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider;

class DefaultSSLContextSpi extends ProvSSLContextSpi {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.DefaultSSLContextSpi.class.getName());
  
  private static Exception avoidCapturingException(Exception paramException) {
    return new KeyManagementException(paramException.getMessage());
  }
  
  static ProvSSLContextSpi getDefaultInstance() throws Exception {
    if (null != LazyInstance.access$300())
      throw LazyInstance.access$300(); 
    return LazyInstance.access$400();
  }
  
  DefaultSSLContextSpi(boolean paramBoolean, JcaTlsCryptoProvider paramJcaTlsCryptoProvider) throws KeyManagementException {
    super(paramBoolean, paramJcaTlsCryptoProvider, null);
    if (null != LazyManagers.access$000())
      throw new KeyManagementException("Default key/trust managers unavailable", LazyManagers.access$000()); 
    super.engineInit(LazyManagers.access$500(), LazyManagers.access$600(), null);
  }
  
  protected void engineInit(KeyManager[] paramArrayOfKeyManager, TrustManager[] paramArrayOfTrustManager, SecureRandom paramSecureRandom) throws KeyManagementException {
    throw new KeyManagementException("Default SSLContext is initialized automatically");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\DefaultSSLContextSpi.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */