/*     */ package com.install4j.runtime.beans.screens.components;
/*     */ 
/*     */ import com.install4j.api.SystemInfo;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerVariableEvent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.components.DirectorySelector;
/*     */ import com.install4j.runtime.installer.frontend.components.FileValidator;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.text.DecimalFormat;
/*     */ import java.util.MissingResourceException;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ 
/*     */ public class InstallationDirectorySelector
/*     */   extends JPanel
/*     */   implements DirectorySelector.InternalValidator, FileValidator
/*     */ {
/*     */   private JLabel lblSpace;
/*     */   private JLabel lblFreeSpace;
/*     */   private boolean showRequiredDiskSpace = true;
/*     */   private boolean showFreeDiskSpace = true;
/*     */   private boolean checkFreeSpace = true;
/*     */   private boolean suggestAppDir = true;
/*     */   private boolean existingDirWarning = true;
/*     */   private boolean validateApplicationId = true;
/*     */   private boolean checkWritable = true;
/*     */   private boolean allowSpacesOnUnix = false;
/*     */   private boolean manualEntryAllowed = true;
/*     */   private ScriptProperty validationScript;
/*     */   private boolean compact = false;
/*     */   private boolean standardValidation = true;
/*     */   private DirectorySelector directorySelector;
/*     */   private boolean initialized;
/*     */   private Context context;
/*     */   private FormEnvironment formEnvironment;
/*     */   private Bean bean;
/*     */   private boolean designTime;
/*     */   
/*     */   public InstallationDirectorySelector(Bean bean) {
/*  60 */     this.bean = bean;
/*     */   }
/*     */   
/*     */   public void setDesignTime(boolean designTime) {
/*  64 */     this.designTime = designTime;
/*     */   }
/*     */   
/*     */   public void createComponent() {
/*  68 */     removeAll();
/*  69 */     setupControls();
/*  70 */     setupComponent();
/*     */   }
/*     */   
/*     */   public boolean isShowRequiredDiskSpace() {
/*  74 */     return this.showRequiredDiskSpace;
/*     */   }
/*     */   
/*     */   public void setShowRequiredDiskSpace(boolean showRequiredDiskSpace) {
/*  78 */     this.showRequiredDiskSpace = showRequiredDiskSpace;
/*     */   }
/*     */   
/*     */   public boolean isShowFreeDiskSpace() {
/*  82 */     return this.showFreeDiskSpace;
/*     */   }
/*     */   
/*     */   public void setShowFreeDiskSpace(boolean showFreeDiskSpace) {
/*  86 */     this.showFreeDiskSpace = showFreeDiskSpace;
/*     */   }
/*     */   
/*     */   public boolean isCheckFreeSpace() {
/*  90 */     return this.checkFreeSpace;
/*     */   }
/*     */   
/*     */   public void setCheckFreeSpace(boolean checkFreeSpace) {
/*  94 */     this.checkFreeSpace = checkFreeSpace;
/*     */   }
/*     */   
/*     */   public boolean isSuggestAppDir() {
/*  98 */     return this.suggestAppDir;
/*     */   }
/*     */   
/*     */   public void setSuggestAppDir(boolean suggestAppDir) {
/* 102 */     this.suggestAppDir = suggestAppDir;
/*     */   }
/*     */   
/*     */   public boolean isExistingDirWarning() {
/* 106 */     return this.existingDirWarning;
/*     */   }
/*     */   
/*     */   public void setExistingDirWarning(boolean existingDirWarning) {
/* 110 */     this.existingDirWarning = existingDirWarning;
/*     */   }
/*     */   
/*     */   public boolean isValidateApplicationId() {
/* 114 */     return this.validateApplicationId;
/*     */   }
/*     */   
/*     */   public void setValidateApplicationId(boolean validateApplicationId) {
/* 118 */     this.validateApplicationId = validateApplicationId;
/*     */   }
/*     */   
/*     */   public boolean isAllowSpacesOnUnix() {
/* 122 */     return this.allowSpacesOnUnix;
/*     */   }
/*     */   
/*     */   public void setAllowSpacesOnUnix(boolean allowSpacesOnUnix) {
/* 126 */     this.allowSpacesOnUnix = allowSpacesOnUnix;
/*     */   }
/*     */   
/*     */   public ScriptProperty getValidationScript() {
/* 130 */     return this.validationScript;
/*     */   }
/*     */   
/*     */   public void setValidationScript(ScriptProperty validationScript) {
/* 134 */     this.validationScript = validationScript;
/*     */   }
/*     */   
/*     */   public boolean isManualEntryAllowed() {
/* 138 */     return this.manualEntryAllowed;
/*     */   }
/*     */   
/*     */   public void setManualEntryAllowed(boolean manualEntryAllowed) {
/* 142 */     this.manualEntryAllowed = manualEntryAllowed;
/*     */   }
/*     */   
/*     */   public boolean isCompact() {
/* 146 */     return this.compact;
/*     */   }
/*     */   
/*     */   public void setCompact(boolean compact) {
/* 150 */     this.compact = compact;
/*     */   }
/*     */   
/*     */   public void setStandardValidation(boolean standardValidation) {
/* 154 */     this.standardValidation = standardValidation;
/*     */   }
/*     */   
/*     */   public boolean isStandardValidation() {
/* 158 */     return this.standardValidation;
/*     */   }
/*     */   
/*     */   public boolean isCheckWritable() {
/* 162 */     return this.checkWritable;
/*     */   }
/*     */   
/*     */   public void setCheckWritable(boolean checkWritable) {
/* 166 */     this.checkWritable = checkWritable;
/*     */   }
/*     */   
/*     */   public void update() {
/* 170 */     init();
/* 171 */     if (this.lblSpace != null) {
/* 172 */       long minSize = this.designTime ? 0L : (long)(ContentInstaller.getInstance().getMinSize() * 1.1D);
/* 173 */       String spaceText = getSizeText(minSize);
/* 174 */       this.lblSpace.setText(spaceText);
/*     */     } 
/* 176 */     if (this.lblFreeSpace != null) {
/* 177 */       long freeSize = this.designTime ? 0L : SystemInfo.getFreeDiskSpace(this.directorySelector.getSelectedFile());
/* 178 */       String freeSpaceText = getSizeText(freeSize);
/* 179 */       this.lblFreeSpace.setText(freeSpaceText);
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getSizeText(long bytes) {
/* 184 */     if (bytes > 10737418240L) {
/* 185 */       return Messages.format(getMessage(".ComponentSize3"), new Object[] { getGB(bytes) });
/*     */     }
/* 187 */     return Messages.format(getMessage(".ComponentSize2"), new Object[] { getMB(bytes) });
/*     */   }
/*     */ 
/*     */   
/*     */   private void init() {
/* 192 */     if (!this.initialized && !this.designTime) {
/* 193 */       File initialParentFile; String str; File defaultDirectory = this.context.getInstallationDirectory();
/*     */       
/* 195 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */ 
/*     */       
/* 198 */       if (this.suggestAppDir && !config.isAddOnInstaller() && (
/* 199 */         !Util.isMacosInstaller() || !config.getMacSpecificConfig().isSingleBundle())) {
/*     */         
/* 201 */         initialParentFile = defaultDirectory.getParentFile();
/* 202 */         str = defaultDirectory.getName();
/*     */       } else {
/* 204 */         initialParentFile = defaultDirectory;
/* 205 */         str = null;
/*     */       } 
/*     */       
/* 208 */       if (initialParentFile == null) {
/* 209 */         initialParentFile = defaultDirectory;
/* 210 */         str = config.getApplicationName();
/*     */       } 
/*     */       
/* 213 */       this.directorySelector.initDirectory(initialParentFile, str);
/* 214 */       this.directorySelector.setNoStandardDirectoryNameForUpdate(true);
/* 215 */       this.directorySelector.setAllowSpacesOnUnix(this.allowSpacesOnUnix);
/* 216 */       this.directorySelector.setManualEntryAllowed(this.manualEntryAllowed);
/* 217 */       this.directorySelector.setStandardValidation(this.standardValidation);
/*     */       
/* 219 */       this.initialized = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void setupControls() {
/* 225 */     ensureDirectorySelectorCreated();
/* 226 */     this.directorySelector.activateNextScreenOnEnter(this.context.getWizardContext());
/* 227 */     this.directorySelector.addPropertyChangeListener("selectedPath", event -> update());
/*     */   }
/*     */ 
/*     */   
/*     */   private void ensureDirectorySelectorCreated() {
/* 232 */     if (this.directorySelector == null) {
/* 233 */       this.directorySelector = new DirectorySelector(this.compact ? null : getMessage(".ReadyMemoDir").replace(':', ' ').trim(), this.designTime);
/* 234 */       this.directorySelector.setInternalValidator(this);
/* 235 */       this.directorySelector.setValidator(this);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/* 240 */     setOpaque(false);
/* 241 */     setLayout(new GridBagLayout());
/* 242 */     GridBagConstraints gc = new GridBagConstraints();
/* 243 */     gc.gridx = gc.gridy = 0;
/* 244 */     if (this.showRequiredDiskSpace || this.showFreeDiskSpace) {
/* 245 */       gc.insets.bottom = 5;
/*     */     }
/*     */     
/* 248 */     gc.anchor = 21;
/* 249 */     gc.fill = 2;
/* 250 */     gc.weightx = 1.0D;
/* 251 */     gc.gridwidth = 3;
/* 252 */     add((Component)this.directorySelector, gc);
/*     */     
/* 254 */     gc.gridy++;
/* 255 */     gc.gridwidth = 1;
/* 256 */     gc.weightx = 0.0D;
/*     */     
/* 258 */     if (this.showRequiredDiskSpace) {
/* 259 */       this.lblSpace = addLabel(".RequiredDiskSpaceLabel", gc);
/*     */     }
/* 261 */     if (this.showFreeDiskSpace && (Util.isWindows() || Util.isMacOS() || Util.isLinux())) {
/* 262 */       this.lblFreeSpace = addLabel(".FreeDiskSpaceLabel", gc);
/*     */     }
/*     */     
/* 265 */     update();
/*     */   }
/*     */   
/*     */   private JLabel addLabel(String messageKey, GridBagConstraints gc) {
/* 269 */     JLabel valueLabel = new JLabel();
/* 270 */     gc.insets.right = 5;
/* 271 */     add(new JLabel(getMessage(messageKey)), gc);
/* 272 */     gc.insets.right = 0;
/* 273 */     gc.gridx = 1;
/* 274 */     gc.weightx = 0.0D;
/* 275 */     gc.fill = 0;
/* 276 */     gc.anchor = 22;
/* 277 */     add(valueLabel, gc);
/* 278 */     gc.anchor = 21;
/* 279 */     gc.fill = 2;
/* 280 */     gc.gridy++;
/* 281 */     gc.gridx = 0;
/* 282 */     gc.weightx = 0.0D;
/*     */     
/* 284 */     return valueLabel;
/*     */   }
/*     */   
/*     */   private String getMB(long sizeBytes) {
/* 288 */     return getFormattedSize(sizeBytes, 1048576L);
/*     */   }
/*     */   
/*     */   private String getGB(long sizeBytes) {
/* 292 */     return getFormattedSize(sizeBytes, 1073741824L);
/*     */   }
/*     */   private String getFormattedSize(double sizeBytes, long factor) {
/*     */     DecimalFormat decimalFormat;
/* 296 */     double size = sizeBytes / factor;
/* 297 */     if (size < 0.0D) {
/* 298 */       size = 0.0D;
/*     */     }
/*     */     
/* 301 */     if (size < 10.0D) {
/* 302 */       decimalFormat = new DecimalFormat("#,###,##0.0");
/*     */     } else {
/* 304 */       decimalFormat = new DecimalFormat("#,###,##0");
/*     */     } 
/* 306 */     return decimalFormat.format(size);
/*     */   }
/*     */   
/*     */   private String getMessage(String key) throws MissingResourceException {
/* 310 */     return Messages.getString(key);
/*     */   }
/*     */   
/*     */   public void setContext(Context context) {
/* 314 */     this.context = context;
/* 315 */     context.addInstallerEventListener(event -> {
/*     */           if (!this.context.isConsole() && !this.context.isUnattended() && event instanceof InstallerVariableEvent && Objects.equals(((InstallerVariableEvent)event).getVariableName(), "sys.installationDir")) {
/*     */             init();
/*     */             this.directorySelector.setDirectory(this.context.getInstallationDirectory());
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 325 */     this.formEnvironment = formEnvironment;
/*     */   }
/*     */ 
/*     */   
/*     */   public File validateInternally(File dir) {
/* 330 */     return ContentInstaller.validateInstallationDir(dir, this.validateApplicationId, this.checkFreeSpace, this.existingDirWarning, this.context.isUnattended(), false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isValidFile(File file) {
/* 335 */     if (this.validationScript != null) {
/*     */       Object[] arguments;
/* 337 */       if (this.formEnvironment != null) {
/* 338 */         arguments = new Object[] { file, this.formEnvironment };
/*     */       } else {
/* 340 */         arguments = new Object[] { file };
/*     */       } 
/* 342 */       return ContextImpl.getContextInt(this.context).runBooleanScript(this.validationScript.getValue(), this.bean, arguments);
/*     */     } 
/* 344 */     return true;
/*     */   }
/*     */   
/*     */   private File getSelectedDir() {
/* 348 */     init();
/* 349 */     return this.directorySelector.getSelectedFile();
/*     */   }
/*     */   
/*     */   public boolean handleUnattended() {
/* 353 */     File selectedDir = validateInternally(this.context.getInstallationDirectory());
/* 354 */     if (selectedDir == null || !InstallerUtil.checkWritableInstallationDirectory(selectedDir, true)) {
/* 355 */       Util.showMessage(Messages.getString(".DestinationDirHelp"), 1);
/* 356 */       return false;
/* 357 */     }  if (!Boolean.getBoolean("install4j.extraSilent") && !InstallerUtil.isUnattendedAlerts()) {
/* 358 */       Util.showMessage(Messages.format(Messages.getString(".UnattendedInstallationDir"), new Object[] { selectedDir }), 1);
/*     */     }
/* 360 */     if (this.context instanceof InstallerContext) {
/* 361 */       ((InstallerContext)this.context).setInstallationDirectory(selectedDir);
/*     */     }
/* 363 */     return true;
/*     */   }
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 367 */     ensureDirectorySelectorCreated();
/* 368 */     init();
/*     */     while (true) {
/* 370 */       String defaultDirectory = this.context.getInstallationDirectory().getAbsolutePath();
/*     */       
/* 372 */       String answer = console.askString(Messages.format(getMessage(".SelectDirDesc"), new Object[] { InstallerConfig.getCurrentInstance().getApplicationName() }), defaultDirectory);
/*     */       try {
/* 374 */         File selectedDir = (new File(answer)).getCanonicalFile();
/* 375 */         this.directorySelector.setSelectedFile(selectedDir);
/* 376 */         if (!(new File(answer)).isAbsolute() || (selectedDir.exists() && !selectedDir.isDirectory())) {
/* 377 */           console.println(Messages.format(getMessage(".InvalidDirectory"), new Object[] { answer })); continue;
/* 378 */         }  if (this.directorySelector.checkSelectedFile()) {
/* 379 */           selectedDir = this.directorySelector.getSelectedFile();
/* 380 */           if (selectedDir != null && InstallerUtil.checkWritableInstallationDirectory(selectedDir, true)) {
/* 381 */             if (this.context instanceof InstallerContext) {
/* 382 */               ((InstallerContext)this.context).setInstallationDirectory(selectedDir);
/*     */             }
/* 384 */             return true;
/*     */           } 
/*     */         } 
/* 387 */       } catch (IOException e) {
/* 388 */         console.println(Messages.format(getMessage(".InvalidDirectory"), new Object[] { answer }));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public DirectorySelector getDirectorySelector() {
/* 395 */     return this.directorySelector;
/*     */   }
/*     */   
/*     */   public void focusTextField() {
/* 399 */     this.directorySelector.focusTextField();
/*     */   }
/*     */   
/*     */   public boolean checkCompleted() {
/* 403 */     if (this.directorySelector.checkSelectedFile()) {
/* 404 */       File destDir = getSelectedDir();
/* 405 */       if (this.context instanceof InstallerContext) {
/* 406 */         ((InstallerContext)this.context).setInstallationDirectory(destDir);
/*     */       }
/* 408 */       return (!this.checkWritable || InstallerUtil.checkWritableInstallationDirectory(destDir, true));
/*     */     } 
/* 410 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getBaseline(int width, int height) {
/* 415 */     return this.directorySelector.getBaseline(width, height);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\components\InstallationDirectorySelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */