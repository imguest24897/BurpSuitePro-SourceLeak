/*   */ package com.install4j.runtime.launcher.service;
/*   */ 
/*   */ public interface UnixServiceHandler {
/* 4 */   public static final UnixServiceHandler INSTANCE = CommonHandler.getDefaultHandler();
/*   */   
/*   */   void setStop();
/*   */   
/*   */   void setStart();
/*   */   
/*   */   void reportStatus();
/*   */   
/*   */   boolean isService();
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\service\UnixServiceHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */