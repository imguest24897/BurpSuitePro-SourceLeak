package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.logging.Logger;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;
import org.bouncycastle.jsse.provider.ExportX509TrustManager;
import org.bouncycastle.jsse.provider.ExportX509TrustManager_7;
import org.bouncycastle.jsse.provider.ImportX509TrustManager;
import org.bouncycastle.jsse.provider.ImportX509TrustManager_5;
import org.bouncycastle.jsse.provider.ImportX509TrustManager_7;

abstract class X509TrustManagerUtil {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.X509TrustManagerUtil.class.getName());
  
  static X509TrustManager exportX509TrustManager(BCX509ExtendedTrustManager paramBCX509ExtendedTrustManager) {
    return (X509TrustManager)((paramBCX509ExtendedTrustManager instanceof ImportX509TrustManager) ? ((ImportX509TrustManager)paramBCX509ExtendedTrustManager).unwrap() : new ExportX509TrustManager_7(paramBCX509ExtendedTrustManager));
  }
  
  static BCX509ExtendedTrustManager importX509TrustManager(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, X509TrustManager paramX509TrustManager) {
    LOG.fine("Importing X509TrustManager implementation: " + paramX509TrustManager.getClass().getName());
    return (BCX509ExtendedTrustManager)((paramX509TrustManager instanceof BCX509ExtendedTrustManager) ? paramX509TrustManager : ((paramX509TrustManager instanceof ExportX509TrustManager) ? ((ExportX509TrustManager)paramX509TrustManager).unwrap() : ((paramX509TrustManager instanceof X509ExtendedTrustManager) ? new ImportX509TrustManager_7((X509ExtendedTrustManager)paramX509TrustManager) : new ImportX509TrustManager_5(paramBoolean, paramJcaJceHelper, paramX509TrustManager))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\X509TrustManagerUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */