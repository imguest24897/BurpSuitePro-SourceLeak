package burp;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Ztgr {
  private final Map<String, Matcher> ZQ = new HashMap<>();
  
  public Matcher ZP(String paramString) throws PatternSyntaxException {
    try {
      if (this.ZQ.containsKey(paramString))
        return this.ZQ.get(paramString); 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Matcher matcher = Pattern.compile(paramString, 34).matcher("");
    this.ZQ.put(paramString, matcher);
    return matcher;
  }
  
  private static PatternSyntaxException a(PatternSyntaxException paramPatternSyntaxException) {
    return paramPatternSyntaxException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */