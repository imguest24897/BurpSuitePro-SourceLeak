/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.actions.InstallFilesAction;
/*     */ import com.install4j.runtime.beans.actions.desktop.CreateFileAssociationAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import javax.swing.Box;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class FileAssociationsComponent extends ChecklistComponent<FileAssociationsComponent.SingleAssociationPanel> {
/*     */   public static final String VARIABLE_EXTENSIONS = "sys.fileAssociation.extensions";
/*     */   public static final String VARIABLE_LAUNCHERS = "sys.fileAssociation.launchers";
/*     */   private boolean showSelectionButtons = false;
/*  26 */   private VerticalDockingPosition selectionButtonPosition = VerticalDockingPosition.BOTTOM;
/*     */   
/*     */   public boolean isShowSelectionButtons() {
/*  29 */     return replaceWithTextOverride("showSelectionButtons", this.showSelectionButtons);
/*     */   }
/*     */   
/*     */   public void setShowSelectionButtons(boolean showSelectionButtons) {
/*  33 */     this.showSelectionButtons = showSelectionButtons;
/*     */   }
/*     */   
/*     */   public VerticalDockingPosition getSelectionButtonPosition() {
/*  37 */     return (VerticalDockingPosition)replaceWithTextOverride("selectionButtonPosition", this.selectionButtonPosition, VerticalDockingPosition.class);
/*     */   }
/*     */   
/*     */   public void setSelectionButtonPosition(VerticalDockingPosition selectionButtonPosition) {
/*  41 */     this.selectionButtonPosition = selectionButtonPosition;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void save() {
/*  46 */     super.save();
/*     */     
/*  48 */     List<String> extensions = new ArrayList<>();
/*  49 */     List<String> launchers = new ArrayList<>();
/*     */     
/*  51 */     for (SingleAssociationPanel singleAssociationPanel : getSingleCheckPanels()) {
/*  52 */       CreateFileAssociationAction associationAction = singleAssociationPanel.getAssociationAction();
/*  53 */       if (associationAction.isSelected()) {
/*  54 */         extensions.add(associationAction.getExtension());
/*  55 */         launchers.add(associationAction.getLauncherId());
/*     */       } 
/*     */     } 
/*     */     
/*  59 */     getContext().setVariable("sys.fileAssociation.extensions", extensions.toArray(new String[0]));
/*  60 */     getContext().registerResponseFileVariable("sys.fileAssociation.extensions");
/*  61 */     getContext().setVariable("sys.fileAssociation.launchers", launchers.toArray(new String[0]));
/*  62 */     getContext().registerResponseFileVariable("sys.fileAssociation.launchers");
/*     */   }
/*     */   
/*     */   private boolean isAssociationSelected(String extension, String launcherId, boolean defaultValue) {
/*  66 */     Object varExtensions = getContext().getVariable("sys.fileAssociation.extensions");
/*  67 */     Object varLaunchers = getContext().getVariable("sys.fileAssociation.launchers");
/*  68 */     if (varExtensions instanceof String[] && varLaunchers instanceof String[]) {
/*  69 */       String[] arrayExtensions = (String[])varExtensions;
/*  70 */       String[] arrayLauncher = (String[])varLaunchers;
/*  71 */       if (arrayExtensions.length == arrayLauncher.length) {
/*  72 */         for (int i = 0; i < arrayLauncher.length; i++) {
/*  73 */           if (Objects.equals(arrayLauncher[i], launcherId) && Objects.equals(arrayExtensions[i], extension)) {
/*  74 */             return true;
/*     */           }
/*     */         } 
/*  77 */         return false;
/*     */       } 
/*     */     } 
/*  80 */     return defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void addSingleChecks(JPanel checklistPanel, GridBagConstraints gc) {
/*  86 */     gc.insets.bottom = 3;
/*  87 */     List<CreateFileAssociationAction> associationActions = getCreateFileAssociationActions();
/*  88 */     for (CreateFileAssociationAction associationAction : associationActions) {
/*  89 */       SingleAssociationPanel singleAssociationPanel = new SingleAssociationPanel(associationAction);
/*  90 */       getSingleCheckPanels().add(singleAssociationPanel);
/*  91 */       gc.insets.bottom = 0;
/*  92 */       gc.insets.top = 3;
/*  93 */       checklistPanel.add(singleAssociationPanel, gc);
/*  94 */       gc.gridy++;
/*     */     } 
/*     */   }
/*     */   
/*     */   private List<CreateFileAssociationAction> getCreateFileAssociationActions() {
/*  99 */     if (getFormEnvironment().isDesignTime()) {
/* 100 */       return Arrays.asList(new CreateFileAssociationAction[] { createDesignTimeFileAssociationAction(1), createDesignTimeFileAssociationAction(2), createDesignTimeFileAssociationAction(3), createDesignTimeFileAssociationAction(2), createDesignTimeFileAssociationAction(3), createDesignTimeFileAssociationAction(2), createDesignTimeFileAssociationAction(3), createDesignTimeFileAssociationAction(2), createDesignTimeFileAssociationAction(3) });
/*     */     }
/* 102 */     return findAssociationActions(getContext(), getFormEnvironment().getScreen());
/*     */   }
/*     */ 
/*     */   
/*     */   private CreateFileAssociationAction createDesignTimeFileAssociationAction(int index) {
/* 107 */     CreateFileAssociationAction action = new CreateFileAssociationAction();
/* 108 */     action.setDescription("File association " + index);
/* 109 */     action.setExtension("ext" + index);
/* 110 */     return action;
/*     */   }
/*     */ 
/*     */   
/*     */   public static List<CreateFileAssociationAction> findAssociationActions(Context context, Screen screen) {
/* 115 */     ContextInt contextInt = ContextImpl.getContextInt(context);
/* 116 */     boolean installFilesFollows = (contextInt.getExecutableActionsStartingFrom(InstallFilesAction.class, screen).size() > 0);
/* 117 */     List<CreateFileAssociationAction> usedActions = new ArrayList<>();
/*     */     
/* 119 */     List<CreateFileAssociationAction> executableActions = contextInt.getExecutableActionsStartingFrom(CreateFileAssociationAction.class, screen);
/* 120 */     for (CreateFileAssociationAction action : executableActions) {
/* 121 */       if (installFilesFollows || action.fileExists(context)) {
/* 122 */         if (Util.isWindowsInstaller() && action.isWindows()) {
/* 123 */           usedActions.add(action); continue;
/* 124 */         }  if (Util.isUnixInstaller() && action.isUnix()) {
/* 125 */           usedActions.add(action);
/*     */         }
/*     */       } 
/*     */     } 
/* 129 */     return usedActions;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void buildPanel(JPanel panel, GridBagConstraints gc) {
/* 134 */     if (isShowSelectionButtons() && getSelectionButtonPosition() == VerticalDockingPosition.TOP) {
/* 135 */       addSelectionButtons(panel, gc);
/*     */     }
/* 137 */     super.buildPanel(panel, gc);
/* 138 */     if (isShowSelectionButtons() && getSelectionButtonPosition() == VerticalDockingPosition.BOTTOM) {
/* 139 */       addSelectionButtons(panel, gc);
/*     */     }
/*     */   }
/*     */   
/*     */   private void addSelectionButtons(JPanel panel, GridBagConstraints gc) {
/* 144 */     Box box = new Box(2);
/*     */     
/* 146 */     JButton selectAllButton = new JButton(Messages.getString(".SelectAll"));
/* 147 */     selectAllButton.addActionListener(e -> selectAllCheckboxes(true));
/* 148 */     box.add(selectAllButton);
/* 149 */     box.add(Box.createHorizontalStrut(5));
/*     */     
/* 151 */     JButton unselectAllButton = new JButton(Messages.getString(".SelectNone"));
/* 152 */     unselectAllButton.addActionListener(e -> selectAllCheckboxes(false));
/*     */     
/* 154 */     box.add(unselectAllButton);
/*     */     
/* 156 */     gc.weighty = 0.0D;
/* 157 */     gc.fill = 0;
/* 158 */     panel.add(box, gc);
/* 159 */     gc.gridy++;
/*     */   }
/*     */   
/*     */   private void selectAllCheckboxes(boolean select) {
/* 163 */     for (SingleAssociationPanel panel : getSingleCheckPanels())
/* 164 */       panel.chkSingle.setSelected(select); 
/*     */   }
/*     */   
/*     */   protected class SingleAssociationPanel
/*     */     extends ChecklistComponent.SingleCheckPanel
/*     */   {
/*     */     private CreateFileAssociationAction associationAction;
/*     */     
/*     */     public SingleAssociationPanel(CreateFileAssociationAction associationAction) {
/* 173 */       this.associationAction = associationAction;
/*     */       
/* 175 */       setLayout(new BorderLayout());
/*     */       
/* 177 */       StringBuilder extensionBuilder = new StringBuilder();
/* 178 */       String[] allExtensions = CreateFileAssociationAction.getExtensions(associationAction.getExtension());
/* 179 */       for (String extension : allExtensions) {
/* 180 */         if (extensionBuilder.length() > 0) {
/* 181 */           extensionBuilder.append(", ");
/*     */         }
/* 183 */         extensionBuilder.append("*.").append(extension);
/*     */       } 
/* 185 */       this
/*     */         
/* 187 */         .chkSingle = new JCheckBox(associationAction.getDescription() + " (" + extensionBuilder + ")", FileAssociationsComponent.this.isAssociationSelected(associationAction.getExtension(), associationAction.getLauncherId(), associationAction.isSelected()));
/*     */       
/* 189 */       add(this.chkSingle, "Before");
/*     */     }
/*     */ 
/*     */     
/*     */     public void save() {
/* 194 */       this.associationAction.setSelected(this.chkSingle.isSelected());
/*     */     }
/*     */     
/*     */     public CreateFileAssociationAction getAssociationAction() {
/* 198 */       return this.associationAction;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FileAssociationsComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */