package org.bouncycastle.tls;

public final class RecordPreview {
  private final int recordSize;
  
  private final int contentLimit;
  
  static RecordPreview combineAppData(RecordPreview paramRecordPreview1, RecordPreview paramRecordPreview2) {
    return new RecordPreview(paramRecordPreview1.getRecordSize() + paramRecordPreview2.getRecordSize(), paramRecordPreview1.getContentLimit() + paramRecordPreview2.getContentLimit());
  }
  
  static RecordPreview extendRecordSize(RecordPreview paramRecordPreview, int paramInt) {
    return new RecordPreview(paramRecordPreview.getRecordSize() + paramInt, paramRecordPreview.getContentLimit());
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\RecordPreview.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */