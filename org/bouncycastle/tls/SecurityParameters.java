package org.bouncycastle.tls;

import java.util.Vector;
import org.bouncycastle.tls.crypto.TlsSecret;

public class SecurityParameters {
  int entity = -1;
  
  boolean resumedSession = false;
  
  boolean renegotiating = false;
  
  boolean secureRenegotiation = false;
  
  int cipherSuite = 0;
  
  short maxFragmentLength = -1;
  
  int prfAlgorithm = -1;
  
  int prfCryptoHashAlgorithm = -1;
  
  int prfHashLength = -1;
  
  int verifyDataLength = -1;
  
  TlsSecret baseKeyClient = null;
  
  TlsSecret baseKeyServer = null;
  
  TlsSecret earlyExporterMasterSecret = null;
  
  TlsSecret earlySecret = null;
  
  TlsSecret exporterMasterSecret = null;
  
  TlsSecret handshakeSecret = null;
  
  TlsSecret masterSecret = null;
  
  TlsSecret trafficSecretClient = null;
  
  TlsSecret trafficSecretServer = null;
  
  byte[] clientRandom = null;
  
  byte[] serverRandom = null;
  
  byte[] sessionHash = null;
  
  byte[] sessionID = null;
  
  byte[] pskIdentity = null;
  
  byte[] srpIdentity = null;
  
  byte[] tlsServerEndPoint = null;
  
  byte[] tlsUnique = null;
  
  boolean encryptThenMAC = false;
  
  boolean extendedMasterSecret = false;
  
  boolean extendedPadding = false;
  
  boolean truncatedHMac = false;
  
  ProtocolName applicationProtocol = null;
  
  boolean applicationProtocolSet = false;
  
  short[] clientCertTypes = null;
  
  Vector clientServerNames = null;
  
  Vector clientSigAlgs = null;
  
  Vector clientSigAlgsCert = null;
  
  int[] clientSupportedGroups = null;
  
  Vector serverSigAlgs = null;
  
  Vector serverSigAlgsCert = null;
  
  int[] serverSupportedGroups = null;
  
  int keyExchangeAlgorithm = -1;
  
  Certificate localCertificate = null;
  
  Certificate peerCertificate = null;
  
  ProtocolVersion negotiatedVersion = null;
  
  int statusRequestVersion = 0;
  
  short clientCertificateType = 0;
  
  short serverCertificateType = 0;
  
  byte[] localVerifyData = null;
  
  byte[] peerVerifyData = null;
  
  byte[] connectionIDLocal;
  
  byte[] connectionIDPeer;
  
  void clear() {
    this.sessionHash = null;
    this.sessionID = null;
    this.clientCertTypes = null;
    this.clientServerNames = null;
    this.clientSigAlgs = null;
    this.clientSigAlgsCert = null;
    this.clientSupportedGroups = null;
    this.serverSigAlgs = null;
    this.serverSigAlgsCert = null;
    this.serverSupportedGroups = null;
    this.statusRequestVersion = 0;
    this.baseKeyClient = clearSecret(this.baseKeyClient);
    this.baseKeyServer = clearSecret(this.baseKeyServer);
    this.earlyExporterMasterSecret = clearSecret(this.earlyExporterMasterSecret);
    this.earlySecret = clearSecret(this.earlySecret);
    this.exporterMasterSecret = clearSecret(this.exporterMasterSecret);
    this.handshakeSecret = clearSecret(this.handshakeSecret);
    this.masterSecret = clearSecret(this.masterSecret);
  }
  
  public int getEntity() {
    return this.entity;
  }
  
  public boolean isResumedSession() {
    return this.resumedSession;
  }
  
  public boolean isRenegotiating() {
    return this.renegotiating;
  }
  
  public boolean isSecureRenegotiation() {
    return this.secureRenegotiation;
  }
  
  public int getCipherSuite() {
    return this.cipherSuite;
  }
  
  public short[] getClientCertTypes() {
    return this.clientCertTypes;
  }
  
  public Vector getClientServerNames() {
    return this.clientServerNames;
  }
  
  public Vector getClientSigAlgs() {
    return this.clientSigAlgs;
  }
  
  public Vector getClientSigAlgsCert() {
    return this.clientSigAlgsCert;
  }
  
  public int[] getClientSupportedGroups() {
    return this.clientSupportedGroups;
  }
  
  public byte[] getConnectionIDLocal() {
    return this.connectionIDLocal;
  }
  
  public byte[] getConnectionIDPeer() {
    return this.connectionIDPeer;
  }
  
  public Vector getServerSigAlgs() {
    return this.serverSigAlgs;
  }
  
  public Vector getServerSigAlgsCert() {
    return this.serverSigAlgsCert;
  }
  
  public int[] getServerSupportedGroups() {
    return this.serverSupportedGroups;
  }
  
  public short getCompressionAlgorithm() {
    return 0;
  }
  
  public short getMaxFragmentLength() {
    return this.maxFragmentLength;
  }
  
  public int getPrfAlgorithm() {
    return this.prfAlgorithm;
  }
  
  public int getPRFAlgorithm() {
    return this.prfAlgorithm;
  }
  
  public int getPRFCryptoHashAlgorithm() {
    return this.prfCryptoHashAlgorithm;
  }
  
  public int getPRFHashLength() {
    return this.prfHashLength;
  }
  
  public int getVerifyDataLength() {
    return this.verifyDataLength;
  }
  
  public TlsSecret getBaseKeyClient() {
    return this.baseKeyClient;
  }
  
  public TlsSecret getBaseKeyServer() {
    return this.baseKeyServer;
  }
  
  public TlsSecret getEarlyExporterMasterSecret() {
    return this.earlyExporterMasterSecret;
  }
  
  public TlsSecret getEarlySecret() {
    return this.earlySecret;
  }
  
  public TlsSecret getExporterMasterSecret() {
    return this.exporterMasterSecret;
  }
  
  public TlsSecret getHandshakeSecret() {
    return this.handshakeSecret;
  }
  
  public TlsSecret getMasterSecret() {
    return this.masterSecret;
  }
  
  public TlsSecret getTrafficSecretClient() {
    return this.trafficSecretClient;
  }
  
  public TlsSecret getTrafficSecretServer() {
    return this.trafficSecretServer;
  }
  
  public byte[] getClientRandom() {
    return this.clientRandom;
  }
  
  public byte[] getServerRandom() {
    return this.serverRandom;
  }
  
  public byte[] getSessionHash() {
    return this.sessionHash;
  }
  
  public byte[] getSessionID() {
    return this.sessionID;
  }
  
  public byte[] getPSKIdentity() {
    return this.pskIdentity;
  }
  
  public byte[] getSRPIdentity() {
    return this.srpIdentity;
  }
  
  public byte[] getTLSServerEndPoint() {
    return this.tlsServerEndPoint;
  }
  
  public byte[] getTLSUnique() {
    return this.tlsUnique;
  }
  
  public boolean isEncryptThenMAC() {
    return this.encryptThenMAC;
  }
  
  public boolean isExtendedMasterSecret() {
    return this.extendedMasterSecret;
  }
  
  public boolean isExtendedPadding() {
    return this.extendedPadding;
  }
  
  public boolean isTruncatedHMac() {
    return this.truncatedHMac;
  }
  
  public ProtocolName getApplicationProtocol() {
    return this.applicationProtocol;
  }
  
  public boolean isApplicationProtocolSet() {
    return this.applicationProtocolSet;
  }
  
  public byte[] getLocalVerifyData() {
    return this.localVerifyData;
  }
  
  public byte[] getPeerVerifyData() {
    return this.peerVerifyData;
  }
  
  public int getKeyExchangeAlgorithm() {
    return this.keyExchangeAlgorithm;
  }
  
  public Certificate getLocalCertificate() {
    return this.localCertificate;
  }
  
  public Certificate getPeerCertificate() {
    return this.peerCertificate;
  }
  
  public ProtocolVersion getNegotiatedVersion() {
    return this.negotiatedVersion;
  }
  
  public int getStatusRequestVersion() {
    return this.statusRequestVersion;
  }
  
  public short getClientCertificateType() {
    return this.clientCertificateType;
  }
  
  public short getServerCertificateType() {
    return this.serverCertificateType;
  }
  
  private static TlsSecret clearSecret(TlsSecret paramTlsSecret) {
    if (null != paramTlsSecret)
      paramTlsSecret.destroy(); 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SecurityParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */