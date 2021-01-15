package com.template.library

import android.app.Application
import com.template.library.client.di.injector.InjectorProvider

abstract class BaseApp : Application(), InjectorProvider