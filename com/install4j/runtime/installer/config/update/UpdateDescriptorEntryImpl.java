/*     */ package com.install4j.runtime.installer.config.update;
/*     */ 
/*     */ import com.install4j.api.update.UpdateChecker;
/*     */ import com.install4j.api.update.UpdateDescriptorEntry;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.config.AbstractConfig;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.launcher.integration.AutomaticUpdate;
/*     */ import java.net.URL;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class UpdateDescriptorEntryImpl
/*     */   extends AbstractConfig
/*     */   implements UpdateDescriptorEntry
/*     */ {
/*     */   public static final String ELEMENT_ENTRY = "entry";
/*     */   public static final String ELEMENT_COMMENT = "comment";
/*     */   public static final String ATTRIBUTE_TARGET_MEDIA_FILE_ID = "targetMediaFileId";
/*     */   public static final String ATTRIBUTE_UPDATABLE_VERSION_MIN = "updatableVersionMin";
/*     */   public static final String ATTRIBUTE_UPDATABLE_VERSION_MAX = "updatableVersionMax";
/*     */   public static final String ATTRIBUTE_FILE_NAME = "fileName";
/*     */   public static final String ATTRIBUTE_NEW_VERSION = "newVersion";
/*     */   public static final String ATTRIBUTE_NEW_MEDIA_FILE_ID = "newMediaFileId";
/*     */   public static final String ATTRIBUTE_FILE_SIZE = "fileSize";
/*     */   public static final String ATTRIBUTE_MD5_SUM = "md5Sum";
/*     */   public static final String ATTRIBUTE_SHA256_SUM = "sha256Sum";
/*     */   public static final String ATTRIBUTE_BUNDLED_JRE = "bundledJre";
/*     */   public static final String ATTRIBUTE_ARCHIVE = "archive";
/*     */   public static final String ATTRIBUTE_SINGLE_BUNDLE = "singleBundle";
/*     */   public static final String ATTRIBUTE_LANGUAGE = "language";
/*  35 */   private String targetMediaFileId = "";
/*  36 */   private String updatableVersionMin = "";
/*  37 */   private String updatableVersionMax = "";
/*  38 */   private String fileName = "";
/*  39 */   private String newVersion = "";
/*  40 */   private String newMediaFileId = "";
/*  41 */   protected long fileSize = -1L;
/*     */   protected String md5Sum;
/*     */   protected String sha256Sum;
/*  44 */   private String bundledJre = "";
/*  45 */   private String comment = "";
/*     */   
/*     */   private boolean archive = false;
/*     */   
/*     */   private boolean singleBundle = false;
/*     */   
/*     */   private Element element;
/*     */   
/*     */   private URL url;
/*     */   
/*     */   public UpdateDescriptorEntryImpl() {}
/*     */   
/*     */   public UpdateDescriptorEntryImpl(String mediaFileId, String fileName, String newVersion, long fileSize, String bundledJre, boolean archive, boolean singleBundle, String updatableVersionMin, String updatableVersionMax) {
/*  58 */     this(mediaFileId, fileName, newVersion, fileSize, (String)null, (String)null, bundledJre, archive, singleBundle, updatableVersionMin, updatableVersionMax);
/*     */   }
/*     */   
/*     */   public UpdateDescriptorEntryImpl(String mediaFileId, String fileName, String newVersion, long fileSize, String md5Sum, String sha256Sum, String bundledJre, boolean archive, boolean singleBundle, String updatableVersionMin, String updatableVersionMax) {
/*  62 */     this.targetMediaFileId = mediaFileId;
/*  63 */     this.fileName = fileName;
/*  64 */     this.newVersion = newVersion;
/*  65 */     this.fileSize = fileSize;
/*  66 */     this.md5Sum = md5Sum;
/*  67 */     this.sha256Sum = sha256Sum;
/*  68 */     this.bundledJre = bundledJre;
/*  69 */     this.newMediaFileId = mediaFileId;
/*  70 */     this.archive = archive;
/*  71 */     this.singleBundle = singleBundle;
/*  72 */     this.updatableVersionMin = updatableVersionMin;
/*  73 */     this.updatableVersionMax = updatableVersionMax;
/*     */   }
/*     */   
/*     */   protected void read(Element element) {
/*     */     String systemLanguage;
/*  78 */     this.element = element;
/*     */     
/*  80 */     this.targetMediaFileId = readAttribute(element, "targetMediaFileId", this.targetMediaFileId);
/*  81 */     this.updatableVersionMin = readAttribute(element, "updatableVersionMin", this.updatableVersionMin);
/*  82 */     this.updatableVersionMax = readAttribute(element, "updatableVersionMax", this.updatableVersionMax);
/*  83 */     this.fileName = readAttribute(element, "fileName", this.fileName);
/*  84 */     this.newVersion = readAttribute(element, "newVersion", this.newVersion);
/*  85 */     this.newMediaFileId = readAttribute(element, "newMediaFileId", this.newMediaFileId);
/*  86 */     this.fileSize = readAttribute(element, "fileSize", this.fileSize);
/*  87 */     this.md5Sum = readAttribute(element, "md5Sum", this.md5Sum);
/*  88 */     this.sha256Sum = readAttribute(element, "sha256Sum", this.sha256Sum);
/*  89 */     this.bundledJre = readAttribute(element, "bundledJre", this.bundledJre);
/*  90 */     this.archive = readAttribute(element, "archive", this.archive);
/*  91 */     this.singleBundle = readAttribute(element, "singleBundle", this.archive);
/*     */ 
/*     */     
/*  94 */     ContextInt context = ContextImpl.getSingleContextInt();
/*  95 */     if (context != null) {
/*     */       
/*  97 */       systemLanguage = context.getLanguageId();
/*     */     } else {
/*     */       
/* 100 */       systemLanguage = Locale.getDefault().getLanguage();
/*     */     } 
/* 102 */     Element principalElement = null;
/* 103 */     Element systemElement = null;
/* 104 */     for (Element commentElement : XmlHelper.childElements(element)) {
/* 105 */       if (!Objects.equals(commentElement.getNodeName(), "comment")) {
/*     */         continue;
/*     */       }
/* 108 */       if (principalElement == null) {
/* 109 */         principalElement = commentElement;
/*     */       }
/* 111 */       String language = readAttribute(commentElement, "language", "");
/* 112 */       if (systemLanguage.startsWith(language)) {
/* 113 */         systemElement = commentElement;
/*     */       }
/*     */     } 
/* 116 */     if (systemElement == null) {
/* 117 */       systemElement = principalElement;
/*     */     }
/* 119 */     this.comment = XmlHelper.getTextValue(systemElement).trim();
/*     */   }
/*     */   
/*     */   public void setURL(URL url) {
/* 123 */     this.url = url;
/*     */   }
/*     */ 
/*     */   
/*     */   public URL getURL() {
/* 128 */     return this.url;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isArchive() {
/* 133 */     return this.archive;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isSingleBundle() {
/* 138 */     return this.singleBundle;
/*     */   }
/*     */   
/*     */   public void setSingleBundle(boolean singleBundle) {
/* 142 */     this.singleBundle = singleBundle;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAdditionalAttribute(String attributeName, String defaultValue) {
/* 147 */     return readAttribute(this.element, attributeName, defaultValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTargetMediaFileId() {
/* 152 */     return this.targetMediaFileId;
/*     */   }
/*     */   
/*     */   public void setTargetMediaFileId(String targetMediaFileId) {
/* 156 */     this.targetMediaFileId = targetMediaFileId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdatableVersionMin() {
/* 161 */     return this.updatableVersionMin;
/*     */   }
/*     */   
/*     */   public void setUpdatableVersionMin(String updatableVersionMin) {
/* 165 */     this.updatableVersionMin = updatableVersionMin;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdatableVersionMax() {
/* 170 */     return this.updatableVersionMax;
/*     */   }
/*     */   
/*     */   public void setUpdatableVersionMax(String updatableVersionMax) {
/* 174 */     this.updatableVersionMax = updatableVersionMax;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFileName() {
/* 179 */     return this.fileName;
/*     */   }
/*     */   
/*     */   public void setFileName(String fileName) {
/* 183 */     this.fileName = fileName;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNewVersion() {
/* 188 */     return this.newVersion;
/*     */   }
/*     */   
/*     */   public void setNewVersion(String newVersion) {
/* 192 */     this.newVersion = newVersion;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNewMediaFileId() {
/* 197 */     return this.newMediaFileId;
/*     */   }
/*     */   
/*     */   public void setNewMediaFileId(String newMediaFileId) {
/* 201 */     this.newMediaFileId = newMediaFileId;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getFileSize() {
/* 206 */     return this.fileSize;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getMd5Sum() {
/* 211 */     return this.md5Sum;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSha256Sum() {
/* 216 */     return this.sha256Sum;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFileSizeVerbose() {
/* 221 */     if (this.fileSize / 1024L / 1024L > 0L) {
/* 222 */       return (new DecimalFormat("#0.0")).format(1.0D * this.fileSize / 1024.0D / 1024.0D) + " MB";
/*     */     }
/* 224 */     return (this.fileSize / 1024L) + " KB";
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFileSize(long fileSize) {
/* 229 */     this.fileSize = fileSize;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getBundledJre() {
/* 234 */     return this.bundledJre;
/*     */   }
/*     */   
/*     */   public void setBundledJre(String bundledJre) {
/* 238 */     this.bundledJre = bundledJre;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getComment() {
/* 243 */     return this.comment;
/*     */   }
/*     */   
/*     */   public void setComment(String comment) {
/* 247 */     this.comment = comment;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 252 */     return "UpdateDescriptorEntry [target: " + this.targetMediaFileId + ", file: " + getFileName() + ", version: " + getNewVersion() + "]";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkVersionCompatible(String version) {
/* 257 */     String minVersion = this.updatableVersionMin.trim();
/* 258 */     if (minVersion.length() > 0 && !UpdateChecker.isVersionLessThanOrEqual(minVersion, version)) {
/* 259 */       return false;
/*     */     }
/* 261 */     String maxVersion = this.updatableVersionMax.trim();
/* 262 */     if (maxVersion.length() > 0 && !UpdateChecker.isVersionLessThanOrEqual(version, maxVersion)) {
/* 263 */       return false;
/*     */     }
/* 265 */     return UpdateChecker.isVersionGreaterThan(this.newVersion, version);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isDownloaded() {
/* 270 */     if (this.newVersion != null) {
/* 271 */       return AutomaticUpdate.isScheduled(this.newVersion, false, false);
/*     */     }
/* 273 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\confi\\update\UpdateDescriptorEntryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */