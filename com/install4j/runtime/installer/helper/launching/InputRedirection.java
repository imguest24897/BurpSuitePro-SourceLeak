/*    */ package com.install4j.runtime.installer.helper.launching;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.util.Objects;
/*    */ 
/*    */ public class InputRedirection
/*    */   extends Redirection {
/*    */   private static final String DEV_STDIN = "/dev/stdin";
/*  9 */   public static final InputRedirection LEGACY_STDIN_REDIRECTION = new InputRedirection(InputRedirectionMode.FILE, "", new File("/dev/stdin"), false);
/* 10 */   public static final InputRedirection INHERIT_REDIRECTION = new InputRedirection(InputRedirectionMode.INHERIT, "", null, false);
/* 11 */   public static final InputRedirection NO_REDIRECTION = new InputRedirection(InputRedirectionMode.NONE, "", null, false);
/*    */   
/*    */   private InputRedirectionMode redirectionMode;
/*    */   private String string;
/*    */   
/*    */   public InputRedirection(InputRedirectionMode redirectionMode, String string, File file, boolean failOnFileError) {
/* 17 */     super(file, failOnFileError);
/* 18 */     this.redirectionMode = redirectionMode;
/* 19 */     this.string = string;
/*    */   }
/*    */   
/*    */   public String getString() {
/* 23 */     return this.string;
/*    */   }
/*    */   
/*    */   public InputRedirectionMode getRedirectionMode() {
/* 27 */     return this.redirectionMode;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     StringBuilder buffer = new StringBuilder();
/* 33 */     buffer.append(this.redirectionMode);
/* 34 */     if (this.redirectionMode == InputRedirectionMode.FILE) {
/* 35 */       buffer.append("[file: ").append(getFile()).append(", failOnError: ").append(isFailOnFileError());
/* 36 */     } else if (this.redirectionMode == InputRedirectionMode.STRING) {
/* 37 */       buffer.append("[string: ").append(this.string);
/*    */     } 
/* 39 */     return buffer.toString();
/*    */   }
/*    */   
/*    */   public boolean isStdInFile() {
/* 43 */     return (this.redirectionMode == InputRedirectionMode.FILE && getFile() != null && Objects.equals(getFile().getPath().replace('\\', '/'), "/dev/stdin"));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\InputRedirection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */