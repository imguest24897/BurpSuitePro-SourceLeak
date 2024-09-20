/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.formcomponents.AbstractFormComponent;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.api.formcomponents.LayoutGroup;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.awt.EventQueue;
/*    */ import java.util.LinkedList;
/*    */ import java.util.ListIterator;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class CoupledComponentsUtil
/*    */ {
/* 16 */   private static LinkedList<FormComponent> couplingStack = new LinkedList<>();
/*    */   
/*    */   public static void migrateCoupledIds(CoupledComponentsHolder couplesComponentsHolder, Map<String, String> oldItToNewId) {
/* 19 */     ListIterator<String> it = couplesComponentsHolder.getCoupledComponentIds().listIterator();
/* 20 */     while (it.hasNext()) {
/* 21 */       String oldId = it.next();
/* 22 */       String newId = oldItToNewId.get(oldId);
/* 23 */       if (newId == null) {
/* 24 */         it.remove(); continue;
/*    */       } 
/* 26 */       it.set(newId);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void enableCoupledComponents(CoupledComponentsHolder coupledComponentsHolder) {
/* 32 */     if (!EventQueue.isDispatchThread()) {
/* 33 */       EventQueue.invokeLater(() -> enableCoupledComponentsUnguarded(coupledComponentsHolder));
/*    */     } else {
/* 35 */       enableCoupledComponentsUnguarded(coupledComponentsHolder);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static void enableCoupledComponentsUnguarded(CoupledComponentsHolder coupledComponentsHolder) {
/* 40 */     AbstractFormComponent coupledComponentsHolderComponent = (AbstractFormComponent)coupledComponentsHolder;
/* 41 */     if (couplingStack.contains(coupledComponentsHolderComponent)) {
/* 42 */       reportCyclicCoupling(coupledComponentsHolderComponent);
/*    */     } else {
/* 44 */       couplingStack.push(coupledComponentsHolderComponent);
/*    */       try {
/* 46 */         Boolean enabled = coupledComponentsHolder.isEnableCoupledComponents();
/* 47 */         if (enabled == null) {
/*    */           return;
/*    */         }
/* 50 */         if (!coupledComponentsHolder.isEnabled()) {
/* 51 */           enabled = Boolean.FALSE;
/* 52 */         } else if (coupledComponentsHolder.isInverseCoupling()) {
/* 53 */           enabled = enabled.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
/*    */         } 
/* 55 */         for (String id : coupledComponentsHolder.getCoupledComponentIds()) {
/* 56 */           FormEnvironment formEnvironment = coupledComponentsHolderComponent.getFormEnvironment();
/* 57 */           FormComponent formComponent = formEnvironment.getFormComponentById(id);
/* 58 */           if (formComponent != null) {
/* 59 */             formComponent.setEnabled(enabled.booleanValue()); continue;
/*    */           } 
/* 61 */           LayoutGroup layoutGroup = formEnvironment.getLayoutGroupById(id);
/* 62 */           if (layoutGroup != null) {
/* 63 */             layoutGroup.setEnabled(enabled.booleanValue());
/*    */           }
/*    */         } 
/*    */       } finally {
/*    */         
/* 68 */         couplingStack.pop();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static void reportCyclicCoupling(AbstractFormComponent coupledComponentsHolderComponent) {
/* 74 */     couplingStack.push(coupledComponentsHolderComponent);
/*    */     try {
/* 76 */       FormEnvironment formEnvironment = coupledComponentsHolderComponent.getFormEnvironment();
/* 77 */       StringBuilder message = new StringBuilder();
/* 78 */       message.append("Cyclic form component coupling has been detected: [");
/* 79 */       boolean first = true;
/* 80 */       for (FormComponent formComponent : couplingStack) {
/* 81 */         if (first) {
/* 82 */           first = false;
/*    */         } else {
/* 84 */           message.append(", ");
/*    */         } 
/* 86 */         message.append("ID ").append(formEnvironment.getId(formComponent));
/*    */       } 
/* 88 */       message.append(", ...]");
/* 89 */       Logger.getInstance().log(null, message.toString(), false);
/*    */     } finally {
/* 91 */       couplingStack.pop();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\CoupledComponentsUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */