/*      */ package javafx.beans.binding;
/*      */ 
/*      */ import com.sun.javafx.binding.BidirectionalBinding;
/*      */ import com.sun.javafx.binding.BidirectionalContentBinding;
/*      */ import com.sun.javafx.binding.ContentBinding;
/*      */ import com.sun.javafx.binding.DoubleConstant;
/*      */ import com.sun.javafx.binding.FloatConstant;
/*      */ import com.sun.javafx.binding.IntegerConstant;
/*      */ import com.sun.javafx.binding.Logging;
/*      */ import com.sun.javafx.binding.LongConstant;
/*      */ import com.sun.javafx.binding.ObjectConstant;
/*      */ import com.sun.javafx.binding.SelectBinding;
/*      */ import com.sun.javafx.binding.StringConstant;
/*      */ import com.sun.javafx.binding.StringFormatter;
/*      */ import com.sun.javafx.collections.ImmutableObservableList;
/*      */ import java.lang.ref.WeakReference;
/*      */ import java.text.Format;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.Callable;
/*      */ import javafx.beans.InvalidationListener;
/*      */ import javafx.beans.Observable;
/*      */ import javafx.beans.property.Property;
/*      */ import javafx.beans.value.ObservableBooleanValue;
/*      */ import javafx.beans.value.ObservableIntegerValue;
/*      */ import javafx.beans.value.ObservableNumberValue;
/*      */ import javafx.beans.value.ObservableObjectValue;
/*      */ import javafx.beans.value.ObservableStringValue;
/*      */ import javafx.beans.value.ObservableValue;
/*      */ import javafx.collections.FXCollections;
/*      */ import javafx.collections.ObservableArray;
/*      */ import javafx.collections.ObservableFloatArray;
/*      */ import javafx.collections.ObservableIntegerArray;
/*      */ import javafx.collections.ObservableList;
/*      */ import javafx.collections.ObservableMap;
/*      */ import javafx.collections.ObservableSet;
/*      */ import javafx.util.StringConverter;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class Bindings
/*      */ {
/*      */   public static BooleanBinding createBooleanBinding(final Callable<Boolean> func, Observable... dependencies) {
/*  149 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected boolean computeValue()
/*      */         {
/*      */           try {
/*  157 */             return ((Boolean)func.call()).booleanValue();
/*  158 */           } catch (Exception exception) {
/*  159 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  160 */             return false;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  169 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  177 */           return (dependencies == null || dependencies.length == 0) ? 
/*  178 */             FXCollections.emptyObservableList() : (
/*  179 */             (dependencies.length == 1) ? 
/*  180 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  181 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding createDoubleBinding(final Callable<Double> func, Observable... dependencies) {
/*  195 */     return new DoubleBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected double computeValue()
/*      */         {
/*      */           try {
/*  203 */             return ((Double)func.call()).doubleValue();
/*  204 */           } catch (Exception exception) {
/*  205 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  206 */             return 0.0D;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  215 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  223 */           return (dependencies == null || dependencies.length == 0) ? 
/*  224 */             FXCollections.emptyObservableList() : (
/*  225 */             (dependencies.length == 1) ? 
/*  226 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  227 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding createFloatBinding(final Callable<Float> func, Observable... dependencies) {
/*  241 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected float computeValue()
/*      */         {
/*      */           try {
/*  249 */             return ((Float)func.call()).floatValue();
/*  250 */           } catch (Exception exception) {
/*  251 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  252 */             return 0.0F;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  261 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  269 */           return (dependencies == null || dependencies.length == 0) ? 
/*  270 */             FXCollections.emptyObservableList() : (
/*  271 */             (dependencies.length == 1) ? 
/*  272 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  273 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding createIntegerBinding(final Callable<Integer> func, Observable... dependencies) {
/*  287 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected int computeValue()
/*      */         {
/*      */           try {
/*  295 */             return ((Integer)func.call()).intValue();
/*  296 */           } catch (Exception exception) {
/*  297 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  298 */             return 0;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  307 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  315 */           return (dependencies == null || dependencies.length == 0) ? 
/*  316 */             FXCollections.emptyObservableList() : (
/*  317 */             (dependencies.length == 1) ? 
/*  318 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  319 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LongBinding createLongBinding(final Callable<Long> func, Observable... dependencies) {
/*  333 */     return new LongBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected long computeValue()
/*      */         {
/*      */           try {
/*  341 */             return ((Long)func.call()).longValue();
/*  342 */           } catch (Exception exception) {
/*  343 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  344 */             return 0L;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  353 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  361 */           return (dependencies == null || dependencies.length == 0) ? 
/*  362 */             FXCollections.emptyObservableList() : (
/*  363 */             (dependencies.length == 1) ? 
/*  364 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  365 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> ObjectBinding<T> createObjectBinding(final Callable<T> func, Observable... dependencies) {
/*  380 */     return new ObjectBinding<T>()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected T computeValue()
/*      */         {
/*      */           try {
/*  388 */             return func.call();
/*  389 */           } catch (Exception exception) {
/*  390 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  391 */             return null;
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  400 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  408 */           return (dependencies == null || dependencies.length == 0) ? 
/*  409 */             FXCollections.emptyObservableList() : (
/*  410 */             (dependencies.length == 1) ? 
/*  411 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  412 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringBinding createStringBinding(final Callable<String> func, Observable... dependencies) {
/*  426 */     return new StringBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         protected String computeValue()
/*      */         {
/*      */           try {
/*  434 */             return func.call();
/*  435 */           } catch (Exception exception) {
/*  436 */             Logging.getLogger().warning("Exception while evaluating binding", exception);
/*  437 */             return "";
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose() {
/*  446 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/*  454 */           return (dependencies == null || dependencies.length == 0) ? 
/*  455 */             FXCollections.emptyObservableList() : (
/*  456 */             (dependencies.length == 1) ? 
/*  457 */             FXCollections.singletonObservableList(dependencies[0]) : 
/*  458 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies));
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> ObjectBinding<T> select(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  496 */     return (ObjectBinding<T>)new SelectBinding.AsObject(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding selectDouble(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  522 */     return (DoubleBinding)new SelectBinding.AsDouble(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding selectFloat(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  548 */     return (FloatBinding)new SelectBinding.AsFloat(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding selectInteger(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  574 */     return (IntegerBinding)new SelectBinding.AsInteger(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LongBinding selectLong(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  600 */     return (LongBinding)new SelectBinding.AsLong(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding selectBoolean(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  626 */     return (BooleanBinding)new SelectBinding.AsBoolean(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringBinding selectString(ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/*  652 */     return (StringBinding)new SelectBinding.AsString(paramObservableValue, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> ObjectBinding<T> select(Object paramObject, String... paramVarArgs) {
/*  683 */     return (ObjectBinding<T>)new SelectBinding.AsObject(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding selectDouble(Object paramObject, String... paramVarArgs) {
/*  713 */     return (DoubleBinding)new SelectBinding.AsDouble(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding selectFloat(Object paramObject, String... paramVarArgs) {
/*  743 */     return (FloatBinding)new SelectBinding.AsFloat(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding selectInteger(Object paramObject, String... paramVarArgs) {
/*  773 */     return (IntegerBinding)new SelectBinding.AsInteger(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LongBinding selectLong(Object paramObject, String... paramVarArgs) {
/*  803 */     return (LongBinding)new SelectBinding.AsLong(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding selectBoolean(Object paramObject, String... paramVarArgs) {
/*  833 */     return (BooleanBinding)new SelectBinding.AsBoolean(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringBinding selectString(Object paramObject, String... paramVarArgs) {
/*  863 */     return (StringBinding)new SelectBinding.AsString(paramObject, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static When when(ObservableBooleanValue paramObservableBooleanValue) {
/*  877 */     return new When(paramObservableBooleanValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> void bindBidirectional(Property<T> paramProperty1, Property<T> paramProperty2) {
/*  915 */     BidirectionalBinding.bind(paramProperty1, paramProperty2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> void unbindBidirectional(Property<T> paramProperty1, Property<T> paramProperty2) {
/*  934 */     BidirectionalBinding.unbind(paramProperty1, paramProperty2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void unbindBidirectional(Object paramObject1, Object paramObject2) {
/*  953 */     BidirectionalBinding.unbind(paramObject1, paramObject2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void bindBidirectional(Property<String> paramProperty, Property<?> paramProperty1, Format paramFormat) {
/*  990 */     BidirectionalBinding.bind(paramProperty, paramProperty1, paramFormat);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <T> void bindBidirectional(Property<String> paramProperty, Property<T> paramProperty1, StringConverter<T> paramStringConverter) {
/* 1028 */     BidirectionalBinding.bind(paramProperty, paramProperty1, paramStringConverter);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> void bindContentBidirectional(ObservableList<E> paramObservableList1, ObservableList<E> paramObservableList2) {
/* 1067 */     BidirectionalContentBinding.bind(paramObservableList1, paramObservableList2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> void bindContentBidirectional(ObservableSet<E> paramObservableSet1, ObservableSet<E> paramObservableSet2) {
/* 1106 */     BidirectionalContentBinding.bind(paramObservableSet1, paramObservableSet2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> void bindContentBidirectional(ObservableMap<K, V> paramObservableMap1, ObservableMap<K, V> paramObservableMap2) {
/* 1143 */     BidirectionalContentBinding.bind(paramObservableMap1, paramObservableMap2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void unbindContentBidirectional(Object paramObject1, Object paramObject2) {
/* 1156 */     BidirectionalContentBinding.unbind(paramObject1, paramObject2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> void bindContent(List<E> paramList, ObservableList<? extends E> paramObservableList) {
/* 1179 */     ContentBinding.bind(paramList, paramObservableList);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> void bindContent(Set<E> paramSet, ObservableSet<? extends E> paramObservableSet) {
/* 1206 */     ContentBinding.bind(paramSet, paramObservableSet);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> void bindContent(Map<K, V> paramMap, ObservableMap<? extends K, ? extends V> paramObservableMap) {
/* 1235 */     ContentBinding.bind(paramMap, paramObservableMap);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void unbindContent(Object paramObject1, Object paramObject2) {
/* 1252 */     ContentBinding.unbind(paramObject1, paramObject2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding negate(final ObservableNumberValue value) {
/* 1271 */     if (value == null) {
/* 1272 */       throw new NullPointerException("Operand cannot be null.");
/*      */     }
/*      */     
/* 1275 */     if (value instanceof javafx.beans.value.ObservableDoubleValue)
/* 1276 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1283 */             unbind(new Observable[] { (Observable)this.val$value });
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 1288 */             return -value.doubleValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1293 */             return FXCollections.singletonObservableList(value);
/*      */           }
/*      */         }; 
/* 1296 */     if (value instanceof javafx.beans.value.ObservableFloatValue)
/* 1297 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1304 */             unbind(new Observable[] { (Observable)this.val$value });
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 1309 */             return -value.floatValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1314 */             return FXCollections.singletonObservableList(value);
/*      */           }
/*      */         }; 
/* 1317 */     if (value instanceof javafx.beans.value.ObservableLongValue) {
/* 1318 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1325 */             unbind(new Observable[] { (Observable)this.val$value });
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 1330 */             return -value.longValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1335 */             return FXCollections.singletonObservableList(value);
/*      */           }
/*      */         };
/*      */     }
/* 1339 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 1346 */           unbind(new Observable[] { (Observable)this.val$value });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 1351 */           return -value.intValue();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 1356 */           return FXCollections.singletonObservableList(value);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static NumberBinding add(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 1366 */     if (op1 == null || op2 == null) {
/* 1367 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 1369 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 1371 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 1372 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1379 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 1384 */             return op1.doubleValue() + op2.doubleValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1389 */             return (dependencies.length == 1) ? 
/* 1390 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1391 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 1394 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 1395 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1402 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 1407 */             return op1.floatValue() + op2.floatValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1412 */             return (dependencies.length == 1) ? 
/* 1413 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1414 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 1417 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 1418 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1425 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 1430 */             return op1.longValue() + op2.longValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1435 */             return (dependencies.length == 1) ? 
/* 1436 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1437 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 1441 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 1448 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 1453 */           return op1.intValue() + op2.intValue();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 1458 */           return (dependencies.length == 1) ? 
/* 1459 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 1460 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 1480 */     return add(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding add(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 1497 */     return (DoubleBinding)add(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding add(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 1514 */     return (DoubleBinding)add((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 1531 */     return add(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 1548 */     return add((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 1565 */     return add(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 1582 */     return add((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 1599 */     return add(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding add(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 1616 */     return add((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static NumberBinding subtract(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 1623 */     if (op1 == null || op2 == null) {
/* 1624 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 1626 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 1628 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 1629 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1636 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 1641 */             return op1.doubleValue() - op2.doubleValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1646 */             return (dependencies.length == 1) ? 
/* 1647 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1648 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 1651 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 1652 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1659 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 1664 */             return op1.floatValue() - op2.floatValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1669 */             return (dependencies.length == 1) ? 
/* 1670 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1671 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 1674 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 1675 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1682 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 1687 */             return op1.longValue() - op2.longValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1692 */             return (dependencies.length == 1) ? 
/* 1693 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1694 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 1698 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 1705 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 1710 */           return op1.intValue() - op2.intValue();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 1715 */           return (dependencies.length == 1) ? 
/* 1716 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 1717 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 1737 */     return subtract(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding subtract(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 1754 */     return (DoubleBinding)subtract(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding subtract(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 1771 */     return (DoubleBinding)subtract((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 1788 */     return subtract(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 1805 */     return subtract((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 1822 */     return subtract(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 1839 */     return subtract((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 1856 */     return subtract(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding subtract(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 1873 */     return subtract((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static NumberBinding multiply(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 1880 */     if (op1 == null || op2 == null) {
/* 1881 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 1883 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 1885 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 1886 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1893 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 1898 */             return op1.doubleValue() * op2.doubleValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1903 */             return (dependencies.length == 1) ? 
/* 1904 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1905 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 1908 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 1909 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1916 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 1921 */             return op1.floatValue() * op2.floatValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1926 */             return (dependencies.length == 1) ? 
/* 1927 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1928 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 1931 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 1932 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 1939 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 1944 */             return op1.longValue() * op2.longValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 1949 */             return (dependencies.length == 1) ? 
/* 1950 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 1951 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 1955 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 1962 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 1967 */           return op1.intValue() * op2.intValue();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 1972 */           return (dependencies.length == 1) ? 
/* 1973 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 1974 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 1994 */     return multiply(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding multiply(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 2011 */     return (DoubleBinding)multiply(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding multiply(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 2028 */     return (DoubleBinding)multiply((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 2045 */     return multiply(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 2062 */     return multiply((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 2079 */     return multiply(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 2096 */     return multiply((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 2113 */     return multiply(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding multiply(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 2130 */     return multiply((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static NumberBinding divide(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 2137 */     if (op1 == null || op2 == null) {
/* 2138 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 2140 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 2142 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 2143 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2150 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 2155 */             return op1.doubleValue() / op2.doubleValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2160 */             return (dependencies.length == 1) ? 
/* 2161 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2162 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 2165 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 2166 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2173 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 2178 */             return op1.floatValue() / op2.floatValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2183 */             return (dependencies.length == 1) ? 
/* 2184 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2185 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 2188 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 2189 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2196 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 2201 */             return op1.longValue() / op2.longValue();
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2206 */             return (dependencies.length == 1) ? 
/* 2207 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2208 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 2212 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 2219 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 2224 */           return op1.intValue() / op2.intValue();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 2229 */           return (dependencies.length == 1) ? 
/* 2230 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 2231 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 2251 */     return divide(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding divide(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 2268 */     return (DoubleBinding)divide(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding divide(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 2285 */     return (DoubleBinding)divide((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 2302 */     return divide(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 2319 */     return divide((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 2336 */     return divide(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 2353 */     return divide((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 2370 */     return divide(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding divide(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 2387 */     return divide((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding equal(final ObservableNumberValue op1, final ObservableNumberValue op2, final double epsilon, Observable... dependencies) {
/* 2394 */     if (op1 == null || op2 == null) {
/* 2395 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 2397 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 2399 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 2400 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2407 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 2412 */             return (Math.abs(op1.doubleValue() - op2.doubleValue()) <= epsilon);
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2417 */             return (dependencies.length == 1) ? 
/* 2418 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2419 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 2422 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 2423 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2430 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 2435 */             return (Math.abs(op1.floatValue() - op2.floatValue()) <= epsilon);
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2440 */             return (dependencies.length == 1) ? 
/* 2441 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2442 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 2445 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 2446 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2453 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 2458 */             return (Math.abs(op1.longValue() - op2.longValue()) <= epsilon);
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2463 */             return (dependencies.length == 1) ? 
/* 2464 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2465 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 2469 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 2476 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 2481 */           return (Math.abs(op1.intValue() - op2.intValue()) <= epsilon);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 2486 */           return (dependencies.length == 1) ? 
/* 2487 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 2488 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2, double paramDouble) {
/* 2517 */     return equal(paramObservableNumberValue1, paramObservableNumberValue2, paramDouble, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 2538 */     return equal(paramObservableNumberValue1, paramObservableNumberValue2, 0.0D, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue, double paramDouble1, double paramDouble2) {
/* 2563 */     return equal(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble1), paramDouble2, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(double paramDouble1, ObservableNumberValue paramObservableNumberValue, double paramDouble2) {
/* 2588 */     return equal((ObservableNumberValue)DoubleConstant.valueOf(paramDouble1), paramObservableNumberValue, paramDouble2, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue, float paramFloat, double paramDouble) {
/* 2613 */     return equal(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(float paramFloat, ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 2638 */     return equal((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue, long paramLong, double paramDouble) {
/* 2663 */     return equal(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 2684 */     return equal(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(long paramLong, ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 2709 */     return equal((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 2730 */     return equal((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue, int paramInt, double paramDouble) {
/* 2755 */     return equal(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 2776 */     return equal(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(int paramInt, ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 2801 */     return equal((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 2822 */     return equal((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding notEqual(final ObservableNumberValue op1, final ObservableNumberValue op2, final double epsilon, Observable... dependencies) {
/* 2829 */     if (op1 == null || op2 == null) {
/* 2830 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 2832 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 2834 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 2835 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2842 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 2847 */             return (Math.abs(op1.doubleValue() - op2.doubleValue()) > epsilon);
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2852 */             return (dependencies.length == 1) ? 
/* 2853 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2854 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 2857 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 2858 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2865 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 2870 */             return (Math.abs(op1.floatValue() - op2.floatValue()) > epsilon);
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2875 */             return (dependencies.length == 1) ? 
/* 2876 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2877 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 2880 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 2881 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 2888 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 2893 */             return (Math.abs(op1.longValue() - op2.longValue()) > epsilon);
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 2898 */             return (dependencies.length == 1) ? 
/* 2899 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 2900 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 2904 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 2911 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 2916 */           return (Math.abs(op1.intValue() - op2.intValue()) > epsilon);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 2921 */           return (dependencies.length == 1) ? 
/* 2922 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 2923 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2, double paramDouble) {
/* 2952 */     return notEqual(paramObservableNumberValue1, paramObservableNumberValue2, paramDouble, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 2973 */     return notEqual(paramObservableNumberValue1, paramObservableNumberValue2, 0.0D, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue, double paramDouble1, double paramDouble2) {
/* 2998 */     return notEqual(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble1), paramDouble2, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(double paramDouble1, ObservableNumberValue paramObservableNumberValue, double paramDouble2) {
/* 3023 */     return notEqual((ObservableNumberValue)DoubleConstant.valueOf(paramDouble1), paramObservableNumberValue, paramDouble2, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue, float paramFloat, double paramDouble) {
/* 3048 */     return notEqual(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(float paramFloat, ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3073 */     return notEqual((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue, long paramLong, double paramDouble) {
/* 3098 */     return notEqual(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 3119 */     return notEqual(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(long paramLong, ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3144 */     return notEqual((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 3165 */     return notEqual((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue, int paramInt, double paramDouble) {
/* 3190 */     return notEqual(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 3211 */     return notEqual(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(int paramInt, ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3236 */     return notEqual((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, paramDouble, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 3257 */     return notEqual((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, 0.0D, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding greaterThan(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 3264 */     if (op1 == null || op2 == null) {
/* 3265 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 3267 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 3269 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 3270 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 3277 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 3282 */             return (op1.doubleValue() > op2.doubleValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 3287 */             return (dependencies.length == 1) ? 
/* 3288 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 3289 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 3292 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 3293 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 3300 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 3305 */             return (op1.floatValue() > op2.floatValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 3310 */             return (dependencies.length == 1) ? 
/* 3311 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 3312 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 3315 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 3316 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 3323 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 3328 */             return (op1.longValue() > op2.longValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 3333 */             return (dependencies.length == 1) ? 
/* 3334 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 3335 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 3339 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 3346 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 3351 */           return (op1.intValue() > op2.intValue());
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 3356 */           return (dependencies.length == 1) ? 
/* 3357 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 3358 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 3379 */     return greaterThan(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3396 */     return greaterThan(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 3413 */     return greaterThan((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 3430 */     return greaterThan(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 3447 */     return greaterThan((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 3464 */     return greaterThan(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 3481 */     return greaterThan((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 3498 */     return greaterThan(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 3515 */     return greaterThan((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2, Observable... paramVarArgs) {
/* 3522 */     return greaterThan(paramObservableNumberValue2, paramObservableNumberValue1, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 3540 */     return lessThan(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3557 */     return lessThan(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 3574 */     return lessThan((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 3591 */     return lessThan(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 3608 */     return lessThan((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 3625 */     return lessThan(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 3642 */     return lessThan((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 3659 */     return lessThan(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 3676 */     return lessThan((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding greaterThanOrEqual(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 3683 */     if (op1 == null || op2 == null) {
/* 3684 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 3686 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 3688 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 3689 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 3696 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 3701 */             return (op1.doubleValue() >= op2.doubleValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 3706 */             return (dependencies.length == 1) ? 
/* 3707 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 3708 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 3711 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 3712 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 3719 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 3724 */             return (op1.floatValue() >= op2.floatValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 3729 */             return (dependencies.length == 1) ? 
/* 3730 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 3731 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 3734 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 3735 */       return new BooleanBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 3742 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected boolean computeValue() {
/* 3747 */             return (op1.longValue() >= op2.longValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 3752 */             return (dependencies.length == 1) ? 
/* 3753 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 3754 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 3758 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 3765 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 3770 */           return (op1.intValue() >= op2.intValue());
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 3775 */           return (dependencies.length == 1) ? 
/* 3776 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 3777 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 3798 */     return greaterThanOrEqual(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3815 */     return greaterThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 3832 */     return greaterThanOrEqual((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 3849 */     return greaterThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 3866 */     return greaterThanOrEqual((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 3883 */     return greaterThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 3900 */     return greaterThanOrEqual((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 3917 */     return greaterThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 3934 */     return greaterThanOrEqual((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding lessThanOrEqual(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2, Observable... paramVarArgs) {
/* 3941 */     return greaterThanOrEqual(paramObservableNumberValue2, paramObservableNumberValue1, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 3960 */     return lessThanOrEqual(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 3977 */     return lessThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 3994 */     return lessThanOrEqual((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 4011 */     return lessThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 4028 */     return lessThanOrEqual((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 4045 */     return lessThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 4062 */     return lessThanOrEqual((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 4079 */     return lessThanOrEqual(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 4096 */     return lessThanOrEqual((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static NumberBinding min(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 4103 */     if (op1 == null || op2 == null) {
/* 4104 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 4106 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 4108 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 4109 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 4116 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 4121 */             return Math.min(op1.doubleValue(), op2.doubleValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 4126 */             return (dependencies.length == 1) ? 
/* 4127 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 4128 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 4131 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 4132 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 4139 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 4144 */             return Math.min(op1.floatValue(), op2.floatValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 4149 */             return (dependencies.length == 1) ? 
/* 4150 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 4151 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 4154 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 4155 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 4162 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 4167 */             return Math.min(op1.longValue(), op2.longValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 4172 */             return (dependencies.length == 1) ? 
/* 4173 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 4174 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 4178 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 4185 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 4190 */           return Math.min(op1.intValue(), op2.intValue());
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 4195 */           return (dependencies.length == 1) ? 
/* 4196 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 4197 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 4217 */     return min(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding min(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 4234 */     return (DoubleBinding)min(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding min(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 4251 */     return (DoubleBinding)min((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 4268 */     return min(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 4285 */     return min((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 4302 */     return min(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 4319 */     return min((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 4336 */     return min(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding min(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 4353 */     return min((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static NumberBinding max(final ObservableNumberValue op1, final ObservableNumberValue op2, Observable... dependencies) {
/* 4360 */     if (op1 == null || op2 == null) {
/* 4361 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 4363 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 4365 */     if (op1 instanceof javafx.beans.value.ObservableDoubleValue || op2 instanceof javafx.beans.value.ObservableDoubleValue)
/* 4366 */       return new DoubleBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 4373 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected double computeValue() {
/* 4378 */             return Math.max(op1.doubleValue(), op2.doubleValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 4383 */             return (dependencies.length == 1) ? 
/* 4384 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 4385 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 4388 */     if (op1 instanceof javafx.beans.value.ObservableFloatValue || op2 instanceof javafx.beans.value.ObservableFloatValue)
/* 4389 */       return new FloatBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 4396 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected float computeValue() {
/* 4401 */             return Math.max(op1.floatValue(), op2.floatValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 4406 */             return (dependencies.length == 1) ? 
/* 4407 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 4408 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         }; 
/* 4411 */     if (op1 instanceof javafx.beans.value.ObservableLongValue || op2 instanceof javafx.beans.value.ObservableLongValue) {
/* 4412 */       return new LongBinding()
/*      */         {
/*      */ 
/*      */ 
/*      */           
/*      */           public void dispose()
/*      */           {
/* 4419 */             unbind(dependencies);
/*      */           }
/*      */ 
/*      */           
/*      */           protected long computeValue() {
/* 4424 */             return Math.max(op1.longValue(), op2.longValue());
/*      */           }
/*      */ 
/*      */           
/*      */           public ObservableList<?> getDependencies() {
/* 4429 */             return (dependencies.length == 1) ? 
/* 4430 */               FXCollections.singletonObservableList(dependencies[0]) : 
/* 4431 */               (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */           }
/*      */         };
/*      */     }
/* 4435 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 4442 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 4447 */           return Math.max(op1.intValue(), op2.intValue());
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 4452 */           return (dependencies.length == 1) ? 
/* 4453 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 4454 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(ObservableNumberValue paramObservableNumberValue1, ObservableNumberValue paramObservableNumberValue2) {
/* 4474 */     return max(paramObservableNumberValue1, paramObservableNumberValue2, new Observable[] { (Observable)paramObservableNumberValue1, (Observable)paramObservableNumberValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding max(ObservableNumberValue paramObservableNumberValue, double paramDouble) {
/* 4491 */     return (DoubleBinding)max(paramObservableNumberValue, (ObservableNumberValue)DoubleConstant.valueOf(paramDouble), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding max(double paramDouble, ObservableNumberValue paramObservableNumberValue) {
/* 4508 */     return (DoubleBinding)max((ObservableNumberValue)DoubleConstant.valueOf(paramDouble), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(ObservableNumberValue paramObservableNumberValue, float paramFloat) {
/* 4525 */     return max(paramObservableNumberValue, (ObservableNumberValue)FloatConstant.valueOf(paramFloat), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(float paramFloat, ObservableNumberValue paramObservableNumberValue) {
/* 4542 */     return max((ObservableNumberValue)FloatConstant.valueOf(paramFloat), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(ObservableNumberValue paramObservableNumberValue, long paramLong) {
/* 4559 */     return max(paramObservableNumberValue, (ObservableNumberValue)LongConstant.valueOf(paramLong), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(long paramLong, ObservableNumberValue paramObservableNumberValue) {
/* 4576 */     return max((ObservableNumberValue)LongConstant.valueOf(paramLong), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(ObservableNumberValue paramObservableNumberValue, int paramInt) {
/* 4593 */     return max(paramObservableNumberValue, (ObservableNumberValue)IntegerConstant.valueOf(paramInt), new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static NumberBinding max(int paramInt, ObservableNumberValue paramObservableNumberValue) {
/* 4610 */     return max((ObservableNumberValue)IntegerConstant.valueOf(paramInt), paramObservableNumberValue, new Observable[] { (Observable)paramObservableNumberValue });
/*      */   }
/*      */ 
/*      */   
/*      */   private static class BooleanAndBinding
/*      */     extends BooleanBinding
/*      */   {
/*      */     private final ObservableBooleanValue op1;
/*      */     
/*      */     private final ObservableBooleanValue op2;
/*      */     private final InvalidationListener observer;
/*      */     
/*      */     public BooleanAndBinding(ObservableBooleanValue param1ObservableBooleanValue1, ObservableBooleanValue param1ObservableBooleanValue2) {
/* 4623 */       this.op1 = param1ObservableBooleanValue1;
/* 4624 */       this.op2 = param1ObservableBooleanValue2;
/*      */       
/* 4626 */       this.observer = new Bindings.ShortCircuitAndInvalidator(this);
/*      */       
/* 4628 */       param1ObservableBooleanValue1.addListener(this.observer);
/* 4629 */       param1ObservableBooleanValue2.addListener(this.observer);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void dispose() {
/* 4635 */       this.op1.removeListener(this.observer);
/* 4636 */       this.op2.removeListener(this.observer);
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean computeValue() {
/* 4641 */       return (this.op1.get() && this.op2.get());
/*      */     }
/*      */ 
/*      */     
/*      */     public ObservableList<?> getDependencies() {
/* 4646 */       return (ObservableList<?>)new ImmutableObservableList((Object[])new ObservableBooleanValue[] { this.op1, this.op2 });
/*      */     }
/*      */   }
/*      */   
/*      */   private static class ShortCircuitAndInvalidator
/*      */     implements InvalidationListener {
/*      */     private final WeakReference<Bindings.BooleanAndBinding> ref;
/*      */     
/*      */     private ShortCircuitAndInvalidator(Bindings.BooleanAndBinding param1BooleanAndBinding) {
/* 4655 */       assert param1BooleanAndBinding != null;
/* 4656 */       this.ref = new WeakReference<>(param1BooleanAndBinding);
/*      */     }
/*      */ 
/*      */     
/*      */     public void invalidated(Observable param1Observable) {
/* 4661 */       Bindings.BooleanAndBinding booleanAndBinding = this.ref.get();
/* 4662 */       if (booleanAndBinding == null) {
/* 4663 */         param1Observable.removeListener(this);
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 4668 */       else if (booleanAndBinding.op1.equals(param1Observable) || (booleanAndBinding.isValid() && booleanAndBinding.op1.get())) {
/* 4669 */         booleanAndBinding.invalidate();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding and(ObservableBooleanValue paramObservableBooleanValue1, ObservableBooleanValue paramObservableBooleanValue2) {
/* 4690 */     if (paramObservableBooleanValue1 == null || paramObservableBooleanValue2 == null) {
/* 4691 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 4694 */     return new BooleanAndBinding(paramObservableBooleanValue1, paramObservableBooleanValue2);
/*      */   }
/*      */   
/*      */   private static class BooleanOrBinding
/*      */     extends BooleanBinding {
/*      */     private final ObservableBooleanValue op1;
/*      */     private final ObservableBooleanValue op2;
/*      */     private final InvalidationListener observer;
/*      */     
/*      */     public BooleanOrBinding(ObservableBooleanValue param1ObservableBooleanValue1, ObservableBooleanValue param1ObservableBooleanValue2) {
/* 4704 */       this.op1 = param1ObservableBooleanValue1;
/* 4705 */       this.op2 = param1ObservableBooleanValue2;
/* 4706 */       this.observer = new Bindings.ShortCircuitOrInvalidator(this);
/* 4707 */       param1ObservableBooleanValue1.addListener(this.observer);
/* 4708 */       param1ObservableBooleanValue2.addListener(this.observer);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void dispose() {
/* 4714 */       this.op1.removeListener(this.observer);
/* 4715 */       this.op2.removeListener(this.observer);
/*      */     }
/*      */ 
/*      */     
/*      */     protected boolean computeValue() {
/* 4720 */       return (this.op1.get() || this.op2.get());
/*      */     }
/*      */ 
/*      */     
/*      */     public ObservableList<?> getDependencies() {
/* 4725 */       return (ObservableList<?>)new ImmutableObservableList((Object[])new ObservableBooleanValue[] { this.op1, this.op2 });
/*      */     }
/*      */   }
/*      */   
/*      */   private static class ShortCircuitOrInvalidator
/*      */     implements InvalidationListener
/*      */   {
/*      */     private final WeakReference<Bindings.BooleanOrBinding> ref;
/*      */     
/*      */     private ShortCircuitOrInvalidator(Bindings.BooleanOrBinding param1BooleanOrBinding) {
/* 4735 */       assert param1BooleanOrBinding != null;
/* 4736 */       this.ref = new WeakReference<>(param1BooleanOrBinding);
/*      */     }
/*      */ 
/*      */     
/*      */     public void invalidated(Observable param1Observable) {
/* 4741 */       Bindings.BooleanOrBinding booleanOrBinding = this.ref.get();
/* 4742 */       if (booleanOrBinding == null) {
/* 4743 */         param1Observable.removeListener(this);
/*      */ 
/*      */ 
/*      */       
/*      */       }
/* 4748 */       else if (booleanOrBinding.op1.equals(param1Observable) || (booleanOrBinding.isValid() && !booleanOrBinding.op1.get())) {
/* 4749 */         booleanOrBinding.invalidate();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding or(ObservableBooleanValue paramObservableBooleanValue1, ObservableBooleanValue paramObservableBooleanValue2) {
/* 4770 */     if (paramObservableBooleanValue1 == null || paramObservableBooleanValue2 == null) {
/* 4771 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 4774 */     return new BooleanOrBinding(paramObservableBooleanValue1, paramObservableBooleanValue2);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding not(final ObservableBooleanValue op) {
/* 4788 */     if (op == null) {
/* 4789 */       throw new NullPointerException("Operand cannot be null.");
/*      */     }
/*      */     
/* 4792 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 4799 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 4804 */           return !op.get();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 4809 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(final ObservableBooleanValue op1, final ObservableBooleanValue op2) {
/* 4827 */     if (op1 == null || op2 == null) {
/* 4828 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 4831 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 4838 */           unbind(new Observable[] { (Observable)this.val$op1, (Observable)this.val$op2 });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 4843 */           return (op1.get() == op2.get());
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 4848 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new ObservableBooleanValue[] { this.val$op1, this.val$op2 });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(final ObservableBooleanValue op1, final ObservableBooleanValue op2) {
/* 4867 */     if (op1 == null || op2 == null) {
/* 4868 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 4871 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 4878 */           unbind(new Observable[] { (Observable)this.val$op1, (Observable)this.val$op2 });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 4883 */           return (op1.get() != op2.get());
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 4888 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new ObservableBooleanValue[] { this.val$op1, this.val$op2 });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringExpression convert(ObservableValue<?> paramObservableValue) {
/* 4912 */     return StringFormatter.convert(paramObservableValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringExpression concat(Object... paramVarArgs) {
/* 4933 */     return StringFormatter.concat(paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringExpression format(String paramString, Object... paramVarArgs) {
/* 4956 */     return StringFormatter.format(paramString, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringExpression format(Locale paramLocale, String paramString, Object... paramVarArgs) {
/* 4983 */     return StringFormatter.format(paramLocale, paramString, paramVarArgs);
/*      */   }
/*      */   
/*      */   private static String getStringSafe(String paramString) {
/* 4987 */     return (paramString == null) ? "" : paramString;
/*      */   }
/*      */   
/*      */   private static BooleanBinding equal(final ObservableStringValue op1, final ObservableStringValue op2, Observable... dependencies) {
/* 4991 */     if (op1 == null || op2 == null) {
/* 4992 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 4994 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 4996 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5003 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5008 */           String str1 = Bindings.getStringSafe((String)op1.get());
/* 5009 */           String str2 = Bindings.getStringSafe((String)op2.get());
/* 5010 */           return str1.equals(str2);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5015 */           return (dependencies.length == 1) ? 
/* 5016 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5017 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5039 */     return equal(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5059 */     return equal(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5079 */     return equal((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding notEqual(final ObservableStringValue op1, final ObservableStringValue op2, Observable... dependencies) {
/* 5083 */     if (op1 == null || op2 == null) {
/* 5084 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5086 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5088 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5095 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5100 */           String str1 = Bindings.getStringSafe((String)op1.get());
/* 5101 */           String str2 = Bindings.getStringSafe((String)op2.get());
/* 5102 */           return !str1.equals(str2);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5107 */           return (dependencies.length == 1) ? 
/* 5108 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5109 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5131 */     return notEqual(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5151 */     return notEqual(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5171 */     return notEqual((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding equalIgnoreCase(final ObservableStringValue op1, final ObservableStringValue op2, Observable... dependencies) {
/* 5175 */     if (op1 == null || op2 == null) {
/* 5176 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5178 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5180 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5187 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5192 */           String str1 = Bindings.getStringSafe((String)op1.get());
/* 5193 */           String str2 = Bindings.getStringSafe((String)op2.get());
/* 5194 */           return str1.equalsIgnoreCase(str2);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5199 */           return (dependencies.length == 1) ? 
/* 5200 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5201 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equalIgnoreCase(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5223 */     return equalIgnoreCase(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equalIgnoreCase(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5243 */     return equalIgnoreCase(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equalIgnoreCase(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5263 */     return equalIgnoreCase((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding notEqualIgnoreCase(final ObservableStringValue op1, final ObservableStringValue op2, Observable... dependencies) {
/* 5267 */     if (op1 == null || op2 == null) {
/* 5268 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5270 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5272 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5279 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5284 */           String str1 = Bindings.getStringSafe((String)op1.get());
/* 5285 */           String str2 = Bindings.getStringSafe((String)op2.get());
/* 5286 */           return !str1.equalsIgnoreCase(str2);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5291 */           return (dependencies.length == 1) ? 
/* 5292 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5293 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqualIgnoreCase(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5316 */     return notEqualIgnoreCase(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqualIgnoreCase(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5336 */     return notEqualIgnoreCase(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqualIgnoreCase(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5356 */     return notEqualIgnoreCase((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding greaterThan(final ObservableStringValue op1, final ObservableStringValue op2, Observable... dependencies) {
/* 5360 */     if (op1 == null || op2 == null) {
/* 5361 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5363 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5365 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5372 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5377 */           String str1 = Bindings.getStringSafe((String)op1.get());
/* 5378 */           String str2 = Bindings.getStringSafe((String)op2.get());
/* 5379 */           return (str1.compareTo(str2) > 0);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5384 */           return (dependencies.length == 1) ? 
/* 5385 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5386 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5409 */     return greaterThan(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5429 */     return greaterThan(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThan(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5449 */     return greaterThan((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding lessThan(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2, Observable... paramVarArgs) {
/* 5453 */     return greaterThan(paramObservableStringValue2, paramObservableStringValue1, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5474 */     return lessThan(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5494 */     return lessThan(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThan(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5514 */     return lessThan((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding greaterThanOrEqual(final ObservableStringValue op1, final ObservableStringValue op2, Observable... dependencies) {
/* 5518 */     if (op1 == null || op2 == null) {
/* 5519 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5521 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5523 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5530 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5535 */           String str1 = Bindings.getStringSafe((String)op1.get());
/* 5536 */           String str2 = Bindings.getStringSafe((String)op2.get());
/* 5537 */           return (str1.compareTo(str2) >= 0);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5542 */           return (dependencies.length == 1) ? 
/* 5543 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5544 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5567 */     return greaterThanOrEqual(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5587 */     return greaterThanOrEqual(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding greaterThanOrEqual(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5607 */     return greaterThanOrEqual((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding lessThanOrEqual(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2, Observable... paramVarArgs) {
/* 5611 */     return greaterThanOrEqual(paramObservableStringValue2, paramObservableStringValue1, paramVarArgs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 5632 */     return lessThanOrEqual(paramObservableStringValue1, paramObservableStringValue2, new Observable[] { (Observable)paramObservableStringValue1, (Observable)paramObservableStringValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(ObservableStringValue paramObservableStringValue, String paramString) {
/* 5652 */     return lessThanOrEqual(paramObservableStringValue, (ObservableStringValue)StringConstant.valueOf(paramString), new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding lessThanOrEqual(String paramString, ObservableStringValue paramObservableStringValue) {
/* 5672 */     return lessThanOrEqual((ObservableStringValue)StringConstant.valueOf(paramString), paramObservableStringValue, new Observable[] { (Observable)paramObservableStringValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding length(final ObservableStringValue op) {
/* 5690 */     if (op == null) {
/* 5691 */       throw new NullPointerException("Operand cannot be null");
/*      */     }
/*      */     
/* 5694 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5701 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 5706 */           return Bindings.getStringSafe((String)op.get()).length();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5711 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding isEmpty(final ObservableStringValue op) {
/* 5731 */     if (op == null) {
/* 5732 */       throw new NullPointerException("Operand cannot be null");
/*      */     }
/*      */     
/* 5735 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5742 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5747 */           return Bindings.getStringSafe((String)op.get()).isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5752 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding isNotEmpty(final ObservableStringValue op) {
/* 5772 */     if (op == null) {
/* 5773 */       throw new NullPointerException("Operand cannot be null");
/*      */     }
/*      */     
/* 5776 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5783 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5788 */           return !Bindings.getStringSafe((String)op.get()).isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5793 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static BooleanBinding equal(final ObservableObjectValue<?> op1, final ObservableObjectValue<?> op2, Observable... dependencies) {
/* 5802 */     if (op1 == null || op2 == null) {
/* 5803 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5805 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5807 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5814 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5819 */           Object object1 = op1.get();
/* 5820 */           Object object2 = op2.get();
/* 5821 */           return (object1 == null) ? ((object2 == null)) : object1.equals(object2);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5826 */           return (dependencies.length == 1) ? 
/* 5827 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5828 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableObjectValue<?> paramObservableObjectValue1, ObservableObjectValue<?> paramObservableObjectValue2) {
/* 5847 */     return equal(paramObservableObjectValue1, paramObservableObjectValue2, new Observable[] { (Observable)paramObservableObjectValue1, (Observable)paramObservableObjectValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(ObservableObjectValue<?> paramObservableObjectValue, Object paramObject) {
/* 5864 */     return equal(paramObservableObjectValue, (ObservableObjectValue<?>)ObjectConstant.valueOf(paramObject), new Observable[] { (Observable)paramObservableObjectValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding equal(Object paramObject, ObservableObjectValue<?> paramObservableObjectValue) {
/* 5881 */     return equal((ObservableObjectValue<?>)ObjectConstant.valueOf(paramObject), paramObservableObjectValue, new Observable[] { (Observable)paramObservableObjectValue });
/*      */   }
/*      */   
/*      */   private static BooleanBinding notEqual(final ObservableObjectValue<?> op1, final ObservableObjectValue<?> op2, Observable... dependencies) {
/* 5885 */     if (op1 == null || op2 == null) {
/* 5886 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/* 5888 */     assert dependencies != null && dependencies.length > 0;
/*      */     
/* 5890 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5897 */           unbind(dependencies);
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5902 */           Object object1 = op1.get();
/* 5903 */           Object object2 = op2.get();
/* 5904 */           return (object1 == null) ? ((object2 != null)) : (!object1.equals(object2));
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 5909 */           return (dependencies.length == 1) ? 
/* 5910 */             FXCollections.singletonObservableList(dependencies[0]) : 
/* 5911 */             (ObservableList<?>)new ImmutableObservableList((Object[])dependencies);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableObjectValue<?> paramObservableObjectValue1, ObservableObjectValue<?> paramObservableObjectValue2) {
/* 5930 */     return notEqual(paramObservableObjectValue1, paramObservableObjectValue2, new Observable[] { (Observable)paramObservableObjectValue1, (Observable)paramObservableObjectValue2 });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(ObservableObjectValue<?> paramObservableObjectValue, Object paramObject) {
/* 5947 */     return notEqual(paramObservableObjectValue, (ObservableObjectValue<?>)ObjectConstant.valueOf(paramObject), new Observable[] { (Observable)paramObservableObjectValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding notEqual(Object paramObject, ObservableObjectValue<?> paramObservableObjectValue) {
/* 5964 */     return notEqual((ObservableObjectValue<?>)ObjectConstant.valueOf(paramObject), paramObservableObjectValue, new Observable[] { (Observable)paramObservableObjectValue });
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding isNull(final ObservableObjectValue<?> op) {
/* 5979 */     if (op == null) {
/* 5980 */       throw new NullPointerException("Operand cannot be null.");
/*      */     }
/*      */     
/* 5983 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 5990 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 5995 */           return (op.get() == null);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6000 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding isNotNull(final ObservableObjectValue<?> op) {
/* 6017 */     if (op == null) {
/* 6018 */       throw new NullPointerException("Operand cannot be null.");
/*      */     }
/*      */     
/* 6021 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6028 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 6033 */           return (op.get() != null);
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6038 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> IntegerBinding size(final ObservableList<E> op) {
/* 6059 */     if (op == null) {
/* 6060 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/*      */     
/* 6063 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6070 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 6075 */           return op.size();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6080 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> BooleanBinding isEmpty(final ObservableList<E> op) {
/* 6098 */     if (op == null) {
/* 6099 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/*      */     
/* 6102 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6109 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 6114 */           return op.isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6119 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> BooleanBinding isNotEmpty(final ObservableList<E> op) {
/* 6137 */     if (op == null) {
/* 6138 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/*      */     
/* 6141 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6148 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 6153 */           return !op.isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6158 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObjectBinding<E> valueAt(final ObservableList<E> op, final int index) {
/* 6177 */     if (op == null) {
/* 6178 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6180 */     if (index < 0) {
/* 6181 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6184 */     return new ObjectBinding<E>()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6191 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected E computeValue() {
/*      */           try {
/* 6197 */             return (E)op.get(index);
/* 6198 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6199 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 6201 */             return null;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6206 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObjectBinding<E> valueAt(ObservableList<E> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6224 */     return valueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> ObjectBinding<E> valueAt(final ObservableList<E> op, final ObservableNumberValue index) {
/* 6240 */     if (op == null || index == null) {
/* 6241 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6244 */     return new ObjectBinding<E>()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6251 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected E computeValue() {
/*      */           try {
/* 6257 */             return (E)op.get(index.intValue());
/* 6258 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6259 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 6261 */             return null;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6266 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding booleanValueAt(final ObservableList<Boolean> op, final int index) {
/* 6284 */     if (op == null) {
/* 6285 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6287 */     if (index < 0) {
/* 6288 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6291 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6298 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/*      */           try {
/* 6304 */             Boolean bool = (Boolean)op.get(index);
/* 6305 */             if (bool == null) {
/* 6306 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6308 */               return bool.booleanValue();
/*      */             } 
/* 6310 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6311 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6313 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6318 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding booleanValueAt(ObservableList<Boolean> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6335 */     return booleanValueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BooleanBinding booleanValueAt(final ObservableList<Boolean> op, final ObservableNumberValue index) {
/* 6350 */     if (op == null || index == null) {
/* 6351 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6354 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6361 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/*      */           try {
/* 6367 */             Boolean bool = (Boolean)op.get(index.intValue());
/* 6368 */             if (bool == null) {
/* 6369 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6371 */               return bool.booleanValue();
/*      */             } 
/* 6373 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6374 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6376 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6381 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding doubleValueAt(final ObservableList<? extends Number> op, final int index) {
/* 6399 */     if (op == null) {
/* 6400 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6402 */     if (index < 0) {
/* 6403 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6406 */     return new DoubleBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6413 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected double computeValue() {
/*      */           try {
/* 6419 */             Number number = (Number)op.get(index);
/* 6420 */             if (number == null) {
/* 6421 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6423 */               return number.doubleValue();
/*      */             } 
/* 6425 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6426 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6428 */           return 0.0D;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6433 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding doubleValueAt(ObservableList<? extends Number> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6450 */     return doubleValueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DoubleBinding doubleValueAt(final ObservableList<? extends Number> op, final ObservableNumberValue index) {
/* 6465 */     if (op == null || index == null) {
/* 6466 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6469 */     return new DoubleBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6476 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected double computeValue() {
/*      */           try {
/* 6482 */             Number number = (Number)op.get(index.intValue());
/* 6483 */             if (number == null) {
/* 6484 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6486 */               return number.doubleValue();
/*      */             } 
/* 6488 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6489 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6491 */           return 0.0D;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6496 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding floatValueAt(final ObservableList<? extends Number> op, final int index) {
/* 6514 */     if (op == null) {
/* 6515 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6517 */     if (index < 0) {
/* 6518 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6521 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6528 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected float computeValue() {
/*      */           try {
/* 6534 */             Number number = (Number)op.get(index);
/* 6535 */             if (number == null) {
/* 6536 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6538 */               return number.floatValue();
/*      */             } 
/* 6540 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6541 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6543 */           return 0.0F;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6548 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding floatValueAt(ObservableList<? extends Number> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6565 */     return floatValueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding floatValueAt(final ObservableList<? extends Number> op, final ObservableNumberValue index) {
/* 6580 */     if (op == null || index == null) {
/* 6581 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6584 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6591 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected float computeValue() {
/*      */           try {
/* 6597 */             Number number = (Number)op.get(index.intValue());
/* 6598 */             if (number == null) {
/* 6599 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6601 */               return number.floatValue();
/*      */             } 
/* 6603 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6604 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6606 */           return 0.0F;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6611 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding integerValueAt(final ObservableList<? extends Number> op, final int index) {
/* 6629 */     if (op == null) {
/* 6630 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6632 */     if (index < 0) {
/* 6633 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6636 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6643 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/*      */           try {
/* 6649 */             Number number = (Number)op.get(index);
/* 6650 */             if (number == null) {
/* 6651 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6653 */               return number.intValue();
/*      */             } 
/* 6655 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6656 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6658 */           return 0;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6663 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding integerValueAt(ObservableList<? extends Number> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6680 */     return integerValueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding integerValueAt(final ObservableList<? extends Number> op, final ObservableNumberValue index) {
/* 6695 */     if (op == null || index == null) {
/* 6696 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6699 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6706 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/*      */           try {
/* 6712 */             Number number = (Number)op.get(index.intValue());
/* 6713 */             if (number == null) {
/* 6714 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6716 */               return number.intValue();
/*      */             } 
/* 6718 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6719 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6721 */           return 0;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6726 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LongBinding longValueAt(final ObservableList<? extends Number> op, final int index) {
/* 6744 */     if (op == null) {
/* 6745 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6747 */     if (index < 0) {
/* 6748 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6751 */     return new LongBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6758 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected long computeValue() {
/*      */           try {
/* 6764 */             Number number = (Number)op.get(index);
/* 6765 */             if (number == null) {
/* 6766 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6768 */               return number.longValue();
/*      */             } 
/* 6770 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6771 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6773 */           return 0L;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6778 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LongBinding longValueAt(ObservableList<? extends Number> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6795 */     return longValueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LongBinding longValueAt(final ObservableList<? extends Number> op, final ObservableNumberValue index) {
/* 6810 */     if (op == null || index == null) {
/* 6811 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6814 */     return new LongBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6821 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected long computeValue() {
/*      */           try {
/* 6827 */             Number number = (Number)op.get(index.intValue());
/* 6828 */             if (number == null) {
/* 6829 */               Logging.getLogger().fine("List element is null, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 6831 */               return number.longValue();
/*      */             } 
/* 6833 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6834 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */           } 
/* 6836 */           return 0L;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6841 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringBinding stringValueAt(final ObservableList<String> op, final int index) {
/* 6859 */     if (op == null) {
/* 6860 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/* 6862 */     if (index < 0) {
/* 6863 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 6866 */     return new StringBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6873 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected String computeValue() {
/*      */           try {
/* 6879 */             return (String)op.get(index);
/* 6880 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6881 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 6883 */             return null;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6888 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringBinding stringValueAt(ObservableList<String> paramObservableList, ObservableIntegerValue paramObservableIntegerValue) {
/* 6905 */     return stringValueAt(paramObservableList, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static StringBinding stringValueAt(final ObservableList<String> op, final ObservableNumberValue index) {
/* 6920 */     if (op == null || index == null) {
/* 6921 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 6924 */     return new StringBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6931 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected String computeValue() {
/*      */           try {
/* 6937 */             return (String)op.get(index.intValue());
/* 6938 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 6939 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 6941 */             return null;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6946 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> IntegerBinding size(final ObservableSet<E> op) {
/* 6967 */     if (op == null) {
/* 6968 */       throw new NullPointerException("Set cannot be null.");
/*      */     }
/*      */     
/* 6971 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 6978 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 6983 */           return op.size();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 6988 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> BooleanBinding isEmpty(final ObservableSet<E> op) {
/* 7006 */     if (op == null) {
/* 7007 */       throw new NullPointerException("Set cannot be null.");
/*      */     }
/*      */     
/* 7010 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7017 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 7022 */           return op.isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7027 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <E> BooleanBinding isNotEmpty(final ObservableSet<E> op) {
/* 7045 */     if (op == null) {
/* 7046 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/*      */     
/* 7049 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7056 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 7061 */           return !op.isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7066 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding size(final ObservableArray op) {
/* 7085 */     if (op == null) {
/* 7086 */       throw new NullPointerException("Array cannot be null.");
/*      */     }
/*      */     
/* 7089 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7096 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 7101 */           return op.size();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7106 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding floatValueAt(final ObservableFloatArray op, final int index) {
/* 7124 */     if (op == null) {
/* 7125 */       throw new NullPointerException("Array cannot be null.");
/*      */     }
/* 7127 */     if (index < 0) {
/* 7128 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 7131 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7138 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected float computeValue() {
/*      */           try {
/* 7144 */             return op.get(index);
/* 7145 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 7146 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 7148 */             return 0.0F;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7153 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding floatValueAt(ObservableFloatArray paramObservableFloatArray, ObservableIntegerValue paramObservableIntegerValue) {
/* 7170 */     return floatValueAt(paramObservableFloatArray, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FloatBinding floatValueAt(final ObservableFloatArray op, final ObservableNumberValue index) {
/* 7185 */     if (op == null || index == null) {
/* 7186 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7189 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7196 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected float computeValue() {
/*      */           try {
/* 7202 */             return op.get(index.intValue());
/* 7203 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 7204 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 7206 */             return 0.0F;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7211 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding integerValueAt(final ObservableIntegerArray op, final int index) {
/* 7229 */     if (op == null) {
/* 7230 */       throw new NullPointerException("Array cannot be null.");
/*      */     }
/* 7232 */     if (index < 0) {
/* 7233 */       throw new IllegalArgumentException("Index cannot be negative");
/*      */     }
/*      */     
/* 7236 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7243 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/*      */           try {
/* 7249 */             return op.get(index);
/* 7250 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 7251 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 7253 */             return 0;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7258 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding integerValueAt(ObservableIntegerArray paramObservableIntegerArray, ObservableIntegerValue paramObservableIntegerValue) {
/* 7275 */     return integerValueAt(paramObservableIntegerArray, (ObservableNumberValue)paramObservableIntegerValue);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static IntegerBinding integerValueAt(final ObservableIntegerArray op, final ObservableNumberValue index) {
/* 7290 */     if (op == null || index == null) {
/* 7291 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7294 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7301 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/*      */           try {
/* 7307 */             return op.get(index.intValue());
/* 7308 */           } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/* 7309 */             Logging.getLogger().fine("Exception while evaluating binding", indexOutOfBoundsException);
/*      */             
/* 7311 */             return 0;
/*      */           } 
/*      */         }
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7316 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$index });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> IntegerBinding size(final ObservableMap<K, V> op) {
/* 7339 */     if (op == null) {
/* 7340 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7343 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7350 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/* 7355 */           return op.size();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7360 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> BooleanBinding isEmpty(final ObservableMap<K, V> op) {
/* 7379 */     if (op == null) {
/* 7380 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7383 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7390 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 7395 */           return op.isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7400 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> BooleanBinding isNotEmpty(final ObservableMap<K, V> op) {
/* 7419 */     if (op == null) {
/* 7420 */       throw new NullPointerException("List cannot be null.");
/*      */     }
/*      */     
/* 7423 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7430 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/* 7435 */           return !op.isEmpty();
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7440 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObjectBinding<V> valueAt(final ObservableMap<K, V> op, final K key) {
/* 7458 */     if (op == null) {
/* 7459 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7462 */     return new ObjectBinding<V>()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7469 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected V computeValue() {
/*      */           try {
/* 7475 */             return (V)op.get(key);
/* 7476 */           } catch (ClassCastException classCastException) {
/* 7477 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7479 */           catch (NullPointerException nullPointerException) {
/* 7480 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7483 */           return null;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7488 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K, V> ObjectBinding<V> valueAt(final ObservableMap<K, V> op, final ObservableValue<? extends K> key) {
/* 7506 */     if (op == null || key == null) {
/* 7507 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7510 */     return new ObjectBinding<V>()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7517 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected V computeValue() {
/*      */           try {
/* 7523 */             return (V)op.get(key.getValue());
/* 7524 */           } catch (ClassCastException classCastException) {
/* 7525 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7527 */           catch (NullPointerException nullPointerException) {
/* 7528 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7531 */           return null;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7536 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> BooleanBinding booleanValueAt(final ObservableMap<K, Boolean> op, final K key) {
/* 7554 */     if (op == null) {
/* 7555 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7558 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7565 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/*      */           try {
/* 7571 */             Boolean bool = (Boolean)op.get(key);
/* 7572 */             if (bool == null) {
/* 7573 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7575 */               return bool.booleanValue();
/*      */             } 
/* 7577 */           } catch (ClassCastException classCastException) {
/* 7578 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7580 */           catch (NullPointerException nullPointerException) {
/* 7581 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7584 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7589 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> BooleanBinding booleanValueAt(final ObservableMap<K, Boolean> op, final ObservableValue<? extends K> key) {
/* 7607 */     if (op == null || key == null) {
/* 7608 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7611 */     return new BooleanBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7618 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */ 
/*      */         
/*      */         protected boolean computeValue() {
/*      */           try {
/* 7624 */             Boolean bool = (Boolean)op.get(key.getValue());
/* 7625 */             if (bool == null) {
/* 7626 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7628 */               return bool.booleanValue();
/*      */             } 
/* 7630 */           } catch (ClassCastException classCastException) {
/* 7631 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7633 */           catch (NullPointerException nullPointerException) {
/* 7634 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7637 */           return false;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7642 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> DoubleBinding doubleValueAt(final ObservableMap<K, ? extends Number> op, final K key) {
/* 7660 */     if (op == null) {
/* 7661 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7664 */     return new DoubleBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7671 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected double computeValue() {
/*      */           try {
/* 7677 */             Number number = (Number)op.get(key);
/* 7678 */             if (number == null) {
/* 7679 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7681 */               return number.doubleValue();
/*      */             } 
/* 7683 */           } catch (ClassCastException classCastException) {
/* 7684 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7686 */           catch (NullPointerException nullPointerException) {
/* 7687 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7690 */           return 0.0D;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7695 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> DoubleBinding doubleValueAt(final ObservableMap<K, ? extends Number> op, final ObservableValue<? extends K> key) {
/* 7713 */     if (op == null || key == null) {
/* 7714 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7717 */     return new DoubleBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7724 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */ 
/*      */         
/*      */         protected double computeValue() {
/*      */           try {
/* 7730 */             Number number = (Number)op.get(key.getValue());
/* 7731 */             if (number == null) {
/* 7732 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7734 */               return number.doubleValue();
/*      */             } 
/* 7736 */           } catch (ClassCastException classCastException) {
/* 7737 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7739 */           catch (NullPointerException nullPointerException) {
/* 7740 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7743 */           return 0.0D;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7748 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> FloatBinding floatValueAt(final ObservableMap<K, ? extends Number> op, final K key) {
/* 7766 */     if (op == null) {
/* 7767 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7770 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7777 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected float computeValue() {
/*      */           try {
/* 7783 */             Number number = (Number)op.get(key);
/* 7784 */             if (number == null) {
/* 7785 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7787 */               return number.floatValue();
/*      */             } 
/* 7789 */           } catch (ClassCastException classCastException) {
/* 7790 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7792 */           catch (NullPointerException nullPointerException) {
/* 7793 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7796 */           return 0.0F;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7801 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> FloatBinding floatValueAt(final ObservableMap<K, ? extends Number> op, final ObservableValue<? extends K> key) {
/* 7819 */     if (op == null || key == null) {
/* 7820 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7823 */     return new FloatBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7830 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */ 
/*      */         
/*      */         protected float computeValue() {
/*      */           try {
/* 7836 */             Number number = (Number)op.get(key.getValue());
/* 7837 */             if (number == null) {
/* 7838 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7840 */               return number.floatValue();
/*      */             } 
/* 7842 */           } catch (ClassCastException classCastException) {
/* 7843 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7845 */           catch (NullPointerException nullPointerException) {
/* 7846 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7849 */           return 0.0F;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7854 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> IntegerBinding integerValueAt(final ObservableMap<K, ? extends Number> op, final K key) {
/* 7872 */     if (op == null) {
/* 7873 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7876 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7883 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/*      */           try {
/* 7889 */             Number number = (Number)op.get(key);
/* 7890 */             if (number == null) {
/* 7891 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7893 */               return number.intValue();
/*      */             } 
/* 7895 */           } catch (ClassCastException classCastException) {
/* 7896 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7898 */           catch (NullPointerException nullPointerException) {
/* 7899 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7902 */           return 0;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7907 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> IntegerBinding integerValueAt(final ObservableMap<K, ? extends Number> op, final ObservableValue<? extends K> key) {
/* 7925 */     if (op == null || key == null) {
/* 7926 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 7929 */     return new IntegerBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7936 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */ 
/*      */         
/*      */         protected int computeValue() {
/*      */           try {
/* 7942 */             Number number = (Number)op.get(key.getValue());
/* 7943 */             if (number == null) {
/* 7944 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7946 */               return number.intValue();
/*      */             } 
/* 7948 */           } catch (ClassCastException classCastException) {
/* 7949 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 7951 */           catch (NullPointerException nullPointerException) {
/* 7952 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 7955 */           return 0;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 7960 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> LongBinding longValueAt(final ObservableMap<K, ? extends Number> op, final K key) {
/* 7978 */     if (op == null) {
/* 7979 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 7982 */     return new LongBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 7989 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected long computeValue() {
/*      */           try {
/* 7995 */             Number number = (Number)op.get(key);
/* 7996 */             if (number == null) {
/* 7997 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 7999 */               return number.longValue();
/*      */             } 
/* 8001 */           } catch (ClassCastException classCastException) {
/* 8002 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 8004 */           catch (NullPointerException nullPointerException) {
/* 8005 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 8008 */           return 0L;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 8013 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> LongBinding longValueAt(final ObservableMap<K, ? extends Number> op, final ObservableValue<? extends K> key) {
/* 8031 */     if (op == null || key == null) {
/* 8032 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 8035 */     return new LongBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 8042 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */ 
/*      */         
/*      */         protected long computeValue() {
/*      */           try {
/* 8048 */             Number number = (Number)op.get(key.getValue());
/* 8049 */             if (number == null) {
/* 8050 */               Logging.getLogger().fine("Element not found in map, returning default value instead.", new NullPointerException());
/*      */             } else {
/* 8052 */               return number.longValue();
/*      */             } 
/* 8054 */           } catch (ClassCastException classCastException) {
/* 8055 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 8057 */           catch (NullPointerException nullPointerException) {
/* 8058 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 8061 */           return 0L;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 8066 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> StringBinding stringValueAt(final ObservableMap<K, String> op, final K key) {
/* 8084 */     if (op == null) {
/* 8085 */       throw new NullPointerException("Map cannot be null.");
/*      */     }
/*      */     
/* 8088 */     return new StringBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 8095 */           unbind(new Observable[] { (Observable)this.val$op });
/*      */         }
/*      */ 
/*      */         
/*      */         protected String computeValue() {
/*      */           try {
/* 8101 */             return (String)op.get(key);
/* 8102 */           } catch (ClassCastException classCastException) {
/* 8103 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 8105 */           catch (NullPointerException nullPointerException) {
/* 8106 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 8109 */           return null;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 8114 */           return FXCollections.singletonObservableList(op);
/*      */         }
/*      */       };
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static <K> StringBinding stringValueAt(final ObservableMap<K, String> op, final ObservableValue<? extends K> key) {
/* 8132 */     if (op == null || key == null) {
/* 8133 */       throw new NullPointerException("Operands cannot be null.");
/*      */     }
/*      */     
/* 8136 */     return new StringBinding()
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*      */         public void dispose()
/*      */         {
/* 8143 */           unbind(new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */ 
/*      */         
/*      */         protected String computeValue() {
/*      */           try {
/* 8149 */             return (String)op.get(key.getValue());
/* 8150 */           } catch (ClassCastException classCastException) {
/* 8151 */             Logging.getLogger().warning("Exception while evaluating binding", classCastException);
/*      */           }
/* 8153 */           catch (NullPointerException nullPointerException) {
/* 8154 */             Logging.getLogger().warning("Exception while evaluating binding", nullPointerException);
/*      */           } 
/*      */           
/* 8157 */           return null;
/*      */         }
/*      */ 
/*      */         
/*      */         public ObservableList<?> getDependencies() {
/* 8162 */           return (ObservableList<?>)new ImmutableObservableList((Object[])new Observable[] { (Observable)this.val$op, (Observable)this.val$key });
/*      */         }
/*      */       };
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\Bindings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */