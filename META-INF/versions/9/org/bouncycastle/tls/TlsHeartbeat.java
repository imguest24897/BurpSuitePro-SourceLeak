package META-INF.versions.9.org.bouncycastle.tls;

public interface TlsHeartbeat {
  byte[] generatePayload();
  
  int getIdleMillis();
  
  int getTimeoutMillis();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsHeartbeat.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */