/*     */ package com.install4j.runtime.launcher.integration;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.nio.channels.FileChannel;
/*     */ import java.nio.channels.FileLock;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ import org.w3c.dom.NamedNodeMap;
/*     */ import org.w3c.dom.Node;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UpdateConfig
/*     */ {
/*     */   private static final String ELEMENT_ROOT = "updateConfig";
/*     */   private static final String VERSION = "version";
/*     */   private static final String FILE = "file";
/*     */   private static final String INSTALL_TIMESTAMP = "installTimestamp";
/*     */   private static final String CANCEL_TIMESTAMP = "cancelTimestamp";
/*     */   private static final String TRY_COUNT = "tryCount";
/*     */   private static final String MAX_TRIES = "maxTries";
/*     */   private static final String CANCEL_COUNT = "cancelCount";
/*     */   private static final String MAX_CANCEL_COUNT = "maxCancelCount";
/*     */   private static final String RETRY_INHIBITION = "retryInhibition";
/*     */   private static final String SUCCESS = "success";
/*     */   private static final String INSTALLATION_DIRECTORY = "installationDirectory";
/*     */   private static final String LANGUAGE_ID = "languageId";
/*     */   private static final String CHECK_NEWER_VERSION = "checkNewerVersion";
/*     */   public static final String ELEMENT_UPDATE_ARGUMENTS = "updateArguments";
/*     */   public static final String ELEMENT_ARGUMENT = "argument";
/*     */   public static final String CONFIG_NAME = "config.xml";
/*     */   public static final int MACOS_ARCHIVE_RETRY_INHIBITION_MINUTES = 1440;
/*     */   public static final int DEFAULT_RETRY_INHIBITION_MINUTES = 1440;
/*     */   private final Element element;
/*     */   
/*     */   private UpdateConfig(Element element) {
/*  43 */     this.element = element;
/*     */   }
/*     */   
/*     */   public String getVersion() {
/*  47 */     return XmlHelper.readAttribute(this.element, "version", "");
/*     */   }
/*     */   
/*     */   public void setVersion(String value) {
/*  51 */     this.element.setAttribute("version", value);
/*     */   }
/*     */   
/*     */   public String getFile() {
/*  55 */     return XmlHelper.readAttribute(this.element, "file", "");
/*     */   }
/*     */   
/*     */   public void setFile(String value) {
/*  59 */     this.element.setAttribute("file", value);
/*     */   }
/*     */   
/*     */   public long getInstallTimestamp() {
/*  63 */     return XmlHelper.readAttribute(this.element, "installTimestamp", 0L);
/*     */   }
/*     */   
/*     */   public void setInstallTimestamp(long value) {
/*  67 */     this.element.setAttribute("installTimestamp", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public int getRetryInhibitionMinutes() {
/*  71 */     return XmlHelper.readAttribute(this.element, "retryInhibition", 1440);
/*     */   }
/*     */   
/*     */   public void setRetryInhibitionMinutes(int value) {
/*  75 */     this.element.setAttribute("retryInhibition", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public int getMaxTries() {
/*  79 */     return XmlHelper.readAttribute(this.element, "maxTries", 1);
/*     */   }
/*     */   
/*     */   public void setMaxTries(int value) {
/*  83 */     this.element.setAttribute("maxTries", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public int getTryCount() {
/*  87 */     return XmlHelper.readAttribute(this.element, "tryCount", 0);
/*     */   }
/*     */   
/*     */   public void setTryCount(int value) {
/*  91 */     this.element.setAttribute("tryCount", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public int getMaxCancelCount() {
/*  95 */     return XmlHelper.readAttribute(this.element, "maxCancelCount", 10);
/*     */   }
/*     */   
/*     */   public void setMaxCancelCount(int value) {
/*  99 */     this.element.setAttribute("maxCancelCount", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public int getCancelCount() {
/* 103 */     return XmlHelper.readAttribute(this.element, "cancelCount", 0);
/*     */   }
/*     */   
/*     */   public void setCancelCount(int value) {
/* 107 */     this.element.setAttribute("cancelTimestamp", String.valueOf(System.currentTimeMillis()));
/* 108 */     this.element.setAttribute("cancelCount", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public long getCancelTimestamp() {
/* 112 */     return XmlHelper.readAttribute(this.element, "cancelTimestamp", 0L);
/*     */   }
/*     */   
/*     */   public boolean isSuccess() {
/* 116 */     return XmlHelper.readAttribute(this.element, "success", false);
/*     */   }
/*     */   
/*     */   public void setSuccess(boolean value) {
/* 120 */     this.element.setAttribute("success", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public void setInstallationDirectory(String value) {
/* 124 */     this.element.setAttribute("installationDirectory", value);
/*     */   }
/*     */   
/*     */   public String getInstallationDirectory() {
/* 128 */     return XmlHelper.readAttribute(this.element, "installationDirectory", "");
/*     */   }
/*     */   
/*     */   public void setLanguageId(String value) {
/* 132 */     this.element.setAttribute("languageId", value);
/*     */   }
/*     */   
/*     */   public String getLanguageId() {
/* 136 */     return XmlHelper.readAttribute(this.element, "languageId", "");
/*     */   }
/*     */   
/*     */   public List<String> getArguments() {
/* 140 */     return getArguments(this.element);
/*     */   }
/*     */   
/*     */   public void setArguments(List<String> value) {
/* 144 */     setArguments(this.element, value);
/*     */   }
/*     */   
/*     */   public boolean isCheckNewerVersion() {
/* 148 */     return XmlHelper.readAttribute(this.element, "checkNewerVersion", false);
/*     */   }
/*     */   
/*     */   public void setCheckNewerVersion(boolean value) {
/* 152 */     this.element.setAttribute("checkNewerVersion", String.valueOf(value));
/*     */   }
/*     */   
/*     */   public void clear() {
/* 156 */     Node child = this.element.getFirstChild();
/* 157 */     while (child != null) {
/* 158 */       this.element.removeChild(child);
/* 159 */       child = this.element.getFirstChild();
/*     */     } 
/* 161 */     NamedNodeMap attributes = this.element.getAttributes();
/* 162 */     while (attributes.getLength() > 0) {
/* 163 */       Node att = attributes.item(0);
/* 164 */       attributes.removeNamedItem(att.getNodeName());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void withConfig(boolean create, ConfigConsumer configConsumer) {
/* 170 */     withConfig(getConfigFile(), create, configConsumer);
/*     */   }
/*     */   
/*     */   public static void withConfig(File configFile, boolean create, ConfigConsumer configConsumer) {
/* 174 */     if (!create && !configFile.isFile()) {
/*     */       return;
/*     */     }
/* 177 */     boolean error = false;
/* 178 */     RandomAccessFile raFile = null;
/*     */     try {
/* 180 */       File parentDir = configFile.getParentFile();
/* 181 */       parentDir.mkdirs();
/* 182 */       raFile = new RandomAccessFile(configFile, "rw");
/* 183 */       UpdateLog.log(20, "trying to lock " + configFile);
/* 184 */       if (tryLock(raFile.getChannel(), 40)) {
/* 185 */         Document document; UpdateLog.log(20, "locked " + configFile);
/*     */         
/* 187 */         int length = (int)raFile.length();
/* 188 */         if (length == 0) {
/* 189 */           document = XmlHelper.createDocument();
/* 190 */           Element root = document.createElement("updateConfig");
/* 191 */           document.appendChild(root);
/*     */         } else {
/* 193 */           byte[] data = new byte[length];
/* 194 */           raFile.readFully(data);
/* 195 */           document = XmlHelper.parse(data);
/*     */         } 
/* 197 */         if (configConsumer.handleConfig(new UpdateConfig(document.getDocumentElement()))) {
/* 198 */           raFile.setLength(0L);
/* 199 */           raFile.seek(0L);
/* 200 */           raFile.write(XmlHelper.getBytes(document));
/* 201 */           updateModifiedDir(parentDir);
/*     */         } 
/*     */       } 
/* 204 */     } catch (Throwable e) {
/* 205 */       e.printStackTrace();
/* 206 */       UpdateLog.log(e);
/* 207 */       error = true;
/*     */     } finally {
/*     */       try {
/* 210 */         if (raFile != null) {
/* 211 */           raFile.close();
/*     */         }
/* 213 */       } catch (IOException e) {
/* 214 */         e.printStackTrace();
/*     */       } 
/* 216 */       if (error && configFile.isFile()) {
/* 217 */         configFile.delete();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void updateModifiedDir(File updateDir) {
/*     */     try {
/* 224 */       long currentTime = System.currentTimeMillis();
/* 225 */       updateDir.setLastModified(currentTime);
/* 226 */       File grandParent = updateDir.getParentFile();
/* 227 */       if (grandParent != null) {
/* 228 */         grandParent.setLastModified(currentTime);
/*     */       }
/* 230 */     } catch (Throwable e) {
/* 231 */       e.printStackTrace();
/* 232 */       UpdateLog.log(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   static File getConfigFile() {
/* 237 */     return new File(AutomaticUpdate.getUpdateDir(), "config.xml");
/*     */   }
/*     */   
/*     */   public static boolean tryLock(FileChannel channel, int tryCount) throws IOException {
/* 241 */     for (int i = 0; i < tryCount; i++) {
/* 242 */       FileLock readLock = channel.tryLock(0L, Long.MAX_VALUE, false);
/* 243 */       if (readLock != null) {
/* 244 */         return true;
/*     */       }
/*     */       try {
/* 247 */         Thread.sleep(50L);
/* 248 */       } catch (InterruptedException e) {
/* 249 */         UpdateLog.log(e);
/* 250 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/* 253 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<String> getArguments(Element element) {
/* 261 */     List<String> ret = new ArrayList<>();
/* 262 */     Element argumentsElement = XmlHelper.findChild(element, "updateArguments");
/* 263 */     if (argumentsElement != null) {
/* 264 */       for (Element argumentElement : XmlHelper.childElements(argumentsElement)) {
/* 265 */         ret.add(argumentElement.getTextContent());
/*     */       }
/*     */     }
/* 268 */     return ret;
/*     */   }
/*     */   
/*     */   private static void setArguments(Element element, List<String> arguments) {
/* 272 */     Element argumentsElement = XmlHelper.findChild(element, "updateArguments");
/* 273 */     if (argumentsElement != null) {
/* 274 */       element.removeChild(argumentsElement);
/*     */     }
/* 276 */     Document document = element.getOwnerDocument();
/* 277 */     argumentsElement = document.createElement("updateArguments");
/* 278 */     element.appendChild(argumentsElement);
/* 279 */     for (String argument : arguments) {
/* 280 */       Element argumentElement = document.createElement("argument");
/* 281 */       argumentElement.setTextContent(argument);
/* 282 */       argumentsElement.appendChild(argumentElement);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static interface ConfigConsumer {
/*     */     boolean handleConfig(UpdateConfig param1UpdateConfig) throws IOException;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\UpdateConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */