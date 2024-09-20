/*     */ package com.github.weisj.jsvg.parser;
/*     */ import com.github.weisj.jsvg.nodes.Anchor;
/*     */ import com.github.weisj.jsvg.nodes.ClipPath;
/*     */ import com.github.weisj.jsvg.nodes.Defs;
/*     */ import com.github.weisj.jsvg.nodes.Desc;
/*     */ import com.github.weisj.jsvg.nodes.Group;
/*     */ import com.github.weisj.jsvg.nodes.Image;
/*     */ import com.github.weisj.jsvg.nodes.LinearGradient;
/*     */ import com.github.weisj.jsvg.nodes.Metadata;
/*     */ import com.github.weisj.jsvg.nodes.Path;
/*     */ import com.github.weisj.jsvg.nodes.Pattern;
/*     */ import com.github.weisj.jsvg.nodes.Polygon;
/*     */ import com.github.weisj.jsvg.nodes.Polyline;
/*     */ import com.github.weisj.jsvg.nodes.RadialGradient;
/*     */ import com.github.weisj.jsvg.nodes.Rect;
/*     */ import com.github.weisj.jsvg.nodes.SVG;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.nodes.Style;
/*     */ import com.github.weisj.jsvg.nodes.Symbol;
/*     */ import com.github.weisj.jsvg.nodes.Title;
/*     */ import com.github.weisj.jsvg.nodes.Use;
/*     */ import com.github.weisj.jsvg.nodes.View;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.filter.DummyFilterPrimitive;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeBlend;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeColorMatrix;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeComposite;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeDisplacementMap;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeFlood;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeGaussianBlur;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeMerge;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeMergeNode;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeOffset;
/*     */ import com.github.weisj.jsvg.nodes.filter.FeTurbulence;
/*     */ import com.github.weisj.jsvg.nodes.filter.Filter;
/*     */ import com.github.weisj.jsvg.nodes.mesh.MeshGradient;
/*     */ import com.github.weisj.jsvg.nodes.mesh.MeshPatch;
/*     */ import com.github.weisj.jsvg.nodes.mesh.MeshRow;
/*     */ import com.github.weisj.jsvg.nodes.text.Text;
/*     */ import com.github.weisj.jsvg.nodes.text.TextPath;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public final class NodeSupplier {
/*     */   public NodeSupplier() {
/*  49 */     this(new TreeMap<>(String.CASE_INSENSITIVE_ORDER));
/*     */   }
/*     */   private final Map<String, Supplier<SVGNode>> constructorMap;
/*     */   
/*     */   public NodeSupplier(@NotNull Map<String, Supplier<SVGNode>> mapImpl) {
/*  54 */     mapImpl.clear();
/*  55 */     this.constructorMap = mapImpl;
/*     */     
/*  57 */     this.constructorMap.put("a", () -> new Anchor());
/*  58 */     this.constructorMap.put("clippath", () -> new ClipPath());
/*  59 */     this.constructorMap.put("defs", () -> new Defs());
/*  60 */     this.constructorMap.put("g", () -> new Group());
/*  61 */     this.constructorMap.put("image", () -> new Image());
/*  62 */     this.constructorMap.put("marker", () -> new Marker());
/*  63 */     this.constructorMap.put("mask", () -> new Mask());
/*  64 */     this.constructorMap.put("svg", () -> new SVG());
/*  65 */     this.constructorMap.put("style", () -> new Style());
/*  66 */     this.constructorMap.put("symbol", () -> new Symbol());
/*  67 */     this.constructorMap.put("use", () -> new Use());
/*  68 */     this.constructorMap.put("view", () -> new View());
/*     */     
/*  70 */     populateShapeNodeConstructors();
/*  71 */     populatePaintNodeConstructors();
/*  72 */     populateTextNodeConstructors();
/*  73 */     populateFilterNodeConstructors();
/*  74 */     populateAnimationNodeConstructors();
/*  75 */     populateMetaNodeConstructors();
/*  76 */     populateDummyNodeConstructors();
/*     */   }
/*     */   @Nullable
/*     */   public SVGNode create(@NotNull String tagName) {
/*  80 */     Supplier<SVGNode> supplier = this.constructorMap.get(tagName);
/*  81 */     if (supplier == null) return null; 
/*  82 */     return supplier.get();
/*     */   }
/*     */   
/*     */   private void populateShapeNodeConstructors() {
/*  86 */     this.constructorMap.put("circle", () -> new Circle());
/*  87 */     this.constructorMap.put("ellipse", () -> new Ellipse());
/*  88 */     this.constructorMap.put("line", () -> new Line());
/*  89 */     this.constructorMap.put("path", () -> new Path());
/*  90 */     this.constructorMap.put("polygon", () -> new Polygon());
/*  91 */     this.constructorMap.put("polyline", () -> new Polyline());
/*  92 */     this.constructorMap.put("rect", () -> new Rect());
/*     */   }
/*     */   
/*     */   private void populatePaintNodeConstructors() {
/*  96 */     this.constructorMap.put("lineargradient", () -> new LinearGradient());
/*  97 */     this.constructorMap.put("meshgradient", () -> new MeshGradient());
/*  98 */     this.constructorMap.put("meshpatch", () -> new MeshPatch());
/*  99 */     this.constructorMap.put("meshrow", () -> new MeshRow());
/* 100 */     this.constructorMap.put("pattern", () -> new Pattern());
/* 101 */     this.constructorMap.put("radialgradient", () -> new RadialGradient());
/* 102 */     this.constructorMap.put("solidcolor", () -> new SolidColor());
/* 103 */     this.constructorMap.put("stop", () -> new Stop());
/*     */   }
/*     */   
/*     */   private void populateTextNodeConstructors() {
/* 107 */     this.constructorMap.put("text", () -> new Text());
/* 108 */     this.constructorMap.put("textpath", () -> new TextPath());
/* 109 */     this.constructorMap.put("tspan", () -> new TextSpan());
/*     */   }
/*     */   
/*     */   private void populateFilterNodeConstructors() {
/* 113 */     this.constructorMap.put("filter", () -> new Filter());
/* 114 */     this.constructorMap.put("feblend", () -> new FeBlend());
/* 115 */     this.constructorMap.put("fecolormatrix", () -> new FeColorMatrix());
/* 116 */     this.constructorMap.put("fecomposite", () -> new FeComposite());
/* 117 */     this.constructorMap.put("fedisplacementmap", () -> new FeDisplacementMap());
/* 118 */     this.constructorMap.put("feflood", () -> new FeFlood());
/* 119 */     this.constructorMap.put("fegaussianblur", () -> new FeGaussianBlur());
/* 120 */     this.constructorMap.put("feMerge", () -> new FeMerge());
/* 121 */     this.constructorMap.put("feMergeNode", () -> new FeMergeNode());
/* 122 */     this.constructorMap.put("feturbulence", () -> new FeTurbulence());
/* 123 */     this.constructorMap.put("feOffset", () -> new FeOffset());
/*     */   }
/*     */   
/*     */   private void populateAnimationNodeConstructors() {
/* 127 */     this.constructorMap.put("animate", () -> new Animate());
/* 128 */     this.constructorMap.put("animatetransform", () -> new AnimateTransform());
/* 129 */     this.constructorMap.put("set", () -> new Set());
/*     */   }
/*     */   
/*     */   private void populateMetaNodeConstructors() {
/* 133 */     this.constructorMap.put("desc", () -> new Desc());
/* 134 */     this.constructorMap.put("metadata", () -> new Metadata());
/* 135 */     this.constructorMap.put("title", () -> new Title());
/*     */   }
/*     */   
/*     */   private void populateDummyNodeConstructors() {
/* 139 */     this.constructorMap.put("feComponentTransfer", () -> new DummyFilterPrimitive("feComponentTransfer"));
/* 140 */     this.constructorMap.put("feConvolveMatrix", () -> new DummyFilterPrimitive("feConvolveMatrix"));
/* 141 */     this.constructorMap.put("feDiffuseLightning", () -> new DummyFilterPrimitive("feDiffuseLightning"));
/* 142 */     this.constructorMap.put("feDisplacementMap", () -> new DummyFilterPrimitive("feDisplacementMap"));
/* 143 */     this.constructorMap.put("feDropShadow", () -> new DummyFilterPrimitive("feDropShadow"));
/* 144 */     this.constructorMap.put("feFuncA", () -> new DummyFilterPrimitive("feFuncA"));
/* 145 */     this.constructorMap.put("feFuncB", () -> new DummyFilterPrimitive("feFuncB"));
/* 146 */     this.constructorMap.put("feFuncG", () -> new DummyFilterPrimitive("feFuncG"));
/* 147 */     this.constructorMap.put("feFuncR", () -> new DummyFilterPrimitive("feFuncR"));
/* 148 */     this.constructorMap.put("feImage", () -> new DummyFilterPrimitive("feImage"));
/* 149 */     this.constructorMap.put("feMorphology", () -> new DummyFilterPrimitive("feMorphology"));
/* 150 */     this.constructorMap.put("feSpecularLighting", () -> new DummyFilterPrimitive("feSpecularLighting"));
/* 151 */     this.constructorMap.put("feTile", () -> new DummyFilterPrimitive("feTile"));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\NodeSupplier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */