package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ProvSSLSocketDirect_8;

class ProvSSLSocketDirect_9 extends ProvSSLSocketDirect_8 {
  ProvSSLSocketDirect_9(ContextData paramContextData, boolean paramBoolean1, boolean paramBoolean2, ProvSSLParameters paramProvSSLParameters) {
    super(paramContextData, paramBoolean1, paramBoolean2, paramProvSSLParameters);
  }
  
  protected ProvSSLSocketDirect_9(ContextData paramContextData) {
    super(paramContextData);
  }
  
  protected ProvSSLSocketDirect_9(ContextData paramContextData, InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2) throws IOException {
    super(paramContextData, paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
  }
  
  protected ProvSSLSocketDirect_9(ContextData paramContextData, InetAddress paramInetAddress, int paramInt) throws IOException {
    super(paramContextData, paramInetAddress, paramInt);
  }
  
  protected ProvSSLSocketDirect_9(ContextData paramContextData, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2) throws IOException, UnknownHostException {
    super(paramContextData, paramString, paramInt1, paramInetAddress, paramInt2);
  }
  
  protected ProvSSLSocketDirect_9(ContextData paramContextData, String paramString, int paramInt) throws IOException, UnknownHostException {
    super(paramContextData, paramString, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSocketDirect_9.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */