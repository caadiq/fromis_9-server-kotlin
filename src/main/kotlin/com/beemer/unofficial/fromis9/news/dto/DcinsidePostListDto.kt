package com.beemer.unofficial.fromis9.news.dto

import java.time.LocalDateTime

data class DcinsidePostListDto(
    val postId: Int,
    val title: String,
    val url: String,
    val date: LocalDateTime
)
