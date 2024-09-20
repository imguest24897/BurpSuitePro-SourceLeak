/*    */ package com.install4j.api;
/*    */ 
/*    */ import com.install4j.api.laf.LookAndFeelEnhancer;
/*    */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*    */ import com.install4j.runtime.installer.frontend.LookAndFeelHelper;
/*    */ import java.awt.Window;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UiUtil
/*    */ {
/*    */   public static boolean isDarkDesktop() {
/* 29 */     return LookAndFeelHelper.isDarkDesktop();
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
/*    */   
/*    */   public static boolean isDarkUi() {
/* 42 */     return getLookAndFeelEnhancer().isDark();
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
/*    */   public static void setDarkUi(boolean dark) {
/* 54 */     LookAndFeelHelper.setDarkUi(dark);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static LookAndFeelEnhancer getLookAndFeelEnhancer() {
/* 62 */     return (LookAndFeelEnhancer)LookAndFeelHelper.getLookAndFeelHandler();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Window getParentWindow() {
/* 71 */     return GUIHelper.getParentWindow();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\UiUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */