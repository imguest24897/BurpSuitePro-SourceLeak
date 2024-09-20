/*     */ package com.install4j.runtime.launcher;
/*     */ 
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.launcher.Variables;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LanguageConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ import java.util.ResourceBundle;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class LauncherVariables {
/*     */   private static String applicationId;
/*     */   private static String applicationVersion;
/*     */   private static String applicationName;
/*     */   private static ResourceBundle messages;
/*     */   private static final String MISSING_REPLACEMENT = "null";
/*     */   
/*     */   public static String replaceVariables(String value) {
/*  29 */     return replaceVariables(value, null);
/*     */   }
/*     */   
/*     */   public static String replaceVariables(String value, StringUtil.ReplacementCallback additionalCallback) {
/*  33 */     value = StringUtil.replaceVariable(value, (token, memento, hasFallback) -> token.startsWith("installer:") ? getInstallerVariable(token.substring("installer:".length())) : (token.startsWith("i18n:") ? ((messages != null) ? InstallerVariables.replaceI18n(token, messages, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE, hasFallback, ()) : "messages not found") : ((token.indexOf(':') == -1) ? System.getenv().get(token) : ((additionalCallback != null) ? additionalCallback.getReplacement(token, memento, hasFallback) : null))));
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
/*     */     
/*  54 */     return value;
/*     */   }
/*     */   
/*     */   public static Properties replaceVariables(Properties properties) {
/*  58 */     Properties replacedProperties = new Properties();
/*  59 */     for (Map.Entry<Object, Object> entry : properties.entrySet()) {
/*  60 */       String name = (String)entry.getKey();
/*  61 */       String value = replaceVariables((String)entry.getValue());
/*  62 */       replacedProperties.put(name, value);
/*     */     } 
/*     */     
/*  65 */     return replacedProperties;
/*     */   }
/*     */   
/*     */   public static List<String> replaceVariables(List<String> list) {
/*  69 */     List<String> replacedList = new ArrayList<>(list.size());
/*  70 */     for (String value : list) {
/*  71 */       replacedList.add(replaceVariables(value));
/*     */     }
/*  73 */     return replacedList;
/*     */   }
/*     */   
/*     */   public static String[] init(Class mainClass, String[] args) {
/*  77 */     List<String> replacedArgs = null;
/*  78 */     if (args != null) {
/*  79 */       replacedArgs = new ArrayList<>();
/*  80 */       String prefix = "${installer:";
/*  81 */       for (String arg : args) {
/*  82 */         if (arg.startsWith(prefix) && arg.indexOf('}') == arg.length() - 1) {
/*  83 */           String variableName = arg.substring(prefix.length(), arg.length() - 1);
/*  84 */           Object variableValue = Variables.getInstallerVariable(variableName);
/*  85 */           if (variableValue instanceof Object[]) {
/*  86 */             Object[] variableValues = (Object[])variableValue;
/*  87 */             for (Object valueElement : variableValues) {
/*  88 */               addIfNotEmpty(replacedArgs, replaceVariables(valueElement.toString()));
/*     */             }
/*     */           } else {
/*  91 */             replacedArgs.add(replaceVariables(arg));
/*     */           } 
/*     */         } else {
/*  94 */           replacedArgs.add(replaceVariables(arg));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  99 */     replaceSystemProperties(mainClass);
/* 100 */     return (replacedArgs == null) ? new String[0] : replacedArgs.<String>toArray(new String[0]);
/*     */   }
/*     */   
/*     */   private static void addIfNotEmpty(List<String> values, String value) {
/* 104 */     if (value != null && value.length() > 0)
/* 105 */       values.add(value); 
/*     */   }
/*     */   
/*     */   private static String getInstallerVariable(String variableName) {
/* 109 */     Object value = Variables.getInstallerVariable(variableName);
/* 110 */     if (value == null) {
/* 111 */       return "null";
/*     */     }
/* 113 */     return value.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void replaceSystemProperties(Class<MacLauncher> mainClass) {
/* 118 */     Properties systemProperties = System.getProperties();
/* 119 */     List<String> keyNames = new ArrayList<>(systemProperties.size());
/* 120 */     for (Object o : systemProperties.keySet()) {
/* 121 */       keyNames.add((String)o);
/*     */     }
/*     */     
/* 124 */     for (String keyName : keyNames) {
/* 125 */       String value = replaceVariables(System.getProperty(keyName));
/*     */       
/* 127 */       if (Objects.equals(keyName, "java.library.path")) {
/* 128 */         if (mainClass == MacLauncher.class) {
/*     */           
/* 130 */           String appPackage = System.getProperty("exe4j.moduleName");
/* 131 */           if (appPackage != null) {
/*     */             
/* 133 */             value = value.replaceAll(InstallerVariables.quoteRegexpSearch(appPackage + "/..//"), "/");
/*     */             
/* 135 */             value = value.replaceAll(InstallerVariables.quoteRegexpSearch(appPackage + "/Contents/Resources/app//"), "/");
/*     */           } 
/* 137 */         } else if (mainClass == Launcher.class || mainClass == UnixLauncher.class) {
/*     */           
/* 139 */           String userDir = System.getProperty("user.dir");
/* 140 */           value = value.replaceAll(InstallerVariables.quoteRegexpSearch(userDir + "//"), "/");
/*     */         } 
/*     */       }
/*     */       
/* 144 */       System.setProperty(keyName, value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String getApplicationId() throws IOException {
/* 149 */     initConfig();
/* 150 */     return applicationId;
/*     */   }
/*     */   
/*     */   public static String getApplicationVersion() throws IOException {
/* 154 */     initConfig();
/* 155 */     return applicationVersion;
/*     */   }
/*     */   
/*     */   public static String getApplicationName() throws IOException {
/* 159 */     initConfig();
/* 160 */     return applicationName;
/*     */   }
/*     */   
/*     */   private static synchronized void initConfig() throws IOException {
/* 164 */     if (applicationId == null || applicationVersion == null || applicationName == null) {
/* 165 */       InstallerConfig config = InstallerConfig.getGeneralConfigFromFile(InstallerUtil.getInstallerFile("i4jparams.conf"));
/* 166 */       applicationId = config.getApplicationId();
/* 167 */       applicationVersion = config.getApplicationVersion();
/* 168 */       applicationName = config.getApplicationName();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void setLanguageId(String languageId) {
/* 173 */     if (languageId != null && !languageId.isEmpty()) {
/* 174 */       InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/* 175 */       if (installerConfig == null) {
/*     */         try {
/* 177 */           installerConfig = InstallerConfig.getConfigFromFile(InstallerUtil.getInstallerFile("i4jparams.conf"));
/* 178 */         } catch (IOException e) {
/* 179 */           e.printStackTrace();
/*     */         } 
/*     */       }
/* 182 */       if (installerConfig != null) {
/* 183 */         LanguageConfig languageConfig = installerConfig.getLanguageById(languageId);
/* 184 */         if (languageConfig == null && !installerConfig.getLanguages().isEmpty()) {
/* 185 */           languageConfig = installerConfig.getLanguages().get(0);
/*     */         }
/* 187 */         if (languageConfig != null)
/*     */           try {
/* 189 */             messages = new LauncherResourceBundleWrapper(Messages.createMessages(languageConfig, installerConfig).getPlainMessages());
/* 190 */           } catch (IOException e) {
/* 191 */             e.printStackTrace();
/*     */           }  
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class LauncherResourceBundleWrapper
/*     */     extends ResourceBundle
/*     */   {
/*     */     private ResourceBundle messages;
/*     */     
/*     */     public LauncherResourceBundleWrapper(ResourceBundle messages) {
/* 203 */       this.messages = messages;
/*     */     }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public Enumeration<String> getKeys() {
/* 209 */       return this.messages.getKeys();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Object handleGetObject(@NotNull String key) {
/* 214 */       return LauncherVariables.replaceVariables((String)this.messages.getObject(key));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\LauncherVariables.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */