/*    */ package com.install4j.runtime.beans;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.util.Objects;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class LightOrDarkColor
/*    */   extends AbstractLightOrDarkColor
/*    */ {
/*    */   private Color lightColor;
/*    */   private Color darkColor;
/*    */   
/*    */   public LightOrDarkColor(@Nullable Color lightColor, @Nullable Color darkColor) {
/* 15 */     this.lightColor = nullToTransparent(lightColor);
/* 16 */     this.darkColor = nullToTransparent(darkColor);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Color getLightColor() {
/* 22 */     return this.lightColor;
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Color getDarkColor() {
/* 28 */     return this.darkColor;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 33 */     if (this == o) return true; 
/* 34 */     if (o == null || getClass() != o.getClass()) return false; 
/* 35 */     LightOrDarkColor that = (LightOrDarkColor)o;
/* 36 */     return (this.lightColor.equals(that.lightColor) && this.darkColor.equals(that.darkColor));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 41 */     return Objects.hash(new Object[] { this.lightColor, this.darkColor });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     StringBuilder buffer = new StringBuilder(getClass().getName());
/* 47 */     buffer.append("{light ");
/* 48 */     appendColor(buffer, this.lightColor);
/* 49 */     buffer.append(", dark ");
/* 50 */     appendColor(buffer, this.darkColor);
/* 51 */     buffer.append("}");
/* 52 */     return buffer.toString();
/*    */   }
/*    */   
/*    */   private static void appendColor(StringBuilder buffer, Color color) {
/* 56 */     if (color.equals(TRANSPARENT)) {
/* 57 */       buffer.append("transparent");
/*    */     } else {
/* 59 */       buffer.append("[r=").append(color.getRed()).append(",g=").append(color.getGreen()).append(",b=").append(color.getBlue()).append("]");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\LightOrDarkColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */