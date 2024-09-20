package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;
import java.security.AlgorithmConstraints;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SNIMatcher;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLParameters;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.JsseUtils_7;
import org.bouncycastle.jsse.provider.JsseUtils_8;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ReflectionUtil;

abstract class SSLParametersUtil {
  private static final Method getNamedGroups;
  
  private static final Method setNamedGroups;
  
  private static final Method getSignatureSchemes;
  
  private static final Method setSignatureSchemes;
  
  static BCSSLParameters getParameters(ProvSSLParameters paramProvSSLParameters) {
    BCSSLParameters bCSSLParameters = new BCSSLParameters(paramProvSSLParameters.getCipherSuites(), paramProvSSLParameters.getProtocols());
    if (paramProvSSLParameters.getNeedClientAuth()) {
      bCSSLParameters.setNeedClientAuth(true);
    } else {
      bCSSLParameters.setWantClientAuth(paramProvSSLParameters.getWantClientAuth());
    } 
    bCSSLParameters.setEndpointIdentificationAlgorithm(paramProvSSLParameters.getEndpointIdentificationAlgorithm());
    bCSSLParameters.setAlgorithmConstraints(paramProvSSLParameters.getAlgorithmConstraints());
    bCSSLParameters.setServerNames(paramProvSSLParameters.getServerNames());
    bCSSLParameters.setSNIMatchers(paramProvSSLParameters.getSNIMatchers());
    bCSSLParameters.setUseCipherSuitesOrder(paramProvSSLParameters.getUseCipherSuitesOrder());
    bCSSLParameters.setApplicationProtocols(paramProvSSLParameters.getApplicationProtocols());
    bCSSLParameters.setEnableRetransmissions(paramProvSSLParameters.getEnableRetransmissions());
    bCSSLParameters.setMaximumPacketSize(paramProvSSLParameters.getMaximumPacketSize());
    bCSSLParameters.setSignatureSchemes(paramProvSSLParameters.getSignatureSchemes());
    bCSSLParameters.setNamedGroups(paramProvSSLParameters.getNamedGroups());
    return bCSSLParameters;
  }
  
  static SSLParameters getSSLParameters(ProvSSLParameters paramProvSSLParameters) {
    SSLParameters sSLParameters = new SSLParameters(paramProvSSLParameters.getCipherSuites(), paramProvSSLParameters.getProtocols());
    if (paramProvSSLParameters.getNeedClientAuth()) {
      sSLParameters.setNeedClientAuth(true);
    } else {
      sSLParameters.setWantClientAuth(paramProvSSLParameters.getWantClientAuth());
    } 
    sSLParameters.setEndpointIdentificationAlgorithm(paramProvSSLParameters.getEndpointIdentificationAlgorithm());
    sSLParameters.setAlgorithmConstraints(JsseUtils_7.exportAlgorithmConstraints(paramProvSSLParameters.getAlgorithmConstraints()));
    List list = paramProvSSLParameters.getServerNames();
    if (null != list)
      sSLParameters.setServerNames(JsseUtils_8.exportSNIServerNames(list)); 
    Collection collection = paramProvSSLParameters.getSNIMatchers();
    if (null != collection)
      sSLParameters.setSNIMatchers(JsseUtils_8.exportSNIMatchers(collection)); 
    sSLParameters.setUseCipherSuitesOrder(paramProvSSLParameters.getUseCipherSuitesOrder());
    String[] arrayOfString = paramProvSSLParameters.getApplicationProtocols();
    if (null != arrayOfString)
      sSLParameters.setApplicationProtocols(arrayOfString); 
    sSLParameters.setEnableRetransmissions(paramProvSSLParameters.getEnableRetransmissions());
    sSLParameters.setMaximumPacketSize(paramProvSSLParameters.getMaximumPacketSize());
    if (null != setSignatureSchemes)
      set(sSLParameters, setSignatureSchemes, paramProvSSLParameters.getSignatureSchemes()); 
    if (null != setNamedGroups)
      set(sSLParameters, setNamedGroups, paramProvSSLParameters.getNamedGroups()); 
    return sSLParameters;
  }
  
  static BCSSLParameters importSSLParameters(SSLParameters paramSSLParameters) {
    BCSSLParameters bCSSLParameters = new BCSSLParameters(paramSSLParameters.getCipherSuites(), paramSSLParameters.getProtocols());
    if (paramSSLParameters.getNeedClientAuth()) {
      bCSSLParameters.setNeedClientAuth(true);
    } else {
      bCSSLParameters.setWantClientAuth(paramSSLParameters.getWantClientAuth());
    } 
    String str = paramSSLParameters.getEndpointIdentificationAlgorithm();
    if (null != str)
      bCSSLParameters.setEndpointIdentificationAlgorithm(str); 
    AlgorithmConstraints algorithmConstraints = paramSSLParameters.getAlgorithmConstraints();
    if (null != algorithmConstraints)
      bCSSLParameters.setAlgorithmConstraints(JsseUtils_7.importAlgorithmConstraints(algorithmConstraints)); 
    List<SNIServerName> list = paramSSLParameters.getServerNames();
    if (null != list)
      bCSSLParameters.setServerNames(JsseUtils_8.importSNIServerNames(list)); 
    Collection<SNIMatcher> collection = paramSSLParameters.getSNIMatchers();
    if (null != collection)
      bCSSLParameters.setSNIMatchers(JsseUtils_8.importSNIMatchers(collection)); 
    bCSSLParameters.setUseCipherSuitesOrder(paramSSLParameters.getUseCipherSuitesOrder());
    String[] arrayOfString = paramSSLParameters.getApplicationProtocols();
    if (null != arrayOfString)
      bCSSLParameters.setApplicationProtocols(arrayOfString); 
    bCSSLParameters.setEnableRetransmissions(paramSSLParameters.getEnableRetransmissions());
    bCSSLParameters.setMaximumPacketSize(paramSSLParameters.getMaximumPacketSize());
    if (null != getSignatureSchemes)
      bCSSLParameters.setSignatureSchemes((String[])get(paramSSLParameters, getSignatureSchemes)); 
    if (null != getNamedGroups)
      bCSSLParameters.setNamedGroups((String[])get(paramSSLParameters, getNamedGroups)); 
    return bCSSLParameters;
  }
  
  static void setParameters(ProvSSLParameters paramProvSSLParameters, BCSSLParameters paramBCSSLParameters) {
    String[] arrayOfString1 = paramBCSSLParameters.getCipherSuites();
    if (null != arrayOfString1)
      paramProvSSLParameters.setCipherSuites(arrayOfString1); 
    String[] arrayOfString2 = paramBCSSLParameters.getProtocols();
    if (null != arrayOfString2)
      paramProvSSLParameters.setProtocols(arrayOfString2); 
    if (paramBCSSLParameters.getNeedClientAuth()) {
      paramProvSSLParameters.setNeedClientAuth(true);
    } else {
      paramProvSSLParameters.setWantClientAuth(paramBCSSLParameters.getWantClientAuth());
    } 
    String str = paramBCSSLParameters.getEndpointIdentificationAlgorithm();
    if (null != str)
      paramProvSSLParameters.setEndpointIdentificationAlgorithm(str); 
    BCAlgorithmConstraints bCAlgorithmConstraints = paramBCSSLParameters.getAlgorithmConstraints();
    if (null != bCAlgorithmConstraints)
      paramProvSSLParameters.setAlgorithmConstraints(bCAlgorithmConstraints); 
    List list = paramBCSSLParameters.getServerNames();
    if (null != list)
      paramProvSSLParameters.setServerNames(list); 
    Collection collection = paramBCSSLParameters.getSNIMatchers();
    if (null != collection)
      paramProvSSLParameters.setSNIMatchers(collection); 
    paramProvSSLParameters.setUseCipherSuitesOrder(paramBCSSLParameters.getUseCipherSuitesOrder());
    String[] arrayOfString3 = paramBCSSLParameters.getApplicationProtocols();
    if (null != arrayOfString3)
      paramProvSSLParameters.setApplicationProtocols(arrayOfString3); 
    paramProvSSLParameters.setEnableRetransmissions(paramBCSSLParameters.getEnableRetransmissions());
    paramProvSSLParameters.setMaximumPacketSize(paramBCSSLParameters.getMaximumPacketSize());
    paramProvSSLParameters.setSignatureSchemes(paramBCSSLParameters.getSignatureSchemes());
    paramProvSSLParameters.setNamedGroups(paramBCSSLParameters.getNamedGroups());
  }
  
  static void setSSLParameters(ProvSSLParameters paramProvSSLParameters, SSLParameters paramSSLParameters) {
    String[] arrayOfString1 = paramSSLParameters.getCipherSuites();
    if (null != arrayOfString1)
      paramProvSSLParameters.setCipherSuites(arrayOfString1); 
    String[] arrayOfString2 = paramSSLParameters.getProtocols();
    if (null != arrayOfString2)
      paramProvSSLParameters.setProtocols(arrayOfString2); 
    if (paramSSLParameters.getNeedClientAuth()) {
      paramProvSSLParameters.setNeedClientAuth(true);
    } else {
      paramProvSSLParameters.setWantClientAuth(paramSSLParameters.getWantClientAuth());
    } 
    String str = paramSSLParameters.getEndpointIdentificationAlgorithm();
    if (null != str)
      paramProvSSLParameters.setEndpointIdentificationAlgorithm(str); 
    AlgorithmConstraints algorithmConstraints = paramSSLParameters.getAlgorithmConstraints();
    if (null != algorithmConstraints)
      paramProvSSLParameters.setAlgorithmConstraints(JsseUtils_7.importAlgorithmConstraints(algorithmConstraints)); 
    List<SNIServerName> list = paramSSLParameters.getServerNames();
    if (null != list)
      paramProvSSLParameters.setServerNames(JsseUtils_8.importSNIServerNames(list)); 
    Collection<SNIMatcher> collection = paramSSLParameters.getSNIMatchers();
    if (null != collection)
      paramProvSSLParameters.setSNIMatchers(JsseUtils_8.importSNIMatchers(collection)); 
    paramProvSSLParameters.setUseCipherSuitesOrder(paramSSLParameters.getUseCipherSuitesOrder());
    String[] arrayOfString3 = paramSSLParameters.getApplicationProtocols();
    if (null != arrayOfString3)
      paramProvSSLParameters.setApplicationProtocols(arrayOfString3); 
    paramProvSSLParameters.setEnableRetransmissions(paramSSLParameters.getEnableRetransmissions());
    paramProvSSLParameters.setMaximumPacketSize(paramSSLParameters.getMaximumPacketSize());
    if (null != getSignatureSchemes)
      paramProvSSLParameters.setSignatureSchemes((String[])get(paramSSLParameters, getSignatureSchemes)); 
    if (null != getNamedGroups)
      paramProvSSLParameters.setNamedGroups((String[])get(paramSSLParameters, getNamedGroups)); 
  }
  
  private static Object get(Object paramObject, Method paramMethod) {
    return ReflectionUtil.invokeGetter(paramObject, paramMethod);
  }
  
  private static void set(Object paramObject1, Method paramMethod, Object paramObject2) {
    ReflectionUtil.invokeSetter(paramObject1, paramMethod, paramObject2);
  }
  
  static {
    Method[] arrayOfMethod = ReflectionUtil.getMethods("javax.net.ssl.SSLParameters");
    getNamedGroups = ReflectionUtil.findMethod(arrayOfMethod, "getNamedGroups");
    setNamedGroups = ReflectionUtil.findMethod(arrayOfMethod, "setNamedGroups");
    getSignatureSchemes = ReflectionUtil.findMethod(arrayOfMethod, "getSignatureSchemes");
    setSignatureSchemes = ReflectionUtil.findMethod(arrayOfMethod, "setSignatureSchemes");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\SSLParametersUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */