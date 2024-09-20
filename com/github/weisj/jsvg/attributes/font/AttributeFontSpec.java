/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
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
/*    */ public final class AttributeFontSpec
/*    */   extends FontSpec
/*    */   implements Mutator<MeasurableFontSpec>
/*    */ {
/*    */   @Nullable
/*    */   private final FontSize size;
/*    */   @Nullable
/*    */   private final FontWeight weight;
/*    */   
/*    */   AttributeFontSpec(@NotNull String[] families, @Nullable FontStyle style, @Nullable Length sizeAdjust, float stretch, @Nullable FontSize size, @Nullable FontWeight weight) {
/* 40 */     super(families, style, sizeAdjust, stretch);
/* 41 */     this.size = size;
/* 42 */     this.weight = weight;
/*    */   }
/*    */   @Nullable
/*    */   public FontWeight weight() {
/* 46 */     return this.weight;
/*    */   }
/*    */   @Nullable
/*    */   public FontSize size() {
/* 50 */     return this.size;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public MeasurableFontSpec mutate(@NotNull MeasurableFontSpec element) {
/* 55 */     return element.derive(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 60 */     return "AttributeFontSpec{families=" + 
/* 61 */       Arrays.toString((Object[])this.families) + ", style=" + this.style + ", weight=" + this.weight + ", size=" + this.size + ", sizeAdjust=" + this.sizeAdjust + ", stretch=" + this.stretch + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 72 */     if (this == o) return true; 
/* 73 */     if (!(o instanceof AttributeFontSpec)) return false; 
/* 74 */     if (!super.equals(o)) return false; 
/* 75 */     AttributeFontSpec fontSpec = (AttributeFontSpec)o;
/* 76 */     return (Objects.equals(this.size, fontSpec.size) && Objects.equals(this.weight, fontSpec.weight));
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 81 */     return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.size, this.weight });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\AttributeFontSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */