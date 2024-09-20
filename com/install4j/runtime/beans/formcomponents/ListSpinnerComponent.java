/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.screens.Console;
/*    */ import java.util.Objects;
/*    */ import javax.swing.JSpinner;
/*    */ import javax.swing.SpinnerListModel;
/*    */ import javax.swing.SpinnerModel;
/*    */ 
/*    */ public class ListSpinnerComponent extends SpinnerComponent {
/*    */   private String[] listEntries;
/* 13 */   private int initiallySelectedIndex = 0;
/*    */   
/*    */   public String[] getListEntries() {
/* 16 */     return (String[])replaceWithTextOverride("listEntries", this.listEntries, String[].class);
/*    */   }
/*    */   
/*    */   public void setListEntries(String[] listEntries) {
/* 20 */     this.listEntries = listEntries;
/*    */   }
/*    */   
/*    */   public int getInitiallySelectedIndex() {
/* 24 */     return replaceWithTextOverride("initiallySelectedIndex", this.initiallySelectedIndex);
/*    */   }
/*    */   
/*    */   public void setInitiallySelectedIndex(int initiallySelectedIndex) {
/* 28 */     this.initiallySelectedIndex = initiallySelectedIndex;
/*    */   }
/*    */ 
/*    */   
/*    */   protected SpinnerModel createSpinnerModel() {
/* 33 */     SpinnerListModel model = new SpinnerListModel((Object[])getListEntries());
/* 34 */     initValue(model);
/* 35 */     return model;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void initValue(SpinnerModel model) {
/* 40 */     Context context = getContext();
/* 41 */     Object variableValue = (context == null) ? null : context.getVariable(getVariableName());
/* 42 */     int initValue = getInitiallySelectedIndex();
/* 43 */     if (variableValue instanceof String) {
/* 44 */       for (int i = 0; i < (getListEntries()).length; i++) {
/* 45 */         if (Objects.equals(variableValue, getListEntries()[i])) {
/* 46 */           initValue = i;
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     }
/* 51 */     if (initValue < (getListEntries()).length && initValue > 0) {
/* 52 */       model.setValue(getListEntries()[initValue]);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 58 */     JSpinner spinner = getSpinner();
/* 59 */     SpinnerListModel model = (SpinnerListModel)spinner.getModel();
/*    */     
/* 61 */     String[] descriptions = new String[model.getList().size()];
/*    */     
/* 63 */     int defaultValue = -1;
/* 64 */     for (int i = 0; i < model.getList().size(); i++) {
/* 65 */       descriptions[i] = (String)model.getList().get(i);
/* 66 */       if (Objects.equals(model.getValue(), descriptions[i])) {
/* 67 */         defaultValue = i;
/*    */       }
/*    */     } 
/*    */     
/* 71 */     int newValue = console.askOption(getConsoleLabelText(false), descriptions, null, defaultValue, false, false);
/* 72 */     spinner.getModel().setValue(model.getList().get(newValue));
/*    */     
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ListSpinnerComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */