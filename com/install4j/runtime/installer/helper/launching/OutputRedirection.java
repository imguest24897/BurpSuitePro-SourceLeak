/*    */ package com.install4j.runtime.installer.helper.launching;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class OutputRedirection
/*    */   extends Redirection {
/*    */   private static final String DEV_STDERR = "/dev/stderr";
/*    */   private static final String DEV_STDOUT = "/dev/stdout";
/* 10 */   public static final OutputRedirection INHERIT_REDIRECTION = new OutputRedirection(OutputRedirectionMode.INHERIT, "", false, null, false);
/*    */   
/*    */   private OutputRedirectionMode redirectionMode;
/*    */   private String variableName;
/*    */   private boolean updateLines;
/*    */   
/*    */   public OutputRedirection(OutputRedirectionMode redirectionMode, String variableName, boolean updateLines, File file, boolean failOnFileError) {
/* 17 */     super(file, failOnFileError);
/* 18 */     this.redirectionMode = redirectionMode;
/* 19 */     this.variableName = variableName;
/* 20 */     this.updateLines = updateLines;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 24 */     return this.variableName;
/*    */   }
/*    */   
/*    */   public boolean isUpdateLines() {
/* 28 */     return this.updateLines;
/*    */   }
/*    */   
/*    */   public OutputRedirectionMode getRedirectionMode() {
/* 32 */     return this.redirectionMode;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 37 */     StringBuilder buffer = new StringBuilder();
/* 38 */     buffer.append(this.redirectionMode);
/* 39 */     if (this.redirectionMode == OutputRedirectionMode.FILE) {
/* 40 */       buffer.append("[file: ").append(getFile()).append(", failOnError: ").append(isFailOnFileError());
/* 41 */     } else if (this.redirectionMode == OutputRedirectionMode.VARIABLE) {
/* 42 */       buffer.append("[variableName: ").append(this.variableName);
/*    */     } 
/* 44 */     return buffer.toString();
/*    */   }
/*    */   
/*    */   public boolean isStdOutFile() {
/* 48 */     return (this.redirectionMode == OutputRedirectionMode.FILE && getFile() != null && Objects.equals(getFile().getPath().replace('\\', '/'), "/dev/stdout"));
/*    */   }
/*    */   
/*    */   public boolean isStdErrFile() {
/* 52 */     return (this.redirectionMode == OutputRedirectionMode.FILE && getFile() != null && Objects.equals(getFile().getPath().replace('\\', '/'), "/dev/stderr"));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\OutputRedirection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */