/*    */ package com.exe4j.runtime.util;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedList;
/*    */ 
/*    */ public class ArgumentStack {
/*  7 */   private LinkedList<String> list = new LinkedList<String>();
/*    */   
/*    */   public ArgumentStack(String[] initVals) {
/* 10 */     Collections.addAll(this.list, initVals);
/*    */   }
/*    */   
/*    */   public String popString() {
/* 14 */     return this.list.removeFirst();
/*    */   }
/*    */   
/*    */   public boolean popBoolean() {
/* 18 */     return Boolean.parseBoolean(popString());
/*    */   }
/*    */   
/*    */   public int popInt() {
/*    */     try {
/* 23 */       return Integer.parseInt(popString());
/* 24 */     } catch (NumberFormatException e) {
/* 25 */       return 0;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] getStringArray() {
/* 31 */     int numArgs = this.list.size();
/* 32 */     String[] ret = new String[numArgs];
/* 33 */     for (int i = 0; i < numArgs; i++) {
/* 34 */       ret[i] = popString();
/*    */     }
/* 36 */     return ret;
/*    */   }
/*    */   
/*    */   public int size() {
/* 40 */     return this.list.size();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\ArgumentStack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */