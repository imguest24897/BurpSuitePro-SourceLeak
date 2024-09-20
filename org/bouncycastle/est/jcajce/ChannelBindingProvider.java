package org.bouncycastle.est.jcajce;

import java.net.Socket;

public interface ChannelBindingProvider {
  boolean canAccessChannelBinding(Socket paramSocket);
  
  byte[] getChannelBinding(Socket paramSocket, String paramString);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\est\jcajce\ChannelBindingProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */