package burp;

import java.util.Objects;
import java.util.stream.Stream;

class Zlzk {
  static Ztbt ZY(Ztbt... paramVarArgs) {
    Zbqc[] arrayOfZbqc = Ztbt.ZG();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
    return Stream.<Ztbt>of(paramVarArgs).filter(Objects::nonNull).min(new Zm3q()).orElse(Ztbt.STAY_SAME);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */