package com.example.themooviedb.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.themooviedb.models.MostPopular
import com.example.themooviedb.models.MostPopularResult
import kotlinx.coroutines.flow.Flow

@Dao
interface MostPopularDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMostPopular(mostPopular: List<MostPopularResult>?)

    @Query("SELECT * FROM MostPopularResult")
    suspend fun getMostPopular(): List<MostPopularResult>?

    @Query("DELETE FROM MostPopularResult")
    suspend fun deleteMostPopular()

}
