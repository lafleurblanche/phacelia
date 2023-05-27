package net.konohana.sakuya.phacelia.models.argw

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty

/**
 * ## AreaGW01FareDistモデル
 * * 支線連絡系統梼谷線営業キロ情報
 * @author lafleurblanche
 */
@MappedEntity(value = "areagw01_faredist")
data class AreaGW01FareDist(
    @field:GeneratedValue
    @field:Id
    var id: Int,
    @MappedProperty("sta_code")
    var staCode: String,
    @MappedProperty("sta_name")
    var staName: String,
    @MappedProperty("strt_pt_sta_code")
    var strtPtStaCode: String,
    @MappedProperty("distance")
    var distance: Double,
)
