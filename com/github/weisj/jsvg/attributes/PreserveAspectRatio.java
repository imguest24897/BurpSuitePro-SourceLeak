/*     */ package com.github.weisj.jsvg.attributes;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.parser.SeparatorMode;
/*     */ import java.awt.geom.AffineTransform;
/*     */ import java.util.Objects;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PreserveAspectRatio
/*     */ {
/*     */   @NotNull
/*     */   public final Align align;
/*     */   @NotNull
/*     */   public final MeetOrSlice meetOrSlice;
/*     */   
/*     */   private enum AlignType
/*     */   {
/*  37 */     Min
/*     */     {
/*     */       float align(float size1, float size2) {
/*  40 */         return 0.0F;
/*     */       }
/*     */     },
/*  43 */     Mid
/*     */     {
/*     */       float align(float size1, float size2) {
/*  46 */         return (size1 - size2) / 2.0F;
/*     */       }
/*     */     },
/*  49 */     Max
/*     */     {
/*     */       float align(float size1, float size2) {
/*  52 */         return size1 - size2;
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     abstract float align(float param1Float1, float param1Float2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Align
/*     */   {
/*  67 */     None((String)PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Min),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     xMinYMin((String)PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Min),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     xMidYMin((String)PreserveAspectRatio.AlignType.Mid, PreserveAspectRatio.AlignType.Min),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     xMaxYMin((String)PreserveAspectRatio.AlignType.Max, PreserveAspectRatio.AlignType.Min),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     xMinYMid((String)PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Mid),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     xMidYMid((String)PreserveAspectRatio.AlignType.Mid, PreserveAspectRatio.AlignType.Mid),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     xMaxYMid((String)PreserveAspectRatio.AlignType.Max, PreserveAspectRatio.AlignType.Mid),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     xMinYMax((String)PreserveAspectRatio.AlignType.Min, PreserveAspectRatio.AlignType.Max),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     xMidYMax((String)PreserveAspectRatio.AlignType.Mid, PreserveAspectRatio.AlignType.Max),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     xMaxYMax((String)PreserveAspectRatio.AlignType.Max, PreserveAspectRatio.AlignType.Max);
/*     */     
/*     */     @NotNull
/*     */     private final PreserveAspectRatio.AlignType xAlign;
/*     */     
/*     */     Align(PreserveAspectRatio.AlignType xAlign, PreserveAspectRatio.AlignType yAlign) {
/* 128 */       this.xAlign = xAlign;
/* 129 */       this.yAlign = yAlign;
/*     */     }
/*     */     @NotNull
/*     */     private final PreserveAspectRatio.AlignType yAlign;
/*     */     public String toString() {
/* 134 */       return name() + "{" + this.xAlign + ", " + this.yAlign + "}";
/*     */     }
/*     */   }
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
/*     */   public enum MeetOrSlice
/*     */   {
/* 150 */     Meet,
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
/*     */     
/* 163 */     Slice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private PreserveAspectRatio(@NotNull Align align, @NotNull MeetOrSlice meetOrSlice) {
/* 170 */     this.align = align;
/* 171 */     this.meetOrSlice = meetOrSlice;
/*     */   }
/*     */   @NotNull
/*     */   public static PreserveAspectRatio none() {
/* 175 */     return new PreserveAspectRatio(Align.None, MeetOrSlice.Meet);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static PreserveAspectRatio parse(@Nullable String preserveAspectRation, @NotNull AttributeParser parser) {
/* 180 */     return parse(preserveAspectRation, null, parser);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static PreserveAspectRatio parse(@Nullable String preserveAspectRation, @Nullable PreserveAspectRatio fallback, @NotNull AttributeParser parser) {
/* 185 */     Align align = Align.xMidYMid;
/* 186 */     MeetOrSlice meetOrSlice = MeetOrSlice.Meet;
/* 187 */     if (preserveAspectRation == null) {
/* 188 */       return (fallback != null) ? fallback : new PreserveAspectRatio(align, meetOrSlice);
/*     */     }
/*     */     
/* 191 */     String[] components = parser.parseStringList(preserveAspectRation, SeparatorMode.COMMA_AND_WHITESPACE);
/* 192 */     if (components.length < 1 || components.length > 2)
/* 193 */       throw new IllegalArgumentException("Too many arguments specified: " + preserveAspectRation); 
/* 194 */     align = parser.<Align>parseEnum(components[0], align);
/* 195 */     if (components.length > 1)
/* 196 */       meetOrSlice = parser.<MeetOrSlice>parseEnum(components[1], meetOrSlice); 
/* 197 */     return new PreserveAspectRatio(align, meetOrSlice);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 202 */     if (this == o) return true; 
/* 203 */     if (!(o instanceof PreserveAspectRatio)) return false; 
/* 204 */     PreserveAspectRatio that = (PreserveAspectRatio)o;
/* 205 */     return (this.align == that.align && this.meetOrSlice == that.meetOrSlice);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 210 */     return Objects.hash(new Object[] { this.align, this.meetOrSlice });
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AffineTransform computeViewPortTransform(@NotNull FloatSize size, @NotNull ViewBox viewBox) {
/* 215 */     AffineTransform viewTransform = new AffineTransform();
/* 216 */     if (this.align == Align.None) {
/* 217 */       viewTransform.scale((size.width / viewBox.width), (size.height / viewBox.height));
/*     */     } else {
/* 219 */       float xScale = size.width / viewBox.width;
/* 220 */       float yScale = size.height / viewBox.height;
/*     */       
/* 222 */       switch (this.meetOrSlice) {
/*     */         case Meet:
/* 224 */           xScale = yScale = Math.min(xScale, yScale);
/*     */           break;
/*     */         case Slice:
/* 227 */           xScale = yScale = Math.max(xScale, yScale);
/*     */           break;
/*     */         default:
/* 230 */           throw new IllegalStateException();
/*     */       } 
/*     */       
/* 233 */       viewTransform.translate(this.align
/* 234 */           .xAlign.align(size.width, viewBox.width * xScale), this.align
/* 235 */           .yAlign.align(size.height, viewBox.height * yScale));
/* 236 */       viewTransform.scale(xScale, yScale);
/*     */     } 
/* 238 */     viewTransform.translate(-viewBox.x, -viewBox.y);
/* 239 */     return viewTransform;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 244 */     return "PreserveAspectRatio{align=" + this.align + ", meetOrSlice=" + this.meetOrSlice + '}';
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\PreserveAspectRatio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */