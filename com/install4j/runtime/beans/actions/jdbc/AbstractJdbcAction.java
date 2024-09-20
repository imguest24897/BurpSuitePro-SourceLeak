/*     */ package com.install4j.runtime.beans.actions.jdbc;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.SQLWarning;
/*     */ import java.sql.Statement;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Properties;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public abstract class AbstractJdbcAction extends SystemInstallOrUninstallAction implements PropertyLoggingInterceptor {
/*  20 */   private static final boolean DEBUG = Boolean.getBoolean("install4j.debugJdbc");
/*     */   
/*     */   protected static final String VARIABLE_CONNECTION = "sys.jdbc.connection";
/*     */   
/*     */   protected static final String VARIABLE_ERROR_MESSAGE_VARIABLE_NAME = "sys.jdbc.errorMessagesVariableName";
/*  25 */   private String driverClassName = "";
/*  26 */   private String jdbcUrl = "";
/*  27 */   private String user = "";
/*  28 */   private String password = "";
/*  29 */   private Map<String, String> jdbcProperties = new LinkedHashMap<>();
/*  30 */   private String errorMessagesVariableName = "";
/*     */   
/*     */   private boolean logWarnings = false;
/*     */   private StringBuilder errorMessageBuffer;
/*     */   private Connection containerConnection;
/*     */   
/*     */   public String getDriverClassName() {
/*  37 */     return replaceVariables(replaceVariables(this.driverClassName));
/*     */   }
/*     */   
/*     */   public void setDriverClassName(String driverClassName) {
/*  41 */     this.driverClassName = driverClassName;
/*     */   }
/*     */   
/*     */   public String getJdbcUrl() {
/*  45 */     return replaceVariables(replaceVariables(this.jdbcUrl));
/*     */   }
/*     */   
/*     */   public void setJdbcUrl(String jdbcUrl) {
/*  49 */     this.jdbcUrl = jdbcUrl;
/*     */   }
/*     */   
/*     */   public String getUser() {
/*  53 */     return replaceVariables(replaceVariables(this.user));
/*     */   }
/*     */   
/*     */   public void setUser(String user) {
/*  57 */     this.user = user;
/*     */   }
/*     */   
/*     */   public String getPassword() {
/*  61 */     return replaceVariables(replaceVariables(this.password));
/*     */   }
/*     */   
/*     */   public void setPassword(String password) {
/*  65 */     this.password = password;
/*     */   }
/*     */   
/*     */   public Map<String, String> getJdbcProperties() {
/*  69 */     return (Map<String, String>)replaceWithTextOverride("jdbcProperties", this.jdbcProperties, Map.class);
/*     */   }
/*     */   
/*     */   public void setJdbcProperties(Map<String, String> jdbcProperties) {
/*  73 */     this.jdbcProperties = jdbcProperties;
/*     */   }
/*     */   
/*     */   public String getErrorMessagesVariableName() {
/*  77 */     return replaceVariables(this.errorMessagesVariableName);
/*     */   }
/*     */   
/*     */   public void setErrorMessagesVariableName(String errorMessagesVariableName) {
/*  81 */     this.errorMessagesVariableName = errorMessagesVariableName;
/*     */   }
/*     */   
/*     */   public boolean isLogWarnings() {
/*  85 */     return replaceWithTextOverride("logWarnings", this.logWarnings);
/*     */   }
/*     */   
/*     */   public void setLogWarnings(boolean logWarnings) {
/*  89 */     this.logWarnings = logWarnings;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  94 */     this.errorMessageBuffer = new StringBuilder();
/*     */     try {
/*  96 */       this.containerConnection = (Connection)context.getVariable("sys.jdbc.connection");
/*  97 */       if (this.containerConnection == null) {
/*     */         try {
/*  99 */           Class.forName(getDriverClassName(), true, (ClassLoader)Install4jClassLoader.getInstance());
/* 100 */         } catch (ClassNotFoundException e) {
/* 101 */           logError("Driver class " + getDriverClassName() + " was not found. Add the JAR file to the \"Installer->Custom code & resources\" step.");
/* 102 */           return false;
/* 103 */         } catch (Throwable t) {
/* 104 */           logError("Error initializing driver");
/* 105 */           Logger.getInstance().log(t);
/* 106 */           return false;
/*     */         } 
/*     */       }
/* 109 */       return executeJdbcCall(context);
/*     */     } finally {
/* 111 */       String variableName = getUsedErrorMessagesVariableName(context);
/* 112 */       if (variableName != null && !variableName.isEmpty()) {
/* 113 */         context.setVariable(getErrorMessagesVariableName(), this.errorMessageBuffer.toString());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getUsedErrorMessagesVariableName(Context context) {
/* 119 */     String value = (String)context.getVariable("sys.jdbc.errorMessagesVariableName");
/* 120 */     if (value != null) {
/* 121 */       return value;
/*     */     }
/* 123 */     return getErrorMessagesVariableName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/* 131 */     if (Objects.equals(propertyName, "password") && !Boolean.getBoolean("install4j.logJdbcPassword")) {
/* 132 */       return "[logging of password is disabled]";
/*     */     }
/* 134 */     return propertyValue;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Connection createConnection() throws SQLException {
/* 139 */     if (this.containerConnection != null) {
/* 140 */       return this.containerConnection;
/*     */     }
/* 142 */     Properties properties = new Properties();
/* 143 */     String user = getUser();
/* 144 */     String password = getPassword();
/* 145 */     if (!user.isEmpty()) {
/* 146 */       properties.put("user", user);
/*     */     }
/* 148 */     if (!password.isEmpty()) {
/* 149 */       properties.put("password", password);
/*     */     }
/* 151 */     properties.putAll(getJdbcProperties());
/*     */     try {
/* 153 */       return (Connection)Install4jClassLoader.invokeInCustomClassLoader(DriverManager.class.getMethod("getConnection", new Class[] { String.class, Properties.class }), null, new Object[] { getJdbcUrl(), properties });
/* 154 */     } catch (SQLException|Error|RuntimeException e) {
/* 155 */       throw e;
/* 156 */     } catch (Throwable t) {
/* 157 */       throw new RuntimeException(t);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean withResultSet(String sql, ResultSetConsumer resultSetConsumer) throws UserCanceledException {
/* 163 */     return withStatement(statement -> { try { ResultSet rs = statement.executeQuery(sql); try { boolean bool = resultSetConsumer.run(rs); if (rs != null)
/* 164 */                 rs.close();  return bool; } catch (Throwable throwable) { if (rs != null) try { rs.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }
/*     */              }
/* 166 */           catch (SQLException e)
/*     */           { logError("Could not execute query: " + e.getMessage());
/*     */             logDebug(e);
/*     */             return false; }
/*     */         
/*     */         });
/*     */   }
/*     */   
/*     */   protected boolean withStatement(StatementConsumer statementConsumer) throws UserCanceledException {
/* 175 */     boolean logWarnings = isLogWarnings();
/* 176 */     return withConnection(connection -> { try { Statement statement = connection.createStatement(); try { boolean value = statementConsumer.run(statement); if (logWarnings) logWarnings(statement.getWarnings());  boolean bool1 = value; if (statement != null)
/* 177 */                 statement.close();  return bool1; } catch (Throwable throwable) { if (statement != null) try { statement.close(); } catch (Throwable throwable1)
/*     */                 { throwable.addSuppressed(throwable1); }
/*     */               
/*     */               
/*     */               throw throwable; }
/*     */              }
/* 183 */           catch (SQLException e)
/*     */           { logError("Could not create JDBC statement: " + e.getMessage());
/*     */             logDebug(e);
/*     */             return false; }
/*     */         
/*     */         });
/*     */   }
/*     */   
/*     */   protected boolean withConnection(ConnectionConsumer connectionConsumer) throws UserCanceledException {
/* 192 */     Connection connection = null;
/*     */     try {
/* 194 */       connection = createConnection();
/* 195 */       return connectionConsumer.run(connection);
/* 196 */     } catch (SQLException e) {
/* 197 */       logError("Could not create JDBC connection: " + e.getMessage());
/* 198 */       logDebug(e);
/* 199 */       return false;
/*     */     } finally {
/* 201 */       if (connection != null && connection != this.containerConnection) {
/*     */         try {
/* 203 */           connection.close();
/* 204 */         } catch (SQLException sQLException) {}
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void logWarnings(@Nullable SQLWarning warnings) {
/* 211 */     while (warnings != null) {
/* 212 */       Util.logInfo(this, "Warning: " + warnings.getMessage());
/* 213 */       warnings = warnings.getNextWarning();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void logError(String message) {
/* 218 */     if (this.errorMessageBuffer.length() > 0) {
/* 219 */       this.errorMessageBuffer.append('\n');
/*     */     }
/* 221 */     this.errorMessageBuffer.append(message);
/* 222 */     Logger.getInstance().log(this, message, false);
/*     */   }
/*     */   
/*     */   protected void logSuccess(String message) {
/* 226 */     Logger.getInstance().log(this, message, true);
/*     */   }
/*     */   
/*     */   protected void logDebug(SQLException e) {
/* 230 */     if (DEBUG)
/* 231 */       Logger.getInstance().log(e); 
/*     */   }
/*     */   
/*     */   protected abstract boolean executeJdbcCall(Context paramContext) throws UserCanceledException;
/*     */   
/*     */   public static interface ResultSetConsumer {
/*     */     boolean run(ResultSet param1ResultSet) throws SQLException;
/*     */   }
/*     */   
/*     */   public static interface StatementConsumer {
/*     */     boolean run(Statement param1Statement) throws SQLException;
/*     */   }
/*     */   
/*     */   public static interface ConnectionConsumer {
/*     */     boolean run(Connection param1Connection) throws SQLException, UserCanceledException;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\jdbc\AbstractJdbcAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */