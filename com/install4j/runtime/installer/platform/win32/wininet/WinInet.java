/*     */ package com.install4j.runtime.installer.platform.win32.wininet;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.platform.win32.Common;
/*     */ import java.io.IOException;
/*     */ import java.net.PasswordAuthentication;
/*     */ import java.net.URI;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WinInet
/*     */ {
/*     */   public static final int TIMEOUT_DEFAULT = -2;
/*     */   private static final int INTERNET_OPEN_TYPE_PRECONFIG = 0;
/*     */   private static final int INTERNET_OPEN_TYPE_DIRECT = 1;
/*     */   private static final int INTERNET_OPEN_TYPE_PROXY = 3;
/*     */   private static final int INTERNET_OPEN_TYPE_PRECONFIG_WITH_NO_AUTOPROXY = 4;
/*     */   private static final int INTERNET_FLAG_NO_CACHE_WRITE = 67108864;
/*     */   private static final int INTERNET_FLAG_NO_COOKIES = 524288;
/*     */   private static final int INTERNET_FLAG_KEEP_CONNECTION = 4194304;
/*     */   private static final int INTERNET_FLAG_IGNORE_REDIRECT_TO_HTTP = 32768;
/*     */   private static final int INTERNET_FLAG_IGNORE_REDIRECT_TO_HTTPS = 16384;
/*     */   private static final int INTERNET_FLAG_RELOAD = -2147483648;
/*     */   private static final int INTERNET_FLAG_PRAGMA_NOCACHE = 256;
/*     */   private static final int INTERNET_FLAG_NO_AUTO_REDIRECT = 2097152;
/*     */   private static final int INTERNET_FLAG_IGNORE_CERT_CN_INVALID = 4096;
/*     */   private static final int INTERNET_FLAG_IGNORE_CERT_DATE_INVALID = 8192;
/*     */   private static final int SECURITY_FLAG_IGNORE_REVOCATION = 128;
/*     */   private static final int SECURITY_FLAG_IGNORE_UNKNOWN_CA = 256;
/*     */   private static final int SECURITY_FLAG_IGNORE_WEAK_SIGNATURE = 65536;
/*     */   private static final int SECURITY_FLAG_IGNORE_WRONG_USAGE = 512;
/*     */   private static final int INTERNET_FLAG_SECURE = 8388608;
/*     */   static final int ERROR_INTERNET_NAME_NOT_RESOLVED = 12007;
/*     */   static final int ERROR_INTERNET_TIMEOUT = 12002;
/*     */   static final int ERROR_INTERNET_INCORRECT_PASSWORD = 12014;
/*     */   static final int ERROR_INTERNET_SERVER_UNREACHABLE = 12164;
/*     */   static final int ERROR_INTERNET_NO_DIRECT_ACCESS = 12023;
/*     */   static final int ERROR_INTERNET_CANNOT_CONNECT = 12029;
/*     */   static final int ERROR_INTERNET_NOT_PROXY_REQUEST = 12020;
/*     */   static final int ERROR_INTERNET_PROXY_SERVER_UNREACHABLE = 12165;
/*     */   static final int ERROR_INTERNET_FORCE_RETRY = 12032;
/*     */   private static final int ERROR_INTERNET_SEC_CERT_CN_INVALID = 12038;
/*     */   private static final int ERROR_INTERNET_SEC_CERT_DATE_INVALID = 12037;
/*     */   private static final int ERROR_INTERNET_INVALID_CA = 12045;
/*     */   private static final int ERROR_INTERNET_SEC_CERT_ERRORS = 12055;
/*     */   private static final int ERROR_INTERNET_SEC_CERT_NO_REV = 12056;
/*     */   private static final int ERROR_INTERNET_SEC_CERT_REV_FAILED = 12057;
/*     */   private static final int ERROR_INTERNET_SEC_CERT_REVOKED = 12170;
/*     */   private static final int ERROR_INTERNET_SEC_INVALID_CERT = 12169;
/*     */   private static final int ERROR_INTERNET_SECURITY_CHANNEL_ERROR = 12157;
/*     */   private static final int FLAGS_ERROR_UI_FILTER_FOR_ERRORS = 1;
/*     */   private static final int FLAGS_ERROR_UI_FLAGS_CHANGE_OPTIONS = 2;
/*     */   private static final int FLAGS_ERROR_UI_FLAGS_GENERATE_DATA = 4;
/*     */   private static final int FLAGS_ERROR_UI_FLAGS_NO_UI = 8;
/*     */   private static final int FLAGS_ERROR_UI_SERIALIZE_DIALOGS = 16;
/*     */   private static final int INTERNET_OPTION_CONNECT_TIMEOUT = 2;
/*     */   private static final int INTERNET_OPTION_RECEIVE_TIMEOUT = 6;
/*     */   private static final int INTERNET_OPTION_USERNAME = 28;
/*     */   private static final int INTERNET_OPTION_PASSWORD = 29;
/*     */   private static final int INTERNET_OPTION_PROXY_USERNAME = 43;
/*     */   private static final int INTERNET_OPTION_PROXY_PASSWORD = 44;
/*     */   private static Boolean available;
/*     */   
/*     */   static {
/*  83 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 103 */   private static final ProxyConfig DEFAULT_PROXY_CONFIG = new ProxyConfig(ProxyType.PRECONFIG, null, null);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static WinInetCall open(String userAgent, String urlString, Map<IgnoreCaseString, List<String>> headers, String method, long contentLength, boolean ignoreCertificateErrors, int connectTimeout, int readTimeout, boolean followRedirects, @Nullable ProxyConfig proxyConfig, WinInetAuthenticator proxyAuthenticator) throws IOException {
/* 109 */     if (!Util.isWindows()) {
/* 110 */       throw new WinInetUnavailableException("not windows");
/*     */     }
/* 112 */     synchronized (WinInet.class) {
/* 113 */       if (available == null) {
/* 114 */         available = Boolean.valueOf(init0());
/*     */       }
/*     */     } 
/* 117 */     if (!available.booleanValue()) {
/* 118 */       throw new WinInetUnavailableException("functions not found");
/*     */     }
/* 120 */     if (proxyConfig == null) {
/* 121 */       proxyConfig = DEFAULT_PROXY_CONFIG;
/*     */     }
/* 123 */     URI uri = URI.create(urlString);
/* 124 */     boolean https = uri.getScheme().equalsIgnoreCase("https");
/* 125 */     long address = connect0(userAgent, proxyConfig.type.intValue, proxyConfig.proxy, proxyConfig.bypass, 0, uri.getHost(), getPort(uri, https), 0);
/* 126 */     if (address != 0L) {
/* 127 */       if (contentLength > 0L) {
/* 128 */         headers = (headers == null) ? new HashMap<>() : new HashMap<>(headers);
/* 129 */         headers.put(new IgnoreCaseString("Content-Length"), Collections.singletonList(String.valueOf(contentLength)));
/*     */       } 
/* 131 */       CallImpl call = new CallImpl(address, uri, contentLength, buildHeaders(headers), proxyAuthenticator);
/*     */       
/* 133 */       int additionalSecurityFlags = 0;
/* 134 */       int flags = -2075607040;
/* 135 */       if (https) {
/* 136 */         flags |= 0x800000;
/* 137 */         if (ignoreCertificateErrors) {
/* 138 */           flags |= 0x3000;
/* 139 */           additionalSecurityFlags = 66432;
/*     */         } 
/*     */       } 
/* 142 */       if (!followRedirects) {
/* 143 */         flags |= 0x200000;
/*     */       }
/*     */       
/* 146 */       openRequest0(call.getAddress(), method, buildObject(uri), flags, additionalSecurityFlags);
/* 147 */       call.checkExceptionAndClose();
/* 148 */       if (connectTimeout != -2) {
/* 149 */         setDwordOption(call, 2, connectTimeout);
/*     */       }
/* 151 */       if (readTimeout != -2) {
/* 152 */         setDwordOption(call, 6, readTimeout);
/*     */       }
/* 154 */       if (contentLength <= 0L) {
/* 155 */         call.sendRequest();
/*     */       }
/* 157 */       return call;
/*     */     } 
/* 159 */     throw new IOException("no address");
/*     */   }
/*     */ 
/*     */   
/*     */   static void handleAuthentication(boolean proxyAuth, WinInetAuthenticator authenticator, CallImpl call) throws IOException {
/* 164 */     if (authenticator.isShowUi(proxyAuth)) {
/* 165 */       int dialogFlags = 7;
/* 166 */       int dialogReturn = internetErrorDlg0(call.getAddress(), 12014, dialogFlags, authenticator.hwnd);
/* 167 */       call.checkExceptionAndClose();
/* 168 */       if (dialogReturn != 12032) {
/* 169 */         throw new RuntimeException(new UserCanceledException());
/*     */       }
/* 171 */     } else if (proxyAuth) {
/* 172 */       useSupplier(call, authenticator.proxySupplier, "proxy", 43, 44);
/*     */     } else {
/* 174 */       useSupplier(call, authenticator.serverSupplier, "server", 28, 29);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void useSupplier(CallImpl call, Supplier<PasswordAuthentication> supplier, String type, int userNameField, int passwordField) throws IOException {
/* 179 */     PasswordAuthentication passwordAuthentication = supplier.get();
/* 180 */     if (passwordAuthentication == null) {
/* 181 */       throw new IOException(type + " authentication required");
/*     */     }
/* 183 */     setStringOption(call, userNameField, passwordAuthentication.getUserName());
/* 184 */     setStringOption(call, passwordField, (passwordAuthentication.getPassword() == null) ? null : new String(passwordAuthentication.getPassword()));
/*     */   }
/*     */   
/*     */   private static void setStringOption(CallImpl call, int option, String str) throws IOException {
/* 188 */     byte[] data = null;
/* 189 */     if (str != null) {
/* 190 */       data = (str + Character.MIN_VALUE).getBytes(StandardCharsets.UTF_16LE);
/*     */     }
/* 192 */     setOption0(call.getAddress(), option, data);
/* 193 */     call.checkExceptionAndClose();
/*     */   }
/*     */   
/*     */   private static void setDwordOption(CallImpl call, int option, int value) throws IOException {
/* 197 */     setDwordOption0(call.getAddress(), option, value);
/* 198 */     call.checkExceptionAndClose();
/*     */   }
/*     */   
/*     */   private static int getPort(URI uri, boolean https) {
/* 202 */     int port = uri.getPort();
/* 203 */     if (port == -1) {
/* 204 */       if (https) {
/* 205 */         return 443;
/*     */       }
/* 207 */       return 80;
/*     */     } 
/*     */     
/* 210 */     return port;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static String buildObject(URI uri) {
/* 216 */     StringBuilder objectBuilder = new StringBuilder();
/* 217 */     objectBuilder.append((uri.getRawPath() != null) ? uri.getRawPath() : "/");
/* 218 */     if (uri.getRawQuery() != null) {
/* 219 */       objectBuilder.append("?");
/* 220 */       objectBuilder.append(uri.getRawQuery());
/*     */     } 
/* 222 */     return objectBuilder.toString();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static String buildHeaders(Map<IgnoreCaseString, List<String>> headers) {
/* 227 */     if (headers == null || headers.isEmpty()) {
/* 228 */       return null;
/*     */     }
/* 230 */     StringBuilder headerBuilder = new StringBuilder();
/* 231 */     for (Map.Entry<IgnoreCaseString, List<String>> entry : headers.entrySet()) {
/* 232 */       for (String value : entry.getValue()) {
/* 233 */         headerBuilder.append(((IgnoreCaseString)entry.getKey()).getDisplayString()).append(": ").append(value).append("\r\n");
/*     */       }
/*     */     } 
/* 236 */     return headerBuilder.toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   static String getDefaultExceptionMessage(int errorLocation, int errorCode) {
/* 241 */     return "wininet error code " + errorCode + " (loc: " + errorLocation + ")" + getWindowsMessageSuffix(errorCode);
/*     */   }
/*     */   
/*     */   static boolean isSslError(int errorCode) {
/* 245 */     return (errorCode == 12038 || errorCode == 12037 || errorCode == 12045 || errorCode == 12055 || errorCode == 12056 || errorCode == 12057 || errorCode == 12170 || errorCode == 12169 || errorCode == 12157);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static String getWindowsMessageSuffix(int errorCode) {
/* 253 */     String windowsMessage = "";
/* 254 */     if (errorCode != 0) {
/* 255 */       windowsMessage = getErrorMessage0(errorCode);
/* 256 */       if (!windowsMessage.isEmpty()) {
/* 257 */         windowsMessage = ": " + windowsMessage;
/*     */       }
/*     */     } 
/* 260 */     return windowsMessage;
/*     */   } private static native boolean init0(); private static native String getErrorMessage0(int paramInt); static native int getErrorCode0(long paramLong); static native int getErrorLocation0(long paramLong); static native void clearError0(long paramLong); static native void destroy0(long paramLong); private static native long connect0(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, int paramInt3, int paramInt4); private static native void openRequest0(long paramLong, String paramString1, String paramString2, int paramInt1, int paramInt2); static native byte[] getHeaders0(long paramLong);
/*     */   static native int read0(long paramLong, byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
/*     */   private static native int internetErrorDlg0(long paramLong1, int paramInt1, int paramInt2, long paramLong2);
/*     */   static native int sendRequest0(long paramLong, String paramString, byte[] paramArrayOfbyte);
/*     */   private static native void setOption0(long paramLong, int paramInt, byte[] paramArrayOfbyte);
/*     */   private static native void setDwordOption0(long paramLong, int paramInt1, int paramInt2);
/*     */   public static class ProxyConfig { private final WinInet.ProxyType type;
/*     */     public ProxyConfig(@NotNull WinInet.ProxyType type, @Nullable String proxy, @Nullable String bypass) {
/* 269 */       this.type = type;
/* 270 */       this.proxy = proxy;
/* 271 */       this.bypass = bypass;
/*     */     }
/*     */     private final String proxy;
/*     */     private final String bypass; }
/*     */   
/* 276 */   public enum ProxyType { PRECONFIG(0),
/* 277 */     DIRECT(1),
/* 278 */     PROXY(3),
/* 279 */     PRECONFIG_WITH_NO_AUTOPROXY(4);
/*     */     
/*     */     private final int intValue;
/*     */     
/*     */     ProxyType(int intValue) {
/* 284 */       this.intValue = intValue;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\WinInet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */