package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsKeyExchange;
import org.bouncycastle.tls.TlsPSKIdentity;
import org.bouncycastle.tls.TlsPSKIdentityManager;
import org.bouncycastle.tls.TlsSRPConfigVerifier;
import org.bouncycastle.tls.TlsSRPIdentity;
import org.bouncycastle.tls.TlsSRPLoginParameters;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

public interface TlsKeyExchangeFactory {
  TlsKeyExchange createDHKeyExchange(int paramInt) throws IOException;
  
  TlsKeyExchange createDHanonKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException;
  
  TlsKeyExchange createDHanonKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException;
  
  TlsKeyExchange createDHEKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException;
  
  TlsKeyExchange createDHEKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException;
  
  TlsKeyExchange createECDHKeyExchange(int paramInt) throws IOException;
  
  TlsKeyExchange createECDHanonKeyExchangeClient(int paramInt) throws IOException;
  
  TlsKeyExchange createECDHanonKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException;
  
  TlsKeyExchange createECDHEKeyExchangeClient(int paramInt) throws IOException;
  
  TlsKeyExchange createECDHEKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException;
  
  TlsKeyExchange createPSKKeyExchangeClient(int paramInt, TlsPSKIdentity paramTlsPSKIdentity, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException;
  
  TlsKeyExchange createPSKKeyExchangeServer(int paramInt, TlsPSKIdentityManager paramTlsPSKIdentityManager, TlsDHConfig paramTlsDHConfig, TlsECConfig paramTlsECConfig) throws IOException;
  
  TlsKeyExchange createRSAKeyExchange(int paramInt) throws IOException;
  
  TlsKeyExchange createSRPKeyExchangeClient(int paramInt, TlsSRPIdentity paramTlsSRPIdentity, TlsSRPConfigVerifier paramTlsSRPConfigVerifier) throws IOException;
  
  TlsKeyExchange createSRPKeyExchangeServer(int paramInt, TlsSRPLoginParameters paramTlsSRPLoginParameters) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsKeyExchangeFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */