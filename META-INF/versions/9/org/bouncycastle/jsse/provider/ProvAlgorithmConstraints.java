package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.java.security.BCCryptoPrimitive;
import org.bouncycastle.jsse.provider.AbstractAlgorithmConstraints;
import org.bouncycastle.jsse.provider.AlgorithmDecomposer;
import org.bouncycastle.jsse.provider.DisabledAlgorithmConstraints;
import org.bouncycastle.jsse.provider.ProvAlgorithmDecomposer;

class ProvAlgorithmConstraints extends AbstractAlgorithmConstraints {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvAlgorithmConstraints.class.getName());
  
  private static final String PROPERTY_CERTPATH_DISABLED_ALGORITHMS = "jdk.certpath.disabledAlgorithms";
  
  private static final String PROPERTY_TLS_DISABLED_ALGORITHMS = "jdk.tls.disabledAlgorithms";
  
  private static final String DEFAULT_CERTPATH_DISABLED_ALGORITHMS = "MD2, MD5, SHA1 jdkCA & usage TLSServer, RSA keySize < 1024, DSA keySize < 1024, EC keySize < 224, SHA1 usage SignedJAR & denyAfter 2019-01-01";
  
  private static final String DEFAULT_TLS_DISABLED_ALGORITHMS = "SSLv3, TLSv1, TLSv1.1, DTLSv1.0, RC4, DES, MD5withRSA, DH keySize < 1024, EC keySize < 224, 3DES_EDE_CBC, anon, NULL, ECDH";
  
  private static final DisabledAlgorithmConstraints provTlsDisabledAlgorithms = DisabledAlgorithmConstraints.create((AlgorithmDecomposer)ProvAlgorithmDecomposer.INSTANCE_TLS, "jdk.tls.disabledAlgorithms", "SSLv3, TLSv1, TLSv1.1, DTLSv1.0, RC4, DES, MD5withRSA, DH keySize < 1024, EC keySize < 224, 3DES_EDE_CBC, anon, NULL, ECDH");
  
  private static final DisabledAlgorithmConstraints provX509DisabledAlgorithms = DisabledAlgorithmConstraints.create((AlgorithmDecomposer)ProvAlgorithmDecomposer.INSTANCE_X509, "jdk.certpath.disabledAlgorithms", "MD2, MD5, SHA1 jdkCA & usage TLSServer, RSA keySize < 1024, DSA keySize < 1024, EC keySize < 224, SHA1 usage SignedJAR & denyAfter 2019-01-01");
  
  static final org.bouncycastle.jsse.provider.ProvAlgorithmConstraints DEFAULT = new org.bouncycastle.jsse.provider.ProvAlgorithmConstraints(null, true);
  
  static final org.bouncycastle.jsse.provider.ProvAlgorithmConstraints DEFAULT_TLS_ONLY = new org.bouncycastle.jsse.provider.ProvAlgorithmConstraints(null, false);
  
  private final BCAlgorithmConstraints configAlgorithmConstraints;
  
  private final Set<String> supportedSignatureAlgorithms;
  
  private final boolean enableX509Constraints;
  
  ProvAlgorithmConstraints(BCAlgorithmConstraints paramBCAlgorithmConstraints, boolean paramBoolean) {
    super(null);
    this.configAlgorithmConstraints = paramBCAlgorithmConstraints;
    this.supportedSignatureAlgorithms = null;
    this.enableX509Constraints = paramBoolean;
  }
  
  ProvAlgorithmConstraints(BCAlgorithmConstraints paramBCAlgorithmConstraints, String[] paramArrayOfString, boolean paramBoolean) {
    super(null);
    this.configAlgorithmConstraints = paramBCAlgorithmConstraints;
    this.supportedSignatureAlgorithms = asUnmodifiableSet(paramArrayOfString);
    this.enableX509Constraints = paramBoolean;
  }
  
  public boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, AlgorithmParameters paramAlgorithmParameters) {
    checkPrimitives(paramSet);
    checkAlgorithmName(paramString);
    if (null != this.supportedSignatureAlgorithms) {
      String str = paramString;
      paramString = getAlgorithm(str);
      if (!isSupportedSignatureAlgorithm(str)) {
        if (LOG.isLoggable(Level.FINEST))
          LOG.finest("Signature algorithm '" + str + "' not in supported signature algorithms"); 
        return false;
      } 
    } 
    return (null != this.configAlgorithmConstraints && !this.configAlgorithmConstraints.permits(paramSet, paramString, paramAlgorithmParameters)) ? false : ((null != provTlsDisabledAlgorithms && !provTlsDisabledAlgorithms.permits(paramSet, paramString, paramAlgorithmParameters)) ? false : (!(this.enableX509Constraints && null != provX509DisabledAlgorithms && !provX509DisabledAlgorithms.permits(paramSet, paramString, paramAlgorithmParameters))));
  }
  
  public boolean permits(Set<BCCryptoPrimitive> paramSet, Key paramKey) {
    checkPrimitives(paramSet);
    checkKey(paramKey);
    return (null != this.configAlgorithmConstraints && !this.configAlgorithmConstraints.permits(paramSet, paramKey)) ? false : ((null != provTlsDisabledAlgorithms && !provTlsDisabledAlgorithms.permits(paramSet, paramKey)) ? false : (!(this.enableX509Constraints && null != provX509DisabledAlgorithms && !provX509DisabledAlgorithms.permits(paramSet, paramKey))));
  }
  
  public boolean permits(Set<BCCryptoPrimitive> paramSet, String paramString, Key paramKey, AlgorithmParameters paramAlgorithmParameters) {
    checkPrimitives(paramSet);
    checkAlgorithmName(paramString);
    checkKey(paramKey);
    if (null != this.supportedSignatureAlgorithms) {
      String str = paramString;
      paramString = getAlgorithm(str);
      if (!isSupportedSignatureAlgorithm(str)) {
        if (LOG.isLoggable(Level.FINEST))
          LOG.finest("Signature algorithm '" + str + "' not in supported signature algorithms"); 
        return false;
      } 
    } 
    return (null != this.configAlgorithmConstraints && !this.configAlgorithmConstraints.permits(paramSet, paramString, paramKey, paramAlgorithmParameters)) ? false : ((null != provTlsDisabledAlgorithms && !provTlsDisabledAlgorithms.permits(paramSet, paramString, paramKey, paramAlgorithmParameters)) ? false : (!(this.enableX509Constraints && null != provX509DisabledAlgorithms && !provX509DisabledAlgorithms.permits(paramSet, paramString, paramKey, paramAlgorithmParameters))));
  }
  
  private String getAlgorithm(String paramString) {
    int i = paramString.indexOf(':');
    return (i < 0) ? paramString : paramString.substring(0, i);
  }
  
  private boolean isSupportedSignatureAlgorithm(String paramString) {
    return containsIgnoreCase(this.supportedSignatureAlgorithms, paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvAlgorithmConstraints.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */