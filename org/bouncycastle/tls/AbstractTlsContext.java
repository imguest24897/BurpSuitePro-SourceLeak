package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCrypto;
import org.bouncycastle.tls.crypto.TlsCryptoUtils;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.tls.crypto.TlsNonceGenerator;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Times;

abstract class AbstractTlsContext implements TlsContext {
  private static long counter = Times.nanoTime();
  
  private TlsCrypto crypto;
  
  private int connectionEnd;
  
  private TlsNonceGenerator nonceGenerator;
  
  private SecurityParameters securityParametersHandshake = null;
  
  private SecurityParameters securityParametersConnection = null;
  
  private ProtocolVersion[] clientSupportedVersions = null;
  
  private ProtocolVersion clientVersion = null;
  
  private ProtocolVersion rsaPreMasterSecretVersion = null;
  
  private TlsSession session = null;
  
  private Object userObject = null;
  
  private static synchronized long nextCounterValue() {
    return ++counter;
  }
  
  private static TlsNonceGenerator createNonceGenerator(TlsCrypto paramTlsCrypto, int paramInt) {
    byte[] arrayOfByte = new byte[16];
    Pack.longToBigEndian(nextCounterValue(), arrayOfByte, 0);
    Pack.longToBigEndian(Times.nanoTime(), arrayOfByte, 8);
    arrayOfByte[0] = (byte)(arrayOfByte[0] & Byte.MAX_VALUE);
    arrayOfByte[0] = (byte)(arrayOfByte[0] | (byte)(paramInt << 7));
    return paramTlsCrypto.createNonceGenerator(arrayOfByte);
  }
  
  AbstractTlsContext(TlsCrypto paramTlsCrypto, int paramInt) {
    this.crypto = paramTlsCrypto;
    this.connectionEnd = paramInt;
    this.nonceGenerator = createNonceGenerator(paramTlsCrypto, paramInt);
  }
  
  void handshakeBeginning(TlsPeer paramTlsPeer) throws IOException {
    synchronized (this) {
      if (null != this.securityParametersHandshake)
        throw new TlsFatalAlert((short)80, "Handshake already started"); 
      this.securityParametersHandshake = new SecurityParameters();
      this.securityParametersHandshake.entity = this.connectionEnd;
      if (null != this.securityParametersConnection) {
        this.securityParametersHandshake.renegotiating = true;
        this.securityParametersHandshake.secureRenegotiation = this.securityParametersConnection.isSecureRenegotiation();
        this.securityParametersHandshake.negotiatedVersion = this.securityParametersConnection.getNegotiatedVersion();
      } 
    } 
    paramTlsPeer.notifyHandshakeBeginning();
  }
  
  void handshakeComplete(TlsPeer paramTlsPeer, TlsSession paramTlsSession) throws IOException {
    synchronized (this) {
      if (null == this.securityParametersHandshake)
        throw new TlsFatalAlert((short)80); 
      this.session = paramTlsSession;
      this.securityParametersConnection = this.securityParametersHandshake;
      this.securityParametersHandshake = null;
    } 
    paramTlsPeer.notifyHandshakeComplete();
  }
  
  synchronized boolean isConnected() {
    return (null != this.securityParametersConnection);
  }
  
  synchronized boolean isHandshaking() {
    return (null != this.securityParametersHandshake);
  }
  
  public TlsCrypto getCrypto() {
    return this.crypto;
  }
  
  public TlsNonceGenerator getNonceGenerator() {
    return this.nonceGenerator;
  }
  
  public synchronized SecurityParameters getSecurityParameters() {
    return (null != this.securityParametersHandshake) ? this.securityParametersHandshake : this.securityParametersConnection;
  }
  
  public synchronized SecurityParameters getSecurityParametersConnection() {
    return this.securityParametersConnection;
  }
  
  public synchronized SecurityParameters getSecurityParametersHandshake() {
    return this.securityParametersHandshake;
  }
  
  public ProtocolVersion[] getClientSupportedVersions() {
    return this.clientSupportedVersions;
  }
  
  void setClientSupportedVersions(ProtocolVersion[] paramArrayOfProtocolVersion) {
    this.clientSupportedVersions = paramArrayOfProtocolVersion;
  }
  
  public ProtocolVersion getClientVersion() {
    return this.clientVersion;
  }
  
  void setClientVersion(ProtocolVersion paramProtocolVersion) {
    this.clientVersion = paramProtocolVersion;
  }
  
  public ProtocolVersion getRSAPreMasterSecretVersion() {
    return this.rsaPreMasterSecretVersion;
  }
  
  void setRSAPreMasterSecretVersion(ProtocolVersion paramProtocolVersion) {
    this.rsaPreMasterSecretVersion = paramProtocolVersion;
  }
  
  public ProtocolVersion getServerVersion() {
    return getSecurityParameters().getNegotiatedVersion();
  }
  
  public TlsSession getResumableSession() {
    TlsSession tlsSession = getSession();
    return (tlsSession == null || !tlsSession.isResumable()) ? null : tlsSession;
  }
  
  public TlsSession getSession() {
    return this.session;
  }
  
  public Object getUserObject() {
    return this.userObject;
  }
  
  public void setUserObject(Object paramObject) {
    this.userObject = paramObject;
  }
  
  public byte[] exportChannelBinding(int paramInt) {
    byte[] arrayOfByte;
    SecurityParameters securityParameters = getSecurityParametersConnection();
    if (null == securityParameters)
      throw new IllegalStateException("Export of channel bindings unavailable before handshake completion"); 
    if (3 == paramInt)
      return exportKeyingMaterial("EXPORTER-Channel-Binding", TlsUtils.EMPTY_BYTES, 32); 
    if (TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion()))
      return null; 
    switch (paramInt) {
      case 0:
        arrayOfByte = securityParameters.getTLSServerEndPoint();
        return TlsUtils.isNullOrEmpty(arrayOfByte) ? null : Arrays.clone(arrayOfByte);
      case 1:
        return Arrays.clone(securityParameters.getTLSUnique());
    } 
    throw new UnsupportedOperationException();
  }
  
  public byte[] exportEarlyKeyingMaterial(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    SecurityParameters securityParameters = getSecurityParametersHandshake();
    if (null == securityParameters)
      throw new IllegalStateException("Export of early key material only available during handshake"); 
    return exportKeyingMaterial13(checkEarlyExportSecret(securityParameters.getEarlyExporterMasterSecret()), securityParameters.getPRFCryptoHashAlgorithm(), paramString, paramArrayOfbyte, paramInt);
  }
  
  public byte[] exportKeyingMaterial(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    SecurityParameters securityParameters = getSecurityParametersConnection();
    if (null == securityParameters)
      throw new IllegalStateException("Export of key material unavailable before handshake completion"); 
    if (!securityParameters.isExtendedMasterSecret())
      throw new IllegalStateException("Export of key material requires extended_master_secret"); 
    if (TlsUtils.isTLSv13(securityParameters.getNegotiatedVersion()))
      return exportKeyingMaterial13(checkExportSecret(securityParameters.getExporterMasterSecret()), securityParameters.getPRFCryptoHashAlgorithm(), paramString, paramArrayOfbyte, paramInt); 
    byte[] arrayOfByte = TlsUtils.calculateExporterSeed(securityParameters, paramArrayOfbyte);
    return TlsUtils.PRF(securityParameters, checkExportSecret(securityParameters.getMasterSecret()), paramString, arrayOfByte, paramInt).extract();
  }
  
  protected byte[] exportKeyingMaterial13(TlsSecret paramTlsSecret, int paramInt1, String paramString, byte[] paramArrayOfbyte, int paramInt2) {
    if (null == paramArrayOfbyte) {
      paramArrayOfbyte = TlsUtils.EMPTY_BYTES;
    } else if (!TlsUtils.isValidUint16(paramArrayOfbyte.length)) {
      throw new IllegalArgumentException("'context' must have length less than 2^16 (or be null)");
    } 
    try {
      TlsHash tlsHash = getCrypto().createHash(paramInt1);
      byte[] arrayOfByte1 = tlsHash.calculateHash();
      TlsSecret tlsSecret = TlsUtils.deriveSecret(getSecurityParametersConnection(), paramTlsSecret, paramString, arrayOfByte1);
      byte[] arrayOfByte2 = arrayOfByte1;
      if (paramArrayOfbyte.length > 0) {
        tlsHash.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
        arrayOfByte2 = tlsHash.calculateHash();
      } 
      return TlsCryptoUtils.hkdfExpandLabel(tlsSecret, paramInt1, "exporter", arrayOfByte2, paramInt2).extract();
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
  
  protected TlsSecret checkEarlyExportSecret(TlsSecret paramTlsSecret) {
    if (null == paramTlsSecret)
      throw new IllegalStateException("Export of early key material not available for this handshake"); 
    return paramTlsSecret;
  }
  
  protected TlsSecret checkExportSecret(TlsSecret paramTlsSecret) {
    if (null == paramTlsSecret)
      throw new IllegalStateException("Export of key material only available from notifyHandshakeComplete()"); 
    return paramTlsSecret;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\AbstractTlsContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */