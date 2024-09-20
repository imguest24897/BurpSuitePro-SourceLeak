/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.ejt.internal.i18n.XHTMLFragment;
/*    */ import com.ejt.internal.util.ToolTipHelpTextProvider;
/*    */ import com.ejt.internal.util.XMLEnum;
/*    */ 
/*    */ public enum MsiScope implements XMLEnum<MsiScope>, ToolTipHelpTextProvider {
/*  8 */   PER_MACHINE("Per machine", "perMachine", "Use this setting if your installer always requires elevated privileges, for example because you install a service.<p>Note that you have to add a \"Request privileges\" action to the \"Startup\" node of the installer.</p>"),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 14 */   PER_USER("Per user", "perUser", "Use this setting if your installer does not contain a \"Request privileges\" action."),
/*    */ 
/*    */   
/* 17 */   SELECTABLE("Selectable", "selectable", "Your installer can execute a \"Request privileges\" action conditionally.<p>In that case, unattended installations require an extra option <tt>ALLUSERS=1</tt> for per-machine installations.</p><p><b>This option is deprecated and hidden if it is not selected</b></p>");
/*    */ 
/*    */   
/*    */   private final String verbose;
/*    */ 
/*    */   
/*    */   private final String xmlValue;
/*    */   
/*    */   @XHTMLFragment
/*    */   private final String toolTipHelpText;
/*    */ 
/*    */   
/*    */   MsiScope(@XHTMLFragment String verbose, String xmlValue, String toolTipHelpText) {
/* 30 */     this.verbose = verbose;
/* 31 */     this.xmlValue = xmlValue;
/* 32 */     this.toolTipHelpText = toolTipHelpText;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getXMLValue() {
/* 37 */     return this.xmlValue;
/*    */   }
/*    */ 
/*    */   
/*    */   public MsiScope[] getXMLEnums() {
/* 42 */     return values();
/*    */   }
/*    */ 
/*    */   
/*    */   @XHTMLFragment
/*    */   public String getToolTipHelpText() {
/* 48 */     return this.toolTipHelpText;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\MsiScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */