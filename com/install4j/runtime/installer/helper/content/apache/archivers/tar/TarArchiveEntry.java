/*      */ package com.install4j.runtime.installer.helper.content.apache.archivers.tar;
/*      */ 
/*      */ import com.install4j.runtime.installer.helper.content.apache.archivers.ArchiveEntry;
/*      */ import com.install4j.runtime.installer.helper.content.apache.archivers.zip.ZipEncoding;
/*      */ import com.install4j.runtime.installer.helper.content.apache.utils.ArchiveUtils;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.HashMap;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class TarArchiveEntry
/*      */   implements ArchiveEntry, TarConstants
/*      */ {
/*  144 */   private static final TarArchiveEntry[] EMPTY_TAR_ARCHIVE_ENTRIES = new TarArchiveEntry[0];
/*      */ 
/*      */   
/*  147 */   private String name = "";
/*      */ 
/*      */   
/*      */   private final boolean preserveAbsolutePath;
/*      */ 
/*      */   
/*      */   private int mode;
/*      */ 
/*      */   
/*  156 */   private long userId = 0L;
/*      */ 
/*      */   
/*  159 */   private long groupId = 0L;
/*      */ 
/*      */   
/*  162 */   private long size = 0L;
/*      */ 
/*      */   
/*      */   private long modTime;
/*      */ 
/*      */   
/*      */   private boolean checkSumOK;
/*      */ 
/*      */   
/*      */   private byte linkFlag;
/*      */ 
/*      */   
/*  174 */   private String linkName = "";
/*      */ 
/*      */   
/*  177 */   private String magic = "ustar\000";
/*      */   
/*  179 */   private String version = "00";
/*      */ 
/*      */   
/*      */   private String userName;
/*      */ 
/*      */   
/*  185 */   private String groupName = "";
/*      */ 
/*      */   
/*  188 */   private int devMajor = 0;
/*      */ 
/*      */   
/*  191 */   private int devMinor = 0;
/*      */ 
/*      */   
/*      */   private boolean isExtended;
/*      */ 
/*      */   
/*      */   private long realSize;
/*      */ 
/*      */   
/*      */   private boolean paxGNUSparse;
/*      */ 
/*      */   
/*      */   private boolean starSparse;
/*      */ 
/*      */   
/*      */   private final File file;
/*      */ 
/*      */   
/*  209 */   private final Map<String, String> extraPaxHeaders = new HashMap<>();
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MAX_NAMELEN = 31;
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int DEFAULT_DIR_MODE = 16877;
/*      */ 
/*      */   
/*      */   public static final int DEFAULT_FILE_MODE = 33188;
/*      */ 
/*      */   
/*      */   public static final int MILLIS_PER_SECOND = 1000;
/*      */ 
/*      */ 
/*      */   
/*      */   private TarArchiveEntry(boolean preserveAbsolutePath) {
/*  228 */     String user = System.getProperty("user.name", "");
/*      */     
/*  230 */     if (user.length() > 31) {
/*  231 */       user = user.substring(0, 31);
/*      */     }
/*      */     
/*  234 */     this.userName = user;
/*  235 */     this.file = null;
/*  236 */     this.preserveAbsolutePath = preserveAbsolutePath;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(String name) {
/*  250 */     this(name, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(String name, boolean preserveAbsolutePath) {
/*  269 */     this(preserveAbsolutePath);
/*      */     
/*  271 */     name = normalizeFileName(name, preserveAbsolutePath);
/*  272 */     boolean isDir = name.endsWith("/");
/*      */     
/*  274 */     this.name = name;
/*  275 */     this.mode = isDir ? 16877 : 33188;
/*  276 */     this.linkFlag = isDir ? 53 : 48;
/*  277 */     this.modTime = (new Date()).getTime() / 1000L;
/*  278 */     this.userName = "";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(String name, byte linkFlag) {
/*  293 */     this(name, linkFlag, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(String name, byte linkFlag, boolean preserveAbsolutePath) {
/*  312 */     this(name, preserveAbsolutePath);
/*  313 */     this.linkFlag = linkFlag;
/*  314 */     if (linkFlag == 76) {
/*  315 */       this.magic = "ustar ";
/*  316 */       this.version = " \000";
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(File file) {
/*  334 */     this(file, file.getPath());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(File file, String fileName) {
/*  351 */     String normalizedName = normalizeFileName(fileName, false);
/*  352 */     this.file = file;
/*      */     
/*  354 */     if (file.isDirectory()) {
/*  355 */       this.mode = 16877;
/*  356 */       this.linkFlag = 53;
/*      */       
/*  358 */       int nameLength = normalizedName.length();
/*  359 */       if (nameLength == 0 || normalizedName.charAt(nameLength - 1) != '/') {
/*  360 */         this.name = normalizedName + "/";
/*      */       } else {
/*  362 */         this.name = normalizedName;
/*      */       } 
/*      */     } else {
/*  365 */       this.mode = 33188;
/*  366 */       this.linkFlag = 48;
/*  367 */       this.size = file.length();
/*  368 */       this.name = normalizedName;
/*      */     } 
/*      */     
/*  371 */     this.modTime = file.lastModified() / 1000L;
/*  372 */     this.userName = "";
/*  373 */     this.preserveAbsolutePath = false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(byte[] headerBuf) {
/*  384 */     this(false);
/*  385 */     parseTarHeader(headerBuf);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry(byte[] headerBuf, ZipEncoding encoding) throws IOException {
/*  400 */     this(false);
/*  401 */     parseTarHeader(headerBuf, encoding);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean equals(TarArchiveEntry it) {
/*  412 */     return (it != null && getName().equals(it.getName()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean equals(Object it) {
/*  424 */     if (it == null || getClass() != it.getClass()) {
/*  425 */       return false;
/*      */     }
/*  427 */     return equals((TarArchiveEntry)it);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*  437 */     return getName().hashCode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isDescendent(TarArchiveEntry desc) {
/*  449 */     return desc.getName().startsWith(getName());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getName() {
/*  461 */     return this.name;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setName(String name) {
/*  470 */     this.name = normalizeFileName(name, this.preserveAbsolutePath);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMode(int mode) {
/*  479 */     this.mode = mode;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getLinkName() {
/*  488 */     return this.linkName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLinkName(String link) {
/*  499 */     this.linkName = link;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int getUserId() {
/*  511 */     return (int)(this.userId & 0xFFFFFFFFFFFFFFFFL);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUserId(int userId) {
/*  520 */     setUserId(userId);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getLongUserId() {
/*  530 */     return this.userId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUserId(long userId) {
/*  540 */     this.userId = userId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public int getGroupId() {
/*  552 */     return (int)(this.groupId & 0xFFFFFFFFFFFFFFFFL);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGroupId(int groupId) {
/*  561 */     setGroupId(groupId);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getLongGroupId() {
/*  571 */     return this.groupId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGroupId(long groupId) {
/*  581 */     this.groupId = groupId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUserName() {
/*  590 */     return this.userName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUserName(String userName) {
/*  599 */     this.userName = userName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGroupName() {
/*  608 */     return this.groupName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGroupName(String groupName) {
/*  617 */     this.groupName = groupName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIds(int userId, int groupId) {
/*  627 */     setUserId(userId);
/*  628 */     setGroupId(groupId);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNames(String userName, String groupName) {
/*  638 */     setUserName(userName);
/*  639 */     setGroupName(groupName);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModTime(long time) {
/*  649 */     this.modTime = time / 1000L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModTime(Date time) {
/*  658 */     this.modTime = time.getTime() / 1000L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getModTime() {
/*  667 */     return new Date(this.modTime * 1000L);
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getLastModifiedDate() {
/*  672 */     return getModTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isCheckSumOK() {
/*  683 */     return this.checkSumOK;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public File getFile() {
/*  695 */     return this.file;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getMode() {
/*  704 */     return this.mode;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getSize() {
/*  714 */     return this.size;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSize(long size) {
/*  724 */     if (size < 0L) {
/*  725 */       throw new IllegalArgumentException("Size is out of range: " + size);
/*      */     }
/*  727 */     this.size = size;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getDevMajor() {
/*  737 */     return this.devMajor;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDevMajor(int devNo) {
/*  748 */     if (devNo < 0) {
/*  749 */       throw new IllegalArgumentException("Major device number is out of range: " + devNo);
/*      */     }
/*      */     
/*  752 */     this.devMajor = devNo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getDevMinor() {
/*  762 */     return this.devMinor;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDevMinor(int devNo) {
/*  773 */     if (devNo < 0) {
/*  774 */       throw new IllegalArgumentException("Minor device number is out of range: " + devNo);
/*      */     }
/*      */     
/*  777 */     this.devMinor = devNo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isExtended() {
/*  787 */     return this.isExtended;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long getRealSize() {
/*  796 */     return this.realSize;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isGNUSparse() {
/*  805 */     return (isOldGNUSparse() || isPaxGNUSparse());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isOldGNUSparse() {
/*  816 */     return (this.linkFlag == 83);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPaxGNUSparse() {
/*  827 */     return this.paxGNUSparse;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isStarSparse() {
/*  837 */     return this.starSparse;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isGNULongLinkEntry() {
/*  846 */     return (this.linkFlag == 75);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isGNULongNameEntry() {
/*  855 */     return (this.linkFlag == 76);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPaxHeader() {
/*  867 */     return (this.linkFlag == 120 || this.linkFlag == 88);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isGlobalPaxHeader() {
/*  879 */     return (this.linkFlag == 103);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isDirectory() {
/*  889 */     if (this.file != null) {
/*  890 */       return this.file.isDirectory();
/*      */     }
/*      */     
/*  893 */     if (this.linkFlag == 53) {
/*  894 */       return true;
/*      */     }
/*      */     
/*  897 */     return (!isPaxHeader() && !isGlobalPaxHeader() && getName().endsWith("/"));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFile() {
/*  907 */     if (this.file != null) {
/*  908 */       return this.file.isFile();
/*      */     }
/*  910 */     if (this.linkFlag == 0 || this.linkFlag == 48) {
/*  911 */       return true;
/*      */     }
/*  913 */     return !getName().endsWith("/");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSymbolicLink() {
/*  923 */     return (this.linkFlag == 50);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isLink() {
/*  933 */     return (this.linkFlag == 49);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isCharacterDevice() {
/*  943 */     return (this.linkFlag == 51);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isBlockDevice() {
/*  953 */     return (this.linkFlag == 52);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isFIFO() {
/*  963 */     return (this.linkFlag == 54);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isSparse() {
/*  973 */     return (isGNUSparse() || isStarSparse());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Map<String, String> getExtraPaxHeaders() {
/*  982 */     return Collections.unmodifiableMap(this.extraPaxHeaders);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearExtraPaxHeaders() {
/*  990 */     this.extraPaxHeaders.clear();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addPaxHeader(String name, String value) {
/* 1001 */     processPaxHeader(name, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getExtraPaxHeader(String name) {
/* 1011 */     return this.extraPaxHeaders.get(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void updateEntryFromPaxHeaders(Map<String, String> headers) {
/* 1020 */     for (Map.Entry<String, String> ent : headers.entrySet()) {
/* 1021 */       String key = ent.getKey();
/* 1022 */       String val = ent.getValue();
/* 1023 */       processPaxHeader(key, val, headers);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void processPaxHeader(String key, String val) {
/* 1035 */     processPaxHeader(key, val, this.extraPaxHeaders);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void processPaxHeader(String key, String val, Map<String, String> headers) {
/* 1068 */     switch (key) {
/*      */       case "path":
/* 1070 */         setName(val);
/*      */         return;
/*      */       case "linkpath":
/* 1073 */         setLinkName(val);
/*      */         return;
/*      */       case "gid":
/* 1076 */         setGroupId(Long.parseLong(val));
/*      */         return;
/*      */       case "gname":
/* 1079 */         setGroupName(val);
/*      */         return;
/*      */       case "uid":
/* 1082 */         setUserId(Long.parseLong(val));
/*      */         return;
/*      */       case "uname":
/* 1085 */         setUserName(val);
/*      */         return;
/*      */       case "size":
/* 1088 */         setSize(Long.parseLong(val));
/*      */         return;
/*      */       case "mtime":
/* 1091 */         setModTime((long)(Double.parseDouble(val) * 1000.0D));
/*      */         return;
/*      */       case "SCHILY.devminor":
/* 1094 */         setDevMinor(Integer.parseInt(val));
/*      */         return;
/*      */       case "SCHILY.devmajor":
/* 1097 */         setDevMajor(Integer.parseInt(val));
/*      */         return;
/*      */       case "GNU.sparse.size":
/* 1100 */         fillGNUSparse0xData(headers);
/*      */         return;
/*      */       case "GNU.sparse.realsize":
/* 1103 */         fillGNUSparse1xData(headers);
/*      */         return;
/*      */       case "SCHILY.filetype":
/* 1106 */         if ("sparse".equals(val)) {
/* 1107 */           fillStarSparseData(headers);
/*      */         }
/*      */         return;
/*      */     } 
/* 1111 */     this.extraPaxHeaders.put(key, val);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public TarArchiveEntry[] getDirectoryEntries() {
/* 1127 */     if (this.file == null || !this.file.isDirectory()) {
/* 1128 */       return EMPTY_TAR_ARCHIVE_ENTRIES;
/*      */     }
/*      */     
/* 1131 */     String[] list = this.file.list();
/* 1132 */     if (list == null) {
/* 1133 */       return EMPTY_TAR_ARCHIVE_ENTRIES;
/*      */     }
/* 1135 */     TarArchiveEntry[] result = new TarArchiveEntry[list.length];
/*      */     
/* 1137 */     for (int i = 0; i < result.length; i++) {
/* 1138 */       result[i] = new TarArchiveEntry(new File(this.file, list[i]));
/*      */     }
/*      */     
/* 1141 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeEntryHeader(byte[] outbuf) {
/*      */     try {
/* 1153 */       writeEntryHeader(outbuf, TarUtils.DEFAULT_ENCODING, false);
/* 1154 */     } catch (IOException ex) {
/*      */       try {
/* 1156 */         writeEntryHeader(outbuf, TarUtils.FALLBACK_ENCODING, false);
/* 1157 */       } catch (IOException ex2) {
/*      */         
/* 1159 */         throw new RuntimeException(ex2);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeEntryHeader(byte[] outbuf, ZipEncoding encoding, boolean starMode) throws IOException {
/* 1177 */     int offset = 0;
/*      */     
/* 1179 */     offset = TarUtils.formatNameBytes(this.name, outbuf, offset, 100, encoding);
/*      */     
/* 1181 */     offset = writeEntryHeaderField(this.mode, outbuf, offset, 8, starMode);
/* 1182 */     offset = writeEntryHeaderField(this.userId, outbuf, offset, 8, starMode);
/*      */     
/* 1184 */     offset = writeEntryHeaderField(this.groupId, outbuf, offset, 8, starMode);
/*      */     
/* 1186 */     offset = writeEntryHeaderField(this.size, outbuf, offset, 12, starMode);
/* 1187 */     offset = writeEntryHeaderField(this.modTime, outbuf, offset, 12, starMode);
/*      */ 
/*      */     
/* 1190 */     int csOffset = offset;
/*      */     
/* 1192 */     for (int c = 0; c < 8; c++) {
/* 1193 */       outbuf[offset++] = 32;
/*      */     }
/*      */     
/* 1196 */     outbuf[offset++] = this.linkFlag;
/* 1197 */     offset = TarUtils.formatNameBytes(this.linkName, outbuf, offset, 100, encoding);
/*      */     
/* 1199 */     offset = TarUtils.formatNameBytes(this.magic, outbuf, offset, 6);
/* 1200 */     offset = TarUtils.formatNameBytes(this.version, outbuf, offset, 2);
/* 1201 */     offset = TarUtils.formatNameBytes(this.userName, outbuf, offset, 32, encoding);
/*      */     
/* 1203 */     offset = TarUtils.formatNameBytes(this.groupName, outbuf, offset, 32, encoding);
/*      */     
/* 1205 */     offset = writeEntryHeaderField(this.devMajor, outbuf, offset, 8, starMode);
/*      */     
/* 1207 */     offset = writeEntryHeaderField(this.devMinor, outbuf, offset, 8, starMode);
/*      */ 
/*      */     
/* 1210 */     while (offset < outbuf.length) {
/* 1211 */       outbuf[offset++] = 0;
/*      */     }
/*      */     
/* 1214 */     long chk = TarUtils.computeCheckSum(outbuf);
/*      */     
/* 1216 */     TarUtils.formatCheckSumOctalBytes(chk, outbuf, csOffset, 8);
/*      */   }
/*      */ 
/*      */   
/*      */   private int writeEntryHeaderField(long value, byte[] outbuf, int offset, int length, boolean starMode) {
/* 1221 */     if (!starMode && (value < 0L || value >= 1L << 3 * (length - 1)))
/*      */     {
/*      */ 
/*      */ 
/*      */       
/* 1226 */       return TarUtils.formatLongOctalBytes(0L, outbuf, offset, length);
/*      */     }
/* 1228 */     return TarUtils.formatLongOctalOrBinaryBytes(value, outbuf, offset, length);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void parseTarHeader(byte[] header) {
/*      */     try {
/* 1240 */       parseTarHeader(header, TarUtils.DEFAULT_ENCODING);
/* 1241 */     } catch (IOException ex) {
/*      */       try {
/* 1243 */         parseTarHeader(header, TarUtils.DEFAULT_ENCODING, true);
/* 1244 */       } catch (IOException ex2) {
/*      */         
/* 1246 */         throw new RuntimeException(ex2);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void parseTarHeader(byte[] header, ZipEncoding encoding) throws IOException {
/* 1263 */     parseTarHeader(header, encoding, false);
/*      */   }
/*      */ 
/*      */   
/*      */   private void parseTarHeader(byte[] header, ZipEncoding encoding, boolean oldStyle) throws IOException {
/*      */     String xstarPrefix;
/* 1269 */     int offset = 0;
/*      */     
/* 1271 */     this
/* 1272 */       .name = oldStyle ? TarUtils.parseName(header, offset, 100) : TarUtils.parseName(header, offset, 100, encoding);
/* 1273 */     offset += 100;
/* 1274 */     this.mode = (int)TarUtils.parseOctalOrBinary(header, offset, 8);
/* 1275 */     offset += 8;
/* 1276 */     this.userId = (int)TarUtils.parseOctalOrBinary(header, offset, 8);
/* 1277 */     offset += 8;
/* 1278 */     this.groupId = (int)TarUtils.parseOctalOrBinary(header, offset, 8);
/* 1279 */     offset += 8;
/* 1280 */     this.size = TarUtils.parseOctalOrBinary(header, offset, 12);
/* 1281 */     offset += 12;
/* 1282 */     this.modTime = TarUtils.parseOctalOrBinary(header, offset, 12);
/* 1283 */     offset += 12;
/* 1284 */     this.checkSumOK = TarUtils.verifyCheckSum(header);
/* 1285 */     offset += 8;
/* 1286 */     this.linkFlag = header[offset++];
/* 1287 */     this
/* 1288 */       .linkName = oldStyle ? TarUtils.parseName(header, offset, 100) : TarUtils.parseName(header, offset, 100, encoding);
/* 1289 */     offset += 100;
/* 1290 */     this.magic = TarUtils.parseName(header, offset, 6);
/* 1291 */     offset += 6;
/* 1292 */     this.version = TarUtils.parseName(header, offset, 2);
/* 1293 */     offset += 2;
/* 1294 */     this
/* 1295 */       .userName = oldStyle ? TarUtils.parseName(header, offset, 32) : TarUtils.parseName(header, offset, 32, encoding);
/* 1296 */     offset += 32;
/* 1297 */     this
/* 1298 */       .groupName = oldStyle ? TarUtils.parseName(header, offset, 32) : TarUtils.parseName(header, offset, 32, encoding);
/* 1299 */     offset += 32;
/* 1300 */     if (this.linkFlag == 51 || this.linkFlag == 52) {
/* 1301 */       this.devMajor = (int)TarUtils.parseOctalOrBinary(header, offset, 8);
/* 1302 */       offset += 8;
/* 1303 */       this.devMinor = (int)TarUtils.parseOctalOrBinary(header, offset, 8);
/* 1304 */       offset += 8;
/*      */     } else {
/* 1306 */       offset += 16;
/*      */     } 
/*      */     
/* 1309 */     int type = evaluateType(header);
/* 1310 */     switch (type) {
/*      */       case 2:
/* 1312 */         offset += 12;
/* 1313 */         offset += 12;
/* 1314 */         offset += 12;
/* 1315 */         offset += 4;
/* 1316 */         offset++;
/* 1317 */         offset += 96;
/* 1318 */         this.isExtended = TarUtils.parseBoolean(header, offset);
/* 1319 */         offset++;
/* 1320 */         this.realSize = TarUtils.parseOctal(header, offset, 12);
/* 1321 */         offset += 12;
/*      */         return;
/*      */ 
/*      */ 
/*      */       
/*      */       case 4:
/* 1327 */         xstarPrefix = oldStyle ? TarUtils.parseName(header, offset, 131) : TarUtils.parseName(header, offset, 131, encoding);
/* 1328 */         if (xstarPrefix.length() > 0) {
/* 1329 */           this.name = xstarPrefix + "/" + this.name;
/*      */         }
/*      */         return;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1337 */     String prefix = oldStyle ? TarUtils.parseName(header, offset, 155) : TarUtils.parseName(header, offset, 155, encoding);
/*      */ 
/*      */     
/* 1340 */     if (isDirectory() && !this.name.endsWith("/")) {
/* 1341 */       this.name += "/";
/*      */     }
/* 1343 */     if (prefix.length() > 0) {
/* 1344 */       this.name = prefix + "/" + this.name;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static String normalizeFileName(String fileName, boolean preserveAbsolutePath) {
/* 1356 */     if (!preserveAbsolutePath) {
/* 1357 */       String osname = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
/*      */ 
/*      */       
/* 1360 */       if (osname != null)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/* 1365 */         if (osname.startsWith("windows")) {
/* 1366 */           if (fileName.length() > 2) {
/* 1367 */             char ch1 = fileName.charAt(0);
/* 1368 */             char ch2 = fileName.charAt(1);
/*      */             
/* 1370 */             if (ch2 == ':' && ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')))
/*      */             {
/*      */               
/* 1373 */               fileName = fileName.substring(2);
/*      */             }
/*      */           } 
/* 1376 */         } else if (osname.contains("netware")) {
/* 1377 */           int colon = fileName.indexOf(':');
/* 1378 */           if (colon != -1) {
/* 1379 */             fileName = fileName.substring(colon + 1);
/*      */           }
/*      */         } 
/*      */       }
/*      */     } 
/*      */     
/* 1385 */     fileName = fileName.replace(File.separatorChar, '/');
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1390 */     while (!preserveAbsolutePath && fileName.startsWith("/")) {
/* 1391 */       fileName = fileName.substring(1);
/*      */     }
/* 1393 */     return fileName;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int evaluateType(byte[] header) {
/* 1403 */     if (ArchiveUtils.matchAsciiBuffer("ustar ", header, 257, 6)) {
/* 1404 */       return 2;
/*      */     }
/* 1406 */     if (ArchiveUtils.matchAsciiBuffer("ustar\000", header, 257, 6)) {
/* 1407 */       if (ArchiveUtils.matchAsciiBuffer("tar\000", header, 508, 4))
/*      */       {
/* 1409 */         return 4;
/*      */       }
/* 1411 */       return 3;
/*      */     } 
/* 1413 */     return 0;
/*      */   }
/*      */   
/*      */   void fillGNUSparse0xData(Map<String, String> headers) {
/* 1417 */     this.paxGNUSparse = true;
/* 1418 */     this.realSize = Integer.parseInt(headers.get("GNU.sparse.size"));
/* 1419 */     if (headers.containsKey("GNU.sparse.name"))
/*      */     {
/* 1421 */       this.name = headers.get("GNU.sparse.name");
/*      */     }
/*      */   }
/*      */   
/*      */   void fillGNUSparse1xData(Map<String, String> headers) {
/* 1426 */     this.paxGNUSparse = true;
/* 1427 */     this.realSize = Integer.parseInt(headers.get("GNU.sparse.realsize"));
/* 1428 */     this.name = headers.get("GNU.sparse.name");
/*      */   }
/*      */   
/*      */   void fillStarSparseData(Map<String, String> headers) {
/* 1432 */     this.starSparse = true;
/* 1433 */     if (headers.containsKey("SCHILY.realsize"))
/* 1434 */       this.realSize = Long.parseLong(headers.get("SCHILY.realsize")); 
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apache\archivers\tar\TarArchiveEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */