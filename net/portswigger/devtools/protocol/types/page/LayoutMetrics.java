package net.portswigger.devtools.protocol.types.page;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.types.dom.Rect;

@Zsi("net.portswigger.devtools.protocol.types.page.LayoutMetrics")
public class LayoutMetrics {
  @Zvd(Zp = "layoutViewport")
  @Deprecated
  public final LayoutViewport layoutViewport;
  
  @Zvd(Zp = "visualViewport")
  @Deprecated
  public final VisualViewport visualViewport;
  
  @Zvd(Zp = "contentSize")
  @Deprecated
  public final Rect contentSize;
  
  @Zvd(Zp = "cssLayoutViewport")
  public final LayoutViewport cssLayoutViewport;
  
  @Zvd(Zp = "cssVisualViewport")
  public final VisualViewport cssVisualViewport;
  
  @Zvd(Zp = "cssContentSize")
  public final Rect cssContentSize;
  
  @Zox
  public LayoutMetrics(@Zc5(Ze = "layoutViewport") LayoutViewport paramLayoutViewport1, @Zc5(Ze = "visualViewport") VisualViewport paramVisualViewport1, @Zc5(Ze = "contentSize") Rect paramRect1, @Zc5(Ze = "cssLayoutViewport") LayoutViewport paramLayoutViewport2, @Zc5(Ze = "cssVisualViewport") VisualViewport paramVisualViewport2, @Zc5(Ze = "cssContentSize") Rect paramRect2) {
    this.layoutViewport = paramLayoutViewport1;
    this.visualViewport = paramVisualViewport1;
    this.contentSize = paramRect1;
    this.cssLayoutViewport = paramLayoutViewport2;
    this.cssVisualViewport = paramVisualViewport2;
    this.cssContentSize = paramRect2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\types\page\LayoutMetrics.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */