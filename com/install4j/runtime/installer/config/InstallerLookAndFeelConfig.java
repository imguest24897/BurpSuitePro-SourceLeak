/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.runtime.installer.config.laf.DarkModeStrategy;
/*    */ import com.install4j.runtime.installer.config.laf.FlatLafDarkTheme;
/*    */ import com.install4j.runtime.installer.config.laf.FlatLafLightTheme;
/*    */ import com.install4j.runtime.installer.config.laf.LookAndFeelType;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class InstallerLookAndFeelConfig
/*    */   extends AbstractConfig {
/* 11 */   private LookAndFeelType type = LookAndFeelType.NATIVE;
/* 12 */   private DarkModeStrategy darkModeStrategy = DarkModeStrategy.AUTO_DETECT;
/* 13 */   private FlatLafLightTheme lightTheme = FlatLafLightTheme.LIGHT_INTELLIJ;
/* 14 */   private FlatLafDarkTheme darkTheme = FlatLafDarkTheme.DARCULA;
/* 15 */   private String customLightThemeName = "";
/* 16 */   private String customDarkThemeName = "";
/*    */   
/* 18 */   private String lookAndFeelHandlerClassName = "";
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 22 */     this.type = readAttribute(element, "type", this.type);
/* 23 */     this.darkModeStrategy = readAttribute(element, "darkModeStrategy", this.darkModeStrategy);
/* 24 */     this.lightTheme = readAttribute(element, "lightTheme", this.lightTheme);
/* 25 */     this.darkTheme = readAttribute(element, "darkTheme", this.darkTheme);
/* 26 */     this.customLightThemeName = readAttribute(element, "customLightThemeName", this.customLightThemeName);
/* 27 */     this.customDarkThemeName = readAttribute(element, "customDarkThemeName", this.customDarkThemeName);
/* 28 */     this.lookAndFeelHandlerClassName = readAttribute(element, "lookAndFeelHandlerClassName", this.lookAndFeelHandlerClassName);
/*    */   }
/*    */   
/*    */   public LookAndFeelType getType() {
/* 32 */     return this.type;
/*    */   }
/*    */   
/*    */   public DarkModeStrategy getDarkModeStrategy() {
/* 36 */     return this.darkModeStrategy;
/*    */   }
/*    */   
/*    */   public FlatLafLightTheme getLightTheme() {
/* 40 */     return this.lightTheme;
/*    */   }
/*    */   
/*    */   public FlatLafDarkTheme getDarkTheme() {
/* 44 */     return this.darkTheme;
/*    */   }
/*    */   
/*    */   public String getCustomLightThemeName() {
/* 48 */     return this.customLightThemeName;
/*    */   }
/*    */   
/*    */   public String getCustomDarkThemeName() {
/* 52 */     return this.customDarkThemeName;
/*    */   }
/*    */   
/*    */   public String getLookAndFeelHandlerClassName() {
/* 56 */     return this.lookAndFeelHandlerClassName;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\InstallerLookAndFeelConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */