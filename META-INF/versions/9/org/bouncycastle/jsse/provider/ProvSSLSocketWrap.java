package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCApplicationProtocolSelector;
import org.bouncycastle.jsse.BCExtendedSSLSession;
import org.bouncycastle.jsse.BCSSLConnection;
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
import org.bouncycastle.jsse.provider.ProvSSLSocketBase;
import org.bouncycastle.jsse.provider.ProvTlsClient;
import org.bouncycastle.jsse.provider.ProvTlsClientProtocol;
import org.bouncycastle.jsse.provider.ProvTlsManager;
import org.bouncycastle.jsse.provider.ProvTlsPeer;
import org.bouncycastle.jsse.provider.ProvTlsServer;
import org.bouncycastle.jsse.provider.ProvTlsServerProtocol;
import org.bouncycastle.jsse.provider.SSLParametersUtil;
import org.bouncycastle.tls.SecurityParameters;
import org.bouncycastle.tls.TlsClient;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.TlsServer;

class ProvSSLSocketWrap extends ProvSSLSocketBase implements ProvTlsManager {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.ProvSSLSocketWrap.class.getName());
  
  protected final AppDataInput appDataIn = new AppDataInput(this);
  
  protected final AppDataOutput appDataOut = new AppDataOutput(this);
  
  protected final ContextData contextData;
  
  protected final Socket wrapSocket;
  
  protected final InputStream consumed;
  
  protected final boolean autoClose;
  
  protected final ProvSSLParameters sslParameters;
  
  protected String peerHost = null;
  
  protected String peerHostSNI = null;
  
  protected boolean enableSessionCreation = true;
  
  protected boolean useClientMode;
  
  protected TlsProtocol protocol = null;
  
  protected ProvTlsPeer protocolPeer = null;
  
  protected ProvSSLConnection connection = null;
  
  protected ProvSSLSessionHandshake handshakeSession = null;
  
  private static Socket checkSocket(Socket paramSocket) throws SocketException {
    if (paramSocket == null)
      throw new NullPointerException("'s' cannot be null"); 
    if (!paramSocket.isConnected())
      throw new SocketException("'s' is not a connected socket"); 
    return paramSocket;
  }
  
  protected ProvSSLSocketWrap(ContextData paramContextData, Socket paramSocket, InputStream paramInputStream, boolean paramBoolean) throws IOException {
    this.contextData = paramContextData;
    this.wrapSocket = checkSocket(paramSocket);
    this.consumed = paramInputStream;
    this.autoClose = paramBoolean;
    this.useClientMode = false;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
    notifyConnected();
  }
  
  protected ProvSSLSocketWrap(ContextData paramContextData, Socket paramSocket, String paramString, int paramInt, boolean paramBoolean) throws IOException {
    this.contextData = paramContextData;
    this.wrapSocket = checkSocket(paramSocket);
    this.consumed = null;
    this.peerHost = paramString;
    this.autoClose = paramBoolean;
    this.useClientMode = true;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
    notifyConnected();
  }
  
  public ContextData getContextData() {
    return this.contextData;
  }
  
  public void bind(SocketAddress paramSocketAddress) throws IOException {
    throw new SocketException("Wrapped socket should already be bound");
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws IOException {
    try {
      this.contextData.getX509TrustManager().checkClientTrusted((X509Certificate[])paramArrayOfX509Certificate.clone(), paramString, (Socket)this);
    } catch (CertificateException certificateException) {
      throw new TlsFatalAlert((short)46, certificateException);
    } 
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) throws IOException {
    try {
      this.contextData.getX509TrustManager().checkServerTrusted((X509Certificate[])paramArrayOfX509Certificate.clone(), paramString, (Socket)this);
    } catch (CertificateException certificateException) {
      throw new TlsFatalAlert((short)46, certificateException);
    } 
  }
  
  public BCX509Key chooseClientKey(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal) {
    return getContextData().getX509KeyManager().chooseClientKeyBC(paramArrayOfString, (Principal[])JsseUtils.clone((Object[])paramArrayOfPrincipal), (Socket)this);
  }
  
  public BCX509Key chooseServerKey(String[] paramArrayOfString, Principal[] paramArrayOfPrincipal) {
    return getContextData().getX509KeyManager().chooseServerKeyBC(paramArrayOfString, (Principal[])JsseUtils.clone((Object[])paramArrayOfPrincipal), (Socket)this);
  }
  
  public synchronized void close() throws IOException {
    if (this.protocol == null) {
      closeSocket();
    } else {
      this.protocol.close();
    } 
  }
  
  protected void closeSocket() throws IOException {
    if (this.autoClose) {
      this.wrapSocket.close();
    } else if (this.protocol != null) {
    
    } 
  }
  
  public void connect(SocketAddress paramSocketAddress, int paramInt) throws IOException {
    throw new SocketException("Wrapped socket should already be connected");
  }
  
  public synchronized String getApplicationProtocol() {
    return (null == this.connection) ? null : this.connection.getApplicationProtocol();
  }
  
  public synchronized BCApplicationProtocolSelector<SSLSocket> getBCHandshakeApplicationProtocolSelector() {
    return this.sslParameters.getSocketAPSelector();
  }
  
  public synchronized BCExtendedSSLSession getBCHandshakeSession() {
    return (BCExtendedSSLSession)this.handshakeSession;
  }
  
  public BCExtendedSSLSession getBCSession() {
    return (BCExtendedSSLSession)getSessionImpl();
  }
  
  public SocketChannel getChannel() {
    return this.wrapSocket.getChannel();
  }
  
  public synchronized BCSSLConnection getConnection() {
    try {
      handshakeIfNecessary(false);
    } catch (Exception exception) {
      LOG.log(Level.FINE, "Failed to establish connection", exception);
    } 
    return (BCSSLConnection)this.connection;
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
  
  public InetAddress getInetAddress() {
    return this.wrapSocket.getInetAddress();
  }
  
  public InputStream getInputStream() throws IOException {
    return (InputStream)this.appDataIn;
  }
  
  public boolean getKeepAlive() throws SocketException {
    return this.wrapSocket.getKeepAlive();
  }
  
  public InetAddress getLocalAddress() {
    return this.wrapSocket.getLocalAddress();
  }
  
  public int getLocalPort() {
    return this.wrapSocket.getLocalPort();
  }
  
  public SocketAddress getLocalSocketAddress() {
    return this.wrapSocket.getLocalSocketAddress();
  }
  
  public synchronized boolean getNeedClientAuth() {
    return this.sslParameters.getNeedClientAuth();
  }
  
  public OutputStream getOutputStream() throws IOException {
    return (OutputStream)this.appDataOut;
  }
  
  public int getPort() {
    return this.wrapSocket.getPort();
  }
  
  public int getReceiveBufferSize() throws SocketException {
    return this.wrapSocket.getReceiveBufferSize();
  }
  
  public SocketAddress getRemoteSocketAddress() {
    return this.wrapSocket.getRemoteSocketAddress();
  }
  
  public boolean getReuseAddress() throws SocketException {
    return this.wrapSocket.getReuseAddress();
  }
  
  public int getSendBufferSize() throws SocketException {
    return this.wrapSocket.getSendBufferSize();
  }
  
  public SSLSession getSession() {
    return getSessionImpl().getExportSSLSession();
  }
  
  public int getSoLinger() throws SocketException {
    return this.wrapSocket.getSoLinger();
  }
  
  public int getSoTimeout() throws SocketException {
    return this.wrapSocket.getSoTimeout();
  }
  
  public synchronized BCSSLParameters getParameters() {
    return SSLParametersUtil.getParameters(this.sslParameters);
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
  
  public boolean getTcpNoDelay() throws SocketException {
    return this.wrapSocket.getTcpNoDelay();
  }
  
  public int getTrafficClass() throws SocketException {
    return this.wrapSocket.getTrafficClass();
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
  
  public boolean isBound() {
    return this.wrapSocket.isBound();
  }
  
  public boolean isConnected() {
    return this.wrapSocket.isConnected();
  }
  
  public synchronized boolean isClosed() {
    return (this.protocol != null && this.protocol.isClosed());
  }
  
  public boolean isInputShutdown() {
    return this.wrapSocket.isInputShutdown();
  }
  
  public boolean isOutputShutdown() {
    return this.wrapSocket.isOutputShutdown();
  }
  
  public synchronized void setBCHandshakeApplicationProtocolSelector(BCApplicationProtocolSelector<SSLSocket> paramBCApplicationProtocolSelector) {
    this.sslParameters.setSocketAPSelector(paramBCApplicationProtocolSelector);
  }
  
  public synchronized void setBCSessionToResume(BCExtendedSSLSession paramBCExtendedSSLSession) {
    if (null == paramBCExtendedSSLSession)
      throw new NullPointerException("'session' cannot be null"); 
    if (!(paramBCExtendedSSLSession instanceof ProvSSLSession))
      throw new IllegalArgumentException("Session-to-resume must be a session returned from 'getBCSession'"); 
    if (null != this.protocol)
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
  
  public synchronized void setHost(String paramString) {
    this.peerHost = paramString;
  }
  
  public void setKeepAlive(boolean paramBoolean) throws SocketException {
    this.wrapSocket.setKeepAlive(paramBoolean);
  }
  
  public synchronized void setNeedClientAuth(boolean paramBoolean) {
    this.sslParameters.setNeedClientAuth(paramBoolean);
  }
  
  public synchronized void setParameters(BCSSLParameters paramBCSSLParameters) {
    SSLParametersUtil.setParameters(this.sslParameters, paramBCSSLParameters);
  }
  
  public void setPerformancePreferences(int paramInt1, int paramInt2, int paramInt3) {
    this.wrapSocket.setPerformancePreferences(paramInt1, paramInt2, paramInt3);
  }
  
  public void setReceiveBufferSize(int paramInt) throws SocketException {
    this.wrapSocket.setReceiveBufferSize(paramInt);
  }
  
  public void setReuseAddress(boolean paramBoolean) throws SocketException {
    this.wrapSocket.setReuseAddress(paramBoolean);
  }
  
  public void setSendBufferSize(int paramInt) throws SocketException {
    this.wrapSocket.setSendBufferSize(paramInt);
  }
  
  public void setSoLinger(boolean paramBoolean, int paramInt) throws SocketException {
    this.wrapSocket.setSoLinger(paramBoolean, paramInt);
  }
  
  public void setSoTimeout(int paramInt) throws SocketException {
    this.wrapSocket.setSoTimeout(paramInt);
  }
  
  public synchronized void setSSLParameters(SSLParameters paramSSLParameters) {
    SSLParametersUtil.setSSLParameters(this.sslParameters, paramSSLParameters);
  }
  
  public void setTcpNoDelay(boolean paramBoolean) throws SocketException {
    this.wrapSocket.setTcpNoDelay(paramBoolean);
  }
  
  public void setTrafficClass(int paramInt) throws SocketException {
    this.wrapSocket.setTrafficClass(paramInt);
  }
  
  public synchronized void setUseClientMode(boolean paramBoolean) {
    if (null != this.protocol)
      throw new IllegalArgumentException("Mode cannot be changed after the initial handshake has begun"); 
    if (this.useClientMode != paramBoolean) {
      this.contextData.getContext().updateDefaultSSLParameters(this.sslParameters, paramBoolean);
      this.useClientMode = paramBoolean;
    } 
  }
  
  public synchronized void setWantClientAuth(boolean paramBoolean) {
    this.sslParameters.setWantClientAuth(paramBoolean);
  }
  
  public void shutdownInput() throws IOException {
    this.wrapSocket.shutdownInput();
  }
  
  public void shutdownOutput() throws IOException {
    this.wrapSocket.shutdownOutput();
  }
  
  public synchronized void startHandshake() throws IOException {
    startHandshake(true);
  }
  
  protected void startHandshake(boolean paramBoolean) throws IOException {
    if (this.protocol == null) {
      InputStream inputStream = this.wrapSocket.getInputStream();
      if (this.consumed != null)
        inputStream = new SequenceInputStream(this.consumed, inputStream); 
      OutputStream outputStream = this.wrapSocket.getOutputStream();
      if (this.useClientMode) {
        ProvTlsClientProtocol provTlsClientProtocol = new ProvTlsClientProtocol(inputStream, outputStream, this.socketCloser);
        provTlsClientProtocol.setResumableHandshake(paramBoolean);
        this.protocol = (TlsProtocol)provTlsClientProtocol;
        ProvTlsClient provTlsClient = new ProvTlsClient(this, this.sslParameters);
        this.protocolPeer = (ProvTlsPeer)provTlsClient;
        provTlsClientProtocol.connect((TlsClient)provTlsClient);
      } else {
        ProvTlsServerProtocol provTlsServerProtocol = new ProvTlsServerProtocol(inputStream, outputStream, this.socketCloser);
        provTlsServerProtocol.setResumableHandshake(paramBoolean);
        this.protocol = (TlsProtocol)provTlsServerProtocol;
        ProvTlsServer provTlsServer = new ProvTlsServer(this, this.sslParameters);
        this.protocolPeer = (ProvTlsPeer)provTlsServer;
        provTlsServerProtocol.accept((TlsServer)provTlsServer);
      } 
    } else if (this.protocol.isHandshaking()) {
      this.protocol.setResumableHandshake(paramBoolean);
      this.protocol.resumeHandshake();
    } else {
      throw new UnsupportedOperationException("Renegotiation not supported");
    } 
  }
  
  public String toString() {
    return this.wrapSocket.toString();
  }
  
  public synchronized String getPeerHost() {
    return this.peerHost;
  }
  
  public synchronized String getPeerHostSNI() {
    return this.peerHostSNI;
  }
  
  public int getPeerPort() {
    return getPort();
  }
  
  public synchronized void notifyHandshakeComplete(ProvSSLConnection paramProvSSLConnection) {
    if (null != this.handshakeSession) {
      if (!this.handshakeSession.isValid())
        paramProvSSLConnection.getSession().invalidate(); 
      this.handshakeSession.getJsseSecurityParameters().clear();
    } 
    this.handshakeSession = null;
    this.connection = paramProvSSLConnection;
    notifyHandshakeCompletedListeners((paramProvSSLConnection.getSession()).exportSSLSession);
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
    return this.sslParameters.getSocketAPSelector().select(this, paramList);
  }
  
  synchronized ProvSSLSession getSessionImpl() {
    getConnection();
    return (null == this.connection) ? ProvSSLSession.NULL_SESSION : this.connection.getSession();
  }
  
  synchronized void handshakeIfNecessary(boolean paramBoolean) throws IOException {
    if (this.protocol == null || this.protocol.isHandshaking())
      startHandshake(paramBoolean); 
  }
  
  synchronized void notifyConnected() {
    if (JsseUtils.isNameSpecified(this.peerHost)) {
      this.peerHostSNI = this.peerHost;
      return;
    } 
    InetAddress inetAddress = getInetAddress();
    if (null == inetAddress) {
      this.peerHostSNI = null;
      return;
    } 
    if (this.useClientMode && provAssumeOriginalHostName) {
      String str = inetAddress.getHostName();
      this.peerHost = str;
      this.peerHostSNI = str;
      return;
    } 
    if (!this.useClientMode) {
      this.peerHost = inetAddress.getHostAddress();
    } else if (provJdkTlsTrustNameService) {
      this.peerHost = inetAddress.getHostName();
    } else {
      this.peerHost = null;
    } 
    this.peerHostSNI = null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvSSLSocketWrap.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */