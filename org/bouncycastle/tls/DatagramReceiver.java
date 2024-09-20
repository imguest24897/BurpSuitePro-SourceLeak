package org.bouncycastle.tls;

import java.io.IOException;

public interface DatagramReceiver {
  int getReceiveLimit() throws IOException;
  
  int receive(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DatagramReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */