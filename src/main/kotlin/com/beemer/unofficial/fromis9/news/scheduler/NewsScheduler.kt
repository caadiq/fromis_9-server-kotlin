package com.beemer.unofficial.fromis9.news.scheduler

import com.beemer.unofficial.fromis9.news.service.NewsService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class NewsScheduler(private val newsService: NewsService) {

    @Scheduled(cron = "0 0,20,40 * * * *")
    fun fetchWeverseLive() {
        newsService.fetchWeverseLive()
    }

    @Scheduled(cron = "0 5 * * * *")
    fun fetchWeverseNotice() {
        newsService.fetchWeverseNotice()
    }

    @Scheduled(cron = "0 10 * * * *")
    fun fetchWeverseShopAlbums() {
        newsService.fetchWeverseShopAlbums()
    }

    @Scheduled(cron = "0 0,20,40 * * * *")
    fun fetchDcinsidePosts() {
        newsService.fetchDcinsidePosts()
    }
}