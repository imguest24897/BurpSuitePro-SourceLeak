package com.install4j.runtime.installer;

public interface InstallerConstants {
  public static final String APP_ID_INSTALLER = "installer";
  
  public static final String APP_ID_UNINSTALLER = "uninstaller";
  
  public static final String CONFFILE_NAME = "i4jparams.conf";
  
  public static final String ELEMENT_ROOT = "config";
  
  public static final String DEFAULT_MESSAGESFILE_NAME = "MessagesDefault";
  
  public static final String RUNTIME_DIRECTORY = ".install4j";
  
  public static final String RUNTIME_LIBRARY = "i4jruntime.jar";
  
  public static final String BUILD_UUID_FILE = "build.uuid";
  
  public static final String DEFAULT_UNINSTALLER_FILENAME = "uninstall";
  
  public static final String VMOPTIONS_SUFFIX = ".vmoptions";
  
  public static final String INSTALLER_ICO_FILENAME = "installer.ico";
  
  public static final String STATS_PROPFILE_NAME = "stats.properties";
  
  public static final String PROP_CONTENT_SIZE = "content.size.";
  
  public static final String PROP_CONTENT_COUNT = "content.count.";
  
  public static final String PROP_COMPONENTS = "components.";
  
  public static final String PROP_FILE_NAME = "file.name.";
  
  public static final String PROP_FILE_SIZE = "file.size.";
  
  public static final String PROP_ENTRIES_SIZE = "entries.size.";
  
  public static final String PROP_CONTENT_SET_COUNT = "setCount";
  
  public static final String PROP_DIR_NAME = "dirName";
  
  public static final String JAR_SUFFIX = ".jar";
  
  public static final String USER_JAR_FILE_NAME = "user.jar";
  
  public static final String LAUNCHER_JAR_PREFIX = "launcher";
  
  public static final String USER_DIR_NAME = "user";
  
  public static final String PROPNAME_JVM_DIR = "install4j.jvmDir";
  
  public static final String PROPNAME_LANGUAGE = "install4j.language";
  
  public static final String PROPNAME_DEFAULT_LANGUAGE = "install4j.defaultLanguage";
  
  public static final String PROPNAME_SYSTEM_LANGUAGE = "install4j.systemLanguage";
  
  public static final String PROPNAME_COMM_IDENTIFIER = "install4j.commIdentifier";
  
  public static final String PROPNAME_COMM_HASH = "install4j.commHash";
  
  public static final String PROPNAME_HELPER_APP_ID = "install4j.helperAppId";
  
  public static final String PROPNAME_HELPER_LOG = "install4j.helperLog";
  
  public static final String PROPNAME_ADD_USER = "install4j.addUserDir";
  
  public static final String PROPNAME_INTEGRATION_TEST = "install4j.installerIntegrationTest";
  
  public static final String VARIABLE_APPLICATIONS_DIRECTORY = "{appdir}";
  
  public static final String VARIABLE_FILE_SEPARATOR = "{/}";
  
  public static final String VARIABLE_MSI_PRODUCT_ID = "sys.msiProductId";
  
  public static final int OVERWRITE_NEVER = 0;
  
  public static final int OVERWRITE_ALWAYS = 1;
  
  public static final int OVERWRITE_IF_NEWER = 2;
  
  public static final int OVERWRITE_IF_NEWER_OTHERWISE_ASK = 3;
  
  public static final int OVERWRITE_ALWAYS_ASK_EXCEPT_FOR_UPDATE = 4;
  
  public static final int OVERWRITE_ALWAYS_ASK = 5;
  
  public static final int UNINSTALL_IF_CREATED = 0;
  
  public static final int UNINSTALL_NEVER = 1;
  
  public static final int UNINSTALL_ALWAYS = 2;
  
  public static final int UNINSTALL_IF_CREATED_BUT_NOT_FOR_UPDATE = 3;
  
  public static final int UNINSTALL_NOT_FOR_UPDATE = 4;
  
  public static final String ATTRIBUTE_INSTALL4J_VERSION = "install4jVersion";
  
  public static final String ATTRIBUTE_INSTALL4J_BUILD = "install4jBuild";
  
  public static final String ATTRIBUTE_TYPE = "type";
  
  public static final String ATTRIBUTE_BITNESS = "bitness";
  
  public static final String TYPE_WINDOWS = "windows";
  
  public static final String TYPE_MACOS = "macos";
  
  public static final String TYPE_UNIX = "unix";
  
  public static final String ELEMENT_GENERAL = "general";
  
  public static final String ELEMENT_COMPILER_VARIABLES = "compilerVariables";
  
  public static final String ELEMENT_LANGUAGES = "languages";
  
  public static final String ELEMENT_LEGACY_UNINSTALLER_SCREENS = "uninstallerScreens";
  
  public static final String ELEMENT_CUSTOM_CODE = "customCode";
  
  public static final String ELEMENT_VARIABLE = "variable";
  
  public static final String ATTRIBUTE_VARIABLE_NAME = "name";
  
  public static final String ATTRIBUTE_VARIABLE_VALUE = "value";
  
  public static final String ATTRIBUTE_HIDDEN_VARIABLE = "hidden";
  
  public static final String ATTRIBUTE_REGISTER_FOR_RESPONSE_FILE = "registerForResponseFile";
  
  public static final String ATTRIBUTE_RESPONSE_FILE_COMMENT = "responseFileComment";
  
  public static final String ELEMENT_LANGUAGE = "variable";
  
  public static final String ATTRIBUTE_SKIP_LANGUAGE_SELECTION = "skipLanguageSelection";
  
  public static final String ATTRIBUTE_LANGUAGE_SELECTION_IN_PRINCIPAL_LANGUAGE = "languageSelectionInPrincipalLanguage";
  
  public static final String ATTRIBUTE_LANGUAGE_ID = "id";
  
  public static final String ATTRIBUTE_LANGUAGE_NAME = "name";
  
  public static final String ATTRIBUTE_MESSAGE_FILE = "messageFile";
  
  public static final String ATTRIBUTE_CUSTOM_LOCALIZATION_FILE = "customLocalizationFile";
  
  public static final String ELEMENT_GROUP = "group";
  
  public static final String ELEMENT_LINK = "link";
  
  public static final String ELEMENT_BEANS = "beans";
  
  public static final String ELEMENT_APPLICATIONS = "applications";
  
  public static final String ELEMENT_APPLICATION = "application";
  
  public static final String ELEMENT_STYLES = "styles";
  
  public static final String ELEMENT_STYLE = "style";
  
  public static final String ELEMENT_OVERRIDDEN_STYLE = "overriddenStyle";
  
  public static final String ELEMENT_OVERRIDDEN_BEANS = "overriddenBeans";
  
  public static final String ELEMENT_OVERRIDDEN_BEAN = "overriddenBean";
  
  public static final String ATTRIBUTE_REFERENCE_ID = "referenceId";
  
  public static final String ELEMENT_VARIABLES = "variables";
  
  public static final String ELEMENT_SCREENS = "screens";
  
  public static final String ELEMENT_SCREEN = "screen";
  
  public static final String ELEMENT_ACTIONS = "actions";
  
  public static final String ELEMENT_ACTION = "action";
  
  public static final String ELEMENT_ACTION_LISTS = "actionLists";
  
  public static final String ELEMENT_TEXT_OVERRIDES = "textOverrides";
  
  public static final String ELEMENT_PROPERTY = "property";
  
  public static final String ELEMENT_FORM_COMPONENTS = "formComponents";
  
  public static final String ELEMENT_FORM_COMPONENT = "formComponent";
  
  public static final String ELEMENT_JAVA = "java";
  
  public static final String ATTRIBUTE_STYLE_ID = "styleId";
  
  public static final String ATTRIBUTE_CONDITION_CLASS_NAME = "conditionClass";
  
  public static final String ATTRIBUTE_PRE_ACTIVATION_CLASS_NAME = "preActivationClass";
  
  public static final String ATTRIBUTE_POST_ACTIVATION_CLASS_NAME = "postActivationClass";
  
  public static final String ATTRIBUTE_VALIDATION_CLASS_NAME = "validationClass";
  
  public static final String ATTRIBUTE_BEAN_ID = "id";
  
  public static final String ATTRIBUTE_CUSTOMIZED_ID = "customizedId";
  
  public static final String ATTRIBUTE_ID_NAMESPACE = "idNamespace";
  
  public static final String ATTRIBUTE_TARGET_BEAN_ID = "targetId";
  
  public static final String ATTRIBUTE_BACK_BUTTON_TYPE = "backButtonType";
  
  public static final String ATTRIBUTE_FINISH_SCREEN = "finishScreen";
  
  public static final String ATTRIBUTE_MULTI_EXEC = "multiExec";
  
  public static final String ATTRIBUTE_ELEVATE = "elevate";
  
  public static final String ATTRIBUTE_FAILURE_STRATEGY = "cancelOnFail";
  
  public static final String ATTRIBUTE_ERROR_MESSAGE = "errorMessage";
  
  public static final String ATTRIBUTE_ROLLBACK_BARRIER = "rollbackBarrier";
  
  public static final String ATTRIBUTE_ROLLBACK_BARRIER_EXIT_CODE = "rollbackBarrierExitCode";
  
  public static final String ATTRIBUTE_GROUP = "group";
  
  public static final String ELEMENT_LOOK_AND_FEEL = "lookAndFeel";
  
  public static final String ATTRIBUTE_DARK_MODE_STRATEGY = "darkModeStrategy";
  
  public static final String ATTRIBUTE_LIGHT_THEME = "lightTheme";
  
  public static final String ATTRIBUTE_DARK_THEME = "darkTheme";
  
  public static final String ATTRIBUTE_CUSTOM_LIGHT_THEME_NAME = "customLightThemeName";
  
  public static final String ATTRIBUTE_CUSTOM_DARK_THEME_NAME = "customDarkThemeName";
  
  public static final String ATTRIBUTE_LOOK_AND_FEEL_HANDLER_CLASS_NAME = "lookAndFeelHandlerClassName";
  
  public static final int WIZARD_INDEX_UNCHANGED = 1;
  
  public static final int WIZARD_INDEX_NEW = 2;
  
  public static final int WIZARD_INDEX_STEP = 3;
  
  public static final int WIZARD_INDEX_REMOVE = 4;
  
  public static final String ATTRIBUTE_WIZARD_INDEX_CHANGE_TYPE = "wizardIndexChangeType";
  
  public static final String ATTRIBUTE_WIZARD_INDEX_KEY = "wizardIndexKey";
  
  public static final String ELEMENT_WIZARD_INDEX = "wizardIndex";
  
  public static final String ATTRIBUTE_PARTIALLY_DEFINED = "partiallyDefined";
  
  public static final String ATTRIBUTE_MIN_WIDTH = "minWidth";
  
  public static final String ATTRIBUTE_MAX_WIDTH = "maxWidth";
  
  public static final String ATTRIBUTE_NUMBERED = "numbered";
  
  public static final String ATTRIBUTE_BACKGROUND = "background";
  
  public static final String ATTRIBUTE_FOREGROUND = "foreground";
  
  public static final String ATTRIBUTE_BACKGROUND_IMAGE = "backgroundImage";
  
  public static final String ATTRIBUTE_BACKGROUND_IMAGE_ANCHOR = "backgroundImageAnchor";
  
  public static final String ATTRIBUTE_INITIAL_KEY = "initialKey";
  
  public static final String ELEMENT_STEPS = "steps";
  
  public static final String ELEMENT_STEP = "step";
  
  public static final String ATTRIBUTE_KEY = "key";
  
  public static final String ELEMENT_SCRIPT_CLASS_ORIGINS = "scriptClassOrigins";
  
  public static final String ELEMENT_CLASS = "class";
  
  public static final String ATTRIBUTE_CLASS_NAME = "className";
  
  public static final String ATTRIBUTE_BEAN_TYPE = "beanType";
  
  public static final String ATTRIBUTE_BEAN_NAME = "beanName";
  
  public static final String ATTRIBUTE_PROPERTY_NAME = "propertyName";
  
  public static final String ATTRIBUTE_PARENT_SCREEN = "parentScreen";
  
  public static final String ATTRIBUTE_IMPORT_LINE_COUNT = "importLineCount";
  
  public static final String ATTRIBUTE_HEADER_LINE_COUNT = "headerLineCount";
  
  public static final String ATTRIBUTE_SCRIPT_LINE_COUNT = "scriptLineCount";
  
  public static final String ELEMENT_FILE_OPTIONS = "fileOptions";
  
  public static final String ELEMENT_ENTRY = "entry";
  
  public static final String ELEMENT_DIR = "dir";
  
  public static final String ATTRIBUTE_NAME = "name";
  
  public static final String ATTRIBUTE_OVERWRITE = "overwrite";
  
  public static final String ATTRIBUTE_SHARED = "shared";
  
  public static final String ATTRIBUTE_MODE = "mode";
  
  public static final String ATTRIBUTE_IS_LAUNCHER = "isLauncher";
  
  public static final String ATTRIBUTE_UNINSTALL_MODE = "uninstallMode";
  
  public static final String ATTRIBUTE_REMOVE_SIGNATURE = "removeSignature";
  
  public static final String ELEMENT_ATTRIBUTE = "attribute";
  
  public static final String ATTRIBUTE_VALUE = "value";
  
  public static final String ELEMENT_FILESETS = "filesets";
  
  public static final String ELEMENT_FILESET = "fileset";
  
  public static final String ELEMENT_COMPONENTS = "components";
  
  public static final String ELEMENT_COMPONENT = "component";
  
  public static final String ELEMENT_COMPONENT_FOLDER = "componentFolder";
  
  public static final String ATTRIBUTE_SELECTED = "selected";
  
  public static final String ATTRIBUTE_DISPLAY_DESCRIPTION = "displayDescription";
  
  public static final String ATTRIBUTE_HIDE_HELP_BUTTON = "hideHelpButton";
  
  public static final String ATTRIBUTE_CHANGEABLE = "changeable";
  
  public static final String ATTRIBUTE_EXPANDED = "expanded";
  
  public static final String ATTRIBUTE_DOWNLOADED = "downloaded";
  
  public static final String ATTRIBUTE_HIDDEN = "hidden";
  
  public static final String ATTRIBUTE_DEPENDS_ON = "dependsOn";
  
  public static final String ELEMENT_COMPONENT_ENTRY = "entry";
  
  public static final String ATTRIBUTE_LOCATION = "location";
  
  public static final String ATTRIBUTE_COMPONENT_ALL_INCLUDED = "allIncluded";
  
  public static final String ELEMENT_COMPONENT_DESCRIPTION = "description";
  
  public static final String ELEMENT_EXTERNAL_ROOTS = "externalRoots";
  
  public static final String ELEMENT_EXTERNAL_ROOT = "externalRoot";
  
  public static final String ATTRIBUTE_ID = "id";
  
  public static final String ATTRIBUTE_FILESET = "fileset";
  
  public static final String ELEMENT_LAUNCHERS = "launchers";
  
  public static final String ELEMENT_LAUNCHER = "launcher";
  
  public static final String ELEMENT_START_FILE_ENTRIES = "startFileEntries";
  
  public static final String ATTRIBUTE_LAUNCHER_FILE = "file";
  
  public static final String ATTRIBUTE_LAUNCHER_TYPE = "type";
  
  public static final String ATTRIBUTE_EXCLUDE_FROM_MENU = "excludeFromMenu";
  
  public static final String ATTRIBUTE_MENU_NAME = "menuName";
  
  public static final String ATTRIBUTE_UNINSTALLER = "uninstaller";
  
  public static final String ATTRIBUTE_PLIST_CONTENT = "plistContent";
  
  public static final String LAUNCHER_TYPE_CONSOLE = "console";
  
  public static final String LAUNCHER_TYPE_GUI = "gui";
  
  public static final String LAUNCHER_TYPE_SERVICE = "service";
  
  public static final String LAUNCHER_TYPE_EXTERNAL = "external";
  
  public static final String LAUNCHER_TYPE_INSTALLER_APPLICATION = "installerApplication";
  
  public static final String ATTRIBUTE_DEPENDENCIES = "dependencies";
  
  public static final String ATTRIBUTE_STARTUP_TYPE = "startupType";
  
  public static final String STARTUP_TYPE_AUTO = "auto";
  
  public static final String STARTUP_TYPE_MANUAL = "manual";
  
  public static final String ELEMENT_UNINSTALL_DELETE = "uninstallDelete";
  
  public static final String ELEMENT_WINDOWS_SPECIFIC = "windowsSpecific";
  
  public static final String ELEMENT_MAC_SPECIFIC = "macSpecific";
  
  public static final String ELEMENT_UNIX_SPECIFIC = "unixSpecific";
  
  public static final String ATTRIBUTE_RUNTIME_DIR_PARENT = "runtimeDirParent";
  
  public static final String ATTRIBUTE_SINGLE_BUNDLE = "singleBundle";
  
  public static final String ATTRIBUTE_SINGLE_BUNDLE_NAME = "singleBundleName";
  
  public static final String ATTRIBUTE_SINGLE_BUNDLE_LAUNCHER_ID = "singleBundleLauncherId";
  
  public static final String ATTRIBUTE_MSI_SCOPE = "msiScope";
  
  public static final String ATTRIBUTE_DEFAULT_INSTALLATION_DIRECTORY = "defaultInstallationDirectory";
  
  public static final String ATTRIBUTE_APPLICATION_NAME = "applicationName";
  
  public static final String ATTRIBUTE_APPLICATION_VERSION = "applicationVersion";
  
  public static final String ATTRIBUTE_STATUS = "status";
  
  public static final String ATTRIBUTE_JRE_SHARING_KEY = "jreSharingKey";
  
  public static final String ATTRIBUTE_JRE_VERSION = "jreVersion";
  
  public static final String ATTRIBUTE_MIN_JAVA_VERSION = "minJavaVersion";
  
  public static final String ATTRIBUTE_PUBLISHER_NAME = "publisherName";
  
  public static final String ATTRIBUTE_PUBLISHER_URL = "publisherURL";
  
  public static final String ATTRIBUTE_MEDIA_NAME = "mediaName";
  
  public static final String ATTRIBUTE_LZMA_COMPRESSION = "lzmaCompression";
  
  public static final String ATTRIBUTE_PACK200_COMPRESSION = "pack200Compression";
  
  public static final String ATTRIBUTE_DOWNLOAD_URL = "downloadURL";
  
  public static final String ATTRIBUTE_MEDIA_SET_ID = "mediaSetId";
  
  public static final String ATTRIBUTE_PRIVILEGED_INSTALLER_REQUEST = "privilegedInstallerRequest";
  
  public static final String ATTRIBUTE_APPLICATION_ID = "applicationId";
  
  public static final String ATTRIBUTE_INSTALLER_TYPE = "installerType";
  
  public static final String ATTRIBUTE_ADDON_APP_ID = "addOnAppId";
  
  public static final String ATTRIBUTE_SUGGEST_PREVIOUS_LOCATIONS = "suggestPreviousLocations";
  
  public static final String ATTRIBUTE_UNINSTALLER_PATH = "uninstallerFilename";
  
  public static final String ATTRIBUTE_UNINSTALLER_DIRECTORY = "uninstallerDirectory";
  
  public static final String LEGACY_ATTRIBUTE_WINDOW_WIDTH = "windowWidth";
  
  public static final String LEGACY_ATTRIBUTE_WINDOW_HEIGHT = "windowHeight";
  
  public static final String LEGACY_ATTRIBUTE_WATERMARK = "watermark";
  
  public static final String LEGACY_ATTRIBUTE_RESIZABLE = "resizable";
  
  public static final String LEGACY_ATTRIBUTE_ALLOW_CONSOLE = "allowConsole";
  
  public static final String PREFERRED_JRE_FILE = "pref_jre.cfg";
  
  public static final String INSTALLER_JRE_FILE = "inst_jre.cfg";
  
  public static final String I4J_JRES_DIR = "i4j_jres";
  
  public static final String UNIX_OPT_DIR = "/opt";
  
  public static final String UNIX_USR_LOCAL_DIR = "/usr/local";
  
  public static final String INFOPLIST_FILENAME = "Info.plist";
  
  public static final int INSTALLER_TYPE_REGULAR = 1;
  
  public static final int INSTALLER_TYPE_ADD_ON = 2;
  
  public static final int EXIT_CODE_NO_VM = 83;
  
  public static final int EXIT_CODE_ROLLBACK = 1;
  
  public static final int DEFAULT_EXIT_CODE_ROLLBACK_BARRIER = 0;
  
  public static final int DEFAULT_COMPONENT_ID = 0;
  
  public static final String EXTERNAL_FILE_PREFIX = "i4j_extf_";
  
  public static final String LANGUAGE_RESTART_PARAMETER = "__i4j_lang_restart";
  
  public static final String AUTHORIZATION_RESTART_PARAMETER = "__i4j_auth_restart";
  
  public static final String EXTRACT_AND_EXIT_PARAMETER = "__i4j_extract_and_exit";
  
  public static final String MACOS_CONTENTS_DIR = "Contents";
  
  public static final String MACOS_RESOURCES_DIR = "Contents/Resources";
  
  public static final String MACOS_APP_DIR_SUFFIX = "/app";
  
  public static final String MACOS_SINGLE_BUNDLE_APP_DIR = "Contents/Resources/app";
  
  public static final String MACOS_SINGLE_BUNDLE_INSTALLER_APP_DIR = "Contents/java/app";
  
  public static final String EXTERNAL_PREFIX = ".i4j_";
  
  public static final String EXTERNAL_ROOT_PREFIX = ".i4j_external_";
  
  public static final String EXTERNAL_FILESET_PREFIX = ".i4j_fileset_";
  
  public static final int DEFAULT_INSET_TOP = 3;
  
  public static final int DEFAULT_INSET_LEFT = 0;
  
  public static final int DEFAULT_INSET_BOTTOM = 3;
  
  public static final int DEFAULT_INSET_RIGHT = 0;
  
  public static final String ATTRIBUTE_INIT_CLASS_NAME = "initClassName";
  
  public static final String ATTRIBUTE_VISIBILITY_CLASS_NAME = "visibilityClassName";
  
  public static final String ATTRIBUTE_INSET_TOP = "insetsTop";
  
  public static final String ATTRIBUTE_INSET_LEFT = "insetsLeft";
  
  public static final String ATTRIBUTE_INSET_BOTTOM = "insetsBottom";
  
  public static final String ATTRIBUTE_INSET_RIGHT = "insetsRight";
  
  public static final String ATTRIBUTE_RESET_INIT_ON_PREVIOUS = "resetInitOnPrevious";
  
  public static final int DEFAULT_WINDOW_WIDTH = 500;
  
  public static final int DEFAULT_WINDOW_HEIGHT = 390;
  
  public static final String VMOPTION_CLASSPATH = "-classpath ";
  
  public static final String VMOPTION_CLASSPATH_A = "-classpath/a ";
  
  public static final String VMOPTION_CLASSPATH_P = "-classpath/p ";
  
  public static final String VMOPTION_INCLUDE_NO_SPACE = "-include-options";
  
  public static final String VMOPTION_INCLUDE = "-include-options ";
  
  public static final String INSTALL4J_RUNTIME_DIR = ".install4j";
  
  public static final String PROPNAME_TOTAL_DATA_LENGTH = "exe4j.totalDataLength";
  
  public static final String PROPNAME_UNEXTRACTED_POSITION_RESTART = "exe4j.unextractedPositionRestart";
  
  public static final String UPDATES_XML_NAME = "updates.xml";
  
  public static final String MD5SUMS_NAME = "md5sums";
  
  public static final String SHA256SUMS_NAME = "sha256sums";
  
  public static final String ICONS_DIR_NAME = "icons";
  
  public static final String MACOS_DEFAULT_ICON_NAME = "app.icns";
  
  public static final String ATTRIBUTE_ARCHIVE = "archive";
  
  public static final String I4J_LINK_SUFFIX = ".i4jlnk";
  
  public static final String NOPACK_SUFFIX = ".nopack";
  
  public static final String PACK_OPTIONS_SUFFIX = ".packoptions";
  
  public static final String PACK_SUFFIX = ".pack";
  
  public static final String COMMON_FILES_BASE_NAME = "common_files";
  
  public static final String DAT_SUFFIX = ".dat";
  
  public static final String JRE_FILENAME = "jre.tar.gz";
  
  public static final String INSTALL4J_EXTRA_SILENT = "install4j.extraSilent";
  
  public static final int ACTION_ELEVATION_TYPE_INHERIT = 1;
  
  public static final int ACTION_ELEVATION_TYPE_NONE = 2;
  
  public static final int ACTION_ELEVATION_TYPE_ELEVATE = 3;
  
  public static final String VMOPTIONS_TXT = "vmoptions.txt";
  
  public static final String PROPNAME_MAC_JRE_BUNDLE = "i4j.jreBundle";
  
  public static final String PROPNAME_MAC_JRE_TAR_FILE = "i4j.tarFile";
  
  public static final String CONTENTS = "/Contents/";
  
  public static final String MACOS_NATIVE_FOLDER = "MacOS/";
  
  public static final String CONTENTS_NATIVE_FOLDER = "/Contents/MacOS/";
  
  public static final String APP_SUFFIX = ".app";
  
  public static final String APP_CONTENTS_NATIVE_FOLDER = ".app/Contents/MacOS/";
  
  public static final String DEFAULT_MAC_BUNDLE_BINARY = "JavaApplicationStub";
  
  public static final String LAUNCHER_PROPERTIES_SUFFIX = ".lprop";
  
  public static final String ICON_RESOURCE_PREFIX = "icon:";
  
  public static final String PROPERTY_NO_NATIVE_DIALOGS = "install4j.noNativeDialogs";
  
  public static final String UNINSTALLER_MAIN_CLASS = "com.install4j.runtime.installer.Uninstaller";
  
  public static final String MACOS_COMMAND_LINE_UNINSTALLER = "uninstall";
  
  public static final int LINK_FILE_MAGIC = -387705896;
  
  public static final int LINK_FILE_USER_JAR = 1;
  
  public static final int LINK_FILE_SYMLINK = 2;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\InstallerConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */