package burp;

import burp.api.montoya.utilities.RandomUtils;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import net.portswigger.Zs6;

public class Zm3t implements RandomUtils {
  private final Zs6<Random> ZF = new Zs6(new Random());
  
  public String randomString(int paramInt) {
    return randomString(paramInt, new RandomUtils.CharacterSet[] { RandomUtils.CharacterSet.ASCII_LETTERS, RandomUtils.CharacterSet.DIGITS });
  }
  
  public String randomString(int paramInt, String paramString) {
    return randomString(paramInt, paramInt, paramString);
  }
  
  public String randomString(int paramInt, RandomUtils.CharacterSet... paramVarArgs) {
    return randomString(paramInt, paramInt, paramVarArgs);
  }
  
  public String randomString(int paramInt1, int paramInt2, RandomUtils.CharacterSet... paramVarArgs) {
    return randomString(paramInt1, paramInt2, Arrays.<RandomUtils.CharacterSet>stream(paramVarArgs).map(Zm3t::lambda$randomString$0).collect(Collectors.joining()));
  }
  
  public String randomString(int paramInt1, int paramInt2, String paramString) {
    String str = this.ZF.Zi().Zc(paramString.toCharArray()).ZK(paramInt2);
    if (paramInt2 != paramInt1) {
      int i = this.ZF.ZP().ZO(0).Zr(paramInt2 - paramInt1 + 1).Zc();
      return str.substring(i);
    } 
    return str;
  }
  
  private static String lambda$randomString$0(RandomUtils.CharacterSet paramCharacterSet) {
    return paramCharacterSet.characters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm3t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */