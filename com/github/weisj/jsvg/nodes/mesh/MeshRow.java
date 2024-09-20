/*    */ package com.github.weisj.jsvg.nodes.mesh;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.Style;
/*    */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @ElementCategories({})
/*    */ @PermittedContent(categories = {Category.Descriptive}, anyOf = {MeshPatch.class, Style.class})
/*    */ public final class MeshRow
/*    */   extends ContainerNode
/*    */ {
/*    */   public static final String TAG = "meshrow";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 42 */     return "meshrow";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\mesh\MeshRow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */