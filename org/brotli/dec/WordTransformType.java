/*    */ package org.brotli.dec;
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
/*    */ final class WordTransformType
/*    */ {
/*    */   static final int IDENTITY = 0;
/*    */   static final int OMIT_LAST_1 = 1;
/*    */   static final int OMIT_LAST_2 = 2;
/*    */   static final int OMIT_LAST_3 = 3;
/*    */   static final int OMIT_LAST_4 = 4;
/*    */   static final int OMIT_LAST_5 = 5;
/*    */   static final int OMIT_LAST_6 = 6;
/*    */   static final int OMIT_LAST_7 = 7;
/*    */   static final int OMIT_LAST_8 = 8;
/*    */   static final int OMIT_LAST_9 = 9;
/*    */   static final int UPPERCASE_FIRST = 10;
/*    */   static final int UPPERCASE_ALL = 11;
/*    */   static final int OMIT_FIRST_1 = 12;
/*    */   static final int OMIT_FIRST_2 = 13;
/*    */   static final int OMIT_FIRST_3 = 14;
/*    */   static final int OMIT_FIRST_4 = 15;
/*    */   static final int OMIT_FIRST_5 = 16;
/*    */   static final int OMIT_FIRST_6 = 17;
/*    */   static final int OMIT_FIRST_7 = 18;
/*    */   static final int OMIT_FIRST_8 = 19;
/*    */   static final int OMIT_FIRST_9 = 20;
/*    */   
/*    */   static int getOmitFirst(int type) {
/* 39 */     return (type >= 12) ? (type - 12 + 1) : 0;
/*    */   }
/*    */   
/*    */   static int getOmitLast(int type) {
/* 43 */     return (type <= 9) ? (type - 1 + 1) : 0;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\WordTransformType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */