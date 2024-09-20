/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ 
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.PasswordDialog;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import com.install4j.runtime.installer.helper.registry.InstallRegistry;
/*     */ import java.net.Authenticator;
/*     */ import java.net.PasswordAuthentication;
/*     */ import java.net.URL;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HttpAuthenticator
/*     */   extends Authenticator
/*     */ {
/*     */   public static final String SYSPROP_PROXY_PASSWORD = "proxyAuthPassword";
/*     */   public static final String SYSPROP_PROXY_USER = "proxyAuthUser";
/*     */   public static final String SYSPROP_SERVER_AUTH_PASSWORD = "serverAuthPassword";
/*     */   public static final String SYSPROP_SERVER_AUTH_USER = "serverAuthUser";
/*     */   private static HttpAuthenticator authenticator;
/*  34 */   private static final boolean DEBUG = Boolean.getBoolean("install4j.debugAuthentication"); private HttpRequestHandler httpRequestHandler; private int currentConnection; private int lastAuthConnection; private boolean firstProxyAuthentication; private UserNameAndPassword lastProxyCredentials;
/*     */   
/*     */   public static synchronized HttpAuthenticator getInstance() {
/*  37 */     if (authenticator == null) {
/*  38 */       authenticator = new HttpAuthenticator();
/*     */     }
/*  40 */     return authenticator;
/*     */   }
/*     */   
/*     */   public static void setRequestHandler(HttpRequestHandler requestHandler) {
/*  44 */     if (DEBUG) {
/*  45 */       Util.logInfo(null, "HTTP request handler: " + requestHandler);
/*     */     }
/*  47 */     HttpAuthenticator instance = getInstance();
/*  48 */     instance.httpRequestHandler = requestHandler;
/*  49 */     instance.currentConnection++;
/*     */   }
/*     */   
/*     */   public static UserNameAndPassword askForCredentialsGui(final String header, final String footer, final String title, final String installRegistryUserProperty) {
/*  53 */     return (UserNameAndPassword)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<UserNameAndPassword>()
/*     */         {
/*     */           protected UserNameAndPassword fetchValue(Context context) throws Exception {
/*  56 */             return (UserNameAndPassword)GUIHelper.invokeOnEDT(() -> {
/*     */                   PasswordDialog inputDialog = PasswordDialog.createInputDialog(UiUtil.getParentWindow(), header, footer, title, null, true);
/*     */                   if (installRegistryUserProperty != null) {
/*     */                     inputDialog.setUser(InstallRegistry.getValue(installRegistryUserProperty));
/*     */                   }
/*     */                   inputDialog.setVisible(true);
/*     */                   inputDialog.dispose();
/*     */                   if (!inputDialog.isCanceled()) {
/*     */                     if (installRegistryUserProperty != null) {
/*     */                       InstallRegistry.setValue(installRegistryUserProperty, inputDialog.getUser());
/*     */                     }
/*     */                     return new UserNameAndPassword(inputDialog.getUser(), inputDialog.getPassword());
/*     */                   } 
/*     */                   throw new UserCanceledException();
/*     */                 });
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static UserNameAndPassword askForCredentialsConsole(AuthenticationType authenticationType, String requestingHost) {
/*  77 */     final String credentialsMessage = authenticationType.getCredentialsMessage(requestingHost);
/*  78 */     final String installRegistryUserProperty = authenticationType.getInstallRegistryUserProperty();
/*  79 */     return (UserNameAndPassword)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<UserNameAndPassword>()
/*     */         {
/*     */           protected UserNameAndPassword fetchValue(Context context) throws Exception {
/*  82 */             ConsoleImpl consoleImpl = ConsoleImpl.getInstance();
/*  83 */             consoleImpl.println(credentialsMessage);
/*  84 */             String userName = consoleImpl.askString(Messages.getString(".UserName"), HttpAuthenticator.getSavedProxyUser(installRegistryUserProperty));
/*  85 */             HttpAuthenticator.saveProxyUser(userName, installRegistryUserProperty);
/*  86 */             String password = consoleImpl.askPassword(Messages.getString(".Password"), "");
/*  87 */             return new UserNameAndPassword(userName, password);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static String getSavedProxyUser(String installRegistryUserProperty) {
/*  93 */     if (installRegistryUserProperty != null) {
/*  94 */       return InstallRegistry.getValue(installRegistryUserProperty);
/*     */     }
/*  96 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void saveProxyUser(String userName, String installRegistryUserProperty) {
/* 101 */     if (installRegistryUserProperty != null) {
/* 102 */       InstallRegistry.setValue(installRegistryUserProperty, userName);
/*     */     }
/*     */   }
/*     */   
/*     */   public static UserNameAndPassword getProxyCredentialsFromOtherExecutionContext() {
/* 107 */     return (UserNameAndPassword)HelperCommunication.getInstance().fetchObject(ExecutionContext.OTHER, new FetchObjectAction<UserNameAndPassword>()
/*     */         {
/*     */           protected UserNameAndPassword fetchValue(Context context) throws Exception {
/* 110 */             return HttpAuthenticator.getInstance().getLastProxyCredentials();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   private Map<String, UserNameAndPassword> lastServerCredentials = Collections.synchronizedMap(new HashMap<>());
/*     */   private boolean decoupled;
/*     */   
/*     */   public void clearCredentials() {
/* 125 */     this.lastProxyCredentials = null;
/* 126 */     this.lastServerCredentials.clear();
/*     */   }
/*     */   
/*     */   public void setDecoupled(boolean decoupled) {
/* 130 */     this.decoupled = decoupled;
/*     */   }
/*     */   
/*     */   public UserNameAndPassword getLastProxyCredentials() {
/* 134 */     return this.lastProxyCredentials;
/*     */   }
/*     */   
/*     */   public UserNameAndPassword getLastServerCredentials(String host) {
/* 138 */     return this.lastServerCredentials.get(host);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PasswordAuthentication getPasswordAuthentication() {
/* 143 */     if (this.httpRequestHandler == null && !this.decoupled) {
/* 144 */       if (DEBUG) {
/* 145 */         Util.logInfo(null, "No HTTP request handler");
/*     */       }
/* 147 */       return null;
/*     */     } 
/* 149 */     AuthenticationType authenticationType = getAuthenticationType();
/* 150 */     boolean proxy = (authenticationType == AuthenticationType.PROXY);
/* 151 */     if (proxy && this.firstProxyAuthentication && HelperCommunication.getInstance().isConnected()) {
/* 152 */       this.firstProxyAuthentication = false;
/* 153 */       UserNameAndPassword userNameAndPassword = getProxyCredentialsFromOtherExecutionContext();
/* 154 */       if (userNameAndPassword != null) {
/* 155 */         return userNameAndPassword.toPasswordAuthentication();
/*     */       }
/*     */     } 
/* 158 */     UserNameAndPassword credentials = getPasswordAuthentication(authenticationType);
/* 159 */     if (proxy) {
/* 160 */       this.lastProxyCredentials = credentials;
/*     */     } else {
/* 162 */       this.lastServerCredentials.put(getRequestingHost(), credentials);
/*     */     } 
/* 164 */     return (credentials != null) ? credentials.toPasswordAuthentication() : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private UserNameAndPassword getPasswordAuthentication(AuthenticationType authenticationType) {
/* 169 */     URL url = getRequestingURL();
/* 170 */     if (DEBUG) {
/* 171 */       authenticationType.debug(url);
/* 172 */       Util.logInfo(null, "lastAuthConnection: " + this.lastAuthConnection);
/* 173 */       Util.logInfo(null, "currentConnection: " + this.currentConnection);
/*     */     } 
/* 175 */     String user = authenticationType.getUser(url);
/* 176 */     if (user != null && this.lastAuthConnection != this.currentConnection) {
/* 177 */       this.lastAuthConnection = this.currentConnection;
/* 178 */       String password = authenticationType.getPassword(url);
/* 179 */       return new UserNameAndPassword(user, (password != null) ? password : "");
/* 180 */     }  if (this.decoupled || this.httpRequestHandler.getMode() == 1) {
/* 181 */       String header = authenticationType.getCredentialsMessage(getRequestingHost());
/* 182 */       return askForCredentialsGui(header, getRequestingPrompt(), Messages.getString(".EnterCredentialsTitle"), authenticationType.getInstallRegistryUserProperty());
/* 183 */     }  if (this.httpRequestHandler.getMode() == 2)
/* 184 */       return askForCredentialsConsole(authenticationType, getRequestingHost()); 
/* 185 */     if (this.httpRequestHandler.getMode() == 3 && 
/* 186 */       user == null) {
/* 187 */       System.err.println(authenticationType.getCommandLineParameterMessage());
/*     */     }
/*     */     
/* 190 */     return null;
/*     */   }
/*     */   
/*     */   private AuthenticationType getAuthenticationType() {
/* 194 */     if (getRequestorType() == Authenticator.RequestorType.SERVER) {
/* 195 */       return AuthenticationType.SERVER;
/*     */     }
/* 197 */     return AuthenticationType.PROXY;
/*     */   }
/*     */   
/*     */   public enum AuthenticationType
/*     */   {
/* 202 */     SERVER
/*     */     {
/*     */       public HttpAuthenticator.PropertyNameAndValue getUserProperty(URL url) {
/* 205 */         return getProperty("serverAuthUser");
/*     */       }
/*     */ 
/*     */       
/*     */       public HttpAuthenticator.PropertyNameAndValue getPasswordProperty(URL url) {
/* 210 */         return getProperty("serverAuthPassword");
/*     */       }
/*     */ 
/*     */       
/*     */       public String getCredentialsMessage(String requestingHost) {
/* 215 */         return Messages.format(Messages.getString(".EnterCredentialsLabel"), new Object[] { requestingHost });
/*     */       }
/*     */ 
/*     */       
/*     */       public String getCommandLineParameterMessage() {
/* 220 */         return Messages.getString(".ServerPasswordRequired");
/*     */       }
/*     */ 
/*     */       
/*     */       public String getInstallRegistryUserProperty() {
/* 225 */         return null;
/*     */       }
/*     */     },
/*     */     
/* 229 */     PROXY
/*     */     {
/*     */       public HttpAuthenticator.PropertyNameAndValue getUserProperty(URL url) {
/* 232 */         return getProperty("proxyAuthUser");
/*     */       }
/*     */ 
/*     */       
/*     */       protected HttpAuthenticator.PropertyNameAndValue getPasswordProperty(URL url) {
/* 237 */         return getProperty("proxyAuthPassword");
/*     */       }
/*     */ 
/*     */       
/*     */       public String getCredentialsMessage(String requestingHost) {
/* 242 */         return Messages.getString(".ProxyAuthentication");
/*     */       }
/*     */ 
/*     */       
/*     */       public String getCommandLineParameterMessage() {
/* 247 */         return Messages.getString(".ProxyPasswordRequired");
/*     */       }
/*     */ 
/*     */       
/*     */       public String getInstallRegistryUserProperty() {
/* 252 */         return "proxyAuthUser";
/*     */       }
/*     */     };
/*     */     
/* 256 */     private static final HttpAuthenticator.PropertyNameAndValue NOT_FOUND = new HttpAuthenticator.PropertyNameAndValue(null, null); static {
/*     */     
/*     */     } @NotNull
/*     */     private static HttpAuthenticator.PropertyNameAndValue getProperty(@NotNull String propertyName) {
/* 260 */       String propertyValue = HelperCommunication.getUnelevatedProperty(propertyName);
/* 261 */       if (propertyValue != null) {
/* 262 */         return new HttpAuthenticator.PropertyNameAndValue(propertyName, propertyValue);
/*     */       }
/* 264 */       return NOT_FOUND;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUser(URL url) {
/* 275 */       return (getUserProperty(url)).value;
/*     */     }
/*     */     
/*     */     public String getPassword(URL url) {
/* 279 */       return (getPasswordProperty(url)).value;
/*     */     }
/*     */     
/*     */     public void debug(URL url) {
/* 283 */       Util.logInfo(null, "Authentication type " + name());
/* 284 */       getUserProperty(url).debug();
/* 285 */       getPasswordProperty(url).debug();
/*     */     }
/*     */     protected abstract HttpAuthenticator.PropertyNameAndValue getUserProperty(URL param1URL);
/*     */     protected abstract HttpAuthenticator.PropertyNameAndValue getPasswordProperty(URL param1URL);
/*     */     public abstract String getCredentialsMessage(@Nullable String param1String);
/*     */     public abstract String getCommandLineParameterMessage();
/*     */     public abstract String getInstallRegistryUserProperty(); }
/*     */   private static class PropertyNameAndValue { public final String name;
/*     */     
/*     */     public PropertyNameAndValue(String name, String value) {
/* 295 */       this.name = name;
/* 296 */       this.value = value;
/*     */     }
/*     */     public final String value;
/*     */     public void debug() {
/* 300 */       if (this.name != null) {
/* 301 */         Util.logInfo(null, toString());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 307 */       return this.name + ": " + this.value;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\HttpAuthenticator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */