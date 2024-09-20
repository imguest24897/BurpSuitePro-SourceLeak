/*     */ package com.install4j.api.windows;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum SpecialFolder
/*     */ {
/*  15 */   DESKTOP(1),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  21 */   STARTMENU(2),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  28 */   PROGRAMS(3),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   STARTUP(4),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   SENDTO(5),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  46 */   FONTS(6),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  52 */   APPDATA(7),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   DOCS(8),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  64 */   TEMPLATES(9),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  70 */   FAVORITES(10),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   LOCAL_APPDATA(11),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  82 */   LOCAL_APPDATA_LOW(1004),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  88 */   PROGRAM_FILES(1002),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   PROGRAM_FILES_COMMON(1003);
/*     */   
/*     */   private final int intValue;
/*     */   
/*     */   SpecialFolder(int intValue) {
/*  99 */     this.intValue = intValue;
/*     */   }
/*     */   
/*     */   int getIntValue() {
/* 103 */     return this.intValue;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\SpecialFolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */