/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import java.awt.Window;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class VistaTaskDialog
/*    */ {
/*    */   public static final int TDF_ENABLE_HYPERLINKS = 1;
/*    */   public static final int TDF_USE_HICON_MAIN = 2;
/*    */   public static final int TDF_USE_HICON_FOOTER = 4;
/*    */   public static final int TDF_ALLOW_DIALOG_CANCELLATION = 8;
/*    */   public static final int TDF_USE_COMMAND_LINKS = 16;
/*    */   public static final int TDF_USE_COMMAND_LINKS_NO_ICON = 32;
/*    */   public static final int TDF_EXPAND_FOOTER_AREA = 64;
/*    */   public static final int TDF_EXPANDED_BY_DEFAULT = 128;
/*    */   public static final int TDF_VERIFICATION_FLAG_CHECKED = 256;
/*    */   public static final int TDF_SHOW_PROGRESS_BAR = 512;
/*    */   public static final int TDF_SHOW_MARQUEE_PROGRESS_BAR = 1024;
/*    */   public static final int TDF_CALLBACK_TIMER = 2048;
/*    */   public static final int TDF_POSITION_RELATIVE_TO_WINDOW = 4096;
/*    */   public static final int TDF_RTL_LAYOUT = 8192;
/*    */   public static final int TDF_NO_DEFAULT_RADIO_BUTTON = 16384;
/*    */   public static final int TDF_CAN_BE_MINIMIZED = 32768;
/*    */   public static final int TDF_SIZE_TO_CONTENT = 16777216;
/*    */   public static final int IDI_APPLICATION = 32512;
/*    */   public static final int IDI_ERROR = 32513;
/*    */   public static final int IDI_QUESTION = 32514;
/*    */   public static final int IDI_WARNING = 32515;
/*    */   public static final int IDI_INFORMATION = 32516;
/*    */   public static final int IDI_SHIELD = 32518;
/*    */   private static final int CANCEL = 1000;
/*    */   
/*    */   static {
/* 37 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Selection show(Window window, String title, String main, String content, int icon, String checkboxText, int defaultButton, int cancelButton, String[] buttons) {
/* 44 */     return show(window, title, main, content, 8, icon, 0, checkboxText, defaultButton, cancelButton, buttons);
/*    */   }
/*    */   
/*    */   public static Selection show(Window window, String title, String main, String content, int flags, int icon, int width, String checkboxText, int defaultButton, int cancelButton, String[] buttons) {
/* 48 */     int nativeReturn = show0(WinGuiHelper.getHwnd(window), title, main, content, flags, icon, width, checkboxText, buttons, defaultButton);
/* 49 */     Selection selection = new Selection();
/* 50 */     if (nativeReturn < 0) {
/* 51 */       nativeReturn = -nativeReturn;
/* 52 */       selection.checkboxSelected = true;
/*    */     } 
/* 54 */     if (nativeReturn == 1000) {
/* 55 */       selection.button = cancelButton;
/*    */     } else {
/* 57 */       selection.button = nativeReturn - 1;
/*    */     } 
/* 59 */     return selection;
/*    */   }
/*    */   
/*    */   public static int getFromOptionPaneType(int type) {
/* 63 */     switch (type) {
/*    */       case 0:
/* 65 */         return 32513;
/*    */       case 2:
/* 67 */         return 32515;
/*    */       case 3:
/* 69 */         return 32514;
/*    */     } 
/* 71 */     return 32516;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void initDependencies() {
/* 76 */     new Selection();
/* 77 */     init0();
/*    */   }
/*    */   private static native int show0(long paramLong, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, String paramString4, String[] paramArrayOfString, int paramInt4);
/*    */   private static native void init0();
/*    */   
/*    */   public static class Selection { private int button;
/*    */     
/*    */     public int getButton() {
/* 85 */       return this.button;
/*    */     }
/*    */     private boolean checkboxSelected;
/*    */     public boolean isCheckboxSelected() {
/* 89 */       return this.checkboxSelected;
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 94 */       return "Selection{button=" + this.button + ", checkboxSelected=" + this.checkboxSelected + '}';
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\VistaTaskDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */