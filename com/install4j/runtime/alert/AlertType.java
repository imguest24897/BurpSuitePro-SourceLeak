/*    */ package com.install4j.runtime.alert;
/*    */ 
/*    */ import com.install4j.runtime.util.AlertLafHelper;
/*    */ import com.install4j.runtime.util.IconHelper;
/*    */ import java.util.Locale;
/*    */ import javax.swing.Icon;
/*    */ import javax.swing.UIManager;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public enum AlertType
/*    */ {
/* 13 */   INFORMATION(1),
/* 14 */   QUESTION(3),
/* 15 */   WARNING(2),
/* 16 */   ERROR(0); private Icon icon;
/*    */   
/*    */   @NotNull
/*    */   public static AlertType fromOptionType(int optionType, @NotNull AlertType defaultValue) {
/* 20 */     AlertType alertType = fromOptionType(optionType);
/* 21 */     if (alertType != null) {
/* 22 */       return alertType;
/*    */     }
/* 24 */     return defaultValue;
/*    */   }
/*    */   private final int optionType;
/*    */   
/*    */   @Nullable
/*    */   public static AlertType fromOptionType(int optionType) {
/* 30 */     for (AlertType alertType : values()) {
/* 31 */       if (alertType.optionType == optionType) {
/* 32 */         return alertType;
/*    */       }
/*    */     } 
/* 35 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   AlertType(int optionType) {
/* 47 */     this.optionType = optionType;
/*    */   }
/*    */   
/*    */   public Icon getIcon() {
/* 51 */     if (this.icon == null)
/*    */     {
/* 53 */       this.icon = IconHelper.loadIcon("alert_" + ((AlertLafHelper.isUseWindowsIcons() || UIManager.getLookAndFeel().getID().toLowerCase().contains("win")) ? "windows_" : "") + name().toLowerCase(Locale.ENGLISH) + ".png");
/*    */     }
/* 55 */     return this.icon;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getOptionType() {
/* 60 */     return this.optionType;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\alert\AlertType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */