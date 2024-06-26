package com.beemer.unofficial.fromis9.fromis9.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Members")
data class Members(
    @Id
    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "birth", nullable = false)
    var birth: LocalDate,

    @Column(name = "profile_image", nullable = false)
    var profileImage: String,

    @OneToOne(mappedBy = "member", cascade = [CascadeType.ALL])
    var details: MemberDetails? = null
)
