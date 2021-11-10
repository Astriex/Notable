package com.astriex.notable.feature_note.presentation.notes

import com.astriex.notable.feature_note.domain.model.Note
import com.astriex.notable.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class Delete(val note: Note): NotesEvent()
    object Restore: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
