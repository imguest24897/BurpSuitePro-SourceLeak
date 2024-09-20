/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.util.Collections;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LegacyUninstallerBeanConfig
/*    */   extends ApplicationBeanConfig
/*    */ {
/*    */   public LegacyUninstallerBeanConfig(Element generalElement) {
/* 14 */     if (generalElement != null) {
/* 15 */       this.instance.setFrameWidth(readAttribute(generalElement, "windowWidth", this.instance.getFrameWidth()));
/* 16 */       this.instance.setFrameHeight(readAttribute(generalElement, "windowHeight", this.instance.getFrameHeight()));
/* 17 */       this.instance.setResizable(readAttribute(generalElement, "resizable", this.instance.isResizable()));
/* 18 */       this.instance.setAllowConsole(readAttribute(generalElement, "allowConsole", InstallerUtil.isAllowConsole(this.instance)));
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 24 */     this.id = "uninstaller";
/* 25 */     this.screenConfigs = Collections.unmodifiableList(readScreenConfigs(element));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\LegacyUninstallerBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */