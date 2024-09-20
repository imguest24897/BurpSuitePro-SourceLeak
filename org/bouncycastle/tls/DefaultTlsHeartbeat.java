package org.bouncycastle.tls;

import org.bouncycastle.util.Pack;

public class DefaultTlsHeartbeat implements TlsHeartbeat {
  private final int idleMillis;
  
  private final int timeoutMillis;
  
  private int counter = 0;
  
  public DefaultTlsHeartbeat(int paramInt1, int paramInt2) {
    if (paramInt1 <= 0)
      throw new IllegalArgumentException("'idleMillis' must be > 0"); 
    if (paramInt2 <= 0)
      throw new IllegalArgumentException("'timeoutMillis' must be > 0"); 
    this.idleMillis = paramInt1;
    this.timeoutMillis = paramInt2;
  }
  
  public synchronized byte[] generatePayload() {
    return Pack.intToBigEndian(++this.counter);
  }
  
  public int getIdleMillis() {
    return this.idleMillis;
  }
  
  public int getTimeoutMillis() {
    return this.timeoutMillis;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsHeartbeat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */