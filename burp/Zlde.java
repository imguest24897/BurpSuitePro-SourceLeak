package burp;

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

public class Zlde extends SSLSocket {
  private final SSLSocket Zy;
  
  public Zlde(SSLSocket paramSSLSocket) {
    this.Zy = paramSSLSocket;
  }
  
  public SSLSession getHandshakeSession() {
    return this.Zy.getHandshakeSession();
  }
  
  public SSLParameters getSSLParameters() {
    return this.Zy.getSSLParameters();
  }
  
  public void setSSLParameters(SSLParameters paramSSLParameters) {
    this.Zy.setSSLParameters(paramSSLParameters);
  }
  
  public String getApplicationProtocol() {
    return this.Zy.getApplicationProtocol();
  }
  
  public String getHandshakeApplicationProtocol() {
    return this.Zy.getHandshakeApplicationProtocol();
  }
  
  public void setHandshakeApplicationProtocolSelector(BiFunction<SSLSocket, List<String>, String> paramBiFunction) {
    this.Zy.setHandshakeApplicationProtocolSelector(paramBiFunction);
  }
  
  public BiFunction<SSLSocket, List<String>, String> getHandshakeApplicationProtocolSelector() {
    return this.Zy.getHandshakeApplicationProtocolSelector();
  }
  
  public void connect(SocketAddress paramSocketAddress) throws IOException {
    this.Zy.connect(paramSocketAddress);
  }
  
  public void connect(SocketAddress paramSocketAddress, int paramInt) throws IOException {
    this.Zy.connect(paramSocketAddress, paramInt);
  }
  
  public void bind(SocketAddress paramSocketAddress) throws IOException {
    this.Zy.bind(paramSocketAddress);
  }
  
  public InetAddress getInetAddress() {
    return this.Zy.getInetAddress();
  }
  
  public InetAddress getLocalAddress() {
    return this.Zy.getLocalAddress();
  }
  
  public int getPort() {
    return this.Zy.getPort();
  }
  
  public int getLocalPort() {
    return this.Zy.getLocalPort();
  }
  
  public SocketAddress getRemoteSocketAddress() {
    return this.Zy.getRemoteSocketAddress();
  }
  
  public SocketAddress getLocalSocketAddress() {
    return this.Zy.getLocalSocketAddress();
  }
  
  public SocketChannel getChannel() {
    return this.Zy.getChannel();
  }
  
  public InputStream getInputStream() throws IOException {
    return this.Zy.getInputStream();
  }
  
  public OutputStream getOutputStream() throws IOException {
    return this.Zy.getOutputStream();
  }
  
  public void setTcpNoDelay(boolean paramBoolean) throws SocketException {
    this.Zy.setTcpNoDelay(paramBoolean);
  }
  
  public boolean getTcpNoDelay() throws SocketException {
    return this.Zy.getTcpNoDelay();
  }
  
  public void setSoLinger(boolean paramBoolean, int paramInt) throws SocketException {
    this.Zy.setSoLinger(paramBoolean, paramInt);
  }
  
  public int getSoLinger() throws SocketException {
    return this.Zy.getSoLinger();
  }
  
  public void sendUrgentData(int paramInt) throws IOException {
    this.Zy.sendUrgentData(paramInt);
  }
  
  public void setOOBInline(boolean paramBoolean) throws SocketException {
    this.Zy.setOOBInline(paramBoolean);
  }
  
  public boolean getOOBInline() throws SocketException {
    return this.Zy.getOOBInline();
  }
  
  public synchronized void setSoTimeout(int paramInt) throws SocketException {
    this.Zy.setSoTimeout(paramInt);
  }
  
  public synchronized int getSoTimeout() throws SocketException {
    return this.Zy.getSoTimeout();
  }
  
  public synchronized void setSendBufferSize(int paramInt) throws SocketException {
    this.Zy.setSendBufferSize(paramInt);
  }
  
  public synchronized int getSendBufferSize() throws SocketException {
    return this.Zy.getSendBufferSize();
  }
  
  public synchronized void setReceiveBufferSize(int paramInt) throws SocketException {
    this.Zy.setReceiveBufferSize(paramInt);
  }
  
  public synchronized int getReceiveBufferSize() throws SocketException {
    return this.Zy.getReceiveBufferSize();
  }
  
  public void setKeepAlive(boolean paramBoolean) throws SocketException {
    this.Zy.setKeepAlive(paramBoolean);
  }
  
  public boolean getKeepAlive() throws SocketException {
    return this.Zy.getKeepAlive();
  }
  
  public void setTrafficClass(int paramInt) throws SocketException {
    this.Zy.setTrafficClass(paramInt);
  }
  
  public int getTrafficClass() throws SocketException {
    return this.Zy.getTrafficClass();
  }
  
  public void setReuseAddress(boolean paramBoolean) throws SocketException {
    this.Zy.setReuseAddress(paramBoolean);
  }
  
  public boolean getReuseAddress() throws SocketException {
    return this.Zy.getReuseAddress();
  }
  
  public synchronized void close() throws IOException {
    this.Zy.close();
  }
  
  public void shutdownInput() throws IOException {
    this.Zy.shutdownInput();
  }
  
  public void shutdownOutput() throws IOException {
    this.Zy.shutdownOutput();
  }
  
  public String toString() {
    return this.Zy.toString();
  }
  
  public boolean isConnected() {
    return this.Zy.isConnected();
  }
  
  public boolean isBound() {
    return this.Zy.isBound();
  }
  
  public boolean isClosed() {
    return this.Zy.isClosed();
  }
  
  public boolean isInputShutdown() {
    return this.Zy.isInputShutdown();
  }
  
  public boolean isOutputShutdown() {
    return this.Zy.isOutputShutdown();
  }
  
  public void setPerformancePreferences(int paramInt1, int paramInt2, int paramInt3) {
    this.Zy.setPerformancePreferences(paramInt1, paramInt2, paramInt3);
  }
  
  public <T> Socket setOption(SocketOption<T> paramSocketOption, T paramT) throws IOException {
    return this.Zy.setOption(paramSocketOption, paramT);
  }
  
  public <T> T getOption(SocketOption<T> paramSocketOption) throws IOException {
    return this.Zy.getOption(paramSocketOption);
  }
  
  public Set<SocketOption<?>> supportedOptions() {
    return this.Zy.supportedOptions();
  }
  
  public String[] getSupportedCipherSuites() {
    return this.Zy.getSupportedCipherSuites();
  }
  
  public String[] getEnabledCipherSuites() {
    return this.Zy.getEnabledCipherSuites();
  }
  
  public void setEnabledCipherSuites(String[] paramArrayOfString) {
    this.Zy.setEnabledCipherSuites(paramArrayOfString);
  }
  
  public String[] getSupportedProtocols() {
    return this.Zy.getSupportedProtocols();
  }
  
  public String[] getEnabledProtocols() {
    return this.Zy.getEnabledProtocols();
  }
  
  public void setEnabledProtocols(String[] paramArrayOfString) {
    this.Zy.setEnabledProtocols(paramArrayOfString);
  }
  
  public SSLSession getSession() {
    return this.Zy.getSession();
  }
  
  public void addHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener) {
    this.Zy.addHandshakeCompletedListener(paramHandshakeCompletedListener);
  }
  
  public void removeHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener) {
    this.Zy.removeHandshakeCompletedListener(paramHandshakeCompletedListener);
  }
  
  public void startHandshake() throws IOException {
    this.Zy.startHandshake();
  }
  
  public void setUseClientMode(boolean paramBoolean) {
    this.Zy.setUseClientMode(paramBoolean);
  }
  
  public boolean getUseClientMode() {
    return this.Zy.getUseClientMode();
  }
  
  public void setNeedClientAuth(boolean paramBoolean) {
    this.Zy.setNeedClientAuth(paramBoolean);
  }
  
  public boolean getNeedClientAuth() {
    return this.Zy.getNeedClientAuth();
  }
  
  public void setWantClientAuth(boolean paramBoolean) {
    this.Zy.setWantClientAuth(paramBoolean);
  }
  
  public boolean getWantClientAuth() {
    return this.Zy.getWantClientAuth();
  }
  
  public void setEnableSessionCreation(boolean paramBoolean) {
    this.Zy.setEnableSessionCreation(paramBoolean);
  }
  
  public boolean getEnableSessionCreation() {
    return this.Zy.getEnableSessionCreation();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlde.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */