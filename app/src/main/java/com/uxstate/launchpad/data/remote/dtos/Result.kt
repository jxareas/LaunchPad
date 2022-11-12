package com.uxstate.launchpad.data.remote.dtos


import com.squareup.moshi.Json

data class Result(
    @Json(name = "agency_launch_attempt_count")
    val agencyLaunchAttemptCount: Int,
    @Json(name = "agency_launch_attempt_count_year")
    val agencyLaunchAttemptCountYear: Int,
    @Json(name = "failreason")
    val failreason: String,
    @Json(name = "hashtag")
    val hashtag: Any?,
    @Json(name = "holdreason")
    val holdreason: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "image")
    val image: String,
    @Json(name = "infographic")
    val infographic: Any?,
    @Json(name = "last_updated")
    val lastUpdated: String,
    @Json(name = "launch_service_provider")
    val launchServiceProvider: LaunchServiceProvider,
    @Json(name = "location_launch_attempt_count")
    val locationLaunchAttemptCount: Int,
    @Json(name = "location_launch_attempt_count_year")
    val locationLaunchAttemptCountYear: Int,
    @Json(name = "mission")
    val mission: Mission,
    @Json(name = "name")
    val name: String,
    @Json(name = "net")
    val net: String,
    @Json(name = "orbital_launch_attempt_count")
    val orbitalLaunchAttemptCount: Int,
    @Json(name = "orbital_launch_attempt_count_year")
    val orbitalLaunchAttemptCountYear: Int,
    @Json(name = "pad")
    val pad: Pad,
    @Json(name = "pad_launch_attempt_count")
    val padLaunchAttemptCount: Int,
    @Json(name = "pad_launch_attempt_count_year")
    val padLaunchAttemptCountYear: Int,
    @Json(name = "probability")
    val probability: Any?,
    @Json(name = "program")
    val program: List<Any>,
    @Json(name = "rocket")
    val rocket: Rocket,
    @Json(name = "slug")
    val slug: String,
    @Json(name = "status")
    val status: Status,
    @Json(name = "url")
    val url: String,
    @Json(name = "webcast_live")
    val webcastLive: Boolean,
    @Json(name = "window_end")
    val windowEnd: String,
    @Json(name = "window_start")
    val windowStart: String
)