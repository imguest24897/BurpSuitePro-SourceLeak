package burp;

import burp.api.montoya.sitemap.SiteMapFilter;
import burp.api.montoya.sitemap.SiteMapNode;

public class Ze_x {
  static SiteMapFilter ZP(String paramString) {
    return paramString::lambda$prefixFilter$0;
  }
  
  private static boolean lambda$prefixFilter$0(String paramString, SiteMapNode paramSiteMapNode) {
    return (paramString == null || paramSiteMapNode.url().startsWith(paramString));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_x.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */