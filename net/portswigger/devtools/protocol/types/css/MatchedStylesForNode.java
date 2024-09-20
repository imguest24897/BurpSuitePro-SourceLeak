package net.portswigger.devtools.protocol.types.css;

import burp.Zbqc;
import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.css.MatchedStylesForNode")
public class MatchedStylesForNode {
  @Zvd(Zp = "inlineStyle")
  @Zj
  public final CSSStyle inlineStyle;
  
  @Zvd(Zp = "attributesStyle")
  @Zj
  public final CSSStyle attributesStyle;
  
  @Zvd(Zp = "matchedCSSRules")
  @Zj
  public final List<RuleMatch> matchedCSSRules;
  
  @Zvd(Zp = "pseudoElements")
  @Zj
  public final List<PseudoElementMatches> pseudoElements;
  
  @Zvd(Zp = "inherited")
  @Zj
  public final List<InheritedStyleEntry> inherited;
  
  @Zvd(Zp = "inheritedPseudoElements")
  @Zj
  public final List<InheritedPseudoElementMatches> inheritedPseudoElements;
  
  @Zvd(Zp = "cssKeyframesRules")
  @Zj
  public final List<CSSKeyframesRule> cssKeyframesRules;
  
  @Zvd(Zp = "cssPositionFallbackRules")
  @Deprecated
  @Zj
  public final List<CSSPositionFallbackRule> cssPositionFallbackRules;
  
  @Zvd(Zp = "cssPositionTryRules")
  @Zj
  public final List<CSSPositionTryRule> cssPositionTryRules;
  
  @Zvd(Zp = "activePositionFallbackIndex")
  @Zj
  public final Integer activePositionFallbackIndex;
  
  @Zvd(Zp = "cssPropertyRules")
  @Zj
  public final List<CSSPropertyRule> cssPropertyRules;
  
  @Zvd(Zp = "cssPropertyRegistrations")
  @Zj
  public final List<CSSPropertyRegistration> cssPropertyRegistrations;
  
  @Zvd(Zp = "cssFontPaletteValuesRule")
  @Zj
  public final CSSFontPaletteValuesRule cssFontPaletteValuesRule;
  
  @Zvd(Zp = "parentLayoutNodeId")
  @Zy
  @Zj
  public final Integer parentLayoutNodeId;
  
  @Zox
  public MatchedStylesForNode(@Zc5(Ze = "inlineStyle", ZS = "null") CSSStyle paramCSSStyle1, @Zc5(Ze = "attributesStyle", ZS = "null") CSSStyle paramCSSStyle2, @Zc5(Ze = "matchedCSSRules", ZS = "null") List<RuleMatch> paramList, @Zc5(Ze = "pseudoElements", ZS = "null") List<PseudoElementMatches> paramList1, @Zc5(Ze = "inherited", ZS = "null") List<InheritedStyleEntry> paramList2, @Zc5(Ze = "inheritedPseudoElements", ZS = "null") List<InheritedPseudoElementMatches> paramList3, @Zc5(Ze = "cssKeyframesRules", ZS = "null") List<CSSKeyframesRule> paramList4, @Zc5(Ze = "cssPositionFallbackRules", ZS = "null") List<CSSPositionFallbackRule> paramList5, @Zc5(Ze = "cssPositionTryRules", ZS = "null") List<CSSPositionTryRule> paramList6, @Zc5(Ze = "activePositionFallbackIndex", ZS = "null") Integer paramInteger1, @Zc5(Ze = "cssPropertyRules", ZS = "null") List<CSSPropertyRule> paramList7, @Zc5(Ze = "cssPropertyRegistrations", ZS = "null") List<CSSPropertyRegistration> paramList8, @Zc5(Ze = "cssFontPaletteValuesRule", ZS = "null") CSSFontPaletteValuesRule paramCSSFontPaletteValuesRule, @Zc5(Ze = "parentLayoutNodeId", ZS = "null") Integer paramInteger2) {
    this.inlineStyle = paramCSSStyle1;
    this.attributesStyle = paramCSSStyle2;
    this.matchedCSSRules = paramList;
    this.pseudoElements = paramList1;
    this.inherited = paramList2;
    boolean bool = Value.Zo();
    this.inheritedPseudoElements = paramList3;
    this.cssKeyframesRules = paramList4;
    this.cssPositionFallbackRules = paramList5;
    this.cssPositionTryRules = paramList6;
    this.activePositionFallbackIndex = paramInteger1;
    this.cssPropertyRules = paramList7;
    this.cssPropertyRegistrations = paramList8;
    this.cssFontPaletteValuesRule = paramCSSFontPaletteValuesRule;
    this.parentLayoutNodeId = paramInteger2;
    if (Zbqc.Zwu() == null)
      Value.Zs(!bool); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\MatchedStylesForNode.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */