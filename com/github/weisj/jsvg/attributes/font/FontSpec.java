/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.google.errorprone.annotations.Immutable;
/*    */ import java.util.Arrays;
/*    */ import java.util.Objects;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Immutable
/*    */ public class FontSpec
/*    */ {
/*    */   @NotNull
/*    */   protected final String[] families;
/*    */   @Nullable
/*    */   protected final FontStyle style;
/*    */   @Nullable
/*    */   protected final Length sizeAdjust;
/*    */   protected final float stretch;
/*    */   
/*    */   FontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch) {
/* 45 */     this.families = families;
/* 46 */     this.style = style;
/* 47 */     this.sizeAdjust = sizeAdjust;
/* 48 */     this.stretch = stretch;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 53 */     return "FontSpec{families=" + 
/* 54 */       Arrays.toString((Object[])this.families) + ", style=" + this.style + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 63 */     if (this == o) return true; 
/* 64 */     if (!(o instanceof FontSpec)) return false; 
/* 65 */     FontSpec fontSpec = (FontSpec)o;
/* 66 */     return (Float.compare(fontSpec.stretch, this.stretch) == 0 && 
/* 67 */       Arrays.equals((Object[])this.families, (Object[])fontSpec.families) && 
/* 68 */       Objects.equals(this.style, fontSpec.style) && 
/* 69 */       Objects.equals(this.sizeAdjust, fontSpec.sizeAdjust));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 74 */     int result = Objects.hash(new Object[] { this.style, this.sizeAdjust, Float.valueOf(this.stretch) });
/* 75 */     result = 31 * result + Arrays.hashCode((Object[])this.families);
/* 76 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\FontSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */