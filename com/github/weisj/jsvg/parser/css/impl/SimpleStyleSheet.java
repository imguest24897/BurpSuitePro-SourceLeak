/*    */ package com.github.weisj.jsvg.parser.css.impl;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.ParsedElement;
/*    */ import com.github.weisj.jsvg.parser.SeparatorMode;
/*    */ import com.github.weisj.jsvg.parser.css.StyleProperty;
/*    */ import com.github.weisj.jsvg.parser.css.StyleSheet;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public final class SimpleStyleSheet
/*    */   implements StyleSheet
/*    */ {
/*    */   @NotNull
/* 38 */   private final Map<String, List<StyleProperty>> classRules = new HashMap<>(); @NotNull
/* 39 */   private final Map<String, List<StyleProperty>> idRules = new HashMap<>(); @NotNull
/* 40 */   private final Map<String, List<StyleProperty>> tagNameRules = new HashMap<>();
/*    */   @NotNull
/*    */   public Map<String, List<StyleProperty>> classRules() {
/* 43 */     return this.classRules;
/*    */   }
/*    */   @NotNull
/*    */   public Map<String, List<StyleProperty>> idRules() {
/* 47 */     return this.idRules;
/*    */   }
/*    */   @NotNull
/*    */   public Map<String, List<StyleProperty>> tagNameRules() {
/* 51 */     return this.tagNameRules;
/*    */   }
/*    */   
/*    */   void addTagNameRules(@NotNull String tagName, @NotNull List<StyleProperty> rule) {
/* 55 */     ((List<StyleProperty>)this.tagNameRules.computeIfAbsent(tagName, k -> new ArrayList())).addAll(rule);
/*    */   }
/*    */   
/*    */   void addClassRules(@NotNull String className, @NotNull List<StyleProperty> rule) {
/* 59 */     ((List<StyleProperty>)this.classRules.computeIfAbsent(className, k -> new ArrayList())).addAll(rule);
/*    */   }
/*    */   
/*    */   void addIdRules(@NotNull String id, @NotNull List<StyleProperty> rule) {
/* 63 */     ((List<StyleProperty>)this.idRules.computeIfAbsent(id, k -> new ArrayList())).addAll(rule);
/*    */   }
/*    */ 
/*    */   
/*    */   public void forEachMatchingRule(@NotNull ParsedElement element, @NotNull StyleSheet.RuleConsumer ruleConsumer) {
/* 68 */     List<StyleProperty> rules = this.tagNameRules.get(element.node().tagName());
/* 69 */     if (rules != null) { Objects.requireNonNull(ruleConsumer); rules.forEach(ruleConsumer::applyRule); }
/* 70 */      if (element.id() != null) {
/* 71 */       rules = this.idRules.get(element.id());
/* 72 */       if (rules != null) { Objects.requireNonNull(ruleConsumer); rules.forEach(ruleConsumer::applyRule); }
/*    */     
/* 74 */     }  for (String className : element.attributeNode().getStringList("class", SeparatorMode.WHITESPACE_ONLY)) {
/* 75 */       rules = this.classRules.get(className);
/* 76 */       if (rules != null) { Objects.requireNonNull(ruleConsumer); rules.forEach(ruleConsumer::applyRule); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\css\impl\SimpleStyleSheet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */