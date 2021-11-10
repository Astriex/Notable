package com.astriex.notable.feature_note.data.repository

import com.astriex.notable.feature_note.data.data_source.NoteDao
import com.astriex.notable.feature_note.domain.model.Note
import com.astriex.notable.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(noteId: Int): Note? {
        return dao.getNoteById(noteId)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}