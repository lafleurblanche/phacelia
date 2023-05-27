package net.konohana.sakuya.phacelia.repositories.argw

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactorCrudRepository
import net.konohana.sakuya.phacelia.models.argw.AreaGW01FareDist
import reactor.core.publisher.Mono

/**
 * ## AreaGW01FareDistリポジトリ
 * * 支線連絡系統梼谷線営業キロ情報
 * @author lafleurblanche
 */
@R2dbcRepository(dialect = Dialect.POSTGRES)
interface AreaGW01FareDistRepository : ReactorCrudRepository<AreaGW01FareDist, Int> {
    fun findByStaCode(staCode: String): Mono<AreaGW01FareDist>
}
