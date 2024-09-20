/*     */ package com.install4j.runtime.installer.platform.macos;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ public class PlistHelper
/*     */ {
/*     */   public static Element findValue(Element element, String keyName) throws IOException {
/*  22 */     String currentKey = "";
/*  23 */     for (Element child : XmlHelper.childElements(element)) {
/*  24 */       if (Objects.equals(child.getTagName(), "key")) {
/*  25 */         currentKey = XmlHelper.getTextValue(child); continue;
/*  26 */       }  if (Objects.equals(currentKey, keyName)) {
/*  27 */         return child;
/*     */       }
/*     */     } 
/*  30 */     throw new NotFoundException("could not find key: " + keyName);
/*     */   }
/*     */   
/*     */   public static Element getFirstChild(Element element, String name) throws IOException {
/*  34 */     for (Element child : XmlHelper.childElements(element)) {
/*  35 */       if (Objects.equals(child.getTagName(), name)) {
/*  36 */         return child;
/*     */       }
/*     */     } 
/*  39 */     throw new NotFoundException("could not find child: " + name);
/*     */   }
/*     */   
/*     */   public static boolean removeElementWithChild(String plistName, String arrayName, String[] childKeys, String childValue, boolean contained) throws IOException {
/*  43 */     File plistFile = new File(new File(Util.getUserHome(), "Library/Preferences"), plistName + ".plist");
/*  44 */     File xmlFile = getPlistXmlFile(plistFile);
/*     */     
/*  46 */     Document document = XmlHelper.parseFile(xmlFile);
/*  47 */     if (removeElementWithChild(findValue(getFirstChild(document.getDocumentElement(), "dict"), arrayName), childKeys, childValue, contained)) {
/*  48 */       Logger.getInstance().log(null, "removed child", true);
/*  49 */       XmlHelper.writeFile(xmlFile, document);
/*  50 */       return storePlistFile(xmlFile, plistFile);
/*     */     } 
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void flushCache() {
/*     */     try {
/*  58 */       Execution.executeAndWait(new String[] { "killall", "cfprefsd" }, null);
/*  59 */     } catch (Throwable e) {
/*  60 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean removeElementWithChild(Element arrayElement, String[] childKeys, String childValue, boolean contained) throws IOException {
/*  65 */     for (Element dictElement : XmlHelper.childElements(arrayElement)) {
/*     */       try {
/*  67 */         Element currentElement = dictElement;
/*  68 */         for (int i = 0; currentElement != null && i < childKeys.length; i++) {
/*  69 */           currentElement = findValue(currentElement, childKeys[i]);
/*     */         }
/*  71 */         if (currentElement != null) {
/*  72 */           String textValue = XmlHelper.getTextValue(currentElement);
/*  73 */           if (childValue.equals(textValue) || (contained && textValue != null && textValue.contains(childValue))) {
/*  74 */             arrayElement.removeChild(dictElement);
/*  75 */             return true;
/*     */           } 
/*     */         } 
/*  78 */       } catch (IOException iOException) {}
/*     */     } 
/*     */ 
/*     */     
/*  82 */     return false;
/*     */   }
/*     */   
/*     */   public static File getPlistXmlFile(File file) throws IOException {
/*  86 */     File tempFile = File.createTempFile("i4j", ".plist");
/*  87 */     InstallerUtil.deleteOnExit(tempFile);
/*     */     
/*  89 */     FileUtil.copyFile(file, tempFile);
/*     */     
/*  91 */     StringBuffer buffer = new StringBuffer();
/*  92 */     if (Execution.executeAndWait(new String[] { "plutil", "-convert", "xml1", tempFile.getAbsolutePath() }, buffer)) {
/*  93 */       return tempFile;
/*     */     }
/*  95 */     tempFile.delete();
/*  96 */     throw new IOException("plutil returned " + buffer);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean storePlistFile(File xmlFile, File plistFile) throws IOException {
/*     */     try {
/* 102 */       StringBuffer buffer = new StringBuffer();
/* 103 */       if (Execution.executeAndWait(new String[] { "plutil", "-convert", "binary1", xmlFile.getAbsolutePath() }, buffer)) {
/* 104 */         FileUtil.copyFile(xmlFile, plistFile);
/* 105 */         return true;
/*     */       } 
/* 107 */       throw new IOException("plutil returned " + buffer);
/*     */     } finally {
/*     */       
/* 110 */       xmlFile.delete();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean addToPlist(String plistName, String arrayName, Object[][] keysAndValues) {
/* 115 */     Integer ret = LaunchHelper.launchApplication((new LaunchDescriptor(new File("/usr/bin/defaults"))).arguments(new String[] { "write", plistName, arrayName, "-array-add", getDict(keysAndValues) }).executionContext(ExecutionContext.UNELEVATED).wait(true));
/* 116 */     return (ret != null && ret.intValue() == 0);
/*     */   }
/*     */   
/*     */   public static String getDict(Object[][] keysAndValues) {
/* 120 */     if (keysAndValues.length != 2) throw new IllegalArgumentException("array length: " + keysAndValues.length); 
/* 121 */     Object[] keys = keysAndValues[0];
/* 122 */     Object[] values = keysAndValues[1];
/* 123 */     if (keys.length != values.length) throw new IllegalArgumentException("keys: " + keys.length + ", values: " + values.length);
/*     */     
/* 125 */     StringBuilder buffer = new StringBuilder();
/* 126 */     buffer.append("<dict>");
/* 127 */     for (int i = 0; i < keys.length; i++) {
/* 128 */       buffer.append("<key>").append(keys[i]).append("</key>");
/* 129 */       if (values[i] instanceof String) {
/* 130 */         buffer.append("<string>").append(values[i]).append("</string>");
/* 131 */       } else if (values[i] instanceof Boolean) {
/* 132 */         if (((Boolean)values[i]).booleanValue()) {
/* 133 */           buffer.append("<true/>");
/*     */         } else {
/* 135 */           buffer.append("<false/>");
/*     */         } 
/* 137 */       } else if (values[i] instanceof Integer) {
/* 138 */         buffer.append("<integer>").append(values[i]).append("</integer>");
/* 139 */       } else if (values[i] instanceof Object[][]) {
/* 140 */         buffer.append(getDict((Object[][])values[i]));
/*     */       } else {
/* 142 */         throw new IllegalArgumentException();
/*     */       } 
/*     */     } 
/* 145 */     buffer.append("</dict>");
/* 146 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   public static class NotFoundException extends IOException {
/*     */     public NotFoundException(String s) {
/* 151 */       super(s);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\PlistHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */