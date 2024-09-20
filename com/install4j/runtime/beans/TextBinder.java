/*     */ package com.install4j.runtime.beans;
/*     */ import com.install4j.api.beans.ReplacementMode;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerVariableEvent;
/*     */ import com.install4j.api.formcomponents.AbstractFormComponent;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.util.HtmlTextPane;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import com.install4j.runtime.util.ToolTipHelpLabel;
/*     */ import java.awt.Component;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.WeakHashMap;
/*     */ import javax.swing.JDialog;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.text.BadLocationException;
/*     */ import javax.swing.text.Document;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ public class TextBinder {
/*  28 */   private final Map<String, WeakHashMap<Component, String>> variableRegistry = new HashMap<>();
/*     */   
/*     */   public TextBinder() {
/*  31 */     Context context = ContextImpl.getCurrentContext();
/*  32 */     if (context != null) {
/*  33 */       context.addInstallerEventListener(event -> {
/*     */             if (event.getType() == EventType.VARIABLE_CHANGED) {
/*     */               String variableName = ((InstallerVariableEvent)event).getVariableName();
/*     */               processBindings("installer:" + variableName);
/*     */             } 
/*     */           });
/*     */     }
/*     */   }
/*     */   
/*     */   public void bind(String textWithVariables, Component componentWithText) {
/*  43 */     for (WeakHashMap<Component, String> componentToRawText : this.variableRegistry.values()) {
/*  44 */       componentToRawText.remove(componentWithText);
/*     */     }
/*  46 */     ArrayList<String> replacementRecording = new ArrayList<>();
/*  47 */     setReplacementRecording(replacementRecording);
/*     */     try {
/*  49 */       String replacedText = replaceVariables(textWithVariables);
/*  50 */       for (String variableNameWithPrefix : replacementRecording) {
/*  51 */         WeakHashMap<Component, String> componentToRawText = this.variableRegistry.computeIfAbsent(variableNameWithPrefix, k -> new WeakHashMap<>());
/*  52 */         componentToRawText.put(componentWithText, textWithVariables);
/*     */       } 
/*  54 */       setText(componentWithText, replacedText);
/*     */     } finally {
/*  56 */       setReplacementRecording(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected String replaceVariables(String text) {
/*  61 */     return InstallerVariables.replaceVariables(text, ReplacementMode.PLAIN, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE);
/*     */   }
/*     */   
/*     */   protected void setReplacementRecording(ArrayList<String> replacementRecording) {
/*  65 */     InstallerVariables.setReplacementRecording(replacementRecording);
/*     */   }
/*     */   
/*     */   protected void processBindings(String variableNameWithPrefix) {
/*  69 */     WeakHashMap<Component, String> componentToRawText = this.variableRegistry.get(variableNameWithPrefix);
/*  70 */     if (componentToRawText != null) {
/*  71 */       for (Map.Entry<Component, String> entry : componentToRawText.entrySet()) {
/*  72 */         Component component = entry.getKey();
/*  73 */         String replacedText = replaceVariables(entry.getValue());
/*  74 */         setText(component, replacedText);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void setText(Component component, String replacedText) {
/*  80 */     setTextNormalized(component, StringUtil.rtrim(replacedText.replace("\r", "")));
/*     */   }
/*     */   
/*     */   private void setTextNormalized(Component component, String replacedText) {
/*  84 */     GUIHelper.invokeOnEDT(() -> setTextEDT(component, replacedText));
/*     */   }
/*     */   
/*     */   private void setTextEDT(Component component, String replacedText) {
/*  88 */     if (component instanceof JTextComponent) {
/*  89 */       JTextComponent textComponent = (JTextComponent)component;
/*  90 */       String oldText = textComponent.getText();
/*  91 */       if (!oldText.isEmpty() && replacedText.startsWith(oldText)) {
/*     */         
/*     */         try {
/*  94 */           Document document = textComponent.getDocument();
/*  95 */           String appendedText = replacedText.substring(oldText.length());
/*  96 */           document.insertString(document.getLength(), appendedText, null);
/*  97 */         } catch (BadLocationException e) {
/*  98 */           e.printStackTrace();
/*     */         } 
/* 100 */       } else if (component instanceof HtmlTextPane) {
/* 101 */         HtmlTextPane htmlTextPane = (HtmlTextPane)component;
/* 102 */         htmlTextPane.updateText(replacedText);
/*     */       } else {
/* 104 */         textComponent.setText(replacedText);
/*     */       } 
/* 106 */     } else if (component instanceof ToolTipHelpLabel) {
/* 107 */       ((ToolTipHelpLabel)component).setToolTipText(replacedText);
/* 108 */     } else if (component instanceof JLabel) {
/* 109 */       String textWithoutMnemonics = AbstractFormComponent.getTextWithoutMnemonics(replacedText);
/* 110 */       JLabel label = (JLabel)component;
/* 111 */       label.setText(textWithoutMnemonics);
/* 112 */       int index = AbstractFormComponent.getMnemonicCharIndex(replacedText);
/* 113 */       if (index > -1) {
/* 114 */         label.setDisplayedMnemonic(textWithoutMnemonics.charAt(index));
/* 115 */         label.setDisplayedMnemonicIndex(index);
/*     */       } 
/* 117 */     } else if (component instanceof JFrame) {
/* 118 */       ((JFrame)component).setTitle(replacedText);
/* 119 */     } else if (component instanceof JDialog) {
/* 120 */       ((JDialog)component).setTitle(replacedText);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\TextBinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */