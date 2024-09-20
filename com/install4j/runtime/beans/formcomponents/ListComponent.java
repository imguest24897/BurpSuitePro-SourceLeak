/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.event.ListSelectionEvent;
/*     */ 
/*     */ public class ListComponent extends AbstractListComponent implements ListSelectionListener {
/*  14 */   private int visibleRows = 4; private boolean fillVertical = false;
/*     */   private boolean scrollable = true;
/*     */   private boolean multiSelection = true;
/*     */   private JList<String> list;
/*     */   
/*     */   public int getVisibleRows() {
/*  20 */     return replaceWithTextOverride("visibleRows", this.visibleRows);
/*     */   }
/*     */   
/*     */   public void setVisibleRows(int visibleRows) {
/*  24 */     this.visibleRows = visibleRows;
/*     */   }
/*     */   
/*     */   public boolean isFillVertical() {
/*  28 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*     */   }
/*     */   
/*     */   public void setFillVertical(boolean fillVertical) {
/*  32 */     this.fillVertical = fillVertical;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFillCenterVertical() {
/*  37 */     return isFillVertical();
/*     */   }
/*     */   
/*     */   public boolean isScrollable() {
/*  41 */     return replaceWithTextOverride("scrollable", this.scrollable);
/*     */   }
/*     */   
/*     */   public void setScrollable(boolean scrollable) {
/*  45 */     this.scrollable = scrollable;
/*     */   }
/*     */   
/*     */   public boolean isMultiSelection() {
/*  49 */     return replaceWithTextOverride("multiSelection", this.multiSelection);
/*     */   }
/*     */   
/*     */   public void setMultiSelection(boolean multiSelection) {
/*  53 */     this.multiSelection = multiSelection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/*  60 */     super.setFormEnvironment(formEnvironment);
/*  61 */     if (this.list != null && formEnvironment != null) {
/*  62 */       this.list.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/*     */     int selectionMode;
/*  69 */     this.list = new JList<String>()
/*     */       {
/*     */         public Dimension getMinimumSize() {
/*  72 */           return getPreferredSize();
/*     */         }
/*     */       };
/*     */     
/*  76 */     this.list.setVisibleRowCount(getVisibleRows());
/*     */ 
/*     */     
/*  79 */     if (isMultiSelection()) {
/*  80 */       selectionMode = 2;
/*     */     } else {
/*  82 */       selectionMode = 0;
/*     */     } 
/*  84 */     this.list.setSelectionMode(selectionMode);
/*     */     
/*  86 */     if (isScrollable()) {
/*  87 */       JScrollPane scrollPane = new JScrollPane(this.list)
/*     */         {
/*     */           public Dimension getMinimumSize() {
/*  90 */             return getPreferredSize();
/*     */           }
/*     */         };
/*  93 */       scrollPane.setAlignmentX(0.0F);
/*  94 */       adjustMinimumSize(scrollPane.getViewport(), this.list);
/*  95 */       return scrollPane;
/*     */     } 
/*  97 */     this.list.setAlignmentX(0.0F);
/*  98 */     this.list.setBorder(BorderFactory.createEtchedBorder());
/*  99 */     adjustMinimumSize(this.list, this.list);
/* 100 */     return this.list;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 107 */     super.initialize();
/* 108 */     DefaultListModel<String> model = new DefaultListModel<>();
/* 109 */     String[] listEntries = getListEntries();
/* 110 */     for (String listEntry : listEntries) {
/* 111 */       model.addElement(listEntry);
/*     */     }
/* 113 */     this.list.setModel(model);
/* 114 */     this.list.removeListSelectionListener(this);
/* 115 */     initList(listEntries);
/* 116 */     this.list.addListSelectionListener(this);
/* 117 */     selectionChanged();
/*     */   }
/*     */   
/*     */   private void initList(String[] listEntries) {
/* 121 */     if (listEntries != null) {
/* 122 */       Object varValue = getContext().getVariable(getVariableName());
/* 123 */       if (varValue instanceof Integer) {
/* 124 */         int selIndex = ((Integer)varValue).intValue();
/* 125 */         if (selIndex < listEntries.length && selIndex >= 0) {
/* 126 */           this.list.setSelectedIndex(selIndex);
/*     */         }
/* 128 */       } else if (isMultiSelection() && varValue instanceof int[]) {
/* 129 */         int[] selIndices = (int[])varValue;
/*     */         
/* 131 */         boolean ok = true;
/* 132 */         for (int index : selIndices) {
/* 133 */           if (index >= listEntries.length || index < 0) {
/* 134 */             ok = false;
/*     */             break;
/*     */           } 
/*     */         } 
/* 138 */         if (ok) {
/* 139 */           this.list.setSelectedIndices(selIndices);
/*     */         }
/*     */       } else {
/* 142 */         int initiallySelectedIndex = getInitiallySelectedIndex();
/* 143 */         if (initiallySelectedIndex < listEntries.length) {
/* 144 */           this.list.setSelectedIndex(initiallySelectedIndex);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 152 */     return this.list;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/* 157 */     return JList.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*     */     Object value;
/* 163 */     if (isMultiSelection()) {
/* 164 */       value = this.list.getSelectedIndices();
/*     */     } else {
/* 166 */       value = Integer.valueOf(this.list.getSelectedIndex());
/*     */     } 
/* 168 */     getContext().setVariable(getVariableName(), value);
/* 169 */     getContext().registerResponseFileVariable(getVariableName());
/*     */     
/* 171 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isLeadingLabelTopAligned() {
/* 176 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean getInitialFillHorizontal() {
/* 181 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 187 */     String[] descriptions = new String[this.list.getModel().getSize()];
/* 188 */     for (int i = 0; i < descriptions.length; i++) {
/* 189 */       descriptions[i] = this.list.getModel().getElementAt(i);
/*     */     }
/*     */     
/* 192 */     if (isMultiSelection()) {
/* 193 */       int[] newValues = console.askMultipleSelection(getConsoleLabelText(false), descriptions, null, this.list.getSelectedIndices(), true);
/* 194 */       this.list.setSelectedIndices(newValues);
/*     */     } else {
/* 196 */       int newValue = console.askOption(getConsoleLabelText(false), descriptions, null, this.list.getSelectedIndex(), true, true);
/* 197 */       this.list.setSelectedIndex(newValue);
/*     */     } 
/* 199 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void valueChanged(ListSelectionEvent event) {
/* 204 */     if (event.getSource() == this.list) {
/* 205 */       selectionChanged();
/*     */     }
/*     */   }
/*     */   
/*     */   private void selectionChanged() {
/* 210 */     selectionChanged(this.list.getSelectedValue(), this.list.getSelectedIndex());
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ListComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */