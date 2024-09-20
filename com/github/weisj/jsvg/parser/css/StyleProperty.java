/*    */ package com.github.weisj.jsvg.parser.css;
/*    */ 
/*    */ import com.google.errorprone.annotations.Immutable;
/*    */ import java.util.Objects;
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
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public final class StyleProperty
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String value;
/*    */   
/*    */   public StyleProperty(@NotNull String name, @NotNull String value) {
/* 36 */     this.name = name;
/* 37 */     this.value = value;
/*    */   }
/*    */   @NotNull
/*    */   public String name() {
/* 41 */     return this.name;
/*    */   }
/*    */   @NotNull
/*    */   public String value() {
/* 45 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 50 */     if (this == o) return true; 
/* 51 */     if (o == null || getClass() != o.getClass()) return false; 
/* 52 */     StyleProperty that = (StyleProperty)o;
/* 53 */     return (this.name.equals(that.name) && this.value.equals(that.value));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 58 */     return Objects.hash(new Object[] { this.name, this.value });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 63 */     return "StyleProperty{name='" + this.name + '\'' + ", value='" + this.value + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\StyleProperty.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */