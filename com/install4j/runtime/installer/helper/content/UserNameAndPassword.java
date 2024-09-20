/*    */ package com.install4j.runtime.installer.helper.content;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.net.PasswordAuthentication;
/*    */ 
/*    */ public class UserNameAndPassword implements Serializable {
/*    */   public final String userName;
/*    */   public final String password;
/*    */   
/*    */   public UserNameAndPassword(String userName, String password) {
/* 11 */     this.userName = userName;
/* 12 */     this.password = password;
/*    */   }
/*    */   
/*    */   public UserNameAndPassword(PasswordAuthentication passwordAuthentication) {
/* 16 */     this(passwordAuthentication.getUserName(), new String(passwordAuthentication.getPassword()));
/*    */   }
/*    */   
/*    */   public PasswordAuthentication toPasswordAuthentication() {
/* 20 */     return new PasswordAuthentication(this.userName, this.password.toCharArray());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\UserNameAndPassword.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */