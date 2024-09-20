package org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLEngine;
import org.bouncycastle.jsse.BCSSLParameters;

abstract class SSLEngineUtil {
  private static final Method getHandshakeSession;
  
  private static final Method getSSLParameters;
  
  private static final boolean useEngine8;
  
  static SSLEngine create(ContextData paramContextData) {
    return useEngine8 ? new ProvSSLEngine_8(paramContextData) : new ProvSSLEngine(paramContextData);
  }
  
  static SSLEngine create(ContextData paramContextData, String paramString, int paramInt) {
    return useEngine8 ? new ProvSSLEngine_8(paramContextData, paramString, paramInt) : new ProvSSLEngine(paramContextData, paramString, paramInt);
  }
  
  static BCExtendedSSLSession importHandshakeSession(SSLEngine paramSSLEngine) {
    if (paramSSLEngine instanceof BCSSLEngine)
      return ((BCSSLEngine)paramSSLEngine).getBCHandshakeSession(); 
    if (null != paramSSLEngine && null != getHandshakeSession) {
      SSLSession sSLSession = (SSLSession)ReflectionUtil.invokeGetter(paramSSLEngine, getHandshakeSession);
      if (null != sSLSession)
        return SSLSessionUtil.importSSLSession(sSLSession); 
    } 
    return null;
  }
  
  static BCSSLParameters importSSLParameters(SSLEngine paramSSLEngine) {
    if (paramSSLEngine instanceof BCSSLEngine)
      return ((BCSSLEngine)paramSSLEngine).getParameters(); 
    if (null == paramSSLEngine || null == getSSLParameters)
      return null; 
    SSLParameters sSLParameters = (SSLParameters)ReflectionUtil.invokeGetter(paramSSLEngine, getSSLParameters);
    if (null == sSLParameters)
      throw new RuntimeException("SSLEngine.getSSLParameters returned null"); 
    return SSLParametersUtil.importSSLParameters(sSLParameters);
  }
  
  static {
    Method[] arrayOfMethod = ReflectionUtil.getMethods("javax.net.ssl.SSLEngine");
    getHandshakeSession = ReflectionUtil.findMethod(arrayOfMethod, "getHandshakeSession");
    getSSLParameters = ReflectionUtil.findMethod(arrayOfMethod, "getSSLParameters");
    useEngine8 = ReflectionUtil.hasMethod(arrayOfMethod, "getApplicationProtocol");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\SSLEngineUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */