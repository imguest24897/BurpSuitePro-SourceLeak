package META-INF.versions.9.org.bouncycastle.jsse.provider;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLEngine;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.ProvSSLEngine;
import org.bouncycastle.jsse.provider.ProvSSLEngine_9;
import org.bouncycastle.jsse.provider.SSLParametersUtil;
import org.bouncycastle.jsse.provider.SSLSessionUtil;

abstract class SSLEngineUtil {
  static ProvSSLEngine create(ContextData paramContextData) {
    return (ProvSSLEngine)new ProvSSLEngine_9(paramContextData);
  }
  
  static ProvSSLEngine create(ContextData paramContextData, String paramString, int paramInt) {
    return (ProvSSLEngine)new ProvSSLEngine_9(paramContextData, paramString, paramInt);
  }
  
  static BCExtendedSSLSession importHandshakeSession(SSLEngine paramSSLEngine) {
    if (paramSSLEngine instanceof BCSSLEngine)
      return ((BCSSLEngine)paramSSLEngine).getBCHandshakeSession(); 
    if (null != paramSSLEngine) {
      SSLSession sSLSession = paramSSLEngine.getHandshakeSession();
      if (null != sSLSession)
        return SSLSessionUtil.importSSLSession(sSLSession); 
    } 
    return null;
  }
  
  static BCSSLParameters importSSLParameters(SSLEngine paramSSLEngine) {
    if (paramSSLEngine instanceof BCSSLEngine)
      return ((BCSSLEngine)paramSSLEngine).getParameters(); 
    if (null == paramSSLEngine)
      return null; 
    SSLParameters sSLParameters = paramSSLEngine.getSSLParameters();
    if (null == sSLParameters)
      throw new RuntimeException("SSLEngine.getSSLParameters returned null"); 
    return SSLParametersUtil.importSSLParameters(sSLParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\SSLEngineUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */