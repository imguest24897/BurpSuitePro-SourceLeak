package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsKeyExchange;
import org.bouncycastle.tls.TlsKeyExchangeFactory;
import org.bouncycastle.tls.TlsPSKIdentity;
import org.bouncycastle.tls.TlsPSKIdentityManager;
import org.bouncycastle.tls.TlsSRPConfigVerifier;
import org.bouncycastle.tls.TlsSRPIdentity;
import org.bouncycastle.tls.TlsSRPLoginParameters;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

public abstract class AbstractTlsKeyExchangeFactory implements TlsKeyExchangeFactory {
  public TlsKeyExchange createDHKeyExchange(int paramInt) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createDHanonKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createDHanonKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createDHEKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createDHEKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createECDHKeyExchange(int paramInt) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createECDHanonKeyExchangeClient(int paramInt) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createECDHanonKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createECDHEKeyExchangeClient(int paramInt) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createECDHEKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createPSKKeyExchangeClient(int paramInt, TlsPSKIdentity paramTlsPSKIdentity, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createPSKKeyExchangeServer(int paramInt, TlsPSKIdentityManager paramTlsPSKIdentityManager, TlsDHConfig paramTlsDHConfig, TlsECConfig paramTlsECConfig) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createRSAKeyExchange(int paramInt) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createSRPKeyExchangeClient(int paramInt, TlsSRPIdentity paramTlsSRPIdentity, TlsSRPConfigVerifier paramTlsSRPConfigVerifier) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public TlsKeyExchange createSRPKeyExchangeServer(int paramInt, TlsSRPLoginParameters paramTlsSRPLoginParameters) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\AbstractTlsKeyExchangeFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */