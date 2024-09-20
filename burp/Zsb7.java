package burp;

import java.io.Serializable;
import java.util.Comparator;

class Zsb7 implements Comparator, Serializable {
  public int compare(Object paramObject1, Object paramObject2) {
    String str1 = (paramObject1 instanceof String) ? (String)paramObject1 : ((Zmy1)paramObject1).ZG();
    String str2 = (paramObject2 instanceof String) ? (String)paramObject2 : ((Zmy1)paramObject2).ZG();
    return String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsb7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */