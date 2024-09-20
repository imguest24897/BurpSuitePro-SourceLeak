/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.api.update.UpdateSchedule;
/*     */ import com.install4j.api.update.UpdateScheduleRegistry;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import java.awt.Component;
/*     */ import javax.swing.DefaultListCellRenderer;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JList;
/*     */ 
/*     */ public class UpdateScheduleSelectorComponent extends LeadingLabelComponent {
/*  15 */   private UpdateSchedule initialUpdateSchedule = UpdateSchedule.NEVER;
/*     */   
/*     */   private JComboBox<UpdateSchedule> comboBox;
/*     */   private static final String UPDATE_SCHEDULE_MESSAGE_PREFIX = "updateSchedule.";
/*     */   
/*     */   static {
/*  21 */     Messages.usedKeys(new String[] { "updateSchedule.start", "updateSchedule.daily", "updateSchedule.weekly", "updateSchedule.monthly", "updateSchedule.never" });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UpdateScheduleSelectorComponent() {
/*  31 */     setLabelText("${i18n:CheckForUpdatesLabel}");
/*     */   }
/*     */   
/*     */   public UpdateSchedule getInitialUpdateSchedule() {
/*  35 */     return (UpdateSchedule)replaceWithTextOverride("initialUpdateSchedule", this.initialUpdateSchedule, UpdateSchedule.class);
/*     */   }
/*     */   
/*     */   public void setInitialUpdateSchedule(UpdateSchedule initialUpdateSchedule) {
/*  39 */     this.initialUpdateSchedule = initialUpdateSchedule;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  44 */     super.setFormEnvironment(formEnvironment);
/*  45 */     if (this.comboBox != null && formEnvironment != null) {
/*  46 */       this.comboBox.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*  52 */     this.comboBox = new JComboBox<>(UpdateSchedule.values());
/*  53 */     this.comboBox.setRenderer(new DefaultListCellRenderer()
/*     */         {
/*     */           public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
/*  56 */             return super.getListCellRendererComponent(list, UpdateScheduleSelectorComponent.this.getContext().getMessage("updateSchedule." + ((UpdateSchedule)value).getId()), index, isSelected, cellHasFocus);
/*     */           }
/*     */         });
/*  59 */     this.comboBox.setAlignmentX(0.0F);
/*  60 */     return this.comboBox;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/*  65 */     super.initialize();
/*     */     
/*  67 */     UpdateSchedule updateSchedule = UpdateScheduleRegistry.getUpdateSchedule();
/*  68 */     if (updateSchedule == null) {
/*  69 */       updateSchedule = getInitialUpdateSchedule();
/*     */     }
/*     */     
/*  72 */     int index = 0;
/*  73 */     for (int i = 0; i < (UpdateSchedule.values()).length; i++) {
/*  74 */       if (UpdateSchedule.values()[i] == updateSchedule) {
/*  75 */         index = i;
/*     */       }
/*     */     } 
/*     */     
/*  79 */     this.comboBox.setSelectedIndex(index);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*  85 */     UpdateSchedule updateSchedule = (UpdateSchedule)this.comboBox.getSelectedItem();
/*  86 */     UpdateScheduleRegistry.setUpdateSchedule(updateSchedule);
/*  87 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterHorizontal() {
/*  92 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/*  97 */     return this.comboBox;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 102 */     return JComboBox.class;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 108 */     UpdateSchedule updateSchedule = (UpdateSchedule)this.comboBox.getSelectedItem();
/*     */     
/* 110 */     int optionCount = (UpdateSchedule.values()).length;
/* 111 */     String[] options = new String[optionCount];
/* 112 */     int selectedIndex = 0;
/* 113 */     for (int i = 0; i < optionCount; i++) {
/* 114 */       options[i] = getContext().getMessage("updateSchedule." + UpdateSchedule.values()[i].getId());
/* 115 */       if (UpdateSchedule.values()[i] == updateSchedule) {
/* 116 */         selectedIndex = i;
/*     */       }
/*     */     } 
/*     */     
/* 120 */     selectedIndex = console.askOption(getContext().getMessage(".CheckForUpdatesLabel"), options, null, selectedIndex, false, true);
/* 121 */     this.comboBox.setSelectedItem(UpdateSchedule.values()[selectedIndex]);
/*     */     
/* 123 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\UpdateScheduleSelectorComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */