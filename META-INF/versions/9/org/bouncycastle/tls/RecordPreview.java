package META-INF.versions.9.org.bouncycastle.tls;

public final class RecordPreview {
  private final int recordSize;
  
  private final int contentLimit;
  
  static org.bouncycastle.tls.RecordPreview combineAppData(org.bouncycastle.tls.RecordPreview paramRecordPreview1, org.bouncycastle.tls.RecordPreview paramRecordPreview2) {
    return new org.bouncycastle.tls.RecordPreview(paramRecordPreview1.getRecordSize() + paramRecordPreview2.getRecordSize(), paramRecordPreview1.getContentLimit() + paramRecordPreview2.getContentLimit());
  }
  
  static org.bouncycastle.tls.RecordPreview extendRecordSize(org.bouncycastle.tls.RecordPreview paramRecordPreview, int paramInt) {
    return new org.bouncycastle.tls.RecordPreview(paramRecordPreview.getRecordSize() + paramInt, paramRecordPreview.getContentLimit());
  }
  
  RecordPreview(int paramInt1, int paramInt2) {
    this.recordSize = paramInt1;
    this.contentLimit = paramInt2;
  }
  
  public int getApplicationDataLimit() {
    return this.contentLimit;
  }
  
  public int getContentLimit() {
    return this.contentLimit;
  }
  
  public int getRecordSize() {
    return this.recordSize;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\RecordPreview.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */