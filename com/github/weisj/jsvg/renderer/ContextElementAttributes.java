/*    */ package com.github.weisj.jsvg.renderer;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ContextElementAttributes
/*    */ {
/*    */   @NotNull
/*    */   public final SVGPaint fillPaint;
/*    */   @NotNull
/*    */   public final SVGPaint strokePaint;
/*    */   
/*    */   public ContextElementAttributes(@NotNull SVGPaint fillPaint, @NotNull SVGPaint strokePaint) {
/* 39 */     this.fillPaint = fillPaint;
/* 40 */     this.strokePaint = strokePaint;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 45 */     if (this == o) return true; 
/* 46 */     if (!(o instanceof ContextElementAttributes)) return false; 
/* 47 */     ContextElementAttributes that = (ContextElementAttributes)o;
/* 48 */     return (this.fillPaint.equals(that.fillPaint) && this.strokePaint.equals(that.strokePaint));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 53 */     return Objects.hash(new Object[] { this.fillPaint, this.strokePaint });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 58 */     return "ContextElementAttributes{fillPaint=" + this.fillPaint + ", strokePaint=" + this.strokePaint + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\renderer\ContextElementAttributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */