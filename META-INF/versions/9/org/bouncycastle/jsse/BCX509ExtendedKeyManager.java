package META-INF.versions.9.org.bouncycastle.jsse;

import java.net.Socket;
import java.security.Principal;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedKeyManager;
import org.bouncycastle.jsse.BCX509Key;

public abstract class BCX509ExtendedKeyManager extends X509ExtendedKeyManager {
  public BCX509Key chooseClientKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    if (null != paramArrayOfString)
      for (String str1 : paramArrayOfString) {
        String str2 = chooseClientAlias(new String[] { str1 }, paramArrayOfPrincipal, paramSocket);
        if (null != str2) {
          BCX509Key bCX509Key = validateKeyBC(false, str1, str2, paramSocket);
          if (null != bCX509Key)
            return bCX509Key; 
        } 
      }  
    return null;
  }
  
  public BCX509Key chooseEngineClientKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    if (null != paramArrayOfString)
      for (String str1 : paramArrayOfString) {
        String str2 = chooseEngineClientAlias(new String[] { str1 }, paramArrayOfPrincipal, paramSSLEngine);
        if (null != str2) {
          BCX509Key bCX509Key = validateKeyBC(false, str1, str2, paramSSLEngine);
          if (null != bCX509Key)
            return bCX509Key; 
        } 
      }  
    return null;
  }
  
  public BCX509Key chooseEngineServerKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, SSLEngine paramSSLEngine) {
    if (null != paramArrayOfString)
      for (String str1 : paramArrayOfString) {
        String str2 = chooseEngineServerAlias(str1, paramArrayOfPrincipal, paramSSLEngine);
        if (null != str2) {
          BCX509Key bCX509Key = validateKeyBC(true, str1, str2, paramSSLEngine);
          if (null != bCX509Key)
            return bCX509Key; 
        } 
      }  
    return null;
  }
  
  public BCX509Key chooseServerKeyBC(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal, Socket paramSocket) {
    if (null != paramArrayOfString)
      for (String str1 : paramArrayOfString) {
        String str2 = chooseServerAlias(str1, paramArrayOfPrincipal, paramSocket);
        if (null != str2) {
          BCX509Key bCX509Key = validateKeyBC(true, str1, str2, paramSocket);
          if (null != bCX509Key)
            return bCX509Key; 
        } 
      }  
    return null;
  }
  
  protected abstract BCX509Key getKeyBC(String paramString1, String paramString2);
  
  protected BCX509Key validateKeyBC(boolean paramBoolean, String paramString1, String paramString2, Socket paramSocket) {
    return getKeyBC(paramString1, paramString2);
  }
  
  protected BCX509Key validateKeyBC(boolean paramBoolean, String paramString1, String paramString2, SSLEngine paramSSLEngine) {
    return getKeyBC(paramString1, paramString2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\BCX509ExtendedKeyManager.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */