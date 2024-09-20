/*     */ package com.github.weisj.jsvg.parser;
/*     */ 
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.Container;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public final class ParsedElement
/*     */ {
/*     */   @Nullable
/*     */   private final String id;
/*     */   @NotNull
/*     */   private final AttributeNode attributeNode;
/*     */   @NotNull
/*     */   private final SVGNode node;
/*     */   
/*     */   private enum BuildStatus
/*     */   {
/*  37 */     NOT_BUILT,
/*  38 */     IN_PROGRESS,
/*  39 */     FINISHED;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  46 */   private final List<ParsedElement> children = new ArrayList<>();
/*     */   @NotNull
/*  48 */   private BuildStatus buildStatus = BuildStatus.NOT_BUILT; final CharacterDataParser characterDataParser;
/*     */   
/*     */   ParsedElement(@Nullable String id, @NotNull AttributeNode element, @NotNull SVGNode node) {
/*  51 */     this.attributeNode = element;
/*  52 */     this.node = node;
/*  53 */     this.id = id;
/*  54 */     PermittedContent permittedContent = node.getClass().<PermittedContent>getAnnotation(PermittedContent.class);
/*  55 */     if (permittedContent == null) {
/*  56 */       throw new IllegalStateException("Element <" + node.tagName() + "> doesn't specify permitted content");
/*     */     }
/*  58 */     if (permittedContent.charData()) {
/*  59 */       this.characterDataParser = new CharacterDataParser();
/*     */     } else {
/*  61 */       this.characterDataParser = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void registerNamedElement(@NotNull String name, @NotNull Object element) {
/*  66 */     this.attributeNode.namedElements().put(name, element);
/*     */   }
/*     */   @Nullable
/*     */   public String id() {
/*  70 */     return this.id;
/*     */   }
/*     */   @NotNull
/*     */   public List<ParsedElement> children() {
/*  74 */     return this.children;
/*     */   }
/*     */   @NotNull
/*     */   public SVGNode node() {
/*  78 */     return this.node;
/*     */   }
/*     */   @NotNull
/*     */   public SVGNode nodeEnsuringBuildStatus() {
/*  82 */     if (this.buildStatus == BuildStatus.IN_PROGRESS) {
/*  83 */       cyclicDependencyDetected();
/*  84 */     } else if (this.buildStatus == BuildStatus.NOT_BUILT) {
/*  85 */       build();
/*     */     } 
/*  87 */     return this.node;
/*     */   }
/*     */   @NotNull
/*     */   public AttributeNode attributeNode() {
/*  91 */     return this.attributeNode;
/*     */   }
/*     */   
/*     */   void addChild(ParsedElement parsedElement) {
/*  95 */     this.children.add(parsedElement);
/*  96 */     if (this.node instanceof Container) {
/*  97 */       ((Container)this.node).addChild(parsedElement.id, parsedElement.node);
/*     */     }
/*     */   }
/*     */   
/*     */   void build() {
/* 102 */     if (this.buildStatus == BuildStatus.FINISHED)
/* 103 */       return;  if (this.buildStatus == BuildStatus.IN_PROGRESS) {
/* 104 */       cyclicDependencyDetected();
/*     */       return;
/*     */     } 
/* 107 */     this.buildStatus = BuildStatus.IN_PROGRESS;
/*     */     
/* 109 */     this.attributeNode.prepareForNodeBuilding(this);
/*     */ 
/*     */ 
/*     */     
/* 113 */     for (ParsedElement child : this.children) {
/* 114 */       child.build();
/*     */     }
/* 116 */     this.node.build(this.attributeNode);
/* 117 */     this.buildStatus = BuildStatus.FINISHED;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 122 */     return "ParsedElement{node=" + this.node + '}';
/*     */   }
/*     */   
/*     */   private void cyclicDependencyDetected() {
/* 126 */     throw new IllegalStateException("Cyclic dependency involving node '" + this.id + "' detected.");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\ParsedElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */