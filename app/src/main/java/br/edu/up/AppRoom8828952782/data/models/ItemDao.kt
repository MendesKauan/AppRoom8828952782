package br.edu.up.AppRoom8828952782.data.models

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Query("select * from tab_item where id = :idx")
    fun getById(idx: Int) : Item

    @Query("select * from tab_item")
    fun fetchAll() : Flow<List<Item>>

    @Update
    fun updateItem(Item: Item)

    @Insert
    fun saveItem(Item: Item)

    @Delete
    fun deleteItem(Item: Item)
}