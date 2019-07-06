package com.forcetower.kotlinprojectftw.core.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.forcetower.kotlinprojectftw.core.database.EventDB
import com.forcetower.kotlinprojectftw.core.model.Session
import com.forcetower.kotlinprojectftw.core.service.EventAPI
import java.util.concurrent.Executor
import javax.inject.Inject

class ScheduleRepository @Inject constructor(
    private val service: EventAPI,
    private val executor: Executor,
    private val database: EventDB
) {
    fun getEvents() : LiveData<List<Session>> {
        executor.execute() {
            val call = service.listSessions()
            try {
                val response = call.execute()
                if (response.isSuccessful) {
                    val list = response.body()
                    val corrected = list ?: emptyList()
                    database.session().insert(corrected)
                }
            } catch (throwable: Throwable) { }
        }
        return database.session().getSessions()
    }
}