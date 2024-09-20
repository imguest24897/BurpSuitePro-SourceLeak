/*     */ package com.install4j.runtime.installer.frontend;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LanguageConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.impl.HelperResourceBundle;
/*     */ import com.install4j.runtime.util.DefaultPropertyResourceBundle;
/*     */ import com.install4j.runtime.util.FileResourceBundle;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.MissingResourceException;
/*     */ import java.util.ResourceBundle;
/*     */ import javax.swing.JOptionPane;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.PropertyKey;
/*     */ 
/*     */ public class Messages {
/*     */   public static final String BUNDLE = "com.install4j.runtime.messages.messages";
/*     */   private static final String LANGUAGES_MESSAGE_PREFIX = "languages.";
/*     */   private static final String MESSAGES_FILE_NAME = "messages_en.utf8";
/*     */   private static final String MESSAGES_RESOURCE_DIR = "com/install4j/runtime/messages";
/*     */   private static final String MESSAGES_FILE_PATH = "com/install4j/runtime/messages/messages_en.utf8";
/*     */   
/*     */   static {
/*  34 */     usedKeys(new String[] { "languages.zh_CN", "languages.zh_TW", "languages.hr", "languages.cs", "languages.da", "languages.nl", "languages.en", "languages.fi", "languages.fr", "languages.de", "languages.el", "languages.hu", "languages.it", "languages.ja", "languages.ko", "languages.no", "languages.pl", "languages.pt", "languages.pt_BR", "languages.ru", "languages.es", "languages.sv", "languages.tr", "languages.ro" });
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
/*  62 */   private static VariableResourceBundleWrapper messages = null;
/*     */   private static LanguageConfig languageConfig;
/*     */   
/*     */   @NotNull
/*     */   public static String getString(@NotNull @PropertyKey(resourceBundle = "com.install4j.runtime.messages.messages") String key) {
/*  67 */     return getMessagesInternal().getString(key);
/*     */   }
/*     */   
/*     */   public static boolean containsKeyDirectly(@NotNull @PropertyKey(resourceBundle = "com.install4j.runtime.messages.messages") String key) {
/*  71 */     return getMessagesInternal().containsKeyDirectly(key);
/*     */   }
/*     */   
/*     */   public static String keyWithoutLeadingDot(@NotNull @PropertyKey(resourceBundle = "com.install4j.runtime.messages.messages") String key) {
/*  75 */     if (key.startsWith(".")) {
/*  76 */       return key.substring(1);
/*     */     }
/*  78 */     return key;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String[] keysWithoutLeadingDot(@NotNull @PropertyKey(resourceBundle = "com.install4j.runtime.messages.messages") String... keys) {
/*  83 */     String[] keysWithoutLeadingDot = new String[keys.length];
/*  84 */     for (int i = 0; i < keys.length; i++) {
/*  85 */       keysWithoutLeadingDot[i] = keyWithoutLeadingDot(keys[i]);
/*     */     }
/*  87 */     return keysWithoutLeadingDot;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void usedKeys(@NotNull @PropertyKey(resourceBundle = "com.install4j.runtime.messages.messages") String... keys) {}
/*     */ 
/*     */   
/*     */   public static void setLanguageConfig(LanguageConfig languageConfig) {
/*  95 */     if (languageConfig == null) {
/*  96 */       throw new IllegalArgumentException("language config cannot be null");
/*     */     }
/*  98 */     Messages.languageConfig = languageConfig;
/*  99 */     messages = null;
/* 100 */     GUIHelper.setLanguage(languageConfig.getId());
/*     */   }
/*     */   
/*     */   public static VariableResourceBundleWrapper getMessagesInternal() {
/* 104 */     if (messages == null) {
/* 105 */       messages = HelperCommunication.getInstance().isElevatedHelper() ? new VariableResourceBundleWrapper((ResourceBundle)new HelperResourceBundle()) : createMessages(languageConfig);
/*     */     }
/* 107 */     return messages;
/*     */   }
/*     */   
/*     */   public static void setMessages(ResourceBundle messages) {
/* 111 */     Messages.messages = new VariableResourceBundleWrapper(messages);
/*     */   }
/*     */   
/*     */   public static String formatString(@PropertyKey(resourceBundle = "com.install4j.runtime.messages.messages") String key, Object... arguments) {
/* 115 */     return format(getString(key), arguments);
/*     */   }
/*     */   public static String format(String pattern, Object... arguments) {
/*     */     String returnValue;
/* 119 */     pattern = StringUtil.replace(pattern, "'", "''");
/*     */ 
/*     */     
/* 122 */     if (!InstallerVariables.isReplaceInstallerAndCompilerVariables()) {
/* 123 */       pattern = StringUtil.replace(pattern, "${installer:", "$'{'installer:");
/* 124 */       pattern = StringUtil.replace(pattern, "${compiler:", "$'{'compiler:");
/* 125 */       pattern = StringUtil.replace(pattern, "${form:", "$'{'form:");
/*     */     } 
/*     */ 
/*     */     
/* 129 */     pattern = StringUtil.replace(pattern, "''{''", "'{'");
/* 130 */     pattern = StringUtil.replace(pattern, "''}''", "'}'");
/* 131 */     MessageFormat messageFormat = new MessageFormat(pattern);
/* 132 */     int argumentCount = (messageFormat.getFormatsByArgumentIndex()).length;
/*     */ 
/*     */     
/* 135 */     if (argumentCount == 0) {
/* 136 */       returnValue = pattern;
/*     */     } else {
/* 138 */       returnValue = messageFormat.format(arguments);
/*     */     } 
/* 140 */     if (!InstallerVariables.isReplaceInstallerAndCompilerVariables()) {
/* 141 */       returnValue = StringUtil.replace(returnValue, "'{'", "{");
/*     */     }
/* 143 */     return returnValue;
/*     */   }
/*     */   
/*     */   public static VariableResourceBundleWrapper createMessages(LanguageConfig languageConfig) {
/*     */     try {
/* 148 */       return createMessages(languageConfig, InstallerConfig.getCurrentInstance());
/* 149 */     } catch (IOException e) {
/* 150 */       e.printStackTrace();
/*     */       
/* 152 */       String message = "Internal error: Could not open message file.";
/* 153 */       if (InstallerUtil.isUnattended() || InstallerUtil.isConsole()) {
/* 154 */         System.err.println(message);
/*     */       } else {
/* 156 */         JOptionPane.showMessageDialog(null, message, "install4j", 0, null);
/*     */       } 
/* 158 */       InstallerUtil.exit(1);
/* 159 */       throw new RuntimeException();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static VariableResourceBundleWrapper createMessages(LanguageConfig languageConfig, InstallerConfig installerConfig) throws IOException {
/*     */     ResourceBundle messages;
/* 165 */     if (languageConfig == null && isResourceAvailable("com/install4j/runtime/messages/messages_en.utf8")) {
/* 166 */       FileResourceBundle fileResourceBundle = createDevResourceBundle();
/*     */     } else {
/* 168 */       if (languageConfig == null) {
/* 169 */         languageConfig = detectLanguageConfig();
/*     */       }
/* 171 */       messages = createResourceBundle(languageConfig, installerConfig);
/*     */     } 
/* 173 */     return new VariableResourceBundleWrapper(messages);
/*     */   }
/*     */   
/*     */   private static LanguageConfig detectLanguageConfig() throws IOException {
/* 177 */     File configFile = InstallerUtil.getInstallerFile("i4jparams.conf");
/* 178 */     if (!configFile.exists() || !configFile.canRead()) {
/* 179 */       return null;
/*     */     }
/* 181 */     InstallerConfig config = InstallerConfig.getConfigFromFile(configFile);
/* 182 */     Locale locale = Locale.getDefault();
/* 183 */     String languageId = locale.getLanguage();
/* 184 */     LanguageConfig languageConfig = config.getLanguageById(languageId);
/* 185 */     if (languageConfig != null) {
/* 186 */       return languageConfig;
/*     */     }
/* 188 */     String languageAndCountryId = languageId + "_" + locale.getCountry();
/* 189 */     LanguageConfig languageAndCountryConfig = config.getLanguageById(languageAndCountryId);
/* 190 */     if (languageAndCountryConfig != null) {
/* 191 */       return languageAndCountryConfig;
/*     */     }
/* 193 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean isResourceAvailable(String resourcePath) {
/* 199 */     return (ResourceHelper.class.getClassLoader().getResource(resourcePath) != null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected static FileResourceBundle createDevResourceBundle() throws IOException {
/* 204 */     FileResourceBundle defaultResourceBundle = new FileResourceBundle(ResourceHelper.class.getClassLoader().getResourceAsStream("com/install4j/runtime/messages/messages_en.utf8"), null);
/* 205 */     FileResourceBundle localizedResourceBundle = getLocalizedDevResourceBundle(defaultResourceBundle);
/* 206 */     if (localizedResourceBundle != null) {
/* 207 */       return localizedResourceBundle;
/*     */     }
/* 209 */     return defaultResourceBundle;
/*     */   }
/*     */ 
/*     */   
/*     */   private static FileResourceBundle getLocalizedDevResourceBundle(FileResourceBundle defaultResourceBundle) throws IOException {
/* 214 */     Locale locale = Locale.getDefault();
/* 215 */     FileResourceBundle countryBundle = getLocalizedDevResourceBundle(locale.getLanguage() + "_" + locale.getCountry(), defaultResourceBundle);
/* 216 */     if (countryBundle != null) {
/* 217 */       return countryBundle;
/*     */     }
/* 219 */     return getLocalizedDevResourceBundle(locale.getLanguage(), defaultResourceBundle);
/*     */   }
/*     */ 
/*     */   
/*     */   private static FileResourceBundle getLocalizedDevResourceBundle(String localeName, FileResourceBundle defaultResourceBundle) throws IOException {
/* 224 */     String resourcePath = "com/install4j/runtime/messages/messages_" + localeName + ".utf8";
/* 225 */     if (!localeName.equals("en") && isResourceAvailable(resourcePath)) {
/* 226 */       InputStream inputStream = ResourceHelper.class.getClassLoader().getResourceAsStream(resourcePath);
/* 227 */       return new FileResourceBundle(inputStream, (ResourceBundle)defaultResourceBundle);
/*     */     } 
/* 229 */     return null;
/*     */   }
/*     */   
/*     */   protected static ResourceBundle createResourceBundle(LanguageConfig languageConfig, InstallerConfig installerConfig) throws IOException {
/*     */     ResourceBundle messages;
/* 234 */     File defaultMessagesFile = InstallerUtil.getInstallerFile("MessagesDefault");
/* 235 */     if (!defaultMessagesFile.exists()) {
/* 236 */       defaultMessagesFile = InstallerUtil.getInstallerFile("messages/messages_en.utf8");
/*     */     }
/* 238 */     FileResourceBundle fileResourceBundle = new FileResourceBundle(defaultMessagesFile, null);
/*     */     
/* 240 */     if (languageConfig == null) {
/* 241 */       FileResourceBundle fileResourceBundle1 = fileResourceBundle;
/*     */     } else {
/* 243 */       ResourceBundle resourceBundle; if (installerConfig != null) {
/* 244 */         LanguageConfig principalLanguageConfig = installerConfig.getLanguages().get(0);
/* 245 */         resourceBundle = createResourceBundleWithCustomLocalization(principalLanguageConfig, (ResourceBundle)fileResourceBundle);
/*     */       } 
/*     */       
/* 248 */       File messagesFile = InstallerUtil.getInstallerFile(languageConfig.getMessageFile());
/* 249 */       if (messagesFile.exists()) {
/* 250 */         FileResourceBundle fileResourceBundle1 = new FileResourceBundle(messagesFile, resourceBundle);
/*     */       } else {
/* 252 */         messages = resourceBundle;
/*     */       } 
/*     */       
/* 255 */       messages = createResourceBundleWithCustomLocalization(languageConfig, messages);
/*     */     } 
/* 257 */     return messages;
/*     */   }
/*     */   private static ResourceBundle createResourceBundleWithCustomLocalization(LanguageConfig languageConfig, ResourceBundle messages) throws IOException {
/*     */     FileResourceBundle fileResourceBundle;
/* 261 */     String customLocalizationFileName = languageConfig.getCustomLocalizationFile();
/* 262 */     if (customLocalizationFileName.trim().length() > 0) {
/* 263 */       File customLocalizationFile = InstallerUtil.getInstallerFile(customLocalizationFileName);
/* 264 */       if (customLocalizationFile.exists()) {
/* 265 */         DefaultPropertyResourceBundle defaultPropertyResourceBundle; if (customLocalizationFileName.toLowerCase(Locale.ENGLISH).endsWith("properties")) {
/* 266 */           defaultPropertyResourceBundle = DefaultPropertyResourceBundle.create(customLocalizationFile, messages);
/*     */         } else {
/* 268 */           fileResourceBundle = new FileResourceBundle(customLocalizationFile, (ResourceBundle)defaultPropertyResourceBundle);
/*     */         } 
/*     */       } 
/*     */     } 
/* 272 */     return (ResourceBundle)fileResourceBundle;
/*     */   }
/*     */   
/*     */   public static List<LanguageConfig> sortLanguages(List<LanguageConfig> languages, ResourceBundle messages) {
/* 276 */     List<LanguageConfig> sortedList = new ArrayList<>(languages);
/* 277 */     sortedList.sort((o1, o2) -> {
/*     */           String name1 = getLocalizedLanguageName(o1, messages);
/*     */           
/*     */           String name2 = getLocalizedLanguageName(o2, messages);
/*     */           return name1.compareTo(name2);
/*     */         });
/* 283 */     return sortedList;
/*     */   }
/*     */   
/*     */   public static String getLocalizedLanguageName(LanguageConfig languageConfig, ResourceBundle messages) {
/* 287 */     String localizedName = null;
/*     */     try {
/* 289 */       localizedName = messages.getString("languages." + languageConfig.getId());
/* 290 */     } catch (MissingResourceException missingResourceException) {}
/*     */     
/* 292 */     if (localizedName != null) {
/* 293 */       return localizedName;
/*     */     }
/* 295 */     return languageConfig.getName();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\Messages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */