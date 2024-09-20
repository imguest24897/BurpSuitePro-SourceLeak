package org.bouncycastle.tls;

import java.io.IOException;

interface DTLSHandshakeRetransmit {
  void receivedHandshakeRecord(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DTLSHandshakeRetransmit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */