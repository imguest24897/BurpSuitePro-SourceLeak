/*    */ package com.install4j.runtime.installer.platform.win32.wininet;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public final class IgnoreCaseString
/*    */   implements Comparable<IgnoreCaseString> {
/*    */   private final String displayString;
/*    */   private final String lowerCaseString;
/*    */   
/*    */   public IgnoreCaseString(String displayString) {
/* 12 */     this.displayString = displayString;
/* 13 */     this.lowerCaseString = displayString.toLowerCase(Locale.ROOT);
/*    */   }
/*    */   
/*    */   public String getDisplayString() {
/* 17 */     return this.displayString;
/*    */   }
/*    */   
/*    */   public String getLowerCaseString() {
/* 21 */     return this.lowerCaseString;
/*    */   }
/*    */ 
/*    */   
/*    */   public int compareTo(@NotNull IgnoreCaseString o) {
/* 26 */     return this.lowerCaseString.compareTo(o.lowerCaseString);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 31 */     return this.displayString;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 36 */     return this.lowerCaseString.hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/* 41 */     if (!(obj instanceof IgnoreCaseString)) {
/* 42 */       return false;
/*    */     }
/* 44 */     return this.lowerCaseString.equals(((IgnoreCaseString)obj).lowerCaseString);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\wininet\IgnoreCaseString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */