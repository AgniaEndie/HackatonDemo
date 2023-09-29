package ru.senkosan.demo.models.handle

data class PostApiAvailability(val conclusionForHearingDisability: String,
                        val conclusionForMusculoskeletalDisability: String,
                        val conclusionForVisionDisability: String,
                        val servicesConclusion: String,
                        val servicesMail: String,
                        val servicesPhone: String)
