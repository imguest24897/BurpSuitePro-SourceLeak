package net.portswigger;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class Zud {
  @SafeVarargs
  public static <T> Stream<T> Zj(Stream<T>... paramVarArgs) {
    return Arrays.<Stream<T>>stream(paramVarArgs).flatMap(Function.identity());
  }
  
  public static <T> Stream<T> ZK(T paramT) {
    return Optional.<T>ofNullable(paramT).map(Stream::of).orElseGet(Stream::empty);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zud.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */