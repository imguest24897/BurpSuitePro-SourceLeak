/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.css.CssParser;
/*    */ import com.github.weisj.jsvg.parser.css.StyleSheet;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
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
/*    */ @PermittedContent(any = true, charData = true)
/*    */ public final class Style
/*    */   extends MetaSVGNode
/*    */ {
/*    */   public static final String TAG = "style";
/*    */   private StyleSheet styleSheet;
/* 42 */   private final List<char[]> data = (List)new ArrayList<>();
/*    */   
/*    */   public void parseStyleSheet(@NotNull CssParser cssParser) {
/* 45 */     this.styleSheet = cssParser.parse(this.data);
/* 46 */     this.data.clear();
/*    */   }
/*    */   @NotNull
/*    */   public StyleSheet styleSheet() {
/* 50 */     return Objects.<StyleSheet>requireNonNull(this.styleSheet);
/*    */   }
/*    */ 
/*    */   
/*    */   public void addContent(char[] content) {
/* 55 */     this.data.add(content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 60 */     return "style";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Style.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */