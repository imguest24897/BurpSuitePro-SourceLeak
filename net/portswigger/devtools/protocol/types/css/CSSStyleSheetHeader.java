package net.portswigger.devtools.protocol.types.css;

import burp.Zbqc;
import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zj;
import net.portswigger.devtools.protocol.Zy;

@Zsi("net.portswigger.devtools.protocol.types.css.CSSStyleSheetHeader")
public class CSSStyleSheetHeader {
  @Zvd(Zp = "styleSheetId")
  public final String styleSheetId;
  
  @Zvd(Zp = "frameId")
  public final String frameId;
  
  @Zvd(Zp = "sourceURL")
  public final String sourceURL;
  
  @Zvd(Zp = "sourceMapURL")
  @Zj
  public final String sourceMapURL;
  
  @Zvd(Zp = "origin")
  public final StyleSheetOrigin origin;
  
  @Zvd(Zp = "title")
  public final String title;
  
  @Zvd(Zp = "ownerNode")
  @Zj
  public final Integer ownerNode;
  
  @Zvd(Zp = "disabled")
  public final Boolean disabled;
  
  @Zvd(Zp = "hasSourceURL")
  @Zj
  public final Boolean hasSourceURL;
  
  @Zvd(Zp = "isInline")
  public final Boolean isInline;
  
  @Zvd(Zp = "isMutable")
  public final Boolean isMutable;
  
  @Zvd(Zp = "isConstructed")
  public final Boolean isConstructed;
  
  @Zvd(Zp = "startLine")
  public final Double startLine;
  
  @Zvd(Zp = "startColumn")
  public final Double startColumn;
  
  @Zvd(Zp = "length")
  public final Double length;
  
  @Zvd(Zp = "endLine")
  public final Double endLine;
  
  @Zvd(Zp = "endColumn")
  public final Double endColumn;
  
  @Zvd(Zp = "loadingFailed")
  @Zy
  @Zj
  public final Boolean loadingFailed;
  
  @Zox
  public CSSStyleSheetHeader(@Zc5(Ze = "styleSheetId") String paramString1, @Zc5(Ze = "frameId") String paramString2, @Zc5(Ze = "sourceURL") String paramString3, @Zc5(Ze = "sourceMapURL", ZS = "null") String paramString4, @Zc5(Ze = "origin") StyleSheetOrigin paramStyleSheetOrigin, @Zc5(Ze = "title") String paramString5, @Zc5(Ze = "ownerNode", ZS = "null") Integer paramInteger, @Zc5(Ze = "disabled") Boolean paramBoolean1, @Zc5(Ze = "hasSourceURL", ZS = "null") Boolean paramBoolean2, @Zc5(Ze = "isInline") Boolean paramBoolean3, @Zc5(Ze = "isMutable") Boolean paramBoolean4, @Zc5(Ze = "isConstructed") Boolean paramBoolean5, @Zc5(Ze = "startLine") Double paramDouble1, @Zc5(Ze = "startColumn") Double paramDouble2, @Zc5(Ze = "length") Double paramDouble3, @Zc5(Ze = "endLine") Double paramDouble4, @Zc5(Ze = "endColumn") Double paramDouble5, @Zc5(Ze = "loadingFailed", ZS = "null") Boolean paramBoolean6) {
    this.styleSheetId = paramString1;
    this.frameId = paramString2;
    this.sourceURL = paramString3;
    boolean bool = Value.ZH();
    this.sourceMapURL = paramString4;
    this.origin = paramStyleSheetOrigin;
    this.title = paramString5;
    this.ownerNode = paramInteger;
    this.disabled = paramBoolean1;
    this.hasSourceURL = paramBoolean2;
    this.isInline = paramBoolean3;
    this.isMutable = paramBoolean4;
    this.isConstructed = paramBoolean5;
    this.startLine = paramDouble1;
    this.startColumn = paramDouble2;
    this.length = paramDouble3;
    this.endLine = paramDouble4;
    this.endColumn = paramDouble5;
    this.loadingFailed = paramBoolean6;
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\css\CSSStyleSheetHeader.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */