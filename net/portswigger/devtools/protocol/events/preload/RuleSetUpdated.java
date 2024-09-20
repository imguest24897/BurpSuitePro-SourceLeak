package net.portswigger.devtools.protocol.events.preload;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;
import net.portswigger.devtools.protocol.Zl;
import net.portswigger.devtools.protocol.types.preload.RuleSet;

@Zsi("net.portswigger.devtools.protocol.events.preload.RuleSetUpdated")
public class RuleSetUpdated implements Zl {
  @Zvd(Zp = "ruleSet")
  public final RuleSet ruleSet;
  
  private static int[] Zk;
  
  @Zox
  public RuleSetUpdated(@Zc5(Ze = "ruleSet") RuleSet paramRuleSet) {
    this.ruleSet = paramRuleSet;
  }
  
  public static void Zb(int[] paramArrayOfint) {
    Zk = paramArrayOfint;
  }
  
  public static int[] Zl() {
    return Zk;
  }
  
  static {
    if (Zl() == null)
      Zb(new int[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\protocol\events\preload\RuleSetUpdated.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */