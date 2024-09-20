/*     */ package com.install4j.runtime.installer.frontend;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.LanguageConfig;
/*     */ import com.install4j.runtime.installer.controller.ReturnToken;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.util.ButtonUtil;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.awt.Component;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class LanguageSelectionDialog extends CustomFrame implements ActionListener {
/*     */   private static final int FRAME_WIDTH = 350;
/*     */   private JComboBox<Object> cmbLanguage;
/*     */   private JButton btnOk;
/*     */   
/*     */   public LanguageSelectionDialog(ReturnToken returnToken) {
/*  35 */     this.returnToken = returnToken;
/*     */     
/*  37 */     LookAndFeelHelper.setLookAndFeel();
/*  38 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  39 */     String systemLanguageId = InstallerUtil.getSupportedSystemLanguageId();
/*  40 */     if (config.isLanguageSelectionInPrincipalLanguage() || systemLanguageId == null) {
/*  41 */       this.messages = Messages.createMessages(config.getLanguages().get(0));
/*     */     } else {
/*  43 */       this.messages = Messages.createMessages(config.getLanguageById(systemLanguageId));
/*     */     } 
/*     */     
/*  46 */     setupControls();
/*  47 */     setupComponent();
/*  48 */     setupEventHandlers();
/*     */   }
/*     */   private JButton btnCancel; private boolean canceled; private ReturnToken returnToken; private ResourceBundle messages;
/*     */   
/*     */   public void actionPerformed(ActionEvent event) {
/*  53 */     Object source = event.getSource();
/*  54 */     if (source == this.btnOk) {
/*  55 */       doOk();
/*  56 */     } else if (source == this.btnCancel) {
/*  57 */       doCancel();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setupControls() {
/*  62 */     List<LanguageConfig> languages = InstallerConfig.getCurrentInstance().getLanguages();
/*  63 */     Locale systemLocale = Locale.getDefault();
/*  64 */     LanguageConfig systemLanguage = InstallerConfig.getCurrentInstance().getLanguageById(systemLocale.toString());
/*  65 */     if (systemLanguage == null) {
/*  66 */       systemLanguage = InstallerConfig.getCurrentInstance().getLanguageById(systemLocale.getLanguage());
/*     */     }
/*  68 */     if (systemLanguage == null) {
/*  69 */       systemLanguage = languages.get(0);
/*     */     }
/*     */ 
/*     */     
/*  73 */     List<LanguageConfig> sortedLanguages = Messages.sortLanguages(languages, this.messages);
/*  74 */     this.cmbLanguage = new JComboBox(sortedLanguages.toArray());
/*  75 */     this.cmbLanguage.setSelectedItem(systemLanguage);
/*  76 */     this.cmbLanguage.setRenderer(new LanguageRenderer());
/*     */     
/*  78 */     this.btnOk = new JButton(this.messages.getString(".ButtonOK"));
/*  79 */     this.btnCancel = new JButton(this.messages.getString(".ButtonCancel"));
/*     */   }
/*     */   
/*     */   private String getLocalizedLanguageName(LanguageConfig value) {
/*  83 */     return Messages.getLocalizedLanguageName(value, this.messages);
/*     */   }
/*     */   
/*     */   private void setupComponent() {
/*     */     Icon icon32;
/*  88 */     IconHelper.setIconImages((Window)this);
/*  89 */     setTitle(this.messages.getString(".LanguageSelectionDialogTitle"));
/*     */     
/*  91 */     JPanel contentPane = new JPanel(new GridBagLayout());
/*  92 */     contentPane.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
/*  93 */     GridBagConstraints gc = new GridBagConstraints();
/*  94 */     gc.insets = new Insets(7, 7, 7, 7);
/*  95 */     gc.gridx = 0;
/*  96 */     gc.gridy = 0;
/*     */     
/*  98 */     gc.anchor = 10;
/*  99 */     gc.gridheight = 2;
/*     */ 
/*     */     
/* 102 */     Application currentApplication = InstallerConfig.getCurrentApplication();
/* 103 */     if (currentApplication.isUseCustomIcon()) {
/* 104 */       icon32 = get32By32Image(currentApplication.getCustomIconImageFiles());
/*     */     } else {
/* 106 */       icon32 = IconHelper.DEFAULT_ICON_FRAME_32;
/*     */     } 
/*     */     
/* 109 */     contentPane.add(new JLabel(icon32), gc);
/*     */     
/* 111 */     gc.gridx = 1;
/* 112 */     gc.gridheight = 1;
/* 113 */     gc.anchor = 21;
/* 114 */     contentPane.add(new JLabel(this.messages.getString(".LanguageSelectionLabel")), gc);
/* 115 */     gc.gridy = 1;
/* 116 */     gc.fill = 2;
/* 117 */     gc.weightx = 1.0D;
/* 118 */     contentPane.add(this.cmbLanguage, gc);
/*     */     
/* 120 */     Box box = ButtonUtil.createHorizontalButtonBox(new Component[] { this.btnOk, this.btnCancel }, 1);
/*     */     
/* 122 */     gc.gridx = 0;
/* 123 */     gc.gridy = 2;
/* 124 */     gc.gridwidth = 2;
/* 125 */     contentPane.add(box, gc);
/*     */     
/* 127 */     setContentPane(contentPane);
/* 128 */     setBackground(contentPane.getBackground());
/*     */     
/* 130 */     getRootPane().setDefaultButton(this.btnOk);
/* 131 */     setDefaultCloseOperation(0);
/* 132 */     pack();
/*     */     
/* 134 */     setBounds(getNewFrameBounds());
/* 135 */     setResizable(false);
/*     */   }
/*     */   
/*     */   private Icon get32By32Image(List<? extends File> imageFiles) {
/* 139 */     for (File imageFile : imageFiles) {
/* 140 */       Icon icon = IconHelper.loadIcon(imageFile);
/* 141 */       if (icon != null && icon.getIconWidth() == 32) {
/* 142 */         return icon;
/*     */       }
/*     */     } 
/*     */     
/* 146 */     return IconHelper.DEFAULT_ICON_FRAME_32;
/*     */   }
/*     */   
/*     */   private void setupEventHandlers() {
/* 150 */     this.btnOk.addActionListener(this);
/* 151 */     this.btnCancel.addActionListener(this);
/*     */     
/* 153 */     addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowClosing(WindowEvent event) {
/* 156 */             LanguageSelectionDialog.this.doCancel();
/*     */           }
/*     */         });
/*     */     
/* 160 */     KeyboardUtil.addAccelerator(1, this.btnCancel, (JComponent)
/*     */         
/* 162 */         getContentPane(), this, 27, 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int getFrameWidth() {
/* 171 */     return 350;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getFrameHeight() {
/* 176 */     return -1;
/*     */   }
/*     */   
/*     */   private void doCancel() {
/* 180 */     this.canceled = true;
/* 181 */     setVisible(false);
/*     */   }
/*     */   
/*     */   private void doOk() {
/* 185 */     setVisible(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVisible(boolean visible) {
/* 190 */     boolean wasVisible = isVisible();
/* 191 */     super.setVisible(visible);
/* 192 */     if (!visible) {
/* 193 */       this.returnToken.returnToController(getSelectedLanguageId());
/* 194 */       if (wasVisible) {
/* 195 */         dispose();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getSelectedLanguageId() {
/* 201 */     if (this.canceled) {
/* 202 */       return null;
/*     */     }
/* 204 */     LanguageConfig languageConfig = (LanguageConfig)this.cmbLanguage.getSelectedItem();
/* 205 */     if (languageConfig != null) {
/* 206 */       return languageConfig.getId();
/*     */     }
/* 208 */     return null;
/*     */   }
/*     */   
/*     */   private class LanguageRenderer
/*     */     extends DefaultListCellRenderer
/*     */   {
/*     */     private LanguageRenderer() {}
/*     */     
/*     */     public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
/* 217 */       if (value instanceof LanguageConfig) {
/* 218 */         value = LanguageSelectionDialog.this.getLocalizedLanguageName((LanguageConfig)value);
/*     */       }
/* 220 */       return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\LanguageSelectionDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */