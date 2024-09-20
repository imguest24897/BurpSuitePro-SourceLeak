package net.portswigger.devtools.protocol.types.css;

import java.util.List;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSRule")
public class CSSRule {
  @Zvd(Zp = "styleSheetId")
  @Zj
  public final String styleSheetId;
  
  @Zvd(Zp = "selectorList")
  public final SelectorList selectorList;
  
  @Zvd(Zp = "nestingSelectors")
  @Zy
  @Zj
  public final List<String> nestingSelectors;
  
  @Zvd(Zp = "origin")
  public final StyleSheetOrigin origin;
  
  @Zvd(Zp = "style")
  public final CSSStyle style;
  
  @Zvd(Zp = "media")
  @Zj
  public final List<CSSMedia> media;
  
  @Zvd(Zp = "containerQueries")
  @Zy
  @Zj
  public final List<CSSContainerQuery> containerQueries;
  
  @Zvd(Zp = "supports")
  @Zy
  @Zj
  public final List<CSSSupports> supports;
  
  @Zvd(Zp = "layers")
  @Zy
  @Zj
  public final List<CSSLayer> layers;
  
  @Zvd(Zp = "scopes")
  @Zy
  @Zj
  public final List<CSSScope> scopes;
  
  @Zvd(Zp = "ruleTypes")
  @Zy
  @Zj
  public final List<CSSRuleType> ruleTypes;
  
  @Zox
  public CSSRule(@Zc5(Ze = "styleSheetId", ZS = "null") String paramString, @Zc5(Ze = "selectorList") SelectorList paramSelectorList, @Zc5(Ze = "nestingSelectors", ZS = "null") List<String> paramList, @Zc5(Ze = "origin") StyleSheetOrigin paramStyleSheetOrigin, @Zc5(Ze = "style") CSSStyle paramCSSStyle, @Zc5(Ze = "media", ZS = "null") List<CSSMedia> paramList1, @Zc5(Ze = "containerQueries", ZS = "null") List<CSSContainerQuery> paramList2, @Zc5(Ze = "supports", ZS = "null") List<CSSSupports> paramList3, @Zc5(Ze = "layers", ZS = "null") List<CSSLayer> paramList4, @Zc5(Ze = "scopes", ZS = "null") List<CSSScope> paramList5, @Zc5(Ze = "ruleTypes", ZS = "null") List<CSSRuleType> paramList6) {
    this.styleSheetId = paramString;
    this.selectorList = paramSelectorList;
    this.nestingSelectors = paramList;
    this.origin = paramStyleSheetOrigin;
    this.style = paramCSSStyle;
    this.media = paramList1;
    this.containerQueries = paramList2;
    this.supports = paramList3;
    this.layers = paramList4;
    this.scopes = paramList5;
    this.ruleTypes = paramList6;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSRule.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */