package burp;

import java.util.EnumSet;
import java.util.Map;

class Zz8g {
  private static final Zxr5 ZN = new Zxr5(Zt9p.NO_HTML_AND_NO_HEADER, EnumSet.of(Zklf.EDGE, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11));
  
  private static final Zxr5 ZJ = new Zxr5(Zt9p.HTML_AND_NO_HEADER, EnumSet.of(Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11));
  
  private static final Zxr5 Zv = new Zxr5(Zt9p.HTML_AND_NO_HEADER, EnumSet.of(Zklf.EDGE, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11));
  
  private static final Zxr5 ZP = new Zxr5(Zt9p.NO_HTML_AND_NO_HEADER, EnumSet.of(Zklf.SAFARI, Zklf.OPERA, Zklf.CHROME, Zklf.FIREFOX));
  
  private static final Zxr5 ZB = new Zxr5(Zt9p.HTML_AND_NO_HEADER, EnumSet.of(Zklf.SAFARI, Zklf.OPERA, Zklf.CHROME, Zklf.FIREFOX));
  
  private static final Zxr5 ZS = new Zxr5(Zt9p.NO_HTML_AND_HEADER, EnumSet.of(Zklf.FIREFOX));
  
  private static final Zxr5 Zo = new Zxr5(Zt9p.HTML_AND_HEADER, EnumSet.of(Zklf.FIREFOX));
  
  private static final Zxr5 Zp = new Zxr5(Zt9p.HTML_AND_NO_HEADER, EnumSet.of(Zklf.SAFARI, new Zklf[] { Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11, Zklf.OPERA, Zklf.CHROME, Zklf.FIREFOX }));
  
  private static final Zxr5 ZA = new Zxr5(Zt9p.NO_HTML_AND_NO_HEADER, EnumSet.of(Zklf.EDGE, new Zklf[] { Zklf.SAFARI, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11, Zklf.OPERA, Zklf.CHROME, Zklf.FIREFOX }));
  
  private static final Zxr5 Zx = new Zxr5(Zt9p.HTML_AND_NO_HEADER, EnumSet.of(Zklf.EDGE, new Zklf[] { Zklf.SAFARI, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11, Zklf.OPERA, Zklf.CHROME, Zklf.FIREFOX }));
  
  private static final Zxr5 Zj = new Zxr5(Zt9p.HTML_AND_NO_HEADER, EnumSet.of(Zklf.SAFARI, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11, Zklf.OPERA, Zklf.CHROME));
  
  static final Zg8e ZX = Zw(new Zxr5[] { ZA, Zx, new Zxr5(Zt9p.NO_HTML_AND_HEADER, EnumSet.of(Zklf.EDGE, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11, Zklf.FIREFOX)), new Zxr5(Zt9p.HTML_AND_HEADER, EnumSet.of(Zklf.EDGE, Zklf.IE11_COMPATIBILITY_MODE, Zklf.IE11, Zklf.FIREFOX)) });
  
  static final Zg8e Zt = Zw(new Zxr5[] { ZP, Zp, ZS, Zo });
  
  static final Zg8e ZM = Zw(new Zxr5[] { ZJ });
  
  private static final Zg8e Zg = new Zg8a();
  
  static final Map<String, Zg8e> Zy = new Zg5r();
  
  private static Zg8e Zw(Zxr5... paramVarArgs) {
    return new Zg8e(paramVarArgs);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */