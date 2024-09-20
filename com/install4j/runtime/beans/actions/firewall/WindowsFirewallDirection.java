/*    */ package com.install4j.runtime.beans.actions.firewall;
/*    */ 
/*    */ import com.install4j.api.windows.WinFirewall;
/*    */ 
/*    */ public enum WindowsFirewallDirection {
/*  6 */   INCOMING("Incoming", WinFirewall.RuleDirection.INCOMING),
/*  7 */   OUTGOING("Outgoing", WinFirewall.RuleDirection.OUTGOING);
/*    */   
/*    */   private final String verbose;
/*    */   private final WinFirewall.RuleDirection ruleDirection;
/*    */   
/*    */   WindowsFirewallDirection(String verbose, WinFirewall.RuleDirection ruleDirection) {
/* 13 */     this.verbose = verbose;
/* 14 */     this.ruleDirection = ruleDirection;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public WinFirewall.RuleDirection getRuleDirection() {
/* 23 */     return this.ruleDirection;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\firewall\WindowsFirewallDirection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */