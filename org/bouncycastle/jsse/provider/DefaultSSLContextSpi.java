package org.bouncycastle.jsse.provider;

import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCryptoProvider;

class DefaultSSLContextSpi extends ProvSSLContextSpi {
  private static final Logger LOG = Logger.getLogger(DefaultSSLContextSpi.class.getName());
  
  private static Exception avoidCapturingException(Exception paramException) {
    return new KeyManagementException(paramException.getMessage());
  }
  
  static ProvSSLContextSpi getDefaultInstance() throws Exception {
    if (null != LazyInstance.initException)
      throw LazyInstance.initException; 
    return LazyInstance.instance;
  }
  
  DefaultSSLContextSpi(boolean paramBoolean, JcaTlsCryptoProvider paramJcaTlsCryptoProvider) throws KeyManagementException {
    super(paramBoolean, paramJcaTlsCryptoProvider, null);
    if (null != LazyManagers.initException)
      throw new KeyManagementException("Default key/trust managers unavailable", LazyManagers.initException); 
    super.engineInit(LazyManagers.keyManagers, LazyManagers.trustManagers, null);
  }
  
  protected void engineInit(KeyManager[] paramArrayOfKeyManager, TrustManager[] paramArrayOfTrustManager, SecureRandom paramSecureRandom) throws KeyManagementException {
    throw new KeyManagementException("Default SSLContext is initialized automatically");
  }
  
  private static class LazyInstance {
    private static final Exception initException;
    
    private static final DefaultSSLContextSpi instance;
    
    static {
      Exception exception = DefaultSSLContextSpi.LazyManagers.initException;
      DefaultSSLContextSpi defaultSSLContextSpi = null;
      if (null == exception)
        try {
          defaultSSLContextSpi = new DefaultSSLContextSpi(false, new JcaTlsCryptoProvider());
        } catch (Exception exception1) {
          DefaultSSLContextSpi.LOG.log(Level.WARNING, "Failed to load default SSLContext", exception1);
          exception = DefaultSSLContextSpi.avoidCapturingException(exception1);
        }  
      initException = exception;
      instance = defaultSSLContextSpi;
    }
  }
  
  private static class LazyManagers {
    private static final Exception initException;
    
    private static final KeyManager[] keyManagers;
    
    private static final TrustManager[] trustManagers;
    
    static {
      Exception exception = null;
      KeyManager[] arrayOfKeyManager = null;
      TrustManager[] arrayOfTrustManager = null;
      try {
        arrayOfTrustManager = ProvSSLContextSpi.getDefaultTrustManagers();
      } catch (Exception exception1) {
        DefaultSSLContextSpi.LOG.log(Level.WARNING, "Failed to load default trust managers", exception1);
        exception = exception1;
      } 
      if (null == exception)
        try {
          arrayOfKeyManager = ProvSSLContextSpi.getDefaultKeyManagers();
        } catch (Exception exception1) {
          DefaultSSLContextSpi.LOG.log(Level.WARNING, "Failed to load default key managers", exception1);
          exception = exception1;
        }  
      if (null != exception) {
        exception = DefaultSSLContextSpi.avoidCapturingException(exception);
        arrayOfKeyManager = null;
        arrayOfTrustManager = null;
      } 
      initException = exception;
      keyManagers = arrayOfKeyManager;
      trustManagers = arrayOfTrustManager;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\DefaultSSLContextSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */