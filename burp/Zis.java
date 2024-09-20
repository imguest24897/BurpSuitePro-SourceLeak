package burp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public class Zis extends SSLSocket {
  private final SSLSocket ZW;
  
  private final Zli3 ZD;
  
  public Zis(SSLSocket paramSSLSocket, Zli3 paramZli3) {
    this.ZW = paramSSLSocket;
    this.ZD = paramZli3;
  }
  
  public void connect(SocketAddress paramSocketAddress) throws IOException {
    this.ZW.connect(paramSocketAddress);
  }
  
  public void connect(SocketAddress paramSocketAddress, int paramInt) throws IOException {
    this.ZW.connect(paramSocketAddress, paramInt);
  }
  
  public void bind(SocketAddress paramSocketAddress) throws IOException {
    this.ZW.bind(paramSocketAddress);
  }
  
  public InetAddress getInetAddress() {
    return this.ZW.getInetAddress();
  }
  
  public InetAddress getLocalAddress() {
    return this.ZW.getLocalAddress();
  }
  
  public int getPort() {
    return this.ZW.getPort();
  }
  
  public int getLocalPort() {
    return this.ZW.getLocalPort();
  }
  
  public SocketAddress getRemoteSocketAddress() {
    return this.ZW.getRemoteSocketAddress();
  }
  
  public SocketAddress getLocalSocketAddress() {
    return this.ZW.getLocalSocketAddress();
  }
  
  public SocketChannel getChannel() {
    return this.ZW.getChannel();
  }
  
  public InputStream getInputStream() {
    return new ByteArrayInputStream(this.ZD.Zj());
  }
  
  public OutputStream getOutputStream() {
    return new Zma4(this.ZD);
  }
  
  public void setTcpNoDelay(boolean paramBoolean) throws SocketException {
    this.ZW.setTcpNoDelay(paramBoolean);
  }
  
  public boolean getTcpNoDelay() throws SocketException {
    return this.ZW.getTcpNoDelay();
  }
  
  public void setSoLinger(boolean paramBoolean, int paramInt) throws SocketException {
    this.ZW.setSoLinger(paramBoolean, paramInt);
  }
  
  public int getSoLinger() throws SocketException {
    return this.ZW.getSoLinger();
  }
  
  public void sendUrgentData(int paramInt) throws IOException {
    this.ZW.sendUrgentData(paramInt);
  }
  
  public void setOOBInline(boolean paramBoolean) throws SocketException {
    this.ZW.setOOBInline(paramBoolean);
  }
  
  public boolean getOOBInline() throws SocketException {
    return this.ZW.getOOBInline();
  }
  
  public synchronized void setSoTimeout(int paramInt) throws SocketException {
    this.ZW.setSoTimeout(paramInt);
  }
  
  public synchronized int getSoTimeout() throws SocketException {
    return this.ZW.getSoTimeout();
  }
  
  public synchronized void setSendBufferSize(int paramInt) throws SocketException {
    this.ZW.setSendBufferSize(paramInt);
  }
  
  public synchronized int getSendBufferSize() throws SocketException {
    return this.ZW.getSendBufferSize();
  }
  
  public synchronized void setReceiveBufferSize(int paramInt) throws SocketException {
    this.ZW.setReceiveBufferSize(paramInt);
  }
  
  public synchronized int getReceiveBufferSize() throws SocketException {
    return this.ZW.getReceiveBufferSize();
  }
  
  public void setKeepAlive(boolean paramBoolean) throws SocketException {
    this.ZW.setKeepAlive(paramBoolean);
  }
  
  public boolean getKeepAlive() throws SocketException {
    return this.ZW.getKeepAlive();
  }
  
  public void setTrafficClass(int paramInt) throws SocketException {
    this.ZW.setTrafficClass(paramInt);
  }
  
  public int getTrafficClass() throws SocketException {
    return this.ZW.getTrafficClass();
  }
  
  public void setReuseAddress(boolean paramBoolean) throws SocketException {
    this.ZW.setReuseAddress(paramBoolean);
  }
  
  public boolean getReuseAddress() throws SocketException {
    return this.ZW.getReuseAddress();
  }
  
  public synchronized void close() {
    this.ZD.Zw();
  }
  
  public void shutdownInput() throws IOException {
    this.ZW.shutdownInput();
  }
  
  public void shutdownOutput() throws IOException {
    this.ZW.shutdownOutput();
  }
  
  public String toString() {
    return this.ZW.toString();
  }
  
  public boolean isConnected() {
    return this.ZW.isConnected();
  }
  
  public boolean isBound() {
    return this.ZW.isBound();
  }
  
  public boolean isClosed() {
    return this.ZW.isClosed();
  }
  
  public boolean isInputShutdown() {
    return this.ZW.isInputShutdown();
  }
  
  public boolean isOutputShutdown() {
    return this.ZW.isOutputShutdown();
  }
  
  public void setPerformancePreferences(int paramInt1, int paramInt2, int paramInt3) {
    this.ZW.setPerformancePreferences(paramInt1, paramInt2, paramInt3);
  }
  
  public <T> Socket setOption(SocketOption<T> paramSocketOption, T paramT) throws IOException {
    return this.ZW.setOption(paramSocketOption, paramT);
  }
  
  public <T> T getOption(SocketOption<T> paramSocketOption) throws IOException {
    return this.ZW.getOption(paramSocketOption);
  }
  
  public Set<SocketOption<?>> supportedOptions() {
    return this.ZW.supportedOptions();
  }
  
  public SSLSession getHandshakeSession() {
    return this.ZW.getHandshakeSession();
  }
  
  public SSLParameters getSSLParameters() {
    return this.ZW.getSSLParameters();
  }
  
  public void setSSLParameters(SSLParameters paramSSLParameters) {
    this.ZW.setSSLParameters(paramSSLParameters);
  }
  
  public String[] getSupportedCipherSuites() {
    return this.ZW.getSupportedCipherSuites();
  }
  
  public String[] getEnabledCipherSuites() {
    return this.ZW.getEnabledCipherSuites();
  }
  
  public void setEnabledCipherSuites(String[] paramArrayOfString) {
    this.ZW.setEnabledCipherSuites(paramArrayOfString);
  }
  
  public String[] getSupportedProtocols() {
    return this.ZW.getSupportedProtocols();
  }
  
  public String[] getEnabledProtocols() {
    return this.ZW.getEnabledProtocols();
  }
  
  public void setEnabledProtocols(String[] paramArrayOfString) {
    this.ZW.setEnabledProtocols(paramArrayOfString);
  }
  
  public SSLSession getSession() {
    return this.ZW.getSession();
  }
  
  public void addHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener) {
    this.ZW.addHandshakeCompletedListener(paramHandshakeCompletedListener);
  }
  
  public void removeHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener) {
    this.ZW.removeHandshakeCompletedListener(paramHandshakeCompletedListener);
  }
  
  public void startHandshake() throws IOException {
    this.ZW.startHandshake();
  }
  
  public void setUseClientMode(boolean paramBoolean) {
    this.ZW.setUseClientMode(paramBoolean);
  }
  
  public boolean getUseClientMode() {
    return this.ZW.getUseClientMode();
  }
  
  public void setNeedClientAuth(boolean paramBoolean) {
    this.ZW.setNeedClientAuth(paramBoolean);
  }
  
  public boolean getNeedClientAuth() {
    return this.ZW.getNeedClientAuth();
  }
  
  public void setWantClientAuth(boolean paramBoolean) {
    this.ZW.setWantClientAuth(paramBoolean);
  }
  
  public boolean getWantClientAuth() {
    return this.ZW.getWantClientAuth();
  }
  
  public void setEnableSessionCreation(boolean paramBoolean) {
    this.ZW.setEnableSessionCreation(paramBoolean);
  }
  
  public boolean getEnableSessionCreation() {
    return this.ZW.getEnableSessionCreation();
  }
  
  public String getApplicationProtocol() {
    return this.ZW.getApplicationProtocol();
  }
  
  public String getHandshakeApplicationProtocol() {
    return this.ZW.getHandshakeApplicationProtocol();
  }
  
  public void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> paramBiFunction) {
    this.ZW.setHandshakeApplicationProtocolSelector(paramBiFunction);
  }
  
  public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
    return this.ZW.getHandshakeApplicationProtocolSelector();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */