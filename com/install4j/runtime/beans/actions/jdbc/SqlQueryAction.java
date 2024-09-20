/*    */ package com.install4j.runtime.beans.actions.jdbc;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.ResultSetMetaData;
/*    */ import java.sql.SQLException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ public class SqlQueryAction
/*    */   extends AbstractJdbcAction
/*    */ {
/* 15 */   private String sqlQuery = "";
/*    */   private boolean firstOnly = false;
/*    */   private boolean failIfNotFound = false;
/* 18 */   private String variableName = "";
/*    */   
/*    */   public String getSqlQuery() {
/* 21 */     return replaceVariables(replaceVariables(this.sqlQuery));
/*    */   }
/*    */   
/*    */   public void setSqlQuery(String sqlQuery) {
/* 25 */     this.sqlQuery = sqlQuery;
/*    */   }
/*    */   
/*    */   public boolean isFirstOnly() {
/* 29 */     return replaceWithTextOverride("firstOnly", this.firstOnly);
/*    */   }
/*    */   
/*    */   public void setFirstOnly(boolean firstOnly) {
/* 33 */     this.firstOnly = firstOnly;
/*    */   }
/*    */   
/*    */   public boolean isFailIfNotFound() {
/* 37 */     return replaceWithTextOverride("failIfNotFound", this.failIfNotFound);
/*    */   }
/*    */   
/*    */   public void setFailIfNotFound(boolean failIfNotFound) {
/* 41 */     this.failIfNotFound = failIfNotFound;
/*    */   }
/*    */   
/*    */   public String getVariableName() {
/* 45 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 49 */     this.variableName = variableName;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean executeJdbcCall(Context context) throws UserCanceledException {
/* 54 */     return withResultSet(getSqlQuery(), rs -> {
/*    */           if (!rs.next()) {
/*    */             if (isFailIfNotFound()) {
/*    */               logError("Query returned no results");
/*    */               return false;
/*    */             } 
/*    */             logSuccess("Query returned no results");
/*    */             context.setVariable(getVariableName(), isFirstOnly() ? null : Collections.emptyList());
/*    */             return true;
/*    */           } 
/*    */           if (isFirstOnly()) {
/*    */             context.setVariable(getVariableName(), createRowObject(rs));
/*    */           } else {
/*    */             List<Object> rowObjects = new ArrayList();
/*    */             while (true) {
/*    */               rowObjects.add(createRowObject(rs));
/*    */               if (!rs.next()) {
/*    */                 context.setVariable(getVariableName(), rowObjects);
/*    */                 return true;
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           return true;
/*    */         });
/*    */   }
/*    */   private Object createRowObject(ResultSet rs) throws SQLException {
/* 80 */     ResultSetMetaData metaData = rs.getMetaData();
/* 81 */     int columnCount = metaData.getColumnCount();
/* 82 */     if (columnCount == 1) {
/* 83 */       return rs.getObject(1);
/*    */     }
/* 85 */     List<Object> cellValues = new ArrayList();
/* 86 */     for (int i = 1; i <= columnCount; i++) {
/* 87 */       cellValues.add(rs.getObject(i));
/*    */     }
/* 89 */     return cellValues;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 95 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\jdbc\SqlQueryAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */