package net.konohana.sakuya.phacelia.models.enju

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.MappedProperty

/**
 * ## EnjuRW01FareDistモデル
 * * 苆谷線営業キロ情報
 * @author lafleurblanche
 */
@MappedEntity(value = "enju_rw01_faredist")
data class EnjuRW01FareDist(
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
