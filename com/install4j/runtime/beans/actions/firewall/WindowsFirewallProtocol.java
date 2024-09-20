/*    */ package com.install4j.runtime.beans.actions.firewall;
/*    */ 
/*    */ import com.install4j.api.windows.WinFirewall;
/*    */ 
/*    */ public enum WindowsFirewallProtocol {
/*  6 */   TCP("TCP", WinFirewall.NetworkProtocol.TCP),
/*  7 */   UDP("UDP", WinFirewall.NetworkProtocol.UDP);
/*    */   
/*    */   private final String verbose;
/*    */   private final WinFirewall.NetworkProtocol networkProtocol;
/*    */   
/*    */   WindowsFirewallProtocol(String verbose, WinFirewall.NetworkProtocol networkProtocol) {
/* 13 */     this.verbose = verbose;
/* 14 */     this.networkProtocol = networkProtocol;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public WinFirewall.NetworkProtocol getNetworkProtocol() {
/* 23 */     return this.networkProtocol;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\firewall\WindowsFirewallProtocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */