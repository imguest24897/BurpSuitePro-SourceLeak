package burp;

import java.util.List;

public interface IResponseVariations {
  List<String> getVariantAttributes();
  
  List<String> getInvariantAttributes();
  
  int getAttributeValue(String paramString, int paramInt);
  
  void updateWith(byte[]... paramVarArgs);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\IResponseVariations.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */