/* Tencent is pleased to support the open source community by making Hippy available.
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tencent.mtt.hippy.adapter.monitor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tencent.mtt.hippy.HippyEngine.EngineInitStatus;
import com.tencent.mtt.hippy.HippyEngine.ModuleLoadStatus;
import com.tencent.mtt.hippy.bridge.HippyCallNativeParams;
import com.tencent.mtt.hippy.utils.TimeMonitor.MonitorGroup;

public interface HippyEngineMonitorAdapter {

    void onEngineInitialized(EngineInitStatus statusCode, @Nullable MonitorGroup group);

    void onLoadModuleCompleted(ModuleLoadStatus statusCode, @NonNull String componentName, @Nullable MonitorGroup group);

    void onFirstPaintCompleted(@NonNull String componentName, @Nullable MonitorGroup group);

    void onFirstContentfulPaintCompleted(@NonNull String componentName, @Nullable MonitorGroup group);

    boolean onInterceptCallNative(@NonNull String componentName, @NonNull HippyCallNativeParams params);

    void onCallNativeFinished(@NonNull String componentName, @NonNull HippyCallNativeParams params);

    boolean onInterceptPromiseCallback(@NonNull String componentName, @NonNull String moduleName,
            @NonNull String funcName, @NonNull String callbackId, @Nullable Object callbackResult);

}
