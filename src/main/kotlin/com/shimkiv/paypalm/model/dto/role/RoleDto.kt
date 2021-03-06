/*
 * All materials herein: Copyright (c) 2000-2018 Serhii Shymkiv. All Rights Reserved.
 *
 * These materials are owned by Serhii Shymkiv and are protected by copyright laws
 * and international copyright treaties, as well as other intellectual property laws
 * and treaties.
 *
 * All right, title and interest in the copyright, confidential information,
 * patents, design rights and all other intellectual property rights of
 * whatsoever nature in and to these materials are and shall remain the sole
 * and exclusive property of Serhii Shymkiv.
 */

package com.shimkiv.paypalm.model.dto.role

import java.io.Serializable
import javax.persistence.*
import javax.validation.constraints.Size

/**
 * Role DTO(s)
 *
 * @author Serhii Shymkiv
 */

@Entity
@Table(name = "role")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,
    @Column(name = "name")
    @field:Size(max = 30)
    val name: String
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 1L
    }
}
