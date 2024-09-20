package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCrypto;

public interface TlsPeer {
  TlsCrypto getCrypto();
  
  void notifyCloseHandle(TlsCloseable paramTlsCloseable);
  
  void cancel() throws IOException;
  
  ProtocolVersion[] getProtocolVersions();
  
  int[] getCipherSuites();
  
  void notifyHandshakeBeginning() throws IOException;
  
  int getHandshakeTimeoutMillis();
  
  int getHandshakeResendTimeMillis();
  
  boolean allowLegacyResumption();
  
  int getMaxCertificateChainLength();
  
  int getMaxHandshakeMessageSize();
  
  short[] getPskKeyExchangeModes();
  
  boolean requiresCloseNotify();
  
  boolean requiresExtendedMasterSecret();
  
  boolean shouldCheckSigAlgOfPeerCerts();
  
  boolean shouldUseExtendedMasterSecret();
  
  boolean shouldUseExtendedPadding();
  
  boolean shouldUseGMTUnixTime();
  
  void notifySecureRenegotiation(boolean paramBoolean) throws IOException;
  
  TlsKeyExchangeFactory getKeyExchangeFactory() throws IOException;
  
  void notifyAlertRaised(short paramShort1, short paramShort2, String paramString, Throwable paramThrowable);
  
  void notifyAlertReceived(short paramShort1, short paramShort2);
  
  void notifyConnectionClosed();
  
  void notifyHandshakeComplete() throws IOException;
  
  TlsHeartbeat getHeartbeat();
  
  short getHeartbeatPolicy();
  
  int getRenegotiationPolicy();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsPeer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */