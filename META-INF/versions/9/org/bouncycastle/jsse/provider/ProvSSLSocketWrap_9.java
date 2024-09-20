package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.ProvSSLSocketWrap_8;

class ProvSSLSocketWrap_9 extends ProvSSLSocketWrap_8 {
  protected ProvSSLSocketWrap_9(ContextData paramContextData, Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    super(paramContextData, paramSocket, paramInputStream, paramBoolean);
  }
  
  protected ProvSSLSocketWrap_9(ContextData paramContextData, Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    super(paramContextData, paramSocket, paramString, paramInt, paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSocketWrap_9.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */