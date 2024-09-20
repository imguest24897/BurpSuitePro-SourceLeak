package org.bouncycastle.jsse.provider;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;

class ProvSSLServerSocket extends SSLServerSocket {
  protected final ContextData contextData;
  
  protected final ProvSSLParameters sslParameters;
  
  protected boolean enableSessionCreation = true;
  
  protected boolean useClientMode = false;
  
  protected ProvSSLServerSocket(ContextData paramContextData) throws IOException {
    this.contextData = paramContextData;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
  }
  
  protected ProvSSLServerSocket(ContextData paramContextData, int paramInt) throws IOException {
    super(paramInt);
    this.contextData = paramContextData;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
  }
  
  protected ProvSSLServerSocket(ContextData paramContextData, int paramInt1, int paramInt2) throws IOException {
    super(paramInt1, paramInt2);
    this.contextData = paramContextData;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
  }
  
  protected ProvSSLServerSocket(ContextData paramContextData, int paramInt1, int paramInt2, InetAddress paramInetAddress) throws IOException {
    super(paramInt1, paramInt2, paramInetAddress);
    this.contextData = paramContextData;
    this.sslParameters = paramContextData.getContext().getDefaultSSLParameters(this.useClientMode);
  }
  
  public synchronized Socket accept() throws IOException {
    ProvSSLSocketDirect provSSLSocketDirect = SSLSocketUtil.create(this.contextData, this.enableSessionCreation, this.useClientMode, this.sslParameters.copy());
    implAccept(provSSLSocketDirect);
    provSSLSocketDirect.notifyConnected();
    return provSSLSocketDirect;
  }
  
  public synchronized boolean getEnableSessionCreation() {
    return this.enableSessionCreation;
  }
  
  public synchronized String[] getEnabledCipherSuites() {
    return this.sslParameters.getCipherSuites();
  }
  
  public synchronized String[] getEnabledProtocols() {
    return this.sslParameters.getProtocols();
  }
  
  public synchronized boolean getNeedClientAuth() {
    return this.sslParameters.getNeedClientAuth();
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
  
  public synchronized boolean getUseClientMode() {
    return this.useClientMode;
  }
  
  public synchronized boolean getWantClientAuth() {
    return this.sslParameters.getWantClientAuth();
  }
  
  public synchronized void setEnableSessionCreation(boolean paramBoolean) {
    this.enableSessionCreation = paramBoolean;
  }
  
  public synchronized void setEnabledCipherSuites(String[] paramArrayOfString) {
    this.sslParameters.setCipherSuites(paramArrayOfString);
  }
  
  public synchronized void setEnabledProtocols(String[] paramArrayOfString) {
    this.sslParameters.setProtocols(paramArrayOfString);
  }
  
  public synchronized void setNeedClientAuth(boolean paramBoolean) {
    this.sslParameters.setNeedClientAuth(paramBoolean);
  }
  
  public synchronized void setSSLParameters(SSLParameters paramSSLParameters) {
    SSLParametersUtil.setSSLParameters(this.sslParameters, paramSSLParameters);
  }
  
  public synchronized void setUseClientMode(boolean paramBoolean) {
    if (this.useClientMode != paramBoolean) {
      this.contextData.getContext().updateDefaultSSLParameters(this.sslParameters, paramBoolean);
      this.useClientMode = paramBoolean;
    } 
  }
  
  public synchronized void setWantClientAuth(boolean paramBoolean) {
    this.sslParameters.setWantClientAuth(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvSSLServerSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */