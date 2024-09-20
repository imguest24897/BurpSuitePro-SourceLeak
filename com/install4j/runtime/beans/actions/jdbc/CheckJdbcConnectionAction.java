/*    */ package com.install4j.runtime.beans.actions.jdbc;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class CheckJdbcConnectionAction extends AbstractJdbcAction {
/*  9 */   private String customCheckSql = ""; private boolean useCustomCheckSql = false;
/*    */   
/*    */   public boolean isUseCustomCheckSql() {
/* 12 */     return replaceWithTextOverride("useCustomCheckSql", this.useCustomCheckSql);
/*    */   }
/*    */   
/*    */   public void setUseCustomCheckSql(boolean useCustomCheckSql) {
/* 16 */     this.useCustomCheckSql = useCustomCheckSql;
/*    */   }
/*    */   
/*    */   public String getCustomCheckSql() {
/* 20 */     return replaceVariables(replaceVariables(this.customCheckSql));
/*    */   }
/*    */   
/*    */   public void setCustomCheckSql(String customCheckSql) {
/* 24 */     this.customCheckSql = customCheckSql;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean executeJdbcCall(Context context) throws UserCanceledException {
/* 29 */     return withResultSet(createTestQuery(), rs -> {
/*    */           boolean hasData = rs.next();
/*    */           if (hasData) {
/*    */             logSuccess("Test query succeeded");
/*    */           } else {
/*    */             logError("Test query did not succeed");
/*    */           } 
/*    */           return hasData;
/*    */         });
/*    */   }
/*    */   
/*    */   private String createTestQuery() {
/* 41 */     if (isUseCustomCheckSql())
/* 42 */       return getCustomCheckSql(); 
/* 43 */     if (getJdbcUrl().startsWith("jdbc:oracle:")) {
/* 44 */       return "select 1 from dual";
/*    */     }
/* 46 */     return "select 1";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 52 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\jdbc\CheckJdbcConnectionAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */