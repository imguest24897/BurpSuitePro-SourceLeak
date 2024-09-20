package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

public class SSLServerSocketFactoryImpl extends ProvSSLServerSocketFactory {
  public SSLServerSocketFactoryImpl() throws Exception {
    super(DefaultSSLContextSpi.getDefaultInstance().getContextData());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\SSLServerSocketFactoryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */