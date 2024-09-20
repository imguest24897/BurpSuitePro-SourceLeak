/*     */ package com.github.weisj.jsvg.attributes;
/*     */ 
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class MarkerOrientation
/*     */ {
/*     */   private MarkerOrientation() {}
/*     */   
/*     */   public enum MarkerType
/*     */   {
/*  34 */     START,
/*  35 */     MID,
/*  36 */     END; }
/*     */   
/*     */   @NotNull
/*     */   public static MarkerOrientation parse(@Nullable String value, @NotNull AttributeParser parser) {
/*  40 */     if (value == null) return AngleOrientation.DEFAULT; 
/*  41 */     if ("auto".equals(value)) return AutoOrientation.INSTANCE; 
/*  42 */     if ("auto-start-reverse".equals(value)) return AutoStartReverseOrientation.INSTANCE; 
/*  43 */     float angle = parser.parseAngle(value, Float.NaN);
/*  44 */     if (Length.isSpecified(angle)) return new AngleOrientation(angle); 
/*  45 */     return AngleOrientation.DEFAULT;
/*     */   }
/*     */   
/*     */   public abstract float orientationFor(@NotNull MarkerType paramMarkerType, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*     */   
/*     */   private static final class AutoOrientation extends MarkerOrientation {
/*     */     @NotNull
/*  52 */     private static final AutoOrientation INSTANCE = new AutoOrientation();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public float orientationFor(@NotNull MarkerOrientation.MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
/*     */       // Byte code:
/*     */       //   0: getstatic com/github/weisj/jsvg/attributes/MarkerOrientation$1.$SwitchMap$com$github$weisj$jsvg$attributes$MarkerOrientation$MarkerType : [I
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual ordinal : ()I
/*     */       //   7: iaload
/*     */       //   8: tableswitch default -> 75, 1 -> 36, 2 -> 47, 3 -> 56
/*     */       //   36: fload #5
/*     */       //   38: f2d
/*     */       //   39: fload #4
/*     */       //   41: f2d
/*     */       //   42: invokestatic atan2 : (DD)D
/*     */       //   45: d2f
/*     */       //   46: freturn
/*     */       //   47: fload_3
/*     */       //   48: f2d
/*     */       //   49: fload_2
/*     */       //   50: f2d
/*     */       //   51: invokestatic atan2 : (DD)D
/*     */       //   54: d2f
/*     */       //   55: freturn
/*     */       //   56: fload_3
/*     */       //   57: fload #5
/*     */       //   59: fadd
/*     */       //   60: fconst_2
/*     */       //   61: fdiv
/*     */       //   62: f2d
/*     */       //   63: fload_2
/*     */       //   64: fload #4
/*     */       //   66: fadd
/*     */       //   67: fconst_2
/*     */       //   68: fdiv
/*     */       //   69: f2d
/*     */       //   70: invokestatic atan2 : (DD)D
/*     */       //   73: d2f
/*     */       //   74: freturn
/*     */       //   75: new java/lang/IllegalStateException
/*     */       //   78: dup
/*     */       //   79: invokespecial <init> : ()V
/*     */       //   82: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #57	-> 0
/*     */       //   #59	-> 36
/*     */       //   #61	-> 47
/*     */       //   #63	-> 56
/*     */       //   #65	-> 75
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	83	0	this	Lcom/github/weisj/jsvg/attributes/MarkerOrientation$AutoOrientation;
/*     */       //   0	83	1	type	Lcom/github/weisj/jsvg/attributes/MarkerOrientation$MarkerType;
/*     */       //   0	83	2	dxIn	F
/*     */       //   0	83	3	dyIn	F
/*     */       //   0	83	4	dxOut	F
/*     */       //   0	83	5	dyOut	F
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final class AutoStartReverseOrientation
/*     */     extends MarkerOrientation
/*     */   {
/*     */     @NotNull
/*  71 */     private static final AutoStartReverseOrientation INSTANCE = new AutoStartReverseOrientation();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public float orientationFor(@NotNull MarkerOrientation.MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
/*     */       // Byte code:
/*     */       //   0: getstatic com/github/weisj/jsvg/attributes/MarkerOrientation$1.$SwitchMap$com$github$weisj$jsvg$attributes$MarkerOrientation$MarkerType : [I
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual ordinal : ()I
/*     */       //   7: iaload
/*     */       //   8: tableswitch default -> 77, 1 -> 36, 2 -> 49, 3 -> 58
/*     */       //   36: fload #5
/*     */       //   38: fneg
/*     */       //   39: f2d
/*     */       //   40: fload #4
/*     */       //   42: fneg
/*     */       //   43: f2d
/*     */       //   44: invokestatic atan2 : (DD)D
/*     */       //   47: d2f
/*     */       //   48: freturn
/*     */       //   49: fload_3
/*     */       //   50: f2d
/*     */       //   51: fload_2
/*     */       //   52: f2d
/*     */       //   53: invokestatic atan2 : (DD)D
/*     */       //   56: d2f
/*     */       //   57: freturn
/*     */       //   58: fload_3
/*     */       //   59: fload #5
/*     */       //   61: fadd
/*     */       //   62: fconst_2
/*     */       //   63: fdiv
/*     */       //   64: f2d
/*     */       //   65: fload_2
/*     */       //   66: fload #4
/*     */       //   68: fadd
/*     */       //   69: fconst_2
/*     */       //   70: fdiv
/*     */       //   71: f2d
/*     */       //   72: invokestatic atan2 : (DD)D
/*     */       //   75: d2f
/*     */       //   76: freturn
/*     */       //   77: new java/lang/IllegalStateException
/*     */       //   80: dup
/*     */       //   81: invokespecial <init> : ()V
/*     */       //   84: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #76	-> 0
/*     */       //   #78	-> 36
/*     */       //   #80	-> 49
/*     */       //   #82	-> 58
/*     */       //   #84	-> 77
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	85	0	this	Lcom/github/weisj/jsvg/attributes/MarkerOrientation$AutoStartReverseOrientation;
/*     */       //   0	85	1	type	Lcom/github/weisj/jsvg/attributes/MarkerOrientation$MarkerType;
/*     */       //   0	85	2	dxIn	F
/*     */       //   0	85	3	dyIn	F
/*     */       //   0	85	4	dxOut	F
/*     */       //   0	85	5	dyOut	F
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final class AngleOrientation
/*     */     extends MarkerOrientation
/*     */   {
/*     */     @NotNull
/*  90 */     private static final AngleOrientation DEFAULT = new AngleOrientation(0.0F);
/*     */     private final float angle;
/*     */     
/*     */     private AngleOrientation(float angle) {
/*  94 */       this.angle = angle;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public float orientationFor(@NotNull MarkerOrientation.MarkerType type, float dxIn, float dyIn, float dxOut, float dyOut) {
/* 100 */       return this.angle;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\MarkerOrientation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */