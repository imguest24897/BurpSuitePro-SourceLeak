/*    */ package com.install4j.runtime.installer.config.laf;
/*    */ 
/*    */ import com.ejt.internal.i18n.XHTMLFragment;
/*    */ import com.ejt.internal.util.ToolTipHelpTextProvider;
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum LookAndFeelType implements XMLEnum<LookAndFeelType>, ToolTipHelpTextProvider {
/*  8 */   CROSS_PLATFORM("crossPlatform", "FlatLaf cross platform Look and Feel", "The <a href=\"https://www.formdev.com/flatlaf/\">FlatLaf</a> cross platform Look and Feel is a modern Look and Feel that works well on all supported platforms and includes a dark mode.<p>Please consider starring it on <a href=\"https://github.com/JFormDesigner/FlatLaf\">GitHub</a> as a token of appreciation for the author.</p>"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 14 */   NATIVE("native", "Java native Look and Feel", "Java includes a native look and feel that resembles native UI for a specific version of the operating system."),
/*    */ 
/*    */ 
/*    */   
/* 18 */   CUSTOM("custom", "Look and feel from custom code", null);
/*    */   
/*    */   public static LookAndFeelType getByName(String name, LookAndFeelType defaultValue) {
/* 21 */     if (name != null) {
/* 22 */       for (LookAndFeelType lookAndFeelType : values()) {
/* 23 */         if (lookAndFeelType.xmlValue.equals(name)) {
/* 24 */           return lookAndFeelType;
/*    */         }
/*    */       } 
/*    */     }
/* 28 */     return defaultValue;
/*    */   }
/*    */   
/*    */   private final String xmlValue;
/*    */   private final String verbose;
/*    */   @XHTMLFragment
/*    */   private final String helpText;
/*    */   
/*    */   LookAndFeelType(@XHTMLFragment String xmlValue, String verbose, String helpText) {
/* 37 */     this.xmlValue = xmlValue;
/* 38 */     this.verbose = verbose;
/* 39 */     this.helpText = helpText;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getToolTipHelpText() {
/* 44 */     return this.helpText;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 49 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public LookAndFeelType[] getXMLEnums() {
/* 54 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 59 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\laf\LookAndFeelType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */