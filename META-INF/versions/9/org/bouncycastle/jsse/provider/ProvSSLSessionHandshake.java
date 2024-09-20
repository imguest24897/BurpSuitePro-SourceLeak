package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.provider.JsseSecurityParameters;
import org.bouncycastle.jsse.provider.JsseSessionParameters;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.ProvSSLSessionBase;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;

class ProvSSLSessionHandshake extends ProvSSLSessionBase {
  protected final SecurityParameters securityParameters;
  
  protected final JsseSecurityParameters jsseSecurityParameters;
  
  ProvSSLSessionHandshake(ProvSSLSessionContext paramProvSSLSessionContext, String paramString, int paramInt, SecurityParameters paramSecurityParameters, JsseSecurityParameters paramJsseSecurityParameters) {
    super(paramProvSSLSessionContext, paramString, paramInt);
    this.securityParameters = paramSecurityParameters;
    this.jsseSecurityParameters = paramJsseSecurityParameters;
  }
  
  String getApplicationProtocol() {
    return JsseUtils.getApplicationProtocol(this.securityParameters);
  }
  
  protected int getCipherSuiteTLS() {
    return this.securityParameters.getCipherSuite();
  }
  
  protected byte[] getIDArray() {
    return this.securityParameters.getSessionID();
  }
  
  protected JsseSecurityParameters getJsseSecurityParameters() {
    return this.jsseSecurityParameters;
  }
  
  protected JsseSessionParameters getJsseSessionParameters() {
    return null;
  }
  
  protected Certificate getLocalCertificateTLS() {
    return this.securityParameters.getLocalCertificate();
  }
  
  public String[] getLocalSupportedSignatureAlgorithms() {
    return this.jsseSecurityParameters.signatureSchemes.getLocalJcaSignatureAlgorithms();
  }
  
  public String[] getLocalSupportedSignatureAlgorithmsBC() {
    return this.jsseSecurityParameters.signatureSchemes.getLocalJcaSignatureAlgorithmsBC();
  }
  
  protected Certificate getPeerCertificateTLS() {
    return this.securityParameters.getPeerCertificate();
  }
  
  public String[] getPeerSupportedSignatureAlgorithms() {
    return this.jsseSecurityParameters.signatureSchemes.getPeerJcaSignatureAlgorithms();
  }
  
  public String[] getPeerSupportedSignatureAlgorithmsBC() {
    return this.jsseSecurityParameters.signatureSchemes.getPeerJcaSignatureAlgorithmsBC();
  }
  
  protected ProtocolVersion getProtocolTLS() {
    return this.securityParameters.getNegotiatedVersion();
  }
  
  public List<BCSNIServerName> getRequestedServerNames() {
    Vector vector = this.securityParameters.getClientServerNames();
    return JsseUtils.convertSNIServerNames(vector);
  }
  
  public List<byte[]> getStatusResponses() {
    List list = this.jsseSecurityParameters.statusResponses;
    if (null == list || list.isEmpty())
      return (List)Collections.emptyList(); 
    ArrayList<byte[]> arrayList = new ArrayList(list.size());
    for (byte[] arrayOfByte : list)
      arrayList.add((byte[])arrayOfByte.clone()); 
    return (List)Collections.unmodifiableList(arrayList);
  }
  
  protected void invalidateTLS() {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSessionHandshake.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */