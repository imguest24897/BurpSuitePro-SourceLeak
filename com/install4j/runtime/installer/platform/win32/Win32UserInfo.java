/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.RemoteCallable;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.installer.AbstractRemoteCallable;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import java.io.Serializable;
/*     */ import java.util.StringTokenizer;
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
/*     */ 
/*     */ public class Win32UserInfo
/*     */ {
/*     */   private static final int DOMAIN_ALIAS_RID_ADMINS = 544;
/*     */   private static final int DOMAIN_ALIAS_RID_POWER_USERS = 547;
/*     */   public static final int ELEVATION_TYPE_NOT_APPLICABLE = 0;
/*     */   public static final int ELEVATION_TYPE_DEFAULT = 1;
/*     */   public static final int ELEVATION_TYPE_FULL = 2;
/*     */   public static final int ELEVATION_TYPE_LIMITED = 3;
/*     */   public static final int USER_CREATION_SUCCESS = 0;
/*     */   public static final int USER_CREATION_COULD_NOT_INITIALIZE = 1;
/*     */   public static final int USER_CREATION_OTHER_ERROR = 2;
/*     */   public static final int NERR_GROUP_NOT_FOUND = 2220;
/*     */   public static final int NERR_USER_NOT_FOUND = 2221;
/*     */   public static final int NERR_GROUP_EXISTS = 2223;
/*     */   public static final int NERR_USER_EXISTS = 2224;
/*     */   public static final int NERR_PASSWORD_TOO_SHORT = 2245;
/*     */   public static final int NERR_NOT_PRIMARY = 2226;
/*     */   public static final int NERR_BAD_USER_NAME = 2202;
/*     */   public static final int ERROR_ACCESS_DENIED = 5;
/*     */   public static final int ERROR_ALIAS_EXISTS = 1379;
/*     */   public static final String RIGHT_SERVICE_LOGON = "SeServiceLogonRight";
/*     */   public static final int SW_HIDE = 0;
/*     */   public static final int SW_SHOWNORMAL = 1;
/*     */   
/*     */   static {
/*  56 */     Common.init();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean setLsaAccountRight(String sidOrAccountName, String rightName, boolean on) {
/*  61 */     if (!InstallerUtil.isWindows()) return false; 
/*  62 */     if (sidOrAccountName == null) throw new IllegalArgumentException("name required"); 
/*  63 */     if (on && (rightName == null || rightName.trim().length() == 0)) throw new IllegalArgumentException("rightName required");
/*     */     
/*  65 */     return setLsaAccountRight0(sidOrAccountName, rightName, on);
/*     */   }
/*     */   
/*     */   public static String getAccountName(String sid) {
/*  69 */     return getAccountName(sid, false);
/*     */   }
/*     */   
/*     */   public static String getAccountName(String sid, boolean unqualified) {
/*  73 */     if (!InstallerUtil.isWindows()) return null; 
/*  74 */     String ret = getAccountName0(sid, unqualified);
/*  75 */     if (ret != null && ret.startsWith(" ")) {
/*  76 */       return null;
/*     */     }
/*  78 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getUserProfileDirectory(String sid, String password) {
/*  83 */     if (!InstallerUtil.isAtLeastWindows2000()) return null; 
/*  84 */     String ret = getUserProfileDirectory0(sid, password);
/*  85 */     if (ret != null && ret.startsWith(" ")) {
/*  86 */       return null;
/*     */     }
/*  88 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isUACDisabled() {
/*  93 */     if (!InstallerUtil.isAtLeastWindowsVista()) return false; 
/*  94 */     Object uacEnabled = WinRegistry.getValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Policies\\System", "EnableLUA");
/*  95 */     return (uacEnabled instanceof Integer && ((Integer)uacEnabled).intValue() == 0);
/*     */   }
/*     */   
/*     */   private static class DeleteRemoteCallable extends AbstractRemoteCallable {
/*     */     String name;
/*     */     boolean group;
/*     */     
/*     */     private DeleteRemoteCallable(String name, boolean group) {
/* 103 */       this.name = name;
/* 104 */       this.group = group;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 109 */       String server = null;
/* 110 */       int backslashIndex = this.name.indexOf('\\');
/* 111 */       if (backslashIndex > -1) {
/* 112 */         server = this.name.substring(0, backslashIndex);
/* 113 */         this.name = this.name.substring(backslashIndex + 1);
/*     */       } 
/* 115 */       Win32UserInfo.setLsaAccountRight(this.name, null, false);
/* 116 */       return Integer.valueOf(this.group ? Win32UserInfo.deleteLocalGroup0(server, this.name) : Win32UserInfo.deleteUser0(server, this.name));
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean deleteUser(String name) {
/* 121 */     if (!InstallerUtil.isWindows()) return false; 
/* 122 */     if (name == null) throw new IllegalArgumentException("name required");
/*     */     
/* 124 */     Integer ret = (Integer)ContextImpl.runElevatedInt((RemoteCallable)new DeleteRemoteCallable(name, false), true);
/* 125 */     return (ret != null && (ret.intValue() == 0 || ret.intValue() == 2221));
/*     */   }
/*     */   
/*     */   private static int printInt(int i) {
/* 129 */     System.out.println(i);
/* 130 */     return i;
/*     */   }
/*     */   
/*     */   public static boolean deleteLocalGroup(String name) {
/* 134 */     if (!InstallerUtil.isWindows()) return false; 
/* 135 */     if (name == null) throw new IllegalArgumentException("name required");
/*     */     
/* 137 */     Integer ret = (Integer)ContextImpl.runElevatedInt((RemoteCallable)new DeleteRemoteCallable(name, true), true);
/* 138 */     return (ret != null && (ret.intValue() == 0 || ret.intValue() == 2220));
/*     */   }
/*     */   
/*     */   private static class AddUserRemoteCallable extends AbstractRemoteCallable {
/*     */     String name;
/*     */     String password;
/*     */     String comment;
/*     */     String localGroupName;
/*     */     String localGroupComment;
/*     */     boolean createGroup;
/*     */     boolean failIfGroupExists;
/*     */     
/*     */     private AddUserRemoteCallable(String name, String password, String comment, String localGroupName, String localGroupComment, boolean createGroup, boolean failIfGroupExists) {
/* 151 */       this.name = name;
/* 152 */       this.password = password;
/* 153 */       this.comment = comment;
/* 154 */       this.localGroupName = localGroupName;
/* 155 */       this.localGroupComment = localGroupComment;
/* 156 */       this.createGroup = createGroup;
/* 157 */       this.failIfGroupExists = failIfGroupExists;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 162 */       return Win32UserInfo.addUser0(this.name, this.password, this.comment, this.localGroupName, this.localGroupComment, this.createGroup, this.failIfGroupExists);
/*     */     }
/*     */   }
/*     */   
/*     */   public static Result addUser(String name, String password, String comment, String localGroupName, String localGroupComment, boolean createGroup, boolean failIfGroupExists) {
/* 167 */     if (!InstallerUtil.isWindows()) return null; 
/* 168 */     if (name == null) throw new IllegalArgumentException("name required"); 
/* 169 */     if (password == null) throw new IllegalArgumentException("password required"); 
/* 170 */     String result = (String)ContextImpl.runElevatedInt((RemoteCallable)new AddUserRemoteCallable(name, password, comment, localGroupName, localGroupComment, createGroup, failIfGroupExists), true);
/* 171 */     if (result == null)
/* 172 */       return new Result(1, null, null, false); 
/* 173 */     if (result.startsWith("S")) {
/* 174 */       StringTokenizer stringTokenizer = new StringTokenizer(result, " ");
/* 175 */       String userSid = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
/* 176 */       String groupSid = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
/* 177 */       boolean groupCreated = (stringTokenizer.hasMoreTokens() && Boolean.parseBoolean(stringTokenizer.nextToken()));
/* 178 */       return new Result(0, userSid, groupSid, groupCreated);
/*     */     } 
/* 180 */     int errorCode = 2;
/* 181 */     StringTokenizer tok = new StringTokenizer(result, " ");
/* 182 */     if (tok.countTokens() > 1) {
/* 183 */       tok.nextToken();
/* 184 */       errorCode = Integer.parseInt(tok.nextToken());
/*     */     } 
/* 186 */     return new Result(errorCode, result);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isAdminUser() {
/* 191 */     return isMemberOfGroup0(544);
/*     */   }
/*     */   
/*     */   public static boolean isPowerUser() {
/* 195 */     return isMemberOfGroup0(547);
/*     */   }
/*     */   
/*     */   public static boolean isAtLeastPowerUser() {
/* 199 */     return (isPowerUser() || isAdminUser());
/*     */   }
/*     */   
/*     */   public static String getUserSid() {
/* 203 */     if (!InstallerUtil.isAtLeastWindows2000()) return null; 
/* 204 */     return getUserSid0();
/*     */   }
/*     */   
/*     */   public static boolean executeElevated(String executable, String parameters, String directory) {
/* 208 */     return executeElevated(executable, parameters, directory, 1);
/*     */   }
/*     */   
/*     */   public static boolean executeElevated(String executable, String parameters, String directory, int showCommand) {
/* 212 */     if (!Util.isAtLeastWindowsVista()) {
/* 213 */       return false;
/*     */     }
/* 215 */     return executeElevated0(executable, (parameters == null) ? "" : parameters, directory, showCommand);
/*     */   }
/*     */   
/*     */   public static int getElevationType() {
/* 219 */     if (!Util.isAtLeastWindowsVista()) {
/* 220 */       return 0;
/*     */     }
/* 222 */     return getElevationType0();
/*     */   } private static native boolean isMemberOfGroup0(int paramInt); private static native boolean executeElevated0(String paramString1, String paramString2, String paramString3, int paramInt); private static native int getElevationType0();
/*     */   private static native String addUser0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, boolean paramBoolean2);
/*     */   private static native int deleteUser0(String paramString1, String paramString2);
/*     */   private static native int deleteLocalGroup0(String paramString1, String paramString2);
/*     */   private static native String getAccountName0(String paramString, boolean paramBoolean);
/*     */   private static native String getUserProfileDirectory0(String paramString1, String paramString2);
/*     */   private static native String getUserSid0();
/*     */   private static native boolean setLsaAccountRight0(String paramString1, String paramString2, boolean paramBoolean);
/*     */   public static class Result { private int errorCode; private String rawResult;
/*     */     public Result(int errorCode, String userSid, String groupSid, boolean groupCreated) {
/* 233 */       this.errorCode = errorCode;
/* 234 */       this.userSid = userSid;
/* 235 */       this.groupSid = groupSid;
/* 236 */       this.groupCreated = groupCreated;
/*     */     }
/*     */     private String userSid; private String groupSid; private boolean groupCreated;
/*     */     public Result(int errorCode, String rawResult) {
/* 240 */       this.errorCode = errorCode;
/* 241 */       this.rawResult = rawResult;
/*     */     }
/*     */     
/*     */     public int getErrorCode() {
/* 245 */       return this.errorCode;
/*     */     }
/*     */     
/*     */     public String getRawResult() {
/* 249 */       return this.rawResult;
/*     */     }
/*     */     
/*     */     public String getUserSid() {
/* 253 */       return this.userSid;
/*     */     }
/*     */     
/*     */     public String getGroupSid() {
/* 257 */       return this.groupSid;
/*     */     }
/*     */     
/*     */     public boolean isGroupCreated() {
/* 261 */       return this.groupCreated;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 266 */       return "Result{errorCode=" + this.errorCode + ", userSid='" + this.userSid + '\'' + ", groupSid='" + this.groupSid + '\'' + ", groupCreated=" + this.groupCreated + '}';
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32UserInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */