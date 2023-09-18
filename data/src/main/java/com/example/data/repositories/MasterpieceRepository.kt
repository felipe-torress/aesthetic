package com.example.data.repositories

import com.example.data.models.masterpiece.Masterpiece

interface MasterpieceRepository {
    fun getMasterpiece(id: Int): Masterpiece
    fun deleteMasterpiece(id: Int)
    fun createMasterpiece(masterpiece: Masterpiece)
    fun editDescription(id: Int, description: String)
    fun editImage(id: Int, imageMetadata: String?)
    fun editName(id: Int, name: String?)
}

