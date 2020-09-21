package com.example.audioreader.core.exception

sealed class IO {
    data class Success(val storageType: StorageType) : IO()
    data class Failure(val reason: FailureReason) : IO()

    enum class StorageType {
        INTERNAL,
        EXTERNAL
    }

    enum class FailureReason {
        NO_RIGHT,
        NO_DATA,
        CLOSE_BEFORE_END
    }
}