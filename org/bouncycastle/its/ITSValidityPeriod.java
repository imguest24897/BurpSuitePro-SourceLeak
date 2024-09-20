package org.bouncycastle.its;

import java.util.Date;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT16;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.ValidityPeriod;

public class ITSValidityPeriod {
  private final long startDate;
  
  private final UINT16 duration;
  
  private final Unit timeUnit;
  
  public static Builder from(Date paramDate) {
    return new Builder(paramDate);
  }
  
  public ITSValidityPeriod(ValidityPeriod paramValidityPeriod) {
    this.startDate = paramValidityPeriod.getStart().getValue().longValue();
    Duration duration = paramValidityPeriod.getDuration();
    this.duration = duration.getDuration();
    this.timeUnit = Unit.values()[duration.getChoice()];
  }
  
  ITSValidityPeriod(long paramLong, UINT16 paramUINT16, Unit paramUnit) {
    this.startDate = paramLong;
    this.duration = paramUINT16;
    this.timeUnit = paramUnit;
  }
  
  public Date getStartDate() {
    return new Date(this.startDate);
  }
  
  public ValidityPeriod toASN1Structure() {
    return ValidityPeriod.builder().setStart(new Time32(this.startDate / 1000L)).setDuration(new Duration(this.timeUnit.unitTag, this.duration)).createValidityPeriod();
  }
  
  public static class Builder {
    private final long startDate;
    
    Builder(Date param1Date) {
      this.startDate = param1Date.getTime();
    }
    
    public ITSValidityPeriod plusYears(int param1Int) {
      return new ITSValidityPeriod(this.startDate, UINT16.valueOf(param1Int), ITSValidityPeriod.Unit.years);
    }
    
    public ITSValidityPeriod plusSixtyHours(int param1Int) {
      return new ITSValidityPeriod(this.startDate, UINT16.valueOf(param1Int), ITSValidityPeriod.Unit.sixtyHours);
    }
  }
  
  public enum Unit {
    microseconds(0),
    milliseconds(1),
    seconds(2),
    minutes(3),
    hours(4),
    sixtyHours(5),
    years(6);
    
    private final int unitTag;
    
    Unit(int param1Int1) {
      this.unitTag = param1Int1;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSValidityPeriod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */