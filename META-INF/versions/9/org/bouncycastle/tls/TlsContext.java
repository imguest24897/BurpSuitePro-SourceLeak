package META-INF.versions.9.org.bouncycastle.tls;

import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsSession;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;

public interface TlsContext {
  TlsCrypto getCrypto();
  
  TlsNonceGenerator getNonceGenerator();
  
  SecurityParameters getSecurityParameters();
  
  SecurityParameters getSecurityParametersConnection();
  
  SecurityParameters getSecurityParametersHandshake();
  
  boolean isServer();
  
  ProtocolVersion[] getClientSupportedVersions();
  
  ProtocolVersion getClientVersion();
  
  ProtocolVersion getRSAPreMasterSecretVersion();
  
  ProtocolVersion getServerVersion();
  
  TlsSession getResumableSession();
  
  TlsSession getSession();
  
  Object getUserObject();
  
  void setUserObject(Object paramObject);
  
  byte[] exportChannelBinding(int paramInt);
  
  byte[] exportEarlyKeyingMaterial(String paramString, byte[] paramArrayOfbyte, int paramInt);
  
  byte[] exportKeyingMaterial(String paramString, byte[] paramArrayOfbyte, int paramInt);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsContext.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */