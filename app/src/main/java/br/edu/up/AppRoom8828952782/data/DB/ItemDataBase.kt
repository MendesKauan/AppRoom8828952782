package br.edu.up.AppRoom8828952782.data.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.edu.up.AppRoom8828952782.data.models.Item
import br.edu.up.AppRoom8828952782.data.models.ItemDao

@Database(entities = [Item::class], version = 1)
abstract class ItemDataBase : RoomDatabase() {

    abstract fun getItemDao(): ItemDao

    companion object {
        @Volatile
        private var INSTANCE: ItemDataBase? = null

        fun getDatabase(context: Context): ItemDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ItemDataBase::class.java,
                    "ItemDataBase.db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
