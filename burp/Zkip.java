package burp;

import net.portswigger.Zsy;

class Zkip extends Zkud {
  Zkip(Zsy paramZsy) {
    super(paramZsy);
  }
  
  protected boolean ZL(Zxaq paramZxaq, String paramString) {
    return (paramZxaq == Zxaq.RANGE);
  }
  
  protected String ZX(Zmlc paramZmlc) {
    return Integer.toString(((Integer)paramZmlc.ZC().orElse(Integer.valueOf(0))).intValue());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkip.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */