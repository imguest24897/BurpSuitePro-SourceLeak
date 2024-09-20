/*     */ package com.install4j.runtime.beans.actions.jdbc;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.util.LineIterator;
/*     */ import java.io.Closeable;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.sql.Connection;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.Arrays;
/*     */ import java.util.Iterator;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ public class ExecuteSqlScriptAction
/*     */   extends AbstractJdbcAction
/*     */ {
/*     */   private static final String ENCODED_LINE_BREAK = "\\n";
/*  27 */   private ScriptSource scriptSource = ScriptSource.DIRECT;
/*  28 */   private String script = "";
/*     */   private ExternalFile scriptFile;
/*  30 */   private String encoding = "";
/*     */   
/*  32 */   private String delimiter = ";";
/*     */   private boolean commitEachStatement = false;
/*     */   private boolean ignoreErrors = false;
/*     */   
/*     */   public ScriptSource getScriptSource() {
/*  37 */     return (ScriptSource)replaceWithTextOverride("scriptSource", this.scriptSource, ScriptSource.class);
/*     */   }
/*     */   
/*     */   public void setScriptSource(ScriptSource scriptSource) {
/*  41 */     this.scriptSource = scriptSource;
/*     */   }
/*     */   
/*     */   public String getScript() {
/*  45 */     return replaceVariables(this.script);
/*     */   }
/*     */   
/*     */   public void setScript(String script) {
/*  49 */     this.script = script;
/*     */   }
/*     */   
/*     */   public ExternalFile getScriptFile() {
/*  53 */     return (ExternalFile)replaceWithTextOverride("scriptFile", this.scriptFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setScriptFile(ExternalFile scriptFile) {
/*  57 */     this.scriptFile = scriptFile;
/*     */   }
/*     */   
/*     */   public String getEncoding() {
/*  61 */     return replaceVariables(replaceVariables(this.encoding));
/*     */   }
/*     */   
/*     */   public void setEncoding(String encoding) {
/*  65 */     this.encoding = encoding;
/*     */   }
/*     */   
/*     */   public String getDelimiter() {
/*  69 */     return replaceVariables(replaceVariables(this.delimiter));
/*     */   }
/*     */   
/*     */   public void setDelimiter(String delimiter) {
/*  73 */     this.delimiter = delimiter;
/*     */   }
/*     */   
/*     */   public boolean isCommitEachStatement() {
/*  77 */     return replaceWithTextOverride("commitEachStatement", this.commitEachStatement);
/*     */   }
/*     */   
/*     */   public void setCommitEachStatement(boolean commitEachStatement) {
/*  81 */     this.commitEachStatement = commitEachStatement;
/*     */   }
/*     */   
/*     */   public boolean isIgnoreErrors() {
/*  85 */     return replaceWithTextOverride("ignoreErrors", this.ignoreErrors);
/*     */   }
/*     */   
/*     */   public void setIgnoreErrors(boolean ignoreErrors) {
/*  89 */     this.ignoreErrors = ignoreErrors;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean executeJdbcCall(Context context) throws UserCanceledException {
/*  95 */     return withStatement(statement -> {
/*     */           Iterator<String> lineIterator = createLineIterator(context);
/*     */           
/*     */           if (lineIterator == null) {
/*     */             return false;
/*     */           }
/*     */           
/*     */           try {
/*     */             Connection connection = statement.getConnection();
/*     */             
/*     */             if (!isCommitEachStatement()) {
/*     */               connection.setAutoCommit(false);
/*     */             }
/*     */             
/*     */             String delimiterInLine = getDelimiterInLine();
/*     */             
/*     */             Matcher delimiterMatcher = Pattern.compile(delimiterInLine).matcher("");
/*     */             
/*     */             StringBuilder buffer = new StringBuilder();
/*     */             
/*     */             while (lineIterator.hasNext()) {
/*     */               String replacedLine = replaceVariables(((String)lineIterator.next()).trim());
/*     */               for (String line : replacedLine.split("\n")) {
/*     */                 buffer.append(line);
/*     */                 delimiterMatcher.reset(line);
/*     */                 boolean execute = delimiterMatcher.find();
/*     */                 if (execute) {
/*     */                   if (buffer.length() > 0) {
/*     */                     String[] singleStatements = buffer.toString().split(delimiterInLine);
/*     */                     for (String singleStatement : singleStatements) {
/*     */                       if (!executeLine(statement, connection, singleStatement)) {
/*     */                         return false;
/*     */                       }
/*     */                     } 
/*     */                   } 
/*     */                   buffer.setLength(0);
/*     */                 } else {
/*     */                   buffer.append('\n');
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */             if (buffer.length() > 0 && !executeLine(statement, connection, buffer.toString())) {
/*     */               return false;
/*     */             }
/*     */             if (!isCommitEachStatement()) {
/*     */               connection.commit();
/*     */               connection.setAutoCommit(true);
/*     */             } 
/*     */             return true;
/*     */           } finally {
/*     */             if (lineIterator instanceof Closeable) {
/*     */               try {
/*     */                 ((Closeable)lineIterator).close();
/* 148 */               } catch (IOException e) {
/*     */                 Logger.getInstance().log(e);
/*     */               } 
/*     */             }
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   protected String getDelimiterInLine() {
/* 159 */     String delimiter = getDelimiter();
/* 160 */     if (delimiter.endsWith("\\n")) {
/* 161 */       return delimiter.substring(0, delimiter.length() - "\\n".length()) + "$";
/*     */     }
/* 163 */     return delimiter;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean executeLine(Statement statement, Connection connection, String line) throws SQLException {
/*     */     try {
/* 169 */       statement.execute(line);
/* 170 */     } catch (SQLException e) {
/* 171 */       logError("Error executing script line \"" + line + "\", error message: \"" + e.getMessage() + "\"");
/* 172 */       logDebug(e);
/* 173 */       if (!isIgnoreErrors()) {
/* 174 */         connection.rollback();
/* 175 */         return false;
/*     */       } 
/*     */     } 
/* 178 */     return true;
/*     */   }
/*     */   private Iterator<String> createLineIterator(Context context) {
/*     */     File file;
/* 182 */     switch (getScriptSource()) {
/*     */       case DIRECT:
/* 184 */         return Arrays.<String>asList(getScript().split("\n")).iterator();
/*     */       case FILE:
/* 186 */         file = context.getExternalFile(getScriptFile(), false);
/*     */         try {
/* 188 */           return (Iterator<String>)new LineIterator(FileUtil.createTextFileReader(file, getEncoding()));
/* 189 */         } catch (FileNotFoundException e) {
/* 190 */           Logger.getInstance().log(this, "The script file " + file + " could not be found", false);
/* 191 */           return null;
/* 192 */         } catch (IOException e) {
/* 193 */           Logger.getInstance().log(this, "Error reading script file " + file + "", false);
/* 194 */           Logger.getInstance().log(e);
/* 195 */           return null;
/*     */         } 
/*     */     } 
/* 198 */     throw new RuntimeException(getScriptSource().name());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 204 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\jdbc\ExecuteSqlScriptAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */