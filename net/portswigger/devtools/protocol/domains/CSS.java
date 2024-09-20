package net.portswigger.devtools.protocol.domains;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.portswigger.devtools.client.Zf;
import net.portswigger.devtools.client.Zp;
import net.portswigger.devtools.protocol.Zb;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zp;
import net.portswigger.devtools.protocol.Zr;
import net.portswigger.devtools.protocol.Zs;
import net.portswigger.devtools.protocol.Zu;
import net.portswigger.devtools.protocol.Zy;
import net.portswigger.devtools.protocol.events.css.FontsUpdated;
import net.portswigger.devtools.protocol.events.css.MediaQueryResultChanged;
import net.portswigger.devtools.protocol.events.css.StyleSheetAdded;
import net.portswigger.devtools.protocol.events.css.StyleSheetChanged;
import net.portswigger.devtools.protocol.events.css.StyleSheetRemoved;
import net.portswigger.devtools.protocol.types.css.BackgroundColors;
import net.portswigger.devtools.protocol.types.css.CSSComputedStyleProperty;
import net.portswigger.devtools.protocol.types.css.CSSContainerQuery;
import net.portswigger.devtools.protocol.types.css.CSSLayerData;
import net.portswigger.devtools.protocol.types.css.CSSMedia;
import net.portswigger.devtools.protocol.types.css.CSSRule;
import net.portswigger.devtools.protocol.types.css.CSSScope;
import net.portswigger.devtools.protocol.types.css.CSSStyle;
import net.portswigger.devtools.protocol.types.css.CSSSupports;
import net.portswigger.devtools.protocol.types.css.InlineStylesForNode;
import net.portswigger.devtools.protocol.types.css.MatchedStylesForNode;
import net.portswigger.devtools.protocol.types.css.PlatformFontUsage;
import net.portswigger.devtools.protocol.types.css.RuleUsage;
import net.portswigger.devtools.protocol.types.css.SelectorList;
import net.portswigger.devtools.protocol.types.css.SourceRange;
import net.portswigger.devtools.protocol.types.css.StyleDeclarationEdit;
import net.portswigger.devtools.protocol.types.css.TakeCoverageDelta;
import net.portswigger.devtools.protocol.types.css.Value;

@Zy
public interface CSS {
  @Zr("rule")
  CompletableFuture<Zf<CSSRule>> addRule(@Zu("styleSheetId") String paramString1, @Zu("ruleText") String paramString2, @Zu("location") SourceRange paramSourceRange);
  
  @Zr("rule")
  CompletableFuture<Zf<CSSRule>> addRule(@Zu("styleSheetId") String paramString1, @Zu("ruleText") String paramString2, @Zu("location") SourceRange paramSourceRange, @Zy @Zj @Zu("nodeForPropertySyntaxValidation") Integer paramInteger);
  
  @Zr("classNames")
  CompletableFuture<Zf<List<String>>> collectClassNames(@Zu("styleSheetId") String paramString);
  
  @Zr("styleSheetId")
  CompletableFuture<Zf<String>> createStyleSheet(@Zu("frameId") String paramString);
  
  CompletableFuture<Zf<Void>> disable();
  
  CompletableFuture<Zf<Void>> enable();
  
  CompletableFuture<Zf<Void>> forcePseudoState(@Zu("nodeId") Integer paramInteger, @Zu("forcedPseudoClasses") List<String> paramList);
  
  CompletableFuture<Zf<BackgroundColors>> getBackgroundColors(@Zu("nodeId") Integer paramInteger);
  
  @Zr("computedStyle")
  CompletableFuture<Zf<List<CSSComputedStyleProperty>>> getComputedStyleForNode(@Zu("nodeId") Integer paramInteger);
  
  CompletableFuture<Zf<InlineStylesForNode>> getInlineStylesForNode(@Zu("nodeId") Integer paramInteger);
  
  CompletableFuture<Zf<MatchedStylesForNode>> getMatchedStylesForNode(@Zu("nodeId") Integer paramInteger);
  
  @Zr("medias")
  CompletableFuture<Zf<List<CSSMedia>>> getMediaQueries();
  
  @Zr("fonts")
  CompletableFuture<Zf<List<PlatformFontUsage>>> getPlatformFontsForNode(@Zu("nodeId") Integer paramInteger);
  
  @Zr("text")
  CompletableFuture<Zf<String>> getStyleSheetText(@Zu("styleSheetId") String paramString);
  
  @Zy
  @Zr("rootLayer")
  CompletableFuture<Zf<CSSLayerData>> getLayersForNode(@Zu("nodeId") Integer paramInteger);
  
  @Zy
  @Zr("ranges")
  CompletableFuture<Zf<List<SourceRange>>> getLocationForSelector(@Zu("styleSheetId") String paramString1, @Zu("selectorText") String paramString2);
  
  @Zy
  CompletableFuture<Zf<Void>> trackComputedStyleUpdates(@Zu("propertiesToTrack") List<CSSComputedStyleProperty> paramList);
  
  @Zy
  @Zr("nodeIds")
  CompletableFuture<Zf<List<Integer>>> takeComputedStyleUpdates();
  
  CompletableFuture<Zf<Void>> setEffectivePropertyValueForNode(@Zu("nodeId") Integer paramInteger, @Zu("propertyName") String paramString1, @Zu("value") String paramString2);
  
  @Zr("propertyName")
  CompletableFuture<Zf<Value>> setPropertyRulePropertyName(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("propertyName") String paramString2);
  
  @Zr("keyText")
  CompletableFuture<Zf<Value>> setKeyframeKey(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("keyText") String paramString2);
  
  @Zr("media")
  CompletableFuture<Zf<CSSMedia>> setMediaText(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("text") String paramString2);
  
  @Zy
  @Zr("containerQuery")
  CompletableFuture<Zf<CSSContainerQuery>> setContainerQueryText(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("text") String paramString2);
  
  @Zy
  @Zr("supports")
  CompletableFuture<Zf<CSSSupports>> setSupportsText(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("text") String paramString2);
  
  @Zy
  @Zr("scope")
  CompletableFuture<Zf<CSSScope>> setScopeText(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("text") String paramString2);
  
  @Zr("selectorList")
  CompletableFuture<Zf<SelectorList>> setRuleSelector(@Zu("styleSheetId") String paramString1, @Zu("range") SourceRange paramSourceRange, @Zu("selector") String paramString2);
  
  @Zr("sourceMapURL")
  CompletableFuture<Zf<String>> setStyleSheetText(@Zu("styleSheetId") String paramString1, @Zu("text") String paramString2);
  
  @Zr("styles")
  CompletableFuture<Zf<List<CSSStyle>>> setStyleTexts(@Zu("edits") List<StyleDeclarationEdit> paramList);
  
  @Zr("styles")
  CompletableFuture<Zf<List<CSSStyle>>> setStyleTexts(@Zu("edits") List<StyleDeclarationEdit> paramList, @Zy @Zj @Zu("nodeForPropertySyntaxValidation") Integer paramInteger);
  
  CompletableFuture<Zf<Void>> startRuleUsageTracking();
  
  @Zr("ruleUsage")
  CompletableFuture<Zf<List<RuleUsage>>> stopRuleUsageTracking();
  
  CompletableFuture<Zf<TakeCoverageDelta>> takeCoverageDelta();
  
  @Zy
  CompletableFuture<Zf<Void>> setLocalFontsEnabled(@Zu("enabled") Boolean paramBoolean);
  
  @Zb("fontsUpdated")
  Zs onFontsUpdated(Zp<FontsUpdated> paramZp) throws Zp;
  
  @Zb("mediaQueryResultChanged")
  Zs onMediaQueryResultChanged(Zp<MediaQueryResultChanged> paramZp) throws Zp;
  
  @Zb("styleSheetAdded")
  Zs onStyleSheetAdded(Zp<StyleSheetAdded> paramZp) throws Zp;
  
  @Zb("styleSheetChanged")
  Zs onStyleSheetChanged(Zp<StyleSheetChanged> paramZp) throws Zp;
  
  @Zb("styleSheetRemoved")
  Zs onStyleSheetRemoved(Zp<StyleSheetRemoved> paramZp) throws Zp;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\domains\CSS.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */