package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.ProvAlgorithmConstraints;
import org.bouncycastle.jsse.provider.SSLEngineUtil;
import org.bouncycastle.jsse.provider.SSLSocketUtil;

class TransportData {
  private final BCSSLParameters parameters;
  
  private final BCExtendedSSLSession handshakeSession;
  
  static org.bouncycastle.jsse.provider.TransportData from(Socket paramSocket) {
    if (!(paramSocket instanceof SSLSocket) || !paramSocket.isConnected())
      return null; 
    SSLSocket sSLSocket = (SSLSocket)paramSocket;
    BCSSLParameters bCSSLParameters = SSLSocketUtil.importSSLParameters(sSLSocket);
    if (null == bCSSLParameters)
      return null; 
    BCExtendedSSLSession bCExtendedSSLSession = SSLSocketUtil.importHandshakeSession(sSLSocket);
    return new org.bouncycastle.jsse.provider.TransportData(bCSSLParameters, bCExtendedSSLSession);
  }
  
  static org.bouncycastle.jsse.provider.TransportData from(SSLEngine paramSSLEngine) {
    if (null == paramSSLEngine)
      return null; 
    BCSSLParameters bCSSLParameters = SSLEngineUtil.importSSLParameters(paramSSLEngine);
    if (null == bCSSLParameters)
      return null; 
    BCExtendedSSLSession bCExtendedSSLSession = SSLEngineUtil.importHandshakeSession(paramSSLEngine);
    return new org.bouncycastle.jsse.provider.TransportData(bCSSLParameters, bCExtendedSSLSession);
  }
  
  static BCAlgorithmConstraints getAlgorithmConstraints(org.bouncycastle.jsse.provider.TransportData paramTransportData, boolean paramBoolean) {
    return (null == paramTransportData) ? (BCAlgorithmConstraints)ProvAlgorithmConstraints.DEFAULT : paramTransportData.getAlgorithmConstraints(paramBoolean);
  }
  
  static List<byte[]> getStatusResponses(org.bouncycastle.jsse.provider.TransportData paramTransportData) {
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
        return (BCAlgorithmConstraints)new ProvAlgorithmConstraints(bCAlgorithmConstraints, arrayOfString, true); 
    } 
    return (null == bCAlgorithmConstraints) ? (BCAlgorithmConstraints)ProvAlgorithmConstraints.DEFAULT : (BCAlgorithmConstraints)new ProvAlgorithmConstraints(bCAlgorithmConstraints, true);
  }
  
  List<byte[]> getStatusResponses() {
    return (null == this.handshakeSession) ? (List)Collections.<byte[]>emptyList() : this.handshakeSession.getStatusResponses();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\TransportData.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */