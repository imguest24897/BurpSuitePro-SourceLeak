package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.List;
import java.util.Vector;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.provider.NamedGroupInfo;
import org.bouncycastle.jsse.provider.ProvSSLContextSpi;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.jsse.provider.SignatureSchemeInfo;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

final class ContextData {
  private final ProvSSLContextSpi context;
  
  private final JcaTlsCrypto crypto;
  
  private final BCX509ExtendedKeyManager x509KeyManager;
  
  private final BCX509ExtendedTrustManager x509TrustManager;
  
  private final ProvSSLSessionContext clientSessionContext;
  
  private final ProvSSLSessionContext serverSessionContext;
  
  private final NamedGroupInfo.PerContext namedGroups;
  
  private final SignatureSchemeInfo.PerContext signatureSchemes;
  
  ContextData(ProvSSLContextSpi paramProvSSLContextSpi, JcaTlsCrypto paramJcaTlsCrypto, BCX509ExtendedKeyManager paramBCX509ExtendedKeyManager, BCX509ExtendedTrustManager paramBCX509ExtendedTrustManager) {
    this.context = paramProvSSLContextSpi;
    this.crypto = paramJcaTlsCrypto;
    this.x509KeyManager = paramBCX509ExtendedKeyManager;
    this.x509TrustManager = paramBCX509ExtendedTrustManager;
    this.clientSessionContext = new ProvSSLSessionContext(this);
    this.serverSessionContext = new ProvSSLSessionContext(this);
    this.namedGroups = NamedGroupInfo.createPerContext(paramProvSSLContextSpi.isFips(), paramJcaTlsCrypto);
    this.signatureSchemes = SignatureSchemeInfo.createPerContext(paramProvSSLContextSpi.isFips(), paramJcaTlsCrypto, this.namedGroups);
  }
  
  NamedGroupInfo.PerConnection getNamedGroupsClient(ProvSSLParameters paramProvSSLParameters, ProtocolVersion[] paramArrayOfProtocolVersion) {
    return NamedGroupInfo.createPerConnectionClient(this.namedGroups, paramProvSSLParameters, paramArrayOfProtocolVersion);
  }
  
  NamedGroupInfo.PerConnection getNamedGroupsServer(ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion) {
    return NamedGroupInfo.createPerConnectionServer(this.namedGroups, paramProvSSLParameters, paramProtocolVersion);
  }
  
  SignatureSchemeInfo.PerConnection getSignatureSchemesClient(ProvSSLParameters paramProvSSLParameters, ProtocolVersion[] paramArrayOfProtocolVersion, NamedGroupInfo.PerConnection paramPerConnection) {
    return SignatureSchemeInfo.createPerConnectionClient(this.signatureSchemes, paramProvSSLParameters, paramArrayOfProtocolVersion, paramPerConnection);
  }
  
  SignatureSchemeInfo.PerConnection getSignatureSchemesServer(ProvSSLParameters paramProvSSLParameters, ProtocolVersion paramProtocolVersion, NamedGroupInfo.PerConnection paramPerConnection) {
    return SignatureSchemeInfo.createPerConnectionServer(this.signatureSchemes, paramProvSSLParameters, paramProtocolVersion, paramPerConnection);
  }
  
  ProvSSLContextSpi getContext() {
    return this.context;
  }
  
  JcaTlsCrypto getCrypto() {
    return this.crypto;
  }
  
  ProvSSLSessionContext getClientSessionContext() {
    return this.clientSessionContext;
  }
  
  ProvSSLSessionContext getServerSessionContext() {
    return this.serverSessionContext;
  }
  
  List<SignatureSchemeInfo> getSignatureSchemes(Vector<SignatureAndHashAlgorithm> paramVector) {
    return SignatureSchemeInfo.getSignatureSchemes(this.signatureSchemes, paramVector);
  }
  
  BCX509ExtendedKeyManager getX509KeyManager() {
    return this.x509KeyManager;
  }
  
  BCX509ExtendedTrustManager getX509TrustManager() {
    return this.x509TrustManager;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ContextData.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */