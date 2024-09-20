/*    */ package com.github.weisj.jsvg.geometry.size;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ public enum Unit
/*    */ {
/*    */   private static final Unit[] units;
/*    */   @NotNull
/*    */   private final String suffix;
/* 29 */   PX,
/* 30 */   CM,
/* 31 */   MM,
/* 32 */   IN,
/* 33 */   EM,
/* 34 */   REM,
/* 35 */   EX,
/* 36 */   PT,
/* 37 */   PC,
/* 38 */   PERCENTAGE("%"),
/* 39 */   Raw("");
/*    */   static {
/* 41 */     units = values();
/*    */   }
/*    */   public static Unit[] units() {
/* 44 */     return units;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   Unit(String suffix) {
/* 50 */     this.suffix = suffix;
/*    */   }
/*    */   
/*    */   Unit() {
/* 54 */     this.suffix = name().toLowerCase(Locale.ENGLISH);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String suffix() {
/* 64 */     return this.suffix;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\size\Unit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */