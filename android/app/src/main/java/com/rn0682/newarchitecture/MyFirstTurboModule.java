package com.rn0682.newarchitecture;

import androidx.annotation.NonNull;

import com.facebook.fbreact.specs.NativeMyFirstTurboModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = MyFirstTurboModule.NAME)
public class MyFirstTurboModule extends NativeMyFirstTurboModuleSpec {
  public static final String NAME = "MyFirstTurboModule";

  public MyFirstTurboModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public void getString(String id, Promise promise) {
    WritableNativeMap object = new WritableNativeMap();
    object.putString("result", String.format("[MyFirstTurboModule] Hello %s at %d", id, System.currentTimeMillis()));
    promise.resolve(object);
  }

  @NonNull
  @Override
  public String getName() {
    return NAME;
  }
}
