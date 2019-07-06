package com.forcetower.kotlinprojectftw.core.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.forcetower.kotlinprojectftw.core.model.Session

@Dao
abstract class SessionDAO {
    @Insert(onConflict = REPLACE)
    abstract fun insert(sessions: List<Session>)

    @Query("SELECT * FROM Session")
    abstract fun getSessions(): LiveData<List<Session>>
}