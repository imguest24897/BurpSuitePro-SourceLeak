package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.EvidenceRecord;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.tsp.TSPException;

public class ERSEvidenceRecordGenerator {
  private final DigestCalculatorProvider digCalcProv;
  
  public ERSEvidenceRecordGenerator(DigestCalculatorProvider paramDigestCalculatorProvider) {
    this.digCalcProv = paramDigestCalculatorProvider;
  }
  
  public ERSEvidenceRecord generate(ERSArchiveTimeStamp paramERSArchiveTimeStamp) throws TSPException, ERSException {
    return new ERSEvidenceRecord(new EvidenceRecord(null, null, paramERSArchiveTimeStamp.toASN1Structure()), this.digCalcProv);
  }
  
  public List<ERSEvidenceRecord> generate(List<ERSArchiveTimeStamp> paramList) throws TSPException, ERSException {
    ArrayList<ERSEvidenceRecord> arrayList = new ArrayList(paramList.size());
    for (byte b = 0; b != paramList.size(); b++)
      arrayList.add(new ERSEvidenceRecord(new EvidenceRecord(null, null, ((ERSArchiveTimeStamp)paramList.get(b)).toASN1Structure()), this.digCalcProv)); 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tsp\ers\ERSEvidenceRecordGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */