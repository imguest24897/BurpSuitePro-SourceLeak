package org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;

class TransportData {
  private final BCSSLParameters parameters;
  
  private final BCExtendedSSLSession handshakeSession;
  
  static TransportData from(Socket paramSocket) {
    if (!(paramSocket instanceof SSLSocket) || !paramSocket.isConnected())
      return null; 
    SSLSocket sSLSocket = (SSLSocket)paramSocket;
    BCSSLParameters bCSSLParameters = SSLSocketUtil.importSSLParameters(sSLSocket);
    if (null == bCSSLParameters)
      return null; 
    BCExtendedSSLSession bCExtendedSSLSession = SSLSocketUtil.importHandshakeSession(sSLSocket);
    return new TransportData(bCSSLParameters, bCExtendedSSLSession);
  }
  
  static TransportData from(SSLEngine paramSSLEngine) {
    if (null == paramSSLEngine)
      return null; 
    BCSSLParameters bCSSLParameters = SSLEngineUtil.importSSLParameters(paramSSLEngine);
    if (null == bCSSLParameters)
      return null; 
    BCExtendedSSLSession bCExtendedSSLSession = SSLEngineUtil.importHandshakeSession(paramSSLEngine);
    return new TransportData(bCSSLParameters, bCExtendedSSLSession);
  }
  
  static BCAlgorithmConstraints getAlgorithmConstraints(TransportData paramTransportData, boolean paramBoolean) {
    return (null == paramTransportData) ? ProvAlgorithmConstraints.DEFAULT : paramTransportData.getAlgorithmConstraints(paramBoolean);
  }
  
  static List<byte[]> getStatusResponses(TransportData paramTransportData) {
    return (null == paramTransportData) ? (List)Collections.<byte[]>emptyList() : paramTransportData.getStatusResponses();
  }
  
  private TransportData(BCSSLParameters paramBCSSLParameters, BCExtendedSSLSession paramBCExtendedSSLSession) {
    this.parameters = paramBCSSLParameters;
    this.handshakeSession = paramBCExtendedSSLSession;
  }
  
  BCSSLParameters getParameters() {
    return this.parameters;
  }
  
  BCExtendedSSLSession getHandshakeSession() {
    return this.handshakeSession;
  }
  
  BCAlgorithmConstraints getAlgorithmConstraints(boolean paramBoolean) {
    BCAlgorithmConstraints bCAlgorithmConstraints = this.parameters.getAlgorithmConstraints();
    if (ProvAlgorithmConstraints.DEFAULT == bCAlgorithmConstraints)
      bCAlgorithmConstraints = null; 
    if (null != this.handshakeSession && JsseUtils.isTLSv12(this.handshakeSession.getProtocol())) {
      String[] arrayOfString = paramBoolean ? this.handshakeSession.getPeerSupportedSignatureAlgorithmsBC() : this.handshakeSession.getLocalSupportedSignatureAlgorithmsBC();
      if (null != arrayOfString)
        return new ProvAlgorithmConstraints(bCAlgorithmConstraints, arrayOfString, true); 
    } 
    return (null == bCAlgorithmConstraints) ? ProvAlgorithmConstraints.DEFAULT : new ProvAlgorithmConstraints(bCAlgorithmConstraints, true);
  }
  
  List<byte[]> getStatusResponses() {
    return (null == this.handshakeSession) ? (List)Collections.<byte[]>emptyList() : this.handshakeSession.getStatusResponses();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\TransportData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */