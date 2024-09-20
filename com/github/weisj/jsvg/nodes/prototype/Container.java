/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.SVGNode;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import java.util.stream.Collectors;
/*    */ import org.jetbrains.annotations.ApiStatus.Internal;
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
/*    */ public interface Container<E>
/*    */ {
/*    */   @Internal
/*    */   void addChild(@Nullable String paramString, @NotNull SVGNode paramSVGNode);
/*    */   
/*    */   List<? extends E> children();
/*    */   
/*    */   default <T extends E> List<T> childrenOfType(Class<T> type) {
/* 54 */     Objects.requireNonNull(type);
/* 55 */     Objects.requireNonNull(type); return (List<T>)children().stream().filter(type::isInstance).map(type::cast)
/* 56 */       .collect(Collectors.toList());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\Container.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */