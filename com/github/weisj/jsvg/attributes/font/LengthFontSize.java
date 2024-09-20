/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
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
/*    */ public final class LengthFontSize
/*    */   implements FontSize
/*    */ {
/*    */   @NotNull
/*    */   private final Length size;
/*    */   
/*    */   public LengthFontSize(@NotNull Length size) {
/* 36 */     this.size = size;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Length size(@NotNull Length parentSize) {
/* 41 */     return this.size;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     return "LengthFontSize{size=" + this.size + '}';
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 51 */     if (this == o) return true; 
/* 52 */     if (!(o instanceof LengthFontSize)) return false; 
/* 53 */     LengthFontSize that = (LengthFontSize)o;
/* 54 */     return this.size.equals(that.size);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 59 */     return Objects.hashCode(this.size);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\LengthFontSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */