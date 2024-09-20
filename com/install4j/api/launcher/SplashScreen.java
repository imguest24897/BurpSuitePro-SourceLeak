/*    */ package com.install4j.api.launcher;
/*    */ 
/*    */ import com.exe4j.runtime.splash.SplashEngine;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SplashScreen
/*    */ {
/*    */   public static void writeMessage(String message) throws ConnectionException {
/*    */     try {
/* 33 */       SplashEngine.writeMessage(message);
/* 34 */     } catch (Exception e) {
/* 35 */       throw new ConnectionException(e);
/* 36 */     } catch (Throwable throwable) {}
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void hide() throws ConnectionException {
/*    */     try {
/* 47 */       SplashEngine.hide();
/* 48 */     } catch (Exception e) {
/* 49 */       throw new ConnectionException(e);
/* 50 */     } catch (Throwable throwable) {}
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
/*    */   public static class ConnectionException
/*    */     extends Exception
/*    */   {
/*    */     private ConnectionException(Exception e) {
/* 66 */       super(e.getMessage());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\launcher\SplashScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */