package org.bouncycastle.tls;

public interface TlsHeartbeat {
  byte[] generatePayload();
  
  int getIdleMillis();
  
  int getTimeoutMillis();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsHeartbeat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */