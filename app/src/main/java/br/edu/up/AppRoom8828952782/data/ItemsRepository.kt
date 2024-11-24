package br.edu.up.AppRoom8828952782.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.edu.up.AppRoom8828952782.data.models.Item
import br.edu.up.AppRoom8828952782.data.models.ItemDao
import kotlinx.coroutines.flow.Flow


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


/**
 * Repository that provides insert, update, delete, and retrieve of [Item] from a given data source.
 */
interface ItemsRepository {

    fun getById(idx: Int) : Item
    suspend fun fetchAll() : Flow<List<Item>>
    suspend fun updateItem(Item: Item)
    suspend fun saveItem(Item: Item)
    suspend fun deleteItem(Item: Item)
}
