package br.edu.up.AppRoom8828952782.data

/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import android.content.Context
import br.edu.up.AppRoom8828952782.data.DB.ItemDataBase
import br.edu.up.AppRoom8828952782.data.DB.openBD
import br.edu.up.AppRoom8828952782.data.models.ItemDao

/**
 * App container for Dependency injection.
 */
interface AppContainer {
    val itemsRepository: ItemsRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineItemsRepository]
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [ItemsRepository]
     */
    private val database: ItemDataBase by lazy {
        openBD(context) // Utiliza a função que você já definiu
    }

    private val itemDao: ItemDao by lazy {
        database.getItemDao()
    }

    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository(itemDao) //erro
    }
}
