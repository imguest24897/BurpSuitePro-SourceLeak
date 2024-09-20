/*    */ package com.install4j.api;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.apiimpl.SystemInfoImpl;
/*    */ import java.io.File;
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
/*    */ public class SystemInfo
/*    */ {
/*    */   public static long getFreeDiskSpace(File file) {
/* 20 */     return SystemInfoImpl.getFreeDiskSpace(file);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static long getPhysicalMemory() {
/* 28 */     return SystemInfoImpl.getPhysicalMemory();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\SystemInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */