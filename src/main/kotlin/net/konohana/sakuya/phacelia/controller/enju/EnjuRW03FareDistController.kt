package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW03FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW03FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW03FareDistコントローラ
 * * 笥谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw03faredist")
class EnjuRW03FareDistController(
    private val enjuRW03FareDistRepository: EnjuRW03FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW03FareDist> {
        return enjuRW03FareDistRepository.findByStaCode(staCode)
    }
}
