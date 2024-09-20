/*    */ package com.install4j.runtime.beans;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Supplier;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class DynamicLightOrDarkColor
/*    */   extends AbstractLightOrDarkColor
/*    */ {
/*    */   private Supplier<Color> lightColor;
/*    */   private Supplier<Color> darkColor;
/*    */   
/*    */   public DynamicLightOrDarkColor(@NotNull Supplier<Color> lightColor, @NotNull Supplier<Color> darkColor) {
/* 15 */     this.lightColor = lightColor;
/* 16 */     this.darkColor = darkColor;
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Color getLightColor() {
/* 22 */     return nullToTransparent(this.lightColor.get());
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Color getDarkColor() {
/* 28 */     return nullToTransparent(this.darkColor.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 33 */     return (this == o);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 38 */     return Objects.hash(new Object[] { this.lightColor, this.darkColor });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return "dynamic color";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\DynamicLightOrDarkColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */