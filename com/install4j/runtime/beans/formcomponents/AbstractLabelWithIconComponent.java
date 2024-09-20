/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ import com.install4j.api.beans.ExternalFile;
/*    */ import com.install4j.runtime.util.HyperlinkLabel;
/*    */ import com.install4j.runtime.util.IconHelper;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import javax.swing.Icon;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ public abstract class AbstractLabelWithIconComponent extends AbstractLabelComponent {
/* 12 */   private ExternalFile labelIconFile = null;
/* 13 */   private int iconTextGap = 4;
/*    */   
/*    */   private JLabel label;
/*    */   
/*    */   public ExternalFile getLabelIconFile() {
/* 18 */     return (ExternalFile)replaceWithTextOverride("labelIconFile", this.labelIconFile, ExternalFile.class);
/*    */   }
/*    */   
/*    */   public void setLabelIconFile(ExternalFile labelIconFile) {
/* 22 */     this.labelIconFile = labelIconFile;
/*    */   }
/*    */   
/*    */   public int getIconTextGap() {
/* 26 */     return replaceWithTextOverride("iconTextGap", this.iconTextGap);
/*    */   }
/*    */   
/*    */   public void setIconTextGap(int iconTextGap) {
/* 30 */     this.iconTextGap = iconTextGap;
/*    */   }
/*    */ 
/*    */   
/*    */   public void initialize() {
/* 35 */     super.initialize();
/* 36 */     if (getLabelText().trim().length() > 0) {
/* 37 */       initializeLabel(this.label, getRawLabelText());
/*    */     }
/*    */   }
/*    */   
/*    */   protected JLabel createLabel() {
/* 42 */     return this.label = createLabel(getRawLabelText(), getLabelIconFile(), getIconTextGap(), getLabelColor(), getLabelFont(), getLabelFontType(), getLabelFontStyle(), getLabelFontSizePercent());
/*    */   }
/*    */   
/*    */   protected JLabel createLabel(String rawLabelText, ExternalFile labelIconFile, int iconTextGap, Color labelColor, Font labelFont, FontType fontType, FontStyle fontStyle, int fontSizePercent) {
/* 46 */     JLabel label = new JLabel();
/*    */     
/* 48 */     if (labelIconFile != null) {
/* 49 */       IconHelper.withIcon(labelIconFile, getContext(), icon -> {
/*    */             label.setIcon(icon);
/*    */             
/*    */             return null;
/*    */           });
/*    */     }
/* 55 */     label.setIconTextGap(iconTextGap);
/*    */     
/* 57 */     applyLabelColorAndFont(labelColor, labelFont, fontType, fontStyle, fontSizePercent, label);
/*    */     
/* 59 */     if (rawLabelText.trim().length() > 0) {
/* 60 */       initializeLabel(label, rawLabelText);
/*    */     }
/*    */     
/* 63 */     return label;
/*    */   }
/*    */   
/*    */   protected void initializeLabel(JLabel label, String rawLabelText) {
/* 67 */     getFormEnvironment().bindTextWithVariables(rawLabelText, label);
/*    */   }
/*    */   
/*    */   protected void initializeLinkLabel(HyperlinkLabel linkLabel, LinkLabelContainer linkLabelContainer) {
/* 71 */     linkLabel.setText(linkLabelContainer.getHyperlinkText());
/* 72 */     Color linkLabelColor = linkLabelContainer.getLinkLabelColor();
/* 73 */     if (linkLabelColor != null) {
/* 74 */       linkLabel.setPassiveColor(linkLabelColor);
/*    */     }
/* 76 */     Color linkLabelActiveColor = linkLabelContainer.getLinkLabelActiveColor();
/* 77 */     if (linkLabelActiveColor != null) {
/* 78 */       linkLabel.setActiveColor(linkLabelActiveColor);
/*    */     }
/* 80 */     applyFont(linkLabelContainer.getLinkLabelFont(), linkLabelContainer.getLinkLabelFontType(), linkLabelContainer.getLinkLabelFontStyle(), linkLabelContainer.getLinkLabelFontSizePercent(), (JComponent)linkLabel);
/*    */   }
/*    */   
/*    */   protected JLabel getLabel() {
/* 84 */     return this.label;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\AbstractLabelWithIconComponent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */