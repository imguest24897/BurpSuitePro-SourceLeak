/*    */ package com.install4j.runtime.installer.platform.win32.wininet;
/*    */ 
/*    */ import java.net.PasswordAuthentication;
/*    */ import java.util.function.Supplier;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ public class WinInetAuthenticator
/*    */ {
/*    */   boolean showProxyUi;
/*    */   boolean showServerUi;
/*    */   final long hwnd;
/*    */   @NotNull
/*    */   Supplier<PasswordAuthentication> proxySupplier;
/*    */   @NotNull
/*    */   Supplier<PasswordAuthentication> serverSupplier;
/*    */   
/*    */   public WinInetAuthenticator(long hwnd) {
/* 19 */     this.hwnd = hwnd;
/* 20 */     this.showProxyUi = true;
/* 21 */     this.showServerUi = true;
/* 22 */     this.proxySupplier = (() -> null);
/* 23 */     this.serverSupplier = (() -> null);
/*    */   }
/*    */   
/*    */   public void setProxySupplier(@NotNull Supplier<PasswordAuthentication> proxySupplier) {
/* 27 */     this.proxySupplier = proxySupplier;
/* 28 */     this.showProxyUi = false;
/*    */   }
/*    */   
/*    */   public void setServerSupplier(@NotNull Supplier<PasswordAuthentication> serverSupplier) {
/* 32 */     this.serverSupplier = serverSupplier;
/* 33 */     this.showServerUi = false;
/*    */   }
/*    */   
/*    */   public boolean isShowUi(boolean proxyAuth) {
/* 37 */     return ((proxyAuth && this.showProxyUi) || (!proxyAuth && this.showServerUi));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\WinInetAuthenticator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */