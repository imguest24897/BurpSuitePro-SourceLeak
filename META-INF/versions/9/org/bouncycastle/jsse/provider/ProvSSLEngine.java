package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
import org.bouncycastle.jsse.BCSSLEngine;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCX509Key;
import org.bouncycastle.jsse.provider.ContextData;
import org.bouncycastle.jsse.provider.JsseSecurityParameters;
import org.bouncycastle.jsse.provider.JsseUtils;
import org.bouncycastle.jsse.provider.ProvSSLConnection;
import org.bouncycastle.jsse.provider.ProvSSLParameters;
import org.bouncycastle.jsse.provider.ProvSSLSession;
import org.bouncycastle.jsse.provider.ProvSSLSessionContext;
import org.bouncycastle.jsse.provider.ProvSSLSessionHandshake;
import org.bouncycastle.jsse.provider.ProvSSLSessionResumed;
import org.bouncycastle.jsse.provider.ProvTlsClient;
import org.bouncycastle.jsse.provider.ProvTlsManager;
import org.bouncycastle.jsse.provider.ProvTlsPeer;
import org.bouncycastle.jsse.provider.ProvTlsServer;
import org.bouncycastle.jsse.provider.SSLParametersUtil;
import org.bouncycastle.tls.RecordPreview;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsClient;
import org.bouncycastle.tls.TlsClientProtocol;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsServer;
import org.bouncycastle.tls.TlsServerProtocol;

class ProvSSLEngine extends SSLEngine implements BCSSLEngine, ProvTlsManager {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvSSLEngine.class.getName());
  
  protected final ContextData contextData;
  
  protected final ProvSSLParameters sslParameters;
  
  protected boolean enableSessionCreation = true;
  
  protected boolean useClientMode = true;
  
  protected boolean useClientModeSet = false;
  
  protected boolean closedEarly = false;
  
  protected boolean initialHandshakeBegun = false;
  
  protected boolean returnedFinished = false;
  
  protected TlsProtocol protocol = null;
  
  protected ProvTlsPeer protocolPeer = null;
  
  protected ProvSSLConnection connection = null;
  
  protected ProvSSLSessionHandshake handshakeSession = null;
  
  protected SSLException deferredException = null;
  
  protected ProvSSLEngine(ContextData paramContextData) {
    this(paramContextData, null, -1);
  }
  
  protected ProvSSLEngine(ContextData paramContextData, String paramString, int paramInt) {
    super(paramString, paramInt);
    this.contextData = paramContextData;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
  }
  
  public ContextData getContextData() {
    return this.contextData;
  }
  
  public synchronized void beginHandshake() throws SSLException {
    if (!this.useClientModeSet)
      throw new IllegalStateException("Client/Server mode must be set before the handshake can begin"); 
    if (this.closedEarly)
      throw new SSLException("Connection is already closed"); 
    if (this.initialHandshakeBegun)
      throw new UnsupportedOperationException("Renegotiation not supported"); 
    this.initialHandshakeBegun = true;
    try {
      if (this.useClientMode) {
        TlsClientProtocol tlsClientProtocol = new TlsClientProtocol();
        this.protocol = (TlsProtocol)tlsClientProtocol;
        ProvTlsClient provTlsClient = new ProvTlsClient(this, this.sslParameters);
        this.protocolPeer = (ProvTlsPeer)provTlsClient;
        tlsClientProtocol.connect((TlsClient)provTlsClient);
      } else {
        TlsServerProtocol tlsServerProtocol = new TlsServerProtocol();
        this.protocol = (TlsProtocol)tlsServerProtocol;
        ProvTlsServer provTlsServer = new ProvTlsServer(this, this.sslParameters);
        this.protocolPeer = (ProvTlsPeer)provTlsServer;
        tlsServerProtocol.accept((TlsServer)provTlsServer);
      } 
    } catch (SSLException sSLException) {
      throw sSLException;
    } catch (IOException iOException) {
      throw new SSLException(iOException);
    } 
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws IOException {
    try {
      this.contextData.getX509TrustManager().checkClientTrusted((X509Certificate[])paramArrayOfX509Certificate.clone(), paramString, this);
    } catch (CertificateException certificateException) {
      throw new TlsFatalAlert((short)46, certificateException);
    } 
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws IOException {
    try {
      this.contextData.getX509TrustManager().checkServerTrusted((X509Certificate[])paramArrayOfX509Certificate.clone(), paramString, this);
    } catch (CertificateException certificateException) {
      throw new TlsFatalAlert((short)46, certificateException);
    } 
  }
  
  public BCX509Key chooseClientKey(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal) {
    return getContextData().getX509KeyManager().chooseEngineClientKeyBC(paramArrayOfString, (Principal[])JsseUtils.clone((Object[])paramArrayOfPrincipal), this);
  }
  
  public BCX509Key chooseServerKey(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal) {
    return getContextData().getX509KeyManager().chooseEngineServerKeyBC(paramArrayOfString, (Principal[])JsseUtils.clone((Object[])paramArrayOfPrincipal), this);
  }
  
  public synchronized void closeInbound() throws SSLException {
    if (!this.closedEarly)
      if (null == this.protocol) {
        this.closedEarly = true;
      } else {
        try {
          this.protocol.closeInput();
        } catch (IOException iOException) {
          throw new SSLException(iOException);
        } 
      }  
  }
  
  public synchronized void closeOutbound() {
    if (!this.closedEarly)
      if (null == this.protocol) {
        this.closedEarly = true;
      } else {
        try {
          this.protocol.close();
        } catch (IOException iOException) {
          LOG.log(Level.WARNING, "Failed to close outbound", iOException);
        } 
      }  
  }
  
  public synchronized String getApplicationProtocol() {
    return (null == this.connection) ? null : this.connection.getApplicationProtocol();
  }
  
  public synchronized BCApplicationProtocolSelector<SSLEngine> getBCHandshakeApplicationProtocolSelector() {
    return this.sslParameters.getEngineAPSelector();
  }
  
  public synchronized BCExtendedSSLSession getBCHandshakeSession() {
    return (BCExtendedSSLSession)this.handshakeSession;
  }
  
  public BCExtendedSSLSession getBCSession() {
    return (BCExtendedSSLSession)getSessionImpl();
  }
  
  public synchronized BCSSLConnection getConnection() {
    return (BCSSLConnection)this.connection;
  }
  
  public synchronized Runnable getDelegatedTask() {
    return null;
  }
  
  public synchronized String[] getEnabledCipherSuites() {
    return this.sslParameters.getCipherSuites();
  }
  
  public synchronized String[] getEnabledProtocols() {
    return this.sslParameters.getProtocols();
  }
  
  public synchronized boolean getEnableSessionCreation() {
    return this.enableSessionCreation;
  }
  
  public synchronized String getHandshakeApplicationProtocol() {
    return (null == this.handshakeSession) ? null : this.handshakeSession.getApplicationProtocol();
  }
  
  public synchronized SSLSession getHandshakeSession() {
    return (null == this.handshakeSession) ? null : this.handshakeSession.getExportSSLSession();
  }
  
  public synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
    if (this.protocol != null) {
      if (this.protocol.getAvailableOutputBytes() > 0 || this.deferredException != null)
        return SSLEngineResult.HandshakeStatus.NEED_WRAP; 
      if (this.protocol.isHandshaking())
        return SSLEngineResult.HandshakeStatus.NEED_UNWRAP; 
    } 
    return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
  }
  
  public synchronized boolean getNeedClientAuth() {
    return this.sslParameters.getNeedClientAuth();
  }
  
  public synchronized BCSSLParameters getParameters() {
    return SSLParametersUtil.getParameters(this.sslParameters);
  }
  
  public SSLSession getSession() {
    return getSessionImpl().getExportSSLSession();
  }
  
  public synchronized SSLParameters getSSLParameters() {
    return SSLParametersUtil.getSSLParameters(this.sslParameters);
  }
  
  public synchronized String[] getSupportedCipherSuites() {
    return this.contextData.getContext().getSupportedCipherSuites();
  }
  
  public synchronized String[] getSupportedProtocols() {
    return this.contextData.getContext().getSupportedProtocols();
  }
  
  public int getTransportID() {
    return System.identityHashCode(this);
  }
  
  public synchronized boolean getUseClientMode() {
    return this.useClientMode;
  }
  
  public synchronized boolean getWantClientAuth() {
    return this.sslParameters.getWantClientAuth();
  }
  
  public synchronized boolean isInboundDone() {
    return (this.closedEarly || (null != this.protocol && this.protocol.isClosed()));
  }
  
  public synchronized boolean isOutboundDone() {
    return (this.closedEarly || (null != this.protocol && this.protocol.isClosed() && this.protocol.getAvailableOutputBytes() < 1));
  }
  
  public synchronized void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLEngine> paramBCApplicationProtocolSelector) {
    this.sslParameters.setEngineAPSelector(paramBCApplicationProtocolSelector);
  }
  
  public synchronized void setBCSessionToResume(BCExtendedSSLSession paramBCExtendedSSLSession) {
    if (null == paramBCExtendedSSLSession)
      throw new NullPointerException("'session' cannot be null"); 
    if (!(paramBCExtendedSSLSession instanceof ProvSSLSession))
      throw new IllegalArgumentException("Session-to-resume must be a session returned from 'getBCSession'"); 
    if (this.initialHandshakeBegun)
      throw new IllegalArgumentException("Session-to-resume cannot be set after the handshake has begun"); 
    this.sslParameters.setSessionToResume((ProvSSLSession)paramBCExtendedSSLSession);
  }
  
  public synchronized void setEnabledCipherSuites(String[] paramArrayOfString) {
    this.sslParameters.setCipherSuites(paramArrayOfString);
  }
  
  public synchronized void setEnabledProtocols(String[] paramArrayOfString) {
    this.sslParameters.setProtocols(paramArrayOfString);
  }
  
  public synchronized void setEnableSessionCreation(boolean paramBoolean) {
    this.enableSessionCreation = paramBoolean;
  }
  
  public synchronized void setNeedClientAuth(boolean paramBoolean) {
    this.sslParameters.setNeedClientAuth(paramBoolean);
  }
  
  public synchronized void setParameters(BCSSLParameters paramBCSSLParameters) {
    SSLParametersUtil.setParameters(this.sslParameters, paramBCSSLParameters);
  }
  
  public synchronized void setSSLParameters(SSLParameters paramSSLParameters) {
    SSLParametersUtil.setSSLParameters(this.sslParameters, paramSSLParameters);
  }
  
  public synchronized void setUseClientMode(boolean paramBoolean) {
    if (this.initialHandshakeBegun)
      throw new IllegalArgumentException("Client/Server mode cannot be changed after the handshake has begun"); 
    if (this.useClientMode != paramBoolean) {
      this.contextData.getContext().updateDefaultSSLParameters(this.sslParameters, paramBoolean);
      this.useClientMode = paramBoolean;
    } 
    this.useClientModeSet = true;
  }
  
  public synchronized void setWantClientAuth(boolean paramBoolean) {
    this.sslParameters.setWantClientAuth(paramBoolean);
  }
  
  public synchronized SSLEngineResult unwrap(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws SSLException {
    SSLEngineResult.HandshakeStatus handshakeStatus1 = getHandshakeStatus();
    if (isInboundDone())
      return new SSLEngineResult(SSLEngineResult.Status.CLOSED, handshakeStatus1, 0, 0); 
    if (!this.initialHandshakeBegun)
      beginHandshake(); 
    switch (null.$SwitchMap$javax$net$ssl$SSLEngineResult$HandshakeStatus[handshakeStatus1.ordinal()]) {
      case 1:
      case 2:
        break;
      default:
        return new SSLEngineResult(SSLEngineResult.Status.OK, handshakeStatus1, 0, 0);
    } 
    int i = 0;
    try {
      RecordPreview recordPreview = getRecordPreview(paramByteBuffer);
      if (recordPreview == null || paramByteBuffer.remaining() < recordPreview.getRecordSize())
        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, handshakeStatus1, 0, 0); 
      if (hasInsufficientSpace(paramArrayOfByteBuffer, paramInt1, paramInt2, recordPreview.getContentLimit()))
        return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus1, 0, 0); 
      i = recordPreview.getRecordSize();
      byte[] arrayOfByte = new byte[i];
      paramByteBuffer.get(arrayOfByte);
      this.protocol.offerInput(arrayOfByte, 0, arrayOfByte.length);
    } catch (IOException iOException) {
      if (handshakeStatus1 != SSLEngineResult.HandshakeStatus.NEED_UNWRAP)
        throw new SSLException(iOException); 
      this.deferredException = new SSLException(iOException);
      return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, i, 0);
    } 
    int j = this.protocol.getAvailableInputBytes();
    int k = 0;
    for (byte b = 0; j > 0; b++) {
      ByteBuffer byteBuffer = paramArrayOfByteBuffer[paramInt1 + b];
      int m = Math.min(byteBuffer.remaining(), j);
      if (m > 0) {
        int n = this.protocol.readInput(byteBuffer, m);
        assert n == m;
        k += m;
        j -= m;
      } 
    } 
    SSLEngineResult.HandshakeStatus handshakeStatus2 = getHandshakeStatus();
    if (handshakeStatus2 == SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING && !this.returnedFinished && this.protocolPeer.isHandshakeComplete()) {
      this.returnedFinished = true;
      handshakeStatus2 = SSLEngineResult.HandshakeStatus.FINISHED;
    } 
    return new SSLEngineResult(getStatus(), handshakeStatus2, i, k);
  }
  
  public synchronized SSLEngineResult wrap(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) throws SSLException {
    if (this.deferredException != null) {
      SSLException sSLException = this.deferredException;
      this.deferredException = null;
      throw sSLException;
    } 
    if (this.closedEarly)
      return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0); 
    if (!this.initialHandshakeBegun)
      beginHandshake(); 
    int i = 0;
    int j = this.protocol.getAvailableOutputBytes();
    if (j > 0) {
      int k = paramByteBuffer.remaining();
      if (k >= j) {
        i = j;
      } else {
        i = this.protocol.previewOutputRecord();
        assert i > 0;
        if (k < i)
          return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0); 
      } 
      int m = this.protocol.readOutput(paramByteBuffer, i);
      assert m == i;
      if (i < j)
        return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, i); 
    } else if (this.protocol.isConnected()) {
      try {
        int k = 0;
        int m = getTotalRemaining(paramArrayOfByteBuffer, paramInt1, paramInt2, this.protocol.getApplicationDataLimit());
        if (m > 0) {
          RecordPreview recordPreview = this.protocol.previewOutputRecord(m);
          int n = recordPreview.getContentLimit();
          int i1 = recordPreview.getRecordSize();
          if (paramByteBuffer.remaining() < i1)
            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0); 
          byte[] arrayOfByte = new byte[n];
          int i2;
          for (i2 = 0; i2 < paramInt2 && k < n; i2++) {
            ByteBuffer byteBuffer = paramArrayOfByteBuffer[paramInt1 + i2];
            int i3 = Math.min(byteBuffer.remaining(), n - k);
            if (i3 > 0) {
              byteBuffer.get(arrayOfByte, k, i3);
              k += i3;
            } 
          } 
          this.protocol.writeApplicationData(arrayOfByte, 0, k);
          i = this.protocol.getAvailableOutputBytes();
          assert i <= i1;
          i2 = this.protocol.readOutput(paramByteBuffer, i);
          assert i2 == i;
        } 
        return new SSLEngineResult(getStatus(), SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, k, i);
      } catch (IOException iOException) {
        throw new SSLException(iOException);
      } 
    } 
    if (this.protocol.isHandshaking())
      return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, i); 
    SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    if (!this.returnedFinished && this.protocolPeer.isHandshakeComplete()) {
      this.returnedFinished = true;
      handshakeStatus = SSLEngineResult.HandshakeStatus.FINISHED;
    } 
    return new SSLEngineResult(getStatus(), handshakeStatus, 0, i);
  }
  
  public String getPeerHost() {
    return super.getPeerHost();
  }
  
  public String getPeerHostSNI() {
    return super.getPeerHost();
  }
  
  public int getPeerPort() {
    return super.getPeerPort();
  }
  
  public synchronized void notifyHandshakeComplete(ProvSSLConnection paramProvSSLConnection) {
    if (null != this.handshakeSession) {
      if (!this.handshakeSession.isValid())
        paramProvSSLConnection.getSession().invalidate(); 
      this.handshakeSession.getJsseSecurityParameters().clear();
    } 
    this.handshakeSession = null;
    this.connection = paramProvSSLConnection;
  }
  
  public synchronized void notifyHandshakeSession(ProvSSLSessionContext paramProvSSLSessionContext, SecurityParameters paramSecurityParameters, JsseSecurityParameters paramJsseSecurityParameters, ProvSSLSession paramProvSSLSession) {
    String str = getPeerHost();
    int i = getPeerPort();
    if (null != paramProvSSLSession) {
      this.handshakeSession = (ProvSSLSessionHandshake)new ProvSSLSessionResumed(paramProvSSLSessionContext, str, i, paramSecurityParameters, paramJsseSecurityParameters, paramProvSSLSession.getTlsSession(), paramProvSSLSession.getJsseSessionParameters());
    } else {
      this.handshakeSession = new ProvSSLSessionHandshake(paramProvSSLSessionContext, str, i, paramSecurityParameters, paramJsseSecurityParameters);
    } 
  }
  
  public synchronized String selectApplicationProtocol(List<String> paramList) {
    return this.sslParameters.getEngineAPSelector().select(this, paramList);
  }
  
  ProvSSLSession getSessionImpl() {
    return (null == this.connection) ? ProvSSLSession.NULL_SESSION : this.connection.getSession();
  }
  
  private RecordPreview getRecordPreview(ByteBuffer paramByteBuffer) throws IOException {
    if (paramByteBuffer.remaining() < 5)
      return null; 
    byte[] arrayOfByte = new byte[5];
    int i = paramByteBuffer.position();
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer.position(i);
    return this.protocol.previewInputRecord(arrayOfByte);
  }
  
  private SSLEngineResult.Status getStatus() {
    return this.protocol.isClosed() ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK;
  }
  
  private int getTotalRemaining(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
    int i = 0;
    for (byte b = 0; b < paramInt2; b++) {
      ByteBuffer byteBuffer = paramArrayOfByteBuffer[paramInt1 + b];
      int j = byteBuffer.remaining();
      if (j >= paramInt3 - i)
        return paramInt3; 
      i += j;
    } 
    return i;
  }
  
  private boolean hasInsufficientSpace(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
    return (getTotalRemaining(paramArrayOfByteBuffer, paramInt1, paramInt2, paramInt3) < paramInt3);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLEngine.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */