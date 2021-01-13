package com.comic.app.di

import com.comic.data_marvel.di.MarvelDataModule
import dagger.Module

@Module(
    includes = [
        MarvelDataModule::class
    ]
)
class DataModule