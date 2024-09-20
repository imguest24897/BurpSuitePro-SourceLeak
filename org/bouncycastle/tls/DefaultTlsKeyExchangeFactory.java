package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;

public class DefaultTlsKeyExchangeFactory extends AbstractTlsKeyExchangeFactory {
  public TlsKeyExchange createDHKeyExchange(int paramInt) throws IOException {
    return new TlsDHKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createDHanonKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    return new TlsDHanonKeyExchange(paramInt, paramTlsDHGroupVerifier);
  }
  
  public TlsKeyExchange createDHanonKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException {
    return new TlsDHanonKeyExchange(paramInt, paramTlsDHConfig);
  }
  
  public TlsKeyExchange createDHEKeyExchangeClient(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    return new TlsDHEKeyExchange(paramInt, paramTlsDHGroupVerifier);
  }
  
  public TlsKeyExchange createDHEKeyExchangeServer(int paramInt, TlsDHConfig paramTlsDHConfig) throws IOException {
    return new TlsDHEKeyExchange(paramInt, paramTlsDHConfig);
  }
  
  public TlsKeyExchange createECDHKeyExchange(int paramInt) throws IOException {
    return new TlsECDHKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createECDHanonKeyExchangeClient(int paramInt) throws IOException {
    return new TlsECDHanonKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createECDHanonKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException {
    return new TlsECDHanonKeyExchange(paramInt, paramTlsECConfig);
  }
  
  public TlsKeyExchange createECDHEKeyExchangeClient(int paramInt) throws IOException {
    return new TlsECDHEKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createECDHEKeyExchangeServer(int paramInt, TlsECConfig paramTlsECConfig) throws IOException {
    return new TlsECDHEKeyExchange(paramInt, paramTlsECConfig);
  }
  
  public TlsKeyExchange createPSKKeyExchangeClient(int paramInt, TlsPSKIdentity paramTlsPSKIdentity, TlsDHGroupVerifier paramTlsDHGroupVerifier) throws IOException {
    return new TlsPSKKeyExchange(paramInt, paramTlsPSKIdentity, paramTlsDHGroupVerifier);
  }
  
  public TlsKeyExchange createPSKKeyExchangeServer(int paramInt, TlsPSKIdentityManager paramTlsPSKIdentityManager, TlsDHConfig paramTlsDHConfig, TlsECConfig paramTlsECConfig) throws IOException {
    return new TlsPSKKeyExchange(paramInt, paramTlsPSKIdentityManager, paramTlsDHConfig, paramTlsECConfig);
  }
  
  public TlsKeyExchange createRSAKeyExchange(int paramInt) throws IOException {
    return new TlsRSAKeyExchange(paramInt);
  }
  
  public TlsKeyExchange createSRPKeyExchangeClient(int paramInt, TlsSRPIdentity paramTlsSRPIdentity, TlsSRPConfigVerifier paramTlsSRPConfigVerifier) throws IOException {
    return new TlsSRPKeyExchange(paramInt, paramTlsSRPIdentity, paramTlsSRPConfigVerifier);
  }
  
  public TlsKeyExchange createSRPKeyExchangeServer(int paramInt, TlsSRPLoginParameters paramTlsSRPLoginParameters) throws IOException {
    return new TlsSRPKeyExchange(paramInt, paramTlsSRPLoginParameters);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsKeyExchangeFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */