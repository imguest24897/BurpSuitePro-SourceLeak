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
import java.util.Set;

public class Zl79 extends Socket {
  private final Socket ZB;
  
  public Zl79(Socket paramSocket) {
    this.ZB = paramSocket;
  }
  
  public void connect(SocketAddress paramSocketAddress) throws IOException {
    this.ZB.connect(paramSocketAddress);
  }
  
  public void connect(SocketAddress paramSocketAddress, int paramInt) throws IOException {
    this.ZB.connect(paramSocketAddress, paramInt);
  }
  
  public void bind(SocketAddress paramSocketAddress) throws IOException {
    this.ZB.bind(paramSocketAddress);
  }
  
  public InetAddress getInetAddress() {
    return this.ZB.getInetAddress();
  }
  
  public InetAddress getLocalAddress() {
    return this.ZB.getLocalAddress();
  }
  
  public int getPort() {
    return this.ZB.getPort();
  }
  
  public int getLocalPort() {
    return this.ZB.getLocalPort();
  }
  
  public SocketAddress getRemoteSocketAddress() {
    return this.ZB.getRemoteSocketAddress();
  }
  
  public SocketAddress getLocalSocketAddress() {
    return this.ZB.getLocalSocketAddress();
  }
  
  public SocketChannel getChannel() {
    return this.ZB.getChannel();
  }
  
  public InputStream getInputStream() throws IOException {
    return this.ZB.getInputStream();
  }
  
  public OutputStream getOutputStream() throws IOException {
    return this.ZB.getOutputStream();
  }
  
  public void setTcpNoDelay(boolean paramBoolean) throws SocketException {
    this.ZB.setTcpNoDelay(paramBoolean);
  }
  
  public boolean getTcpNoDelay() throws SocketException {
    return this.ZB.getTcpNoDelay();
  }
  
  public void setSoLinger(boolean paramBoolean, int paramInt) throws SocketException {
    this.ZB.setSoLinger(paramBoolean, paramInt);
  }
  
  public int getSoLinger() throws SocketException {
    return this.ZB.getSoLinger();
  }
  
  public void sendUrgentData(int paramInt) throws IOException {
    this.ZB.sendUrgentData(paramInt);
  }
  
  public void setOOBInline(boolean paramBoolean) throws SocketException {
    this.ZB.setOOBInline(paramBoolean);
  }
  
  public boolean getOOBInline() throws SocketException {
    return this.ZB.getOOBInline();
  }
  
  public synchronized void setSoTimeout(int paramInt) throws SocketException {
    this.ZB.setSoTimeout(paramInt);
  }
  
  public synchronized int getSoTimeout() throws SocketException {
    return this.ZB.getSoTimeout();
  }
  
  public synchronized void setSendBufferSize(int paramInt) throws SocketException {
    this.ZB.setSendBufferSize(paramInt);
  }
  
  public synchronized int getSendBufferSize() throws SocketException {
    return this.ZB.getSendBufferSize();
  }
  
  public synchronized void setReceiveBufferSize(int paramInt) throws SocketException {
    this.ZB.setReceiveBufferSize(paramInt);
  }
  
  public synchronized int getReceiveBufferSize() throws SocketException {
    return this.ZB.getReceiveBufferSize();
  }
  
  public void setKeepAlive(boolean paramBoolean) throws SocketException {
    this.ZB.setKeepAlive(paramBoolean);
  }
  
  public boolean getKeepAlive() throws SocketException {
    return this.ZB.getKeepAlive();
  }
  
  public void setTrafficClass(int paramInt) throws SocketException {
    this.ZB.setTrafficClass(paramInt);
  }
  
  public int getTrafficClass() throws SocketException {
    return this.ZB.getTrafficClass();
  }
  
  public void setReuseAddress(boolean paramBoolean) throws SocketException {
    this.ZB.setReuseAddress(paramBoolean);
  }
  
  public boolean getReuseAddress() throws SocketException {
    return this.ZB.getReuseAddress();
  }
  
  public synchronized void close() throws IOException {
    this.ZB.close();
  }
  
  public void shutdownInput() throws IOException {
    this.ZB.shutdownInput();
  }
  
  public void shutdownOutput() throws IOException {
    this.ZB.shutdownOutput();
  }
  
  public String toString() {
    return this.ZB.toString();
  }
  
  public boolean isConnected() {
    return this.ZB.isConnected();
  }
  
  public boolean isBound() {
    return this.ZB.isBound();
  }
  
  public boolean isClosed() {
    return this.ZB.isClosed();
  }
  
  public boolean isInputShutdown() {
    return this.ZB.isInputShutdown();
  }
  
  public boolean isOutputShutdown() {
    return this.ZB.isOutputShutdown();
  }
  
  public void setPerformancePreferences(int paramInt1, int paramInt2, int paramInt3) {
    this.ZB.setPerformancePreferences(paramInt1, paramInt2, paramInt3);
  }
  
  public <T> Socket setOption(SocketOption<T> paramSocketOption, T paramT) throws IOException {
    return this.ZB.setOption(paramSocketOption, paramT);
  }
  
  public <T> T getOption(SocketOption<T> paramSocketOption) throws IOException {
    return this.ZB.getOption(paramSocketOption);
  }
  
  public Set<SocketOption<?>> supportedOptions() {
    return this.ZB.supportedOptions();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl79.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */