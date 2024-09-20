package org.bouncycastle.tsp.ers;

import java.util.Date;
import org.bouncycastle.util.Selector;

public class ERSEvidenceRecordSelector implements Selector<ERSEvidenceRecord> {
  private final ERSData data;
  
  private final Date date;
  
  public ERSEvidenceRecordSelector(ERSData paramERSData) {
    this(paramERSData, new Date());
  }
  
  public ERSEvidenceRecordSelector(ERSData paramERSData, Date paramDate) {
    this.data = paramERSData;
    this.date = new Date(paramDate.getTime());
  }
  
  public ERSData getData() {
    return this.data;
  }
  
  public boolean match(ERSEvidenceRecord paramERSEvidenceRecord) {
    try {
      if (paramERSEvidenceRecord.isContaining(this.data, this.date))
        try {
          paramERSEvidenceRecord.validatePresent(this.data, this.date);
          return true;
        } catch (Exception exception) {
          return false;
        }  
      return false;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public Object clone() {
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSEvidenceRecordSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */