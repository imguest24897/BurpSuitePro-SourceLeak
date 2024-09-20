package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.DefaultTlsKeyExchangeFactory;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsCloseable;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsHeartbeat;
import org.bouncycastle.tls.TlsKeyExchangeFactory;
import org.bouncycastle.tls.TlsPeer;
import org.bouncycastle.tls.crypto.TlsCrypto;

public abstract class AbstractTlsPeer implements TlsPeer {
  private final TlsCrypto crypto;
  
  private volatile TlsCloseable closeHandle;
  
  protected AbstractTlsPeer(TlsCrypto paramTlsCrypto) {
    this.crypto = paramTlsCrypto;
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return ProtocolVersion.TLSv13.downTo(ProtocolVersion.TLSv12);
  }
  
  protected abstract int[] getSupportedCipherSuites();
  
  public void cancel() throws IOException {
    TlsCloseable tlsCloseable = this.closeHandle;
    if (null != tlsCloseable)
      tlsCloseable.close(); 
  }
  
  public TlsCrypto getCrypto() {
    return this.crypto;
  }
  
  public void notifyCloseHandle(TlsCloseable paramTlsCloseable) {
    this.closeHandle = paramTlsCloseable;
  }
  
  public void notifyHandshakeBeginning() throws IOException {}
  
  public int getHandshakeTimeoutMillis() {
    return 0;
  }
  
  public int getHandshakeResendTimeMillis() {
    return 1000;
  }
  
  public boolean allowLegacyResumption() {
    return false;
  }
  
  public int getMaxCertificateChainLength() {
    return 10;
  }
  
  public int getMaxHandshakeMessageSize() {
    return 32768;
  }
  
  public short[] getPskKeyExchangeModes() {
    return new short[] { 1 };
  }
  
  public boolean requiresCloseNotify() {
    return true;
  }
  
  public boolean requiresExtendedMasterSecret() {
    return false;
  }
  
  public boolean shouldCheckSigAlgOfPeerCerts() {
    return true;
  }
  
  public boolean shouldUseExtendedMasterSecret() {
    return true;
  }
  
  public boolean shouldUseExtendedPadding() {
    return false;
  }
  
  public boolean shouldUseGMTUnixTime() {
    return false;
  }
  
  public void notifySecureRenegotiation(boolean paramBoolean) throws IOException {
    if (!paramBoolean)
      throw new TlsFatalAlert((short)40); 
  }
  
  public TlsKeyExchangeFactory getKeyExchangeFactory() throws IOException {
    return (TlsKeyExchangeFactory)new DefaultTlsKeyExchangeFactory();
  }
  
  public void notifyAlertRaised(short paramShort1, short paramShort2, String paramString, Throwable paramThrowable) {}
  
  public void notifyAlertReceived(short paramShort1, short paramShort2) {}
  
  public void notifyConnectionClosed() {}
  
  public void notifyHandshakeComplete() throws IOException {}
  
  public TlsHeartbeat getHeartbeat() {
    return null;
  }
  
  public short getHeartbeatPolicy() {
    return 2;
  }
  
  public int getRenegotiationPolicy() {
    return 0;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\AbstractTlsPeer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */