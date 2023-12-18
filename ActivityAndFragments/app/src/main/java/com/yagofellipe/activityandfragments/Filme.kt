package com.yagofellipe.activityandfragments

import android.os.Parcelable
import androidx.versionedparcelable.ParcelField
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.parcelize.Parcelize

@Parcelize
data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacao: Double,
    val diretor: String,
    val distribuidor: String
) : Parcelable

