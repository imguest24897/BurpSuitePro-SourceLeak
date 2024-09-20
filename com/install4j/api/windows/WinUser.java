/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32UserInfo;
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
/*     */ public class WinUser
/*     */ {
/*     */   public static boolean deleteUser(String nameOrSid) {
/*  20 */     String accountName = Win32UserInfo.getAccountName(nameOrSid);
/*  21 */     return Win32UserInfo.deleteUser((accountName != null) ? accountName : nameOrSid);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean deleteLocalGroup(String nameOrSid) {
/*  30 */     String accountName = Win32UserInfo.getAccountName(nameOrSid);
/*  31 */     return Win32UserInfo.deleteLocalGroup((accountName != null) ? accountName : nameOrSid);
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
/*     */   public static AddUserResult addUser(String name, String password, String comment, GroupCreationMode groupCreationMode, String localGroupNameOrSid, String localGroupComment) {
/*  45 */     if (name == null) throw new IllegalArgumentException("name required"); 
/*  46 */     if (password == null) throw new IllegalArgumentException("password required"); 
/*  47 */     if (groupCreationMode == null) throw new IllegalArgumentException("groupCreationMode required");
/*     */     
/*  49 */     if (localGroupNameOrSid != null && localGroupNameOrSid.trim().length() == 0) {
/*  50 */       localGroupNameOrSid = null;
/*     */     }
/*  52 */     if (localGroupNameOrSid == null && groupCreationMode == GroupCreationMode.CREATE_IF_NECESSARY) {
/*  53 */       groupCreationMode = GroupCreationMode.NONE;
/*     */     }
/*     */     
/*  56 */     if (groupCreationMode != GroupCreationMode.NONE && localGroupNameOrSid == null) throw new IllegalArgumentException("localGroupName required");
/*     */     
/*  58 */     if (groupCreationMode == GroupCreationMode.NONE) {
/*  59 */       localGroupNameOrSid = null;
/*     */     }
/*     */     
/*  62 */     if (localGroupNameOrSid != null) {
/*  63 */       String groupAccountName = Win32UserInfo.getAccountName(localGroupNameOrSid);
/*  64 */       if (groupAccountName != null) {
/*  65 */         localGroupNameOrSid = groupAccountName;
/*     */       }
/*     */     } 
/*  68 */     Win32UserInfo.Result win32Result = Win32UserInfo.addUser(name, password, comment, localGroupNameOrSid, localGroupComment, (groupCreationMode == GroupCreationMode.CREATE_IF_NECESSARY || groupCreationMode == GroupCreationMode.CREATE_OR_FAIL), (groupCreationMode == GroupCreationMode.CREATE_OR_FAIL));
/*     */ 
/*     */     
/*  71 */     if (win32Result == null) {
/*  72 */       return new AddUserResult(AddUserResultType.ERROR_OTHER);
/*     */     }
/*  74 */     switch (win32Result.getErrorCode()) {
/*     */       case 0:
/*  76 */         return new AddUserResult(AddUserResultType.SUCCESS, win32Result.getUserSid(), win32Result.getGroupSid(), win32Result.isGroupCreated());
/*     */       case 1379:
/*     */       case 2223:
/*  79 */         return new AddUserResult(AddUserResultType.ERROR_GROUP_EXISTS);
/*     */       case 2220:
/*  81 */         return new AddUserResult(AddUserResultType.ERROR_GROUP_NOT_FOUND);
/*     */       case 2224:
/*  83 */         return new AddUserResult(AddUserResultType.ERROR_USER_EXISTS);
/*     */       case 2202:
/*  85 */         return new AddUserResult(AddUserResultType.ERROR_BAD_USER_NAME);
/*     */       case 2245:
/*  87 */         return new AddUserResult(AddUserResultType.ERROR_PASSWORD_REQUIREMENTS);
/*     */       case 5:
/*     */       case 2226:
/*  90 */         return new AddUserResult(AddUserResultType.ERROR_ACCESS_DENIED);
/*     */     } 
/*  92 */     Logger.getInstance().error(WinUser.class, "Could not create user. Win32 error code is " + win32Result.getErrorCode() + ", raw result: " + win32Result.getRawResult());
/*  93 */     return new AddUserResult(AddUserResultType.ERROR_OTHER);
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AddUserResult
/*     */   {
/*     */     private WinUser.AddUserResultType resultType;
/*     */     
/*     */     private String userSid;
/*     */     
/*     */     private String groupSid;
/*     */     private boolean groupCreated;
/*     */     
/*     */     private AddUserResult(WinUser.AddUserResultType resultType, String userSid, String groupSid, boolean groupCreated) {
/* 107 */       this.resultType = resultType;
/* 108 */       this.userSid = userSid;
/* 109 */       this.groupSid = groupSid;
/* 110 */       this.groupCreated = groupCreated;
/*     */     }
/*     */     
/*     */     private AddUserResult(WinUser.AddUserResultType resultType) {
/* 114 */       this.resultType = resultType;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public WinUser.AddUserResultType getType() {
/* 122 */       return this.resultType;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getUserSid() {
/* 131 */       return this.userSid;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getGroupSid() {
/* 140 */       return this.groupSid;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isGroupCreated() {
/* 148 */       return this.groupCreated;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 153 */       return "AddUserResult{resultType=" + this.resultType + ", userSid='" + this.userSid + '\'' + ", groupSid='" + this.groupSid + '\'' + ", groupCreated=" + this.groupCreated + '}';
/*     */     }
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
/*     */   public enum GroupCreationMode
/*     */   {
/* 169 */     NONE("none"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     USE_EXISTING("use existing"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 179 */     CREATE_IF_NECESSARY("create if necessary"),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     CREATE_OR_FAIL("create or fail");
/*     */     
/*     */     private final String name;
/*     */     
/*     */     GroupCreationMode(String name) {
/* 189 */       this.name = name;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 194 */       return this.name;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum AddUserResultType
/*     */   {
/* 206 */     SUCCESS(""),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 212 */     ERROR_ACCESS_DENIED(""),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 217 */     ERROR_GROUP_EXISTS(""),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 222 */     ERROR_GROUP_NOT_FOUND(""),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     ERROR_USER_EXISTS(""),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     ERROR_BAD_USER_NAME(""),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 238 */     ERROR_PASSWORD_REQUIREMENTS(""),
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     ERROR_OTHER("");
/*     */     
/*     */     private final String verbose;
/*     */     
/*     */     AddUserResultType(String verbose) {
/* 248 */       this.verbose = verbose;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 253 */       return this.verbose;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getAccountName(String sid) {
/* 263 */     return Win32UserInfo.getAccountName(sid);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getUserName(String sid) {
/* 272 */     return Win32UserInfo.getAccountName(sid, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getUserSid() {
/* 280 */     return Win32UserInfo.getUserSid();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinUser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */