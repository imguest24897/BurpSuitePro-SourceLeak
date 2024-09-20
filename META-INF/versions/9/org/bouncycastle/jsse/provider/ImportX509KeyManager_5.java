package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.provider.ImportX509KeyManager;
import org.bouncycastle.jsse.provider.ProvX509Key;
import org.bouncycastle.jsse.provider.TransportData;

final class ImportX509KeyManager_5 extends BCX509ExtendedKeyManager implements ImportX509KeyManager {
  final X509ExtendedKeyManager x509KeyManager;
  
  ImportX509KeyManager_5(X509ExtendedKeyManager paramX509ExtendedKeyManager) {
    this.x509KeyManager = paramX509ExtendedKeyManager;
  }
  
  public X509KeyManager unwrap() {
    return this.x509KeyManager;
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return this.x509KeyManager.chooseClientAlias(paramArrayOfString, paramArrayOfPrincipal, paramSocket);
  }
  
  public String chooseEngineClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return this.x509KeyManager.chooseEngineClientAlias(paramArrayOfString, paramArrayOfPrincipal, paramSSLEngine);
  }
  
  public String chooseEngineServerAlias(String paramString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    return this.x509KeyManager.chooseEngineServerAlias(paramString, paramArrayOfPrincipal, paramSSLEngine);
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return this.x509KeyManager.chooseServerAlias(paramString, paramArrayOfPrincipal, paramSocket);
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    return this.x509KeyManager.getCertificateChain(paramString);
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return this.x509KeyManager.getClientAliases(paramString, paramArrayOfPrincipal);
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    return this.x509KeyManager.getPrivateKey(paramString);
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return this.x509KeyManager.getServerAliases(paramString, paramArrayOfPrincipal);
  }
  
  protected BCX509Key getKeyBC(String paramString1, String paramString2) {
    return (BCX509Key)ProvX509Key.from(this.x509KeyManager, paramString1, paramString2);
  }
  
  protected BCX509Key validateKeyBC(boolean paramBoolean, String paramString1, String paramString2, Socket paramSocket) {
    return (BCX509Key)ProvX509Key.validate(this.x509KeyManager, paramBoolean, paramString1, paramString2, TransportData.from(paramSocket));
  }
  
  protected BCX509Key validateKeyBC(boolean paramBoolean, String paramString1, String paramString2, SSLEngine paramSSLEngine) {
    return (BCX509Key)ProvX509Key.validate(this.x509KeyManager, paramBoolean, paramString1, paramString2, TransportData.from(paramSSLEngine));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ImportX509KeyManager_5.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */