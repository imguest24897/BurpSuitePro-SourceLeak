package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCSNIMatcher;
import org.bouncycastle.jsse.BCSNIServerName;
import org.bouncycastle.jsse.java.security.BCAlgorithmConstraints;
import org.bouncycastle.jsse.provider.ProvAlgorithmConstraints;
import org.bouncycastle.jsse.provider.ProvSSLContextSpi;
import org.bouncycastle.jsse.provider.ProvSSLSession;
import org.bouncycastle.tls.TlsUtils;

final class ProvSSLParameters {
  private final ProvSSLContextSpi context;
  
  private String[] cipherSuites;
  
  private String[] protocols;
  
  private boolean wantClientAuth = false;
  
  private boolean needClientAuth = false;
  
  private String endpointIdentificationAlgorithm;
  
  private BCAlgorithmConstraints algorithmConstraints = (BCAlgorithmConstraints)ProvAlgorithmConstraints.DEFAULT;
  
  private List<BCSNIServerName> sniServerNames;
  
  private List<BCSNIMatcher> sniMatchers;
  
  private boolean useCipherSuitesOrder = true;
  
  private boolean enableRetransmissions = true;
  
  private int maximumPacketSize = 0;
  
  private String[] applicationProtocols = TlsUtils.EMPTY_STRINGS;
  
  private String[] signatureSchemes = null;
  
  private String[] namedGroups = null;
  
  private BCApplicationProtocolSelector<SSLEngine> engineAPSelector;
  
  private BCApplicationProtocolSelector<SSLSocket> socketAPSelector;
  
  private ProvSSLSession sessionToResume;
  
  private static <T> List<T> copyList(Collection<T> paramCollection) {
    return (paramCollection == null) ? null : (paramCollection.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList<>(paramCollection)));
  }
  
  ProvSSLParameters(ProvSSLContextSpi paramProvSSLContextSpi, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    this.context = paramProvSSLContextSpi;
    this.cipherSuites = paramArrayOfString1;
    this.protocols = paramArrayOfString2;
  }
  
  org.bouncycastle.jsse.provider.ProvSSLParameters copy() {
    org.bouncycastle.jsse.provider.ProvSSLParameters provSSLParameters = new org.bouncycastle.jsse.provider.ProvSSLParameters(this.context, this.cipherSuites, this.protocols);
    provSSLParameters.wantClientAuth = this.wantClientAuth;
    provSSLParameters.needClientAuth = this.needClientAuth;
    provSSLParameters.endpointIdentificationAlgorithm = this.endpointIdentificationAlgorithm;
    provSSLParameters.algorithmConstraints = this.algorithmConstraints;
    provSSLParameters.sniServerNames = this.sniServerNames;
    provSSLParameters.sniMatchers = this.sniMatchers;
    provSSLParameters.useCipherSuitesOrder = this.useCipherSuitesOrder;
    provSSLParameters.enableRetransmissions = this.enableRetransmissions;
    provSSLParameters.maximumPacketSize = this.maximumPacketSize;
    provSSLParameters.applicationProtocols = this.applicationProtocols;
    provSSLParameters.signatureSchemes = this.signatureSchemes;
    provSSLParameters.namedGroups = this.namedGroups;
    provSSLParameters.engineAPSelector = this.engineAPSelector;
    provSSLParameters.socketAPSelector = this.socketAPSelector;
    provSSLParameters.sessionToResume = this.sessionToResume;
    return provSSLParameters;
  }
  
  org.bouncycastle.jsse.provider.ProvSSLParameters copyForConnection() {
    org.bouncycastle.jsse.provider.ProvSSLParameters provSSLParameters = copy();
    if (ProvAlgorithmConstraints.DEFAULT != provSSLParameters.algorithmConstraints)
      provSSLParameters.algorithmConstraints = (BCAlgorithmConstraints)new ProvAlgorithmConstraints(provSSLParameters.algorithmConstraints, true); 
    return provSSLParameters;
  }
  
  public String[] getCipherSuites() {
    return (String[])this.cipherSuites.clone();
  }
  
  String[] getCipherSuitesArray() {
    return this.cipherSuites;
  }
  
  public void setCipherSuites(String[] paramArrayOfString) {
    this.cipherSuites = this.context.getSupportedCipherSuites(paramArrayOfString);
  }
  
  void setCipherSuitesArray(String[] paramArrayOfString) {
    this.cipherSuites = paramArrayOfString;
  }
  
  public String[] getProtocols() {
    return (String[])this.protocols.clone();
  }
  
  String[] getProtocolsArray() {
    return this.protocols;
  }
  
  public void setProtocols(String[] paramArrayOfString) {
    if (!this.context.isSupportedProtocols(paramArrayOfString))
      throw new IllegalArgumentException("'protocols' cannot be null, or contain unsupported protocols"); 
    this.protocols = (String[])paramArrayOfString.clone();
  }
  
  void setProtocolsArray(String[] paramArrayOfString) {
    this.protocols = paramArrayOfString;
  }
  
  public boolean getWantClientAuth() {
    return this.wantClientAuth;
  }
  
  public void setWantClientAuth(boolean paramBoolean) {
    this.needClientAuth = false;
    this.wantClientAuth = paramBoolean;
  }
  
  public boolean getNeedClientAuth() {
    return this.needClientAuth;
  }
  
  public void setNeedClientAuth(boolean paramBoolean) {
    this.needClientAuth = paramBoolean;
    this.wantClientAuth = false;
  }
  
  public String getEndpointIdentificationAlgorithm() {
    return this.endpointIdentificationAlgorithm;
  }
  
  public void setEndpointIdentificationAlgorithm(String paramString) {
    this.endpointIdentificationAlgorithm = paramString;
  }
  
  public BCAlgorithmConstraints getAlgorithmConstraints() {
    return this.algorithmConstraints;
  }
  
  public void setAlgorithmConstraints(BCAlgorithmConstraints paramBCAlgorithmConstraints) {
    this.algorithmConstraints = paramBCAlgorithmConstraints;
  }
  
  public List<BCSNIServerName> getServerNames() {
    return copyList(this.sniServerNames);
  }
  
  public void setServerNames(List<BCSNIServerName> paramList) {
    this.sniServerNames = copyList(paramList);
  }
  
  public Collection<BCSNIMatcher> getSNIMatchers() {
    return copyList(this.sniMatchers);
  }
  
  public void setSNIMatchers(Collection<BCSNIMatcher> paramCollection) {
    this.sniMatchers = copyList(paramCollection);
  }
  
  public boolean getUseCipherSuitesOrder() {
    return this.useCipherSuitesOrder;
  }
  
  public void setUseCipherSuitesOrder(boolean paramBoolean) {
    this.useCipherSuitesOrder = paramBoolean;
  }
  
  public boolean getEnableRetransmissions() {
    return this.enableRetransmissions;
  }
  
  public void setEnableRetransmissions(boolean paramBoolean) {
    this.enableRetransmissions = paramBoolean;
  }
  
  public int getMaximumPacketSize() {
    return this.maximumPacketSize;
  }
  
  public void setMaximumPacketSize(int paramInt) {
    if (paramInt < 0)
      throw new IllegalArgumentException("The maximum packet size cannot be negative"); 
    this.maximumPacketSize = paramInt;
  }
  
  public String[] getApplicationProtocols() {
    return (String[])this.applicationProtocols.clone();
  }
  
  public void setApplicationProtocols(String[] paramArrayOfString) {
    this.applicationProtocols = (String[])paramArrayOfString.clone();
  }
  
  public String[] getSignatureSchemes() {
    return TlsUtils.clone(this.signatureSchemes);
  }
  
  public void setSignatureSchemes(String[] paramArrayOfString) {
    this.signatureSchemes = TlsUtils.clone(paramArrayOfString);
  }
  
  public String[] getNamedGroups() {
    return TlsUtils.clone(this.namedGroups);
  }
  
  public void setNamedGroups(String[] paramArrayOfString) {
    this.namedGroups = TlsUtils.clone(paramArrayOfString);
  }
  
  public BCApplicationProtocolSelector<SSLEngine> getEngineAPSelector() {
    return this.engineAPSelector;
  }
  
  public void setEngineAPSelector(BCApplicationProtocolSelector<SSLEngine> paramBCApplicationProtocolSelector) {
    this.engineAPSelector = paramBCApplicationProtocolSelector;
  }
  
  public BCApplicationProtocolSelector<SSLSocket> getSocketAPSelector() {
    return this.socketAPSelector;
  }
  
  public void setSocketAPSelector(BCApplicationProtocolSelector<SSLSocket> paramBCApplicationProtocolSelector) {
    this.socketAPSelector = paramBCApplicationProtocolSelector;
  }
  
  public ProvSSLSession getSessionToResume() {
    return this.sessionToResume;
  }
  
  public void setSessionToResume(ProvSSLSession paramProvSSLSession) {
    this.sessionToResume = paramProvSSLSession;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */