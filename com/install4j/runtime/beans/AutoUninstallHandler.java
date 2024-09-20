/*     */ package com.install4j.runtime.beans;
/*     */ 
/*     */ import com.install4j.api.actions.AutoUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Properties;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AutoUninstallHandler
/*     */ {
/*     */   public static final String AUTO_UNINSTALL_FILE_PREFIX = "autoUninstall.";
/*     */   private static final String ELEMENT_ROOT = "autoUninstall";
/*     */   private static final String ELEMENT_ACTION = "action";
/*     */   
/*     */   public static byte[] getPropertyFileBytes(List<AutoUninstallAction> autoUninstallActions) throws IOException {
/*  27 */     if (autoUninstallActions.size() == 0) {
/*  28 */       return null;
/*     */     }
/*     */     
/*  31 */     Document document = XmlHelper.createDocument();
/*  32 */     Element root = document.createElement("autoUninstall");
/*  33 */     document.appendChild(root);
/*     */     
/*  35 */     for (AutoUninstallAction autoUninstallAction : autoUninstallActions) {
/*  36 */       Element child = document.createElement("action");
/*  37 */       child.setAttribute("className", autoUninstallAction.getClass().getName());
/*  38 */       Properties properties = autoUninstallAction.getPersistentProperties();
/*  39 */       for (Map.Entry<Object, Object> entry : properties.entrySet()) {
/*  40 */         Element propElement = document.createElement("property");
/*  41 */         propElement.setAttribute("name", (String)entry.getKey());
/*  42 */         propElement.setAttribute("value", (String)entry.getValue());
/*  43 */         child.appendChild(propElement);
/*     */       } 
/*  45 */       root.appendChild(child);
/*     */     } 
/*     */ 
/*     */     
/*  49 */     return XmlHelper.getBytes(document);
/*     */   }
/*     */   private static final String ELEMENT_PROPERTY = "property"; private static final String ATTRIBUTE_CLASS_NAME = "className"; private static final String ATTRIBUTE_NAME = "name"; private static final String ATTRIBUTE_VALUE = "value";
/*     */   public static void writeFile(byte[] bytes, File runtimeDirectory) throws IOException {
/*  53 */     if (bytes != null) {
/*  54 */       List<Integer> numbers = getAutoUninstallFileNumbers(runtimeDirectory);
/*  55 */       int number = numbers.isEmpty() ? 1 : (((Integer)numbers.get(numbers.size() - 1)).intValue() + 1);
/*  56 */       File autoUninstallFile = new File(runtimeDirectory, "autoUninstall." + number);
/*  57 */       FileOutputStream out = new FileOutputStream(autoUninstallFile);
/*  58 */       out.write(bytes);
/*  59 */       out.close();
/*     */       
/*  61 */       FileInstaller.getInstance().registerUninstallFile(autoUninstallFile);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static List<AutoUninstallAction> getAutoUninstallActionsFromFile(File autoUninstallFile) throws IOException {
/*  66 */     List<AutoUninstallAction> actions = new ArrayList<>();
/*  67 */     Element root = XmlHelper.parseFile(autoUninstallFile).getDocumentElement();
/*     */     
/*  69 */     for (Element actionElement : XmlHelper.childElements(root)) {
/*     */       
/*  71 */       AutoUninstallAction autoUninstallAction = null;
/*     */       try {
/*  73 */         autoUninstallAction = (AutoUninstallAction)Class.forName(actionElement.getAttribute("className"), true, (ClassLoader)Install4jClassLoader.getInstance()).newInstance();
/*  74 */       } catch (Throwable t) {
/*  75 */         if (Boolean.getBoolean("install4j.debugAutoUninstall")) {
/*  76 */           t.printStackTrace();
/*     */         }
/*     */       } 
/*     */       
/*  80 */       if (autoUninstallAction != null) {
/*  81 */         Properties properties = new Properties();
/*     */         
/*  83 */         for (Element propertyElement : XmlHelper.childElements(actionElement)) {
/*  84 */           properties.setProperty(propertyElement.getAttribute("name"), propertyElement.getAttribute("value"));
/*     */         }
/*     */         
/*  87 */         autoUninstallAction.setPersistentProperties(properties);
/*  88 */         actions.add(autoUninstallAction);
/*     */       } 
/*     */     } 
/*  91 */     return actions;
/*     */   }
/*     */   
/*     */   public static List<Integer> getAutoUninstallFileNumbers(File runtimeDirectory) {
/*  95 */     List<Integer> autoUninstallFileNumbers = new ArrayList<>();
/*  96 */     File[] files = runtimeDirectory.listFiles();
/*  97 */     if (files != null) {
/*  98 */       for (File file : files) {
/*  99 */         String name = file.getName();
/* 100 */         if (name.startsWith("autoUninstall.")) {
/*     */           try {
/* 102 */             int number = Integer.parseInt(name.substring("autoUninstall.".length()));
/* 103 */             autoUninstallFileNumbers.add(Integer.valueOf(number));
/* 104 */           } catch (NumberFormatException e) {
/* 105 */             e.printStackTrace();
/*     */           } 
/*     */         }
/*     */       } 
/*     */     }
/* 110 */     Collections.sort(autoUninstallFileNumbers);
/* 111 */     return autoUninstallFileNumbers;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\AutoUninstallHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */