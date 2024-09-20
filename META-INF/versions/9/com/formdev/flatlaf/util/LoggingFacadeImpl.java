/*    */ package META-INF.versions.9.com.formdev.flatlaf.util;
/*    */ 
/*    */ import com.formdev.flatlaf.FlatLaf;
/*    */ import com.formdev.flatlaf.util.LoggingFacade;
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
/*    */ class LoggingFacadeImpl
/*    */   implements LoggingFacade
/*    */ {
/* 27 */   private static final System.Logger LOG = System.getLogger(FlatLaf.class.getName());
/*    */ 
/*    */   
/*    */   public void logSevere(String message, Throwable t) {
/* 31 */     LOG.log(System.Logger.Level.ERROR, message, t);
/*    */   }
/*    */ 
/*    */   
/*    */   public void logConfig(String message, Throwable t) {
/* 36 */     LOG.log(System.Logger.Level.DEBUG, message, t);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\com\formdev\flatla\\util\LoggingFacadeImpl.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */