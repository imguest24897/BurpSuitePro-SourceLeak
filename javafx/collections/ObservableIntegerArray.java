package javafx.collections;

public interface ObservableIntegerArray extends ObservableArray<ObservableIntegerArray> {
  void copyTo(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3);
  
  void copyTo(int paramInt1, ObservableIntegerArray paramObservableIntegerArray, int paramInt2, int paramInt3);
  
  int get(int paramInt);
  
  void addAll(int... paramVarArgs);
  
  void addAll(ObservableIntegerArray paramObservableIntegerArray);
  
  void addAll(int[] paramArrayOfint, int paramInt1, int paramInt2);
  
  void addAll(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2);
  
  void setAll(int... paramVarArgs);
  
  void setAll(int[] paramArrayOfint, int paramInt1, int paramInt2);
  
  void setAll(ObservableIntegerArray paramObservableIntegerArray);
  
  void setAll(ObservableIntegerArray paramObservableIntegerArray, int paramInt1, int paramInt2);
  
  void set(int paramInt1, int[] paramArrayOfint, int paramInt2, int paramInt3);
  
  void set(int paramInt1, ObservableIntegerArray paramObservableIntegerArray, int paramInt2, int paramInt3);
  
  void set(int paramInt1, int paramInt2);
  
  int[] toArray(int[] paramArrayOfint);
  
  int[] toArray(int paramInt1, int[] paramArrayOfint, int paramInt2);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ObservableIntegerArray.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */