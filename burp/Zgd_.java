package burp;

import java.util.Optional;
import java.util.function.BiFunction;

class Zgd_ {
  private final Zxcs Zw = new Zxcs();
  
  private final Zxcs Zs = new Zxcs();
  
  @SafeVarargs
  public final Optional<Zrwz> Zj(BiFunction<Zxcs, Zxcs, Zsb8>... paramVarArgs) {
    BiFunction<Zxcs, Zxcs, Zsb8>[] arrayOfBiFunction = paramVarArgs;
    int i = arrayOfBiFunction.length;
    byte b = 0;
    Zbqc[] arrayOfZbqc = Zg3o.ZN();
    while (b < i) {
      BiFunction<Zxcs, Zxcs, Zsb8> biFunction = arrayOfBiFunction[b];
      Zsb8 zsb8 = biFunction.apply(this.Zw, this.Zs);
      if (zsb8 != null)
        return Optional.of(new Zrwz(zsb8, this.Zw, this.Zs)); 
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
    return Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */