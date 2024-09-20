/*    */ package com.github.weisj.jsvg.util;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.FillRule;
/*    */ import com.github.weisj.jsvg.geometry.FillRuleAwareAWTSVGShape;
/*    */ import com.github.weisj.jsvg.geometry.MeasurableShape;
/*    */ import com.github.weisj.jsvg.geometry.path.BuildHistory;
/*    */ import com.github.weisj.jsvg.geometry.path.PathCommand;
/*    */ import com.github.weisj.jsvg.geometry.path.PathParser;
/*    */ import java.awt.geom.Path2D;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
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
/*    */ public final class PathUtil
/*    */ {
/*    */   @Nullable
/* 41 */   private static final MethodHandle trimPathHandle = lookupTrimPathMethod();
/*    */   
/*    */   @Nullable
/*    */   private static MethodHandle lookupTrimPathMethod() {
/*    */     try {
/* 46 */       MethodType methodType = MethodType.methodType(void.class);
/* 47 */       return MethodHandles.lookup().findVirtual(Path2D.class, "trimToSize", methodType);
/* 48 */     } catch (NoSuchMethodException|IllegalAccessException e) {
/* 49 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static MeasurableShape parseFromPathData(@NotNull String data, @NotNull FillRule fillRule) {
/* 56 */     PathCommand[] pathCommands = (new PathParser(data)).parsePathCommand();
/*    */     
/* 58 */     int nodeCount = 2;
/* 59 */     for (PathCommand pathCommand : pathCommands) {
/* 60 */       nodeCount += pathCommand.nodeCount() - 1;
/*    */     }
/*    */     
/* 63 */     Path2D path = new Path2D.Float(fillRule.awtWindingRule, nodeCount);
/* 64 */     BuildHistory hist = new BuildHistory();
/*    */     
/* 66 */     for (PathCommand pathCommand : pathCommands) {
/* 67 */       pathCommand.appendPath(path, hist);
/*    */     }
/*    */     
/* 70 */     trimPathToSize(path);
/*    */     
/* 72 */     return (MeasurableShape)new FillRuleAwareAWTSVGShape(path);
/*    */   }
/*    */   
/*    */   public static void trimPathToSize(@NotNull Path2D path) {
/* 76 */     if (trimPathHandle != null)
/*    */       try {
/* 78 */         trimPathHandle.invokeExact(path);
/* 79 */       } catch (Throwable e) {
/* 80 */         throw new RuntimeException(e);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\PathUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */