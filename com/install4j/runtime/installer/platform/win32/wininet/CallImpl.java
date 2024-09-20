/*     */ package com.install4j.runtime.installer.platform.win32.wininet;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.net.ConnectException;
/*     */ import java.net.SocketException;
/*     */ import java.net.SocketTimeoutException;
/*     */ import java.net.URI;
/*     */ import java.net.UnknownHostException;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import javax.net.ssl.SSLException;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ final class CallImpl
/*     */   implements WinInetCall
/*     */ {
/*     */   private static final int MAX_RETRIES = 10;
/*     */   private static final int UNAUTHORIZED = 401;
/*     */   private static final int PROXY_AUTHENTICATION_REQUIRED = 407;
/*  26 */   private final byte[] buffer = new byte[1]; private long address; private final URI uri; private String requestHeaders; private final WinInetAuthenticator authenticator;
/*     */   @Nullable
/*     */   private WinInetOutputStream outputStream;
/*  29 */   private final WinInetInputStream inputStream = new WinInetInputStream(this);
/*     */   private boolean eof;
/*  31 */   private final Headers headers = new Headers();
/*     */   
/*     */   public CallImpl(long address, URI uri, long contentLength, String requestHeaders, WinInetAuthenticator authenticator) throws IOException {
/*  34 */     this.address = address;
/*  35 */     this.uri = uri;
/*  36 */     this.requestHeaders = requestHeaders;
/*  37 */     this.authenticator = authenticator;
/*  38 */     if (contentLength > 0L) {
/*  39 */       this.outputStream = new WinInetOutputStream(this, contentLength);
/*     */     }
/*  41 */     checkExceptionAndClose();
/*     */   }
/*     */   
/*     */   synchronized long getAddress() {
/*  45 */     return this.address;
/*     */   }
/*     */   
/*     */   synchronized boolean checkExceptionAndClose() throws IOException {
/*  49 */     int errorLocation = WinInet.getErrorLocation0(this.address);
/*  50 */     int errorCode = WinInet.getErrorCode0(this.address);
/*  51 */     if (errorCode == 12032) {
/*  52 */       WinInet.clearError0(this.address);
/*  53 */       return true;
/*     */     } 
/*  55 */     if (errorLocation != 0) {
/*  56 */       close();
/*  57 */       if (errorCode == 12007)
/*  58 */         throw new UnknownHostException(this.uri.getHost()); 
/*  59 */       if (errorCode == 12002)
/*  60 */         throw new SocketTimeoutException("timeout (loc: " + errorLocation + ")"); 
/*  61 */       if (errorCode == 12164)
/*  62 */         throw new SocketException("server unreachable (loc:  " + errorLocation + ")"); 
/*  63 */       if (errorCode == 12023)
/*  64 */         throw new SocketException("direct network access cannot be made at this time (loc:  " + errorLocation + ")"); 
/*  65 */       if (errorCode == 12020)
/*  66 */         throw new SocketException("the request cannot be made via a proxy (loc:  " + errorLocation + ")"); 
/*  67 */       if (errorCode == 12165)
/*  68 */         throw new SocketException("the designated proxy server cannot be reached (loc:  " + errorLocation + ")"); 
/*  69 */       if (errorCode == 12029)
/*  70 */         throw new ConnectException("Connection refused (loc:  " + errorLocation + ")"); 
/*  71 */       if (WinInet.isSslError(errorCode)) {
/*  72 */         throw new SSLException(WinInet.getDefaultExceptionMessage(errorLocation, errorCode));
/*     */       }
/*  74 */       if (errorLocation == 1) {
/*  75 */         throw new WinInetUnavailableException(WinInet.getDefaultExceptionMessage(errorLocation, errorCode));
/*     */       }
/*  77 */       throw new IOException(WinInet.getDefaultExceptionMessage(errorLocation, errorCode));
/*     */     } 
/*     */ 
/*     */     
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public synchronized OutputStream getOutputStream() throws IOException {
/*  87 */     if (this.address == 0L) {
/*  88 */       throw new IOException("request to " + this.uri + " already read");
/*     */     }
/*  90 */     return this.outputStream;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public synchronized InputStream getInputStream() throws IOException {
/*  96 */     checkSent();
/*  97 */     if (this.address == 0L) {
/*  98 */       throw new IOException("request to " + this.uri + " already read");
/*     */     }
/* 100 */     return this.inputStream;
/*     */   }
/*     */   
/*     */   private void checkSent() throws IOException {
/* 104 */     WinInetOutputStream outputStream = this.outputStream;
/* 105 */     if (outputStream != null) {
/* 106 */       outputStream.close();
/*     */     }
/*     */   }
/*     */   
/*     */   synchronized void sendRequest() throws IOException {
/* 111 */     byte[] body = null;
/* 112 */     if (this.outputStream != null) {
/* 113 */       body = this.outputStream.toByteArray();
/* 114 */       this.outputStream = null;
/*     */     } 
/* 116 */     int count = 0;
/* 117 */     int statusCode = WinInet.sendRequest0(this.address, this.requestHeaders, body);
/* 118 */     while (checkExceptionAndClose() || isAuthenticationRequired(statusCode)) {
/* 119 */       boolean proxyAuth = (statusCode == 407);
/* 120 */       if (count++ >= 10 && (!this.authenticator.isShowUi(proxyAuth) || !isAuthenticationRequired(statusCode))) {
/*     */         break;
/*     */       }
/* 123 */       checkExceptionAndClose();
/* 124 */       if (isAuthenticationRequired(statusCode)) {
/* 125 */         if (!proxyAuth) {
/* 126 */           byte[] arrayOfByte = WinInet.getHeaders0(this.address);
/* 127 */           checkExceptionAndClose();
/* 128 */           if (arrayOfByte != null) {
/* 129 */             this.headers.parse(arrayOfByte);
/* 130 */             if (getLastHeader("WWW-Authenticate") == null) {
/*     */               return;
/*     */             }
/* 133 */             this.headers.clear();
/*     */           } 
/*     */         } 
/* 136 */         WinInet.handleAuthentication(proxyAuth, this.authenticator, this);
/*     */       } 
/* 138 */       statusCode = WinInet.sendRequest0(this.address, this.requestHeaders, body);
/*     */     } 
/* 140 */     checkExceptionAndClose();
/* 141 */     byte[] headerData = WinInet.getHeaders0(this.address);
/* 142 */     checkExceptionAndClose();
/* 143 */     if (headerData != null) {
/* 144 */       this.headers.parse(headerData);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean isAuthenticationRequired(int statusCode) {
/* 149 */     return (statusCode == 407 || statusCode == 401);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void close() {
/* 154 */     if (this.address != 0L) {
/* 155 */       WinInet.destroy0(this.address);
/* 156 */       this.address = 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   int read() throws IOException {
/* 161 */     checkSent();
/* 162 */     int read = read(this.buffer, 0, 1);
/* 163 */     if (read == 1) {
/* 164 */       return Byte.toUnsignedInt(this.buffer[0]);
/*     */     }
/* 166 */     return -1;
/*     */   }
/*     */ 
/*     */   
/*     */   int read(byte[] b, int off, int len) throws IOException {
/* 171 */     checkSent();
/* 172 */     if (this.eof)
/* 173 */       return -1; 
/* 174 */     if (this.address == 0L) {
/* 175 */       throw new IOException("already closed");
/*     */     }
/* 177 */     int ret = WinInet.read0(this.address, b, off, len);
/* 178 */     checkExceptionAndClose();
/* 179 */     if (ret == -1) {
/* 180 */       this.eof = true;
/* 181 */       close();
/*     */     } 
/* 183 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getResponseCode() throws IOException {
/* 188 */     checkSent();
/* 189 */     return this.headers.getCode();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public String getResponseMessage() throws IOException {
/* 195 */     checkSent();
/* 196 */     return this.headers.getMessage();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public String getLastHeader(String name) {
/* 202 */     List<String> list = getHeaders(name);
/* 203 */     if (list.isEmpty()) {
/* 204 */       return null;
/*     */     }
/* 206 */     return list.get(list.size() - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<String> getHeaders(String name) {
/*     */     try {
/* 214 */       checkSent();
/* 215 */     } catch (IOException iOException) {}
/*     */     
/* 217 */     List<String> list = this.headers.getLowerCaseHeaders().get(name.toLowerCase(Locale.ROOT));
/* 218 */     return (list != null) ? list : Collections.<String>emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Map<String, List<String>> getAllHeaders() {
/*     */     try {
/* 225 */       checkSent();
/* 226 */     } catch (IOException iOException) {}
/*     */     
/* 228 */     return this.headers.getHeaders();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 233 */     return "CallImpl{uri=" + this.uri + ", headers=" + this.headers + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\CallImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */