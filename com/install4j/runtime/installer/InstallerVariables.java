/*      */ package com.install4j.runtime.installer;
/*      */ import com.install4j.api.Util;
/*      */ import com.install4j.api.beans.Bean;
/*      */ import com.install4j.api.beans.ReplacementMode;
/*      */ import com.install4j.api.beans.VariableErrorHandling;
/*      */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*      */ import com.install4j.api.context.Context;
/*      */ import com.install4j.api.windows.WinFileSystem;
/*      */ import com.install4j.runtime.beans.actions.misc.OverwriteStrategy;
/*      */ import com.install4j.runtime.beans.actions.misc.VariableSelectionMode;
/*      */ import com.install4j.runtime.beans.actions.properties.TextProperties;
/*      */ import com.install4j.runtime.installer.config.ApplicationBeanConfig;
/*      */ import com.install4j.runtime.installer.config.InstallerConfig;
/*      */ import com.install4j.runtime.installer.frontend.Messages;
/*      */ import com.install4j.runtime.installer.frontend.VariableResourceBundleWrapper;
/*      */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*      */ import com.install4j.runtime.installer.helper.VariableEncoding;
/*      */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*      */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*      */ import com.install4j.runtime.installer.platform.unix.UnixSpecialDirs;
/*      */ import com.install4j.runtime.launcher.integration.AutomaticUpdate;
/*      */ import com.install4j.runtime.util.StringUtil;
/*      */ import java.awt.Color;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import java.util.Map;
/*      */ import java.util.ResourceBundle;
/*      */ import java.util.Set;
/*      */ 
/*      */ public class InstallerVariables {
/*   45 */   private static final String MODULE_NAME = System.getProperty("exe4j.moduleName");
/*      */   private static final String RESPONSE_FILE_HEADER = "# install4j response file for ";
/*   47 */   private static final ThreadLocal<Object> LAST_VARIABLE_VALUE = new ThreadLocal();
/*      */   
/*   49 */   private static final VariableReplacer VARIABLE_REPLACER = new VariableReplacer()
/*      */     {
/*      */       public Object getVariable(String variableName) {
/*   52 */         return InstallerVariables.getVariable(variableName);
/*      */       }
/*      */ 
/*      */       
/*      */       public String replaceVariables(String content, ReplacementMode replacementMode, VariableErrorHandlingDescriptor variableErrorHandlingDescriptor) {
/*   57 */         return InstallerVariables.replaceVariables(content, replacementMode, variableErrorHandlingDescriptor);
/*      */       }
/*      */     };
/*   60 */   public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
/*   61 */   public static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("kkmmss");
/*      */   
/*   63 */   private static final Map<String, VariableReplacer> VARIABLE_REPLACERS = createVariableReplacers();
/*      */   public static final String INSTALLER_VARIABLE_VERBOSE = "installer variable";
/*      */   public static final String COMPILER_VARIABLE_VERBOSE = "compiler variable";
/*      */   public static final String I18N_KEY_VERBOSE = "i18n key";
/*      */   
/*      */   private static Map<String, VariableReplacer> createVariableReplacers() {
/*   69 */     HashMap<String, VariableReplacer> map = new HashMap<>();
/*   70 */     map.put("installer:", VARIABLE_REPLACER);
/*   71 */     return Collections.unmodifiableMap(map);
/*      */   }
/*      */   
/*   74 */   private static Map<String, Object> props = Collections.synchronizedMap(new TreeMap<>());
/*      */   
/*   76 */   private static Map<String, VariableProvider> variableProviders = Collections.synchronizedMap(new HashMap<>());
/*      */   
/*   78 */   private static Set<String> hiddenVariables = Collections.synchronizedSet(new HashSet<>());
/*   79 */   private static Set<String> responseFileVariables = Collections.synchronizedSet(new HashSet<>());
/*   80 */   private static Map<String, String> responseFileComments = Collections.synchronizedMap(new HashMap<>());
/*      */   
/*      */   private static boolean replaceInstallerAndCompilerVariables = false;
/*      */   
/*      */   private static boolean replaceI18nVariables = false;
/*      */   
/*      */   private static DesignTimeVariableProcessor designTimeVariableProcessor;
/*      */   private static DesignTimeTextOverrideProcessor designTimeTextOverrideProcessor;
/*      */   public static final String INSTALLER_PREFIX = "installer:";
/*      */   public static final String FORM_PREFIX = "form:";
/*      */   public static final String COMPILER_PREFIX = "compiler:";
/*      */   public static final String I18N_PREFIX = "i18n:";
/*   92 */   private static final List<String> RUNTIME_PREFIXES = Arrays.asList(new String[] { "installer:", "form:" });
/*      */   
/*      */   private static final String VARFILE_SUFFIX = ".varfile";
/*      */   
/*      */   public static final String VARIABLE_PATHLIST_SEPARATOR = "sys.pathlistSeparator";
/*      */   
/*      */   public static final String VARIABLE_FILE_SEPARATOR = "sys.fileSeparator";
/*      */   
/*      */   public static final String VARIABLE_USER_HOME = "sys.userHome";
/*      */   
/*      */   public static final String VARIABLE_USER_NAME = "sys.userName";
/*      */   
/*      */   public static final String VARIABLE_TEMP_DIR = "sys.tempDir";
/*      */   
/*      */   public static final String VARIABLE_WORKING_DIR = "sys.workingDir";
/*      */   
/*      */   public static final String VARIABLE_WINDOWS_DIR = "sys.windowsDir";
/*      */   
/*      */   public static final String VARIABLE_SYSTEM32_DIR = "sys.system32Dir";
/*      */   
/*      */   public static final String VARIABLE_COMMON_DIR = "sys.commonDir";
/*      */   public static final String VARIABLE_PROGRAM_FILES_DIR = "sys.programFilesDir";
/*      */   public static final String VARIABLE_PROGRAM_DATA_DIR = "sys.programDataDir";
/*      */   public static final String VARIABLE_DESKTOP_DIR = "sys.desktopDir";
/*      */   public static final String VARIABLE_STARTMENU_DIR = "sys.startMenuDir";
/*      */   public static final String VARIABLE_PROGRAMS_DIR = "sys.programsDir";
/*      */   public static final String VARIABLE_STARTUP_DIR = "sys.startupDir";
/*      */   public static final String VARIABLE_SENDTO_DIR = "sys.sendToDir";
/*      */   public static final String VARIABLE_FONTS_DIR = "sys.fontsDir";
/*      */   public static final String VARIABLE_APPDATA_DIR = "sys.appdataDir";
/*      */   public static final String VARIABLE_DOCS_DIR = "sys.docsDir";
/*      */   public static final String VARIABLE_DOWNLOADS_DIR = "sys.downloadsDir";
/*      */   public static final String VARIABLE_TEMPLATES_DIR = "sys.templatesDir";
/*      */   public static final String VARIABLE_FAVORITES_DIR = "sys.favoritesDir";
/*      */   public static final String VARIABLE_LOCAL_APPDATA_DIR = "sys.localAppdataDir";
/*      */   public static final String VARIABLE_UPDATE_STORAGE_DIR = "sys.updateStorageDir";
/*      */   public static final String VARIABLE_AUTOMATIC_UPDATE = "sys.automaticUpdate";
/*      */   public static final String VARIABLE_INSTALLATION_DIR = "sys.installationDir";
/*      */   public static final String VARIABLE_CONTENT_DIR = "sys.contentDir";
/*      */   public static final String VARIABLE_RESOURCE_DIR = "sys.resourceDir";
/*      */   public static final String VARIABLE_MEDIA_FILE = "sys.mediaFile";
/*      */   public static final String VARIABLE_MEDIA_DIR = "sys.mediaDir";
/*      */   public static final String VARIABLE_INSTALLER_DIR = "sys.installerDir";
/*      */   public static final String VARIABLE_INSTALLER_FILE = "sys.installerFile";
/*      */   public static final String VARIABLE_INSTALLER_APPLICATION_MODE = "sys.installerApplicationMode";
/*      */   public static final String VARIABLE_PROGRAM_GROUP_DIR = "sys.programGroupDir";
/*      */   public static final String VARIABLE_PROGRAM_GROUP_NAME = "sys.programGroupName";
/*      */   public static final String VARIABLE_PROGRAM_GROUP_DISABLED = "sys.programGroupDisabled";
/*      */   public static final String VARIABLE_PROGRAM_GROUP_ALL_USERS = "sys.programGroupAllUsers";
/*      */   public static final String VARIABLE_SYMLINK_DIR = "sys.symlinkDir";
/*      */   public static final String VARIABLE_REBOOT_REQUIRED = "sys.rebootRequired";
/*      */   public static final String VARIABLE_PREFERRED_JRE = "sys.preferredJre";
/*      */   public static final String VARIABLE_INSTALLATION_TYPE_ID = "sys.installationTypeId";
/*      */   public static final String VARIABLE_VERSION = "sys.version";
/*      */   public static final String VARIABLE_LANGUAGE_ID = "sys.languageId";
/*      */   public static final String VARIABLE_LOGFILE = "sys.logFile";
/*      */   public static final String VARIABLE_RESPONSE_FILE = "sys.responseFile";
/*      */   public static final String VARIABLE_JAVA_HOME = "sys.javaHome";
/*      */   public static final String VARIABLE_JAVA_VERSION = "sys.javaVersion";
/*      */   public static final String VARIABLE_CONFIRMED_UPDATE_INSTALLATION = "sys.confirmedUpdateInstallation";
/*      */   public static final String VARIABLE_ADMIN_RIGHTS = "sys.adminRights";
/*      */   public static final String VARIABLE_ADMIN_RIGHTS_UI_ROOT_UNIX = "sys.adminRightsUiRootUnix";
/*      */   public static final String VARIABLE_UNDELETED_UNINSTALL_FILES = "sys.undeletedUninstallFiles";
/*      */   public static final String VARIABLE_OVERRIDDEN_TARGET_DIR = "sys.overriddenTargetDir";
/*      */   public static final String VARIABLE_ACTION_SUPPRESS_ROLLBACK = "sys.actionSuppressRollback";
/*      */   public static final String VARIABLE_FILE_RETRY_ALLOW_NO = "sys.fileRetryAllowNo";
/*      */   public static final String VARIABLE_ACTION_RETRY_DISABLE_IGNORE = "sys.actionRetryDisableIgnore";
/*      */   public static final String VARIABLE_ACTION_RETRY_DISABLE_QUIT = "sys.actionRetryDisableQuit";
/*      */   public static final String VARIABLE_ACTION_ERROR_MESSAGE_PREFIX = "sys.actionErrorMessagePrefix";
/*      */   public static final String VARIABLE_ACTION_FAILURE_UNATTENDED_QUIT = "sys.actionFailureUnattendedQuit";
/*      */   public static final String VARIABLE_RESOLVE_USER_SPECIFIC = "sys.resolveUserSpecificInstallationDir";
/*      */   public static final String VARIABLE_DATE = "sys.date";
/*      */   public static final String VARIABLE_TIME = "sys.time";
/*      */   public static final String VARIABLE_TIMESTAMP = "sys.timestamp";
/*      */   public static final String VARIABLE_MSI_ALL_USERS = "sys.msiAllUsers";
/*      */   private static boolean installationDirectoryFromCommandLine = false;
/*  168 */   private static Collection<String> commandLineVariableNames = Collections.emptyList();
/*      */   private static boolean replaceHiddenVariables = true;
/*      */   private static List<String> replacementRecording;
/*      */   private static boolean adminRightsSetByPrivilegesAction = false;
/*      */   private static boolean adminRights;
/*      */   
/*      */   public static void setDesignTimeVariableProcessor(DesignTimeVariableProcessor designTimeVariableProcessor) {
/*  175 */     InstallerVariables.designTimeVariableProcessor = designTimeVariableProcessor;
/*  176 */     setReplaceI18nVariables((designTimeVariableProcessor != null));
/*      */   }
/*      */   
/*      */   public static void setDesignTimeTextOverrideProcessor(DesignTimeTextOverrideProcessor designTimeTextOverrideProcessor) {
/*  180 */     InstallerVariables.designTimeTextOverrideProcessor = designTimeTextOverrideProcessor;
/*      */   }
/*      */   
/*      */   public static DesignTimeVariableProcessor getDesignTimeVariableProcessor() {
/*  184 */     return designTimeVariableProcessor;
/*      */   }
/*      */   
/*  187 */   private static final StringUtil.ReplacementCallback REMOVAL_CALLBACK = new VariableRemovalCallback();
/*      */   
/*  189 */   private static final StringUtil.ReplacementCallback PLAIN_CALLBACK = (StringUtil.ReplacementCallback)new InstallerReplacementCallback();
/*      */   
/*  191 */   private static final StringUtil.ReplacementCallback I18N_ONLY_CALLBACK = (StringUtil.ReplacementCallback)new InstallerReplacementCallback()
/*      */     {
/*      */       protected boolean isReplaceInstallerVariables() {
/*  194 */         return false;
/*      */       }
/*      */     }; private static final StringUtil.ReplacementCallback REGEXP_MATCH_CALLBACK; private static final StringUtil.ReplacementCallback REGEXP_REPLACEMENT_CALLBACK; private static final StringUtil.ReplacementCallback PROPERTIES_FILE_CALLBACK; private static volatile File macosMediaFileCache;
/*      */   static {
/*  198 */     REGEXP_MATCH_CALLBACK = ((token, memento, hasFallback) -> {
/*      */         String replacement = PLAIN_CALLBACK.getReplacement(token, memento, hasFallback);
/*      */ 
/*      */ 
/*      */         
/*      */         return (replacement != null) ? quoteRegexpSearch(replacement) : null;
/*      */       });
/*      */ 
/*      */     
/*  207 */     REGEXP_REPLACEMENT_CALLBACK = ((token, memento, hasFallback) -> {
/*      */         String replacement = PLAIN_CALLBACK.getReplacement(token, memento, hasFallback);
/*      */ 
/*      */ 
/*      */         
/*      */         return (replacement != null) ? quoteRegexpReplacement(replacement) : null;
/*      */       });
/*      */ 
/*      */     
/*  216 */     PROPERTIES_FILE_CALLBACK = ((token, memento, hasFallback) -> {
/*      */         String replacement = PLAIN_CALLBACK.getReplacement(token, memento, hasFallback);
/*      */         return (replacement != null) ? PropertiesFileHelper.escapeForPropertyFile(replacement, false, null, false) : null;
/*      */       });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String quoteRegexpSearch(String text) {
/*  226 */     int slashEIndex = text.indexOf("\\E");
/*  227 */     if (slashEIndex == -1) {
/*  228 */       return "\\Q" + text + "\\E";
/*      */     }
/*      */ 
/*      */     
/*  232 */     StringBuilder buffer = new StringBuilder(text.length() * 2);
/*  233 */     buffer.append("\\Q");
/*  234 */     int current = 0;
/*  235 */     while ((slashEIndex = text.indexOf("\\E", current)) != -1) {
/*  236 */       buffer.append(text, current, slashEIndex);
/*  237 */       current = slashEIndex + 2;
/*  238 */       buffer.append("\\E\\\\E\\Q");
/*      */     } 
/*  240 */     buffer.append(text, current, text.length());
/*  241 */     buffer.append("\\E");
/*      */     
/*  243 */     return buffer.toString();
/*      */   }
/*      */   
/*      */   private static String quoteRegexpReplacement(String text) {
/*  247 */     if (text.indexOf('\\') == -1 && text.indexOf('$') == -1) {
/*  248 */       return text;
/*      */     }
/*  250 */     StringBuilder buffer = new StringBuilder();
/*  251 */     for (int i = 0; i < text.length(); i++) {
/*  252 */       char c = text.charAt(i);
/*  253 */       if (c == '\\') {
/*  254 */         buffer.append('\\');
/*  255 */         buffer.append('\\');
/*  256 */       } else if (c == '$') {
/*  257 */         buffer.append('\\');
/*  258 */         buffer.append('$');
/*      */       } else {
/*  260 */         buffer.append(c);
/*      */       } 
/*      */     } 
/*  263 */     return buffer.toString();
/*      */   }
/*      */   
/*      */   public static String[] getArguments(String argumentsLine) {
/*  267 */     List<String> argumentsList = new ArrayList<>();
/*  268 */     StringUtil.splitupQuotedList(argumentsList, argumentsLine, ",");
/*  269 */     ListIterator<String> it = argumentsList.listIterator();
/*  270 */     while (it.hasNext()) {
/*  271 */       String argument = it.next();
/*  272 */       if (argument.startsWith("\"") && argument.endsWith("\"")) {
/*  273 */         argument = argument.substring(1, argument.length() - 1);
/*  274 */         it.set(argument);
/*      */       } 
/*      */     } 
/*      */     
/*  278 */     return argumentsList.<String>toArray(new String[0]);
/*      */   }
/*      */   
/*      */   public static boolean getBooleanVariable(String variableName) {
/*  282 */     return Boolean.parseBoolean(getStringVariable(variableName));
/*      */   }
/*      */   
/*      */   public static String getStringVariable(String variableName) {
/*  286 */     Object value = getVariable(variableName);
/*  287 */     return (value == null) ? null : value.toString();
/*      */   }
/*      */   
/*      */   public static void setReplacementRecording(List<String> replacementRecording) {
/*  291 */     InstallerVariables.replacementRecording = replacementRecording;
/*      */   }
/*      */   
/*      */   public static void clearVariables() {
/*  295 */     props.clear();
/*  296 */     variableProviders.clear();
/*  297 */     hiddenVariables.clear();
/*  298 */     responseFileVariables.clear();
/*  299 */     responseFileComments.clear();
/*      */   }
/*      */   
/*      */   public static int getIntValue(Object value, int defaultValue) {
/*  303 */     if (value instanceof Number)
/*  304 */       return ((Number)value).intValue(); 
/*  305 */     if (value != null) {
/*      */       try {
/*  307 */         return Integer.parseInt(String.valueOf(value));
/*  308 */       } catch (NumberFormatException numberFormatException) {}
/*      */     }
/*      */     
/*  311 */     return defaultValue;
/*      */   }
/*      */   
/*      */   public static Object getVariable(final String variableName) {
/*  315 */     if (replacementRecording != null) {
/*  316 */       replacementRecording.add("installer:" + variableName);
/*      */     }
/*  318 */     Object value = HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Object>()
/*      */         {
/*      */           protected Object fetchValue(Context context) {
/*  321 */             if (InstallerVariables.hiddenVariables.contains(variableName) && !InstallerVariables.replaceHiddenVariables) {
/*  322 */               return "[suppressed]";
/*      */             }
/*  324 */             InstallerVariables.VariableProvider variableProvider = (InstallerVariables.VariableProvider)InstallerVariables.variableProviders.get(variableName);
/*  325 */             if (variableProvider != null) {
/*  326 */               return variableProvider.getVariable();
/*      */             }
/*  328 */             return InstallerVariables.props.get(variableName);
/*      */           }
/*      */         });
/*      */ 
/*      */     
/*  333 */     if (value != null) {
/*  334 */       LAST_VARIABLE_VALUE.set(value);
/*      */     }
/*  336 */     return value;
/*      */   }
/*      */   
/*      */   public static void setVariable(final String variableName, final Object value) {
/*  340 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/*  343 */             InstallerVariables.VariableProvider variableProvider = (InstallerVariables.VariableProvider)InstallerVariables.variableProviders.get(variableName);
/*  344 */             if (variableProvider != null) {
/*  345 */               variableProvider.setVariable(value);
/*      */             } else {
/*  347 */               InstallerVariables.props.put(variableName, value);
/*      */             } 
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static void registerVariableProvider(String variableName, VariableProvider provider) {
/*  354 */     HelperCommunication.helperUnsupported();
/*      */     
/*  356 */     variableProviders.put(variableName, provider);
/*  357 */     if (props.containsKey(variableName)) {
/*  358 */       provider.setVariable(props.remove(variableName));
/*      */     }
/*      */   }
/*      */   
/*      */   public static void setReplaceInstallerAndCompilerVariables(final boolean replaceInstallerAndCompilerVariables) {
/*  363 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/*  366 */             InstallerVariables.replaceInstallerAndCompilerVariables = replaceInstallerAndCompilerVariables;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static boolean isReplaceInstallerAndCompilerVariables() {
/*  372 */     return replaceInstallerAndCompilerVariables;
/*      */   }
/*      */   
/*      */   public static void setReplaceI18nVariables(final boolean replaceI18nVariables) {
/*  376 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/*  379 */             InstallerVariables.replaceI18nVariables = replaceI18nVariables;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static boolean isReplaceI18nVariables() {
/*  385 */     return replaceI18nVariables;
/*      */   }
/*      */   
/*      */   public static void setReplaceHiddenVariables(final boolean replaceHiddenVariables) {
/*  389 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/*  392 */             InstallerVariables.replaceHiddenVariables = replaceHiddenVariables;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static String removeVariables(String content) {
/*  398 */     return StringUtil.replaceVariable(content, REMOVAL_CALLBACK, null);
/*      */   }
/*      */   
/*      */   public static String replaceVariables(String content) {
/*  402 */     return replaceVariables(content, ReplacementMode.PLAIN);
/*      */   }
/*      */   
/*      */   public static String replaceVariables(String content, ReplacementMode replacementMode) {
/*  406 */     return replaceVariables(content, replacementMode, VariableErrorHandlingDescriptor.DEFAULT);
/*      */   }
/*      */   
/*      */   public static String replaceVariables(String content, ReplacementMode replacementMode, VariableErrorHandlingDescriptor variableErrorHandlingDescriptor) {
/*  410 */     if (replaceInstallerAndCompilerVariables || replaceI18nVariables) {
/*  411 */       if (content == null) {
/*  412 */         return null;
/*      */       }
/*  414 */       if (designTimeVariableProcessor != null) {
/*  415 */         content = designTimeVariableProcessor.replaceDesignTimeVariables(content);
/*      */       }
/*  417 */       return StringUtil.replaceVariable(content, getCallback(replacementMode), variableErrorHandlingDescriptor);
/*      */     } 
/*  419 */     return content;
/*      */   }
/*      */ 
/*      */   
/*      */   private static StringUtil.ReplacementCallback getCallback(ReplacementMode replacementMode) {
/*  424 */     if (replacementMode == ReplacementMode.REGEXP_MATCH)
/*  425 */       return REGEXP_MATCH_CALLBACK; 
/*  426 */     if (replacementMode == ReplacementMode.REGEXP_REPLACEMENT)
/*  427 */       return REGEXP_REPLACEMENT_CALLBACK; 
/*  428 */     if (replacementMode == ReplacementMode.I18N_ONLY)
/*  429 */       return I18N_ONLY_CALLBACK; 
/*  430 */     if (replacementMode == ReplacementMode.PROPERTIES_FILE) {
/*  431 */       return PROPERTIES_FILE_CALLBACK;
/*      */     }
/*  433 */     return PLAIN_CALLBACK;
/*      */   }
/*      */ 
/*      */   
/*      */   public static File replaceVariables(File file) {
/*  438 */     if (replaceInstallerAndCompilerVariables || replaceI18nVariables) {
/*  439 */       if (file == null) {
/*  440 */         return null;
/*      */       }
/*  442 */       return new File(replaceVariables(file.getPath()));
/*      */     } 
/*  444 */     return file;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String[] replaceVariables(Object[] values, VariableErrorHandlingDescriptor errorHandlingDescriptor) {
/*  449 */     return replaceVariables(values, errorHandlingDescriptor, VARIABLE_REPLACERS);
/*      */   }
/*      */   
/*      */   public static String[] replaceVariables(Object[] values, VariableErrorHandlingDescriptor errorHandlingDescriptor, Map<String, VariableReplacer> variableReplacers) {
/*  453 */     if (values == null) {
/*  454 */       return null;
/*      */     }
/*  456 */     List<String> expandedValues = new ArrayList<>();
/*  457 */     for (Object value : values) {
/*  458 */       String argument = value.toString();
/*  459 */       VariableSpec variableSpec = getSingleRuntimeVariableSpec(argument);
/*  460 */       VariableReplacer variableReplacer = getVariableReplacer(variableSpec, variableReplacers);
/*  461 */       if (variableSpec != null) {
/*  462 */         Object variableValue = variableReplacer.getVariable(variableSpec.getVariableName());
/*  463 */         if (variableValue instanceof Object[]) {
/*  464 */           Object[] variableValues = (Object[])variableValue;
/*  465 */           for (Object valueElement : variableValues) {
/*  466 */             addIfNotEmpty(expandedValues, variableReplacer.replaceVariables(valueElement.toString(), ReplacementMode.PLAIN, errorHandlingDescriptor));
/*      */           }
/*  468 */         } else if (variableValue instanceof Collection) {
/*  469 */           Collection collection = (Collection)variableValue;
/*  470 */           for (Object valueElement : collection) {
/*  471 */             addIfNotEmpty(expandedValues, variableReplacer.replaceVariables(valueElement.toString(), ReplacementMode.PLAIN, errorHandlingDescriptor));
/*      */           }
/*      */         } else {
/*  474 */           addIfNotEmpty(expandedValues, variableReplacer.replaceVariables(argument, ReplacementMode.PLAIN, errorHandlingDescriptor));
/*      */         } 
/*      */       } else {
/*  477 */         addIfNotEmpty(expandedValues, variableReplacer.replaceVariables(argument, ReplacementMode.PLAIN, errorHandlingDescriptor));
/*      */       } 
/*      */     } 
/*      */     
/*  481 */     return expandedValues.<String>toArray(new String[0]);
/*      */   }
/*      */ 
/*      */   
/*      */   private static VariableReplacer getVariableReplacer(VariableSpec variableSpec, Map<String, VariableReplacer> variableReplacers) {
/*  486 */     if (variableSpec != null) {
/*  487 */       VariableReplacer variableReplacer = variableReplacers.get(variableSpec.getVariablePrefix());
/*  488 */       if (variableReplacer != null) {
/*  489 */         return variableReplacer;
/*      */       }
/*      */     } 
/*  492 */     return VARIABLE_REPLACER;
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   private static VariableSpec getSingleRuntimeVariableSpec(@NotNull String argument) {
/*  497 */     for (String variablePrefix : RUNTIME_PREFIXES) {
/*  498 */       String prefix = "${" + variablePrefix;
/*  499 */       if (argument.startsWith(prefix) && argument.indexOf('}') == argument.length() - 1) {
/*  500 */         return new VariableSpec(variablePrefix, argument.substring(prefix.length(), argument.length() - 1));
/*      */       }
/*      */     } 
/*  503 */     return null;
/*      */   }
/*      */   
/*      */   private static void addIfNotEmpty(List<String> values, String value) {
/*  507 */     if (value != null && value.length() > 0) {
/*  508 */       values.add(value);
/*      */     }
/*      */   }
/*      */   
/*      */   public static Set<String> getVariableNames() {
/*  513 */     return (Set<String>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Set<String>>()
/*      */         {
/*      */           protected Set<String> fetchValue(Context context) {
/*  516 */             Set<String> ret = new HashSet<>();
/*  517 */             ret.addAll(InstallerVariables.props.keySet());
/*  518 */             ret.addAll(InstallerVariables.variableProviders.keySet());
/*  519 */             return ret;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static <T> T getTextOverrideValue(Bean bean, String propertyName, Class<T> resultType) {
/*  525 */     String overrideText = null;
/*  526 */     if (designTimeTextOverrideProcessor != null) {
/*  527 */       overrideText = designTimeTextOverrideProcessor.getTextOverrides(bean, propertyName);
/*      */     } else {
/*  529 */       Map<String, String> textOverrides = AbstractBeanConfig.getTextOverrides(bean);
/*  530 */       if (textOverrides != null) {
/*  531 */         overrideText = textOverrides.get(propertyName);
/*      */       }
/*      */     } 
/*  534 */     if (overrideText != null) {
/*  535 */       if (isSingleInstallerVariableExpression(overrideText)) {
/*  536 */         LAST_VARIABLE_VALUE.set(null);
/*  537 */         replaceVariables(overrideText);
/*  538 */         Object value = LAST_VARIABLE_VALUE.get();
/*  539 */         if (value != null) {
/*  540 */           if (resultType.isAssignableFrom(value.getClass())) {
/*  541 */             return resultType.cast(value);
/*      */           }
/*  543 */           return convertToResultType(value, resultType);
/*      */         } 
/*      */       } else {
/*      */         
/*  547 */         return convertToResultType(replaceVariables(overrideText), resultType);
/*      */       } 
/*      */     }
/*  550 */     return null;
/*      */   }
/*      */   
/*      */   private static <T> T convertToResultType(Object value, Class<T> resultType) {
/*  554 */     if (resultType.isEnum()) {
/*  555 */       T enumValue = convertToEnumValue(value, resultType);
/*  556 */       if (enumValue != null) {
/*  557 */         return enumValue;
/*      */       }
/*      */     } 
/*  560 */     return convertStringToResultType(value.toString(), resultType);
/*      */   }
/*      */   
/*      */   private static <T> T convertStringToResultType(String text, Class<T> resultType) {
/*  564 */     if (text.isEmpty())
/*  565 */       return null; 
/*  566 */     if (resultType == Boolean.class)
/*  567 */       return resultType.cast(Boolean.valueOf(Boolean.parseBoolean(text))); 
/*  568 */     if (resultType == Byte.class)
/*  569 */       return resultType.cast(Byte.valueOf(Byte.parseByte(text))); 
/*  570 */     if (resultType == Character.class)
/*  571 */       return resultType.cast(Character.valueOf(text.charAt(0))); 
/*  572 */     if (resultType == Short.class)
/*  573 */       return resultType.cast(Short.valueOf(Short.parseShort(text))); 
/*  574 */     if (resultType == Integer.class)
/*  575 */       return resultType.cast(Integer.valueOf(Integer.parseInt(text))); 
/*  576 */     if (resultType == Long.class)
/*  577 */       return resultType.cast(Long.valueOf(Long.parseLong(text))); 
/*  578 */     if (resultType == Float.class)
/*  579 */       return resultType.cast(Float.valueOf(Float.parseFloat(text))); 
/*  580 */     if (resultType == Double.class)
/*  581 */       return resultType.cast(Double.valueOf(Double.parseDouble(text))); 
/*  582 */     if (resultType == Color.class) {
/*  583 */       return resultType.cast(Color.decode(text));
/*      */     }
/*  585 */     throw new RuntimeException("The replacement value \"" + text + "\" cannot be converted to the result type " + resultType.getName());
/*      */   }
/*      */   
/*      */   private static <T> T convertToEnumValue(Object value, Class<T> resultType) {
/*  589 */     String text = value.toString();
/*  590 */     for (T enumConstant : resultType.getEnumConstants()) {
/*  591 */       Enum e = (Enum)enumConstant;
/*      */       try {
/*  593 */         if (value instanceof Number && ((Number)value).intValue() == e.ordinal())
/*  594 */           return resultType.cast(e); 
/*  595 */         if (e.name().equals(text) || Integer.parseInt(text) == e.ordinal()) {
/*  596 */           return resultType.cast(e);
/*      */         }
/*  598 */       } catch (NumberFormatException numberFormatException) {}
/*      */     } 
/*      */ 
/*      */     
/*  602 */     for (T enumConstant : resultType.getEnumConstants()) {
/*  603 */       Enum e = (Enum)enumConstant;
/*  604 */       if (e.toString().equals(text)) {
/*  605 */         return resultType.cast(e);
/*      */       }
/*      */     } 
/*  608 */     return null;
/*      */   }
/*      */   
/*      */   private static boolean isSingleInstallerVariableExpression(String text) {
/*  612 */     if (text.startsWith("${installer:") && text.endsWith("}") && 
/*  613 */       StringUtil.countNonOverlappingSubstrings("${", text) == StringUtil.countNonOverlappingSubstrings("}", text)) {
/*      */       
/*  615 */       int lastVariableStartIndex = text.lastIndexOf("${");
/*  616 */       int firstVariableEndIndex = text.indexOf("}");
/*  617 */       return (lastVariableStartIndex < firstVariableEndIndex);
/*      */     } 
/*  619 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public static void initUserVars() {
/*  624 */     initUserVars(props);
/*      */   }
/*      */   
/*      */   public static void initHelperState() {
/*  628 */     replaceI18nVariables = HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*      */         {
/*      */           protected boolean fetchValue(Context context) {
/*  631 */             return InstallerVariables.replaceI18nVariables;
/*      */           }
/*      */         });
/*  634 */     replaceInstallerAndCompilerVariables = HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*      */         {
/*      */           protected boolean fetchValue(Context context) {
/*  637 */             return InstallerVariables.replaceInstallerAndCompilerVariables;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static void initUserVars(Map<String, Object> variables) {
/*  643 */     String userHomeDir = System.getProperty("user.home");
/*  644 */     variables.put("sys.userHome", userHomeDir);
/*  645 */     variables.put("sys.userName", System.getProperty("user.name"));
/*  646 */     if (InstallerConfig.getCurrentApplication() != null) {
/*  647 */       variables.put("sys.installerApplicationMode", InstallerConfig.getCurrentApplication().getApplicationMode());
/*      */     }
/*      */     
/*      */     try {
/*  651 */       if (InstallerUtil.isWindows()) {
/*  652 */         variables.put("sys.fontsDir", getUserFolderPath(6));
/*  653 */         variables.put("sys.programsDir", getUserFolderPath(3));
/*  654 */         variables.put("sys.favoritesDir", getUserFolderPath(10));
/*  655 */         variables.put("sys.sendToDir", getUserFolderPath(5));
/*  656 */         variables.put("sys.startMenuDir", getUserFolderPath(2));
/*  657 */         variables.put("sys.startupDir", getUserFolderPath(4));
/*  658 */         variables.put("sys.templatesDir", getUserFolderPath(9));
/*  659 */       } else if (InstallerUtil.isMacOS()) {
/*  660 */         variables.put("sys.fontsDir", "/Library/Fonts");
/*  661 */         variables.put("sys.programsDir", "/Applications");
/*      */       } 
/*  663 */       variables.put("sys.appdataDir", getAppDataDir());
/*  664 */       variables.put("sys.localAppdataDir", getLocalAppDataDir());
/*  665 */       variables.put("sys.desktopDir", getDesktopDir());
/*  666 */       variables.put("sys.docsDir", getDocsDir());
/*  667 */       variables.put("sys.downloadsDir", getDownloadsDir());
/*  668 */     } catch (Exception e) {
/*  669 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  672 */     registerVariableProvider("sys.updateStorageDir", new VariableProvider()
/*      */         {
/*      */           public Object getVariable() {
/*  675 */             return AutomaticUpdate.getUpdateDir().getAbsolutePath();
/*      */           }
/*      */ 
/*      */           
/*      */           public void setVariable(Object value) {
/*  680 */             throw new UnsupportedOperationException();
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   protected static String getUserFolderPath(int folderType) {
/*  686 */     File file = FolderInfo.getSpecialFolder(folderType, false);
/*  687 */     if (file != null) {
/*  688 */       return file.getAbsolutePath();
/*      */     }
/*  690 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   private static String getDesktopDir() {
/*  695 */     if (Util.isWindows()) {
/*  696 */       String userFolder = getUserFolderPath(1);
/*  697 */       if (userFolder != null) {
/*  698 */         return userFolder;
/*      */       }
/*  700 */       return (new File(System.getProperty("user.home"), "Desktop")).getAbsolutePath();
/*      */     } 
/*  702 */     if (Util.isMacOS()) {
/*  703 */       return (new File(System.getProperty("user.home"), "Desktop")).getAbsolutePath();
/*      */     }
/*  705 */     return getPath(UnixSpecialDirs.getDirectory("XDG_DESKTOP_DIR"));
/*      */   }
/*      */   
/*      */   public static File getInstall4jCacheDir() {
/*      */     File localAppDataDir;
/*  710 */     String localAppDataDirName = getLocalAppDataDir();
/*      */     
/*  712 */     if (localAppDataDirName != null) {
/*  713 */       localAppDataDir = new File(localAppDataDirName);
/*      */     } else {
/*  715 */       localAppDataDir = new File(System.getProperty("user.home"), ".cache");
/*      */     } 
/*  717 */     return new File(localAppDataDir, "install4j");
/*      */   }
/*      */   
/*      */   public static String getLocalAppDataDir() {
/*  721 */     if (Util.isWindows())
/*  722 */       return getUserFolderPath(11); 
/*  723 */     if (Util.isMacOS()) {
/*  724 */       return (new File(System.getProperty("user.home"), "Library/Caches")).getAbsolutePath();
/*      */     }
/*  726 */     String cacheDir = System.getenv("XDG_CACHE_HOME");
/*  727 */     if (cacheDir != null) {
/*  728 */       return (new File(cacheDir)).getAbsolutePath();
/*      */     }
/*  730 */     return (new File(System.getProperty("user.home"), ".cache")).getAbsolutePath();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getAppDataDir() {
/*  736 */     if (Util.isWindows())
/*  737 */       return getUserFolderPath(7); 
/*  738 */     if (Util.isMacOS()) {
/*  739 */       return (new File(System.getProperty("user.home"), "Library/Application Support")).getAbsolutePath();
/*      */     }
/*  741 */     String dataDir = System.getenv("XDG_DATA_HOME");
/*  742 */     if (dataDir != null) {
/*  743 */       return (new File(dataDir)).getAbsolutePath();
/*      */     }
/*  745 */     return (new File(System.getProperty("user.home"), ".local/share")).getAbsolutePath();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static String getPath(File file) {
/*  751 */     if (file == null) {
/*  752 */       return null;
/*      */     }
/*  754 */     return file.getAbsolutePath();
/*      */   }
/*      */ 
/*      */   
/*      */   private static String getDocsDir() {
/*  759 */     String docsDir = getDocsDirUnguarded();
/*  760 */     if (docsDir != null) {
/*  761 */       return docsDir;
/*      */     }
/*  763 */     return (new File(System.getProperty("user.home"), "Documents")).getAbsolutePath();
/*      */   }
/*      */ 
/*      */   
/*      */   private static String getDocsDirUnguarded() {
/*  768 */     if (Util.isWindows())
/*  769 */       return getUserFolderPath(8); 
/*  770 */     if (Util.isMacOS()) {
/*  771 */       return (new File(System.getProperty("user.home"), "Documents")).getAbsolutePath();
/*      */     }
/*  773 */     return getPath(UnixSpecialDirs.getDirectory("XDG_DOCUMENTS_DIR"));
/*      */   }
/*      */ 
/*      */   
/*      */   private static String getDownloadsDir() {
/*  778 */     String downloadsDir = getDownloadsDirUnguarded();
/*  779 */     if (downloadsDir != null && (new File(downloadsDir)).isDirectory()) {
/*  780 */       return downloadsDir;
/*      */     }
/*  782 */     File file = new File(System.getProperty("user.home"), "Downloads");
/*  783 */     if (!file.isDirectory()) {
/*  784 */       file = file.getParentFile();
/*      */     }
/*  786 */     return file.getAbsolutePath();
/*      */   }
/*      */ 
/*      */   
/*      */   private static String getDownloadsDirUnguarded() {
/*  791 */     if (Util.isWindows()) {
/*  792 */       File downloadsDirectory = FolderInfo.getDownloadsDirectory();
/*  793 */       if (downloadsDirectory != null) {
/*  794 */         return downloadsDirectory.getAbsolutePath();
/*      */       }
/*  796 */       return null;
/*      */     } 
/*  798 */     if (Util.isMacOS()) {
/*  799 */       return (new File(System.getProperty("user.home"), "Downloads")).getAbsolutePath();
/*      */     }
/*  801 */     return getPath(UnixSpecialDirs.getDirectory("XDG_DOWNLOAD_DIR"));
/*      */   }
/*      */ 
/*      */   
/*      */   public static void initSystemVars(Map<String, Object> variables) {
/*  806 */     HelperCommunication.helperUnsupported();
/*      */     
/*  808 */     variables.put("sys.pathlistSeparator", File.pathSeparator);
/*  809 */     variables.put("sys.fileSeparator", File.separator);
/*  810 */     variables.put("sys.javaHome", System.getProperty("java.home"));
/*  811 */     variables.put("sys.javaVersion", System.getProperty("java.version"));
/*  812 */     variables.put("sys.resourceDir", InstallerUtil.getInstallerFile("user").getAbsolutePath());
/*  813 */     variables.put("sys.programFilesDir", InstallerUtil.getStandardApplicationsDirectory(false));
/*      */     
/*  815 */     Date date = new Date();
/*  816 */     variables.put("sys.date", DATE_FORMAT.format(date));
/*  817 */     variables.put("sys.time", TIME_FORMAT.format(date));
/*  818 */     variables.put("sys.timestamp", String.valueOf(date.getTime()));
/*      */     
/*      */     try {
/*  821 */       variables.put("sys.workingDir", (new File(".")).getCanonicalPath());
/*  822 */     } catch (IOException e) {
/*  823 */       e.printStackTrace();
/*      */     } 
/*      */     try {
/*  826 */       variables.put("sys.tempDir", (new File(System.getProperty("java.io.tmpdir"))).getCanonicalPath());
/*  827 */     } catch (IOException e) {
/*  828 */       e.printStackTrace();
/*      */     } 
/*      */     
/*  831 */     if (InstallerUtil.isWindows()) {
/*      */       try {
/*  833 */         variables.put("sys.system32Dir", WinFileSystem.getSystemDirectory().getAbsolutePath());
/*  834 */         variables.put("sys.commonDir", WinFileSystem.getCommonFilesDirectory().getAbsolutePath());
/*  835 */         variables.put("sys.programDataDir", WinFileSystem.getProgramDataDirectory().getAbsolutePath());
/*  836 */         variables.put("sys.windowsDir", WinFileSystem.getWindowsDirectory().getAbsolutePath());
/*  837 */       } catch (Exception e) {
/*  838 */         e.printStackTrace();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public static void setAdminRightsFromPrivilegesAction(boolean adminRights) {
/*  844 */     InstallerVariables.adminRights = adminRights;
/*  845 */     adminRightsSetByPrivilegesAction = true;
/*      */   }
/*      */   
/*      */   private static void initAdminRights() {
/*  849 */     adminRights = (Util.isAdminGroup() && Util.hasFullAdminRights());
/*  850 */     registerVariableProvider("sys.adminRights", new VariableProvider()
/*      */         {
/*      */           public Object getVariable() {
/*  853 */             return Boolean.valueOf(InstallerVariables.adminRights);
/*      */           }
/*      */ 
/*      */           
/*      */           public void setVariable(Object value) {
/*  858 */             if (!InstallerVariables.adminRightsSetByPrivilegesAction) {
/*  859 */               InstallerVariables.adminRights = ((Boolean)value).booleanValue();
/*      */             }
/*      */           }
/*      */         });
/*  863 */     registerResponseFileVariable("sys.adminRights");
/*      */   }
/*      */   
/*      */   public static void initCommandLine(String varFileName, Map<String, String> commandLineProps) {
/*  867 */     HelperCommunication.helperUnsupported();
/*      */     
/*  869 */     ApplicationBeanConfig applicationBeanConfig = InstallerConfig.getCurrentInstance().getApplicationConfigById(InstallerConfig.getCurrentApplicationId());
/*  870 */     addVariables(applicationBeanConfig.getInstallerVariables(), false, Collections.emptyList());
/*      */     
/*  872 */     hiddenVariables.addAll(applicationBeanConfig.getHiddenVariableNames());
/*  873 */     responseFileVariables.addAll(applicationBeanConfig.getResponseFileVariableNames());
/*  874 */     responseFileComments.putAll(applicationBeanConfig.getResponseFileComments());
/*      */     
/*  876 */     props.put("sys.rebootRequired", Boolean.FALSE);
/*  877 */     props.put("sys.version", InstallerConfig.getCurrentInstance().getApplicationVersion());
/*      */     
/*  879 */     if (MODULE_NAME != null) {
/*      */       
/*  881 */       props.put("sys.mediaFile", getMediaFile().getAbsolutePath());
/*  882 */       props.put("sys.mediaDir", getMediaDir().getAbsolutePath());
/*      */       
/*  884 */       File installerFile = new File(MODULE_NAME);
/*  885 */       props.put("sys.installerFile", installerFile.getAbsolutePath());
/*  886 */       props.put("sys.installerDir", installerFile.getParentFile().getAbsolutePath());
/*      */     } else {
/*  888 */       props.put("sys.mediaDir", (new File(System.getProperty("user.dir"))).getAbsolutePath());
/*  889 */       props.put("sys.installerDir", (new File(System.getProperty("user.dir"))).getAbsolutePath());
/*      */     } 
/*      */     
/*  892 */     initAdminRights();
/*  893 */     initSystemVars(props);
/*      */     
/*  895 */     boolean failForVarFile = true;
/*  896 */     if (varFileName == null && MODULE_NAME != null) {
/*  897 */       int lastDot = MODULE_NAME.lastIndexOf('.');
/*  898 */       if (lastDot > -1) {
/*  899 */         File autoVarFile = new File(MODULE_NAME.substring(0, lastDot) + ".varfile");
/*  900 */         if (autoVarFile.exists() && autoVarFile.isFile()) {
/*  901 */           varFileName = autoVarFile.getPath();
/*  902 */           failForVarFile = false;
/*      */         } 
/*  904 */         if (varFileName == null) {
/*  905 */           String mediaFilePath = (String)props.get("sys.mediaFile");
/*  906 */           if (mediaFilePath != null) {
/*  907 */             lastDot = mediaFilePath.lastIndexOf('.');
/*  908 */             if (lastDot > -1) {
/*  909 */               autoVarFile = new File(mediaFilePath.substring(0, lastDot) + ".varfile");
/*  910 */               if (autoVarFile.exists() && autoVarFile.isFile()) {
/*  911 */                 varFileName = autoVarFile.getPath();
/*  912 */                 failForVarFile = false;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  920 */     if (varFileName != null) {
/*  921 */       File varFile = new File(varFileName);
/*  922 */       if (!varFile.isAbsolute()) {
/*  923 */         varFile = new File((String)props.get("sys.mediaDir"), varFileName);
/*      */       }
/*      */       try {
/*  926 */         loadResponseFile(varFile, false, Collections.emptyList(), OverwriteStrategy.ON, true);
/*  927 */         props.put("sys.responseFile", varFile.getPath());
/*  928 */       } catch (IOException e) {
/*  929 */         if (failForVarFile) {
/*  930 */           System.err.println("Could not read file " + varFile.getAbsolutePath());
/*  931 */           InstallerUtil.exit(1);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  936 */     if (commandLineProps != null) {
/*  937 */       commandLineVariableNames = Collections.unmodifiableCollection(addVariables(commandLineProps, false, Collections.emptyList()));
/*      */     }
/*      */   }
/*      */   
/*      */   public static void setInstallationDirectoryFromCommandLine(boolean installationDirectoryFromCommandLine) {
/*  942 */     InstallerVariables.installationDirectoryFromCommandLine = installationDirectoryFromCommandLine;
/*      */   }
/*      */   
/*      */   public static void loadResponseFile(File responseFile, boolean fireChangeEvents, List<String> excludedVariableNames, OverwriteStrategy overwriteStrategy, boolean registerForResponseFile) throws IOException {
/*  946 */     TextProperties properties = new TextProperties();
/*  947 */     properties.read(responseFile, new PropertiesFileParameters(PropertiesFileEncoding.JAVA_PROPERTIES));
/*  948 */     Map<String, String> decodedNameToName = new HashMap<>();
/*  949 */     for (String variableName : properties.keySet()) {
/*  950 */       String decodedVariableName = decodeVariableName(variableName);
/*  951 */       decodedNameToName.put(decodedVariableName, variableName);
/*  952 */       if (registerForResponseFile && !excludedVariableNames.contains(decodedVariableName) && !decodedVariableName.startsWith("sys.")) {
/*  953 */         registerResponseFileVariable(decodedVariableName);
/*      */       }
/*      */     } 
/*      */     
/*  957 */     switch (overwriteStrategy) {
/*      */       case OFF:
/*  959 */         removeVariables(ContextImpl.getCurrentContext().getVariableNames(), decodedNameToName, properties);
/*      */         break;
/*      */       case NOT_COMMAND_LINE:
/*  962 */         removeVariables(commandLineVariableNames, decodedNameToName, properties);
/*      */         break;
/*      */     } 
/*      */     
/*  966 */     addVariables((Map<String, String>)properties, fireChangeEvents, excludedVariableNames);
/*      */   }
/*      */   
/*      */   protected static void removeVariables(Collection<String> variableNames, Map<String, String> decodedNameToName, TextProperties properties) {
/*  970 */     for (String variableName : variableNames) {
/*  971 */       String encodedVariableName = decodedNameToName.get(variableName);
/*  972 */       if (encodedVariableName != null) {
/*  973 */         properties.remove(encodedVariableName);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   private static String decodeVariableName(String variableName) {
/*  979 */     if (variableName.contains("$")) {
/*  980 */       return variableName.substring(0, variableName.lastIndexOf('$'));
/*      */     }
/*  982 */     return variableName;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static File getMediaDir() {
/*  988 */     String mediaDir = (String)props.get("sys.mediaDir");
/*  989 */     if (mediaDir == null) {
/*  990 */       File mediaFile = getMediaFile();
/*  991 */       if (mediaFile == null) {
/*  992 */         return new File(System.getProperty("user.dir"));
/*      */       }
/*  994 */       return mediaFile.getParentFile();
/*      */     } 
/*      */     
/*  997 */     return new File(mediaDir);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static File getMediaFile() {
/* 1005 */     String mediaFile = (String)props.get("sys.mediaFile");
/* 1006 */     if (mediaFile == null) {
/* 1007 */       String msiFile = MsiHelper.getMsiFile();
/* 1008 */       if (msiFile != null)
/* 1009 */         return new File(msiFile); 
/* 1010 */       if (MODULE_NAME != null) {
/* 1011 */         File installerFile = new File(MODULE_NAME);
/* 1012 */         if (Util.isMacOS()) {
/* 1013 */           if (macosMediaFileCache == null) {
/* 1014 */             Map mountPointToDiskFile = VolumeInfo.getMountPointToDiskFile();
/* 1015 */             if (mountPointToDiskFile != null) {
/* 1016 */               String diskFile = (String)mountPointToDiskFile.get(installerFile.getParentFile().getAbsolutePath());
/* 1017 */               if (diskFile != null) {
/* 1018 */                 macosMediaFileCache = new File(diskFile);
/*      */               }
/*      */             } 
/* 1021 */             if (macosMediaFileCache == null) {
/* 1022 */               macosMediaFileCache = installerFile;
/*      */             }
/*      */           } 
/* 1025 */           return macosMediaFileCache;
/*      */         } 
/* 1027 */         return installerFile;
/*      */       } 
/* 1029 */       return null;
/*      */     } 
/*      */     
/* 1032 */     return new File(mediaFile);
/*      */   }
/*      */ 
/*      */   
/*      */   private static List<String> addVariables(Map<String, String> loadedProps, boolean fireChangeEvents, List<String> excludedVariableNames) {
/* 1037 */     Set<String> usedExcludes = new HashSet<>(excludedVariableNames);
/* 1038 */     if (installationDirectoryFromCommandLine) {
/* 1039 */       usedExcludes.add("sys.installationDir");
/*      */     }
/* 1041 */     Map<String, Object> decodedMap = VariableEncoding.decodeVariables(loadedProps, false);
/* 1042 */     List<String> modifiedVariableNames = new ArrayList<>();
/* 1043 */     for (Map.Entry<String, Object> entry : decodedMap.entrySet()) {
/* 1044 */       String variableName = entry.getKey();
/* 1045 */       if (Objects.equals(variableName, "sys.programGroup.name")) {
/* 1046 */         variableName = "sys.programGroupName";
/*      */       }
/* 1048 */       if (!usedExcludes.contains(variableName)) {
/* 1049 */         modifiedVariableNames.add(variableName);
/* 1050 */         Object variableValue = entry.getValue();
/* 1051 */         if (fireChangeEvents) {
/* 1052 */           ContextImpl.getSingleContextInt().setVariable(variableName, variableValue); continue;
/*      */         } 
/* 1054 */         setVariable(variableName, variableValue);
/*      */       } 
/*      */     } 
/*      */     
/* 1058 */     return modifiedVariableNames;
/*      */   }
/*      */   
/*      */   public static void registerHiddenVariable(final String variableName) {
/* 1062 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/* 1065 */             InstallerVariables.hiddenVariables.add(variableName);
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static Set<String> getHiddenVariables() {
/* 1071 */     return (Set<String>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Set<String>>()
/*      */         {
/*      */           protected Set<String> fetchValue(Context context) {
/* 1074 */             return InstallerVariables.hiddenVariables;
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static void registerResponseFileVariable(final String variableName) {
/* 1080 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/* 1083 */             InstallerVariables.responseFileVariables.add(variableName);
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static void unregisterResponseFileVariable(final String variableName) {
/* 1089 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/* 1092 */             InstallerVariables.responseFileVariables.remove(variableName);
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static void registerResponseFileComment(final String variableName, final String comment) {
/* 1098 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*      */         {
/*      */           protected void run(Context context) {
/* 1101 */             if (comment != null) {
/* 1102 */               InstallerVariables.responseFileComments.put(variableName, comment);
/*      */             } else {
/* 1104 */               InstallerVariables.responseFileComments.remove(variableName);
/*      */             } 
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   public static byte[] getResponseFileContent(VariableSelectionMode variableSelectionMode, String[] variables) throws IOException {
/* 1111 */     return getResponseFileContent(variableSelectionMode, variables, new TextProperties());
/*      */   }
/*      */   
/*      */   public static byte[] getResponseFileContent(final VariableSelectionMode variableSelectionMode, final String[] variables, final TextProperties previousProperties) {
/* 1115 */     return (byte[])HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<byte[]>()
/*      */         {
/*      */           protected byte[] fetchValue(Context context) throws Exception {
/* 1118 */             Set<String> variableSet = new HashSet<>();
/* 1119 */             if (variables != null) {
/* 1120 */               variableSet.addAll(Arrays.asList(variables));
/*      */             }
/*      */             
/* 1123 */             TextProperties encodedResponse = new TextProperties();
/* 1124 */             List<String> sortedVariableNames = new ArrayList<>();
/* 1125 */             sortedVariableNames.addAll(InstallerVariables.responseFileVariables);
/* 1126 */             sortedVariableNames.addAll(previousProperties.keySet());
/* 1127 */             Collections.sort(sortedVariableNames);
/* 1128 */             for (String variableName : sortedVariableNames) {
/* 1129 */               if (previousProperties.containsKey(variableName) || variableSelectionMode.isIncluded(variableName, variableSet)) {
/* 1130 */                 String encodedVariableName; Object variableValue = InstallerVariables.getVariable(variableName);
/* 1131 */                 String previousEncodedValue = (String)previousProperties.get(variableName);
/*      */                 
/* 1133 */                 if (variableValue == null && previousEncodedValue != null) {
/* 1134 */                   encodedVariableName = variableName;
/* 1135 */                   encodedResponse.put(variableName, previousEncodedValue);
/*      */                 } else {
/* 1137 */                   encodedVariableName = VariableEncoding.getEncodedVariableName(variableName, variableValue);
/* 1138 */                   VariableEncoding.encodeVariable((Map)encodedResponse, variableName, variableValue);
/*      */                 } 
/* 1140 */                 String comment = (String)InstallerVariables.responseFileComments.get(variableName);
/* 1141 */                 String previousComment = previousProperties.getPrefix(variableName);
/* 1142 */                 if (comment == null && previousComment != null) {
/* 1143 */                   comment = previousComment;
/* 1144 */                   if (comment.startsWith("# install4j response file for ")) {
/* 1145 */                     int firstLineBreakIndex = comment.indexOf('\n');
/* 1146 */                     if (firstLineBreakIndex > -1) {
/* 1147 */                       comment = comment.substring(firstLineBreakIndex + 1);
/*      */                     } else {
/* 1149 */                       comment = null;
/*      */                     } 
/*      */                   } 
/*      */                 } 
/* 1153 */                 if (comment != null && !comment.trim().isEmpty()) {
/* 1154 */                   encodedResponse.setPrefix(encodedVariableName, InstallerVariables.makeComment(comment));
/*      */                 }
/*      */               } 
/*      */             } 
/*      */             
/* 1159 */             encodedResponse.setHeader("# install4j response file for " + InstallerConfig.getCurrentInstance().getApplicationNameWithVersion());
/* 1160 */             return encodedResponse.convertToPropertiesString().getBytes();
/*      */           }
/*      */         });
/*      */   }
/*      */   
/*      */   private static String makeComment(String comment) {
/* 1166 */     StringBuilder buffer = new StringBuilder();
/* 1167 */     for (String line : comment.split("\r?\n", -1)) {
/* 1168 */       String trimmedLine = line.trim();
/* 1169 */       if (!trimmedLine.isEmpty() && !trimmedLine.startsWith("#")) {
/* 1170 */         line = "# " + trimmedLine;
/*      */       }
/* 1172 */       if (buffer.length() > 0) {
/* 1173 */         buffer.append('\n');
/*      */       }
/* 1175 */       buffer.append(replaceVariables(line));
/*      */     } 
/* 1177 */     return buffer.toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static abstract class ReadOnlyVariableProvider
/*      */     implements VariableProvider
/*      */   {
/*      */     public void setVariable(Object value) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class VariableRemovalCallback
/*      */     implements StringUtil.ReplacementCallback
/*      */   {
/*      */     private VariableRemovalCallback() {}
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getReplacement(String token, Object memento, boolean hasFallback) {
/* 1202 */       if (token.startsWith("i18n:") || token.startsWith("installer:") || token.startsWith("form:") || token.startsWith("compiler:")) {
/* 1203 */         return "";
/*      */       }
/* 1205 */       return null;
/*      */     }
/*      */   }
/*      */   
/*      */   private static class InstallerReplacementCallback
/*      */     implements StringUtil.SkippableReplacementCallback {
/*      */     private InstallerReplacementCallback() {}
/*      */     
/*      */     public boolean isSkipReplacement(String token) {
/* 1214 */       return ((token.startsWith("i18n:") && !isReplaceI18nVariables()) || (token
/* 1215 */         .startsWith("installer:") && !isReplaceInstallerVariables()) || (token
/* 1216 */         .startsWith("compiler:") && !isReplaceCompilerVariables()));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String getReplacement(String token, Object memento, boolean hasFallback) {
/* 1222 */       VariableErrorHandlingDescriptor variableErrorHandlingDescriptor = (VariableErrorHandlingDescriptor)memento;
/*      */       
/* 1224 */       if (token.startsWith("i18n:") && isReplaceI18nVariables()) {
/* 1225 */         VariableResourceBundleWrapper messages = Messages.getMessagesInternal();
/* 1226 */         if (!isReplaceInstallerVariables()) {
/* 1227 */           messages.setNextReplacementMode(ReplacementMode.I18N_ONLY);
/*      */         }
/* 1229 */         return InstallerVariables.replaceI18n(token, (ResourceBundle)messages, variableErrorHandlingDescriptor, hasFallback, null);
/* 1230 */       }  if (token.startsWith("installer:") && isReplaceInstallerVariables()) {
/* 1231 */         String key = token.substring("installer:".length());
/* 1232 */         String value = InstallerVariables.getStringVariable(key);
/* 1233 */         if (value == null && !hasFallback) {
/* 1234 */           return InstallerVariables.handleError("installer variable", key, token, variableErrorHandlingDescriptor.getInstallerVariables());
/*      */         }
/* 1236 */         return value;
/*      */       } 
/* 1238 */       if (token.startsWith("compiler:") && isReplaceCompilerVariables()) {
/* 1239 */         String key = token.substring("compiler:".length());
/* 1240 */         String value = ContextImpl.getSingleContextInt().getCompilerVariable(key);
/* 1241 */         if (value == null && !hasFallback) {
/* 1242 */           return InstallerVariables.handleError("compiler variable", key, token, variableErrorHandlingDescriptor.getCompilerVariables());
/*      */         }
/* 1244 */         return value;
/*      */       } 
/*      */       
/* 1247 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean isReplaceI18nVariables() {
/* 1252 */       return InstallerVariables.replaceI18nVariables;
/*      */     }
/*      */     
/*      */     protected boolean isReplaceInstallerVariables() {
/* 1256 */       return InstallerVariables.replaceInstallerAndCompilerVariables;
/*      */     }
/*      */     
/*      */     protected boolean isReplaceCompilerVariables() {
/* 1260 */       return InstallerVariables.replaceInstallerAndCompilerVariables;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static String replaceI18n(String token, ResourceBundle messages, VariableErrorHandlingDescriptor variableErrorHandlingDescriptor, boolean hasFallback, ArgumentsProcessor argumentsProcessor) {
/* 1266 */     String key = token.substring("i18n:".length());
/* 1267 */     String[] arguments = null;
/* 1268 */     int index = key.indexOf('(');
/* 1269 */     if (index > 0 && key.endsWith(")")) {
/* 1270 */       String argumentsLine = key.substring(index + 1, key.length() - 1);
/* 1271 */       arguments = getArguments(argumentsLine);
/* 1272 */       key = key.substring(0, index);
/*      */     } 
/*      */     try {
/* 1275 */       String message = messages.getString(key);
/* 1276 */       if (arguments == null) {
/* 1277 */         return message;
/*      */       }
/* 1279 */       if (argumentsProcessor != null) {
/* 1280 */         argumentsProcessor.process(arguments);
/*      */       }
/* 1282 */       return Messages.format(message, (Object[])arguments);
/*      */     }
/* 1284 */     catch (MissingResourceException e) {
/* 1285 */       if (hasFallback) {
/* 1286 */         return null;
/*      */       }
/* 1288 */       return handleError("i18n key", key, token, variableErrorHandlingDescriptor.getI18nKeys());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String handleError(String name, String key, String token, VariableErrorHandling variableErrorHandling) {
/* 1298 */     if (variableErrorHandling == VariableErrorHandling.ERROR_MESSAGE)
/* 1299 */       return getUnresolvedErrorMessage(name, key); 
/* 1300 */     if (variableErrorHandling == VariableErrorHandling.EXCEPTION) {
/* 1301 */       throw new UndefinedVariableException(token);
/*      */     }
/* 1303 */     return null;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getUnresolvedErrorMessage(String name, String key) {
/* 1308 */     return "ERROR: Unresolved " + name + " \"" + key + "\"";
/*      */   }
/*      */   
/*      */   private static class VariableSpec {
/*      */     private String variablePrefix;
/*      */     private String variableName;
/*      */     
/*      */     public VariableSpec(String variablePrefix, String variableName) {
/* 1316 */       this.variablePrefix = variablePrefix;
/* 1317 */       this.variableName = variableName;
/*      */     }
/*      */     
/*      */     public String getVariablePrefix() {
/* 1321 */       return this.variablePrefix;
/*      */     }
/*      */     
/*      */     public String getVariableName() {
/* 1325 */       return this.variableName;
/*      */     }
/*      */   }
/*      */   
/*      */   public static interface ArgumentsProcessor {
/*      */     void process(String[] param1ArrayOfString);
/*      */   }
/*      */   
/*      */   public static interface VariableProvider {
/*      */     Object getVariable();
/*      */     
/*      */     void setVariable(Object param1Object);
/*      */   }
/*      */   
/*      */   public static interface DesignTimeTextOverrideProcessor {
/*      */     String getTextOverrides(Bean param1Bean, String param1String);
/*      */   }
/*      */   
/*      */   public static interface DesignTimeVariableProcessor {
/*      */     String replaceDesignTimeVariables(String param1String);
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\InstallerVariables.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */