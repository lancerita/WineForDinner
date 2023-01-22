package com.example.winefordinner.presentation

import androidx.lifecycle.ViewModel
import com.example.winefordinner.domain.WineCommunications
import com.example.winefordinner.domain.WineInteractor

class WineViewModel(
    private val interactor: WineInteractor,
    private val communications: WineCommunications
)
    : ViewModel()
{}