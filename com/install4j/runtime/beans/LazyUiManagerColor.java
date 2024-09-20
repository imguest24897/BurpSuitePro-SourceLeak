/*    */ package com.install4j.runtime.beans;
/*    */ 
/*    */ import com.install4j.api.UiUtil;
/*    */ import java.awt.Color;
/*    */ import java.util.Map;
/*    */ import java.util.WeakHashMap;
/*    */ import javax.swing.UIManager;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class LazyUiManagerColor
/*    */   extends LazyColor
/*    */ {
/* 14 */   private static Map<Color, Color> nonUiResourceColors = new WeakHashMap<>();
/*    */   
/*    */   public LazyUiManagerColor(@NotNull String key) {
/* 17 */     this(key, false, null, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public LazyUiManagerColor(@NotNull String key, boolean nonUiResource) {
/* 22 */     this(key, nonUiResource, null, null);
/*    */   }
/*    */ 
/*    */   
/*    */   public LazyUiManagerColor(@NotNull String key, @Nullable Color lightException, @Nullable Color darkException) {
/* 27 */     this(key, false, lightException, darkException);
/*    */   }
/*    */   
/*    */   public LazyUiManagerColor(@NotNull String key, boolean nonUiResource, @Nullable Color lightException, @Nullable Color darkException) {
/* 31 */     super(() -> {
/*    */           boolean dark = UiUtil.isDarkUi();
/*    */           if (dark && darkException != null)
/*    */             return darkException; 
/*    */           if (!dark && lightException != null)
/*    */             return lightException; 
/*    */           Color color = UIManager.getColor(key);
/*    */           if (color == null)
/*    */             throw new RuntimeException("Color \"" + key + "\" not registered"); 
/*    */           return nonUiResource ? nonUiResourceColors.computeIfAbsent(color, ()) : color;
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\LazyUiManagerColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */