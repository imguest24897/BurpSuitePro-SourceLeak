package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.logging.Logger;
import javax.net.ssl.X509ExtendedKeyManager;
import javax.net.ssl.X509KeyManager;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedKeyManager;
import org.bouncycastle.jsse.provider.ImportX509KeyManager;
import org.bouncycastle.jsse.provider.ImportX509KeyManager_4;
import org.bouncycastle.jsse.provider.ImportX509KeyManager_5;

abstract class X509KeyManagerUtil {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.X509KeyManagerUtil.class.getName());
  
  static X509KeyManager exportX509KeyManager(BCX509ExtendedKeyManager paramBCX509ExtendedKeyManager) {
    return (X509KeyManager)((paramBCX509ExtendedKeyManager instanceof ImportX509KeyManager) ? ((ImportX509KeyManager)paramBCX509ExtendedKeyManager).unwrap() : paramBCX509ExtendedKeyManager);
  }
  
  static BCX509ExtendedKeyManager importX509KeyManager(JcaJceHelper paramJcaJceHelper, X509KeyManager paramX509KeyManager) {
    LOG.fine("Importing X509KeyManager implementation: " + paramX509KeyManager.getClass().getName());
    return (BCX509ExtendedKeyManager)((paramX509KeyManager instanceof BCX509ExtendedKeyManager) ? paramX509KeyManager : ((paramX509KeyManager instanceof X509ExtendedKeyManager) ? new ImportX509KeyManager_5((X509ExtendedKeyManager)paramX509KeyManager) : new ImportX509KeyManager_4(paramX509KeyManager)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\X509KeyManagerUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */