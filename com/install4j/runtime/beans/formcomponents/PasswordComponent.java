/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerVariableEvent;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.util.Base64;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.Objects;
/*     */ import javax.swing.Icon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ public class PasswordComponent
/*     */   extends TextfieldComponent {
/*     */   private static final String ENCODING = "UTF-8";
/*     */   private boolean writeToResponseFile = false;
/*     */   
/*     */   public boolean isEyeVisible() {
/*  28 */     return replaceWithTextOverride("eyeVisible", this.eyeVisible);
/*     */   }
/*     */   private CustomPasswordField passwordField; private boolean eyeVisible = false;
/*     */   public void setEyeVisible(boolean eyeVisible) {
/*  32 */     this.eyeVisible = eyeVisible;
/*     */   }
/*     */ 
/*     */   
/*     */   protected JTextComponent createTextComponent() {
/*  37 */     this.passwordField = new CustomPasswordField();
/*  38 */     applyTextFieldProperties(this.passwordField);
/*  39 */     this.passwordField.setEyeVisible(isEyeVisible());
/*  40 */     return this.passwordField;
/*     */   }
/*     */   
/*     */   public boolean isWriteToResponseFile() {
/*  44 */     return replaceWithTextOverride("writeToResponseFile", this.writeToResponseFile);
/*     */   }
/*     */   
/*     */   public void setWriteToResponseFile(boolean writeToResponseFile) {
/*  48 */     this.writeToResponseFile = writeToResponseFile;
/*     */   }
/*     */ 
/*     */   
/*     */   public Class getConfigurationObjectClass() {
/*  53 */     return JPasswordField.class;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContext(Context context) {
/*  58 */     super.setContext(context);
/*  59 */     if (context != null) {
/*  60 */       decodeVariable();
/*  61 */       context.addInstallerEventListener(event -> {
/*     */             if (event.getType() == EventType.VARIABLE_CHANGED && Objects.equals(((InstallerVariableEvent)event).getVariableName(), getEncodedVariableName())) {
/*     */               decodeVariable();
/*     */             }
/*     */           });
/*     */     } 
/*     */   }
/*     */   
/*     */   private void decodeVariable() {
/*  70 */     String initValue = (String)getInitValue(null, getEncodedVariableName(), String.class);
/*  71 */     if (initValue != null) {
/*  72 */       Context context = getContext();
/*  73 */       String value = decodeValue(initValue);
/*  74 */       if (value != null) {
/*  75 */         String variableName = getVariableName();
/*  76 */         context.registerHiddenVariable(variableName);
/*  77 */         context.setVariable(variableName, value);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/*  85 */     if (!super.checkCompleted()) {
/*  86 */       return false;
/*     */     }
/*     */     
/*  89 */     if (isWriteToResponseFile()) {
/*  90 */       String encodedVariableName = getEncodedVariableName();
/*     */       try {
/*  92 */         byte[] bytes = getValue().toString().getBytes("UTF-8");
/*  93 */         for (int i = 0; i < bytes.length; i++) {
/*  94 */           bytes[i] = (byte)(255 - bytes[i]);
/*     */         }
/*  96 */         getContext().setVariable(encodedVariableName, Base64.encode(bytes));
/*  97 */       } catch (UnsupportedEncodingException e) {
/*  98 */         e.printStackTrace();
/*     */       } 
/* 100 */       getContext().registerResponseFileVariable(encodedVariableName);
/*     */     } 
/*     */     
/* 103 */     return true;
/*     */   }
/*     */   
/*     */   private String getEncodedVariableName() {
/* 107 */     return getVariableName() + ".encoded";
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isRegisterResponseFileVariable() {
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void initText(JTextComponent textComponent) {
/* 117 */     super.initText(textComponent);
/*     */     
/* 119 */     getContext().registerHiddenVariable(getVariableName());
/* 120 */     String initValue = (String)getInitValue(null, getEncodedVariableName(), String.class);
/* 121 */     if (initValue != null) {
/* 122 */       String decodedValue = decodeValue(initValue);
/* 123 */       if (decodedValue != null) {
/* 124 */         textComponent.setText(decodedValue);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private String decodeValue(String initValue) {
/*     */     try {
/* 131 */       byte[] bytes = Base64.decode(initValue);
/* 132 */       for (int i = 0; i < bytes.length; i++) {
/* 133 */         bytes[i] = (byte)(255 - bytes[i]);
/*     */       }
/* 135 */       return new String(bytes, "UTF-8");
/* 136 */     } catch (Exception e) {
/* 137 */       e.printStackTrace();
/* 138 */       return null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object getValue() {
/* 144 */     return getTextComponent().getText();
/*     */   }
/*     */ 
/*     */   
/*     */   protected String askString(Console console, String oldValue, String labelText) throws UserCanceledException {
/* 149 */     return console.askPassword(labelText, oldValue);
/*     */   }
/*     */   
/*     */   public static class CustomPasswordField
/*     */     extends JPasswordField {
/* 154 */     public static final Icon ICON_EYE_16 = IconHelper.loadIcon("eye_16.png");
/*     */     
/*     */     private JLabel lblEye;
/*     */     
/*     */     public void setEyeVisible(boolean visible) {
/* 159 */       this.lblEye.setVisible(visible);
/*     */     }
/*     */     
/*     */     public CustomPasswordField() {
/* 163 */       setLayout(new BorderLayout());
/*     */       
/* 165 */       this.lblEye = new JLabel(ICON_EYE_16);
/* 166 */       this.lblEye.setVisible(false);
/* 167 */       add(this.lblEye, "East");
/*     */       
/* 169 */       this.lblEye.addMouseListener(new MouseAdapter()
/*     */           {
/*     */             public void mousePressed(MouseEvent me) {
/* 172 */               PasswordComponent.CustomPasswordField.this.setEchoChar(false);
/*     */             }
/*     */ 
/*     */             
/*     */             public void mouseReleased(MouseEvent me) {
/* 177 */               PasswordComponent.CustomPasswordField.this.setEchoChar((new JPasswordField()).getEchoChar());
/*     */             }
/*     */ 
/*     */             
/*     */             public void mouseEntered(MouseEvent me) {
/* 182 */               PasswordComponent.CustomPasswordField.this.setCursor(new Cursor(12));
/*     */             }
/*     */ 
/*     */             
/*     */             public void mouseExited(MouseEvent me) {
/* 187 */               PasswordComponent.CustomPasswordField.this.setCursor(new Cursor(0));
/*     */             }
/*     */           });
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\PasswordComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */