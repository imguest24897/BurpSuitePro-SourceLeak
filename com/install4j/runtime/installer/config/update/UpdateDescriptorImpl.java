/*     */ package com.install4j.runtime.installer.config.update;
/*     */ 
/*     */ import com.install4j.api.update.UpdateDescriptor;
/*     */ import com.install4j.api.update.UpdateDescriptorEntry;
/*     */ import com.install4j.runtime.installer.config.AbstractConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class UpdateDescriptorImpl
/*     */   extends AbstractConfig
/*     */   implements UpdateDescriptor
/*     */ {
/*     */   public static final String ELEMENT_UPDATE_DESCRIPTOR = "updateDescriptor";
/*     */   public static final String ATTRIBUTE_BASE_URL = "baseUrl";
/*     */   private UpdateDescriptorEntry[] entries;
/*  28 */   private String baseUrl = "";
/*     */   
/*     */   public UpdateDescriptorImpl(List<UpdateDescriptorEntryImpl> updateDescriptorEntries, String baseUrl) {
/*  31 */     this.baseUrl = baseUrl;
/*  32 */     this.entries = updateDescriptorEntries.<UpdateDescriptorEntry>toArray(new UpdateDescriptorEntry[0]);
/*     */   }
/*     */ 
/*     */   
/*     */   public UpdateDescriptorImpl() {}
/*     */ 
/*     */   
/*     */   public UpdateDescriptorEntry[] getEntries() {
/*  40 */     return this.entries;
/*     */   }
/*     */ 
/*     */   
/*     */   public UpdateDescriptorEntry getPossibleUpdateEntry() {
/*  45 */     if (this.entries == null) {
/*  46 */       return null;
/*     */     }
/*     */     try {
/*  49 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  50 */       if (config == null) {
/*  51 */         config = InstallerConfig.getGeneralConfigFromFile(InstallerUtil.getInstallerFile("i4jparams.conf"));
/*     */       }
/*     */       
/*  54 */       String mediaSetId = config.getMediaSetId();
/*  55 */       String version = config.getApplicationVersion();
/*     */       
/*  57 */       for (UpdateDescriptorEntry entry : this.entries) {
/*  58 */         if (Objects.equals(entry.getTargetMediaFileId(), mediaSetId) && entry.checkVersionCompatible(version)) {
/*  59 */           return entry;
/*     */         }
/*     */       } 
/*  62 */     } catch (IOException e) {
/*  63 */       e.printStackTrace();
/*     */     } 
/*  65 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getBaseUrl() {
/*  70 */     return this.baseUrl;
/*     */   }
/*     */   
/*     */   public void read(File file, URL descriptorUrl) throws IOException {
/*     */     URL folderURL;
/*  75 */     Document document = XmlHelper.parseFile(file);
/*  76 */     read(document.getDocumentElement());
/*     */ 
/*     */     
/*  79 */     if (this.baseUrl.trim().length() > 0) {
/*  80 */       folderURL = new URL(this.baseUrl);
/*     */     } else {
/*  82 */       String path = descriptorUrl.getPath();
/*  83 */       int slashPos = path.lastIndexOf('/');
/*  84 */       if (slashPos > -1) {
/*  85 */         path = path.substring(0, slashPos + 1);
/*     */       }
/*  87 */       folderURL = new URL(descriptorUrl.getProtocol(), descriptorUrl.getHost(), descriptorUrl.getPort(), path);
/*     */     } 
/*  89 */     for (UpdateDescriptorEntry entry : this.entries) {
/*  90 */       ((UpdateDescriptorEntryImpl)entry).setURL(new URL(folderURL, entry.getFileName()));
/*     */     }
/*     */     
/*  93 */     if (UpdateLog.enabled(10)) {
/*  94 */       UpdateDescriptorEntry possibleUpdateEntry = getPossibleUpdateEntry();
/*  95 */       UpdateLog.log(10, "possibleUpdateEntry: " + possibleUpdateEntry);
/*  96 */       if (possibleUpdateEntry != null) {
/*  97 */         UpdateLog.log(10, "downloaded: " + possibleUpdateEntry.isDownloaded());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/* 104 */     this.baseUrl = readAttribute(element, "baseUrl", this.baseUrl);
/*     */     
/* 106 */     List<UpdateDescriptorEntryImpl> entryList = new ArrayList<>();
/*     */     
/* 108 */     for (Element childElement : childElements(element)) {
/* 109 */       UpdateDescriptorEntryImpl entry = new UpdateDescriptorEntryImpl();
/* 110 */       entry.read(childElement);
/* 111 */       entryList.add(entry);
/*     */     } 
/*     */     
/* 114 */     this.entries = entryList.<UpdateDescriptorEntry>toArray(new UpdateDescriptorEntry[0]);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\confi\\update\UpdateDescriptorImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */