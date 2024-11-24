package br.edu.up.AppRoom8828952782.data.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.edu.up.AppRoom8828952782.data.models.Item
import br.edu.up.AppRoom8828952782.data.models.ItemDao

@Database(entities = [Item::class], version = 1)
abstract class ItemDataBase : RoomDatabase(){
    abstract fun getItemDao(): ItemDao
}


fun openBD(context: Context): ItemDataBase {
    return Room.databaseBuilder(
        context.applicationContext,
        ItemDataBase::class.java,
        name = "ItemDataBase.db"
    ).build()
}