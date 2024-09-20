/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*    */ import com.install4j.runtime.util.ExtendedResourceBundle;
/*    */ import java.util.Enumeration;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Vector;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class HelperResourceBundle extends ResourceBundle implements Serializable, ExtendedResourceBundle {
/* 17 */   private transient Map<String, Object> cache = new HashMap<>();
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Enumeration<String> getKeys() {
/* 22 */     return ((Vector<String>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Vector<String>>()
/*    */         {
/*    */           protected Vector<String> fetchValue(Context context) throws UserCanceledException {
/* 25 */             Vector<String> ret = new Vector<>();
/* 26 */             Enumeration<String> keys = Messages.getMessagesInternal().getKeys();
/* 27 */             while (keys.hasMoreElements()) {
/* 28 */               ret.add(keys.nextElement());
/*    */             }
/* 30 */             return ret;
/*    */           }
/* 32 */         })).elements();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean containsKeyDirectly(@NotNull final String key) {
/* 37 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 40 */             return Messages.containsKeyDirectly(key);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   protected Object handleGetObject(@NotNull final String key) {
/* 47 */     Object ret = this.cache.get(key);
/* 48 */     if (ret == null) {
/* 49 */       ret = HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<Object>()
/*    */           {
/*    */             protected Object fetchValue(Context context) throws UserCanceledException {
/* 52 */               return Messages.getMessagesInternal().getPlainMessages().getObject(key);
/*    */             }
/*    */           });
/* 55 */       this.cache.put(key, ret);
/*    */     } 
/* 57 */     return ret;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\HelperResourceBundle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */