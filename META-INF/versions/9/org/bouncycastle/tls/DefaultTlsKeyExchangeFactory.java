package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.AbstractTlsKeyExchangeFactory;
import org.bouncycastle.tls.TlsDHEKeyExchange;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsDHKeyExchange;
import org.bouncycastle.tls.TlsDHanonKeyExchange;
import org.bouncycastle.tls.TlsECDHEKeyExchange;
import org.bouncycastle.tls.TlsECDHKeyExchange;
import org.bouncycastle.tls.TlsECDHanonKeyExchange;
import org.bouncycastle.tls.TlsKeyExchange;
import org.bouncycastle.tls.TlsPSKIdentity;
import org.bouncycastle.tls.TlsPSKIdentityManager;
import org.bouncycastle.tls.TlsPSKKeyExchange;
import org.bouncycastle.tls.TlsRSAKeyExchange;
import org.bouncycastle.tls.TlsSRPConfigVerifier;
import org.bouncycastle.tls.TlsSRPIdentity;
import org.bouncycastle.tls.TlsSRPKeyExchange;
import org.bouncycastle.tls.TlsSRPLoginParameters;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

public class DefaultTlsKeyExchangeFactory extends AbstractTlsKeyExchangeFactory {
  public TlsKeyExchange createDHKeyExchange(int paramInt) throws IOException {
    return (TlsKeyExchange)new TlsDHKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createDHanonKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    return (TlsKeyExchange)new TlsDHanonKeyExchange(paramInt, paramTlsDHGroupVerifier);
  }
  
  public TlsKeyExchange createDHanonKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException {
    return (TlsKeyExchange)new TlsDHanonKeyExchange(paramInt, paramTlsDHConfig);
  }
  
  public TlsKeyExchange createDHEKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    return (TlsKeyExchange)new TlsDHEKeyExchange(paramInt, paramTlsDHGroupVerifier);
  }
  
  public TlsKeyExchange createDHEKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException {
    return (TlsKeyExchange)new TlsDHEKeyExchange(paramInt, paramTlsDHConfig);
  }
  
  public TlsKeyExchange createECDHKeyExchange(int paramInt) throws IOException {
    return (TlsKeyExchange)new TlsECDHKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createECDHanonKeyExchangeClient(int paramInt) throws IOException {
    return (TlsKeyExchange)new TlsECDHanonKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createECDHanonKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException {
    return (TlsKeyExchange)new TlsECDHanonKeyExchange(paramInt, paramTlsECConfig);
  }
  
  public TlsKeyExchange createECDHEKeyExchangeClient(int paramInt) throws IOException {
    return (TlsKeyExchange)new TlsECDHEKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createECDHEKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException {
    return (TlsKeyExchange)new TlsECDHEKeyExchange(paramInt, paramTlsECConfig);
  }
  
  public TlsKeyExchange createPSKKeyExchangeClient(int paramInt, TlsPSKIdentity paramTlsPSKIdentity, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    return (TlsKeyExchange)new TlsPSKKeyExchange(paramInt, paramTlsPSKIdentity, paramTlsDHGroupVerifier);
  }
  
  public TlsKeyExchange createPSKKeyExchangeServer(int paramInt, TlsPSKIdentityManager paramTlsPSKIdentityManager, TlsDHConfig paramTlsDHConfig, TlsECConfig paramTlsECConfig) throws IOException {
    return (TlsKeyExchange)new TlsPSKKeyExchange(paramInt, paramTlsPSKIdentityManager, paramTlsDHConfig, paramTlsECConfig);
  }
  
  public TlsKeyExchange createRSAKeyExchange(int paramInt) throws IOException {
    return (TlsKeyExchange)new TlsRSAKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createSRPKeyExchangeClient(int paramInt, TlsSRPIdentity paramTlsSRPIdentity, TlsSRPConfigVerifier paramTlsSRPConfigVerifier) throws IOException {
    return (TlsKeyExchange)new TlsSRPKeyExchange(paramInt, paramTlsSRPIdentity, paramTlsSRPConfigVerifier);
  }
  
  public TlsKeyExchange createSRPKeyExchangeServer(int paramInt, TlsSRPLoginParameters paramTlsSRPLoginParameters) throws IOException {
    return (TlsKeyExchange)new TlsSRPKeyExchange(paramInt, paramTlsSRPLoginParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\DefaultTlsKeyExchangeFactory.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */