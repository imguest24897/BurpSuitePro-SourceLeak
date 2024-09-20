package net.portswigger.browser;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Zt8 {
  Zjw ZV() throws Ztk;
  
  Zjw Zn(String paramString, Ze... paramVarArgs) throws Ztk;
  
  boolean ZE(Zjw paramZjw);
  
  default boolean Ze() {
    return Zy().stream().map(this::ZE).allMatch(Predicate.isEqual(Boolean.valueOf(true)));
  }
  
  default Optional<Zjw> Zc() {
    return Optional.ofNullable(Zy().peekLast());
  }
  
  default Deque<Zjw> Zy() {
    Objects.requireNonNull(Zjw.class);
    return new ArrayDeque<>(ZJ(Zf.ZF()).<Zjw>map(Zjw.class::cast).toList());
  }
  
  Collection<Zjc> Zz();
  
  default long ZA() {
    return Zz().size();
  }
  
  default Stream<Zjc> ZJ(Predicate<? super Zjc> paramPredicate) {
    return Zz().stream().filter(paramPredicate);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zt8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */