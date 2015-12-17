// Copyright (c) 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BackgroundLauncherActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();

        // TODO: Should forward intent action / flags.
        BackgroundActivity.launchForeground(this, true, extras);
        finish();
    }
}
