package org.bouncycastle.tls;

import java.io.IOException;

public interface DatagramSender {
  int getSendLimit() throws IOException;
  
  void send(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DatagramSender.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */