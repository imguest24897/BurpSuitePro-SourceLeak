/*     */ package com.github.weisj.jsvg.parser;
/*     */ 
/*     */ import com.github.weisj.jsvg.SVGDocument;
/*     */ import com.github.weisj.jsvg.attributes.AttributeParser;
/*     */ import com.github.weisj.jsvg.nodes.SVG;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.Style;
/*     */ import com.github.weisj.jsvg.nodes.Use;
/*     */ import com.github.weisj.jsvg.nodes.container.CommonRenderableContainerNode;
/*     */ import com.github.weisj.jsvg.parser.css.CssParser;
/*     */ import com.github.weisj.jsvg.parser.css.StyleSheet;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Deque;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ public final class SVGDocumentBuilder
/*     */ {
/*     */   private static final int MAX_USE_NESTING_DEPTH = 15;
/*  40 */   private final Map<String, Object> namedElements = new HashMap<>();
/*  41 */   private final List<Use> useElements = new ArrayList<>();
/*  42 */   private final List<Style> styleElements = new ArrayList<>();
/*  43 */   private final List<StyleSheet> styleSheets = new ArrayList<>();
/*  44 */   private final Deque<ParsedElement> currentNodeStack = new ArrayDeque<>();
/*     */   
/*     */   @NotNull
/*     */   private final ParserProvider parserProvider;
/*     */   
/*     */   @NotNull
/*     */   private final LoadHelper loadHelper;
/*     */   
/*     */   @NotNull
/*     */   private final NodeSupplier nodeSupplier;
/*     */   private ParsedElement rootNode;
/*     */   
/*     */   public SVGDocumentBuilder(@NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader, @NotNull NodeSupplier nodeSupplier) {
/*  57 */     this.parserProvider = parserProvider;
/*  58 */     this.loadHelper = new LoadHelper(new AttributeParser(parserProvider.createPaintParser()), resourceLoader);
/*  59 */     this.nodeSupplier = nodeSupplier;
/*     */   }
/*     */   
/*     */   public void startDocument() {
/*  63 */     if (this.rootNode != null) throw new IllegalStateException("Document already started"); 
/*     */   }
/*     */   
/*     */   public void endDocument() {
/*  67 */     if (this.rootNode == null) throw new IllegalStateException("Document is empty");
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean startElement(@NotNull String tagName, @NotNull Map<String, String> attributes) {
/*  73 */     ParsedElement parentElement = !this.currentNodeStack.isEmpty() ? this.currentNodeStack.peek() : null;
/*     */ 
/*     */     
/*  76 */     AttributeNode parentAttributeNode = (parentElement != null) ? parentElement.attributeNode() : null;
/*     */     
/*  78 */     if (parentElement != null) flushText(parentElement, true);
/*     */     
/*  80 */     SVGNode newNode = this.nodeSupplier.create(tagName);
/*  81 */     if (newNode == null) return false;
/*     */     
/*  83 */     AttributeNode attributeNode = new AttributeNode(tagName, attributes, parentAttributeNode, this.namedElements, this.styleSheets, this.loadHelper);
/*     */     
/*  85 */     String id = attributes.get("id");
/*  86 */     ParsedElement parsedElement = new ParsedElement(id, attributeNode, newNode);
/*     */     
/*  88 */     if (id != null && !this.namedElements.containsKey(id)) {
/*  89 */       this.namedElements.put(id, parsedElement);
/*     */     }
/*     */     
/*  92 */     if (parentElement != null) {
/*  93 */       parentElement.addChild(parsedElement);
/*     */     }
/*  95 */     if (this.rootNode == null) this.rootNode = parsedElement;
/*     */     
/*  97 */     if (parsedElement.node() instanceof Style) {
/*  98 */       this.styleElements.add((Style)parsedElement.node());
/*     */     }
/*     */     
/* 101 */     if (parsedElement.node() instanceof Use) {
/* 102 */       this.useElements.add((Use)parsedElement.node());
/*     */     }
/*     */     
/* 105 */     this.currentNodeStack.push(parsedElement);
/* 106 */     return true;
/*     */   }
/*     */   
/*     */   public void addTextContent(char[] characterData, int startOffset, int endOffset) {
/* 110 */     if (this.currentNodeStack.isEmpty()) {
/* 111 */       throw new IllegalStateException("Adding text content without a current node");
/*     */     }
/* 113 */     ParsedElement currentElement = this.currentNodeStack.peek();
/* 114 */     if (currentElement.characterDataParser == null)
/* 115 */       return;  currentElement.characterDataParser.append(characterData, startOffset, endOffset);
/*     */   }
/*     */   
/*     */   public void endElement(@NotNull String tagName) {
/* 119 */     if (this.currentNodeStack.isEmpty()) {
/* 120 */       throw new IllegalStateException("No current node to end");
/*     */     }
/* 122 */     ParsedElement currentElement = this.currentNodeStack.pop();
/* 123 */     String currentNodeTagName = currentElement.attributeNode().tagName();
/* 124 */     if (!currentNodeTagName.equals(tagName)) {
/* 125 */       throw new IllegalStateException(
/* 126 */           String.format("Closing tag %s doesn't match current node %s)", new Object[] { tagName, currentNodeTagName }));
/*     */     }
/* 128 */     flushText(currentElement, false);
/*     */   }
/*     */   
/*     */   private void flushText(@NotNull ParsedElement element, boolean segmentBreak) {
/* 132 */     if (element.characterDataParser != null && element.characterDataParser.canFlush(segmentBreak))
/* 133 */       element.node().addContent(element.characterDataParser.flush(segmentBreak)); 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public SVGDocument build() {
/* 138 */     if (this.rootNode == null) throw new IllegalStateException("No root node");
/*     */     
/* 140 */     processStyleSheets();
/*     */     
/* 142 */     DomProcessor preProcessor = this.parserProvider.createPreProcessor();
/* 143 */     if (preProcessor != null) preProcessor.process(this.rootNode);
/*     */     
/* 145 */     this.rootNode.build();
/*     */     
/* 147 */     DomProcessor postProcessor = this.parserProvider.createPostProcessor();
/* 148 */     if (postProcessor != null) postProcessor.process(this.rootNode);
/*     */     
/* 150 */     validateUseElements();
/* 151 */     return new SVGDocument((SVG)this.rootNode.node());
/*     */   }
/*     */   
/*     */   private void processStyleSheets() {
/* 155 */     if (this.styleElements.isEmpty())
/* 156 */       return;  CssParser cssParser = this.parserProvider.createCssParser();
/* 157 */     for (Style styleElement : this.styleElements) {
/* 158 */       styleElement.parseStyleSheet(cssParser);
/* 159 */       this.styleSheets.add(styleElement.styleSheet());
/*     */     } 
/*     */   }
/*     */   
/*     */   private void validateUseElements() {
/* 164 */     if (this.useElements.isEmpty())
/* 165 */       return;  for (Use useElement : this.useElements) {
/* 166 */       checkNestingDepth((SVGNode)useElement, 15);
/*     */     }
/*     */   }
/*     */   
/*     */   private void checkNestingDepth(@NotNull SVGNode node, int allowed_depth) {
/* 171 */     if (allowed_depth <= 0) {
/* 172 */       throw new IllegalStateException("Maximum nesting depth exceeded");
/*     */     }
/* 174 */     if (node instanceof Use) {
/* 175 */       SVGNode referenced = ((Use)node).referencedNode();
/* 176 */       if (referenced != null) checkNestingDepth(referenced, allowed_depth - 1); 
/* 177 */     } else if (node instanceof CommonRenderableContainerNode) {
/* 178 */       for (SVGNode child : ((CommonRenderableContainerNode)node).children())
/* 179 */         checkNestingDepth(child, allowed_depth); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\SVGDocumentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */