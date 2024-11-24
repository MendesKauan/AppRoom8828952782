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

package br.edu.up.AppRoom8828952782.data

import br.edu.up.AppRoom8828952782.data.models.Item
import br.edu.up.AppRoom8828952782.data.models.ItemDao
import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository(
    private val dao: ItemDao
) : ItemsRepository {

    override fun getById(idx: Int): Item {
       return dao.getById(idx)
    }

    override suspend fun fetchAll(): Flow<List<Item>> {
        return dao.fetchAll()
    }

    override suspend fun updateItem(Item: Item) {
        return dao.updateItem(Item)
    }

    override suspend fun saveItem(Item: Item) {
        return dao.saveItem(Item)
    }

    override suspend fun deleteItem(Item: Item) {
        return dao.deleteItem(Item)
    }


}
