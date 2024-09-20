package burp;

import java.net.Socket;
import java.security.KeyStore;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509KeyManager;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zlh9 implements X509KeyManager {
  private final KeyStore Zx;
  
  private final String Zq;
  
  private final char[] Zc;
  
  private final X509Certificate ZT;
  
  private final String[] ZQ;
  
  Zlh9(KeyStore paramKeyStore, String paramString, char[] paramArrayOfchar, X509Certificate paramX509Certificate) {
    this.Zx = paramKeyStore;
    this.Zq = paramString;
    this.Zc = paramArrayOfchar;
    this.ZT = paramX509Certificate;
    this.ZQ = new String[] { paramString };
  }
  
  public String chooseClientAlias(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return this.Zq;
  }
  
  public String chooseServerAlias(String paramString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    return this.Zq;
  }
  
  public X509Certificate[] getCertificateChain(String paramString) {
    String str = Zgkj.ZV();
    try {
      Certificate[] arrayOfCertificate = this.Zx.getCertificateChain(paramString);
      if (arrayOfCertificate == null)
        return null; 
      try {
      
      } catch (ProviderException providerException) {
        throw a(null);
      } 
      boolean bool = (this.ZT != null) ? true : false;
      try {
      
      } catch (ProviderException providerException) {
        throw a(null);
      } 
      int i = bool ? (arrayOfCertificate.length + 1) : arrayOfCertificate.length;
      X509Certificate[] arrayOfX509Certificate = new X509Certificate[i];
      byte b = 0;
      while (b < arrayOfCertificate.length) {
        arrayOfX509Certificate[b] = (X509Certificate)arrayOfCertificate[b];
        b++;
        if (str != null)
          break; 
      } 
      try {
        if (bool)
          arrayOfX509Certificate[arrayOfCertificate.length] = this.ZT; 
      } catch (ProviderException providerException) {
        throw a(null);
      } 
      return arrayOfX509Certificate;
    } catch (ProviderException providerException) {
      Zah.Zl(providerException, Zk_.COMMON_RUNTIME_FAILURE);
      return null;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public String[] getClientAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return this.ZQ;
  }
  
  public PrivateKey getPrivateKey(String paramString) {
    try {
      return (PrivateKey)this.Zx.getKey(paramString, this.Zc);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  public String[] getServerAliases(String paramString, Principal[] paramArrayOfPrincipal) {
    return this.ZQ;
  }
  
  private static ProviderException a(ProviderException paramProviderException) {
    return paramProviderException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlh9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */