package org.bouncycastle.jsse.provider;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLParameters;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;

abstract class SSLParametersUtil {
  private static final Method getAlgorithmConstraints;
  
  private static final Method setAlgorithmConstraints;
  
  private static final Method getApplicationProtocols;
  
  private static final Method setApplicationProtocols;
  
  private static final Method getEnableRetransmissions;
  
  private static final Method setEnableRetransmissions;
  
  private static final Method getEndpointIdentificationAlgorithm;
  
  private static final Method setEndpointIdentificationAlgorithm;
  
  private static final Method getMaximumPacketSize;
  
  private static final Method setMaximumPacketSize;
  
  private static final Method getNamedGroups;
  
  private static final Method setNamedGroups;
  
  private static final Method getServerNames;
  
  private static final Method setServerNames;
  
  private static final Method getSignatureSchemes;
  
  private static final Method setSignatureSchemes;
  
  private static final Method getSNIMatchers;
  
  private static final Method setSNIMatchers;
  
  private static final Method getUseCipherSuitesOrder;
  
  private static final Method setUseCipherSuitesOrder;
  
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
    if (null != setAlgorithmConstraints)
      set(sSLParameters, setAlgorithmConstraints, JsseUtils_7.exportAlgorithmConstraintsDynamic(paramProvSSLParameters.getAlgorithmConstraints())); 
    if (null != setEndpointIdentificationAlgorithm)
      set(sSLParameters, setEndpointIdentificationAlgorithm, paramProvSSLParameters.getEndpointIdentificationAlgorithm()); 
    if (null != setServerNames) {
      List<BCSNIServerName> list = paramProvSSLParameters.getServerNames();
      if (null != list)
        set(sSLParameters, setServerNames, JsseUtils_8.exportSNIServerNamesDynamic(list)); 
    } 
    if (null != setSNIMatchers) {
      Collection<BCSNIMatcher> collection = paramProvSSLParameters.getSNIMatchers();
      if (null != collection)
        set(sSLParameters, setSNIMatchers, JsseUtils_8.exportSNIMatchersDynamic(collection)); 
    } 
    if (null != setUseCipherSuitesOrder)
      set(sSLParameters, setUseCipherSuitesOrder, Boolean.valueOf(paramProvSSLParameters.getUseCipherSuitesOrder())); 
    if (null != setApplicationProtocols) {
      String[] arrayOfString = paramProvSSLParameters.getApplicationProtocols();
      if (null != arrayOfString)
        set(sSLParameters, setApplicationProtocols, arrayOfString); 
    } 
    if (null != setEnableRetransmissions)
      set(sSLParameters, setEnableRetransmissions, Boolean.valueOf(paramProvSSLParameters.getEnableRetransmissions())); 
    if (null != setMaximumPacketSize)
      set(sSLParameters, setMaximumPacketSize, Integer.valueOf(paramProvSSLParameters.getMaximumPacketSize())); 
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
    if (null != getEndpointIdentificationAlgorithm) {
      String str = (String)get(paramSSLParameters, getEndpointIdentificationAlgorithm);
      if (null != str)
        bCSSLParameters.setEndpointIdentificationAlgorithm(str); 
    } 
    if (null != getAlgorithmConstraints) {
      Object object = get(paramSSLParameters, getAlgorithmConstraints);
      if (null != object)
        bCSSLParameters.setAlgorithmConstraints(JsseUtils_7.importAlgorithmConstraintsDynamic(object)); 
    } 
    if (null != getServerNames) {
      Object object = get(paramSSLParameters, getServerNames);
      if (null != object)
        bCSSLParameters.setServerNames(JsseUtils_8.importSNIServerNamesDynamic(object)); 
    } 
    if (null != getSNIMatchers) {
      Object object = get(paramSSLParameters, getSNIMatchers);
      if (null != object)
        bCSSLParameters.setSNIMatchers(JsseUtils_8.importSNIMatchersDynamic(object)); 
    } 
    if (null != getUseCipherSuitesOrder)
      bCSSLParameters.setUseCipherSuitesOrder(((Boolean)get(paramSSLParameters, getUseCipherSuitesOrder)).booleanValue()); 
    if (null != getApplicationProtocols) {
      String[] arrayOfString = (String[])get(paramSSLParameters, getApplicationProtocols);
      if (null != arrayOfString)
        bCSSLParameters.setApplicationProtocols(arrayOfString); 
    } 
    if (null != getEnableRetransmissions)
      bCSSLParameters.setEnableRetransmissions(((Boolean)get(paramSSLParameters, getEnableRetransmissions)).booleanValue()); 
    if (null != getMaximumPacketSize)
      bCSSLParameters.setMaximumPacketSize(((Integer)get(paramSSLParameters, getMaximumPacketSize)).intValue()); 
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
    List<BCSNIServerName> list = paramBCSSLParameters.getServerNames();
    if (null != list)
      paramProvSSLParameters.setServerNames(list); 
    Collection<BCSNIMatcher> collection = paramBCSSLParameters.getSNIMatchers();
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
    if (null != getEndpointIdentificationAlgorithm) {
      String str = (String)get(paramSSLParameters, getEndpointIdentificationAlgorithm);
      if (null != str)
        paramProvSSLParameters.setEndpointIdentificationAlgorithm(str); 
    } 
    if (null != getAlgorithmConstraints) {
      Object object = get(paramSSLParameters, getAlgorithmConstraints);
      if (null != object)
        paramProvSSLParameters.setAlgorithmConstraints(JsseUtils_7.importAlgorithmConstraintsDynamic(object)); 
    } 
    if (null != getServerNames) {
      Object object = get(paramSSLParameters, getServerNames);
      if (null != object)
        paramProvSSLParameters.setServerNames(JsseUtils_8.importSNIServerNamesDynamic(object)); 
    } 
    if (null != getSNIMatchers) {
      Object object = get(paramSSLParameters, getSNIMatchers);
      if (null != object)
        paramProvSSLParameters.setSNIMatchers(JsseUtils_8.importSNIMatchersDynamic(object)); 
    } 
    if (null != getUseCipherSuitesOrder)
      paramProvSSLParameters.setUseCipherSuitesOrder(((Boolean)get(paramSSLParameters, getUseCipherSuitesOrder)).booleanValue()); 
    if (null != getApplicationProtocols) {
      String[] arrayOfString = (String[])get(paramSSLParameters, getApplicationProtocols);
      if (null != arrayOfString)
        paramProvSSLParameters.setApplicationProtocols(arrayOfString); 
    } 
    if (null != getEnableRetransmissions)
      paramProvSSLParameters.setEnableRetransmissions(((Boolean)get(paramSSLParameters, getEnableRetransmissions)).booleanValue()); 
    if (null != getMaximumPacketSize)
      paramProvSSLParameters.setMaximumPacketSize(((Integer)get(paramSSLParameters, getMaximumPacketSize)).intValue()); 
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
    getAlgorithmConstraints = ReflectionUtil.findMethod(arrayOfMethod, "getAlgorithmConstraints");
    setAlgorithmConstraints = ReflectionUtil.findMethod(arrayOfMethod, "setAlgorithmConstraints");
    getApplicationProtocols = ReflectionUtil.findMethod(arrayOfMethod, "getApplicationProtocols");
    setApplicationProtocols = ReflectionUtil.findMethod(arrayOfMethod, "setApplicationProtocols");
    getEnableRetransmissions = ReflectionUtil.findMethod(arrayOfMethod, "getEnableRetransmissions");
    setEnableRetransmissions = ReflectionUtil.findMethod(arrayOfMethod, "setEnableRetransmissions");
    getEndpointIdentificationAlgorithm = ReflectionUtil.findMethod(arrayOfMethod, "getEndpointIdentificationAlgorithm");
    setEndpointIdentificationAlgorithm = ReflectionUtil.findMethod(arrayOfMethod, "setEndpointIdentificationAlgorithm");
    getMaximumPacketSize = ReflectionUtil.findMethod(arrayOfMethod, "getMaximumPacketSize");
    setMaximumPacketSize = ReflectionUtil.findMethod(arrayOfMethod, "setMaximumPacketSize");
    getNamedGroups = ReflectionUtil.findMethod(arrayOfMethod, "getNamedGroups");
    setNamedGroups = ReflectionUtil.findMethod(arrayOfMethod, "setNamedGroups");
    getServerNames = ReflectionUtil.findMethod(arrayOfMethod, "getServerNames");
    setServerNames = ReflectionUtil.findMethod(arrayOfMethod, "setServerNames");
    getSignatureSchemes = ReflectionUtil.findMethod(arrayOfMethod, "getSignatureSchemes");
    setSignatureSchemes = ReflectionUtil.findMethod(arrayOfMethod, "setSignatureSchemes");
    getSNIMatchers = ReflectionUtil.findMethod(arrayOfMethod, "getSNIMatchers");
    setSNIMatchers = ReflectionUtil.findMethod(arrayOfMethod, "setSNIMatchers");
    getUseCipherSuitesOrder = ReflectionUtil.findMethod(arrayOfMethod, "getUseCipherSuitesOrder");
    setUseCipherSuitesOrder = ReflectionUtil.findMethod(arrayOfMethod, "setUseCipherSuitesOrder");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\SSLParametersUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */