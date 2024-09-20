/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import java.io.File;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ class FileLogger implements Serializable {
/*  18 */   private SortedSet<InstallFile> createdDirs = new TreeSet<>(new ReverseComparator()); public static final int ALL = -1;
/*  19 */   private Set<InstallFile> createdFiles = new HashSet<>();
/*  20 */   private List<BackupPair> replacedFiles = new ArrayList<>();
/*     */   
/*     */   private static final String ELEMENT_FILE_LOG = "fileLog";
/*     */   
/*     */   private static final String ELEMENT_CREATED_FILES = "createdFiles";
/*     */   private static final String ELEMENT_CREATED_DIRS = "createdDirs";
/*     */   private static final String ELEMENT_ENTRY = "entry";
/*     */   private static final String ATTRIBUTE_NAME = "name";
/*     */   private static final String ATTRIBUTE_SHARED = "shared";
/*     */   private static final String ATTRIBUTE_ADMIN = "admin";
/*     */   private static final String ATTRIBUTE_DONT_UNINSTALL = "dontUninstall";
/*     */   private static final String ATTRIBUTE_UNINSTALL_MODE = "uninstallMode";
/*     */   private static final String ELEMENT_PRE_UNINSTALL = "preUninstall";
/*     */   private static final String ATTRIBUTE_EXECUTABLE = "executable";
/*     */   private static final String ELEMENT_ARGUMENT = "argument";
/*     */   
/*     */   public void write(File logFile, FileLogger oldFileLogger) throws IOException {
/*  37 */     if (oldFileLogger != null) {
/*  38 */       for (InstallFile shareableFile : oldFileLogger.getCreatedFiles(-1)) {
/*  39 */         addCreatedFile(shareableFile, -1, false);
/*     */       }
/*     */       
/*  42 */       for (InstallFile installFile : oldFileLogger.getCreatedDirs(-1)) {
/*  43 */         addCreatedDir(installFile, -1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     for (BackupPair backupPair : this.replacedFiles) {
/*  51 */       UninstallMode uninstallMode = backupPair.getOriginalFile().getUninstallMode();
/*  52 */       if (uninstallMode == UninstallMode.ALWAYS || uninstallMode == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE) {
/*  53 */         addCreatedFile(backupPair.getOriginalFile(), -1, true); continue;
/*  54 */       }  if (!backupPair.isPreviouslyCreated()) {
/*  55 */         addOverwrittenFile(backupPair.getOriginalFile(), -1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  61 */     RandomAccessFile raFile = new RandomAccessFile(logFile, "rw");
/*  62 */     raFile.setLength(0L);
/*  63 */     raFile.close();
/*  64 */     PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(logFile, true)), StandardCharsets.UTF_8));
/*     */     
/*  66 */     pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
/*  67 */     pw.println("<fileLog>");
/*     */     
/*  69 */     pw.println("<createdFiles>");
/*  70 */     addEntries(pw, this.createdFiles);
/*  71 */     pw.println("</createdFiles>");
/*     */     
/*  73 */     pw.println("<createdDirs>");
/*  74 */     addEntries(pw, this.createdDirs);
/*  75 */     pw.println("</createdDirs>");
/*     */     
/*  77 */     pw.println("</fileLog>");
/*  78 */     pw.close();
/*     */   }
/*     */ 
/*     */   
/*     */   private void addEntries(PrintWriter pw, Collection<InstallFile> col) {
/*  83 */     for (InstallFile file : col) {
/*  84 */       addEntry(pw, file);
/*     */     }
/*     */   }
/*     */   
/*     */   private void addEntry(PrintWriter pw, File file) {
/*  89 */     pw.print("<entry name=\"");
/*  90 */     String path = file.getAbsolutePath();
/*  91 */     String installationDirectory = ContextImpl.getSingleContextInt().getInstallationDirectory().getPath();
/*  92 */     if (path.startsWith(installationDirectory + File.separator)) {
/*  93 */       int startIndex = installationDirectory.length();
/*  94 */       while (startIndex < path.length() && path.charAt(startIndex) == File.separatorChar) {
/*  95 */         startIndex++;
/*     */       }
/*  97 */       path = path.substring(startIndex);
/*  98 */     } else if (Objects.equals(path, installationDirectory)) {
/*  99 */       path = ".";
/*     */     } 
/*     */     
/* 102 */     pw.print(replaceTokens(path));
/* 103 */     pw.print("\" shared=\"");
/*     */     
/* 105 */     boolean shared = false;
/* 106 */     UninstallMode uninstallMode = UninstallMode.IF_CREATED;
/* 107 */     List<InstallFile.Command> preUninstallCommands = Collections.emptyList();
/* 108 */     if (file instanceof InstallFile) {
/* 109 */       InstallFile installFile = (InstallFile)file;
/* 110 */       uninstallMode = installFile.getUninstallMode();
/* 111 */       shared = installFile.isShared();
/* 112 */       preUninstallCommands = installFile.getPreUninstallCommands();
/*     */     } 
/*     */     
/* 115 */     pw.print(shared);
/* 116 */     pw.print("\" uninstallMode=\"");
/* 117 */     pw.print(uninstallMode.getIntValue());
/* 118 */     pw.print("\"");
/* 119 */     if (preUninstallCommands.isEmpty()) {
/* 120 */       pw.println("/>");
/*     */     } else {
/* 122 */       pw.println(">");
/* 123 */       for (InstallFile.Command command : preUninstallCommands) {
/* 124 */         pw.println("<preUninstall admin=\"" + command.isAdminRights() + "\" " + "executable" + "=\"" + command.getExecutable() + "\">");
/* 125 */         for (String argument : command.getArguments()) {
/* 126 */           pw.println("<argument>" + replaceTokens(argument) + "</" + "argument" + ">");
/*     */         }
/* 128 */         pw.println("</preUninstall>");
/*     */       } 
/* 130 */       pw.println("</entry>");
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String replaceTokens(String path) {
/* 136 */     return path.replaceAll("&", "&amp;");
/*     */   }
/*     */   
/*     */   public void read(File logFile) throws IOException {
/* 140 */     Element rootElement = XmlHelper.parseFile(logFile).getDocumentElement();
/*     */     
/* 142 */     for (Element element : XmlHelper.childElements(rootElement)) {
/* 143 */       if (Objects.equals(element.getTagName(), "createdFiles")) {
/* 144 */         readEntries(element, this.createdFiles); continue;
/* 145 */       }  if (Objects.equals(element.getTagName(), "createdDirs")) {
/* 146 */         readEntries(element, this.createdDirs);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void readEntries(Element parent, Collection<InstallFile> collection) {
/* 152 */     for (Element element : XmlHelper.childElements(parent)) {
/* 153 */       int uninstallMode = XmlHelper.readAttribute(element, "uninstallMode", -1);
/* 154 */       if (uninstallMode == -1) {
/* 155 */         boolean dontUninstall = XmlHelper.readAttribute(element, "dontUninstall", false);
/* 156 */         if (dontUninstall) {
/* 157 */           uninstallMode = 1;
/*     */         } else {
/* 159 */           uninstallMode = 0;
/*     */         } 
/*     */       } 
/*     */       
/* 163 */       String fileName = XmlHelper.readAttribute(element, "name", "");
/* 164 */       File installationDirectory = ContextImpl.getSingleContextInt().getInstallationDirectory().getAbsoluteFile();
/* 165 */       if (Objects.equals(fileName, ".")) {
/* 166 */         fileName = installationDirectory.getPath();
/* 167 */       } else if (!(new File(fileName)).isAbsolute()) {
/* 168 */         File absoluteFile = new File(installationDirectory, fileName);
/* 169 */         fileName = absoluteFile.getPath();
/*     */       } 
/* 171 */       InstallFile installFile = new InstallFile(fileName, XmlHelper.readAttribute(element, "shared", false), UninstallMode.getFromIntValue(uninstallMode));
/* 172 */       for (Element commandElement : XmlHelper.childElements(element)) {
/* 173 */         if (commandElement.getTagName().equals("preUninstall")) {
/* 174 */           List<String> arguments = new ArrayList<>();
/* 175 */           for (Element argumentElement : XmlHelper.childElements(commandElement)) {
/* 176 */             arguments.add(argumentElement.getTextContent());
/*     */           }
/* 178 */           String executable = XmlHelper.readAttribute(commandElement, "executable", "");
/* 179 */           if (!executable.isEmpty()) {
/* 180 */             InstallFile.Command command = new InstallFile.Command(XmlHelper.readAttribute(commandElement, "admin", true), executable, arguments.<String>toArray(new String[0]));
/* 181 */             installFile.addPreUninstallCommand(command);
/*     */           } 
/*     */         } 
/*     */       } 
/* 185 */       collection.add(installFile);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Collection<InstallFile> getCreatedDirs(int id) {
/* 190 */     Set<Integer> rolledBackIds = FileInstallerState.getInstance().getRolledBackIds();
/*     */     
/* 192 */     return getFileList(id, rolledBackIds, this.createdDirs);
/*     */   }
/*     */   
/*     */   public Collection<InstallFile> getCreatedFiles(int id) {
/* 196 */     Set<Integer> rolledBackIds = FileInstallerState.getInstance().getRolledBackIds();
/*     */     
/* 198 */     return getFileList(id, rolledBackIds, this.createdFiles);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static Collection<InstallFile> getFileList(int id, Set<Integer> rolledBackIds, Set<InstallFile> set) {
/* 203 */     List<InstallFile> list = new ArrayList<>();
/* 204 */     for (InstallFile installFile : set) {
/* 205 */       if (installFile.getRollbackId() >= id && !rolledBackIds.contains(Integer.valueOf(installFile.getRollbackId()))) {
/* 206 */         list.add(installFile);
/*     */       }
/*     */     } 
/* 209 */     return list;
/*     */   }
/*     */   
/*     */   public List<BackupPair> getReplacedFiles(int id) {
/* 213 */     Set<Integer> rolledBackIds = FileInstallerState.getInstance().getRolledBackIds();
/*     */     
/* 215 */     List<BackupPair> list = new ArrayList<>();
/* 216 */     for (BackupPair backupPair : this.replacedFiles) {
/* 217 */       if (backupPair.getRollbackId() >= id && !rolledBackIds.contains(Integer.valueOf(backupPair.getRollbackId()))) {
/* 218 */         list.add(backupPair);
/*     */       }
/*     */     } 
/* 221 */     return list;
/*     */   }
/*     */   
/*     */   public void addCreatedDir(InstallFile createdFile, int id) {
/* 225 */     createdFile = new InstallFile(createdFile.getAbsoluteFile(), createdFile.isShared(), createdFile.getUninstallMode());
/* 226 */     createdFile.setRollbackId(id);
/* 227 */     this.createdDirs.add(createdFile);
/*     */   }
/*     */   
/*     */   public void addCreatedFile(InstallFile createdFile, int id, boolean replaceCommands) {
/* 231 */     addImpl(createdFile, id, new InstallFile(createdFile.getAbsoluteFile(), createdFile.isShared(), createdFile.getUninstallMode()), replaceCommands);
/*     */   }
/*     */   
/*     */   private void addOverwrittenFile(InstallFile file, int id) {
/* 235 */     addImpl(file, id, new InstallFile(file.getAbsoluteFile(), file.isShared(), UninstallMode.NEVER), true);
/*     */   }
/*     */   
/*     */   private void addImpl(InstallFile createdFile, int id, InstallFile newFile, boolean replaceCommands) {
/* 239 */     for (InstallFile.Command command : createdFile.getPreUninstallCommands()) {
/* 240 */       newFile.addPreUninstallCommand(command);
/*     */     }
/* 242 */     newFile.setRollbackId(id);
/* 243 */     if (!replaceCommands || newFile.getPreUninstallCommands().isEmpty() || !this.createdFiles.contains(newFile)) {
/* 244 */       this.createdFiles.add(newFile);
/*     */     } else {
/* 246 */       for (InstallFile previousFile : this.createdFiles) {
/* 247 */         if (previousFile.equals(newFile)) {
/* 248 */           previousFile.updatePreUninstallCommands(newFile.getPreUninstallCommands());
/*     */           return;
/*     */         } 
/*     */       } 
/* 252 */       Logger.getInstance().error(null, newFile.getAbsolutePath() + " was not contained in createdFiles");
/* 253 */       this.createdFiles.add(newFile);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void addReplacedFile(BackupPair backupPair, int id) {
/* 258 */     backupPair.setRollbackId(id);
/* 259 */     this.replacedFiles.add(backupPair);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsCreatedFile(File file) {
/* 264 */     return this.createdFiles.contains(file.getAbsoluteFile());
/*     */   }
/*     */   
/*     */   public boolean hasFiles() {
/* 268 */     return (this.createdDirs.size() > 0 || this.createdFiles.size() > 0 || this.replacedFiles.size() > 0);
/*     */   }
/*     */   
/*     */   public void registerPreUninstallCommand(File file, InstallFile.Command command) {
/* 272 */     for (InstallFile installFile : this.createdFiles) {
/* 273 */       if (installFile.equals(file)) {
/* 274 */         installFile.addPreUninstallCommand(command);
/*     */         return;
/*     */       } 
/*     */     } 
/* 278 */     for (BackupPair replacedFile : this.replacedFiles) {
/* 279 */       InstallFile installFile = replacedFile.getOriginalFile();
/* 280 */       if (installFile.equals(file)) {
/* 281 */         installFile.addPreUninstallCommand(command);
/*     */         return;
/*     */       } 
/*     */     } 
/* 285 */     Logger.getInstance().error(null, "could not register pre-uninstall command for " + file);
/*     */   }
/*     */   
/*     */   private static class ReverseComparator implements Comparator<InstallFile>, Serializable { private ReverseComparator() {}
/*     */     
/*     */     public int compare(InstallFile o1, InstallFile o2) {
/* 291 */       return -o1.compareTo(o2);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\FileLogger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */