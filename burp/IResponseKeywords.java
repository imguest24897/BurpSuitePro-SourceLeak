package burp;

import java.util.List;

public interface IResponseKeywords {
  List<String> getVariantKeywords();
  
  List<String> getInvariantKeywords();
  
  int getKeywordCount(String paramString, int paramInt);
  
  void updateWith(byte[]... paramVarArgs);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IResponseKeywords.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */