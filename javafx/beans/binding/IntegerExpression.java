/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableIntegerValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class IntegerExpression
/*     */   extends NumberExpressionBase
/*     */   implements ObservableIntegerValue
/*     */ {
/*     */   public int intValue() {
/*  54 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public long longValue() {
/*  59 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public float floatValue() {
/*  64 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public double doubleValue() {
/*  69 */     return get();
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getValue() {
/*  74 */     return Integer.valueOf(get());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static IntegerExpression integerExpression(final ObservableIntegerValue value) {
/*  94 */     if (value == null) {
/*  95 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/*  97 */     return (value instanceof IntegerExpression) ? (IntegerExpression)value : 
/*  98 */       new IntegerBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 105 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected int computeValue() {
/* 110 */           return value.get();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableIntegerValue> getDependencies() {
/* 115 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T extends Number> IntegerExpression integerExpression(final ObservableValue<T> value) {
/* 151 */     if (value == null) {
/* 152 */       throw new NullPointerException("Value must be specified.");
/*     */     }
/* 154 */     return (value instanceof IntegerExpression) ? (IntegerExpression)value : 
/* 155 */       new IntegerBinding()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 162 */           unbind(new Observable[] { (Observable)this.val$value });
/*     */         }
/*     */ 
/*     */         
/*     */         protected int computeValue() {
/* 167 */           Number number = (Number)value.getValue();
/* 168 */           return (number == null) ? 0 : number.intValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<T>> getDependencies() {
/* 173 */           return FXCollections.singletonObservableList(value);
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public IntegerBinding negate() {
/* 181 */     return (IntegerBinding)Bindings.negate(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding add(double paramDouble) {
/* 186 */     return Bindings.add(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding add(float paramFloat) {
/* 191 */     return (FloatBinding)Bindings.add(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding add(long paramLong) {
/* 196 */     return (LongBinding)Bindings.add(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntegerBinding add(int paramInt) {
/* 201 */     return (IntegerBinding)Bindings.add(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding subtract(double paramDouble) {
/* 206 */     return Bindings.subtract(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding subtract(float paramFloat) {
/* 211 */     return (FloatBinding)Bindings.subtract(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding subtract(long paramLong) {
/* 216 */     return (LongBinding)Bindings.subtract(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntegerBinding subtract(int paramInt) {
/* 221 */     return (IntegerBinding)Bindings.subtract(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding multiply(double paramDouble) {
/* 226 */     return Bindings.multiply(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding multiply(float paramFloat) {
/* 231 */     return (FloatBinding)Bindings.multiply(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding multiply(long paramLong) {
/* 236 */     return (LongBinding)Bindings.multiply(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntegerBinding multiply(int paramInt) {
/* 241 */     return (IntegerBinding)Bindings.multiply(this, paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public DoubleBinding divide(double paramDouble) {
/* 246 */     return Bindings.divide(this, paramDouble);
/*     */   }
/*     */ 
/*     */   
/*     */   public FloatBinding divide(float paramFloat) {
/* 251 */     return (FloatBinding)Bindings.divide(this, paramFloat);
/*     */   }
/*     */ 
/*     */   
/*     */   public LongBinding divide(long paramLong) {
/* 256 */     return (LongBinding)Bindings.divide(this, paramLong);
/*     */   }
/*     */ 
/*     */   
/*     */   public IntegerBinding divide(int paramInt) {
/* 261 */     return (IntegerBinding)Bindings.divide(this, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectExpression<Integer> asObject() {
/* 274 */     return new ObjectBinding<Integer>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose()
/*     */         {
/* 281 */           unbind(new Observable[] { (Observable)this.this$0 });
/*     */         }
/*     */ 
/*     */         
/*     */         protected Integer computeValue() {
/* 286 */           return IntegerExpression.this.getValue();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\IntegerExpression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */