/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.api.context.LauncherType;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ public class LauncherConfig
/*    */   extends AbstractNameAndIdConfig
/*    */ {
/* 14 */   private String file = "";
/*    */   private LauncherType type;
/*    */   private boolean excludeFromMenu;
/*    */   private boolean uninstaller;
/* 18 */   private String menuName = "";
/* 19 */   private String plistContent = "";
/* 20 */   private List<String> additionalStartFileEntries = new ArrayList<>();
/*    */   
/*    */   public String getFile() {
/* 23 */     return this.file;
/*    */   }
/*    */   
/*    */   public LauncherType getType() {
/* 27 */     return this.type;
/*    */   }
/*    */   
/*    */   public boolean isExcludeFromMenu() {
/* 31 */     return this.excludeFromMenu;
/*    */   }
/*    */   
/*    */   public String getMenuName() {
/* 35 */     return InstallerVariables.replaceVariables(this.menuName);
/*    */   }
/*    */   
/*    */   public String getPlistContent() {
/* 39 */     return this.plistContent;
/*    */   }
/*    */   
/*    */   public List<String> getAdditionalStartFileEntries() {
/* 43 */     return this.additionalStartFileEntries;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 48 */     super.read(element);
/*    */     
/* 50 */     this.menuName = readAttribute(element, "menuName", (String)null);
/* 51 */     if (this.menuName == null) {
/* 52 */       this.menuName = readAttribute(element, "name", (String)null);
/*    */     }
/*    */     
/* 55 */     this.file = readFileAttribute(element, "file");
/* 56 */     this.excludeFromMenu = readAttribute(element, "excludeFromMenu", this.excludeFromMenu);
/* 57 */     this.uninstaller = readAttribute(element, "uninstaller", this.uninstaller);
/* 58 */     this.plistContent = readAttribute(element, "plistContent", this.plistContent);
/*    */     
/* 60 */     this.plistContent = readAttribute(element, "plistContent", this.plistContent);
/*    */     
/* 62 */     readStringList(element, "startFileEntries", this.additionalStartFileEntries);
/*    */     
/* 64 */     String typeId = readAttribute(element, "type", "");
/* 65 */     if (Objects.equals(typeId, "console")) {
/* 66 */       this.type = LauncherType.CONSOLE;
/* 67 */     } else if (Objects.equals(typeId, "gui")) {
/* 68 */       this.type = LauncherType.GUI;
/* 69 */     } else if (Objects.equals(typeId, "service")) {
/* 70 */       this.type = LauncherType.SERVICE;
/* 71 */     } else if (Objects.equals(typeId, "external")) {
/* 72 */       this.type = LauncherType.EXTERNAL;
/* 73 */     } else if (Objects.equals(typeId, "installerApplication")) {
/* 74 */       this.type = LauncherType.INSTALLER_APPLICATION;
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean isUninstaller() {
/* 79 */     return this.uninstaller;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\LauncherConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */