package net.portswigger;

import java.util.Optional;
import java.util.function.BiFunction;

public class Zn4 {
  public static <T1, T2, R> Optional<R> ZS(Optional<T1> paramOptional, Optional<T2> paramOptional1, BiFunction<T1, T2, R> paramBiFunction) {
    return (paramOptional.isPresent() && paramOptional1.isPresent()) ? Optional.of(paramBiFunction.apply(paramOptional.get(), paramOptional1.get())) : Optional.empty();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */