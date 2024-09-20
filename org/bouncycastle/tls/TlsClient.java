package org.bouncycastle.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {
  void init(TlsClientContext paramTlsClientContext);
  
  TlsSession getSessionToResume();
  
  Vector getExternalPSKs();
  
  boolean isFallback();
  
  Hashtable getClientExtensions() throws IOException;
  
  Vector getEarlyKeyShareGroups();
  
  boolean shouldUseCompatibilityMode();
  
  void notifyServerVersion(ProtocolVersion paramProtocolVersion) throws IOException;
  
  void notifySessionToResume(TlsSession paramTlsSession);
  
  void notifySessionID(byte[] paramArrayOfbyte);
  
  void notifySelectedCipherSuite(int paramInt);
  
  void notifySelectedPSK(TlsPSK paramTlsPSK) throws IOException;
  
  void processServerExtensions(Hashtable paramHashtable) throws IOException;
  
  void processServerSupplementalData(Vector paramVector) throws IOException;
  
  TlsPSKIdentity getPSKIdentity() throws IOException;
  
  TlsSRPIdentity getSRPIdentity() throws IOException;
  
  TlsDHGroupVerifier getDHGroupVerifier() throws IOException;
  
  TlsSRPConfigVerifier getSRPConfigVerifier() throws IOException;
  
  TlsAuthentication getAuthentication() throws IOException;
  
  Vector getClientSupplementalData() throws IOException;
  
  void notifyNewSessionTicket(NewSessionTicket paramNewSessionTicket) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */