/*   */ package com.install4j.runtime.installer;
/*   */ 
/*   */ import com.install4j.api.context.RemoteCallable;
/*   */ 
/*   */ public abstract class AbstractRemoteCallable
/*   */   implements RemoteCallable {
/*   */   public String toString() {
/* 8 */     String name = getClass().getName();
/* 9 */     return name.substring(name.lastIndexOf(".") + 1);
/*   */   }
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\AbstractRemoteCallable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */