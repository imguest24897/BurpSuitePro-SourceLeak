/*     */ package com.github.weisj.jsvg.nodes.container;
/*     */ 
/*     */ import com.github.weisj.jsvg.nodes.AbstractSVGNode;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Container;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import java.util.logging.Logger;
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
/*     */ public abstract class BaseContainerNode<E>
/*     */   extends AbstractSVGNode
/*     */   implements Container<E>
/*     */ {
/*     */   private static final boolean EXHAUSTIVE_CHECK = true;
/*  38 */   private static final Logger LOGGER = Logger.getLogger(BaseContainerNode.class.getName());
/*     */ 
/*     */   
/*     */   public final void addChild(@Nullable String id, @NotNull SVGNode node) {
/*  42 */     if (isAcceptableType(node) && acceptChild(id, node)) {
/*  43 */       doAdd(node);
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
/*     */   
/*     */   protected boolean acceptChild(@Nullable String id, @NotNull SVGNode node) {
/*  59 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean isAcceptableType(@NotNull SVGNode node) {
/*  63 */     PermittedContent allowedNodes = getClass().<PermittedContent>getAnnotation(PermittedContent.class);
/*  64 */     if (allowedNodes == null) {
/*  65 */       throw new IllegalStateException(
/*  66 */           String.format("Element <%s> doesn't specify permitted content information", new Object[] { tagName() }));
/*     */     }
/*  68 */     if (allowedNodes.any()) return true;
/*     */     
/*  70 */     Class<? extends SVGNode> nodeType = (Class)node.getClass();
/*  71 */     ElementCategories categories = nodeType.<ElementCategories>getAnnotation(ElementCategories.class);
/*  72 */     if (categories == null) {
/*  73 */       throw new IllegalStateException("Element <" + node
/*  74 */           .tagName() + "> doesn't specify element category information");
/*     */     }
/*  76 */     CategoryCheckResult result = doIntersect(allowedNodes.categories(), categories.value());
/*  77 */     if (result == CategoryCheckResult.Allowed) return true; 
/*  78 */     for (Class<? extends SVGNode> type : allowedNodes.anyOf()) {
/*  79 */       if (type.isAssignableFrom(nodeType)) return true; 
/*     */     } 
/*  81 */     if (result != CategoryCheckResult.Excluded) {
/*  82 */       LOGGER.warning(() -> String.format("Element <%s> not allowed in <%s> (or not implemented)", new Object[] { node.tagName(), tagName() }));
/*     */     }
/*     */     
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private CategoryCheckResult doIntersect(Category[] requested, Category[] provided) {
/*  91 */     CategoryCheckResult result = CategoryCheckResult.Denied;
/*  92 */     for (Category request : requested) {
/*  93 */       boolean effectivelyAllowed = request.isEffectivelyAllowed();
/*  94 */       if (!effectivelyAllowed);
/*  95 */       for (Category category : provided) {
/*  96 */         if (request == category) {
/*  97 */           if (effectivelyAllowed) return CategoryCheckResult.Allowed;
/*     */           
/*  99 */           result = CategoryCheckResult.Excluded;
/*     */         } 
/*     */       } 
/*     */     } 
/* 103 */     return result;
/*     */   }
/*     */   
/*     */   protected abstract void doAdd(@NotNull SVGNode paramSVGNode);
/*     */   
/*     */   private enum CategoryCheckResult
/*     */   {
/* 110 */     Allowed,
/*     */ 
/*     */ 
/*     */     
/* 114 */     Denied,
/*     */ 
/*     */ 
/*     */     
/* 118 */     Excluded;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\container\BaseContainerNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */