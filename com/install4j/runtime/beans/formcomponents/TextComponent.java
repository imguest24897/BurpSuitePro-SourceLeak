/*     */ package com.install4j.runtime.beans.formcomponents;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.formcomponents.FormComponent;
/*     */ import com.install4j.api.formcomponents.FormEnvironment;
/*     */ import com.install4j.api.screens.Console;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import javax.swing.InputVerifier;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ public abstract class TextComponent extends LeadingLabelComponent implements TextComponentUtil.InputVerifierParameterProvider {
/*  21 */   private String variableName = "";
/*  22 */   private String initialText = "";
/*     */   private Font textFont;
/*  24 */   private FontType textFontType = FontType.DEFAULT;
/*  25 */   private FontStyle textFontStyle = FontStyle.UNCHANGED;
/*  26 */   private int textFontSizePercent = 100;
/*     */   
/*     */   private ScriptProperty keyValidator;
/*     */   
/*     */   private ScriptProperty keyListener;
/*     */   
/*     */   private ScriptProperty inputVerifier;
/*     */   private boolean checkIfEmpty;
/*     */   private JTextComponent textComponent;
/*     */   
/*     */   public String getVariableName() {
/*  37 */     return replaceVariables(this.variableName);
/*     */   }
/*     */   
/*     */   public void setVariableName(String variableName) {
/*  41 */     this.variableName = variableName;
/*     */   }
/*     */   
/*     */   public String getInitialText() {
/*  45 */     return replaceVariables(replaceFormVariables(this.initialText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setInitialText(String initialText) {
/*  49 */     this.initialText = initialText;
/*     */   }
/*     */   
/*     */   public Font getTextFont() {
/*  53 */     return (Font)replaceWithTextOverride("textFont", this.textFont, Font.class);
/*     */   }
/*     */   
/*     */   public void setTextFont(Font textFont) {
/*  57 */     this.textFont = textFont;
/*     */   }
/*     */   
/*     */   public FontType getTextFontType() {
/*  61 */     return (FontType)replaceWithTextOverride("textFontType", this.textFontType, FontType.class);
/*     */   }
/*     */   
/*     */   public void setTextFontType(FontType textFontType) {
/*  65 */     this.textFontType = textFontType;
/*     */   }
/*     */   
/*     */   public FontStyle getTextFontStyle() {
/*  69 */     return (FontStyle)replaceWithTextOverride("textFontStyle", this.textFontStyle, FontStyle.class);
/*     */   }
/*     */   
/*     */   public void setTextFontStyle(FontStyle textFontStyle) {
/*  73 */     this.textFontStyle = textFontStyle;
/*     */   }
/*     */   
/*     */   public int getTextFontSizePercent() {
/*  77 */     return replaceWithTextOverride("textFontSizePercent", this.textFontSizePercent);
/*     */   }
/*     */   
/*     */   public void setTextFontSizePercent(int textFontSizePercent) {
/*  81 */     this.textFontSizePercent = textFontSizePercent;
/*     */   }
/*     */   
/*     */   public ScriptProperty getKeyValidator() {
/*  85 */     return (ScriptProperty)replaceWithTextOverride("keyValidator", this.keyValidator, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setKeyValidator(ScriptProperty keyValidator) {
/*  89 */     this.keyValidator = keyValidator;
/*     */   }
/*     */   
/*     */   public ScriptProperty getKeyListener() {
/*  93 */     return (ScriptProperty)replaceWithTextOverride("keyListener", this.keyListener, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setKeyListener(ScriptProperty keyListener) {
/*  97 */     this.keyListener = keyListener;
/*     */   }
/*     */   
/*     */   public ScriptProperty getInputVerifier() {
/* 101 */     return (ScriptProperty)replaceWithTextOverride("inputVerifier", this.inputVerifier, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setInputVerifier(ScriptProperty inputVerifier) {
/* 105 */     this.inputVerifier = inputVerifier;
/*     */   }
/*     */   
/*     */   public boolean isCheckIfEmpty() {
/* 109 */     return replaceWithTextOverride("checkIfEmpty", this.checkIfEmpty);
/*     */   }
/*     */   
/*     */   public void setCheckIfEmpty(boolean checkIfEmpty) {
/* 113 */     this.checkIfEmpty = checkIfEmpty;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initialize() {
/* 118 */     super.initialize();
/* 119 */     initText(this.textComponent);
/*     */   }
/*     */   
/*     */   protected void initText(JTextComponent textComponent) {
/* 123 */     Object initValue = getInitValue(getInitialText(), getVariableName(), Object.class);
/* 124 */     if (initValue != null) {
/* 125 */       textComponent.setText(initValue.toString());
/* 126 */       textComponent.setCaretPosition(0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 132 */     super.setFormEnvironment(formEnvironment);
/* 133 */     if (this.textComponent != null && formEnvironment != null) {
/* 134 */       this.textComponent.setName(formEnvironment.getId((FormComponent)this));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public JComponent createCenterComponent() {
/* 140 */     this.textComponent = createTextComponent();
/* 141 */     this.textComponent.addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyTyped(KeyEvent event) {
/* 144 */             TextComponent.this.dispatchToKeyValidator(event);
/*     */           }
/*     */ 
/*     */           
/*     */           public void keyReleased(KeyEvent event) {
/* 149 */             TextComponent.this.dispatchToKeyListener(event);
/*     */           }
/*     */         });
/* 152 */     TextComponentUtil.addInputVerifier(this, getInputVerifier(), this.textComponent, this);
/* 153 */     applyTextComponentProperties(this.textComponent);
/* 154 */     return this.textComponent;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] createInputVerifierParameters() {
/* 159 */     return new Object[] { getFormEnvironment(), this.textComponent.getText() };
/*     */   }
/*     */   
/*     */   protected JTextComponent getTextComponent() {
/* 163 */     return this.textComponent;
/*     */   }
/*     */   
/*     */   protected void applyTextComponentProperties(JTextComponent textComponent) {
/* 167 */     textComponent.setAlignmentX(0.0F);
/* 168 */     applyFont(getTextFont(), getTextFontType(), getTextFontStyle(), getTextFontSizePercent(), textComponent);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getConfigurationObject() {
/* 173 */     return this.textComponent;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkCompleted() {
/* 178 */     if (isCheckIfEmpty() && this.textComponent.isVisible() && this.textComponent.isEnabled() && 
/* 179 */       getTextValue().length() == 0) {
/* 180 */       getFormEnvironment().makeParentGroupVisible((FormComponent)this);
/* 181 */       this.textComponent.requestFocus();
/* 182 */       GUIHelper.showMessage(this.textComponent, Messages.getString(".TextfieldEmptyWarning"), 2);
/* 183 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 188 */     InputVerifier inputVerifier = this.textComponent.getInputVerifier();
/* 189 */     if (isVisible() && isEnabled() && inputVerifier != null && !inputVerifier.verify(this.textComponent)) {
/* 190 */       if (!InstallerUtil.isUnattended() && !InstallerUtil.isConsole()) {
/* 191 */         SwingUtilities.invokeLater(() -> {
/*     */               getFormEnvironment().makeParentGroupVisible((FormComponent)this);
/*     */               this.textComponent.requestFocus();
/*     */             });
/*     */       }
/* 196 */       return false;
/*     */     } 
/*     */     
/* 199 */     String variableName = getVariableName();
/* 200 */     if (!variableName.isEmpty()) {
/* 201 */       getContext().setVariable(variableName, getValue());
/* 202 */       if (isRegisterResponseFileVariable()) {
/* 203 */         getContext().registerResponseFileVariable(variableName);
/*     */       }
/*     */     } 
/* 206 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean isRegisterResponseFileVariable() {
/* 210 */     return true;
/*     */   }
/*     */   
/*     */   protected Object getValue() {
/* 214 */     return getTextValue();
/*     */   }
/*     */   
/*     */   protected String getTextValue() {
/* 218 */     return this.textComponent.getText().trim();
/*     */   }
/*     */   
/*     */   protected void dispatchToKeyValidator(KeyEvent event) {
/* 222 */     if (getKeyValidator() != null) {
/*     */       try {
/* 224 */         Boolean result = (Boolean)getContext().runScript(getKeyValidator(), (Bean)this, new Object[] {
/* 225 */               getFormEnvironment(), 
/* 226 */               Character.valueOf(event.getKeyChar()), this.textComponent
/* 227 */               .getText(), 
/* 228 */               Integer.valueOf(this.textComponent.getCaretPosition()) });
/* 229 */         if (result != null && !result.booleanValue()) {
/* 230 */           event.consume();
/*     */         }
/* 232 */       } catch (Exception e) {
/* 233 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   protected void dispatchToKeyListener(KeyEvent event) {
/* 239 */     if (getKeyListener() != null) {
/*     */       try {
/* 241 */         getContext().runScript(getKeyListener(), (Bean)this, new Object[] {
/* 242 */               getFormEnvironment(), 
/* 243 */               Character.valueOf(event.getKeyChar()), 
/* 244 */               Integer.valueOf(event.getKeyCode()), this.textComponent
/* 245 */               .getText(), 
/* 246 */               Integer.valueOf(this.textComponent.getCaretPosition()) });
/* 247 */       } catch (Exception e) {
/* 248 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean handleConsole(Console console) throws UserCanceledException {
/* 255 */     JTextComponent textField = getTextComponent();
/* 256 */     InputVerifier inputVerifier = textField.getInputVerifier();
/* 257 */     String oldValue = textField.getText();
/*     */     do {
/* 259 */       textField.setText(oldValue);
/* 260 */       String labelText = getConsoleLabelText(false);
/* 261 */       String newValue = askString(console, oldValue, labelText);
/* 262 */       textField.setText(newValue);
/* 263 */     } while (inputVerifier != null && !inputVerifier.verify(textField));
/*     */     
/* 265 */     return true;
/*     */   }
/*     */   
/*     */   protected String askString(Console console, String oldValue, String labelText) throws UserCanceledException {
/* 269 */     return console.askString(labelText, oldValue);
/*     */   }
/*     */   
/*     */   protected abstract JTextComponent createTextComponent();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\TextComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */