package META-INF.versions.9.org.bouncycastle.jsse.provider;

import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.provider.ExportSSLSession;
import org.bouncycastle.jsse.provider.ExportSSLSession_9;
import org.bouncycastle.jsse.provider.ImportSSLSession;
import org.bouncycastle.jsse.provider.ImportSSLSession_5;
import org.bouncycastle.jsse.provider.ImportSSLSession_9;

abstract class SSLSessionUtil {
  static SSLSession exportSSLSession(BCExtendedSSLSession paramBCExtendedSSLSession) {
    return (SSLSession)((paramBCExtendedSSLSession instanceof ImportSSLSession) ? ((ImportSSLSession)paramBCExtendedSSLSession).unwrap() : new ExportSSLSession_9(paramBCExtendedSSLSession));
  }
  
  static BCExtendedSSLSession importSSLSession(SSLSession paramSSLSession) {
    return (BCExtendedSSLSession)((paramSSLSession instanceof BCExtendedSSLSession) ? paramSSLSession : ((paramSSLSession instanceof ExportSSLSession) ? ((ExportSSLSession)paramSSLSession).unwrap() : ((paramSSLSession instanceof ExtendedSSLSession) ? new ImportSSLSession_9((ExtendedSSLSession)paramSSLSession) : new ImportSSLSession_5(paramSSLSession))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\SSLSessionUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */