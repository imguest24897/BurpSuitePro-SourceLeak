package com.fasterxml;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.function.Function;

public class Zvn {
  final Function<Duration, Long> Zk;
  
  final Function<Long, Duration> ZC;
  
  Zvn(Function<Duration, Long> paramFunction, Function<Long, Duration> paramFunction1) {
    this.Zk = paramFunction;
    this.ZC = paramFunction1;
  }
  
  static Function<Long, Duration> ZP(TemporalUnit paramTemporalUnit) {
    return paramTemporalUnit::lambda$deserializer$0;
  }
  
  private static Duration lambda$deserializer$0(TemporalUnit paramTemporalUnit, Long paramLong) {
    return Duration.of(paramLong.longValue(), paramTemporalUnit);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zvn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */