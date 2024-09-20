package javafx.collections;

public interface ObservableFloatArray extends ObservableArray<ObservableFloatArray> {
  void copyTo(int paramInt1, float[] paramArrayOffloat, int paramInt2, int paramInt3);
  
  void copyTo(int paramInt1, ObservableFloatArray paramObservableFloatArray, int paramInt2, int paramInt3);
  
  float get(int paramInt);
  
  void addAll(float... paramVarArgs);
  
  void addAll(ObservableFloatArray paramObservableFloatArray);
  
  void addAll(float[] paramArrayOffloat, int paramInt1, int paramInt2);
  
  void addAll(ObservableFloatArray paramObservableFloatArray, int paramInt1, int paramInt2);
  
  void setAll(float... paramVarArgs);
  
  void setAll(float[] paramArrayOffloat, int paramInt1, int paramInt2);
  
  void setAll(ObservableFloatArray paramObservableFloatArray);
  
  void setAll(ObservableFloatArray paramObservableFloatArray, int paramInt1, int paramInt2);
  
  void set(int paramInt1, float[] paramArrayOffloat, int paramInt2, int paramInt3);
  
  void set(int paramInt1, ObservableFloatArray paramObservableFloatArray, int paramInt2, int paramInt3);
  
  void set(int paramInt, float paramFloat);
  
  float[] toArray(float[] paramArrayOffloat);
  
  float[] toArray(int paramInt1, float[] paramArrayOffloat, int paramInt2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableFloatArray.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */